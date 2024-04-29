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
package org.semanticweb.owlapi.model;

import static org.semanticweb.owlapi.model.parameters.ConfigurationOptions.*;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.parameters.ConfigurationOptions;
import org.semanticweb.owlapi.vocab.Namespaces;

/**
 * A configuration object that specifies options and hints to objects that load
 * OWLOntologies. Every {@code OWLOntologyLoaderConfiguration} is immutable.
 * Changing a setting results in the creation of a new
 * {@code OWLOntologyLoaderConfiguration} with that setting. For example,
 * 
 * <pre>
 * OWLOntologyLoaderConfiguration config = new OWLOntologyLoaderConfiguration();
 * config = config.setLoadAnnotationAxioms(false);
 * </pre>
 * 
 * creates an {@code OWLOntologyLoaderConfiguration} object with the load
 * annotation axioms set to {@code false}.
 * 
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.2.0
 */
public class OWLOntologyLoaderConfiguration implements Serializable {public static class __CLR4_5_228b28blvickmtn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,3033,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * what action to take if the ontology header is missing.
     */
    public enum MissingOntologyHeaderStrategy implements ByName<MissingOntologyHeaderStrategy> {
        //@formatter:off
        /** Include triples. */         INCLUDE_GRAPH, 
        /** Keep import structure. */   IMPORT_GRAPH;
        //@formatter:on
        @Override
        public MissingOntologyHeaderStrategy byName(CharSequence name) {try{__CLR4_5_228b28blvickmtn.R.inc(2891);
            __CLR4_5_228b28blvickmtn.R.inc(2892);return valueOf(name.toString());
        }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}
    }

    /** Local override map. */
    private EnumMap<ConfigurationOptions, Object> overrides = new EnumMap<>(ConfigurationOptions.class);
    /** set of imports to ignore */
    @Nonnull private final Set<IRI> ignoredImports = new HashSet<>();

