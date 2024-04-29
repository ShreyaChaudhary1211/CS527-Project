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

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.WeakIndexCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Interner;
import com.google.common.collect.Interners;

/**
 * @author ignazio
 */
public class OWLDataFactoryInternalsImpl extends OWLDataFactoryInternalsImplNoCache {public static class __CLR4_5_23jx3jxlviclfm0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,4690,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Logger logger = LoggerFactory.getLogger(OWLDataFactoryInternalsImpl.class);
    private static final long serialVersionUID = 40000L;

    protected class BuildableWeakIndexCache<V extends OWLEntity> extends
        WeakIndexCache<IRI, V> {

        private static final long serialVersionUID = 40000L;

        @Nonnull
        public V cache(@Nonnull IRI s, @Nonnull Buildable v) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4605);
            __CLR4_5_23jx3jxlviclfm0.R.inc(4606);WeakReference<V> w = prefixCache.get(s);
            __CLR4_5_23jx3jxlviclfm0.R.inc(4607);if ((((w != null)&&(__CLR4_5_23jx3jxlviclfm0.R.iget(4608)!=0|true))||(__CLR4_5_23jx3jxlviclfm0.R.iget(4609)==0&false))) {{
                __CLR4_5_23jx3jxlviclfm0.R.inc(4610);V toReturn = w.get();
                __CLR4_5_23jx3jxlviclfm0.R.inc(4611);if ((((toReturn != null)&&(__CLR4_5_23jx3jxlviclfm0.R.iget(4612)!=0|true))||(__CLR4_5_23jx3jxlviclfm0.R.iget(4613)==0&false))) {{
                    __CLR4_5_23jx3jxlviclfm0.R.inc(4614);return toReturn;
                }
            }}
            // need to add the new key and return it
            }__CLR4_5_23jx3jxlviclfm0.R.inc(4615);@SuppressWarnings("unchecked")
            V value = (V) v.build(s);
            __CLR4_5_23jx3jxlviclfm0.R.inc(4616);prefixCache.put(s, new WeakReference<>(value));
            __CLR4_5_23jx3jxlviclfm0.R.inc(4617);return value;
        }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}
    }

    @Nonnull
    private final BuildableWeakIndexCache<OWLClass> classesByURI;
    @Nonnull
    private final BuildableWeakIndexCache<OWLObjectProperty> objectPropertiesByURI;
    @Nonnull
    private final BuildableWeakIndexCache<OWLDataProperty> dataPropertiesByURI;
    @Nonnull
    private final BuildableWeakIndexCache<OWLDatatype> datatypesByURI;
    @Nonnull
    private final BuildableWeakIndexCache<OWLNamedIndividual> individualsByURI;
    @Nonnull
    private final BuildableWeakIndexCache<OWLAnnotationProperty> annotationPropertiesByURI;
    @Nonnull
    transient final private Interner<String> languageTagInterner;

    @Nonnull
    protected final <V extends OWLEntity> BuildableWeakIndexCache<V> buildCache() {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4618);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4619);return new BuildableWeakIndexCache<>();
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    /**
     * Annotations Cache uses a loading cache as a size limited Interner; the
     * value of the loader is simply the key. As with an interner, each access
     * constructs a new object that is discarded if the key is used. Most
     * annotations will only be used once; however some annotations may be
     * reused extremely frequently. for ontologies in the OBO family, a few
     * annotations will be reused extremely frequently.
     */
    private transient final LoadingCache<OWLAnnotation, OWLAnnotation> annotationsCache;

    /**
     * @param useCompression
     *        true if literals should be compressed
     */
    @Inject
    public OWLDataFactoryInternalsImpl(@CompressionEnabled boolean useCompression) {
        super(useCompression);__CLR4_5_23jx3jxlviclfm0.R.inc(4621);try{__CLR4_5_23jx3jxlviclfm0.R.inc(4620);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4622);classesByURI = buildCache();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4623);objectPropertiesByURI = buildCache();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4624);dataPropertiesByURI = buildCache();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4625);datatypesByURI = buildCache();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4626);individualsByURI = buildCache();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4627);annotationPropertiesByURI = buildCache();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4628);languageTagInterner = Interners.newWeakInterner();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4629);CacheBuilder<Object, Object> annotationsCacheBuilder = CacheBuilder.newBuilder().maximumSize(512)
            .expireAfterAccess(2, TimeUnit.MINUTES);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4630);if ((((logger.isDebugEnabled())&&(__CLR4_5_23jx3jxlviclfm0.R.iget(4631)!=0|true))||(__CLR4_5_23jx3jxlviclfm0.R.iget(4632)==0&false))) {{
            __CLR4_5_23jx3jxlviclfm0.R.inc(4633);annotationsCacheBuilder.recordStats();
        }
        }__CLR4_5_23jx3jxlviclfm0.R.inc(4634);annotationsCache = annotationsCacheBuilder.build(new CacheLoader<OWLAnnotation, OWLAnnotation>() {

            @Override
            public OWLAnnotation load(OWLAnnotation key) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4635);
                __CLR4_5_23jx3jxlviclfm0.R.inc(4636);return key;
            }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}
        });
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    protected enum Buildable {
        OWLCLASS {

            @Nonnull
            @Override
            OWLClass build(@Nonnull IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4637);
                __CLR4_5_23jx3jxlviclfm0.R.inc(4638);return new OWLClassImpl(iri);
            }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}
        },
        OWLOBJECTPROPERTY {

            @Nonnull
            @Override
            OWLObjectProperty build(@Nonnull IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4639);
                __CLR4_5_23jx3jxlviclfm0.R.inc(4640);return new OWLObjectPropertyImpl(iri);
            }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}
        },
        OWLDATAPROPERTY {

            @Nonnull
            @Override
            OWLDataProperty build(@Nonnull IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4641);
                __CLR4_5_23jx3jxlviclfm0.R.inc(4642);return new OWLDataPropertyImpl(iri);
            }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}
        },
        OWLNAMEDINDIVIDUAL {

            @Nonnull
            @Override
            OWLNamedIndividual build(@Nonnull IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4643);
                __CLR4_5_23jx3jxlviclfm0.R.inc(4644);return new OWLNamedIndividualImpl(iri);
            }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}
        },
        OWLDATATYPE {

            @Nonnull
            @Override
            OWLDatatype build(@Nonnull IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4645);
                __CLR4_5_23jx3jxlviclfm0.R.inc(4646);return new OWLDatatypeImpl(iri);
            }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}
        },
        OWLANNOTATIONPROPERTY {

            @Nonnull
            @Override
            OWLAnnotationProperty build(@Nonnull IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4647);
                __CLR4_5_23jx3jxlviclfm0.R.inc(4648);return new OWLAnnotationPropertyImpl(iri);
            }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}
        };

        @Nonnull
        abstract <K extends OWLEntity> K build(@Nonnull IRI iri);
    }

    @Nonnull
    @Override
    public OWLClass getOWLClass(IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4649);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4650);return classesByURI.cache(iri, Buildable.OWLCLASS);
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    @Override
    public void purge() {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4651);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4652);classesByURI.clear();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4653);objectPropertiesByURI.clear();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4654);dataPropertiesByURI.clear();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4655);datatypesByURI.clear();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4656);individualsByURI.clear();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4657);annotationPropertiesByURI.clear();
        __CLR4_5_23jx3jxlviclfm0.R.inc(4658);annotationsCache.invalidateAll();
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectProperty getOWLObjectProperty(IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4659);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4660);return objectPropertiesByURI.cache(iri, Buildable.OWLOBJECTPROPERTY);
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDataProperty getOWLDataProperty(IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4661);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4662);return dataPropertiesByURI.cache(iri, Buildable.OWLDATAPROPERTY);
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLNamedIndividual getOWLNamedIndividual(IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4663);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4664);return individualsByURI.cache(iri, Buildable.OWLNAMEDINDIVIDUAL);
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDatatype getOWLDatatype(IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4665);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4666);return datatypesByURI.cache(iri, Buildable.OWLDATATYPE);
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLAnnotationProperty getOWLAnnotationProperty(IRI iri) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4667);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4668);return annotationPropertiesByURI.cache(iri,
            Buildable.OWLANNOTATIONPROPERTY);
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    /*
       Use a guava weak String interner for language tags.
     */
    @Override
    public OWLLiteral getOWLLiteral(String literal, @Nullable String lang) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4669);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4670);if ((((lang == null)&&(__CLR4_5_23jx3jxlviclfm0.R.iget(4671)!=0|true))||(__CLR4_5_23jx3jxlviclfm0.R.iget(4672)==0&false))) {{
            __CLR4_5_23jx3jxlviclfm0.R.inc(4673);lang = "";
        }
        }__CLR4_5_23jx3jxlviclfm0.R.inc(4674);lang = languageTagInterner.intern(lang.trim().toLowerCase());
        __CLR4_5_23jx3jxlviclfm0.R.inc(4675);return super.getOWLLiteral(literal, lang);
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}

    private AtomicInteger annotationsCount = new AtomicInteger(0);

    @Override
    public OWLAnnotation getOWLAnnotation(OWLAnnotationProperty property, OWLAnnotationValue value,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_23jx3jxlviclfm0.R.inc(4676);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4677);OWLAnnotation key = new OWLAnnotationImpl(property, value, annotations);
        __CLR4_5_23jx3jxlviclfm0.R.inc(4678);try {
            __CLR4_5_23jx3jxlviclfm0.R.inc(4679);OWLAnnotation annotation = annotationsCache.get(key);
            __CLR4_5_23jx3jxlviclfm0.R.inc(4680);if ((((logger.isDebugEnabled())&&(__CLR4_5_23jx3jxlviclfm0.R.iget(4681)!=0|true))||(__CLR4_5_23jx3jxlviclfm0.R.iget(4682)==0&false))) {{
                __CLR4_5_23jx3jxlviclfm0.R.inc(4683);int n = annotationsCount.incrementAndGet();
                __CLR4_5_23jx3jxlviclfm0.R.inc(4684);if ((((n % 1000 == 0)&&(__CLR4_5_23jx3jxlviclfm0.R.iget(4685)!=0|true))||(__CLR4_5_23jx3jxlviclfm0.R.iget(4686)==0&false))) {{
                    __CLR4_5_23jx3jxlviclfm0.R.inc(4687);logger.debug("{}: Annotations Cache stats: {}", n, annotationsCache.stats());
                }
            }}
            }__CLR4_5_23jx3jxlviclfm0.R.inc(4688);return annotation;
        } catch (ExecutionException e) {
            __CLR4_5_23jx3jxlviclfm0.R.inc(4689);return key;
        }
    }finally{__CLR4_5_23jx3jxlviclfm0.R.flushNeeded();}}
}
