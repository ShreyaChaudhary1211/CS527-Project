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

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;

import com.google.common.base.Optional;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public class OWLAnonymousIndividualImpl extends OWLIndividualImpl implements OWLAnonymousIndividual {public static class __CLR4_5_22gr2grlviclfeb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,3251,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final NodeID nodeId;

    @Override
    protected int index() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3195);
        __CLR4_5_22gr2grlviclfeb.R.inc(3196);return OWLObjectTypeIndexProvider.ANON_INDIVIDUAL;
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    /**
     * @param nodeID
     *        node id
     */
    public OWLAnonymousIndividualImpl(@Nonnull NodeID nodeID) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3197);
        __CLR4_5_22gr2grlviclfeb.R.inc(3198);nodeId = checkNotNull(nodeID, "nodeID cannot be null");
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public NodeID getID() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3199);
        __CLR4_5_22gr2grlviclfeb.R.inc(3200);return nodeId;
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public String toStringID() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3201);
        __CLR4_5_22gr2grlviclfeb.R.inc(3202);return nodeId.getID();
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public boolean isNamed() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3203);
        __CLR4_5_22gr2grlviclfeb.R.inc(3204);return false;
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3205);
        __CLR4_5_22gr2grlviclfeb.R.inc(3206);return true;
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnonymousIndividual asOWLAnonymousIndividual() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3207);
        __CLR4_5_22gr2grlviclfeb.R.inc(3208);return this;
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual asOWLNamedIndividual() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3209);
        __CLR4_5_22gr2grlviclfeb.R.inc(3210);throw new OWLRuntimeException("Not a named individual! This method should only be called on named individuals");
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3211);
        __CLR4_5_22gr2grlviclfeb.R.inc(3212);OWLAnonymousIndividual other = (OWLAnonymousIndividual) object;
        __CLR4_5_22gr2grlviclfeb.R.inc(3213);return nodeId.compareTo(other.getID());
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3214);
        __CLR4_5_22gr2grlviclfeb.R.inc(3215);visitor.visit(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3216);
        __CLR4_5_22gr2grlviclfeb.R.inc(3217);return visitor.visit(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public void accept(OWLIndividualVisitor visitor) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3218);
        __CLR4_5_22gr2grlviclfeb.R.inc(3219);visitor.visit(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLIndividualVisitorEx<O> visitor) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3220);
        __CLR4_5_22gr2grlviclfeb.R.inc(3221);return visitor.visit(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public void accept(OWLAnnotationValueVisitor visitor) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3222);
        __CLR4_5_22gr2grlviclfeb.R.inc(3223);visitor.visit(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAnnotationValueVisitorEx<O> visitor) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3224);
        __CLR4_5_22gr2grlviclfeb.R.inc(3225);return visitor.visit(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public void accept(OWLAnnotationSubjectVisitor visitor) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3226);
        __CLR4_5_22gr2grlviclfeb.R.inc(3227);visitor.visit(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public <E> E accept(OWLAnnotationSubjectVisitorEx<E> visitor) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3228);
        __CLR4_5_22gr2grlviclfeb.R.inc(3229);return visitor.visit(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public Optional<IRI> asIRI() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3230);
        __CLR4_5_22gr2grlviclfeb.R.inc(3231);return Optional.absent();
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public Optional<OWLAnonymousIndividual> asAnonymousIndividual() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3232);
        __CLR4_5_22gr2grlviclfeb.R.inc(3233);return Optional.<OWLAnonymousIndividual> of(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public Optional<OWLLiteral> asLiteral() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3234);
        __CLR4_5_22gr2grlviclfeb.R.inc(3235);return Optional.absent();
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3236);
        __CLR4_5_22gr2grlviclfeb.R.inc(3237);if ((((obj == this)&&(__CLR4_5_22gr2grlviclfeb.R.iget(3238)!=0|true))||(__CLR4_5_22gr2grlviclfeb.R.iget(3239)==0&false))) {{
            __CLR4_5_22gr2grlviclfeb.R.inc(3240);return true;
        }
        }__CLR4_5_22gr2grlviclfeb.R.inc(3241);if ((((!(obj instanceof OWLAnonymousIndividual))&&(__CLR4_5_22gr2grlviclfeb.R.iget(3242)!=0|true))||(__CLR4_5_22gr2grlviclfeb.R.iget(3243)==0&false))) {{
            __CLR4_5_22gr2grlviclfeb.R.inc(3244);return false;
        }
        }__CLR4_5_22gr2grlviclfeb.R.inc(3245);return nodeId.equals(((OWLAnonymousIndividual) obj).getID());
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_22gr2grlviclfeb.R.inc(3246);
        __CLR4_5_22gr2grlviclfeb.R.inc(3247);return nodeId.hashCode();
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3248);}finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_22gr2grlviclfeb.R.inc(3249);
        __CLR4_5_22gr2grlviclfeb.R.inc(3250);anons.add(this);
    }finally{__CLR4_5_22gr2grlviclfeb.R.flushNeeded();}}
}
