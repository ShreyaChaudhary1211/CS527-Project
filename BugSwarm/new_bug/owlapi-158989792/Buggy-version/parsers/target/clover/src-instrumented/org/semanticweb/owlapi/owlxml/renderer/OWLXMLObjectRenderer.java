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
package org.semanticweb.owlapi.owlxml.renderer;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;
import static org.semanticweb.owlapi.vocab.OWLXMLVocabulary.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLXMLObjectRenderer implements OWLObjectVisitor {public static class __CLR4_5_2mpnmpnlvicmc8w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,29942,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OWLXMLWriter writer;

    /**
     * @param writer
     *        writer
     */
    public OWLXMLObjectRenderer(@Nonnull OWLXMLWriter writer) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29435);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29436);this.writer = checkNotNull(writer, "writer cannot be null");
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    private void writeAnnotations(@Nonnull OWLAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29437);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29438);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29439);for (OWLAnnotation anno : axiom.getAnnotations()) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29440);anno.accept(this);
        }
    }}finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29441);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29442);checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29443);for (OWLImportsDeclaration decl : ontology.getImportsDeclarations()) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29444);writer.writeStartElement(IMPORT);
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29445);writer.writeTextContent(decl.getIRI().toString());
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29446);writer.writeEndElement();
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29447);for (OWLAnnotation annotation : ontology.getAnnotations()) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29448);annotation.accept(this);
        }
        // treat declarations separately from other axioms
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29449);Collection<OWLDeclarationAxiom> declarations = ontology
                .getAxioms(AxiomType.DECLARATION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29450);Set<OWLEntity> declared = new HashSet<>(ontology.getSignature());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29451);for (OWLDeclarationAxiom ax : declarations) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29452);ax.accept(this);
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29453);declared.remove(ax.getEntity());
        }
        // any undeclared entities?
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29454);if ((((!declared.isEmpty())&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29455)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29456)==0&false))) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29457);boolean addMissing = true;
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29458);OWLDocumentFormat format = ontology.getOWLOntologyManager()
                    .getOntologyFormat(ontology);
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29459);if ((((format != null)&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29460)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29461)==0&false))) {{
                __CLR4_5_2mpnmpnlvicmc8w.R.inc(29462);addMissing = format.isAddMissingTypes();
            }
            }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29463);if ((((addMissing)&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29464)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29465)==0&false))) {{
                __CLR4_5_2mpnmpnlvicmc8w.R.inc(29466);Collection<IRI> illegalPunnings = OWLDocumentFormatImpl
                        .determineIllegalPunnings(addMissing,
                                ontology.getSignature(),
                                ontology.getPunnedIRIs(Imports.INCLUDED));
                __CLR4_5_2mpnmpnlvicmc8w.R.inc(29467);for (OWLEntity e : declared) {{
                    __CLR4_5_2mpnmpnlvicmc8w.R.inc(29468);if ((((!e.isBuiltIn() && !illegalPunnings.contains(e.getIRI())
                            && !ontology.isDeclared(e, Imports.INCLUDED))&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29469)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29470)==0&false))) {{
                        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29471);ontology.getOWLOntologyManager().getOWLDataFactory()
                                .getOWLDeclarationAxiom(e).accept(this);
                    }
                }}
            }}
        }}
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29472);Collection<OWLAxiom> axioms = new ArrayList<>();
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29473);for (AxiomType<?> t : AxiomType.AXIOM_TYPES) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29474);if ((((!t.equals(AxiomType.DECLARATION))&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29475)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29476)==0&false))) {{
                __CLR4_5_2mpnmpnlvicmc8w.R.inc(29477);axioms.addAll(ontology.getAxioms(t));
            }
        }}
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29478);for (OWLAxiom ax : CollectionFactory.sortOptionally(axioms)) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29479);ax.accept(this);
        }
    }}finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29480);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29481);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29482);writer.writeIRIElement(iri);
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29483);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29484);writer.writeStartElement(ANONYMOUS_INDIVIDUAL);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29485);writer.writeNodeIDAttribute(individual.getID());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29486);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29487);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29488);writer.writeStartElement(ASYMMETRIC_OBJECT_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29489);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29490);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29491);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29492);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29493);writer.writeStartElement(CLASS_ASSERTION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29494);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29495);axiom.getClassExpression().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29496);axiom.getIndividual().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29497);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29498);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29499);writer.writeStartElement(DATA_PROPERTY_ASSERTION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29500);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29501);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29502);axiom.getSubject().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29503);axiom.getObject().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29504);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29505);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29506);writer.writeStartElement(DATA_PROPERTY_DOMAIN);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29507);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29508);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29509);axiom.getDomain().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29510);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29511);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29512);writer.writeStartElement(DATA_PROPERTY_RANGE);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29513);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29514);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29515);axiom.getRange().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29516);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29517);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29518);writer.writeStartElement(SUB_DATA_PROPERTY_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29519);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29520);axiom.getSubProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29521);axiom.getSuperProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29522);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29523);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29524);writer.writeStartElement(DECLARATION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29525);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29526);axiom.getEntity().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29527);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29528);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29529);writer.writeStartElement(DIFFERENT_INDIVIDUALS);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29530);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29531);render(axiom.getIndividuals());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29532);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29533);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29534);writer.writeStartElement(DISJOINT_CLASSES);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29535);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29536);render(axiom.getClassExpressions());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29537);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29538);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29539);writer.writeStartElement(DISJOINT_DATA_PROPERTIES);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29540);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29541);render(axiom.getProperties());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29542);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29543);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29544);writer.writeStartElement(DISJOINT_OBJECT_PROPERTIES);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29545);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29546);render(axiom.getProperties());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29547);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29548);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29549);writer.writeStartElement(DISJOINT_UNION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29550);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29551);axiom.getOWLClass().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29552);render(axiom.getClassExpressions());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29553);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29554);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29555);writer.writeStartElement(ANNOTATION_ASSERTION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29556);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29557);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29558);axiom.getSubject().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29559);axiom.getValue().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29560);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29561);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29562);writer.writeStartElement(EQUIVALENT_CLASSES);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29563);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29564);render(axiom.getClassExpressions());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29565);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29566);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29567);writer.writeStartElement(EQUIVALENT_DATA_PROPERTIES);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29568);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29569);render(axiom.getProperties());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29570);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29571);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29572);writer.writeStartElement(EQUIVALENT_OBJECT_PROPERTIES);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29573);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29574);render(axiom.getProperties());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29575);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29576);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29577);writer.writeStartElement(FUNCTIONAL_DATA_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29578);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29579);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29580);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29581);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29582);writer.writeStartElement(FUNCTIONAL_OBJECT_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29583);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29584);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29585);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29586);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29587);writer.writeStartElement(INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29588);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29589);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29590);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29591);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29592);writer.writeStartElement(INVERSE_OBJECT_PROPERTIES);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29593);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29594);axiom.getFirstProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29595);axiom.getSecondProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29596);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29597);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29598);writer.writeStartElement(IRREFLEXIVE_OBJECT_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29599);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29600);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29601);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29602);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29603);writer.writeStartElement(NEGATIVE_DATA_PROPERTY_ASSERTION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29604);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29605);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29606);axiom.getSubject().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29607);axiom.getObject().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29608);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29609);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29610);writer.writeStartElement(NEGATIVE_OBJECT_PROPERTY_ASSERTION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29611);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29612);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29613);axiom.getSubject().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29614);axiom.getObject().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29615);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29616);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29617);writer.writeStartElement(OBJECT_PROPERTY_ASSERTION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29618);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29619);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29620);axiom.getSubject().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29621);axiom.getObject().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29622);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29623);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29624);writer.writeStartElement(SUB_OBJECT_PROPERTY_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29625);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29626);writer.writeStartElement(OBJECT_PROPERTY_CHAIN);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29627);for (OWLObjectPropertyExpression prop : axiom.getPropertyChain()) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29628);prop.accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29629);writer.writeEndElement();
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29630);axiom.getSuperProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29631);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29632);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29633);writer.writeStartElement(OBJECT_PROPERTY_DOMAIN);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29634);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29635);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29636);axiom.getDomain().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29637);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29638);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29639);writer.writeStartElement(OBJECT_PROPERTY_RANGE);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29640);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29641);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29642);axiom.getRange().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29643);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29644);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29645);writer.writeStartElement(SUB_OBJECT_PROPERTY_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29646);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29647);axiom.getSubProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29648);axiom.getSuperProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29649);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29650);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29651);writer.writeStartElement(REFLEXIVE_OBJECT_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29652);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29653);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29654);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29655);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29656);writer.writeStartElement(SAME_INDIVIDUAL);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29657);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29658);render(axiom.getIndividuals());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29659);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29660);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29661);writer.writeStartElement(SUB_CLASS_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29662);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29663);axiom.getSubClass().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29664);axiom.getSuperClass().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29665);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29666);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29667);writer.writeStartElement(SYMMETRIC_OBJECT_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29668);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29669);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29670);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29671);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29672);writer.writeStartElement(TRANSITIVE_OBJECT_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29673);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29674);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29675);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29676);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29677);writer.writeStartElement(CLASS);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29678);writer.writeIRIAttribute(ce.getIRI());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29679);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29680);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29681);writer.writeStartElement(DATA_ALL_VALUES_FROM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29682);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29683);ce.getFiller().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29684);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29685);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29686);writer.writeStartElement(DATA_EXACT_CARDINALITY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29687);writer.writeCardinalityAttribute(ce.getCardinality());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29688);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29689);if ((((ce.isQualified())&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29690)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29691)==0&false))) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29692);ce.getFiller().accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29693);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29694);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29695);writer.writeStartElement(DATA_MAX_CARDINALITY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29696);writer.writeCardinalityAttribute(ce.getCardinality());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29697);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29698);if ((((ce.isQualified())&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29699)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29700)==0&false))) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29701);ce.getFiller().accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29702);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29703);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29704);writer.writeStartElement(DATA_MIN_CARDINALITY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29705);writer.writeCardinalityAttribute(ce.getCardinality());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29706);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29707);if ((((ce.isQualified())&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29708)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29709)==0&false))) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29710);ce.getFiller().accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29711);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29712);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29713);writer.writeStartElement(DATA_SOME_VALUES_FROM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29714);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29715);ce.getFiller().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29716);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29717);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29718);writer.writeStartElement(DATA_HAS_VALUE);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29719);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29720);ce.getFiller().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29721);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29722);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29723);writer.writeStartElement(OBJECT_ALL_VALUES_FROM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29724);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29725);ce.getFiller().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29726);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29727);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29728);writer.writeStartElement(OBJECT_COMPLEMENT_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29729);ce.getOperand().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29730);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29731);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29732);writer.writeStartElement(OBJECT_EXACT_CARDINALITY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29733);writer.writeCardinalityAttribute(ce.getCardinality());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29734);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29735);if ((((ce.isQualified())&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29736)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29737)==0&false))) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29738);ce.getFiller().accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29739);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29740);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29741);writer.writeStartElement(OBJECT_INTERSECTION_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29742);render(ce.getOperands());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29743);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29744);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29745);writer.writeStartElement(OBJECT_MAX_CARDINALITY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29746);writer.writeCardinalityAttribute(ce.getCardinality());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29747);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29748);if ((((ce.isQualified())&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29749)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29750)==0&false))) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29751);ce.getFiller().accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29752);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29753);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29754);writer.writeStartElement(OBJECT_MIN_CARDINALITY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29755);writer.writeCardinalityAttribute(ce.getCardinality());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29756);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29757);if ((((ce.isQualified())&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29758)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29759)==0&false))) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29760);ce.getFiller().accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29761);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29762);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29763);writer.writeStartElement(OBJECT_ONE_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29764);render(ce.getIndividuals());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29765);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29766);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29767);writer.writeStartElement(OBJECT_HAS_SELF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29768);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29769);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29770);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29771);writer.writeStartElement(OBJECT_SOME_VALUES_FROM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29772);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29773);ce.getFiller().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29774);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29775);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29776);writer.writeStartElement(OBJECT_UNION_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29777);render(ce.getOperands());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29778);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29779);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29780);writer.writeStartElement(OBJECT_HAS_VALUE);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29781);ce.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29782);ce.getFiller().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29783);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29784);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29785);writer.writeStartElement(DATA_COMPLEMENT_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29786);node.getDataRange().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29787);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29788);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29789);writer.writeStartElement(DATA_ONE_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29790);render(node.getValues());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29791);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29792);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29793);writer.writeStartElement(DATATYPE);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29794);writer.writeIRIAttribute(node.getIRI());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29795);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29796);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29797);writer.writeStartElement(DATATYPE_RESTRICTION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29798);node.getDatatype().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29799);render(node.getFacetRestrictions());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29800);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29801);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29802);writer.writeStartElement(FACET_RESTRICTION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29803);writer.writeFacetAttribute(node.getFacet());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29804);node.getFacetValue().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29805);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29806);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29807);writer.writeStartElement(LITERAL);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29808);if ((((node.hasLang())&&(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29809)!=0|true))||(__CLR4_5_2mpnmpnlvicmc8w.R.iget(29810)==0&false))) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29811);writer.writeLangAttribute(node.getLang());
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29812);writer.writeDatatypeAttribute(node.getDatatype());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29813);writer.writeTextContent(node.getLiteral());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29814);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29815);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29816);writer.writeStartElement(DATA_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29817);writer.writeIRIAttribute(property.getIRI());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29818);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29819);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29820);writer.writeStartElement(OBJECT_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29821);writer.writeIRIAttribute(property.getIRI());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29822);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29823);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29824);writer.writeStartElement(OBJECT_INVERSE_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29825);property.getInverse().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29826);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29827);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29828);writer.writeStartElement(NAMED_INDIVIDUAL);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29829);writer.writeIRIAttribute(individual.getIRI());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29830);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29831);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29832);writer.writeStartElement(HAS_KEY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29833);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29834);axiom.getClassExpression().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29835);render(axiom.getObjectPropertyExpressions());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29836);render(axiom.getDataPropertyExpressions());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29837);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29838);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29839);writer.writeStartElement(DATA_INTERSECTION_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29840);render(node.getOperands());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29841);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29842);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29843);writer.writeStartElement(DATA_UNION_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29844);render(node.getOperands());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29845);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29846);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29847);writer.writeStartElement(ANNOTATION_PROPERTY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29848);writer.writeIRIAttribute(property.getIRI());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29849);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29850);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29851);writer.writeStartElement(ANNOTATION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29852);for (OWLAnnotation anno : node.getAnnotations()) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29853);anno.accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29854);node.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29855);node.getValue().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29856);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29857);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29858);writer.writeStartElement(ANNOTATION_PROPERTY_DOMAIN);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29859);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29860);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29861);axiom.getDomain().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29862);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29863);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29864);writer.writeStartElement(ANNOTATION_PROPERTY_RANGE);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29865);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29866);axiom.getProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29867);axiom.getRange().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29868);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29869);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29870);writer.writeStartElement(SUB_ANNOTATION_PROPERTY_OF);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29871);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29872);axiom.getSubProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29873);axiom.getSuperProperty().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29874);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29875);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29876);writer.writeStartElement(DATATYPE_DEFINITION);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29877);writeAnnotations(axiom);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29878);axiom.getDatatype().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29879);axiom.getDataRange().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29880);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29881);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29882);writer.writeStartElement(DL_SAFE_RULE);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29883);writeAnnotations(rule);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29884);writer.writeStartElement(BODY);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29885);for (SWRLAtom atom : rule.getBody()) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29886);atom.accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29887);writer.writeEndElement();
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29888);writer.writeStartElement(HEAD);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29889);for (SWRLAtom atom : rule.getHead()) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29890);atom.accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29891);writer.writeEndElement();
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29892);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29893);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29894);writer.writeStartElement(CLASS_ATOM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29895);node.getPredicate().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29896);node.getArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29897);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29898);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29899);writer.writeStartElement(DATA_RANGE_ATOM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29900);node.getPredicate().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29901);node.getArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29902);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29903);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29904);writer.writeStartElement(OBJECT_PROPERTY_ATOM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29905);node.getPredicate().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29906);node.getFirstArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29907);node.getSecondArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29908);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29909);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29910);writer.writeStartElement(DATA_PROPERTY_ATOM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29911);node.getPredicate().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29912);node.getFirstArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29913);node.getSecondArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29914);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29915);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29916);writer.writeStartElement(BUILT_IN_ATOM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29917);writer.writeIRIAttribute(node.getPredicate());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29918);for (SWRLDArgument arg : node.getArguments()) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29919);arg.accept(this);
        }
        }__CLR4_5_2mpnmpnlvicmc8w.R.inc(29920);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29921);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29922);writer.writeStartElement(VARIABLE);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29923);writer.writeIRIAttribute(node.getIRI().getRemainder().get());
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29924);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29925);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29926);node.getIndividual().accept(this);
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29927);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29928);node.getLiteral().accept(this);
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29929);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29930);writer.writeStartElement(DIFFERENT_INDIVIDUALS_ATOM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29931);node.getFirstArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29932);node.getSecondArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29933);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29934);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29935);writer.writeStartElement(SAME_INDIVIDUAL_ATOM);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29936);node.getFirstArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29937);node.getSecondArgument().accept(this);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29938);writer.writeEndElement();
    }finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}

    private void render(Set<? extends OWLObject> objects) {try{__CLR4_5_2mpnmpnlvicmc8w.R.inc(29939);
        __CLR4_5_2mpnmpnlvicmc8w.R.inc(29940);for (OWLObject obj : objects) {{
            __CLR4_5_2mpnmpnlvicmc8w.R.inc(29941);obj.accept(this);
        }
    }}finally{__CLR4_5_2mpnmpnlvicmc8w.R.flushNeeded();}}
}
