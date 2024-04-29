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
package org.semanticweb.owlapi.change;/*
* Copyright (C) 2007, University of Manchester
*
* Modifications to the initial code base are copyright of their
* respective authors, or their employers as appropriate.  Authorship
* of the modifications may be determined from the ChangeLog placed at
* the end of this file.
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.

* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.

* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
*/

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 * This composite change will convert a primitive class to a defined class by
 * replacing subclass axioms where the class in question is on the left hand
 * side of the subclass axiom to an equivalent classes axiom which makes the
 * class equivalent to the intersection of its superclasses. <br>
 * More formally, given a class A, a set of ontologies S, and a target
 * targetOntology T, for each targetOntology O in S, subclass axioms whose LHS
 * is A will be removed from O. The superclasses from these axioms will be
 * combined into an intersection class which will be made equivalent to A using
 * an equivalent classes axioms E. E will be added to the target targetOntology
 * T.<br>
 * This composite change supports the pattern of working where a primitive class
 * is converted to a defined class - functionality which is usually found in
 * editors.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.0
 */
public class ConvertSuperClassesToEquivalentClass extends
        AbstractCompositeOntologyChange {public static class __CLR4_5_28u8ulvickj7u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,336,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * Instantiates a new convert super classes to equivalent class.
     * 
     * @param dataFactory
     *        A data factory which can be used to create the appropriate axioms
     * @param cls
     *        The class whose superclasses will be converted to an equivalent
     *        class.
     * @param ontologies
     *        The ontologies which should be examined for subclass axioms.
     * @param targetOntology
     *        The targetOntology which the equivalent classes axiom should be
     *        added to
     */
    public ConvertSuperClassesToEquivalentClass(
            @Nonnull OWLDataFactory dataFactory, @Nonnull OWLClass cls,
            @Nonnull Set<OWLOntology> ontologies,
            @Nonnull OWLOntology targetOntology) {
        super(dataFactory);__CLR4_5_28u8ulvickj7u.R.inc(319);try{__CLR4_5_28u8ulvickj7u.R.inc(318);
        __CLR4_5_28u8ulvickj7u.R.inc(320);generateChanges(
                checkNotNull(targetOntology, "targetOntology cannot be null"),
                checkNotNull(cls, "cls cannot be null"),
                checkNotNull(ontologies, "ontologies cannot be null"));
    }finally{__CLR4_5_28u8ulvickj7u.R.flushNeeded();}}

    private void generateChanges(@Nonnull OWLOntology targetOntology,
            @Nonnull OWLClass cls, @Nonnull Set<OWLOntology> ontologies) {try{__CLR4_5_28u8ulvickj7u.R.inc(321);
        // We remove the existing superclasses and then combine these
        // into an intersection which is made equivalent.
        __CLR4_5_28u8ulvickj7u.R.inc(322);Set<OWLClassExpression> descs = new HashSet<>();
        __CLR4_5_28u8ulvickj7u.R.inc(323);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_28u8ulvickj7u.R.iget(324)!=0|true))||(__CLR4_5_28u8ulvickj7u.R.iget(325)==0&false));
            __CLR4_5_28u8ulvickj7u.R.inc(326);for (OWLSubClassOfAxiom ax : ont.getSubClassAxiomsForSubClass(cls)) {{
                assert (((ax != null)&&(__CLR4_5_28u8ulvickj7u.R.iget(327)!=0|true))||(__CLR4_5_28u8ulvickj7u.R.iget(328)==0&false));
                __CLR4_5_28u8ulvickj7u.R.inc(329);addChange(new RemoveAxiom(ont, ax));
                __CLR4_5_28u8ulvickj7u.R.inc(330);descs.add(ax.getSuperClass());
            }
        }}
        }__CLR4_5_28u8ulvickj7u.R.inc(331);OWLClassExpression equivalentClass = getDataFactory()
                .getOWLObjectIntersectionOf(descs);
        __CLR4_5_28u8ulvickj7u.R.inc(332);Set<OWLClassExpression> equivalentClasses = new HashSet<>();
        __CLR4_5_28u8ulvickj7u.R.inc(333);equivalentClasses.add(cls);
        __CLR4_5_28u8ulvickj7u.R.inc(334);equivalentClasses.add(equivalentClass);
        __CLR4_5_28u8ulvickj7u.R.inc(335);addChange(new AddAxiom(targetOntology, getDataFactory()
                .getOWLEquivalentClassesAxiom(equivalentClasses)));
    }finally{__CLR4_5_28u8ulvickj7u.R.flushNeeded();}}
}
