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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLEquivalentClassesAxiomImpl extends OWLNaryClassAxiomImpl implements OWLEquivalentClassesAxiom {public static class __CLR4_5_24kd4kdlviclfrf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,6022,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nullable
    private transient WeakReference<Set<OWLClass>> namedClasses = null;

    private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5917);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5918);stream.defaultReadObject();
        __CLR4_5_24kd4kdlviclfrf.R.inc(5919);namedClasses = null;
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    /**
     * @param classExpressions
     *        equivalent classes
     * @param annotations
     *        annotations
     */
    public OWLEquivalentClassesAxiomImpl(@Nonnull Set<? extends OWLClassExpression> classExpressions,
        @Nonnull Collection<? extends OWLAnnotation> annotations) {
        super(classExpressions, annotations);__CLR4_5_24kd4kdlviclfrf.R.inc(5921);try{__CLR4_5_24kd4kdlviclfrf.R.inc(5920);
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public OWLEquivalentClassesAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5922);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5923);if ((((!isAnnotated())&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5924)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5925)==0&false))) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(5926);return this;
        }
        }__CLR4_5_24kd4kdlviclfrf.R.inc(5927);return new OWLEquivalentClassesAxiomImpl(getClassExpressions(), NO_ANNOTATIONS);
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public OWLEquivalentClassesAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5928);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5929);return new OWLEquivalentClassesAxiomImpl(getClassExpressions(), mergeAnnos(annotations));
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public Set<OWLEquivalentClassesAxiom> asPairwiseAxioms() {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5930);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5931);List<OWLClassExpression> classExpressions = new ArrayList<>(getClassExpressions());
        __CLR4_5_24kd4kdlviclfrf.R.inc(5932);Set<OWLEquivalentClassesAxiom> result = new HashSet<>();
        __CLR4_5_24kd4kdlviclfrf.R.inc(5933);for (int i = 0; (((i < classExpressions.size() - 1)&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5934)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5935)==0&false)); i++) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(5936);OWLClassExpression ceI = classExpressions.get(i);
            __CLR4_5_24kd4kdlviclfrf.R.inc(5937);OWLClassExpression ceJ = classExpressions.get(i + 1);
            __CLR4_5_24kd4kdlviclfrf.R.inc(5938);result.add(new OWLEquivalentClassesAxiomImpl(new HashSet<>(Arrays.asList(ceI, ceJ)), NO_ANNOTATIONS));
        }
        }__CLR4_5_24kd4kdlviclfrf.R.inc(5939);return result;
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public Set<OWLEquivalentClassesAxiom> splitToAnnotatedPairs() {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5940);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5941);List<OWLClassExpression> individuals = new ArrayList<>(getClassExpressions());
        __CLR4_5_24kd4kdlviclfrf.R.inc(5942);if ((((individuals.size() == 2)&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5943)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5944)==0&false))) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(5945);return Collections.<OWLEquivalentClassesAxiom> singleton(this);
        }
        }__CLR4_5_24kd4kdlviclfrf.R.inc(5946);Set<OWLEquivalentClassesAxiom> result = new HashSet<>();
        __CLR4_5_24kd4kdlviclfrf.R.inc(5947);for (int i = 0; (((i < individuals.size() - 1)&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5948)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5949)==0&false)); i++) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(5950);OWLClassExpression indI = individuals.get(i);
            __CLR4_5_24kd4kdlviclfrf.R.inc(5951);OWLClassExpression indJ = individuals.get(i + 1);
            __CLR4_5_24kd4kdlviclfrf.R.inc(5952);result.add(new OWLEquivalentClassesAxiomImpl(new HashSet<>(Arrays.asList(indI, indJ)), getAnnotations()));
        }
        }__CLR4_5_24kd4kdlviclfrf.R.inc(5953);return result;
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public boolean containsNamedEquivalentClass() {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5954);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5955);return !getNamedClasses().isEmpty();
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public boolean containsOWLNothing() {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5956);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5957);for (OWLClassExpression desc : getClassExpressions()) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(5958);if ((((desc.isOWLNothing())&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5959)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5960)==0&false))) {{
                __CLR4_5_24kd4kdlviclfrf.R.inc(5961);return true;
            }
        }}
        }__CLR4_5_24kd4kdlviclfrf.R.inc(5962);return false;
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public boolean containsOWLThing() {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5963);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5964);for (OWLClassExpression desc : getClassExpressions()) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(5965);if ((((desc.isOWLThing())&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5966)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5967)==0&false))) {{
                __CLR4_5_24kd4kdlviclfrf.R.inc(5968);return true;
            }
        }}
        }__CLR4_5_24kd4kdlviclfrf.R.inc(5969);return false;
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public Set<OWLClass> getNamedClasses() {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5970);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5971);Set<OWLClass> toReturn = null;
        __CLR4_5_24kd4kdlviclfrf.R.inc(5972);if ((((namedClasses != null)&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5973)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5974)==0&false))) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(5975);toReturn = verifyNotNull(namedClasses).get();
        }
        }__CLR4_5_24kd4kdlviclfrf.R.inc(5976);if ((((toReturn == null)&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5977)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5978)==0&false))) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(5979);Set<OWLClass> clses = new HashSet<>(1);
            __CLR4_5_24kd4kdlviclfrf.R.inc(5980);for (OWLClassExpression desc : getClassExpressions()) {{
                __CLR4_5_24kd4kdlviclfrf.R.inc(5981);if ((((!desc.isAnonymous() && !desc.isOWLNothing() && !desc.isOWLThing())&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5982)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5983)==0&false))) {{
                    __CLR4_5_24kd4kdlviclfrf.R.inc(5984);clses.add(desc.asOWLClass());
                }
            }}
            }__CLR4_5_24kd4kdlviclfrf.R.inc(5985);toReturn = CollectionFactory.getCopyOnRequestSetFromImmutableCollection(clses);
            __CLR4_5_24kd4kdlviclfrf.R.inc(5986);namedClasses = new WeakReference<>(toReturn);
        }
        }__CLR4_5_24kd4kdlviclfrf.R.inc(5987);return toReturn;
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public Set<OWLSubClassOfAxiom> asOWLSubClassOfAxioms() {try{__CLR4_5_24kd4kdlviclfrf.R.inc(5988);
        __CLR4_5_24kd4kdlviclfrf.R.inc(5989);Set<OWLSubClassOfAxiom> result = new HashSet<>();
        __CLR4_5_24kd4kdlviclfrf.R.inc(5990);List<OWLClassExpression> classExpressions = new ArrayList<>(getClassExpressions());
        __CLR4_5_24kd4kdlviclfrf.R.inc(5991);for (int i = 0; (((i < classExpressions.size())&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5992)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5993)==0&false)); i++) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(5994);for (int j = 0; (((j < classExpressions.size())&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5995)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5996)==0&false)); j++) {{
                __CLR4_5_24kd4kdlviclfrf.R.inc(5997);if ((((i != j)&&(__CLR4_5_24kd4kdlviclfrf.R.iget(5998)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(5999)==0&false))) {{
                    __CLR4_5_24kd4kdlviclfrf.R.inc(6000);result.add(new OWLSubClassOfAxiomImpl(classExpressions.get(i), classExpressions.get(j),
                        NO_ANNOTATIONS));
                }
            }}
        }}
        }__CLR4_5_24kd4kdlviclfrf.R.inc(6001);return result;
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_24kd4kdlviclfrf.R.inc(6002);
        __CLR4_5_24kd4kdlviclfrf.R.inc(6003);if ((((this == obj)&&(__CLR4_5_24kd4kdlviclfrf.R.iget(6004)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(6005)==0&false))) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(6006);return true;
        }
        }__CLR4_5_24kd4kdlviclfrf.R.inc(6007);if ((((!super.equals(obj))&&(__CLR4_5_24kd4kdlviclfrf.R.iget(6008)!=0|true))||(__CLR4_5_24kd4kdlviclfrf.R.iget(6009)==0&false))) {{
            __CLR4_5_24kd4kdlviclfrf.R.inc(6010);return false;
        }
        }__CLR4_5_24kd4kdlviclfrf.R.inc(6011);return obj instanceof OWLEquivalentClassesAxiom;
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_24kd4kdlviclfrf.R.inc(6012);
        __CLR4_5_24kd4kdlviclfrf.R.inc(6013);visitor.visit(this);
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_24kd4kdlviclfrf.R.inc(6014);
        __CLR4_5_24kd4kdlviclfrf.R.inc(6015);visitor.visit(this);
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_24kd4kdlviclfrf.R.inc(6016);
        __CLR4_5_24kd4kdlviclfrf.R.inc(6017);return visitor.visit(this);
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_24kd4kdlviclfrf.R.inc(6018);
        __CLR4_5_24kd4kdlviclfrf.R.inc(6019);return visitor.visit(this);
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_24kd4kdlviclfrf.R.inc(6020);
        __CLR4_5_24kd4kdlviclfrf.R.inc(6021);return AxiomType.EQUIVALENT_CLASSES;
    }finally{__CLR4_5_24kd4kdlviclfrf.R.flushNeeded();}}
}
