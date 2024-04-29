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

import static org.semanticweb.owlapi.util.CollectionFactory.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.NNF;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class OWLAxiomImplWithoutEntityAndAnonCaching extends OWLObjectImplWithoutEntityAndAnonCaching
    implements OWLAxiom, CollectionContainer<OWLAnnotation> {public static class __CLR4_5_22lb2lblviclffr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,3445,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final List<OWLAnnotation> annotations;

    @Override
    protected int index() {try{__CLR4_5_22lb2lblviclffr.R.inc(3359);
        __CLR4_5_22lb2lblviclffr.R.inc(3360);return OWLObjectTypeIndexProvider.AXIOM_TYPE_INDEX_BASE + getAxiomType().getIndex();
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    /**
     * @param annotations
     *        annotations on the axiom
     */
    @SuppressWarnings("unchecked")
    public OWLAxiomImplWithoutEntityAndAnonCaching(@Nonnull Collection<? extends OWLAnnotation> annotations) {try{__CLR4_5_22lb2lblviclffr.R.inc(3361);
        __CLR4_5_22lb2lblviclffr.R.inc(3362);checkNotNull(annotations, "annotations cannot be null");
        __CLR4_5_22lb2lblviclffr.R.inc(3363);if ((((!annotations.isEmpty())&&(__CLR4_5_22lb2lblviclffr.R.iget(3364)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3365)==0&false))) {{
            __CLR4_5_22lb2lblviclffr.R.inc(3366);if ((((annotations.size() == 1)&&(__CLR4_5_22lb2lblviclffr.R.iget(3367)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3368)==0&false))) {{
                __CLR4_5_22lb2lblviclffr.R.inc(3369);OWLAnnotation tmp = annotations.iterator().next();
                __CLR4_5_22lb2lblviclffr.R.inc(3370);this.annotations = Collections.singletonList(tmp);
            } }else {{
                __CLR4_5_22lb2lblviclffr.R.inc(3371);this.annotations = (List<OWLAnnotation>) sortOptionally(annotations);
            }
        }} }else {{
            __CLR4_5_22lb2lblviclffr.R.inc(3372);this.annotations = emptyList();
        }
    }}finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Override
    public boolean isAnnotated() {try{__CLR4_5_22lb2lblviclffr.R.inc(3373);
        __CLR4_5_22lb2lblviclffr.R.inc(3374);return !annotations.isEmpty();
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    // TODO when processing annotations on OWLOntology:: add axiom, needs
    // optimizing
    @Override
    public Set<OWLAnnotation> getAnnotations() {try{__CLR4_5_22lb2lblviclffr.R.inc(3375);
        __CLR4_5_22lb2lblviclffr.R.inc(3376);if ((((annotations.isEmpty())&&(__CLR4_5_22lb2lblviclffr.R.iget(3377)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3378)==0&false))) {{
            __CLR4_5_22lb2lblviclffr.R.inc(3379);return emptySet();
        }
        }__CLR4_5_22lb2lblviclffr.R.inc(3380);return getCopyOnRequestSetFromImmutableCollection(annotations);
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Override
    public void accept(CollectionContainerVisitor<OWLAnnotation> t) {try{__CLR4_5_22lb2lblviclffr.R.inc(3381);
        __CLR4_5_22lb2lblviclffr.R.inc(3382);int size = annotations.size();
        __CLR4_5_22lb2lblviclffr.R.inc(3383);for (int i = 0; (((i < size)&&(__CLR4_5_22lb2lblviclffr.R.iget(3384)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3385)==0&false)); i++) {{
            __CLR4_5_22lb2lblviclffr.R.inc(3386);t.visitItem(annotations.get(i));
        }
    }}finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotation> getAnnotations(OWLAnnotationProperty annotationProperty) {try{__CLR4_5_22lb2lblviclffr.R.inc(3387);
        __CLR4_5_22lb2lblviclffr.R.inc(3388);if ((((annotations.isEmpty())&&(__CLR4_5_22lb2lblviclffr.R.iget(3389)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3390)==0&false))) {{
            __CLR4_5_22lb2lblviclffr.R.inc(3391);return emptySet();
        } }else {{
            __CLR4_5_22lb2lblviclffr.R.inc(3392);Set<OWLAnnotation> result = new HashSet<>();
            __CLR4_5_22lb2lblviclffr.R.inc(3393);for (OWLAnnotation anno : annotations) {{
                __CLR4_5_22lb2lblviclffr.R.inc(3394);if ((((anno.getProperty().equals(annotationProperty))&&(__CLR4_5_22lb2lblviclffr.R.iget(3395)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3396)==0&false))) {{
                    __CLR4_5_22lb2lblviclffr.R.inc(3397);result.add(anno);
                }
            }}
            }__CLR4_5_22lb2lblviclffr.R.inc(3398);return result;
        }
    }}finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Override
    public boolean equalsIgnoreAnnotations(OWLAxiom axiom) {try{__CLR4_5_22lb2lblviclffr.R.inc(3399);
        __CLR4_5_22lb2lblviclffr.R.inc(3400);return getAxiomWithoutAnnotations().equals(axiom.getAxiomWithoutAnnotations());
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Override
    public boolean isOfType(AxiomType<?>... axiomTypes) {try{__CLR4_5_22lb2lblviclffr.R.inc(3401);
        __CLR4_5_22lb2lblviclffr.R.inc(3402);for (AxiomType<?> type : axiomTypes) {{
            __CLR4_5_22lb2lblviclffr.R.inc(3403);if ((((getAxiomType().equals(type))&&(__CLR4_5_22lb2lblviclffr.R.iget(3404)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3405)==0&false))) {{
                __CLR4_5_22lb2lblviclffr.R.inc(3406);return true;
            }
        }}
        }__CLR4_5_22lb2lblviclffr.R.inc(3407);return false;
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Override
    public boolean isOfType(Set<AxiomType<?>> types) {try{__CLR4_5_22lb2lblviclffr.R.inc(3408);
        __CLR4_5_22lb2lblviclffr.R.inc(3409);return types.contains(getAxiomType());
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    /**
     * A convenience method for implementation that returns a set containing the
     * annotations on this axiom plus the annotations in the specified set.
     * 
     * @param annos
     *        The annotations to add to the annotations on this axiom
     * @return The annotations
     */
    @Nonnull
    protected Set<OWLAnnotation> mergeAnnos(Set<OWLAnnotation> annos) {try{__CLR4_5_22lb2lblviclffr.R.inc(3410);
        __CLR4_5_22lb2lblviclffr.R.inc(3411);Set<OWLAnnotation> merged = new HashSet<>(annos);
        __CLR4_5_22lb2lblviclffr.R.inc(3412);merged.addAll(annotations);
        __CLR4_5_22lb2lblviclffr.R.inc(3413);return merged;
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_22lb2lblviclffr.R.inc(3414);
        __CLR4_5_22lb2lblviclffr.R.inc(3415);if ((((this == obj)&&(__CLR4_5_22lb2lblviclffr.R.iget(3416)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3417)==0&false))) {{
            __CLR4_5_22lb2lblviclffr.R.inc(3418);return true;
        }
        }__CLR4_5_22lb2lblviclffr.R.inc(3419);if ((((obj == null || hashCode() != obj.hashCode())&&(__CLR4_5_22lb2lblviclffr.R.iget(3420)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3421)==0&false))) {{
            __CLR4_5_22lb2lblviclffr.R.inc(3422);return false;
        }
        }__CLR4_5_22lb2lblviclffr.R.inc(3423);if ((((!(obj instanceof OWLAxiom))&&(__CLR4_5_22lb2lblviclffr.R.iget(3424)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3425)==0&false))) {{
            __CLR4_5_22lb2lblviclffr.R.inc(3426);return false;
        }
        }__CLR4_5_22lb2lblviclffr.R.inc(3427);OWLAxiom other = (OWLAxiom) obj;
        // for OWLAxiomImpl comparisons, do not create wrapper objects
        __CLR4_5_22lb2lblviclffr.R.inc(3428);if ((((other instanceof OWLAxiomImplWithoutEntityAndAnonCaching)&&(__CLR4_5_22lb2lblviclffr.R.iget(3429)!=0|true))||(__CLR4_5_22lb2lblviclffr.R.iget(3430)==0&false))) {{
            __CLR4_5_22lb2lblviclffr.R.inc(3431);return annotations.equals(((OWLAxiomImplWithoutEntityAndAnonCaching) other).annotations);
        }
        }__CLR4_5_22lb2lblviclffr.R.inc(3432);return getAnnotations().equals(other.getAnnotations());
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Override
    public OWLAxiom getNNF() {try{__CLR4_5_22lb2lblviclffr.R.inc(3433);
        __CLR4_5_22lb2lblviclffr.R.inc(3434);NNF con = new NNF(new OWLDataFactoryImpl());
        __CLR4_5_22lb2lblviclffr.R.inc(3435);OWLAxiom nnf = accept(con);
        __CLR4_5_22lb2lblviclffr.R.inc(3436);return verifyNotNull(nnf);
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLEntity> getSignature() {try{__CLR4_5_22lb2lblviclffr.R.inc(3437);
        __CLR4_5_22lb2lblviclffr.R.inc(3438);Set<OWLEntity> signature = super.getSignature();
        __CLR4_5_22lb2lblviclffr.R.inc(3439);addEntitiesFromAnnotationsToSet(annotations, signature);
        __CLR4_5_22lb2lblviclffr.R.inc(3440);return signature;
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {try{__CLR4_5_22lb2lblviclffr.R.inc(3441);
        __CLR4_5_22lb2lblviclffr.R.inc(3442);Set<OWLAnonymousIndividual> anons = super.getAnonymousIndividuals();
        __CLR4_5_22lb2lblviclffr.R.inc(3443);addAnonymousIndividualsFromAnnotationsToSet(annotations, anons);
        __CLR4_5_22lb2lblviclffr.R.inc(3444);return anons;
    }finally{__CLR4_5_22lb2lblviclffr.R.flushNeeded();}}
}
