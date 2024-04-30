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

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLClassExpressionVisitor;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 * Given a set of ontologies, this composite change will replace all subclass
 * axioms in each ontology, whose super class is an object intersection
 * (conjuction) with multiple subclass axioms - one for each conjunct. For
 * example, A subClassOf (B and C), would be replaced with two subclass axioms,
 * A subClassOf B, and A subClassOf C.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.1
 */
public class SplitSubClassAxioms extends AbstractCompositeOntologyChange {public static class __CLR4_5_2eqeqlvickjui{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * Creates a composite change to split subclass axioms into multiple more
     * fine grained subclass axioms.
     * 
     * @param ontologies
     *        The ontologies whose subclass axioms should be processed.
     * @param dataFactory
     *        The data factory which should be used to create new axioms.
     */
    public SplitSubClassAxioms(@Nonnull Set<OWLOntology> ontologies,
            @Nonnull OWLDataFactory dataFactory) {
        super(dataFactory);__CLR4_5_2eqeqlvickjui.R.inc(531);try{__CLR4_5_2eqeqlvickjui.R.inc(530);
        __CLR4_5_2eqeqlvickjui.R.inc(532);for (OWLOntology ont : ontologies) {{
            assert (((ont != null)&&(__CLR4_5_2eqeqlvickjui.R.iget(533)!=0|true))||(__CLR4_5_2eqeqlvickjui.R.iget(534)==0&false));
            __CLR4_5_2eqeqlvickjui.R.inc(535);for (OWLSubClassOfAxiom ax : ont.getAxioms(AxiomType.SUBCLASS_OF)) {{
                __CLR4_5_2eqeqlvickjui.R.inc(536);ConjunctSplitter splitter = new ConjunctSplitter();
                __CLR4_5_2eqeqlvickjui.R.inc(537);ax.getSuperClass().accept(splitter);
                __CLR4_5_2eqeqlvickjui.R.inc(538);if ((((splitter.result.size() > 1)&&(__CLR4_5_2eqeqlvickjui.R.iget(539)!=0|true))||(__CLR4_5_2eqeqlvickjui.R.iget(540)==0&false))) {{
                    __CLR4_5_2eqeqlvickjui.R.inc(541);addChange(new RemoveAxiom(ont, ax));
                    __CLR4_5_2eqeqlvickjui.R.inc(542);for (OWLClassExpression desc : splitter.result) {{
                        assert (((desc != null)&&(__CLR4_5_2eqeqlvickjui.R.iget(543)!=0|true))||(__CLR4_5_2eqeqlvickjui.R.iget(544)==0&false));
                        __CLR4_5_2eqeqlvickjui.R.inc(545);OWLAxiom replAx = getDataFactory()
                                .getOWLSubClassOfAxiom(ax.getSubClass(), desc);
                        __CLR4_5_2eqeqlvickjui.R.inc(546);addChange(new AddAxiom(ont, replAx));
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

    /** The Class ConjunctSplitter. */
    private static class ConjunctSplitter implements OWLClassExpressionVisitor {

        /** The result. */
        final Set<OWLClassExpression> result = new HashSet<>();

        /** Instantiates a new conjunct splitter. */
        ConjunctSplitter() {try{__CLR4_5_2eqeqlvickjui.R.inc(547);}finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLClass ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(548);
            __CLR4_5_2eqeqlvickjui.R.inc(549);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(550);
            __CLR4_5_2eqeqlvickjui.R.inc(551);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(552);
            __CLR4_5_2eqeqlvickjui.R.inc(553);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(554);
            __CLR4_5_2eqeqlvickjui.R.inc(555);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(556);
            __CLR4_5_2eqeqlvickjui.R.inc(557);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(558);
            __CLR4_5_2eqeqlvickjui.R.inc(559);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLDataHasValue ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(560);
            __CLR4_5_2eqeqlvickjui.R.inc(561);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(562);
            __CLR4_5_2eqeqlvickjui.R.inc(563);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(564);
            __CLR4_5_2eqeqlvickjui.R.inc(565);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(566);
            __CLR4_5_2eqeqlvickjui.R.inc(567);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(568);
            __CLR4_5_2eqeqlvickjui.R.inc(569);for (OWLClassExpression op : ce.getOperands()) {{
                __CLR4_5_2eqeqlvickjui.R.inc(570);op.accept(this);
            }
        }}finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(571);
            __CLR4_5_2eqeqlvickjui.R.inc(572);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(573);
            __CLR4_5_2eqeqlvickjui.R.inc(574);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(575);
            __CLR4_5_2eqeqlvickjui.R.inc(576);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(577);
            __CLR4_5_2eqeqlvickjui.R.inc(578);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(579);
            __CLR4_5_2eqeqlvickjui.R.inc(580);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(581);
            __CLR4_5_2eqeqlvickjui.R.inc(582);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2eqeqlvickjui.R.inc(583);
            __CLR4_5_2eqeqlvickjui.R.inc(584);result.add(ce);
        }finally{__CLR4_5_2eqeqlvickjui.R.flushNeeded();}}
    }
}
