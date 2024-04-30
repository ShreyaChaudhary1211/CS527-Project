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
package org.semanticweb.owlapi.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLClassExpressionVisitorEx;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDataVisitorEx;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLRule;

/**
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 */
public class NNF extends OWLDataVisitorExAdapter<OWLDataRange> implements
        OWLClassExpressionVisitorEx<OWLClassExpression>,
        OWLDataVisitorEx<OWLDataRange>, OWLAxiomVisitorEx<OWLAxiom> {public static class __CLR4_5_26p56p5lvickqf7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,9002,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean negated;
    private final OWLDataFactory dataFactory;

    /**
     * @param dataFactory
     *        datafactory to use
     */
    @SuppressWarnings("null")
    public NNF(@Nonnull OWLDataFactory dataFactory) {
        super(null);__CLR4_5_26p56p5lvickqf7.R.inc(8682);try{__CLR4_5_26p56p5lvickqf7.R.inc(8681);
        __CLR4_5_26p56p5lvickqf7.R.inc(8683);this.dataFactory = checkNotNull(dataFactory,
                "dataFactory cannot be null");
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    /** reset the negation. */
    public void reset() {try{__CLR4_5_26p56p5lvickqf7.R.inc(8684);
        __CLR4_5_26p56p5lvickqf7.R.inc(8685);negated = false;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Nonnull
    private OWLClassExpression getNegation(
            @Nonnull OWLClassExpression classExpression) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8686);
        __CLR4_5_26p56p5lvickqf7.R.inc(8687);return dataFactory.getOWLObjectComplementOf(classExpression);
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLClass ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8688);
        __CLR4_5_26p56p5lvickqf7.R.inc(8689);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8690)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8691)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8692);if ((((ce.isOWLNothing())&&(__CLR4_5_26p56p5lvickqf7.R.iget(8693)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8694)==0&false))) {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8695);return dataFactory.getOWLThing();
            } }else {__CLR4_5_26p56p5lvickqf7.R.inc(8696);if ((((ce.isOWLThing())&&(__CLR4_5_26p56p5lvickqf7.R.iget(8697)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8698)==0&false))) {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8699);return dataFactory.getOWLNothing();
            } }else {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8700);return getNegation(ce);
            }
        }}} }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8701);return ce;
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8702);
        __CLR4_5_26p56p5lvickqf7.R.inc(8703);Set<OWLClassExpression> ops = new HashSet<>();
        __CLR4_5_26p56p5lvickqf7.R.inc(8704);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8705);ops.add(op.accept(this));
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8706);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8707)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8708)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8709);return dataFactory.getOWLObjectUnionOf(ops);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8710);return dataFactory.getOWLObjectIntersectionOf(ops);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectUnionOf ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8711);
        __CLR4_5_26p56p5lvickqf7.R.inc(8712);Set<OWLClassExpression> ops = new HashSet<>();
        __CLR4_5_26p56p5lvickqf7.R.inc(8713);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8714);ops.add(op.accept(this));
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8715);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8716)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8717)==0&false))) {{
            // Flip to an intersection
            __CLR4_5_26p56p5lvickqf7.R.inc(8718);return dataFactory.getOWLObjectIntersectionOf(ops);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8719);return dataFactory.getOWLObjectUnionOf(ops);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectComplementOf ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8720);
        __CLR4_5_26p56p5lvickqf7.R.inc(8721);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8722)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8723)==0&false))) {{
            // Cancels out.
            // Save and then restore.
            __CLR4_5_26p56p5lvickqf7.R.inc(8724);boolean neg = negated;
            __CLR4_5_26p56p5lvickqf7.R.inc(8725);negated = false;
            __CLR4_5_26p56p5lvickqf7.R.inc(8726);OWLClassExpression negDesc = ce.getOperand().accept(this);
            __CLR4_5_26p56p5lvickqf7.R.inc(8727);negated = neg;
            __CLR4_5_26p56p5lvickqf7.R.inc(8728);return negDesc;
        } }else {{
            // Save and then restore
            __CLR4_5_26p56p5lvickqf7.R.inc(8729);boolean neg = negated;
            __CLR4_5_26p56p5lvickqf7.R.inc(8730);negated = true;
            __CLR4_5_26p56p5lvickqf7.R.inc(8731);OWLClassExpression negDesc = ce.getOperand().accept(this);
            __CLR4_5_26p56p5lvickqf7.R.inc(8732);negated = neg;
            __CLR4_5_26p56p5lvickqf7.R.inc(8733);return negDesc;
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8734);
        __CLR4_5_26p56p5lvickqf7.R.inc(8735);OWLClassExpression filler = ce.getFiller().accept(this);
        __CLR4_5_26p56p5lvickqf7.R.inc(8736);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8737)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8738)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8739);return dataFactory.getOWLObjectAllValuesFrom(ce.getProperty(),
                    filler);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8740);return dataFactory.getOWLObjectSomeValuesFrom(ce.getProperty(),
                    filler);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8741);
        __CLR4_5_26p56p5lvickqf7.R.inc(8742);OWLClassExpression filler = ce.getFiller().accept(this);
        __CLR4_5_26p56p5lvickqf7.R.inc(8743);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8744)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8745)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8746);return dataFactory.getOWLObjectSomeValuesFrom(ce.getProperty(),
                    filler);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8747);return dataFactory.getOWLObjectAllValuesFrom(ce.getProperty(),
                    filler);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectHasValue ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8748);
        __CLR4_5_26p56p5lvickqf7.R.inc(8749);return ce.asSomeValuesFrom().accept(this);
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLClassExpression visit(OWLObjectMinCardinality ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8750);
        __CLR4_5_26p56p5lvickqf7.R.inc(8751);boolean neg = negated;
        __CLR4_5_26p56p5lvickqf7.R.inc(8752);int card = ce.getCardinality();
        __CLR4_5_26p56p5lvickqf7.R.inc(8753);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8754)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8755)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8756);card = ce.getCardinality() - 1;
            __CLR4_5_26p56p5lvickqf7.R.inc(8757);if ((((card < 0)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8758)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8759)==0&false))) {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8760);card = 0;
            }
        }}
        }__CLR4_5_26p56p5lvickqf7.R.inc(8761);negated = false;
        __CLR4_5_26p56p5lvickqf7.R.inc(8762);OWLClassExpression filler = ce.getFiller().accept(this);
        __CLR4_5_26p56p5lvickqf7.R.inc(8763);OWLClassExpression nnf = null;
        __CLR4_5_26p56p5lvickqf7.R.inc(8764);if ((((neg)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8765)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8766)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8767);nnf = dataFactory.getOWLObjectMaxCardinality(card,
                    ce.getProperty(), filler);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8768);nnf = dataFactory.getOWLObjectMinCardinality(card,
                    ce.getProperty(), filler);
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8769);negated = neg;
        __CLR4_5_26p56p5lvickqf7.R.inc(8770);return nnf;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectExactCardinality ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8771);
        __CLR4_5_26p56p5lvickqf7.R.inc(8772);return ce.asIntersectionOfMinMax().accept(this);
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8773);
        __CLR4_5_26p56p5lvickqf7.R.inc(8774);boolean neg = negated;
        __CLR4_5_26p56p5lvickqf7.R.inc(8775);int card = ce.getCardinality();
        __CLR4_5_26p56p5lvickqf7.R.inc(8776);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8777)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8778)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8779);card = ce.getCardinality() + 1;
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8780);negated = false;
        __CLR4_5_26p56p5lvickqf7.R.inc(8781);OWLClassExpression filler = ce.getFiller().accept(this);
        __CLR4_5_26p56p5lvickqf7.R.inc(8782);OWLClassExpression nnf = null;
        __CLR4_5_26p56p5lvickqf7.R.inc(8783);if ((((neg)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8784)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8785)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8786);nnf = dataFactory.getOWLObjectMinCardinality(card,
                    ce.getProperty(), filler);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8787);nnf = dataFactory.getOWLObjectMaxCardinality(card,
                    ce.getProperty(), filler);
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8788);negated = neg;
        __CLR4_5_26p56p5lvickqf7.R.inc(8789);return nnf;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectHasSelf ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8790);
        __CLR4_5_26p56p5lvickqf7.R.inc(8791);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8792)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8793)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8794);return getNegation(ce);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8795);return ce;
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectOneOf ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8796);
        __CLR4_5_26p56p5lvickqf7.R.inc(8797);if ((((ce.getIndividuals().size() == 1)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8798)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8799)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8800);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8801)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8802)==0&false))) {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8803);return getNegation(ce);
            } }else {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8804);return ce;
            }
        }} }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8805);return ce.asObjectUnionOf().accept(this);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8806);
        __CLR4_5_26p56p5lvickqf7.R.inc(8807);OWLDataRange filler = ce.getFiller().accept(this);
        __CLR4_5_26p56p5lvickqf7.R.inc(8808);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8809)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8810)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8811);return dataFactory
                    .getOWLDataAllValuesFrom(ce.getProperty(), filler);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8812);return dataFactory.getOWLDataSomeValuesFrom(ce.getProperty(),
                    filler);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8813);
        __CLR4_5_26p56p5lvickqf7.R.inc(8814);OWLDataRange filler = ce.getFiller().accept(this);
        __CLR4_5_26p56p5lvickqf7.R.inc(8815);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8816)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8817)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8818);return dataFactory.getOWLDataSomeValuesFrom(ce.getProperty(),
                    filler);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8819);return dataFactory
                    .getOWLDataAllValuesFrom(ce.getProperty(), filler);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDataHasValue ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8820);
        __CLR4_5_26p56p5lvickqf7.R.inc(8821);return ce.asSomeValuesFrom().accept(this);
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDataExactCardinality ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8822);
        __CLR4_5_26p56p5lvickqf7.R.inc(8823);return ce.asIntersectionOfMinMax().accept(this);
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDataMaxCardinality ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8824);
        __CLR4_5_26p56p5lvickqf7.R.inc(8825);boolean neg = negated;
        __CLR4_5_26p56p5lvickqf7.R.inc(8826);int card = ce.getCardinality();
        __CLR4_5_26p56p5lvickqf7.R.inc(8827);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8828)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8829)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8830);card = ce.getCardinality() + 1;
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8831);negated = false;
        __CLR4_5_26p56p5lvickqf7.R.inc(8832);OWLDataRange filler = ce.getFiller().accept(this);
        __CLR4_5_26p56p5lvickqf7.R.inc(8833);OWLClassExpression nnf = null;
        __CLR4_5_26p56p5lvickqf7.R.inc(8834);if ((((neg)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8835)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8836)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8837);nnf = dataFactory.getOWLDataMinCardinality(card, ce.getProperty(),
                    filler);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8838);nnf = dataFactory.getOWLDataMaxCardinality(card, ce.getProperty(),
                    filler);
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8839);negated = neg;
        __CLR4_5_26p56p5lvickqf7.R.inc(8840);return nnf;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLDataMinCardinality ce) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8841);
        __CLR4_5_26p56p5lvickqf7.R.inc(8842);boolean neg = negated;
        __CLR4_5_26p56p5lvickqf7.R.inc(8843);int card = ce.getCardinality();
        __CLR4_5_26p56p5lvickqf7.R.inc(8844);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8845)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8846)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8847);card = ce.getCardinality() - 1;
            __CLR4_5_26p56p5lvickqf7.R.inc(8848);if ((((card < 0)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8849)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8850)==0&false))) {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8851);card = 0;
            }
        }}
        }__CLR4_5_26p56p5lvickqf7.R.inc(8852);negated = false;
        __CLR4_5_26p56p5lvickqf7.R.inc(8853);OWLDataRange filler = ce.getFiller().accept(this);
        __CLR4_5_26p56p5lvickqf7.R.inc(8854);OWLClassExpression nnf = null;
        __CLR4_5_26p56p5lvickqf7.R.inc(8855);if ((((neg)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8856)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8857)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8858);nnf = dataFactory.getOWLDataMaxCardinality(card, ce.getProperty(),
                    filler);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8859);nnf = dataFactory.getOWLDataMinCardinality(card, ce.getProperty(),
                    filler);
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8860);negated = neg;
        __CLR4_5_26p56p5lvickqf7.R.inc(8861);return nnf;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(OWLDatatype node) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8862);
        __CLR4_5_26p56p5lvickqf7.R.inc(8863);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8864)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8865)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8866);return dataFactory.getOWLDataComplementOf(node);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8867);return node;
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(OWLDataComplementOf node) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8868);
        __CLR4_5_26p56p5lvickqf7.R.inc(8869);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8870)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8871)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8872);return node.getDataRange();
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8873);return node;
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(OWLDataOneOf node) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8874);
        __CLR4_5_26p56p5lvickqf7.R.inc(8875);if ((((node.getValues().size() == 1)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8876)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8877)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8878);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8879)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8880)==0&false))) {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8881);return dataFactory.getOWLDataComplementOf(node);
            } }else {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8882);return node;
            }
        }} }else {{
            // Encode as a data union of and return result
            __CLR4_5_26p56p5lvickqf7.R.inc(8883);Set<OWLDataOneOf> oneOfs = new HashSet<>();
            __CLR4_5_26p56p5lvickqf7.R.inc(8884);for (OWLLiteral lit : node.getValues()) {{
                __CLR4_5_26p56p5lvickqf7.R.inc(8885);oneOfs.add(dataFactory.getOWLDataOneOf(lit));
            }
            }__CLR4_5_26p56p5lvickqf7.R.inc(8886);return dataFactory.getOWLDataUnionOf(oneOfs).accept(this);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(OWLDataIntersectionOf node) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8887);
        __CLR4_5_26p56p5lvickqf7.R.inc(8888);Set<OWLDataRange> ops = new HashSet<>();
        __CLR4_5_26p56p5lvickqf7.R.inc(8889);for (OWLDataRange op : node.getOperands()) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8890);ops.add(op.accept(this));
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8891);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8892)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8893)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8894);return dataFactory.getOWLDataUnionOf(ops);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8895);return dataFactory.getOWLDataIntersectionOf(ops);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(OWLDataUnionOf node) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8896);
        __CLR4_5_26p56p5lvickqf7.R.inc(8897);Set<OWLDataRange> ops = new HashSet<>();
        __CLR4_5_26p56p5lvickqf7.R.inc(8898);for (OWLDataRange op : node.getOperands()) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8899);ops.add(op.accept(this));
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8900);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8901)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8902)==0&false))) {{
            // Flip to an intersection
            __CLR4_5_26p56p5lvickqf7.R.inc(8903);return dataFactory.getOWLDataIntersectionOf(ops);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8904);return dataFactory.getOWLDataUnionOf(ops);
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8905);
        __CLR4_5_26p56p5lvickqf7.R.inc(8906);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(OWLDatatypeRestriction node) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8907);
        __CLR4_5_26p56p5lvickqf7.R.inc(8908);if ((((negated)&&(__CLR4_5_26p56p5lvickqf7.R.iget(8909)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8910)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8911);return dataFactory.getOWLDataComplementOf(node);
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8912);return node;
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    // Conversion of non-class expressions to NNF
    @Override
    public OWLAxiom visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8913);
        __CLR4_5_26p56p5lvickqf7.R.inc(8914);return dataFactory.getOWLSubClassOfAxiom(
                axiom.getSubClass().accept(this),
                axiom.getSuperClass().accept(this));
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8915);
        __CLR4_5_26p56p5lvickqf7.R.inc(8916);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8917);
        __CLR4_5_26p56p5lvickqf7.R.inc(8918);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8919);
        __CLR4_5_26p56p5lvickqf7.R.inc(8920);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8921);
        __CLR4_5_26p56p5lvickqf7.R.inc(8922);Set<OWLClassExpression> ops = new HashSet<>();
        __CLR4_5_26p56p5lvickqf7.R.inc(8923);for (OWLClassExpression op : axiom.getClassExpressions()) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8924);ops.add(op.accept(this));
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8925);return dataFactory.getOWLDisjointClassesAxiom(ops);
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8926);
        __CLR4_5_26p56p5lvickqf7.R.inc(8927);return dataFactory.getOWLDataPropertyDomainAxiom(axiom.getProperty(),
                axiom.getDomain().accept(this));
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8928);
        __CLR4_5_26p56p5lvickqf7.R.inc(8929);return dataFactory.getOWLObjectPropertyDomainAxiom(axiom.getProperty(),
                axiom.getDomain().accept(this));
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8930);
        __CLR4_5_26p56p5lvickqf7.R.inc(8931);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8932);
        __CLR4_5_26p56p5lvickqf7.R.inc(8933);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8934);
        __CLR4_5_26p56p5lvickqf7.R.inc(8935);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8936);
        __CLR4_5_26p56p5lvickqf7.R.inc(8937);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8938);
        __CLR4_5_26p56p5lvickqf7.R.inc(8939);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8940);
        __CLR4_5_26p56p5lvickqf7.R.inc(8941);return dataFactory.getOWLObjectPropertyRangeAxiom(axiom.getProperty(),
                axiom.getRange().accept(this));
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8942);
        __CLR4_5_26p56p5lvickqf7.R.inc(8943);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8944);
        __CLR4_5_26p56p5lvickqf7.R.inc(8945);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8946);
        __CLR4_5_26p56p5lvickqf7.R.inc(8947);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8948);
        __CLR4_5_26p56p5lvickqf7.R.inc(8949);Set<OWLClassExpression> descs = new HashSet<>();
        __CLR4_5_26p56p5lvickqf7.R.inc(8950);for (OWLClassExpression op : axiom.getClassExpressions()) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8951);descs.add(op.accept(this));
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8952);return dataFactory.getOWLDisjointUnionAxiom(axiom.getOWLClass(), descs);
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8953);
        __CLR4_5_26p56p5lvickqf7.R.inc(8954);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8955);
        __CLR4_5_26p56p5lvickqf7.R.inc(8956);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8957);
        __CLR4_5_26p56p5lvickqf7.R.inc(8958);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8959);
        __CLR4_5_26p56p5lvickqf7.R.inc(8960);return dataFactory.getOWLDataPropertyRangeAxiom(axiom.getProperty(),
                axiom.getRange().accept(this));
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8961);
        __CLR4_5_26p56p5lvickqf7.R.inc(8962);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8963);
        __CLR4_5_26p56p5lvickqf7.R.inc(8964);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8965);
        __CLR4_5_26p56p5lvickqf7.R.inc(8966);if ((((axiom.getClassExpression().isAnonymous())&&(__CLR4_5_26p56p5lvickqf7.R.iget(8967)!=0|true))||(__CLR4_5_26p56p5lvickqf7.R.iget(8968)==0&false))) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8969);return dataFactory.getOWLClassAssertionAxiom(axiom
                    .getClassExpression().accept(this), axiom.getIndividual());
        } }else {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8970);return axiom;
        }
    }}finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8971);
        __CLR4_5_26p56p5lvickqf7.R.inc(8972);Set<OWLClassExpression> ops = new HashSet<>();
        __CLR4_5_26p56p5lvickqf7.R.inc(8973);for (OWLClassExpression op : axiom.getClassExpressions()) {{
            __CLR4_5_26p56p5lvickqf7.R.inc(8974);ops.add(op.accept(this));
        }
        }__CLR4_5_26p56p5lvickqf7.R.inc(8975);return dataFactory.getOWLEquivalentClassesAxiom(ops);
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8976);
        __CLR4_5_26p56p5lvickqf7.R.inc(8977);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8978);
        __CLR4_5_26p56p5lvickqf7.R.inc(8979);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8980);
        __CLR4_5_26p56p5lvickqf7.R.inc(8981);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8982);
        __CLR4_5_26p56p5lvickqf7.R.inc(8983);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8984);
        __CLR4_5_26p56p5lvickqf7.R.inc(8985);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8986);
        __CLR4_5_26p56p5lvickqf7.R.inc(8987);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8988);
        __CLR4_5_26p56p5lvickqf7.R.inc(8989);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8990);
        __CLR4_5_26p56p5lvickqf7.R.inc(8991);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(SWRLRule rule) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8992);
        __CLR4_5_26p56p5lvickqf7.R.inc(8993);return rule;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8994);
        __CLR4_5_26p56p5lvickqf7.R.inc(8995);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8996);
        __CLR4_5_26p56p5lvickqf7.R.inc(8997);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(8998);
        __CLR4_5_26p56p5lvickqf7.R.inc(8999);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_26p56p5lvickqf7.R.inc(9000);
        __CLR4_5_26p56p5lvickqf7.R.inc(9001);return axiom;
    }finally{__CLR4_5_26p56p5lvickqf7.R.flushNeeded();}}
}
