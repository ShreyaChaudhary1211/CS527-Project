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

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.1.0
 */
public class MaximumModalDepthFinder extends OWLObjectVisitorExAdapter<Integer> {public static class __CLR4_5_26ms6mslvickqcf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,8681,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    static Integer i(int b) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8596);
        __CLR4_5_26ms6mslvickqcf.R.inc(8597);return b;
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Nonnull
    private static final Integer _1 = i(1);

    /** default constructor, setting default value to 0 */
    public MaximumModalDepthFinder() {
        super(0);__CLR4_5_26ms6mslvickqcf.R.inc(8599);try{__CLR4_5_26ms6mslvickqcf.R.inc(8598);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8600);
        __CLR4_5_26ms6mslvickqcf.R.inc(8601);int subClassModalDepth = axiom.getSubClass().accept(this).intValue();
        __CLR4_5_26ms6mslvickqcf.R.inc(8602);int superClassModalDepth = axiom.getSuperClass().accept(this).intValue();
        __CLR4_5_26ms6mslvickqcf.R.inc(8603);return i(Math.max(subClassModalDepth, superClassModalDepth));
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLOntology ontology) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8604);
        __CLR4_5_26ms6mslvickqcf.R.inc(8605);int max = 0;
        __CLR4_5_26ms6mslvickqcf.R.inc(8606);for (OWLAxiom axiom : ontology.getLogicalAxioms()) {{
            __CLR4_5_26ms6mslvickqcf.R.inc(8607);int depth = axiom.accept(this).intValue();
            __CLR4_5_26ms6mslvickqcf.R.inc(8608);if ((((depth > max)&&(__CLR4_5_26ms6mslvickqcf.R.iget(8609)!=0|true))||(__CLR4_5_26ms6mslvickqcf.R.iget(8610)==0&false))) {{
                __CLR4_5_26ms6mslvickqcf.R.inc(8611);max = depth;
            }
        }}
        }__CLR4_5_26ms6mslvickqcf.R.inc(8612);return i(max);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8613);
        __CLR4_5_26ms6mslvickqcf.R.inc(8614);int max = 0;
        __CLR4_5_26ms6mslvickqcf.R.inc(8615);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_26ms6mslvickqcf.R.inc(8616);int depth = op.accept(this).intValue();
            __CLR4_5_26ms6mslvickqcf.R.inc(8617);if ((((depth > max)&&(__CLR4_5_26ms6mslvickqcf.R.iget(8618)!=0|true))||(__CLR4_5_26ms6mslvickqcf.R.iget(8619)==0&false))) {{
                __CLR4_5_26ms6mslvickqcf.R.inc(8620);max = depth;
            }
        }}
        }__CLR4_5_26ms6mslvickqcf.R.inc(8621);return i(max);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectUnionOf ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8622);
        __CLR4_5_26ms6mslvickqcf.R.inc(8623);int max = 0;
        __CLR4_5_26ms6mslvickqcf.R.inc(8624);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_26ms6mslvickqcf.R.inc(8625);int depth = op.accept(this).intValue();
            __CLR4_5_26ms6mslvickqcf.R.inc(8626);if ((((depth > max)&&(__CLR4_5_26ms6mslvickqcf.R.iget(8627)!=0|true))||(__CLR4_5_26ms6mslvickqcf.R.iget(8628)==0&false))) {{
                __CLR4_5_26ms6mslvickqcf.R.inc(8629);max = depth;
            }
        }}
        }__CLR4_5_26ms6mslvickqcf.R.inc(8630);return i(max);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectComplementOf ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8631);
        __CLR4_5_26ms6mslvickqcf.R.inc(8632);return ce.getOperand().accept(this);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8633);
        __CLR4_5_26ms6mslvickqcf.R.inc(8634);return i(1 + ce.getFiller().accept(this).intValue());
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8635);
        __CLR4_5_26ms6mslvickqcf.R.inc(8636);return i(1 + ce.getFiller().accept(this).intValue());
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8637);
        __CLR4_5_26ms6mslvickqcf.R.inc(8638);int max = 0;
        __CLR4_5_26ms6mslvickqcf.R.inc(8639);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
            __CLR4_5_26ms6mslvickqcf.R.inc(8640);int depth = ce.accept(this).intValue();
            __CLR4_5_26ms6mslvickqcf.R.inc(8641);if ((((depth > max)&&(__CLR4_5_26ms6mslvickqcf.R.iget(8642)!=0|true))||(__CLR4_5_26ms6mslvickqcf.R.iget(8643)==0&false))) {{
                __CLR4_5_26ms6mslvickqcf.R.inc(8644);max = depth;
            }
        }}
        }__CLR4_5_26ms6mslvickqcf.R.inc(8645);return i(max);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8646);
        __CLR4_5_26ms6mslvickqcf.R.inc(8647);return axiom.getDomain().accept(this);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectMinCardinality ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8648);
        __CLR4_5_26ms6mslvickqcf.R.inc(8649);return i(1 + ce.getFiller().accept(this).intValue());
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8650);
        __CLR4_5_26ms6mslvickqcf.R.inc(8651);return axiom.getDomain().accept(this);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectExactCardinality ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8652);
        __CLR4_5_26ms6mslvickqcf.R.inc(8653);return i(1 + ce.getFiller().accept(this).intValue());
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8654);
        __CLR4_5_26ms6mslvickqcf.R.inc(8655);return i(1 + ce.getFiller().accept(this).intValue());
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLObjectHasSelf ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8656);
        __CLR4_5_26ms6mslvickqcf.R.inc(8657);return _1;
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8658);
        __CLR4_5_26ms6mslvickqcf.R.inc(8659);return _1;
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8660);
        __CLR4_5_26ms6mslvickqcf.R.inc(8661);return _1;
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLDataHasValue ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8662);
        __CLR4_5_26ms6mslvickqcf.R.inc(8663);return _1;
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLDataMinCardinality ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8664);
        __CLR4_5_26ms6mslvickqcf.R.inc(8665);return _1;
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLDataExactCardinality ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8666);
        __CLR4_5_26ms6mslvickqcf.R.inc(8667);return _1;
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLDataMaxCardinality ce) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8668);
        __CLR4_5_26ms6mslvickqcf.R.inc(8669);return _1;
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8670);
        __CLR4_5_26ms6mslvickqcf.R.inc(8671);return axiom.getClassExpression().accept(this);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}

    @Override
    public Integer visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_26ms6mslvickqcf.R.inc(8672);
        __CLR4_5_26ms6mslvickqcf.R.inc(8673);int max = 0;
        __CLR4_5_26ms6mslvickqcf.R.inc(8674);for (OWLClassExpression ce : axiom.getClassExpressions()) {{
            __CLR4_5_26ms6mslvickqcf.R.inc(8675);int depth = ce.accept(this).intValue();
            __CLR4_5_26ms6mslvickqcf.R.inc(8676);if ((((depth > max)&&(__CLR4_5_26ms6mslvickqcf.R.iget(8677)!=0|true))||(__CLR4_5_26ms6mslvickqcf.R.iget(8678)==0&false))) {{
                __CLR4_5_26ms6mslvickqcf.R.inc(8679);max = depth;
            }
        }}
        }__CLR4_5_26ms6mslvickqcf.R.inc(8680);return i(max);
    }finally{__CLR4_5_26ms6mslvickqcf.R.flushNeeded();}}
}
