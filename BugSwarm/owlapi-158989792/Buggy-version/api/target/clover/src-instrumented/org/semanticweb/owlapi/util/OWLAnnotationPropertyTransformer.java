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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLAnnotationPropertyTransformer implements OWLObjectVisitor, SWRLObjectVisitor {public static class __CLR4_5_272g72glvickqsj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,9703,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Logger LOGGER = LoggerFactory.getLogger(OWLAnnotationPropertyTransformer.class);
    @Nonnull private final OWLDataFactory dataFactory;
    private Object obj;
    @Nonnull private final Map<OWLEntity, OWLEntity> replacementMap;
    protected RemappingIndividualProvider anonProvider;

    /**
     * Creates an object duplicator that duplicates objects using the specified
     * data factory.
     * 
     * @param dataFactory
     *        The data factory to be used for the duplication.
     */
    public OWLAnnotationPropertyTransformer(@Nonnull OWLDataFactory dataFactory) {
        this(new HashMap<OWLEntity, OWLEntity>(), dataFactory);__CLR4_5_272g72glvickqsj.R.inc(9161);try{__CLR4_5_272g72glvickqsj.R.inc(9160);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

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
    public OWLAnnotationPropertyTransformer(@Nonnull OWLDataFactory dataFactory,
        @Nonnull Map<OWLEntity, OWLEntity> iriReplacementMap) {try{__CLR4_5_272g72glvickqsj.R.inc(9162);
        __CLR4_5_272g72glvickqsj.R.inc(9163);this.dataFactory = checkNotNull(dataFactory, "dataFactory cannot be null");
        __CLR4_5_272g72glvickqsj.R.inc(9164);checkNotNull(iriReplacementMap, "iriReplacementMap cannot be null");
        __CLR4_5_272g72glvickqsj.R.inc(9165);replacementMap = new HashMap<>(iriReplacementMap);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

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
    public OWLAnnotationPropertyTransformer(@Nonnull Map<OWLEntity, OWLEntity> entityIRIReplacementMap,
        @Nonnull OWLDataFactory dataFactory) {try{__CLR4_5_272g72glvickqsj.R.inc(9166);
        __CLR4_5_272g72glvickqsj.R.inc(9167);this.dataFactory = checkNotNull(dataFactory, "dataFactory cannot be null");
        __CLR4_5_272g72glvickqsj.R.inc(9168);anonProvider = new RemappingIndividualProvider(this.dataFactory);
        __CLR4_5_272g72glvickqsj.R.inc(9169);replacementMap = new HashMap<>(checkNotNull(entityIRIReplacementMap, "entityIRIReplacementMap cannot be null"));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    /**
     * @param object
     *        the object to duplicate
     * @return the duplicate
     * @param <O>
     *        return type
     */
    @Nonnull
    public <O extends OWLObject> O transformObject(@Nonnull O object) {try{__CLR4_5_272g72glvickqsj.R.inc(9170);
        __CLR4_5_272g72glvickqsj.R.inc(9171);checkNotNull(object, "object cannot be null");
        __CLR4_5_272g72glvickqsj.R.inc(9172);try {
            __CLR4_5_272g72glvickqsj.R.inc(9173);object.accept(this);
        } catch (ClassCastException e) {
            __CLR4_5_272g72glvickqsj.R.inc(9174);LOGGER.error(
                "Attempt to transform an axiom to correct misuse of properties failed. Property replacement: {}, axiom: {}, error: {}",
                replacementMap, object, e.getMessage());
            __CLR4_5_272g72glvickqsj.R.inc(9175);obj = object;
        }
        __CLR4_5_272g72glvickqsj.R.inc(9176);return getLastObject();
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    protected void setLastObject(@Nonnull Object obj) {try{__CLR4_5_272g72glvickqsj.R.inc(9177);
        __CLR4_5_272g72glvickqsj.R.inc(9178);this.obj = obj;
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", })
    @Nonnull
    protected <O> O getLastObject() {try{__CLR4_5_272g72glvickqsj.R.inc(9179);
        __CLR4_5_272g72glvickqsj.R.inc(9180);return (O) obj;
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

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
    private OWLEntity getIRI(@Nonnull OWLEntity entity) {try{__CLR4_5_272g72glvickqsj.R.inc(9181);
        __CLR4_5_272g72glvickqsj.R.inc(9182);checkNotNull(entity, "entity cannot be null");
        __CLR4_5_272g72glvickqsj.R.inc(9183);OWLEntity replacement = replacementMap.get(entity);
        __CLR4_5_272g72glvickqsj.R.inc(9184);if ((((replacement != null)&&(__CLR4_5_272g72glvickqsj.R.iget(9185)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9186)==0&false))) {{
            __CLR4_5_272g72glvickqsj.R.inc(9187);return replacement;
        } }else {{
            __CLR4_5_272g72glvickqsj.R.inc(9188);return entity;
        }
    }}finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Nonnull
    private Set<OWLAnnotation> duplicateAxiomAnnotations(@Nonnull OWLAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9189);
        __CLR4_5_272g72glvickqsj.R.inc(9190);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_272g72glvickqsj.R.inc(9191);Set<OWLAnnotation> duplicatedAnnos = new HashSet<>();
        __CLR4_5_272g72glvickqsj.R.inc(9192);for (OWLAnnotation anno : axiom.getAnnotations()) {{
            __CLR4_5_272g72glvickqsj.R.inc(9193);anno.accept(this);
            __CLR4_5_272g72glvickqsj.R.inc(9194);duplicatedAnnos.add((OWLAnnotation) getLastObject());
        }
        }__CLR4_5_272g72glvickqsj.R.inc(9195);return duplicatedAnnos;
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9196);
        __CLR4_5_272g72glvickqsj.R.inc(9197);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9198);obj = dataFactory.getOWLAsymmetricObjectPropertyAxiom((OWLObjectPropertyExpression) getLastObject(),
            duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9199);
        __CLR4_5_272g72glvickqsj.R.inc(9200);axiom.getIndividual().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9201);OWLIndividual ind = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9202);axiom.getClassExpression().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9203);OWLClassExpression type = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9204);obj = dataFactory.getOWLClassAssertionAxiom(type, ind, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9205);
        __CLR4_5_272g72glvickqsj.R.inc(9206);axiom.getSubject().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9207);OWLIndividual subj = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9208);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9209);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9210);axiom.getObject().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9211);OWLLiteral con = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9212);obj = dataFactory.getOWLDataPropertyAssertionAxiom(prop, subj, con, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9213);
        __CLR4_5_272g72glvickqsj.R.inc(9214);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9215);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9216);axiom.getDomain().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9217);OWLClassExpression domain = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9218);obj = dataFactory.getOWLDataPropertyDomainAxiom(prop, domain, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9219);
        __CLR4_5_272g72glvickqsj.R.inc(9220);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9221);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9222);axiom.getRange().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9223);OWLDataRange range = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9224);obj = dataFactory.getOWLDataPropertyRangeAxiom(prop, range, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9225);
        __CLR4_5_272g72glvickqsj.R.inc(9226);axiom.getSubProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9227);OWLDataPropertyExpression subProp = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9228);axiom.getSuperProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9229);OWLDataPropertyExpression supProp = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9230);obj = dataFactory.getOWLSubDataPropertyOfAxiom(subProp, supProp, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDeclarationAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9231);
        __CLR4_5_272g72glvickqsj.R.inc(9232);axiom.getEntity().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9233);OWLEntity ent = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9234);obj = dataFactory.getOWLDeclarationAxiom(ent, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9235);
        __CLR4_5_272g72glvickqsj.R.inc(9236);Set<OWLIndividual> inds = duplicateSet(axiom.getIndividuals());
        __CLR4_5_272g72glvickqsj.R.inc(9237);obj = dataFactory.getOWLDifferentIndividualsAxiom(inds, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9238);
        __CLR4_5_272g72glvickqsj.R.inc(9239);Set<OWLClassExpression> descs = duplicateSet(axiom.getClassExpressions());
        __CLR4_5_272g72glvickqsj.R.inc(9240);obj = dataFactory.getOWLDisjointClassesAxiom(descs, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9241);
        __CLR4_5_272g72glvickqsj.R.inc(9242);Set<OWLDataPropertyExpression> props = duplicateSet(axiom.getProperties());
        __CLR4_5_272g72glvickqsj.R.inc(9243);obj = dataFactory.getOWLDisjointDataPropertiesAxiom(props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9244);
        __CLR4_5_272g72glvickqsj.R.inc(9245);Set<OWLObjectPropertyExpression> props = duplicateSet(axiom.getProperties());
        __CLR4_5_272g72glvickqsj.R.inc(9246);obj = dataFactory.getOWLDisjointObjectPropertiesAxiom(props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9247);
        __CLR4_5_272g72glvickqsj.R.inc(9248);axiom.getOWLClass().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9249);OWLClass cls = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9250);Set<OWLClassExpression> ops = duplicateSet(axiom.getClassExpressions());
        __CLR4_5_272g72glvickqsj.R.inc(9251);obj = dataFactory.getOWLDisjointUnionAxiom(cls, ops, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9252);
        __CLR4_5_272g72glvickqsj.R.inc(9253);axiom.getSubject().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9254);OWLAnnotationSubject subject = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9255);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9256);OWLProperty prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9257);axiom.getValue().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9258);OWLAnnotationValue value = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9259);if ((((prop.isObjectPropertyExpression())&&(__CLR4_5_272g72glvickqsj.R.iget(9260)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9261)==0&false))) {{
            // turn to object property assertion
            __CLR4_5_272g72glvickqsj.R.inc(9262);OWLIndividual individual;
            __CLR4_5_272g72glvickqsj.R.inc(9263);OWLIndividual relatedIndividual;
            __CLR4_5_272g72glvickqsj.R.inc(9264);if ((((subject instanceof OWLAnonymousIndividual)&&(__CLR4_5_272g72glvickqsj.R.iget(9265)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9266)==0&false))) {{
                __CLR4_5_272g72glvickqsj.R.inc(9267);individual = (OWLIndividual) subject;
            } }else {{
                __CLR4_5_272g72glvickqsj.R.inc(9268);individual = dataFactory.getOWLNamedIndividual((IRI) subject);
            }
            }__CLR4_5_272g72glvickqsj.R.inc(9269);if ((((value instanceof OWLIndividual)&&(__CLR4_5_272g72glvickqsj.R.iget(9270)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9271)==0&false))) {{
                __CLR4_5_272g72glvickqsj.R.inc(9272);relatedIndividual = (OWLIndividual) value;
            } }else {{
                __CLR4_5_272g72glvickqsj.R.inc(9273);relatedIndividual = dataFactory.getOWLNamedIndividual((IRI) value);
            }
            }__CLR4_5_272g72glvickqsj.R.inc(9274);obj = dataFactory.getOWLObjectPropertyAssertionAxiom(prop.asOWLObjectProperty(), individual,
                relatedIndividual, axiom.getAnnotations());
            __CLR4_5_272g72glvickqsj.R.inc(9275);return;
        } }else {__CLR4_5_272g72glvickqsj.R.inc(9276);if ((((prop.isDataPropertyExpression())&&(__CLR4_5_272g72glvickqsj.R.iget(9277)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9278)==0&false))) {{
            // turn to data property assertion
            __CLR4_5_272g72glvickqsj.R.inc(9279);OWLIndividual individual;
            __CLR4_5_272g72glvickqsj.R.inc(9280);if ((((subject instanceof OWLAnonymousIndividual)&&(__CLR4_5_272g72glvickqsj.R.iget(9281)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9282)==0&false))) {{
                __CLR4_5_272g72glvickqsj.R.inc(9283);individual = (OWLIndividual) subject;
            } }else {{
                __CLR4_5_272g72glvickqsj.R.inc(9284);individual = dataFactory.getOWLNamedIndividual((IRI) subject);
            }
            }__CLR4_5_272g72glvickqsj.R.inc(9285);obj = dataFactory.getOWLDataPropertyAssertionAxiom(prop.asOWLDataProperty(), individual, (OWLLiteral) value,
                axiom.getAnnotations());
            __CLR4_5_272g72glvickqsj.R.inc(9286);return;
        }
        }}__CLR4_5_272g72glvickqsj.R.inc(9287);obj = dataFactory.getOWLAnnotationAssertionAxiom(prop.asOWLAnnotationProperty(), subject, value,
            duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9288);
        __CLR4_5_272g72glvickqsj.R.inc(9289);Set<OWLClassExpression> descs = duplicateSet(axiom.getClassExpressions());
        __CLR4_5_272g72glvickqsj.R.inc(9290);obj = dataFactory.getOWLEquivalentClassesAxiom(descs, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9291);
        __CLR4_5_272g72glvickqsj.R.inc(9292);Set<OWLDataPropertyExpression> props = duplicateSet(axiom.getProperties());
        __CLR4_5_272g72glvickqsj.R.inc(9293);obj = dataFactory.getOWLEquivalentDataPropertiesAxiom(props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9294);
        __CLR4_5_272g72glvickqsj.R.inc(9295);Set<OWLObjectPropertyExpression> props = duplicateSet(axiom.getProperties());
        __CLR4_5_272g72glvickqsj.R.inc(9296);obj = dataFactory.getOWLEquivalentObjectPropertiesAxiom(props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9297);
        __CLR4_5_272g72glvickqsj.R.inc(9298);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9299);OWLDataPropertyExpression obj2 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9300);obj = dataFactory.getOWLFunctionalDataPropertyAxiom(obj2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9301);
        __CLR4_5_272g72glvickqsj.R.inc(9302);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9303);OWLObjectPropertyExpression obj2 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9304);obj = dataFactory.getOWLFunctionalObjectPropertyAxiom(obj2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9305);
        __CLR4_5_272g72glvickqsj.R.inc(9306);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9307);OWLObjectPropertyExpression obj2 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9308);obj = dataFactory.getOWLInverseFunctionalObjectPropertyAxiom(obj2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9309);
        __CLR4_5_272g72glvickqsj.R.inc(9310);axiom.getFirstProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9311);OWLObjectPropertyExpression propA = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9312);axiom.getSecondProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9313);OWLObjectPropertyExpression propB = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9314);obj = dataFactory.getOWLInverseObjectPropertiesAxiom(propA, propB, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9315);
        __CLR4_5_272g72glvickqsj.R.inc(9316);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9317);OWLObjectPropertyExpression obj2 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9318);obj = dataFactory.getOWLIrreflexiveObjectPropertyAxiom(obj2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9319);
        __CLR4_5_272g72glvickqsj.R.inc(9320);axiom.getSubject().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9321);OWLIndividual ind = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9322);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9323);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9324);axiom.getObject().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9325);OWLLiteral con = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9326);obj = dataFactory.getOWLNegativeDataPropertyAssertionAxiom(prop, ind, con, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9327);
        __CLR4_5_272g72glvickqsj.R.inc(9328);axiom.getSubject().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9329);OWLIndividual ind = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9330);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9331);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9332);axiom.getObject().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9333);OWLIndividual ind2 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9334);obj = dataFactory.getOWLNegativeObjectPropertyAssertionAxiom(prop, ind, ind2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9335);
        __CLR4_5_272g72glvickqsj.R.inc(9336);axiom.getSubject().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9337);OWLIndividual ind = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9338);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9339);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9340);axiom.getObject().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9341);OWLIndividual ind2 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9342);obj = dataFactory.getOWLObjectPropertyAssertionAxiom(prop, ind, ind2, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9343);
        __CLR4_5_272g72glvickqsj.R.inc(9344);axiom.getSuperProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9345);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9346);List<OWLObjectPropertyExpression> chain = new ArrayList<>();
        __CLR4_5_272g72glvickqsj.R.inc(9347);for (OWLObjectPropertyExpression p : axiom.getPropertyChain()) {{
            __CLR4_5_272g72glvickqsj.R.inc(9348);p.accept(this);
            __CLR4_5_272g72glvickqsj.R.inc(9349);chain.add((OWLObjectPropertyExpression) getLastObject());
        }
        }__CLR4_5_272g72glvickqsj.R.inc(9350);obj = dataFactory.getOWLSubPropertyChainOfAxiom(chain, prop, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9351);
        __CLR4_5_272g72glvickqsj.R.inc(9352);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9353);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9354);axiom.getDomain().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9355);OWLClassExpression domain = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9356);obj = dataFactory.getOWLObjectPropertyDomainAxiom(prop, domain, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9357);
        __CLR4_5_272g72glvickqsj.R.inc(9358);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9359);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9360);axiom.getRange().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9361);OWLClassExpression range = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9362);obj = dataFactory.getOWLObjectPropertyRangeAxiom(prop, range, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9363);
        __CLR4_5_272g72glvickqsj.R.inc(9364);axiom.getSubProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9365);OWLObjectPropertyExpression subProp = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9366);axiom.getSuperProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9367);OWLObjectPropertyExpression supProp = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9368);obj = dataFactory.getOWLSubObjectPropertyOfAxiom(subProp, supProp, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9369);
        __CLR4_5_272g72glvickqsj.R.inc(9370);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9371);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9372);obj = dataFactory.getOWLReflexiveObjectPropertyAxiom(prop, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9373);
        __CLR4_5_272g72glvickqsj.R.inc(9374);Set<OWLIndividual> individuals = duplicateSet(axiom.getIndividuals());
        __CLR4_5_272g72glvickqsj.R.inc(9375);obj = dataFactory.getOWLSameIndividualAxiom(individuals, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9376);
        __CLR4_5_272g72glvickqsj.R.inc(9377);axiom.getSubClass().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9378);OWLClassExpression subClass = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9379);axiom.getSuperClass().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9380);OWLClassExpression supClass = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9381);obj = dataFactory.getOWLSubClassOfAxiom(subClass, supClass, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9382);
        __CLR4_5_272g72glvickqsj.R.inc(9383);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9384);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9385);obj = dataFactory.getOWLSymmetricObjectPropertyAxiom(prop, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9386);
        __CLR4_5_272g72glvickqsj.R.inc(9387);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9388);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9389);obj = dataFactory.getOWLTransitiveObjectPropertyAxiom(prop, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClass ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9390);
        __CLR4_5_272g72glvickqsj.R.inc(9391);obj = getIRI(ce);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataAllValuesFrom ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9392);
        __CLR4_5_272g72glvickqsj.R.inc(9393);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9394);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9395);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9396);OWLDataRange filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9397);obj = dataFactory.getOWLDataAllValuesFrom(prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataExactCardinality ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9398);
        __CLR4_5_272g72glvickqsj.R.inc(9399);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9400);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9401);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9402);OWLDataRange filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9403);obj = dataFactory.getOWLDataExactCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMaxCardinality ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9404);
        __CLR4_5_272g72glvickqsj.R.inc(9405);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9406);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9407);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9408);OWLDataRange filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9409);obj = dataFactory.getOWLDataMaxCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMinCardinality ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9410);
        __CLR4_5_272g72glvickqsj.R.inc(9411);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9412);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9413);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9414);OWLDataRange filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9415);obj = dataFactory.getOWLDataMinCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataSomeValuesFrom ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9416);
        __CLR4_5_272g72glvickqsj.R.inc(9417);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9418);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9419);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9420);OWLDataRange filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9421);obj = dataFactory.getOWLDataSomeValuesFrom(prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataHasValue ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9422);
        __CLR4_5_272g72glvickqsj.R.inc(9423);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9424);OWLDataPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9425);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9426);OWLLiteral val = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9427);obj = dataFactory.getOWLDataHasValue(prop, val);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectAllValuesFrom ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9428);
        __CLR4_5_272g72glvickqsj.R.inc(9429);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9430);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9431);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9432);OWLClassExpression filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9433);obj = dataFactory.getOWLObjectAllValuesFrom(prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectComplementOf ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9434);
        __CLR4_5_272g72glvickqsj.R.inc(9435);ce.getOperand().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9436);OWLClassExpression op = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9437);obj = dataFactory.getOWLObjectComplementOf(op);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectExactCardinality ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9438);
        __CLR4_5_272g72glvickqsj.R.inc(9439);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9440);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9441);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9442);OWLClassExpression filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9443);obj = dataFactory.getOWLObjectExactCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectIntersectionOf ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9444);
        __CLR4_5_272g72glvickqsj.R.inc(9445);Set<OWLClassExpression> ops = duplicateSet(ce.getOperands());
        __CLR4_5_272g72glvickqsj.R.inc(9446);obj = dataFactory.getOWLObjectIntersectionOf(ops);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMaxCardinality ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9447);
        __CLR4_5_272g72glvickqsj.R.inc(9448);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9449);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9450);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9451);OWLClassExpression filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9452);obj = dataFactory.getOWLObjectMaxCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMinCardinality ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9453);
        __CLR4_5_272g72glvickqsj.R.inc(9454);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9455);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9456);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9457);OWLClassExpression filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9458);obj = dataFactory.getOWLObjectMinCardinality(ce.getCardinality(), prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectOneOf ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9459);
        __CLR4_5_272g72glvickqsj.R.inc(9460);Set<OWLIndividual> inds = duplicateSet(ce.getIndividuals());
        __CLR4_5_272g72glvickqsj.R.inc(9461);obj = dataFactory.getOWLObjectOneOf(inds);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasSelf ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9462);
        __CLR4_5_272g72glvickqsj.R.inc(9463);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9464);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9465);obj = dataFactory.getOWLObjectHasSelf(prop);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectSomeValuesFrom ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9466);
        __CLR4_5_272g72glvickqsj.R.inc(9467);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9468);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9469);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9470);OWLClassExpression filler = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9471);obj = dataFactory.getOWLObjectSomeValuesFrom(prop, filler);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectUnionOf ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9472);
        __CLR4_5_272g72glvickqsj.R.inc(9473);Set<OWLClassExpression> ops = duplicateSet(ce.getOperands());
        __CLR4_5_272g72glvickqsj.R.inc(9474);obj = dataFactory.getOWLObjectUnionOf(ops);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasValue ce) {try{__CLR4_5_272g72glvickqsj.R.inc(9475);
        __CLR4_5_272g72glvickqsj.R.inc(9476);ce.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9477);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9478);ce.getFiller().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9479);OWLIndividual value = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9480);obj = dataFactory.getOWLObjectHasValue(prop, value);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataComplementOf node) {try{__CLR4_5_272g72glvickqsj.R.inc(9481);
        __CLR4_5_272g72glvickqsj.R.inc(9482);node.getDataRange().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9483);OWLDataRange dr = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9484);obj = dataFactory.getOWLDataComplementOf(dr);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataOneOf node) {try{__CLR4_5_272g72glvickqsj.R.inc(9485);
        __CLR4_5_272g72glvickqsj.R.inc(9486);Set<OWLLiteral> vals = duplicateSet(node.getValues());
        __CLR4_5_272g72glvickqsj.R.inc(9487);obj = dataFactory.getOWLDataOneOf(vals);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatype node) {try{__CLR4_5_272g72glvickqsj.R.inc(9488);
        __CLR4_5_272g72glvickqsj.R.inc(9489);obj = getIRI(node);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeRestriction node) {try{__CLR4_5_272g72glvickqsj.R.inc(9490);
        __CLR4_5_272g72glvickqsj.R.inc(9491);node.getDatatype().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9492);OWLDatatype dr = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9493);Set<OWLFacetRestriction> restrictions = new HashSet<>();
        __CLR4_5_272g72glvickqsj.R.inc(9494);for (OWLFacetRestriction restriction : node.getFacetRestrictions()) {{
            __CLR4_5_272g72glvickqsj.R.inc(9495);restriction.accept(this);
            __CLR4_5_272g72glvickqsj.R.inc(9496);restrictions.add((OWLFacetRestriction) getLastObject());
        }
        }__CLR4_5_272g72glvickqsj.R.inc(9497);obj = dataFactory.getOWLDatatypeRestriction(dr, restrictions);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFacetRestriction node) {try{__CLR4_5_272g72glvickqsj.R.inc(9498);
        __CLR4_5_272g72glvickqsj.R.inc(9499);node.getFacetValue().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9500);OWLLiteral val = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9501);obj = dataFactory.getOWLFacetRestriction(node.getFacet(), val);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLLiteral node) {try{__CLR4_5_272g72glvickqsj.R.inc(9502);
        __CLR4_5_272g72glvickqsj.R.inc(9503);node.getDatatype().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9504);OWLDatatype dt = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9505);if ((((node.hasLang())&&(__CLR4_5_272g72glvickqsj.R.iget(9506)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9507)==0&false))) {{
            __CLR4_5_272g72glvickqsj.R.inc(9508);obj = dataFactory.getOWLLiteral(node.getLiteral(), node.getLang());
        } }else {{
            __CLR4_5_272g72glvickqsj.R.inc(9509);obj = dataFactory.getOWLLiteral(node.getLiteral(), dt);
        }
    }}finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataProperty property) {try{__CLR4_5_272g72glvickqsj.R.inc(9510);
        __CLR4_5_272g72glvickqsj.R.inc(9511);obj = getIRI(property);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectProperty property) {try{__CLR4_5_272g72glvickqsj.R.inc(9512);
        __CLR4_5_272g72glvickqsj.R.inc(9513);obj = getIRI(property);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectInverseOf property) {try{__CLR4_5_272g72glvickqsj.R.inc(9514);
        __CLR4_5_272g72glvickqsj.R.inc(9515);property.getInverse().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9516);OWLObjectPropertyExpression prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9517);obj = dataFactory.getOWLObjectInverseOf(prop);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNamedIndividual individual) {try{__CLR4_5_272g72glvickqsj.R.inc(9518);
        __CLR4_5_272g72glvickqsj.R.inc(9519);obj = getIRI(individual);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_272g72glvickqsj.R.inc(9520);
        // Should we duplicate ontologies here? Probably not.
        __CLR4_5_272g72glvickqsj.R.inc(9521);obj = ontology;
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLRule rule) {try{__CLR4_5_272g72glvickqsj.R.inc(9522);
        __CLR4_5_272g72glvickqsj.R.inc(9523);Set<SWRLAtom> antecedents = new HashSet<>();
        __CLR4_5_272g72glvickqsj.R.inc(9524);Set<SWRLAtom> consequents = new HashSet<>();
        __CLR4_5_272g72glvickqsj.R.inc(9525);for (SWRLAtom atom : rule.getBody()) {{
            __CLR4_5_272g72glvickqsj.R.inc(9526);atom.accept(this);
            __CLR4_5_272g72glvickqsj.R.inc(9527);antecedents.add((SWRLAtom) getLastObject());
        }
        }__CLR4_5_272g72glvickqsj.R.inc(9528);for (SWRLAtom atom : rule.getHead()) {{
            __CLR4_5_272g72glvickqsj.R.inc(9529);atom.accept(this);
            __CLR4_5_272g72glvickqsj.R.inc(9530);consequents.add((SWRLAtom) getLastObject());
        }
        }__CLR4_5_272g72glvickqsj.R.inc(9531);obj = dataFactory.getSWRLRule(antecedents, consequents);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLClassAtom node) {try{__CLR4_5_272g72glvickqsj.R.inc(9532);
        __CLR4_5_272g72glvickqsj.R.inc(9533);node.getPredicate().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9534);OWLClassExpression desc = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9535);node.getArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9536);SWRLIArgument atom = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9537);obj = dataFactory.getSWRLClassAtom(desc, atom);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataRangeAtom node) {try{__CLR4_5_272g72glvickqsj.R.inc(9538);
        __CLR4_5_272g72glvickqsj.R.inc(9539);node.getPredicate().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9540);OWLDataRange rng = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9541);node.getArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9542);SWRLDArgument atom = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9543);obj = dataFactory.getSWRLDataRangeAtom(rng, atom);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLObjectPropertyAtom node) {try{__CLR4_5_272g72glvickqsj.R.inc(9544);
        __CLR4_5_272g72glvickqsj.R.inc(9545);node.getPredicate().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9546);OWLObjectPropertyExpression exp = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9547);node.getFirstArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9548);SWRLIArgument arg0 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9549);node.getSecondArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9550);SWRLIArgument arg1 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9551);obj = dataFactory.getSWRLObjectPropertyAtom(exp, arg0, arg1);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataPropertyAtom node) {try{__CLR4_5_272g72glvickqsj.R.inc(9552);
        __CLR4_5_272g72glvickqsj.R.inc(9553);node.getPredicate().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9554);OWLDataPropertyExpression exp = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9555);node.getFirstArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9556);SWRLIArgument arg0 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9557);node.getSecondArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9558);SWRLDArgument arg1 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9559);obj = dataFactory.getSWRLDataPropertyAtom(exp, arg0, arg1);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLBuiltInAtom node) {try{__CLR4_5_272g72glvickqsj.R.inc(9560);
        __CLR4_5_272g72glvickqsj.R.inc(9561);List<SWRLDArgument> atomObjects = new ArrayList<>();
        __CLR4_5_272g72glvickqsj.R.inc(9562);for (SWRLDArgument atomObject : node.getArguments()) {{
            __CLR4_5_272g72glvickqsj.R.inc(9563);atomObject.accept(this);
            __CLR4_5_272g72glvickqsj.R.inc(9564);atomObjects.add((SWRLDArgument) getLastObject());
        }
        }__CLR4_5_272g72glvickqsj.R.inc(9565);obj = dataFactory.getSWRLBuiltInAtom(node.getPredicate(), atomObjects);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDifferentIndividualsAtom node) {try{__CLR4_5_272g72glvickqsj.R.inc(9566);
        __CLR4_5_272g72glvickqsj.R.inc(9567);node.getFirstArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9568);SWRLIArgument arg0 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9569);node.getSecondArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9570);SWRLIArgument arg1 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9571);obj = dataFactory.getSWRLDifferentIndividualsAtom(arg0, arg1);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLSameIndividualAtom node) {try{__CLR4_5_272g72glvickqsj.R.inc(9572);
        __CLR4_5_272g72glvickqsj.R.inc(9573);node.getFirstArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9574);SWRLIArgument arg0 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9575);node.getSecondArgument().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9576);SWRLIArgument arg1 = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9577);obj = dataFactory.getSWRLSameIndividualAtom(arg0, arg1);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLVariable node) {try{__CLR4_5_272g72glvickqsj.R.inc(9578);
        __CLR4_5_272g72glvickqsj.R.inc(9579);node.getIRI().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9580);IRI iri = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9581);obj = dataFactory.getSWRLVariable(iri);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLIndividualArgument node) {try{__CLR4_5_272g72glvickqsj.R.inc(9582);
        __CLR4_5_272g72glvickqsj.R.inc(9583);node.getIndividual().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9584);OWLIndividual ind = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9585);obj = dataFactory.getSWRLIndividualArgument(ind);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLLiteralArgument node) {try{__CLR4_5_272g72glvickqsj.R.inc(9586);
        __CLR4_5_272g72glvickqsj.R.inc(9587);node.getLiteral().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9588);OWLLiteral con = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9589);obj = dataFactory.getSWRLLiteralArgument(con);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLHasKeyAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9590);
        __CLR4_5_272g72glvickqsj.R.inc(9591);axiom.getClassExpression().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9592);OWLClassExpression ce = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9593);Set<OWLPropertyExpression> props = duplicateSet(axiom.getPropertyExpressions());
        __CLR4_5_272g72glvickqsj.R.inc(9594);obj = dataFactory.getOWLHasKeyAxiom(ce, props, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataIntersectionOf node) {try{__CLR4_5_272g72glvickqsj.R.inc(9595);
        __CLR4_5_272g72glvickqsj.R.inc(9596);Set<OWLDataRange> ranges = duplicateSet(node.getOperands());
        __CLR4_5_272g72glvickqsj.R.inc(9597);obj = dataFactory.getOWLDataIntersectionOf(ranges);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataUnionOf node) {try{__CLR4_5_272g72glvickqsj.R.inc(9598);
        __CLR4_5_272g72glvickqsj.R.inc(9599);Set<OWLDataRange> ranges = duplicateSet(node.getOperands());
        __CLR4_5_272g72glvickqsj.R.inc(9600);obj = dataFactory.getOWLDataUnionOf(ranges);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationProperty property) {try{__CLR4_5_272g72glvickqsj.R.inc(9601);
        __CLR4_5_272g72glvickqsj.R.inc(9602);obj = getIRI(property);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9603);
        __CLR4_5_272g72glvickqsj.R.inc(9604);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9605);OWLProperty prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9606);axiom.getDomain().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9607);IRI domain = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9608);if ((((prop.isObjectPropertyExpression())&&(__CLR4_5_272g72glvickqsj.R.iget(9609)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9610)==0&false))) {{
            // turn to object property domain
            __CLR4_5_272g72glvickqsj.R.inc(9611);OWLClassExpression d = dataFactory.getOWLClass(domain);
            __CLR4_5_272g72glvickqsj.R.inc(9612);LOGGER.warn(
                "Annotation property domain axiom turned to object property domain after parsing. This could introduce errors if the original domain was an anonymous expression: {} is the new domain.",
                domain);
            __CLR4_5_272g72glvickqsj.R.inc(9613);obj = dataFactory.getOWLObjectPropertyDomainAxiom(prop.asOWLObjectProperty(), d, axiom.getAnnotations());
            __CLR4_5_272g72glvickqsj.R.inc(9614);return;
        } }else {__CLR4_5_272g72glvickqsj.R.inc(9615);if ((((prop.isDataPropertyExpression())&&(__CLR4_5_272g72glvickqsj.R.iget(9616)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9617)==0&false))) {{
            // turn to data property domain
            __CLR4_5_272g72glvickqsj.R.inc(9618);OWLClassExpression d = dataFactory.getOWLClass(domain);
            __CLR4_5_272g72glvickqsj.R.inc(9619);LOGGER.warn(
                "Annotation property domain axiom turned to data property domain after parsing. This could introduce errors if the original domain was an anonymous expression: {} is the new domain.",
                domain);
            __CLR4_5_272g72glvickqsj.R.inc(9620);obj = dataFactory.getOWLDataPropertyDomainAxiom(prop.asOWLDataProperty(), d, axiom.getAnnotations());
            __CLR4_5_272g72glvickqsj.R.inc(9621);return;
        }
        }}__CLR4_5_272g72glvickqsj.R.inc(9622);obj = dataFactory.getOWLAnnotationPropertyDomainAxiom(prop.asOWLAnnotationProperty(), domain,
            duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9623);
        __CLR4_5_272g72glvickqsj.R.inc(9624);axiom.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9625);OWLProperty prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9626);axiom.getRange().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9627);IRI range = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9628);if ((((prop.isObjectPropertyExpression())&&(__CLR4_5_272g72glvickqsj.R.iget(9629)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9630)==0&false))) {{
            // turn to object property domain
            __CLR4_5_272g72glvickqsj.R.inc(9631);OWLClassExpression d = dataFactory.getOWLClass(range);
            __CLR4_5_272g72glvickqsj.R.inc(9632);LOGGER.warn(
                "Annotation property range axiom turned to object property range after parsing. This could introduce errors if the original range was an anonymous expression: {} is the new domain.",
                range);
            __CLR4_5_272g72glvickqsj.R.inc(9633);obj = dataFactory.getOWLObjectPropertyRangeAxiom(prop.asOWLObjectProperty(), d, axiom.getAnnotations());
            __CLR4_5_272g72glvickqsj.R.inc(9634);return;
        } }else {__CLR4_5_272g72glvickqsj.R.inc(9635);if ((((prop.isDataPropertyExpression())&&(__CLR4_5_272g72glvickqsj.R.iget(9636)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9637)==0&false))) {{
            // turn to data property domain
            __CLR4_5_272g72glvickqsj.R.inc(9638);OWLDataRange d = dataFactory.getOWLDatatype(range);
            __CLR4_5_272g72glvickqsj.R.inc(9639);LOGGER.warn(
                "Annotation property range axiom turned to data property range after parsing. This could introduce errors if the original range was an anonymous expression: {} is the new domain.",
                range);
            __CLR4_5_272g72glvickqsj.R.inc(9640);obj = dataFactory.getOWLDataPropertyRangeAxiom(prop.asOWLDataProperty(), d, axiom.getAnnotations());
            __CLR4_5_272g72glvickqsj.R.inc(9641);return;
        }
        }}__CLR4_5_272g72glvickqsj.R.inc(9642);obj = dataFactory.getOWLAnnotationPropertyRangeAxiom(prop.asOWLAnnotationProperty(), range,
            duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9643);
        __CLR4_5_272g72glvickqsj.R.inc(9644);axiom.getSubProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9645);OWLProperty sub = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9646);axiom.getSuperProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9647);OWLProperty sup = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9648);if ((((sub.isObjectPropertyExpression() || sup.isObjectPropertyExpression())&&(__CLR4_5_272g72glvickqsj.R.iget(9649)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9650)==0&false))) {{
            // check: it is possible that the properties represent an actual
            // illegal punning, where this fix cannot be applied
            __CLR4_5_272g72glvickqsj.R.inc(9651);if ((((sub.isOWLObjectProperty() && sup.isOWLObjectProperty())&&(__CLR4_5_272g72glvickqsj.R.iget(9652)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9653)==0&false))) {{
                __CLR4_5_272g72glvickqsj.R.inc(9654);obj = dataFactory.getOWLSubObjectPropertyOfAxiom(sub.asOWLObjectProperty(), sup.asOWLObjectProperty(),
                    axiom.getAnnotations());
            } }else {{
                // cannot repair: leave unchanged
                __CLR4_5_272g72glvickqsj.R.inc(9655);obj = axiom;
            }
            }__CLR4_5_272g72glvickqsj.R.inc(9656);return;
        } }else {__CLR4_5_272g72glvickqsj.R.inc(9657);if ((((sub.isDataPropertyExpression() || sup.isDataPropertyExpression())&&(__CLR4_5_272g72glvickqsj.R.iget(9658)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9659)==0&false))) {{
            __CLR4_5_272g72glvickqsj.R.inc(9660);if ((((sub.isOWLDataProperty() && sup.isOWLDataProperty())&&(__CLR4_5_272g72glvickqsj.R.iget(9661)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9662)==0&false))) {{
                __CLR4_5_272g72glvickqsj.R.inc(9663);obj = dataFactory.getOWLSubDataPropertyOfAxiom(sub.asOWLDataProperty(), sup.asOWLDataProperty(), axiom
                    .getAnnotations());
            } }else {{
                // cannot repair: leave unchanged
                __CLR4_5_272g72glvickqsj.R.inc(9664);obj = axiom;
            }
            }__CLR4_5_272g72glvickqsj.R.inc(9665);return;
        }
        }}__CLR4_5_272g72glvickqsj.R.inc(9666);if ((((sub.isOWLAnnotationProperty() && sup.isOWLAnnotationProperty())&&(__CLR4_5_272g72glvickqsj.R.iget(9667)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9668)==0&false))) {{
            __CLR4_5_272g72glvickqsj.R.inc(9669);obj = dataFactory.getOWLSubAnnotationPropertyOfAxiom(sub.asOWLAnnotationProperty(), sup
                .asOWLAnnotationProperty(), duplicateAxiomAnnotations(axiom));
        } }else {{
            // cannot repair: leave unchanged
            __CLR4_5_272g72glvickqsj.R.inc(9670);obj = axiom;
        }
    }}finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotation node) {try{__CLR4_5_272g72glvickqsj.R.inc(9671);
        __CLR4_5_272g72glvickqsj.R.inc(9672);node.getProperty().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9673);OWLAnnotationProperty prop = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9674);node.getValue().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9675);OWLAnnotationValue val = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9676);obj = dataFactory.getOWLAnnotation(prop, val);
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_272g72glvickqsj.R.inc(9677);
        __CLR4_5_272g72glvickqsj.R.inc(9678);obj = anonProvider.getOWLAnonymousIndividual(individual.getID().getID());
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_272g72glvickqsj.R.inc(9679);
        __CLR4_5_272g72glvickqsj.R.inc(9680);obj = iri;
        __CLR4_5_272g72glvickqsj.R.inc(9681);for (EntityType<?> entityType : EntityType.values()) {{
            assert (((entityType != null)&&(__CLR4_5_272g72glvickqsj.R.iget(9682)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9683)==0&false));
            __CLR4_5_272g72glvickqsj.R.inc(9684);OWLEntity entity = dataFactory.getOWLEntity(entityType, iri);
            __CLR4_5_272g72glvickqsj.R.inc(9685);OWLEntity replacementIRI = replacementMap.get(entity);
            __CLR4_5_272g72glvickqsj.R.inc(9686);if ((((replacementIRI != null)&&(__CLR4_5_272g72glvickqsj.R.iget(9687)!=0|true))||(__CLR4_5_272g72glvickqsj.R.iget(9688)==0&false))) {{
                __CLR4_5_272g72glvickqsj.R.inc(9689);obj = replacementIRI.getIRI();
                __CLR4_5_272g72glvickqsj.R.inc(9690);break;
            }
        }}
    }}finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_272g72glvickqsj.R.inc(9691);
        __CLR4_5_272g72glvickqsj.R.inc(9692);axiom.getDatatype().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9693);OWLDatatype dt = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9694);axiom.getDataRange().accept(this);
        __CLR4_5_272g72glvickqsj.R.inc(9695);OWLDataRange rng = getLastObject();
        __CLR4_5_272g72glvickqsj.R.inc(9696);obj = dataFactory.getOWLDatatypeDefinitionAxiom(dt, rng, duplicateAxiomAnnotations(axiom));
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}

    /**
     * A utility function that duplicates a set of objects.
     * 
     * @param objects
     *        The set of object to be duplicated
     * @return The set of duplicated objects
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    private <O extends OWLObject> Set<O> duplicateSet(@Nonnull Set<O> objects) {try{__CLR4_5_272g72glvickqsj.R.inc(9697);
        __CLR4_5_272g72glvickqsj.R.inc(9698);Set<O> dup = new HashSet<>();
        __CLR4_5_272g72glvickqsj.R.inc(9699);for (O o : objects) {{
            __CLR4_5_272g72glvickqsj.R.inc(9700);o.accept(this);
            __CLR4_5_272g72glvickqsj.R.inc(9701);dup.add((O) getLastObject());
        }
        }__CLR4_5_272g72glvickqsj.R.inc(9702);return dup;
    }finally{__CLR4_5_272g72glvickqsj.R.flushNeeded();}}
}
