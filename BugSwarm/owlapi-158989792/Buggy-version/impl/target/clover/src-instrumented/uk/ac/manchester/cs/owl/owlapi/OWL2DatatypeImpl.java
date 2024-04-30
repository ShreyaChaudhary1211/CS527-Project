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
package uk.ac.manchester.cs.owl.owlapi;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;
import static org.semanticweb.owlapi.vocab.OWL2Datatype.*;

import java.util.Collections;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.HashCode;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

/**
 * An optimised implementation of OWLDatatype for OWL2Datatypes.
 * 
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group
 * @since 3.2.0
 */
public class OWL2DatatypeImpl implements OWLDatatype {public static class __CLR4_5_222j22jlviclf9f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,2806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * Creates an instance of {@code OWLDatatypeImplForOWL2Datatype} for the
     * specified {@link OWL2Datatype}.
     * 
     * @param owl2Datatype
     *        The datatype. Not {@code null}.
     * @throws NullPointerException
     *         if {@code owl2Datatype} is {@code null}.
     */
    public OWL2DatatypeImpl(@Nonnull OWL2Datatype owl2Datatype) {try{__CLR4_5_222j22jlviclf9f.R.inc(2683);
        __CLR4_5_222j22jlviclf9f.R.inc(2684);this.owl2Datatype = checkNotNull(owl2Datatype, "owl2Datatype must not be null");
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Nonnull
    private final OWL2Datatype owl2Datatype;

    @Override
    public OWL2Datatype getBuiltInDatatype() {try{__CLR4_5_222j22jlviclf9f.R.inc(2685);
        __CLR4_5_222j22jlviclf9f.R.inc(2686);return owl2Datatype;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isString() {try{__CLR4_5_222j22jlviclf9f.R.inc(2687);
        __CLR4_5_222j22jlviclf9f.R.inc(2688);return owl2Datatype == XSD_STRING;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isInteger() {try{__CLR4_5_222j22jlviclf9f.R.inc(2689);
        __CLR4_5_222j22jlviclf9f.R.inc(2690);return owl2Datatype == XSD_INTEGER;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isFloat() {try{__CLR4_5_222j22jlviclf9f.R.inc(2691);
        __CLR4_5_222j22jlviclf9f.R.inc(2692);return owl2Datatype == XSD_FLOAT;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isDouble() {try{__CLR4_5_222j22jlviclf9f.R.inc(2693);
        __CLR4_5_222j22jlviclf9f.R.inc(2694);return owl2Datatype == XSD_DOUBLE;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isBoolean() {try{__CLR4_5_222j22jlviclf9f.R.inc(2695);
        __CLR4_5_222j22jlviclf9f.R.inc(2696);return owl2Datatype == XSD_BOOLEAN;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isRDFPlainLiteral() {try{__CLR4_5_222j22jlviclf9f.R.inc(2697);
        __CLR4_5_222j22jlviclf9f.R.inc(2698);return owl2Datatype == RDF_PLAIN_LITERAL;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isDatatype() {try{__CLR4_5_222j22jlviclf9f.R.inc(2699);
        __CLR4_5_222j22jlviclf9f.R.inc(2700);return true;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isTopDatatype() {try{__CLR4_5_222j22jlviclf9f.R.inc(2701);
        __CLR4_5_222j22jlviclf9f.R.inc(2702);return owl2Datatype == RDFS_LITERAL;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDatatype asOWLDatatype() {try{__CLR4_5_222j22jlviclf9f.R.inc(2703);
        __CLR4_5_222j22jlviclf9f.R.inc(2704);return this;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public DataRangeType getDataRangeType() {try{__CLR4_5_222j22jlviclf9f.R.inc(2705);
        __CLR4_5_222j22jlviclf9f.R.inc(2706);return DataRangeType.DATATYPE;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public void accept(OWLDataVisitor visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2707);
        __CLR4_5_222j22jlviclf9f.R.inc(2708);visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataVisitorEx<O> visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2709);
        __CLR4_5_222j22jlviclf9f.R.inc(2710);return visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public void accept(OWLDataRangeVisitor visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2711);
        __CLR4_5_222j22jlviclf9f.R.inc(2712);visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataRangeVisitorEx<O> visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2713);
        __CLR4_5_222j22jlviclf9f.R.inc(2714);return visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public EntityType<?> getEntityType() {try{__CLR4_5_222j22jlviclf9f.R.inc(2715);
        __CLR4_5_222j22jlviclf9f.R.inc(2716);return EntityType.DATATYPE;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isType(EntityType<?> entityType) {try{__CLR4_5_222j22jlviclf9f.R.inc(2717);
        __CLR4_5_222j22jlviclf9f.R.inc(2718);return EntityType.DATATYPE.equals(entityType);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isBuiltIn() {try{__CLR4_5_222j22jlviclf9f.R.inc(2719);
        __CLR4_5_222j22jlviclf9f.R.inc(2720);return true;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isOWLClass() {try{__CLR4_5_222j22jlviclf9f.R.inc(2721);
        __CLR4_5_222j22jlviclf9f.R.inc(2722);return false;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public OWLClass asOWLClass() {try{__CLR4_5_222j22jlviclf9f.R.inc(2723);
        __CLR4_5_222j22jlviclf9f.R.inc(2724);throw new UnsupportedOperationException("Not an OWLClass");
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isOWLObjectProperty() {try{__CLR4_5_222j22jlviclf9f.R.inc(2725);
        __CLR4_5_222j22jlviclf9f.R.inc(2726);return false;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public OWLObjectProperty asOWLObjectProperty() {try{__CLR4_5_222j22jlviclf9f.R.inc(2727);
        __CLR4_5_222j22jlviclf9f.R.inc(2728);throw new UnsupportedOperationException("Not an OWLObjectProperty");
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isOWLDataProperty() {try{__CLR4_5_222j22jlviclf9f.R.inc(2729);
        __CLR4_5_222j22jlviclf9f.R.inc(2730);return false;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public OWLDataProperty asOWLDataProperty() {try{__CLR4_5_222j22jlviclf9f.R.inc(2731);
        __CLR4_5_222j22jlviclf9f.R.inc(2732);throw new UnsupportedOperationException("Not an OWLDataProperty");
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isOWLNamedIndividual() {try{__CLR4_5_222j22jlviclf9f.R.inc(2733);
        __CLR4_5_222j22jlviclf9f.R.inc(2734);return false;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual asOWLNamedIndividual() {try{__CLR4_5_222j22jlviclf9f.R.inc(2735);
        __CLR4_5_222j22jlviclf9f.R.inc(2736);throw new UnsupportedOperationException("Not an OWLNamedIndividual");
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isOWLDatatype() {try{__CLR4_5_222j22jlviclf9f.R.inc(2737);
        __CLR4_5_222j22jlviclf9f.R.inc(2738);return true;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isOWLAnnotationProperty() {try{__CLR4_5_222j22jlviclf9f.R.inc(2739);
        __CLR4_5_222j22jlviclf9f.R.inc(2740);return false;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty asOWLAnnotationProperty() {try{__CLR4_5_222j22jlviclf9f.R.inc(2741);
        __CLR4_5_222j22jlviclf9f.R.inc(2742);throw new UnsupportedOperationException("Not an OWLAnnotationProperty");
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public String toStringID() {try{__CLR4_5_222j22jlviclf9f.R.inc(2743);
        __CLR4_5_222j22jlviclf9f.R.inc(2744);return owl2Datatype.getIRI().toString();
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_222j22jlviclf9f.R.inc(2745);
        __CLR4_5_222j22jlviclf9f.R.inc(2746);return toStringID();
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public void accept(OWLEntityVisitor visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2747);
        __CLR4_5_222j22jlviclf9f.R.inc(2748);visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLEntityVisitorEx<O> visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2749);
        __CLR4_5_222j22jlviclf9f.R.inc(2750);return visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_222j22jlviclf9f.R.inc(2751);
        __CLR4_5_222j22jlviclf9f.R.inc(2752);return owl2Datatype.getIRI();
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public void accept(OWLNamedObjectVisitor visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2753);
        __CLR4_5_222j22jlviclf9f.R.inc(2754);visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2755);
        __CLR4_5_222j22jlviclf9f.R.inc(2756);visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2757);
        __CLR4_5_222j22jlviclf9f.R.inc(2758);return visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLNamedObjectVisitorEx<O> visitor) {try{__CLR4_5_222j22jlviclf9f.R.inc(2759);
        __CLR4_5_222j22jlviclf9f.R.inc(2760);return visitor.visit(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_222j22jlviclf9f.R.inc(2761);
        __CLR4_5_222j22jlviclf9f.R.inc(2762);if ((((obj == this)&&(__CLR4_5_222j22jlviclf9f.R.iget(2763)!=0|true))||(__CLR4_5_222j22jlviclf9f.R.iget(2764)==0&false))) {{
            __CLR4_5_222j22jlviclf9f.R.inc(2765);return true;
        }
        }__CLR4_5_222j22jlviclf9f.R.inc(2766);if ((((!(obj instanceof OWLDatatype))&&(__CLR4_5_222j22jlviclf9f.R.iget(2767)!=0|true))||(__CLR4_5_222j22jlviclf9f.R.iget(2768)==0&false))) {{
            __CLR4_5_222j22jlviclf9f.R.inc(2769);return false;
        }
        }__CLR4_5_222j22jlviclf9f.R.inc(2770);OWLDatatype other = (OWLDatatype) obj;
        __CLR4_5_222j22jlviclf9f.R.inc(2771);return owl2Datatype.getIRI().equals(other.getIRI());
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getSignature() {try{__CLR4_5_222j22jlviclf9f.R.inc(2772);
        __CLR4_5_222j22jlviclf9f.R.inc(2773);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(Collections.<OWLEntity> singleton(this));
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(OWLEntity owlEntity) {try{__CLR4_5_222j22jlviclf9f.R.inc(2774);
        __CLR4_5_222j22jlviclf9f.R.inc(2775);return equals(owlEntity);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {try{__CLR4_5_222j22jlviclf9f.R.inc(2776);
        __CLR4_5_222j22jlviclf9f.R.inc(2777);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(CollectionFactory
            .<OWLAnonymousIndividual> emptySet());
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public Set<OWLClass> getClassesInSignature() {try{__CLR4_5_222j22jlviclf9f.R.inc(2778);
        __CLR4_5_222j22jlviclf9f.R.inc(2779);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(CollectionFactory.<OWLClass> emptySet());
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public Set<OWLDataProperty> getDataPropertiesInSignature() {try{__CLR4_5_222j22jlviclf9f.R.inc(2780);
        __CLR4_5_222j22jlviclf9f.R.inc(2781);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(CollectionFactory
            .<OWLDataProperty> emptySet());
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public Set<OWLObjectProperty> getObjectPropertiesInSignature() {try{__CLR4_5_222j22jlviclf9f.R.inc(2782);
        __CLR4_5_222j22jlviclf9f.R.inc(2783);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(CollectionFactory
            .<OWLObjectProperty> emptySet());
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature() {try{__CLR4_5_222j22jlviclf9f.R.inc(2784);
        __CLR4_5_222j22jlviclf9f.R.inc(2785);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(CollectionFactory
            .<OWLAnnotationProperty> emptySet());
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public Set<OWLNamedIndividual> getIndividualsInSignature() {try{__CLR4_5_222j22jlviclf9f.R.inc(2786);
        __CLR4_5_222j22jlviclf9f.R.inc(2787);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(CollectionFactory
            .<OWLNamedIndividual> emptySet());
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public Set<OWLDatatype> getDatatypesInSignature() {try{__CLR4_5_222j22jlviclf9f.R.inc(2788);
        __CLR4_5_222j22jlviclf9f.R.inc(2789);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(Collections.singleton((OWLDatatype) this));
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> getNestedClassExpressions() {try{__CLR4_5_222j22jlviclf9f.R.inc(2790);
        __CLR4_5_222j22jlviclf9f.R.inc(2791);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(CollectionFactory
            .<OWLClassExpression> emptySet());
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_222j22jlviclf9f.R.inc(2792);
        __CLR4_5_222j22jlviclf9f.R.inc(2793);return owl2Datatype == RDF_PLAIN_LITERAL;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public boolean isBottomEntity() {try{__CLR4_5_222j22jlviclf9f.R.inc(2794);
        __CLR4_5_222j22jlviclf9f.R.inc(2795);return false;
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public int compareTo(OWLObject o) {try{__CLR4_5_222j22jlviclf9f.R.inc(2796);
        __CLR4_5_222j22jlviclf9f.R.inc(2797);if ((((!(o instanceof OWLDatatype))&&(__CLR4_5_222j22jlviclf9f.R.iget(2798)!=0|true))||(__CLR4_5_222j22jlviclf9f.R.iget(2799)==0&false))) {{
            __CLR4_5_222j22jlviclf9f.R.inc(2800);OWLObjectTypeIndexProvider provider = new OWLObjectTypeIndexProvider();
            __CLR4_5_222j22jlviclf9f.R.inc(2801);return provider.getTypeIndex(o);
        }
        }__CLR4_5_222j22jlviclf9f.R.inc(2802);OWLDatatype other = (OWLDatatype) o;
        __CLR4_5_222j22jlviclf9f.R.inc(2803);return getIRI().compareTo(other.getIRI());
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_222j22jlviclf9f.R.inc(2804);
        __CLR4_5_222j22jlviclf9f.R.inc(2805);return HashCode.hashCode(this);
    }finally{__CLR4_5_222j22jlviclf9f.R.flushNeeded();}}
}
