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

import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.OWLOntologyLoaderMetaData;
import org.semanticweb.owlapi.io.RDFParserMetaData;
import org.semanticweb.owlapi.util.CollectionFactory;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;

/**
 * Represents the concrete representation format of an ontology. The equality of
 * an ontology format is defined by the equals and hashCode method (not its
 * identity).
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class OWLDocumentFormatImpl implements OWLDocumentFormat {public static class __CLR4_5_220z20zlvickmbc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,2719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private final Map<Serializable, Serializable> parameterMap = new HashMap<>();
    @Nonnull private OWLOntologyLoaderMetaData loaderMetaData = new RDFParserMetaData();
    private boolean addMissingTypes = true;

    @Override
    public boolean isAddMissingTypes() {try{__CLR4_5_220z20zlvickmbc.R.inc(2627);
        __CLR4_5_220z20zlvickmbc.R.inc(2628);return addMissingTypes;
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    /**
     * Determines if a declaration axiom (type triple) needs to be added to the
     * specified ontology for the given entity.
     * 
     * @param entity
     *        The entity
     * @param ontology
     *        The ontology.
     * @return {@code false} if the entity is built in. {@code false} if the
     *         ontology doesn't contain the entity in its signature.
     *         {@code false} if the entity is already declared in the imports
     *         closure of the ontology. {@code false} if the transitive imports
     *         does not contain the ontology but the entity is contained in the
     *         signature of one of the imported ontologies, {@code true} if none
     *         of the previous conditions are met.
     */
    public static boolean isMissingType(@Nonnull OWLEntity entity, OWLOntology ontology) {try{__CLR4_5_220z20zlvickmbc.R.inc(2629);
        // We don't need to declare built in entities
        __CLR4_5_220z20zlvickmbc.R.inc(2630);if ((((entity.isBuiltIn())&&(__CLR4_5_220z20zlvickmbc.R.iget(2631)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2632)==0&false))) {{
            __CLR4_5_220z20zlvickmbc.R.inc(2633);return false;
        }
        // If the ontology doesn't contain the entity in its signature then it
        // shouldn't declare it
        }__CLR4_5_220z20zlvickmbc.R.inc(2634);if ((((!ontology.containsEntityInSignature(entity))&&(__CLR4_5_220z20zlvickmbc.R.iget(2635)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2636)==0&false))) {{
            __CLR4_5_220z20zlvickmbc.R.inc(2637);return false;
        }
        }__CLR4_5_220z20zlvickmbc.R.inc(2638);if ((((ontology.isDeclared(entity, INCLUDED))&&(__CLR4_5_220z20zlvickmbc.R.iget(2639)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2640)==0&false))) {{
            __CLR4_5_220z20zlvickmbc.R.inc(2641);return false;
        }
        }__CLR4_5_220z20zlvickmbc.R.inc(2642);Set<OWLOntology> transitiveImports = ontology.getImports();
        __CLR4_5_220z20zlvickmbc.R.inc(2643);if ((((!transitiveImports.contains(ontology))&&(__CLR4_5_220z20zlvickmbc.R.iget(2644)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2645)==0&false))) {{
            // See if the entity should be declared in an imported ontology
            __CLR4_5_220z20zlvickmbc.R.inc(2646);for (OWLOntology importedOntology : transitiveImports) {{
                __CLR4_5_220z20zlvickmbc.R.inc(2647);if ((((importedOntology.containsEntityInSignature(entity))&&(__CLR4_5_220z20zlvickmbc.R.iget(2648)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2649)==0&false))) {{
                    // Leave it for that ontology to declare the entity
                    __CLR4_5_220z20zlvickmbc.R.inc(2650);return false;
                }
            }}
        }}
        }__CLR4_5_220z20zlvickmbc.R.inc(2651);return true;
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    /**
     * @param signature
     *        signature for the ontology
     * @param punnedEntities
     *        the set of entities that are known already to be punned
     * @param add
     *        true if missing declarations should be added. If false, no
     *        declarations will be added.
     * @return collection of IRIS used in illegal punnings
     */
    public static Collection<IRI> determineIllegalPunnings(boolean add, Collection<OWLEntity> signature,
        Collection<IRI> punnedEntities) {try{__CLR4_5_220z20zlvickmbc.R.inc(2652);
        __CLR4_5_220z20zlvickmbc.R.inc(2653);if ((((!add)&&(__CLR4_5_220z20zlvickmbc.R.iget(2654)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2655)==0&false))) {{
            __CLR4_5_220z20zlvickmbc.R.inc(2656);return CollectionFactory.emptySet();
        }
        // determine what entities are illegally punned
        }__CLR4_5_220z20zlvickmbc.R.inc(2657);Multimap<IRI, EntityType<?>> punnings = LinkedListMultimap.create();
        __CLR4_5_220z20zlvickmbc.R.inc(2658);for (OWLEntity e : signature) {{
            // disregard individuals as they do not give raise to illegal
            // punnings; only keep track of punned entities, ignore the rest
            __CLR4_5_220z20zlvickmbc.R.inc(2659);if ((((!e.isOWLNamedIndividual() && punnedEntities.contains(e.getIRI()))&&(__CLR4_5_220z20zlvickmbc.R.iget(2660)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2661)==0&false))) {{
                __CLR4_5_220z20zlvickmbc.R.inc(2662);punnings.put(e.getIRI(), e.getEntityType());
            }
        }}
        }__CLR4_5_220z20zlvickmbc.R.inc(2663);Collection<IRI> illegals = new HashSet<>();
        __CLR4_5_220z20zlvickmbc.R.inc(2664);for (IRI i : punnings.keySet()) {{
            __CLR4_5_220z20zlvickmbc.R.inc(2665);Collection<EntityType<?>> puns = punnings.get(i);
            __CLR4_5_220z20zlvickmbc.R.inc(2666);if ((((puns.contains(EntityType.OBJECT_PROPERTY) && puns.contains(EntityType.ANNOTATION_PROPERTY))&&(__CLR4_5_220z20zlvickmbc.R.iget(2667)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2668)==0&false))) {{
                __CLR4_5_220z20zlvickmbc.R.inc(2669);illegals.add(i);
            } }else {__CLR4_5_220z20zlvickmbc.R.inc(2670);if ((((puns.contains(EntityType.DATA_PROPERTY) && puns.contains(EntityType.ANNOTATION_PROPERTY))&&(__CLR4_5_220z20zlvickmbc.R.iget(2671)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2672)==0&false))) {{
                __CLR4_5_220z20zlvickmbc.R.inc(2673);illegals.add(i);
            } }else {__CLR4_5_220z20zlvickmbc.R.inc(2674);if ((((puns.contains(EntityType.DATA_PROPERTY) && puns.contains(EntityType.OBJECT_PROPERTY))&&(__CLR4_5_220z20zlvickmbc.R.iget(2675)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2676)==0&false))) {{
                __CLR4_5_220z20zlvickmbc.R.inc(2677);illegals.add(i);
            } }else {__CLR4_5_220z20zlvickmbc.R.inc(2678);if ((((puns.contains(EntityType.DATATYPE) && puns.contains(EntityType.CLASS))&&(__CLR4_5_220z20zlvickmbc.R.iget(2679)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2680)==0&false))) {{
                __CLR4_5_220z20zlvickmbc.R.inc(2681);illegals.add(i);
            }
        }}}}}
        }__CLR4_5_220z20zlvickmbc.R.inc(2682);return illegals;
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    @Override
    public void setAddMissingTypes(boolean addMissingTypes) {try{__CLR4_5_220z20zlvickmbc.R.inc(2683);
        __CLR4_5_220z20zlvickmbc.R.inc(2684);this.addMissingTypes = addMissingTypes;
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    @Override
    public void setParameter(Serializable key, Serializable value) {try{__CLR4_5_220z20zlvickmbc.R.inc(2685);
        __CLR4_5_220z20zlvickmbc.R.inc(2686);parameterMap.put(key, value);
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    @Override
    public Serializable getParameter(Serializable key, Serializable defaultValue) {try{__CLR4_5_220z20zlvickmbc.R.inc(2687);
        __CLR4_5_220z20zlvickmbc.R.inc(2688);Serializable val = parameterMap.get(key);
        __CLR4_5_220z20zlvickmbc.R.inc(2689);if ((((val != null)&&(__CLR4_5_220z20zlvickmbc.R.iget(2690)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2691)==0&false))) {{
            __CLR4_5_220z20zlvickmbc.R.inc(2692);return val;
        } }else {{
            __CLR4_5_220z20zlvickmbc.R.inc(2693);return defaultValue;
        }
    }}finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    @Override
    public OWLOntologyLoaderMetaData getOntologyLoaderMetaData() {try{__CLR4_5_220z20zlvickmbc.R.inc(2694);
        __CLR4_5_220z20zlvickmbc.R.inc(2695);return loaderMetaData;
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    @Override
    public void setOntologyLoaderMetaData(OWLOntologyLoaderMetaData loaderMetaData) {try{__CLR4_5_220z20zlvickmbc.R.inc(2696);
        __CLR4_5_220z20zlvickmbc.R.inc(2697);this.loaderMetaData = loaderMetaData;
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    @Override
    public boolean isTextual() {try{__CLR4_5_220z20zlvickmbc.R.inc(2698);
        __CLR4_5_220z20zlvickmbc.R.inc(2699);return true;
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_220z20zlvickmbc.R.inc(2700);
        __CLR4_5_220z20zlvickmbc.R.inc(2701);if ((((obj == null)&&(__CLR4_5_220z20zlvickmbc.R.iget(2702)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2703)==0&false))) {{
            __CLR4_5_220z20zlvickmbc.R.inc(2704);return false;
        }
        }__CLR4_5_220z20zlvickmbc.R.inc(2705);if ((((obj == this)&&(__CLR4_5_220z20zlvickmbc.R.iget(2706)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2707)==0&false))) {{
            __CLR4_5_220z20zlvickmbc.R.inc(2708);return true;
        }
        }__CLR4_5_220z20zlvickmbc.R.inc(2709);if ((((obj instanceof OWLDocumentFormat)&&(__CLR4_5_220z20zlvickmbc.R.iget(2710)!=0|true))||(__CLR4_5_220z20zlvickmbc.R.iget(2711)==0&false))) {{
            __CLR4_5_220z20zlvickmbc.R.inc(2712);return ((OWLDocumentFormat) obj).getKey().equals(getKey());
        }
        }__CLR4_5_220z20zlvickmbc.R.inc(2713);return false;
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_220z20zlvickmbc.R.inc(2714);
        __CLR4_5_220z20zlvickmbc.R.inc(2715);return getKey().hashCode();
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_220z20zlvickmbc.R.inc(2716);
        __CLR4_5_220z20zlvickmbc.R.inc(2717);return getKey();
    }finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}

    private static class NullLoaderMetaData implements OWLOntologyLoaderMetaData, Serializable {

        private static final long serialVersionUID = 40000L;

        NullLoaderMetaData() {try{__CLR4_5_220z20zlvickmbc.R.inc(2718);}finally{__CLR4_5_220z20zlvickmbc.R.flushNeeded();}}
    }
}
