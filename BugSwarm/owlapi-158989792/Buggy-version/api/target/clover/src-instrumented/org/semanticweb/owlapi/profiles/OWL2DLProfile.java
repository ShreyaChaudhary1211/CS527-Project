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
package org.semanticweb.owlapi.profiles;

import static org.semanticweb.owlapi.model.parameters.Imports.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyID;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.profiles.violations.CycleInDatatypeDefinition;
import org.semanticweb.owlapi.profiles.violations.DatatypeIRIAlsoUsedAsClassIRI;
import org.semanticweb.owlapi.profiles.violations.EmptyOneOfAxiom;
import org.semanticweb.owlapi.profiles.violations.IllegalPunning;
import org.semanticweb.owlapi.profiles.violations.InsufficientIndividuals;
import org.semanticweb.owlapi.profiles.violations.InsufficientOperands;
import org.semanticweb.owlapi.profiles.violations.InsufficientPropertyExpressions;
import org.semanticweb.owlapi.profiles.violations.UseOfBuiltInDatatypeInDatatypeDefinition;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInCardinalityRestriction;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInDisjointPropertiesAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInFunctionalPropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInIrreflexivePropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSimplePropertyInObjectHasSelf;
import org.semanticweb.owlapi.profiles.violations.UseOfPropertyInChainCausesCycle;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForAnnotationPropertyIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForClassIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForDataPropertyIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForIndividualIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForObjectPropertyIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForOntologyIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfReservedVocabularyForVersionIRI;
import org.semanticweb.owlapi.profiles.violations.UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredAnnotationProperty;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredClass;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredDataProperty;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredDatatype;
import org.semanticweb.owlapi.profiles.violations.UseOfUndeclaredObjectProperty;
import org.semanticweb.owlapi.profiles.violations.UseOfUnknownDatatype;
import org.semanticweb.owlapi.util.OWLObjectPropertyManager;
import org.semanticweb.owlapi.util.OWLOntologyWalker;
import org.semanticweb.owlapi.util.OWLOntologyWalkerVisitor;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import com.google.common.base.Optional;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 */
public class OWL2DLProfile implements OWLProfile {public static class __CLR4_5_22kb2kblvicknbr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,3675,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Gets the name of the profile.
     * 
     * @return A string that represents the name of the profile
     */
    @Override
    public String getName() {try{__CLR4_5_22kb2kblvicknbr.R.inc(3323);
        __CLR4_5_22kb2kblvicknbr.R.inc(3324);return "OWL 2 DL";
    }finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

    @Nonnull
    @Override
    public IRI getIRI() {try{__CLR4_5_22kb2kblvicknbr.R.inc(3325);
        __CLR4_5_22kb2kblvicknbr.R.inc(3326);return Profiles.OWL2_DL.getIRI();
    }finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

    /**
     * Checks an ontology and its import closure to see if it is within this
     * profile.
     * 
     * @param ontology
     *        The ontology to be checked.
     * @return An {@code OWLProfileReport} that describes whether or not the
     *         ontology is within this profile.
     */
    @Override
    public OWLProfileReport checkOntology(OWLOntology ontology) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3327);
        __CLR4_5_22kb2kblvicknbr.R.inc(3328);OWL2Profile owl2Profile = new OWL2Profile();
        __CLR4_5_22kb2kblvicknbr.R.inc(3329);OWLProfileReport report = owl2Profile.checkOntology(ontology);
        __CLR4_5_22kb2kblvicknbr.R.inc(3330);Set<OWLProfileViolation> violations = new LinkedHashSet<>();
        __CLR4_5_22kb2kblvicknbr.R.inc(3331);if ((((!report.isInProfile())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3332)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3333)==0&false))) {{
            // We won't be in the OWL 2 DL Profile then!
            __CLR4_5_22kb2kblvicknbr.R.inc(3334);violations.addAll(report.getViolations());
        }
        }__CLR4_5_22kb2kblvicknbr.R.inc(3335);OWLOntologyProfileWalker walker = new OWLOntologyProfileWalker(
                ontology.getImportsClosure());
        __CLR4_5_22kb2kblvicknbr.R.inc(3336);OWL2DLProfileObjectVisitor visitor = new OWL2DLProfileObjectVisitor(
                walker, ontology.getOWLOntologyManager());
        __CLR4_5_22kb2kblvicknbr.R.inc(3337);walker.walkStructure(visitor);
        __CLR4_5_22kb2kblvicknbr.R.inc(3338);violations.addAll(visitor.getProfileViolations());
        __CLR4_5_22kb2kblvicknbr.R.inc(3339);return new OWLProfileReport(this, violations);
    }finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

    private static class OWL2DLProfileObjectVisitor extends
            OWLOntologyWalkerVisitor {

        private OWLObjectPropertyManager objectPropertyManager = null;
        @Nonnull
        private final OWLOntologyManager manager;
        @Nonnull
        private final Set<OWLProfileViolation> profileViolations = new HashSet<>();

        OWL2DLProfileObjectVisitor(@Nonnull OWLOntologyWalker walker,
                @Nonnull OWLOntologyManager manager) {
            super(walker);__CLR4_5_22kb2kblvicknbr.R.inc(3341);try{__CLR4_5_22kb2kblvicknbr.R.inc(3340);
            __CLR4_5_22kb2kblvicknbr.R.inc(3342);this.manager = manager;
        }finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        public Set<OWLProfileViolation> getProfileViolations() {try{__CLR4_5_22kb2kblvicknbr.R.inc(3343);
            __CLR4_5_22kb2kblvicknbr.R.inc(3344);return new HashSet<>(profileViolations);
        }finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        private OWLObjectPropertyManager getPropertyManager() {try{__CLR4_5_22kb2kblvicknbr.R.inc(3345);
            __CLR4_5_22kb2kblvicknbr.R.inc(3346);if ((((objectPropertyManager == null)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3347)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3348)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3349);objectPropertyManager = new OWLObjectPropertyManager(manager,
                        getCurrentOntology());
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3350);return objectPropertyManager;
        }finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataOneOf node) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3351);
            __CLR4_5_22kb2kblvicknbr.R.inc(3352);if ((((node.getValues().isEmpty())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3353)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3354)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3355);profileViolations.add(new EmptyOneOfAxiom(getCurrentOntology(),
                        getCurrentAxiom()));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataUnionOf node) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3356);
            __CLR4_5_22kb2kblvicknbr.R.inc(3357);if ((((node.getOperands().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3358)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3359)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3360);profileViolations.add(new InsufficientOperands(
                        getCurrentOntology(), getCurrentAxiom(), node));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3361);
            __CLR4_5_22kb2kblvicknbr.R.inc(3362);if ((((node.getOperands().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3363)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3364)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3365);profileViolations.add(new InsufficientOperands(
                        getCurrentOntology(), getCurrentAxiom(), node));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3366);
            __CLR4_5_22kb2kblvicknbr.R.inc(3367);if ((((ce.getOperands().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3368)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3369)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3370);profileViolations.add(new InsufficientOperands(
                        getCurrentOntology(), getCurrentAxiom(), ce));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectOneOf ce) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3371);
            __CLR4_5_22kb2kblvicknbr.R.inc(3372);if ((((ce.getIndividuals().isEmpty())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3373)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3374)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3375);profileViolations.add(new EmptyOneOfAxiom(getCurrentOntology(),
                        getCurrentAxiom()));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3376);
            __CLR4_5_22kb2kblvicknbr.R.inc(3377);if ((((ce.getOperands().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3378)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3379)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3380);profileViolations.add(new InsufficientOperands(
                        getCurrentOntology(), getCurrentAxiom(), ce));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3381);
            __CLR4_5_22kb2kblvicknbr.R.inc(3382);if ((((axiom.getClassExpressions().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3383)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3384)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3385);profileViolations.add(new InsufficientOperands(
                        getCurrentOntology(), axiom, axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3386);
            __CLR4_5_22kb2kblvicknbr.R.inc(3387);if ((((axiom.getClassExpressions().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3388)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3389)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3390);profileViolations.add(new InsufficientOperands(
                        getCurrentOntology(), axiom, axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3391);
            __CLR4_5_22kb2kblvicknbr.R.inc(3392);if ((((axiom.getClassExpressions().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3393)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3394)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3395);profileViolations.add(new InsufficientOperands(
                        getCurrentOntology(), axiom, axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3396);
            __CLR4_5_22kb2kblvicknbr.R.inc(3397);if ((((axiom.getProperties().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3398)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3399)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3400);profileViolations.add(new InsufficientPropertyExpressions(
                        getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3401);
            __CLR4_5_22kb2kblvicknbr.R.inc(3402);if ((((axiom.getProperties().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3403)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3404)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3405);profileViolations.add(new InsufficientPropertyExpressions(
                        getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3406);
            __CLR4_5_22kb2kblvicknbr.R.inc(3407);if ((((axiom.getProperties().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3408)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3409)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3410);profileViolations.add(new InsufficientPropertyExpressions(
                        getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3411);
            __CLR4_5_22kb2kblvicknbr.R.inc(3412);if ((((axiom.getPropertyExpressions().size() < 1)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3413)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3414)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3415);profileViolations.add(new InsufficientPropertyExpressions(
                        getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3416);
            __CLR4_5_22kb2kblvicknbr.R.inc(3417);if ((((axiom.getIndividuals().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3418)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3419)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3420);profileViolations.add(new InsufficientIndividuals(
                        getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3421);
            __CLR4_5_22kb2kblvicknbr.R.inc(3422);if ((((axiom.getIndividuals().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3423)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3424)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3425);profileViolations.add(new InsufficientIndividuals(
                        getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLOntology ontology) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3426);
            __CLR4_5_22kb2kblvicknbr.R.inc(3427);OWLOntologyID ontologyID = ontology.getOntologyID();
            __CLR4_5_22kb2kblvicknbr.R.inc(3428);if ((((!ontologyID.isAnonymous())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3429)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3430)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3431);if ((((ontologyID.getOntologyIRI().get().isReservedVocabulary())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3432)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3433)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3434);profileViolations
                            .add(new UseOfReservedVocabularyForOntologyIRI(
                                    getCurrentOntology()));
                }
                }__CLR4_5_22kb2kblvicknbr.R.inc(3435);Optional<IRI> versionIRI = ontologyID.getVersionIRI();
                __CLR4_5_22kb2kblvicknbr.R.inc(3436);if ((((versionIRI.isPresent())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3437)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3438)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3439);if ((((versionIRI.get().isReservedVocabulary())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3440)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3441)==0&false))) {{
                        __CLR4_5_22kb2kblvicknbr.R.inc(3442);profileViolations
                                .add(new UseOfReservedVocabularyForVersionIRI(
                                        getCurrentOntology()));
                    }
                }}
            }}
            }__CLR4_5_22kb2kblvicknbr.R.inc(3443);objectPropertyManager = null;
        }finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLClass ce) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3444);
            __CLR4_5_22kb2kblvicknbr.R.inc(3445);if ((((!ce.isBuiltIn())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3446)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3447)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3448);if ((((ce.getIRI().isReservedVocabulary())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3449)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3450)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3451);profileViolations
                            .add(new UseOfReservedVocabularyForClassIRI(
                                    getCurrentOntology(), getCurrentAxiom(), ce));
                }
            }}
            }__CLR4_5_22kb2kblvicknbr.R.inc(3452);if ((((!ce.isBuiltIn()
                    && !getCurrentOntology().isDeclared(ce, INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3453)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3454)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3455);profileViolations.add(new UseOfUndeclaredClass(
                        getCurrentOntology(), getCurrentAxiom(), ce));
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3456);if ((((getCurrentOntology().containsDatatypeInSignature(ce.getIRI(),
                    EXCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3457)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3458)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3459);profileViolations.add(new DatatypeIRIAlsoUsedAsClassIRI(
                        getCurrentOntology(), getCurrentAxiom(), ce.getIRI()));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatype node) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3460);
            // Each datatype MUST statisfy the following:
            // An IRI used to identify a datatype MUST
            // - Identify a datatype in the OWL 2 datatype map (Section 4.1
            // lists them), or
            // - Have the xsd: prefix, or
            // - Be rdfs:Literal, or
            // - Not be in the reserved vocabulary of OWL 2
            __CLR4_5_22kb2kblvicknbr.R.inc(3461);if ((((!OWL2Datatype.isBuiltIn(node.getIRI()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3462)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3463)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3464);if ((((!node.getIRI().getNamespace()
                        .equals(Namespaces.XSD.toString()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3465)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3466)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3467);if ((((!node.isTopDatatype())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3468)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3469)==0&false))) {{
                        __CLR4_5_22kb2kblvicknbr.R.inc(3470);if ((((node.getIRI().isReservedVocabulary())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3471)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3472)==0&false))) {{
                            __CLR4_5_22kb2kblvicknbr.R.inc(3473);profileViolations.add(new UseOfUnknownDatatype(
                                    getCurrentOntology(), getCurrentAxiom(),
                                    node));
                        }
                    }}
                }}
                // We also have to declare datatypes that are not built in
                // bug?
                // if (!datatype.isTopDatatype() && datatype.isBuiltIn()
                // && getCurrentOntology().isDeclared(datatype, true)) {
                }__CLR4_5_22kb2kblvicknbr.R.inc(3474);if ((((!node.isTopDatatype() && !node.isBuiltIn()
                        && !getCurrentOntology().isDeclared(node, INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3475)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3476)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3477);profileViolations.add(new UseOfUndeclaredDatatype(
                            getCurrentOntology(), getCurrentAxiom(), node));
                }
            }}
            }__CLR4_5_22kb2kblvicknbr.R.inc(3478);if ((((getCurrentOntology().containsClassInSignature(node.getIRI(),
                    INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3479)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3480)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3481);profileViolations
                        .add(new DatatypeIRIAlsoUsedAsClassIRI(
                                getCurrentOntology(), getCurrentAxiom(), node
                                        .getIRI()));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3482);
            __CLR4_5_22kb2kblvicknbr.R.inc(3483);if ((((axiom.getDatatype().getIRI().isReservedVocabulary())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3484)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3485)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3486);profileViolations
                        .add(new UseOfBuiltInDatatypeInDatatypeDefinition(
                                getCurrentOntology(), axiom));
            }
            // Check for cycles
            }__CLR4_5_22kb2kblvicknbr.R.inc(3487);Set<OWLDatatype> datatypes = new HashSet<>();
            __CLR4_5_22kb2kblvicknbr.R.inc(3488);Set<OWLAxiom> axioms = new LinkedHashSet<>();
            __CLR4_5_22kb2kblvicknbr.R.inc(3489);axioms.add(axiom);
            __CLR4_5_22kb2kblvicknbr.R.inc(3490);getDatatypesInSignature(datatypes, axiom.getDataRange(), axioms);
            __CLR4_5_22kb2kblvicknbr.R.inc(3491);if ((((datatypes.contains(axiom.getDatatype()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3492)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3493)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3494);profileViolations.add(new CycleInDatatypeDefinition(
                        getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        private void getDatatypesInSignature(Set<OWLDatatype> datatypes,
                OWLObject obj, Set<OWLAxiom> axioms) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3495);
            __CLR4_5_22kb2kblvicknbr.R.inc(3496);for (OWLDatatype dt : obj.getDatatypesInSignature()) {{
                assert (((dt != null)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3497)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3498)==0&false));
                __CLR4_5_22kb2kblvicknbr.R.inc(3499);if ((((datatypes.add(dt))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3500)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3501)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3502);for (OWLOntology ont : getCurrentOntology()
                            .getImportsClosure()) {{
                        __CLR4_5_22kb2kblvicknbr.R.inc(3503);for (OWLDatatypeDefinitionAxiom ax : ont
                                .getDatatypeDefinitions(dt)) {{
                            __CLR4_5_22kb2kblvicknbr.R.inc(3504);axioms.add(ax);
                            __CLR4_5_22kb2kblvicknbr.R.inc(3505);getDatatypesInSignature(datatypes,
                                    ax.getDataRange(), axioms);
                        }
                    }}
                }}
            }}
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectProperty property) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3506);
            __CLR4_5_22kb2kblvicknbr.R.inc(3507);if ((((!property.isOWLTopObjectProperty()
                    && !property.isOWLBottomObjectProperty())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3508)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3509)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3510);if ((((property.getIRI().isReservedVocabulary())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3511)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3512)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3513);profileViolations
                            .add(new UseOfReservedVocabularyForObjectPropertyIRI(
                                    getCurrentOntology(), getCurrentAxiom(),
                                    property));
                }
            }}
            }__CLR4_5_22kb2kblvicknbr.R.inc(3514);if ((((!property.isBuiltIn()
                    && !getCurrentOntology().isDeclared(property, INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3515)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3516)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3517);profileViolations.add(new UseOfUndeclaredObjectProperty(
                        getCurrentOntology(), getCurrentAxiom(), property));
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3518);if ((((getCurrentOntology().containsDataPropertyInSignature(
                    property.getIRI(), INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3519)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3520)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3521);profileViolations.add(new IllegalPunning(getCurrentOntology(),
                        getCurrentAxiom(), property.getIRI()));
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3522);if ((((getCurrentOntology().containsAnnotationPropertyInSignature(
                    property.getIRI(), INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3523)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3524)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3525);profileViolations.add(new IllegalPunning(getCurrentOntology(),
                        getCurrentAxiom(), property.getIRI()));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataProperty property) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3526);
            __CLR4_5_22kb2kblvicknbr.R.inc(3527);if ((((!property.isOWLTopDataProperty()
                    && !property.isOWLBottomDataProperty())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3528)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3529)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3530);if ((((property.getIRI().isReservedVocabulary())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3531)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3532)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3533);profileViolations
                            .add(new UseOfReservedVocabularyForDataPropertyIRI(
                                    getCurrentOntology(), getCurrentAxiom(),
                                    property));
                }
            }}
            }__CLR4_5_22kb2kblvicknbr.R.inc(3534);if ((((!property.isBuiltIn()
                    && !getCurrentOntology().isDeclared(property, INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3535)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3536)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3537);profileViolations.add(new UseOfUndeclaredDataProperty(
                        getCurrentOntology(), getCurrentAxiom(), property));
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3538);if ((((getCurrentOntology().containsObjectPropertyInSignature(
                    property.getIRI(), INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3539)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3540)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3541);profileViolations.add(new IllegalPunning(getCurrentOntology(),
                        getCurrentAxiom(), property.getIRI()));
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3542);if ((((getCurrentOntology().containsAnnotationPropertyInSignature(
                    property.getIRI(), INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3543)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3544)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3545);profileViolations.add(new IllegalPunning(getCurrentOntology(),
                        getCurrentAxiom(), property.getIRI()));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLAnnotationProperty property) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3546);
            __CLR4_5_22kb2kblvicknbr.R.inc(3547);if ((((!property.isBuiltIn())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3548)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3549)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3550);if ((((property.getIRI().isReservedVocabulary())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3551)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3552)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3553);profileViolations
                            .add(new UseOfReservedVocabularyForAnnotationPropertyIRI(
                                    getCurrentOntology(), getCurrentAxiom(),
                                    property));
                }
            }}
            }__CLR4_5_22kb2kblvicknbr.R.inc(3554);if ((((!property.isBuiltIn()
                    && !getCurrentOntology().isDeclared(property, INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3555)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3556)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3557);profileViolations.add(new UseOfUndeclaredAnnotationProperty(
                        getCurrentOntology(), getCurrentAxiom(),
                        getCurrentAnnotation(), property));
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3558);if ((((getCurrentOntology().containsObjectPropertyInSignature(
                    property.getIRI(), INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3559)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3560)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3561);profileViolations.add(new IllegalPunning(getCurrentOntology(),
                        getCurrentAxiom(), property.getIRI()));
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3562);if ((((getCurrentOntology().containsDataPropertyInSignature(
                    property.getIRI(), INCLUDED))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3563)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3564)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3565);profileViolations.add(new IllegalPunning(getCurrentOntology(),
                        getCurrentAxiom(), property.getIRI()));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLNamedIndividual individual) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3566);
            __CLR4_5_22kb2kblvicknbr.R.inc(3567);if ((((!individual.isAnonymous()
                    && individual.getIRI().isReservedVocabulary())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3568)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3569)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3570);profileViolations
                        .add(new UseOfReservedVocabularyForIndividualIRI(
                                getCurrentOntology(), getCurrentAxiom(),
                                individual));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3571);
            __CLR4_5_22kb2kblvicknbr.R.inc(3572);if ((((axiom.getSubProperty().isOWLTopDataProperty())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3573)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3574)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3575);profileViolations
                        .add(new UseOfTopDataPropertyAsSubPropertyInSubPropertyAxiom(
                                getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3576);
            __CLR4_5_22kb2kblvicknbr.R.inc(3577);if ((((getPropertyManager().isNonSimple(ce.getProperty()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3578)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3579)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3580);profileViolations
                        .add(new UseOfNonSimplePropertyInCardinalityRestriction(
                                getCurrentOntology(), getCurrentAxiom(), ce));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3581);
            __CLR4_5_22kb2kblvicknbr.R.inc(3582);if ((((getPropertyManager().isNonSimple(ce.getProperty()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3583)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3584)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3585);profileViolations
                        .add(new UseOfNonSimplePropertyInCardinalityRestriction(
                                getCurrentOntology(), getCurrentAxiom(), ce));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3586);
            __CLR4_5_22kb2kblvicknbr.R.inc(3587);if ((((getPropertyManager().isNonSimple(ce.getProperty()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3588)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3589)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3590);profileViolations
                        .add(new UseOfNonSimplePropertyInCardinalityRestriction(
                                getCurrentOntology(), getCurrentAxiom(), ce));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3591);
            __CLR4_5_22kb2kblvicknbr.R.inc(3592);if ((((getPropertyManager().isNonSimple(ce.getProperty()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3593)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3594)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3595);profileViolations
                        .add(new UseOfNonSimplePropertyInObjectHasSelf(
                                getCurrentOntology(), getCurrentAxiom(), ce));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3596);
            __CLR4_5_22kb2kblvicknbr.R.inc(3597);if ((((getPropertyManager().isNonSimple(axiom.getProperty()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3598)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3599)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3600);profileViolations
                        .add(new UseOfNonSimplePropertyInFunctionalPropertyAxiom(
                                getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3601);
            __CLR4_5_22kb2kblvicknbr.R.inc(3602);if ((((getPropertyManager().isNonSimple(axiom.getProperty()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3603)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3604)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3605);profileViolations
                        .add(new UseOfNonSimplePropertyInInverseFunctionalObjectPropertyAxiom(
                                getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3606);
            __CLR4_5_22kb2kblvicknbr.R.inc(3607);if ((((getPropertyManager().isNonSimple(axiom.getProperty()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3608)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3609)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3610);profileViolations
                        .add(new UseOfNonSimplePropertyInIrreflexivePropertyAxiom(
                                getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3611);
            __CLR4_5_22kb2kblvicknbr.R.inc(3612);if ((((getPropertyManager().isNonSimple(axiom.getProperty()))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3613)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3614)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3615);profileViolations
                        .add(new UseOfNonSimplePropertyInAsymmetricObjectPropertyAxiom(
                                getCurrentOntology(), axiom));
            }
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3616);
            __CLR4_5_22kb2kblvicknbr.R.inc(3617);if ((((axiom.getProperties().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3618)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3619)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3620);profileViolations.add(new InsufficientPropertyExpressions(
                        getCurrentOntology(), axiom));
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3621);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
                assert (((prop != null)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3622)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3623)==0&false));
                __CLR4_5_22kb2kblvicknbr.R.inc(3624);if ((((getPropertyManager().isNonSimple(prop))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3625)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3626)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3627);profileViolations
                            .add(new UseOfNonSimplePropertyInDisjointPropertiesAxiom(
                                    getCurrentOntology(), axiom, prop));
                }
            }}
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}

        @Override
        public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_22kb2kblvicknbr.R.inc(3628);
            // Restriction on the Property Hierarchy. A strict partial order
            // (i.e., an irreflexive and transitive relation) < on AllOPE(Ax)
            // exists that fulfills the following conditions:
            //
            // OP1 < OP2 if and only if INV(OP1) < OP2 for all object properties
            // OP1 and OP2 occurring in AllOPE(Ax).
            // If OPE1 < OPE2 holds, then OPE2 ->* OPE1 does not hold;
            // Each axiom in Ax of the form SubObjectPropertyOf(
            // ObjectPropertyChain( OPE1 ... OPEn ) OPE ) with n => 2 fulfills
            // the following conditions:
            // OPE is equal to owl:topObjectProperty, or [TOP]
            // n = 2 and OPE1 = OPE2 = OPE, or [TRANSITIVE_PROP]
            // OPEi < OPE for each 1 <= i <= n, or [ALL_SMALLER]
            // OPE1 = OPE and OPEi < OPE for each 2 <= i <= n, or [FIRST_EQUAL]
            // OPEn = OPE and OPEi < OPE for each 1 <= i <= n-1. [LAST_EQUAL]
            __CLR4_5_22kb2kblvicknbr.R.inc(3629);if ((((axiom.getPropertyChain().size() < 2)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3630)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3631)==0&false))) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3632);profileViolations.add(new InsufficientPropertyExpressions(
                        getCurrentOntology(), axiom));
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3633);OWLObjectPropertyExpression superProp = axiom.getSuperProperty();
            __CLR4_5_22kb2kblvicknbr.R.inc(3634);if ((((superProp.isOWLTopObjectProperty()
                    || axiom.isEncodingOfTransitiveProperty())&&(__CLR4_5_22kb2kblvicknbr.R.iget(3635)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3636)==0&false))) {{
                // TOP or TRANSITIVE_PROP: no violation can occur
                __CLR4_5_22kb2kblvicknbr.R.inc(3637);return;
            }
            }__CLR4_5_22kb2kblvicknbr.R.inc(3638);List<OWLObjectPropertyExpression> chain = axiom.getPropertyChain();
            __CLR4_5_22kb2kblvicknbr.R.inc(3639);OWLObjectPropertyExpression first = chain.get(0);
            __CLR4_5_22kb2kblvicknbr.R.inc(3640);OWLObjectPropertyExpression last = chain.get(chain.size() - 1);
            assert (((last != null)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3641)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3642)==0&false));
            // center part of the chain must be smaller in any case
            __CLR4_5_22kb2kblvicknbr.R.inc(3643);for (int i = 1; (((i < chain.size() - 1)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3644)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3645)==0&false)); i++) {{
                __CLR4_5_22kb2kblvicknbr.R.inc(3646);OWLObjectPropertyExpression propB = chain.get(i);
                assert (((propB != null)&&(__CLR4_5_22kb2kblvicknbr.R.iget(3647)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3648)==0&false));
                __CLR4_5_22kb2kblvicknbr.R.inc(3649);if ((((getPropertyManager().isLessThan(superProp, propB))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3650)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3651)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3652);profileViolations.add(new UseOfPropertyInChainCausesCycle(
                            getCurrentOntology(), axiom, propB));
                }
            }}
            }__CLR4_5_22kb2kblvicknbr.R.inc(3653);if ((((first.equals(superProp))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3654)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3655)==0&false))) {{
                // first equals, last must be smaller
                __CLR4_5_22kb2kblvicknbr.R.inc(3656);if ((((getPropertyManager().isLessThan(superProp, last))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3657)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3658)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3659);profileViolations.add(new UseOfPropertyInChainCausesCycle(
                            getCurrentOntology(), axiom, last));
                }
            }} }else {{
                // first not equal, it must be smaller
                __CLR4_5_22kb2kblvicknbr.R.inc(3660);if ((((getPropertyManager().isLessThan(superProp, first))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3661)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3662)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3663);profileViolations.add(new UseOfPropertyInChainCausesCycle(
                            getCurrentOntology(), axiom, first));
                }
            }}
            }__CLR4_5_22kb2kblvicknbr.R.inc(3664);if ((((last.equals(superProp))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3665)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3666)==0&false))) {{
                // last equals, first must be smaller
                __CLR4_5_22kb2kblvicknbr.R.inc(3667);if ((((getPropertyManager().isLessThan(superProp, first))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3668)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3669)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3670);profileViolations.add(new UseOfPropertyInChainCausesCycle(
                            getCurrentOntology(), axiom, first));
                }
            }} }else {{
                // last not equal, it must be smaller
                __CLR4_5_22kb2kblvicknbr.R.inc(3671);if ((((getPropertyManager().isLessThan(superProp, last))&&(__CLR4_5_22kb2kblvicknbr.R.iget(3672)!=0|true))||(__CLR4_5_22kb2kblvicknbr.R.iget(3673)==0&false))) {{
                    __CLR4_5_22kb2kblvicknbr.R.inc(3674);profileViolations.add(new UseOfPropertyInChainCausesCycle(
                            getCurrentOntology(), axiom, last));
                }
            }}
            // neither first and last equal: they both must be smaller, checked
            // already in the else branches
        }}finally{__CLR4_5_22kb2kblvicknbr.R.flushNeeded();}}
    }
}
