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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLOntology;

/**
 * Sorts objects into sets based on where they appear in the imports closure of
 * an ontology. Consider ontology B that imports ontology A. A map will be
 * generated that maps each ontology, A, B, to a set of objects that are
 * associated with the ontology. If an object is associated with ontology A and
 * associated with ontology B then it will only appear in the set of objects
 * that are associated with ontology A since A appears higher up the imports
 * closure. An example of the use of this class is to obtain a map of ontologies
 * to sets of entities where each set of entities contains entities that are
 * first mentioned in the ontology that maps to them.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 * @see org.semanticweb.owlapi.util.ImportsStructureEntitySorter
 * @param <O>
 *        the type
 */
public class ImportsStructureObjectSorter<O> {public static class __CLR4_5_26gp6gplvickq0u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,8399,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntology ontology;
    @Nonnull
    private final ObjectSelector<O> objectSelector;

    /**
     * Creates a sorter for the specified ontology, whose imports closure is
     * obtained with the specified manager, and for each ontology whose objects
     * are selected using the specified object selector.
     * 
     * @param ontology
     *        The ontology
     * @param objectSelector
     *        The selector that will be used to select objects that are
     *        associated with each ontology.
     */
    public ImportsStructureObjectSorter(@Nonnull OWLOntology ontology,
            @Nonnull ObjectSelector<O> objectSelector) {try{__CLR4_5_26gp6gplvickq0u.R.inc(8377);
        __CLR4_5_26gp6gplvickq0u.R.inc(8378);this.ontology = checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_26gp6gplvickq0u.R.inc(8379);this.objectSelector = checkNotNull(objectSelector,
                "objectSelector cannot be null");
    }finally{__CLR4_5_26gp6gplvickq0u.R.flushNeeded();}}

    /**
     * Gets a map that maps ontologies to sets of associated objects. The
     * ontologies will be the ontologies that are contained in the imports
     * closure of the original specified ontology.
     * 
     * @return The map.
     */
    @Nonnull
    public Map<OWLOntology, Set<O>> getObjects() {try{__CLR4_5_26gp6gplvickq0u.R.inc(8380);
        __CLR4_5_26gp6gplvickq0u.R.inc(8381);List<OWLOntology> imports = new ArrayList<>(
                ontology.getImportsClosure());
        __CLR4_5_26gp6gplvickq0u.R.inc(8382);Map<OWLOntology, Set<O>> ontology2EntityMap = new HashMap<>();
        __CLR4_5_26gp6gplvickq0u.R.inc(8383);Set<O> processed = new HashSet<>();
        __CLR4_5_26gp6gplvickq0u.R.inc(8384);for (int i = imports.size() - 1; (((i > -1)&&(__CLR4_5_26gp6gplvickq0u.R.iget(8385)!=0|true))||(__CLR4_5_26gp6gplvickq0u.R.iget(8386)==0&false)); i--) {{
            __CLR4_5_26gp6gplvickq0u.R.inc(8387);OWLOntology currentOnt = imports.get(i);
            assert (((currentOnt != null)&&(__CLR4_5_26gp6gplvickq0u.R.iget(8388)!=0|true))||(__CLR4_5_26gp6gplvickq0u.R.iget(8389)==0&false));
            __CLR4_5_26gp6gplvickq0u.R.inc(8390);Set<O> objects = new HashSet<>();
            __CLR4_5_26gp6gplvickq0u.R.inc(8391);for (O obj : objectSelector.getObjects(currentOnt)) {{
                __CLR4_5_26gp6gplvickq0u.R.inc(8392);if ((((!processed.contains(obj))&&(__CLR4_5_26gp6gplvickq0u.R.iget(8393)!=0|true))||(__CLR4_5_26gp6gplvickq0u.R.iget(8394)==0&false))) {{
                    __CLR4_5_26gp6gplvickq0u.R.inc(8395);processed.add(obj);
                    __CLR4_5_26gp6gplvickq0u.R.inc(8396);objects.add(obj);
                }
            }}
            }__CLR4_5_26gp6gplvickq0u.R.inc(8397);ontology2EntityMap.put(currentOnt, objects);
        }
        }__CLR4_5_26gp6gplvickq0u.R.inc(8398);return ontology2EntityMap;
    }finally{__CLR4_5_26gp6gplvickq0u.R.flushNeeded();}}

    /**
     * @param <O>
     *        type of selected objects
     */
    public interface ObjectSelector<O> {

        /**
         * @param ontology
         *        the ontology to explore
         * @return set of objects selected
         */
        @Nonnull
        Set<O> getObjects(@Nonnull OWLOntology ontology);
    }
}
