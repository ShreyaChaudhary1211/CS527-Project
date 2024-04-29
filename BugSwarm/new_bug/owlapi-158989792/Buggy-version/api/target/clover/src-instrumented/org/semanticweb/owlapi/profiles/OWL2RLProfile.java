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
import org.semanticweb.owlapi.profiles.violations.UseOfIllegalAxiom;
import org.semanticweb.owlapi.profiles.violations.UseOfIllegalDataRange;
import org.semanticweb.owlapi.profiles.violations.UseOfNonEquivalentClassExpression;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSubClassExpression;
import org.semanticweb.owlapi.profiles.violations.UseOfNonSuperClassExpression;
import org.semanticweb.owlapi.util.OWLClassExpressionVisitorExAdapter;
import org.semanticweb.owlapi.util.OWLOntologyWalker;
import org.semanticweb.owlapi.util.OWLOntologyWalkerVisitor;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 */
public class OWL2RLProfile implements OWLProfile {public static class __CLR4_5_233j33jlvicknr7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,4180,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    static Boolean b(boolean b) {try{__CLR4_5_233j33jlvicknr7.R.inc(4015);
        __CLR4_5_233j33jlvicknr7.R.inc(4016);return b;
    }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

    protected static final Set<IRI> ALLOWED_DATATYPES = new HashSet<>(Arrays.asList(RDF_PLAIN_LITERAL.getIRI(),
        RDF_XML_LITERAL.getIRI(), RDFS_LITERAL.getIRI(), XSD_DECIMAL.getIRI(), XSD_INTEGER.getIRI(),
        XSD_NON_NEGATIVE_INTEGER.getIRI(), XSD_NON_POSITIVE_INTEGER.getIRI(), XSD_POSITIVE_INTEGER.getIRI(),
        XSD_NEGATIVE_INTEGER.getIRI(), XSD_LONG.getIRI(), XSD_INT.getIRI(), XSD_SHORT.getIRI(), XSD_BYTE.getIRI(),
        XSD_UNSIGNED_LONG.getIRI(), XSD_UNSIGNED_BYTE.getIRI(), XSD_FLOAT.getIRI(), XSD_DOUBLE.getIRI(), XSD_STRING
            .getIRI(), XSD_NORMALIZED_STRING.getIRI(), XSD_TOKEN.getIRI(), XSD_LANGUAGE.getIRI(), XSD_NAME.getIRI(),
        XSD_NCNAME.getIRI(), XSD_NMTOKEN.getIRI(), XSD_BOOLEAN.getIRI(), XSD_HEX_BINARY.getIRI(), XSD_BASE_64_BINARY
            .getIRI(), XSD_ANY_URI.getIRI(), XSD_DATE_TIME.getIRI(), XSD_DATE_TIME_STAMP.getIRI()));

