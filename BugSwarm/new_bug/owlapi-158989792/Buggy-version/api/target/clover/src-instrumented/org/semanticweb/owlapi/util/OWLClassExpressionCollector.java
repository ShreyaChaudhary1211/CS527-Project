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

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.SWRLAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLRule;

/**
 * Collects all of the nested class expression that are used in some OWLObject.
 * For example, given SubClassOf(ObjectUnionOf(D C) ObjectSomeValuesFrom(R F))
 * the collector could be used to obtain ObjectUnionOf(D C), D, C,
 * ObjectSomeValuesFrom(R F), F
 * 
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.1.0
 */
public class OWLClassExpressionCollector extends
        OWLObjectVisitorExAdapter<Set<OWLClassExpression>> {public static class __CLR4_5_27ua7ualvickqxf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,10275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * default constructor
     */
    public OWLClassExpressionCollector() {
        super(CollectionFactory.<OWLClassExpression> emptySet());__CLR4_5_27ua7ualvickqxf.R.inc(10163);try{__CLR4_5_27ua7ualvickqxf.R.inc(10162);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(SWRLClassAtom node) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10164);
        __CLR4_5_27ua7ualvickqxf.R.inc(10165);return node.getPredicate().accept(this);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10166);
        __CLR4_5_27ua7ualvickqxf.R.inc(10167);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10168);result.addAll(axiom.getSubClass().accept(this));
        __CLR4_5_27ua7ualvickqxf.R.inc(10169);result.addAll(axiom.getSuperClass().accept(this));
        __CLR4_5_27ua7ualvickqxf.R.inc(10170);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLOntology ontology) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10171);
        __CLR4_5_27ua7ualvickqxf.R.inc(10172);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10173);for (OWLAxiom ax : ontology.getLogicalAxioms()) {{
            __CLR4_5_27ua7ualvickqxf.R.inc(10174);result.addAll(ax.accept(this));
        }
        }__CLR4_5_27ua7ualvickqxf.R.inc(10175);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLClass ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10176);
        __CLR4_5_27ua7ualvickqxf.R.inc(10177);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10178);
        __CLR4_5_27ua7ualvickqxf.R.inc(10179);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10180);result.add(ce);
        __CLR4_5_27ua7ualvickqxf.R.inc(10181);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_27ua7ualvickqxf.R.inc(10182);result.addAll(op.accept(this));
        }
        }__CLR4_5_27ua7ualvickqxf.R.inc(10183);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectUnionOf ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10184);
        __CLR4_5_27ua7ualvickqxf.R.inc(10185);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10186);result.add(ce);
        __CLR4_5_27ua7ualvickqxf.R.inc(10187);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_27ua7ualvickqxf.R.inc(10188);result.addAll(op.accept(this));
        }
        }__CLR4_5_27ua7ualvickqxf.R.inc(10189);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectComplementOf ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10190);
        __CLR4_5_27ua7ualvickqxf.R.inc(10191);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10192);result.add(ce);
        __CLR4_5_27ua7ualvickqxf.R.inc(10193);result.addAll(ce.getOperand().accept(this));
        __CLR4_5_27ua7ualvickqxf.R.inc(10194);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10195);
        __CLR4_5_27ua7ualvickqxf.R.inc(10196);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10197);result.add(ce);
        __CLR4_5_27ua7ualvickqxf.R.inc(10198);result.addAll(ce.getFiller().accept(this));
        __CLR4_5_27ua7ualvickqxf.R.inc(10199);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10200);
        __CLR4_5_27ua7ualvickqxf.R.inc(10201);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10202);result.add(ce);
        __CLR4_5_27ua7ualvickqxf.R.inc(10203);result.addAll(ce.getFiller().accept(this));
        __CLR4_5_27ua7ualvickqxf.R.inc(10204);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10205);
        __CLR4_5_27ua7ualvickqxf.R.inc(10206);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10207);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
            __CLR4_5_27ua7ualvickqxf.R.inc(10208);result.addAll(ce.accept(this));
        }
        }__CLR4_5_27ua7ualvickqxf.R.inc(10209);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectHasValue ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10210);
        __CLR4_5_27ua7ualvickqxf.R.inc(10211);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10212);
        __CLR4_5_27ua7ualvickqxf.R.inc(10213);return axiom.getDomain().accept(this);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectMinCardinality ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10214);
        __CLR4_5_27ua7ualvickqxf.R.inc(10215);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10216);result.add(ce);
        __CLR4_5_27ua7ualvickqxf.R.inc(10217);result.addAll(ce.getFiller().accept(this));
        __CLR4_5_27ua7ualvickqxf.R.inc(10218);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10219);
        __CLR4_5_27ua7ualvickqxf.R.inc(10220);return axiom.getDomain().accept(this);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectExactCardinality ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10221);
        __CLR4_5_27ua7ualvickqxf.R.inc(10222);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10223);result.add(ce);
        __CLR4_5_27ua7ualvickqxf.R.inc(10224);result.addAll(ce.getFiller().accept(this));
        __CLR4_5_27ua7ualvickqxf.R.inc(10225);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10226);
        __CLR4_5_27ua7ualvickqxf.R.inc(10227);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10228);result.add(ce);
        __CLR4_5_27ua7ualvickqxf.R.inc(10229);result.addAll(ce.getFiller().accept(this));
        __CLR4_5_27ua7ualvickqxf.R.inc(10230);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectHasSelf ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10231);
        __CLR4_5_27ua7ualvickqxf.R.inc(10232);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectOneOf ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10233);
        __CLR4_5_27ua7ualvickqxf.R.inc(10234);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10235);
        __CLR4_5_27ua7ualvickqxf.R.inc(10236);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10237);
        __CLR4_5_27ua7ualvickqxf.R.inc(10238);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDataHasValue ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10239);
        __CLR4_5_27ua7ualvickqxf.R.inc(10240);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDataMinCardinality ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10241);
        __CLR4_5_27ua7ualvickqxf.R.inc(10242);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10243);
        __CLR4_5_27ua7ualvickqxf.R.inc(10244);return axiom.getRange().accept(this);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDataExactCardinality ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10245);
        __CLR4_5_27ua7ualvickqxf.R.inc(10246);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDataMaxCardinality ce) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10247);
        __CLR4_5_27ua7ualvickqxf.R.inc(10248);return toSet(ce);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10249);
        __CLR4_5_27ua7ualvickqxf.R.inc(10250);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10251);result.add(axiom.getOWLClass());
        __CLR4_5_27ua7ualvickqxf.R.inc(10252);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
            __CLR4_5_27ua7ualvickqxf.R.inc(10253);result.addAll(ce.accept(this));
        }
        }__CLR4_5_27ua7ualvickqxf.R.inc(10254);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10255);
        __CLR4_5_27ua7ualvickqxf.R.inc(10256);return axiom.getEntity().accept(this);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10257);
        __CLR4_5_27ua7ualvickqxf.R.inc(10258);return axiom.getClassExpression().accept(this);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10259);
        __CLR4_5_27ua7ualvickqxf.R.inc(10260);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10261);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
            __CLR4_5_27ua7ualvickqxf.R.inc(10262);result.addAll(ce.accept(this));
        }
        }__CLR4_5_27ua7ualvickqxf.R.inc(10263);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10264);
        __CLR4_5_27ua7ualvickqxf.R.inc(10265);return axiom.getClassExpression().accept(this);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> visit(SWRLRule rule) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10266);
        __CLR4_5_27ua7ualvickqxf.R.inc(10267);Set<OWLClassExpression> result = new HashSet<>();
        __CLR4_5_27ua7ualvickqxf.R.inc(10268);for (SWRLAtom atom : rule.getBody()) {{
            __CLR4_5_27ua7ualvickqxf.R.inc(10269);result.addAll(atom.accept(this));
        }
        }__CLR4_5_27ua7ualvickqxf.R.inc(10270);for (SWRLAtom atom : rule.getHead()) {{
            __CLR4_5_27ua7ualvickqxf.R.inc(10271);result.addAll(atom.accept(this));
        }
        }__CLR4_5_27ua7ualvickqxf.R.inc(10272);return result;
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}

    @Nonnull
    private static Set<OWLClassExpression> toSet(@Nonnull OWLClassExpression t) {try{__CLR4_5_27ua7ualvickqxf.R.inc(10273);
        __CLR4_5_27ua7ualvickqxf.R.inc(10274);return CollectionFactory.createSet(t);
    }finally{__CLR4_5_27ua7ualvickqxf.R.flushNeeded();}}
}
