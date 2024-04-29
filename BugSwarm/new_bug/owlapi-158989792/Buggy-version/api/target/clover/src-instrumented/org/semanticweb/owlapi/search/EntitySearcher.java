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
package org.semanticweb.owlapi.search;

import static org.semanticweb.owlapi.model.parameters.Imports.*;
import static org.semanticweb.owlapi.search.Filters.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.AxiomAnnotations;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.util.OWLAxiomSearchFilter;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;

/**
 * Convenience methods moved from OWLEntity and its subinterfaces.
 * 
 * @author ignazio
 */
public class EntitySearcher {public static class __CLR4_5_23z93z9lvickoti{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,5838,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Gets the annotations for this entity. These are deemed to be annotations
     * in annotation assertion axioms that have a subject that is an IRI that is
     * equal to the IRI of this entity, and it also includes annotations on the
     * annotation assertion axioms whose annotation property matches
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for annotation assertion axioms
     * @return The annotations that participate directly in an annotation
     *         assertion whose subject is an IRI corresponding to the IRI of
     *         this entity.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotations(@Nonnull OWLEntity e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5157);
        __CLR4_5_23z93z9lvickoti.R.inc(5158);return getAnnotations(e.getIRI(), ontology);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the annotations for this entity. These are deemed to be annotations
     * in annotation assertion axioms that have a subject that is an IRI that is
     * equal to the IRI of this entity, and it also includes annotations on the
     * annotation assertion axioms whose annotation property matches.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for annotation assertion axioms
     * @return The annotations that participate directly in an annotation
     *         assertion whose subject is an IRI corresponding to the IRI of
     *         this entity.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotations(@Nonnull OWLAnnotationSubject e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5159);
        __CLR4_5_23z93z9lvickoti.R.inc(5160);return Searcher.annotations(ontology.getAnnotationAssertionAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity where the annotation has the
     * specified annotation property. This includes the annotations on
     * annotation assertion axioms with matching annotation property.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to examine for annotation axioms
     * @param annotationProperty
     *        The annotation property
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotations(@Nonnull OWLEntity e, @Nonnull OWLOntology ontology,
        @Nonnull OWLAnnotationProperty annotationProperty) {try{__CLR4_5_23z93z9lvickoti.R.inc(5161);
        __CLR4_5_23z93z9lvickoti.R.inc(5162);return getAnnotations(e.getIRI(), ontology, annotationProperty);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity where the annotation has the
     * specified annotation property. This includes the annotations on
     * annotation assertion axioms with matching annotation property.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to examine for annotation axioms
     * @param annotationProperty
     *        The annotation property
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotations(@Nonnull OWLAnnotationSubject e,
        @Nonnull OWLOntology ontology, @Nonnull OWLAnnotationProperty annotationProperty) {try{__CLR4_5_23z93z9lvickoti.R.inc(5163);
        __CLR4_5_23z93z9lvickoti.R.inc(5164);return Searcher.annotations(ontology.getAnnotationAssertionAxioms(e), annotationProperty);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity where the annotation has the
     * specified annotation property. This includes the annotations on
     * annotation assertion axioms with matching annotation property.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to examine for annotation axioms
     * @param annotationProperty
     *        The annotation property
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotations(@Nonnull OWLAnnotationSubject e,
        @Nonnull Iterable<OWLOntology> ontologies, @Nonnull OWLAnnotationProperty annotationProperty) {try{__CLR4_5_23z93z9lvickoti.R.inc(5165);
        __CLR4_5_23z93z9lvickoti.R.inc(5166);Set<OWLAnnotation> toReturn = new HashSet<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5167);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5168)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5169)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5170);toReturn.addAll(getAnnotations(e, o, annotationProperty));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5171);return toReturn;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity where the annotation has the
     * specified annotation property. This includes the annotations on
     * annotation assertion axioms with matching annotation property.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to examine for annotation axioms
     * @param annotationProperty
     *        The annotation property
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotations(@Nonnull OWLEntity e,
        @Nonnull Iterable<OWLOntology> ontologies, @Nonnull OWLAnnotationProperty annotationProperty) {try{__CLR4_5_23z93z9lvickoti.R.inc(5172);
        __CLR4_5_23z93z9lvickoti.R.inc(5173);Set<OWLAnnotation> toReturn = new HashSet<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5174);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5175)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5176)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5177);toReturn.addAll(getAnnotations(e, o, annotationProperty));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5178);return toReturn;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity where the annotation has the
     * specified annotation property; this is restricted to the object of
     * annotation assertion axioms.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to examine for annotation axioms
     * @param annotationProperty
     *        The annotation property
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotationObjects(@Nonnull OWLEntity e, @Nonnull OWLOntology ontology,
        @Nullable OWLAnnotationProperty annotationProperty) {try{__CLR4_5_23z93z9lvickoti.R.inc(5179);
        __CLR4_5_23z93z9lvickoti.R.inc(5180);return getAnnotationObjects(e.getIRI(), ontology, annotationProperty);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity; this is restricted to the object
     * of annotation assertion axioms.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to examine for annotation axioms
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotationObjects(@Nonnull OWLEntity e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5181);
        __CLR4_5_23z93z9lvickoti.R.inc(5182);return getAnnotationObjects(e.getIRI(), ontology, null);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity; this is restricted to the object
     * of annotation assertion axioms.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to examine for annotation axioms
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotationObjects(@Nonnull OWLEntity e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5183);
        __CLR4_5_23z93z9lvickoti.R.inc(5184);return getAnnotationObjects(e.getIRI(), ontologies, null);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity where the annotation has the
     * specified annotation property; this is restricted to the object of
     * annotation assertion axioms.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to examine for annotation axioms
     * @param annotationProperty
     *        The annotation property
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotationObjects(@Nonnull OWLAnnotationSubject e,
        @Nonnull OWLOntology ontology, @Nullable OWLAnnotationProperty annotationProperty) {try{__CLR4_5_23z93z9lvickoti.R.inc(5185);
        __CLR4_5_23z93z9lvickoti.R.inc(5186);return Searcher.annotationObjects(ontology.getAnnotationAssertionAxioms(e), annotationProperty);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity where the annotation has the
     * specified annotation property; this is restricted to the object of
     * annotation assertion axioms.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to examine for annotation axioms
     * @param annotationProperty
     *        The annotation property
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotationObjects(@Nonnull OWLAnnotationSubject e,
        @Nonnull Iterable<OWLOntology> ontologies, @Nonnull OWLAnnotationProperty annotationProperty) {try{__CLR4_5_23z93z9lvickoti.R.inc(5187);
        __CLR4_5_23z93z9lvickoti.R.inc(5188);Set<OWLAnnotation> toReturn = new HashSet<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5189);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5190)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5191)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5192);toReturn.addAll(getAnnotationObjects(e, o, annotationProperty));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5193);return toReturn;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Obtains the annotations on this entity where the annotation has the
     * specified annotation property; this is restricted to the object of
     * annotation assertion axioms.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to examine for annotation axioms
     * @param annotationProperty
     *        The annotation property
     * @return A set of {@code OWLAnnotation} objects that have the specified
     *         URI.
     */
    @Nonnull
    public static Collection<OWLAnnotation> getAnnotationObjects(@Nonnull OWLEntity e,
        @Nonnull Iterable<OWLOntology> ontologies, @Nonnull OWLAnnotationProperty annotationProperty) {try{__CLR4_5_23z93z9lvickoti.R.inc(5194);
        __CLR4_5_23z93z9lvickoti.R.inc(5195);Set<OWLAnnotation> toReturn = new HashSet<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5196);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5197)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5198)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5199);toReturn.addAll(getAnnotationObjects(e, o, annotationProperty));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5200);return toReturn;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param e
     *        entity
     * @param ontology
     *        the ontology to use
     * @return the annotation assertion axioms about this entity in the provided
     *         ontology
     */
    @Nonnull
    public static Collection<OWLAnnotationAssertionAxiom> getAnnotationAssertionAxioms(@Nonnull OWLEntity e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5201);
        __CLR4_5_23z93z9lvickoti.R.inc(5202);return getAnnotationAssertionAxioms(e.getIRI(), ontology);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param e
     *        entity
     * @param ontology
     *        the ontology to use
     * @return the annotation assertion axioms about this entity in the provided
     *         ontology
     */
    @Nonnull
    public static Collection<OWLAnnotationAssertionAxiom> getAnnotationAssertionAxioms(@Nonnull OWLAnnotationSubject e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5203);
        __CLR4_5_23z93z9lvickoti.R.inc(5204);return ontology.getAnnotationAssertionAxioms(e);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLAnnotationProperty> getSubProperties(@Nonnull OWLAnnotationProperty e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5205);
        __CLR4_5_23z93z9lvickoti.R.inc(5206);return Searcher.sub(ontology.filterAxioms(subAnnotationWithSuper, e, EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param imports
     *        if true include imports closure
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLAnnotationProperty> getSubProperties(@Nonnull OWLAnnotationProperty e,
        @Nonnull OWLOntology ontology, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5207);
        __CLR4_5_23z93z9lvickoti.R.inc(5208);return Searcher.sub(ontology.filterAxioms(subAnnotationWithSuper, e, (((imports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5209)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5210)==0&false))? INCLUDED : EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLAnnotationProperty> getSubProperties(@Nonnull OWLAnnotationProperty e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5211);
        __CLR4_5_23z93z9lvickoti.R.inc(5212);Collection<OWLAnnotationProperty> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5213);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5214)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5215)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5216);collection.addAll(getSubProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5217);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLAnnotationProperty> getSuperProperties(@Nonnull OWLAnnotationProperty e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5218);
        __CLR4_5_23z93z9lvickoti.R.inc(5219);return Searcher.sup(ontology.filterAxioms(subAnnotationWithSub, e, EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param imports
     *        if true include imports closure
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLAnnotationProperty> getSuperProperties(@Nonnull OWLAnnotationProperty e,
        @Nonnull OWLOntology ontology, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5220);
        __CLR4_5_23z93z9lvickoti.R.inc(5221);return Searcher.sup(ontology.filterAxioms(subAnnotationWithSub, e, (((imports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5222)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5223)==0&false))? INCLUDED : EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLAnnotationProperty> getSuperProperties(@Nonnull OWLAnnotationProperty e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5224);
        __CLR4_5_23z93z9lvickoti.R.inc(5225);Collection<OWLAnnotationProperty> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5226);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5227)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5228)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5229);collection.addAll(getSuperProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5230);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getSubProperties(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5231);
        __CLR4_5_23z93z9lvickoti.R.inc(5232);return Searcher.sub(ontology.filterAxioms(subObjectPropertyWithSuper, e, EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param imports
     *        if true include imports closure
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getSubProperties(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull OWLOntology ontology, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5233);
        __CLR4_5_23z93z9lvickoti.R.inc(5234);return Searcher.sub(ontology.filterAxioms(subObjectPropertyWithSuper, e, (((imports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5235)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5236)==0&false))? INCLUDED : EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getSubProperties(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5237);
        __CLR4_5_23z93z9lvickoti.R.inc(5238);Collection<OWLObjectPropertyExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5239);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5240)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5241)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5242);collection.addAll(getSubProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5243);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param
     *        <P>
     *        type of property
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getSubProperties(@Nonnull P e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5244);
        __CLR4_5_23z93z9lvickoti.R.inc(5245);return Searcher.sub(ontology.filterAxioms(subPropertiesFilter(e), e, EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    protected static <P extends OWLPropertyExpression> OWLAxiomSearchFilter subPropertiesFilter(P e) {try{__CLR4_5_23z93z9lvickoti.R.inc(5246);
        __CLR4_5_23z93z9lvickoti.R.inc(5247);if ((((e.isDataPropertyExpression())&&(__CLR4_5_23z93z9lvickoti.R.iget(5248)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5249)==0&false))) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5250);return subDataPropertyWithSuper;
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5251);if ((((e.isObjectPropertyExpression())&&(__CLR4_5_23z93z9lvickoti.R.iget(5252)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5253)==0&false))) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5254);return subObjectPropertyWithSuper;
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5255);return subAnnotationWithSuper;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param imports
     *        if true include imports closure
     * @param
     *        <P>
     *        type of property
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getSubProperties(@Nonnull P e,
        @Nonnull OWLOntology ontology, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5256);
        __CLR4_5_23z93z9lvickoti.R.inc(5257);return Searcher.sub(ontology.filterAxioms(subPropertiesFilter(e), e, (((imports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5258)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5259)==0&false))? INCLUDED : EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param
     *        <P>
     *        type of property
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getSubProperties(@Nonnull P e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5260);
        __CLR4_5_23z93z9lvickoti.R.inc(5261);Collection<P> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5262);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5263)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5264)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5265);collection.addAll(getSubProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5266);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param
     *        <P>
     *        type of property
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getSuperProperties(@Nonnull P e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5267);
        __CLR4_5_23z93z9lvickoti.R.inc(5268);return Searcher.sup(ontology.filterAxioms(superPropertiesFilter(e), e, EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    protected static <P extends OWLPropertyExpression> OWLAxiomSearchFilter superPropertiesFilter(P e) {try{__CLR4_5_23z93z9lvickoti.R.inc(5269);
        __CLR4_5_23z93z9lvickoti.R.inc(5270);if ((((e.isDataPropertyExpression())&&(__CLR4_5_23z93z9lvickoti.R.iget(5271)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5272)==0&false))) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5273);return subDataPropertyWithSub;
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5274);if ((((e.isObjectPropertyExpression())&&(__CLR4_5_23z93z9lvickoti.R.iget(5275)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5276)==0&false))) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5277);return subObjectPropertyWithSub;
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5278);return subAnnotationWithSub;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param imports
     *        if true include imports closure
     * @param
     *        <P>
     *        type of property
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getSuperProperties(@Nonnull P e,
        @Nonnull OWLOntology ontology, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5279);
        __CLR4_5_23z93z9lvickoti.R.inc(5280);return Searcher.sub(ontology.filterAxioms(superPropertiesFilter(e), e, (((imports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5281)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5282)==0&false))? INCLUDED : EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param
     *        <P>
     *        type of property
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getSuperProperties(@Nonnull P e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5283);
        __CLR4_5_23z93z9lvickoti.R.inc(5284);Collection<P> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5285);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5286)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5287)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5288);collection.addAll(getSuperProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5289);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getSuperProperties(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5290);
        __CLR4_5_23z93z9lvickoti.R.inc(5291);return Searcher.sup(ontology.filterAxioms(subObjectPropertyWithSub, e, EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param imports
     *        if true include imports closure
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getSuperProperties(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull OWLOntology ontology, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5292);
        __CLR4_5_23z93z9lvickoti.R.inc(5293);return Searcher.sup(ontology.filterAxioms(subObjectPropertyWithSub, e, (((imports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5294)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5295)==0&false))? INCLUDED : EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getSuperProperties(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5296);
        __CLR4_5_23z93z9lvickoti.R.inc(5297);Collection<OWLObjectPropertyExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5298);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5299)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5300)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5301);collection.addAll(getSuperProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5302);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getSubProperties(@Nonnull OWLDataPropertyExpression e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5303);
        __CLR4_5_23z93z9lvickoti.R.inc(5304);return Searcher.sub(ontology.filterAxioms(subDataPropertyWithSuper, e, EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param imports
     *        if true include imports closure
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getSubProperties(@Nonnull OWLDataPropertyExpression e,
        @Nonnull OWLOntology ontology, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5305);
        __CLR4_5_23z93z9lvickoti.R.inc(5306);return Searcher.sub(ontology.filterAxioms(subDataPropertyWithSuper, e, (((imports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5307)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5308)==0&false))? INCLUDED : EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getSubProperties(@Nonnull OWLDataPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5309);
        __CLR4_5_23z93z9lvickoti.R.inc(5310);Collection<OWLDataPropertyExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5311);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5312)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5313)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5314);collection.addAll(getSubProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5315);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getSuperProperties(@Nonnull OWLDataPropertyExpression e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5316);
        __CLR4_5_23z93z9lvickoti.R.inc(5317);return Searcher.sup(ontology.filterAxioms(subDataPropertyWithSub, e, EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @param imports
     *        if true include imports closure
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getSuperProperties(@Nonnull OWLDataPropertyExpression e,
        @Nonnull OWLOntology ontology, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5318);
        __CLR4_5_23z93z9lvickoti.R.inc(5319);return Searcher.sup(ontology.filterAxioms(subDataPropertyWithSub, e, (((imports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5320)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5321)==0&false))? INCLUDED : EXCLUDED));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the properties which are asserted to be sub-properties of this
     * property in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for {@code SubAnnotationPropertyOf}
     *        axioms.
     * @return A set of properties such that for each property {@code p} in the
     *         set, it is the case that {@code ontology} contains an
     *         {@code SubPropertyOf(p, this)} axiom where {@code this} refers to
     *         this property.
     * @since 3.2
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getSuperProperties(@Nonnull OWLDataPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5322);
        __CLR4_5_23z93z9lvickoti.R.inc(5323);Collection<OWLDataPropertyExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5324);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5325)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5326)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5327);collection.addAll(getSuperProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5328);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontology
     * and return the class expressions corresponding to super classes of this
     * class.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         superclasses of this class, which have been asserted in the
     *         specified ontology.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getSuperClasses(@Nonnull OWLClass e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5329);
        __CLR4_5_23z93z9lvickoti.R.inc(5330);return Searcher.sup(ontology.getSubClassAxiomsForSubClass(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontologies
     * and returns the class expression corresponding to the asserted super
     * classes of this class.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The set of ontologies to be examined.
     * @return A set of {@code OWLClassExpressions}s that represent the super
     *         classes of this class
     */
    @Nonnull
    public static Collection<OWLClassExpression> getSuperClasses(@Nonnull OWLClass e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5331);
        __CLR4_5_23z93z9lvickoti.R.inc(5332);Collection<OWLClassExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5333);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5334)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5335)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5336);collection.addAll(getSuperClasses(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5337);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been <i>asserted</i> to be subclasses of this
     * class in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology which should be examined for subclass axioms.
     * @return A {@code Set} of {@code OWLClassExpression}s that represet the
     *         asserted subclasses of this class.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getSubClasses(@Nonnull OWLClass e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5338);
        __CLR4_5_23z93z9lvickoti.R.inc(5339);return Searcher.sub(ontology.getSubClassAxiomsForSuperClass(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been <i>asserted</i> to be subclasses of this
     * class in the specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies which should be examined for subclass axioms.
     * @return A {@code Set} of {@code OWLClassExpression}s that represet the
     *         asserted subclasses of this class.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getSubClasses(@Nonnull OWLClass e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5340);
        __CLR4_5_23z93z9lvickoti.R.inc(5341);Collection<OWLClassExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5342);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5343)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5344)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5345);collection.addAll(getSubClasses(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5346);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontology
     * and returns the class expressions corresponding to equivalent classes of
     * this class.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         equivalent classes of this class, that have been asserted in the
     *         specified ontology.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getEquivalentClasses(@Nonnull OWLClass e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5347);
        __CLR4_5_23z93z9lvickoti.R.inc(5348);return Searcher.equivalent(ontology.getEquivalentClassesAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontologies
     * and returns the class expressions corresponding to equivalent classes of
     * this class.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         equivalent classes of this class, that have been asserted in the
     *         specified ontologies.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getEquivalentClasses(@Nonnull OWLClass e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5349);
        __CLR4_5_23z93z9lvickoti.R.inc(5350);Collection<OWLClassExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5351);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5352)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5353)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5354);collection.addAll(getEquivalentClasses(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5355);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been asserted to be disjoint with this class
     * by axioms in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to search for disjoint class axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         disjoint classes of this class.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getDisjointClasses(@Nonnull OWLClass e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5356);
        __CLR4_5_23z93z9lvickoti.R.inc(5357);return Searcher.different(ontology.getDisjointClassesAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been asserted to be disjoint with this class
     * by axioms in the specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to search for disjoint class axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         disjoint classes of this class.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getDisjointClasses(@Nonnull OWLClass e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5358);
        __CLR4_5_23z93z9lvickoti.R.inc(5359);Collection<OWLClassExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5360);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5361)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5362)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5363);collection.addAll(getDisjointClasses(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5364);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the different individuals in the specified ontology.
     * 
     * @param e
     *        individual
     * @param ontology
     *        The ontology to search for different individuals
     * @return A {@code Set} of different {@code OWLIndividual}s.
     */
    @Nonnull
    public static Collection<OWLIndividual> getDifferentIndividuals(@Nonnull OWLIndividual e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5365);
        __CLR4_5_23z93z9lvickoti.R.inc(5366);return Searcher.different(ontology.getDifferentIndividualAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the different individuals in the specified ontologies.
     * 
     * @param e
     *        individual
     * @param ontologies
     *        The ontologies to search for different individuals
     * @return A {@code Set} of different {@code OWLIndividual}s.
     */
    @Nonnull
    public static Collection<OWLIndividual> getDifferentIndividuals(@Nonnull OWLIndividual e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5367);
        __CLR4_5_23z93z9lvickoti.R.inc(5368);Collection<OWLIndividual> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5369);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5370)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5371)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5372);collection.addAll(getDifferentIndividuals(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5373);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the same individuals in the specified ontology.
     * 
     * @param e
     *        individual
     * @param ontology
     *        The ontology to search for same individuals
     * @return A {@code Set} of same {@code OWLIndividual}s.
     */
    @Nonnull
    public static Collection<OWLIndividual> getSameIndividuals(@Nonnull OWLIndividual e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5374);
        __CLR4_5_23z93z9lvickoti.R.inc(5375);return Searcher.equivalent(ontology.getSameIndividualAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the same individuals in the specified ontologies.
     * 
     * @param e
     *        individual
     * @param ontologies
     *        The ontologies to search for same individuals
     * @return A {@code Set} of same {@code OWLIndividual}s.
     */
    @Nonnull
    public static Collection<OWLIndividual> getSameIndividuals(@Nonnull OWLIndividual e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5376);
        __CLR4_5_23z93z9lvickoti.R.inc(5377);Collection<OWLIndividual> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5378);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5379)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5380)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5381);collection.addAll(getSameIndividuals(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5382);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontology
     * and returns the class expressions corresponding to equivalent classes of
     * this class.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         equivalent classes of this class, that have been asserted in the
     *         specified ontology.
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getEquivalentProperties(@Nonnull OWLDataProperty e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5383);
        __CLR4_5_23z93z9lvickoti.R.inc(5384);return Searcher.equivalent(ontology.getEquivalentDataPropertiesAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontologies
     * and returns the class expressions corresponding to equivalent classes of
     * this class.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         equivalent classes of this class, that have been asserted in the
     *         specified ontologies.
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getEquivalentProperties(@Nonnull OWLDataProperty e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5385);
        __CLR4_5_23z93z9lvickoti.R.inc(5386);Collection<OWLDataPropertyExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5387);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5388)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5389)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5390);collection.addAll(getEquivalentProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5391);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontology
     * and returns the class expressions corresponding to equivalent classes of
     * this class.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for axioms
     * @param
     *        <P>
     *        type of property
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         equivalent classes of this class, that have been asserted in the
     *         specified ontology.
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getEquivalentProperties(@Nonnull P e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5392);
        __CLR4_5_23z93z9lvickoti.R.inc(5393);if ((((e.isDataPropertyExpression())&&(__CLR4_5_23z93z9lvickoti.R.iget(5394)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5395)==0&false))) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5396);return Searcher.equivalent(ontology.getEquivalentDataPropertiesAxioms((OWLDataProperty) e));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5397);return Searcher.equivalent(ontology.getEquivalentObjectPropertiesAxioms((OWLObjectPropertyExpression) e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontologies
     * and returns the class expressions corresponding to equivalent classes of
     * this class.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for axioms
     * @param
     *        <P>
     *        type of property
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         equivalent classes of this class, that have been asserted in the
     *         specified ontologies.
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getEquivalentProperties(@Nonnull P e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5398);
        __CLR4_5_23z93z9lvickoti.R.inc(5399);Collection<P> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5400);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5401)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5402)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5403);collection.addAll(getEquivalentProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5404);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been asserted to be disjoint with this class
     * by axioms in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to search for disjoint class axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         disjoint classes of this class.
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getDisjointProperties(@Nonnull OWLDataProperty e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5405);
        __CLR4_5_23z93z9lvickoti.R.inc(5406);return Searcher.different(ontology.getDisjointDataPropertiesAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been asserted to be disjoint with this class
     * by axioms in the specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to search for disjoint class axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         disjoint classes of this class.
     */
    @Nonnull
    public static Collection<OWLDataPropertyExpression> getDisjointProperties(@Nonnull OWLDataProperty e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5407);
        __CLR4_5_23z93z9lvickoti.R.inc(5408);Collection<OWLDataPropertyExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5409);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5410)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5411)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5412);collection.addAll(getDisjointProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5413);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been asserted to be disjoint with this class
     * by axioms in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to search for disjoint class axioms
     * @param
     *        <P>
     *        type of property
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         disjoint classes of this class.
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getDisjointProperties(@Nonnull P e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5414);
        __CLR4_5_23z93z9lvickoti.R.inc(5415);if ((((e.isDataPropertyExpression())&&(__CLR4_5_23z93z9lvickoti.R.iget(5416)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5417)==0&false))) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5418);return Searcher.different(ontology.getDisjointDataPropertiesAxioms((OWLDataProperty) e));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5419);return Searcher.different(ontology.getDisjointObjectPropertiesAxioms((OWLObjectPropertyExpression) e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been asserted to be disjoint with this class
     * by axioms in the specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to search for disjoint class axioms
     * @param
     *        <P>
     *        type of property
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         disjoint classes of this class.
     */
    @Nonnull
    public static <P extends OWLPropertyExpression> Collection<P> getDisjointProperties(@Nonnull P e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5420);
        __CLR4_5_23z93z9lvickoti.R.inc(5421);Collection<P> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5422);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5423)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5424)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5425);collection.addAll(getDisjointProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5426);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontology
     * and returns the class expressions corresponding to equivalent classes of
     * this class.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         equivalent classes of this class, that have been asserted in the
     *         specified ontology.
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getEquivalentProperties(
        @Nonnull OWLObjectPropertyExpression e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5427);
        __CLR4_5_23z93z9lvickoti.R.inc(5428);return Searcher.equivalent(ontology.getEquivalentObjectPropertiesAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * A convenience method that examines the axioms in the specified ontologies
     * and returns the class expressions corresponding to equivalent classes of
     * this class.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         equivalent classes of this class, that have been asserted in the
     *         specified ontologies.
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getEquivalentProperties(
        @Nonnull OWLObjectPropertyExpression e, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5429);
        __CLR4_5_23z93z9lvickoti.R.inc(5430);Collection<OWLObjectPropertyExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5431);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5432)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5433)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5434);collection.addAll(getEquivalentProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5435);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been asserted to be disjoint with this class
     * by axioms in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to search for disjoint class axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         disjoint classes of this class.
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getDisjointProperties(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5436);
        __CLR4_5_23z93z9lvickoti.R.inc(5437);return Searcher.different(ontology.getDisjointObjectPropertiesAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the classes which have been asserted to be disjoint with this class
     * by axioms in the specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to search for disjoint class axioms
     * @return A {@code Set} of {@code OWLClassExpression}s that represent the
     *         disjoint classes of this class.
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getDisjointProperties(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5438);
        __CLR4_5_23z93z9lvickoti.R.inc(5439);Collection<OWLObjectPropertyExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5440);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5441)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5442)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5443);collection.addAll(getDisjointProperties(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5444);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the individuals that have been asserted to be an instance of this
     * class by axioms in the specified ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be examined for class assertion axioms that assert
     *        an individual to be an instance of this class.
     * @return A {@code Set} of {@code OWLIndividual}s that represent the
     *         individual that have been asserted to be an instance of this
     *         class.
     */
    @Nonnull
    public static Collection<OWLIndividual> getIndividuals(@Nonnull OWLClass e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5445);
        __CLR4_5_23z93z9lvickoti.R.inc(5446);return Searcher.instances(ontology.getClassAssertionAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the individuals that have been asserted to be an instance of this
     * class by axioms in the speficied ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for class assertion axioms that
     *        assert an individual to be an instance of this class.
     * @return A {@code Set} of {@code OWLIndividual}s that represent the
     *         individual that have been asserted to be an instance of this
     *         class.
     */
    @Nonnull
    public static Collection<OWLIndividual> getIndividuals(@Nonnull OWLClass e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5447);
        __CLR4_5_23z93z9lvickoti.R.inc(5448);List<OWLIndividual> list = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5449);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5450)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5451)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5452);list.addAll(getIndividuals(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5453);return list;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the axioms in the specified ontology that contain this entity in
     * their signature.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology that will be searched for axioms
     * @return The axioms in the specified ontology whose signature contains
     *         this entity.
     */
    @Nonnull
    public static Collection<OWLAxiom> getReferencingAxioms(@Nonnull OWLEntity e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5454);
        __CLR4_5_23z93z9lvickoti.R.inc(5455);return ontology.getReferencingAxioms(e, EXCLUDED);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the axioms in the specified ontology and possibly its imports
     * closure that contain this entity in their signature.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology that will be searched for axioms
     * @param includeImports
     *        If {@code true} then axioms in the imports closure will also be
     *        returned, if {@code false} then only the axioms in the specified
     *        ontology will be returned.
     * @return The axioms in the specified ontology whose signature contains
     *         this entity.
     */
    @Nonnull
    public static Collection<OWLAxiom> getReferencingAxioms(@Nonnull OWLEntity e, @Nonnull OWLOntology ontology,
        boolean includeImports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5456);
        __CLR4_5_23z93z9lvickoti.R.inc(5457);return ontology.getReferencingAxioms(e, (((includeImports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5458)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5459)==0&false))? INCLUDED : EXCLUDED);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the asserted domains of this property.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology that should be examined for axioms which assert a
     *        domain of this property
     * @return A set of {@code OWLClassExpression}s corresponding to the domains
     *         of this property (the domain of the property is essentially the
     *         intersection of these class expressions).
     */
    @Nonnull
    public static Collection<OWLClassExpression> getDomains(@Nonnull OWLDataProperty e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5460);
        __CLR4_5_23z93z9lvickoti.R.inc(5461);return Searcher.domain(ontology.getDataPropertyDomainAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the asserted domains of this property by examining the axioms in the
     * specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined.
     * @return A set of {@code OWLClassExpression}s that represent the asserted
     *         domains of this property.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getDomains(@Nonnull OWLDataProperty e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5462);
        __CLR4_5_23z93z9lvickoti.R.inc(5463);List<OWLClassExpression> list = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5464);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5465)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5466)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5467);list.addAll(getDomains(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5468);return list;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the asserted domains of this property.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology that should be examined for axioms which assert a
     *        domain of this property
     * @return A set of {@code OWLClassExpression}s corresponding to the domains
     *         of this property (the domain of the property is essentially the
     *         intersection of these class expressions).
     */
    @Nonnull
    public static Collection<OWLClassExpression> getDomains(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5469);
        __CLR4_5_23z93z9lvickoti.R.inc(5470);return Searcher.domain(ontology.getObjectPropertyDomainAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the ranges of this property that have been asserted in the specified
     * ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be searched for axioms which assert a range for
     *        this property.
     * @return A set of ranges for this property.
     */
    @Nonnull
    public static Collection<OWLDataRange> getRanges(@Nonnull OWLDataProperty e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5471);
        __CLR4_5_23z93z9lvickoti.R.inc(5472);return Searcher.range(ontology.getDataPropertyRangeAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the asserted ranges of this property by examining the axioms in the
     * specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for range axioms.
     * @return A set of ranges for this property, which have been asserted by
     *         axioms in the specified ontologies.
     */
    @Nonnull
    public static Collection<OWLDataRange> getRanges(@Nonnull OWLDataProperty e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5473);
        __CLR4_5_23z93z9lvickoti.R.inc(5474);List<OWLDataRange> list = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5475);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5476)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5477)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5478);list.addAll(getRanges(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5479);return list;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the asserted domains of this property by examining the axioms in the
     * specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined.
     * @return A set of {@code OWLClassExpression}s that represent the asserted
     *         domains of this property.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getDomains(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5480);
        __CLR4_5_23z93z9lvickoti.R.inc(5481);List<OWLClassExpression> list = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5482);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5483)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5484)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5485);list.addAll(getDomains(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5486);return list;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the ranges of this property that have been asserted in the specified
     * ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be searched for axioms which assert a range for
     *        this property.
     * @return A set of ranges for this property.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getRanges(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5487);
        __CLR4_5_23z93z9lvickoti.R.inc(5488);return Searcher.range(ontology.getObjectPropertyRangeAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the asserted ranges of this property by examining the axioms in the
     * specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for range axioms.
     * @return A set of ranges for this property, which have been asserted by
     *         axioms in the specified ontologies.
     */
    @Nonnull
    public static Collection<OWLClassExpression> getRanges(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5489);
        __CLR4_5_23z93z9lvickoti.R.inc(5490);List<OWLClassExpression> list = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5491);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5492)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5493)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5494);list.addAll(getRanges(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5495);return list;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the asserted domains of this property.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology that should be examined for axioms which assert a
     *        domain of this property
     * @return A set of {@code OWLClassExpression}s corresponding to the domains
     *         of this property (the domain of the property is essentially the
     *         intersection of these class expressions).
     */
    @Nonnull
    public static Collection<IRI> getDomains(@Nonnull OWLAnnotationProperty e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5496);
        __CLR4_5_23z93z9lvickoti.R.inc(5497);return Searcher.domain(ontology.getAnnotationPropertyDomainAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the asserted domains of this property by examining the axioms in the
     * specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined.
     * @return A set of {@code OWLClassExpression}s that represent the asserted
     *         domains of this property.
     */
    @Nonnull
    public static Collection<IRI> getDomains(@Nonnull OWLAnnotationProperty e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5498);
        __CLR4_5_23z93z9lvickoti.R.inc(5499);List<IRI> list = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5500);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5501)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5502)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5503);list.addAll(getDomains(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5504);return list;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the ranges of this property that have been asserted in the specified
     * ontology.
     * 
     * @param e
     *        entity
     * @param ontology
     *        The ontology to be searched for axioms which assert a range for
     *        this property.
     * @return A set of ranges for this property.
     */
    @Nonnull
    public static Collection<IRI> getRanges(@Nonnull OWLAnnotationProperty e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5505);
        __CLR4_5_23z93z9lvickoti.R.inc(5506);return Searcher.range(ontology.getAnnotationPropertyRangeAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Gets the asserted ranges of this property by examining the axioms in the
     * specified ontologies.
     * 
     * @param e
     *        entity
     * @param ontologies
     *        The ontologies to be examined for range axioms.
     * @return A set of ranges for this property, which have been asserted by
     *         axioms in the specified ontologies.
     */
    @Nonnull
    public static Collection<IRI> getRanges(@Nonnull OWLAnnotationProperty e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5507);
        __CLR4_5_23z93z9lvickoti.R.inc(5508);List<IRI> list = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5509);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5510)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5511)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5512);list.addAll(getRanges(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5513);return list;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared transitive in o.
     * 
     * @param o
     *        ontology
     * @param e
     *        property
     * @return true for transitive properties
     */
    public static boolean isTransitive(@Nonnull OWLObjectPropertyExpression e, @Nonnull OWLOntology o) {try{__CLR4_5_23z93z9lvickoti.R.inc(5514);
        __CLR4_5_23z93z9lvickoti.R.inc(5515);return !o.getTransitiveObjectPropertyAxioms(e).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared transitive in a collection of ontologies.
     * 
     * @param ontologies
     *        ontologies
     * @param e
     *        property
     * @return true for transitive properties
     */
    public static boolean isTransitive(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5516);
        __CLR4_5_23z93z9lvickoti.R.inc(5517);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5518)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5519)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5520);if ((((isTransitive(e, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5521)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5522)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5523);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5524);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared symmetric in o.
     * 
     * @param o
     *        ontology
     * @param e
     *        property
     * @return true for symmetric properties
     */
    public static boolean isSymmetric(@Nonnull OWLObjectPropertyExpression e, @Nonnull OWLOntology o) {try{__CLR4_5_23z93z9lvickoti.R.inc(5525);
        __CLR4_5_23z93z9lvickoti.R.inc(5526);return !o.getSymmetricObjectPropertyAxioms(e).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared symmetric in a collection of ontologies.
     * 
     * @param ontologies
     *        ontologies
     * @param e
     *        property
     * @return true for symmetric properties
     */
    public static boolean isSymmetric(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5527);
        __CLR4_5_23z93z9lvickoti.R.inc(5528);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5529)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5530)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5531);if ((((isSymmetric(e, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5532)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5533)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5534);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5535);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared asymmetric in o.
     * 
     * @param o
     *        ontology
     * @param e
     *        property
     * @return true for asymmetric properties
     */
    public static boolean isAsymmetric(@Nonnull OWLObjectPropertyExpression e, @Nonnull OWLOntology o) {try{__CLR4_5_23z93z9lvickoti.R.inc(5536);
        __CLR4_5_23z93z9lvickoti.R.inc(5537);return !o.getAsymmetricObjectPropertyAxioms(e).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared asymmetric in a collection of ontologies.
     * 
     * @param ontologies
     *        ontologies
     * @param e
     *        property
     * @return true for asymmetric properties
     */
    public static boolean isAsymmetric(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5538);
        __CLR4_5_23z93z9lvickoti.R.inc(5539);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5540)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5541)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5542);if ((((isAsymmetric(e, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5543)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5544)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5545);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5546);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared reflexive in o.
     * 
     * @param o
     *        ontology
     * @param e
     *        property
     * @return true for reflexive properties
     */
    public static boolean isReflexive(@Nonnull OWLObjectPropertyExpression e, @Nonnull OWLOntology o) {try{__CLR4_5_23z93z9lvickoti.R.inc(5547);
        __CLR4_5_23z93z9lvickoti.R.inc(5548);return !o.getReflexiveObjectPropertyAxioms(e).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared reflexive in a collection of ontologies.
     * 
     * @param ontologies
     *        ontologies
     * @param e
     *        property
     * @return true for reflexive properties
     */
    public static boolean isReflexive(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5549);
        __CLR4_5_23z93z9lvickoti.R.inc(5550);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5551)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5552)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5553);if ((((isReflexive(e, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5554)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5555)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5556);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5557);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared irreflexive in o.
     * 
     * @param o
     *        ontology
     * @param e
     *        property
     * @return true for irreflexive properties
     */
    public static boolean isIrreflexive(@Nonnull OWLObjectPropertyExpression e, @Nonnull OWLOntology o) {try{__CLR4_5_23z93z9lvickoti.R.inc(5558);
        __CLR4_5_23z93z9lvickoti.R.inc(5559);return !o.getIrreflexiveObjectPropertyAxioms(e).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared irreflexive in a collection of ontologies.
     * 
     * @param ontologies
     *        ontologies
     * @param e
     *        property
     * @return true for irreflexive properties
     */
    public static boolean isIrreflexive(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5560);
        __CLR4_5_23z93z9lvickoti.R.inc(5561);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5562)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5563)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5564);if ((((isIrreflexive(e, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5565)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5566)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5567);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5568);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared inverse functional in o.
     * 
     * @param o
     *        ontology
     * @param e
     *        property
     * @return true for inverse functional properties
     */
    public static boolean isInverseFunctional(@Nonnull OWLObjectPropertyExpression e, @Nonnull OWLOntology o) {try{__CLR4_5_23z93z9lvickoti.R.inc(5569);
        __CLR4_5_23z93z9lvickoti.R.inc(5570);return !o.getInverseFunctionalObjectPropertyAxioms(e).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared inverse functional in a collection of ontologies.
     * 
     * @param ontologies
     *        ontologies
     * @param e
     *        property
     * @return true for inverse functional properties
     */
    public static boolean isInverseFunctional(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5571);
        __CLR4_5_23z93z9lvickoti.R.inc(5572);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5573)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5574)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5575);if ((((isInverseFunctional(e, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5576)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5577)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5578);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5579);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared functional in o.
     * 
     * @param o
     *        ontology
     * @param e
     *        property
     * @return true for functional object properties
     */
    public static boolean isFunctional(@Nonnull OWLObjectPropertyExpression e, @Nonnull OWLOntology o) {try{__CLR4_5_23z93z9lvickoti.R.inc(5580);
        __CLR4_5_23z93z9lvickoti.R.inc(5581);return !o.getFunctionalObjectPropertyAxioms(e).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared functional in a collection of ontologies.
     * 
     * @param ontologies
     *        ontologies
     * @param e
     *        property
     * @return true for functional object properties
     */
    public static boolean isFunctional(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5582);
        __CLR4_5_23z93z9lvickoti.R.inc(5583);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5584)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5585)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5586);if ((((isFunctional(e, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5587)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5588)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5589);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5590);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared functional in o.
     * 
     * @param o
     *        ontology
     * @param e
     *        property
     * @return true for functional data properties
     */
    public static boolean isFunctional(@Nonnull OWLDataProperty e, @Nonnull OWLOntology o) {try{__CLR4_5_23z93z9lvickoti.R.inc(5591);
        __CLR4_5_23z93z9lvickoti.R.inc(5592);return !o.getFunctionalDataPropertyAxioms(e).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if e is declared functional in a collection of ontologies.
     * 
     * @param ontologies
     *        ontologies
     * @param e
     *        property
     * @return true for functional data properties
     */
    public static boolean isFunctional(@Nonnull OWLDataProperty e, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5593);
        __CLR4_5_23z93z9lvickoti.R.inc(5594);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5595)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5596)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5597);if ((((isFunctional(e, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5598)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5599)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5600);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5601);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if c is defined (is included in equivalent axioms) in o.
     * 
     * @param o
     *        ontology
     * @param c
     *        class
     * @return true for defined classes
     */
    public static boolean isDefined(@Nonnull OWLClass c, @Nonnull OWLOntology o) {try{__CLR4_5_23z93z9lvickoti.R.inc(5602);
        __CLR4_5_23z93z9lvickoti.R.inc(5603);return !o.getEquivalentClassesAxioms(c).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if c is defined (is included in equivalent axioms) in a collection
     * of ontologies.
     * 
     * @param ontologies
     *        ontologies
     * @param c
     *        class
     * @return true for defined classes
     */
    public static boolean isDefined(@Nonnull OWLClass c, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5604);
        __CLR4_5_23z93z9lvickoti.R.inc(5605);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5606)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5607)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5608);if ((((isDefined(c, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5609)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5610)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5611);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5612);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if o contains axiom a, with or without imports closure.
     * 
     * @param o
     *        ontology
     * @param a
     *        axiom
     * @param imports
     *        true if imports closure is included
     * @return true if a is contained
     */
    public static boolean containsAxiom(@Nonnull OWLAxiom a, @Nonnull OWLOntology o, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5613);
        __CLR4_5_23z93z9lvickoti.R.inc(5614);return o.containsAxiom(a, (((imports )&&(__CLR4_5_23z93z9lvickoti.R.iget(5615)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5616)==0&false))? Imports.INCLUDED : Imports.EXCLUDED,
            AxiomAnnotations.CONSIDER_AXIOM_ANNOTATIONS);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if any of the ontologies contains axiom a, with or without imports
     * closure.
     * 
     * @param ontologies
     *        ontologies
     * @param a
     *        axiom
     * @param imports
     *        true if imports closure is included @return true if a is contained
     * @return true if a is contained
     */
    public static boolean containsAxiom(@Nonnull OWLAxiom a, @Nonnull Iterable<OWLOntology> ontologies,
        boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5617);
        __CLR4_5_23z93z9lvickoti.R.inc(5618);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5619)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5620)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5621);if ((((containsAxiom(a, o, imports))&&(__CLR4_5_23z93z9lvickoti.R.iget(5622)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5623)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5624);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5625);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if o contains axiom a, with or without imports closure, ignoring
     * annotations.
     * 
     * @param o
     *        ontology
     * @param a
     *        axiom
     * @param imports
     *        true if imports closure is included
     * @return true if a is contained
     */
    public static boolean containsAxiomIgnoreAnnotations(@Nonnull OWLAxiom a, @Nonnull OWLOntology o, boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5626);
        __CLR4_5_23z93z9lvickoti.R.inc(5627);return o.containsAxiom(a, (((imports == true )&&(__CLR4_5_23z93z9lvickoti.R.iget(5628)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5629)==0&false))? Imports.INCLUDED : Imports.EXCLUDED,
            AxiomAnnotations.IGNORE_AXIOM_ANNOTATIONS);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Checks if any of the ontologies contains axiom a, with or without imports
     * closure.
     * 
     * @param ontologies
     *        ontologies
     * @param a
     *        axiom
     * @param imports
     *        true if imports closure is included @return true if a is contained
     * @return true if a is contained
     */
    public static boolean containsAxiomIgnoreAnnotations(@Nonnull OWLAxiom a, @Nonnull Iterable<OWLOntology> ontologies,
        boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5630);
        __CLR4_5_23z93z9lvickoti.R.inc(5631);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5632)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5633)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5634);if ((((containsAxiomIgnoreAnnotations(a, o, imports))&&(__CLR4_5_23z93z9lvickoti.R.iget(5635)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5636)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5637);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5638);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * Get matching axioms for a, ignoring annotations.
     * 
     * @param o
     *        ontology
     * @param a
     *        axiom
     * @param imports
     *        true if imports closure is included
     * @return matching axioms
     */
    public static Collection<OWLAxiom> getAxiomsIgnoreAnnotations(@Nonnull OWLAxiom a, @Nonnull OWLOntology o,
        boolean imports) {try{__CLR4_5_23z93z9lvickoti.R.inc(5639);
        __CLR4_5_23z93z9lvickoti.R.inc(5640);return o.getAxiomsIgnoreAnnotations(a, (((imports == true )&&(__CLR4_5_23z93z9lvickoti.R.iget(5641)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5642)==0&false))? Imports.INCLUDED : Imports.EXCLUDED);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontology
     *        ontology to search
     * @return literal values
     */
    @Nonnull
    public static Collection<OWLLiteral> getDataPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLDataPropertyExpression p, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5643);
        __CLR4_5_23z93z9lvickoti.R.inc(5644);return Searcher.values(ontology.getDataPropertyAssertionAxioms(i), p);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontologies
     *        ontologies to search
     * @return literal values
     */
    @Nonnull
    public static Collection<OWLLiteral> getDataPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLDataPropertyExpression p, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5645);
        __CLR4_5_23z93z9lvickoti.R.inc(5646);Collection<OWLLiteral> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5647);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5648)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5649)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5650);collection.addAll(getDataPropertyValues(i, p, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5651);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontology
     *        ontology to search
     * @return property values
     */
    @Nonnull
    public static Collection<OWLIndividual> getObjectPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLObjectPropertyExpression p, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5652);
        __CLR4_5_23z93z9lvickoti.R.inc(5653);return Searcher.values(ontology.getObjectPropertyAssertionAxioms(i), p);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontologies
     *        ontologies to search
     * @return property values
     */
    @Nonnull
    public static Collection<OWLIndividual> getObjectPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLObjectPropertyExpression p, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5654);
        __CLR4_5_23z93z9lvickoti.R.inc(5655);Collection<OWLIndividual> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5656);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5657)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5658)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5659);collection.addAll(getObjectPropertyValues(i, p, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5660);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontology
     *        ontology to search
     * @return property values
     */
    @Nonnull
    public static Collection<OWLLiteral> getNegativeDataPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLDataPropertyExpression p, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5661);
        __CLR4_5_23z93z9lvickoti.R.inc(5662);return Searcher.negValues(ontology.getNegativeDataPropertyAssertionAxioms(i), p);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontologies
     *        ontologies to search
     * @return property values
     */
    @Nonnull
    public static Collection<OWLLiteral> getNegativeDataPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLDataPropertyExpression p, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5663);
        __CLR4_5_23z93z9lvickoti.R.inc(5664);Collection<OWLLiteral> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5665);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5666)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5667)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5668);collection.addAll(getNegativeDataPropertyValues(i, p, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5669);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontology
     *        ontology to search
     * @return property values
     */
    @Nonnull
    public static Collection<OWLIndividual> getNegativeObjectPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLObjectPropertyExpression p, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5670);
        __CLR4_5_23z93z9lvickoti.R.inc(5671);return Searcher.negValues(ontology.getNegativeObjectPropertyAssertionAxioms(i), p);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontologies
     *        ontologies to search
     * @return property values
     */
    @Nonnull
    public static Collection<OWLIndividual> getNegativeObjectPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLObjectPropertyExpression p, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5672);
        __CLR4_5_23z93z9lvickoti.R.inc(5673);Collection<OWLIndividual> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5674);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5675)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5676)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5677);collection.addAll(getNegativeObjectPropertyValues(i, p, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5678);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontology
     *        ontology to search
     * @return true if values are present
     */
    public static boolean hasDataPropertyValues(@Nonnull OWLIndividual i, OWLDataPropertyExpression p,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5679);
        __CLR4_5_23z93z9lvickoti.R.inc(5680);return !Searcher.values(ontology.getDataPropertyAssertionAxioms(i), p).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontologies
     *        ontologies to search
     * @return true if value present
     */
    public static boolean hasDataPropertyValues(@Nonnull OWLIndividual i, @Nonnull OWLDataPropertyExpression p,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5681);
        __CLR4_5_23z93z9lvickoti.R.inc(5682);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5683)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5684)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5685);if ((((hasDataPropertyValues(i, p, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5686)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5687)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5688);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5689);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontology
     *        ontology to search
     * @return true if value present
     */
    public static boolean hasObjectPropertyValues(@Nonnull OWLIndividual i, @Nonnull OWLObjectPropertyExpression p,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5690);
        __CLR4_5_23z93z9lvickoti.R.inc(5691);return !Searcher.values(ontology.getObjectPropertyAssertionAxioms(i), p).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontologies
     *        ontologies to search
     * @return true if value present
     */
    public static boolean hasObjectPropertyValues(@Nonnull OWLIndividual i, @Nonnull OWLObjectPropertyExpression p,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5692);
        __CLR4_5_23z93z9lvickoti.R.inc(5693);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5694)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5695)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5696);if ((((hasObjectPropertyValues(i, p, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5697)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5698)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5699);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5700);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontology
     *        ontology to search
     * @return true if value present
     */
    public static boolean hasNegativeDataPropertyValues(@Nonnull OWLIndividual i, @Nonnull OWLDataPropertyExpression p,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5701);
        __CLR4_5_23z93z9lvickoti.R.inc(5702);return !Searcher.negValues(ontology.getNegativeDataPropertyAssertionAxioms(i), p).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontologies
     *        ontologies to search
     * @return true if value present
     */
    public static boolean hasNegativeDataPropertyValues(@Nonnull OWLIndividual i, @Nonnull OWLDataPropertyExpression p,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5703);
        __CLR4_5_23z93z9lvickoti.R.inc(5704);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5705)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5706)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5707);if ((((hasNegativeDataPropertyValues(i, p, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5708)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5709)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5710);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5711);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontology
     *        ontology to search
     * @return true if value present
     */
    public static boolean hasNegativeObjectPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLObjectPropertyExpression p, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5712);
        __CLR4_5_23z93z9lvickoti.R.inc(5713);return !Searcher.negValues(ontology.getNegativeObjectPropertyAssertionAxioms(i), p).isEmpty();
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param ontologies
     *        ontologies to search
     * @return true if value present
     */
    public static boolean hasNegativeObjectPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLObjectPropertyExpression p, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5714);
        __CLR4_5_23z93z9lvickoti.R.inc(5715);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5716)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5717)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5718);if ((((hasNegativeObjectPropertyValues(i, p, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5719)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5720)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5721);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5722);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param lit
     *        literal to search
     * @param ontology
     *        ontology to search
     * @return true if value present
     */
    public static boolean hasDataPropertyValue(@Nonnull OWLIndividual i, @Nonnull OWLDataPropertyExpression p,
        @Nonnull OWLLiteral lit, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5723);
        __CLR4_5_23z93z9lvickoti.R.inc(5724);return Searcher.values(ontology.getDataPropertyAssertionAxioms(i), p).contains(lit);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param lit
     *        literal to search
     * @param ontologies
     *        ontologies to search
     * @return true if value present
     */
    public static boolean hasDataPropertyValue(@Nonnull OWLIndividual i, @Nonnull OWLDataPropertyExpression p,
        @Nonnull OWLLiteral lit, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5725);
        __CLR4_5_23z93z9lvickoti.R.inc(5726);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5727)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5728)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5729);if ((((hasDataPropertyValue(i, p, lit, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5730)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5731)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5732);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5733);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param j
     *        individual to search
     * @param ontology
     *        ontology to search
     * @return true if value present
     */
    public static boolean hasObjectPropertyValue(@Nonnull OWLIndividual i, @Nonnull OWLObjectPropertyExpression p,
        @Nonnull OWLIndividual j, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5734);
        __CLR4_5_23z93z9lvickoti.R.inc(5735);return Searcher.values(ontology.getObjectPropertyAssertionAxioms(i), p).contains(j);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param j
     *        individual to search
     * @param ontologies
     *        ontologies to search
     * @return true if value present
     */
    public static boolean hasObjectPropertyValue(@Nonnull OWLIndividual i, @Nonnull OWLObjectPropertyExpression p,
        @Nonnull OWLIndividual j, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5736);
        __CLR4_5_23z93z9lvickoti.R.inc(5737);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5738)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5739)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5740);if ((((hasObjectPropertyValue(i, p, j, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5741)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5742)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5743);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5744);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param lit
     *        literal to search
     * @param ontology
     *        ontology to search
     * @return true if value present
     */
    public static boolean hasNegativeDataPropertyValue(@Nonnull OWLIndividual i, @Nonnull OWLDataPropertyExpression p,
        @Nonnull OWLLiteral lit, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5745);
        __CLR4_5_23z93z9lvickoti.R.inc(5746);return Searcher.negValues(ontology.getNegativeDataPropertyAssertionAxioms(i), p).contains(lit);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param lit
     *        literal to search
     * @param ontologies
     *        ontologies to search
     * @return true if value present
     */
    public static boolean hasNegativeDataPropertyValue(@Nonnull OWLIndividual i, @Nonnull OWLDataPropertyExpression p,
        @Nonnull OWLLiteral lit, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5747);
        __CLR4_5_23z93z9lvickoti.R.inc(5748);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5749)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5750)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5751);if ((((hasNegativeDataPropertyValue(i, p, lit, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5752)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5753)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5754);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5755);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param j
     *        individual to search
     * @param ontology
     *        ontology to search
     * @return true if value present
     */
    public static boolean hasNegativeObjectPropertyValue(@Nonnull OWLIndividual i,
        @Nonnull OWLObjectPropertyExpression p, @Nonnull OWLIndividual j, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5756);
        __CLR4_5_23z93z9lvickoti.R.inc(5757);return Searcher.negValues(ontology.getNegativeObjectPropertyAssertionAxioms(i), p).contains(j);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param p
     *        property to search
     * @param j
     *        individual to search
     * @param ontologies
     *        ontologies to search
     * @return true if value present
     */
    public static boolean hasNegativeObjectPropertyValue(@Nonnull OWLIndividual i,
        @Nonnull OWLObjectPropertyExpression p, @Nonnull OWLIndividual j, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5758);
        __CLR4_5_23z93z9lvickoti.R.inc(5759);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5760)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5761)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5762);if ((((hasNegativeObjectPropertyValue(i, p, j, o))&&(__CLR4_5_23z93z9lvickoti.R.iget(5763)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5764)==0&false))) {{
                __CLR4_5_23z93z9lvickoti.R.inc(5765);return true;
            }
        }}
        }__CLR4_5_23z93z9lvickoti.R.inc(5766);return false;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param ontology
     *        ontology to search
     * @return property values
     */
    @Nonnull
    public static Multimap<OWLDataPropertyExpression, OWLLiteral> getDataPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5767);
        __CLR4_5_23z93z9lvickoti.R.inc(5768);Multimap<OWLDataPropertyExpression, OWLLiteral> map = LinkedListMultimap.create();
        __CLR4_5_23z93z9lvickoti.R.inc(5769);for (OWLDataPropertyAssertionAxiom ax : ontology.getDataPropertyAssertionAxioms(i)) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5770);map.put(ax.getProperty(), ax.getObject());
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5771);return map;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param ontologies
     *        ontologies to search
     * @return literal values
     */
    @Nonnull
    public static Multimap<OWLDataPropertyExpression, OWLLiteral> getDataPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5772);
        __CLR4_5_23z93z9lvickoti.R.inc(5773);Multimap<OWLDataPropertyExpression, OWLLiteral> collection = LinkedListMultimap.create();
        assert (((collection != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5774)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5775)==0&false));
        __CLR4_5_23z93z9lvickoti.R.inc(5776);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5777)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5778)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5779);collection.putAll(getDataPropertyValues(i, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5780);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param ontology
     *        ontology to search
     * @return property values
     */
    @Nonnull
    public static Multimap<OWLObjectPropertyExpression, OWLIndividual> getObjectPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5781);
        __CLR4_5_23z93z9lvickoti.R.inc(5782);Multimap<OWLObjectPropertyExpression, OWLIndividual> map = LinkedListMultimap.create();
        __CLR4_5_23z93z9lvickoti.R.inc(5783);for (OWLObjectPropertyAssertionAxiom ax : ontology.getObjectPropertyAssertionAxioms(i)) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5784);map.put(ax.getProperty(), ax.getObject());
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5785);return map;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param ontologies
     *        ontologies to search
     * @return property values
     */
    @Nonnull
    public static Multimap<OWLObjectPropertyExpression, OWLIndividual> getObjectPropertyValues(@Nonnull OWLIndividual i,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5786);
        __CLR4_5_23z93z9lvickoti.R.inc(5787);Multimap<OWLObjectPropertyExpression, OWLIndividual> map = LinkedListMultimap.create();
        __CLR4_5_23z93z9lvickoti.R.inc(5788);for (OWLOntology o : ontologies) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5789);map.putAll(getObjectPropertyValues(i, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5790);return map;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param ontology
     *        ontology to search
     * @return property values
     */
    @Nonnull
    public static Multimap<OWLObjectPropertyExpression, OWLIndividual> getNegativeObjectPropertyValues(
        @Nonnull OWLIndividual i, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5791);
        __CLR4_5_23z93z9lvickoti.R.inc(5792);Multimap<OWLObjectPropertyExpression, OWLIndividual> map = LinkedListMultimap.create();
        __CLR4_5_23z93z9lvickoti.R.inc(5793);for (OWLNegativeObjectPropertyAssertionAxiom ax : ontology.getNegativeObjectPropertyAssertionAxioms(i)) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5794);map.put(ax.getProperty(), ax.getObject());
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5795);return map;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param ontology
     *        ontology to search
     * @return property values
     */
    @Nonnull
    public static Multimap<OWLDataPropertyExpression, OWLLiteral> getNegativeDataPropertyValues(
        @Nonnull OWLIndividual i, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5796);
        __CLR4_5_23z93z9lvickoti.R.inc(5797);Multimap<OWLDataPropertyExpression, OWLLiteral> map = LinkedListMultimap.create();
        __CLR4_5_23z93z9lvickoti.R.inc(5798);for (OWLNegativeDataPropertyAssertionAxiom ax : ontology.getNegativeDataPropertyAssertionAxioms(i)) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5799);map.put(ax.getProperty(), ax.getObject());
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5800);return map;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param ontologies
     *        ontologies to search
     * @return property values
     */
    @Nonnull
    public static Multimap<OWLObjectPropertyExpression, OWLIndividual> getNegativeObjectPropertyValues(
        @Nonnull OWLIndividual i, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5801);
        __CLR4_5_23z93z9lvickoti.R.inc(5802);Multimap<OWLObjectPropertyExpression, OWLIndividual> map = LinkedListMultimap.create();
        __CLR4_5_23z93z9lvickoti.R.inc(5803);for (OWLOntology o : ontologies) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5804);map.putAll(getNegativeObjectPropertyValues(i, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5805);return map;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param i
     *        individual
     * @param ontologies
     *        ontologies to search
     * @return property values
     */
    @Nonnull
    public static Multimap<OWLDataPropertyExpression, OWLLiteral> getNegativeDataPropertyValues(
        @Nonnull OWLIndividual i, @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5806);
        __CLR4_5_23z93z9lvickoti.R.inc(5807);Multimap<OWLDataPropertyExpression, OWLLiteral> map = LinkedListMultimap.create();
        __CLR4_5_23z93z9lvickoti.R.inc(5808);for (OWLOntology o : ontologies) {{
            __CLR4_5_23z93z9lvickoti.R.inc(5809);map.putAll(getNegativeDataPropertyValues(i, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5810);return map;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param e
     *        object property
     * @param ontology
     *        ontology to search
     * @return property inverses
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getInverses(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5811);
        __CLR4_5_23z93z9lvickoti.R.inc(5812);return Searcher.inverse(ontology.getInverseObjectPropertyAxioms(e), e);
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param e
     *        object property
     * @param ontologies
     *        ontologies to search
     * @return property inverses
     */
    @Nonnull
    public static Collection<OWLObjectPropertyExpression> getInverses(@Nonnull OWLObjectPropertyExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5813);
        __CLR4_5_23z93z9lvickoti.R.inc(5814);Collection<OWLObjectPropertyExpression> collection = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5815);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5816)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5817)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5818);collection.addAll(getInverses(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5819);return collection;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param e
     *        class
     * @param ontology
     *        ontology to search
     * @return instances of class
     */
    @Nonnull
    public static Collection<OWLIndividual> getInstances(@Nonnull OWLClassExpression e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5820);
        __CLR4_5_23z93z9lvickoti.R.inc(5821);return Searcher.instances(ontology.getClassAssertionAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param e
     *        class
     * @param ontologies
     *        ontologies to search
     * @return instances of class
     */
    @Nonnull
    public static Collection<OWLIndividual> getInstances(@Nonnull OWLClassExpression e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5822);
        __CLR4_5_23z93z9lvickoti.R.inc(5823);Collection<OWLIndividual> list = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5824);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5825)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5826)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5827);list.addAll(getInstances(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5828);return list;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param e
     *        individual
     * @param ontology
     *        ontology to search
     * @return types for individual
     */
    @Nonnull
    public static Collection<OWLClassExpression> getTypes(@Nonnull OWLIndividual e, @Nonnull OWLOntology ontology) {try{__CLR4_5_23z93z9lvickoti.R.inc(5829);
        __CLR4_5_23z93z9lvickoti.R.inc(5830);return Searcher.types(ontology.getClassAssertionAxioms(e));
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}

    /**
     * @param e
     *        individual
     * @param ontologies
     *        ontologies to search
     * @return types for individual
     */
    @Nonnull
    public static Collection<OWLClassExpression> getTypes(@Nonnull OWLIndividual e,
        @Nonnull Iterable<OWLOntology> ontologies) {try{__CLR4_5_23z93z9lvickoti.R.inc(5831);
        __CLR4_5_23z93z9lvickoti.R.inc(5832);Collection<OWLClassExpression> list = new ArrayList<>();
        __CLR4_5_23z93z9lvickoti.R.inc(5833);for (OWLOntology o : ontologies) {{
            assert (((o != null)&&(__CLR4_5_23z93z9lvickoti.R.iget(5834)!=0|true))||(__CLR4_5_23z93z9lvickoti.R.iget(5835)==0&false));
            __CLR4_5_23z93z9lvickoti.R.inc(5836);list.addAll(getTypes(e, o));
        }
        }__CLR4_5_23z93z9lvickoti.R.inc(5837);return list;
    }finally{__CLR4_5_23z93z9lvickoti.R.flushNeeded();}}
}
