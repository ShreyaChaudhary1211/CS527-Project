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

import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;
import static org.semanticweb.owlapi.util.CollectionFactory.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;

import org.semanticweb.owlapi.OWLAPIConfigProvider;
import org.semanticweb.owlapi.io.FileDocumentSource;
import org.semanticweb.owlapi.io.IRIDocumentSource;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.io.OWLOntologyDocumentTarget;
import org.semanticweb.owlapi.io.OWLOntologyStorageIOException;
import org.semanticweb.owlapi.io.OWLParserFactory;
import org.semanticweb.owlapi.io.OntologyIRIMappingNotFoundException;
import org.semanticweb.owlapi.io.StreamDocumentSource;
import org.semanticweb.owlapi.io.StreamDocumentTarget;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.ChangeApplied;
import org.semanticweb.owlapi.model.parameters.OntologyCopy;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLAnnotationPropertyTransformer;
import org.semanticweb.owlapi.util.PriorityCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Optional;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import uk.ac.manchester.cs.owl.owlapi.concurrent.ConcurrentPriorityCollection;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLOntologyManagerImpl implements OWLOntologyManager, OWLOntologyFactory.OWLOntologyCreationHandler,
    Serializable {public static class __CLR4_5_27qz7qzlviclgly{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,11134,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private static final Logger LOGGER = LoggerFactory.getLogger(OWLOntologyManagerImpl.class);
    @Nonnull protected final Map<OWLOntologyID, OWLOntology> ontologiesByID = createSyncMap();
    @Nonnull protected final Map<OWLOntologyID, IRI> documentIRIsByID = createSyncMap();
    @Nonnull protected final Map<OWLOntologyID, OWLOntologyLoaderConfiguration> ontologyConfigurationsByOntologyID = new HashMap<>();
    @Nonnull protected final Map<OWLOntologyID, OWLDocumentFormat> ontologyFormatsByOntology = createSyncMap();
    @Nonnull protected final Map<OWLImportsDeclaration, OWLOntologyID> ontologyIDsByImportsDeclaration = createSyncMap();
    protected final AtomicInteger loadCount = new AtomicInteger(0);
    protected final AtomicInteger importsLoadCount = new AtomicInteger(0);
    @Nonnull protected final Set<IRI> importedIRIs = createSyncSet();
    @Nonnull protected final OWLDataFactory dataFactory;
    @Nonnull protected final Map<OWLOntologyID, Set<OWLOntology>> importsClosureCache = createSyncMap();
    @Nonnull protected final List<MissingImportListener> missingImportsListeners = createSyncList();
    @Nonnull protected final List<OWLOntologyLoaderListener> loaderListeners = createSyncList();
    @Nonnull protected final List<OWLOntologyChangeProgressListener> progressListeners = createSyncList();
    @Nonnull protected final AtomicLong autoGeneratedURICounter = new AtomicLong();
    private final AtomicBoolean broadcastChanges = new AtomicBoolean(true);
    @Nonnull protected OWLOntologyChangeBroadcastStrategy defaultChangeBroadcastStrategy = new DefaultChangeBroadcastStrategy();
    @Nonnull protected ImpendingOWLOntologyChangeBroadcastStrategy defaultImpendingChangeBroadcastStrategy = new DefaultImpendingChangeBroadcastStrategy();
    private transient Map<OWLOntologyChangeListener, OWLOntologyChangeBroadcastStrategy> listenerMap = createSyncMap();
    private transient Map<ImpendingOWLOntologyChangeListener, ImpendingOWLOntologyChangeBroadcastStrategy> impendingChangeListenerMap = createSyncMap();
    private transient List<OWLOntologyChangesVetoedListener> vetoListeners = new ArrayList<>();
    @Nonnull private Provider<OWLOntologyLoaderConfiguration> configProvider = new OWLAPIConfigProvider();
    @Nonnull private Optional<OWLOntologyLoaderConfiguration> config = Optional.absent();
    @Nonnull protected final PriorityCollection<OWLOntologyIRIMapper> documentMappers;
    @Nonnull protected final PriorityCollection<OWLOntologyFactory> ontologyFactories;
    @Nonnull protected final PriorityCollection<OWLParserFactory> parserFactories;
    @Nonnull protected final PriorityCollection<OWLStorerFactory> ontologyStorers;
    private final ReadWriteLock readWriteLock;
    private final Lock readLock;
    private final Lock writeLock;

    /**
     * @param dataFactory
     *        data factory
     */
    @Inject
    public OWLOntologyManagerImpl(@Nonnull OWLDataFactory dataFactory, ReadWriteLock readWriteLock) {
        this(dataFactory, readWriteLock, PriorityCollectionSorting.ON_SET_INJECTION_ONLY);__CLR4_5_27qz7qzlviclgly.R.inc(10044);try{__CLR4_5_27qz7qzlviclgly.R.inc(10043);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    public OWLOntologyManagerImpl(@Nonnull OWLDataFactory dataFactory, ReadWriteLock readWriteLock,
        PriorityCollectionSorting sorting) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10045);
        __CLR4_5_27qz7qzlviclgly.R.inc(10046);this.dataFactory = checkNotNull(dataFactory, "dataFactory cannot be null");
        __CLR4_5_27qz7qzlviclgly.R.inc(10047);this.readWriteLock = readWriteLock;
        __CLR4_5_27qz7qzlviclgly.R.inc(10048);readLock = readWriteLock.readLock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10049);writeLock = readWriteLock.writeLock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10050);documentMappers = new ConcurrentPriorityCollection<>(readWriteLock, sorting);
        __CLR4_5_27qz7qzlviclgly.R.inc(10051);ontologyFactories = new ConcurrentPriorityCollection<>(readWriteLock, sorting);
        __CLR4_5_27qz7qzlviclgly.R.inc(10052);parserFactories = new ConcurrentPriorityCollection<>(readWriteLock, sorting);
        __CLR4_5_27qz7qzlviclgly.R.inc(10053);ontologyStorers = new ConcurrentPriorityCollection<>(readWriteLock, sorting);
        __CLR4_5_27qz7qzlviclgly.R.inc(10054);installDefaultURIMappers();
        __CLR4_5_27qz7qzlviclgly.R.inc(10055);installDefaultOntologyFactories();
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    /**
     * @param first
     *        first id
     * @param second
     *        second id
     * @return true if the ids are equal or have the same ontology IRI. Ontology
     *         version is ignored.
     */
    private static boolean matchingIDs(OWLOntologyID first, OWLOntologyID second) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10056);
        __CLR4_5_27qz7qzlviclgly.R.inc(10057);if ((((first.isAnonymous() || second.isAnonymous())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10058)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10059)==0&false))) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10060);return first.equals(second);
        }
        }__CLR4_5_27qz7qzlviclgly.R.inc(10061);return first.getOntologyIRI().equals(second.getOntologyIRI());
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Nonnull
    protected static IRI getNextAutoGeneratedIRI() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10062);
        __CLR4_5_27qz7qzlviclgly.R.inc(10063);return OWLOntologyDocumentSourceBase.getNextDocumentIRI("owlapi:ontology#ont");
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void setOntologyLoaderConfigurationProvider(Provider<OWLOntologyLoaderConfiguration> provider) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10064);
        __CLR4_5_27qz7qzlviclgly.R.inc(10065);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10066);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10067);configProvider = provider;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10068);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    @Nonnull
    public OWLOntologyLoaderConfiguration getOntologyLoaderConfiguration() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10069);
        __CLR4_5_27qz7qzlviclgly.R.inc(10070);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10071);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10072);if ((((config.isPresent())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10073)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10074)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10075);return config.get();
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10076);config = Optional.of(configProvider.get());
            __CLR4_5_27qz7qzlviclgly.R.inc(10077);return config.get();
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10078);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void setOntologyLoaderConfiguration(OWLOntologyLoaderConfiguration newConfig) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10079);
        __CLR4_5_27qz7qzlviclgly.R.inc(10080);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10081);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10082);config = Optional.fromNullable(newConfig);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10083);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLDataFactory getOWLDataFactory() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10084);
        __CLR4_5_27qz7qzlviclgly.R.inc(10085);return dataFactory;
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public Set<OWLOntology> getOntologies() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10086);
        __CLR4_5_27qz7qzlviclgly.R.inc(10087);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10088);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10089);return new HashSet<>(ontologiesByID.values());
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10090);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public Set<OWLOntology> getOntologies(OWLAxiom axiom) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10091);
        __CLR4_5_27qz7qzlviclgly.R.inc(10092);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10093);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10094);Set<OWLOntology> result = new HashSet<>(ontologiesByID.size());
            __CLR4_5_27qz7qzlviclgly.R.inc(10095);for (OWLOntology ont : getOntologies()) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10096);if ((((ont.containsAxiom(axiom))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10097)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10098)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10099);result.add(ont);
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10100);return result;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10101);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public boolean contains(OWLOntology ontology) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10102);
        __CLR4_5_27qz7qzlviclgly.R.inc(10103);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10104);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10105);return ontologiesByID.containsValue(ontology);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10106);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public boolean contains(IRI ontologyIRI) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10107);
        __CLR4_5_27qz7qzlviclgly.R.inc(10108);checkNotNull(ontologyIRI, "Ontology IRI cannot be null");
        __CLR4_5_27qz7qzlviclgly.R.inc(10109);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10110);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10111);Set<OWLOntologyID> owlOntologyIDs = ontologiesByID.keySet();
            __CLR4_5_27qz7qzlviclgly.R.inc(10112);for (OWLOntologyID nextOntologyID : owlOntologyIDs) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10113);if ((((ontologyIRI.equals(nextOntologyID.getOntologyIRI().orNull()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10114)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10115)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10116);return true;
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10117);for (OWLOntologyID ont : owlOntologyIDs) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10118);if ((((ontologyIRI.equals(ont.getVersionIRI().orNull()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10119)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10120)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10121);return true;
                }
            }}
            // FIXME:
            // ParsableOWLOntologyFactory seems to call this method with a
            // document/physical IRI,
            // but this method fails the general case where the ontology was
            // loaded
            // from the given IRI directly, but was then renamed
            }__CLR4_5_27qz7qzlviclgly.R.inc(10122);return false;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10123);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public boolean contains(OWLOntologyID id) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10124);
        __CLR4_5_27qz7qzlviclgly.R.inc(10125);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10126);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10127);if ((((ontologiesByID.containsKey(id))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10128)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10129)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10130);return true;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10131);for (OWLOntologyID nextOntologyID : ontologiesByID.keySet()) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10132);if ((((!id.isAnonymous() && id.getOntologyIRI().equals(nextOntologyID.getOntologyIRI()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10133)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10134)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10135);return true;
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10136);return false;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10137);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public boolean containsVersion(IRI ontologyVersionIRI) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10138);
        __CLR4_5_27qz7qzlviclgly.R.inc(10139);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10140);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10141);for (OWLOntologyID ont : ontologiesByID.keySet()) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10142);if ((((ontologyVersionIRI.equals(ont.getVersionIRI().orNull()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10143)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10144)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10145);return true;
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10146);return false;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10147);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public Set<OWLOntologyID> getOntologyIDsByVersion(IRI ontologyVersionIRI) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10148);
        __CLR4_5_27qz7qzlviclgly.R.inc(10149);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10150);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10151);Set<OWLOntologyID> result = new TreeSet<>();
            __CLR4_5_27qz7qzlviclgly.R.inc(10152);for (OWLOntologyID ont : ontologiesByID.keySet()) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10153);if ((((ontologyVersionIRI.equals(ont.getVersionIRI().orNull()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10154)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10155)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10156);result.add(ont);
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10157);return result;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10158);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology getOntology(IRI ontologyIRI) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10159);
        __CLR4_5_27qz7qzlviclgly.R.inc(10160);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10161);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10162);OWLOntologyID ontologyID = new OWLOntologyID(of(ontologyIRI), of((IRI) null));
            __CLR4_5_27qz7qzlviclgly.R.inc(10163);OWLOntology result = ontologiesByID.get(ontologyID);
            __CLR4_5_27qz7qzlviclgly.R.inc(10164);if ((((result == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10165)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10166)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10167);for (OWLOntologyID nextOntologyID : ontologiesByID.keySet()) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10168);if ((((ontologyIRI.equals(nextOntologyID.getVersionIRI().orNull()) || ontologyIRI.equals(nextOntologyID
                        .getOntologyIRI().orNull()) || ontologyIRI.equals(nextOntologyID.getDefaultDocumentIRI()
                            .orNull()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10169)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10170)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10171);result = ontologiesByID.get(nextOntologyID);
                    }
                }}
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10172);return result;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10173);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology getOntology(OWLOntologyID ontologyID) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10174);
        __CLR4_5_27qz7qzlviclgly.R.inc(10175);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10176);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10177);OWLOntology result = ontologiesByID.get(ontologyID);
            __CLR4_5_27qz7qzlviclgly.R.inc(10178);if ((((result == null && !ontologyID.isAnonymous())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10179)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10180)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10181);for (OWLOntologyID nextOntologyID : ontologiesByID.keySet()) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10182);if ((((matchingIDs(ontologyID, nextOntologyID))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10183)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10184)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10185);result = ontologiesByID.get(nextOntologyID);
                    }
                }}
            }}
            // HACK: This extra clause is necessary to make getOntology match
            // the
            // behaviour of createOntology in cases where a documentIRI has been
            // recorded, based on the mappers, but an ontology has not been
            // stored
            // in ontologiesByID
            }__CLR4_5_27qz7qzlviclgly.R.inc(10186);if ((((result == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10187)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10188)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10189);IRI documentIRI = getDocumentIRIFromMappers(ontologyID);
                __CLR4_5_27qz7qzlviclgly.R.inc(10190);if ((((documentIRI == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10191)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10192)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10193);if ((((!ontologyID.isAnonymous())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10194)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10195)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10196);documentIRI = ontologyID.getDefaultDocumentIRI().orNull();
                    } }else {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10197);documentIRI = IRI.generateDocumentIRI();
                    }
                    }__CLR4_5_27qz7qzlviclgly.R.inc(10198);Collection<IRI> existingDocumentIRIs = documentIRIsByID.values();
                    __CLR4_5_27qz7qzlviclgly.R.inc(10199);while ((((existingDocumentIRIs.contains(documentIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10200)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10201)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10202);documentIRI = IRI.generateDocumentIRI();
                    }
                }}
                }__CLR4_5_27qz7qzlviclgly.R.inc(10203);if ((((documentIRIsByID.values().contains(documentIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10204)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10205)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10206);throw new OWLRuntimeException(new OWLOntologyDocumentAlreadyExistsException(documentIRI));
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10207);return result;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10208);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public Set<OWLOntology> getVersions(IRI ontologyIRI) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10209);
        __CLR4_5_27qz7qzlviclgly.R.inc(10210);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10211);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10212);Set<OWLOntology> result = new HashSet<>();
            __CLR4_5_27qz7qzlviclgly.R.inc(10213);for (OWLOntology ont : getOntologies()) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10214);OWLOntologyID ontId = ont.getOntologyID();
                __CLR4_5_27qz7qzlviclgly.R.inc(10215);Optional<IRI> ontIRI = ontId.getOntologyIRI();
                __CLR4_5_27qz7qzlviclgly.R.inc(10216);if ((((ontIRI.isPresent() && ontIRI.get().equals(ontologyIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10217)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10218)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10219);result.add(ont);
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10220);return result;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10221);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Nullable
    @Override
    public OWLOntology getImportedOntology(OWLImportsDeclaration declaration) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10222);
        __CLR4_5_27qz7qzlviclgly.R.inc(10223);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10224);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10225);OWLOntologyID ontologyID = ontologyIDsByImportsDeclaration.get(declaration);
            __CLR4_5_27qz7qzlviclgly.R.inc(10226);if ((((ontologyID == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10227)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10228)==0&false))) {{
                // No such ontology has been loaded through an import
                // declaration, but it might have been loaded manually.
                // Using the IRI to retrieve it will either find the ontology or
                // return null.
                // Last possibility is an import by document IRI; if the
                // ontology is not found by IRI, check by document IRI.
                __CLR4_5_27qz7qzlviclgly.R.inc(10229);OWLOntology ontology = getOntology(declaration.getIRI());
                __CLR4_5_27qz7qzlviclgly.R.inc(10230);if ((((ontology == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10231)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10232)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10233);ontology = getOntologyByDocumentIRI(declaration.getIRI());
                }
                }__CLR4_5_27qz7qzlviclgly.R.inc(10234);return ontology;
            } }else {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10235);return getOntology(ontologyID);
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10236);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public Set<OWLOntology> getDirectImports(OWLOntology ontology) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10237);
        __CLR4_5_27qz7qzlviclgly.R.inc(10238);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10239);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10240);if ((((!contains(ontology))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10241)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10242)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10243);throw new UnknownOWLOntologyException(ontology.getOntologyID());
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10244);Set<OWLOntology> imports = new HashSet<>();
            __CLR4_5_27qz7qzlviclgly.R.inc(10245);for (OWLImportsDeclaration axiom : ontology.getImportsDeclarations()) {{
                assert (((axiom != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10246)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10247)==0&false));
                __CLR4_5_27qz7qzlviclgly.R.inc(10248);OWLOntology importedOntology = getImportedOntology(axiom);
                __CLR4_5_27qz7qzlviclgly.R.inc(10249);if ((((importedOntology != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10250)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10251)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10252);imports.add(importedOntology);
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10253);return imports;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10254);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public Set<OWLOntology> getImports(OWLOntology ontology) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10255);
        __CLR4_5_27qz7qzlviclgly.R.inc(10256);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10257);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10258);if ((((!contains(ontology))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10259)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10260)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10261);throw new UnknownOWLOntologyException(ontology.getOntologyID());
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10262);Set<OWLOntology> result = new HashSet<>();
            __CLR4_5_27qz7qzlviclgly.R.inc(10263);getImports(ontology, result);
            __CLR4_5_27qz7qzlviclgly.R.inc(10264);return result;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10265);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    /**
     * A method that gets the imports of a given ontology.
     * 
     * @param ont
     *        The ontology whose (transitive) imports are to be retrieved.
     * @param result
     *        A place to store the result - the transitive closure of the
     *        imports will be stored in this result set.
     */
    private void getImports(@Nonnull OWLOntology ont, @Nonnull Set<OWLOntology> result) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10266);
        __CLR4_5_27qz7qzlviclgly.R.inc(10267);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10268);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10269);for (OWLOntology directImport : getDirectImports(ont)) {{
                assert (((directImport != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10270)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10271)==0&false));
                __CLR4_5_27qz7qzlviclgly.R.inc(10272);if ((((result.add(directImport))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10273)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10274)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10275);getImports(directImport, result);
                }
            }}
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10276);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public Set<OWLOntology> getImportsClosure(OWLOntology ontology) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10277);
        __CLR4_5_27qz7qzlviclgly.R.inc(10278);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10279);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10280);Set<OWLOntology> ontologies = importsClosureCache.get(ontology.getOntologyID());
            __CLR4_5_27qz7qzlviclgly.R.inc(10281);if ((((ontologies == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10282)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10283)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10284);ontologies = new LinkedHashSet<>();
                __CLR4_5_27qz7qzlviclgly.R.inc(10285);getImportsClosure(ontology, ontologies);
                // store the wrapped set
                __CLR4_5_27qz7qzlviclgly.R.inc(10286);importsClosureCache.put(ontology.getOntologyID(), ontologies);
            }
            // the returned set can be mutated, but changes will not be
            // propagated
            // back
            }__CLR4_5_27qz7qzlviclgly.R.inc(10287);return CollectionFactory.getCopyOnRequestSetFromMutableCollection(ontologies);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10288);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    /**
     * A recursive method that gets the reflexive transitive closure of the
     * ontologies that are imported by this ontology.
     * 
     * @param ontology
     *        The ontology whose reflexive transitive closure is to be retrieved
     * @param ontologies
     *        a place to store the result
     */
    private void getImportsClosure(@Nonnull OWLOntology ontology, @Nonnull Set<OWLOntology> ontologies) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10289);
        __CLR4_5_27qz7qzlviclgly.R.inc(10290);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10291);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10292);ontologies.add(ontology);
            __CLR4_5_27qz7qzlviclgly.R.inc(10293);for (OWLOntology ont : getDirectImports(ontology)) {{
                assert (((ont != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10294)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10295)==0&false));
                __CLR4_5_27qz7qzlviclgly.R.inc(10296);if ((((!ontologies.contains(ont))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10297)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10298)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10299);getImportsClosure(ont, ontologies);
                }
            }}
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10300);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public List<OWLOntology> getSortedImportsClosure(OWLOntology ontology) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10301);
        __CLR4_5_27qz7qzlviclgly.R.inc(10302);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10303);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10304);return new ArrayList<>(ontology.getImportsClosure());
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10305);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    /**
     * Determines if a change is applicable. A change may not be applicable for
     * a number of reasons.
     * 
     * @param change
     *        The change to be tested.
     * @return {@code true} if the change is applicable, otherwise,
     *         {@code false}.
     */
    private boolean isChangeApplicable(OWLOntologyChange change) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10306);
        __CLR4_5_27qz7qzlviclgly.R.inc(10307);OWLOntologyLoaderConfiguration ontologyConfig = ontologyConfigurationsByOntologyID.get(change.getOntology()
            .getOntologyID());
        __CLR4_5_27qz7qzlviclgly.R.inc(10308);if ((((ontologyConfig != null && !ontologyConfig.isLoadAnnotationAxioms() && change.isAddAxiom() && change
            .getAxiom() instanceof OWLAnnotationAxiom)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10309)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10310)==0&false))) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10311);return false;
        }
        }__CLR4_5_27qz7qzlviclgly.R.inc(10312);return true;
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    /**
     * Applies a change to an ontology and performs the necessary housekeeping
     * tasks.
     * 
     * @param change
     *        The change to be applied.
     * @return A list of changes that were actually applied.
     */
    private ChangeApplied enactChangeApplication(OWLOntologyChange change) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10313);
        __CLR4_5_27qz7qzlviclgly.R.inc(10314);if ((((!isChangeApplicable(change))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10315)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10316)==0&false))) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10317);return ChangeApplied.UNSUCCESSFULLY;
        }
        }__CLR4_5_27qz7qzlviclgly.R.inc(10318);OWLOntology ont = change.getOntology();
        __CLR4_5_27qz7qzlviclgly.R.inc(10319);if ((((!(ont instanceof OWLMutableOntology))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10320)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10321)==0&false))) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10322);throw new ImmutableOWLOntologyChangeException(change.getChangeData(), ont.toString());
        }
        }__CLR4_5_27qz7qzlviclgly.R.inc(10323);checkForOntologyIDChange(change);
        __CLR4_5_27qz7qzlviclgly.R.inc(10324);ChangeApplied appliedChange = ((OWLMutableOntology) ont).applyChange(change);
        __CLR4_5_27qz7qzlviclgly.R.inc(10325);checkForImportsChange(change);
        __CLR4_5_27qz7qzlviclgly.R.inc(10326);return appliedChange;
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public ChangeApplied applyChanges(List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10327);
        __CLR4_5_27qz7qzlviclgly.R.inc(10328);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10329);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10330);try {
                __CLR4_5_27qz7qzlviclgly.R.inc(10331);broadcastImpendingChanges(changes);
            } catch (OWLOntologyChangeVetoException e) {
                // Some listener blocked the changes.
                __CLR4_5_27qz7qzlviclgly.R.inc(10332);broadcastOntologyChangesVetoed(changes, e);
                __CLR4_5_27qz7qzlviclgly.R.inc(10333);return ChangeApplied.UNSUCCESSFULLY;
            }
            __CLR4_5_27qz7qzlviclgly.R.inc(10334);boolean rollbackRequested = false;
            __CLR4_5_27qz7qzlviclgly.R.inc(10335);boolean allNoOps = true;
            // list of changes applied successfully. These are the changes that
            // will be reverted in case of a rollback
            __CLR4_5_27qz7qzlviclgly.R.inc(10336);List<OWLOntologyChange> appliedChanges = new ArrayList<>();
            __CLR4_5_27qz7qzlviclgly.R.inc(10337);fireBeginChanges(changes.size());
            __CLR4_5_27qz7qzlviclgly.R.inc(10338);for (OWLOntologyChange change : changes) {{
                // once rollback is requested by a failed change, do not carry
                // out any more changes
                __CLR4_5_27qz7qzlviclgly.R.inc(10339);if ((((!rollbackRequested)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10340)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10341)==0&false))) {{
                    assert (((change != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10342)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10343)==0&false));
                    __CLR4_5_27qz7qzlviclgly.R.inc(10344);ChangeApplied enactChangeApplication = enactChangeApplication(change);
                    __CLR4_5_27qz7qzlviclgly.R.inc(10345);if ((((enactChangeApplication == ChangeApplied.UNSUCCESSFULLY)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10346)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10347)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10348);rollbackRequested = true;
                    }
                    }__CLR4_5_27qz7qzlviclgly.R.inc(10349);if ((((enactChangeApplication == ChangeApplied.SUCCESSFULLY)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10350)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10351)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10352);allNoOps = false;
                        __CLR4_5_27qz7qzlviclgly.R.inc(10353);appliedChanges.add(change);
                    }
                    }__CLR4_5_27qz7qzlviclgly.R.inc(10354);fireChangeApplied(change);
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10355);if ((((rollbackRequested)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10356)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10357)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10358);for (OWLOntologyChange c : appliedChanges) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10359);ChangeApplied enactChangeApplication = enactChangeApplication(c.reverseChange());
                    __CLR4_5_27qz7qzlviclgly.R.inc(10360);if ((((enactChangeApplication == ChangeApplied.UNSUCCESSFULLY)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10361)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10362)==0&false))) {{
                        // rollback could not complete, throw an exception
                        __CLR4_5_27qz7qzlviclgly.R.inc(10363);throw new OWLRuntimeException("Rollback of changes unsuccessful: Change " + c
                            + " could not be rolled back");
                    }
                }}
                }__CLR4_5_27qz7qzlviclgly.R.inc(10364);appliedChanges.clear();
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10365);fireEndChanges();
            __CLR4_5_27qz7qzlviclgly.R.inc(10366);broadcastChanges(appliedChanges);
            __CLR4_5_27qz7qzlviclgly.R.inc(10367);if ((((rollbackRequested)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10368)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10369)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10370);return ChangeApplied.UNSUCCESSFULLY;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10371);if ((((allNoOps)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10372)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10373)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10374);return ChangeApplied.NO_OPERATION;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10375);return ChangeApplied.SUCCESSFULLY;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10376);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public ChangeApplied addAxiom(@Nonnull OWLOntology ont, @Nonnull OWLAxiom axiom) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10377);
        __CLR4_5_27qz7qzlviclgly.R.inc(10378);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10379);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10380);return addAxioms(ont, CollectionFactory.createSet(axiom));
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10381);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public ChangeApplied addAxioms(@Nonnull OWLOntology ont, @Nonnull Set<? extends OWLAxiom> axioms) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10382);
        __CLR4_5_27qz7qzlviclgly.R.inc(10383);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10384);try {
            // Write lock not needed at this point
            __CLR4_5_27qz7qzlviclgly.R.inc(10385);List<AddAxiom> changes = new ArrayList<>(axioms.size() + 2);
            __CLR4_5_27qz7qzlviclgly.R.inc(10386);for (OWLAxiom ax : axioms) {{
                assert (((ax != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10387)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10388)==0&false));
                __CLR4_5_27qz7qzlviclgly.R.inc(10389);changes.add(new AddAxiom(ont, ax));
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10390);return applyChanges(changes);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10391);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public ChangeApplied removeAxiom(@Nonnull OWLOntology ont, @Nonnull OWLAxiom axiom) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10392);
        __CLR4_5_27qz7qzlviclgly.R.inc(10393);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10394);try {
            // Write lock not needed at this point
            __CLR4_5_27qz7qzlviclgly.R.inc(10395);return removeAxioms(ont, CollectionFactory.createSet(axiom));
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10396);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public ChangeApplied removeAxioms(@Nonnull OWLOntology ont, @Nonnull Set<? extends OWLAxiom> axioms) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10397);
        // Write lock not needed at this point
        __CLR4_5_27qz7qzlviclgly.R.inc(10398);List<RemoveAxiom> changes = new ArrayList<>(axioms.size() + 2);
        __CLR4_5_27qz7qzlviclgly.R.inc(10399);for (OWLAxiom ax : axioms) {{
            assert (((ax != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10400)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10401)==0&false));
            __CLR4_5_27qz7qzlviclgly.R.inc(10402);changes.add(new RemoveAxiom(ont, ax));
        }
        }__CLR4_5_27qz7qzlviclgly.R.inc(10403);return applyChanges(changes);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public ChangeApplied applyChange(@Nonnull OWLOntologyChange change) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10404);
        __CLR4_5_27qz7qzlviclgly.R.inc(10405);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10406);try {
            // Write lock not needed at this point
            __CLR4_5_27qz7qzlviclgly.R.inc(10407);return applyChanges(CollectionFactory.list(change));
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10408);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    private void checkForImportsChange(OWLOntologyChange change) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10409);
        // Called by a write lock holder
        __CLR4_5_27qz7qzlviclgly.R.inc(10410);if ((((change.isImportChange())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10411)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10412)==0&false))) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10413);resetImportsClosureCache();
            __CLR4_5_27qz7qzlviclgly.R.inc(10414);if ((((change instanceof AddImport)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10415)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10416)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10417);OWLImportsDeclaration addImportDeclaration = ((AddImport) change).getImportDeclaration();
                __CLR4_5_27qz7qzlviclgly.R.inc(10418);boolean found = false;
                __CLR4_5_27qz7qzlviclgly.R.inc(10419);IRI iri = addImportDeclaration.getIRI();
                __CLR4_5_27qz7qzlviclgly.R.inc(10420);for (OWLOntologyID id : ontologiesByID.keySet()) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10421);if ((((iri.equals(id.getDefaultDocumentIRI().orNull()) || iri.equals(id.getOntologyIRI().orNull())
                        || iri.equals(id.getVersionIRI().orNull()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10422)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10423)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10424);found = true;
                        __CLR4_5_27qz7qzlviclgly.R.inc(10425);ontologyIDsByImportsDeclaration.put(addImportDeclaration, id);
                    }
                }}
                }__CLR4_5_27qz7qzlviclgly.R.inc(10426);if ((((!found)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10427)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10428)==0&false))) {{
                    // then the import does not refer to a known IRI for
                    // ontologies; check for a document IRI
                    __CLR4_5_27qz7qzlviclgly.R.inc(10429);for (Map.Entry<OWLOntologyID, IRI> e : documentIRIsByID.entrySet()) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10430);if ((((e.getValue().equals(iri))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10431)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10432)==0&false))) {{
                            // found the ontology id corresponding to the file
                            // location
                            __CLR4_5_27qz7qzlviclgly.R.inc(10433);ontologyIDsByImportsDeclaration.put(addImportDeclaration, e.getKey());
                        }
                    }}
                }}
            }} }else {{
                // Remove the mapping from declaration to ontology
                __CLR4_5_27qz7qzlviclgly.R.inc(10434);OWLImportsDeclaration importDeclaration = ((RemoveImport) change).getImportDeclaration();
                __CLR4_5_27qz7qzlviclgly.R.inc(10435);ontologyIDsByImportsDeclaration.remove(importDeclaration);
                __CLR4_5_27qz7qzlviclgly.R.inc(10436);importedIRIs.remove(importDeclaration.getIRI());
            }
        }}
    }}finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    private void checkForOntologyIDChange(OWLOntologyChange change) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10437);
        __CLR4_5_27qz7qzlviclgly.R.inc(10438);if ((((change instanceof SetOntologyID)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10439)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10440)==0&false))) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10441);SetOntologyID setID = (SetOntologyID) change;
            __CLR4_5_27qz7qzlviclgly.R.inc(10442);OWLOntology existingOntology = ontologiesByID.get(((SetOntologyID) change).getNewOntologyID());
            __CLR4_5_27qz7qzlviclgly.R.inc(10443);if ((((existingOntology != null && !change.getOntology().equals(existingOntology))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10444)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10445)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10446);if ((((!change.getOntology().getAxioms().equals(existingOntology.getAxioms()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10447)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10448)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10449);LOGGER.error("OWLOntologyManagerImpl.checkForOntologyIDChange() existing:{}", existingOntology);
                    __CLR4_5_27qz7qzlviclgly.R.inc(10450);LOGGER.error("OWLOntologyManagerImpl.checkForOntologyIDChange() new:{}", change.getOntology());
                    __CLR4_5_27qz7qzlviclgly.R.inc(10451);throw new OWLOntologyRenameException(change.getChangeData(), ((SetOntologyID) change)
                        .getNewOntologyID());
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10452);renameOntology(setID.getOriginalOntologyID(), setID.getNewOntologyID());
            __CLR4_5_27qz7qzlviclgly.R.inc(10453);resetImportsClosureCache();
        }
    }}finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    // Methods to create, load and reload ontologies
    @Override
    public void ontologyCreated(OWLOntology ontology) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10454);
        // This method is called when a factory that we have asked to create or
        // load an ontology has created the ontology. We add the ontology to the
        // set of loaded ontologies.
        __CLR4_5_27qz7qzlviclgly.R.inc(10455);addOntology(ontology);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void setOntologyFormat(OWLOntology ontology, OWLDocumentFormat ontologyFormat) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10456);
        __CLR4_5_27qz7qzlviclgly.R.inc(10457);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10458);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10459);OWLOntologyID ontologyID = ontology.getOntologyID();
            __CLR4_5_27qz7qzlviclgly.R.inc(10460);ontologyFormatsByOntology.put(ontologyID, ontologyFormat);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10461);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLDocumentFormat getOntologyFormat(@Nonnull OWLOntology ontology) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10462);
        __CLR4_5_27qz7qzlviclgly.R.inc(10463);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10464);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10465);OWLOntologyID ontologyID = ontology.getOntologyID();
            __CLR4_5_27qz7qzlviclgly.R.inc(10466);return ontologyFormatsByOntology.get(ontologyID);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10467);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology createOntology() throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10468);
        // Brand new ontology without a URI
        __CLR4_5_27qz7qzlviclgly.R.inc(10469);return createOntology(new OWLOntologyID());
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology createOntology(@Nonnull IRI ontologyIRI) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10470);
        __CLR4_5_27qz7qzlviclgly.R.inc(10471);return createOntology(new OWLOntologyID(of(ontologyIRI), absent()));
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology createOntology(@Nonnull OWLOntologyID ontologyID) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10472);
        __CLR4_5_27qz7qzlviclgly.R.inc(10473);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10474);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10475);OWLOntology ontology = ontologiesByID.get(ontologyID);
            __CLR4_5_27qz7qzlviclgly.R.inc(10476);if ((((ontology != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10477)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10478)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10479);throw new OWLOntologyAlreadyExistsException(ontologyID);
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10480);IRI documentIRI = getDocumentIRIFromMappers(ontologyID);
            __CLR4_5_27qz7qzlviclgly.R.inc(10481);if ((((documentIRI == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10482)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10483)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10484);if ((((!ontologyID.isAnonymous())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10485)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10486)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10487);documentIRI = ontologyID.getDefaultDocumentIRI().orNull();
                } }else {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10488);documentIRI = IRI.generateDocumentIRI();
                }
                }__CLR4_5_27qz7qzlviclgly.R.inc(10489);Collection<IRI> existingDocumentIRIs = documentIRIsByID.values();
                __CLR4_5_27qz7qzlviclgly.R.inc(10490);while ((((existingDocumentIRIs.contains(documentIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10491)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10492)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10493);documentIRI = IRI.generateDocumentIRI();
                }
            }}
            }assert (((documentIRI != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10494)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10495)==0&false));
            __CLR4_5_27qz7qzlviclgly.R.inc(10496);if ((((documentIRIsByID.values().contains(documentIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10497)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10498)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10499);throw new OWLOntologyDocumentAlreadyExistsException(documentIRI);
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10500);for (OWLOntologyFactory factory : ontologyFactories) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10501);if ((((factory.canCreateFromDocumentIRI(documentIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10502)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10503)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10504);documentIRIsByID.put(ontologyID, documentIRI);
                    __CLR4_5_27qz7qzlviclgly.R.inc(10505);return factory.createOWLOntology(this, ontologyID, documentIRI, this);
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10506);throw new OWLOntologyFactoryNotFoundException(documentIRI);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10507);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology createOntology(IRI ontologyIRI, Set<OWLOntology> ontologies)
        throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10508);
        __CLR4_5_27qz7qzlviclgly.R.inc(10509);return createOntology(ontologyIRI, ontologies, false);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology createOntology(IRI ontologyIRI, Set<OWLOntology> ontologies, boolean copyLogicalAxiomsOnly)
        throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10510);
        __CLR4_5_27qz7qzlviclgly.R.inc(10511);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10512);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10513);if ((((contains(ontologyIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10514)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10515)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10516);throw new OWLOntologyAlreadyExistsException(new OWLOntologyID(of(ontologyIRI), absent()));
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10517);OWLOntology ont = createOntology(ontologyIRI);
            __CLR4_5_27qz7qzlviclgly.R.inc(10518);Set<OWLAxiom> axioms = new HashSet<>();
            __CLR4_5_27qz7qzlviclgly.R.inc(10519);for (OWLOntology ontology : ontologies) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10520);if ((((copyLogicalAxiomsOnly)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10521)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10522)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10523);axioms.addAll(ontology.getLogicalAxioms());
                } }else {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10524);axioms.addAll(ontology.getAxioms());
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10525);addAxioms(ont, axioms);
            __CLR4_5_27qz7qzlviclgly.R.inc(10526);return ont;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10527);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology createOntology(Set<OWLAxiom> axioms, IRI ontologyIRI) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10528);
        __CLR4_5_27qz7qzlviclgly.R.inc(10529);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10530);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10531);if ((((contains(ontologyIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10532)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10533)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10534);throw new OWLOntologyAlreadyExistsException(new OWLOntologyID(of(ontologyIRI), absent()));
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10535);OWLOntology ont = createOntology(ontologyIRI);
            __CLR4_5_27qz7qzlviclgly.R.inc(10536);addAxioms(ont, axioms);
            __CLR4_5_27qz7qzlviclgly.R.inc(10537);return ont;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10538);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology createOntology(Set<OWLAxiom> axioms) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10539);
        __CLR4_5_27qz7qzlviclgly.R.inc(10540);return createOntology(axioms, getNextAutoGeneratedIRI());
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology copyOntology(OWLOntology toCopy, OntologyCopy settings) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10541);
        __CLR4_5_27qz7qzlviclgly.R.inc(10542);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10543);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10544);checkNotNull(toCopy);
            __CLR4_5_27qz7qzlviclgly.R.inc(10545);checkNotNull(settings);
            __CLR4_5_27qz7qzlviclgly.R.inc(10546);OWLOntology toReturn = null;
            __CLR4_5_27qz7qzlviclgly.R.inc(10547);if ((((settings == OntologyCopy.MOVE)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10548)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10549)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10550);toReturn = toCopy;
                __CLR4_5_27qz7qzlviclgly.R.inc(10551);ontologiesByID.put(toReturn.getOntologyID(), toReturn);
            } }else {__CLR4_5_27qz7qzlviclgly.R.inc(10552);if ((((settings == OntologyCopy.SHALLOW || settings == OntologyCopy.DEEP)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10553)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10554)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10555);toReturn = createOntology(toCopy.getOntologyID());
                __CLR4_5_27qz7qzlviclgly.R.inc(10556);for (AxiomType<?> type : AxiomType.AXIOM_TYPES) {{
                    assert (((type != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10557)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10558)==0&false));
                    __CLR4_5_27qz7qzlviclgly.R.inc(10559);addAxioms(toReturn, toCopy.getAxioms(type));
                }
                }__CLR4_5_27qz7qzlviclgly.R.inc(10560);for (OWLAnnotation a : toCopy.getAnnotations()) {{
                    assert (((a != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10561)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10562)==0&false));
                    __CLR4_5_27qz7qzlviclgly.R.inc(10563);applyChange(new AddOntologyAnnotation(toReturn, a));
                }
                }__CLR4_5_27qz7qzlviclgly.R.inc(10564);for (OWLImportsDeclaration a : toCopy.getImportsDeclarations()) {{
                    assert (((a != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10565)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10566)==0&false));
                    __CLR4_5_27qz7qzlviclgly.R.inc(10567);applyChange(new AddImport(toReturn, a));
                }
            }}
            // toReturn now initialized
            }}assert (((toReturn != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10568)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10569)==0&false));
            __CLR4_5_27qz7qzlviclgly.R.inc(10570);OWLOntologyManager m = toCopy.getOWLOntologyManager();
            __CLR4_5_27qz7qzlviclgly.R.inc(10571);if ((((settings == OntologyCopy.MOVE || settings == OntologyCopy.DEEP)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10572)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10573)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10574);setOntologyDocumentIRI(toReturn, m.getOntologyDocumentIRI(toCopy));
                __CLR4_5_27qz7qzlviclgly.R.inc(10575);OWLDocumentFormat f = m.getOntologyFormat(toCopy);
                __CLR4_5_27qz7qzlviclgly.R.inc(10576);if ((((f != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10577)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10578)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10579);setOntologyFormat(toReturn, f);
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10580);if ((((settings == OntologyCopy.MOVE)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10581)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10582)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10583);m.removeOntology(toCopy);
                // at this point toReturn and toCopy are the same object
                // change the manager on the ontology
                __CLR4_5_27qz7qzlviclgly.R.inc(10584);toReturn.setOWLOntologyManager(this);
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10585);return toReturn;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10586);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology loadOntology(IRI ontologyIRI) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10587);
        __CLR4_5_27qz7qzlviclgly.R.inc(10588);return loadOntology(ontologyIRI, false, getOntologyLoaderConfiguration());
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Nonnull
    protected OWLOntology loadOntology(@Nonnull IRI ontologyIRI, boolean allowExists,
        @Nonnull OWLOntologyLoaderConfiguration configuration) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10589);
        __CLR4_5_27qz7qzlviclgly.R.inc(10590);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10591);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10592);OWLOntology ontByID = null;
            // Check for matches on the ontology IRI first
            __CLR4_5_27qz7qzlviclgly.R.inc(10593);for (OWLOntologyID nextOntologyID : ontologiesByID.keySet()) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10594);if ((((ontologyIRI.equals(nextOntologyID.getOntologyIRI().orNull()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10595)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10596)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10597);ontByID = ontologiesByID.get(nextOntologyID);
                }
            }}
            // This method may be called using a version IRI, so also check the
            // version IRI if necessary
            }__CLR4_5_27qz7qzlviclgly.R.inc(10598);if ((((ontByID == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10599)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10600)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10601);for (OWLOntologyID nextOntologyID : ontologiesByID.keySet()) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10602);if ((((ontologyIRI.equals(nextOntologyID.getVersionIRI().orNull()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10603)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10604)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10605);ontByID = ontologiesByID.get(nextOntologyID);
                    }
                }}
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10606);if ((((ontByID != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10607)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10608)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10609);return ontByID;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10610);OWLOntologyID id = new OWLOntologyID(of(ontologyIRI), absent());
            __CLR4_5_27qz7qzlviclgly.R.inc(10611);IRI documentIRI = getDocumentIRIFromMappers(id);
            __CLR4_5_27qz7qzlviclgly.R.inc(10612);if ((((documentIRI != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10613)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10614)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10615);if ((((documentIRIsByID.values().contains(documentIRI) && !allowExists)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10616)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10617)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10618);throw new OWLOntologyDocumentAlreadyExistsException(documentIRI);
                }
                // The ontology might be being loaded, but its IRI might
                // not have been set (as is probably the case with RDF/XML!)
                }__CLR4_5_27qz7qzlviclgly.R.inc(10619);OWLOntology ontByDocumentIRI = loadOntologyByDocumentIRI(documentIRI);
                __CLR4_5_27qz7qzlviclgly.R.inc(10620);if ((((ontByDocumentIRI != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10621)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10622)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10623);return ontByDocumentIRI;
                }
            }} }else {{
                // Nothing we can do here. We can't get a document IRI to load
                // the ontology from.
                __CLR4_5_27qz7qzlviclgly.R.inc(10624);throw new OntologyIRIMappingNotFoundException(ontologyIRI);
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10625);return loadOntology(ontologyIRI, new IRIDocumentSource(documentIRI, null, null), configuration);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10626);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    private OWLOntology loadOntologyByDocumentIRI(IRI documentIRI) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10627);
        __CLR4_5_27qz7qzlviclgly.R.inc(10628);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10629);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10630);for (OWLOntologyID ontID : documentIRIsByID.keySet()) {{
                assert (((ontID != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10631)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10632)==0&false));
                __CLR4_5_27qz7qzlviclgly.R.inc(10633);IRI docIRI = documentIRIsByID.get(ontID);
                __CLR4_5_27qz7qzlviclgly.R.inc(10634);if ((((docIRI != null && docIRI.equals(documentIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10635)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10636)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10637);return getOntology(ontID);
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10638);return null;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10639);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}
    private OWLOntology getOntologyByDocumentIRI(IRI documentIRI) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10640);
        __CLR4_5_27qz7qzlviclgly.R.inc(10641);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10642);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10643);for (OWLOntologyID ontID : documentIRIsByID.keySet()) {{
                assert (((ontID != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10644)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10645)==0&false));
                __CLR4_5_27qz7qzlviclgly.R.inc(10646);IRI docIRI = documentIRIsByID.get(ontID);
                __CLR4_5_27qz7qzlviclgly.R.inc(10647);if ((((documentIRI.equals(docIRI))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10648)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10649)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10650);return ontologiesByID.get(ontID);
                }
            }}
            }__CLR4_5_27qz7qzlviclgly.R.inc(10651);return null;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10652);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology loadOntologyFromOntologyDocument(IRI documentIRI) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10653);
        // Ontology URI not known in advance
        __CLR4_5_27qz7qzlviclgly.R.inc(10654);return loadOntology(null, new IRIDocumentSource(documentIRI, null, null), getOntologyLoaderConfiguration());
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology loadOntologyFromOntologyDocument(OWLOntologyDocumentSource documentSource)
        throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10655);
        // Ontology URI not known in advance
        __CLR4_5_27qz7qzlviclgly.R.inc(10656);return loadOntology(null, documentSource, getOntologyLoaderConfiguration());
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology loadOntologyFromOntologyDocument(OWLOntologyDocumentSource documentSource,
        OWLOntologyLoaderConfiguration conf) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10657);
        __CLR4_5_27qz7qzlviclgly.R.inc(10658);return loadOntology(null, documentSource, conf);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology loadOntologyFromOntologyDocument(File file) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10659);
        __CLR4_5_27qz7qzlviclgly.R.inc(10660);return loadOntologyFromOntologyDocument(new FileDocumentSource(file));
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public OWLOntology loadOntologyFromOntologyDocument(InputStream inputStream) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10661);
        __CLR4_5_27qz7qzlviclgly.R.inc(10662);return loadOntologyFromOntologyDocument(new StreamDocumentSource(inputStream));
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    /**
     * This is the method that all the other load method delegate to.
     * 
     * @param ontologyIRI
     *        The URI of the ontology to be loaded. This is only used to report
     *        to listeners and may be {@code null}
     * @param documentSource
     *        The input source that specifies where the ontology should be
     *        loaded from.
     * @param configuration
     *        load configuration
     * @return The ontology that was loaded.
     * @throws OWLOntologyCreationException
     *         If the ontology could not be loaded.
     */
    @Nonnull
    protected OWLOntology loadOntology(@Nullable IRI ontologyIRI, @Nonnull OWLOntologyDocumentSource documentSource,
        @Nonnull OWLOntologyLoaderConfiguration configuration) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10663);
        __CLR4_5_27qz7qzlviclgly.R.inc(10664);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10665);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10666);if ((((loadCount.get() != importsLoadCount.get())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10667)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10668)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10669);LOGGER.warn(
                    "Runtime Warning: Parsers should load imported ontologies using the makeImportLoadRequest method.");
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10670);fireStartedLoadingEvent(new OWLOntologyID(of(ontologyIRI), absent()), documentSource.getDocumentIRI(),
                loadCount.get() > 0);
            __CLR4_5_27qz7qzlviclgly.R.inc(10671);loadCount.incrementAndGet();
            __CLR4_5_27qz7qzlviclgly.R.inc(10672);broadcastChanges.set(false);
            __CLR4_5_27qz7qzlviclgly.R.inc(10673);Exception ex = null;
            __CLR4_5_27qz7qzlviclgly.R.inc(10674);OWLOntologyID idOfLoadedOntology = new OWLOntologyID();
            __CLR4_5_27qz7qzlviclgly.R.inc(10675);try {
                __CLR4_5_27qz7qzlviclgly.R.inc(10676);OWLOntology ontology = actualParse(documentSource, configuration);
                __CLR4_5_27qz7qzlviclgly.R.inc(10677);if ((((ontology != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10678)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10679)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10680);idOfLoadedOntology = ontology.getOntologyID();
                    __CLR4_5_27qz7qzlviclgly.R.inc(10681);return ontology;
                }
            }} catch (OWLOntologyRenameException e) {
                // We loaded an ontology from a document and the
                // ontology turned out to have an IRI the same
                // as a previously loaded ontology
                __CLR4_5_27qz7qzlviclgly.R.inc(10682);ex = e;
                __CLR4_5_27qz7qzlviclgly.R.inc(10683);throw new OWLOntologyAlreadyExistsException(e.getOntologyID(), e);
            } catch (UnloadableImportException e) {
                __CLR4_5_27qz7qzlviclgly.R.inc(10684);ex = e;
                __CLR4_5_27qz7qzlviclgly.R.inc(10685);throw e;
            } catch (OWLRuntimeException e) {
                __CLR4_5_27qz7qzlviclgly.R.inc(10686);if ((((e.getCause() instanceof OWLOntologyCreationException)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10687)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10688)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10689);ex = (OWLOntologyCreationException) e.getCause();
                    __CLR4_5_27qz7qzlviclgly.R.inc(10690);throw (OWLOntologyCreationException) e.getCause();
                }
                }__CLR4_5_27qz7qzlviclgly.R.inc(10691);throw e;
            } catch (OWLOntologyCreationException e) {
                __CLR4_5_27qz7qzlviclgly.R.inc(10692);ex = e;
                __CLR4_5_27qz7qzlviclgly.R.inc(10693);throw e;
            } finally {
                __CLR4_5_27qz7qzlviclgly.R.inc(10694);loadCount.decrementAndGet();
                __CLR4_5_27qz7qzlviclgly.R.inc(10695);if ((((loadCount.get() == 0)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10696)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10697)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10698);broadcastChanges.set(true);
                    // Completed loading ontology and imports
                }
                }__CLR4_5_27qz7qzlviclgly.R.inc(10699);fireFinishedLoadingEvent(idOfLoadedOntology, documentSource.getDocumentIRI(), loadCount.get() > 0, ex);
            }
            __CLR4_5_27qz7qzlviclgly.R.inc(10700);throw new OWLOntologyFactoryNotFoundException(documentSource.getDocumentIRI());
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10701);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected OWLOntology actualParse(OWLOntologyDocumentSource documentSource,
        OWLOntologyLoaderConfiguration configuration) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10702);
        __CLR4_5_27qz7qzlviclgly.R.inc(10703);for (OWLOntologyFactory factory : ontologyFactories) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10704);if ((((factory.canLoad(documentSource))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10705)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10706)==0&false))) {{
                // Note - there is no need to add the ontology here,
                // because it will be added
                // when the ontology is created.
                __CLR4_5_27qz7qzlviclgly.R.inc(10707);OWLOntology ontology = factory.loadOWLOntology(this, documentSource, this, configuration);
                __CLR4_5_27qz7qzlviclgly.R.inc(10708);fixIllegalPunnings(ontology);
                // Store the ontology to the document IRI mapping
                __CLR4_5_27qz7qzlviclgly.R.inc(10709);documentIRIsByID.put(ontology.getOntologyID(), documentSource.getDocumentIRI());
                __CLR4_5_27qz7qzlviclgly.R.inc(10710);ontologyConfigurationsByOntologyID.put(ontology.getOntologyID(), configuration);
                __CLR4_5_27qz7qzlviclgly.R.inc(10711);if ((((ontology instanceof HasTrimToSize)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10712)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10713)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10714);((HasTrimToSize) ontology).trimToSize();
                }
                }__CLR4_5_27qz7qzlviclgly.R.inc(10715);return ontology;
            }
        }}
        }__CLR4_5_27qz7qzlviclgly.R.inc(10716);return null;
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected void fixIllegalPunnings(OWLOntology o) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10717);
        __CLR4_5_27qz7qzlviclgly.R.inc(10718);Collection<IRI> illegals = OWLDocumentFormatImpl.determineIllegalPunnings(true, o.getSignature(INCLUDED), o
            .getPunnedIRIs(INCLUDED));
        __CLR4_5_27qz7qzlviclgly.R.inc(10719);Multimap<IRI, OWLDeclarationAxiom> illegalDeclarations = HashMultimap.create();
        __CLR4_5_27qz7qzlviclgly.R.inc(10720);Set<OWLDeclarationAxiom> declarations = o.getAxioms(AxiomType.DECLARATION, INCLUDED);
        __CLR4_5_27qz7qzlviclgly.R.inc(10721);for (OWLDeclarationAxiom d : declarations) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10722);if ((((illegals.contains(d.getEntity().getIRI()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10723)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10724)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10725);illegalDeclarations.put(d.getEntity().getIRI(), d);
            }
        }}
        }__CLR4_5_27qz7qzlviclgly.R.inc(10726);Map<OWLEntity, OWLEntity> replacementMap = new HashMap<>();
        __CLR4_5_27qz7qzlviclgly.R.inc(10727);for (Map.Entry<IRI, Collection<OWLDeclarationAxiom>> e : illegalDeclarations.asMap().entrySet()) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10728);if ((((e.getValue().size() == 1)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10729)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10730)==0&false))) {{
                // One declaration only: illegal punning comes from use or from
                // defaulting of types
                __CLR4_5_27qz7qzlviclgly.R.inc(10731);OWLDeclarationAxiom correctDeclaration = e.getValue().iterator().next();
                // currently we only know how to fix the incorrect defaulting of
                // properties to annotation properties
                __CLR4_5_27qz7qzlviclgly.R.inc(10732);OWLEntity entity = correctDeclaration.getEntity();
                __CLR4_5_27qz7qzlviclgly.R.inc(10733);if ((((entity.isOWLDataProperty() || entity.isOWLObjectProperty())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10734)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10735)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10736);OWLAnnotationProperty wrongProperty = dataFactory.getOWLAnnotationProperty(entity.getIRI());
                    __CLR4_5_27qz7qzlviclgly.R.inc(10737);replacementMap.put(wrongProperty, entity);
                }
            }} }else {{
                // Multiple declarations: bad data. Cannot be repaired
                // automatically.
                __CLR4_5_27qz7qzlviclgly.R.inc(10738);LOGGER.error("Illegal redeclarations of entities: reuse of entity {} in punning not allowed {}", e
                    .getKey(), e.getValue());
            }
        }}
        }__CLR4_5_27qz7qzlviclgly.R.inc(10739);for (OWLOntology ont : o.getImportsClosure()) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10740);for (OWLEntity e : replacementMap.keySet()) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10741);if ((((ont.containsEntityInSignature(e))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10742)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10743)==0&false))) {{
                    // then all axioms referring the annotation property
                    // must be rebuilt.
                    __CLR4_5_27qz7qzlviclgly.R.inc(10744);List<OWLAxiomChange> list = new ArrayList<>();
                    __CLR4_5_27qz7qzlviclgly.R.inc(10745);for (OWLAxiom ax : ont.getAxioms()) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10746);if ((((ax.getSignature().contains(e))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10747)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10748)==0&false))) {{
                            __CLR4_5_27qz7qzlviclgly.R.inc(10749);list.add(new RemoveAxiom(ont, ax));
                            __CLR4_5_27qz7qzlviclgly.R.inc(10750);OWLAnnotationPropertyTransformer changer = new OWLAnnotationPropertyTransformer(
                                replacementMap, dataFactory);
                            __CLR4_5_27qz7qzlviclgly.R.inc(10751);list.add(new AddAxiom(ont, changer.transformObject(ax)));
                        }
                    }}
                    }__CLR4_5_27qz7qzlviclgly.R.inc(10752);o.getOWLOntologyManager().applyChanges(list);
                }
            }}
        }}
    }}finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeOntology(OWLOntology ontology) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10753);
        __CLR4_5_27qz7qzlviclgly.R.inc(10754);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10755);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10756);removeOntology(ontology.getOntologyID());
            __CLR4_5_27qz7qzlviclgly.R.inc(10757);ontology.setOWLOntologyManager(null);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10758);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeOntology(OWLOntologyID ontologyID) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10759);
        __CLR4_5_27qz7qzlviclgly.R.inc(10760);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10761);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10762);ontologiesByID.remove(ontologyID);
            __CLR4_5_27qz7qzlviclgly.R.inc(10763);ontologyFormatsByOntology.remove(ontologyID);
            __CLR4_5_27qz7qzlviclgly.R.inc(10764);documentIRIsByID.remove(ontologyID);
            __CLR4_5_27qz7qzlviclgly.R.inc(10765);resetImportsClosureCache();
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10766);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    private void addOntology(OWLOntology ont) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10767);
        __CLR4_5_27qz7qzlviclgly.R.inc(10768);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10769);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10770);ontologiesByID.put(ont.getOntologyID(), ont);
            __CLR4_5_27qz7qzlviclgly.R.inc(10771);resetImportsClosureCache();
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10772);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public IRI getOntologyDocumentIRI(OWLOntology ontology) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10773);
        __CLR4_5_27qz7qzlviclgly.R.inc(10774);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10775);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10776);if ((((!contains(ontology))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10777)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10778)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10779);throw new UnknownOWLOntologyException(ontology.getOntologyID());
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10780);return verifyNotNull(documentIRIsByID.get(ontology.getOntologyID()));
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10781);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void setOntologyDocumentIRI(OWLOntology ontology, IRI documentIRI) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10782);
        __CLR4_5_27qz7qzlviclgly.R.inc(10783);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10784);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10785);if ((((!ontologiesByID.containsKey(ontology.getOntologyID()))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10786)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10787)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10788);throw new UnknownOWLOntologyException(ontology.getOntologyID());
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10789);documentIRIsByID.put(ontology.getOntologyID(), documentIRI);
            __CLR4_5_27qz7qzlviclgly.R.inc(10790);resetImportsClosureCache();
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10791);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    /**
     * Handles a rename of an ontology. This method should only be called
     * *after* the change has been applied
     * 
     * @param oldID
     *        The original ID of the ontology
     * @param newID
     *        The new ID of the ontology
     */
    private void renameOntology(OWLOntologyID oldID, OWLOntologyID newID) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10792);
        __CLR4_5_27qz7qzlviclgly.R.inc(10793);OWLOntology ont = ontologiesByID.get(oldID);
        __CLR4_5_27qz7qzlviclgly.R.inc(10794);if ((((ont == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10795)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10796)==0&false))) {{
            // Nothing to rename!
            __CLR4_5_27qz7qzlviclgly.R.inc(10797);return;
        }
        }__CLR4_5_27qz7qzlviclgly.R.inc(10798);ontologiesByID.remove(oldID);
        __CLR4_5_27qz7qzlviclgly.R.inc(10799);ontologiesByID.put(newID, ont);
        __CLR4_5_27qz7qzlviclgly.R.inc(10800);if ((((ontologyFormatsByOntology.containsKey(oldID))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10801)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10802)==0&false))) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10803);ontologyFormatsByOntology.put(newID, ontologyFormatsByOntology.remove(oldID));
        }
        }__CLR4_5_27qz7qzlviclgly.R.inc(10804);IRI documentIRI = documentIRIsByID.remove(oldID);
        __CLR4_5_27qz7qzlviclgly.R.inc(10805);if ((((documentIRI != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10806)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10807)==0&false))) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10808);documentIRIsByID.put(newID, documentIRI);
        }
        }__CLR4_5_27qz7qzlviclgly.R.inc(10809);resetImportsClosureCache();
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected void resetImportsClosureCache() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10810);
        __CLR4_5_27qz7qzlviclgly.R.inc(10811);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10812);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10813);importsClosureCache.clear();
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10814);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    // Methods to save ontologies
    @Override
    public void saveOntology(OWLOntology ontology) throws OWLOntologyStorageException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10815);
        __CLR4_5_27qz7qzlviclgly.R.inc(10816);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10817);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10818);OWLDocumentFormat format = getOntologyFormat(ontology);
            __CLR4_5_27qz7qzlviclgly.R.inc(10819);saveOntology(ontology, format);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10820);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void saveOntology(@Nonnull OWLOntology ontology, OWLDocumentFormat ontologyFormat)
        throws OWLOntologyStorageException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10821);
        __CLR4_5_27qz7qzlviclgly.R.inc(10822);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10823);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10824);saveOntology(ontology, ontologyFormat, getOntologyDocumentIRI(ontology));
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10825);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLOntology ontology, IRI documentIRI) throws OWLOntologyStorageException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10826);
        __CLR4_5_27qz7qzlviclgly.R.inc(10827);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10828);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10829);OWLDocumentFormat format = getOntologyFormat(ontology);
            __CLR4_5_27qz7qzlviclgly.R.inc(10830);saveOntology(ontology, format, documentIRI);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10831);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLOntology ontology, OWLDocumentFormat ontologyFormat, IRI documentIRI)
        throws OWLOntologyStorageException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10832);
        __CLR4_5_27qz7qzlviclgly.R.inc(10833);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10834);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10835);try {
                __CLR4_5_27qz7qzlviclgly.R.inc(10836);for (OWLStorerFactory storerFactory : ontologyStorers) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10837);OWLStorer storer = storerFactory.createStorer();
                    __CLR4_5_27qz7qzlviclgly.R.inc(10838);if ((((storer.canStoreOntology(ontologyFormat))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10839)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10840)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10841);storer.storeOntology(ontology, documentIRI, ontologyFormat);
                        __CLR4_5_27qz7qzlviclgly.R.inc(10842);return;
                    }
                }}
                }__CLR4_5_27qz7qzlviclgly.R.inc(10843);throw new OWLStorerNotFoundException(ontologyFormat);
            } catch (IOException e) {
                __CLR4_5_27qz7qzlviclgly.R.inc(10844);throw new OWLOntologyStorageIOException(e);
            }
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10845);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLOntology ontology, OutputStream outputStream) throws OWLOntologyStorageException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10846);
        // Write lock not needed at this point
        __CLR4_5_27qz7qzlviclgly.R.inc(10847);saveOntology(ontology, new StreamDocumentTarget(outputStream));
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLOntology ontology, OWLDocumentFormat ontologyFormat, OutputStream outputStream)
        throws OWLOntologyStorageException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10848);
        // Write lock not needed at this point
        __CLR4_5_27qz7qzlviclgly.R.inc(10849);saveOntology(ontology, ontologyFormat, new StreamDocumentTarget(outputStream));
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLOntology ontology, OWLOntologyDocumentTarget documentTarget)
        throws OWLOntologyStorageException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10850);
        __CLR4_5_27qz7qzlviclgly.R.inc(10851);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10852);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10853);saveOntology(ontology, getOntologyFormat(ontology), documentTarget);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10854);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void saveOntology(OWLOntology ontology, OWLDocumentFormat ontologyFormat,
        OWLOntologyDocumentTarget documentTarget) throws OWLOntologyStorageException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10855);
        __CLR4_5_27qz7qzlviclgly.R.inc(10856);readLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10857);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10858);try {
                __CLR4_5_27qz7qzlviclgly.R.inc(10859);for (OWLStorerFactory storerFactory : ontologyStorers) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10860);OWLStorer storer = storerFactory.createStorer();
                    __CLR4_5_27qz7qzlviclgly.R.inc(10861);if ((((storer.canStoreOntology(ontologyFormat))&&(__CLR4_5_27qz7qzlviclgly.R.iget(10862)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10863)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(10864);storer.storeOntology(ontology, documentTarget, ontologyFormat);
                        __CLR4_5_27qz7qzlviclgly.R.inc(10865);return;
                    }
                }}
                }__CLR4_5_27qz7qzlviclgly.R.inc(10866);throw new OWLStorerNotFoundException(ontologyFormat);
            } catch (IOException e) {
                __CLR4_5_27qz7qzlviclgly.R.inc(10867);throw new OWLOntologyStorageIOException(e);
            }
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10868);readLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public PriorityCollection<OWLStorerFactory> getOntologyStorers() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10869);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10870);return ontologyStorers;
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    @Inject
    public void setOntologyStorers(Set<OWLStorerFactory> storers) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10871);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10872);ontologyStorers.set(storers);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public PriorityCollection<OWLOntologyIRIMapper> getIRIMappers() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10873);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10874);return documentMappers;
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    @Inject
    public void setIRIMappers(Set<OWLOntologyIRIMapper> mappers) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10875);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10876);documentMappers.set(mappers);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void addIRIMapper(OWLOntologyIRIMapper mapper) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10877);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10878);documentMappers.add(mapper);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeIRIMapper(OWLOntologyIRIMapper mapper) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10879);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10880);documentMappers.remove(mapper);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void clearIRIMappers() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10881);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10882);documentMappers.clear();
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void addOntologyStorer(OWLStorerFactory storer) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10883);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10884);ontologyStorers.add(storer);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeOntologyStorer(OWLStorerFactory storer) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10885);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10886);ontologyStorers.remove(storer);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void clearOntologyStorers() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10887);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10888);ontologyStorers.clear();
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public PriorityCollection<OWLParserFactory> getOntologyParsers() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10889);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10890);return parserFactories;
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    @Inject
    public void setOntologyParsers(Set<OWLParserFactory> parsers) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10891);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10892);parserFactories.set(parsers);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public PriorityCollection<OWLOntologyFactory> getOntologyFactories() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10893);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10894);return ontologyFactories;
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    @Inject
    public void setOntologyFactories(Set<OWLOntologyFactory> factories) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10895);
        // Locking done by collection
        __CLR4_5_27qz7qzlviclgly.R.inc(10896);ontologyFactories.set(factories);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    /**
     * Uses the mapper mechanism to obtain an ontology document IRI from an
     * ontology IRI.
     * 
     * @param ontologyID
     *        The ontology ID for which a document IRI is to be retrieved
     * @return The document IRI that corresponds to the ontology IRI, or
     *         {@code null} if no physical URI can be found.
     */
    @Nullable
    private IRI getDocumentIRIFromMappers(OWLOntologyID ontologyID) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10897);
        __CLR4_5_27qz7qzlviclgly.R.inc(10898);Optional<IRI> defIRI = ontologyID.getDefaultDocumentIRI();
        __CLR4_5_27qz7qzlviclgly.R.inc(10899);if ((((!defIRI.isPresent())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10900)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10901)==0&false))) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10902);return null;
        }
        }__CLR4_5_27qz7qzlviclgly.R.inc(10903);IRI iri = defIRI.get();
        assert (((iri != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10904)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10905)==0&false));
        __CLR4_5_27qz7qzlviclgly.R.inc(10906);for (OWLOntologyIRIMapper mapper : documentMappers) {{
            __CLR4_5_27qz7qzlviclgly.R.inc(10907);IRI documentIRI = mapper.getDocumentIRI(iri);
            __CLR4_5_27qz7qzlviclgly.R.inc(10908);if ((((documentIRI != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10909)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10910)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10911);return documentIRI;
            }
        }}
        }__CLR4_5_27qz7qzlviclgly.R.inc(10912);return iri;
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected final void installDefaultURIMappers() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10913);}finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected final void installDefaultOntologyFactories() {try{__CLR4_5_27qz7qzlviclgly.R.inc(10914);
        // The default factories are the ones that can load
        // ontologies from http:// and file:// URIs
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    // Listener stuff - methods to add/remove listeners
    private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {try{__CLR4_5_27qz7qzlviclgly.R.inc(10915);
        __CLR4_5_27qz7qzlviclgly.R.inc(10916);stream.defaultReadObject();
        __CLR4_5_27qz7qzlviclgly.R.inc(10917);listenerMap = new ConcurrentHashMap<>();
        __CLR4_5_27qz7qzlviclgly.R.inc(10918);impendingChangeListenerMap = new ConcurrentHashMap<>();
        __CLR4_5_27qz7qzlviclgly.R.inc(10919);vetoListeners = new ArrayList<>();
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void addOntologyChangeListener(OWLOntologyChangeListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10920);
        __CLR4_5_27qz7qzlviclgly.R.inc(10921);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10922);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10923);listenerMap.put(listener, defaultChangeBroadcastStrategy);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10924);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    /**
     * Broadcasts to attached listeners, using the various broadcasting
     * strategies that were specified for each listener.
     * 
     * @param changes
     *        The ontology changes to broadcast
     */
    protected void broadcastChanges(@Nonnull List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10925);
        __CLR4_5_27qz7qzlviclgly.R.inc(10926);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10927);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10928);if ((((!broadcastChanges.get())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10929)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10930)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10931);return;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10932);for (OWLOntologyChangeListener listener : new ArrayList<>(listenerMap.keySet())) {{
                assert (((listener != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10933)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10934)==0&false));
                __CLR4_5_27qz7qzlviclgly.R.inc(10935);OWLOntologyChangeBroadcastStrategy strategy = listenerMap.get(listener);
                __CLR4_5_27qz7qzlviclgly.R.inc(10936);if ((((strategy == null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10937)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10938)==0&false))) {{
                    // This listener may have been removed during the broadcast
                    // of
                    // the changes, so when we attempt to retrieve it from the
                    // map
                    // it isn't there (because we iterate over a copy).
                    __CLR4_5_27qz7qzlviclgly.R.inc(10939);continue;
                }
                }__CLR4_5_27qz7qzlviclgly.R.inc(10940);try {
                    // Handle exceptions on a per listener basis. If we have
                    // badly behaving listeners, we don't want one listener
                    // to prevent the other listeners from receiving events.
                    __CLR4_5_27qz7qzlviclgly.R.inc(10941);strategy.broadcastChanges(listener, changes);
                } catch (Exception e) {
                    __CLR4_5_27qz7qzlviclgly.R.inc(10942);LOGGER.warn("BADLY BEHAVING LISTENER: {} has been removed", e.getMessage(), e);
                    __CLR4_5_27qz7qzlviclgly.R.inc(10943);listenerMap.remove(listener);
                }
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10944);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected void broadcastImpendingChanges(@Nonnull List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10945);
        __CLR4_5_27qz7qzlviclgly.R.inc(10946);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10947);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10948);if ((((!broadcastChanges.get())&&(__CLR4_5_27qz7qzlviclgly.R.iget(10949)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10950)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(10951);return;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(10952);for (ImpendingOWLOntologyChangeListener listener : new ArrayList<>(impendingChangeListenerMap.keySet())) {{
                assert (((listener != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10953)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10954)==0&false));
                __CLR4_5_27qz7qzlviclgly.R.inc(10955);ImpendingOWLOntologyChangeBroadcastStrategy strategy = impendingChangeListenerMap.get(listener);
                __CLR4_5_27qz7qzlviclgly.R.inc(10956);if ((((strategy != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(10957)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(10958)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(10959);strategy.broadcastChanges(listener, changes);
                }
            }}
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10960);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void setDefaultChangeBroadcastStrategy(OWLOntologyChangeBroadcastStrategy strategy) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10961);
        __CLR4_5_27qz7qzlviclgly.R.inc(10962);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10963);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10964);defaultChangeBroadcastStrategy = strategy;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10965);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void addOntologyChangeListener(OWLOntologyChangeListener listener,
        OWLOntologyChangeBroadcastStrategy strategy) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10966);
        __CLR4_5_27qz7qzlviclgly.R.inc(10967);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10968);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10969);listenerMap.put(listener, strategy);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10970);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void addImpendingOntologyChangeListener(ImpendingOWLOntologyChangeListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10971);
        __CLR4_5_27qz7qzlviclgly.R.inc(10972);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10973);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10974);impendingChangeListenerMap.put(listener, defaultImpendingChangeBroadcastStrategy);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10975);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeImpendingOntologyChangeListener(ImpendingOWLOntologyChangeListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10976);
        __CLR4_5_27qz7qzlviclgly.R.inc(10977);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10978);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10979);impendingChangeListenerMap.remove(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10980);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeOntologyChangeListener(OWLOntologyChangeListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10981);
        __CLR4_5_27qz7qzlviclgly.R.inc(10982);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10983);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10984);listenerMap.remove(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10985);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void addOntologyChangesVetoedListener(OWLOntologyChangesVetoedListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10986);
        __CLR4_5_27qz7qzlviclgly.R.inc(10987);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10988);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10989);vetoListeners.add(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10990);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeOntologyChangesVetoedListener(OWLOntologyChangesVetoedListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10991);
        __CLR4_5_27qz7qzlviclgly.R.inc(10992);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10993);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10994);vetoListeners.remove(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(10995);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    private void broadcastOntologyChangesVetoed(@Nonnull List<? extends OWLOntologyChange> changes,
        @Nonnull OWLOntologyChangeVetoException veto) {try{__CLR4_5_27qz7qzlviclgly.R.inc(10996);
        __CLR4_5_27qz7qzlviclgly.R.inc(10997);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(10998);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(10999);for (OWLOntologyChangesVetoedListener listener : new ArrayList<>(vetoListeners)) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11000);listener.ontologyChangesVetoed(changes, veto);
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11001);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    // Imports etc.
    protected OWLOntology loadImports(OWLImportsDeclaration declaration,
        @Nonnull OWLOntologyLoaderConfiguration configuration) throws OWLOntologyCreationException {try{__CLR4_5_27qz7qzlviclgly.R.inc(11002);
        __CLR4_5_27qz7qzlviclgly.R.inc(11003);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11004);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11005);importsLoadCount.incrementAndGet();
            __CLR4_5_27qz7qzlviclgly.R.inc(11006);OWLOntology ont = null;
            __CLR4_5_27qz7qzlviclgly.R.inc(11007);try {
                __CLR4_5_27qz7qzlviclgly.R.inc(11008);ont = loadOntology(declaration.getIRI(), true, configuration);
            } catch (OWLOntologyCreationException e) {
                __CLR4_5_27qz7qzlviclgly.R.inc(11009);if ((((configuration.getMissingImportHandlingStrategy() == MissingImportHandlingStrategy.THROW_EXCEPTION)&&(__CLR4_5_27qz7qzlviclgly.R.iget(11010)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(11011)==0&false))) {{
                    __CLR4_5_27qz7qzlviclgly.R.inc(11012);throw e;
                } }else {{
                    // Silent
                    __CLR4_5_27qz7qzlviclgly.R.inc(11013);MissingImportEvent evt = new MissingImportEvent(declaration.getIRI(), e);
                    __CLR4_5_27qz7qzlviclgly.R.inc(11014);fireMissingImportEvent(evt);
                }
            }} finally {
                __CLR4_5_27qz7qzlviclgly.R.inc(11015);importsLoadCount.decrementAndGet();
            }
            __CLR4_5_27qz7qzlviclgly.R.inc(11016);return ont;
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11017);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void makeLoadImportRequest(OWLImportsDeclaration declaration) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11018);
        __CLR4_5_27qz7qzlviclgly.R.inc(11019);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11020);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11021);makeLoadImportRequest(declaration, getOntologyLoaderConfiguration());
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11022);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void makeLoadImportRequest(OWLImportsDeclaration declaration, OWLOntologyLoaderConfiguration configuration) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11023);
        __CLR4_5_27qz7qzlviclgly.R.inc(11024);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11025);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11026);IRI iri = declaration.getIRI();
            __CLR4_5_27qz7qzlviclgly.R.inc(11027);if ((((!configuration.isIgnoredImport(iri) && !importedIRIs.contains(iri))&&(__CLR4_5_27qz7qzlviclgly.R.iget(11028)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(11029)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11030);importedIRIs.add(iri);
                __CLR4_5_27qz7qzlviclgly.R.inc(11031);try {
                    __CLR4_5_27qz7qzlviclgly.R.inc(11032);OWLOntology ont = loadImports(declaration, configuration);
                    __CLR4_5_27qz7qzlviclgly.R.inc(11033);if ((((ont != null)&&(__CLR4_5_27qz7qzlviclgly.R.iget(11034)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(11035)==0&false))) {{
                        __CLR4_5_27qz7qzlviclgly.R.inc(11036);ontologyIDsByImportsDeclaration.put(declaration, ont.getOntologyID());
                    }
                }} catch (OWLOntologyCreationException e) {
                    // Wrap as UnloadableImportException and throw
                    __CLR4_5_27qz7qzlviclgly.R.inc(11037);throw new UnloadableImportException(e, declaration);
                }
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11038);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void addMissingImportListener(MissingImportListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11039);
        __CLR4_5_27qz7qzlviclgly.R.inc(11040);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11041);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11042);missingImportsListeners.add(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11043);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeMissingImportListener(@Nonnull MissingImportListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11044);
        __CLR4_5_27qz7qzlviclgly.R.inc(11045);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11046);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11047);missingImportsListeners.remove(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11048);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected void fireMissingImportEvent(@Nonnull MissingImportEvent evt) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11049);
        __CLR4_5_27qz7qzlviclgly.R.inc(11050);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11051);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11052);for (MissingImportListener listener : new ArrayList<>(missingImportsListeners)) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11053);listener.importMissing(evt);
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11054);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    // Other listeners etc.
    @Override
    public void addOntologyLoaderListener(OWLOntologyLoaderListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11055);
        __CLR4_5_27qz7qzlviclgly.R.inc(11056);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11057);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11058);loaderListeners.add(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11059);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeOntologyLoaderListener(OWLOntologyLoaderListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11060);
        __CLR4_5_27qz7qzlviclgly.R.inc(11061);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11062);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11063);loaderListeners.remove(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11064);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected void fireStartedLoadingEvent(OWLOntologyID ontologyID, IRI documentIRI, boolean imported) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11065);
        __CLR4_5_27qz7qzlviclgly.R.inc(11066);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11067);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11068);for (OWLOntologyLoaderListener listener : new ArrayList<>(loaderListeners)) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11069);listener.startedLoadingOntology(new OWLOntologyLoaderListener.LoadingStartedEvent(ontologyID,
                    documentIRI, imported));
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11070);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected void fireFinishedLoadingEvent(OWLOntologyID ontologyID, IRI documentIRI, boolean imported, Exception ex) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11071);
        __CLR4_5_27qz7qzlviclgly.R.inc(11072);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11073);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11074);for (OWLOntologyLoaderListener listener : new ArrayList<>(loaderListeners)) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11075);listener.finishedLoadingOntology(new OWLOntologyLoaderListener.LoadingFinishedEvent(ontologyID,
                    documentIRI, imported, ex));
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11076);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void addOntologyChangeProgessListener(OWLOntologyChangeProgressListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11077);
        __CLR4_5_27qz7qzlviclgly.R.inc(11078);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11079);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11080);progressListeners.add(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11081);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Override
    public void removeOntologyChangeProgessListener(OWLOntologyChangeProgressListener listener) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11082);
        __CLR4_5_27qz7qzlviclgly.R.inc(11083);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11084);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11085);progressListeners.remove(listener);
        } finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11086);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected void fireBeginChanges(int size) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11087);
        __CLR4_5_27qz7qzlviclgly.R.inc(11088);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11089);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11090);if ((((!broadcastChanges.get())&&(__CLR4_5_27qz7qzlviclgly.R.iget(11091)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(11092)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11093);return;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(11094);for (OWLOntologyChangeProgressListener listener : progressListeners) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11095);try {
                    __CLR4_5_27qz7qzlviclgly.R.inc(11096);listener.begin(size);
                } catch (Exception e) {
                    __CLR4_5_27qz7qzlviclgly.R.inc(11097);LOGGER.warn("BADLY BEHAVING LISTENER: {} has been removed", e.getMessage(), e);
                    __CLR4_5_27qz7qzlviclgly.R.inc(11098);progressListeners.remove(listener);
                }
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11099);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    protected void fireEndChanges() {try{__CLR4_5_27qz7qzlviclgly.R.inc(11100);
        __CLR4_5_27qz7qzlviclgly.R.inc(11101);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11102);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11103);if ((((!broadcastChanges.get())&&(__CLR4_5_27qz7qzlviclgly.R.iget(11104)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(11105)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11106);return;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(11107);for (OWLOntologyChangeProgressListener listener : progressListeners) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11108);try {
                    __CLR4_5_27qz7qzlviclgly.R.inc(11109);listener.end();
                } catch (Exception e) {
                    __CLR4_5_27qz7qzlviclgly.R.inc(11110);LOGGER.warn("BADLY BEHAVING LISTENER: {} has been removed", e.getMessage(), e);
                    __CLR4_5_27qz7qzlviclgly.R.inc(11111);progressListeners.remove(listener);
                }
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11112);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    private void fireChangeApplied(@Nonnull OWLOntologyChange change) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11113);
        __CLR4_5_27qz7qzlviclgly.R.inc(11114);writeLock.lock();
        __CLR4_5_27qz7qzlviclgly.R.inc(11115);try {
            __CLR4_5_27qz7qzlviclgly.R.inc(11116);if ((((!broadcastChanges.get())&&(__CLR4_5_27qz7qzlviclgly.R.iget(11117)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(11118)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11119);return;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(11120);if ((((progressListeners.isEmpty())&&(__CLR4_5_27qz7qzlviclgly.R.iget(11121)!=0|true))||(__CLR4_5_27qz7qzlviclgly.R.iget(11122)==0&false))) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11123);return;
            }
            }__CLR4_5_27qz7qzlviclgly.R.inc(11124);for (OWLOntologyChangeProgressListener listener : progressListeners) {{
                __CLR4_5_27qz7qzlviclgly.R.inc(11125);try {
                    __CLR4_5_27qz7qzlviclgly.R.inc(11126);listener.appliedChange(change);
                } catch (Exception e) {
                    __CLR4_5_27qz7qzlviclgly.R.inc(11127);LOGGER.warn("BADLY BEHAVING LISTENER: {} has been removed", e.getMessage(), e);
                    __CLR4_5_27qz7qzlviclgly.R.inc(11128);progressListeners.remove(listener);
                }
            }
        }} finally {
            __CLR4_5_27qz7qzlviclgly.R.inc(11129);writeLock.unlock();
        }
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Nonnull
    protected <T> Optional<T> of(T t) {try{__CLR4_5_27qz7qzlviclgly.R.inc(11130);
        __CLR4_5_27qz7qzlviclgly.R.inc(11131);return Optional.fromNullable(t);
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}

    @Nonnull
    protected Optional<IRI> absent() {try{__CLR4_5_27qz7qzlviclgly.R.inc(11132);
        __CLR4_5_27qz7qzlviclgly.R.inc(11133);return Optional.absent();
    }finally{__CLR4_5_27qz7qzlviclgly.R.flushNeeded();}}
}
