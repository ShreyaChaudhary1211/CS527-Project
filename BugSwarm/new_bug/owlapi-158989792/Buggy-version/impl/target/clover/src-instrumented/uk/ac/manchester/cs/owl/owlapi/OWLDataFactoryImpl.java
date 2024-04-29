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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.VersionInfo;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLDataFactoryImpl implements OWLDataFactory, Serializable,
    OWLClassProvider {public static class __CLR4_5_22z62z6lviclfjl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,4605,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    // Distinguished Entities
    //@formatter:off 
    @Nonnull private static final OWLClass               OWL_THING                    = new OWLClassImpl(              OWLRDFVocabulary.OWL_THING.getIRI());
    @Nonnull private static final OWLClass               OWL_NOTHING                  = new OWLClassImpl(              OWLRDFVocabulary.OWL_NOTHING.getIRI());
    @Nonnull private static final OWLAnnotationProperty  RDFS_LABEL                   = new OWLAnnotationPropertyImpl( OWLRDFVocabulary.RDFS_LABEL.getIRI());
    @Nonnull private static final OWLAnnotationProperty  RDFS_COMMENT                 = new OWLAnnotationPropertyImpl( OWLRDFVocabulary.RDFS_COMMENT.getIRI());
    @Nonnull private static final OWLAnnotationProperty  RDFS_SEE_ALSO                = new OWLAnnotationPropertyImpl( OWLRDFVocabulary.RDFS_SEE_ALSO.getIRI());
    @Nonnull private static final OWLAnnotationProperty  RDFS_IS_DEFINED_BY           = new OWLAnnotationPropertyImpl( OWLRDFVocabulary.RDFS_IS_DEFINED_BY.getIRI());
    @Nonnull private static final OWLAnnotationProperty  OWL_BACKWARD_COMPATIBLE_WITH = new OWLAnnotationPropertyImpl( OWLRDFVocabulary.OWL_BACKWARD_COMPATIBLE_WITH.getIRI());
    @Nonnull private static final OWLAnnotationProperty  OWL_INCOMPATIBLE_WITH        = new OWLAnnotationPropertyImpl( OWLRDFVocabulary.OWL_INCOMPATIBLE_WITH.getIRI());
    @Nonnull private static final OWLAnnotationProperty  OWL_VERSION_INFO             = new OWLAnnotationPropertyImpl( OWLRDFVocabulary.OWL_VERSION_INFO.getIRI());
    @Nonnull private static final OWLAnnotationProperty  OWL_DEPRECATED               = new OWLAnnotationPropertyImpl( OWLRDFVocabulary.OWL_DEPRECATED.getIRI());
    @Nonnull private static final OWLObjectProperty      OWL_TOP_OBJECT_PROPERTY      = new OWLObjectPropertyImpl(     OWLRDFVocabulary.OWL_TOP_OBJECT_PROPERTY.getIRI());
    @Nonnull private static final OWLObjectProperty      OWL_BOTTOM_OBJECT_PROPERTY   = new OWLObjectPropertyImpl(     OWLRDFVocabulary.OWL_BOTTOM_OBJECT_PROPERTY.getIRI());
    @Nonnull private static final OWLDataProperty        OWL_TOP_DATA_PROPERTY        = new OWLDataPropertyImpl(       OWLRDFVocabulary.OWL_TOP_DATA_PROPERTY.getIRI());
    @Nonnull private static final OWLDataProperty        OWL_BOTTOM_DATA_PROPERTY     = new OWLDataPropertyImpl(       OWLRDFVocabulary.OWL_BOTTOM_DATA_PROPERTY.getIRI());
    //@formatter:on
    private final OWLDataFactoryInternals dataFactoryInternals;

    /**
     * Constructs an OWLDataFactoryImpl that uses caching but no compression.
     */
    public OWLDataFactoryImpl() {
        this(new OWLDataFactoryInternalsImpl(false));__CLR4_5_22z62z6lviclfjl.R.inc(3859);try{__CLR4_5_22z62z6lviclfjl.R.inc(3858);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Inject
    public OWLDataFactoryImpl(OWLDataFactoryInternals dataFactoryInternals) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3860);
        __CLR4_5_22z62z6lviclfjl.R.inc(3861);this.dataFactoryInternals = verifyNotNull(dataFactoryInternals);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public void purge() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3862);
        __CLR4_5_22z62z6lviclfjl.R.inc(3863);dataFactoryInternals.purge();
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    private static void checkAnnotations(@Nonnull Set<? extends OWLAnnotation> o) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3864);
        __CLR4_5_22z62z6lviclfjl.R.inc(3865);checkNull(o, "annotations cannot be null", true);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    private static void checkNull(@Nonnull Collection<?> o, String name,
        boolean emptyAllowed) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3866);
        __CLR4_5_22z62z6lviclfjl.R.inc(3867);checkNotNull(o, name + " cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3868);if ((((!emptyAllowed && o.isEmpty())&&(__CLR4_5_22z62z6lviclfjl.R.iget(3869)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(3870)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(3871);throw new IllegalArgumentException(name + " cannot be empty");
        }
    }}finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    private static void checkNull(@Nonnull Object[] o, String name,
        boolean emptyAllowed) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3872);
        __CLR4_5_22z62z6lviclfjl.R.inc(3873);checkNotNull(o, name + " cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3874);if ((((!emptyAllowed && o.length == 0)&&(__CLR4_5_22z62z6lviclfjl.R.iget(3875)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(3876)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(3877);throw new IllegalArgumentException(name + " cannot be empty");
        }
    }}finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    @SuppressWarnings("unchecked")
    public <E extends OWLEntity> E getOWLEntity(
        @Nonnull EntityType<E> entityType, IRI iri) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3878);
        __CLR4_5_22z62z6lviclfjl.R.inc(3879);checkNotNull(entityType, "entityType cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3880);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3881);E ret = null;
        __CLR4_5_22z62z6lviclfjl.R.inc(3882);if ((((entityType.equals(EntityType.CLASS))&&(__CLR4_5_22z62z6lviclfjl.R.iget(3883)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(3884)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(3885);ret = (E) getOWLClass(iri);
        } }else {__CLR4_5_22z62z6lviclfjl.R.inc(3886);if ((((entityType.equals(EntityType.OBJECT_PROPERTY))&&(__CLR4_5_22z62z6lviclfjl.R.iget(3887)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(3888)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(3889);ret = (E) getOWLObjectProperty(iri);
        } }else {__CLR4_5_22z62z6lviclfjl.R.inc(3890);if ((((entityType.equals(EntityType.DATA_PROPERTY))&&(__CLR4_5_22z62z6lviclfjl.R.iget(3891)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(3892)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(3893);ret = (E) getOWLDataProperty(iri);
        } }else {__CLR4_5_22z62z6lviclfjl.R.inc(3894);if ((((entityType.equals(EntityType.ANNOTATION_PROPERTY))&&(__CLR4_5_22z62z6lviclfjl.R.iget(3895)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(3896)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(3897);ret = (E) getOWLAnnotationProperty(iri);
        } }else {__CLR4_5_22z62z6lviclfjl.R.inc(3898);if ((((entityType.equals(EntityType.NAMED_INDIVIDUAL))&&(__CLR4_5_22z62z6lviclfjl.R.iget(3899)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(3900)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(3901);ret = (E) getOWLNamedIndividual(iri);
        } }else {__CLR4_5_22z62z6lviclfjl.R.inc(3902);if ((((entityType.equals(EntityType.DATATYPE))&&(__CLR4_5_22z62z6lviclfjl.R.iget(3903)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(3904)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(3905);ret = (E) getOWLDatatype(iri);
        }
        }}}}}}__CLR4_5_22z62z6lviclfjl.R.inc(3906);if ((((ret != null)&&(__CLR4_5_22z62z6lviclfjl.R.iget(3907)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(3908)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(3909);return ret;
        }
        }__CLR4_5_22z62z6lviclfjl.R.inc(3910);throw new OWLRuntimeException("Entity type not recognized: "
            + entityType + " for iri " + iri);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLClass getOWLClass(IRI iri) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3911);
        __CLR4_5_22z62z6lviclfjl.R.inc(3912);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3913);return dataFactoryInternals.getOWLClass(iri);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLClass getOWLClass(String abbreviatedIRI,
        @Nonnull PrefixManager prefixManager) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3914);
        __CLR4_5_22z62z6lviclfjl.R.inc(3915);checkNotNull(abbreviatedIRI, "iri cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3916);checkNotNull(prefixManager, "prefixManager cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3917);return getOWLClass(prefixManager.getIRI(abbreviatedIRI));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty getOWLAnnotationProperty(
        String abbreviatedIRI, @Nonnull PrefixManager prefixManager) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3918);
        __CLR4_5_22z62z6lviclfjl.R.inc(3919);checkNotNull(abbreviatedIRI, "abbreviatedIRI cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3920);checkNotNull(prefixManager, "prefixManager cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3921);return getOWLAnnotationProperty(prefixManager.getIRI(abbreviatedIRI));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationProperty getRDFSLabel() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3922);
        __CLR4_5_22z62z6lviclfjl.R.inc(3923);return RDFS_LABEL;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationProperty getRDFSComment() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3924);
        __CLR4_5_22z62z6lviclfjl.R.inc(3925);return RDFS_COMMENT;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationProperty getRDFSSeeAlso() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3926);
        __CLR4_5_22z62z6lviclfjl.R.inc(3927);return RDFS_SEE_ALSO;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationProperty getRDFSIsDefinedBy() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3928);
        __CLR4_5_22z62z6lviclfjl.R.inc(3929);return RDFS_IS_DEFINED_BY;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationProperty getOWLVersionInfo() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3930);
        __CLR4_5_22z62z6lviclfjl.R.inc(3931);return OWL_VERSION_INFO;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationProperty getOWLBackwardCompatibleWith() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3932);
        __CLR4_5_22z62z6lviclfjl.R.inc(3933);return OWL_BACKWARD_COMPATIBLE_WITH;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationProperty getOWLIncompatibleWith() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3934);
        __CLR4_5_22z62z6lviclfjl.R.inc(3935);return OWL_INCOMPATIBLE_WITH;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationProperty getOWLDeprecated() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3936);
        __CLR4_5_22z62z6lviclfjl.R.inc(3937);return OWL_DEPRECATED;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatype getOWLDatatype(String abbreviatedIRI,
        @Nonnull PrefixManager prefixManager) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3938);
        __CLR4_5_22z62z6lviclfjl.R.inc(3939);checkNotNull(abbreviatedIRI, "abbreviatedIRI cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3940);checkNotNull(prefixManager, "prefixManager cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3941);return dataFactoryInternals.getOWLDatatype(prefixManager.getIRI(abbreviatedIRI));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLClass getOWLThing() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3942);
        __CLR4_5_22z62z6lviclfjl.R.inc(3943);return OWL_THING;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLClass getOWLNothing() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3944);
        __CLR4_5_22z62z6lviclfjl.R.inc(3945);return OWL_NOTHING;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataProperty getOWLBottomDataProperty() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3946);
        __CLR4_5_22z62z6lviclfjl.R.inc(3947);return OWL_BOTTOM_DATA_PROPERTY;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectProperty getOWLBottomObjectProperty() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3948);
        __CLR4_5_22z62z6lviclfjl.R.inc(3949);return OWL_BOTTOM_OBJECT_PROPERTY;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataProperty getOWLTopDataProperty() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3950);
        __CLR4_5_22z62z6lviclfjl.R.inc(3951);return OWL_TOP_DATA_PROPERTY;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectProperty getOWLTopObjectProperty() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3952);
        __CLR4_5_22z62z6lviclfjl.R.inc(3953);return OWL_TOP_OBJECT_PROPERTY;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLObjectProperty getOWLObjectProperty(IRI iri) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3954);
        __CLR4_5_22z62z6lviclfjl.R.inc(3955);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3956);return dataFactoryInternals.getOWLObjectProperty(iri);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDataProperty getOWLDataProperty(IRI iri) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3957);
        __CLR4_5_22z62z6lviclfjl.R.inc(3958);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3959);return dataFactoryInternals.getOWLDataProperty(iri);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual getOWLNamedIndividual(IRI iri) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3960);
        __CLR4_5_22z62z6lviclfjl.R.inc(3961);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3962);return dataFactoryInternals.getOWLNamedIndividual(iri);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDataProperty getOWLDataProperty(String abbreviatedIRI,
        @Nonnull PrefixManager prefixManager) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3963);
        __CLR4_5_22z62z6lviclfjl.R.inc(3964);checkNotNull(abbreviatedIRI, "curi canno be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3965);checkNotNull(prefixManager, "prefixManager cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3966);return getOWLDataProperty(prefixManager.getIRI(abbreviatedIRI));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual getOWLNamedIndividual(String abbreviatedIRI,
        @Nonnull PrefixManager prefixManager) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3967);
        __CLR4_5_22z62z6lviclfjl.R.inc(3968);checkNotNull(abbreviatedIRI, "curi canno be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3969);checkNotNull(prefixManager, "prefixManager cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3970);return getOWLNamedIndividual(prefixManager.getIRI(abbreviatedIRI));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLObjectProperty getOWLObjectProperty(String abbreviatedIRI,
        @Nonnull PrefixManager prefixManager) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3971);
        __CLR4_5_22z62z6lviclfjl.R.inc(3972);checkNotNull(abbreviatedIRI, "curi canno be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3973);checkNotNull(prefixManager, "prefixManager cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3974);return getOWLObjectProperty(prefixManager.getIRI(abbreviatedIRI));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnonymousIndividual getOWLAnonymousIndividual(String nodeId) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3975);
        __CLR4_5_22z62z6lviclfjl.R.inc(3976);checkNotNull(nodeId, "id cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3977);return new OWLAnonymousIndividualImpl(NodeID.getNodeID(nodeId));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnonymousIndividual getOWLAnonymousIndividual() {try{__CLR4_5_22z62z6lviclfjl.R.inc(3978);
        __CLR4_5_22z62z6lviclfjl.R.inc(3979);return new OWLAnonymousIndividualImpl(NodeID.getNodeID(null));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatype getOWLDatatype(IRI iri) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3980);
        __CLR4_5_22z62z6lviclfjl.R.inc(3981);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3982);return dataFactoryInternals.getOWLDatatype(iri);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(String lexicalValue,
        @Nonnull OWL2Datatype datatype) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3983);
        __CLR4_5_22z62z6lviclfjl.R.inc(3984);checkNotNull(lexicalValue, "lexicalValue cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3985);checkNotNull(datatype, "datatype cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3986);return getOWLLiteral(lexicalValue, getOWLDatatype(datatype.getIRI()));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(boolean value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3987);
        __CLR4_5_22z62z6lviclfjl.R.inc(3988);return dataFactoryInternals.getOWLLiteral(value);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataOneOf getOWLDataOneOf(
        @Nonnull Set<? extends OWLLiteral> values) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3989);
        __CLR4_5_22z62z6lviclfjl.R.inc(3990);checkNull(values, "values", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(3991);return new OWLDataOneOfImpl(values);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDataOneOf getOWLDataOneOf(OWLLiteral... values) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3992);
        __CLR4_5_22z62z6lviclfjl.R.inc(3993);checkNull(values, "values", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(3994);return getOWLDataOneOf(CollectionFactory.createSet(values));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataComplementOf getOWLDataComplementOf(OWLDataRange dataRange) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3995);
        __CLR4_5_22z62z6lviclfjl.R.inc(3996);checkNotNull(dataRange, "dataRange cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(3997);return new OWLDataComplementOfImpl(dataRange);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDataIntersectionOf getOWLDataIntersectionOf(
        OWLDataRange... dataRanges) {try{__CLR4_5_22z62z6lviclfjl.R.inc(3998);
        __CLR4_5_22z62z6lviclfjl.R.inc(3999);checkNull(dataRanges, "dataRanges", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4000);return getOWLDataIntersectionOf(CollectionFactory.createSet(dataRanges));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataIntersectionOf getOWLDataIntersectionOf(
        @Nonnull Set<? extends OWLDataRange> dataRanges) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4001);
        __CLR4_5_22z62z6lviclfjl.R.inc(4002);checkNull(dataRanges, "dataRanges", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4003);return new OWLDataIntersectionOfImpl(dataRanges);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDataUnionOf getOWLDataUnionOf(OWLDataRange... dataRanges) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4004);
        __CLR4_5_22z62z6lviclfjl.R.inc(4005);checkNull(dataRanges, "dataRanges", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4006);return getOWLDataUnionOf(CollectionFactory.createSet(dataRanges));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataUnionOf getOWLDataUnionOf(
        @Nonnull Set<? extends OWLDataRange> dataRanges) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4007);
        __CLR4_5_22z62z6lviclfjl.R.inc(4008);checkNull(dataRanges, "dataRanges", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4009);return new OWLDataUnionOfImpl(dataRanges);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDatatypeRestriction getOWLDatatypeRestriction(
        OWLDatatype dataType,
        @Nonnull Set<OWLFacetRestriction> facetRestrictions) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4010);
        __CLR4_5_22z62z6lviclfjl.R.inc(4011);checkNotNull(dataType, "datatype cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4012);checkNull(facetRestrictions, "facets", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4013);return new OWLDatatypeRestrictionImpl(dataType, facetRestrictions);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDatatypeRestriction getOWLDatatypeRestriction(
        OWLDatatype dataType, OWLFacet facet, OWLLiteral typedLiteral) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4014);
        __CLR4_5_22z62z6lviclfjl.R.inc(4015);checkNotNull(dataType, "datatype cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4016);checkNotNull(facet, "facet cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4017);checkNotNull(typedLiteral, "typedConstant cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4018);return new OWLDatatypeRestrictionImpl(dataType,
            CollectionFactory.createSet(getOWLFacetRestriction(facet,
                typedLiteral)));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeRestriction(
        OWLDatatype dataType, OWLFacetRestriction... facetRestrictions) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4019);
        __CLR4_5_22z62z6lviclfjl.R.inc(4020);checkNull(facetRestrictions, "facetRestrictions", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4021);return getOWLDatatypeRestriction(dataType,
            CollectionFactory.createSet(facetRestrictions));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMinInclusiveRestriction(
        int minInclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4022);
        __CLR4_5_22z62z6lviclfjl.R.inc(4023);return getOWLDatatypeRestriction(getIntegerOWLDatatype(),
            OWLFacet.MIN_INCLUSIVE, getOWLLiteral(minInclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMaxInclusiveRestriction(
        int maxInclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4024);
        __CLR4_5_22z62z6lviclfjl.R.inc(4025);return getOWLDatatypeRestriction(getIntegerOWLDatatype(),
            OWLFacet.MAX_INCLUSIVE, getOWLLiteral(maxInclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMinMaxInclusiveRestriction(
        int minInclusive, int maxInclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4026);
        __CLR4_5_22z62z6lviclfjl.R.inc(4027);return getOWLDatatypeRestriction(
            getIntegerOWLDatatype(),
            getOWLFacetRestriction(OWLFacet.MIN_INCLUSIVE,
                getOWLLiteral(minInclusive)),
            getOWLFacetRestriction(OWLFacet.MAX_INCLUSIVE, maxInclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMinExclusiveRestriction(
        int minExclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4028);
        __CLR4_5_22z62z6lviclfjl.R.inc(4029);return getOWLDatatypeRestriction(getIntegerOWLDatatype(),
            OWLFacet.MIN_EXCLUSIVE, getOWLLiteral(minExclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMaxExclusiveRestriction(
        int maxExclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4030);
        __CLR4_5_22z62z6lviclfjl.R.inc(4031);return getOWLDatatypeRestriction(getIntegerOWLDatatype(),
            OWLFacet.MAX_EXCLUSIVE, getOWLLiteral(maxExclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMinMaxExclusiveRestriction(
        int minExclusive, int maxExclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4032);
        __CLR4_5_22z62z6lviclfjl.R.inc(4033);return getOWLDatatypeRestriction(
            getIntegerOWLDatatype(),
            getOWLFacetRestriction(OWLFacet.MIN_EXCLUSIVE,
                getOWLLiteral(minExclusive)),
            getOWLFacetRestriction(OWLFacet.MAX_EXCLUSIVE, maxExclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMinInclusiveRestriction(
        double minInclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4034);
        __CLR4_5_22z62z6lviclfjl.R.inc(4035);return getOWLDatatypeRestriction(getDoubleOWLDatatype(),
            OWLFacet.MIN_INCLUSIVE, getOWLLiteral(minInclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMaxInclusiveRestriction(
        double maxInclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4036);
        __CLR4_5_22z62z6lviclfjl.R.inc(4037);return getOWLDatatypeRestriction(getDoubleOWLDatatype(),
            OWLFacet.MAX_INCLUSIVE, getOWLLiteral(maxInclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMinMaxInclusiveRestriction(
        double minInclusive, double maxInclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4038);
        __CLR4_5_22z62z6lviclfjl.R.inc(4039);return getOWLDatatypeRestriction(
            getDoubleOWLDatatype(),
            getOWLFacetRestriction(OWLFacet.MIN_INCLUSIVE,
                getOWLLiteral(minInclusive)),
            getOWLFacetRestriction(OWLFacet.MAX_INCLUSIVE, maxInclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMinExclusiveRestriction(
        double minExclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4040);
        __CLR4_5_22z62z6lviclfjl.R.inc(4041);return getOWLDatatypeRestriction(getDoubleOWLDatatype(),
            OWLFacet.MIN_EXCLUSIVE, getOWLLiteral(minExclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMaxExclusiveRestriction(
        double maxExclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4042);
        __CLR4_5_22z62z6lviclfjl.R.inc(4043);return getOWLDatatypeRestriction(getDoubleOWLDatatype(),
            OWLFacet.MAX_EXCLUSIVE, getOWLLiteral(maxExclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatypeRestriction getOWLDatatypeMinMaxExclusiveRestriction(
        double minExclusive, double maxExclusive) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4044);
        __CLR4_5_22z62z6lviclfjl.R.inc(4045);return getOWLDatatypeRestriction(
            getDoubleOWLDatatype(),
            getOWLFacetRestriction(OWLFacet.MIN_EXCLUSIVE,
                getOWLLiteral(minExclusive)),
            getOWLFacetRestriction(OWLFacet.MAX_EXCLUSIVE, maxExclusive));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLFacetRestriction getOWLFacetRestriction(OWLFacet facet,
        int facetValue) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4046);
        __CLR4_5_22z62z6lviclfjl.R.inc(4047);return getOWLFacetRestriction(facet, getOWLLiteral(facetValue));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLFacetRestriction getOWLFacetRestriction(OWLFacet facet,
        double facetValue) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4048);
        __CLR4_5_22z62z6lviclfjl.R.inc(4049);return getOWLFacetRestriction(facet, getOWLLiteral(facetValue));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLFacetRestriction getOWLFacetRestriction(OWLFacet facet,
        float facetValue) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4050);
        __CLR4_5_22z62z6lviclfjl.R.inc(4051);return getOWLFacetRestriction(facet, getOWLLiteral(facetValue));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLFacetRestriction getOWLFacetRestriction(OWLFacet facet,
        OWLLiteral facetValue) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4052);
        __CLR4_5_22z62z6lviclfjl.R.inc(4053);checkNotNull(facet, "facet cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4054);checkNotNull(facetValue, "facetValue cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4055);return new OWLFacetRestrictionImpl(facet, facetValue);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectIntersectionOf getOWLObjectIntersectionOf(
        @Nonnull Set<? extends OWLClassExpression> operands) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4056);
        __CLR4_5_22z62z6lviclfjl.R.inc(4057);checkNull(operands, "operands", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4058);return new OWLObjectIntersectionOfImpl(operands);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLObjectIntersectionOf getOWLObjectIntersectionOf(
        OWLClassExpression... operands) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4059);
        __CLR4_5_22z62z6lviclfjl.R.inc(4060);checkNull(operands, "operands", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4061);return getOWLObjectIntersectionOf(CollectionFactory.createSet(operands));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataAllValuesFrom getOWLDataAllValuesFrom(
        OWLDataPropertyExpression property, OWLDataRange dataRange) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4062);
        __CLR4_5_22z62z6lviclfjl.R.inc(4063);checkNotNull(dataRange, "dataRange cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4064);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4065);return new OWLDataAllValuesFromImpl(property, dataRange);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataExactCardinality getOWLDataExactCardinality(int cardinality,
        OWLDataPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4066);
        __CLR4_5_22z62z6lviclfjl.R.inc(4067);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4068);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4069);return new OWLDataExactCardinalityImpl(property, cardinality,
            getTopDatatype());
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataExactCardinality getOWLDataExactCardinality(int cardinality,
        OWLDataPropertyExpression property, OWLDataRange dataRange) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4070);
        __CLR4_5_22z62z6lviclfjl.R.inc(4071);checkNotNull(dataRange, "dataRange cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4072);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4073);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4074);return new OWLDataExactCardinalityImpl(property, cardinality, dataRange);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataMaxCardinality getOWLDataMaxCardinality(int cardinality,
        OWLDataPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4075);
        __CLR4_5_22z62z6lviclfjl.R.inc(4076);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4077);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4078);return new OWLDataMaxCardinalityImpl(property, cardinality,
            getTopDatatype());
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataMaxCardinality getOWLDataMaxCardinality(int cardinality,
        OWLDataPropertyExpression property, OWLDataRange dataRange) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4079);
        __CLR4_5_22z62z6lviclfjl.R.inc(4080);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4081);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4082);checkNotNull(dataRange, "dataRange cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4083);return new OWLDataMaxCardinalityImpl(property, cardinality, dataRange);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataMinCardinality getOWLDataMinCardinality(int cardinality,
        OWLDataPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4084);
        __CLR4_5_22z62z6lviclfjl.R.inc(4085);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4086);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4087);return new OWLDataMinCardinalityImpl(property, cardinality,
            getTopDatatype());
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataMinCardinality getOWLDataMinCardinality(int cardinality,
        OWLDataPropertyExpression property, OWLDataRange dataRange) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4088);
        __CLR4_5_22z62z6lviclfjl.R.inc(4089);checkNotNull(dataRange, "dataRange cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4090);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4091);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4092);return new OWLDataMinCardinalityImpl(property, cardinality, dataRange);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataSomeValuesFrom getOWLDataSomeValuesFrom(
        OWLDataPropertyExpression property, OWLDataRange dataRange) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4093);
        __CLR4_5_22z62z6lviclfjl.R.inc(4094);checkNotNull(dataRange, "dataRange cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4095);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4096);return new OWLDataSomeValuesFromImpl(property, dataRange);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataHasValue getOWLDataHasValue(
        OWLDataPropertyExpression property, OWLLiteral value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4097);
        __CLR4_5_22z62z6lviclfjl.R.inc(4098);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4099);checkNotNull(value, "value cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4100);return new OWLDataHasValueImpl(property, value);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectComplementOf getOWLObjectComplementOf(
        OWLClassExpression operand) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4101);
        __CLR4_5_22z62z6lviclfjl.R.inc(4102);checkNotNull(operand, "operand");
        __CLR4_5_22z62z6lviclfjl.R.inc(4103);return new OWLObjectComplementOfImpl(operand);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectAllValuesFrom getOWLObjectAllValuesFrom(
        OWLObjectPropertyExpression property,
        OWLClassExpression classExpression) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4104);
        __CLR4_5_22z62z6lviclfjl.R.inc(4105);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4106);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4107);return new OWLObjectAllValuesFromImpl(property, classExpression);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectOneOf getOWLObjectOneOf(
        @Nonnull Set<? extends OWLIndividual> values) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4108);
        __CLR4_5_22z62z6lviclfjl.R.inc(4109);checkNull(values, "values", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4110);return new OWLObjectOneOfImpl(values);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLObjectOneOf getOWLObjectOneOf(OWLIndividual... individuals) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4111);
        __CLR4_5_22z62z6lviclfjl.R.inc(4112);checkNull(individuals, "individuals", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4113);return getOWLObjectOneOf(CollectionFactory.createSet(individuals));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectExactCardinality getOWLObjectExactCardinality(
        int cardinality, OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4114);
        __CLR4_5_22z62z6lviclfjl.R.inc(4115);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4116);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4117);return new OWLObjectExactCardinalityImpl(property, cardinality,
            OWL_THING);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectExactCardinality getOWLObjectExactCardinality(
        int cardinality, OWLObjectPropertyExpression property,
        OWLClassExpression classExpression) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4118);
        __CLR4_5_22z62z6lviclfjl.R.inc(4119);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4120);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4121);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4122);return new OWLObjectExactCardinalityImpl(property, cardinality,
            classExpression);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectMinCardinality getOWLObjectMinCardinality(int cardinality,
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4123);
        __CLR4_5_22z62z6lviclfjl.R.inc(4124);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4125);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4126);return new OWLObjectMinCardinalityImpl(property, cardinality, OWL_THING);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectMinCardinality getOWLObjectMinCardinality(int cardinality,
        OWLObjectPropertyExpression property,
        OWLClassExpression classExpression) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4127);
        __CLR4_5_22z62z6lviclfjl.R.inc(4128);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4129);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4130);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4131);return new OWLObjectMinCardinalityImpl(property, cardinality,
            classExpression);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectMaxCardinality getOWLObjectMaxCardinality(int cardinality,
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4132);
        __CLR4_5_22z62z6lviclfjl.R.inc(4133);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4134);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4135);return new OWLObjectMaxCardinalityImpl(property, cardinality, OWL_THING);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectMaxCardinality getOWLObjectMaxCardinality(int cardinality,
        OWLObjectPropertyExpression property,
        OWLClassExpression classExpression) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4136);
        __CLR4_5_22z62z6lviclfjl.R.inc(4137);checkNotNegative(cardinality, "cardinality cannot be negative");
        __CLR4_5_22z62z6lviclfjl.R.inc(4138);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4139);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4140);return new OWLObjectMaxCardinalityImpl(property, cardinality,
            classExpression);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectHasSelf getOWLObjectHasSelf(
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4141);
        __CLR4_5_22z62z6lviclfjl.R.inc(4142);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4143);return new OWLObjectHasSelfImpl(property);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectSomeValuesFrom getOWLObjectSomeValuesFrom(
        OWLObjectPropertyExpression property,
        OWLClassExpression classExpression) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4144);
        __CLR4_5_22z62z6lviclfjl.R.inc(4145);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4146);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4147);return new OWLObjectSomeValuesFromImpl(property, classExpression);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectHasValue getOWLObjectHasValue(
        OWLObjectPropertyExpression property, OWLIndividual individual) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4148);
        __CLR4_5_22z62z6lviclfjl.R.inc(4149);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4150);checkNotNull(individual, "individual cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4151);return new OWLObjectHasValueImpl(property, individual);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectUnionOf getOWLObjectUnionOf(
        @Nonnull Set<? extends OWLClassExpression> operands) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4152);
        __CLR4_5_22z62z6lviclfjl.R.inc(4153);checkNull(operands, "operands", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4154);return new OWLObjectUnionOfImpl(operands);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLObjectUnionOf getOWLObjectUnionOf(OWLClassExpression... operands) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4155);
        __CLR4_5_22z62z6lviclfjl.R.inc(4156);checkNull(operands, "operands", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4157);return getOWLObjectUnionOf(CollectionFactory.createSet(operands));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAsymmetricObjectPropertyAxiom getOWLAsymmetricObjectPropertyAxiom(
        OWLObjectPropertyExpression propertyExpression,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4158);
        __CLR4_5_22z62z6lviclfjl.R.inc(4159);checkNotNull(propertyExpression, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4160);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4161);return new OWLAsymmetricObjectPropertyAxiomImpl(propertyExpression,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAsymmetricObjectPropertyAxiom getOWLAsymmetricObjectPropertyAxiom(
        OWLObjectPropertyExpression propertyExpression) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4162);
        __CLR4_5_22z62z6lviclfjl.R.inc(4163);return getOWLAsymmetricObjectPropertyAxiom(propertyExpression,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyDomainAxiom getOWLDataPropertyDomainAxiom(
        OWLDataPropertyExpression property, OWLClassExpression domain,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4164);
        __CLR4_5_22z62z6lviclfjl.R.inc(4165);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4166);checkNotNull(domain, "domain cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4167);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4168);return new OWLDataPropertyDomainAxiomImpl(property, domain, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyDomainAxiom getOWLDataPropertyDomainAxiom(
        OWLDataPropertyExpression property, OWLClassExpression domain) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4169);
        __CLR4_5_22z62z6lviclfjl.R.inc(4170);return getOWLDataPropertyDomainAxiom(property, domain,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyRangeAxiom getOWLDataPropertyRangeAxiom(
        OWLDataPropertyExpression property, OWLDataRange owlDataRange,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4171);
        __CLR4_5_22z62z6lviclfjl.R.inc(4172);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4173);checkNotNull(owlDataRange, "owlDataRange cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4174);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4175);return new OWLDataPropertyRangeAxiomImpl(property, owlDataRange,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyRangeAxiom getOWLDataPropertyRangeAxiom(
        OWLDataPropertyExpression property, OWLDataRange owlDataRange) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4176);
        __CLR4_5_22z62z6lviclfjl.R.inc(4177);return getOWLDataPropertyRangeAxiom(property, owlDataRange,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubDataPropertyOfAxiom getOWLSubDataPropertyOfAxiom(
        OWLDataPropertyExpression subProperty,
        OWLDataPropertyExpression superProperty,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4178);
        __CLR4_5_22z62z6lviclfjl.R.inc(4179);checkNotNull(subProperty, "subProperty cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4180);checkNotNull(superProperty, "superProperty cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4181);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4182);return new OWLSubDataPropertyOfAxiomImpl(subProperty, superProperty,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubDataPropertyOfAxiom getOWLSubDataPropertyOfAxiom(
        OWLDataPropertyExpression subProperty,
        OWLDataPropertyExpression superProperty) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4183);
        __CLR4_5_22z62z6lviclfjl.R.inc(4184);return getOWLSubDataPropertyOfAxiom(subProperty, superProperty,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDeclarationAxiom getOWLDeclarationAxiom(OWLEntity owlEntity) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4185);
        __CLR4_5_22z62z6lviclfjl.R.inc(4186);return getOWLDeclarationAxiom(owlEntity, EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDeclarationAxiom getOWLDeclarationAxiom(OWLEntity owlEntity,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4187);
        __CLR4_5_22z62z6lviclfjl.R.inc(4188);checkNotNull(owlEntity, "owlEntity cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4189);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4190);return new OWLDeclarationAxiomImpl(owlEntity, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDifferentIndividualsAxiom getOWLDifferentIndividualsAxiom(
        @Nonnull Set<? extends OWLIndividual> individuals,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4191);
        __CLR4_5_22z62z6lviclfjl.R.inc(4192);checkNull(individuals, "individuals", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4193);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4194);return new OWLDifferentIndividualsAxiomImpl(individuals, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDifferentIndividualsAxiom getOWLDifferentIndividualsAxiom(
        OWLIndividual... individuals) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4195);
        __CLR4_5_22z62z6lviclfjl.R.inc(4196);checkNull(individuals, "individuals", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4197);return getOWLDifferentIndividualsAxiom(CollectionFactory
            .createSet(individuals));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDifferentIndividualsAxiom getOWLDifferentIndividualsAxiom(
        @Nonnull Set<? extends OWLIndividual> individuals) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4198);
        __CLR4_5_22z62z6lviclfjl.R.inc(4199);return getOWLDifferentIndividualsAxiom(individuals,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointClassesAxiom getOWLDisjointClassesAxiom(
        @Nonnull Set<? extends OWLClassExpression> classExpressions,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4200);
        __CLR4_5_22z62z6lviclfjl.R.inc(4201);checkNull(classExpressions, "classExpressions", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4202);checkAnnotations(annotations);
        // Hack to handle the case where classExpressions has only a single
        // member
        // which will usually be the result of :x owl:disjointWith :x .
        __CLR4_5_22z62z6lviclfjl.R.inc(4203);if ((((classExpressions.size() == 1)&&(__CLR4_5_22z62z6lviclfjl.R.iget(4204)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(4205)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(4206);Set<OWLClassExpression> modifiedClassExpressions = new HashSet<>(2);
            __CLR4_5_22z62z6lviclfjl.R.inc(4207);OWLClassExpression classExpression = classExpressions.iterator()
                .next();
            __CLR4_5_22z62z6lviclfjl.R.inc(4208);OWLClass addedClass = (((classExpression.isOWLThing() )&&(__CLR4_5_22z62z6lviclfjl.R.iget(4209)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(4210)==0&false))? OWL_NOTHING
                : OWL_THING;
            __CLR4_5_22z62z6lviclfjl.R.inc(4211);modifiedClassExpressions.add(addedClass);
            __CLR4_5_22z62z6lviclfjl.R.inc(4212);modifiedClassExpressions.add(classExpression);
            __CLR4_5_22z62z6lviclfjl.R.inc(4213);return new OWLDisjointClassesAxiomImpl(modifiedClassExpressions,
                makeSingletonDisjoinClassWarningAnnotation(annotations,
                    classExpression, addedClass));
        }
        }__CLR4_5_22z62z6lviclfjl.R.inc(4214);return new OWLDisjointClassesAxiomImpl(classExpressions, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    protected Set<? extends OWLAnnotation> makeSingletonDisjoinClassWarningAnnotation(
        Set<? extends OWLAnnotation> annotations,
        OWLClassExpression classExpression,
        OWLClassExpression addedClass) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4215);
        __CLR4_5_22z62z6lviclfjl.R.inc(4216);Set<OWLAnnotation> modifiedAnnotations = new HashSet<>(
            annotations.size() + 1);
        __CLR4_5_22z62z6lviclfjl.R.inc(4217);modifiedAnnotations.addAll(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4218);String provenanceComment = String.format("%s on %s", VersionInfo
            .getVersionInfo().getGeneratedByMessage(),
            new SimpleDateFormat().format(new Date()));
        __CLR4_5_22z62z6lviclfjl.R.inc(4219);OWLAnnotationImpl provenanceAnnotation = new OWLAnnotationImpl(
            RDFS_COMMENT, getOWLLiteral(provenanceComment),
            EMPTY_ANNOTATIONS_SET);
        __CLR4_5_22z62z6lviclfjl.R.inc(4220);Set<? extends OWLAnnotation> metaAnnotations = Collections
            .singleton(provenanceAnnotation);
        __CLR4_5_22z62z6lviclfjl.R.inc(4221);String changeComment = String.format(
            "DisjointClasses(%s) replaced by DisjointClasses(%s %s)",
            classExpression, classExpression, addedClass);
        __CLR4_5_22z62z6lviclfjl.R.inc(4222);modifiedAnnotations.add(new OWLAnnotationImpl(RDFS_COMMENT,
            getOWLLiteral(changeComment), metaAnnotations));
        __CLR4_5_22z62z6lviclfjl.R.inc(4223);return modifiedAnnotations;
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointClassesAxiom getOWLDisjointClassesAxiom(
        @Nonnull Set<? extends OWLClassExpression> classExpressions) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4224);
        __CLR4_5_22z62z6lviclfjl.R.inc(4225);return getOWLDisjointClassesAxiom(classExpressions,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointClassesAxiom getOWLDisjointClassesAxiom(
        OWLClassExpression... classExpressions) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4226);
        __CLR4_5_22z62z6lviclfjl.R.inc(4227);checkNull(classExpressions, "classExpressions", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4228);Set<OWLClassExpression> clses = new HashSet<>();
        __CLR4_5_22z62z6lviclfjl.R.inc(4229);clses.addAll(Arrays.asList(classExpressions));
        __CLR4_5_22z62z6lviclfjl.R.inc(4230);return getOWLDisjointClassesAxiom(clses);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointDataPropertiesAxiom getOWLDisjointDataPropertiesAxiom(
        @Nonnull Set<? extends OWLDataPropertyExpression> properties,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4231);
        __CLR4_5_22z62z6lviclfjl.R.inc(4232);checkNull(properties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4233);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4234);return new OWLDisjointDataPropertiesAxiomImpl(properties, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointDataPropertiesAxiom getOWLDisjointDataPropertiesAxiom(
        @Nonnull Set<? extends OWLDataPropertyExpression> properties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4235);
        __CLR4_5_22z62z6lviclfjl.R.inc(4236);return getOWLDisjointDataPropertiesAxiom(properties,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDisjointDataPropertiesAxiom getOWLDisjointDataPropertiesAxiom(
        OWLDataPropertyExpression... dataProperties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4237);
        __CLR4_5_22z62z6lviclfjl.R.inc(4238);checkNull(dataProperties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4239);return getOWLDisjointDataPropertiesAxiom(CollectionFactory
            .createSet(dataProperties));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDisjointObjectPropertiesAxiom getOWLDisjointObjectPropertiesAxiom(
        OWLObjectPropertyExpression... properties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4240);
        __CLR4_5_22z62z6lviclfjl.R.inc(4241);checkNull(properties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4242);return getOWLDisjointObjectPropertiesAxiom(CollectionFactory
            .createSet(properties));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointObjectPropertiesAxiom getOWLDisjointObjectPropertiesAxiom(
        @Nonnull Set<? extends OWLObjectPropertyExpression> properties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4243);
        __CLR4_5_22z62z6lviclfjl.R.inc(4244);return getOWLDisjointObjectPropertiesAxiom(properties,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointObjectPropertiesAxiom getOWLDisjointObjectPropertiesAxiom(
        @Nonnull Set<? extends OWLObjectPropertyExpression> properties,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4245);
        __CLR4_5_22z62z6lviclfjl.R.inc(4246);checkNull(properties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4247);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4248);return new OWLDisjointObjectPropertiesAxiomImpl(properties, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLEquivalentClassesAxiom getOWLEquivalentClassesAxiom(
        @Nonnull Set<? extends OWLClassExpression> classExpressions,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4249);
        __CLR4_5_22z62z6lviclfjl.R.inc(4250);checkNull(classExpressions, "classExpressions", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4251);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4252);return new OWLEquivalentClassesAxiomImpl(classExpressions, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLEquivalentClassesAxiom getOWLEquivalentClassesAxiom(
        OWLClassExpression clsA, OWLClassExpression clsB) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4253);
        __CLR4_5_22z62z6lviclfjl.R.inc(4254);checkNotNull(clsA, "clsA cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4255);checkNotNull(clsB, "clsB cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4256);return getOWLEquivalentClassesAxiom(clsA, clsB, EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLEquivalentClassesAxiom getOWLEquivalentClassesAxiom(
        OWLClassExpression clsA, OWLClassExpression clsB,
        Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4257);
        __CLR4_5_22z62z6lviclfjl.R.inc(4258);checkNotNull(clsA, "clsA cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4259);checkNotNull(clsB, "clsB cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4260);return getOWLEquivalentClassesAxiom(
            CollectionFactory.createSet(clsA, clsB), annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLEquivalentClassesAxiom getOWLEquivalentClassesAxiom(
        OWLClassExpression... classExpressions) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4261);
        __CLR4_5_22z62z6lviclfjl.R.inc(4262);checkNull(classExpressions, "classExpressions", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4263);Set<OWLClassExpression> clses = new HashSet<>();
        __CLR4_5_22z62z6lviclfjl.R.inc(4264);clses.addAll(Arrays.asList(classExpressions));
        __CLR4_5_22z62z6lviclfjl.R.inc(4265);return getOWLEquivalentClassesAxiom(clses);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLEquivalentClassesAxiom getOWLEquivalentClassesAxiom(
        @Nonnull Set<? extends OWLClassExpression> classExpressions) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4266);
        __CLR4_5_22z62z6lviclfjl.R.inc(4267);return getOWLEquivalentClassesAxiom(classExpressions,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLEquivalentDataPropertiesAxiom getOWLEquivalentDataPropertiesAxiom(
        @Nonnull Set<? extends OWLDataPropertyExpression> properties,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4268);
        __CLR4_5_22z62z6lviclfjl.R.inc(4269);checkNull(properties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4270);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4271);return new OWLEquivalentDataPropertiesAxiomImpl(properties, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLEquivalentDataPropertiesAxiom getOWLEquivalentDataPropertiesAxiom(
        @Nonnull Set<? extends OWLDataPropertyExpression> properties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4272);
        __CLR4_5_22z62z6lviclfjl.R.inc(4273);return getOWLEquivalentDataPropertiesAxiom(properties,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLEquivalentDataPropertiesAxiom getOWLEquivalentDataPropertiesAxiom(
        OWLDataPropertyExpression propertyA,
        OWLDataPropertyExpression propertyB) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4274);
        __CLR4_5_22z62z6lviclfjl.R.inc(4275);return getOWLEquivalentDataPropertiesAxiom(propertyA, propertyB,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLEquivalentDataPropertiesAxiom getOWLEquivalentDataPropertiesAxiom(
        OWLDataPropertyExpression propertyA,
        OWLDataPropertyExpression propertyB,
        Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4276);
        __CLR4_5_22z62z6lviclfjl.R.inc(4277);checkNotNull(propertyA, "propertyA cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4278);checkNotNull(propertyB, "propertyB cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4279);return getOWLEquivalentDataPropertiesAxiom(
            CollectionFactory.createSet(propertyA, propertyB), annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLEquivalentDataPropertiesAxiom getOWLEquivalentDataPropertiesAxiom(
        OWLDataPropertyExpression... properties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4280);
        __CLR4_5_22z62z6lviclfjl.R.inc(4281);checkNull(properties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4282);return getOWLEquivalentDataPropertiesAxiom(CollectionFactory
            .createSet(properties));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLEquivalentObjectPropertiesAxiom getOWLEquivalentObjectPropertiesAxiom(
        OWLObjectPropertyExpression... properties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4283);
        __CLR4_5_22z62z6lviclfjl.R.inc(4284);checkNull(properties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4285);return getOWLEquivalentObjectPropertiesAxiom(CollectionFactory
            .createSet(properties));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLEquivalentObjectPropertiesAxiom getOWLEquivalentObjectPropertiesAxiom(
        @Nonnull Set<? extends OWLObjectPropertyExpression> properties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4286);
        __CLR4_5_22z62z6lviclfjl.R.inc(4287);return getOWLEquivalentObjectPropertiesAxiom(properties,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLEquivalentObjectPropertiesAxiom getOWLEquivalentObjectPropertiesAxiom(
        OWLObjectPropertyExpression propertyA,
        OWLObjectPropertyExpression propertyB) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4288);
        __CLR4_5_22z62z6lviclfjl.R.inc(4289);checkNotNull(propertyA, "propertyA cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4290);checkNotNull(propertyB, "propertyB cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4291);return getOWLEquivalentObjectPropertiesAxiom(propertyA, propertyB,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLEquivalentObjectPropertiesAxiom getOWLEquivalentObjectPropertiesAxiom(
        OWLObjectPropertyExpression propertyA,
        OWLObjectPropertyExpression propertyB,
        Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4292);
        __CLR4_5_22z62z6lviclfjl.R.inc(4293);checkNotNull(propertyA, "propertyA cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4294);checkNotNull(propertyB, "propertyB cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4295);return getOWLEquivalentObjectPropertiesAxiom(
            CollectionFactory.createSet(propertyA, propertyB), annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLFunctionalDataPropertyAxiom getOWLFunctionalDataPropertyAxiom(
        OWLDataPropertyExpression property,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4296);
        __CLR4_5_22z62z6lviclfjl.R.inc(4297);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4298);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4299);return new OWLFunctionalDataPropertyAxiomImpl(property, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLFunctionalDataPropertyAxiom getOWLFunctionalDataPropertyAxiom(
        OWLDataPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4300);
        __CLR4_5_22z62z6lviclfjl.R.inc(4301);return getOWLFunctionalDataPropertyAxiom(property,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLFunctionalObjectPropertyAxiom getOWLFunctionalObjectPropertyAxiom(
        OWLObjectPropertyExpression property,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4302);
        __CLR4_5_22z62z6lviclfjl.R.inc(4303);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4304);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4305);return new OWLFunctionalObjectPropertyAxiomImpl(property, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLFunctionalObjectPropertyAxiom getOWLFunctionalObjectPropertyAxiom(
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4306);
        __CLR4_5_22z62z6lviclfjl.R.inc(4307);return getOWLFunctionalObjectPropertyAxiom(property,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLImportsDeclaration getOWLImportsDeclaration(
        IRI importedOntologyIRI) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4308);
        __CLR4_5_22z62z6lviclfjl.R.inc(4309);checkNotNull(importedOntologyIRI, "importedOntologyIRI cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4310);return new OWLImportsDeclarationImpl(importedOntologyIRI);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyAssertionAxiom getOWLDataPropertyAssertionAxiom(
        OWLDataPropertyExpression property, OWLIndividual subject,
        OWLLiteral object,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4311);
        __CLR4_5_22z62z6lviclfjl.R.inc(4312);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4313);checkNotNull(object, "object cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4314);checkNotNull(subject, "subject cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4315);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4316);return new OWLDataPropertyAssertionAxiomImpl(subject, property, object,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyAssertionAxiom getOWLDataPropertyAssertionAxiom(
        OWLDataPropertyExpression property, OWLIndividual subject,
        OWLLiteral object) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4317);
        __CLR4_5_22z62z6lviclfjl.R.inc(4318);return getOWLDataPropertyAssertionAxiom(property, subject, object,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyAssertionAxiom getOWLDataPropertyAssertionAxiom(
        OWLDataPropertyExpression property, OWLIndividual subject,
        int value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4319);
        __CLR4_5_22z62z6lviclfjl.R.inc(4320);return getOWLDataPropertyAssertionAxiom(property, subject,
            getOWLLiteral(value), EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyAssertionAxiom getOWLDataPropertyAssertionAxiom(
        OWLDataPropertyExpression property, OWLIndividual subject,
        double value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4321);
        __CLR4_5_22z62z6lviclfjl.R.inc(4322);return getOWLDataPropertyAssertionAxiom(property, subject,
            getOWLLiteral(value), EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyAssertionAxiom getOWLDataPropertyAssertionAxiom(
        OWLDataPropertyExpression property, OWLIndividual subject,
        float value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4323);
        __CLR4_5_22z62z6lviclfjl.R.inc(4324);return getOWLDataPropertyAssertionAxiom(property, subject,
            getOWLLiteral(value), EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyAssertionAxiom getOWLDataPropertyAssertionAxiom(
        OWLDataPropertyExpression property, OWLIndividual subject,
        boolean value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4325);
        __CLR4_5_22z62z6lviclfjl.R.inc(4326);return getOWLDataPropertyAssertionAxiom(property, subject,
            getOWLLiteral(value), EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataPropertyAssertionAxiom getOWLDataPropertyAssertionAxiom(
        OWLDataPropertyExpression property, OWLIndividual subject,
        String value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4327);
        __CLR4_5_22z62z6lviclfjl.R.inc(4328);return getOWLDataPropertyAssertionAxiom(property, subject,
            getOWLLiteral(value), EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLNegativeDataPropertyAssertionAxiom getOWLNegativeDataPropertyAssertionAxiom(
        OWLDataPropertyExpression property, OWLIndividual subject,
        OWLLiteral object) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4329);
        __CLR4_5_22z62z6lviclfjl.R.inc(4330);return getOWLNegativeDataPropertyAssertionAxiom(property, subject,
            object, EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLNegativeDataPropertyAssertionAxiom getOWLNegativeDataPropertyAssertionAxiom(
        OWLDataPropertyExpression property, OWLIndividual subject,
        OWLLiteral object,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4331);
        __CLR4_5_22z62z6lviclfjl.R.inc(4332);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4333);checkNotNull(object, "object cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4334);checkNotNull(subject, "subject cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4335);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4336);return new OWLNegativeDataPropertyAssertionAxiomImpl(subject, property,
            object, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLNegativeObjectPropertyAssertionAxiom getOWLNegativeObjectPropertyAssertionAxiom(
        OWLObjectPropertyExpression property,
        OWLIndividual subject, OWLIndividual object) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4337);
        __CLR4_5_22z62z6lviclfjl.R.inc(4338);return getOWLNegativeObjectPropertyAssertionAxiom(property, subject,
            object, EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLNegativeObjectPropertyAssertionAxiom getOWLNegativeObjectPropertyAssertionAxiom(
        OWLObjectPropertyExpression property,
        OWLIndividual subject, OWLIndividual object,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4339);
        __CLR4_5_22z62z6lviclfjl.R.inc(4340);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4341);checkNotNull(object, "object cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4342);checkNotNull(subject, "subject cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4343);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4344);return new OWLNegativeObjectPropertyAssertionAxiomImpl(subject,
            property, object, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectPropertyAssertionAxiom getOWLObjectPropertyAssertionAxiom(
        OWLObjectPropertyExpression property, OWLIndividual individual,
        OWLIndividual object) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4345);
        __CLR4_5_22z62z6lviclfjl.R.inc(4346);return getOWLObjectPropertyAssertionAxiom(property, individual, object,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLClassAssertionAxiom getOWLClassAssertionAxiom(
        OWLClassExpression classExpression, OWLIndividual individual) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4347);
        __CLR4_5_22z62z6lviclfjl.R.inc(4348);return getOWLClassAssertionAxiom(classExpression, individual,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLClassAssertionAxiom getOWLClassAssertionAxiom(
        OWLClassExpression classExpression, OWLIndividual individual,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4349);
        __CLR4_5_22z62z6lviclfjl.R.inc(4350);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4351);checkNotNull(individual, "individual cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4352);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4353);return new OWLClassAssertionAxiomImpl(individual, classExpression,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLInverseFunctionalObjectPropertyAxiom getOWLInverseFunctionalObjectPropertyAxiom(
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4354);
        __CLR4_5_22z62z6lviclfjl.R.inc(4355);return getOWLInverseFunctionalObjectPropertyAxiom(property,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLInverseFunctionalObjectPropertyAxiom getOWLInverseFunctionalObjectPropertyAxiom(
        OWLObjectPropertyExpression property,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4356);
        __CLR4_5_22z62z6lviclfjl.R.inc(4357);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4358);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4359);return new OWLInverseFunctionalObjectPropertyAxiomImpl(property,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLIrreflexiveObjectPropertyAxiom getOWLIrreflexiveObjectPropertyAxiom(
        OWLObjectPropertyExpression property,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4360);
        __CLR4_5_22z62z6lviclfjl.R.inc(4361);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4362);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4363);return new OWLIrreflexiveObjectPropertyAxiomImpl(property, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLReflexiveObjectPropertyAxiom getOWLReflexiveObjectPropertyAxiom(
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4364);
        __CLR4_5_22z62z6lviclfjl.R.inc(4365);return getOWLReflexiveObjectPropertyAxiom(property,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLIrreflexiveObjectPropertyAxiom getOWLIrreflexiveObjectPropertyAxiom(
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4366);
        __CLR4_5_22z62z6lviclfjl.R.inc(4367);return getOWLIrreflexiveObjectPropertyAxiom(property,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectPropertyDomainAxiom getOWLObjectPropertyDomainAxiom(
        OWLObjectPropertyExpression property,
        OWLClassExpression classExpression,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4368);
        __CLR4_5_22z62z6lviclfjl.R.inc(4369);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4370);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4371);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4372);return new OWLObjectPropertyDomainAxiomImpl(property, classExpression,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectPropertyDomainAxiom getOWLObjectPropertyDomainAxiom(
        OWLObjectPropertyExpression property,
        OWLClassExpression classExpression) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4373);
        __CLR4_5_22z62z6lviclfjl.R.inc(4374);return getOWLObjectPropertyDomainAxiom(property, classExpression,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectPropertyRangeAxiom getOWLObjectPropertyRangeAxiom(
        OWLObjectPropertyExpression property, OWLClassExpression range,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4375);
        __CLR4_5_22z62z6lviclfjl.R.inc(4376);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4377);checkNotNull(range, "range cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4378);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4379);return new OWLObjectPropertyRangeAxiomImpl(property, range, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectPropertyRangeAxiom getOWLObjectPropertyRangeAxiom(
        OWLObjectPropertyExpression property, OWLClassExpression range) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4380);
        __CLR4_5_22z62z6lviclfjl.R.inc(4381);return getOWLObjectPropertyRangeAxiom(property, range,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubObjectPropertyOfAxiom getOWLSubObjectPropertyOfAxiom(
        OWLObjectPropertyExpression subProperty,
        OWLObjectPropertyExpression superProperty,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4382);
        __CLR4_5_22z62z6lviclfjl.R.inc(4383);checkNotNull(subProperty, "subProperty cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4384);checkNotNull(superProperty, "superProperty cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4385);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4386);return new OWLSubObjectPropertyOfAxiomImpl(subProperty, superProperty,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubObjectPropertyOfAxiom getOWLSubObjectPropertyOfAxiom(
        OWLObjectPropertyExpression subProperty,
        OWLObjectPropertyExpression superProperty) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4387);
        __CLR4_5_22z62z6lviclfjl.R.inc(4388);return getOWLSubObjectPropertyOfAxiom(subProperty, superProperty,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLReflexiveObjectPropertyAxiom getOWLReflexiveObjectPropertyAxiom(
        OWLObjectPropertyExpression property,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4389);
        __CLR4_5_22z62z6lviclfjl.R.inc(4390);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4391);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4392);return new OWLReflexiveObjectPropertyAxiomImpl(property, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSameIndividualAxiom getOWLSameIndividualAxiom(
        @Nonnull Set<? extends OWLIndividual> individuals,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4393);
        __CLR4_5_22z62z6lviclfjl.R.inc(4394);checkNull(individuals, "individuals", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4395);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4396);return new OWLSameIndividualAxiomImpl(individuals, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSameIndividualAxiom getOWLSameIndividualAxiom(
        OWLIndividual... individual) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4397);
        __CLR4_5_22z62z6lviclfjl.R.inc(4398);checkNull(individual, "individuals", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4399);Set<OWLIndividual> inds = new HashSet<>();
        __CLR4_5_22z62z6lviclfjl.R.inc(4400);inds.addAll(Arrays.asList(individual));
        __CLR4_5_22z62z6lviclfjl.R.inc(4401);return getOWLSameIndividualAxiom(inds);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSameIndividualAxiom getOWLSameIndividualAxiom(
        @Nonnull Set<? extends OWLIndividual> individuals) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4402);
        __CLR4_5_22z62z6lviclfjl.R.inc(4403);return getOWLSameIndividualAxiom(individuals, EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubClassOfAxiom getOWLSubClassOfAxiom(
        OWLClassExpression subClass, OWLClassExpression superClass,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4404);
        __CLR4_5_22z62z6lviclfjl.R.inc(4405);checkNotNull(subClass, "subclass cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4406);checkNotNull(superClass, "superclass cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4407);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4408);return new OWLSubClassOfAxiomImpl(subClass, superClass, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubClassOfAxiom getOWLSubClassOfAxiom(
        OWLClassExpression subClass, OWLClassExpression superClass) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4409);
        __CLR4_5_22z62z6lviclfjl.R.inc(4410);return getOWLSubClassOfAxiom(subClass, superClass,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSymmetricObjectPropertyAxiom getOWLSymmetricObjectPropertyAxiom(
        OWLObjectPropertyExpression property,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4411);
        __CLR4_5_22z62z6lviclfjl.R.inc(4412);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4413);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4414);return new OWLSymmetricObjectPropertyAxiomImpl(property, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSymmetricObjectPropertyAxiom getOWLSymmetricObjectPropertyAxiom(
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4415);
        __CLR4_5_22z62z6lviclfjl.R.inc(4416);return getOWLSymmetricObjectPropertyAxiom(property,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLTransitiveObjectPropertyAxiom getOWLTransitiveObjectPropertyAxiom(
        OWLObjectPropertyExpression property,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4417);
        __CLR4_5_22z62z6lviclfjl.R.inc(4418);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4419);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4420);return new OWLTransitiveObjectPropertyAxiomImpl(property, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLTransitiveObjectPropertyAxiom getOWLTransitiveObjectPropertyAxiom(
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4421);
        __CLR4_5_22z62z6lviclfjl.R.inc(4422);return getOWLTransitiveObjectPropertyAxiom(property,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectInverseOf getOWLObjectInverseOf(
        OWLObjectPropertyExpression property) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4423);
        __CLR4_5_22z62z6lviclfjl.R.inc(4424);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4425);if ((((!(property instanceof OWLObjectProperty))&&(__CLR4_5_22z62z6lviclfjl.R.iget(4426)!=0|true))||(__CLR4_5_22z62z6lviclfjl.R.iget(4427)==0&false))) {{
            __CLR4_5_22z62z6lviclfjl.R.inc(4428);throw new IllegalArgumentException("ObjectInverseOf can only be applied to Object Properties");
        }
        }__CLR4_5_22z62z6lviclfjl.R.inc(4429);return new OWLObjectInverseOfImpl(property);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLInverseObjectPropertiesAxiom getOWLInverseObjectPropertiesAxiom(
        OWLObjectPropertyExpression forwardProperty,
        OWLObjectPropertyExpression inverseProperty,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4430);
        __CLR4_5_22z62z6lviclfjl.R.inc(4431);checkNotNull(forwardProperty, "forwardProperty cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4432);checkNotNull(inverseProperty, "inverseProperty cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4433);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4434);return new OWLInverseObjectPropertiesAxiomImpl(forwardProperty,
            inverseProperty, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLInverseObjectPropertiesAxiom getOWLInverseObjectPropertiesAxiom(
        OWLObjectPropertyExpression forwardProperty,
        OWLObjectPropertyExpression inverseProperty) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4435);
        __CLR4_5_22z62z6lviclfjl.R.inc(4436);return getOWLInverseObjectPropertiesAxiom(forwardProperty,
            inverseProperty, EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubPropertyChainOfAxiom getOWLSubPropertyChainOfAxiom(
        @Nonnull List<? extends OWLObjectPropertyExpression> chain,
        OWLObjectPropertyExpression superProperty,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4437);
        __CLR4_5_22z62z6lviclfjl.R.inc(4438);checkNotNull(superProperty, "superProperty cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4439);checkNull(chain, "chain", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4440);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4441);return new OWLSubPropertyChainAxiomImpl(chain, superProperty,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubPropertyChainOfAxiom getOWLSubPropertyChainOfAxiom(
        @Nonnull List<? extends OWLObjectPropertyExpression> chain,
        OWLObjectPropertyExpression superProperty) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4442);
        __CLR4_5_22z62z6lviclfjl.R.inc(4443);return getOWLSubPropertyChainOfAxiom(chain, superProperty,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLHasKeyAxiom getOWLHasKeyAxiom(OWLClassExpression ce,
        @Nonnull Set<? extends OWLPropertyExpression> objectProperties,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4444);
        __CLR4_5_22z62z6lviclfjl.R.inc(4445);checkNotNull(ce, "classExpression cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4446);checkNull(objectProperties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4447);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4448);return new OWLHasKeyAxiomImpl(ce, objectProperties, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLHasKeyAxiom getOWLHasKeyAxiom(OWLClassExpression ce,
        @Nonnull Set<? extends OWLPropertyExpression> properties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4449);
        __CLR4_5_22z62z6lviclfjl.R.inc(4450);return getOWLHasKeyAxiom(ce, properties, EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLHasKeyAxiom getOWLHasKeyAxiom(OWLClassExpression ce,
        OWLPropertyExpression... properties) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4451);
        __CLR4_5_22z62z6lviclfjl.R.inc(4452);checkNotNull(ce, "classExpression cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4453);checkNull(properties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4454);return getOWLHasKeyAxiom(ce, CollectionFactory.createSet(properties));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointUnionAxiom getOWLDisjointUnionAxiom(OWLClass owlClass,
        @Nonnull Set<? extends OWLClassExpression> classExpressions,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4455);
        __CLR4_5_22z62z6lviclfjl.R.inc(4456);checkNotNull(owlClass, "owlClass cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4457);checkNull(classExpressions, "classExpressions", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4458);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4459);return new OWLDisjointUnionAxiomImpl(owlClass, classExpressions,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDisjointUnionAxiom getOWLDisjointUnionAxiom(OWLClass owlClass,
        @Nonnull Set<? extends OWLClassExpression> classExpressions) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4460);
        __CLR4_5_22z62z6lviclfjl.R.inc(4461);return getOWLDisjointUnionAxiom(owlClass, classExpressions,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLEquivalentObjectPropertiesAxiom getOWLEquivalentObjectPropertiesAxiom(
        @Nonnull Set<? extends OWLObjectPropertyExpression> properties,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4462);
        __CLR4_5_22z62z6lviclfjl.R.inc(4463);checkNull(properties, "properties", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4464);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4465);return new OWLEquivalentObjectPropertiesAxiomImpl(properties,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectPropertyAssertionAxiom getOWLObjectPropertyAssertionAxiom(
        OWLObjectPropertyExpression property, OWLIndividual individual,
        OWLIndividual object,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4466);
        __CLR4_5_22z62z6lviclfjl.R.inc(4467);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4468);checkNotNull(individual, "individual cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4469);checkNotNull(object, "object cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4470);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4471);return new OWLObjectPropertyAssertionAxiomImpl(individual, property,
            object, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubAnnotationPropertyOfAxiom getOWLSubAnnotationPropertyOfAxiom(
        OWLAnnotationProperty sub, OWLAnnotationProperty sup) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4472);
        __CLR4_5_22z62z6lviclfjl.R.inc(4473);return getOWLSubAnnotationPropertyOfAxiom(sub, sup,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubAnnotationPropertyOfAxiom getOWLSubAnnotationPropertyOfAxiom(
        OWLAnnotationProperty sub, OWLAnnotationProperty sup,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4474);
        __CLR4_5_22z62z6lviclfjl.R.inc(4475);checkNotNull(sub, "subProperty cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4476);checkNotNull(sup, "superProperty cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4477);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4478);return new OWLSubAnnotationPropertyOfAxiomImpl(sub, sup, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    // Annotations
    @Override
    public OWLAnnotationProperty getOWLAnnotationProperty(IRI iri) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4479);
        __CLR4_5_22z62z6lviclfjl.R.inc(4480);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4481);return dataFactoryInternals.getOWLAnnotationProperty(iri);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotation getOWLAnnotation(OWLAnnotationProperty property,
        OWLAnnotationValue value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4482);
        __CLR4_5_22z62z6lviclfjl.R.inc(4483);return getOWLAnnotation(property, value, EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotation getOWLAnnotation(OWLAnnotationProperty property,
        OWLAnnotationValue value,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4484);
        __CLR4_5_22z62z6lviclfjl.R.inc(4485);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4486);checkNotNull(value, "value cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4487);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4488);return dataFactoryInternals.getOWLAnnotation(property, value, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationAssertionAxiom getOWLAnnotationAssertionAxiom(
        OWLAnnotationSubject subject, @Nonnull OWLAnnotation annotation) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4489);
        __CLR4_5_22z62z6lviclfjl.R.inc(4490);checkNotNull(annotation, "annotation cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4491);return getOWLAnnotationAssertionAxiom(annotation.getProperty(),
            subject, annotation.getValue(), annotation.getAnnotations());
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationAssertionAxiom getOWLAnnotationAssertionAxiom(
        OWLAnnotationSubject subject, @Nonnull OWLAnnotation annotation,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4492);
        __CLR4_5_22z62z6lviclfjl.R.inc(4493);checkNotNull(annotation, "annotation cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4494);return getOWLAnnotationAssertionAxiom(annotation.getProperty(),
            subject, annotation.getValue(), annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationAssertionAxiom getOWLAnnotationAssertionAxiom(
        OWLAnnotationProperty property, OWLAnnotationSubject subject,
        OWLAnnotationValue value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4495);
        __CLR4_5_22z62z6lviclfjl.R.inc(4496);return getOWLAnnotationAssertionAxiom(property, subject, value,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationAssertionAxiom getOWLAnnotationAssertionAxiom(
        OWLAnnotationProperty property, OWLAnnotationSubject subject,
        OWLAnnotationValue value,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4497);
        __CLR4_5_22z62z6lviclfjl.R.inc(4498);checkNotNull(subject, "subject cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4499);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4500);checkNotNull(value, "value cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4501);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4502);return new OWLAnnotationAssertionAxiomImpl(subject, property, value,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLAnnotationAssertionAxiom getDeprecatedOWLAnnotationAssertionAxiom(IRI subject) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4503);
        __CLR4_5_22z62z6lviclfjl.R.inc(4504);checkNotNull(subject, "subject cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4505);return getOWLAnnotationAssertionAxiom(getOWLDeprecated(), subject,
            getOWLLiteral(true));
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationPropertyDomainAxiom getOWLAnnotationPropertyDomainAxiom(OWLAnnotationProperty prop,
        IRI domain,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4506);
        __CLR4_5_22z62z6lviclfjl.R.inc(4507);checkNotNull(prop, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4508);checkNotNull(domain, "domain cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4509);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4510);return new OWLAnnotationPropertyDomainAxiomImpl(prop, domain,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationPropertyDomainAxiom getOWLAnnotationPropertyDomainAxiom(OWLAnnotationProperty prop,
        IRI domain) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4511);
        __CLR4_5_22z62z6lviclfjl.R.inc(4512);return getOWLAnnotationPropertyDomainAxiom(prop, domain,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationPropertyRangeAxiom getOWLAnnotationPropertyRangeAxiom(
        OWLAnnotationProperty prop, IRI range,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4513);
        __CLR4_5_22z62z6lviclfjl.R.inc(4514);checkNotNull(prop, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4515);checkNotNull(range, "range cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4516);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4517);return new OWLAnnotationPropertyRangeAxiomImpl(prop, range, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationPropertyRangeAxiom getOWLAnnotationPropertyRangeAxiom(
        OWLAnnotationProperty prop, IRI range) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4518);
        __CLR4_5_22z62z6lviclfjl.R.inc(4519);return getOWLAnnotationPropertyRangeAxiom(prop, range,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    // SWRL
    @Nonnull
    @Override
    public SWRLRule getSWRLRule(@Nonnull Set<? extends SWRLAtom> body,
        @Nonnull Set<? extends SWRLAtom> head,
        @Nonnull Set<OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4520);
        __CLR4_5_22z62z6lviclfjl.R.inc(4521);checkNull(body, "body", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4522);checkNull(head, "head", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4523);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4524);return new SWRLRuleImpl(body, head, annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLRule getSWRLRule(@Nonnull Set<? extends SWRLAtom> body,
        @Nonnull Set<? extends SWRLAtom> head) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4525);
        __CLR4_5_22z62z6lviclfjl.R.inc(4526);checkNull(body, "antecedent", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4527);checkNull(head, "consequent", true);
        __CLR4_5_22z62z6lviclfjl.R.inc(4528);return new SWRLRuleImpl(body, head);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLClassAtom getSWRLClassAtom(OWLClassExpression predicate,
        SWRLIArgument arg) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4529);
        __CLR4_5_22z62z6lviclfjl.R.inc(4530);checkNotNull(predicate, "predicate cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4531);checkNotNull(arg, "arg cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4532);return new SWRLClassAtomImpl(predicate, arg);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLDataRangeAtom getSWRLDataRangeAtom(OWLDataRange predicate,
        SWRLDArgument arg) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4533);
        __CLR4_5_22z62z6lviclfjl.R.inc(4534);checkNotNull(predicate, "predicate cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4535);checkNotNull(arg, "arg cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4536);return new SWRLDataRangeAtomImpl(predicate, arg);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLObjectPropertyAtom getSWRLObjectPropertyAtom(
        OWLObjectPropertyExpression property, SWRLIArgument arg0,
        SWRLIArgument arg1) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4537);
        __CLR4_5_22z62z6lviclfjl.R.inc(4538);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4539);checkNotNull(arg0, "arg0 cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4540);checkNotNull(arg1, "arg1 cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4541);return new SWRLObjectPropertyAtomImpl(property, arg0, arg1);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLDataPropertyAtom getSWRLDataPropertyAtom(
        OWLDataPropertyExpression property, SWRLIArgument arg0,
        SWRLDArgument arg1) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4542);
        __CLR4_5_22z62z6lviclfjl.R.inc(4543);checkNotNull(property, "property cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4544);checkNotNull(arg0, "arg0 cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4545);checkNotNull(arg1, "arg1 cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4546);return new SWRLDataPropertyAtomImpl(property, arg0, arg1);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLBuiltInAtom getSWRLBuiltInAtom(IRI builtInIRI,
        List<SWRLDArgument> args) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4547);
        __CLR4_5_22z62z6lviclfjl.R.inc(4548);checkNotNull(builtInIRI, "builtInIRI cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4549);checkNotNull(args, "args cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4550);return new SWRLBuiltInAtomImpl(builtInIRI, args);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLVariable getSWRLVariable(IRI var) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4551);
        __CLR4_5_22z62z6lviclfjl.R.inc(4552);checkNotNull(var, "var cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4553);return new SWRLVariableImpl(var);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLIndividualArgument getSWRLIndividualArgument(
        OWLIndividual individual) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4554);
        __CLR4_5_22z62z6lviclfjl.R.inc(4555);checkNotNull(individual, "individual cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4556);return new SWRLIndividualArgumentImpl(individual);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLLiteralArgument getSWRLLiteralArgument(OWLLiteral literal) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4557);
        __CLR4_5_22z62z6lviclfjl.R.inc(4558);checkNotNull(literal, "literal");
        __CLR4_5_22z62z6lviclfjl.R.inc(4559);return new SWRLLiteralArgumentImpl(literal);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLDifferentIndividualsAtom getSWRLDifferentIndividualsAtom(
        SWRLIArgument arg0, SWRLIArgument arg1) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4560);
        __CLR4_5_22z62z6lviclfjl.R.inc(4561);checkNotNull(arg0, "arg0 cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4562);checkNotNull(arg1, "arg1 cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4563);return new SWRLDifferentIndividualsAtomImpl(
            getOWLObjectProperty(OWLRDFVocabulary.OWL_DIFFERENT_FROM
                .getIRI()),
            arg0, arg1);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public SWRLSameIndividualAtom getSWRLSameIndividualAtom(SWRLIArgument arg0,
        SWRLIArgument arg1) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4564);
        __CLR4_5_22z62z6lviclfjl.R.inc(4565);checkNotNull(arg0, "arg0 cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4566);checkNotNull(arg1, "arg1 cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4567);return new SWRLSameIndividualAtomImpl(
            getOWLObjectProperty(OWLRDFVocabulary.OWL_SAME_AS.getIRI()),
            arg0, arg1);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    private static final Set<OWLAnnotation> EMPTY_ANNOTATIONS_SET = CollectionFactory
        .emptySet();

    @Nonnull
    @Override
    public OWLDatatypeDefinitionAxiom getOWLDatatypeDefinitionAxiom(
        OWLDatatype datatype, OWLDataRange dataRange) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4568);
        __CLR4_5_22z62z6lviclfjl.R.inc(4569);checkNotNull(datatype, "datatype cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4570);checkNotNull(dataRange, "dataRange cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4571);return getOWLDatatypeDefinitionAxiom(datatype, dataRange,
            EMPTY_ANNOTATIONS_SET);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDatatypeDefinitionAxiom getOWLDatatypeDefinitionAxiom(
        OWLDatatype datatype, OWLDataRange dataRange,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4572);
        __CLR4_5_22z62z6lviclfjl.R.inc(4573);checkNotNull(datatype, "datatype cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4574);checkNotNull(dataRange, "dataRange cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4575);checkAnnotations(annotations);
        __CLR4_5_22z62z6lviclfjl.R.inc(4576);return new OWLDatatypeDefinitionAxiomImpl(datatype, dataRange,
            annotations);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(String lexicalValue, OWLDatatype datatype) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4577);
        __CLR4_5_22z62z6lviclfjl.R.inc(4578);checkNotNull(lexicalValue, "lexicalValue cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4579);checkNotNull(datatype, "datatype cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4580);return dataFactoryInternals.getOWLLiteral(lexicalValue, datatype);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(int value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4581);
        __CLR4_5_22z62z6lviclfjl.R.inc(4582);return dataFactoryInternals.getOWLLiteral(value);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(double value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4583);
        __CLR4_5_22z62z6lviclfjl.R.inc(4584);return dataFactoryInternals.getOWLLiteral(value);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(float value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4585);
        __CLR4_5_22z62z6lviclfjl.R.inc(4586);return dataFactoryInternals.getOWLLiteral(value);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(String value) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4587);
        __CLR4_5_22z62z6lviclfjl.R.inc(4588);checkNotNull(value, "value cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4589);return dataFactoryInternals.getOWLLiteral(value);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(String literal, String lang) {try{__CLR4_5_22z62z6lviclfjl.R.inc(4590);
        __CLR4_5_22z62z6lviclfjl.R.inc(4591);checkNotNull(literal, "literal cannot be null");
        __CLR4_5_22z62z6lviclfjl.R.inc(4592);return dataFactoryInternals.getOWLLiteral(literal, lang);
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatype getBooleanOWLDatatype() {try{__CLR4_5_22z62z6lviclfjl.R.inc(4593);
        __CLR4_5_22z62z6lviclfjl.R.inc(4594);return dataFactoryInternals.getBooleanOWLDatatype();
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatype getDoubleOWLDatatype() {try{__CLR4_5_22z62z6lviclfjl.R.inc(4595);
        __CLR4_5_22z62z6lviclfjl.R.inc(4596);return dataFactoryInternals.getDoubleOWLDatatype();
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatype getFloatOWLDatatype() {try{__CLR4_5_22z62z6lviclfjl.R.inc(4597);
        __CLR4_5_22z62z6lviclfjl.R.inc(4598);return dataFactoryInternals.getFloatOWLDatatype();
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatype getIntegerOWLDatatype() {try{__CLR4_5_22z62z6lviclfjl.R.inc(4599);
        __CLR4_5_22z62z6lviclfjl.R.inc(4600);return dataFactoryInternals.getIntegerOWLDatatype();
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatype getTopDatatype() {try{__CLR4_5_22z62z6lviclfjl.R.inc(4601);
        __CLR4_5_22z62z6lviclfjl.R.inc(4602);return dataFactoryInternals.getTopDatatype();
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}

    @Override
    public OWLDatatype getRDFPlainLiteral() {try{__CLR4_5_22z62z6lviclfjl.R.inc(4603);
        __CLR4_5_22z62z6lviclfjl.R.inc(4604);return dataFactoryInternals.getRDFPlainLiteral();
    }finally{__CLR4_5_22z62z6lviclfjl.R.flushNeeded();}}
}
