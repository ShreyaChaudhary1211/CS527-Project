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
package org.semanticweb.owlapi.change;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.Serializable;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.UnknownOWLOntologyException;

/**
 * Associates an {@link OWLOntologyID} with ontology-less change data.<br>
 * An {@link OWLOntologyChangeRecord} captures information about an
 * {@link OWLOntologyChange} in a way that does not require a reference to an
 * {@link OWLOntology} object. It does this by referencing an
 * {@link OWLOntologyID} instead of referencing an {@link OWLOntology}. The
 * primary reason for doing this is so that changes can be serialized and logged
 * more easily. It should be kept in mind that {@link OWLOntologyChangeRecord}
 * objects can represent changes for which there might be no in memory
 * representation of a specific {@link OWLOntology}. This is also true if an
 * {@link OWLOntology} object has its {@link OWLOntologyID} changed.<br>
 * An {@link OWLOntologyChange} object contains two important pieces of
 * information:
 * <ol>
 * <li>The {@link OWLOntologyID} that identifies the ontology that the change
 * pertains to.</li>
 * <li>The {@link OWLOntologyChangeData} that describes the change specific
 * data. For each kind of {@link OWLOntologyChange} there is a corresponding
 * {@link OWLOntologyChangeData} class which captures the essential details that
 * pertain to the change. The reason for this separation is that it allows
 * change information to be captured where the context of the change (the
 * ontology) is known via some other mechanism.</li>
 * </ol>
 * {@code OWLOntologyChangeRecord} objects are immutable.
 * 
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group
 * @since 3.3
 */
public class OWLOntologyChangeRecord implements Serializable {public static class __CLR4_5_2bfbflvickjm3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLOntologyID ontologyID;
    @Nonnull
    private final OWLOntologyChangeData data;

    /**
     * Constructs an {@code OWLOntologyChangeRecord} object which holds
     * information about a change to a particular ontology identified by an
     * {@link OWLOntologyID} object and also change details specified by the
     * {@link OWLOntologyChangeData} object.
     * 
     * @param ontologyID
     *        The {@link OWLOntologyID} which identifies the ontology that the
     *        change was applied to.
     * @param data
     *        The {@link OWLOntologyChangeData} that describes the particular
     *        details of the change.
     */
    public OWLOntologyChangeRecord(@Nonnull OWLOntologyID ontologyID,
            @Nonnull OWLOntologyChangeData data) {try{__CLR4_5_2bfbflvickjm3.R.inc(411);
        __CLR4_5_2bfbflvickjm3.R.inc(412);this.ontologyID = checkNotNull(ontologyID,
                "ontologyID must not be null");
        __CLR4_5_2bfbflvickjm3.R.inc(413);this.data = checkNotNull(data, "data must not be null");
    }finally{__CLR4_5_2bfbflvickjm3.R.flushNeeded();}}

    /**
     * A convenience method that creates an {@code OWLOntologyChangeRecord} by
     * deriving data from an {@link OWLOntologyChange} object.
     * 
     * @param change
     *        The {@link OWLOntologyChange} object.
     * @return instance of OntologychangeRecord
     */
    @Nonnull
    public static OWLOntologyChangeRecord createFromOWLOntologyChange(
            @Nonnull OWLOntologyChange change) {try{__CLR4_5_2bfbflvickjm3.R.inc(414);
        __CLR4_5_2bfbflvickjm3.R.inc(415);checkNotNull(change, "change must not be null");
        __CLR4_5_2bfbflvickjm3.R.inc(416);OWLOntologyID ontologyId = change.getOntology().getOntologyID();
        __CLR4_5_2bfbflvickjm3.R.inc(417);OWLOntologyChangeData data = change.getChangeData();
        __CLR4_5_2bfbflvickjm3.R.inc(418);return new OWLOntologyChangeRecord(ontologyId, data);
    }finally{__CLR4_5_2bfbflvickjm3.R.flushNeeded();}}

    /**
     * Gets the {@link OWLOntologyID} that identifies the ontology associated
     * with this change record.
     * 
     * @return The {@link OWLOntologyID}.
     */
    @Nonnull
    public OWLOntologyID getOntologyID() {try{__CLR4_5_2bfbflvickjm3.R.inc(419);
        __CLR4_5_2bfbflvickjm3.R.inc(420);return ontologyID;
    }finally{__CLR4_5_2bfbflvickjm3.R.flushNeeded();}}

