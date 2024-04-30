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
package org.semanticweb.owlapi.change;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLClassExpressionVisitorAdapter;

/**
 * This composite change adds a 'closure' axiom to an ontology for a given class
 * and object property. In this case, a closure axiom is defined for a given
 * class, A, and object property, P, to be a subclass axiom, whose subclass is
 * class A, and whose superclass is a universal restriction along the property,
 * P, whose filler is the union of any other existential (including hasValue
 * restrictions - i.e. nominals) restriction fillers that are the superclasses
 * of class A. <br>
 * This code is based on the tutorial examples by Sean Bechhofer (see the
 * tutorial module).
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.0
 */
public class AddClassExpressionClosureAxiom extends
        AbstractCompositeOntologyChange {public static class __CLR4_5_21q1qlvickiqa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,92,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * Creates a composite change that will add a closure axiom for a given
     * class along a specified property.
     * 
     * @param dataFactory
     *        The data factory that should be used to create the necessary
     *        objects
     * @param cls
     *        The class for which the closure axiom will be generated
     * @param property
     *        The property that the closure axiom will act along
     * @param ontologies
     *        The ontologies that will be examined for subclass axioms
     * @param targetOntology
     *        The target ontology that changes will be applied to.
     */
    public AddClassExpressionClosureAxiom(@Nonnull OWLDataFactory dataFactory,
            @Nonnull OWLClass cls,
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull Set<OWLOntology> ontologies,
            @Nonnull OWLOntology targetOntology) {
        super(dataFactory);__CLR4_5_21q1qlvickiqa.R.inc(63);try{__CLR4_5_21q1qlvickiqa.R.inc(62);
        __CLR4_5_21q1qlvickiqa.R.inc(64);generateChanges(checkNotNull(cls, "cls cannot be null"),
                checkNotNull(property, "property cannot be null"),
                checkNotNull(ontologies, "ontologies cannot be null"),
                checkNotNull(targetOntology, "targetOntology cannot be null"));
    }finally{__CLR4_5_21q1qlvickiqa.R.flushNeeded();}}

    private void generateChanges(@Nonnull OWLClass cls,
            @Nonnull OWLObjectPropertyExpression property,
            @Nonnull Set<OWLOntology> ontologies,
            @Nonnull OWLOntology targetOntology) {try{__CLR4_5_21q1qlvickiqa.R.inc(65);
        // We collect all of the fillers for existential restrictions along
        // the target property and all of the fillers for hasValue restrictions
        // as nominals
        __CLR4_5_21q1qlvickiqa.R.inc(66);FillerCollector collector = new FillerCollector(property);
        __CLR4_5_21q1qlvickiqa.R.inc(67);for (OWLOntology ont : ontologies) {{
            __CLR4_5_21q1qlvickiqa.R.inc(68);for (OWLSubClassOfAxiom ax : ont.getSubClassAxiomsForSubClass(cls)) {{
                __CLR4_5_21q1qlvickiqa.R.inc(69);ax.getSuperClass().accept(collector);
            }
        }}
        }__CLR4_5_21q1qlvickiqa.R.inc(70);Set<OWLClassExpression> fillers = collector.getFillers();
        __CLR4_5_21q1qlvickiqa.R.inc(71);if ((((fillers.isEmpty())&&(__CLR4_5_21q1qlvickiqa.R.iget(72)!=0|true))||(__CLR4_5_21q1qlvickiqa.R.iget(73)==0&false))) {{
            __CLR4_5_21q1qlvickiqa.R.inc(74);return;
        }
        }__CLR4_5_21q1qlvickiqa.R.inc(75);OWLClassExpression closureAxiomFiller = getDataFactory()
                .getOWLObjectUnionOf(fillers);
        __CLR4_5_21q1qlvickiqa.R.inc(76);OWLClassExpression closureAxiomDesc = getDataFactory()
                .getOWLObjectAllValuesFrom(property, closureAxiomFiller);
        __CLR4_5_21q1qlvickiqa.R.inc(77);addChange(new AddAxiom(targetOntology, getDataFactory()
                .getOWLSubClassOfAxiom(cls, closureAxiomDesc)));
    }finally{__CLR4_5_21q1qlvickiqa.R.flushNeeded();}}

    private class FillerCollector extends OWLClassExpressionVisitorAdapter {

        @Nonnull
        private final Set<OWLClassExpression> fillers = new HashSet<>();
        @Nonnull
        private final OWLObjectPropertyExpression property;

        /**
         * @param p
         *        the p
         */
        FillerCollector(@Nonnull OWLObjectPropertyExpression p) {try{__CLR4_5_21q1qlvickiqa.R.inc(78);
            __CLR4_5_21q1qlvickiqa.R.inc(79);property = checkNotNull(p, "p cannot be null");
        }finally{__CLR4_5_21q1qlvickiqa.R.flushNeeded();}}

        /** @return the fillers */
        @Nonnull
        public Set<OWLClassExpression> getFillers() {try{__CLR4_5_21q1qlvickiqa.R.inc(80);
            __CLR4_5_21q1qlvickiqa.R.inc(81);return fillers;
        }finally{__CLR4_5_21q1qlvickiqa.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectSomeValuesFrom ce) {try{__CLR4_5_21q1qlvickiqa.R.inc(82);
            __CLR4_5_21q1qlvickiqa.R.inc(83);if ((((ce.getProperty().equals(property))&&(__CLR4_5_21q1qlvickiqa.R.iget(84)!=0|true))||(__CLR4_5_21q1qlvickiqa.R.iget(85)==0&false))) {{
                __CLR4_5_21q1qlvickiqa.R.inc(86);fillers.add(ce.getFiller());
            }
        }}finally{__CLR4_5_21q1qlvickiqa.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLObjectHasValue ce) {try{__CLR4_5_21q1qlvickiqa.R.inc(87);
            __CLR4_5_21q1qlvickiqa.R.inc(88);if ((((ce.getProperty().equals(property))&&(__CLR4_5_21q1qlvickiqa.R.iget(89)!=0|true))||(__CLR4_5_21q1qlvickiqa.R.iget(90)==0&false))) {{
                __CLR4_5_21q1qlvickiqa.R.inc(91);fillers.add(getDataFactory().getOWLObjectOneOf(
                        CollectionFactory.createSet(ce.getFiller())));
            }
        }}finally{__CLR4_5_21q1qlvickiqa.R.flushNeeded();}}
    }
}
