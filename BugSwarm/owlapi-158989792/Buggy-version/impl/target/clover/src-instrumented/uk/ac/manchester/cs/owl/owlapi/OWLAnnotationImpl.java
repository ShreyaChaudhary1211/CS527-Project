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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLAnnotationImpl extends OWLObjectImplWithoutEntityAndAnonCaching
    implements OWLAnnotation {public static class __CLR4_5_228q28qlviclfar{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,2971,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLAnnotationProperty property;
    @Nonnull
    private final OWLAnnotationValue value;
    @Nonnull
    private final List<OWLAnnotation> anns;

    @Override
    protected int index() {try{__CLR4_5_228q28qlviclfar.R.inc(2906);
        __CLR4_5_228q28qlviclfar.R.inc(2907);return OWLObjectTypeIndexProvider.ANNOTATION_TYPE_INDEX_BASE + 1;
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    /**
     * @param property
     *        annotation property
     * @param value
     *        annotation value
     * @param annotations
     *        annotations on the axiom
     */
    public OWLAnnotationImpl(@Nonnull OWLAnnotationProperty property,
        @Nonnull OWLAnnotationValue value,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_228q28qlviclfar.R.inc(2908);
        __CLR4_5_228q28qlviclfar.R.inc(2909);this.property = checkNotNull(property, "property cannot be null");
        __CLR4_5_228q28qlviclfar.R.inc(2910);this.value = checkNotNull(value, "value cannot be null");
        __CLR4_5_228q28qlviclfar.R.inc(2911);checkNotNull(annotations, "annotations cannot be null");
        __CLR4_5_228q28qlviclfar.R.inc(2912);anns = CollectionFactory.sortOptionally((Set<OWLAnnotation>) annotations);
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotation> getAnnotations() {try{__CLR4_5_228q28qlviclfar.R.inc(2913);
        __CLR4_5_228q28qlviclfar.R.inc(2914);return CollectionFactory
            .getCopyOnRequestSetFromImmutableCollection(anns);
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty getProperty() {try{__CLR4_5_228q28qlviclfar.R.inc(2915);
        __CLR4_5_228q28qlviclfar.R.inc(2916);return property;
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public OWLAnnotationValue getValue() {try{__CLR4_5_228q28qlviclfar.R.inc(2917);
        __CLR4_5_228q28qlviclfar.R.inc(2918);return value;
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public OWLAnnotation getAnnotatedAnnotation(
        @Nonnull Set<OWLAnnotation> annotations) {try{__CLR4_5_228q28qlviclfar.R.inc(2919);
        __CLR4_5_228q28qlviclfar.R.inc(2920);if ((((annotations.isEmpty())&&(__CLR4_5_228q28qlviclfar.R.iget(2921)!=0|true))||(__CLR4_5_228q28qlviclfar.R.iget(2922)==0&false))) {{
            __CLR4_5_228q28qlviclfar.R.inc(2923);return this;
        }
        }__CLR4_5_228q28qlviclfar.R.inc(2924);Set<OWLAnnotation> merged = new HashSet<>(anns);
        __CLR4_5_228q28qlviclfar.R.inc(2925);merged.addAll(annotations);
        __CLR4_5_228q28qlviclfar.R.inc(2926);return new OWLAnnotationImpl(property, value, merged);
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    /**
     * Determines if this annotation is an annotation used to deprecate an IRI.
     * This is the case if the annotation property has an IRI of
     * {@code owl:deprecated} and the value of the annotation is
     * {@code "true"^^xsd:boolean}
     * 
     * @return {@code true} if this annotation is an annotation that can be used
     *         to deprecate an IRI, otherwise {@code false}.
     */
    @Override
    public boolean isDeprecatedIRIAnnotation() {try{__CLR4_5_228q28qlviclfar.R.inc(2927);
        __CLR4_5_228q28qlviclfar.R.inc(2928);return property.isDeprecated() && value instanceof OWLLiteral
            && ((OWLLiteral) value).isBoolean()
            && ((OWLLiteral) value).parseBoolean();
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_228q28qlviclfar.R.inc(2929);
        __CLR4_5_228q28qlviclfar.R.inc(2930);if ((((obj == this)&&(__CLR4_5_228q28qlviclfar.R.iget(2931)!=0|true))||(__CLR4_5_228q28qlviclfar.R.iget(2932)==0&false))) {{
            __CLR4_5_228q28qlviclfar.R.inc(2933);return true;
        }
        }__CLR4_5_228q28qlviclfar.R.inc(2934);if ((((obj instanceof OWLAnnotationImpl)&&(__CLR4_5_228q28qlviclfar.R.iget(2935)!=0|true))||(__CLR4_5_228q28qlviclfar.R.iget(2936)==0&false))) {{
            __CLR4_5_228q28qlviclfar.R.inc(2937);OWLAnnotationImpl other = (OWLAnnotationImpl) obj;
            __CLR4_5_228q28qlviclfar.R.inc(2938);return other.getProperty().equals(property)
                && other.getValue().equals(value)
                && other.anns.equals(anns);
        }
        }__CLR4_5_228q28qlviclfar.R.inc(2939);if ((((obj instanceof OWLAnnotation)&&(__CLR4_5_228q28qlviclfar.R.iget(2940)!=0|true))||(__CLR4_5_228q28qlviclfar.R.iget(2941)==0&false))) {{
            __CLR4_5_228q28qlviclfar.R.inc(2942);OWLAnnotation other = (OWLAnnotation) obj;
            __CLR4_5_228q28qlviclfar.R.inc(2943);return other.getProperty().equals(property)
                && other.getValue().equals(value)
                && other.getAnnotations().equals(getAnnotations());
        }
        }__CLR4_5_228q28qlviclfar.R.inc(2944);return false;
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_228q28qlviclfar.R.inc(2945);
        __CLR4_5_228q28qlviclfar.R.inc(2946);OWLAnnotation other = (OWLAnnotation) object;
        __CLR4_5_228q28qlviclfar.R.inc(2947);int diff = getProperty().compareTo(other.getProperty());
        __CLR4_5_228q28qlviclfar.R.inc(2948);if ((((diff != 0)&&(__CLR4_5_228q28qlviclfar.R.iget(2949)!=0|true))||(__CLR4_5_228q28qlviclfar.R.iget(2950)==0&false))) {{
            __CLR4_5_228q28qlviclfar.R.inc(2951);return diff;
        } }else {{
            __CLR4_5_228q28qlviclfar.R.inc(2952);return getValue().compareTo(other.getValue());
        }
    }}finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_228q28qlviclfar.R.inc(2953);
        __CLR4_5_228q28qlviclfar.R.inc(2954);visitor.visit(this);
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_228q28qlviclfar.R.inc(2955);
        __CLR4_5_228q28qlviclfar.R.inc(2956);return visitor.visit(this);
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public void accept(OWLAnnotationObjectVisitor visitor) {try{__CLR4_5_228q28qlviclfar.R.inc(2957);
        __CLR4_5_228q28qlviclfar.R.inc(2958);visitor.visit(this);
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAnnotationObjectVisitorEx<O> visitor) {try{__CLR4_5_228q28qlviclfar.R.inc(2959);
        __CLR4_5_228q28qlviclfar.R.inc(2960);return visitor.visit(this);
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_228q28qlviclfar.R.inc(2961);
        __CLR4_5_228q28qlviclfar.R.inc(2962);entities.add(property);
        __CLR4_5_228q28qlviclfar.R.inc(2963);addEntitiesFromAnnotationsToSet(anns, entities);
    }finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_228q28qlviclfar.R.inc(2964);
        __CLR4_5_228q28qlviclfar.R.inc(2965);addAnonymousIndividualsFromAnnotationsToSet(anns, anons);
        __CLR4_5_228q28qlviclfar.R.inc(2966);if ((((value instanceof OWLAnonymousIndividual)&&(__CLR4_5_228q28qlviclfar.R.iget(2967)!=0|true))||(__CLR4_5_228q28qlviclfar.R.iget(2968)==0&false))) {{
            __CLR4_5_228q28qlviclfar.R.inc(2969);OWLAnonymousIndividual anonymousIndividual = (OWLAnonymousIndividual) value;
            __CLR4_5_228q28qlviclfar.R.inc(2970);anons.add(anonymousIndividual);
        }
    }}finally{__CLR4_5_228q28qlviclfar.R.flushNeeded();}}
}