    /**
     * Gets the {@link OWLOntologyChangeData} which is associated with this
     * {@code OWLOntologyChangeRecord}.
     * 
     * @return The {@link OWLOntologyChangeData}.
     */
    @Nonnull
    public OWLOntologyChangeData getData() {try{__CLR4_5_2bfbflvickjm3.R.inc(421);
        __CLR4_5_2bfbflvickjm3.R.inc(422);return data;
    }finally{__CLR4_5_2bfbflvickjm3.R.flushNeeded();}}

    /**
     * Creates an {@link OWLOntologyChange} from the {@link OWLOntologyID} and
     * {@link OWLOntologyChangeData} associated with this
     * {@code OWLOntologyChangeRecord} object. The {@link OWLOntology} that is
     * the target of the resulting {@link OWLOntologyChange} is derived from an
     * {@link OWLOntologyManager}. The manager <i>must</i> contain an ontology
     * that has an {@link OWLOntologyID} which is equal to the
     * {@link OWLOntologyID} associated with this
     * {@code OWLOntologyChangeRecord} object.
     * 
     * @param manager
     *        The manager which will be used to obtain a reference to an
     *        {@link OWLOntology} object having the same {@link OWLOntologyID}
     *        as the {@link OWLOntologyID} associated with this
     *        {@code OWLOntologyChangeRecord}.
     * @return The {@link OWLOntologyChange} object that is derived from this
     *         record's {@link OWLOntologyID} and {@link OWLOntologyChangeData}.
     *         The specific concrete subclass of the returned
     *         {@link OWLOntologyChange} will depend upon the specific concrete
     *         subclass of the {@link OWLOntologyChangeData} associated with
     *         this {@code OWLOntologyChangeRecord}.
     * @throws UnknownOWLOntologyException
     *         if the specified manager does not contain an ontology which has
     *         an {@link OWLOntologyID} equal to the {@link OWLOntologyID}
     *         associated with this {@code OWLOntologyChangeRecord}.
     */
    public OWLOntologyChange createOntologyChange(OWLOntologyManager manager) {try{__CLR4_5_2bfbflvickjm3.R.inc(423);
        __CLR4_5_2bfbflvickjm3.R.inc(424);OWLOntology ontology = checkNotNull(manager, "manager cannot be null")
                .getOntology(ontologyID);
        __CLR4_5_2bfbflvickjm3.R.inc(425);if ((((ontology == null)&&(__CLR4_5_2bfbflvickjm3.R.iget(426)!=0|true))||(__CLR4_5_2bfbflvickjm3.R.iget(427)==0&false))) {{
            __CLR4_5_2bfbflvickjm3.R.inc(428);throw new UnknownOWLOntologyException(ontologyID);
        }
        }__CLR4_5_2bfbflvickjm3.R.inc(429);return data.createOntologyChange(ontology);
    }finally{__CLR4_5_2bfbflvickjm3.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2bfbflvickjm3.R.inc(430);
        __CLR4_5_2bfbflvickjm3.R.inc(431);if ((((obj == this)&&(__CLR4_5_2bfbflvickjm3.R.iget(432)!=0|true))||(__CLR4_5_2bfbflvickjm3.R.iget(433)==0&false))) {{
            __CLR4_5_2bfbflvickjm3.R.inc(434);return true;
        }
        }__CLR4_5_2bfbflvickjm3.R.inc(435);if ((((!(obj instanceof OWLOntologyChangeRecord))&&(__CLR4_5_2bfbflvickjm3.R.iget(436)!=0|true))||(__CLR4_5_2bfbflvickjm3.R.iget(437)==0&false))) {{
            __CLR4_5_2bfbflvickjm3.R.inc(438);return false;
        }
        }__CLR4_5_2bfbflvickjm3.R.inc(439);OWLOntologyChangeRecord other = (OWLOntologyChangeRecord) obj;
        __CLR4_5_2bfbflvickjm3.R.inc(440);return ontologyID.equals(other.ontologyID) && data.equals(other.data);
    }finally{__CLR4_5_2bfbflvickjm3.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2bfbflvickjm3.R.inc(441);
        __CLR4_5_2bfbflvickjm3.R.inc(442);return getClass().hashCode() + ontologyID.hashCode() + data.hashCode();
    }finally{__CLR4_5_2bfbflvickjm3.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2bfbflvickjm3.R.inc(443);
        __CLR4_5_2bfbflvickjm3.R.inc(444);return getName() + '(' + ontologyID + ' ' + data + ')';
    }finally{__CLR4_5_2bfbflvickjm3.R.flushNeeded();}}

    /** @return a name for the object class */
    public String getName() {try{__CLR4_5_2bfbflvickjm3.R.inc(445);
        __CLR4_5_2bfbflvickjm3.R.inc(446);return "OWLOntologyChangeRecord";
    }finally{__CLR4_5_2bfbflvickjm3.R.flushNeeded();}}
}
