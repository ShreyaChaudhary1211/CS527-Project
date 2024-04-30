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

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

import javax.annotation.Nonnull;

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
public abstract class OWLObjectImplWithoutEntityAndAnonCaching implements OWLObject,
    HasIncrementalSignatureGenerationSupport, Serializable {public static class __CLR4_5_272v72vlviclgd8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,9369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    /** a convenience reference for an empty annotation set, saves on typing. */
    @Nonnull
    protected static final Set<OWLAnnotation> NO_ANNOTATIONS = CollectionFactory.emptySet();
    static final OWLObjectTypeIndexProvider OWLOBJECT_TYPEINDEX_PROVIDER = new OWLObjectTypeIndexProvider();
    protected int hashCode = 0;
    @Nonnull
    protected static final OWLClass OWL_THING = new OWLClassImpl(OWLRDFVocabulary.OWL_THING.getIRI());

    @SuppressWarnings("unused")
    private static void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {try{__CLR4_5_272v72vlviclgd8.R.inc(9175);
        __CLR4_5_272v72vlviclgd8.R.inc(9176);stream.defaultReadObject();
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {try{__CLR4_5_272v72vlviclgd8.R.inc(9177);
        __CLR4_5_272v72vlviclgd8.R.inc(9178);Set<OWLAnonymousIndividual> result = new HashSet<>();
        __CLR4_5_272v72vlviclgd8.R.inc(9179);addAnonymousIndividualsToSet(result);
        __CLR4_5_272v72vlviclgd8.R.inc(9180);return result;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLEntity> getSignature() {try{__CLR4_5_272v72vlviclgd8.R.inc(9181);
        __CLR4_5_272v72vlviclgd8.R.inc(9182);Set<OWLEntity> result = new HashSet<>();
        __CLR4_5_272v72vlviclgd8.R.inc(9183);addSignatureEntitiesToSet(result);
        __CLR4_5_272v72vlviclgd8.R.inc(9184);return result;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    protected static void addEntitiesFromAnnotationsToSet(Collection<OWLAnnotation> annotations,
        Set<OWLEntity> entities) {try{__CLR4_5_272v72vlviclgd8.R.inc(9185);
        __CLR4_5_272v72vlviclgd8.R.inc(9186);for (OWLAnnotation annotation : annotations) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9187);if ((((annotation instanceof OWLAnnotationImpl)&&(__CLR4_5_272v72vlviclgd8.R.iget(9188)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9189)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9190);OWLAnnotationImpl owlAnnotation = (OWLAnnotationImpl) annotation;
                __CLR4_5_272v72vlviclgd8.R.inc(9191);owlAnnotation.addSignatureEntitiesToSet(entities);
            } }else {{
                __CLR4_5_272v72vlviclgd8.R.inc(9192);entities.addAll(annotation.getSignature());
            }
        }}
    }}finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    protected static void addAnonymousIndividualsFromAnnotationsToSet(Collection<OWLAnnotation> annotations,
        Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_272v72vlviclgd8.R.inc(9193);
        __CLR4_5_272v72vlviclgd8.R.inc(9194);for (OWLAnnotation annotation : annotations) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9195);if ((((annotation instanceof OWLAnnotationImpl)&&(__CLR4_5_272v72vlviclgd8.R.iget(9196)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9197)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9198);OWLAnnotationImpl owlAnnotation = (OWLAnnotationImpl) annotation;
                __CLR4_5_272v72vlviclgd8.R.inc(9199);owlAnnotation.addAnonymousIndividualsToSet(anons);
            } }else {{
                __CLR4_5_272v72vlviclgd8.R.inc(9200);anons.addAll(annotation.getAnonymousIndividuals());
            }
        }}
    }}finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(@Nonnull OWLEntity owlEntity) {try{__CLR4_5_272v72vlviclgd8.R.inc(9201);
        __CLR4_5_272v72vlviclgd8.R.inc(9202);return getSignature().contains(owlEntity);
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public Set<OWLClass> getClassesInSignature() {try{__CLR4_5_272v72vlviclgd8.R.inc(9203);
        __CLR4_5_272v72vlviclgd8.R.inc(9204);Set<OWLClass> result = new HashSet<>();
        __CLR4_5_272v72vlviclgd8.R.inc(9205);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9206);if ((((ent.isOWLClass())&&(__CLR4_5_272v72vlviclgd8.R.iget(9207)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9208)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9209);result.add(ent.asOWLClass());
            }
        }}
        }__CLR4_5_272v72vlviclgd8.R.inc(9210);return result;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public Set<OWLDataProperty> getDataPropertiesInSignature() {try{__CLR4_5_272v72vlviclgd8.R.inc(9211);
        __CLR4_5_272v72vlviclgd8.R.inc(9212);Set<OWLDataProperty> result = new HashSet<>();
        __CLR4_5_272v72vlviclgd8.R.inc(9213);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9214);if ((((ent.isOWLDataProperty())&&(__CLR4_5_272v72vlviclgd8.R.iget(9215)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9216)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9217);result.add(ent.asOWLDataProperty());
            }
        }}
        }__CLR4_5_272v72vlviclgd8.R.inc(9218);return result;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public Set<OWLObjectProperty> getObjectPropertiesInSignature() {try{__CLR4_5_272v72vlviclgd8.R.inc(9219);
        __CLR4_5_272v72vlviclgd8.R.inc(9220);Set<OWLObjectProperty> result = new HashSet<>();
        __CLR4_5_272v72vlviclgd8.R.inc(9221);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9222);if ((((ent.isOWLObjectProperty())&&(__CLR4_5_272v72vlviclgd8.R.iget(9223)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9224)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9225);result.add(ent.asOWLObjectProperty());
            }
        }}
        }__CLR4_5_272v72vlviclgd8.R.inc(9226);return result;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public Set<OWLNamedIndividual> getIndividualsInSignature() {try{__CLR4_5_272v72vlviclgd8.R.inc(9227);
        __CLR4_5_272v72vlviclgd8.R.inc(9228);Set<OWLNamedIndividual> result = new HashSet<>();
        __CLR4_5_272v72vlviclgd8.R.inc(9229);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9230);if ((((ent.isOWLNamedIndividual())&&(__CLR4_5_272v72vlviclgd8.R.iget(9231)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9232)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9233);result.add(ent.asOWLNamedIndividual());
            }
        }}
        }__CLR4_5_272v72vlviclgd8.R.inc(9234);return result;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public Set<OWLDatatype> getDatatypesInSignature() {try{__CLR4_5_272v72vlviclgd8.R.inc(9235);
        __CLR4_5_272v72vlviclgd8.R.inc(9236);Set<OWLDatatype> result = new HashSet<>();
        __CLR4_5_272v72vlviclgd8.R.inc(9237);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9238);if ((((ent.isOWLDatatype())&&(__CLR4_5_272v72vlviclgd8.R.iget(9239)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9240)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9241);result.add(ent.asOWLDatatype());
            }
        }}
        }__CLR4_5_272v72vlviclgd8.R.inc(9242);return result;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature() {try{__CLR4_5_272v72vlviclgd8.R.inc(9243);
        __CLR4_5_272v72vlviclgd8.R.inc(9244);Set<OWLAnnotationProperty> result = new HashSet<>();
        __CLR4_5_272v72vlviclgd8.R.inc(9245);for (OWLEntity ent : getSignature()) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9246);if ((((ent.isOWLAnnotationProperty())&&(__CLR4_5_272v72vlviclgd8.R.iget(9247)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9248)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9249);result.add(ent.asOWLAnnotationProperty());
            }
        }}
        }__CLR4_5_272v72vlviclgd8.R.inc(9250);return result;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> getNestedClassExpressions() {try{__CLR4_5_272v72vlviclgd8.R.inc(9251);
        __CLR4_5_272v72vlviclgd8.R.inc(9252);OWLClassExpressionCollector collector = new OWLClassExpressionCollector();
        __CLR4_5_272v72vlviclgd8.R.inc(9253);return accept(collector);
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    protected void addSignatureEntitiesToSetForValue(Set<OWLEntity> entities, HasSignature canHasSignature) {try{__CLR4_5_272v72vlviclgd8.R.inc(9254);
        __CLR4_5_272v72vlviclgd8.R.inc(9255);if ((((canHasSignature instanceof HasIncrementalSignatureGenerationSupport)&&(__CLR4_5_272v72vlviclgd8.R.iget(9256)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9257)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9258);HasIncrementalSignatureGenerationSupport hasIncrementalSignatureGenerationSupport = (HasIncrementalSignatureGenerationSupport) canHasSignature;
            __CLR4_5_272v72vlviclgd8.R.inc(9259);hasIncrementalSignatureGenerationSupport.addSignatureEntitiesToSet(entities);
        } }else {{
            __CLR4_5_272v72vlviclgd8.R.inc(9260);entities.addAll(canHasSignature.getSignature());
        }
    }}finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    protected void addAnonymousIndividualsToSetForValue(Set<OWLAnonymousIndividual> anons,
        HasAnonymousIndividuals canHasAnons) {try{__CLR4_5_272v72vlviclgd8.R.inc(9261);
        __CLR4_5_272v72vlviclgd8.R.inc(9262);if ((((canHasAnons instanceof HasIncrementalSignatureGenerationSupport)&&(__CLR4_5_272v72vlviclgd8.R.iget(9263)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9264)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9265);HasIncrementalSignatureGenerationSupport hasIncrementalSignatureGenerationSupport = (HasIncrementalSignatureGenerationSupport) canHasAnons;
            __CLR4_5_272v72vlviclgd8.R.inc(9266);hasIncrementalSignatureGenerationSupport.addAnonymousIndividualsToSet(anons);
        } }else {{
            __CLR4_5_272v72vlviclgd8.R.inc(9267);anons.addAll(canHasAnons.getAnonymousIndividuals());
        }
    }}finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_272v72vlviclgd8.R.inc(9268);
        __CLR4_5_272v72vlviclgd8.R.inc(9269);return obj == this || obj instanceof OWLObject;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_272v72vlviclgd8.R.inc(9270);
        __CLR4_5_272v72vlviclgd8.R.inc(9271);if ((((hashCode == 0)&&(__CLR4_5_272v72vlviclgd8.R.iget(9272)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9273)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9274);hashCode = HashCode.hashCode(this);
        }
        }__CLR4_5_272v72vlviclgd8.R.inc(9275);return hashCode;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    protected abstract int index();

    @Override
    public int compareTo(OWLObject o) {try{__CLR4_5_272v72vlviclgd8.R.inc(9276);
        __CLR4_5_272v72vlviclgd8.R.inc(9277);int thisTypeIndex = index();
        __CLR4_5_272v72vlviclgd8.R.inc(9278);int otherTypeIndex = 0;
        __CLR4_5_272v72vlviclgd8.R.inc(9279);if ((((o instanceof OWLObjectImplWithoutEntityAndAnonCaching)&&(__CLR4_5_272v72vlviclgd8.R.iget(9280)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9281)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9282);otherTypeIndex = ((OWLObjectImplWithoutEntityAndAnonCaching) o).index();
        } }else {{
            __CLR4_5_272v72vlviclgd8.R.inc(9283);otherTypeIndex = OWLOBJECT_TYPEINDEX_PROVIDER.getTypeIndex(o);
        }
        }__CLR4_5_272v72vlviclgd8.R.inc(9284);int diff = thisTypeIndex - otherTypeIndex;
        __CLR4_5_272v72vlviclgd8.R.inc(9285);if ((((diff != 0)&&(__CLR4_5_272v72vlviclgd8.R.iget(9286)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9287)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9288);return diff;
        }
        // Objects are the same type
        }__CLR4_5_272v72vlviclgd8.R.inc(9289);diff = compareObjectOfSameType(o);
        __CLR4_5_272v72vlviclgd8.R.inc(9290);if ((((diff != 0)&&(__CLR4_5_272v72vlviclgd8.R.iget(9291)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9292)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9293);return diff;
        }
        }__CLR4_5_272v72vlviclgd8.R.inc(9294);if ((((this instanceof OWLAxiom)&&(__CLR4_5_272v72vlviclgd8.R.iget(9295)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9296)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9297);diff = compareLists(new ArrayList<>(((OWLAxiom) this).getAnnotations()), new ArrayList<>(((OWLAxiom) o)
                .getAnnotations()));
        }
        }__CLR4_5_272v72vlviclgd8.R.inc(9298);return diff;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    protected int compareAnnotations(List<OWLAnnotation> l1, List<OWLAnnotation> l2) {try{__CLR4_5_272v72vlviclgd8.R.inc(9299);
        __CLR4_5_272v72vlviclgd8.R.inc(9300);int i = 0;
        __CLR4_5_272v72vlviclgd8.R.inc(9301);for (; (((i < l1.size() && i < l2.size())&&(__CLR4_5_272v72vlviclgd8.R.iget(9302)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9303)==0&false)); i++) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9304);int diff = l1.get(i).compareTo(l2.get(i));
            __CLR4_5_272v72vlviclgd8.R.inc(9305);if ((((diff != 0)&&(__CLR4_5_272v72vlviclgd8.R.iget(9306)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9307)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9308);return diff;
            }
        }}
        }__CLR4_5_272v72vlviclgd8.R.inc(9309);if ((((i < l2.size())&&(__CLR4_5_272v72vlviclgd8.R.iget(9310)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9311)==0&false))) {{
            // l1 is shorter and a sublist of l2
            __CLR4_5_272v72vlviclgd8.R.inc(9312);return -1;
        }
        }__CLR4_5_272v72vlviclgd8.R.inc(9313);if ((((i < l1.size())&&(__CLR4_5_272v72vlviclgd8.R.iget(9314)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9315)==0&false))) {{
            // l2 is shorter and a sublist of l1
            __CLR4_5_272v72vlviclgd8.R.inc(9316);return 1;
        }
        // lists are identical
        }__CLR4_5_272v72vlviclgd8.R.inc(9317);return 0;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    protected abstract int compareObjectOfSameType(@Nonnull OWLObject object);

    @Override
    @Nonnull
    public String toString() {try{__CLR4_5_272v72vlviclgd8.R.inc(9318);
        __CLR4_5_272v72vlviclgd8.R.inc(9319);return ToStringRenderer.getInstance().getRendering(this);
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_272v72vlviclgd8.R.inc(9320);
        __CLR4_5_272v72vlviclgd8.R.inc(9321);return false;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    @Override
    public boolean isBottomEntity() {try{__CLR4_5_272v72vlviclgd8.R.inc(9322);
        __CLR4_5_272v72vlviclgd8.R.inc(9323);return false;
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    protected static int compareSets(Collection<? extends OWLObject> set1, Collection<? extends OWLObject> set2) {try{__CLR4_5_272v72vlviclgd8.R.inc(9324);
        __CLR4_5_272v72vlviclgd8.R.inc(9325);SortedSet<? extends OWLObject> ss1;
        __CLR4_5_272v72vlviclgd8.R.inc(9326);if ((((set1 instanceof SortedSet)&&(__CLR4_5_272v72vlviclgd8.R.iget(9327)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9328)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9329);ss1 = (SortedSet<? extends OWLObject>) set1;
        } }else {{
            __CLR4_5_272v72vlviclgd8.R.inc(9330);ss1 = new TreeSet<>(set1);
        }
        }__CLR4_5_272v72vlviclgd8.R.inc(9331);SortedSet<? extends OWLObject> ss2;
        __CLR4_5_272v72vlviclgd8.R.inc(9332);if ((((set2 instanceof SortedSet)&&(__CLR4_5_272v72vlviclgd8.R.iget(9333)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9334)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9335);ss2 = (SortedSet<? extends OWLObject>) set2;
        } }else {{
            __CLR4_5_272v72vlviclgd8.R.inc(9336);ss2 = new TreeSet<>(set2);
        }
        }__CLR4_5_272v72vlviclgd8.R.inc(9337);int i = 0;
        __CLR4_5_272v72vlviclgd8.R.inc(9338);Iterator<? extends OWLObject> thisIt = ss1.iterator();
        __CLR4_5_272v72vlviclgd8.R.inc(9339);Iterator<? extends OWLObject> otherIt = ss2.iterator();
        __CLR4_5_272v72vlviclgd8.R.inc(9340);while ((((i < ss1.size() && i < ss2.size())&&(__CLR4_5_272v72vlviclgd8.R.iget(9341)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9342)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9343);OWLObject o1 = thisIt.next();
            __CLR4_5_272v72vlviclgd8.R.inc(9344);OWLObject o2 = otherIt.next();
            __CLR4_5_272v72vlviclgd8.R.inc(9345);int diff = o1.compareTo(o2);
            __CLR4_5_272v72vlviclgd8.R.inc(9346);if ((((diff != 0)&&(__CLR4_5_272v72vlviclgd8.R.iget(9347)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9348)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9349);return diff;
            }
            }__CLR4_5_272v72vlviclgd8.R.inc(9350);i++;
        }
        }__CLR4_5_272v72vlviclgd8.R.inc(9351);return ss1.size() - ss2.size();
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}

    protected static int compareLists(List<? extends OWLObject> list1, List<? extends OWLObject> list2) {try{__CLR4_5_272v72vlviclgd8.R.inc(9352);
        __CLR4_5_272v72vlviclgd8.R.inc(9353);int i = 0;
        __CLR4_5_272v72vlviclgd8.R.inc(9354);int size = (((list1.size() < list2.size() )&&(__CLR4_5_272v72vlviclgd8.R.iget(9355)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9356)==0&false))? list1.size() : list2.size();
        __CLR4_5_272v72vlviclgd8.R.inc(9357);while ((((i < size)&&(__CLR4_5_272v72vlviclgd8.R.iget(9358)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9359)==0&false))) {{
            __CLR4_5_272v72vlviclgd8.R.inc(9360);OWLObject o1 = list1.get(i);
            __CLR4_5_272v72vlviclgd8.R.inc(9361);OWLObject o2 = list2.get(i);
            __CLR4_5_272v72vlviclgd8.R.inc(9362);int diff = o1.compareTo(o2);
            __CLR4_5_272v72vlviclgd8.R.inc(9363);if ((((diff != 0)&&(__CLR4_5_272v72vlviclgd8.R.iget(9364)!=0|true))||(__CLR4_5_272v72vlviclgd8.R.iget(9365)==0&false))) {{
                __CLR4_5_272v72vlviclgd8.R.inc(9366);return diff;
            }
            }__CLR4_5_272v72vlviclgd8.R.inc(9367);i++;
        }
        }__CLR4_5_272v72vlviclgd8.R.inc(9368);return list1.size() - list2.size();
    }finally{__CLR4_5_272v72vlviclgd8.R.flushNeeded();}}
}
