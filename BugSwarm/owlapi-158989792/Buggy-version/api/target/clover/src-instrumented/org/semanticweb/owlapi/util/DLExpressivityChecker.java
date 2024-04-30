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

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;
import static org.semanticweb.owlapi.util.DLExpressivityChecker.Construct.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataCardinalityRestriction;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectCardinalityRestriction;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectInverseOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class DLExpressivityChecker extends OWLObjectVisitorAdapter {public static class __CLR4_5_25b95b9lvickpjr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,7169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Set<Construct> constructs;
    private final Set<OWLOntology> ontologies;

    /** @return ordered constructs */
    public List<Construct> getConstructs() {try{__CLR4_5_25b95b9lvickpjr.R.inc(6885);
        __CLR4_5_25b95b9lvickpjr.R.inc(6886);return getOrderedConstructs();
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    /**
     * @param ontologies
     *        ontologies
     */
    public DLExpressivityChecker(Set<OWLOntology> ontologies) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6887);
        __CLR4_5_25b95b9lvickpjr.R.inc(6888);this.ontologies = ontologies;
        __CLR4_5_25b95b9lvickpjr.R.inc(6889);constructs = new HashSet<>();
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    /** @return DL name */
    @Nonnull
    public String getDescriptionLogicName() {try{__CLR4_5_25b95b9lvickpjr.R.inc(6890);
        __CLR4_5_25b95b9lvickpjr.R.inc(6891);StringBuilder s = new StringBuilder();
        __CLR4_5_25b95b9lvickpjr.R.inc(6892);for (Construct c : getOrderedConstructs()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6893);s.append(c);
        }
        }__CLR4_5_25b95b9lvickpjr.R.inc(6894);return verifyNotNull(s.toString());
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    private void pruneConstructs() {try{__CLR4_5_25b95b9lvickpjr.R.inc(6895);
        __CLR4_5_25b95b9lvickpjr.R.inc(6896);if ((((constructs.contains(AL))&&(__CLR4_5_25b95b9lvickpjr.R.iget(6897)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6898)==0&false))) {{
            // AL + U + E can be represented using ALC
            __CLR4_5_25b95b9lvickpjr.R.inc(6899);if ((((constructs.contains(C))&&(__CLR4_5_25b95b9lvickpjr.R.iget(6900)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6901)==0&false))) {{
                // Remove existential because this can be represented
                // with AL + Neg
                __CLR4_5_25b95b9lvickpjr.R.inc(6902);constructs.remove(E);
                // Remove out union (intersection + negation (demorgan))
                __CLR4_5_25b95b9lvickpjr.R.inc(6903);constructs.remove(U);
            } }else {__CLR4_5_25b95b9lvickpjr.R.inc(6904);if ((((constructs.contains(E) && constructs.contains(U))&&(__CLR4_5_25b95b9lvickpjr.R.iget(6905)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6906)==0&false))) {{
                // Simplify to ALC
                __CLR4_5_25b95b9lvickpjr.R.inc(6907);constructs.add(AL);
                __CLR4_5_25b95b9lvickpjr.R.inc(6908);constructs.add(C);
                __CLR4_5_25b95b9lvickpjr.R.inc(6909);constructs.remove(E);
                __CLR4_5_25b95b9lvickpjr.R.inc(6910);constructs.remove(U);
            }
        }}}
        }__CLR4_5_25b95b9lvickpjr.R.inc(6911);if ((((constructs.contains(N) || constructs.contains(Q))&&(__CLR4_5_25b95b9lvickpjr.R.iget(6912)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6913)==0&false))) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6914);constructs.remove(F);
        }
        }__CLR4_5_25b95b9lvickpjr.R.inc(6915);if ((((constructs.contains(Q))&&(__CLR4_5_25b95b9lvickpjr.R.iget(6916)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6917)==0&false))) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6918);constructs.remove(N);
        }
        }__CLR4_5_25b95b9lvickpjr.R.inc(6919);if ((((constructs.contains(AL) && constructs.contains(C)
                && constructs.contains(TRAN))&&(__CLR4_5_25b95b9lvickpjr.R.iget(6920)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6921)==0&false))) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6922);constructs.remove(AL);
            __CLR4_5_25b95b9lvickpjr.R.inc(6923);constructs.remove(C);
            __CLR4_5_25b95b9lvickpjr.R.inc(6924);constructs.remove(TRAN);
            __CLR4_5_25b95b9lvickpjr.R.inc(6925);constructs.add(S);
        }
        }__CLR4_5_25b95b9lvickpjr.R.inc(6926);if ((((constructs.contains(R))&&(__CLR4_5_25b95b9lvickpjr.R.iget(6927)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6928)==0&false))) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6929);constructs.remove(H);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    private List<Construct> getOrderedConstructs() {try{__CLR4_5_25b95b9lvickpjr.R.inc(6930);
        __CLR4_5_25b95b9lvickpjr.R.inc(6931);constructs.clear();
        __CLR4_5_25b95b9lvickpjr.R.inc(6932);constructs.add(AL);
        __CLR4_5_25b95b9lvickpjr.R.inc(6933);for (OWLOntology ont : ontologies) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6934);for (OWLAxiom ax : ont.getLogicalAxioms()) {{
                __CLR4_5_25b95b9lvickpjr.R.inc(6935);ax.accept(this);
            }
        }}
        }__CLR4_5_25b95b9lvickpjr.R.inc(6936);pruneConstructs();
        __CLR4_5_25b95b9lvickpjr.R.inc(6937);List<Construct> cons = new ArrayList<>(constructs);
        __CLR4_5_25b95b9lvickpjr.R.inc(6938);Collections.sort(cons, new ConstructComparator());
        __CLR4_5_25b95b9lvickpjr.R.inc(6939);return cons;
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    /** A comparator that orders DL constucts to produce a traditional DL name. */
    private static class ConstructComparator implements Comparator<Construct>,
            Serializable {

        private static final long serialVersionUID = 40000L;
        private final List<Construct> order = new ArrayList<>();

        ConstructComparator() {try{__CLR4_5_25b95b9lvickpjr.R.inc(6940);
            __CLR4_5_25b95b9lvickpjr.R.inc(6941);order.add(S);
            __CLR4_5_25b95b9lvickpjr.R.inc(6942);order.add(AL);
            __CLR4_5_25b95b9lvickpjr.R.inc(6943);order.add(C);
            __CLR4_5_25b95b9lvickpjr.R.inc(6944);order.add(U);
            __CLR4_5_25b95b9lvickpjr.R.inc(6945);order.add(E);
            __CLR4_5_25b95b9lvickpjr.R.inc(6946);order.add(R);
            __CLR4_5_25b95b9lvickpjr.R.inc(6947);order.add(H);
            __CLR4_5_25b95b9lvickpjr.R.inc(6948);order.add(O);
            __CLR4_5_25b95b9lvickpjr.R.inc(6949);order.add(I);
            __CLR4_5_25b95b9lvickpjr.R.inc(6950);order.add(N);
            __CLR4_5_25b95b9lvickpjr.R.inc(6951);order.add(Q);
            __CLR4_5_25b95b9lvickpjr.R.inc(6952);order.add(F);
            __CLR4_5_25b95b9lvickpjr.R.inc(6953);order.add(TRAN);
            __CLR4_5_25b95b9lvickpjr.R.inc(6954);order.add(D);
        }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

        @Override
        public int compare(Construct o1, Construct o2) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6955);
            __CLR4_5_25b95b9lvickpjr.R.inc(6956);return order.indexOf(o1) - order.indexOf(o2);
        }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}
    }

    // Property expression
    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6957);
        __CLR4_5_25b95b9lvickpjr.R.inc(6958);constructs.add(I);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6959);
        __CLR4_5_25b95b9lvickpjr.R.inc(6960);constructs.add(D);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    // Data stuff
    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6961);
        __CLR4_5_25b95b9lvickpjr.R.inc(6962);constructs.add(D);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6963);
        __CLR4_5_25b95b9lvickpjr.R.inc(6964);constructs.add(D);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6965);
        __CLR4_5_25b95b9lvickpjr.R.inc(6966);constructs.add(D);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6967);
        __CLR4_5_25b95b9lvickpjr.R.inc(6968);constructs.add(D);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6969);
        __CLR4_5_25b95b9lvickpjr.R.inc(6970);constructs.add(D);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    // class expressions
    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6971);
        __CLR4_5_25b95b9lvickpjr.R.inc(6972);constructs.add(AL);
        __CLR4_5_25b95b9lvickpjr.R.inc(6973);for (OWLClassExpression operands : ce.getOperands()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6974);operands.accept(this);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6975);
        __CLR4_5_25b95b9lvickpjr.R.inc(6976);constructs.add(U);
        __CLR4_5_25b95b9lvickpjr.R.inc(6977);for (OWLClassExpression operands : ce.getOperands()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6978);operands.accept(this);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    private static boolean isTop(OWLClassExpression classExpression) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6979);
        __CLR4_5_25b95b9lvickpjr.R.inc(6980);return classExpression.isOWLThing();
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    private boolean isAtomic(OWLClassExpression classExpression) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6981);
        __CLR4_5_25b95b9lvickpjr.R.inc(6982);if ((((classExpression.isAnonymous())&&(__CLR4_5_25b95b9lvickpjr.R.iget(6983)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6984)==0&false))) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6985);return false;
        } }else {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6986);for (OWLOntology ont : ontologies) {{
                __CLR4_5_25b95b9lvickpjr.R.inc(6987);if ((((!ont.getAxioms((OWLClass) classExpression, EXCLUDED)
                        .isEmpty())&&(__CLR4_5_25b95b9lvickpjr.R.iget(6988)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6989)==0&false))) {{
                    __CLR4_5_25b95b9lvickpjr.R.inc(6990);return false;
                }
            }}
            }__CLR4_5_25b95b9lvickpjr.R.inc(6991);return true;
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6992);
        __CLR4_5_25b95b9lvickpjr.R.inc(6993);if ((((isAtomic(ce))&&(__CLR4_5_25b95b9lvickpjr.R.iget(6994)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(6995)==0&false))) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6996);constructs.add(AL);
        } }else {{
            __CLR4_5_25b95b9lvickpjr.R.inc(6997);constructs.add(C);
        }
        }__CLR4_5_25b95b9lvickpjr.R.inc(6998);ce.getOperand().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(6999);
        __CLR4_5_25b95b9lvickpjr.R.inc(7000);if ((((isTop(ce.getFiller()))&&(__CLR4_5_25b95b9lvickpjr.R.iget(7001)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(7002)==0&false))) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7003);constructs.add(AL);
        } }else {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7004);constructs.add(E);
        }
        }__CLR4_5_25b95b9lvickpjr.R.inc(7005);ce.getProperty().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7006);ce.getFiller().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7007);
        __CLR4_5_25b95b9lvickpjr.R.inc(7008);constructs.add(AL);
        __CLR4_5_25b95b9lvickpjr.R.inc(7009);ce.getProperty().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7010);ce.getFiller().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7011);
        __CLR4_5_25b95b9lvickpjr.R.inc(7012);constructs.add(O);
        __CLR4_5_25b95b9lvickpjr.R.inc(7013);constructs.add(E);
        __CLR4_5_25b95b9lvickpjr.R.inc(7014);ce.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    private void checkCardinality(OWLDataCardinalityRestriction restriction) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7015);
        __CLR4_5_25b95b9lvickpjr.R.inc(7016);if ((((restriction.isQualified())&&(__CLR4_5_25b95b9lvickpjr.R.iget(7017)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(7018)==0&false))) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7019);constructs.add(Q);
        } }else {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7020);constructs.add(N);
        }
        }__CLR4_5_25b95b9lvickpjr.R.inc(7021);restriction.getFiller().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7022);restriction.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    private void checkCardinality(OWLObjectCardinalityRestriction restriction) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7023);
        __CLR4_5_25b95b9lvickpjr.R.inc(7024);if ((((restriction.isQualified())&&(__CLR4_5_25b95b9lvickpjr.R.iget(7025)!=0|true))||(__CLR4_5_25b95b9lvickpjr.R.iget(7026)==0&false))) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7027);constructs.add(Q);
        } }else {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7028);constructs.add(N);
        }
        }__CLR4_5_25b95b9lvickpjr.R.inc(7029);restriction.getFiller().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7030);restriction.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7031);
        __CLR4_5_25b95b9lvickpjr.R.inc(7032);checkCardinality(ce);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7033);
        __CLR4_5_25b95b9lvickpjr.R.inc(7034);checkCardinality(ce);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7035);
        __CLR4_5_25b95b9lvickpjr.R.inc(7036);checkCardinality(ce);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7037);
        __CLR4_5_25b95b9lvickpjr.R.inc(7038);ce.getProperty().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7039);constructs.add(R);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7040);
        __CLR4_5_25b95b9lvickpjr.R.inc(7041);constructs.add(U);
        __CLR4_5_25b95b9lvickpjr.R.inc(7042);constructs.add(O);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7043);
        __CLR4_5_25b95b9lvickpjr.R.inc(7044);constructs.add(E);
        __CLR4_5_25b95b9lvickpjr.R.inc(7045);ce.getFiller().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7046);ce.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7047);
        __CLR4_5_25b95b9lvickpjr.R.inc(7048);ce.getFiller().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7049);ce.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7050);
        __CLR4_5_25b95b9lvickpjr.R.inc(7051);constructs.add(D);
        __CLR4_5_25b95b9lvickpjr.R.inc(7052);ce.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7053);
        __CLR4_5_25b95b9lvickpjr.R.inc(7054);checkCardinality(ce);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7055);
        __CLR4_5_25b95b9lvickpjr.R.inc(7056);checkCardinality(ce);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7057);
        __CLR4_5_25b95b9lvickpjr.R.inc(7058);checkCardinality(ce);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    // Axioms
    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7059);
        __CLR4_5_25b95b9lvickpjr.R.inc(7060);axiom.getSubClass().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7061);axiom.getSuperClass().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7062);
        __CLR4_5_25b95b9lvickpjr.R.inc(7063);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7064);
        __CLR4_5_25b95b9lvickpjr.R.inc(7065);constructs.add(R);
        __CLR4_5_25b95b9lvickpjr.R.inc(7066);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7067);
        __CLR4_5_25b95b9lvickpjr.R.inc(7068);constructs.add(R);
        __CLR4_5_25b95b9lvickpjr.R.inc(7069);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7070);
        __CLR4_5_25b95b9lvickpjr.R.inc(7071);constructs.add(C);
        __CLR4_5_25b95b9lvickpjr.R.inc(7072);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7073);desc.accept(this);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7074);
        __CLR4_5_25b95b9lvickpjr.R.inc(7075);axiom.getDomain().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7076);constructs.add(AL);
        __CLR4_5_25b95b9lvickpjr.R.inc(7077);constructs.add(D);
        __CLR4_5_25b95b9lvickpjr.R.inc(7078);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7079);
        __CLR4_5_25b95b9lvickpjr.R.inc(7080);constructs.add(AL);
        __CLR4_5_25b95b9lvickpjr.R.inc(7081);axiom.getDomain().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7082);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7083);
        __CLR4_5_25b95b9lvickpjr.R.inc(7084);constructs.add(H);
        __CLR4_5_25b95b9lvickpjr.R.inc(7085);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7086);prop.accept(this);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7087);
        __CLR4_5_25b95b9lvickpjr.R.inc(7088);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7089);
        __CLR4_5_25b95b9lvickpjr.R.inc(7090);constructs.add(U);
        __CLR4_5_25b95b9lvickpjr.R.inc(7091);constructs.add(O);
        __CLR4_5_25b95b9lvickpjr.R.inc(7092);constructs.add(C);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7093);
        __CLR4_5_25b95b9lvickpjr.R.inc(7094);constructs.add(D);
        __CLR4_5_25b95b9lvickpjr.R.inc(7095);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7096);prop.accept(this);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7097);
        __CLR4_5_25b95b9lvickpjr.R.inc(7098);constructs.add(R);
        __CLR4_5_25b95b9lvickpjr.R.inc(7099);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7100);prop.accept(this);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7101);
        __CLR4_5_25b95b9lvickpjr.R.inc(7102);constructs.add(AL);
        __CLR4_5_25b95b9lvickpjr.R.inc(7103);axiom.getRange().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7104);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7105);
        __CLR4_5_25b95b9lvickpjr.R.inc(7106);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7107);
        __CLR4_5_25b95b9lvickpjr.R.inc(7108);constructs.add(F);
        __CLR4_5_25b95b9lvickpjr.R.inc(7109);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7110);
        __CLR4_5_25b95b9lvickpjr.R.inc(7111);constructs.add(H);
        __CLR4_5_25b95b9lvickpjr.R.inc(7112);axiom.getSubProperty().accept(this);
        __CLR4_5_25b95b9lvickpjr.R.inc(7113);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7114);
        __CLR4_5_25b95b9lvickpjr.R.inc(7115);constructs.add(U);
        __CLR4_5_25b95b9lvickpjr.R.inc(7116);constructs.add(C);
        __CLR4_5_25b95b9lvickpjr.R.inc(7117);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7118);desc.accept(this);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7119);
        __CLR4_5_25b95b9lvickpjr.R.inc(7120);constructs.add(I);
        __CLR4_5_25b95b9lvickpjr.R.inc(7121);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7122);
        __CLR4_5_25b95b9lvickpjr.R.inc(7123);constructs.add(AL);
        __CLR4_5_25b95b9lvickpjr.R.inc(7124);constructs.add(D);
        __CLR4_5_25b95b9lvickpjr.R.inc(7125);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7126);
        __CLR4_5_25b95b9lvickpjr.R.inc(7127);constructs.add(F);
        __CLR4_5_25b95b9lvickpjr.R.inc(7128);constructs.add(D);
        __CLR4_5_25b95b9lvickpjr.R.inc(7129);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7130);
        __CLR4_5_25b95b9lvickpjr.R.inc(7131);constructs.add(H);
        __CLR4_5_25b95b9lvickpjr.R.inc(7132);constructs.add(D);
        __CLR4_5_25b95b9lvickpjr.R.inc(7133);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7134);prop.accept(this);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7135);
        __CLR4_5_25b95b9lvickpjr.R.inc(7136);axiom.getClassExpression().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7137);
        __CLR4_5_25b95b9lvickpjr.R.inc(7138);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7139);desc.accept(this);
        }
    }}finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7140);
        __CLR4_5_25b95b9lvickpjr.R.inc(7141);constructs.add(D);
        __CLR4_5_25b95b9lvickpjr.R.inc(7142);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7143);
        __CLR4_5_25b95b9lvickpjr.R.inc(7144);constructs.add(TRAN);
        __CLR4_5_25b95b9lvickpjr.R.inc(7145);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7146);
        __CLR4_5_25b95b9lvickpjr.R.inc(7147);constructs.add(R);
        __CLR4_5_25b95b9lvickpjr.R.inc(7148);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7149);
        __CLR4_5_25b95b9lvickpjr.R.inc(7150);constructs.add(H);
        __CLR4_5_25b95b9lvickpjr.R.inc(7151);constructs.add(D);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7152);
        __CLR4_5_25b95b9lvickpjr.R.inc(7153);constructs.add(I);
        __CLR4_5_25b95b9lvickpjr.R.inc(7154);constructs.add(F);
        __CLR4_5_25b95b9lvickpjr.R.inc(7155);axiom.getProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7156);
        __CLR4_5_25b95b9lvickpjr.R.inc(7157);constructs.add(O);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7158);
        __CLR4_5_25b95b9lvickpjr.R.inc(7159);constructs.add(R);
        __CLR4_5_25b95b9lvickpjr.R.inc(7160);for (OWLObjectPropertyExpression prop : axiom.getPropertyChain()) {{
            __CLR4_5_25b95b9lvickpjr.R.inc(7161);prop.accept(this);
        }
        }__CLR4_5_25b95b9lvickpjr.R.inc(7162);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7163);
        __CLR4_5_25b95b9lvickpjr.R.inc(7164);constructs.add(I);
    }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

    /** Construct enum */
    public enum Construct {
        //@formatter:off
        /** AL */       AL("AL"),
        /** U */        U("U"),
        /** C */        C("C"),
        /** E */        E("E"),
        /** N */        N("N"),
        /** Q */        Q("Q"),
        /** H */        H("H"),
        /** I */        I("I"),
        /** O */        O("O"),
        /** F */        F("F"),
        /** TRAN */     TRAN("+"),
        /** D */        D("(D)"),
        /** R */        R("R"),
        /** S */        S("S"),
        /** EL */       EL("EL"),
        /** EL++ */     ELPLUSPLUS("EL++");
        //@formatter:on
        Construct(String s) {try{__CLR4_5_25b95b9lvickpjr.R.inc(7165);
            __CLR4_5_25b95b9lvickpjr.R.inc(7166);this.s = s;
        }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}

        private final String s;

        @Override
        public String toString() {try{__CLR4_5_25b95b9lvickpjr.R.inc(7167);
            __CLR4_5_25b95b9lvickpjr.R.inc(7168);return s;
        }finally{__CLR4_5_25b95b9lvickpjr.R.flushNeeded();}}
    }
}
