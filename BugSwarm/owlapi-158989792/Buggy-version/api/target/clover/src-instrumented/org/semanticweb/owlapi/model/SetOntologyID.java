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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.change.SetOntologyIDData;
import org.semanticweb.owlapi.util.CollectionFactory;

import com.google.common.base.Optional;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public class SetOntologyID extends OWLOntologyChange {public static class __CLR4_5_22gh2ghlvickn7l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,3233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLOntologyID ontologyID;
    @Nonnull
    private final OWLOntologyID newOntologyID;

    /**
     * Creates a set ontology id change, which will set the ontology id to the
     * new one.
     * 
     * @param ont
     *        The ontology whose id is to be changed
     * @param ontologyID
     *        The ontology ID
     */
    public SetOntologyID(@Nonnull OWLOntology ont, @Nonnull OWLOntologyID ontologyID) {
        super(ont);__CLR4_5_22gh2ghlvickn7l.R.inc(3186);try{__CLR4_5_22gh2ghlvickn7l.R.inc(3185);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3187);this.ontologyID = checkNotNull(ont.getOntologyID(), "ontology id cannot be null");
        __CLR4_5_22gh2ghlvickn7l.R.inc(3188);newOntologyID = checkNotNull(ontologyID, "ontology id cannot be null");
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    SetOntologyID(@Nonnull OWLOntology ont, @Nonnull OWLOntologyID ontologyID, @Nonnull OWLOntologyID newOntologyID) {
        super(ont);__CLR4_5_22gh2ghlvickn7l.R.inc(3190);try{__CLR4_5_22gh2ghlvickn7l.R.inc(3189);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3191);this.ontologyID = checkNotNull(ontologyID, "ontology id cannot be null");
        __CLR4_5_22gh2ghlvickn7l.R.inc(3192);this.newOntologyID = checkNotNull(newOntologyID, "ontology id cannot be null");
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    /**
     * Creates a set ontology id change using the ontologyIRI, which will set
     * the ontology id to the new one.
     * 
     * @param ont
     *        The ontology whose id is to be changed
     * @param ontologyIRI
     *        The ontology iri
     */
    public SetOntologyID(@Nonnull OWLOntology ont, @Nonnull IRI ontologyIRI) {
        this(ont, new OWLOntologyID(Optional.of(ontologyIRI), Optional.<IRI> absent()));__CLR4_5_22gh2ghlvickn7l.R.inc(3194);try{__CLR4_5_22gh2ghlvickn7l.R.inc(3193);
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public SetOntologyIDData getChangeData() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3195);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3196);return new SetOntologyIDData(newOntologyID);
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getSignature() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3197);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3198);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(CollectionFactory.<OWLEntity> emptySet());
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public boolean isImportChange() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3199);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3200);return false;
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public boolean isAxiomChange() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3201);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3202);return false;
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public boolean isAddAxiom() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3203);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3204);return false;
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public OWLAxiom getAxiom() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3205);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3206);throw new UnsupportedOperationException("This is an ontology id change, not an axiom change: " + this);
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    /**
     * Gets the original ID of the ontology whose URI was changed.
     * 
     * @return The original ID
     */
    @Nonnull
    public OWLOntologyID getOriginalOntologyID() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3207);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3208);return ontologyID;
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    /**
     * @return the new URI - i.e. the URI of the ontology after the change was
     *         applied.
     */
    @Nonnull
    public OWLOntologyID getNewOntologyID() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3209);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3210);return newOntologyID;
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public void accept(OWLOntologyChangeVisitor visitor) {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3211);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3212);visitor.visit(this);
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLOntologyChangeVisitorEx<O> visitor) {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3213);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3214);return visitor.visit(this);
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3215);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3216);return String.format("SetOntologyID(%s OntologyID(%s))", newOntologyID, ontologyID);
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3217);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3218);return 57 + ontologyID.hashCode() + newOntologyID.hashCode() * 3;
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3219);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3220);if ((((obj == this)&&(__CLR4_5_22gh2ghlvickn7l.R.iget(3221)!=0|true))||(__CLR4_5_22gh2ghlvickn7l.R.iget(3222)==0&false))) {{
            __CLR4_5_22gh2ghlvickn7l.R.inc(3223);return true;
        }
        }__CLR4_5_22gh2ghlvickn7l.R.inc(3224);if ((((!(obj instanceof SetOntologyID))&&(__CLR4_5_22gh2ghlvickn7l.R.iget(3225)!=0|true))||(__CLR4_5_22gh2ghlvickn7l.R.iget(3226)==0&false))) {{
            __CLR4_5_22gh2ghlvickn7l.R.inc(3227);return false;
        }
        }__CLR4_5_22gh2ghlvickn7l.R.inc(3228);SetOntologyID change = (SetOntologyID) obj;
        __CLR4_5_22gh2ghlvickn7l.R.inc(3229);return change.ontologyID.equals(ontologyID) && change.newOntologyID.equals(newOntologyID);
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}

    @Override
    public OWLOntologyChange reverseChange() {try{__CLR4_5_22gh2ghlvickn7l.R.inc(3230);
        __CLR4_5_22gh2ghlvickn7l.R.inc(3231);SetOntologyID setOntologyID = new SetOntologyID(getOntology(), newOntologyID, getOntology().getOntologyID());
        __CLR4_5_22gh2ghlvickn7l.R.inc(3232);return setOntologyID;
    }finally{__CLR4_5_22gh2ghlvickn7l.R.flushNeeded();}}
}
