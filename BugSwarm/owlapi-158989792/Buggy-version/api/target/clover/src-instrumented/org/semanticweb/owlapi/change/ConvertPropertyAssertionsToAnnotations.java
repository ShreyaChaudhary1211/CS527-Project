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

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 * Given a set of ontologies, this composite change will convert all property
 * assertion axioms whose subject is a 'punned' individual (i.e. an individual
 * that shares a name with a class), removes these axioms and replaces them with
 * annotations on the class that shares the same name as the individual. For
 * example for a class A and an individual A, the data property assertion
 * hasX(A, "Val") would be converted to an entity annotation on the class A with
 * an annotation URI of "hasX" and a value of "Val".<br>
 * This composite change supports refactoring an ontology where punning was used
 * to simulate annotations on a class rather than using actual annotations on a
 * class.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.0
 */
public class ConvertPropertyAssertionsToAnnotations extends
        AbstractCompositeOntologyChange {public static class __CLR4_5_26x6xlvickj6k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final Set<OWLOntology> ontologies;

    /**
     * Instantiates a new convert property assertions to annotations.
     * 
     * @param dataFactory
     *        factory to use
     * @param ontologies
     *        ontologies to change
     */
    public ConvertPropertyAssertionsToAnnotations(
            @Nonnull OWLDataFactory dataFactory,
            @Nonnull Set<OWLOntology> ontologies) {
        super(dataFactory);__CLR4_5_26x6xlvickj6k.R.inc(250);try{__CLR4_5_26x6xlvickj6k.R.inc(249);
        __CLR4_5_26x6xlvickj6k.R.inc(251);this.ontologies = checkNotNull(ontologies, "ontologies cannot be null");
        __CLR4_5_26x6xlvickj6k.R.inc(252);generateChanges();
    }finally{__CLR4_5_26x6xlvickj6k.R.flushNeeded();}}

    /**
     * Gets the punned individuals.
     * 
     * @param individuals
     *        the individuals
     * @return the punned individuals
     */
    @Nonnull
    private Collection<OWLNamedIndividual> getPunnedIndividuals(
            @Nonnull Collection<OWLNamedIndividual> individuals) {try{__CLR4_5_26x6xlvickj6k.R.inc(253);
        __CLR4_5_26x6xlvickj6k.R.inc(254);List<OWLNamedIndividual> punned = new ArrayList<>();
        __CLR4_5_26x6xlvickj6k.R.inc(255);for (OWLNamedIndividual ind : individuals) {{
            __CLR4_5_26x6xlvickj6k.R.inc(256);for (OWLOntology ont : ontologies) {{
                __CLR4_5_26x6xlvickj6k.R.inc(257);if ((((ont.containsClassInSignature(ind.getIRI(), EXCLUDED))&&(__CLR4_5_26x6xlvickj6k.R.iget(258)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(259)==0&false))) {{
                    __CLR4_5_26x6xlvickj6k.R.inc(260);punned.add(ind);
                }
            }}
        }}
        }__CLR4_5_26x6xlvickj6k.R.inc(261);return punned;
    }finally{__CLR4_5_26x6xlvickj6k.R.flushNeeded();}}

    private void generateChanges() {try{__CLR4_5_26x6xlvickj6k.R.inc(262);
        __CLR4_5_26x6xlvickj6k.R.inc(263);Collection<OWLNamedIndividual> individuals = getPunnedIndividuals(collectIndividuals());
        __CLR4_5_26x6xlvickj6k.R.inc(264);Set<OWLDataProperty> convertedDataProperties = new HashSet<>();
        __CLR4_5_26x6xlvickj6k.R.inc(265);for (OWLNamedIndividual ind : individuals) {{
            assert (((ind != null)&&(__CLR4_5_26x6xlvickj6k.R.iget(266)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(267)==0&false));
            __CLR4_5_26x6xlvickj6k.R.inc(268);convertDataAssertionsToAnnotations(convertedDataProperties, ind);
            __CLR4_5_26x6xlvickj6k.R.inc(269);removeDeclarationsAndClassAssertions(ind);
        }
        }__CLR4_5_26x6xlvickj6k.R.inc(270);for (OWLDataProperty prop : convertedDataProperties) {{
            assert (((prop != null)&&(__CLR4_5_26x6xlvickj6k.R.iget(271)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(272)==0&false));
            __CLR4_5_26x6xlvickj6k.R.inc(273);removeDeclarationsAndAxioms(prop);
        }
    }}finally{__CLR4_5_26x6xlvickj6k.R.flushNeeded();}}

    private void removeDeclarationsAndAxioms(@Nonnull OWLDataProperty prop) {try{__CLR4_5_26x6xlvickj6k.R.inc(274);
        __CLR4_5_26x6xlvickj6k.R.inc(275);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_26x6xlvickj6k.R.iget(276)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(277)==0&false));
            __CLR4_5_26x6xlvickj6k.R.inc(278);for (OWLAxiom ax : ont.getDeclarationAxioms(prop)) {{
                assert (((ax != null)&&(__CLR4_5_26x6xlvickj6k.R.iget(279)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(280)==0&false));
                __CLR4_5_26x6xlvickj6k.R.inc(281);addChange(new RemoveAxiom(ont, ax));
            }
            }__CLR4_5_26x6xlvickj6k.R.inc(282);for (OWLAxiom ax : ont.getAxioms(prop, EXCLUDED)) {{
                assert (((ax != null)&&(__CLR4_5_26x6xlvickj6k.R.iget(283)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(284)==0&false));
                __CLR4_5_26x6xlvickj6k.R.inc(285);addChange(new RemoveAxiom(ont, ax));
            }
        }}
    }}finally{__CLR4_5_26x6xlvickj6k.R.flushNeeded();}}

    private void removeDeclarationsAndClassAssertions(
            @Nonnull OWLNamedIndividual ind) {try{__CLR4_5_26x6xlvickj6k.R.inc(286);
        __CLR4_5_26x6xlvickj6k.R.inc(287);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_26x6xlvickj6k.R.iget(288)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(289)==0&false));
            __CLR4_5_26x6xlvickj6k.R.inc(290);for (OWLAxiom ax : ont.getDeclarationAxioms(ind)) {{
                assert (((ax != null)&&(__CLR4_5_26x6xlvickj6k.R.iget(291)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(292)==0&false));
                __CLR4_5_26x6xlvickj6k.R.inc(293);addChange(new RemoveAxiom(ont, ax));
            }
            }__CLR4_5_26x6xlvickj6k.R.inc(294);for (OWLClassAssertionAxiom ax : ont.getClassAssertionAxioms(ind)) {{
                assert (((ax != null)&&(__CLR4_5_26x6xlvickj6k.R.iget(295)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(296)==0&false));
                __CLR4_5_26x6xlvickj6k.R.inc(297);addChange(new RemoveAxiom(ont, ax));
            }
        }}
    }}finally{__CLR4_5_26x6xlvickj6k.R.flushNeeded();}}

    private void convertDataAssertionsToAnnotations(
            @Nonnull Set<OWLDataProperty> convertedDataProperties,
            @Nonnull OWLNamedIndividual ind) {try{__CLR4_5_26x6xlvickj6k.R.inc(298);
        __CLR4_5_26x6xlvickj6k.R.inc(299);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_26x6xlvickj6k.R.iget(300)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(301)==0&false));
            __CLR4_5_26x6xlvickj6k.R.inc(302);for (OWLDataPropertyAssertionAxiom ax : ont
                    .getDataPropertyAssertionAxioms(ind)) {{
                __CLR4_5_26x6xlvickj6k.R.inc(303);if ((((!ax.getProperty().isAnonymous())&&(__CLR4_5_26x6xlvickj6k.R.iget(304)!=0|true))||(__CLR4_5_26x6xlvickj6k.R.iget(305)==0&false))) {{
                    __CLR4_5_26x6xlvickj6k.R.inc(306);addChange(new RemoveAxiom(ont, ax));
                    __CLR4_5_26x6xlvickj6k.R.inc(307);addChange(new AddAxiom(ont, convertToAnnotation(ind, ax)));
                    __CLR4_5_26x6xlvickj6k.R.inc(308);convertedDataProperties.add((OWLDataProperty) ax
                            .getProperty());
                }
            }}
        }}
    }}finally{__CLR4_5_26x6xlvickj6k.R.flushNeeded();}}

    @Nonnull
    private OWLAnnotationAssertionAxiom convertToAnnotation(
            @Nonnull OWLNamedIndividual ind,
            @Nonnull OWLDataPropertyAssertionAxiom ax) {try{__CLR4_5_26x6xlvickj6k.R.inc(309);
        __CLR4_5_26x6xlvickj6k.R.inc(310);OWLDataFactory df = getDataFactory();
        __CLR4_5_26x6xlvickj6k.R.inc(311);OWLAnnotation anno = df.getOWLAnnotation(
                df.getOWLAnnotationProperty(ax.getProperty()
                        .asOWLDataProperty().getIRI()), ax.getObject());
        __CLR4_5_26x6xlvickj6k.R.inc(312);return df.getOWLAnnotationAssertionAxiom(ind.getIRI(), anno);
    }finally{__CLR4_5_26x6xlvickj6k.R.flushNeeded();}}

    @Nonnull
    private Set<OWLNamedIndividual> collectIndividuals() {try{__CLR4_5_26x6xlvickj6k.R.inc(313);
        __CLR4_5_26x6xlvickj6k.R.inc(314);Set<OWLNamedIndividual> individuals = new HashSet<>();
        __CLR4_5_26x6xlvickj6k.R.inc(315);for (OWLOntology ont : ontologies) {{
            __CLR4_5_26x6xlvickj6k.R.inc(316);individuals.addAll(ont.getIndividualsInSignature());
        }
        }__CLR4_5_26x6xlvickj6k.R.inc(317);return individuals;
    }finally{__CLR4_5_26x6xlvickj6k.R.flushNeeded();}}
}
