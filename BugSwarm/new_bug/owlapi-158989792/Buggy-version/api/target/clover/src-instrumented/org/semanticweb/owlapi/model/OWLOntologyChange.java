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

import java.io.Serializable;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.change.OWLOntologyChangeData;
import org.semanticweb.owlapi.change.OWLOntologyChangeRecord;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class OWLOntologyChange implements HasSignature, Serializable {public static class __CLR4_5_224a24alvickmlo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,2754,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLOntology ont;

    /**
     * @param ont
     *        the ontology to which the change is to be applied
     */
    public OWLOntologyChange(@Nonnull OWLOntology ont) {try{__CLR4_5_224a24alvickmlo.R.inc(2746);
        __CLR4_5_224a24alvickmlo.R.inc(2747);this.ont = checkNotNull(ont, "ontology must not be null");
    }finally{__CLR4_5_224a24alvickmlo.R.flushNeeded();}}

    /**
     * Determines if the change will cause the addition or removal of an axiom
     * from an ontology.
     * 
     * @return {@code true} if the change is an {@code OWLAddAxiomChange} or
     *         {@code OWLRemoveAxiomChange} otherwise {@code false}.
     */
    public abstract boolean isAxiomChange();

    /**
     * Determines if the change will add an axiom to an ontology.
     * 
     * @return {@code true} if the change is an AddAxiom change and it will add
     *         an axiom to an ontology, {@code false} otherwise.
     */
    public abstract boolean isAddAxiom();

    /**
     * Determines if the change will remove an axiom from an ontology.
     * 
     * @return {@code true} if the change is a RemoveAxiom change and it will
     *         remove an axiom from an ontology, {@code false} otherwise.
     */
    public boolean isRemoveAxiom() {try{__CLR4_5_224a24alvickmlo.R.inc(2748);
        __CLR4_5_224a24alvickmlo.R.inc(2749);return isAxiomChange() && !isAddAxiom();
    }finally{__CLR4_5_224a24alvickmlo.R.flushNeeded();}}

    /**
     * If the change is an axiom change (i.e. AddAxiom or RemoveAxiom) this
     * method obtains the axiom.
     * 
     * @return The Axiom if this change is an axiom change
     * @throws IllegalStateException
     *         if the change has no axiom; UnsupportedOperationException If the
     *         change is not an axiom change (check with the
     *         {@code isAxiomChange} method first).
     */
    @Nonnull
    public abstract OWLAxiom getAxiom();

    /**
     * Determines if this change is an import change and hence causes a change
     * to the imports closure of an ontology.
     * 
     * @return {@code true} if this change is an import change, otherwise
     *         {@code false}.
     */
    public abstract boolean isImportChange();

    /**
     * Gets the ontology that the change is/was applied to.
     * 
     * @return The ontology that the change is applicable to
     */
    @Nonnull
    public OWLOntology getOntology() {try{__CLR4_5_224a24alvickmlo.R.inc(2750);
        __CLR4_5_224a24alvickmlo.R.inc(2751);return ont;
    }finally{__CLR4_5_224a24alvickmlo.R.flushNeeded();}}

    /**
     * Gets the data (independent of the ontology) associated with this specific
     * change.
     * 
     * @return The {@link OWLOntologyChangeData} associated with this
     *         {@code OWLOntologyChange}.
     */
    @Nonnull
    public abstract OWLOntologyChangeData getChangeData();

    /**
     * Gets a {@link OWLOntologyChangeRecord} that is derived from this
     * {@code OWLOntologyChange}'s {@link OWLOntologyID} and it's
     * {@link OWLOntologyChangeData}.
     * 
     * @return An {@link OWLOntologyChangeRecord} containing an
     *         {@link OWLOntologyID} equal to the {@link OWLOntologyID} of this
     *         {@code OWLOntologyChange}'s {@link OWLOntology}. Not {@code null}
     *         .
     */
    @Nonnull
    public OWLOntologyChangeRecord getChangeRecord() {try{__CLR4_5_224a24alvickmlo.R.inc(2752);
        __CLR4_5_224a24alvickmlo.R.inc(2753);return new OWLOntologyChangeRecord(ont.getOntologyID(),
            getChangeData());
    }finally{__CLR4_5_224a24alvickmlo.R.flushNeeded();}}

    /**
     * Gets the signature of this ontology change. That is, the set of entities
     * appearing in objects in this change.
     * 
     * @return A set of entities that correspond to the signature of this
     *         object. The set is a copy, changes are not reflected back.
     */
    @Override
    @Nonnull
    public abstract Set<OWLEntity> getSignature();

    /**
     * Accepts a visitor
     * 
     * @param visitor
     *        The visitor
     */
    public abstract void accept(@Nonnull OWLOntologyChangeVisitor visitor);

    /**
     * Accepts a visitor
     * 
     * @param visitor
     *        The visitor
     * @param <O>
     *        visitor return type
     * @return visitor value
     */
    @Nonnull
    public abstract <O> O accept(
        @Nonnull OWLOntologyChangeVisitorEx<O> visitor);

    /**
     * @return the reverse of this change; can be used to create undo changes.
     */
    public abstract OWLOntologyChange reverseChange();
}
