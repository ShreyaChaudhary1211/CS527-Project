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

import java.io.Serializable;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.ClassExpressionType;
import org.semanticweb.owlapi.model.EntityType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLClassExpressionVisitor;
import org.semanticweb.owlapi.model.OWLClassExpressionVisitorEx;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEntityVisitor;
import org.semanticweb.owlapi.model.OWLEntityVisitorEx;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNamedObjectVisitor;
import org.semanticweb.owlapi.model.OWLNamedObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLClassImpl extends OWLClassExpressionImpl implements OWLClass,
        Serializable {public static class __CLR4_5_22sh2shlviclfgl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,3716,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    @Override
    protected int index() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3617);
        __CLR4_5_22sh2shlviclfgl.R.inc(3618);return OWLObjectTypeIndexProvider.OWL_CLASS;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Nonnull
    private final IRI iri;
    private final boolean isThing;
    private final boolean isNothing;

    /**
     * @param iri
     *        class iri
     */
    public OWLClassImpl(@Nonnull IRI iri) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3619);
        __CLR4_5_22sh2shlviclfgl.R.inc(3620);this.iri = checkNotNull(iri, "iri cannot be null");
        __CLR4_5_22sh2shlviclfgl.R.inc(3621);isThing = getIRI().equals(OWLRDFVocabulary.OWL_THING.getIRI());
        __CLR4_5_22sh2shlviclfgl.R.inc(3622);isNothing = getIRI().equals(OWLRDFVocabulary.OWL_NOTHING.getIRI());
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3623);
        __CLR4_5_22sh2shlviclfgl.R.inc(3624);return isOWLThing();
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isBottomEntity() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3625);
        __CLR4_5_22sh2shlviclfgl.R.inc(3626);return isOWLNothing();
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public ClassExpressionType getClassExpressionType() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3627);
        __CLR4_5_22sh2shlviclfgl.R.inc(3628);return ClassExpressionType.OWL_CLASS;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLClassExpression getObjectComplementOf() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3629);
        __CLR4_5_22sh2shlviclfgl.R.inc(3630);return new OWLObjectComplementOfImpl(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public EntityType<?> getEntityType() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3631);
        __CLR4_5_22sh2shlviclfgl.R.inc(3632);return EntityType.CLASS;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isType(EntityType<?> entityType) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3633);
        __CLR4_5_22sh2shlviclfgl.R.inc(3634);return getEntityType().equals(entityType);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public String toStringID() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3635);
        __CLR4_5_22sh2shlviclfgl.R.inc(3636);return iri.toString();
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3637);
        __CLR4_5_22sh2shlviclfgl.R.inc(3638);return iri;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isBuiltIn() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3639);
        __CLR4_5_22sh2shlviclfgl.R.inc(3640);return isOWLThing() || isOWLNothing();
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3641);
        __CLR4_5_22sh2shlviclfgl.R.inc(3642);return false;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isClassExpressionLiteral() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3643);
        __CLR4_5_22sh2shlviclfgl.R.inc(3644);return true;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public OWLClass asOWLClass() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3645);
        __CLR4_5_22sh2shlviclfgl.R.inc(3646);return this;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isOWLThing() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3647);
        __CLR4_5_22sh2shlviclfgl.R.inc(3648);return isThing;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isOWLNothing() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3649);
        __CLR4_5_22sh2shlviclfgl.R.inc(3650);return isNothing;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public OWLClassExpression getNNF() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3651);
        __CLR4_5_22sh2shlviclfgl.R.inc(3652);return this;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> asConjunctSet() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3653);
        __CLR4_5_22sh2shlviclfgl.R.inc(3654);return CollectionFactory.createSet((OWLClassExpression) this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean containsConjunct(OWLClassExpression ce) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3655);
        __CLR4_5_22sh2shlviclfgl.R.inc(3656);return ce.equals(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> asDisjunctSet() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3657);
        __CLR4_5_22sh2shlviclfgl.R.inc(3658);return CollectionFactory.createSet((OWLClassExpression) this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public OWLClassExpression getComplementNNF() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3659);
        __CLR4_5_22sh2shlviclfgl.R.inc(3660);return new OWLObjectComplementOfImpl(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public OWLDataProperty asOWLDataProperty() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3661);
        __CLR4_5_22sh2shlviclfgl.R.inc(3662);throw new OWLRuntimeException("Not a data property!");
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public OWLDatatype asOWLDatatype() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3663);
        __CLR4_5_22sh2shlviclfgl.R.inc(3664);throw new OWLRuntimeException("Not a data type!");
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual asOWLNamedIndividual() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3665);
        __CLR4_5_22sh2shlviclfgl.R.inc(3666);throw new OWLRuntimeException("Not an individual!");
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public OWLObjectProperty asOWLObjectProperty() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3667);
        __CLR4_5_22sh2shlviclfgl.R.inc(3668);throw new OWLRuntimeException("Not an object property");
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isOWLClass() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3669);
        __CLR4_5_22sh2shlviclfgl.R.inc(3670);return true;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isOWLDataProperty() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3671);
        __CLR4_5_22sh2shlviclfgl.R.inc(3672);return false;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isOWLDatatype() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3673);
        __CLR4_5_22sh2shlviclfgl.R.inc(3674);return false;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isOWLNamedIndividual() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3675);
        __CLR4_5_22sh2shlviclfgl.R.inc(3676);return false;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isOWLObjectProperty() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3677);
        __CLR4_5_22sh2shlviclfgl.R.inc(3678);return false;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty asOWLAnnotationProperty() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3679);
        __CLR4_5_22sh2shlviclfgl.R.inc(3680);throw new OWLRuntimeException("Not an annotation property");
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean isOWLAnnotationProperty() {try{__CLR4_5_22sh2shlviclfgl.R.inc(3681);
        __CLR4_5_22sh2shlviclfgl.R.inc(3682);return false;
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3683);
        __CLR4_5_22sh2shlviclfgl.R.inc(3684);if ((((obj == this)&&(__CLR4_5_22sh2shlviclfgl.R.iget(3685)!=0|true))||(__CLR4_5_22sh2shlviclfgl.R.iget(3686)==0&false))) {{
            __CLR4_5_22sh2shlviclfgl.R.inc(3687);return true;
        }
        }__CLR4_5_22sh2shlviclfgl.R.inc(3688);if ((((!(obj instanceof OWLClass))&&(__CLR4_5_22sh2shlviclfgl.R.iget(3689)!=0|true))||(__CLR4_5_22sh2shlviclfgl.R.iget(3690)==0&false))) {{
            __CLR4_5_22sh2shlviclfgl.R.inc(3691);return false;
        }
        }__CLR4_5_22sh2shlviclfgl.R.inc(3692);IRI otherIRI = ((OWLClass) obj).getIRI();
        __CLR4_5_22sh2shlviclfgl.R.inc(3693);return otherIRI.equals(iri);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public void accept(OWLClassExpressionVisitor visitor) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3694);
        __CLR4_5_22sh2shlviclfgl.R.inc(3695);visitor.visit(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public void accept(OWLEntityVisitor visitor) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3696);
        __CLR4_5_22sh2shlviclfgl.R.inc(3697);visitor.visit(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3698);
        __CLR4_5_22sh2shlviclfgl.R.inc(3699);visitor.visit(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public void accept(OWLNamedObjectVisitor visitor) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3700);
        __CLR4_5_22sh2shlviclfgl.R.inc(3701);visitor.visit(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLNamedObjectVisitorEx<O> visitor) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3702);
        __CLR4_5_22sh2shlviclfgl.R.inc(3703);return visitor.visit(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLEntityVisitorEx<O> visitor) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3704);
        __CLR4_5_22sh2shlviclfgl.R.inc(3705);return visitor.visit(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3706);
        __CLR4_5_22sh2shlviclfgl.R.inc(3707);return visitor.visit(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3708);
        __CLR4_5_22sh2shlviclfgl.R.inc(3709);return visitor.visit(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3710);
        __CLR4_5_22sh2shlviclfgl.R.inc(3711);OWLClass other = (OWLClass) object;
        __CLR4_5_22sh2shlviclfgl.R.inc(3712);return iri.compareTo(other.getIRI());
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3713);
        __CLR4_5_22sh2shlviclfgl.R.inc(3714);entities.add(this);
    }finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_22sh2shlviclfgl.R.inc(3715);}finally{__CLR4_5_22sh2shlviclfgl.R.flushNeeded();}}
}