    /**
     * Adds an ontology document IRI to the list of ontology imports that will
     * be ignored during ontology loading.
     * 
     * @param ontologyDocumentIRI
     *        The ontology document IRI that will be ignored if it is
     *        encountered as an imported ontology during loading.
     * @return An {@code OWLOntologyLoaderConfiguration} with the ignored
     *         ontology document IRI set.
     */
    public OWLOntologyLoaderConfiguration addIgnoredImport(IRI ontologyDocumentIRI) {try{__CLR4_5_228b28blvickmtn.R.inc(2893);
        __CLR4_5_228b28blvickmtn.R.inc(2894);OWLOntologyLoaderConfiguration configuration = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2895);configuration.ignoredImports.add(ontologyDocumentIRI);
        __CLR4_5_228b28blvickmtn.R.inc(2896);return configuration;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Clears all ontology document IRIs from the list of ignored ontology
     * document IRIs.
     * 
     * @return An {@code OWLOntologyLoaderConfiguration} with the list of
     *         ignored ontology document IRIs set to be empty.
     */
    public OWLOntologyLoaderConfiguration clearIgnoredImports() {try{__CLR4_5_228b28blvickmtn.R.inc(2897);
        __CLR4_5_228b28blvickmtn.R.inc(2898);OWLOntologyLoaderConfiguration configuration = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2899);configuration.ignoredImports.clear();
        __CLR4_5_228b28blvickmtn.R.inc(2900);return configuration;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Removes an ontology document IRI from the list of ontology imports that
     * will be ignored during ontology loading.
     * 
     * @param ontologyDocumentIRI
     *        The ontology document IRI that would be ignored if it is
     *        encountered as an imported ontology during loading.
     * @return An {@code OWLOntologyLoaderConfiguration} with the ignored
     *         ontology document IRI removed.
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration removeIgnoredImport(IRI ontologyDocumentIRI) {try{__CLR4_5_228b28blvickmtn.R.inc(2901);
        __CLR4_5_228b28blvickmtn.R.inc(2902);OWLOntologyLoaderConfiguration configuration = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2903);configuration.ignoredImports.remove(ontologyDocumentIRI);
        __CLR4_5_228b28blvickmtn.R.inc(2904);return configuration;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Internally copies this configuaration object.
     * 
     * @return The copied configuration
     */
    @Nonnull
    private OWLOntologyLoaderConfiguration copyConfiguration() {try{__CLR4_5_228b28blvickmtn.R.inc(2905);
        __CLR4_5_228b28blvickmtn.R.inc(2906);OWLOntologyLoaderConfiguration copy = new OWLOntologyLoaderConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2907);copy.overrides.putAll(overrides);
        __CLR4_5_228b28blvickmtn.R.inc(2908);copy.ignoredImports.clear();
        __CLR4_5_228b28blvickmtn.R.inc(2909);copy.ignoredImports.addAll(ignoredImports);
        __CLR4_5_228b28blvickmtn.R.inc(2910);return copy;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Set the priorty collection sorting option.
     * 
     * @param sorting
     *        the sorting option to be used.
     * @return An {@code OWLOntologyLoaderConfiguration} with the new sorting
     *         option set.
     */
    public OWLOntologyLoaderConfiguration setPriorityCollectionSorting(PriorityCollectionSorting sorting) {try{__CLR4_5_228b28blvickmtn.R.inc(2911);
        __CLR4_5_228b28blvickmtn.R.inc(2912);if ((((sorting.equals(getPriorityCollectionSorting()))&&(__CLR4_5_228b28blvickmtn.R.iget(2913)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(2914)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(2915);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(2916);OWLOntologyLoaderConfiguration configuration = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2917);configuration.overrides.put(PRIORITY_COLLECTION_SORTING, sorting);
        __CLR4_5_228b28blvickmtn.R.inc(2918);return configuration;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @return The {@code PriorityCollectionSorting} for this configuration. It
     *         determines how parsers, storers and mappers are ordered. Default
     *         is {@link PriorityCollectionSorting#ON_SET_INJECTION_ONLY}
     */
    public PriorityCollectionSorting getPriorityCollectionSorting() {try{__CLR4_5_228b28blvickmtn.R.inc(2919);
        __CLR4_5_228b28blvickmtn.R.inc(2920);return PRIORITY_COLLECTION_SORTING.getValue(PriorityCollectionSorting.class, overrides);
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /** @return the connection timeout for this configuration */
    public int getConnectionTimeout() {try{__CLR4_5_228b28blvickmtn.R.inc(2921);
        __CLR4_5_228b28blvickmtn.R.inc(2922);return CONNECTION_TIMEOUT.getValue(Integer.class, overrides).intValue();
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Gets the strategy used for missing imports.
     * 
     * @return The strategy. See {@link MissingImportHandlingStrategy} for the
     *         strategies and their descriptions.
     * @since 3.3
     */
    public MissingImportHandlingStrategy getMissingImportHandlingStrategy() {try{__CLR4_5_228b28blvickmtn.R.inc(2923);
        __CLR4_5_228b28blvickmtn.R.inc(2924);return MISSING_IMPORT_HANDLING_STRATEGY.getValue(MissingImportHandlingStrategy.class, overrides);
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /** @return the ontology header strategy */
    public MissingOntologyHeaderStrategy getMissingOntologyHeaderStrategy() {try{__CLR4_5_228b28blvickmtn.R.inc(2925);
        __CLR4_5_228b28blvickmtn.R.inc(2926);return MISSING_ONTOLOGY_HEADER_STRATEGY.getValue(MissingOntologyHeaderStrategy.class, overrides);
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @return number of retries to attempt when retrieving an ontology form a
     *         remote URL.
     */
    public int getRetriesToAttempt() {try{__CLR4_5_228b28blvickmtn.R.inc(2927);
        __CLR4_5_228b28blvickmtn.R.inc(2928);return RETRIES_TO_ATTEMPT.getValue(Integer.class, overrides).intValue();
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /** @return true if http compression should be accepted. */
    public boolean isAcceptingHTTPCompression() {try{__CLR4_5_228b28blvickmtn.R.inc(2929);
        __CLR4_5_228b28blvickmtn.R.inc(2930);return ACCEPT_HTTP_COMPRESSION.getValue(Boolean.class, overrides).booleanValue();
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * When loading an ontology, a parser might connect to a remote URL. If the
     * remote URL is a 302 redirect and the protocol is different, e.g., http to
     * https, the parser needs to decide whether to follow the redirect and
     * download the ontology from an alternate source, or stop with an
     * UnloadableOntologyError. By default this is true, meaning redirects will
     * be followed across protocols. If set to false, redirects will be followed
     * only within the same protocol (URLConnection limits this to five
     * redirects).
     * 
     * @return true if redirects should be followed when importing ontologies
     *         from remote URLs
     */
    public boolean isFollowRedirects() {try{__CLR4_5_228b28blvickmtn.R.inc(2931);
        __CLR4_5_228b28blvickmtn.R.inc(2932);return FOLLOW_REDIRECTS.getValue(Boolean.class, overrides).booleanValue();
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @param iri
     *        iri to check
     * @return true if iri should be ignored
     */
    public boolean isIgnoredImport(IRI iri) {try{__CLR4_5_228b28blvickmtn.R.inc(2933);
        __CLR4_5_228b28blvickmtn.R.inc(2934);return Namespaces.isDefaultIgnoredImport(iri) || ignoredImports.contains(iri);
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Determines whether or not annotation axioms (instances of
     * {@code OWLAnnotationAxiom}) should be loaded. By default, the loading of
     * annotation axioms is enabled.
     * 
     * @return {@code true} if annotation assertions will be loaded, or
     *         {@code false} if annotation assertions will not be loaded because
     *         they will be discarded on loading.
     */
    public boolean isLoadAnnotationAxioms() {try{__CLR4_5_228b28blvickmtn.R.inc(2935);
        __CLR4_5_228b28blvickmtn.R.inc(2936);return LOAD_ANNOTATIONS.getValue(Boolean.class, overrides).booleanValue();
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /** @return value for the report stack trace flag. */
    public boolean isReportStackTrace() {try{__CLR4_5_228b28blvickmtn.R.inc(2937);
        __CLR4_5_228b28blvickmtn.R.inc(2938);return REPORT_STACK_TRACES.getValue(Boolean.class, overrides).booleanValue();
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /** @return true if parsing should be strict */
    public boolean isStrict() {try{__CLR4_5_228b28blvickmtn.R.inc(2939);
        __CLR4_5_228b28blvickmtn.R.inc(2940);return PARSE_WITH_STRICT_CONFIGURATION.getValue(Boolean.class, overrides).booleanValue();
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Determines if the various parsers, for formats such as RDF based formats
     * that do not require strong typing, should treat Dublin Core Vocabulary as
     * built in vocabulary, so that Dublin Core metadata properties are
     * interpreted as annotation properties.
     * 
     * @return {@code true} if the Dublin Core Vocabulary should be treated as
     *         built in vocabulary and Dublin Core properties are interpreted as
     *         annotation properties, otherwise {@code false}. The defaut is
     *         {@code true}.
     */
    public boolean isTreatDublinCoreAsBuiltIn() {try{__CLR4_5_228b28blvickmtn.R.inc(2941);
        __CLR4_5_228b28blvickmtn.R.inc(2942);return TREAT_DUBLINCORE_AS_BUILTIN.getValue(Boolean.class, overrides).booleanValue();
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @return list of parser factory class names that should be skipped when
     *         attempting ontology parsing. The list is space separated.
     */
    public String getBannedParsers() {try{__CLR4_5_228b28blvickmtn.R.inc(2943);
        __CLR4_5_228b28blvickmtn.R.inc(2944);return BANNED_PARSERS.getValue(String.class, overrides);
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @param b
     *        true if HTTP compression should be accepted
     * @return a copy of this configuration with accepting HTTP compression set
     *         to the new value
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setAcceptingHTTPCompression(boolean b) {try{__CLR4_5_228b28blvickmtn.R.inc(2945);
        // do not make copies if setting the same value
        __CLR4_5_228b28blvickmtn.R.inc(2946);if ((((isAcceptingHTTPCompression() == b)&&(__CLR4_5_228b28blvickmtn.R.iget(2947)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(2948)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(2949);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(2950);OWLOntologyLoaderConfiguration copy = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2951);copy.overrides.put(ACCEPT_HTTP_COMPRESSION, b);
        __CLR4_5_228b28blvickmtn.R.inc(2952);return copy;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @param l
     *        new timeout Note: the timeout is an int and represents
     *        milliseconds. This is necessary for use in {@code URLConnection}
     * @return A {@code OWLOntologyLoaderConfiguration} with the connection
     *         timeout set to the new value.
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setConnectionTimeout(int l) {try{__CLR4_5_228b28blvickmtn.R.inc(2953);
        __CLR4_5_228b28blvickmtn.R.inc(2954);if ((((getConnectionTimeout() == l)&&(__CLR4_5_228b28blvickmtn.R.iget(2955)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(2956)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(2957);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(2958);OWLOntologyLoaderConfiguration configuration = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2959);configuration.overrides.put(CONNECTION_TIMEOUT, l);
        __CLR4_5_228b28blvickmtn.R.inc(2960);return configuration;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @param value
     *        true if redirects should be followed across protocols, false
     *        otherwise.
     * @return a copy of the current object with followRedirects set to the new
     *         value.
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setFollowRedirects(boolean value) {try{__CLR4_5_228b28blvickmtn.R.inc(2961);
        // as the objects are immutable, setting to the same value returns the
        // same object
        __CLR4_5_228b28blvickmtn.R.inc(2962);if ((((value == isFollowRedirects())&&(__CLR4_5_228b28blvickmtn.R.iget(2963)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(2964)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(2965);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(2966);OWLOntologyLoaderConfiguration copy = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2967);copy.overrides.put(FOLLOW_REDIRECTS, value);
        __CLR4_5_228b28blvickmtn.R.inc(2968);return copy;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Specifies whether or not annotation axioms (instances of
     * {@code OWLAnnotationAxiom}) should be loaded or whether they should be
     * discarded on loading. By default, the loading of annotation axioms is
     * enabled.
     * 
     * @param b
     *        {@code true} if annotation axioms should be loaded, or
     *        {@code false} if annotation axioms should not be loaded and should
     *        be discarded on loading.
     * @return An {@code OWLOntologyLoaderConfiguration} object with the option
     *         set.
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setLoadAnnotationAxioms(boolean b) {try{__CLR4_5_228b28blvickmtn.R.inc(2969);
        // do not make copies if setting the same value
        __CLR4_5_228b28blvickmtn.R.inc(2970);if ((((isLoadAnnotationAxioms() == b)&&(__CLR4_5_228b28blvickmtn.R.iget(2971)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(2972)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(2973);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(2974);OWLOntologyLoaderConfiguration copy = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2975);copy.overrides.put(LOAD_ANNOTATIONS, b);
        __CLR4_5_228b28blvickmtn.R.inc(2976);return copy;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Sets the strategy that is used for missing imports handling. See
     * {@link MissingImportHandlingStrategy} for the strategies and their
     * descriptions.
     * 
     * @param missingImportHandlingStrategy
     *        The strategy to be used.
     * @return An {@code OWLOntologyLoaderConfiguration} object with the
     *         strategy set.
     * @since 3.3
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setMissingImportHandlingStrategy(
        @Nonnull MissingImportHandlingStrategy missingImportHandlingStrategy) {try{__CLR4_5_228b28blvickmtn.R.inc(2977);
        // do not make copies if setting the same value
        __CLR4_5_228b28blvickmtn.R.inc(2978);if ((((getMissingImportHandlingStrategy() == missingImportHandlingStrategy)&&(__CLR4_5_228b28blvickmtn.R.iget(2979)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(2980)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(2981);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(2982);OWLOntologyLoaderConfiguration copy = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2983);copy.overrides.put(MISSING_IMPORT_HANDLING_STRATEGY, missingImportHandlingStrategy);
        __CLR4_5_228b28blvickmtn.R.inc(2984);return copy;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @param missingOntologyHeaderStrategy
     *        new value
     * @return a copy of this configuration object with a different strategy
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setMissingOntologyHeaderStrategy(
        @Nonnull MissingOntologyHeaderStrategy missingOntologyHeaderStrategy) {try{__CLR4_5_228b28blvickmtn.R.inc(2985);
        // do not make copies if setting the same value
        __CLR4_5_228b28blvickmtn.R.inc(2986);if ((((getMissingOntologyHeaderStrategy() == missingOntologyHeaderStrategy)&&(__CLR4_5_228b28blvickmtn.R.iget(2987)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(2988)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(2989);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(2990);OWLOntologyLoaderConfiguration copy = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2991);copy.overrides.put(MISSING_ONTOLOGY_HEADER_STRATEGY, missingOntologyHeaderStrategy);
        __CLR4_5_228b28blvickmtn.R.inc(2992);return copy;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * Set the value for the report stack traces flag. If true, parsing
     * exceptions will have the full stack trace for the source exceptions.
     * Default is false.
     * 
     * @param b
     *        the new value for the flag
     * @return A {@code OWLOntologyLoaderConfiguration} with the report flag set
     *         to the new value.
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setReportStackTraces(boolean b) {try{__CLR4_5_228b28blvickmtn.R.inc(2993);
        __CLR4_5_228b28blvickmtn.R.inc(2994);if ((((isReportStackTrace() == b)&&(__CLR4_5_228b28blvickmtn.R.iget(2995)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(2996)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(2997);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(2998);OWLOntologyLoaderConfiguration configuration = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(2999);configuration.overrides.put(REPORT_STACK_TRACES, b);
        __CLR4_5_228b28blvickmtn.R.inc(3000);return configuration;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @param retries
     *        new value of retries to attempt
     * @return copy of this configuration with modified retries attempts.
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setRetriesToAttempt(int retries) {try{__CLR4_5_228b28blvickmtn.R.inc(3001);
        // do not make copies if setting the same value
        __CLR4_5_228b28blvickmtn.R.inc(3002);if ((((getRetriesToAttempt() == retries)&&(__CLR4_5_228b28blvickmtn.R.iget(3003)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(3004)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(3005);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(3006);OWLOntologyLoaderConfiguration copy = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(3007);copy.overrides.put(RETRIES_TO_ATTEMPT, retries);
        __CLR4_5_228b28blvickmtn.R.inc(3008);return copy;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @param strict
     *        new value for strict
     * @return copy of the configuration with new strict value
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setStrict(boolean strict) {try{__CLR4_5_228b28blvickmtn.R.inc(3009);
        // do not make copies if setting the same value
        __CLR4_5_228b28blvickmtn.R.inc(3010);if ((((isStrict() == strict)&&(__CLR4_5_228b28blvickmtn.R.iget(3011)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(3012)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(3013);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(3014);OWLOntologyLoaderConfiguration copy = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(3015);copy.overrides.put(PARSE_WITH_STRICT_CONFIGURATION, strict);
        __CLR4_5_228b28blvickmtn.R.inc(3016);return copy;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @param value
     *        true if Dublin Core vocabulary should be treated as built in.
     * @return a copy of the current object with treatDublinCoreAsBuiltIn set to
     *         the new value.
     */
    @Nonnull
    public OWLOntologyLoaderConfiguration setTreatDublinCoreAsBuiltIn(boolean value) {try{__CLR4_5_228b28blvickmtn.R.inc(3017);
        // as the objects are immutable, setting to the same value returns the
        // same object
        __CLR4_5_228b28blvickmtn.R.inc(3018);if ((((isTreatDublinCoreAsBuiltIn() == value)&&(__CLR4_5_228b28blvickmtn.R.iget(3019)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(3020)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(3021);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(3022);OWLOntologyLoaderConfiguration copy = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(3023);copy.overrides.put(TREAT_DUBLINCORE_AS_BUILTIN, value);
        __CLR4_5_228b28blvickmtn.R.inc(3024);return copy;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}

    /**
     * @param ban
     *        list of parser factory class names that should be skipped when
     *        attempting ontology parsing. The list is space separated.
     * @return An {@code OntologyConfigurator} with the new option set.
     */
    public OWLOntologyLoaderConfiguration setBannedParsers(String ban) {try{__CLR4_5_228b28blvickmtn.R.inc(3025);
        __CLR4_5_228b28blvickmtn.R.inc(3026);if ((((getBannedParsers().equals(ban))&&(__CLR4_5_228b28blvickmtn.R.iget(3027)!=0|true))||(__CLR4_5_228b28blvickmtn.R.iget(3028)==0&false))) {{
            __CLR4_5_228b28blvickmtn.R.inc(3029);return this;
        }
        }__CLR4_5_228b28blvickmtn.R.inc(3030);OWLOntologyLoaderConfiguration configuration = copyConfiguration();
        __CLR4_5_228b28blvickmtn.R.inc(3031);configuration.overrides.put(BANNED_PARSERS, ban);
        __CLR4_5_228b28blvickmtn.R.inc(3032);return configuration;
    }finally{__CLR4_5_228b28blvickmtn.R.flushNeeded();}}
}
