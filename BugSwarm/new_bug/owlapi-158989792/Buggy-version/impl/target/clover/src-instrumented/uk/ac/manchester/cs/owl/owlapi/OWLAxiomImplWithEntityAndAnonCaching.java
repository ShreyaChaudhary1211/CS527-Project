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

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.util.NNF;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class OWLAxiomImplWithEntityAndAnonCaching extends OWLObjectImplWithEntityAndAnonCaching implements
    OWLAxiom, CollectionContainer<OWLAnnotation> {public static class __CLR4_5_22j52j5lviclffl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,3359,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final List<OWLAnnotation> annotations;

    @Override
    protected int index() {try{__CLR4_5_22j52j5lviclffl.R.inc(3281);
        __CLR4_5_22j52j5lviclffl.R.inc(3282);return OWLObjectTypeIndexProvider.AXIOM_TYPE_INDEX_BASE + getAxiomType().getIndex();
    }finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    /**
     * @param annotations
     *        annotations on the axiom
     */
    @SuppressWarnings("unchecked")
    public OWLAxiomImplWithEntityAndAnonCaching(@Nonnull Collection<? extends OWLAnnotation> annotations) {try{__CLR4_5_22j52j5lviclffl.R.inc(3283);
        __CLR4_5_22j52j5lviclffl.R.inc(3284);checkNotNull(annotations, "annotations cannot be null");
        __CLR4_5_22j52j5lviclffl.R.inc(3285);if ((((!annotations.isEmpty())&&(__CLR4_5_22j52j5lviclffl.R.iget(3286)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3287)==0&false))) {{
            __CLR4_5_22j52j5lviclffl.R.inc(3288);if ((((annotations.size() == 1)&&(__CLR4_5_22j52j5lviclffl.R.iget(3289)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3290)==0&false))) {{
                __CLR4_5_22j52j5lviclffl.R.inc(3291);OWLAnnotation tmp = annotations.iterator().next();
                __CLR4_5_22j52j5lviclffl.R.inc(3292);this.annotations = Collections.singletonList(tmp);
            } }else {{
                __CLR4_5_22j52j5lviclffl.R.inc(3293);this.annotations = (List<OWLAnnotation>) sortOptionally(annotations);
            }
        }} }else {{
            __CLR4_5_22j52j5lviclffl.R.inc(3294);this.annotations = emptyList();
        }
    }}finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    @Override
    public boolean isAnnotated() {try{__CLR4_5_22j52j5lviclffl.R.inc(3295);
        __CLR4_5_22j52j5lviclffl.R.inc(3296);return !annotations.isEmpty();
    }finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    // TODO when processing annotations on OWLOntology:: add axiom, needs
    // optimizing
    @Override
    public Set<OWLAnnotation> getAnnotations() {try{__CLR4_5_22j52j5lviclffl.R.inc(3297);
        __CLR4_5_22j52j5lviclffl.R.inc(3298);if ((((annotations.isEmpty())&&(__CLR4_5_22j52j5lviclffl.R.iget(3299)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3300)==0&false))) {{
            __CLR4_5_22j52j5lviclffl.R.inc(3301);return emptySet();
        }
        }__CLR4_5_22j52j5lviclffl.R.inc(3302);return getCopyOnRequestSetFromImmutableCollection(annotations);
    }finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    @Override
    public void accept(CollectionContainerVisitor<OWLAnnotation> t) {try{__CLR4_5_22j52j5lviclffl.R.inc(3303);
        __CLR4_5_22j52j5lviclffl.R.inc(3304);int size = annotations.size();
        __CLR4_5_22j52j5lviclffl.R.inc(3305);for (int i = 0; (((i < size)&&(__CLR4_5_22j52j5lviclffl.R.iget(3306)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3307)==0&false)); i++) {{
            __CLR4_5_22j52j5lviclffl.R.inc(3308);t.visitItem(annotations.get(i));
        }
    }}finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotation> getAnnotations(OWLAnnotationProperty annotationProperty) {try{__CLR4_5_22j52j5lviclffl.R.inc(3309);
        __CLR4_5_22j52j5lviclffl.R.inc(3310);if ((((annotations.isEmpty())&&(__CLR4_5_22j52j5lviclffl.R.iget(3311)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3312)==0&false))) {{
            __CLR4_5_22j52j5lviclffl.R.inc(3313);return emptySet();
        } }else {{
            __CLR4_5_22j52j5lviclffl.R.inc(3314);Set<OWLAnnotation> result = new HashSet<>();
            __CLR4_5_22j52j5lviclffl.R.inc(3315);for (OWLAnnotation anno : annotations) {{
                __CLR4_5_22j52j5lviclffl.R.inc(3316);if ((((anno.getProperty().equals(annotationProperty))&&(__CLR4_5_22j52j5lviclffl.R.iget(3317)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3318)==0&false))) {{
                    __CLR4_5_22j52j5lviclffl.R.inc(3319);result.add(anno);
                }
            }}
            }__CLR4_5_22j52j5lviclffl.R.inc(3320);return result;
        }
    }}finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    @Override
    public boolean equalsIgnoreAnnotations(OWLAxiom axiom) {try{__CLR4_5_22j52j5lviclffl.R.inc(3321);
        __CLR4_5_22j52j5lviclffl.R.inc(3322);return getAxiomWithoutAnnotations().equals(axiom.getAxiomWithoutAnnotations());
    }finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    @Override
    public boolean isOfType(AxiomType<?>... axiomTypes) {try{__CLR4_5_22j52j5lviclffl.R.inc(3323);
        __CLR4_5_22j52j5lviclffl.R.inc(3324);for (AxiomType<?> type : axiomTypes) {{
            __CLR4_5_22j52j5lviclffl.R.inc(3325);if ((((getAxiomType().equals(type))&&(__CLR4_5_22j52j5lviclffl.R.iget(3326)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3327)==0&false))) {{
                __CLR4_5_22j52j5lviclffl.R.inc(3328);return true;
            }
        }}
        }__CLR4_5_22j52j5lviclffl.R.inc(3329);return false;
    }finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    @Override
    public boolean isOfType(Set<AxiomType<?>> types) {try{__CLR4_5_22j52j5lviclffl.R.inc(3330);
        __CLR4_5_22j52j5lviclffl.R.inc(3331);return types.contains(getAxiomType());
    }finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    /**
     * A convenience method for implementation that returns a set containing the
     * annotations on this axiom plus the annotations in the specified set.
     * 
     * @param annos
     *        The annotations to add to the annotations on this axiom
     * @return The annotations
     */
    @Nonnull
    protected Set<OWLAnnotation> mergeAnnos(Set<OWLAnnotation> annos) {try{__CLR4_5_22j52j5lviclffl.R.inc(3332);
        __CLR4_5_22j52j5lviclffl.R.inc(3333);Set<OWLAnnotation> merged = new HashSet<>(annos);
        __CLR4_5_22j52j5lviclffl.R.inc(3334);merged.addAll(annotations);
        __CLR4_5_22j52j5lviclffl.R.inc(3335);return merged;
    }finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_22j52j5lviclffl.R.inc(3336);
        __CLR4_5_22j52j5lviclffl.R.inc(3337);if ((((obj == this)&&(__CLR4_5_22j52j5lviclffl.R.iget(3338)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3339)==0&false))) {{
            __CLR4_5_22j52j5lviclffl.R.inc(3340);return true;
        }
        }__CLR4_5_22j52j5lviclffl.R.inc(3341);if ((((obj == null || hashCode() != obj.hashCode())&&(__CLR4_5_22j52j5lviclffl.R.iget(3342)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3343)==0&false))) {{
            __CLR4_5_22j52j5lviclffl.R.inc(3344);return false;
        }
        }__CLR4_5_22j52j5lviclffl.R.inc(3345);if ((((!(obj instanceof OWLAxiom))&&(__CLR4_5_22j52j5lviclffl.R.iget(3346)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3347)==0&false))) {{
            __CLR4_5_22j52j5lviclffl.R.inc(3348);return false;
        }
        }__CLR4_5_22j52j5lviclffl.R.inc(3349);OWLAxiom other = (OWLAxiom) obj;
        // for OWLAxiomImpl comparisons, do not create wrapper objects
        __CLR4_5_22j52j5lviclffl.R.inc(3350);if ((((other instanceof OWLAxiomImplWithEntityAndAnonCaching)&&(__CLR4_5_22j52j5lviclffl.R.iget(3351)!=0|true))||(__CLR4_5_22j52j5lviclffl.R.iget(3352)==0&false))) {{
            __CLR4_5_22j52j5lviclffl.R.inc(3353);return annotations.equals(((OWLAxiomImplWithEntityAndAnonCaching) other).annotations);
        }
        }__CLR4_5_22j52j5lviclffl.R.inc(3354);return getAnnotations().equals(other.getAnnotations());
    }finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}

    @Override
    public OWLAxiom getNNF() {try{__CLR4_5_22j52j5lviclffl.R.inc(3355);
        __CLR4_5_22j52j5lviclffl.R.inc(3356);NNF con = new NNF(new OWLDataFactoryImpl());
        __CLR4_5_22j52j5lviclffl.R.inc(3357);OWLAxiom nnf = accept(con);
        __CLR4_5_22j52j5lviclffl.R.inc(3358);return verifyNotNull(nnf);
    }finally{__CLR4_5_22j52j5lviclffl.R.flushNeeded();}}
}
