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

import static org.semanticweb.owlapi.model.parameters.Imports.*;
import static org.semanticweb.owlapi.util.CollectionFactory.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.OWLOntologyDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.AxiomAnnotations;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.model.parameters.Navigation;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAxiomSearchFilter;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import com.google.common.base.Optional;
import com.google.common.collect.Iterables;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLImmutableOntologyImpl extends OWLAxiomIndexImpl implements OWLOntology, Serializable {public static class __CLR4_5_24wb4wblviclftm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,7260,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull protected OWLOntologyManager manager;
    @Nonnull protected OWLOntologyID ontologyID;

    @Override
    protected int index() {try{__CLR4_5_24wb4wblviclftm.R.inc(6347);
        __CLR4_5_24wb4wblviclftm.R.inc(6348);return OWLObjectTypeIndexProvider.ONTOLOGY;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    /**
     * @param manager
     *        ontology manager
     * @param ontologyID
     *        ontology id
     */
    public OWLImmutableOntologyImpl(@Nonnull OWLOntologyManager manager, @Nonnull OWLOntologyID ontologyID) {try{__CLR4_5_24wb4wblviclftm.R.inc(6349);
        __CLR4_5_24wb4wblviclftm.R.inc(6350);this.manager = checkNotNull(manager, "manager cannot be null");
        __CLR4_5_24wb4wblviclftm.R.inc(6351);this.ontologyID = checkNotNull(ontologyID, "ontologyID cannot be null");
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_24wb4wblviclftm.R.inc(6352);
        __CLR4_5_24wb4wblviclftm.R.inc(6353);StringBuilder sb = new StringBuilder();
        __CLR4_5_24wb4wblviclftm.R.inc(6354);sb.append("Ontology(");
        __CLR4_5_24wb4wblviclftm.R.inc(6355);sb.append(ontologyID);
        __CLR4_5_24wb4wblviclftm.R.inc(6356);sb.append(") [Axioms: ");
        __CLR4_5_24wb4wblviclftm.R.inc(6357);int axiomCount = ints.getAxiomCount();
        __CLR4_5_24wb4wblviclftm.R.inc(6358);sb.append(axiomCount);
        __CLR4_5_24wb4wblviclftm.R.inc(6359);sb.append(" Logical Axioms: ");
        __CLR4_5_24wb4wblviclftm.R.inc(6360);sb.append(ints.getLogicalAxiomCount());
        __CLR4_5_24wb4wblviclftm.R.inc(6361);sb.append("] First 20 axioms: {");
        __CLR4_5_24wb4wblviclftm.R.inc(6362);for (OWLAxiom ax : Iterables.limit(ints.getAxioms(), 20)) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6363);sb.append(ax).append(' ');
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6364);sb.append('}');
        __CLR4_5_24wb4wblviclftm.R.inc(6365);return sb.toString();
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public OWLOntologyManager getOWLOntologyManager() {try{__CLR4_5_24wb4wblviclftm.R.inc(6366);
        __CLR4_5_24wb4wblviclftm.R.inc(6367);return manager;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void setOWLOntologyManager(OWLOntologyManager manager) {try{__CLR4_5_24wb4wblviclftm.R.inc(6368);
        __CLR4_5_24wb4wblviclftm.R.inc(6369);this.manager = manager;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public OWLOntologyID getOntologyID() {try{__CLR4_5_24wb4wblviclftm.R.inc(6370);
        __CLR4_5_24wb4wblviclftm.R.inc(6371);return ontologyID;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_24wb4wblviclftm.R.inc(6372);
        __CLR4_5_24wb4wblviclftm.R.inc(6373);return ontologyID.isAnonymous();
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_24wb4wblviclftm.R.inc(6374);
        __CLR4_5_24wb4wblviclftm.R.inc(6375);if ((((object == this)&&(__CLR4_5_24wb4wblviclftm.R.iget(6376)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6377)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6378);return 0;
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6379);OWLOntology other = (OWLOntology) object;
        __CLR4_5_24wb4wblviclftm.R.inc(6380);return ontologyID.compareTo(other.getOntologyID());
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean isEmpty() {try{__CLR4_5_24wb4wblviclftm.R.inc(6381);
        __CLR4_5_24wb4wblviclftm.R.inc(6382);return ints.isEmpty();
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public <T extends OWLAxiom> int getAxiomCount(AxiomType<T> axiomType, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6383);
        __CLR4_5_24wb4wblviclftm.R.inc(6384);return getAxiomCount(axiomType, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public int getAxiomCount(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6385);
        __CLR4_5_24wb4wblviclftm.R.inc(6386);return getAxiomCount(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public <T extends OWLAxiom> int getAxiomCount(AxiomType<T> axiomType, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6387);
        __CLR4_5_24wb4wblviclftm.R.inc(6388);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6389)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6390)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6391);return getAxiomCount(axiomType);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6392);int result = 0;
        __CLR4_5_24wb4wblviclftm.R.inc(6393);for (OWLOntology ont : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6394);result += ont.getAxiomCount(axiomType);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6395);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsAxiom(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24wb4wblviclftm.R.inc(6396);
        __CLR4_5_24wb4wblviclftm.R.inc(6397);return Internals.contains(ints.getAxiomsByType(), axiom.getAxiomType(), axiom);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public int getAxiomCount() {try{__CLR4_5_24wb4wblviclftm.R.inc(6398);
        __CLR4_5_24wb4wblviclftm.R.inc(6399);return getAxiomCount(EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public int getAxiomCount(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6400);
        __CLR4_5_24wb4wblviclftm.R.inc(6401);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6402)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6403)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6404);return ints.getAxiomCount();
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6405);int total = 0;
        __CLR4_5_24wb4wblviclftm.R.inc(6406);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6407);total += o.getAxiomCount();
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6408);return total;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getAxioms() {try{__CLR4_5_24wb4wblviclftm.R.inc(6409);
        __CLR4_5_24wb4wblviclftm.R.inc(6410);return getAxioms(EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getAxioms(boolean b) {try{__CLR4_5_24wb4wblviclftm.R.inc(6411);
        __CLR4_5_24wb4wblviclftm.R.inc(6412);return getAxioms(Imports.fromBoolean(b));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getAxioms(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6413);
        __CLR4_5_24wb4wblviclftm.R.inc(6414);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6415)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6416)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6417);return asSet(ints.getAxioms());
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6418);Set<OWLAxiom> axioms = new HashSet<>();
        __CLR4_5_24wb4wblviclftm.R.inc(6419);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6420);axioms.addAll(o.getAxioms());
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6421);return axioms;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Nonnull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends OWLAxiom> Set<T> getAxioms(AxiomType<T> axiomType) {try{__CLR4_5_24wb4wblviclftm.R.inc(6422);
        __CLR4_5_24wb4wblviclftm.R.inc(6423);return (Set<T>) asSet(ints.getAxiomsByType().getValues(axiomType));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public <T extends OWLAxiom> Set<T> getAxioms(AxiomType<T> axiomType, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6424);
        __CLR4_5_24wb4wblviclftm.R.inc(6425);return getAxioms(axiomType, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public <T extends OWLAxiom> Set<T> getAxioms(AxiomType<T> axiomType, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6426);
        __CLR4_5_24wb4wblviclftm.R.inc(6427);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6428)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6429)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6430);return getAxioms(axiomType);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6431);Set<T> toReturn = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6432);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6433);toReturn.addAll(o.getAxioms(axiomType));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6434);return toReturn;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLAxiom> getTBoxAxioms(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6435);
        __CLR4_5_24wb4wblviclftm.R.inc(6436);Set<OWLAxiom> toReturn = new HashSet<>();
        __CLR4_5_24wb4wblviclftm.R.inc(6437);for (AxiomType<?> type : AxiomType.TBoxAxiomTypes) {{
            assert (((type != null)&&(__CLR4_5_24wb4wblviclftm.R.iget(6438)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6439)==0&false));
            __CLR4_5_24wb4wblviclftm.R.inc(6440);toReturn.addAll(getAxioms(type, includeImportsClosure));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6441);return toReturn;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLAxiom> getABoxAxioms(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6442);
        __CLR4_5_24wb4wblviclftm.R.inc(6443);Set<OWLAxiom> toReturn = new HashSet<>();
        __CLR4_5_24wb4wblviclftm.R.inc(6444);for (AxiomType<?> type : AxiomType.ABoxAxiomTypes) {{
            assert (((type != null)&&(__CLR4_5_24wb4wblviclftm.R.iget(6445)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6446)==0&false));
            __CLR4_5_24wb4wblviclftm.R.inc(6447);toReturn.addAll(getAxioms(type, includeImportsClosure));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6448);return toReturn;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLAxiom> getRBoxAxioms(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6449);
        __CLR4_5_24wb4wblviclftm.R.inc(6450);Set<OWLAxiom> toReturn = new HashSet<>();
        __CLR4_5_24wb4wblviclftm.R.inc(6451);for (AxiomType<?> type : AxiomType.RBoxAxiomTypes) {{
            assert (((type != null)&&(__CLR4_5_24wb4wblviclftm.R.iget(6452)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6453)==0&false));
            __CLR4_5_24wb4wblviclftm.R.inc(6454);toReturn.addAll(getAxioms(type, includeImportsClosure));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6455);return toReturn;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public <T extends OWLAxiom> int getAxiomCount(AxiomType<T> axiomType) {try{__CLR4_5_24wb4wblviclftm.R.inc(6456);
        __CLR4_5_24wb4wblviclftm.R.inc(6457);return ints.getAxiomCount(axiomType);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLLogicalAxiom> getLogicalAxioms() {try{__CLR4_5_24wb4wblviclftm.R.inc(6458);
        __CLR4_5_24wb4wblviclftm.R.inc(6459);return ints.getLogicalAxioms();
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLLogicalAxiom> getLogicalAxioms(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6460);
        __CLR4_5_24wb4wblviclftm.R.inc(6461);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6462)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6463)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6464);return ints.getLogicalAxioms();
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6465);Set<OWLLogicalAxiom> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6466);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6467);result.addAll(o.getLogicalAxioms(EXCLUDED));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6468);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLLogicalAxiom> getLogicalAxioms(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6469);
        __CLR4_5_24wb4wblviclftm.R.inc(6470);return getLogicalAxioms(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public int getLogicalAxiomCount() {try{__CLR4_5_24wb4wblviclftm.R.inc(6471);
        __CLR4_5_24wb4wblviclftm.R.inc(6472);return ints.getLogicalAxiomCount();
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public int getLogicalAxiomCount(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6473);
        __CLR4_5_24wb4wblviclftm.R.inc(6474);return getLogicalAxiomCount(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public int getLogicalAxiomCount(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6475);
        __CLR4_5_24wb4wblviclftm.R.inc(6476);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6477)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6478)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6479);return ints.getLogicalAxiomCount();
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6480);int total = 0;
        __CLR4_5_24wb4wblviclftm.R.inc(6481);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6482);total += o.getLogicalAxiomCount(EXCLUDED);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6483);return total;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLAnnotation> getAnnotations() {try{__CLR4_5_24wb4wblviclftm.R.inc(6484);
        __CLR4_5_24wb4wblviclftm.R.inc(6485);return (Set<OWLAnnotation>) ints.getOntologyAnnotations(true);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLClassAxiom> getGeneralClassAxioms() {try{__CLR4_5_24wb4wblviclftm.R.inc(6486);
        __CLR4_5_24wb4wblviclftm.R.inc(6487);return ints.getGeneralClassAxioms();
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsAxiom(@Nonnull OWLAxiom axiom, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6488);
        __CLR4_5_24wb4wblviclftm.R.inc(6489);return containsAxiom(axiom, Imports.fromBoolean(includeImportsClosure),
            AxiomAnnotations.CONSIDER_AXIOM_ANNOTATIONS);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsAxiom(@Nonnull OWLAxiom axiom, Imports includeImportsClosure,
        AxiomAnnotations ignoreAnnotations) {try{__CLR4_5_24wb4wblviclftm.R.inc(6490);
        __CLR4_5_24wb4wblviclftm.R.inc(6491);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6492)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6493)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6494);if ((((ignoreAnnotations == AxiomAnnotations.CONSIDER_AXIOM_ANNOTATIONS)&&(__CLR4_5_24wb4wblviclftm.R.iget(6495)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6496)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6497);return containsAxiom(axiom);
            } }else {{
                __CLR4_5_24wb4wblviclftm.R.inc(6498);return containsAxiomIgnoreAnnotations(axiom);
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6499);for (OWLOntology ont : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6500);if ((((ont.containsAxiom(axiom, EXCLUDED, ignoreAnnotations))&&(__CLR4_5_24wb4wblviclftm.R.iget(6501)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6502)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6503);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6504);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsAxiomIgnoreAnnotations(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24wb4wblviclftm.R.inc(6505);
        __CLR4_5_24wb4wblviclftm.R.inc(6506);for (OWLAxiom ax : ints.getAxiomsByType().getValues(axiom.getAxiomType())) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6507);if ((((ax.equalsIgnoreAnnotations(axiom))&&(__CLR4_5_24wb4wblviclftm.R.iget(6508)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6509)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6510);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6511);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsAxiomIgnoreAnnotations(@Nonnull OWLAxiom axiom, boolean importsIncluded) {try{__CLR4_5_24wb4wblviclftm.R.inc(6512);
        __CLR4_5_24wb4wblviclftm.R.inc(6513);return containsAxiom(axiom, Imports.fromBoolean(importsIncluded), AxiomAnnotations.IGNORE_AXIOM_ANNOTATIONS);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    @Nonnull
    public Set<OWLAxiom> getAxiomsIgnoreAnnotations(@Nonnull OWLAxiom axiom) {try{__CLR4_5_24wb4wblviclftm.R.inc(6514);
        __CLR4_5_24wb4wblviclftm.R.inc(6515);Set<OWLAxiom> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6516);if ((((containsAxiom(axiom))&&(__CLR4_5_24wb4wblviclftm.R.iget(6517)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6518)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6519);result.add(axiom);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6520);for (OWLAxiom ax : ints.getAxiomsByType().getValues(axiom.getAxiomType())) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6521);if ((((ax.equalsIgnoreAnnotations(axiom))&&(__CLR4_5_24wb4wblviclftm.R.iget(6522)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6523)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6524);result.add(ax);
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6525);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getAxiomsIgnoreAnnotations(@Nonnull OWLAxiom axiom, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6526);
        __CLR4_5_24wb4wblviclftm.R.inc(6527);return getAxiomsIgnoreAnnotations(axiom, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getAxiomsIgnoreAnnotations(@Nonnull OWLAxiom axiom, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6528);
        __CLR4_5_24wb4wblviclftm.R.inc(6529);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6530)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6531)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6532);return getAxiomsIgnoreAnnotations(axiom);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6533);Set<OWLAxiom> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6534);for (OWLOntology ont : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6535);result.addAll(ont.getAxiomsIgnoreAnnotations(axiom, EXCLUDED));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6536);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsClassInSignature(IRI owlClassIRI, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6537);
        __CLR4_5_24wb4wblviclftm.R.inc(6538);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6539)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6540)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6541);return ints.containsClassInSignature(owlClassIRI);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6542);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6543);if ((((o.containsClassInSignature(owlClassIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6544)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6545)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6546);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6547);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsObjectPropertyInSignature(IRI owlObjectPropertyIRI, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6548);
        __CLR4_5_24wb4wblviclftm.R.inc(6549);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6550)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6551)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6552);return ints.containsObjectPropertyInSignature(owlObjectPropertyIRI);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6553);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6554);if ((((o.containsObjectPropertyInSignature(owlObjectPropertyIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6555)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6556)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6557);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6558);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsDataPropertyInSignature(IRI owlDataPropertyIRI, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6559);
        __CLR4_5_24wb4wblviclftm.R.inc(6560);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6561)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6562)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6563);return ints.containsDataPropertyInSignature(owlDataPropertyIRI);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6564);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6565);if ((((o.containsDataPropertyInSignature(owlDataPropertyIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6566)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6567)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6568);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6569);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsAnnotationPropertyInSignature(IRI owlAnnotationPropertyIRI, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6570);
        __CLR4_5_24wb4wblviclftm.R.inc(6571);OWLAnnotationProperty p = manager.getOWLDataFactory().getOWLAnnotationProperty(owlAnnotationPropertyIRI);
        __CLR4_5_24wb4wblviclftm.R.inc(6572);if ((((includeImportsClosure == INCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6573)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6574)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6575);for (OWLOntology o : getImportsClosure()) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6576);if ((((o.containsAnnotationPropertyInSignature(owlAnnotationPropertyIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6577)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6578)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6579);return true;
                }
            }}
        }} }else {{
            __CLR4_5_24wb4wblviclftm.R.inc(6580);if ((((ints.containsAnnotationPropertyInSignature(owlAnnotationPropertyIRI))&&(__CLR4_5_24wb4wblviclftm.R.iget(6581)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6582)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6583);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6584);return checkOntologyAnnotations(p);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    private boolean checkOntologyAnnotations(OWLAnnotationProperty owlAnnotationProperty) {try{__CLR4_5_24wb4wblviclftm.R.inc(6585);
        __CLR4_5_24wb4wblviclftm.R.inc(6586);for (OWLAnnotation anno : ints.getOntologyAnnotations(false)) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6587);if ((((anno.getProperty().equals(owlAnnotationProperty))&&(__CLR4_5_24wb4wblviclftm.R.iget(6588)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6589)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6590);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6591);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsIndividualInSignature(IRI owlIndividualIRI, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6592);
        __CLR4_5_24wb4wblviclftm.R.inc(6593);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6594)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6595)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6596);return ints.containsIndividualInSignature(owlIndividualIRI);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6597);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6598);if ((((o.containsIndividualInSignature(owlIndividualIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6599)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6600)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6601);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6602);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsDatatypeInSignature(IRI owlDatatypeIRI, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6603);
        __CLR4_5_24wb4wblviclftm.R.inc(6604);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6605)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6606)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6607);return ints.containsDatatypeInSignature(owlDatatypeIRI);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6608);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6609);if ((((o.containsDatatypeInSignature(owlDatatypeIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6610)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6611)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6612);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6613);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getEntitiesInSignature(@Nonnull IRI entityIRI) {try{__CLR4_5_24wb4wblviclftm.R.inc(6614);
        __CLR4_5_24wb4wblviclftm.R.inc(6615);return getEntitiesInSignature(entityIRI, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getEntitiesInSignature(IRI iri, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6616);
        __CLR4_5_24wb4wblviclftm.R.inc(6617);Set<OWLEntity> result = createSet(6);
        __CLR4_5_24wb4wblviclftm.R.inc(6618);if ((((containsClassInSignature(iri, includeImportsClosure))&&(__CLR4_5_24wb4wblviclftm.R.iget(6619)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6620)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6621);result.add(manager.getOWLDataFactory().getOWLClass(iri));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6622);if ((((containsObjectPropertyInSignature(iri, includeImportsClosure))&&(__CLR4_5_24wb4wblviclftm.R.iget(6623)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6624)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6625);result.add(manager.getOWLDataFactory().getOWLObjectProperty(iri));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6626);if ((((containsDataPropertyInSignature(iri, includeImportsClosure))&&(__CLR4_5_24wb4wblviclftm.R.iget(6627)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6628)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6629);result.add(manager.getOWLDataFactory().getOWLDataProperty(iri));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6630);if ((((containsIndividualInSignature(iri, includeImportsClosure))&&(__CLR4_5_24wb4wblviclftm.R.iget(6631)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6632)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6633);result.add(manager.getOWLDataFactory().getOWLNamedIndividual(iri));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6634);if ((((containsDatatypeInSignature(iri, includeImportsClosure))&&(__CLR4_5_24wb4wblviclftm.R.iget(6635)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6636)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6637);result.add(manager.getOWLDataFactory().getOWLDatatype(iri));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6638);if ((((containsAnnotationPropertyInSignature(iri, includeImportsClosure))&&(__CLR4_5_24wb4wblviclftm.R.iget(6639)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6640)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6641);result.add(manager.getOWLDataFactory().getOWLAnnotationProperty(iri));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6642);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<IRI> getPunnedIRIs(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6643);
        __CLR4_5_24wb4wblviclftm.R.inc(6644);Set<IRI> punned = new HashSet<>();
        __CLR4_5_24wb4wblviclftm.R.inc(6645);Set<IRI> test = new HashSet<>();
        __CLR4_5_24wb4wblviclftm.R.inc(6646);if ((((includeImportsClosure == INCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6647)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6648)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6649);for (OWLOntology o : getImportsClosure()) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6650);for (OWLEntity e : o.getClassesInSignature(EXCLUDED)) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6651);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6652)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6653)==0&false))) {{
                        __CLR4_5_24wb4wblviclftm.R.inc(6654);punned.add(e.getIRI());
                    }
                }}
                }__CLR4_5_24wb4wblviclftm.R.inc(6655);for (OWLEntity e : o.getDataPropertiesInSignature(EXCLUDED)) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6656);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6657)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6658)==0&false))) {{
                        __CLR4_5_24wb4wblviclftm.R.inc(6659);punned.add(e.getIRI());
                    }
                }}
                }__CLR4_5_24wb4wblviclftm.R.inc(6660);for (OWLEntity e : o.getObjectPropertiesInSignature(EXCLUDED)) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6661);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6662)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6663)==0&false))) {{
                        __CLR4_5_24wb4wblviclftm.R.inc(6664);punned.add(e.getIRI());
                    }
                }}
                }__CLR4_5_24wb4wblviclftm.R.inc(6665);for (OWLEntity e : o.getAnnotationPropertiesInSignature(EXCLUDED)) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6666);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6667)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6668)==0&false))) {{
                        __CLR4_5_24wb4wblviclftm.R.inc(6669);punned.add(e.getIRI());
                    }
                }}
                }__CLR4_5_24wb4wblviclftm.R.inc(6670);for (OWLEntity e : o.getDatatypesInSignature(EXCLUDED)) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6671);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6672)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6673)==0&false))) {{
                        __CLR4_5_24wb4wblviclftm.R.inc(6674);punned.add(e.getIRI());
                    }
                }}
                }__CLR4_5_24wb4wblviclftm.R.inc(6675);for (OWLEntity e : o.getIndividualsInSignature(EXCLUDED)) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6676);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6677)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6678)==0&false))) {{
                        __CLR4_5_24wb4wblviclftm.R.inc(6679);punned.add(e.getIRI());
                    }
                }}
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(6680);if ((((punned.isEmpty())&&(__CLR4_5_24wb4wblviclftm.R.iget(6681)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6682)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6683);return CollectionFactory.<IRI> emptySet();
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(6684);return punned;
        } }else {{
            __CLR4_5_24wb4wblviclftm.R.inc(6685);for (OWLEntity e : getClassesInSignature(EXCLUDED)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6686);test.add(e.getIRI());
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(6687);for (OWLEntity e : getDataPropertiesInSignature(EXCLUDED)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6688);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6689)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6690)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6691);punned.add(e.getIRI());
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(6692);for (OWLEntity e : getObjectPropertiesInSignature(EXCLUDED)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6693);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6694)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6695)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6696);punned.add(e.getIRI());
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(6697);for (OWLEntity e : getAnnotationPropertiesInSignature(EXCLUDED)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6698);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6699)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6700)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6701);punned.add(e.getIRI());
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(6702);for (OWLEntity e : getDatatypesInSignature(EXCLUDED)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6703);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6704)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6705)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6706);punned.add(e.getIRI());
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(6707);for (OWLEntity e : getIndividualsInSignature(EXCLUDED)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6708);if ((((!test.add(e.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(6709)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6710)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6711);punned.add(e.getIRI());
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(6712);if ((((punned.isEmpty())&&(__CLR4_5_24wb4wblviclftm.R.iget(6713)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6714)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6715);return CollectionFactory.<IRI> emptySet();
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(6716);return punned;
        }
    }}finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsReference(@Nonnull OWLEntity entity, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6717);
        __CLR4_5_24wb4wblviclftm.R.inc(6718);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6719)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6720)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6721);return ints.containsReference(entity);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6722);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6723);if ((((o.containsReference(entity, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6724)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6725)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6726);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6727);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean isDeclared(OWLEntity owlEntity) {try{__CLR4_5_24wb4wblviclftm.R.inc(6728);
        __CLR4_5_24wb4wblviclftm.R.inc(6729);return ints.isDeclared(owlEntity);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean isDeclared(OWLEntity owlEntity, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6730);
        __CLR4_5_24wb4wblviclftm.R.inc(6731);if ((((isDeclared(owlEntity))&&(__CLR4_5_24wb4wblviclftm.R.iget(6732)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6733)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6734);return true;
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6735);if ((((includeImportsClosure == INCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6736)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6737)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6738);for (OWLOntology ont : manager.getImportsClosure(this)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6739);if ((((!ont.equals(this) && ont.isDeclared(owlEntity))&&(__CLR4_5_24wb4wblviclftm.R.iget(6740)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6741)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6742);return true;
                }
            }}
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6743);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(@Nonnull OWLEntity owlEntity) {try{__CLR4_5_24wb4wblviclftm.R.inc(6744);
        __CLR4_5_24wb4wblviclftm.R.inc(6745);return containsEntityInSignature(owlEntity, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    private final OWLEntityReferenceChecker entityReferenceChecker = new OWLEntityReferenceChecker();

    @Override
    public boolean containsEntityInSignature(@Nonnull OWLEntity owlEntity, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6746);
        __CLR4_5_24wb4wblviclftm.R.inc(6747);if ((((includeImportsClosure != INCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6748)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6749)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6750);return entityReferenceChecker.containsReference(owlEntity);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6751);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6752);if ((((o.containsEntityInSignature(owlEntity, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6753)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6754)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6755);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6756);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(IRI entityIRI, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6757);
        __CLR4_5_24wb4wblviclftm.R.inc(6758);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6759)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6760)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6761);if ((((containsClassInSignature(entityIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6762)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6763)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6764);return true;
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(6765);if ((((containsObjectPropertyInSignature(entityIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6766)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6767)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6768);return true;
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(6769);if ((((containsDataPropertyInSignature(entityIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6770)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6771)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6772);return true;
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(6773);if ((((containsIndividualInSignature(entityIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6774)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6775)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6776);return true;
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(6777);if ((((containsDatatypeInSignature(entityIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6778)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6779)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6780);return true;
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(6781);if ((((containsAnnotationPropertyInSignature(entityIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6782)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6783)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6784);return true;
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(6785);return false;
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6786);for (OWLOntology ont : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6787);if ((((ont.containsEntityInSignature(entityIRI, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(6788)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6789)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6790);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6791);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getSignature() {try{__CLR4_5_24wb4wblviclftm.R.inc(6792);
        // We might want to cache this for performance reasons,
        // but I'm not sure right now.
        __CLR4_5_24wb4wblviclftm.R.inc(6793);Set<OWLEntity> entities = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6794);entities.addAll(getClassesInSignature());
        __CLR4_5_24wb4wblviclftm.R.inc(6795);entities.addAll(getObjectPropertiesInSignature());
        __CLR4_5_24wb4wblviclftm.R.inc(6796);entities.addAll(getDataPropertiesInSignature());
        __CLR4_5_24wb4wblviclftm.R.inc(6797);entities.addAll(getIndividualsInSignature());
        __CLR4_5_24wb4wblviclftm.R.inc(6798);entities.addAll(getDatatypesInSignature());
        __CLR4_5_24wb4wblviclftm.R.inc(6799);entities.addAll(getAnnotationPropertiesInSignature(EXCLUDED));
        __CLR4_5_24wb4wblviclftm.R.inc(6800);return entities;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getSignature(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6801);
        __CLR4_5_24wb4wblviclftm.R.inc(6802);Set<OWLEntity> entities = getSignature();
        __CLR4_5_24wb4wblviclftm.R.inc(6803);if ((((includeImportsClosure == INCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6804)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6805)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6806);for (OWLOntology ont : getImportsClosure()) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6807);entities.addAll(ont.getSignature(EXCLUDED));
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6808);return entities;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Nonnull
    private static <T> Set<T> asSet(Iterable<T> i) {try{__CLR4_5_24wb4wblviclftm.R.inc(6809);
        __CLR4_5_24wb4wblviclftm.R.inc(6810);if ((((i instanceof Set)&&(__CLR4_5_24wb4wblviclftm.R.iget(6811)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6812)==0&false))) {{
            // in this case we can use a list for the defensive copy
            __CLR4_5_24wb4wblviclftm.R.inc(6813);List<T> list = new ArrayList<>();
            __CLR4_5_24wb4wblviclftm.R.inc(6814);Iterables.addAll(list, i);
            __CLR4_5_24wb4wblviclftm.R.inc(6815);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(list);
        }
        // if the input is not a set, we need to make sure there are no
        // duplicates
        }__CLR4_5_24wb4wblviclftm.R.inc(6816);Set<T> set = new HashSet<>();
        __CLR4_5_24wb4wblviclftm.R.inc(6817);Iterables.addAll(set, i);
        __CLR4_5_24wb4wblviclftm.R.inc(6818);return set;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {try{__CLR4_5_24wb4wblviclftm.R.inc(6819);
        __CLR4_5_24wb4wblviclftm.R.inc(6820);return asSet(ints.get(OWLAnonymousIndividual.class, OWLAxiom.class).get().keySet());
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLClass> getClassesInSignature() {try{__CLR4_5_24wb4wblviclftm.R.inc(6821);
        __CLR4_5_24wb4wblviclftm.R.inc(6822);return asSet(ints.get(OWLClass.class, OWLAxiom.class).get().keySet());
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDataProperty> getDataPropertiesInSignature() {try{__CLR4_5_24wb4wblviclftm.R.inc(6823);
        __CLR4_5_24wb4wblviclftm.R.inc(6824);return asSet(ints.get(OWLDataProperty.class, OWLAxiom.class).get().keySet());
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLObjectProperty> getObjectPropertiesInSignature() {try{__CLR4_5_24wb4wblviclftm.R.inc(6825);
        __CLR4_5_24wb4wblviclftm.R.inc(6826);return asSet(ints.get(OWLObjectProperty.class, OWLAxiom.class).get().keySet());
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLNamedIndividual> getIndividualsInSignature() {try{__CLR4_5_24wb4wblviclftm.R.inc(6827);
        __CLR4_5_24wb4wblviclftm.R.inc(6828);return asSet(ints.get(OWLNamedIndividual.class, OWLAxiom.class).get().keySet());
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDatatype> getDatatypesInSignature() {try{__CLR4_5_24wb4wblviclftm.R.inc(6829);
        __CLR4_5_24wb4wblviclftm.R.inc(6830);return asSet(ints.get(OWLDatatype.class, OWLAxiom.class).get().keySet());
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLClass> getClassesInSignature(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6831);
        __CLR4_5_24wb4wblviclftm.R.inc(6832);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6833)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6834)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6835);return getClassesInSignature();
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6836);Set<OWLClass> results = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6837);for (OWLOntology ont : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6838);results.addAll(ont.getClassesInSignature());
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6839);return results;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLObjectProperty> getObjectPropertiesInSignature(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6840);
        __CLR4_5_24wb4wblviclftm.R.inc(6841);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6842)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6843)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6844);return getObjectPropertiesInSignature();
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6845);Set<OWLObjectProperty> results = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6846);for (OWLOntology ont : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6847);results.addAll(ont.getObjectPropertiesInSignature());
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6848);return results;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDataProperty> getDataPropertiesInSignature(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6849);
        __CLR4_5_24wb4wblviclftm.R.inc(6850);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6851)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6852)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6853);return getDataPropertiesInSignature();
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6854);Set<OWLDataProperty> results = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6855);for (OWLOntology ont : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6856);results.addAll(ont.getDataPropertiesInSignature());
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6857);return results;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLNamedIndividual> getIndividualsInSignature(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6858);
        __CLR4_5_24wb4wblviclftm.R.inc(6859);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6860)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6861)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6862);return getIndividualsInSignature();
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6863);Set<OWLNamedIndividual> results = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6864);for (OWLOntology ont : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6865);results.addAll(ont.getIndividualsInSignature());
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6866);return results;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAnonymousIndividual> getReferencedAnonymousIndividuals(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6867);
        __CLR4_5_24wb4wblviclftm.R.inc(6868);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6869)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6870)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6871);return asSet(ints.get(OWLAnonymousIndividual.class, OWLAxiom.class).get().keySet());
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6872);Set<OWLAnonymousIndividual> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6873);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6874);result.addAll(o.getReferencedAnonymousIndividuals(EXCLUDED));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6875);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDatatype> getDatatypesInSignature(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6876);
        __CLR4_5_24wb4wblviclftm.R.inc(6877);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6878)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6879)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6880);return getDatatypesInSignature();
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6881);Set<OWLDatatype> results = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6882);for (OWLOntology ont : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6883);results.addAll(ont.getDatatypesInSignature());
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6884);return results;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature(Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6885);
        __CLR4_5_24wb4wblviclftm.R.inc(6886);Set<OWLAnnotationProperty> props = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6887);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6888)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6889)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6890);Iterables.addAll(props, ints.get(OWLAnnotationProperty.class, OWLAxiom.class, Navigation.IN_SUB_POSITION)
                .get().keySet());
            __CLR4_5_24wb4wblviclftm.R.inc(6891);for (OWLAnnotation anno : ints.getOntologyAnnotations(false)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6892);props.add(anno.getProperty());
            }
        }} }else {{
            __CLR4_5_24wb4wblviclftm.R.inc(6893);for (OWLOntology ont : getImportsClosure()) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6894);props.addAll(ont.getAnnotationPropertiesInSignature(EXCLUDED));
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6895);return props;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLImportsDeclaration> getImportsDeclarations() {try{__CLR4_5_24wb4wblviclftm.R.inc(6896);
        __CLR4_5_24wb4wblviclftm.R.inc(6897);return (Set<OWLImportsDeclaration>) ints.getImportsDeclarations(true);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<IRI> getDirectImportsDocuments() {try{__CLR4_5_24wb4wblviclftm.R.inc(6898);
        __CLR4_5_24wb4wblviclftm.R.inc(6899);Set<IRI> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6900);for (OWLImportsDeclaration importsDeclaration : ints.getImportsDeclarations(false)) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6901);result.add(importsDeclaration.getIRI());
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6902);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLOntology> getImports() {try{__CLR4_5_24wb4wblviclftm.R.inc(6903);
        __CLR4_5_24wb4wblviclftm.R.inc(6904);return manager.getImports(this);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLOntology> getDirectImports() {try{__CLR4_5_24wb4wblviclftm.R.inc(6905);
        __CLR4_5_24wb4wblviclftm.R.inc(6906);return manager.getDirectImports(this);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLOntology> getImportsClosure() {try{__CLR4_5_24wb4wblviclftm.R.inc(6907);
        __CLR4_5_24wb4wblviclftm.R.inc(6908);return getOWLOntologyManager().getImportsClosure(this);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    // Add/Remove axiom mechanism. Each axiom gets visited by a visitor, which
    // adds the axiom
    // to the appropriate index.
    @Override
    public void accept(@Nonnull OWLObjectVisitor visitor) {try{__CLR4_5_24wb4wblviclftm.R.inc(6909);
        __CLR4_5_24wb4wblviclftm.R.inc(6910);visitor.visit(this);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLNamedObjectVisitor visitor) {try{__CLR4_5_24wb4wblviclftm.R.inc(6911);
        __CLR4_5_24wb4wblviclftm.R.inc(6912);visitor.visit(this);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLNamedObjectVisitorEx<O> visitor) {try{__CLR4_5_24wb4wblviclftm.R.inc(6913);
        __CLR4_5_24wb4wblviclftm.R.inc(6914);return visitor.visit(this);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public <O> O accept(@Nonnull OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_24wb4wblviclftm.R.inc(6915);
        __CLR4_5_24wb4wblviclftm.R.inc(6916);return visitor.visit(this);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    // Utility methods for getting/setting various values in maps and sets
    @Override
    public boolean equals(Object obj) {try{__CLR4_5_24wb4wblviclftm.R.inc(6917);
        __CLR4_5_24wb4wblviclftm.R.inc(6918);if ((((obj == this)&&(__CLR4_5_24wb4wblviclftm.R.iget(6919)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6920)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6921);return true;
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6922);if ((((!(obj instanceof OWLOntology))&&(__CLR4_5_24wb4wblviclftm.R.iget(6923)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6924)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6925);return false;
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6926);OWLOntology other = (OWLOntology) obj;
        __CLR4_5_24wb4wblviclftm.R.inc(6927);return ontologyID.equals(other.getOntologyID());
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_24wb4wblviclftm.R.inc(6928);
        __CLR4_5_24wb4wblviclftm.R.inc(6929);return ontologyID.hashCode();
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    private class OWLEntityReferenceChecker implements OWLEntityVisitor, Serializable {

        OWLEntityReferenceChecker() {try{__CLR4_5_24wb4wblviclftm.R.inc(6930);}finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

        private static final long serialVersionUID = 40000L;
        private boolean ref;

        public boolean containsReference(@Nonnull OWLEntity entity) {try{__CLR4_5_24wb4wblviclftm.R.inc(6931);
            __CLR4_5_24wb4wblviclftm.R.inc(6932);ref = false;
            __CLR4_5_24wb4wblviclftm.R.inc(6933);entity.accept(this);
            __CLR4_5_24wb4wblviclftm.R.inc(6934);return ref;
        }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLClass cls) {try{__CLR4_5_24wb4wblviclftm.R.inc(6935);
            __CLR4_5_24wb4wblviclftm.R.inc(6936);ref = OWLImmutableOntologyImpl.this.ints.containsClassInSignature(cls);
        }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDatatype datatype) {try{__CLR4_5_24wb4wblviclftm.R.inc(6937);
            __CLR4_5_24wb4wblviclftm.R.inc(6938);ref = OWLImmutableOntologyImpl.this.ints.containsDatatypeInSignature(datatype);
        }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLNamedIndividual individual) {try{__CLR4_5_24wb4wblviclftm.R.inc(6939);
            __CLR4_5_24wb4wblviclftm.R.inc(6940);ref = OWLImmutableOntologyImpl.this.ints.containsIndividualInSignature(individual);
        }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDataProperty property) {try{__CLR4_5_24wb4wblviclftm.R.inc(6941);
            __CLR4_5_24wb4wblviclftm.R.inc(6942);ref = OWLImmutableOntologyImpl.this.ints.containsDataPropertyInSignature(property);
        }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectProperty property) {try{__CLR4_5_24wb4wblviclftm.R.inc(6943);
            __CLR4_5_24wb4wblviclftm.R.inc(6944);ref = OWLImmutableOntologyImpl.this.ints.containsObjectPropertyInSignature(property);
        }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLAnnotationProperty property) {try{__CLR4_5_24wb4wblviclftm.R.inc(6945);
            __CLR4_5_24wb4wblviclftm.R.inc(6946);ref = OWLImmutableOntologyImpl.this.ints.containsAnnotationPropertyInSignature(property);
        }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}
    }

    @Override
    public Set<OWLClassAxiom> getAxioms(OWLClass cls, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6947);
        __CLR4_5_24wb4wblviclftm.R.inc(6948);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6949)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6950)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6951);return asSet(ints.get(OWLClass.class, OWLClassAxiom.class).get().getValues(cls));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6952);Set<OWLClassAxiom> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6953);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6954);result.addAll(o.getAxioms(cls, EXCLUDED));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(6955);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLObjectPropertyAxiom> getAxioms(OWLObjectPropertyExpression property, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6956);
        __CLR4_5_24wb4wblviclftm.R.inc(6957);Set<OWLObjectPropertyAxiom> result = createSet(50);
        __CLR4_5_24wb4wblviclftm.R.inc(6958);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6959)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6960)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6961);result.addAll(getAsymmetricObjectPropertyAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6962);result.addAll(getReflexiveObjectPropertyAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6963);result.addAll(getSymmetricObjectPropertyAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6964);result.addAll(getIrreflexiveObjectPropertyAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6965);result.addAll(getTransitiveObjectPropertyAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6966);result.addAll(getInverseFunctionalObjectPropertyAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6967);result.addAll(getFunctionalObjectPropertyAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6968);result.addAll(getInverseObjectPropertyAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6969);result.addAll(getObjectPropertyDomainAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6970);result.addAll(getEquivalentObjectPropertiesAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6971);result.addAll(getDisjointObjectPropertiesAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6972);result.addAll(getObjectPropertyRangeAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(6973);result.addAll(getObjectSubPropertyAxiomsForSubProperty(property));
        } }else {{
            __CLR4_5_24wb4wblviclftm.R.inc(6974);for (OWLOntology o : getImportsClosure()) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6975);result.addAll(o.getAxioms(property, EXCLUDED));
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6976);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationAxiom> getAxioms(OWLAnnotationProperty property, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(6977);
        __CLR4_5_24wb4wblviclftm.R.inc(6978);Set<OWLAnnotationAxiom> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(6979);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(6980)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6981)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(6982);for (OWLSubAnnotationPropertyOfAxiom ax : getAxioms(AxiomType.SUB_ANNOTATION_PROPERTY_OF)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6983);if ((((ax.getSubProperty().equals(property))&&(__CLR4_5_24wb4wblviclftm.R.iget(6984)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6985)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6986);result.add(ax);
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(6987);for (OWLAnnotationPropertyRangeAxiom ax : getAxioms(AxiomType.ANNOTATION_PROPERTY_RANGE)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6988);if ((((ax.getProperty().equals(property))&&(__CLR4_5_24wb4wblviclftm.R.iget(6989)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6990)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6991);result.add(ax);
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(6992);for (OWLAnnotationPropertyDomainAxiom ax : getAxioms(AxiomType.ANNOTATION_PROPERTY_DOMAIN)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6993);if ((((ax.getProperty().equals(property))&&(__CLR4_5_24wb4wblviclftm.R.iget(6994)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(6995)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(6996);result.add(ax);
                }
            }}
        }} }else {{
            __CLR4_5_24wb4wblviclftm.R.inc(6997);for (OWLOntology o : getImportsClosure()) {{
                __CLR4_5_24wb4wblviclftm.R.inc(6998);result.addAll(o.getAxioms(property, EXCLUDED));
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(6999);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDataPropertyAxiom> getAxioms(OWLDataProperty property, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7000);
        __CLR4_5_24wb4wblviclftm.R.inc(7001);Set<OWLDataPropertyAxiom> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(7002);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(7003)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7004)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7005);result.addAll(getDataPropertyDomainAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(7006);result.addAll(getEquivalentDataPropertiesAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(7007);result.addAll(getDisjointDataPropertiesAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(7008);result.addAll(getDataPropertyRangeAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(7009);result.addAll(getFunctionalDataPropertyAxioms(property));
            __CLR4_5_24wb4wblviclftm.R.inc(7010);result.addAll(getDataSubPropertyAxiomsForSubProperty(property));
        } }else {{
            __CLR4_5_24wb4wblviclftm.R.inc(7011);for (OWLOntology o : getImportsClosure()) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7012);result.addAll(o.getAxioms(property, EXCLUDED));
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(7013);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLIndividualAxiom> getAxioms(OWLIndividual individual, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7014);
        __CLR4_5_24wb4wblviclftm.R.inc(7015);Set<OWLIndividualAxiom> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(7016);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(7017)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7018)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7019);result.addAll(getClassAssertionAxioms(individual));
            __CLR4_5_24wb4wblviclftm.R.inc(7020);result.addAll(getObjectPropertyAssertionAxioms(individual));
            __CLR4_5_24wb4wblviclftm.R.inc(7021);result.addAll(getDataPropertyAssertionAxioms(individual));
            __CLR4_5_24wb4wblviclftm.R.inc(7022);result.addAll(getNegativeObjectPropertyAssertionAxioms(individual));
            __CLR4_5_24wb4wblviclftm.R.inc(7023);result.addAll(getNegativeDataPropertyAssertionAxioms(individual));
            __CLR4_5_24wb4wblviclftm.R.inc(7024);result.addAll(getSameIndividualAxioms(individual));
            __CLR4_5_24wb4wblviclftm.R.inc(7025);result.addAll(getDifferentIndividualAxioms(individual));
        } }else {{
            __CLR4_5_24wb4wblviclftm.R.inc(7026);for (OWLOntology o : getImportsClosure()) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7027);result.addAll(o.getAxioms(individual, EXCLUDED));
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(7028);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDatatypeDefinitionAxiom> getAxioms(OWLDatatype datatype, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7029);
        __CLR4_5_24wb4wblviclftm.R.inc(7030);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(7031)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7032)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7033);return getDatatypeDefinitions(datatype);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(7034);Set<OWLDatatypeDefinitionAxiom> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(7035);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7036);result.addAll(o.getAxioms(datatype, EXCLUDED));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(7037);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getReferencingAxioms(OWLPrimitive owlEntity) {try{__CLR4_5_24wb4wblviclftm.R.inc(7038);
        __CLR4_5_24wb4wblviclftm.R.inc(7039);return getReferencingAxioms(owlEntity, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getReferencingAxioms(OWLPrimitive owlEntity, boolean includeImports) {try{__CLR4_5_24wb4wblviclftm.R.inc(7040);
        __CLR4_5_24wb4wblviclftm.R.inc(7041);return getReferencingAxioms(owlEntity, Imports.fromBoolean(includeImports));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAxiom> getReferencingAxioms(OWLPrimitive owlEntity, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7042);
        __CLR4_5_24wb4wblviclftm.R.inc(7043);if ((((owlEntity instanceof OWLEntity)&&(__CLR4_5_24wb4wblviclftm.R.iget(7044)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7045)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7046);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(7047)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7048)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7049);return asSet(ints.getReferencingAxioms((OWLEntity) owlEntity));
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(7050);Set<OWLAxiom> result = createLinkedSet();
            __CLR4_5_24wb4wblviclftm.R.inc(7051);for (OWLOntology ont : getImportsClosure()) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7052);result.addAll(ont.getReferencingAxioms(owlEntity, EXCLUDED));
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(7053);return result;
        } }else {__CLR4_5_24wb4wblviclftm.R.inc(7054);if ((((owlEntity instanceof OWLAnonymousIndividual)&&(__CLR4_5_24wb4wblviclftm.R.iget(7055)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7056)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7057);return asSet(ints.get(OWLAnonymousIndividual.class, OWLAxiom.class).get().getValues(
                (OWLAnonymousIndividual) owlEntity));
        } }else {__CLR4_5_24wb4wblviclftm.R.inc(7058);if ((((owlEntity instanceof IRI)&&(__CLR4_5_24wb4wblviclftm.R.iget(7059)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7060)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7061);Set<OWLAxiom> axioms = new HashSet<>();
            // axioms referring entities with this IRI, data property assertions
            // with IRI as subject, annotations with IRI as subject or object.
            __CLR4_5_24wb4wblviclftm.R.inc(7062);Set<OWLEntity> entities = getEntitiesInSignature((IRI) owlEntity, includeImportsClosure);
            __CLR4_5_24wb4wblviclftm.R.inc(7063);for (OWLEntity e : entities) {{
                assert (((e != null)&&(__CLR4_5_24wb4wblviclftm.R.iget(7064)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7065)==0&false));
                __CLR4_5_24wb4wblviclftm.R.inc(7066);axioms.addAll(getReferencingAxioms(e, includeImportsClosure));
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(7067);for (OWLDataPropertyAssertionAxiom ax : getAxioms(AxiomType.DATA_PROPERTY_ASSERTION)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7068);if ((((ax.getObject().getDatatype().getIRI().equals(OWL2Datatype.XSD_ANY_URI.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(7069)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7070)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(7071);if ((((ax.getObject().getLiteral().equals(owlEntity.toString()))&&(__CLR4_5_24wb4wblviclftm.R.iget(7072)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7073)==0&false))) {{
                        __CLR4_5_24wb4wblviclftm.R.inc(7074);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(7075);for (OWLAnnotationAssertionAxiom ax : getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7076);if ((((ax.getSubject().equals(owlEntity))&&(__CLR4_5_24wb4wblviclftm.R.iget(7077)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7078)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(7079);axioms.add(ax);
                } }else {__CLR4_5_24wb4wblviclftm.R.inc(7080);if ((((ax.getValue().asLiteral().isPresent())&&(__CLR4_5_24wb4wblviclftm.R.iget(7081)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7082)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(7083);Optional<OWLLiteral> lit = ax.getValue().asLiteral();
                    __CLR4_5_24wb4wblviclftm.R.inc(7084);if ((((lit.get().getDatatype().getIRI().equals(OWL2Datatype.XSD_ANY_URI.getIRI()))&&(__CLR4_5_24wb4wblviclftm.R.iget(7085)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7086)==0&false))) {{
                        __CLR4_5_24wb4wblviclftm.R.inc(7087);if ((((lit.get().getLiteral().equals(owlEntity.toString()))&&(__CLR4_5_24wb4wblviclftm.R.iget(7088)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7089)==0&false))) {{
                            __CLR4_5_24wb4wblviclftm.R.inc(7090);axioms.add(ax);
                        }
                    }}
                }}
            }}}
            }__CLR4_5_24wb4wblviclftm.R.inc(7091);return axioms;
        } }else {__CLR4_5_24wb4wblviclftm.R.inc(7092);if ((((owlEntity instanceof OWLLiteral)&&(__CLR4_5_24wb4wblviclftm.R.iget(7093)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7094)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7095);Set<OWLAxiom> axioms = new HashSet<>();
            __CLR4_5_24wb4wblviclftm.R.inc(7096);for (OWLDataPropertyAssertionAxiom ax : getAxioms(AxiomType.DATA_PROPERTY_ASSERTION)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7097);if ((((ax.getObject().equals(owlEntity))&&(__CLR4_5_24wb4wblviclftm.R.iget(7098)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7099)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(7100);axioms.add(ax);
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(7101);for (OWLAnnotationAssertionAxiom ax : getAxioms(AxiomType.ANNOTATION_ASSERTION)) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7102);if ((((owlEntity.equals(ax.getValue().asLiteral().orNull()))&&(__CLR4_5_24wb4wblviclftm.R.iget(7103)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7104)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(7105);axioms.add(ax);
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(7106);for (AxiomType<?> t : AxiomType.AXIOM_TYPES) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7107);for (OWLAxiom ax : getAxioms(t)) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(7108);if ((((hasLiteralInAnnotations(owlEntity, ax))&&(__CLR4_5_24wb4wblviclftm.R.iget(7109)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7110)==0&false))) {{
                        __CLR4_5_24wb4wblviclftm.R.inc(7111);axioms.add(ax);
                    }
                }}
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(7112);return axioms;
        }
        }}}}__CLR4_5_24wb4wblviclftm.R.inc(7113);return CollectionFactory.emptySet();
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    protected boolean hasLiteralInAnnotations(OWLPrimitive owlEntity, OWLAxiom ax) {try{__CLR4_5_24wb4wblviclftm.R.inc(7114);
        __CLR4_5_24wb4wblviclftm.R.inc(7115);for (OWLAnnotation ann : ax.getAnnotations()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7116);if ((((ann.getValue().equals(owlEntity))&&(__CLR4_5_24wb4wblviclftm.R.iget(7117)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7118)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7119);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(7120);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    // OWLAxiomIndex
    @Override
    public <A extends OWLAxiom> Set<A> getAxioms(@Nonnull Class<A> type, @Nonnull OWLObject entity,
        Imports includeImports, Navigation forSubPosition) {try{__CLR4_5_24wb4wblviclftm.R.inc(7121);
        __CLR4_5_24wb4wblviclftm.R.inc(7122);if ((((includeImports == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(7123)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7124)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7125);return getAxioms(type, entity.getClass(), entity, EXCLUDED, forSubPosition);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(7126);Set<A> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(7127);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7128);result.addAll(o.getAxioms(type, entity, EXCLUDED, forSubPosition));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(7129);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    @SuppressWarnings("unchecked")
    public <A extends OWLAxiom> Set<A> getAxioms(@Nonnull Class<A> type,
        @Nonnull Class<? extends OWLObject> explicitClass, @Nonnull OWLObject entity, @Nonnull Imports includeImports,
        @Nonnull Navigation forSubPosition) {try{__CLR4_5_24wb4wblviclftm.R.inc(7130);
        __CLR4_5_24wb4wblviclftm.R.inc(7131);if ((((includeImports == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(7132)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7133)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7134);Optional<MapPointer<OWLObject, A>> optional = ints.get((Class<OWLObject>) explicitClass, type,
                forSubPosition);
            __CLR4_5_24wb4wblviclftm.R.inc(7135);if ((((optional.isPresent())&&(__CLR4_5_24wb4wblviclftm.R.iget(7136)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7137)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7138);return asSet(optional.get().getValues(entity));
            }
            }__CLR4_5_24wb4wblviclftm.R.inc(7139);Set<A> toReturn = new HashSet<>();
            __CLR4_5_24wb4wblviclftm.R.inc(7140);for (A ax : getAxioms(AxiomType.getTypeForClass(type))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7141);if ((((ax.getSignature().contains(entity))&&(__CLR4_5_24wb4wblviclftm.R.iget(7142)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7143)==0&false))) {{
                    __CLR4_5_24wb4wblviclftm.R.inc(7144);toReturn.add(ax);
                }
            }}
            }__CLR4_5_24wb4wblviclftm.R.inc(7145);return toReturn;
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(7146);Set<A> result = createLinkedSet();
        __CLR4_5_24wb4wblviclftm.R.inc(7147);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7148);result.addAll(o.getAxioms(type, entity, EXCLUDED, forSubPosition));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(7149);return result;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Nonnull
    @SuppressWarnings("unchecked")
    @Override
    public <T extends OWLAxiom> Collection<T> filterAxioms(@Nonnull OWLAxiomSearchFilter filter, @Nonnull Object key,
        Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7150);
        __CLR4_5_24wb4wblviclftm.R.inc(7151);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(7152)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7153)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7154);return (Collection<T>) ints.filterAxioms(filter, key);
        }
        // iterating over the import closure; using a set because there might be
        // duplicate axioms
        }__CLR4_5_24wb4wblviclftm.R.inc(7155);Set<T> toReturn = new HashSet<>();
        __CLR4_5_24wb4wblviclftm.R.inc(7156);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7157);toReturn.addAll((Collection<T>) o.filterAxioms(filter, key, EXCLUDED));
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(7158);return toReturn;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean contains(@Nonnull OWLAxiomSearchFilter filter, @Nonnull Object key, Imports includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7159);
        __CLR4_5_24wb4wblviclftm.R.inc(7160);if ((((includeImportsClosure == EXCLUDED)&&(__CLR4_5_24wb4wblviclftm.R.iget(7161)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7162)==0&false))) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7163);return ints.contains(filter, key);
        }
        }__CLR4_5_24wb4wblviclftm.R.inc(7164);for (OWLOntology o : getImportsClosure()) {{
            __CLR4_5_24wb4wblviclftm.R.inc(7165);if ((((o.contains(filter, key, EXCLUDED))&&(__CLR4_5_24wb4wblviclftm.R.iget(7166)!=0|true))||(__CLR4_5_24wb4wblviclftm.R.iget(7167)==0&false))) {{
                __CLR4_5_24wb4wblviclftm.R.inc(7168);return true;
            }
        }}
        }__CLR4_5_24wb4wblviclftm.R.inc(7169);return false;
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLClassAxiom> getAxioms(OWLClass cls) {try{__CLR4_5_24wb4wblviclftm.R.inc(7170);
        __CLR4_5_24wb4wblviclftm.R.inc(7171);return getAxioms(cls, false);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLObjectPropertyAxiom> getAxioms(OWLObjectPropertyExpression property) {try{__CLR4_5_24wb4wblviclftm.R.inc(7172);
        __CLR4_5_24wb4wblviclftm.R.inc(7173);return getAxioms(property, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDataPropertyAxiom> getAxioms(OWLDataProperty property) {try{__CLR4_5_24wb4wblviclftm.R.inc(7174);
        __CLR4_5_24wb4wblviclftm.R.inc(7175);return getAxioms(property, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLIndividualAxiom> getAxioms(OWLIndividual individual) {try{__CLR4_5_24wb4wblviclftm.R.inc(7176);
        __CLR4_5_24wb4wblviclftm.R.inc(7177);return getAxioms(individual, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationAxiom> getAxioms(OWLAnnotationProperty property) {try{__CLR4_5_24wb4wblviclftm.R.inc(7178);
        __CLR4_5_24wb4wblviclftm.R.inc(7179);return getAxioms(property, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDatatypeDefinitionAxiom> getAxioms(OWLDatatype datatype) {try{__CLR4_5_24wb4wblviclftm.R.inc(7180);
        __CLR4_5_24wb4wblviclftm.R.inc(7181);return getAxioms(datatype, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLClassAxiom> getAxioms(OWLClass cls, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7182);
        __CLR4_5_24wb4wblviclftm.R.inc(7183);return getAxioms(cls, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLObjectPropertyAxiom> getAxioms(OWLObjectPropertyExpression property, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7184);
        __CLR4_5_24wb4wblviclftm.R.inc(7185);return getAxioms(property, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDataPropertyAxiom> getAxioms(OWLDataProperty property, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7186);
        __CLR4_5_24wb4wblviclftm.R.inc(7187);return getAxioms(property, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLIndividualAxiom> getAxioms(OWLIndividual individual, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7188);
        __CLR4_5_24wb4wblviclftm.R.inc(7189);return getAxioms(individual, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationAxiom> getAxioms(OWLAnnotationProperty property, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7190);
        __CLR4_5_24wb4wblviclftm.R.inc(7191);return getAxioms(property, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDatatypeDefinitionAxiom> getAxioms(OWLDatatype datatype, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7192);
        __CLR4_5_24wb4wblviclftm.R.inc(7193);return getAxioms(datatype, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void saveOntology() throws OWLOntologyStorageException {try{__CLR4_5_24wb4wblviclftm.R.inc(7194);
        __CLR4_5_24wb4wblviclftm.R.inc(7195);getOWLOntologyManager().saveOntology(this);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void saveOntology(IRI documentIRI) throws OWLOntologyStorageException {try{__CLR4_5_24wb4wblviclftm.R.inc(7196);
        __CLR4_5_24wb4wblviclftm.R.inc(7197);getOWLOntologyManager().saveOntology(this, documentIRI);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void saveOntology(OutputStream outputStream) throws OWLOntologyStorageException {try{__CLR4_5_24wb4wblviclftm.R.inc(7198);
        __CLR4_5_24wb4wblviclftm.R.inc(7199);getOWLOntologyManager().saveOntology(this, outputStream);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLDocumentFormat ontologyFormat) throws OWLOntologyStorageException {try{__CLR4_5_24wb4wblviclftm.R.inc(7200);
        __CLR4_5_24wb4wblviclftm.R.inc(7201);getOWLOntologyManager().saveOntology(this, ontologyFormat);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLDocumentFormat ontologyFormat, IRI documentIRI) throws OWLOntologyStorageException {try{__CLR4_5_24wb4wblviclftm.R.inc(7202);
        __CLR4_5_24wb4wblviclftm.R.inc(7203);getOWLOntologyManager().saveOntology(this, ontologyFormat, documentIRI);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLDocumentFormat ontologyFormat, OutputStream outputStream)
        throws OWLOntologyStorageException {try{__CLR4_5_24wb4wblviclftm.R.inc(7204);
        __CLR4_5_24wb4wblviclftm.R.inc(7205);getOWLOntologyManager().saveOntology(this, ontologyFormat, outputStream);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLOntologyDocumentTarget documentTarget) throws OWLOntologyStorageException {try{__CLR4_5_24wb4wblviclftm.R.inc(7206);
        __CLR4_5_24wb4wblviclftm.R.inc(7207);getOWLOntologyManager().saveOntology(this, documentTarget);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLDocumentFormat ontologyFormat, OWLOntologyDocumentTarget documentTarget)
        throws OWLOntologyStorageException {try{__CLR4_5_24wb4wblviclftm.R.inc(7208);
        __CLR4_5_24wb4wblviclftm.R.inc(7209);getOWLOntologyManager().saveOntology(this, ontologyFormat, documentTarget);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsDatatypeInSignature(IRI owlDatatypeIRI) {try{__CLR4_5_24wb4wblviclftm.R.inc(7210);
        __CLR4_5_24wb4wblviclftm.R.inc(7211);return containsDatatypeInSignature(owlDatatypeIRI, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(IRI entityIRI) {try{__CLR4_5_24wb4wblviclftm.R.inc(7212);
        __CLR4_5_24wb4wblviclftm.R.inc(7213);return containsEntityInSignature(entityIRI, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsClassInSignature(IRI owlClassIRI) {try{__CLR4_5_24wb4wblviclftm.R.inc(7214);
        __CLR4_5_24wb4wblviclftm.R.inc(7215);return containsClassInSignature(owlClassIRI, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsObjectPropertyInSignature(IRI owlObjectPropertyIRI) {try{__CLR4_5_24wb4wblviclftm.R.inc(7216);
        __CLR4_5_24wb4wblviclftm.R.inc(7217);return containsObjectPropertyInSignature(owlObjectPropertyIRI, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsDataPropertyInSignature(IRI owlDataPropertyIRI) {try{__CLR4_5_24wb4wblviclftm.R.inc(7218);
        __CLR4_5_24wb4wblviclftm.R.inc(7219);return containsDataPropertyInSignature(owlDataPropertyIRI, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsAnnotationPropertyInSignature(IRI owlAnnotationPropertyIRI) {try{__CLR4_5_24wb4wblviclftm.R.inc(7220);
        __CLR4_5_24wb4wblviclftm.R.inc(7221);return containsAnnotationPropertyInSignature(owlAnnotationPropertyIRI, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsIndividualInSignature(IRI owlIndividualIRI) {try{__CLR4_5_24wb4wblviclftm.R.inc(7222);
        __CLR4_5_24wb4wblviclftm.R.inc(7223);return containsIndividualInSignature(owlIndividualIRI, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsReference(OWLEntity entity) {try{__CLR4_5_24wb4wblviclftm.R.inc(7224);
        __CLR4_5_24wb4wblviclftm.R.inc(7225);return containsReference(entity, EXCLUDED);
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLClass> getClassesInSignature(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7226);
        __CLR4_5_24wb4wblviclftm.R.inc(7227);return getClassesInSignature(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLObjectProperty> getObjectPropertiesInSignature(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7228);
        __CLR4_5_24wb4wblviclftm.R.inc(7229);return getObjectPropertiesInSignature(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDataProperty> getDataPropertiesInSignature(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7230);
        __CLR4_5_24wb4wblviclftm.R.inc(7231);return getDataPropertiesInSignature(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLNamedIndividual> getIndividualsInSignature(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7232);
        __CLR4_5_24wb4wblviclftm.R.inc(7233);return getIndividualsInSignature(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAnonymousIndividual> getReferencedAnonymousIndividuals(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7234);
        __CLR4_5_24wb4wblviclftm.R.inc(7235);return getReferencedAnonymousIndividuals(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLDatatype> getDatatypesInSignature(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7236);
        __CLR4_5_24wb4wblviclftm.R.inc(7237);return getDatatypesInSignature(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature(boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7238);
        __CLR4_5_24wb4wblviclftm.R.inc(7239);return getAnnotationPropertiesInSignature(Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(OWLEntity owlEntity, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7240);
        __CLR4_5_24wb4wblviclftm.R.inc(7241);return containsEntityInSignature(owlEntity, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(IRI entityIRI, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7242);
        __CLR4_5_24wb4wblviclftm.R.inc(7243);return containsEntityInSignature(entityIRI, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsClassInSignature(IRI owlClassIRI, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7244);
        __CLR4_5_24wb4wblviclftm.R.inc(7245);return containsClassInSignature(owlClassIRI, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsObjectPropertyInSignature(IRI owlObjectPropertyIRI, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7246);
        __CLR4_5_24wb4wblviclftm.R.inc(7247);return containsObjectPropertyInSignature(owlObjectPropertyIRI, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsDataPropertyInSignature(IRI owlDataPropertyIRI, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7248);
        __CLR4_5_24wb4wblviclftm.R.inc(7249);return containsDataPropertyInSignature(owlDataPropertyIRI, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsAnnotationPropertyInSignature(IRI owlAnnotationPropertyIRI, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7250);
        __CLR4_5_24wb4wblviclftm.R.inc(7251);return containsAnnotationPropertyInSignature(owlAnnotationPropertyIRI, Imports.fromBoolean(
            includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsDatatypeInSignature(IRI owlDatatypeIRI, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7252);
        __CLR4_5_24wb4wblviclftm.R.inc(7253);return containsDatatypeInSignature(owlDatatypeIRI, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsIndividualInSignature(IRI owlIndividualIRI, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7254);
        __CLR4_5_24wb4wblviclftm.R.inc(7255);return containsIndividualInSignature(owlIndividualIRI, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getEntitiesInSignature(IRI iri, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7256);
        __CLR4_5_24wb4wblviclftm.R.inc(7257);return getEntitiesInSignature(iri, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}

    @Override
    public boolean containsReference(OWLEntity entity, boolean includeImportsClosure) {try{__CLR4_5_24wb4wblviclftm.R.inc(7258);
        __CLR4_5_24wb4wblviclftm.R.inc(7259);return containsReference(entity, Imports.fromBoolean(includeImportsClosure));
    }finally{__CLR4_5_24wb4wblviclftm.R.flushNeeded();}}
}
