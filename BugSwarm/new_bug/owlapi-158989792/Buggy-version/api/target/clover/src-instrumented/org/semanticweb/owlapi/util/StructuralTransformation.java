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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

/**
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 */
public class StructuralTransformation implements Serializable {public static class __CLR4_5_2bjtbjtlvicks6p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,15229,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    protected final OWLDataFactory df;
    private int nameCounter = 0;
    protected final Set<OWLEntity> signature = new HashSet<>();

    /**
     * @param dataFactory
     *        factory to use
     */
    public StructuralTransformation(@Nonnull OWLDataFactory dataFactory) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(14969);
        __CLR4_5_2bjtbjtlvicks6p.R.inc(14970);df = checkNotNull(dataFactory, "dataFactory cannot be null");
    }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

    @Nonnull
    protected OWLClass createNewName() {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(14971);
        __CLR4_5_2bjtbjtlvicks6p.R.inc(14972);OWLClass cls = df.getOWLClass(IRI.create("http://www.semanticweb.org/ontology#", "X" + nameCounter));
        __CLR4_5_2bjtbjtlvicks6p.R.inc(14973);nameCounter++;
        __CLR4_5_2bjtbjtlvicks6p.R.inc(14974);return cls;
    }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

    /**
     * @param axioms
     *        axioms to transform
     * @return transformed axioms
     */
    public Set<OWLAxiom> getTransformedAxioms(@Nonnull Set<OWLAxiom> axioms) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(14975);
        __CLR4_5_2bjtbjtlvicks6p.R.inc(14976);checkNotNull(axioms, "axioms cannot be null");
        __CLR4_5_2bjtbjtlvicks6p.R.inc(14977);signature.clear();
        __CLR4_5_2bjtbjtlvicks6p.R.inc(14978);for (OWLAxiom ax : axioms) {{
            __CLR4_5_2bjtbjtlvicks6p.R.inc(14979);signature.addAll(ax.getSignature());
        }
        }__CLR4_5_2bjtbjtlvicks6p.R.inc(14980);AxiomRewriter rewriter = new AxiomRewriter();
        __CLR4_5_2bjtbjtlvicks6p.R.inc(14981);Set<OWLAxiom> transformedAxioms = new HashSet<>();
        __CLR4_5_2bjtbjtlvicks6p.R.inc(14982);for (OWLAxiom ax : axioms) {{
            __CLR4_5_2bjtbjtlvicks6p.R.inc(14983);for (OWLAxiom transAx : ax.accept(rewriter)) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(14984);if ((((transAx instanceof OWLSubClassOfAxiom)&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(14985)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(14986)==0&false))) {{
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(14987);AxiomFlattener flattener = new AxiomFlattener(df, ((OWLSubClassOfAxiom) transAx).getSuperClass());
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(14988);Set<OWLAxiom> flattenedAxioms = flattener.getAxioms();
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(14989);if ((((!flattenedAxioms.isEmpty())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(14990)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(14991)==0&false))) {{
                        __CLR4_5_2bjtbjtlvicks6p.R.inc(14992);transformedAxioms.addAll(flattenedAxioms);
                    } }else {{
                        __CLR4_5_2bjtbjtlvicks6p.R.inc(14993);transformedAxioms.add(transAx);
                    }
                }} }else {{
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(14994);transformedAxioms.add(transAx);
                }
            }}
        }}
        }__CLR4_5_2bjtbjtlvicks6p.R.inc(14995);return transformedAxioms;
    }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

    private class AxiomFlattener implements OWLClassExpressionVisitorEx<OWLClassExpression> {

        private final OWLDataFactory ldf;
        private final Set<OWLAxiom> axioms = new HashSet<>();
        private final OWLClassExpression rhs;

        AxiomFlattener(OWLDataFactory df, OWLClassExpression rhs) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(14996);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(14997);ldf = df;
            __CLR4_5_2bjtbjtlvicks6p.R.inc(14998);this.rhs = rhs;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        private OWLSubClassOfAxiom getSCA(@Nonnull OWLClass lhs, @Nonnull OWLClassExpression ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(14999);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15000);return ldf.getOWLSubClassOfAxiom(lhs, ce);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        public Set<OWLAxiom> getAxioms() {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15001);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15002);axioms.clear();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15003);OWLClass lhs = ldf.getOWLThing();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15004);axioms.add(getSCA(lhs, rhs.accept(this)));
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15005);return axioms;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLClass ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15006);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15007);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15008);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15009);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLDataExactCardinality ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15010);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15011);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15012);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15013);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLDataMinCardinality ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15014);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15015);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15016);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15017);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLDataHasValue ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15018);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15019);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15020);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15021);if ((((signature.containsAll(ce.getFiller().getSignature()))&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15022)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15023)==0&false))) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15024);OWLClass name = createNewName();
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15025);axioms.add(getSCA(name, ce.getFiller().accept(this)));
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15026);return ldf.getOWLObjectAllValuesFrom(ce.getProperty(), name);
            } }else {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15027);return ce;
            }
        }}finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectComplementOf ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15028);
            // Should be a literal
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15029);if ((((ce.getOperand().isAnonymous())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15030)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15031)==0&false))) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15032);throw new IllegalStateException("Negation of arbitrary class expressions not allowed");
            }
            }__CLR4_5_2bjtbjtlvicks6p.R.inc(15033);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15034);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15035);if ((((signature.containsAll(ce.getFiller().getSignature()))&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15036)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15037)==0&false))) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15038);OWLClass name = createNewName();
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15039);axioms.add(getSCA(name, ce.getFiller().accept(this)));
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15040);return ldf.getOWLObjectExactCardinality(ce.getCardinality(), ce.getProperty(), name);
            } }else {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15041);return ce;
            }
        }}finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15042);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15043);OWLClass name = createNewName();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15044);for (OWLClassExpression op : ce.getOperands()) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15045);axioms.add(getSCA(name, op.accept(this)));
            }
            }__CLR4_5_2bjtbjtlvicks6p.R.inc(15046);return name;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15047);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15048);if ((((signature.containsAll(ce.getFiller().getSignature()))&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15049)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15050)==0&false))) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15051);OWLClass name = createNewName();
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15052);axioms.add(getSCA(name, ce.getFiller().accept(this)));
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15053);return ldf.getOWLObjectMaxCardinality(ce.getCardinality(), ce.getProperty(), name);
            } }else {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15054);return ce;
            }
        }}finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15055);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15056);if ((((signature.containsAll(ce.getFiller().getSignature()))&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15057)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15058)==0&false))) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15059);OWLClass name = createNewName();
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15060);axioms.add(getSCA(name, ce.getFiller().accept(this)));
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15061);return ldf.getOWLObjectMinCardinality(ce.getCardinality(), ce.getProperty(), name);
            } }else {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15062);return ce;
            }
        }}finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectOneOf ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15063);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15064);if ((((ce.getIndividuals().size() > 1)&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15065)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15066)==0&false))) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15067);throw new IllegalStateException("ObjectOneOf with more than one individual!");
            }
            }__CLR4_5_2bjtbjtlvicks6p.R.inc(15068);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectHasSelf ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15069);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15070);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15071);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15072);if ((((ce.getFiller().isAnonymous())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15073)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15074)==0&false))) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15075);OWLClass name = createNewName();
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15076);axioms.add(getSCA(name, ce.getFiller().accept(this)));
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15077);return ldf.getOWLObjectSomeValuesFrom(ce.getProperty(), name);
            } }else {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15078);return ce;
            }
        }}finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectUnionOf ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15079);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15080);Set<OWLClassExpression> descs = new HashSet<>();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15081);for (OWLClassExpression op : ce.getOperands()) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15082);OWLClassExpression flatOp = op.accept(this);
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15083);if ((((flatOp.isAnonymous() || signature.contains(flatOp.asOWLClass()))&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15084)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15085)==0&false))) {{
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15086);OWLClass name = createNewName();
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15087);descs.add(name);
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15088);axioms.add(ldf.getOWLSubClassOfAxiom(name, flatOp));
                } }else {{
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15089);descs.add(flatOp);
                }
            }}
            }__CLR4_5_2bjtbjtlvicks6p.R.inc(15090);return ldf.getOWLObjectUnionOf(descs);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public OWLClassExpression visit(OWLObjectHasValue ce) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15091);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15092);return ce;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}
    }

    /**
     * Rewrites axioms into GCIs.<br>
     * For example: SubClassOf(A, C) becomes SubClassOf(TOP, not(A) or C)
     */
    private class AxiomRewriter implements OWLAxiomVisitorEx<Set<OWLAxiom>> {

        AxiomRewriter() {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15093);}finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Nonnull
        private Set<OWLAxiom> subClassOf(@Nonnull OWLClassExpression sub, @Nonnull OWLClassExpression sup) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15094);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15095);return toSet(df.getOWLSubClassOfAxiom(df.getOWLThing(), df.getOWLObjectUnionOf(df.getOWLObjectComplementOf(
                sub), sup).getNNF()));
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Nonnull
        private Set<OWLAxiom> toSet(@Nonnull OWLAxiom ax) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15096);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15097);return CollectionFactory.createSet(ax);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15098);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15099);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15100);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15101);return subClassOf(df.getOWLObjectOneOf(axiom.getIndividual()), axiom.getClassExpression());
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15102);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15103);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15104);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15105);return subClassOf(df.getOWLDataSomeValuesFrom(axiom.getProperty(), df.getTopDatatype()), axiom.getDomain());
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15106);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15107);return toSet(df.getOWLSubClassOfAxiom(df.getOWLThing(), df.getOWLDataAllValuesFrom(axiom.getProperty(),
                axiom.getRange())));
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15108);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15109);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15110);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15111);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15112);
            // Explode into pairwise nominals?
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15113);Set<OWLAxiom> axioms = new HashSet<>();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15114);List<OWLIndividual> individuals = new ArrayList<>(axiom.getIndividuals());
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15115);for (int i = 0; (((i < individuals.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15116)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15117)==0&false)); i++) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15118);for (int j = i + 1; (((j < individuals.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15119)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15120)==0&false)); j++) {{
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15121);axioms.addAll(subClassOf(df.getOWLObjectOneOf(individuals.get(i)), df.getOWLObjectOneOf(individuals
                        .get(j))));
                }
            }}
            }__CLR4_5_2bjtbjtlvicks6p.R.inc(15122);return axioms;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15123);
            // Explode
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15124);return new HashSet<OWLAxiom>(axiom.asOWLSubClassOfAxioms());
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15125);
            // Explode
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15126);Set<OWLAxiom> axioms = new HashSet<>();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15127);List<OWLDataPropertyExpression> props = new ArrayList<>(axiom.getProperties());
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15128);for (int i = 0; (((i < props.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15129)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15130)==0&false)); i++) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15131);for (int j = i + 1; (((j < props.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15132)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15133)==0&false)); j++) {{
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15134);axioms.add(df.getOWLDisjointDataPropertiesAxiom(props.get(i), props.get(j)));
                }
            }}
            }__CLR4_5_2bjtbjtlvicks6p.R.inc(15135);return axioms;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15136);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15137);Set<OWLAxiom> axioms = new HashSet<>();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15138);List<OWLObjectPropertyExpression> props = new ArrayList<>(axiom.getProperties());
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15139);for (int i = 0; (((i < props.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15140)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15141)==0&false)); i++) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15142);for (int j = i + 1; (((j < props.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15143)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15144)==0&false)); j++) {{
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15145);axioms.add(df.getOWLDisjointObjectPropertiesAxiom(props.get(i), props.get(j)));
                }
            }}
            }__CLR4_5_2bjtbjtlvicks6p.R.inc(15146);return axioms;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15147);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15148);Set<OWLAxiom> axioms = new HashSet<>();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15149);axioms.addAll(df.getOWLEquivalentClassesAxiom(axiom.getOWLClass(), df.getOWLObjectUnionOf(axiom
                .getClassExpressions())).accept(this));
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15150);axioms.addAll(df.getOWLDisjointClassesAxiom(axiom.getClassExpressions()).accept(this));
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15151);return axioms;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15152);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15153);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15154);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15155);return new HashSet<OWLAxiom>(axiom.asOWLSubClassOfAxioms());
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15156);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15157);Set<OWLAxiom> axioms = new HashSet<>();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15158);List<OWLDataPropertyExpression> props = new ArrayList<>(axiom.getProperties());
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15159);for (int i = 0; (((i < props.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15160)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15161)==0&false)); i++) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15162);for (int j = i + 1; (((j < props.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15163)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15164)==0&false)); j++) {{
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15165);axioms.add(df.getOWLDisjointDataPropertiesAxiom(props.get(i), props.get(j)));
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15166);axioms.add(df.getOWLDisjointDataPropertiesAxiom(props.get(j), props.get(i)));
                }
            }}
            }__CLR4_5_2bjtbjtlvicks6p.R.inc(15167);return axioms;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15168);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15169);Set<OWLAxiom> axioms = new HashSet<>();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15170);List<OWLObjectPropertyExpression> props = new ArrayList<>(axiom.getProperties());
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15171);for (int i = 0; (((i < props.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15172)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15173)==0&false)); i++) {{
                __CLR4_5_2bjtbjtlvicks6p.R.inc(15174);for (int j = i + 1; (((j < props.size())&&(__CLR4_5_2bjtbjtlvicks6p.R.iget(15175)!=0|true))||(__CLR4_5_2bjtbjtlvicks6p.R.iget(15176)==0&false)); j++) {{
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15177);axioms.add(df.getOWLDisjointObjectPropertiesAxiom(props.get(i), props.get(j)));
                    __CLR4_5_2bjtbjtlvicks6p.R.inc(15178);axioms.add(df.getOWLDisjointObjectPropertiesAxiom(props.get(j), props.get(i)));
                }
            }}
            }__CLR4_5_2bjtbjtlvicks6p.R.inc(15179);return axioms;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15180);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15181);return toSet(df.getOWLSubClassOfAxiom(df.getOWLThing(), df.getOWLDataMaxCardinality(1, axiom
                .getProperty())));
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15182);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15183);return toSet(df.getOWLSubClassOfAxiom(df.getOWLThing(), df.getOWLObjectMaxCardinality(1, axiom
                .getProperty())));
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15184);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15185);return toSet(df.getOWLSubClassOfAxiom(df.getOWLThing(), df.getOWLObjectMaxCardinality(1, axiom.getProperty()
                .getInverseProperty())));
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15186);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15187);Set<OWLAxiom> axioms = new HashSet<>();
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15188);axioms.add(df.getOWLSubObjectPropertyOfAxiom(axiom.getFirstProperty(), axiom.getSecondProperty()
                .getInverseProperty()));
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15189);axioms.add(df.getOWLSubObjectPropertyOfAxiom(axiom.getSecondProperty(), axiom.getFirstProperty()
                .getInverseProperty()));
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15190);return axioms;
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15191);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15192);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15193);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15194);return subClassOf(df.getOWLObjectOneOf(axiom.getSubject()), df.getOWLDataAllValuesFrom(axiom.getProperty(),
                df.getOWLDataComplementOf(df.getOWLDataOneOf(axiom.getObject()))));
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15195);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15196);return subClassOf(df.getOWLObjectOneOf(axiom.getSubject()), df.getOWLObjectAllValuesFrom(axiom
                .getProperty(), df.getOWLObjectComplementOf(df.getOWLObjectOneOf(axiom.getObject()))));
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15197);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15198);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15199);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15200);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15201);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15202);return subClassOf(df.getOWLObjectSomeValuesFrom(axiom.getProperty(), df.getOWLThing()), axiom.getDomain());
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15203);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15204);return toSet(df.getOWLSubClassOfAxiom(df.getOWLThing(), df.getOWLObjectAllValuesFrom(axiom.getProperty(),
                axiom.getRange())));
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15205);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15206);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15207);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15208);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15209);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15210);return CollectionFactory.emptySet();
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15211);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15212);return subClassOf(axiom.getSubClass(), axiom.getSuperClass());
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15213);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15214);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15215);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15216);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(SWRLRule rule) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15217);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15218);return toSet(rule);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15219);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15220);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15221);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15222);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15223);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15224);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15225);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15226);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}

        @Override
        public Set<OWLAxiom> visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2bjtbjtlvicks6p.R.inc(15227);
            __CLR4_5_2bjtbjtlvicks6p.R.inc(15228);return toSet(axiom);
        }finally{__CLR4_5_2bjtbjtlvicks6p.R.flushNeeded();}}
    }
}
