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
package uk.ac.manchester.owl.owlapi.tutorial.examples;

import static org.semanticweb.owlapi.search.EntitySearcher.getAnnotationObjects;

import java.io.PrintStream;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;

import uk.ac.manchester.owl.owlapi.tutorial.LabelExtractor;

/**
 * Simple example. Read an ontology, and display the class hierarchy. May use a
 * reasoner to calculate the hierarchy.
 * 
 * @author Sean Bechhofer, The University Of Manchester, Information Management
 *         Group
 * @since 2.0.0
 */
@SuppressWarnings("javadoc")
public final class SimpleHierarchyExample {public static class __CLR4_5_2bxbbxblvico2g4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,15508,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int INDENT = 4;
    @Nonnull
    private final OWLReasonerFactory reasonerFactory;
    @Nonnull
    private final OWLOntology ontology;
    private final PrintStream out;

    private SimpleHierarchyExample(@Nonnull OWLReasonerFactory reasonerFactory, @Nonnull OWLOntology inputOntology) {try{__CLR4_5_2bxbbxblvico2g4.R.inc(15455);
        __CLR4_5_2bxbbxblvico2g4.R.inc(15456);this.reasonerFactory = reasonerFactory;
        __CLR4_5_2bxbbxblvico2g4.R.inc(15457);ontology = inputOntology;
        __CLR4_5_2bxbbxblvico2g4.R.inc(15458);out = System.out;
    }finally{__CLR4_5_2bxbbxblvico2g4.R.flushNeeded();}}

    /**
     * Print the class hierarchy for the given ontology from this class down,
     * assuming this class is at the given level. Makes no attempt to deal
     * sensibly with multiple inheritance.
     */
    private void printHierarchy(@Nonnull OWLClass clazz) throws OWLException {try{__CLR4_5_2bxbbxblvico2g4.R.inc(15459);
        __CLR4_5_2bxbbxblvico2g4.R.inc(15460);OWLReasoner reasoner = reasonerFactory.createNonBufferingReasoner(ontology);
        __CLR4_5_2bxbbxblvico2g4.R.inc(15461);printHierarchy(reasoner, clazz, 0);
        /* Now print out any unsatisfiable classes */
        __CLR4_5_2bxbbxblvico2g4.R.inc(15462);for (OWLClass cl : ontology.getClassesInSignature()) {{
            assert (((cl != null)&&(__CLR4_5_2bxbbxblvico2g4.R.iget(15463)!=0|true))||(__CLR4_5_2bxbbxblvico2g4.R.iget(15464)==0&false));
            __CLR4_5_2bxbbxblvico2g4.R.inc(15465);if ((((!reasoner.isSatisfiable(cl))&&(__CLR4_5_2bxbbxblvico2g4.R.iget(15466)!=0|true))||(__CLR4_5_2bxbbxblvico2g4.R.iget(15467)==0&false))) {{
                __CLR4_5_2bxbbxblvico2g4.R.inc(15468);out.println("XXX: " + labelFor(cl));
            }
        }}
        }__CLR4_5_2bxbbxblvico2g4.R.inc(15469);reasoner.dispose();
    }finally{__CLR4_5_2bxbbxblvico2g4.R.flushNeeded();}}

    private String labelFor(@Nonnull OWLClass clazz) {try{__CLR4_5_2bxbbxblvico2g4.R.inc(15470);
        /*
         * Use a visitor to extract label annotations
         */
        __CLR4_5_2bxbbxblvico2g4.R.inc(15471);LabelExtractor le = new LabelExtractor();
        __CLR4_5_2bxbbxblvico2g4.R.inc(15472);for (OWLAnnotation anno : getAnnotationObjects(clazz, ontology)) {{
            __CLR4_5_2bxbbxblvico2g4.R.inc(15473);anno.accept(le);
        }
        /* Print out the label if there is one. If not, just use the class URI */
        }__CLR4_5_2bxbbxblvico2g4.R.inc(15474);if ((((le.getResult() != null)&&(__CLR4_5_2bxbbxblvico2g4.R.iget(15475)!=0|true))||(__CLR4_5_2bxbbxblvico2g4.R.iget(15476)==0&false))) {{
            __CLR4_5_2bxbbxblvico2g4.R.inc(15477);return le.getResult();
        } }else {{
            __CLR4_5_2bxbbxblvico2g4.R.inc(15478);return clazz.getIRI().toString();
        }
    }}finally{__CLR4_5_2bxbbxblvico2g4.R.flushNeeded();}}

