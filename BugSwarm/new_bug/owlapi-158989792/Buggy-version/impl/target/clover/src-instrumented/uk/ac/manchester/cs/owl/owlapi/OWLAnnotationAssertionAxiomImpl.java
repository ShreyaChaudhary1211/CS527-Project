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

import java.util.Collection;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLAnnotationAssertionAxiomImpl extends
        OWLAxiomImplWithoutEntityAndAnonCaching implements
        OWLAnnotationAssertionAxiom {public static class __CLR4_5_226k26klviclfai{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,2906,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLAnnotationSubject subject;
    @Nonnull
    private final OWLAnnotationProperty property;
    @Nonnull
    private final OWLAnnotationValue value;

    /**
     * @param subject
     *        subject for axiom
     * @param property
     *        annotation property
     * @param value
     *        annotation value
     * @param annotations
     *        annotations on the axiom
     */
    public OWLAnnotationAssertionAxiomImpl(
            @Nonnull OWLAnnotationSubject subject,
            @Nonnull OWLAnnotationProperty property,
            @Nonnull OWLAnnotationValue value,
            @Nonnull Collection<? extends OWLAnnotation> annotations) {
        super(annotations);__CLR4_5_226k26klviclfai.R.inc(2829);try{__CLR4_5_226k26klviclfai.R.inc(2828);
        __CLR4_5_226k26klviclfai.R.inc(2830);this.subject = checkNotNull(subject, "subject cannot be null");
        __CLR4_5_226k26klviclfai.R.inc(2831);this.property = checkNotNull(property, "property cannot be null");
        __CLR4_5_226k26klviclfai.R.inc(2832);this.value = checkNotNull(value, "value cannot be null");
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public OWLAnnotationAssertionAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_226k26klviclfai.R.inc(2833);
        __CLR4_5_226k26klviclfai.R.inc(2834);if ((((!isAnnotated())&&(__CLR4_5_226k26klviclfai.R.iget(2835)!=0|true))||(__CLR4_5_226k26klviclfai.R.iget(2836)==0&false))) {{
            __CLR4_5_226k26klviclfai.R.inc(2837);return this;
        }
        }__CLR4_5_226k26klviclfai.R.inc(2838);return new OWLAnnotationAssertionAxiomImpl(getSubject(), getProperty(),
                getValue(), NO_ANNOTATIONS);
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_226k26klviclfai.R.inc(2839);
        __CLR4_5_226k26klviclfai.R.inc(2840);entities.add(property);
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_226k26klviclfai.R.inc(2841);
        __CLR4_5_226k26klviclfai.R.inc(2842);if ((((subject instanceof OWLAnonymousIndividual)&&(__CLR4_5_226k26klviclfai.R.iget(2843)!=0|true))||(__CLR4_5_226k26klviclfai.R.iget(2844)==0&false))) {{
            __CLR4_5_226k26klviclfai.R.inc(2845);OWLAnonymousIndividual anonymousIndividual = (OWLAnonymousIndividual) subject;
            __CLR4_5_226k26klviclfai.R.inc(2846);anons.add(anonymousIndividual);
        }
        }__CLR4_5_226k26klviclfai.R.inc(2847);if ((((value instanceof OWLAnonymousIndividual)&&(__CLR4_5_226k26klviclfai.R.iget(2848)!=0|true))||(__CLR4_5_226k26klviclfai.R.iget(2849)==0&false))) {{
            __CLR4_5_226k26klviclfai.R.inc(2850);OWLAnonymousIndividual anonymousIndividual = (OWLAnonymousIndividual) value;
            __CLR4_5_226k26klviclfai.R.inc(2851);anons.add(anonymousIndividual);
        }
    }}finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    /**
     * Determines if this annotation assertion deprecates the IRI that is the
     * subject of the annotation.
     * 
     * @return {@code true} if this annotation assertion deprecates the subject
     *         IRI of the assertion, otherwise {@code false}.
     * @see org.semanticweb.owlapi.model.OWLAnnotation#isDeprecatedIRIAnnotation()
     */
    @Override
    public boolean isDeprecatedIRIAssertion() {try{__CLR4_5_226k26klviclfai.R.inc(2852);
        __CLR4_5_226k26klviclfai.R.inc(2853);return property.isDeprecated()
                && getAnnotation().isDeprecatedIRIAnnotation();
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public OWLAnnotationAssertionAxiom getAnnotatedAxiom(
            Set<OWLAnnotation> annotations) {try{__CLR4_5_226k26klviclfai.R.inc(2854);
        __CLR4_5_226k26klviclfai.R.inc(2855);return new OWLAnnotationAssertionAxiomImpl(getSubject(), getProperty(),
                getValue(), mergeAnnos(annotations));
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public OWLAnnotationValue getValue() {try{__CLR4_5_226k26klviclfai.R.inc(2856);
        __CLR4_5_226k26klviclfai.R.inc(2857);return value;
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public OWLAnnotationSubject getSubject() {try{__CLR4_5_226k26klviclfai.R.inc(2858);
        __CLR4_5_226k26klviclfai.R.inc(2859);return subject;
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty getProperty() {try{__CLR4_5_226k26klviclfai.R.inc(2860);
        __CLR4_5_226k26klviclfai.R.inc(2861);return property;
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public OWLAnnotation getAnnotation() {try{__CLR4_5_226k26klviclfai.R.inc(2862);
        __CLR4_5_226k26klviclfai.R.inc(2863);return new OWLAnnotationImpl(property, value, NO_ANNOTATIONS);
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public boolean isLogicalAxiom() {try{__CLR4_5_226k26klviclfai.R.inc(2864);
        __CLR4_5_226k26klviclfai.R.inc(2865);return false;
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public boolean isAnnotationAxiom() {try{__CLR4_5_226k26klviclfai.R.inc(2866);
        __CLR4_5_226k26klviclfai.R.inc(2867);return true;
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_226k26klviclfai.R.inc(2868);
        __CLR4_5_226k26klviclfai.R.inc(2869);OWLAnnotationAssertionAxiom other = (OWLAnnotationAssertionAxiom) object;
        __CLR4_5_226k26klviclfai.R.inc(2870);int diff = subject.compareTo(other.getSubject());
        __CLR4_5_226k26klviclfai.R.inc(2871);if ((((diff != 0)&&(__CLR4_5_226k26klviclfai.R.iget(2872)!=0|true))||(__CLR4_5_226k26klviclfai.R.iget(2873)==0&false))) {{
            __CLR4_5_226k26klviclfai.R.inc(2874);return diff;
        }
        }__CLR4_5_226k26klviclfai.R.inc(2875);diff = property.compareTo(other.getProperty());
        __CLR4_5_226k26klviclfai.R.inc(2876);if ((((diff != 0)&&(__CLR4_5_226k26klviclfai.R.iget(2877)!=0|true))||(__CLR4_5_226k26klviclfai.R.iget(2878)==0&false))) {{
            __CLR4_5_226k26klviclfai.R.inc(2879);return diff;
        }
        }__CLR4_5_226k26klviclfai.R.inc(2880);return value.compareTo(other.getValue());
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_226k26klviclfai.R.inc(2881);
        __CLR4_5_226k26klviclfai.R.inc(2882);visitor.visit(this);
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_226k26klviclfai.R.inc(2883);
        __CLR4_5_226k26klviclfai.R.inc(2884);visitor.visit(this);
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_226k26klviclfai.R.inc(2885);
        __CLR4_5_226k26klviclfai.R.inc(2886);return visitor.visit(this);
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_226k26klviclfai.R.inc(2887);
        __CLR4_5_226k26klviclfai.R.inc(2888);return visitor.visit(this);
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_226k26klviclfai.R.inc(2889);
        __CLR4_5_226k26klviclfai.R.inc(2890);return AxiomType.ANNOTATION_ASSERTION;
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_226k26klviclfai.R.inc(2891);
        __CLR4_5_226k26klviclfai.R.inc(2892);if ((((this == obj)&&(__CLR4_5_226k26klviclfai.R.iget(2893)!=0|true))||(__CLR4_5_226k26klviclfai.R.iget(2894)==0&false))) {{
            __CLR4_5_226k26klviclfai.R.inc(2895);return true;
        }
        }__CLR4_5_226k26klviclfai.R.inc(2896);if ((((!super.equals(obj))&&(__CLR4_5_226k26klviclfai.R.iget(2897)!=0|true))||(__CLR4_5_226k26klviclfai.R.iget(2898)==0&false))) {{
            __CLR4_5_226k26klviclfai.R.inc(2899);return false;
        }
        // superclass is responsible for null, identity, owlaxiom type and
        // annotations
        }__CLR4_5_226k26klviclfai.R.inc(2900);if ((((!(obj instanceof OWLAnnotationAssertionAxiom))&&(__CLR4_5_226k26klviclfai.R.iget(2901)!=0|true))||(__CLR4_5_226k26klviclfai.R.iget(2902)==0&false))) {{
            __CLR4_5_226k26klviclfai.R.inc(2903);return false;
        }
        }__CLR4_5_226k26klviclfai.R.inc(2904);OWLAnnotationAssertionAxiom other = (OWLAnnotationAssertionAxiom) obj;
        __CLR4_5_226k26klviclfai.R.inc(2905);return subject.equals(other.getSubject())
                && property.equals(other.getProperty())
                && value.equals(other.getValue());
    }finally{__CLR4_5_226k26klviclfai.R.flushNeeded();}}
}
