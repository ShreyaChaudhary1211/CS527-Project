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

import java.util.*;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

/**
 * Replaces a literal with another.
 * 
 * @author Ignazio Palmisano
 * @since 4.1.4
 */
public class OWLLiteralReplacer {public static class __CLR4_5_28l18l1lvickr77{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,11162,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OWLOntologyManager owlOntologyManager;
    private final Set<OWLOntology> ontologies;

    /**
     * @param owlOntologyManager
     *        the ontology manager to use
     * @param ontologies
     *        the ontologies to use
     */
    public OWLLiteralReplacer(@Nonnull OWLOntologyManager owlOntologyManager, @Nonnull Set<OWLOntology> ontologies) {try{__CLR4_5_28l18l1lvickr77.R.inc(11125);
        __CLR4_5_28l18l1lvickr77.R.inc(11126);this.owlOntologyManager = checkNotNull(owlOntologyManager, "owlOntologyManager cannot be null");
        __CLR4_5_28l18l1lvickr77.R.inc(11127);this.ontologies = checkNotNull(ontologies, "ontologies cannot be null");
    }finally{__CLR4_5_28l18l1lvickr77.R.flushNeeded();}}

    /**
     * Changes a literal for another literal. This creates the appropriate
     * changes to be applied.
     * 
     * @param literal
     *        The literal to be changed
     * @param newLiteral
     *        The literal to use in replacements.
     * @return A list of ontology changes that should be applied.
     */
    @Nonnull
    public List<OWLOntologyChange> changeLiteral(@Nonnull OWLLiteral literal, @Nonnull OWLLiteral newLiteral) {try{__CLR4_5_28l18l1lvickr77.R.inc(11128);
        __CLR4_5_28l18l1lvickr77.R.inc(11129);checkNotNull(literal, "literal cannot be null");
        __CLR4_5_28l18l1lvickr77.R.inc(11130);checkNotNull(newLiteral, "newLiteral cannot be null");
        __CLR4_5_28l18l1lvickr77.R.inc(11131);Map<OWLLiteral, OWLLiteral> uriMap = new HashMap<>();
        __CLR4_5_28l18l1lvickr77.R.inc(11132);uriMap.put(literal, newLiteral);
        __CLR4_5_28l18l1lvickr77.R.inc(11133);List<OWLOntologyChange> changes = new ArrayList<>();
        __CLR4_5_28l18l1lvickr77.R.inc(11134);OWLObjectDuplicator dup = new OWLObjectDuplicator(owlOntologyManager.getOWLDataFactory(), Collections
            .<IRI, IRI> emptyMap(), uriMap);
        __CLR4_5_28l18l1lvickr77.R.inc(11135);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_28l18l1lvickr77.R.iget(11136)!=0|true))||(__CLR4_5_28l18l1lvickr77.R.iget(11137)==0&false));
            __CLR4_5_28l18l1lvickr77.R.inc(11138);fillListWithTransformChanges(changes, getAxioms(ont, literal), ont, dup);
        }
        }__CLR4_5_28l18l1lvickr77.R.inc(11139);return changes;
    }finally{__CLR4_5_28l18l1lvickr77.R.flushNeeded();}}

    /**
     * @param literalToLiteralMap
     *        map of literals to change
     * @return list of changes
     */
    public List<OWLOntologyChange> changeLiterals(@Nonnull Map<OWLLiteral, OWLLiteral> literalToLiteralMap) {try{__CLR4_5_28l18l1lvickr77.R.inc(11140);
        __CLR4_5_28l18l1lvickr77.R.inc(11141);List<OWLOntologyChange> changes = new ArrayList<>();
        __CLR4_5_28l18l1lvickr77.R.inc(11142);OWLObjectDuplicator duplicator = new OWLObjectDuplicator(Collections.<OWLEntity, IRI> emptyMap(),
            owlOntologyManager.getOWLDataFactory(), literalToLiteralMap);
        __CLR4_5_28l18l1lvickr77.R.inc(11143);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_28l18l1lvickr77.R.iget(11144)!=0|true))||(__CLR4_5_28l18l1lvickr77.R.iget(11145)==0&false));
            __CLR4_5_28l18l1lvickr77.R.inc(11146);for (OWLLiteral ent : literalToLiteralMap.keySet()) {{
                assert (((ent != null)&&(__CLR4_5_28l18l1lvickr77.R.iget(11147)!=0|true))||(__CLR4_5_28l18l1lvickr77.R.iget(11148)==0&false));
                __CLR4_5_28l18l1lvickr77.R.inc(11149);fillListWithTransformChanges(changes, getAxioms(ont, ent), ont, duplicator);
            }
        }}
        }__CLR4_5_28l18l1lvickr77.R.inc(11150);return changes;
    }finally{__CLR4_5_28l18l1lvickr77.R.flushNeeded();}}

    private static Set<OWLAxiom> getAxioms(@Nonnull OWLOntology ont, @Nonnull OWLLiteral entity) {try{__CLR4_5_28l18l1lvickr77.R.inc(11151);
        __CLR4_5_28l18l1lvickr77.R.inc(11152);Set<OWLAxiom> axioms = ont.getReferencingAxioms(entity, EXCLUDED);
        __CLR4_5_28l18l1lvickr77.R.inc(11153);axioms.addAll(ont.getDeclarationAxioms(entity.getDatatype()));
        __CLR4_5_28l18l1lvickr77.R.inc(11154);return axioms;
    }finally{__CLR4_5_28l18l1lvickr77.R.flushNeeded();}}

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
    private static void fillListWithTransformChanges(List<OWLOntologyChange> changes, Set<OWLAxiom> axioms,
        @Nonnull OWLOntology ont, OWLObjectDuplicator duplicator) {try{__CLR4_5_28l18l1lvickr77.R.inc(11155);
        __CLR4_5_28l18l1lvickr77.R.inc(11156);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_28l18l1lvickr77.R.iget(11157)!=0|true))||(__CLR4_5_28l18l1lvickr77.R.iget(11158)==0&false));
            __CLR4_5_28l18l1lvickr77.R.inc(11159);changes.add(new RemoveAxiom(ont, ax));
            __CLR4_5_28l18l1lvickr77.R.inc(11160);OWLAxiom dupAx = duplicator.duplicateObject(ax);
            __CLR4_5_28l18l1lvickr77.R.inc(11161);changes.add(new AddAxiom(ont, dupAx));
        }
    }}finally{__CLR4_5_28l18l1lvickr77.R.flushNeeded();}}
}
