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

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

/** Returns true if the visited axioms are an ontology in Horn-SHIQ form. */
public class HornAxiomVisitorEx extends OWLAxiomVisitorExAdapter<Boolean> {public static class __CLR4_5_26dc6dclvickq0c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,8365,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    static Boolean b(boolean b) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8256);
        __CLR4_5_26dc6dclvickq0c.R.inc(8257);return b;
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Nonnull
    private final PositiveAppearanceVisitorEx positive = new PositiveAppearanceVisitorEx();
    @Nonnull
    private final NegativeAppearanceVisitorEx negative = new NegativeAppearanceVisitorEx();

    protected boolean checkNegative(OWLClassExpression c) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8258);
        __CLR4_5_26dc6dclvickq0c.R.inc(8259);return c.accept(negative).booleanValue();
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    protected boolean checkPositive(OWLClassExpression c) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8260);
        __CLR4_5_26dc6dclvickq0c.R.inc(8261);return c.accept(positive).booleanValue();
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    /** default constructor */
    public HornAxiomVisitorEx() {
        super(b(false));__CLR4_5_26dc6dclvickq0c.R.inc(8263);try{__CLR4_5_26dc6dclvickq0c.R.inc(8262);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8264);
        __CLR4_5_26dc6dclvickq0c.R.inc(8265);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8266);
        __CLR4_5_26dc6dclvickq0c.R.inc(8267);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8268);
        __CLR4_5_26dc6dclvickq0c.R.inc(8269);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8270);
        __CLR4_5_26dc6dclvickq0c.R.inc(8271);return b(checkNegative(axiom.getSubClass()) && checkNegative(axiom.getSuperClass()));
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8272);
        __CLR4_5_26dc6dclvickq0c.R.inc(8273);for (OWLClassExpression c : axiom.getClassExpressions()) {{
            __CLR4_5_26dc6dclvickq0c.R.inc(8274);if ((((!checkNegative(c))&&(__CLR4_5_26dc6dclvickq0c.R.iget(8275)!=0|true))||(__CLR4_5_26dc6dclvickq0c.R.iget(8276)==0&false))) {{
                __CLR4_5_26dc6dclvickq0c.R.inc(8277);return b(false);
            }
        }}
        }__CLR4_5_26dc6dclvickq0c.R.inc(8278);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8279);
        __CLR4_5_26dc6dclvickq0c.R.inc(8280);return b(checkPositive(axiom.getDomain()));
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8281);
        __CLR4_5_26dc6dclvickq0c.R.inc(8282);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8283);
        __CLR4_5_26dc6dclvickq0c.R.inc(8284);return b(checkPositive(axiom.getRange()));
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8285);
        __CLR4_5_26dc6dclvickq0c.R.inc(8286);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8287);
        __CLR4_5_26dc6dclvickq0c.R.inc(8288);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8289);
        __CLR4_5_26dc6dclvickq0c.R.inc(8290);OWLClassExpression c1 = axiom.getOWLClass();
        __CLR4_5_26dc6dclvickq0c.R.inc(8291);if ((((!checkPositive(c1) || !checkNegative(c1))&&(__CLR4_5_26dc6dclvickq0c.R.iget(8292)!=0|true))||(__CLR4_5_26dc6dclvickq0c.R.iget(8293)==0&false))) {{
            __CLR4_5_26dc6dclvickq0c.R.inc(8294);return b(false);
        }
        }__CLR4_5_26dc6dclvickq0c.R.inc(8295);for (OWLClassExpression c : axiom.getClassExpressions()) {{
            __CLR4_5_26dc6dclvickq0c.R.inc(8296);if ((((!checkPositive(c) || !checkNegative(c))&&(__CLR4_5_26dc6dclvickq0c.R.iget(8297)!=0|true))||(__CLR4_5_26dc6dclvickq0c.R.iget(8298)==0&false))) {{
                __CLR4_5_26dc6dclvickq0c.R.inc(8299);return b(false);
            }
        }}
        }__CLR4_5_26dc6dclvickq0c.R.inc(8300);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8301);
        __CLR4_5_26dc6dclvickq0c.R.inc(8302);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8303);
        __CLR4_5_26dc6dclvickq0c.R.inc(8304);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8305);
        __CLR4_5_26dc6dclvickq0c.R.inc(8306);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8307);
        __CLR4_5_26dc6dclvickq0c.R.inc(8308);for (OWLClassExpression c : axiom.getClassExpressions()) {{
            __CLR4_5_26dc6dclvickq0c.R.inc(8309);if ((((!checkPositive(c) || !checkNegative(c))&&(__CLR4_5_26dc6dclvickq0c.R.iget(8310)!=0|true))||(__CLR4_5_26dc6dclvickq0c.R.iget(8311)==0&false))) {{
                __CLR4_5_26dc6dclvickq0c.R.inc(8312);return b(false);
            }
        }}
        }__CLR4_5_26dc6dclvickq0c.R.inc(8313);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8314);
        __CLR4_5_26dc6dclvickq0c.R.inc(8315);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8316);
        __CLR4_5_26dc6dclvickq0c.R.inc(8317);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    @Override
    public Boolean visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8318);
        __CLR4_5_26dc6dclvickq0c.R.inc(8319);return b(true);
    }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

    private class PositiveAppearanceVisitorEx extends OWLClassExpressionVisitorExAdapter<Boolean> {

        PositiveAppearanceVisitorEx() {
            super(b(false));__CLR4_5_26dc6dclvickq0c.R.inc(8321);try{__CLR4_5_26dc6dclvickq0c.R.inc(8320);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLClass ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8322);
            __CLR4_5_26dc6dclvickq0c.R.inc(8323);return b(true);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8324);
            __CLR4_5_26dc6dclvickq0c.R.inc(8325);for (OWLClassExpression c : ce.getOperands()) {{
                __CLR4_5_26dc6dclvickq0c.R.inc(8326);if ((((c.accept(this).equals(Boolean.FALSE))&&(__CLR4_5_26dc6dclvickq0c.R.iget(8327)!=0|true))||(__CLR4_5_26dc6dclvickq0c.R.iget(8328)==0&false))) {{
                    __CLR4_5_26dc6dclvickq0c.R.inc(8329);return b(false);
                }
            }}
            }__CLR4_5_26dc6dclvickq0c.R.inc(8330);return b(true);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectComplementOf ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8331);
            __CLR4_5_26dc6dclvickq0c.R.inc(8332);return b(checkNegative(ce.getOperand()));
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8333);
            __CLR4_5_26dc6dclvickq0c.R.inc(8334);return ce.getFiller().accept(this);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8335);
            __CLR4_5_26dc6dclvickq0c.R.inc(8336);return ce.getFiller().accept(this);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectMinCardinality ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8337);
            __CLR4_5_26dc6dclvickq0c.R.inc(8338);return ce.getFiller().accept(this);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectExactCardinality ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8339);
            __CLR4_5_26dc6dclvickq0c.R.inc(8340);return b(ce.getCardinality() <= 1 && ce.getFiller().accept(this).booleanValue() && checkNegative(ce
                .getFiller()));
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8341);
            __CLR4_5_26dc6dclvickq0c.R.inc(8342);return b(ce.getCardinality() <= 1 && checkNegative(ce.getFiller()));
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}
    }

    private class NegativeAppearanceVisitorEx extends OWLClassExpressionVisitorExAdapter<Boolean> {

        NegativeAppearanceVisitorEx() {
            super(b(false));__CLR4_5_26dc6dclvickq0c.R.inc(8344);try{__CLR4_5_26dc6dclvickq0c.R.inc(8343);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLClass ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8345);
            __CLR4_5_26dc6dclvickq0c.R.inc(8346);return b(true);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8347);
            __CLR4_5_26dc6dclvickq0c.R.inc(8348);for (OWLClassExpression c : ce.getOperands()) {{
                __CLR4_5_26dc6dclvickq0c.R.inc(8349);if ((((c.accept(this).equals(Boolean.FALSE))&&(__CLR4_5_26dc6dclvickq0c.R.iget(8350)!=0|true))||(__CLR4_5_26dc6dclvickq0c.R.iget(8351)==0&false))) {{
                    __CLR4_5_26dc6dclvickq0c.R.inc(8352);return b(false);
                }
            }}
            }__CLR4_5_26dc6dclvickq0c.R.inc(8353);return b(true);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectUnionOf ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8354);
            __CLR4_5_26dc6dclvickq0c.R.inc(8355);for (OWLClassExpression c : ce.getOperands()) {{
                __CLR4_5_26dc6dclvickq0c.R.inc(8356);if ((((c.accept(this).equals(Boolean.FALSE))&&(__CLR4_5_26dc6dclvickq0c.R.iget(8357)!=0|true))||(__CLR4_5_26dc6dclvickq0c.R.iget(8358)==0&false))) {{
                    __CLR4_5_26dc6dclvickq0c.R.inc(8359);return b(false);
                }
            }}
            }__CLR4_5_26dc6dclvickq0c.R.inc(8360);return b(true);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8361);
            __CLR4_5_26dc6dclvickq0c.R.inc(8362);return ce.getFiller().accept(this);
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}

        @Override
        public Boolean visit(OWLObjectMinCardinality ce) {try{__CLR4_5_26dc6dclvickq0c.R.inc(8363);
            __CLR4_5_26dc6dclvickq0c.R.inc(8364);return b(ce.getCardinality() <= 1 && ce.getFiller().accept(this).booleanValue());
        }finally{__CLR4_5_26dc6dclvickq0c.R.flushNeeded();}}
    }
}
