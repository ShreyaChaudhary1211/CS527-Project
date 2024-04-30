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

import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.profiles.violations.*;
import org.semanticweb.owlapi.util.OWLOntologyWalker;
import org.semanticweb.owlapi.util.OWLOntologyWalkerVisitor;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import com.google.common.base.Optional;

/**
 * Checks to see if an ontology and its imports closure fall into the OWL 2 FULL
 * profile. An ontology is OWL Full if any of the global structural restrictions
 * are violated, if there is punning between object and data properties. Failing
 * this profile means the ontology is not valid OWL.
 * 
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 */
public class OWL2Profile implements OWLProfile {public static class __CLR4_5_22xj2xjlvicknec{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,3863,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public String getName() {try{__CLR4_5_22xj2xjlvicknec.R.inc(3799);
        __CLR4_5_22xj2xjlvicknec.R.inc(3800);return "OWL 2 Full";
    }finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}

    @Nonnull
    @Override
    public IRI getIRI() {try{__CLR4_5_22xj2xjlvicknec.R.inc(3801);
        __CLR4_5_22xj2xjlvicknec.R.inc(3802);return Profiles.OWL2_FULL.getIRI();
    }finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}

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
    public OWLProfileReport checkOntology(OWLOntology ontology) {try{__CLR4_5_22xj2xjlvicknec.R.inc(3803);
        __CLR4_5_22xj2xjlvicknec.R.inc(3804);OWLOntologyProfileWalker walker = new OWLOntologyProfileWalker(ontology.getImportsClosure());
        __CLR4_5_22xj2xjlvicknec.R.inc(3805);OWL2ProfileObjectWalker visitor = new OWL2ProfileObjectWalker(walker, ontology.getOWLOntologyManager());
        __CLR4_5_22xj2xjlvicknec.R.inc(3806);walker.walkStructure(visitor);
        __CLR4_5_22xj2xjlvicknec.R.inc(3807);Set<OWLProfileViolation> pv = visitor.getProfileViolations();
        __CLR4_5_22xj2xjlvicknec.R.inc(3808);return new OWLProfileReport(this, pv);
    }finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}

    private static class OWL2ProfileObjectWalker extends OWLOntologyWalkerVisitor {

        @Nonnull private final OWLOntologyManager man;
        @Nonnull private final Set<OWLProfileViolation> profileViolations = new HashSet<>();

        OWL2ProfileObjectWalker(@Nonnull OWLOntologyWalker walker, @Nonnull OWLOntologyManager man) {
            super(walker);__CLR4_5_22xj2xjlvicknec.R.inc(3810);try{__CLR4_5_22xj2xjlvicknec.R.inc(3809);
            __CLR4_5_22xj2xjlvicknec.R.inc(3811);this.man = man;
        }finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}

        public Set<OWLProfileViolation> getProfileViolations() {try{__CLR4_5_22xj2xjlvicknec.R.inc(3812);
            __CLR4_5_22xj2xjlvicknec.R.inc(3813);return new HashSet<>(profileViolations);
        }finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}

        @Override
        public void visit(OWLOntology ontology) {try{__CLR4_5_22xj2xjlvicknec.R.inc(3814);
            // The ontology IRI and version IRI must be absolute and must not be
            // from the reserved vocab
            __CLR4_5_22xj2xjlvicknec.R.inc(3815);OWLOntologyID id = ontology.getOntologyID();
            __CLR4_5_22xj2xjlvicknec.R.inc(3816);if ((((!id.isAnonymous())&&(__CLR4_5_22xj2xjlvicknec.R.iget(3817)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3818)==0&false))) {{
                __CLR4_5_22xj2xjlvicknec.R.inc(3819);IRI ontologyIRI = id.getOntologyIRI().get();
                __CLR4_5_22xj2xjlvicknec.R.inc(3820);if ((((!ontologyIRI.isAbsolute())&&(__CLR4_5_22xj2xjlvicknec.R.iget(3821)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3822)==0&false))) {{
                    __CLR4_5_22xj2xjlvicknec.R.inc(3823);profileViolations.add(new OntologyIRINotAbsolute(ontology));
                }
                }__CLR4_5_22xj2xjlvicknec.R.inc(3824);Optional<IRI> versionIRI = id.getVersionIRI();
                __CLR4_5_22xj2xjlvicknec.R.inc(3825);if ((((versionIRI.isPresent())&&(__CLR4_5_22xj2xjlvicknec.R.iget(3826)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3827)==0&false))) {{
                    __CLR4_5_22xj2xjlvicknec.R.inc(3828);if ((((!versionIRI.get().isAbsolute())&&(__CLR4_5_22xj2xjlvicknec.R.iget(3829)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3830)==0&false))) {{
                        __CLR4_5_22xj2xjlvicknec.R.inc(3831);profileViolations.add(new OntologyVersionIRINotAbsolute(ontology));
                    }
                }}
            }}
        }}finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}

