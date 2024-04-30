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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

/**
 * Counts the number of "hidden" GCIs in an ontology imports closure. A GCI is
 * regarded to be a "hidden" GCI if it is essentially introduce via an
 * equivalent class axiom and a subclass axioms where the LHS of the subclass
 * axiom is nameed. For example, A equivalentTo p some C, A subClassOf B results
 * in a "hidden" GCI.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.1
 */
public class HiddenGCICount extends IntegerValuedMetric {public static class __CLR4_5_21u61u6lviclzdn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,2427,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Instantiates a new hidden gci count.
     * 
     * @param o
     *        ontology to use
     */
    public HiddenGCICount(@Nonnull OWLOntology o) {
        super(o);__CLR4_5_21u61u6lviclzdn.R.inc(2383);try{__CLR4_5_21u61u6lviclzdn.R.inc(2382);
    }finally{__CLR4_5_21u61u6lviclzdn.R.flushNeeded();}}

    @Override
    protected void disposeMetric() {try{__CLR4_5_21u61u6lviclzdn.R.inc(2384);}finally{__CLR4_5_21u61u6lviclzdn.R.flushNeeded();}}

    @Override
    protected boolean isMetricInvalidated(@Nonnull List<? extends OWLOntologyChange> changes) {try{__CLR4_5_21u61u6lviclzdn.R.inc(2385);
        __CLR4_5_21u61u6lviclzdn.R.inc(2386);for (OWLOntologyChange chg : changes) {{
            __CLR4_5_21u61u6lviclzdn.R.inc(2387);if ((((chg.isAxiomChange())&&(__CLR4_5_21u61u6lviclzdn.R.iget(2388)!=0|true))||(__CLR4_5_21u61u6lviclzdn.R.iget(2389)==0&false))) {{
                __CLR4_5_21u61u6lviclzdn.R.inc(2390);OWLAxiom ax = chg.getAxiom();
                __CLR4_5_21u61u6lviclzdn.R.inc(2391);if ((((ax instanceof OWLEquivalentClassesAxiom || ax instanceof OWLSubClassOfAxiom)&&(__CLR4_5_21u61u6lviclzdn.R.iget(2392)!=0|true))||(__CLR4_5_21u61u6lviclzdn.R.iget(2393)==0&false))) {{
                    __CLR4_5_21u61u6lviclzdn.R.inc(2394);return true;
                }
            }}
        }}
        }__CLR4_5_21u61u6lviclzdn.R.inc(2395);return false;
    }finally{__CLR4_5_21u61u6lviclzdn.R.flushNeeded();}}

    @Override
    protected Integer recomputeMetric() {try{__CLR4_5_21u61u6lviclzdn.R.inc(2396);
        __CLR4_5_21u61u6lviclzdn.R.inc(2397);Set<OWLClass> processed = new HashSet<>();
        __CLR4_5_21u61u6lviclzdn.R.inc(2398);Set<OWLClass> result = new HashSet<>();
        __CLR4_5_21u61u6lviclzdn.R.inc(2399);for (OWLOntology ont : getOntologies()) {{
            __CLR4_5_21u61u6lviclzdn.R.inc(2400);for (OWLClass cls : ont.getClassesInSignature()) {{
                assert (((cls != null)&&(__CLR4_5_21u61u6lviclzdn.R.iget(2401)!=0|true))||(__CLR4_5_21u61u6lviclzdn.R.iget(2402)==0&false));
                __CLR4_5_21u61u6lviclzdn.R.inc(2403);if ((((!processed.contains(cls))&&(__CLR4_5_21u61u6lviclzdn.R.iget(2404)!=0|true))||(__CLR4_5_21u61u6lviclzdn.R.iget(2405)==0&false))) {{
                    __CLR4_5_21u61u6lviclzdn.R.inc(2406);processed.add(cls);
                } }else {{
                    __CLR4_5_21u61u6lviclzdn.R.inc(2407);continue;
                }
                }__CLR4_5_21u61u6lviclzdn.R.inc(2408);boolean foundEquivalentClassesAxiom = false;
                __CLR4_5_21u61u6lviclzdn.R.inc(2409);boolean foundSubClassAxiom = false;
                __CLR4_5_21u61u6lviclzdn.R.inc(2410);for (OWLOntology o : getOntologies()) {{
                    __CLR4_5_21u61u6lviclzdn.R.inc(2411);if ((((!foundEquivalentClassesAxiom)&&(__CLR4_5_21u61u6lviclzdn.R.iget(2412)!=0|true))||(__CLR4_5_21u61u6lviclzdn.R.iget(2413)==0&false))) {{
                        __CLR4_5_21u61u6lviclzdn.R.inc(2414);foundEquivalentClassesAxiom = !o.getEquivalentClassesAxioms(cls).isEmpty();
                    }
                    }__CLR4_5_21u61u6lviclzdn.R.inc(2415);if ((((!foundSubClassAxiom)&&(__CLR4_5_21u61u6lviclzdn.R.iget(2416)!=0|true))||(__CLR4_5_21u61u6lviclzdn.R.iget(2417)==0&false))) {{
                        __CLR4_5_21u61u6lviclzdn.R.inc(2418);foundSubClassAxiom = !o.getSubClassAxiomsForSubClass(cls).isEmpty();
                    }
                    }__CLR4_5_21u61u6lviclzdn.R.inc(2419);if ((((foundSubClassAxiom && foundEquivalentClassesAxiom)&&(__CLR4_5_21u61u6lviclzdn.R.iget(2420)!=0|true))||(__CLR4_5_21u61u6lviclzdn.R.iget(2421)==0&false))) {{
                        __CLR4_5_21u61u6lviclzdn.R.inc(2422);result.add(cls);
                        __CLR4_5_21u61u6lviclzdn.R.inc(2423);break;
                    }
                }}
            }}
        }}
        }__CLR4_5_21u61u6lviclzdn.R.inc(2424);return result.size();
    }finally{__CLR4_5_21u61u6lviclzdn.R.flushNeeded();}}

    @Override
    public String getName() {try{__CLR4_5_21u61u6lviclzdn.R.inc(2425);
        __CLR4_5_21u61u6lviclzdn.R.inc(2426);return "Hidden GCI Count";
    }finally{__CLR4_5_21u61u6lviclzdn.R.flushNeeded();}}
}
