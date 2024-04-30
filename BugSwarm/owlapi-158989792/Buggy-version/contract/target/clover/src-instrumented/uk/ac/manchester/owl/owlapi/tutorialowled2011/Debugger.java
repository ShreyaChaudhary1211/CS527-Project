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
package uk.ac.manchester.owl.owlapi.tutorialowled2011;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.debugging.BlackBoxOWLDebugger;
import org.semanticweb.owlapi.debugging.OWLDebugger;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLException;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;

/**
 * This class demonstrates some aspects of the OWL API. It expects three
 * arguments:
 * <ol>
 * <li>The URI of an ontology</li>
 * <li>The URI of a reasoner</li>
 * <li>A location to place the results.</li>
 * </ol>
 * When executed, the class will find all inconsistent classes in the ontology.
 * For each inconsistent class, the debugger will be used to determine the set
 * of support for the inconsistency. A report will then be written to the outpur
 * file.
 * 
 * @author Sean Bechhofer, The University Of Manchester, Information Management
 *         Group
 * @since 2.0.0
 */
@SuppressWarnings("javadoc")
public class Debugger {public static class __CLR4_5_200lvicnyjb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237362759L,8589935092L,37,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntology ontology;
    @Nonnull
    private final OWLDebugger debugger;
    private final OWLReasoner checker;
    @Nonnull
    private final OWLClass bottom;

    public Debugger(@Nonnull OWLOntologyManager manager,
            @Nonnull OWLOntology ontology,
            @Nonnull OWLReasonerFactory reasonerFactory) {try{__CLR4_5_200lvicnyjb.R.inc(0);
        __CLR4_5_200lvicnyjb.R.inc(1);this.ontology = ontology;
        __CLR4_5_200lvicnyjb.R.inc(2);checker = reasonerFactory.createNonBufferingReasoner(ontology);
        /* Create a new debugger */
        __CLR4_5_200lvicnyjb.R.inc(3);debugger = new BlackBoxOWLDebugger(manager, ontology, reasonerFactory);
        /* Get bottom */
        __CLR4_5_200lvicnyjb.R.inc(4);bottom = manager.getOWLDataFactory().getOWLNothing();
    }finally{__CLR4_5_200lvicnyjb.R.flushNeeded();}}

    public void report(@Nonnull PrintWriter writer) throws OWLException {try{__CLR4_5_200lvicnyjb.R.inc(5);
        __CLR4_5_200lvicnyjb.R.inc(6);OWLTutorialSyntaxObjectRenderer renderer = new OWLTutorialSyntaxObjectRenderer(
                writer);
        /* Write a header */
        __CLR4_5_200lvicnyjb.R.inc(7);renderer.header();
        __CLR4_5_200lvicnyjb.R.inc(8);Set<OWLClass> unsatisfiables = new HashSet<>();
        __CLR4_5_200lvicnyjb.R.inc(9);for (OWLClass clazz : ontology.getClassesInSignature()) {{
            assert (((clazz != null)&&(__CLR4_5_200lvicnyjb.R.iget(10)!=0|true))||(__CLR4_5_200lvicnyjb.R.iget(11)==0&false));
            /* Collect the unsatisfiable classes that aren't bottom. */
            __CLR4_5_200lvicnyjb.R.inc(12);if ((((!checker.isSatisfiable(clazz) && !clazz.equals(bottom))&&(__CLR4_5_200lvicnyjb.R.iget(13)!=0|true))||(__CLR4_5_200lvicnyjb.R.iget(14)==0&false))) {{
                __CLR4_5_200lvicnyjb.R.inc(15);unsatisfiables.add(clazz);
            }
        }}
        }__CLR4_5_200lvicnyjb.R.inc(16);writer.println("<h1>Ontology Debugging Report</h1>");
        __CLR4_5_200lvicnyjb.R.inc(17);writer.println("<br>Ontology: " + ontology.getOntologyID() + "<br>");
        __CLR4_5_200lvicnyjb.R.inc(18);if ((((unsatisfiables.isEmpty())&&(__CLR4_5_200lvicnyjb.R.iget(19)!=0|true))||(__CLR4_5_200lvicnyjb.R.iget(20)==0&false))) {{
            __CLR4_5_200lvicnyjb.R.inc(21);writer.println("<br>No Unsatisfiable Classes found<br>");
        } }else {{
            __CLR4_5_200lvicnyjb.R.inc(22);for (OWLClass unsatisfiable : unsatisfiables) {{
                __CLR4_5_200lvicnyjb.R.inc(23);writer.println("<div class='box'>\n");
                __CLR4_5_200lvicnyjb.R.inc(24);writer.println("<h2 class='cl'>");
                __CLR4_5_200lvicnyjb.R.inc(25);unsatisfiable.accept(renderer);
                __CLR4_5_200lvicnyjb.R.inc(26);writer.println("</h2>");
                __CLR4_5_200lvicnyjb.R.inc(27);writer.println("<br>Axioms causing inconsistency:<br>");
                __CLR4_5_200lvicnyjb.R.inc(28);writer.println("<ul>");
                /*
                 * Find the set of support for the inconsistency. This will
                 * return us a collection of axioms
                 */
                __CLR4_5_200lvicnyjb.R.inc(29);Set<OWLAxiom> sos = debugger
                        .getSOSForInconsistentClass(unsatisfiable);
                /* Print the axioms. */
                __CLR4_5_200lvicnyjb.R.inc(30);for (OWLAxiom axiom : sos) {{
                    __CLR4_5_200lvicnyjb.R.inc(31);writer.println("<li>");
                    __CLR4_5_200lvicnyjb.R.inc(32);axiom.accept(renderer);
                    __CLR4_5_200lvicnyjb.R.inc(33);writer.println("</li>");
                }
                }__CLR4_5_200lvicnyjb.R.inc(34);writer.println("</ul>");
                __CLR4_5_200lvicnyjb.R.inc(35);writer.println("</div>\n");
            }
        }}
        }__CLR4_5_200lvicnyjb.R.inc(36);renderer.footer();
    }finally{__CLR4_5_200lvicnyjb.R.flushNeeded();}}
}
