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

import org.semanticweb.owlapi.model.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLObjectPropertyImpl extends OWLObjectPropertyExpressionImpl
        implements OWLObjectProperty {public static class __CLR4_5_27gw7gwlviclgez{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,9772,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final IRI iri;
    private final boolean builtin;

    @Override
    protected int index() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9680);
        __CLR4_5_27gw7gwlviclgez.R.inc(9681);return OWLObjectTypeIndexProvider.OBJECT_PROPERTY;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    /**
     * @param iri
     *        property iri
     */
    public OWLObjectPropertyImpl(@Nonnull IRI iri) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9682);
        __CLR4_5_27gw7gwlviclgez.R.inc(9683);this.iri = checkNotNull(iri, "iri cannot be null");
        __CLR4_5_27gw7gwlviclgez.R.inc(9684);builtin = iri.equals(OWLRDFVocabulary.OWL_TOP_OBJECT_PROPERTY.getIRI())
                || iri.equals(OWLRDFVocabulary.OWL_BOTTOM_OBJECT_PROPERTY
                        .getIRI());
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectInverseOf getInverseProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9685);
        __CLR4_5_27gw7gwlviclgez.R.inc(9686);return new OWLObjectInverseOfImpl(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectProperty getNamedProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9687);
        __CLR4_5_27gw7gwlviclgez.R.inc(9688);return this;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9689);
        __CLR4_5_27gw7gwlviclgez.R.inc(9690);entities.add(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9691);}finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9692);
        __CLR4_5_27gw7gwlviclgez.R.inc(9693);return isOWLTopObjectProperty();
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isBottomEntity() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9694);
        __CLR4_5_27gw7gwlviclgez.R.inc(9695);return isOWLBottomObjectProperty();
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public EntityType<?> getEntityType() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9696);
        __CLR4_5_27gw7gwlviclgez.R.inc(9697);return EntityType.OBJECT_PROPERTY;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isType(EntityType<?> entityType) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9698);
        __CLR4_5_27gw7gwlviclgez.R.inc(9699);return getEntityType().equals(entityType);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public String toStringID() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9700);
        __CLR4_5_27gw7gwlviclgez.R.inc(9701);return iri.toString();
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9702);
        __CLR4_5_27gw7gwlviclgez.R.inc(9703);return iri;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isBuiltIn() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9704);
        __CLR4_5_27gw7gwlviclgez.R.inc(9705);return builtin;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9706);
        __CLR4_5_27gw7gwlviclgez.R.inc(9707);if ((((this == obj)&&(__CLR4_5_27gw7gwlviclgez.R.iget(9708)!=0|true))||(__CLR4_5_27gw7gwlviclgez.R.iget(9709)==0&false))) {{
            __CLR4_5_27gw7gwlviclgez.R.inc(9710);return true;
        }
        }__CLR4_5_27gw7gwlviclgez.R.inc(9711);if ((((!super.equals(obj))&&(__CLR4_5_27gw7gwlviclgez.R.iget(9712)!=0|true))||(__CLR4_5_27gw7gwlviclgez.R.iget(9713)==0&false))) {{
            __CLR4_5_27gw7gwlviclgez.R.inc(9714);return false;
        }
        }__CLR4_5_27gw7gwlviclgez.R.inc(9715);if ((((!(obj instanceof OWLObjectProperty))&&(__CLR4_5_27gw7gwlviclgez.R.iget(9716)!=0|true))||(__CLR4_5_27gw7gwlviclgez.R.iget(9717)==0&false))) {{
            __CLR4_5_27gw7gwlviclgez.R.inc(9718);return false;
        }
        }__CLR4_5_27gw7gwlviclgez.R.inc(9719);return ((OWLObjectProperty) obj).getIRI().equals(iri);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public void accept(OWLEntityVisitor visitor) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9720);
        __CLR4_5_27gw7gwlviclgez.R.inc(9721);visitor.visit(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public void accept(OWLPropertyExpressionVisitor visitor) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9722);
        __CLR4_5_27gw7gwlviclgez.R.inc(9723);visitor.visit(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9724);
        __CLR4_5_27gw7gwlviclgez.R.inc(9725);visitor.visit(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public void accept(OWLNamedObjectVisitor visitor) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9726);
        __CLR4_5_27gw7gwlviclgez.R.inc(9727);visitor.visit(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLNamedObjectVisitorEx<O> visitor) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9728);
        __CLR4_5_27gw7gwlviclgez.R.inc(9729);return visitor.visit(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLEntityVisitorEx<O> visitor) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9730);
        __CLR4_5_27gw7gwlviclgez.R.inc(9731);return visitor.visit(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLPropertyExpressionVisitorEx<O> visitor) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9732);
        __CLR4_5_27gw7gwlviclgez.R.inc(9733);return visitor.visit(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9734);
        __CLR4_5_27gw7gwlviclgez.R.inc(9735);return visitor.visit(this);
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9736);
        __CLR4_5_27gw7gwlviclgez.R.inc(9737);return false;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public OWLObjectProperty asOWLObjectProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9738);
        __CLR4_5_27gw7gwlviclgez.R.inc(9739);return this;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public OWLDataProperty asOWLDataProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9740);
        __CLR4_5_27gw7gwlviclgez.R.inc(9741);throw new OWLRuntimeException("Not a data property!");
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public OWLDatatype asOWLDatatype() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9742);
        __CLR4_5_27gw7gwlviclgez.R.inc(9743);throw new OWLRuntimeException("Not a data type!");
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual asOWLNamedIndividual() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9744);
        __CLR4_5_27gw7gwlviclgez.R.inc(9745);throw new OWLRuntimeException("Not an individual!");
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public OWLClass asOWLClass() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9746);
        __CLR4_5_27gw7gwlviclgez.R.inc(9747);throw new OWLRuntimeException("Not an OWLClass!");
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLClass() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9748);
        __CLR4_5_27gw7gwlviclgez.R.inc(9749);return false;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLDataProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9750);
        __CLR4_5_27gw7gwlviclgez.R.inc(9751);return false;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLDatatype() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9752);
        __CLR4_5_27gw7gwlviclgez.R.inc(9753);return false;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLNamedIndividual() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9754);
        __CLR4_5_27gw7gwlviclgez.R.inc(9755);return false;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLObjectProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9756);
        __CLR4_5_27gw7gwlviclgez.R.inc(9757);return true;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty asOWLAnnotationProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9758);
        __CLR4_5_27gw7gwlviclgez.R.inc(9759);throw new OWLRuntimeException("Not an annotation property");
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLAnnotationProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9760);
        __CLR4_5_27gw7gwlviclgez.R.inc(9761);return false;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_27gw7gwlviclgez.R.inc(9762);
        __CLR4_5_27gw7gwlviclgez.R.inc(9763);return iri.compareTo(((OWLObjectProperty) object).getIRI());
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLTopObjectProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9764);
        __CLR4_5_27gw7gwlviclgez.R.inc(9765);return iri.equals(OWLRDFVocabulary.OWL_TOP_OBJECT_PROPERTY.getIRI());
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLBottomObjectProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9766);
        __CLR4_5_27gw7gwlviclgez.R.inc(9767);return iri.equals(OWLRDFVocabulary.OWL_BOTTOM_OBJECT_PROPERTY.getIRI());
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLTopDataProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9768);
        __CLR4_5_27gw7gwlviclgez.R.inc(9769);return false;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}

    @Override
    public boolean isOWLBottomDataProperty() {try{__CLR4_5_27gw7gwlviclgez.R.inc(9770);
        __CLR4_5_27gw7gwlviclgez.R.inc(9771);return false;
    }finally{__CLR4_5_27gw7gwlviclgez.R.flushNeeded();}}
}