    /**
     * Gets the name of the profile.
     * 
     * @return A string that represents the name of the profile
     */
    @Override
    public String getName() {try{__CLR4_5_233j33jlvicknr7.R.inc(4017);
        __CLR4_5_233j33jlvicknr7.R.inc(4018);return "OWL 2 RL";
    }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

    @Nonnull
    @Override
    public IRI getIRI() {try{__CLR4_5_233j33jlvicknr7.R.inc(4019);
        __CLR4_5_233j33jlvicknr7.R.inc(4020);return Profiles.OWL2_RL.getIRI();
    }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

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
    public OWLProfileReport checkOntology(OWLOntology ontology) {try{__CLR4_5_233j33jlvicknr7.R.inc(4021);
        __CLR4_5_233j33jlvicknr7.R.inc(4022);OWL2DLProfile profile = new OWL2DLProfile();
        __CLR4_5_233j33jlvicknr7.R.inc(4023);OWLProfileReport report = profile.checkOntology(ontology);
        __CLR4_5_233j33jlvicknr7.R.inc(4024);Set<OWLProfileViolation> violations = new HashSet<>();
        __CLR4_5_233j33jlvicknr7.R.inc(4025);violations.addAll(report.getViolations());
        __CLR4_5_233j33jlvicknr7.R.inc(4026);OWLOntologyProfileWalker walker = new OWLOntologyProfileWalker(ontology.getImportsClosure());
        __CLR4_5_233j33jlvicknr7.R.inc(4027);OWL2RLObjectVisitor visitor = new OWL2RLObjectVisitor(walker);
        __CLR4_5_233j33jlvicknr7.R.inc(4028);walker.walkStructure(visitor);
        __CLR4_5_233j33jlvicknr7.R.inc(4029);violations.addAll(visitor.getProfileViolations());
        __CLR4_5_233j33jlvicknr7.R.inc(4030);return new OWLProfileReport(this, violations);
    }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

    private class OWL2RLObjectVisitor extends OWLOntologyWalkerVisitor {

        private final Set<OWLProfileViolation> violations = new HashSet<>();

        OWL2RLObjectVisitor(@Nonnull OWLOntologyWalker walker) {
            super(walker);__CLR4_5_233j33jlvicknr7.R.inc(4032);try{__CLR4_5_233j33jlvicknr7.R.inc(4031);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        public Set<OWLProfileViolation> getProfileViolations() {try{__CLR4_5_233j33jlvicknr7.R.inc(4033);
            __CLR4_5_233j33jlvicknr7.R.inc(4034);return new HashSet<>(violations);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4035);
            __CLR4_5_233j33jlvicknr7.R.inc(4036);if ((((!isOWL2RLSuperClassExpression(axiom.getClassExpression()))&&(__CLR4_5_233j33jlvicknr7.R.iget(4037)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4038)==0&false))) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4039);violations.add(new UseOfNonSuperClassExpression(getCurrentOntology(), axiom, axiom
                    .getClassExpression()));
            }
        }}finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4040);
            __CLR4_5_233j33jlvicknr7.R.inc(4041);if ((((!isOWL2RLSuperClassExpression(axiom.getDomain()))&&(__CLR4_5_233j33jlvicknr7.R.iget(4042)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4043)==0&false))) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4044);violations.add(new UseOfNonSuperClassExpression(getCurrentOntology(), axiom, axiom.getDomain()));
            }
        }}finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4045);
            __CLR4_5_233j33jlvicknr7.R.inc(4046);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4047);
            __CLR4_5_233j33jlvicknr7.R.inc(4048);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), axiom));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4049);
            __CLR4_5_233j33jlvicknr7.R.inc(4050);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
                assert (((ce != null)&&(__CLR4_5_233j33jlvicknr7.R.iget(4051)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4052)==0&false));
                __CLR4_5_233j33jlvicknr7.R.inc(4053);if ((((!isOWL2RLEquivalentClassExpression(ce))&&(__CLR4_5_233j33jlvicknr7.R.iget(4054)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4055)==0&false))) {{
                    __CLR4_5_233j33jlvicknr7.R.inc(4056);violations.add(new UseOfNonEquivalentClassExpression(getCurrentOntology(), axiom, ce));
                }
            }}
        }}finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4057);
            __CLR4_5_233j33jlvicknr7.R.inc(4058);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
                assert (((ce != null)&&(__CLR4_5_233j33jlvicknr7.R.iget(4059)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4060)==0&false));
                __CLR4_5_233j33jlvicknr7.R.inc(4061);if ((((!isOWL2RLEquivalentClassExpression(ce))&&(__CLR4_5_233j33jlvicknr7.R.iget(4062)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4063)==0&false))) {{
                    __CLR4_5_233j33jlvicknr7.R.inc(4064);violations.add(new UseOfNonSubClassExpression(getCurrentOntology(), axiom, ce));
                }
            }}
        }}finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4065);
            __CLR4_5_233j33jlvicknr7.R.inc(4066);if ((((!isOWL2RLSubClassExpression(axiom.getClassExpression()))&&(__CLR4_5_233j33jlvicknr7.R.iget(4067)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4068)==0&false))) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4069);violations.add(new UseOfNonSubClassExpression(getCurrentOntology(), axiom, axiom.getClassExpression()));
            }
        }}finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4070);
            __CLR4_5_233j33jlvicknr7.R.inc(4071);if ((((!isOWL2RLSuperClassExpression(axiom.getDomain()))&&(__CLR4_5_233j33jlvicknr7.R.iget(4072)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4073)==0&false))) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4074);violations.add(new UseOfNonSuperClassExpression(getCurrentOntology(), axiom, axiom.getDomain()));
            }
        }}finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4075);
            __CLR4_5_233j33jlvicknr7.R.inc(4076);if ((((!isOWL2RLSuperClassExpression(axiom.getRange()))&&(__CLR4_5_233j33jlvicknr7.R.iget(4077)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4078)==0&false))) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4079);violations.add(new UseOfNonSuperClassExpression(getCurrentOntology(), axiom, axiom.getRange()));
            }
        }}finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4080);
            __CLR4_5_233j33jlvicknr7.R.inc(4081);if ((((!isOWL2RLSubClassExpression(axiom.getSubClass()))&&(__CLR4_5_233j33jlvicknr7.R.iget(4082)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4083)==0&false))) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4084);violations.add(new UseOfNonSubClassExpression(getCurrentOntology(), axiom, axiom.getSubClass()));
            }
            }__CLR4_5_233j33jlvicknr7.R.inc(4085);if ((((!isOWL2RLSuperClassExpression(axiom.getSuperClass()))&&(__CLR4_5_233j33jlvicknr7.R.iget(4086)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4087)==0&false))) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4088);violations.add(new UseOfNonSuperClassExpression(getCurrentOntology(), axiom, axiom.getSuperClass()));
            }
        }}finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(SWRLRule rule) {try{__CLR4_5_233j33jlvicknr7.R.inc(4089);
            __CLR4_5_233j33jlvicknr7.R.inc(4090);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), rule));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLDataOneOf node) {try{__CLR4_5_233j33jlvicknr7.R.inc(4091);
            __CLR4_5_233j33jlvicknr7.R.inc(4092);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLDataComplementOf node) {try{__CLR4_5_233j33jlvicknr7.R.inc(4093);
            __CLR4_5_233j33jlvicknr7.R.inc(4094);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatype node) {try{__CLR4_5_233j33jlvicknr7.R.inc(4095);
            __CLR4_5_233j33jlvicknr7.R.inc(4096);if ((((!ALLOWED_DATATYPES.contains(node.getIRI()))&&(__CLR4_5_233j33jlvicknr7.R.iget(4097)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4098)==0&false))) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4099);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
            }
        }}finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_233j33jlvicknr7.R.inc(4100);
            __CLR4_5_233j33jlvicknr7.R.inc(4101);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLDataUnionOf node) {try{__CLR4_5_233j33jlvicknr7.R.inc(4102);
            __CLR4_5_233j33jlvicknr7.R.inc(4103);violations.add(new UseOfIllegalDataRange(getCurrentOntology(), getCurrentAxiom(), node));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_233j33jlvicknr7.R.inc(4104);
            __CLR4_5_233j33jlvicknr7.R.inc(4105);violations.add(new UseOfIllegalAxiom(getCurrentOntology(), getCurrentAxiom()));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}
    }

    private class OWL2RLSubClassExpressionChecker extends OWLClassExpressionVisitorExAdapter<Boolean> {

        OWL2RLSubClassExpressionChecker() {
            super(b(false));__CLR4_5_233j33jlvicknr7.R.inc(4107);try{__CLR4_5_233j33jlvicknr7.R.inc(4106);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLClass ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4108);
            __CLR4_5_233j33jlvicknr7.R.inc(4109);return b(!ce.isOWLThing());
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4110);
            __CLR4_5_233j33jlvicknr7.R.inc(4111);for (OWLClassExpression op : ce.getOperands()) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4112);if ((((!isOWL2RLSubClassExpression(op))&&(__CLR4_5_233j33jlvicknr7.R.iget(4113)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4114)==0&false))) {{
                    __CLR4_5_233j33jlvicknr7.R.inc(4115);return b(false);
                }
            }}
            }__CLR4_5_233j33jlvicknr7.R.inc(4116);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectUnionOf ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4117);
            __CLR4_5_233j33jlvicknr7.R.inc(4118);for (OWLClassExpression op : ce.getOperands()) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4119);if ((((!isOWL2RLSubClassExpression(op))&&(__CLR4_5_233j33jlvicknr7.R.iget(4120)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4121)==0&false))) {{
                    __CLR4_5_233j33jlvicknr7.R.inc(4122);return b(false);
                }
            }}
            }__CLR4_5_233j33jlvicknr7.R.inc(4123);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4124);
            __CLR4_5_233j33jlvicknr7.R.inc(4125);return b(ce.getFiller().isOWLThing() || isOWL2RLSubClassExpression(ce.getFiller()));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectHasValue ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4126);
            __CLR4_5_233j33jlvicknr7.R.inc(4127);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectOneOf ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4128);
            __CLR4_5_233j33jlvicknr7.R.inc(4129);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4130);
            __CLR4_5_233j33jlvicknr7.R.inc(4131);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDataHasValue ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4132);
            __CLR4_5_233j33jlvicknr7.R.inc(4133);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}
    }

    @Nonnull
    private final OWL2RLSubClassExpressionChecker subClassExpressionChecker = new OWL2RLSubClassExpressionChecker();

    protected boolean isOWL2RLSubClassExpression(OWLClassExpression ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4134);
        __CLR4_5_233j33jlvicknr7.R.inc(4135);return ce.accept(subClassExpressionChecker).booleanValue();
    }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

    private class OWL2RLSuperClassExpressionChecker extends OWLClassExpressionVisitorExAdapter<Boolean> {

        OWL2RLSuperClassExpressionChecker() {
            super(b(false));__CLR4_5_233j33jlvicknr7.R.inc(4137);try{__CLR4_5_233j33jlvicknr7.R.inc(4136);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLClass ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4138);
            __CLR4_5_233j33jlvicknr7.R.inc(4139);return b(!ce.isOWLThing());
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4140);
            __CLR4_5_233j33jlvicknr7.R.inc(4141);for (OWLClassExpression e : ce.getOperands()) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4142);if ((((!e.accept(this).booleanValue())&&(__CLR4_5_233j33jlvicknr7.R.iget(4143)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4144)==0&false))) {{
                    __CLR4_5_233j33jlvicknr7.R.inc(4145);return b(false);
                }
            }}
            }__CLR4_5_233j33jlvicknr7.R.inc(4146);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        // XXX difference in subclass and superclass - correct?
        @Override
        public Boolean visit(OWLObjectComplementOf ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4147);
            __CLR4_5_233j33jlvicknr7.R.inc(4148);return b(isOWL2RLSubClassExpression(ce.getOperand()));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4149);
            __CLR4_5_233j33jlvicknr7.R.inc(4150);return ce.getFiller().accept(this);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectHasValue ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4151);
            __CLR4_5_233j33jlvicknr7.R.inc(4152);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4153);
            __CLR4_5_233j33jlvicknr7.R.inc(4154);return b((ce.getCardinality() == 0 || ce.getCardinality() == 1) && (ce.getFiller().isOWLThing()
                || isOWL2RLSubClassExpression(ce.getFiller())));
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4155);
            __CLR4_5_233j33jlvicknr7.R.inc(4156);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDataHasValue ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4157);
            __CLR4_5_233j33jlvicknr7.R.inc(4158);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDataMaxCardinality ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4159);
            __CLR4_5_233j33jlvicknr7.R.inc(4160);return b(ce.getCardinality() == 0 || ce.getCardinality() == 1);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}
    }

    @Nonnull
    private final OWL2RLSuperClassExpressionChecker superClassExpressionChecker = new OWL2RLSuperClassExpressionChecker();

    /**
     * @param ce
     *        class
     * @return true if OWL 2 RL superclass
     */
    public boolean isOWL2RLSuperClassExpression(OWLClassExpression ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4161);
        __CLR4_5_233j33jlvicknr7.R.inc(4162);return ce.accept(superClassExpressionChecker).booleanValue();
    }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

    private static class OWL2RLEquivalentClassExpressionChecker extends OWLClassExpressionVisitorExAdapter<Boolean> {

        OWL2RLEquivalentClassExpressionChecker() {
            super(b(false));__CLR4_5_233j33jlvicknr7.R.inc(4164);try{__CLR4_5_233j33jlvicknr7.R.inc(4163);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLClass ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4165);
            __CLR4_5_233j33jlvicknr7.R.inc(4166);return b(!ce.isOWLThing());
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4167);
            __CLR4_5_233j33jlvicknr7.R.inc(4168);for (OWLClassExpression e : ce.getOperands()) {{
                __CLR4_5_233j33jlvicknr7.R.inc(4169);if ((((!e.accept(this).booleanValue())&&(__CLR4_5_233j33jlvicknr7.R.iget(4170)!=0|true))||(__CLR4_5_233j33jlvicknr7.R.iget(4171)==0&false))) {{
                    __CLR4_5_233j33jlvicknr7.R.inc(4172);return b(false);
                }
            }}
            }__CLR4_5_233j33jlvicknr7.R.inc(4173);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectHasValue ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4174);
            __CLR4_5_233j33jlvicknr7.R.inc(4175);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLDataHasValue ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4176);
            __CLR4_5_233j33jlvicknr7.R.inc(4177);return b(true);
        }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}
    }

    @Nonnull
    private final OWL2RLEquivalentClassExpressionChecker equivalentClassExpressionChecker = new OWL2RLEquivalentClassExpressionChecker();

    /**
     * @param ce
     *        class
     * @return true if equivalent classes expression
     */
    public boolean isOWL2RLEquivalentClassExpression(OWLClassExpression ce) {try{__CLR4_5_233j33jlvicknr7.R.inc(4178);
        __CLR4_5_233j33jlvicknr7.R.inc(4179);return ce.accept(equivalentClassExpressionChecker).booleanValue();
    }finally{__CLR4_5_233j33jlvicknr7.R.flushNeeded();}}
}
