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
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEntityVisitor;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 * A convenience object that generates the changes which are necessary to remove
 * an entity from a set of ontologies. This is accomplished by removing all
 * axioms that refer to the entity. The entity remover follows the visitor
 * design pattern, entities that need to be removed from an ontology should
 * accept visits from the entity remover. Changes are accumulated as the entity
 * remover visits various entities.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLEntityRemover implements OWLEntityVisitor {public static class __CLR4_5_28dv8dvlvickr1o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,10898,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final List<RemoveAxiom> changes = new ArrayList<>();
    @Nonnull
    private final Collection<OWLOntology> ontologies;

    /**
     * Creates an entity remover, which will remove entities (axioms referring
     * to the entities from the specified ontologies).
     * 
     * @param ontologies
     *        The set of ontologies that contain references to axioms to be
     *        removed.
     */
    public OWLEntityRemover(@Nonnull Set<OWLOntology> ontologies) {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10867);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10868);this.ontologies = new ArrayList<>(checkNotNull(ontologies,
                "ontologies cannot be null"));
    }finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}

    /**
     * @return the list of ontology changes that are required in order to remove
     *         visited entities from the set of ontologies.
     */
    @Nonnull
    public List<RemoveAxiom> getChanges() {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10869);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10870);return new ArrayList<>(changes);
    }finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}

    /**
     * Clears any changes which have accumulated over the course of visiting
     * different entities.
     */
    public void reset() {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10871);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10872);changes.clear();
    }finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}

    private void generateChanges(@Nonnull OWLEntity entity) {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10873);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10874);checkNotNull(entity, "entity cannot be null");
        __CLR4_5_28dv8dvlvickr1o.R.inc(10875);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_28dv8dvlvickr1o.R.iget(10876)!=0|true))||(__CLR4_5_28dv8dvlvickr1o.R.iget(10877)==0&false));
            __CLR4_5_28dv8dvlvickr1o.R.inc(10878);for (OWLAxiom ax : ont.getReferencingAxioms(entity, EXCLUDED)) {{
                assert (((ax != null)&&(__CLR4_5_28dv8dvlvickr1o.R.iget(10879)!=0|true))||(__CLR4_5_28dv8dvlvickr1o.R.iget(10880)==0&false));
                __CLR4_5_28dv8dvlvickr1o.R.inc(10881);changes.add(new RemoveAxiom(ont, ax));
            }
            }__CLR4_5_28dv8dvlvickr1o.R.inc(10882);for (OWLAnnotationAssertionAxiom ax : ont
                    .getAnnotationAssertionAxioms(entity.getIRI())) {{
                assert (((ax != null)&&(__CLR4_5_28dv8dvlvickr1o.R.iget(10883)!=0|true))||(__CLR4_5_28dv8dvlvickr1o.R.iget(10884)==0&false));
                __CLR4_5_28dv8dvlvickr1o.R.inc(10885);changes.add(new RemoveAxiom(ont, ax));
            }
        }}
    }}finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}

    @Override
    public void visit(OWLClass cls) {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10886);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10887);generateChanges(cls);
    }finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype datatype) {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10888);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10889);generateChanges(datatype);
    }finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10890);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10891);generateChanges(individual);
    }finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10892);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10893);generateChanges(property);
    }finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10894);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10895);generateChanges(property);
    }finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_28dv8dvlvickr1o.R.inc(10896);
        __CLR4_5_28dv8dvlvickr1o.R.inc(10897);generateChanges(property);
    }finally{__CLR4_5_28dv8dvlvickr1o.R.flushNeeded();}}
}
