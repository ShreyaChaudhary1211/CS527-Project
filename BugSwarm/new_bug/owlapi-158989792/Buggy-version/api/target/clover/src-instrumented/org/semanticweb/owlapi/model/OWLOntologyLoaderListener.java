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

import java.io.Serializable;

import javax.annotation.Nonnull;

/**
 * Receives notification of ontology loading starting and finishing from a
 * manager.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public interface OWLOntologyLoaderListener extends Serializable {public static class __CLR4_5_22c92c9lvickmv2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,3052,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Called when the process of attempting to load an ontology starts.
     * 
     * @param event
     *        The loading started event that describes the ontologt that is
     *        being loaded.
     */
    void startedLoadingOntology(@Nonnull LoadingStartedEvent event);

    /**
     * Called when the process of loading an ontology has finished. This method
     * will be called regardless of whether the ontology could be loaded or not
     * - it merely indicates that the process of attempting to load an ontology
     * has finished.
     * 
     * @param event
     *        The loading finished event that describes the ontology that was
     *        loaded.
     */
    void finishedLoadingOntology(@Nonnull LoadingFinishedEvent event);

    /** loading event */
    class LoadingEvent {

        private final OWLOntologyID ontologyID;
        private final IRI documentIRI;
        private final boolean imported;

        public LoadingEvent(OWLOntologyID ontologyID, IRI documentIRI,
                boolean imported) {try{__CLR4_5_22c92c9lvickmv2.R.inc(3033);
            __CLR4_5_22c92c9lvickmv2.R.inc(3034);this.ontologyID = ontologyID;
            __CLR4_5_22c92c9lvickmv2.R.inc(3035);this.documentIRI = documentIRI;
            __CLR4_5_22c92c9lvickmv2.R.inc(3036);this.imported = imported;
        }finally{__CLR4_5_22c92c9lvickmv2.R.flushNeeded();}}

        /**
         * Gets the ID of the ontology being loaded.
         * 
         * @return The ontology ID.
         */
        public OWLOntologyID getOntologyID() {try{__CLR4_5_22c92c9lvickmv2.R.inc(3037);
            __CLR4_5_22c92c9lvickmv2.R.inc(3038);return ontologyID;
        }finally{__CLR4_5_22c92c9lvickmv2.R.flushNeeded();}}

        /**
         * Gets the document IRI for the ontology being loaded.
         * 
         * @return The document IRI that describes where the ontology was loaded
         *         from.
         */
        public IRI getDocumentIRI() {try{__CLR4_5_22c92c9lvickmv2.R.inc(3039);
            __CLR4_5_22c92c9lvickmv2.R.inc(3040);return documentIRI;
        }finally{__CLR4_5_22c92c9lvickmv2.R.flushNeeded();}}

        /**
         * Determines if the ontology was loaded because of an imports
         * statement.
         * 
         * @return {@code true} if the ontology was loaded because it was
         *         imported by another ontology, or {@code false} if the
         *         ontology was loaded by a direct load request on
         *         OWLOntologyManager.
         */
        public boolean isImported() {try{__CLR4_5_22c92c9lvickmv2.R.inc(3041);
            __CLR4_5_22c92c9lvickmv2.R.inc(3042);return imported;
        }finally{__CLR4_5_22c92c9lvickmv2.R.flushNeeded();}}
    }

    /** loading start event */
    class LoadingStartedEvent extends LoadingEvent {

        public LoadingStartedEvent(OWLOntologyID ontologyID, IRI documentIRI,
                boolean imported) {
            super(ontologyID, documentIRI, imported);__CLR4_5_22c92c9lvickmv2.R.inc(3044);try{__CLR4_5_22c92c9lvickmv2.R.inc(3043);
        }finally{__CLR4_5_22c92c9lvickmv2.R.flushNeeded();}}
    }

    /**
     * Describes the situation when the loading process for an ontology has
     * finished.
     */
    class LoadingFinishedEvent extends LoadingEvent {

        private final Exception ex;

        public LoadingFinishedEvent(OWLOntologyID ontologyID, IRI documentIRI,
                boolean imported, Exception ex) {
            super(ontologyID, documentIRI, imported);__CLR4_5_22c92c9lvickmv2.R.inc(3046);try{__CLR4_5_22c92c9lvickmv2.R.inc(3045);
            __CLR4_5_22c92c9lvickmv2.R.inc(3047);this.ex = ex;
        }finally{__CLR4_5_22c92c9lvickmv2.R.flushNeeded();}}

        /**
         * Determines if the ontology was successfully loaded.
         * 
         * @return {@code true} if the ontology was successfully loaded,
         *         {@code false} if the ontology was not successfully loaded.
         *         Note that an ontology being successfully loaded does not
         *         imply that any ontologies that the ontology imports were
         *         successfully loaded.
         */
        public boolean isSuccessful() {try{__CLR4_5_22c92c9lvickmv2.R.inc(3048);
            __CLR4_5_22c92c9lvickmv2.R.inc(3049);return ex == null;
        }finally{__CLR4_5_22c92c9lvickmv2.R.flushNeeded();}}

        /**
         * If the ontology was not loaded successfully then this method can be
         * used to access the exception that describes why the ontology was not
         * loaded successfully.
         * 
         * @return The exception that describes why the ontology was not loaded
         *         successfully, or {@code null} if the ontology was loaded
         *         successfully.
         */
        public Exception getException() {try{__CLR4_5_22c92c9lvickmv2.R.inc(3050);
            __CLR4_5_22c92c9lvickmv2.R.inc(3051);return ex;
        }finally{__CLR4_5_22c92c9lvickmv2.R.flushNeeded();}}
    }
}
