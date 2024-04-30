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

import static org.semanticweb.owlapi.vocab.OWL2Datatype.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.profiles.violations.*;
import org.semanticweb.owlapi.util.OWLClassExpressionVisitorExAdapter;
import org.semanticweb.owlapi.util.OWLOntologyWalker;
import org.semanticweb.owlapi.util.OWLOntologyWalkerVisitor;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 */
public class OWL2QLProfile implements OWLProfile {public static class __CLR4_5_22zw2zwlvicknm7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,4015,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    static Boolean b(boolean b) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3884);
        __CLR4_5_22zw2zwlvicknm7.R.inc(3885);return b;
    }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

    protected static final Set<IRI> ALLOWED_DATATYPES = new HashSet<>(Arrays.asList(
        //@formatter:off
            RDF_PLAIN_LITERAL.getIRI(), 
            RDF_XML_LITERAL.getIRI(), 
            RDFS_LITERAL.getIRI(),
            OWL_REAL.getIRI(), 
            OWL_RATIONAL.getIRI(), 
            XSD_DECIMAL.getIRI(),
            XSD_INTEGER.getIRI(), 
            XSD_NON_NEGATIVE_INTEGER.getIRI(), 
            XSD_STRING.getIRI(),
            XSD_NORMALIZED_STRING.getIRI(), 
            XSD_TOKEN.getIRI(), 
            XSD_NAME.getIRI(),
            XSD_NCNAME.getIRI(), 
            XSD_NMTOKEN.getIRI(), 
            XSD_HEX_BINARY.getIRI(),
            XSD_BASE_64_BINARY.getIRI(), 
            XSD_ANY_URI.getIRI(), 
            XSD_DATE_TIME.getIRI(),
            XSD_DATE_TIME_STAMP.getIRI()
            //@formatter:on
    ));

    /**
     * Gets the name of the profile.
     * 
     * @return A string that represents the name of the profile
     */
    @Override
    public String getName() {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3886);
        __CLR4_5_22zw2zwlvicknm7.R.inc(3887);return "OWL 2 QL";
    }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

    @Nonnull
    @Override
    public IRI getIRI() {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3888);
        __CLR4_5_22zw2zwlvicknm7.R.inc(3889);return Profiles.OWL2_QL.getIRI();
    }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

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
    public OWLProfileReport checkOntology(OWLOntology ontology) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3890);
        __CLR4_5_22zw2zwlvicknm7.R.inc(3891);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_22zw2zwlvicknm7.R.inc(3892);OWLProfileReport report = profile.checkOntology(ontology);
        __CLR4_5_22zw2zwlvicknm7.R.inc(3893);Set<OWLProfileViolation> violations = new HashSet<>();
        __CLR4_5_22zw2zwlvicknm7.R.inc(3894);violations.addAll(report.getViolations());
        __CLR4_5_22zw2zwlvicknm7.R.inc(3895);OWLOntologyProfileWalker walker = new OWLOntologyProfileWalker(ontology.getImportsClosure());
        __CLR4_5_22zw2zwlvicknm7.R.inc(3896);OWL2QLObjectVisitor visitor = new OWL2QLObjectVisitor(walker);
        __CLR4_5_22zw2zwlvicknm7.R.inc(3897);walker.walkStructure(visitor);
        __CLR4_5_22zw2zwlvicknm7.R.inc(3898);violations.addAll(visitor.getProfileViolations());
        __CLR4_5_22zw2zwlvicknm7.R.inc(3899);return new OWLProfileReport(this, violations);
    }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

    private class OWL2QLObjectVisitor extends OWLOntologyWalkerVisitor {

        @Nonnull
        private final Set<OWLProfileViolation> violations = new HashSet<>();

        OWL2QLObjectVisitor(@Nonnull OWLOntologyWalker walker) {
            super(walker);__CLR4_5_22zw2zwlvicknm7.R.inc(3901);try{__CLR4_5_22zw2zwlvicknm7.R.inc(3900);
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        public Set<OWLProfileViolation> getProfileViolations() {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3902);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3903);return new HashSet<>(violations);
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatype node) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3904);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3905);if ((((!ALLOWED_DATATYPES.contains(node.getIRI()))&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3906)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3907)==0&false))) {{
                __CLR4_5_22zw2zwlvicknm7.R.inc(3908);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
            }
        }}finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3909);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3910);violations.add(new UseOfAnonymousIndividual(getCurrentOntology(), getCurrentAxiom(), individual));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3911);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3912);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3913);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3914);if ((((!isOWL2QLSubClassExpression(axiom.getSubClass()))&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3915)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3916)==0&false))) {{
                __CLR4_5_22zw2zwlvicknm7.R.inc(3917);violations.add(new UseOfNonSubClassExpression(getCurrentOntology(), axiom, axiom.getSubClass()));
            }
            }__CLR4_5_22zw2zwlvicknm7.R.inc(3918);if ((((!isOWL2QLSuperClassExpression(axiom.getSuperClass()))&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3919)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3920)==0&false))) {{
                __CLR4_5_22zw2zwlvicknm7.R.inc(3921);violations.add(new UseOfNonSuperClassExpression(getCurrentOntology(), axiom, axiom.getSuperClass()));
            }
        }}finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3922);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3923);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
                assert (((ce != null)&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3924)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3925)==0&false));
                __CLR4_5_22zw2zwlvicknm7.R.inc(3926);if ((((!isOWL2QLSubClassExpression(ce))&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3927)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3928)==0&false))) {{
                    __CLR4_5_22zw2zwlvicknm7.R.inc(3929);violations.add(new UseOfNonSubClassExpression(getCurrentOntology(), axiom, ce));
                }
            }}
        }}finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3930);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3931);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
                assert (((ce != null)&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3932)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3933)==0&false));
                __CLR4_5_22zw2zwlvicknm7.R.inc(3934);if ((((!isOWL2QLSubClassExpression(ce))&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3935)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3936)==0&false))) {{
                    __CLR4_5_22zw2zwlvicknm7.R.inc(3937);violations.add(new UseOfNonSubClassExpression(getCurrentOntology(), axiom, ce));
                }
            }}
        }}finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3938);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3939);if ((((!isOWL2QLSuperClassExpression(axiom.getDomain()))&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3940)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3941)==0&false))) {{
                __CLR4_5_22zw2zwlvicknm7.R.inc(3942);violations.add(new UseOfNonSuperClassExpression(getCurrentOntology(), axiom, axiom.getDomain()));
            }
        }}finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3943);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3944);if ((((!isOWL2QLSuperClassExpression(axiom.getRange()))&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3945)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3946)==0&false))) {{
                __CLR4_5_22zw2zwlvicknm7.R.inc(3947);violations.add(new UseOfNonSuperClassExpression(getCurrentOntology(), axiom, axiom.getRange()));
            }
        }}finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3948);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3949);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3950);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3951);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3952);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3953);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3954);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3955);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3956);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3957);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3958);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3959);if ((((!isOWL2QLSuperClassExpression(axiom.getDomain()))&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3960)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3961)==0&false))) {{
                __CLR4_5_22zw2zwlvicknm7.R.inc(3962);violations.add(new UseOfNonSuperClassExpression(getCurrentOntology(), axiom, axiom.getDomain()));
            }
        }}finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3963);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3964);if ((((axiom.getClassExpression().isAnonymous())&&(__CLR4_5_22zw2zwlvicknm7.R.iget(3965)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(3966)==0&false))) {{
                __CLR4_5_22zw2zwlvicknm7.R.inc(3967);violations.add(new UseOfNonAtomicClassExpression(getCurrentOntology(), axiom, axiom
                    .getClassExpression()));
            }
        }}finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3968);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3969);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3970);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3971);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3972);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3973);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3974);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3975);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(SWRLRule rule) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3976);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3977);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), rule));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLDataComplementOf node) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3978);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3979);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLDataOneOf node) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3980);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3981);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3982);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3983);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public void visit(OWLDataUnionOf node) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3984);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3985);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}
    }

    private static class OWL2QLSubClassExpressionChecker extends OWLClassExpressionVisitorExAdapter<Boolean> {

        OWL2QLSubClassExpressionChecker() {
            super(b(false));__CLR4_5_22zw2zwlvicknm7.R.inc(3987);try{__CLR4_5_22zw2zwlvicknm7.R.inc(3986);
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLClass ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3988);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3989);return b(true);
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3990);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3991);return b(ce.getFiller().isOWLThing());
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3992);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3993);return b(true);
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}
    }

    @Nonnull
    private final OWL2QLSubClassExpressionChecker subClassExpressionChecker = new OWL2QLSubClassExpressionChecker();

    protected boolean isOWL2QLSubClassExpression(OWLClassExpression ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3994);
        __CLR4_5_22zw2zwlvicknm7.R.inc(3995);return ce.accept(subClassExpressionChecker).booleanValue();
    }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

    private class OWL2QLSuperClassExpressionChecker extends OWLClassExpressionVisitorExAdapter<Boolean> {

        OWL2QLSuperClassExpressionChecker() {
            super(b(false));__CLR4_5_22zw2zwlvicknm7.R.inc(3997);try{__CLR4_5_22zw2zwlvicknm7.R.inc(3996);
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLClass ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(3998);
            __CLR4_5_22zw2zwlvicknm7.R.inc(3999);return b(true);
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(4000);
            __CLR4_5_22zw2zwlvicknm7.R.inc(4001);for (OWLClassExpression e : ce.getOperands()) {{
                __CLR4_5_22zw2zwlvicknm7.R.inc(4002);if ((((!e.accept(this).booleanValue())&&(__CLR4_5_22zw2zwlvicknm7.R.iget(4003)!=0|true))||(__CLR4_5_22zw2zwlvicknm7.R.iget(4004)==0&false))) {{
                    __CLR4_5_22zw2zwlvicknm7.R.inc(4005);return b(false);
                }
            }}
            }__CLR4_5_22zw2zwlvicknm7.R.inc(4006);return b(true);
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectComplementOf ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(4007);
            __CLR4_5_22zw2zwlvicknm7.R.inc(4008);return b(isOWL2QLSubClassExpression(ce.getOperand()));
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(4009);
            __CLR4_5_22zw2zwlvicknm7.R.inc(4010);return b(!ce.getFiller().isAnonymous());
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(4011);
            __CLR4_5_22zw2zwlvicknm7.R.inc(4012);return b(true);
        }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}
    }

    @Nonnull
    private final OWL2QLSuperClassExpressionChecker superClassExpressionChecker = new OWL2QLSuperClassExpressionChecker();

    /**
     * @param ce
     *        class
     * @return true if ce is superclass expression
     */
    public boolean isOWL2QLSuperClassExpression(OWLClassExpression ce) {try{__CLR4_5_22zw2zwlvicknm7.R.inc(4013);
        __CLR4_5_22zw2zwlvicknm7.R.inc(4014);return ce.accept(superClassExpressionChecker).booleanValue();
    }finally{__CLR4_5_22zw2zwlvicknm7.R.flushNeeded();}}
}
