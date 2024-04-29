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
package org.semanticweb.owlapi.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.*;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLObjectDuplicator implements OWLObjectVisitor, SWRLObjectVisitor {public static class __CLR4_5_28ut8utlvickr9d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,11967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private final OWLDataFactory dataFactory;
    private Object obj;
    @Nonnull private final Map<OWLEntity, IRI> replacementMap;
    @Nonnull private final Map<OWLLiteral, OWLLiteral> replacementLiterals;
    protected RemappingIndividualProvider anonProvider;

    /**
     * Creates an object duplicator that duplicates objects using the specified
     * data factory.
     * 
     * @param dataFactory
     *        The data factory to be used for the duplication.
     */
    public OWLObjectDuplicator(@Nonnull OWLDataFactory dataFactory) {
        this(new HashMap<OWLEntity, IRI>(), dataFactory);__CLR4_5_28ut8utlvickr9d.R.inc(11478);try{__CLR4_5_28ut8utlvickr9d.R.inc(11477);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    /**
     * Creates an object duplicator that duplicates objects using the specified
     * data factory and uri replacement map.
     * 
     * @param dataFactory
     *        The data factory to be used for the duplication.
     * @param iriReplacementMap
     *        The map to use for the replacement of URIs. Any uris the appear in
     *        the map will be replaced as objects are duplicated. This can be
     *        used to "rename" entities.
     */
    public OWLObjectDuplicator(@Nonnull OWLDataFactory dataFactory, @Nonnull Map<IRI, IRI> iriReplacementMap) {
        this(dataFactory, iriReplacementMap, Collections.<OWLLiteral, OWLLiteral> emptyMap());__CLR4_5_28ut8utlvickr9d.R.inc(11480);try{__CLR4_5_28ut8utlvickr9d.R.inc(11479);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    /**
     * Creates an object duplicator that duplicates objects using the specified
     * data factory and uri replacement map.
     * 
     * @param dataFactory
     *        The data factory to be used for the duplication.
     * @param iriReplacementMap
     *        The map to use for the replacement of URIs. Any uris the appear in
     *        the map will be replaced as objects are duplicated. This can be
     *        used to "rename" entities.
     * @param literals
     *        replacement literals
     */
    public OWLObjectDuplicator(@Nonnull OWLDataFactory dataFactory, @Nonnull Map<IRI, IRI> iriReplacementMap,
        @Nonnull Map<OWLLiteral, OWLLiteral> literals) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11481);
        __CLR4_5_28ut8utlvickr9d.R.inc(11482);this.dataFactory = checkNotNull(dataFactory, "dataFactory cannot be null");
        __CLR4_5_28ut8utlvickr9d.R.inc(11483);checkNotNull(iriReplacementMap, "iriReplacementMap cannot be null");
        __CLR4_5_28ut8utlvickr9d.R.inc(11484);checkNotNull(literals, "literals cannot be null");
        __CLR4_5_28ut8utlvickr9d.R.inc(11485);replacementLiterals = new HashMap<>(literals);
        __CLR4_5_28ut8utlvickr9d.R.inc(11486);replacementMap = new HashMap<>();
        __CLR4_5_28ut8utlvickr9d.R.inc(11487);for (Map.Entry<IRI, IRI> e : iriReplacementMap.entrySet()) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11488);@Nonnull IRI iri = e.getKey();
            __CLR4_5_28ut8utlvickr9d.R.inc(11489);IRI repIRI = e.getValue();
            __CLR4_5_28ut8utlvickr9d.R.inc(11490);replacementMap.put(dataFactory.getOWLClass(iri), repIRI);
            __CLR4_5_28ut8utlvickr9d.R.inc(11491);replacementMap.put(dataFactory.getOWLObjectProperty(iri), repIRI);
            __CLR4_5_28ut8utlvickr9d.R.inc(11492);replacementMap.put(dataFactory.getOWLDataProperty(iri), repIRI);
            __CLR4_5_28ut8utlvickr9d.R.inc(11493);replacementMap.put(dataFactory.getOWLNamedIndividual(iri), repIRI);
            __CLR4_5_28ut8utlvickr9d.R.inc(11494);replacementMap.put(dataFactory.getOWLDatatype(iri), repIRI);
            __CLR4_5_28ut8utlvickr9d.R.inc(11495);replacementMap.put(dataFactory.getOWLAnnotationProperty(iri), repIRI);
        }
    }}finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    /**
     * Creates an object duplicator that duplicates objects using the specified
     * data factory and uri replacement map.
     * 
     * @param dataFactory
     *        The data factory to be used for the duplication.
     * @param entityIRIReplacementMap
     *        The map to use for the replacement of URIs. Any uris the appear in
     *        the map will be replaced as objects are duplicated. This can be
     *        used to "rename" entities.
     */
    public OWLObjectDuplicator(@Nonnull Map<OWLEntity, IRI> entityIRIReplacementMap,
        @Nonnull OWLDataFactory dataFactory) {
        this(entityIRIReplacementMap, dataFactory, Collections.<OWLLiteral, OWLLiteral> emptyMap());__CLR4_5_28ut8utlvickr9d.R.inc(11497);try{__CLR4_5_28ut8utlvickr9d.R.inc(11496);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    /**
     * Creates an object duplicator that duplicates objects using the specified
     * data factory and uri replacement map.
     * 
     * @param dataFactory
     *        The data factory to be used for the duplication.
     * @param entityIRIReplacementMap
     *        The map to use for the replacement of URIs. Any uris the appear in
     *        the map will be replaced as objects are duplicated. This can be
     *        used to "rename" entities.
     * @param literals
     *        replacement literals
     */
    public OWLObjectDuplicator(@Nonnull Map<OWLEntity, IRI> entityIRIReplacementMap,
        @Nonnull OWLDataFactory dataFactory, @Nonnull Map<OWLLiteral, OWLLiteral> literals) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11498);
        __CLR4_5_28ut8utlvickr9d.R.inc(11499);this.dataFactory = checkNotNull(dataFactory, "dataFactory cannot be null");
        __CLR4_5_28ut8utlvickr9d.R.inc(11500);anonProvider = new RemappingIndividualProvider(this.dataFactory);
        __CLR4_5_28ut8utlvickr9d.R.inc(11501);replacementMap = new HashMap<>(checkNotNull(entityIRIReplacementMap, "entityIRIReplacementMap cannot be null"));
        __CLR4_5_28ut8utlvickr9d.R.inc(11502);checkNotNull(literals, "literals cannot be null");
        __CLR4_5_28ut8utlvickr9d.R.inc(11503);replacementLiterals = new HashMap<>(literals);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    /**
     * @param object
     *        the object to duplicate
     * @return the duplicate
     * @param <O>
     *        return type
     */
    @Nonnull
    public <O extends OWLObject> O duplicateObject(@Nonnull OWLObject object) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11504);
        __CLR4_5_28ut8utlvickr9d.R.inc(11505);checkNotNull(object, "object cannot be null");
        __CLR4_5_28ut8utlvickr9d.R.inc(11506);object.accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11507);return getLastObject();
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    protected void setLastObject(@Nonnull Object obj) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11508);
        __CLR4_5_28ut8utlvickr9d.R.inc(11509);this.obj = obj;
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", })
    @Nonnull
    protected <O> O getLastObject() {try{__CLR4_5_28ut8utlvickr9d.R.inc(11510);
        __CLR4_5_28ut8utlvickr9d.R.inc(11511);return (O) obj;
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    /**
     * Given an IRI belonging to an entity, returns a IRI. This may be the same
     * IRI that the entity has, or an alternative IRI if a replacement has been
     * specified.
     * 
     * @param entity
     *        The entity
     * @return The IRI
     */
    @Nonnull
    private IRI getIRI(@Nonnull OWLEntity entity) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11512);
        __CLR4_5_28ut8utlvickr9d.R.inc(11513);checkNotNull(entity, "entity cannot be null");
        __CLR4_5_28ut8utlvickr9d.R.inc(11514);IRI replacement = replacementMap.get(entity);
        __CLR4_5_28ut8utlvickr9d.R.inc(11515);if ((((replacement != null)&&(__CLR4_5_28ut8utlvickr9d.R.iget(11516)!=0|true))||(__CLR4_5_28ut8utlvickr9d.R.iget(11517)==0&false))) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11518);return replacement;
        } }else {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11519);return entity.getIRI();
        }
    }}finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Nonnull
    private Set<OWLAnnotation> duplicateAxiomAnnotations(@Nonnull OWLAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11520);
        __CLR4_5_28ut8utlvickr9d.R.inc(11521);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_28ut8utlvickr9d.R.inc(11522);Set<OWLAnnotation> duplicatedAnnos = new HashSet<>();
        __CLR4_5_28ut8utlvickr9d.R.inc(11523);for (OWLAnnotation anno : axiom.getAnnotations()) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11524);anno.accept(this);
            __CLR4_5_28ut8utlvickr9d.R.inc(11525);duplicatedAnnos.add((OWLAnnotation) getLastObject());
        }
        }__CLR4_5_28ut8utlvickr9d.R.inc(11526);return duplicatedAnnos;
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11527);
        __CLR4_5_28ut8utlvickr9d.R.inc(11528);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11529);obj = dataFactory.getOWLAsymmetricObjectPropertyAxiom((OWLObjectPropertyExpression) getLastObject(),
            duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11530);
        __CLR4_5_28ut8utlvickr9d.R.inc(11531);axiom.getIndividual().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11532);OWLIndividual ind = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11533);axiom.getClassExpression().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11534);OWLClassExpression type = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11535);obj = dataFactory.getOWLClassAssertionAxiom(type, ind, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11536);
        __CLR4_5_28ut8utlvickr9d.R.inc(11537);axiom.getSubject().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11538);OWLIndividual subj = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11539);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11540);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11541);axiom.getObject().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11542);OWLLiteral con = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11543);obj = dataFactory.getOWLDataPropertyAssertionAxiom(prop, subj, con, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11544);
        __CLR4_5_28ut8utlvickr9d.R.inc(11545);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11546);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11547);axiom.getDomain().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11548);OWLClassExpression domain = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11549);obj = dataFactory.getOWLDataPropertyDomainAxiom(prop, domain, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11550);
        __CLR4_5_28ut8utlvickr9d.R.inc(11551);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11552);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11553);axiom.getRange().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11554);OWLDataRange range = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11555);obj = dataFactory.getOWLDataPropertyRangeAxiom(prop, range, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11556);
        __CLR4_5_28ut8utlvickr9d.R.inc(11557);axiom.getSubProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11558);OWLDataPropertyExpression subProp = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11559);axiom.getSuperProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11560);OWLDataPropertyExpression supProp = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11561);obj = dataFactory.getOWLSubDataPropertyOfAxiom(subProp, supProp, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDeclarationAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11562);
        __CLR4_5_28ut8utlvickr9d.R.inc(11563);axiom.getEntity().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11564);OWLEntity ent = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11565);obj = dataFactory.getOWLDeclarationAxiom(ent, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11566);
        __CLR4_5_28ut8utlvickr9d.R.inc(11567);Set<OWLIndividual> inds = duplicateSet(axiom.getIndividuals());
        __CLR4_5_28ut8utlvickr9d.R.inc(11568);obj = dataFactory.getOWLDifferentIndividualsAxiom(inds, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11569);
        __CLR4_5_28ut8utlvickr9d.R.inc(11570);Set<OWLClassExpression> descs = duplicateSet(axiom.getClassExpressions());
        __CLR4_5_28ut8utlvickr9d.R.inc(11571);obj = dataFactory.getOWLDisjointClassesAxiom(descs, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11572);
        __CLR4_5_28ut8utlvickr9d.R.inc(11573);Set<OWLDataPropertyExpression> props = duplicateSet(axiom.getProperties());
        __CLR4_5_28ut8utlvickr9d.R.inc(11574);obj = dataFactory.getOWLDisjointDataPropertiesAxiom(props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11575);
        __CLR4_5_28ut8utlvickr9d.R.inc(11576);Set<OWLObjectPropertyExpression> props = duplicateSet(axiom.getProperties());
        __CLR4_5_28ut8utlvickr9d.R.inc(11577);obj = dataFactory.getOWLDisjointObjectPropertiesAxiom(props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11578);
        __CLR4_5_28ut8utlvickr9d.R.inc(11579);axiom.getOWLClass().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11580);OWLClass cls = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11581);Set<OWLClassExpression> ops = duplicateSet(axiom.getClassExpressions());
        __CLR4_5_28ut8utlvickr9d.R.inc(11582);obj = dataFactory.getOWLDisjointUnionAxiom(cls, ops, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11583);
        __CLR4_5_28ut8utlvickr9d.R.inc(11584);axiom.getSubject().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11585);OWLAnnotationSubject subject = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11586);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11587);OWLAnnotationProperty prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11588);axiom.getValue().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11589);OWLAnnotationValue value = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11590);obj = dataFactory.getOWLAnnotationAssertionAxiom(prop, subject, value, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11591);
        __CLR4_5_28ut8utlvickr9d.R.inc(11592);Set<OWLClassExpression> descs = duplicateSet(axiom.getClassExpressions());
        __CLR4_5_28ut8utlvickr9d.R.inc(11593);obj = dataFactory.getOWLEquivalentClassesAxiom(descs, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11594);
        __CLR4_5_28ut8utlvickr9d.R.inc(11595);Set<OWLDataPropertyExpression> props = duplicateSet(axiom.getProperties());
        __CLR4_5_28ut8utlvickr9d.R.inc(11596);obj = dataFactory.getOWLEquivalentDataPropertiesAxiom(props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11597);
        __CLR4_5_28ut8utlvickr9d.R.inc(11598);Set<OWLObjectPropertyExpression> props = duplicateSet(axiom.getProperties());
        __CLR4_5_28ut8utlvickr9d.R.inc(11599);obj = dataFactory.getOWLEquivalentObjectPropertiesAxiom(props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11600);
        __CLR4_5_28ut8utlvickr9d.R.inc(11601);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11602);OWLDataPropertyExpression obj2 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11603);obj = dataFactory.getOWLFunctionalDataPropertyAxiom(obj2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11604);
        __CLR4_5_28ut8utlvickr9d.R.inc(11605);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11606);OWLObjectPropertyExpression obj2 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11607);obj = dataFactory.getOWLFunctionalObjectPropertyAxiom(obj2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11608);
        __CLR4_5_28ut8utlvickr9d.R.inc(11609);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11610);OWLObjectPropertyExpression obj2 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11611);obj = dataFactory.getOWLInverseFunctionalObjectPropertyAxiom(obj2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11612);
        __CLR4_5_28ut8utlvickr9d.R.inc(11613);axiom.getFirstProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11614);OWLObjectPropertyExpression propA = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11615);axiom.getSecondProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11616);OWLObjectPropertyExpression propB = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11617);obj = dataFactory.getOWLInverseObjectPropertiesAxiom(propA, propB, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11618);
        __CLR4_5_28ut8utlvickr9d.R.inc(11619);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11620);OWLObjectPropertyExpression obj2 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11621);obj = dataFactory.getOWLIrreflexiveObjectPropertyAxiom(obj2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11622);
        __CLR4_5_28ut8utlvickr9d.R.inc(11623);axiom.getSubject().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11624);OWLIndividual ind = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11625);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11626);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11627);axiom.getObject().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11628);OWLLiteral con = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11629);obj = dataFactory.getOWLNegativeDataPropertyAssertionAxiom(prop, ind, con, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11630);
        __CLR4_5_28ut8utlvickr9d.R.inc(11631);axiom.getSubject().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11632);OWLIndividual ind = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11633);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11634);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11635);axiom.getObject().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11636);OWLIndividual ind2 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11637);obj = dataFactory.getOWLNegativeObjectPropertyAssertionAxiom(prop, ind, ind2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11638);
        __CLR4_5_28ut8utlvickr9d.R.inc(11639);axiom.getSubject().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11640);OWLIndividual ind = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11641);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11642);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11643);axiom.getObject().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11644);OWLIndividual ind2 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11645);obj = dataFactory.getOWLObjectPropertyAssertionAxiom(prop, ind, ind2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11646);
        __CLR4_5_28ut8utlvickr9d.R.inc(11647);axiom.getSuperProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11648);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11649);List<OWLObjectPropertyExpression> chain = new ArrayList<>();
        __CLR4_5_28ut8utlvickr9d.R.inc(11650);for (OWLObjectPropertyExpression p : axiom.getPropertyChain()) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11651);p.accept(this);
            __CLR4_5_28ut8utlvickr9d.R.inc(11652);chain.add((OWLObjectPropertyExpression) getLastObject());
        }
        }__CLR4_5_28ut8utlvickr9d.R.inc(11653);obj = dataFactory.getOWLSubPropertyChainOfAxiom(chain, prop, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11654);
        __CLR4_5_28ut8utlvickr9d.R.inc(11655);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11656);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11657);axiom.getDomain().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11658);OWLClassExpression domain = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11659);obj = dataFactory.getOWLObjectPropertyDomainAxiom(prop, domain, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11660);
        __CLR4_5_28ut8utlvickr9d.R.inc(11661);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11662);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11663);axiom.getRange().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11664);OWLClassExpression range = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11665);obj = dataFactory.getOWLObjectPropertyRangeAxiom(prop, range, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11666);
        __CLR4_5_28ut8utlvickr9d.R.inc(11667);axiom.getSubProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11668);OWLObjectPropertyExpression subProp = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11669);axiom.getSuperProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11670);OWLObjectPropertyExpression supProp = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11671);obj = dataFactory.getOWLSubObjectPropertyOfAxiom(subProp, supProp, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11672);
        __CLR4_5_28ut8utlvickr9d.R.inc(11673);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11674);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11675);obj = dataFactory.getOWLReflexiveObjectPropertyAxiom(prop, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11676);
        __CLR4_5_28ut8utlvickr9d.R.inc(11677);Set<OWLIndividual> individuals = duplicateSet(axiom.getIndividuals());
        __CLR4_5_28ut8utlvickr9d.R.inc(11678);obj = dataFactory.getOWLSameIndividualAxiom(individuals, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11679);
        __CLR4_5_28ut8utlvickr9d.R.inc(11680);axiom.getSubClass().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11681);OWLClassExpression subClass = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11682);axiom.getSuperClass().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11683);OWLClassExpression supClass = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11684);obj = dataFactory.getOWLSubClassOfAxiom(subClass, supClass, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11685);
        __CLR4_5_28ut8utlvickr9d.R.inc(11686);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11687);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11688);obj = dataFactory.getOWLSymmetricObjectPropertyAxiom(prop, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11689);
        __CLR4_5_28ut8utlvickr9d.R.inc(11690);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11691);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11692);obj = dataFactory.getOWLTransitiveObjectPropertyAxiom(prop, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClass ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11693);
        __CLR4_5_28ut8utlvickr9d.R.inc(11694);IRI uri = getIRI(ce);
        __CLR4_5_28ut8utlvickr9d.R.inc(11695);obj = dataFactory.getOWLClass(uri);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataAllValuesFrom ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11696);
        __CLR4_5_28ut8utlvickr9d.R.inc(11697);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11698);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11699);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11700);OWLDataRange filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11701);obj = dataFactory.getOWLDataAllValuesFrom(prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataExactCardinality ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11702);
        __CLR4_5_28ut8utlvickr9d.R.inc(11703);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11704);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11705);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11706);OWLDataRange filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11707);obj = dataFactory.getOWLDataExactCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMaxCardinality ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11708);
        __CLR4_5_28ut8utlvickr9d.R.inc(11709);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11710);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11711);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11712);OWLDataRange filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11713);obj = dataFactory.getOWLDataMaxCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMinCardinality ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11714);
        __CLR4_5_28ut8utlvickr9d.R.inc(11715);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11716);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11717);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11718);OWLDataRange filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11719);obj = dataFactory.getOWLDataMinCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataSomeValuesFrom ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11720);
        __CLR4_5_28ut8utlvickr9d.R.inc(11721);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11722);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11723);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11724);OWLDataRange filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11725);obj = dataFactory.getOWLDataSomeValuesFrom(prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataHasValue ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11726);
        __CLR4_5_28ut8utlvickr9d.R.inc(11727);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11728);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11729);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11730);OWLLiteral val = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11731);obj = dataFactory.getOWLDataHasValue(prop, val);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectAllValuesFrom ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11732);
        __CLR4_5_28ut8utlvickr9d.R.inc(11733);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11734);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11735);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11736);OWLClassExpression filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11737);obj = dataFactory.getOWLObjectAllValuesFrom(prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectComplementOf ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11738);
        __CLR4_5_28ut8utlvickr9d.R.inc(11739);ce.getOperand().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11740);OWLClassExpression op = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11741);obj = dataFactory.getOWLObjectComplementOf(op);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectExactCardinality ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11742);
        __CLR4_5_28ut8utlvickr9d.R.inc(11743);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11744);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11745);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11746);OWLClassExpression filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11747);obj = dataFactory.getOWLObjectExactCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectIntersectionOf ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11748);
        __CLR4_5_28ut8utlvickr9d.R.inc(11749);Set<OWLClassExpression> ops = duplicateSet(ce.getOperands());
        __CLR4_5_28ut8utlvickr9d.R.inc(11750);obj = dataFactory.getOWLObjectIntersectionOf(ops);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMaxCardinality ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11751);
        __CLR4_5_28ut8utlvickr9d.R.inc(11752);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11753);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11754);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11755);OWLClassExpression filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11756);obj = dataFactory.getOWLObjectMaxCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMinCardinality ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11757);
        __CLR4_5_28ut8utlvickr9d.R.inc(11758);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11759);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11760);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11761);OWLClassExpression filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11762);obj = dataFactory.getOWLObjectMinCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectOneOf ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11763);
        __CLR4_5_28ut8utlvickr9d.R.inc(11764);Set<OWLIndividual> inds = duplicateSet(ce.getIndividuals());
        __CLR4_5_28ut8utlvickr9d.R.inc(11765);obj = dataFactory.getOWLObjectOneOf(inds);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasSelf ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11766);
        __CLR4_5_28ut8utlvickr9d.R.inc(11767);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11768);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11769);obj = dataFactory.getOWLObjectHasSelf(prop);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectSomeValuesFrom ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11770);
        __CLR4_5_28ut8utlvickr9d.R.inc(11771);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11772);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11773);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11774);OWLClassExpression filler = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11775);obj = dataFactory.getOWLObjectSomeValuesFrom(prop, filler);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectUnionOf ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11776);
        __CLR4_5_28ut8utlvickr9d.R.inc(11777);Set<OWLClassExpression> ops = duplicateSet(ce.getOperands());
        __CLR4_5_28ut8utlvickr9d.R.inc(11778);obj = dataFactory.getOWLObjectUnionOf(ops);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasValue ce) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11779);
        __CLR4_5_28ut8utlvickr9d.R.inc(11780);ce.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11781);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11782);ce.getFiller().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11783);OWLIndividual value = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11784);obj = dataFactory.getOWLObjectHasValue(prop, value);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataComplementOf node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11785);
        __CLR4_5_28ut8utlvickr9d.R.inc(11786);node.getDataRange().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11787);OWLDataRange dr = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11788);obj = dataFactory.getOWLDataComplementOf(dr);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataOneOf node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11789);
        __CLR4_5_28ut8utlvickr9d.R.inc(11790);Set<OWLLiteral> vals = duplicateSet(node.getValues());
        __CLR4_5_28ut8utlvickr9d.R.inc(11791);obj = dataFactory.getOWLDataOneOf(vals);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatype node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11792);
        __CLR4_5_28ut8utlvickr9d.R.inc(11793);IRI iri = getIRI(node);
        __CLR4_5_28ut8utlvickr9d.R.inc(11794);obj = dataFactory.getOWLDatatype(iri);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeRestriction node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11795);
        __CLR4_5_28ut8utlvickr9d.R.inc(11796);node.getDatatype().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11797);OWLDatatype dr = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11798);Set<OWLFacetRestriction> restrictions = new HashSet<>();
        __CLR4_5_28ut8utlvickr9d.R.inc(11799);for (OWLFacetRestriction restriction : node.getFacetRestrictions()) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11800);restriction.accept(this);
            __CLR4_5_28ut8utlvickr9d.R.inc(11801);restrictions.add((OWLFacetRestriction) getLastObject());
        }
        }__CLR4_5_28ut8utlvickr9d.R.inc(11802);obj = dataFactory.getOWLDatatypeRestriction(dr, restrictions);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFacetRestriction node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11803);
        __CLR4_5_28ut8utlvickr9d.R.inc(11804);node.getFacetValue().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11805);OWLLiteral val = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11806);obj = dataFactory.getOWLFacetRestriction(node.getFacet(), val);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLLiteral node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11807);
        __CLR4_5_28ut8utlvickr9d.R.inc(11808);OWLLiteral l = replacementLiterals.get(node);
        __CLR4_5_28ut8utlvickr9d.R.inc(11809);if ((((l != null)&&(__CLR4_5_28ut8utlvickr9d.R.iget(11810)!=0|true))||(__CLR4_5_28ut8utlvickr9d.R.iget(11811)==0&false))) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11812);obj = l;
            __CLR4_5_28ut8utlvickr9d.R.inc(11813);return;
        }
        }__CLR4_5_28ut8utlvickr9d.R.inc(11814);node.getDatatype().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11815);OWLDatatype dt = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11816);if ((((node.hasLang())&&(__CLR4_5_28ut8utlvickr9d.R.iget(11817)!=0|true))||(__CLR4_5_28ut8utlvickr9d.R.iget(11818)==0&false))) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11819);obj = dataFactory.getOWLLiteral(node.getLiteral(), node.getLang());
        } }else {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11820);obj = dataFactory.getOWLLiteral(node.getLiteral(), dt);
        }
    }}finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataProperty property) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11821);
        __CLR4_5_28ut8utlvickr9d.R.inc(11822);IRI iri = getIRI(property);
        __CLR4_5_28ut8utlvickr9d.R.inc(11823);obj = dataFactory.getOWLDataProperty(iri);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectProperty property) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11824);
        __CLR4_5_28ut8utlvickr9d.R.inc(11825);IRI iri = getIRI(property);
        __CLR4_5_28ut8utlvickr9d.R.inc(11826);obj = dataFactory.getOWLObjectProperty(iri);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectInverseOf property) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11827);
        __CLR4_5_28ut8utlvickr9d.R.inc(11828);property.getInverse().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11829);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11830);obj = dataFactory.getOWLObjectInverseOf(prop);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNamedIndividual individual) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11831);
        __CLR4_5_28ut8utlvickr9d.R.inc(11832);IRI iri = getIRI(individual);
        __CLR4_5_28ut8utlvickr9d.R.inc(11833);obj = dataFactory.getOWLNamedIndividual(iri);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11834);
        // Should we duplicate ontologies here? Probably not.
        __CLR4_5_28ut8utlvickr9d.R.inc(11835);obj = ontology;
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLRule rule) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11836);
        __CLR4_5_28ut8utlvickr9d.R.inc(11837);Set<SWRLAtom> antecedents = new HashSet<>();
        __CLR4_5_28ut8utlvickr9d.R.inc(11838);Set<SWRLAtom> consequents = new HashSet<>();
        __CLR4_5_28ut8utlvickr9d.R.inc(11839);for (SWRLAtom atom : rule.getBody()) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11840);atom.accept(this);
            __CLR4_5_28ut8utlvickr9d.R.inc(11841);antecedents.add((SWRLAtom) getLastObject());
        }
        }__CLR4_5_28ut8utlvickr9d.R.inc(11842);for (SWRLAtom atom : rule.getHead()) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11843);atom.accept(this);
            __CLR4_5_28ut8utlvickr9d.R.inc(11844);consequents.add((SWRLAtom) getLastObject());
        }
        }__CLR4_5_28ut8utlvickr9d.R.inc(11845);obj = dataFactory.getSWRLRule(antecedents, consequents, duplicateAxiomAnnotations(rule));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLClassAtom node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11846);
        __CLR4_5_28ut8utlvickr9d.R.inc(11847);node.getPredicate().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11848);OWLClassExpression desc = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11849);node.getArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11850);SWRLIArgument atom = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11851);obj = dataFactory.getSWRLClassAtom(desc, atom);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataRangeAtom node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11852);
        __CLR4_5_28ut8utlvickr9d.R.inc(11853);node.getPredicate().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11854);OWLDataRange rng = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11855);node.getArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11856);SWRLDArgument atom = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11857);obj = dataFactory.getSWRLDataRangeAtom(rng, atom);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLObjectPropertyAtom node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11858);
        __CLR4_5_28ut8utlvickr9d.R.inc(11859);node.getPredicate().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11860);OWLObjectPropertyExpression exp = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11861);node.getFirstArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11862);SWRLIArgument arg0 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11863);node.getSecondArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11864);SWRLIArgument arg1 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11865);obj = dataFactory.getSWRLObjectPropertyAtom(exp, arg0, arg1);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataPropertyAtom node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11866);
        __CLR4_5_28ut8utlvickr9d.R.inc(11867);node.getPredicate().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11868);OWLDataPropertyExpression exp = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11869);node.getFirstArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11870);SWRLIArgument arg0 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11871);node.getSecondArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11872);SWRLDArgument arg1 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11873);obj = dataFactory.getSWRLDataPropertyAtom(exp, arg0, arg1);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLBuiltInAtom node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11874);
        __CLR4_5_28ut8utlvickr9d.R.inc(11875);List<SWRLDArgument> atomObjects = new ArrayList<>();
        __CLR4_5_28ut8utlvickr9d.R.inc(11876);for (SWRLDArgument atomObject : node.getArguments()) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11877);atomObject.accept(this);
            __CLR4_5_28ut8utlvickr9d.R.inc(11878);atomObjects.add((SWRLDArgument) getLastObject());
        }
        }__CLR4_5_28ut8utlvickr9d.R.inc(11879);obj = dataFactory.getSWRLBuiltInAtom(node.getPredicate(), atomObjects);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDifferentIndividualsAtom node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11880);
        __CLR4_5_28ut8utlvickr9d.R.inc(11881);node.getFirstArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11882);SWRLIArgument arg0 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11883);node.getSecondArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11884);SWRLIArgument arg1 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11885);obj = dataFactory.getSWRLDifferentIndividualsAtom(arg0, arg1);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLSameIndividualAtom node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11886);
        __CLR4_5_28ut8utlvickr9d.R.inc(11887);node.getFirstArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11888);SWRLIArgument arg0 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11889);node.getSecondArgument().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11890);SWRLIArgument arg1 = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11891);obj = dataFactory.getSWRLSameIndividualAtom(arg0, arg1);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLVariable node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11892);
        __CLR4_5_28ut8utlvickr9d.R.inc(11893);node.getIRI().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11894);IRI iri = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11895);obj = dataFactory.getSWRLVariable(iri);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLIndividualArgument node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11896);
        __CLR4_5_28ut8utlvickr9d.R.inc(11897);node.getIndividual().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11898);OWLIndividual ind = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11899);obj = dataFactory.getSWRLIndividualArgument(ind);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLLiteralArgument node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11900);
        __CLR4_5_28ut8utlvickr9d.R.inc(11901);node.getLiteral().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11902);OWLLiteral con = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11903);obj = dataFactory.getSWRLLiteralArgument(con);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLHasKeyAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11904);
        __CLR4_5_28ut8utlvickr9d.R.inc(11905);axiom.getClassExpression().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11906);OWLClassExpression ce = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11907);Set<OWLPropertyExpression> props = duplicateSet(axiom.getPropertyExpressions());
        __CLR4_5_28ut8utlvickr9d.R.inc(11908);obj = dataFactory.getOWLHasKeyAxiom(ce, props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataIntersectionOf node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11909);
        __CLR4_5_28ut8utlvickr9d.R.inc(11910);Set<OWLDataRange> ranges = duplicateSet(node.getOperands());
        __CLR4_5_28ut8utlvickr9d.R.inc(11911);obj = dataFactory.getOWLDataIntersectionOf(ranges);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataUnionOf node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11912);
        __CLR4_5_28ut8utlvickr9d.R.inc(11913);Set<OWLDataRange> ranges = duplicateSet(node.getOperands());
        __CLR4_5_28ut8utlvickr9d.R.inc(11914);obj = dataFactory.getOWLDataUnionOf(ranges);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationProperty property) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11915);
        __CLR4_5_28ut8utlvickr9d.R.inc(11916);obj = dataFactory.getOWLAnnotationProperty(getIRI(property));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11917);
        __CLR4_5_28ut8utlvickr9d.R.inc(11918);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11919);OWLAnnotationProperty prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11920);axiom.getDomain().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11921);IRI domain = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11922);obj = dataFactory.getOWLAnnotationPropertyDomainAxiom(prop, domain, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11923);
        __CLR4_5_28ut8utlvickr9d.R.inc(11924);axiom.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11925);OWLAnnotationProperty prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11926);axiom.getRange().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11927);IRI range = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11928);obj = dataFactory.getOWLAnnotationPropertyRangeAxiom(prop, range, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11929);
        __CLR4_5_28ut8utlvickr9d.R.inc(11930);axiom.getSubProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11931);OWLAnnotationProperty sub = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11932);axiom.getSuperProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11933);OWLAnnotationProperty sup = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11934);obj = dataFactory.getOWLSubAnnotationPropertyOfAxiom(sub, sup, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotation node) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11935);
        __CLR4_5_28ut8utlvickr9d.R.inc(11936);node.getProperty().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11937);OWLAnnotationProperty prop = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11938);node.getValue().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11939);OWLAnnotationValue val = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11940);obj = dataFactory.getOWLAnnotation(prop, val);
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11941);
        __CLR4_5_28ut8utlvickr9d.R.inc(11942);obj = anonProvider.getOWLAnonymousIndividual(individual.getID().getID());
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11943);
        __CLR4_5_28ut8utlvickr9d.R.inc(11944);obj = iri;
        __CLR4_5_28ut8utlvickr9d.R.inc(11945);for (EntityType<?> entityType : EntityType.values()) {{
            assert (((entityType != null)&&(__CLR4_5_28ut8utlvickr9d.R.iget(11946)!=0|true))||(__CLR4_5_28ut8utlvickr9d.R.iget(11947)==0&false));
            __CLR4_5_28ut8utlvickr9d.R.inc(11948);OWLEntity entity = dataFactory.getOWLEntity(entityType, iri);
            __CLR4_5_28ut8utlvickr9d.R.inc(11949);IRI replacementIRI = replacementMap.get(entity);
            __CLR4_5_28ut8utlvickr9d.R.inc(11950);if ((((replacementIRI != null)&&(__CLR4_5_28ut8utlvickr9d.R.iget(11951)!=0|true))||(__CLR4_5_28ut8utlvickr9d.R.iget(11952)==0&false))) {{
                __CLR4_5_28ut8utlvickr9d.R.inc(11953);obj = replacementIRI;
                __CLR4_5_28ut8utlvickr9d.R.inc(11954);break;
            }
        }}
    }}finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11955);
        __CLR4_5_28ut8utlvickr9d.R.inc(11956);axiom.getDatatype().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11957);OWLDatatype dt = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11958);axiom.getDataRange().accept(this);
        __CLR4_5_28ut8utlvickr9d.R.inc(11959);OWLDataRange rng = getLastObject();
        __CLR4_5_28ut8utlvickr9d.R.inc(11960);obj = dataFactory.getOWLDatatypeDefinitionAxiom(dt, rng, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}

    /**
     * A utility function that duplicates a set of objects.
     * 
     * @param objects
     *        The set of object to be duplicated
     * @return The set of duplicated objects
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    private <O extends OWLObject> Set<O> duplicateSet(@Nonnull Set<O> objects) {try{__CLR4_5_28ut8utlvickr9d.R.inc(11961);
        __CLR4_5_28ut8utlvickr9d.R.inc(11962);Set<O> dup = new HashSet<>();
        __CLR4_5_28ut8utlvickr9d.R.inc(11963);for (O o : objects) {{
            __CLR4_5_28ut8utlvickr9d.R.inc(11964);o.accept(this);
            __CLR4_5_28ut8utlvickr9d.R.inc(11965);dup.add((O) getLastObject());
        }
        }__CLR4_5_28ut8utlvickr9d.R.inc(11966);return dup;
    }finally{__CLR4_5_28ut8utlvickr9d.R.flushNeeded();}}
}