        @Override
        public void visit(IRI iri) {try{__CLR4_5_22xj2xjlvicknec.R.inc(3832);
            __CLR4_5_22xj2xjlvicknec.R.inc(3833);if ((((!iri.isAbsolute())&&(__CLR4_5_22xj2xjlvicknec.R.iget(3834)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3835)==0&false))) {{
                __CLR4_5_22xj2xjlvicknec.R.inc(3836);profileViolations.add(new UseOfNonAbsoluteIRI(getCurrentOntology(), getCurrentAxiom(), iri));
            }
        }}finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}

        @Override
        public void visit(OWLLiteral node) {try{__CLR4_5_22xj2xjlvicknec.R.inc(3837);
            // Check that the lexical value of the literal is in the lexical
            // space of the literal datatype
            __CLR4_5_22xj2xjlvicknec.R.inc(3838);if ((((node.getDatatype().isBuiltIn())&&(__CLR4_5_22xj2xjlvicknec.R.iget(3839)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3840)==0&false))) {{
                __CLR4_5_22xj2xjlvicknec.R.inc(3841);if ((((!node.getDatatype().getBuiltInDatatype().isInLexicalSpace(node.getLiteral()))&&(__CLR4_5_22xj2xjlvicknec.R.iget(3842)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3843)==0&false))) {{
                    __CLR4_5_22xj2xjlvicknec.R.inc(3844);profileViolations.add(new LexicalNotInLexicalSpace(getCurrentOntology(), getCurrentAxiom(), node));
                }
            }}
        }}finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_22xj2xjlvicknec.R.inc(3845);
            // The datatype should not be defined with a datatype definition
            // axiom
            __CLR4_5_22xj2xjlvicknec.R.inc(3846);for (OWLOntology ont : man.getImportsClosure(getCurrentOntology())) {{
                __CLR4_5_22xj2xjlvicknec.R.inc(3847);for (OWLDatatypeDefinitionAxiom ax : ont.getAxioms(AxiomType.DATATYPE_DEFINITION)) {{
                    __CLR4_5_22xj2xjlvicknec.R.inc(3848);if ((((node.getDatatype().equals(ax.getDatatype()))&&(__CLR4_5_22xj2xjlvicknec.R.iget(3849)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3850)==0&false))) {{
                        __CLR4_5_22xj2xjlvicknec.R.inc(3851);profileViolations.add(new UseOfDefinedDatatypeInDatatypeRestriction(getCurrentOntology(),
                            getCurrentAxiom(), node));
                    }
                }}
            }}
            // All facets must be allowed for the restricted datatype
            }__CLR4_5_22xj2xjlvicknec.R.inc(3852);for (OWLFacetRestriction r : node.getFacetRestrictions()) {{
                __CLR4_5_22xj2xjlvicknec.R.inc(3853);OWL2Datatype dt = node.getDatatype().getBuiltInDatatype();
                __CLR4_5_22xj2xjlvicknec.R.inc(3854);if ((((!dt.getFacets().contains(r.getFacet()))&&(__CLR4_5_22xj2xjlvicknec.R.iget(3855)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3856)==0&false))) {{
                    __CLR4_5_22xj2xjlvicknec.R.inc(3857);profileViolations.add(new UseOfIllegalFacetRestriction(getCurrentOntology(), getCurrentAxiom(),
                        node, r.getFacet()));
                }
            }}
        }}finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}

        @Override
        public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_22xj2xjlvicknec.R.inc(3858);
            // The datatype MUST be declared
            __CLR4_5_22xj2xjlvicknec.R.inc(3859);if ((((!getCurrentOntology().isDeclared(axiom.getDatatype(), INCLUDED))&&(__CLR4_5_22xj2xjlvicknec.R.iget(3860)!=0|true))||(__CLR4_5_22xj2xjlvicknec.R.iget(3861)==0&false))) {{
                __CLR4_5_22xj2xjlvicknec.R.inc(3862);profileViolations.add(new UseOfUndeclaredDatatype(getCurrentOntology(), axiom, axiom.getDatatype()));
            }
        }}finally{__CLR4_5_22xj2xjlvicknec.R.flushNeeded();}}
    }
}
