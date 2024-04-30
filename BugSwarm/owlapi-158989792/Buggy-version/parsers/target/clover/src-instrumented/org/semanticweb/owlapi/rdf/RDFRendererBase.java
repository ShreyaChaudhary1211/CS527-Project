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
package org.semanticweb.owlapi.rdf;

import static org.semanticweb.owlapi.model.parameters.Imports.*;
import static org.semanticweb.owlapi.util.CollectionFactory.sortOptionally;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;
import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.*;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.model.RDFGraph;
import org.semanticweb.owlapi.rdf.model.RDFTranslator;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterPreferences;
import org.semanticweb.owlapi.util.*;

import gnu.trove.map.custom_hash.TObjectIntCustomHashMap;
import gnu.trove.strategy.IdentityHashingStrategy;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public abstract class RDFRendererBase {public static class __CLR4_5_2n8zn8zlvicmccd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,30513,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private static final String ANNOTATION_PROPERTIES_BANNER_TEXT = "Annotation properties";
    @Nonnull private static final String DATATYPES_BANNER_TEXT = "Datatypes";
    @Nonnull private static final String OBJECT_PROPERTIES_BANNER_TEXT = "Object Properties";
    @Nonnull private static final String DATA_PROPERTIES_BANNER_TEXT = "Data properties";
    @Nonnull private static final String CLASSES_BANNER_TEXT = "Classes";
    @Nonnull private static final String INDIVIDUALS_BANNER_TEXT = "Individuals";
    @Nonnull private static final String ANNOTATED_IRIS_BANNER_TEXT = "Annotations";
    /** general axioms */
    @Nonnull private static final String GENERAL_AXIOMS_BANNER_TEXT = "General axioms";
    /** rules banner */
    @Nonnull private static final String RULES_BANNER_TEXT = "Rules";
    @Nonnull private static final OWLEntityIRIComparator OWL_ENTITY_IRI_COMPARATOR = new OWLEntityIRIComparator();
    @Nonnull protected final OWLOntology ontology;
    protected RDFGraph graph;
    @Nonnull protected final Set<IRI> prettyPrintedTypes = initPrettyTypes();
    private final OWLDocumentFormat format;
    private Set<IRI> punned;
    protected final IndividualAppearance occurrences;
    protected final AxiomAppearance axiomOccurrences;

    @Nonnull
    protected static Set<IRI> initPrettyTypes() {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30131);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30132);return new HashSet<>(Arrays.asList(OWL_CLASS.getIRI(), OWL_OBJECT_PROPERTY.getIRI(), OWL_DATA_PROPERTY.getIRI(),
            OWL_ANNOTATION_PROPERTY.getIRI(), OWL_RESTRICTION.getIRI(), OWL_THING.getIRI(), OWL_NOTHING.getIRI(),
            OWL_ONTOLOGY.getIRI(), OWL_ANNOTATION_PROPERTY.getIRI(), OWL_NAMED_INDIVIDUAL.getIRI(), RDFS_DATATYPE
                .getIRI(), OWL_AXIOM.getIRI(), OWL_ANNOTATION.getIRI()));
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    /**
     * @param ontology
     *        ontology
     */
    public RDFRendererBase(@Nonnull OWLOntology ontology) {
        this(ontology, ontology.getOWLOntologyManager().getOntologyFormat(ontology));__CLR4_5_2n8zn8zlvicmccd.R.inc(30134);try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30133);
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    protected RDFRendererBase(@Nonnull OWLOntology ontology, OWLDocumentFormat format) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30135);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30136);this.ontology = ontology;
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30137);this.format = format;
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30138);if ((((AnonymousIndividualProperties.shouldSaveIdsForAllAnonymousIndividuals())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30139)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30140)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30141);occurrences = new AlwaysOutputId();
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30142);axiomOccurrences = new AlwaysOutputId();
        } }else {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30143);OWLAnonymousIndividualsWithMultipleOccurrences visitor = new OWLAnonymousIndividualsWithMultipleOccurrences();
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30144);occurrences = visitor;
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30145);ontology.accept(visitor);
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30146);axiomOccurrences = new OWLAxiomsWithNestedAnnotations();
        }
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    /** Hooks for subclasses */
    /**
     * Called before the ontology document is rendered.
     * 
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    protected abstract void beginDocument() throws IOException;

    /**
     * Called after the ontology document has been rendered.
     * 
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    protected abstract void endDocument() throws IOException;

    /**
     * Called before an OWLObject such as an entity, anonymous individual, rule
     * etc. is rendered.
     * 
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    @SuppressWarnings("unused")
    protected void beginObject() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30147);}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    /**
     * Called after an OWLObject such as an entity, anonymous individual, rule
     * etc. has been rendered.
     * 
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    @SuppressWarnings("unused")
    protected void endObject() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30148);}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    /**
     * Called before an annotation property is rendered to give subclasses the
     * chance to prefix the rendering with comments etc.
     * 
     * @param prop
     *        The property being rendered
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    protected abstract void writeAnnotationPropertyComment(@Nonnull OWLAnnotationProperty prop) throws IOException;

    /**
     * Called before a data property is rendered to give subclasses the chance
     * to prefix the rendering with comments etc.
     * 
     * @param prop
     *        The property being rendered
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    protected abstract void writeDataPropertyComment(@Nonnull OWLDataProperty prop) throws IOException;

    /**
     * Called before an object property is rendered.
     * 
     * @param prop
     *        The property being rendered
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    protected abstract void writeObjectPropertyComment(@Nonnull OWLObjectProperty prop) throws IOException;

    /**
     * Called before a class is rendered to give subclasses the chance to prefix
     * the rendering with comments etc.
     * 
     * @param cls
     *        The class being rendered
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    protected abstract void writeClassComment(@Nonnull OWLClass cls) throws IOException;

    /**
     * Called before a datatype is rendered to give subclasses the chance to
     * prefix the rendering with comments etc.
     * 
     * @param datatype
     *        The datatype being rendered
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    protected abstract void writeDatatypeComment(@Nonnull OWLDatatype datatype) throws IOException;

    /**
     * Called before an individual is rendered to give subclasses the chance to
     * prefix the rendering with comments etc.
     * 
     * @param ind
     *        The individual being rendered
     * @throws IOException
     *         if there was a problem writing to the output stream
     */
    protected abstract void writeIndividualComments(@Nonnull OWLNamedIndividual ind) throws IOException;

    /**
     * @throws IOException
     *         io error
     */
    public void render() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30149);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30150);graph = new RDFGraph();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30151);punned = ontology.getPunnedIRIs(EXCLUDED);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30152);beginDocument();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30153);renderOntologyHeader();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30154);renderOntologyComponents();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30155);endDocument();
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void renderOntologyComponents() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30156);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30157);renderInOntologySignatureEntities(OWLDocumentFormatImpl.determineIllegalPunnings(shouldInsertDeclarations(),
            ontology.getSignature(), ontology.getPunnedIRIs(INCLUDED)));
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30158);renderAnonymousIndividuals();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30159);renderUntypedIRIAnnotationAssertions();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30160);renderGeneralAxioms();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30161);renderSWRLRules();
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void renderInOntologySignatureEntities(Collection<IRI> illegalPuns) throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30162);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30163);Set<OWLAnnotationProperty> annotationProperties = ontology.getAnnotationPropertiesInSignature(EXCLUDED);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30164);renderEntities(annotationProperties, ANNOTATION_PROPERTIES_BANNER_TEXT, illegalPuns);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30165);Set<OWLDatatype> datatypes = ontology.getDatatypesInSignature();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30166);renderEntities(datatypes, DATATYPES_BANNER_TEXT, illegalPuns);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30167);Set<OWLObjectProperty> objectProperties = ontology.getObjectPropertiesInSignature();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30168);renderEntities(objectProperties, OBJECT_PROPERTIES_BANNER_TEXT, illegalPuns);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30169);Set<OWLDataProperty> dataProperties = ontology.getDataPropertiesInSignature();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30170);renderEntities(dataProperties, DATA_PROPERTIES_BANNER_TEXT, illegalPuns);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30171);Set<OWLClass> clses = ontology.getClassesInSignature();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30172);renderEntities(clses, CLASSES_BANNER_TEXT, illegalPuns);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30173);Set<OWLNamedIndividual> individuals = ontology.getIndividualsInSignature();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30174);renderEntities(individuals, INDIVIDUALS_BANNER_TEXT, illegalPuns);
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    /**
     * Renders a set of entities.
     * 
     * @param entities
     *        The entities. Not null.
     * @param bannerText
     *        The banner text that will prefix the rendering of the entities if
     *        anything is rendered. Not null. May be empty, in which case no
     *        banner will be written.
     * @param illegalPuns
     *        illegal puns
     * @throws IOException
     *         If there was a problem writing the rendering
     */
    private void renderEntities(@Nonnull Set<? extends OWLEntity> entities, @Nonnull String bannerText,
        Collection<IRI> illegalPuns) throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30175);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30176);boolean firstRendering = true && XMLWriterPreferences.getInstance().isBannersEnabled();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30177);for (OWLEntity entity : toSortedSet(entities)) {{
            assert (((entity != null)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30178)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30179)==0&false));
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30180);if ((((createGraph(entity, illegalPuns))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30181)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30182)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30183);if ((((firstRendering)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30184)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30185)==0&false))) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30186);firstRendering = false;
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30187);if ((((!bannerText.isEmpty())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30188)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30189)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30190);writeBanner(bannerText);
                    }
                }}
                }__CLR4_5_2n8zn8zlvicmccd.R.inc(30191);renderEntity(entity);
            }
        }}
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void renderEntity(@Nonnull OWLEntity entity) throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30192);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30193);beginObject();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30194);writeEntityComment(entity);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30195);render(new RDFResourceIRI(entity.getIRI()));
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30196);renderAnonRoots();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30197);endObject();
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    /**
     * Calls the appropriate hook method to write the comments for an entity.
     * 
     * @param entity
     *        The entity for which comments should be written.
     * @throws IOException
     *         if there was a problem writing the comment
     */
    private void writeEntityComment(@Nonnull OWLEntity entity) throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30198);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30199);if ((((entity.isOWLClass())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30200)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30201)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30202);writeClassComment(entity.asOWLClass());
        } }else {__CLR4_5_2n8zn8zlvicmccd.R.inc(30203);if ((((entity.isOWLDatatype())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30204)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30205)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30206);writeDatatypeComment(entity.asOWLDatatype());
        } }else {__CLR4_5_2n8zn8zlvicmccd.R.inc(30207);if ((((entity.isOWLObjectProperty())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30208)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30209)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30210);writeObjectPropertyComment(entity.asOWLObjectProperty());
        } }else {__CLR4_5_2n8zn8zlvicmccd.R.inc(30211);if ((((entity.isOWLDataProperty())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30212)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30213)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30214);writeDataPropertyComment(entity.asOWLDataProperty());
        } }else {__CLR4_5_2n8zn8zlvicmccd.R.inc(30215);if ((((entity.isOWLAnnotationProperty())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30216)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30217)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30218);writeAnnotationPropertyComment(entity.asOWLAnnotationProperty());
        } }else {__CLR4_5_2n8zn8zlvicmccd.R.inc(30219);if ((((entity.isOWLNamedIndividual())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30220)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30221)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30222);writeIndividualComments(entity.asOWLNamedIndividual());
        }
    }}}}}}}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void renderUntypedIRIAnnotationAssertions() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30223);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30224);Set<IRI> annotatedIRIs = new TreeSet<>();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30225);for (OWLAnnotationAssertionAxiom ax : ontology.getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30226);OWLAnnotationSubject subject = ax.getSubject();
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30227);if ((((subject instanceof IRI)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30228)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30229)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30230);IRI iri = (IRI) subject;
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30231);if ((((punned.contains(iri) || !ontology.containsEntityInSignature(iri, EXCLUDED))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30232)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30233)==0&false))) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30234);annotatedIRIs.add(iri);
                }
            }}
        }}
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30235);if ((((!annotatedIRIs.isEmpty())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30236)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30237)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30238);writeBanner(ANNOTATED_IRIS_BANNER_TEXT);
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30239);for (IRI iri : annotatedIRIs) {{
                assert (((iri != null)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30240)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30241)==0&false));
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30242);beginObject();
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30243);createGraph(ontology.getAnnotationAssertionAxioms(iri));
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30244);render(new RDFResourceIRI(iri));
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30245);renderAnonRoots();
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30246);endObject();
            }
        }}
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void renderAnonymousIndividuals() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30247);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30248);for (OWLAnonymousIndividual anonInd : sortOptionally(ontology.getReferencedAnonymousIndividuals(EXCLUDED))) {{
            assert (((anonInd != null)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30249)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30250)==0&false));
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30251);boolean anonRoot = true;
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30252);Set<OWLAxiom> axioms = new TreeSet<>();
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30253);for (OWLAxiom ax : sortOptionally(ontology.getReferencingAxioms(anonInd, EXCLUDED))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30254);if ((((!(ax instanceof OWLDifferentIndividualsAxiom))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30255)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30256)==0&false))) {{
                    assert (((ax != null)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30257)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30258)==0&false));
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30259);AxiomSubjectProvider subjectProvider = new AxiomSubjectProvider();
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30260);OWLObject obj = subjectProvider.getSubject(ax);
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30261);if ((((!obj.equals(anonInd))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30262)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30263)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30264);anonRoot = false;
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30265);break;
                    } }else {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30266);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_2n8zn8zlvicmccd.R.inc(30267);if ((((anonRoot)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30268)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30269)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30270);createGraph(axioms);
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30271);renderAnonRoots();
            }
        }}
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void renderSWRLRules() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30272);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30273);Set<SWRLRule> ruleAxioms = new TreeSet<>(ontology.getAxioms(AxiomType.SWRL_RULE));
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30274);createGraph(ruleAxioms);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30275);if ((((!ruleAxioms.isEmpty())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30276)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30277)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30278);writeBanner(RULES_BANNER_TEXT);
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30279);SWRLVariableExtractor variableExtractor = new SWRLVariableExtractor();
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30280);for (SWRLRule rule : ruleAxioms) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30281);rule.accept(variableExtractor);
            }
            }__CLR4_5_2n8zn8zlvicmccd.R.inc(30282);for (SWRLVariable var : variableExtractor.getVariables()) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30283);render(new RDFResourceIRI(var.getIRI()));
            }
            }__CLR4_5_2n8zn8zlvicmccd.R.inc(30284);renderAnonRoots();
        }
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void renderGeneralAxioms() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30285);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30286);boolean haveWrittenBanner = false;
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30287);Set<OWLAxiom> generalAxioms = getGeneralAxioms();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30288);for (OWLAxiom axiom : generalAxioms) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30289);Set<OWLAxiom> axiomSet = Collections.singleton(axiom);
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30290);createGraph(axiomSet);
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30291);Set<RDFResourceBlankNode> rootNodes = graph.getRootAnonymousNodes();
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30292);if ((((!rootNodes.isEmpty())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30293)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30294)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30295);if ((((!haveWrittenBanner)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30296)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30297)==0&false))) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30298);writeBanner(GENERAL_AXIOMS_BANNER_TEXT);
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30299);haveWrittenBanner = true;
                }
                }__CLR4_5_2n8zn8zlvicmccd.R.inc(30300);beginObject();
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30301);renderAnonRoots();
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30302);endObject();
            }
        }}
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    /**
     * Gets the general axioms in the ontology. These are axioms such as
     * DifferentIndividuals, General Class axioms which do not describe or
     * define a named class and so can't be written out as a frame, nary
     * disjoint classes, disjoint object properties, disjoint data properties
     * and HasKey axioms where the class expression is anonymous.
     * 
     * @return A set of axioms that are general axioms (and can't be written out
     *         in a frame-based style).
     */
    @Nonnull
    private Set<OWLAxiom> getGeneralAxioms() {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30303);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30304);Set<OWLAxiom> generalAxioms = new TreeSet<>();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30305);generalAxioms.addAll(ontology.getGeneralClassAxioms());
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30306);generalAxioms.addAll(ontology.getAxioms(AxiomType.DIFFERENT_INDIVIDUALS));
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30307);for (OWLDisjointClassesAxiom ax : ontology.getAxioms(AxiomType.DISJOINT_CLASSES)) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30308);if ((((ax.getClassExpressions().size() > 2)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30309)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30310)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30311);generalAxioms.add(ax);
            }
        }}
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30312);for (OWLDisjointObjectPropertiesAxiom ax : ontology.getAxioms(AxiomType.DISJOINT_OBJECT_PROPERTIES)) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30313);if ((((ax.getProperties().size() > 2)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30314)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30315)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30316);generalAxioms.add(ax);
            }
        }}
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30317);for (OWLDisjointDataPropertiesAxiom ax : ontology.getAxioms(AxiomType.DISJOINT_DATA_PROPERTIES)) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30318);if ((((ax.getProperties().size() > 2)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30319)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30320)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30321);generalAxioms.add(ax);
            }
        }}
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30322);for (OWLHasKeyAxiom ax : ontology.getAxioms(AxiomType.HAS_KEY)) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30323);if ((((ax.getClassExpression().isAnonymous())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30324)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30325)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30326);generalAxioms.add(ax);
            }
        }}
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30327);return generalAxioms;
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    protected void renderOntologyHeader() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30328);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30329);RDFTranslator translator = new RDFTranslator(ontology.getOWLOntologyManager(), ontology,
            shouldInsertDeclarations(), occurrences);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30330);graph = translator.getGraph();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30331);RDFResource ontologyHeaderNode = createOntologyHeaderNode(translator);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30332);addVersionIRIToOntologyHeader(ontologyHeaderNode, translator);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30333);addImportsDeclarationsToOntologyHeader(ontologyHeaderNode, translator);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30334);addAnnotationsToOntologyHeader(ontologyHeaderNode, translator);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30335);if ((((!graph.isEmpty())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30336)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30337)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30338);render(ontologyHeaderNode);
        }
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    @Nonnull
    private RDFResource createOntologyHeaderNode(RDFTranslator translator) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30339);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30340);ontology.accept(translator);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30341);return translator.getMappedNode(ontology);
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void addVersionIRIToOntologyHeader(@Nonnull RDFResource ontologyHeaderNode, RDFTranslator translator) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30342);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30343);OWLOntologyID ontID = ontology.getOntologyID();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30344);if ((((ontID.getVersionIRI().isPresent())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30345)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30346)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30347);translator.addTriple(ontologyHeaderNode, OWL_VERSION_IRI.getIRI(), ontID.getVersionIRI().get());
        }
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void addImportsDeclarationsToOntologyHeader(@Nonnull RDFResource ontologyHeaderNode,
        RDFTranslator translator) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30348);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30349);for (OWLImportsDeclaration decl : ontology.getImportsDeclarations()) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30350);translator.addTriple(ontologyHeaderNode, OWL_IMPORTS.getIRI(), decl.getIRI());
        }
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private void addAnnotationsToOntologyHeader(@Nonnull RDFResource ontologyHeaderNode, RDFTranslator translator) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30351);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30352);for (OWLAnnotation anno : ontology.getAnnotations()) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30353);translator.addTriple(ontologyHeaderNode, anno.getProperty().getIRI(), anno.getValue());
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30354);if ((((anno.getValue() instanceof OWLAnonymousIndividual)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30355)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30356)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30357);OWLAnonymousIndividual i = (OWLAnonymousIndividual) anno.getValue();
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30358);for (OWLAxiom ax : ontology.getReferencingAxioms(i)) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30359);ax.accept(translator);
                }
            }}
        }}
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private boolean createGraph(@Nonnull OWLEntity entity, Collection<IRI> illegalPuns) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30360);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30361);final Set<OWLAxiom> axioms = new TreeSet<>();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30362);axioms.addAll(ontology.getDeclarationAxioms(entity));
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30363);entity.accept(new OWLEntityVisitor() {

            @Override
            public void visit(OWLClass cls) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30364);
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30365);for (OWLAxiom ax : ontology.getAxioms(cls, EXCLUDED)) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30366);if ((((ax instanceof OWLDisjointClassesAxiom)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30367)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30368)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30369);OWLDisjointClassesAxiom disjAx = (OWLDisjointClassesAxiom) ax;
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30370);if ((((disjAx.getClassExpressions().size() > 2)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30371)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30372)==0&false))) {{
                            __CLR4_5_2n8zn8zlvicmccd.R.inc(30373);continue;
                        }
                    }}
                    }__CLR4_5_2n8zn8zlvicmccd.R.inc(30374);axioms.add(ax);
                }
                }__CLR4_5_2n8zn8zlvicmccd.R.inc(30375);for (OWLHasKeyAxiom ax : ontology.getAxioms(AxiomType.HAS_KEY)) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30376);if ((((ax.getClassExpression().equals(cls))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30377)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30378)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30379);axioms.add(ax);
                    }
                }}
            }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

            @Override
            public void visit(OWLDatatype datatype) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30380);
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30381);axioms.addAll(ontology.getDatatypeDefinitions(datatype));
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30382);createGraph(axioms);
            }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

            @Override
            public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30383);
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30384);for (OWLAxiom ax : sortOptionally(ontology.getAxioms(individual, EXCLUDED))) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30385);if ((((ax instanceof OWLDifferentIndividualsAxiom)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30386)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30387)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30388);continue;
                    }
                    }__CLR4_5_2n8zn8zlvicmccd.R.inc(30389);axioms.add(ax);
                }
                // for object property assertion axioms where the property is
                // anonymous and the individual is the object, the renderer will
                // save the simplified version of the axiom.
                // As they will have subject and object inverted, we need to
                // collect them here, otherwise the triple will not be included
                // because the subject will not match
                }__CLR4_5_2n8zn8zlvicmccd.R.inc(30390);for (OWLAxiom ax : ontology.getReferencingAxioms(individual)) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30391);if ((((ax instanceof OWLObjectPropertyAssertionAxiom)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30392)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30393)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30394);OWLObjectPropertyAssertionAxiom candidate = (OWLObjectPropertyAssertionAxiom) ax;
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30395);if ((((candidate.getProperty().isAnonymous() && candidate.getObject().equals(individual))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30396)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30397)==0&false))) {{
                            __CLR4_5_2n8zn8zlvicmccd.R.inc(30398);axioms.add(candidate);
                        }
                    }}
                }}
            }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

            @Override
            public void visit(OWLDataProperty property) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30399);
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30400);for (OWLAxiom ax : ontology.getAxioms(property, EXCLUDED)) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30401);if ((((ax instanceof OWLDisjointDataPropertiesAxiom && ((OWLDisjointDataPropertiesAxiom) ax)
                        .getProperties().size() > 2)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30402)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30403)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30404);continue;
                    }
                    }__CLR4_5_2n8zn8zlvicmccd.R.inc(30405);axioms.add(ax);
                }
            }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

            @Override
            public void visit(OWLObjectProperty property) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30406);
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30407);for (OWLAxiom ax : ontology.getAxioms(property, EXCLUDED)) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30408);if ((((ax instanceof OWLDisjointObjectPropertiesAxiom && ((OWLDisjointObjectPropertiesAxiom) ax)
                        .getProperties().size() > 2)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30409)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30410)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30411);continue;
                    }
                    }__CLR4_5_2n8zn8zlvicmccd.R.inc(30412);axioms.add(ax);
                }
                }__CLR4_5_2n8zn8zlvicmccd.R.inc(30413);for (OWLSubPropertyChainOfAxiom ax : ontology.getAxioms(AxiomType.SUB_PROPERTY_CHAIN_OF)) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30414);if ((((ax.getSuperProperty().equals(property))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30415)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30416)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30417);axioms.add(ax);
                    }
                }}
                }__CLR4_5_2n8zn8zlvicmccd.R.inc(30418);axioms.addAll(ontology.getAxioms(ontology.getOWLOntologyManager().getOWLDataFactory()
                    .getOWLObjectInverseOf(property), EXCLUDED));
            }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

            @Override
            public void visit(OWLAnnotationProperty property) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30419);
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30420);axioms.addAll(ontology.getAxioms(property, EXCLUDED));
            }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}
        });
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30421);if ((((axioms.isEmpty() && shouldInsertDeclarations() && !illegalPuns.contains(entity.getIRI())
            && OWLDocumentFormatImpl.isMissingType(entity, ontology))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30422)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30423)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30424);axioms.add(ontology.getOWLOntologyManager().getOWLDataFactory().getOWLDeclarationAxiom(entity));
        }
        // Don't write out duplicates for punned annotations!
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30425);if ((((!punned.contains(entity.getIRI()))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30426)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30427)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30428);axioms.addAll(ontology.getAnnotationAssertionAxioms(entity.getIRI()));
        }
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30429);createGraph(axioms);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30430);return !axioms.isEmpty();
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    protected boolean shouldInsertDeclarations() {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30431);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30432);return format == null || format.isAddMissingTypes();
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private AtomicInteger nextBlankNodeId = new AtomicInteger(1);
    private TObjectIntCustomHashMap<Object> blankNodeMap = new TObjectIntCustomHashMap<>(
        new IdentityHashingStrategy<>());

    @Nonnull
    protected RDFResourceBlankNode getBlankNodeFor(Object key, boolean isIndividual, boolean needId) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30433);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30434);int id = blankNodeMap.get(key);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30435);if ((((id == 0)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30436)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30437)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30438);id = nextBlankNodeId.getAndIncrement();
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30439);blankNodeMap.put(key, id);
        }
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30440);return new RDFResourceBlankNode(id, isIndividual, needId);
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    private class SequentialBlankNodeRDFTranslator extends RDFTranslator {

        public SequentialBlankNodeRDFTranslator() {
            super(ontology.getOWLOntologyManager(), ontology, shouldInsertDeclarations(), occurrences);__CLR4_5_2n8zn8zlvicmccd.R.inc(30442);try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30441);
        }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

        @Override
        protected RDFResourceBlankNode getAnonymousNode(Object key) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30443);
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30444);checkNotNull(key, "key cannot be null");
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30445);boolean isIndividual = key instanceof OWLAnonymousIndividual;
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30446);boolean needId = false;
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30447);if ((((isIndividual)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30448)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30449)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30450);OWLAnonymousIndividual anonymousIndividual = (OWLAnonymousIndividual) key;
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30451);needId = multipleOccurrences.appearsMultipleTimes(anonymousIndividual);
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30452);key = anonymousIndividual.getID().getID();
            } }else {__CLR4_5_2n8zn8zlvicmccd.R.inc(30453);if ((((key instanceof OWLAxiom)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30454)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30455)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30456);isIndividual = false;
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30457);needId = axiomOccurrences.appearsMultipleTimes((OWLAxiom) key);
            }
            }}__CLR4_5_2n8zn8zlvicmccd.R.inc(30458);return getBlankNodeFor(key, isIndividual, needId);
        }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}
    }

    protected void createGraph(@Nonnull Set<? extends OWLObject> objects) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30459);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30460);RDFTranslator translator = new SequentialBlankNodeRDFTranslator();
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30461);for (OWLObject obj : objects) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30462);obj.accept(translator);
        }
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30463);graph = translator.getGraph();
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    protected abstract void writeBanner(@Nonnull String name) throws IOException;

    @Nonnull
    private static List<OWLEntity> toSortedSet(@Nonnull Set<? extends OWLEntity> entities) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30464);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30465);List<OWLEntity> results = new ArrayList<>(entities);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30466);Collections.sort(results, OWL_ENTITY_IRI_COMPARATOR);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30467);return results;
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    /**
     * @throws IOException
     *         io error
     */
    public void renderAnonRoots() throws IOException {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30468);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30469);Set<RDFResourceBlankNode> rootAnonymousNodes = new TreeSet<>(graph.getRootAnonymousNodes());
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30470);for (RDFResourceBlankNode node : rootAnonymousNodes) {{
            assert (((node != null)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30471)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30472)==0&false));
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30473);render(node);
        }
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    /**
     * Renders the triples in the current graph into a concrete format.
     * Subclasses of this class decide upon how the triples get rendered.
     * 
     * @param node
     *        The main node to be rendered
     * @throws IOException
     *         If there was a problem rendering the triples.
     */
    public abstract void render(@Nonnull RDFResource node) throws IOException;

    protected boolean isObjectList(RDFResource node) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30474);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30475);for (RDFTriple triple : graph.getTriplesForSubject(node)) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30476);if ((((triple.getPredicate().getIRI().equals(RDF_TYPE.getIRI()) && !triple.getObject().isAnonymous() && triple
                .getObject().getIRI().equals(RDF_LIST.getIRI()))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30477)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30478)==0&false))) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30479);List<RDFNode> items = new ArrayList<>();
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30480);toJavaList(node, items);
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30481);for (RDFNode n : items) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30482);if ((((n.isLiteral())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30483)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30484)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30485);return false;
                    }
                }}
                }__CLR4_5_2n8zn8zlvicmccd.R.inc(30486);return true;
            }
        }}
        }__CLR4_5_2n8zn8zlvicmccd.R.inc(30487);return false;
    }finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}

    protected void toJavaList(RDFNode n, @Nonnull List<RDFNode> list) {try{__CLR4_5_2n8zn8zlvicmccd.R.inc(30488);
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30489);RDFNode currentNode = n;
        __CLR4_5_2n8zn8zlvicmccd.R.inc(30490);while ((((currentNode != null)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30491)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30492)==0&false))) {{
            __CLR4_5_2n8zn8zlvicmccd.R.inc(30493);for (RDFTriple triple : graph.getTriplesForSubject(currentNode)) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30494);if ((((triple.getPredicate().getIRI().equals(RDF_FIRST.getIRI()))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30495)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30496)==0&false))) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30497);list.add(triple.getObject());
                }
            }}
            }__CLR4_5_2n8zn8zlvicmccd.R.inc(30498);for (RDFTriple triple : graph.getTriplesForSubject(currentNode)) {{
                __CLR4_5_2n8zn8zlvicmccd.R.inc(30499);if ((((triple.getPredicate().getIRI().equals(RDF_REST.getIRI()))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30500)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30501)==0&false))) {{
                    __CLR4_5_2n8zn8zlvicmccd.R.inc(30502);if ((((!triple.getObject().isAnonymous())&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30503)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30504)==0&false))) {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30505);if ((((triple.getObject().getIRI().equals(RDF_NIL.getIRI()))&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30506)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30507)==0&false))) {{
                            // End of list
                            __CLR4_5_2n8zn8zlvicmccd.R.inc(30508);currentNode = null;
                        }
                    }} }else {{
                        __CLR4_5_2n8zn8zlvicmccd.R.inc(30509);if ((((triple.getObject() instanceof RDFResource)&&(__CLR4_5_2n8zn8zlvicmccd.R.iget(30510)!=0|true))||(__CLR4_5_2n8zn8zlvicmccd.R.iget(30511)==0&false))) {{
                            // Should be another list
                            __CLR4_5_2n8zn8zlvicmccd.R.inc(30512);currentNode = triple.getObject();
                            // toJavaList(triple.getObject(), list);
                        }
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_5_2n8zn8zlvicmccd.R.flushNeeded();}}
}
