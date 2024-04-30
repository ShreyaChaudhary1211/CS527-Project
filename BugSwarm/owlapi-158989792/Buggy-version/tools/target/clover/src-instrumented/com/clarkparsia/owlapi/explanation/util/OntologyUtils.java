/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2011, Clark & Parsia, LLC
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package com.clarkparsia.owlapi.explanation.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.RemoveAxiom;

/** Some ontology utils methods. */
public final class OntologyUtils {public static class __CLR4_5_2j5j5lviclyr7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,720,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private OntologyUtils() {try{__CLR4_5_2j5j5lviclyr7.R.inc(689);}finally{__CLR4_5_2j5j5lviclyr7.R.flushNeeded();}}

    /**
     * Determines if a class description contains any unreferenced entities with
     * respect to the ontology that contains the entailments which are being
     * explained.
     * 
     * @param ontology
     *        the ontology to search
     * @param desc
     *        The description to be searched
     * @return {@code true} if the description references entities that the
     *         ontology that contains entailments which are being explained,
     *         otherwise {@code false}
     */
    public static boolean containsUnreferencedEntity(
            @Nonnull OWLOntology ontology, @Nonnull OWLClassExpression desc) {try{__CLR4_5_2j5j5lviclyr7.R.inc(690);
        __CLR4_5_2j5j5lviclyr7.R.inc(691);checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_2j5j5lviclyr7.R.inc(692);for (OWLEntity entity : checkNotNull(desc, "desc cannot be null")
                .getSignature()) {{
            assert (((entity != null)&&(__CLR4_5_2j5j5lviclyr7.R.iget(693)!=0|true))||(__CLR4_5_2j5j5lviclyr7.R.iget(694)==0&false));
            __CLR4_5_2j5j5lviclyr7.R.inc(695);if ((((!ontology.containsEntityInSignature(entity))&&(__CLR4_5_2j5j5lviclyr7.R.iget(696)!=0|true))||(__CLR4_5_2j5j5lviclyr7.R.iget(697)==0&false))) {{
                __CLR4_5_2j5j5lviclyr7.R.inc(698);if ((((entity instanceof OWLClass
                        && (((OWLClass) entity).isOWLThing() || ((OWLClass) entity)
                                .isOWLNothing()))&&(__CLR4_5_2j5j5lviclyr7.R.iget(699)!=0|true))||(__CLR4_5_2j5j5lviclyr7.R.iget(700)==0&false))) {{
                    __CLR4_5_2j5j5lviclyr7.R.inc(701);continue;
                }
                }__CLR4_5_2j5j5lviclyr7.R.inc(702);return true;
            }
        }}
        }__CLR4_5_2j5j5lviclyr7.R.inc(703);return false;
    }finally{__CLR4_5_2j5j5lviclyr7.R.flushNeeded();}}

    /**
     * Removes an axiom from all the given ontologies that contains the axiom
     * and returns those ontologies.
     * 
     * @param axiom
     *        axiom being removed
     * @param ontologies
     *        ontologies from which axiom is being removed
     * @param manager
     *        manager to apply the actual change
     * @return set of ontologies that have been affected
     */
    @Nonnull
    public static Set<OWLOntology> removeAxiom(@Nonnull OWLAxiom axiom,
            @Nonnull Set<OWLOntology> ontologies,
            @Nonnull OWLOntologyManager manager) {try{__CLR4_5_2j5j5lviclyr7.R.inc(704);
        __CLR4_5_2j5j5lviclyr7.R.inc(705);Set<OWLOntology> modifiedOnts = new HashSet<>();
        __CLR4_5_2j5j5lviclyr7.R.inc(706);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_2j5j5lviclyr7.R.inc(707);checkNotNull(manager, "manager cannot be null");
        __CLR4_5_2j5j5lviclyr7.R.inc(708);for (OWLOntology ont : checkNotNull(ontologies,
                "ontologies cannot be null")) {{
            __CLR4_5_2j5j5lviclyr7.R.inc(709);if ((((ont.getAxioms().contains(axiom))&&(__CLR4_5_2j5j5lviclyr7.R.iget(710)!=0|true))||(__CLR4_5_2j5j5lviclyr7.R.iget(711)==0&false))) {{
                __CLR4_5_2j5j5lviclyr7.R.inc(712);modifiedOnts.add(ont);
                __CLR4_5_2j5j5lviclyr7.R.inc(713);manager.applyChange(new RemoveAxiom(ont, axiom));
            }
        }}
        }__CLR4_5_2j5j5lviclyr7.R.inc(714);return modifiedOnts;
    }finally{__CLR4_5_2j5j5lviclyr7.R.flushNeeded();}}

    /**
     * Add the axiom to all the given ontologies.
     * 
     * @param axiom
     *        the axiom to add
     * @param ontologies
     *        the ontologies to add the axiom to
     * @param manager
     *        the manager for the application
     */
    public static void addAxiom(@Nonnull OWLAxiom axiom,
            @Nonnull Set<OWLOntology> ontologies,
            @Nonnull OWLOntologyManager manager) {try{__CLR4_5_2j5j5lviclyr7.R.inc(715);
        __CLR4_5_2j5j5lviclyr7.R.inc(716);for (OWLOntology ont : checkNotNull(ontologies,
                "ontologies cannot be null")) {{
            assert (((ont != null)&&(__CLR4_5_2j5j5lviclyr7.R.iget(717)!=0|true))||(__CLR4_5_2j5j5lviclyr7.R.iget(718)==0&false));
            __CLR4_5_2j5j5lviclyr7.R.inc(719);checkNotNull(manager, "manager cannot be null").applyChange(
                    new AddAxiom(ont, checkNotNull(axiom,
                            "axiom cannot be null")));
        }
    }}finally{__CLR4_5_2j5j5lviclyr7.R.flushNeeded();}}
}
