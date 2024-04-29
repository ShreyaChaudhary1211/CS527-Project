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
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.ToStringRenderer;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.HashCode;
import org.semanticweb.owlapi.util.OWLClassExpressionCollector;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class OWLObjectImplWithEntityAndAnonCaching implements OWLObject, Serializable {public static class __CLR4_5_26xv6xvlviclgbw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,9175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    /** a convenience reference for an empty annotation set, saves on typing. */
    @Nonnull
    protected static final Set<OWLAnnotation> NO_ANNOTATIONS = CollectionFactory.emptySet();
    static final OWLObjectTypeIndexProvider OWLOBJECT_TYPEINDEX_PROVIDER = new OWLObjectTypeIndexProvider();
    private int hashCode = 0;
    @Nullable
    private transient WeakReference<Set<OWLEntity>> signature = null;
    private transient WeakReference<Set<OWLAnonymousIndividual>> anons = null;
    @Nonnull
    protected static final OWLClass OWL_THING = new OWLClassImpl(OWLRDFVocabulary.OWL_THING.getIRI());

    private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {try{__CLR4_5_26xv6xvlviclgbw.R.inc(8995);
        __CLR4_5_26xv6xvlviclgbw.R.inc(8996);stream.defaultReadObject();
        __CLR4_5_26xv6xvlviclgbw.R.inc(8997);signature = null;
        __CLR4_5_26xv6xvlviclgbw.R.inc(8998);anons = null;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getSignature() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(8999);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9000);Set<OWLEntity> set = null;
        __CLR4_5_26xv6xvlviclgbw.R.inc(9001);if ((((signature != null)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9002)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9003)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9004);set = verifyNotNull(signature).get();
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9005);if ((((set == null)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9006)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9007)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9008);set = new HashSet<>();
            __CLR4_5_26xv6xvlviclgbw.R.inc(9009);Set<OWLAnonymousIndividual> anon = new HashSet<>();
            __CLR4_5_26xv6xvlviclgbw.R.inc(9010);OWLEntityCollectionContainerCollector collector = new OWLEntityCollectionContainerCollector(set, anon);
            __CLR4_5_26xv6xvlviclgbw.R.inc(9011);accept(collector);
            __CLR4_5_26xv6xvlviclgbw.R.inc(9012);signature = new WeakReference<>(set);
            __CLR4_5_26xv6xvlviclgbw.R.inc(9013);anons = new WeakReference<>(anon);
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9014);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(set);
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(@Nonnull OWLEntity owlEntity) {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9015);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9016);return getSignature().contains(owlEntity);
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9017);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9018);if ((((signature == null || verifyNotNull(signature).get() == null)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9019)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9020)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9021);getSignature();
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9022);return CollectionFactory.getCopyOnRequestSetFromImmutableCollection(anons.get());
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public Set<OWLClass> getClassesInSignature() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9023);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9024);Set<OWLClass> result = new HashSet<>();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9025);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9026);if ((((ent.isOWLClass())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9027)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9028)==0&false))) {{
                __CLR4_5_26xv6xvlviclgbw.R.inc(9029);result.add(ent.asOWLClass());
            }
        }}
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9030);return result;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public Set<OWLDataProperty> getDataPropertiesInSignature() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9031);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9032);Set<OWLDataProperty> result = new HashSet<>();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9033);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9034);if ((((ent.isOWLDataProperty())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9035)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9036)==0&false))) {{
                __CLR4_5_26xv6xvlviclgbw.R.inc(9037);result.add(ent.asOWLDataProperty());
            }
        }}
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9038);return result;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public Set<OWLObjectProperty> getObjectPropertiesInSignature() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9039);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9040);Set<OWLObjectProperty> result = new HashSet<>();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9041);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9042);if ((((ent.isOWLObjectProperty())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9043)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9044)==0&false))) {{
                __CLR4_5_26xv6xvlviclgbw.R.inc(9045);result.add(ent.asOWLObjectProperty());
            }
        }}
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9046);return result;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public Set<OWLNamedIndividual> getIndividualsInSignature() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9047);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9048);Set<OWLNamedIndividual> result = new HashSet<>();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9049);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9050);if ((((ent.isOWLNamedIndividual())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9051)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9052)==0&false))) {{
                __CLR4_5_26xv6xvlviclgbw.R.inc(9053);result.add(ent.asOWLNamedIndividual());
            }
        }}
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9054);return result;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public Set<OWLDatatype> getDatatypesInSignature() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9055);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9056);Set<OWLDatatype> result = new HashSet<>();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9057);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9058);if ((((ent.isOWLDatatype())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9059)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9060)==0&false))) {{
                __CLR4_5_26xv6xvlviclgbw.R.inc(9061);result.add(ent.asOWLDatatype());
            }
        }}
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9062);return result;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9063);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9064);Set<OWLAnnotationProperty> result = new HashSet<>();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9065);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9066);if ((((ent.isOWLAnnotationProperty())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9067)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9068)==0&false))) {{
                __CLR4_5_26xv6xvlviclgbw.R.inc(9069);result.add(ent.asOWLAnnotationProperty());
            }
        }}
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9070);return result;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> getNestedClassExpressions() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9071);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9072);OWLClassExpressionCollector collector = new OWLClassExpressionCollector();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9073);return accept(collector);
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9074);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9075);return obj == this || obj instanceof OWLObject;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9076);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9077);if ((((hashCode == 0)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9078)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9079)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9080);hashCode = HashCode.hashCode(this);
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9081);return hashCode;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    protected abstract int index();

    @Override
    public int compareTo(OWLObject o) {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9082);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9083);int thisTypeIndex = index();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9084);int otherTypeIndex = 0;
        __CLR4_5_26xv6xvlviclgbw.R.inc(9085);if ((((o instanceof OWLObjectImplWithEntityAndAnonCaching)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9086)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9087)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9088);otherTypeIndex = ((OWLObjectImplWithEntityAndAnonCaching) o).index();
        } }else {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9089);otherTypeIndex = OWLOBJECT_TYPEINDEX_PROVIDER.getTypeIndex(o);
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9090);int diff = thisTypeIndex - otherTypeIndex;
        __CLR4_5_26xv6xvlviclgbw.R.inc(9091);if ((((diff != 0)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9092)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9093)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9094);return diff;
        }
        // Objects are the same type
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9095);diff = compareObjectOfSameType(o);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9096);if ((((diff != 0)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9097)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9098)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9099);return diff;
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9100);if ((((this instanceof OWLAxiom)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9101)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9102)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9103);diff = compareLists(new ArrayList<>(((OWLAxiom) this).getAnnotations()), new ArrayList<>(((OWLAxiom) o)
                .getAnnotations()));
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9104);return diff;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    protected int compareAnnotations(List<OWLAnnotation> l1, List<OWLAnnotation> l2) {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9105);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9106);int i = 0;
        __CLR4_5_26xv6xvlviclgbw.R.inc(9107);for (; (((i < l1.size() && i < l2.size())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9108)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9109)==0&false)); i++) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9110);int diff = l1.get(i).compareTo(l2.get(i));
            __CLR4_5_26xv6xvlviclgbw.R.inc(9111);if ((((diff != 0)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9112)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9113)==0&false))) {{
                __CLR4_5_26xv6xvlviclgbw.R.inc(9114);return diff;
            }
        }}
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9115);if ((((i < l2.size())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9116)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9117)==0&false))) {{
            // l1 is shorter and a sublist of l2
            __CLR4_5_26xv6xvlviclgbw.R.inc(9118);return -1;
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9119);if ((((i < l1.size())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9120)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9121)==0&false))) {{
            // l2 is shorter and a sublist of l1
            __CLR4_5_26xv6xvlviclgbw.R.inc(9122);return 1;
        }
        // lists are identical
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9123);return 0;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    protected abstract int compareObjectOfSameType(@Nonnull OWLObject object);

    @Override
    @Nonnull
    public String toString() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9124);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9125);return ToStringRenderer.getInstance().getRendering(this);
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9126);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9127);return false;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    @Override
    public boolean isBottomEntity() {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9128);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9129);return false;
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    protected static int compareSets(Collection<? extends OWLObject> set1, Collection<? extends OWLObject> set2) {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9130);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9131);SortedSet<? extends OWLObject> ss1;
        __CLR4_5_26xv6xvlviclgbw.R.inc(9132);if ((((set1 instanceof SortedSet)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9133)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9134)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9135);ss1 = (SortedSet<? extends OWLObject>) set1;
        } }else {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9136);ss1 = new TreeSet<>(set1);
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9137);SortedSet<? extends OWLObject> ss2;
        __CLR4_5_26xv6xvlviclgbw.R.inc(9138);if ((((set2 instanceof SortedSet)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9139)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9140)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9141);ss2 = (SortedSet<? extends OWLObject>) set2;
        } }else {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9142);ss2 = new TreeSet<>(set2);
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9143);int i = 0;
        __CLR4_5_26xv6xvlviclgbw.R.inc(9144);Iterator<? extends OWLObject> thisIt = ss1.iterator();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9145);Iterator<? extends OWLObject> otherIt = ss2.iterator();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9146);while ((((i < ss1.size() && i < ss2.size())&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9147)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9148)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9149);OWLObject o1 = thisIt.next();
            __CLR4_5_26xv6xvlviclgbw.R.inc(9150);OWLObject o2 = otherIt.next();
            __CLR4_5_26xv6xvlviclgbw.R.inc(9151);int diff = o1.compareTo(o2);
            __CLR4_5_26xv6xvlviclgbw.R.inc(9152);if ((((diff != 0)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9153)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9154)==0&false))) {{
                __CLR4_5_26xv6xvlviclgbw.R.inc(9155);return diff;
            }
            }__CLR4_5_26xv6xvlviclgbw.R.inc(9156);i++;
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9157);return ss1.size() - ss2.size();
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}

    protected static int compareLists(List<? extends OWLObject> list1, List<? extends OWLObject> list2) {try{__CLR4_5_26xv6xvlviclgbw.R.inc(9158);
        __CLR4_5_26xv6xvlviclgbw.R.inc(9159);int i = 0;
        __CLR4_5_26xv6xvlviclgbw.R.inc(9160);int size = (((list1.size() < list2.size() )&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9161)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9162)==0&false))? list1.size() : list2.size();
        __CLR4_5_26xv6xvlviclgbw.R.inc(9163);while ((((i < size)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9164)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9165)==0&false))) {{
            __CLR4_5_26xv6xvlviclgbw.R.inc(9166);OWLObject o1 = list1.get(i);
            __CLR4_5_26xv6xvlviclgbw.R.inc(9167);OWLObject o2 = list2.get(i);
            __CLR4_5_26xv6xvlviclgbw.R.inc(9168);int diff = o1.compareTo(o2);
            __CLR4_5_26xv6xvlviclgbw.R.inc(9169);if ((((diff != 0)&&(__CLR4_5_26xv6xvlviclgbw.R.iget(9170)!=0|true))||(__CLR4_5_26xv6xvlviclgbw.R.iget(9171)==0&false))) {{
                __CLR4_5_26xv6xvlviclgbw.R.inc(9172);return diff;
            }
            }__CLR4_5_26xv6xvlviclgbw.R.inc(9173);i++;
        }
        }__CLR4_5_26xv6xvlviclgbw.R.inc(9174);return list1.size() - list2.size();
    }finally{__CLR4_5_26xv6xvlviclgbw.R.flushNeeded();}}
}