    /**
     * Print the class hierarchy from this class down, assuming this class is at
     * the given level. Makes no attempt to deal sensibly with multiple
     * inheritance.
     */
    private void printHierarchy(@Nonnull OWLReasoner reasoner, @Nonnull OWLClass clazz, int level) throws OWLException {try{__CLR4_5_2bxbbxblvico2g4.R.inc(15479);
        /*
         * Only print satisfiable classes -- otherwise we end up with bottom
         * everywhere
         */
        __CLR4_5_2bxbbxblvico2g4.R.inc(15480);if ((((reasoner.isSatisfiable(clazz))&&(__CLR4_5_2bxbbxblvico2g4.R.iget(15481)!=0|true))||(__CLR4_5_2bxbbxblvico2g4.R.iget(15482)==0&false))) {{
            __CLR4_5_2bxbbxblvico2g4.R.inc(15483);for (int i = 0; (((i < level * INDENT)&&(__CLR4_5_2bxbbxblvico2g4.R.iget(15484)!=0|true))||(__CLR4_5_2bxbbxblvico2g4.R.iget(15485)==0&false)); i++) {{
                __CLR4_5_2bxbbxblvico2g4.R.inc(15486);out.print(" ");
            }
            }__CLR4_5_2bxbbxblvico2g4.R.inc(15487);out.println(labelFor(clazz));
            /* Find the children and recurse */
            __CLR4_5_2bxbbxblvico2g4.R.inc(15488);for (OWLClass child : reasoner.getSubClasses(clazz, true).getFlattened()) {{
                __CLR4_5_2bxbbxblvico2g4.R.inc(15489);if ((((!child.equals(clazz))&&(__CLR4_5_2bxbbxblvico2g4.R.iget(15490)!=0|true))||(__CLR4_5_2bxbbxblvico2g4.R.iget(15491)==0&false))) {{
                    __CLR4_5_2bxbbxblvico2g4.R.inc(15492);printHierarchy(reasoner, child, level + 1);
                }
            }}
        }}
    }}finally{__CLR4_5_2bxbbxblvico2g4.R.flushNeeded();}}

    public static void main(String[] args) throws OWLException, InstantiationException, IllegalAccessException,
        ClassNotFoundException {try{__CLR4_5_2bxbbxblvico2g4.R.inc(15493);
        __CLR4_5_2bxbbxblvico2g4.R.inc(15494);String reasonerFactoryClassName = null;
        // We first need to obtain a copy of an
        // OWLOntologyManager, which, as the name
        // suggests, manages a set of ontologies.
        __CLR4_5_2bxbbxblvico2g4.R.inc(15495);OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        // We load an ontology from the URI specified
        // on the command line
        __CLR4_5_2bxbbxblvico2g4.R.inc(15496);@Nonnull
        String x = args[0];
        __CLR4_5_2bxbbxblvico2g4.R.inc(15497);System.out.println(x);
        __CLR4_5_2bxbbxblvico2g4.R.inc(15498);IRI documentIRI = IRI.create(x);
        // Now load the ontology.
        __CLR4_5_2bxbbxblvico2g4.R.inc(15499);OWLOntology ontology = manager.loadOntologyFromOntologyDocument(documentIRI);
        // Report information about the ontology
        __CLR4_5_2bxbbxblvico2g4.R.inc(15500);System.out.println("Ontology Loaded...");
        __CLR4_5_2bxbbxblvico2g4.R.inc(15501);System.out.println("Document IRI: " + documentIRI);
        __CLR4_5_2bxbbxblvico2g4.R.inc(15502);System.out.println("Ontology : " + ontology.getOntologyID());
        __CLR4_5_2bxbbxblvico2g4.R.inc(15503);System.out.println("Format      : " + manager.getOntologyFormat(ontology));
        // / Create a new SimpleHierarchy object with the given reasoner.
        __CLR4_5_2bxbbxblvico2g4.R.inc(15504);SimpleHierarchyExample simpleHierarchy = new SimpleHierarchyExample((OWLReasonerFactory) Class.forName(
            reasonerFactoryClassName).newInstance(), ontology);
        // Get Thing
        __CLR4_5_2bxbbxblvico2g4.R.inc(15505);OWLClass clazz = manager.getOWLDataFactory().getOWLThing();
        __CLR4_5_2bxbbxblvico2g4.R.inc(15506);System.out.println("Class       : " + clazz);
        // Print the hierarchy below thing
        __CLR4_5_2bxbbxblvico2g4.R.inc(15507);simpleHierarchy.printHierarchy(clazz);
    }finally{__CLR4_5_2bxbbxblvico2g4.R.flushNeeded();}}
}
