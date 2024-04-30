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

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * This composite change will create a value partion - see "pattern 2" in
 * "Representing Specified Values in OWL: "value partitions" and "value sets""
 * (http://www.w3.org/TR/swbp-specified-values.)<br>
 * A value partition is an ontology design pattern which is used to represent a
 * set of closed values for a particular property. For example the property
 * hasSize might only take values from SmallSize, MediumSize and LargeSize. In
 * this case, the value partition is Size, and has the values SmallSize,
 * MediumSize and LargeSize. This composite change will set hasSize to be
 * functional and its range as Size. Size will be covered by SmallSize,
 * MediumSize and LargeSize and these classes which represent the values will be
 * made disjoint with eachother.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.0
 */
public class CreateValuePartition extends AbstractCompositeOntologyChange {public static class __CLR4_5_29c9clvickj88{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,349,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * Creates a composite change that will create a value partition.
     * 
     * @param dataFactory
     *        A data factory which can be used to create the necessary axioms
     * @param valuePartitionClass
     *        The class which represents the value partition.
     * @param valuePartionClasses
     *        The classes that represent the various values of the value
     *        partition.
     * @param valuePartitionProperty
     *        the property which should be used in conjunction with the value
     *        partition.
     * @param targetOntology
     *        The target ontology which the axioms that are necessary to create
     *        the value partition will be added to.
     */
    public CreateValuePartition(@Nonnull OWLDataFactory dataFactory,
            @Nonnull OWLClass valuePartitionClass,
            @Nonnull Set<OWLClass> valuePartionClasses,
            @Nonnull OWLObjectProperty valuePartitionProperty,
            @Nonnull OWLOntology targetOntology) {
        super(dataFactory);__CLR4_5_29c9clvickj88.R.inc(337);try{__CLR4_5_29c9clvickj88.R.inc(336);
        __CLR4_5_29c9clvickj88.R.inc(338);generateChanges(
                checkNotNull(targetOntology, "targetOntology cannot be null"),
                checkNotNull(valuePartionClasses,
                        "valuePartionClasses cannot be null"),
                checkNotNull(valuePartitionClass,
                        "valuePartitionClass cannot be null"),
                checkNotNull(valuePartitionProperty,
                        "valuePartitionProperty cannot be null"));
    }finally{__CLR4_5_29c9clvickj88.R.flushNeeded();}}

    private void generateChanges(@Nonnull OWLOntology targetOntology,
            @Nonnull Set<OWLClass> valuePartitionClasses,
            @Nonnull OWLClass valuePartitionClass,
            @Nonnull OWLObjectProperty valuePartitionProperty) {try{__CLR4_5_29c9clvickj88.R.inc(339);
        // To create a value partition from a set of classes which represent the
        // values, a value partition class, a property we...
        // 1) Make the classes which represent the values, subclasses of the
        // value partition class
        __CLR4_5_29c9clvickj88.R.inc(340);for (OWLClassExpression valuePartitionValue : valuePartitionClasses) {{
            assert (((valuePartitionValue != null)&&(__CLR4_5_29c9clvickj88.R.iget(341)!=0|true))||(__CLR4_5_29c9clvickj88.R.iget(342)==0&false));
            __CLR4_5_29c9clvickj88.R.inc(343);addChange(new AddAxiom(targetOntology, getDataFactory()
                    .getOWLSubClassOfAxiom(valuePartitionValue,
                            valuePartitionClass)));
        }
        // 2) Make the values disjoint
        }__CLR4_5_29c9clvickj88.R.inc(344);addChange(new AddAxiom(targetOntology, getDataFactory()
                .getOWLDisjointClassesAxiom(valuePartitionClasses)));
        // 3) Add a covering axiom to the value partition
        __CLR4_5_29c9clvickj88.R.inc(345);OWLClassExpression union = getDataFactory().getOWLObjectUnionOf(
                valuePartitionClasses);
        __CLR4_5_29c9clvickj88.R.inc(346);addChange(new AddAxiom(targetOntology, getDataFactory()
                .getOWLSubClassOfAxiom(valuePartitionClass, union)));
        // 4) Make the property functional
        __CLR4_5_29c9clvickj88.R.inc(347);addChange(new AddAxiom(targetOntology, getDataFactory()
                .getOWLFunctionalObjectPropertyAxiom(valuePartitionProperty)));
        // 5) Set the range of the property to be the value partition
        __CLR4_5_29c9clvickj88.R.inc(348);addChange(new AddAxiom(targetOntology, getDataFactory()
                .getOWLObjectPropertyRangeAxiom(valuePartitionProperty,
                        valuePartitionClass)));
    }finally{__CLR4_5_29c9clvickj88.R.flushNeeded();}}
}
