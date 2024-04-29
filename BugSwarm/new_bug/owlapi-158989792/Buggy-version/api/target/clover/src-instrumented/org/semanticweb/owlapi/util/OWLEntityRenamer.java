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

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 * Renames entities that have a particular IRI. Entities with the specified IRI
 * are renamed regardless of whether they are classes, object properties, data
 * properties, individuals or data types.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLEntityRenamer {public static class __CLR4_5_28eq8eqlvickr2d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,10956,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OWLOntologyManager owlOntologyManager;
    private final Set<OWLOntology> ontologies;

    /**
     * @param owlOntologyManager
     *        the ontology manager to use
     * @param ontologies
     *        the ontologies to use
     */
    public OWLEntityRenamer(@Nonnull OWLOntologyManager owlOntologyManager,
            @Nonnull Set<OWLOntology> ontologies) {try{__CLR4_5_28eq8eqlvickr2d.R.inc(10898);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10899);this.owlOntologyManager = checkNotNull(owlOntologyManager,
                "owlOntologyManager cannot be null");
        __CLR4_5_28eq8eqlvickr2d.R.inc(10900);this.ontologies = checkNotNull(ontologies, "ontologies cannot be null");
    }finally{__CLR4_5_28eq8eqlvickr2d.R.flushNeeded();}}

    /**
     * Changes a IRI for another IRI. This creates the appropriate changes to be
     * applied in order to change a IRI.
     * 
     * @param iri
     *        The IRI to be changed
     * @param newIRI
     *        The IRI that the IRI should be changed to.
     * @return A list of ontology changes that should be applied to change the
     *         specified IRI.
     */
    @Nonnull
    public List<OWLOntologyChange> changeIRI(@Nonnull IRI iri,
            @Nonnull IRI newIRI) {try{__CLR4_5_28eq8eqlvickr2d.R.inc(10901);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10902);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_28eq8eqlvickr2d.R.inc(10903);checkNotNull(newIRI, "newIRI cannot be null");
        __CLR4_5_28eq8eqlvickr2d.R.inc(10904);Map<IRI, IRI> uriMap = new HashMap<>();
        __CLR4_5_28eq8eqlvickr2d.R.inc(10905);uriMap.put(iri, newIRI);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10906);List<OWLOntologyChange> changes = new ArrayList<>();
        __CLR4_5_28eq8eqlvickr2d.R.inc(10907);OWLObjectDuplicator dup = new OWLObjectDuplicator(
                owlOntologyManager.getOWLDataFactory(), uriMap);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10908);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_28eq8eqlvickr2d.R.iget(10909)!=0|true))||(__CLR4_5_28eq8eqlvickr2d.R.iget(10910)==0&false));
            __CLR4_5_28eq8eqlvickr2d.R.inc(10911);fillListWithTransformChanges(changes, getAxioms(ont, iri), ont, dup);
        }
        }__CLR4_5_28eq8eqlvickr2d.R.inc(10912);return changes;
    }finally{__CLR4_5_28eq8eqlvickr2d.R.flushNeeded();}}

    /**
     * Changes the IRI of an entity for another IRI.
     * 
     * @param entity
     *        The entity whose IRI is to be changed.
     * @param newIRI
     *        The new IRI
     * @return A list of ontology changes that should be applied to change the
     *         specified entity IRI.
     */
    @Nonnull
    public List<OWLOntologyChange> changeIRI(@Nonnull OWLEntity entity,
            @Nonnull IRI newIRI) {try{__CLR4_5_28eq8eqlvickr2d.R.inc(10913);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10914);Map<OWLEntity, IRI> iriMap = new HashMap<>();
        __CLR4_5_28eq8eqlvickr2d.R.inc(10915);iriMap.put(entity, newIRI);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10916);List<OWLOntologyChange> changes = new ArrayList<>();
        __CLR4_5_28eq8eqlvickr2d.R.inc(10917);OWLObjectDuplicator duplicator = new OWLObjectDuplicator(iriMap,
                owlOntologyManager.getOWLDataFactory());
        __CLR4_5_28eq8eqlvickr2d.R.inc(10918);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_28eq8eqlvickr2d.R.iget(10919)!=0|true))||(__CLR4_5_28eq8eqlvickr2d.R.iget(10920)==0&false));
            __CLR4_5_28eq8eqlvickr2d.R.inc(10921);fillListWithTransformChanges(changes, getAxioms(ont, entity), ont,
                    duplicator);
        }
        }__CLR4_5_28eq8eqlvickr2d.R.inc(10922);return changes;
    }finally{__CLR4_5_28eq8eqlvickr2d.R.flushNeeded();}}

    /**
     * @param entity2IRIMap
     *        map of IRIs to rename
     * @return list of changes
     */
    public List<OWLOntologyChange> changeIRI(
            @Nonnull Map<OWLEntity, IRI> entity2IRIMap) {try{__CLR4_5_28eq8eqlvickr2d.R.inc(10923);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10924);List<OWLOntologyChange> changes = new ArrayList<>();
        __CLR4_5_28eq8eqlvickr2d.R.inc(10925);OWLObjectDuplicator duplicator = new OWLObjectDuplicator(entity2IRIMap,
                owlOntologyManager.getOWLDataFactory());
        __CLR4_5_28eq8eqlvickr2d.R.inc(10926);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_28eq8eqlvickr2d.R.iget(10927)!=0|true))||(__CLR4_5_28eq8eqlvickr2d.R.iget(10928)==0&false));
            __CLR4_5_28eq8eqlvickr2d.R.inc(10929);for (OWLEntity ent : entity2IRIMap.keySet()) {{
                assert (((ent != null)&&(__CLR4_5_28eq8eqlvickr2d.R.iget(10930)!=0|true))||(__CLR4_5_28eq8eqlvickr2d.R.iget(10931)==0&false));
                __CLR4_5_28eq8eqlvickr2d.R.inc(10932);fillListWithTransformChanges(changes, getAxioms(ont, ent), ont,
                        duplicator);
            }
        }}
        }__CLR4_5_28eq8eqlvickr2d.R.inc(10933);return changes;
    }finally{__CLR4_5_28eq8eqlvickr2d.R.flushNeeded();}}

    private static Set<OWLAxiom> getAxioms(@Nonnull OWLOntology ont,
            @Nonnull OWLEntity entity) {try{__CLR4_5_28eq8eqlvickr2d.R.inc(10934);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10935);Set<OWLAxiom> axioms = ont.getReferencingAxioms(entity, EXCLUDED);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10936);axioms.addAll(ont.getDeclarationAxioms(entity));
        __CLR4_5_28eq8eqlvickr2d.R.inc(10937);axioms.addAll(ont.getAnnotationAssertionAxioms(entity.getIRI()));
        __CLR4_5_28eq8eqlvickr2d.R.inc(10938);return axioms;
    }finally{__CLR4_5_28eq8eqlvickr2d.R.flushNeeded();}}

    private Set<OWLAxiom> getAxioms(@Nonnull OWLOntology ont, @Nonnull IRI iri) {try{__CLR4_5_28eq8eqlvickr2d.R.inc(10939);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10940);Set<OWLAxiom> axioms = new HashSet<>();
        __CLR4_5_28eq8eqlvickr2d.R.inc(10941);axioms.addAll(ont.getReferencingAxioms(owlOntologyManager
                .getOWLDataFactory().getOWLClass(iri), EXCLUDED));
        __CLR4_5_28eq8eqlvickr2d.R.inc(10942);axioms.addAll(ont.getReferencingAxioms(owlOntologyManager
                .getOWLDataFactory().getOWLObjectProperty(iri), EXCLUDED));
        __CLR4_5_28eq8eqlvickr2d.R.inc(10943);axioms.addAll(ont.getReferencingAxioms(owlOntologyManager
                .getOWLDataFactory().getOWLDataProperty(iri), EXCLUDED));
        __CLR4_5_28eq8eqlvickr2d.R.inc(10944);axioms.addAll(ont.getReferencingAxioms(owlOntologyManager
                .getOWLDataFactory().getOWLNamedIndividual(iri), EXCLUDED));
        __CLR4_5_28eq8eqlvickr2d.R.inc(10945);axioms.addAll(ont.getReferencingAxioms(owlOntologyManager
                .getOWLDataFactory().getOWLDatatype(iri), EXCLUDED));
        __CLR4_5_28eq8eqlvickr2d.R.inc(10946);axioms.addAll(ont.getReferencingAxioms(owlOntologyManager
                .getOWLDataFactory().getOWLAnnotationProperty(iri), EXCLUDED));
        __CLR4_5_28eq8eqlvickr2d.R.inc(10947);axioms.addAll(ont.getAnnotationAssertionAxioms(iri));
        __CLR4_5_28eq8eqlvickr2d.R.inc(10948);return axioms;
    }finally{__CLR4_5_28eq8eqlvickr2d.R.flushNeeded();}}

    /**
     * Fills a list with ontology changes which will replace a set of axioms
     * with duplicated/transformed axioms.
     * 
     * @param changes
     *        A list that will be filled with ontology changes which will remove
     *        the specified axioms from the specified ontology, and add the
     *        duplicated/transformed version
     * @param axioms
     *        The axioms to be duplicated/transformed
     * @param ont
     *        The ontology to which the changed should be applied
     * @param duplicator
     *        The duplicator that will do the duplicating
     */
    private static void fillListWithTransformChanges(
            List<OWLOntologyChange> changes, Set<OWLAxiom> axioms,
            @Nonnull OWLOntology ont, OWLObjectDuplicator duplicator) {try{__CLR4_5_28eq8eqlvickr2d.R.inc(10949);
        __CLR4_5_28eq8eqlvickr2d.R.inc(10950);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_28eq8eqlvickr2d.R.iget(10951)!=0|true))||(__CLR4_5_28eq8eqlvickr2d.R.iget(10952)==0&false));
            __CLR4_5_28eq8eqlvickr2d.R.inc(10953);changes.add(new RemoveAxiom(ont, ax));
            __CLR4_5_28eq8eqlvickr2d.R.inc(10954);OWLAxiom dupAx = duplicator.duplicateObject(ax);
            __CLR4_5_28eq8eqlvickr2d.R.inc(10955);changes.add(new AddAxiom(ont, dupAx));
        }
    }}finally{__CLR4_5_28eq8eqlvickr2d.R.flushNeeded();}}
}
