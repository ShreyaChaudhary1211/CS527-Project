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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.RemoveAxiom;
import org.semanticweb.owlapi.util.OWLObjectDuplicator;

/**
 * Coerces constants to have the same type as the range of a property in axioms
 * where the two are used. For example, given, p value "xyz", the "xyz" constant
 * would be typed with the range of p.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.1
 */
public class CoerceConstantsIntoDataPropertyRange extends
        AbstractCompositeOntologyChange {public static class __CLR4_5_23q3qlvickj0m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * Instantiates a new coerce constants into data property range.
     * 
     * @param dataFactory
     *        the data factory
     * @param ontologies
     *        the ontologies to use
     */
    public CoerceConstantsIntoDataPropertyRange(
            @Nonnull OWLDataFactory dataFactory,
            @Nonnull Set<OWLOntology> ontologies) {
        super(dataFactory);__CLR4_5_23q3qlvickj0m.R.inc(135);try{__CLR4_5_23q3qlvickj0m.R.inc(134);
        __CLR4_5_23q3qlvickj0m.R.inc(136);Map<OWLDataPropertyExpression, OWLDatatype> map = new HashMap<>();
        __CLR4_5_23q3qlvickj0m.R.inc(137);for (OWLOntology ont : checkNotNull(ontologies,
                "ontologies cannot be null")) {{
            __CLR4_5_23q3qlvickj0m.R.inc(138);for (OWLDataPropertyRangeAxiom ax : ont
                    .getAxioms(AxiomType.DATA_PROPERTY_RANGE)) {{
                __CLR4_5_23q3qlvickj0m.R.inc(139);if ((((ax.getRange().isDatatype())&&(__CLR4_5_23q3qlvickj0m.R.iget(140)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(141)==0&false))) {{
                    __CLR4_5_23q3qlvickj0m.R.inc(142);map.put(ax.getProperty(), (OWLDatatype) ax.getRange());
                }
            }}
        }}
        }__CLR4_5_23q3qlvickj0m.R.inc(143);OWLConstantReplacer replacer = new OWLConstantReplacer(
                getDataFactory(), map);
        __CLR4_5_23q3qlvickj0m.R.inc(144);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_23q3qlvickj0m.R.iget(145)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(146)==0&false));
            __CLR4_5_23q3qlvickj0m.R.inc(147);for (OWLAxiom ax : ont.getLogicalAxioms()) {{
                assert (((ax != null)&&(__CLR4_5_23q3qlvickj0m.R.iget(148)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(149)==0&false));
                __CLR4_5_23q3qlvickj0m.R.inc(150);OWLAxiom dupAx = replacer.duplicateObject(ax);
                __CLR4_5_23q3qlvickj0m.R.inc(151);if ((((!ax.equals(dupAx))&&(__CLR4_5_23q3qlvickj0m.R.iget(152)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(153)==0&false))) {{
                    __CLR4_5_23q3qlvickj0m.R.inc(154);addChange(new RemoveAxiom(ont, ax));
                    __CLR4_5_23q3qlvickj0m.R.inc(155);addChange(new AddAxiom(ont, dupAx));
                }
            }}
        }}
    }}finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

    /** The Class OWLConstantReplacer. */
    private class OWLConstantReplacer extends OWLObjectDuplicator {

        private final Map<OWLDataPropertyExpression, OWLDatatype> map;

        /**
         * @param dataFactory
         *        the data factory
         * @param m
         *        the m
         */
        OWLConstantReplacer(@Nonnull OWLDataFactory dataFactory,
                @Nonnull Map<OWLDataPropertyExpression, OWLDatatype> m) {
            super(dataFactory);__CLR4_5_23q3qlvickj0m.R.inc(157);try{__CLR4_5_23q3qlvickj0m.R.inc(156);
            __CLR4_5_23q3qlvickj0m.R.inc(158);map = m;
        }finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Nonnull
        private OWLDataOneOf process(@Nonnull OWLDataPropertyExpression prop,
                @Nonnull OWLDataOneOf oneOf) {try{__CLR4_5_23q3qlvickj0m.R.inc(159);
            __CLR4_5_23q3qlvickj0m.R.inc(160);Set<OWLLiteral> vals = new HashSet<>();
            __CLR4_5_23q3qlvickj0m.R.inc(161);for (OWLLiteral con : oneOf.getValues()) {{
                assert (((con != null)&&(__CLR4_5_23q3qlvickj0m.R.iget(162)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(163)==0&false));
                __CLR4_5_23q3qlvickj0m.R.inc(164);vals.add(process(prop, con));
            }
            }__CLR4_5_23q3qlvickj0m.R.inc(165);return getDataFactory().getOWLDataOneOf(vals);
        }finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Nonnull
        private OWLLiteral process(@Nonnull OWLDataPropertyExpression prop,
                @Nonnull OWLLiteral con) {try{__CLR4_5_23q3qlvickj0m.R.inc(166);
            __CLR4_5_23q3qlvickj0m.R.inc(167);OWLDatatype dt = map.get(prop);
            __CLR4_5_23q3qlvickj0m.R.inc(168);if ((((dt != null)&&(__CLR4_5_23q3qlvickj0m.R.iget(169)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(170)==0&false))) {{
                __CLR4_5_23q3qlvickj0m.R.inc(171);return getDataFactory().getOWLLiteral(con.getLiteral(), dt);
            } }else {{
                __CLR4_5_23q3qlvickj0m.R.inc(172);return con;
            }
        }}finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Override
        public void visit(@Nonnull OWLDataHasValue ce) {try{__CLR4_5_23q3qlvickj0m.R.inc(173);
            __CLR4_5_23q3qlvickj0m.R.inc(174);super.visit(ce);
            __CLR4_5_23q3qlvickj0m.R.inc(175);setLastObject(getDataFactory().getOWLDataHasValue(ce.getProperty(),
                    process(ce.getProperty(), ce.getFiller())));
        }finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Override
        public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_23q3qlvickj0m.R.inc(176);
            __CLR4_5_23q3qlvickj0m.R.inc(177);super.visit(ce);
            __CLR4_5_23q3qlvickj0m.R.inc(178);if ((((ce instanceof OWLDataOneOf)&&(__CLR4_5_23q3qlvickj0m.R.iget(179)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(180)==0&false))) {{
                __CLR4_5_23q3qlvickj0m.R.inc(181);setLastObject(getDataFactory()
                        .getOWLDataSomeValuesFrom(
                                ce.getProperty(),
                                process(ce.getProperty(),
                                        (OWLDataOneOf) ce.getFiller())));
            }
        }}finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Override
        public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_23q3qlvickj0m.R.inc(182);
            __CLR4_5_23q3qlvickj0m.R.inc(183);super.visit(ce);
            __CLR4_5_23q3qlvickj0m.R.inc(184);if ((((ce instanceof OWLDataOneOf)&&(__CLR4_5_23q3qlvickj0m.R.iget(185)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(186)==0&false))) {{
                __CLR4_5_23q3qlvickj0m.R.inc(187);setLastObject(getDataFactory()
                        .getOWLDataMinCardinality(
                                ce.getCardinality(),
                                ce.getProperty(),
                                process(ce.getProperty(),
                                        (OWLDataOneOf) ce.getFiller())));
            }
        }}finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Override
        public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_23q3qlvickj0m.R.inc(188);
            __CLR4_5_23q3qlvickj0m.R.inc(189);super.visit(ce);
            __CLR4_5_23q3qlvickj0m.R.inc(190);if ((((ce instanceof OWLDataOneOf)&&(__CLR4_5_23q3qlvickj0m.R.iget(191)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(192)==0&false))) {{
                __CLR4_5_23q3qlvickj0m.R.inc(193);setLastObject(getDataFactory()
                        .getOWLDataMaxCardinality(
                                ce.getCardinality(),
                                ce.getProperty(),
                                process(ce.getProperty(),
                                        (OWLDataOneOf) ce.getFiller())));
            }
        }}finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Override
        public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_23q3qlvickj0m.R.inc(194);
            __CLR4_5_23q3qlvickj0m.R.inc(195);super.visit(ce);
            __CLR4_5_23q3qlvickj0m.R.inc(196);if ((((ce instanceof OWLDataOneOf)&&(__CLR4_5_23q3qlvickj0m.R.iget(197)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(198)==0&false))) {{
                __CLR4_5_23q3qlvickj0m.R.inc(199);setLastObject(getDataFactory()
                        .getOWLDataExactCardinality(
                                ce.getCardinality(),
                                ce.getProperty(),
                                process(ce.getProperty(),
                                        (OWLDataOneOf) ce.getFiller())));
            }
        }}finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Override
        public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_23q3qlvickj0m.R.inc(200);
            __CLR4_5_23q3qlvickj0m.R.inc(201);super.visit(ce);
            __CLR4_5_23q3qlvickj0m.R.inc(202);if ((((ce instanceof OWLDataOneOf)&&(__CLR4_5_23q3qlvickj0m.R.iget(203)!=0|true))||(__CLR4_5_23q3qlvickj0m.R.iget(204)==0&false))) {{
                __CLR4_5_23q3qlvickj0m.R.inc(205);setLastObject(getDataFactory()
                        .getOWLDataAllValuesFrom(
                                ce.getProperty(),
                                process(ce.getProperty(),
                                        (OWLDataOneOf) ce.getFiller())));
            }
        }}finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Override
        public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_23q3qlvickj0m.R.inc(206);
            __CLR4_5_23q3qlvickj0m.R.inc(207);super.visit(axiom);
            __CLR4_5_23q3qlvickj0m.R.inc(208);setLastObject(getDataFactory().getOWLDataPropertyAssertionAxiom(
                    axiom.getProperty(), axiom.getSubject(),
                    process(axiom.getProperty(), axiom.getObject())));
        }finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}

        @Override
        public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_23q3qlvickj0m.R.inc(209);
            __CLR4_5_23q3qlvickj0m.R.inc(210);super.visit(axiom);
            __CLR4_5_23q3qlvickj0m.R.inc(211);setLastObject(getDataFactory()
                    .getOWLNegativeDataPropertyAssertionAxiom(
                            axiom.getProperty(), axiom.getSubject(),
                            process(axiom.getProperty(), axiom.getObject())));
        }finally{__CLR4_5_23q3qlvickj0m.R.flushNeeded();}}
    }
}
