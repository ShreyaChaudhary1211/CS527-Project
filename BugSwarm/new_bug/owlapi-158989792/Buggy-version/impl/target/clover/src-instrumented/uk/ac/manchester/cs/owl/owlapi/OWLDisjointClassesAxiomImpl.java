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
package uk.ac.manchester.cs.owl.owlapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLDisjointClassesAxiomImpl extends OWLNaryClassAxiomImpl implements OWLDisjointClassesAxiom {public static class __CLR4_5_24ca4calviclfqf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,5692,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * @param classExpressions
     *        disjoint classes
     * @param annotations
     *        annotations
     */
    public OWLDisjointClassesAxiomImpl(@Nonnull Set<? extends OWLClassExpression> classExpressions,
        @Nonnull Set<? extends OWLAnnotation> annotations) {
        super(classExpressions, annotations);__CLR4_5_24ca4calviclfqf.R.inc(5627);try{__CLR4_5_24ca4calviclfqf.R.inc(5626);
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointClassesAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_24ca4calviclfqf.R.inc(5628);
        __CLR4_5_24ca4calviclfqf.R.inc(5629);if ((((!isAnnotated())&&(__CLR4_5_24ca4calviclfqf.R.iget(5630)!=0|true))||(__CLR4_5_24ca4calviclfqf.R.iget(5631)==0&false))) {{
            __CLR4_5_24ca4calviclfqf.R.inc(5632);return this;
        }
        }__CLR4_5_24ca4calviclfqf.R.inc(5633);return new OWLDisjointClassesAxiomImpl(getClassExpressions(), NO_ANNOTATIONS);
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public OWLDisjointClassesAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {try{__CLR4_5_24ca4calviclfqf.R.inc(5634);
        __CLR4_5_24ca4calviclfqf.R.inc(5635);return new OWLDisjointClassesAxiomImpl(getClassExpressions(), mergeAnnos(annotations));
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_24ca4calviclfqf.R.inc(5636);
        __CLR4_5_24ca4calviclfqf.R.inc(5637);if ((((this == obj)&&(__CLR4_5_24ca4calviclfqf.R.iget(5638)!=0|true))||(__CLR4_5_24ca4calviclfqf.R.iget(5639)==0&false))) {{
            __CLR4_5_24ca4calviclfqf.R.inc(5640);return true;
        }
        }__CLR4_5_24ca4calviclfqf.R.inc(5641);if ((((!super.equals(obj))&&(__CLR4_5_24ca4calviclfqf.R.iget(5642)!=0|true))||(__CLR4_5_24ca4calviclfqf.R.iget(5643)==0&false))) {{
            __CLR4_5_24ca4calviclfqf.R.inc(5644);return false;
        }
        }__CLR4_5_24ca4calviclfqf.R.inc(5645);return obj instanceof OWLDisjointClassesAxiom;
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_24ca4calviclfqf.R.inc(5646);
        __CLR4_5_24ca4calviclfqf.R.inc(5647);visitor.visit(this);
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_24ca4calviclfqf.R.inc(5648);
        __CLR4_5_24ca4calviclfqf.R.inc(5649);visitor.visit(this);
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_24ca4calviclfqf.R.inc(5650);
        __CLR4_5_24ca4calviclfqf.R.inc(5651);return visitor.visit(this);
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_24ca4calviclfqf.R.inc(5652);
        __CLR4_5_24ca4calviclfqf.R.inc(5653);return visitor.visit(this);
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_24ca4calviclfqf.R.inc(5654);
        __CLR4_5_24ca4calviclfqf.R.inc(5655);return AxiomType.DISJOINT_CLASSES;
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public Set<OWLDisjointClassesAxiom> asPairwiseAxioms() {try{__CLR4_5_24ca4calviclfqf.R.inc(5656);
        __CLR4_5_24ca4calviclfqf.R.inc(5657);Set<OWLDisjointClassesAxiom> result = new HashSet<>();
        __CLR4_5_24ca4calviclfqf.R.inc(5658);List<OWLClassExpression> list = getClassExpressionsAsList();
        __CLR4_5_24ca4calviclfqf.R.inc(5659);for (int i = 0; (((i < list.size() - 1)&&(__CLR4_5_24ca4calviclfqf.R.iget(5660)!=0|true))||(__CLR4_5_24ca4calviclfqf.R.iget(5661)==0&false)); i++) {{
            __CLR4_5_24ca4calviclfqf.R.inc(5662);for (int j = i + 1; (((j < list.size())&&(__CLR4_5_24ca4calviclfqf.R.iget(5663)!=0|true))||(__CLR4_5_24ca4calviclfqf.R.iget(5664)==0&false)); j++) {{
                __CLR4_5_24ca4calviclfqf.R.inc(5665);result.add(new OWLDisjointClassesAxiomImpl(new HashSet<>(Arrays.asList(list.get(i), list.get(j))),
                    NO_ANNOTATIONS));
            }
        }}
        }__CLR4_5_24ca4calviclfqf.R.inc(5666);return result;
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public Set<OWLDisjointClassesAxiom> splitToAnnotatedPairs() {try{__CLR4_5_24ca4calviclfqf.R.inc(5667);
        __CLR4_5_24ca4calviclfqf.R.inc(5668);List<OWLClassExpression> ops = getClassExpressionsAsList();
        __CLR4_5_24ca4calviclfqf.R.inc(5669);if ((((ops.size() == 2)&&(__CLR4_5_24ca4calviclfqf.R.iget(5670)!=0|true))||(__CLR4_5_24ca4calviclfqf.R.iget(5671)==0&false))) {{
            __CLR4_5_24ca4calviclfqf.R.inc(5672);return Collections.<OWLDisjointClassesAxiom> singleton(this);
        }
        }__CLR4_5_24ca4calviclfqf.R.inc(5673);Set<OWLDisjointClassesAxiom> result = new HashSet<>();
        __CLR4_5_24ca4calviclfqf.R.inc(5674);for (int i = 0; (((i < ops.size() - 1)&&(__CLR4_5_24ca4calviclfqf.R.iget(5675)!=0|true))||(__CLR4_5_24ca4calviclfqf.R.iget(5676)==0&false)); i++) {{
            __CLR4_5_24ca4calviclfqf.R.inc(5677);OWLClassExpression indI = ops.get(i);
            __CLR4_5_24ca4calviclfqf.R.inc(5678);OWLClassExpression indJ = ops.get(i + 1);
            __CLR4_5_24ca4calviclfqf.R.inc(5679);result.add(new OWLDisjointClassesAxiomImpl(new HashSet<>(Arrays.asList(indI, indJ)), getAnnotations()));
        }
        }__CLR4_5_24ca4calviclfqf.R.inc(5680);return result;
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}

    @Override
    public Set<OWLSubClassOfAxiom> asOWLSubClassOfAxioms() {try{__CLR4_5_24ca4calviclfqf.R.inc(5681);
        __CLR4_5_24ca4calviclfqf.R.inc(5682);Set<OWLSubClassOfAxiom> result = new HashSet<>();
        __CLR4_5_24ca4calviclfqf.R.inc(5683);List<OWLClassExpression> list = getClassExpressionsAsList();
        __CLR4_5_24ca4calviclfqf.R.inc(5684);for (int i = 0; (((i < list.size() - 1)&&(__CLR4_5_24ca4calviclfqf.R.iget(5685)!=0|true))||(__CLR4_5_24ca4calviclfqf.R.iget(5686)==0&false)); i++) {{
            __CLR4_5_24ca4calviclfqf.R.inc(5687);for (int j = i + 1; (((j < list.size())&&(__CLR4_5_24ca4calviclfqf.R.iget(5688)!=0|true))||(__CLR4_5_24ca4calviclfqf.R.iget(5689)==0&false)); j++) {{
                __CLR4_5_24ca4calviclfqf.R.inc(5690);result.add(new OWLSubClassOfAxiomImpl(list.get(i), list.get(j).getObjectComplementOf(),
                    NO_ANNOTATIONS));
            }
        }}
        }__CLR4_5_24ca4calviclfqf.R.inc(5691);return result;
    }finally{__CLR4_5_24ca4calviclfqf.R.flushNeeded();}}
}
