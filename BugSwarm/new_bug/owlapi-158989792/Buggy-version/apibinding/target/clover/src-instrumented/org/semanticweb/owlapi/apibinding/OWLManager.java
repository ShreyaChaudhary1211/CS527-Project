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
package org.semanticweb.owlapi.apibinding;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.OWLAPIParsersModule;
import org.semanticweb.owlapi.OWLAPIServiceLoaderModule;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyManagerFactory;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;

import com.google.inject.Guice;
import com.google.inject.Injector;

import uk.ac.manchester.cs.owl.owlapi.OWLAPIImplModule;
import uk.ac.manchester.cs.owl.owlapi.concurrent.Concurrency;

/**
 * Provides a point of convenience for creating an {@code OWLOntologyManager}
 * with commonly required features (such as an RDF parser for example).
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLManager implements OWLOntologyManagerFactory {public static class __CLR4_5_27r7rlvicniks{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u0062\u0069\u006e\u0064\u0069\u006e\u0067\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237341989L,8589935092L,296,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;


    @Override
    public OWLOntologyManager get() {try{__CLR4_5_27r7rlvicniks.R.inc(279);
        __CLR4_5_27r7rlvicniks.R.inc(280);return createOWLOntologyManager();
    }finally{__CLR4_5_27r7rlvicniks.R.flushNeeded();}}

    /**
     * Creates an OWL ontology manager that is configured with standard parsers,
     * storeres etc.
     * 
     * @return The new manager.
     */
    @Nonnull
    public static OWLOntologyManager createOWLOntologyManager() {try{__CLR4_5_27r7rlvicniks.R.inc(281);
        __CLR4_5_27r7rlvicniks.R.inc(282);return instatiateOWLOntologyManager(Concurrency.NON_CONCURRENT);
    }finally{__CLR4_5_27r7rlvicniks.R.flushNeeded();}}

    /**
     * Creates an OWL ontology manager that is configured with the standard parsers and storers and provides
     * locking for concurrent access.
     * @return The new manager.
     */
    @Nonnull
    public static OWLOntologyManager createConcurrentOWLOntologyManager() {try{__CLR4_5_27r7rlvicniks.R.inc(283);
        __CLR4_5_27r7rlvicniks.R.inc(284);return instatiateOWLOntologyManager(Concurrency.CONCURRENT);
    }finally{__CLR4_5_27r7rlvicniks.R.flushNeeded();}}

    /**
     * Gets a global data factory that can be used to create OWL API objects.
     * 
     * @return An OWLDataFactory that can be used for creating OWL API objects.
     */
    @Nonnull
    public static OWLDataFactory getOWLDataFactory() {try{__CLR4_5_27r7rlvicniks.R.inc(285);
        __CLR4_5_27r7rlvicniks.R.inc(286);return verifyNotNull(createInjector(Concurrency.NON_CONCURRENT).getInstance(OWLDataFactory.class));
    }finally{__CLR4_5_27r7rlvicniks.R.flushNeeded();}}

    /**
     * @return an initialized manchester syntax parser for parsing strings
     */
    public static ManchesterOWLSyntaxParser createManchesterParser() {try{__CLR4_5_27r7rlvicniks.R.inc(287);
        __CLR4_5_27r7rlvicniks.R.inc(288);return createInjector(Concurrency.NON_CONCURRENT).getInstance(ManchesterOWLSyntaxParser.class);
    }finally{__CLR4_5_27r7rlvicniks.R.flushNeeded();}}

    private static Injector createInjector(Concurrency concurrency) {try{__CLR4_5_27r7rlvicniks.R.inc(289);
        __CLR4_5_27r7rlvicniks.R.inc(290);return Guice.createInjector(
                new OWLAPIImplModule(concurrency),
                new OWLAPIParsersModule(),
                new OWLAPIServiceLoaderModule());
    }finally{__CLR4_5_27r7rlvicniks.R.flushNeeded();}}


    private static OWLOntologyManager instatiateOWLOntologyManager(Concurrency concurrency) {try{__CLR4_5_27r7rlvicniks.R.inc(291);
        __CLR4_5_27r7rlvicniks.R.inc(292);Injector injector = createInjector(concurrency);
        __CLR4_5_27r7rlvicniks.R.inc(293);OWLOntologyManager instance = injector.getInstance(OWLOntologyManager.class);
        __CLR4_5_27r7rlvicniks.R.inc(294);injector.injectMembers(instance);
        __CLR4_5_27r7rlvicniks.R.inc(295);return verifyNotNull(instance);
    }finally{__CLR4_5_27r7rlvicniks.R.flushNeeded();}}

}
