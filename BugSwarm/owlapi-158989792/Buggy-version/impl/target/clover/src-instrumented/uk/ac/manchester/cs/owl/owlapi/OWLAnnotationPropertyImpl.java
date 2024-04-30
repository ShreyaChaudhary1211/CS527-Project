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

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

import java.util.Set;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public class OWLAnnotationPropertyImpl extends
        OWLObjectImplWithoutEntityAndAnonCaching implements
        OWLAnnotationProperty {public static class __CLR4_5_22c32c3lviclfci{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,3117,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final IRI iri;

    @Override
    protected int index() {try{__CLR4_5_22c32c3lviclfci.R.inc(3027);
        __CLR4_5_22c32c3lviclfci.R.inc(3028);return OWLObjectTypeIndexProvider.ANNOTATION_PROPERTY;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    /**
     * @param i
     *        iri for property
     */
    public OWLAnnotationPropertyImpl(@Nonnull IRI i) {try{__CLR4_5_22c32c3lviclfci.R.inc(3029);
        __CLR4_5_22c32c3lviclfci.R.inc(3030);iri = checkNotNull(i, "i cannot be null");
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_22c32c3lviclfci.R.inc(3031);
        __CLR4_5_22c32c3lviclfci.R.inc(3032);return iri;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public EntityType<?> getEntityType() {try{__CLR4_5_22c32c3lviclfci.R.inc(3033);
        __CLR4_5_22c32c3lviclfci.R.inc(3034);return EntityType.ANNOTATION_PROPERTY;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isType(EntityType<?> entityType) {try{__CLR4_5_22c32c3lviclfci.R.inc(3035);
        __CLR4_5_22c32c3lviclfci.R.inc(3036);return getEntityType().equals(entityType);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public String toStringID() {try{__CLR4_5_22c32c3lviclfci.R.inc(3037);
        __CLR4_5_22c32c3lviclfci.R.inc(3038);return iri.toString();
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isDeprecated() {try{__CLR4_5_22c32c3lviclfci.R.inc(3039);
        __CLR4_5_22c32c3lviclfci.R.inc(3040);return iri.equals(OWLRDFVocabulary.OWL_DEPRECATED.getIRI());
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(@Nonnull OWLObject object) {try{__CLR4_5_22c32c3lviclfci.R.inc(3041);
        __CLR4_5_22c32c3lviclfci.R.inc(3042);return iri.compareTo(((OWLAnnotationProperty) object).getIRI());
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_22c32c3lviclfci.R.inc(3043);
        __CLR4_5_22c32c3lviclfci.R.inc(3044);visitor.visit(this);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_22c32c3lviclfci.R.inc(3045);
        __CLR4_5_22c32c3lviclfci.R.inc(3046);return visitor.visit(this);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isComment() {try{__CLR4_5_22c32c3lviclfci.R.inc(3047);
        __CLR4_5_22c32c3lviclfci.R.inc(3048);return iri.equals(OWLRDFVocabulary.RDFS_COMMENT.getIRI());
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isLabel() {try{__CLR4_5_22c32c3lviclfci.R.inc(3049);
        __CLR4_5_22c32c3lviclfci.R.inc(3050);return iri.equals(OWLRDFVocabulary.RDFS_LABEL.getIRI());
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public void accept(OWLEntityVisitor visitor) {try{__CLR4_5_22c32c3lviclfci.R.inc(3051);
        __CLR4_5_22c32c3lviclfci.R.inc(3052);visitor.visit(this);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLEntityVisitorEx<O> visitor) {try{__CLR4_5_22c32c3lviclfci.R.inc(3053);
        __CLR4_5_22c32c3lviclfci.R.inc(3054);return visitor.visit(this);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public OWLClass asOWLClass() {try{__CLR4_5_22c32c3lviclfci.R.inc(3055);
        __CLR4_5_22c32c3lviclfci.R.inc(3056);throw new OWLRuntimeException("Not OWLClass");
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLPropertyExpressionVisitorEx<O> visitor) {try{__CLR4_5_22c32c3lviclfci.R.inc(3057);
        __CLR4_5_22c32c3lviclfci.R.inc(3058);return visitor.visit(this);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public OWLDataProperty asOWLDataProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3059);
        __CLR4_5_22c32c3lviclfci.R.inc(3060);throw new OWLRuntimeException("Not OWLDataProperty");
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public OWLDatatype asOWLDatatype() {try{__CLR4_5_22c32c3lviclfci.R.inc(3061);
        __CLR4_5_22c32c3lviclfci.R.inc(3062);throw new OWLRuntimeException("Not OWLDatatype");
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual asOWLNamedIndividual() {try{__CLR4_5_22c32c3lviclfci.R.inc(3063);
        __CLR4_5_22c32c3lviclfci.R.inc(3064);throw new OWLRuntimeException("Not OWLIndividual");
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public OWLObjectProperty asOWLObjectProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3065);
        __CLR4_5_22c32c3lviclfci.R.inc(3066);throw new OWLRuntimeException("Not OWLObjectProperty");
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isBuiltIn() {try{__CLR4_5_22c32c3lviclfci.R.inc(3067);
        __CLR4_5_22c32c3lviclfci.R.inc(3068);return OWLRDFVocabulary.BUILT_IN_ANNOTATION_PROPERTY_IRIS
                .contains(getIRI());
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLClass() {try{__CLR4_5_22c32c3lviclfci.R.inc(3069);
        __CLR4_5_22c32c3lviclfci.R.inc(3070);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLDataProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3071);
        __CLR4_5_22c32c3lviclfci.R.inc(3072);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLDatatype() {try{__CLR4_5_22c32c3lviclfci.R.inc(3073);
        __CLR4_5_22c32c3lviclfci.R.inc(3074);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLNamedIndividual() {try{__CLR4_5_22c32c3lviclfci.R.inc(3075);
        __CLR4_5_22c32c3lviclfci.R.inc(3076);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLObjectProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3077);
        __CLR4_5_22c32c3lviclfci.R.inc(3078);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty asOWLAnnotationProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3079);
        __CLR4_5_22c32c3lviclfci.R.inc(3080);return this;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLAnnotationProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3081);
        __CLR4_5_22c32c3lviclfci.R.inc(3082);return true;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public void accept(OWLNamedObjectVisitor visitor) {try{__CLR4_5_22c32c3lviclfci.R.inc(3083);
        __CLR4_5_22c32c3lviclfci.R.inc(3084);visitor.visit(this);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLNamedObjectVisitorEx<O> visitor) {try{__CLR4_5_22c32c3lviclfci.R.inc(3085);
        __CLR4_5_22c32c3lviclfci.R.inc(3086);return visitor.visit(this);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_22c32c3lviclfci.R.inc(3087);
        __CLR4_5_22c32c3lviclfci.R.inc(3088);if ((((obj == this)&&(__CLR4_5_22c32c3lviclfci.R.iget(3089)!=0|true))||(__CLR4_5_22c32c3lviclfci.R.iget(3090)==0&false))) {{
            __CLR4_5_22c32c3lviclfci.R.inc(3091);return true;
        }
        }__CLR4_5_22c32c3lviclfci.R.inc(3092);if ((((!(obj instanceof OWLAnnotationProperty))&&(__CLR4_5_22c32c3lviclfci.R.iget(3093)!=0|true))||(__CLR4_5_22c32c3lviclfci.R.iget(3094)==0&false))) {{
            __CLR4_5_22c32c3lviclfci.R.inc(3095);return false;
        }
        }__CLR4_5_22c32c3lviclfci.R.inc(3096);OWLAnnotationProperty other = (OWLAnnotationProperty) obj;
        __CLR4_5_22c32c3lviclfci.R.inc(3097);return iri.equals(other.getIRI());
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_22c32c3lviclfci.R.inc(3098);
        __CLR4_5_22c32c3lviclfci.R.inc(3099);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public void accept(OWLPropertyExpressionVisitor visitor) {try{__CLR4_5_22c32c3lviclfci.R.inc(3100);
        __CLR4_5_22c32c3lviclfci.R.inc(3101);visitor.visit(this);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isDataPropertyExpression() {try{__CLR4_5_22c32c3lviclfci.R.inc(3102);
        __CLR4_5_22c32c3lviclfci.R.inc(3103);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isObjectPropertyExpression() {try{__CLR4_5_22c32c3lviclfci.R.inc(3104);
        __CLR4_5_22c32c3lviclfci.R.inc(3105);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLTopObjectProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3106);
        __CLR4_5_22c32c3lviclfci.R.inc(3107);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLBottomObjectProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3108);
        __CLR4_5_22c32c3lviclfci.R.inc(3109);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLTopDataProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3110);
        __CLR4_5_22c32c3lviclfci.R.inc(3111);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public boolean isOWLBottomDataProperty() {try{__CLR4_5_22c32c3lviclfci.R.inc(3112);
        __CLR4_5_22c32c3lviclfci.R.inc(3113);return false;
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_22c32c3lviclfci.R.inc(3114);
        __CLR4_5_22c32c3lviclfci.R.inc(3115);entities.add(this);
    }finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_22c32c3lviclfci.R.inc(3116);}finally{__CLR4_5_22c32c3lviclfci.R.flushNeeded();}}
}
