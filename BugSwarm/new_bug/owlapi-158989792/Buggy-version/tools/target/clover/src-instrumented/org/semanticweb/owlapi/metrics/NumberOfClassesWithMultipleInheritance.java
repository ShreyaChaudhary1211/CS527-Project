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
package org.semanticweb.owlapi.metrics;

import static org.semanticweb.owlapi.search.Searcher.equivalent;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.util.NamedConjunctChecker;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.0
 */
public class NumberOfClassesWithMultipleInheritance extends IntegerValuedMetric {public static class __CLR4_5_21wz1wzlviclzjy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,2522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Instantiates a new number of classes with multiple inheritance.
     * 
     * @param o
     *        ontology to use
     */
    public NumberOfClassesWithMultipleInheritance(@Nonnull OWLOntology o) {
        super(o);__CLR4_5_21wz1wzlviclzjy.R.inc(2484);try{__CLR4_5_21wz1wzlviclzjy.R.inc(2483);
    }finally{__CLR4_5_21wz1wzlviclzjy.R.flushNeeded();}}

    @Nonnull
    @Override
    public String getName() {try{__CLR4_5_21wz1wzlviclzjy.R.inc(2485);
        __CLR4_5_21wz1wzlviclzjy.R.inc(2486);return "Number of classes with asserted multiple inheritance";
    }finally{__CLR4_5_21wz1wzlviclzjy.R.flushNeeded();}}

    @Override
    public Integer recomputeMetric() {try{__CLR4_5_21wz1wzlviclzjy.R.inc(2487);
        __CLR4_5_21wz1wzlviclzjy.R.inc(2488);Set<OWLClass> processed = new HashSet<>();
        __CLR4_5_21wz1wzlviclzjy.R.inc(2489);Set<OWLClass> clses = new HashSet<>();
        __CLR4_5_21wz1wzlviclzjy.R.inc(2490);NamedConjunctChecker checker = new NamedConjunctChecker();
        __CLR4_5_21wz1wzlviclzjy.R.inc(2491);for (OWLOntology ont : getOntologies()) {{
            __CLR4_5_21wz1wzlviclzjy.R.inc(2492);for (OWLClass cls : ont.getClassesInSignature()) {{
                assert (((cls != null)&&(__CLR4_5_21wz1wzlviclzjy.R.iget(2493)!=0|true))||(__CLR4_5_21wz1wzlviclzjy.R.iget(2494)==0&false));
                __CLR4_5_21wz1wzlviclzjy.R.inc(2495);if ((((processed.contains(cls))&&(__CLR4_5_21wz1wzlviclzjy.R.iget(2496)!=0|true))||(__CLR4_5_21wz1wzlviclzjy.R.iget(2497)==0&false))) {{
                    __CLR4_5_21wz1wzlviclzjy.R.inc(2498);continue;
                }
                }__CLR4_5_21wz1wzlviclzjy.R.inc(2499);processed.add(cls);
                __CLR4_5_21wz1wzlviclzjy.R.inc(2500);int count = 0;
                __CLR4_5_21wz1wzlviclzjy.R.inc(2501);for (OWLClassExpression sup : equivalent(ont.getEquivalentClassesAxioms(cls),
                    OWLClassExpression.class)) {{
                    assert (((sup != null)&&(__CLR4_5_21wz1wzlviclzjy.R.iget(2502)!=0|true))||(__CLR4_5_21wz1wzlviclzjy.R.iget(2503)==0&false));
                    __CLR4_5_21wz1wzlviclzjy.R.inc(2504);if ((((checker.hasNamedConjunct(sup))&&(__CLR4_5_21wz1wzlviclzjy.R.iget(2505)!=0|true))||(__CLR4_5_21wz1wzlviclzjy.R.iget(2506)==0&false))) {{
                        __CLR4_5_21wz1wzlviclzjy.R.inc(2507);count++;
                    }
                    }__CLR4_5_21wz1wzlviclzjy.R.inc(2508);if ((((count > 1)&&(__CLR4_5_21wz1wzlviclzjy.R.iget(2509)!=0|true))||(__CLR4_5_21wz1wzlviclzjy.R.iget(2510)==0&false))) {{
                        __CLR4_5_21wz1wzlviclzjy.R.inc(2511);clses.add(cls);
                        __CLR4_5_21wz1wzlviclzjy.R.inc(2512);break;
                    }
                }}
            }}
        }}
        }__CLR4_5_21wz1wzlviclzjy.R.inc(2513);return clses.size();
    }finally{__CLR4_5_21wz1wzlviclzjy.R.flushNeeded();}}

    @Override
    protected boolean isMetricInvalidated(List<? extends OWLOntologyChange> changes) {try{__CLR4_5_21wz1wzlviclzjy.R.inc(2514);
        __CLR4_5_21wz1wzlviclzjy.R.inc(2515);for (OWLOntologyChange change : changes) {{
            __CLR4_5_21wz1wzlviclzjy.R.inc(2516);if ((((change.isAxiomChange() && change.getAxiom() instanceof OWLSubClassOfAxiom)&&(__CLR4_5_21wz1wzlviclzjy.R.iget(2517)!=0|true))||(__CLR4_5_21wz1wzlviclzjy.R.iget(2518)==0&false))) {{
                __CLR4_5_21wz1wzlviclzjy.R.inc(2519);return true;
            }
        }}
        }__CLR4_5_21wz1wzlviclzjy.R.inc(2520);return false;
    }finally{__CLR4_5_21wz1wzlviclzjy.R.flushNeeded();}}

    @Override
    protected void disposeMetric() {try{__CLR4_5_21wz1wzlviclzjy.R.inc(2521);}finally{__CLR4_5_21wz1wzlviclzjy.R.flushNeeded();}}
}
