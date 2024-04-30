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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.semanticweb.owlapi.model.*;

/**
 * A utility class that visits axioms, class expressions etc. and accumulates
 * the anonymous individuals objects that are referred to in those axioms, class
 * expressions etc.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group, Date: 13-Nov-2006
 */
public class OWLAnonymousIndividualsWithMultipleOccurrences implements OWLObjectVisitor, SWRLObjectVisitor,
    IndividualAppearance {public static class __CLR4_5_27hj7hjlvickqu4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,9990,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Set<OWLObject> singleAppearance = new HashSet<>();
    private Set<OWLObject> multipleAppearances = new HashSet<>();

    // ////////////////////////////////////////////////////////////////////////////////////////////
    //
    // Axiom Visitor stuff
    //
    // ////////////////////////////////////////////////////////////////////////////////////////////
    protected void processAxiomAnnotations(OWLAxiom ax) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9703);
        // default behavior: iterate over the annotations outside the axiom
        __CLR4_5_27hj7hjlvickqu4.R.inc(9704);for (OWLAnnotation anno : ax.getAnnotations()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9705);anno.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public boolean appearsMultipleTimes(OWLAnonymousIndividual i) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9706);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9707);return multipleAppearances.contains(i);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9708);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9709);axiom.getSubClass().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9710);axiom.getSuperClass().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9711);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9712);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9713);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9714);axiom.getObject().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9715);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9716);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9717);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9718);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9719);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9720);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9721);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9722);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9723);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9724);desc.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9725);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9726);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9727);axiom.getDomain().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9728);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9729);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9730);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9731);axiom.getDomain().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9732);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9733);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9734);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9735);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9736);prop.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9737);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9738);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9739);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9740);axiom.getObject().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9741);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9742);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9743);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9744);ind.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9745);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9746);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9747);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9748);prop.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9749);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9750);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9751);for (OWLObjectPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9752);prop.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9753);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9754);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9755);axiom.getRange().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9756);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9757);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9758);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9759);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9760);axiom.getSubject().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9761);axiom.getObject().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9762);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9763);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9764);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9765);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9766);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9767);axiom.getSubProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9768);axiom.getSuperProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9769);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9770);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9771);axiom.getOWLClass().accept((OWLEntityVisitor) this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9772);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9773);desc.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9774);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9775);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9776);axiom.getEntity().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9777);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9778);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9779);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9780);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9781);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9782);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9783);axiom.getRange().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9784);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9785);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9786);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9787);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9788);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9789);for (OWLDataPropertyExpression prop : axiom.getProperties()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9790);prop.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9791);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9792);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9793);axiom.getClassExpression().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9794);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9795);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9796);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9797);desc.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9798);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9799);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9800);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9801);axiom.getObject().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9802);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9803);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9804);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9805);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9806);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9807);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9808);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9809);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9810);axiom.getSubProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9811);axiom.getSuperProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9812);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9813);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9814);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9815);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9816);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9817);for (OWLIndividual ind : axiom.getIndividuals()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9818);ind.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9819);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9820);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9821);for (OWLObjectPropertyExpression prop : axiom.getPropertyChain()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9822);prop.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9823);axiom.getSuperProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9824);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9825);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9826);axiom.getFirstProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9827);axiom.getSecondProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9828);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9829);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9830);axiom.getClassExpression().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9831);for (OWLPropertyExpression prop : axiom.getPropertyExpressions()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9832);prop.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9833);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    // //////////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // OWLClassExpressionVisitor
    //
    // //////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void visit(OWLClass desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9834);}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9835);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9836);for (OWLClassExpression operand : desc.getOperands()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9837);operand.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9838);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9839);for (OWLClassExpression operand : desc.getOperands()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9840);operand.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9841);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9842);desc.getOperand().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9843);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9844);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9845);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9846);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9847);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9848);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9849);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9850);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9851);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9852);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9853);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9854);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9855);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9856);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9857);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9858);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9859);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9860);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9861);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9862);desc.getProperty().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9863);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9864);for (OWLIndividual ind : desc.getIndividuals()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9865);ind.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9866);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9867);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9868);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9869);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9870);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9871);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9872);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9873);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9874);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9875);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9876);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9877);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9878);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9879);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9880);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality desc) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9881);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9882);desc.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9883);desc.getFiller().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // Data visitor
    //
    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9884);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9885);node.getDataRange().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9886);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9887);for (OWLLiteral val : node.getValues()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9888);val.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9889);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9890);for (OWLDataRange dr : node.getOperands()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9891);dr.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9892);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9893);for (OWLDataRange dr : node.getOperands()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9894);dr.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9895);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9896);node.getDatatype().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9897);for (OWLFacetRestriction facetRestriction : node.getFacetRestrictions()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9898);facetRestriction.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9899);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9900);node.getFacetValue().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9901);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9902);node.getDatatype().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // Property expression visitor
    //
    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void visit(OWLObjectInverseOf expression) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9903);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9904);expression.getInverse().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // Entity visitor
    //
    // ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9905);}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9906);}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9907);}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype datatype) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9908);}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation annotation) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9909);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9910);annotation.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9911);annotation.getValue().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9912);for (OWLAnnotation anno : annotation.getAnnotations()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9913);anno.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9914);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9915);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9916);axiom.getValue().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9917);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9918);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9919);checkAppearance(individual);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9920);}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9921);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9922);checkOccurrence(ontology.getAnnotations());
        __CLR4_5_27hj7hjlvickqu4.R.inc(9923);for (AxiomType<?> t : AxiomType.AXIOM_TYPES) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9924);for (OWLAxiom ax : ontology.getAxioms(t)) {{
                __CLR4_5_27hj7hjlvickqu4.R.inc(9925);checkOccurrence(ax.getAnnotations());
                __CLR4_5_27hj7hjlvickqu4.R.inc(9926);ax.accept(this);
            }
        }}
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9927);singleAppearance.clear();
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    private void checkOccurrence(Collection<OWLAnnotation> c) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9928);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9929);for (OWLAnnotation a : c) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9930);if ((((a.getValue() instanceof OWLAnonymousIndividual)&&(__CLR4_5_27hj7hjlvickqu4.R.iget(9931)!=0|true))||(__CLR4_5_27hj7hjlvickqu4.R.iget(9932)==0&false))) {{
                __CLR4_5_27hj7hjlvickqu4.R.inc(9933);checkAppearance((OWLAnonymousIndividual) a.getValue());
            }
        }}
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    protected void checkAppearance(OWLAnonymousIndividual a) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9934);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9935);if ((((!multipleAppearances.contains(a))&&(__CLR4_5_27hj7hjlvickqu4.R.iget(9936)!=0|true))||(__CLR4_5_27hj7hjlvickqu4.R.iget(9937)==0&false))) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9938);if ((((!singleAppearance.add(a))&&(__CLR4_5_27hj7hjlvickqu4.R.iget(9939)!=0|true))||(__CLR4_5_27hj7hjlvickqu4.R.iget(9940)==0&false))) {{
                // already seen, move it
                __CLR4_5_27hj7hjlvickqu4.R.inc(9941);singleAppearance.remove(a);
                __CLR4_5_27hj7hjlvickqu4.R.inc(9942);multipleAppearances.add(a);
            }
        }}
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9943);}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9944);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9945);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9946);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9947);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9948);axiom.getProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9949);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9950);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9951);axiom.getSubProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9952);axiom.getSuperProperty().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9953);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9954);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9955);axiom.getDatatype().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9956);axiom.getDataRange().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9957);processAxiomAnnotations(axiom);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // SWRL Object Visitor
    //
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9958);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9959);for (SWRLAtom atom : rule.getBody()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9960);atom.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9961);for (SWRLAtom atom : rule.getHead()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9962);atom.accept(this);
        }
        }__CLR4_5_27hj7hjlvickqu4.R.inc(9963);processAxiomAnnotations(rule);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9964);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9965);node.getArgument().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9966);node.getPredicate().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9967);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9968);node.getArgument().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9969);node.getPredicate().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9970);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9971);node.getPredicate().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9972);node.getFirstArgument().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9973);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9974);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9975);node.getPredicate().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9976);node.getFirstArgument().accept(this);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9977);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9978);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9979);for (SWRLArgument obj : node.getAllArguments()) {{
            __CLR4_5_27hj7hjlvickqu4.R.inc(9980);obj.accept(this);
        }
    }}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9981);}finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9982);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9983);node.getIndividual().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9984);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9985);node.getLiteral().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9986);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9987);node.getFirstArgument().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_27hj7hjlvickqu4.R.inc(9988);
        __CLR4_5_27hj7hjlvickqu4.R.inc(9989);node.getSecondArgument().accept(this);
    }finally{__CLR4_5_27hj7hjlvickqu4.R.flushNeeded();}}
}
