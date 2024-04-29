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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 * Performs a bulk conversion/translation of entity URIs. This utility class can
 * be used to replace entity names with IDs for example. The entity converter is
 * supplied with a set of ontologies and a conversion strategy. All of the
 * entities that are referenced in the specified ontologies will have their URIs
 * converted according the specified conversion strategy.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class OWLEntityURIConverter {public static class __CLR4_5_28hk8hklvickr3a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,11050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntologyManager manager;
    // The ontologies that reference the
    // entities whose names will be converted
    @Nonnull
    private final Collection<OWLOntology> ontologies;
    @Nonnull
    private final Map<OWLEntity, IRI> replacementMap = new HashMap<>();
    private Set<OWLEntity> processedEntities;
    @Nonnull
    private final OWLEntityURIConverterStrategy strategy;

    /**
     * Creates a converter that will convert the URIs of entities in the
     * specified ontologies using the specified conversion strategy.
     * 
     * @param manager
     *        The manager which managers the specified ontologies.
     * @param ontologies
     *        The ontologies whose entity URIs will be converted
     * @param strategy
     *        The conversion strategy to be used.
     */
    public OWLEntityURIConverter(@Nonnull OWLOntologyManager manager,
            @Nonnull Set<OWLOntology> ontologies,
            @Nonnull OWLEntityURIConverterStrategy strategy) {try{__CLR4_5_28hk8hklvickr3a.R.inc(11000);
        __CLR4_5_28hk8hklvickr3a.R.inc(11001);this.manager = checkNotNull(manager, "manager cannot be null");
        __CLR4_5_28hk8hklvickr3a.R.inc(11002);this.ontologies = new ArrayList<>(checkNotNull(ontologies,
                "ontologies cannot be null"));
        __CLR4_5_28hk8hklvickr3a.R.inc(11003);this.strategy = checkNotNull(strategy, "strategy cannot be null");
    }finally{__CLR4_5_28hk8hklvickr3a.R.flushNeeded();}}

    /**
     * Gets the changes required to perform the conversion.
     * 
     * @return A list of ontology changes that should be applied in order to
     *         convert the URI of entities in the specified ontologies.
     */
    public List<OWLOntologyChange> getChanges() {try{__CLR4_5_28hk8hklvickr3a.R.inc(11004);
        __CLR4_5_28hk8hklvickr3a.R.inc(11005);replacementMap.clear();
        __CLR4_5_28hk8hklvickr3a.R.inc(11006);processedEntities = new HashSet<>();
        __CLR4_5_28hk8hklvickr3a.R.inc(11007);List<OWLOntologyChange> changes = new ArrayList<>();
        __CLR4_5_28hk8hklvickr3a.R.inc(11008);for (OWLOntology ont : ontologies) {{
            __CLR4_5_28hk8hklvickr3a.R.inc(11009);for (OWLClass cls : ont.getClassesInSignature()) {{
                __CLR4_5_28hk8hklvickr3a.R.inc(11010);if ((((!cls.isOWLThing() && !cls.isOWLNothing())&&(__CLR4_5_28hk8hklvickr3a.R.iget(11011)!=0|true))||(__CLR4_5_28hk8hklvickr3a.R.iget(11012)==0&false))) {{
                    __CLR4_5_28hk8hklvickr3a.R.inc(11013);processEntity(cls);
                }
            }}
            }__CLR4_5_28hk8hklvickr3a.R.inc(11014);for (OWLObjectProperty prop : ont.getObjectPropertiesInSignature()) {{
                assert (((prop != null)&&(__CLR4_5_28hk8hklvickr3a.R.iget(11015)!=0|true))||(__CLR4_5_28hk8hklvickr3a.R.iget(11016)==0&false));
                __CLR4_5_28hk8hklvickr3a.R.inc(11017);processEntity(prop);
            }
            }__CLR4_5_28hk8hklvickr3a.R.inc(11018);for (OWLDataProperty prop : ont.getDataPropertiesInSignature()) {{
                assert (((prop != null)&&(__CLR4_5_28hk8hklvickr3a.R.iget(11019)!=0|true))||(__CLR4_5_28hk8hklvickr3a.R.iget(11020)==0&false));
                __CLR4_5_28hk8hklvickr3a.R.inc(11021);processEntity(prop);
            }
            }__CLR4_5_28hk8hklvickr3a.R.inc(11022);for (OWLNamedIndividual ind : ont.getIndividualsInSignature()) {{
                assert (((ind != null)&&(__CLR4_5_28hk8hklvickr3a.R.iget(11023)!=0|true))||(__CLR4_5_28hk8hklvickr3a.R.iget(11024)==0&false));
                __CLR4_5_28hk8hklvickr3a.R.inc(11025);processEntity(ind);
            }
        }}
        }__CLR4_5_28hk8hklvickr3a.R.inc(11026);OWLObjectDuplicator dup = new OWLObjectDuplicator(replacementMap,
                manager.getOWLDataFactory());
        __CLR4_5_28hk8hklvickr3a.R.inc(11027);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_28hk8hklvickr3a.R.iget(11028)!=0|true))||(__CLR4_5_28hk8hklvickr3a.R.iget(11029)==0&false));
            __CLR4_5_28hk8hklvickr3a.R.inc(11030);for (OWLAxiom ax : ont.getAxioms()) {{
                assert (((ax != null)&&(__CLR4_5_28hk8hklvickr3a.R.iget(11031)!=0|true))||(__CLR4_5_28hk8hklvickr3a.R.iget(11032)==0&false));
                __CLR4_5_28hk8hklvickr3a.R.inc(11033);OWLAxiom dupAx = dup.duplicateObject(ax);
                __CLR4_5_28hk8hklvickr3a.R.inc(11034);if ((((!dupAx.equals(ax))&&(__CLR4_5_28hk8hklvickr3a.R.iget(11035)!=0|true))||(__CLR4_5_28hk8hklvickr3a.R.iget(11036)==0&false))) {{
                    __CLR4_5_28hk8hklvickr3a.R.inc(11037);changes.add(new RemoveAxiom(ont, ax));
                    __CLR4_5_28hk8hklvickr3a.R.inc(11038);changes.add(new AddAxiom(ont, dupAx));
                }
            }}
        }}
        }__CLR4_5_28hk8hklvickr3a.R.inc(11039);return changes;
    }finally{__CLR4_5_28hk8hklvickr3a.R.flushNeeded();}}

    private void processEntity(@Nonnull OWLEntity ent) {try{__CLR4_5_28hk8hklvickr3a.R.inc(11040);
        __CLR4_5_28hk8hklvickr3a.R.inc(11041);if ((((processedEntities.contains(ent))&&(__CLR4_5_28hk8hklvickr3a.R.iget(11042)!=0|true))||(__CLR4_5_28hk8hklvickr3a.R.iget(11043)==0&false))) {{
            __CLR4_5_28hk8hklvickr3a.R.inc(11044);return;
        }
        // Add label?
        }__CLR4_5_28hk8hklvickr3a.R.inc(11045);IRI rep = getTinyIRI(ent);
        __CLR4_5_28hk8hklvickr3a.R.inc(11046);replacementMap.put(ent, rep);
        __CLR4_5_28hk8hklvickr3a.R.inc(11047);processedEntities.add(ent);
    }finally{__CLR4_5_28hk8hklvickr3a.R.flushNeeded();}}

    private IRI getTinyIRI(@Nonnull OWLEntity ent) {try{__CLR4_5_28hk8hklvickr3a.R.inc(11048);
        __CLR4_5_28hk8hklvickr3a.R.inc(11049);return strategy.getConvertedIRI(ent);
    }finally{__CLR4_5_28hk8hklvickr3a.R.flushNeeded();}}
}
