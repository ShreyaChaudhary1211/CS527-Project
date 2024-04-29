/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2011, Clark & Parsia, LLC
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package com.clarkparsia.owlapi.modularity.locality;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
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
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
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
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.util.OWLAxiomVisitorAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Semantic locality evaluator. */
public class SemanticLocalityEvaluator implements LocalityEvaluator {public static class __CLR4_5_2k4k4lviclyrr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,874,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final Logger LOGGER = LoggerFactory
            .getLogger(SemanticLocalityEvaluator.class);
    protected final OWLDataFactory df;
    private final AxiomLocalityVisitor axiomVisitor = new AxiomLocalityVisitor();
    private final BottomReplacer bottomReplacer = new BottomReplacer();
    protected final OWLReasoner reasoner;

    /**
     * Instantiates a new semantic locality evaluator.
     * 
     * @param man
     *        ontology manager
     * @param reasonerFactory
     *        reasoner factory
     */
    public SemanticLocalityEvaluator(@Nonnull OWLOntologyManager man,
            @Nonnull OWLReasonerFactory reasonerFactory) {try{__CLR4_5_2k4k4lviclyrr.R.inc(724);
        __CLR4_5_2k4k4lviclyrr.R.inc(725);df = checkNotNull(man, "man cannot be null").getOWLDataFactory();
        __CLR4_5_2k4k4lviclyrr.R.inc(726);try {
            __CLR4_5_2k4k4lviclyrr.R.inc(727);reasoner = checkNotNull(reasonerFactory,
                    "reasonerFactory cannot be null")
                    .createNonBufferingReasoner(man.createOntology());
        } catch (Exception e) {
            __CLR4_5_2k4k4lviclyrr.R.inc(728);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

    /** The Class AxiomLocalityVisitor. */
    private class AxiomLocalityVisitor extends OWLAxiomVisitorAdapter implements
            OWLAxiomVisitor {

        private boolean isLocal;

        AxiomLocalityVisitor() {try{__CLR4_5_2k4k4lviclyrr.R.inc(729);}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        /** @return true, if is local */
        public boolean isLocal() {try{__CLR4_5_2k4k4lviclyrr.R.inc(730);
            __CLR4_5_2k4k4lviclyrr.R.inc(731);return isLocal;
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        /**
         * @param axiom
         *        the axiom
         * @return true, if is local
         */
        public boolean isLocal(OWLAxiom axiom) {try{__CLR4_5_2k4k4lviclyrr.R.inc(732);
            __CLR4_5_2k4k4lviclyrr.R.inc(733);reset();
            __CLR4_5_2k4k4lviclyrr.R.inc(734);axiom.accept(this);
            __CLR4_5_2k4k4lviclyrr.R.inc(735);return isLocal();
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        /** Reset. */
        public void reset() {try{__CLR4_5_2k4k4lviclyrr.R.inc(736);
            __CLR4_5_2k4k4lviclyrr.R.inc(737);isLocal = false;
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2k4k4lviclyrr.R.inc(738);
            // XXX this seems wrong
            __CLR4_5_2k4k4lviclyrr.R.inc(739);isLocal = true;
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2k4k4lviclyrr.R.inc(740);
            __CLR4_5_2k4k4lviclyrr.R.inc(741);Set<OWLClassExpression> eqClasses = axiom.getClassExpressions();
            __CLR4_5_2k4k4lviclyrr.R.inc(742);if ((((eqClasses.size() != 2)&&(__CLR4_5_2k4k4lviclyrr.R.iget(743)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(744)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(745);return;
            }
            }__CLR4_5_2k4k4lviclyrr.R.inc(746);LOGGER.info("Calling the Reasoner");
            __CLR4_5_2k4k4lviclyrr.R.inc(747);isLocal = reasoner.isEntailed(axiom);
            __CLR4_5_2k4k4lviclyrr.R.inc(748);LOGGER.info("DONE Calling the Reasoner. isLocal = {}", isLocal);
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2k4k4lviclyrr.R.inc(749);
            __CLR4_5_2k4k4lviclyrr.R.inc(750);LOGGER.info("Calling the Reasoner");
            __CLR4_5_2k4k4lviclyrr.R.inc(751);isLocal = reasoner.isEntailed(axiom);
            __CLR4_5_2k4k4lviclyrr.R.inc(752);LOGGER.info("DONE Calling the Reasoner. isLocal = {}", isLocal);
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}
    }

    /** The Class BottomReplacer. */
    private class BottomReplacer extends OWLAxiomVisitorAdapter implements
            OWLAxiomVisitor, OWLClassExpressionVisitor {

        private OWLAxiom newAxiom;
        private OWLClassExpression newClassExpression;
        private Set<? extends OWLEntity> signature;

        BottomReplacer() {try{__CLR4_5_2k4k4lviclyrr.R.inc(753);}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        /** @return the result */
        @Nonnull
        public OWLAxiom getResult() {try{__CLR4_5_2k4k4lviclyrr.R.inc(754);
            __CLR4_5_2k4k4lviclyrr.R.inc(755);return verifyNotNull(newAxiom);
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        /**
         * Replace bottom.
         * 
         * @param axiom
         *        the axiom
         * @param sig
         *        the sig
         * @return the modified OWL axiom
         */
        @Nonnull
        public OWLAxiom replaceBottom(@Nonnull OWLAxiom axiom,
                @Nonnull Set<? extends OWLEntity> sig) {try{__CLR4_5_2k4k4lviclyrr.R.inc(756);
            __CLR4_5_2k4k4lviclyrr.R.inc(757);reset(checkNotNull(sig, "sig cannot be null"));
            __CLR4_5_2k4k4lviclyrr.R.inc(758);checkNotNull(axiom, "axiom cannot be null").accept(this);
            __CLR4_5_2k4k4lviclyrr.R.inc(759);return getResult();
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        /**
         * Takes an OWLClassExpression and a signature replaces by bottom the
         * entities not in the signature
         * 
         * @param desc
         *        the desc
         * @return the modified OWL class expression
         */
        @Nonnull
        public OWLClassExpression
                replaceBottom(@Nonnull OWLClassExpression desc) {try{__CLR4_5_2k4k4lviclyrr.R.inc(760);
            __CLR4_5_2k4k4lviclyrr.R.inc(761);newClassExpression = null;
            __CLR4_5_2k4k4lviclyrr.R.inc(762);checkNotNull(desc, "desc cannot be null").accept(this);
            __CLR4_5_2k4k4lviclyrr.R.inc(763);if ((((newClassExpression == null)&&(__CLR4_5_2k4k4lviclyrr.R.iget(764)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(765)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(766);throw new OWLRuntimeException("Unsupported class expression "
                        + desc);
            }
            }__CLR4_5_2k4k4lviclyrr.R.inc(767);return verifyNotNull(newClassExpression);
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        /**
         * @param classExpressions
         *        the class expressions
         * @return the set of modified OWL class expressions
         */
        @Nonnull
        public Set<OWLClassExpression> replaceBottom(
                @Nonnull Set<OWLClassExpression> classExpressions) {try{__CLR4_5_2k4k4lviclyrr.R.inc(768);
            __CLR4_5_2k4k4lviclyrr.R.inc(769);Set<OWLClassExpression> result = new HashSet<>();
            __CLR4_5_2k4k4lviclyrr.R.inc(770);for (OWLClassExpression desc : checkNotNull(classExpressions,
                    "classExpressions cannot be null")) {{
                assert (((desc != null)&&(__CLR4_5_2k4k4lviclyrr.R.iget(771)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(772)==0&false));
                __CLR4_5_2k4k4lviclyrr.R.inc(773);result.add(replaceBottom(desc));
            }
            }__CLR4_5_2k4k4lviclyrr.R.inc(774);return result;
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        /**
         * Reset.
         * 
         * @param s
         *        the signature
         */
        public void reset(@Nonnull Set<? extends OWLEntity> s) {try{__CLR4_5_2k4k4lviclyrr.R.inc(775);
            __CLR4_5_2k4k4lviclyrr.R.inc(776);signature = checkNotNull(s, "s cannot be null");
            __CLR4_5_2k4k4lviclyrr.R.inc(777);newAxiom = null;
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLClass ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(778);
            __CLR4_5_2k4k4lviclyrr.R.inc(779);if ((((signature.contains(ce))&&(__CLR4_5_2k4k4lviclyrr.R.iget(780)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(781)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(782);newClassExpression = ce;
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(783);newClassExpression = df.getOWLNothing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(784);
            __CLR4_5_2k4k4lviclyrr.R.inc(785);if ((((signature.contains(ce.getProperty().asOWLDataProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(786)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(787)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(788);newClassExpression = ce;
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(789);newClassExpression = df.getOWLThing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(790);
            __CLR4_5_2k4k4lviclyrr.R.inc(791);if ((((signature.contains(ce.getProperty().asOWLDataProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(792)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(793)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(794);newClassExpression = ce;
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(795);newClassExpression = df.getOWLNothing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(796);
            __CLR4_5_2k4k4lviclyrr.R.inc(797);if ((((signature.contains(ce.getProperty().asOWLDataProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(798)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(799)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(800);newClassExpression = ce;
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(801);newClassExpression = df.getOWLThing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(802);
            __CLR4_5_2k4k4lviclyrr.R.inc(803);if ((((signature.contains(ce.getProperty().asOWLDataProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(804)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(805)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(806);newClassExpression = ce;
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(807);newClassExpression = df.getOWLNothing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(808);
            __CLR4_5_2k4k4lviclyrr.R.inc(809);if ((((signature.contains(ce.getProperty().asOWLDataProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(810)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(811)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(812);newClassExpression = ce;
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(813);newClassExpression = df.getOWLNothing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLDataHasValue ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(814);
            __CLR4_5_2k4k4lviclyrr.R.inc(815);newClassExpression = df.getOWLNothing();
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2k4k4lviclyrr.R.inc(816);
            __CLR4_5_2k4k4lviclyrr.R.inc(817);Set<OWLClassExpression> disjointclasses = replaceBottom(axiom
                    .getClassExpressions());
            __CLR4_5_2k4k4lviclyrr.R.inc(818);newAxiom = df.getOWLDisjointClassesAxiom(disjointclasses);
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2k4k4lviclyrr.R.inc(819);
            __CLR4_5_2k4k4lviclyrr.R.inc(820);Set<OWLClassExpression> eqclasses = replaceBottom(axiom
                    .getClassExpressions());
            __CLR4_5_2k4k4lviclyrr.R.inc(821);newAxiom = df.getOWLEquivalentClassesAxiom(eqclasses);
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(822);
            __CLR4_5_2k4k4lviclyrr.R.inc(823);if ((((signature.contains(ce.getProperty().getNamedProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(824)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(825)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(826);newClassExpression = df.getOWLObjectAllValuesFrom(
                        ce.getProperty(), replaceBottom(ce.getFiller()));
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(827);newClassExpression = df.getOWLThing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(828);
            __CLR4_5_2k4k4lviclyrr.R.inc(829);newClassExpression = df.getOWLObjectComplementOf(replaceBottom(ce
                    .getOperand()));
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(830);
            __CLR4_5_2k4k4lviclyrr.R.inc(831);if ((((signature.contains(ce.getProperty().getNamedProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(832)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(833)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(834);newClassExpression = ce;
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(835);newClassExpression = df.getOWLNothing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(836);
            __CLR4_5_2k4k4lviclyrr.R.inc(837);Set<OWLClassExpression> operands = ce.getOperands();
            __CLR4_5_2k4k4lviclyrr.R.inc(838);newClassExpression = df
                    .getOWLObjectIntersectionOf(replaceBottom(operands));
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(839);
            __CLR4_5_2k4k4lviclyrr.R.inc(840);if ((((signature.contains(ce.getProperty().getNamedProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(841)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(842)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(843);newClassExpression = ce;
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(844);newClassExpression = df.getOWLThing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(845);
            __CLR4_5_2k4k4lviclyrr.R.inc(846);if ((((signature.contains(ce.getProperty().getNamedProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(847)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(848)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(849);newClassExpression = ce;
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(850);newClassExpression = df.getOWLNothing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(851);
            __CLR4_5_2k4k4lviclyrr.R.inc(852);newClassExpression = df.getOWLNothing();
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(853);
            __CLR4_5_2k4k4lviclyrr.R.inc(854);newClassExpression = df.getOWLNothing();
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(855);
            __CLR4_5_2k4k4lviclyrr.R.inc(856);if ((((signature.contains(ce.getProperty().getNamedProperty()))&&(__CLR4_5_2k4k4lviclyrr.R.iget(857)!=0|true))||(__CLR4_5_2k4k4lviclyrr.R.iget(858)==0&false))) {{
                __CLR4_5_2k4k4lviclyrr.R.inc(859);newClassExpression = df.getOWLObjectSomeValuesFrom(
                        ce.getProperty(), replaceBottom(ce.getFiller()));
            } }else {{
                __CLR4_5_2k4k4lviclyrr.R.inc(860);newClassExpression = df.getOWLNothing();
            }
        }}finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(861);
            __CLR4_5_2k4k4lviclyrr.R.inc(862);Set<OWLClassExpression> operands = ce.getOperands();
            __CLR4_5_2k4k4lviclyrr.R.inc(863);newClassExpression = df
                    .getOWLObjectUnionOf(replaceBottom(operands));
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2k4k4lviclyrr.R.inc(864);
            __CLR4_5_2k4k4lviclyrr.R.inc(865);newClassExpression = df.getOWLNothing();
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}

        @Override
        public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2k4k4lviclyrr.R.inc(866);
            __CLR4_5_2k4k4lviclyrr.R.inc(867);OWLClassExpression sup = replaceBottom(axiom.getSuperClass());
            __CLR4_5_2k4k4lviclyrr.R.inc(868);OWLClassExpression sub = replaceBottom(axiom.getSubClass());
            __CLR4_5_2k4k4lviclyrr.R.inc(869);newAxiom = df.getOWLSubClassOfAxiom(sub, sup);
        }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}
    }

    @Override
    public boolean isLocal(@Nonnull OWLAxiom axiom,
            @Nonnull Set<? extends OWLEntity> signature) {try{__CLR4_5_2k4k4lviclyrr.R.inc(870);
        __CLR4_5_2k4k4lviclyrr.R.inc(871);LOGGER.info("Replacing axiom by Bottom");
        __CLR4_5_2k4k4lviclyrr.R.inc(872);OWLAxiom newAxiom = bottomReplacer.replaceBottom(
                checkNotNull(axiom, "axiom cannot be null"),
                checkNotNull(signature, "signature cannot be null"));
        __CLR4_5_2k4k4lviclyrr.R.inc(873);return axiomVisitor.isLocal(newAxiom);
    }finally{__CLR4_5_2k4k4lviclyrr.R.flushNeeded();}}
}
