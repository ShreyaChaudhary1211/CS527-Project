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

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;

import java.util.Set;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public class OWLNamedIndividualImpl extends OWLIndividualImpl implements
        OWLNamedIndividual {public static class __CLR4_5_26i06i0lviclg3w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,8505,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final IRI iri;

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8424);
        __CLR4_5_26i06i0lviclg3w.R.inc(8425);entities.add(this);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8426);}finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    protected int index() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8427);
        __CLR4_5_26i06i0lviclg3w.R.inc(8428);return OWLObjectTypeIndexProvider.INDIVIDUAL;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    /**
     * @param iri
     *        the iri
     */
    public OWLNamedIndividualImpl(@Nonnull IRI iri) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8429);
        __CLR4_5_26i06i0lviclg3w.R.inc(8430);this.iri = checkNotNull(iri, "iri cannot be null");
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isNamed() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8431);
        __CLR4_5_26i06i0lviclg3w.R.inc(8432);return true;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public EntityType<?> getEntityType() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8433);
        __CLR4_5_26i06i0lviclg3w.R.inc(8434);return EntityType.NAMED_INDIVIDUAL;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isType(EntityType<?> entityType) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8435);
        __CLR4_5_26i06i0lviclg3w.R.inc(8436);return getEntityType().equals(entityType);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public String toStringID() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8437);
        __CLR4_5_26i06i0lviclg3w.R.inc(8438);return iri.toString();
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isOWLNamedIndividual() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8439);
        __CLR4_5_26i06i0lviclg3w.R.inc(8440);return true;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8441);
        __CLR4_5_26i06i0lviclg3w.R.inc(8442);return iri;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8443);
        __CLR4_5_26i06i0lviclg3w.R.inc(8444);return false;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual asOWLNamedIndividual() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8445);
        __CLR4_5_26i06i0lviclg3w.R.inc(8446);return this;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public OWLAnonymousIndividual asOWLAnonymousIndividual() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8447);
        __CLR4_5_26i06i0lviclg3w.R.inc(8448);throw new OWLRuntimeException("Not an anonymous individual");
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty asOWLAnnotationProperty() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8449);
        __CLR4_5_26i06i0lviclg3w.R.inc(8450);throw new OWLRuntimeException("Not an annotation property");
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isOWLAnnotationProperty() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8451);
        __CLR4_5_26i06i0lviclg3w.R.inc(8452);return false;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8453);
        __CLR4_5_26i06i0lviclg3w.R.inc(8454);if ((((obj == null)&&(__CLR4_5_26i06i0lviclg3w.R.iget(8455)!=0|true))||(__CLR4_5_26i06i0lviclg3w.R.iget(8456)==0&false))) {{
            __CLR4_5_26i06i0lviclg3w.R.inc(8457);return false;
        }
        }__CLR4_5_26i06i0lviclg3w.R.inc(8458);if ((((this == obj)&&(__CLR4_5_26i06i0lviclg3w.R.iget(8459)!=0|true))||(__CLR4_5_26i06i0lviclg3w.R.iget(8460)==0&false))) {{
            __CLR4_5_26i06i0lviclg3w.R.inc(8461);return true;
        }
        }__CLR4_5_26i06i0lviclg3w.R.inc(8462);if ((((!(obj instanceof OWLNamedIndividual))&&(__CLR4_5_26i06i0lviclg3w.R.iget(8463)!=0|true))||(__CLR4_5_26i06i0lviclg3w.R.iget(8464)==0&false))) {{
            __CLR4_5_26i06i0lviclg3w.R.inc(8465);return false;
        }
        }__CLR4_5_26i06i0lviclg3w.R.inc(8466);IRI otherIRI = ((OWLNamedIndividual) obj).getIRI();
        __CLR4_5_26i06i0lviclg3w.R.inc(8467);return otherIRI.equals(iri);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8468);
        __CLR4_5_26i06i0lviclg3w.R.inc(8469);OWLNamedIndividual other = (OWLNamedIndividual) object;
        __CLR4_5_26i06i0lviclg3w.R.inc(8470);return iri.compareTo(other.getIRI());
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8471);
        __CLR4_5_26i06i0lviclg3w.R.inc(8472);visitor.visit(this);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8473);
        __CLR4_5_26i06i0lviclg3w.R.inc(8474);return visitor.visit(this);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public void accept(OWLEntityVisitor visitor) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8475);
        __CLR4_5_26i06i0lviclg3w.R.inc(8476);visitor.visit(this);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLEntityVisitorEx<O> visitor) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8477);
        __CLR4_5_26i06i0lviclg3w.R.inc(8478);return visitor.visit(this);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public void accept(OWLNamedObjectVisitor visitor) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8479);
        __CLR4_5_26i06i0lviclg3w.R.inc(8480);visitor.visit(this);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLNamedObjectVisitorEx<O> visitor) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8481);
        __CLR4_5_26i06i0lviclg3w.R.inc(8482);return visitor.visit(this);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public void accept(OWLIndividualVisitor visitor) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8483);
        __CLR4_5_26i06i0lviclg3w.R.inc(8484);visitor.visit(this);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLIndividualVisitorEx<O> visitor) {try{__CLR4_5_26i06i0lviclg3w.R.inc(8485);
        __CLR4_5_26i06i0lviclg3w.R.inc(8486);return visitor.visit(this);
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public OWLClass asOWLClass() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8487);
        __CLR4_5_26i06i0lviclg3w.R.inc(8488);throw new OWLRuntimeException("Not an OWLClass!");
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public OWLDataProperty asOWLDataProperty() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8489);
        __CLR4_5_26i06i0lviclg3w.R.inc(8490);throw new OWLRuntimeException("Not a data property!");
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public OWLDatatype asOWLDatatype() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8491);
        __CLR4_5_26i06i0lviclg3w.R.inc(8492);throw new OWLRuntimeException("Not a data type!");
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public OWLObjectProperty asOWLObjectProperty() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8493);
        __CLR4_5_26i06i0lviclg3w.R.inc(8494);throw new OWLRuntimeException("Not an object property");
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isOWLClass() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8495);
        __CLR4_5_26i06i0lviclg3w.R.inc(8496);return false;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isOWLDataProperty() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8497);
        __CLR4_5_26i06i0lviclg3w.R.inc(8498);return false;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isOWLDatatype() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8499);
        __CLR4_5_26i06i0lviclg3w.R.inc(8500);return false;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isOWLObjectProperty() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8501);
        __CLR4_5_26i06i0lviclg3w.R.inc(8502);return false;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}

    @Override
    public boolean isBuiltIn() {try{__CLR4_5_26i06i0lviclg3w.R.inc(8503);
        __CLR4_5_26i06i0lviclg3w.R.inc(8504);return false;
    }finally{__CLR4_5_26i06i0lviclg3w.R.flushNeeded();}}
}
