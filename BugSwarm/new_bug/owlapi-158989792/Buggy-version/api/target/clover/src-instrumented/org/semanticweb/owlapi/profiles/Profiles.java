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
package org.semanticweb.owlapi.profiles;

import java.util.Collection;
import java.util.List;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.HasIRI;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.util.CollectionFactory;

import com.google.inject.Provides;

/*
 * Not a pretty pattern but I didn't want to have long strings repeated across
 * constructors, and no static constants are allowed before members declaration
 * in an enum.
 */
interface KnownFactories {

    String FaCTPlusPlus = "uk.ac.manchester.cs.factplusplus.owlapiv3.FaCTPlusPlusReasonerFactory";
    String HermiT = "org.semanticweb.HermiT.Reasoner.ReasonerFactory";
    String JFact = "uk.ac.manchester.cs.jfact.JFactFactory";
    String TrOWL = "eu.trowl.owlapi3.rel.reasoner.dl.RELReasonerFactory";
    String Pellet = "com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory";
    String MORe = "org.semanticweb.more.MOReRLrewReasonerFactory";
    String Elk = "org.semanticweb.elk.owlapi.ElkReasonerFactory";
    String Snorocket = "au.csiro.snorocket.owlapi.SnorocketReasonerFactory";
}

/**
 * This enumeration includes all currently implemented profile checkers and
 * known information about available reasoners for those profiles. Note that
 * reasoner capabilities might be out of date, since they are independent
 * projects. Therefore, ther emight be reasoners not listed here and the
 * reasoners listed might have changed.<br>
 * The use case for this class was suggested by Peter Ansell, see <a href=
 * "https://github.com/ansell/owlapi/commit/fa88c8139fe3d59ea46d363a9c9a36f6ddf05119"
 * >patch set 1</a> and <a href=
 * "https://github.com/ansell/owlapi/commit/354885abd0f581942a1ac1d64ae8de4b85cbec7f"
 * >patch set 2</a>.<br>
 * Notice that the OWLProfiles referred here are stateless, therefore only one
 * instance needs to be created and can be reused across threads.
 * 
 * @author ignazio
 */
public enum Profiles implements HasIRI, KnownFactories, OWLProfile {
    //@formatter:off
    /** http://www.w3.org/ns/owl-profile/DL **/     OWL2_DL     ("DL",                   FaCTPlusPlus, HermiT, JFact, TrOWL, Pellet, MORe){ @Override public OWLProfile getOWLProfile() {try{__CLR4_5_23fd3fdlvicknup.R.inc(4441); __CLR4_5_23fd3fdlvicknup.R.inc(4442);return new OWL2DLProfile();}finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}} },
    /** http://www.w3.org/ns/owl-profile/QL **/     OWL2_QL     ("QL",                   FaCTPlusPlus, HermiT, JFact, TrOWL, Pellet, MORe){ @Override public OWLProfile getOWLProfile() {try{__CLR4_5_23fd3fdlvicknup.R.inc(4443); __CLR4_5_23fd3fdlvicknup.R.inc(4444);return new OWL2QLProfile();}finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}} },
    /** http://www.w3.org/ns/owl-profile/EL **/     OWL2_EL     ("EL",   Elk, Snorocket, FaCTPlusPlus, HermiT, JFact, TrOWL, Pellet, MORe){ @Override public OWLProfile getOWLProfile() {try{__CLR4_5_23fd3fdlvicknup.R.inc(4445); __CLR4_5_23fd3fdlvicknup.R.inc(4446);return new OWL2ELProfile();}finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}} },
    /** http://www.w3.org/ns/owl-profile/RL **/     OWL2_RL     ("RL",                   FaCTPlusPlus, HermiT, JFact, TrOWL, Pellet, MORe){ @Override public OWLProfile getOWLProfile() {try{__CLR4_5_23fd3fdlvicknup.R.inc(4447); __CLR4_5_23fd3fdlvicknup.R.inc(4448);return new OWL2RLProfile();}finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}} },
    /** http://www.w3.org/ns/owl-profile/Full **/   OWL2_FULL   ("Full",                 FaCTPlusPlus, HermiT, JFact, TrOWL, Pellet, MORe){ @Override public OWLProfile getOWLProfile() {try{__CLR4_5_23fd3fdlvicknup.R.inc(4449); __CLR4_5_23fd3fdlvicknup.R.inc(4450);return new OWL2DLProfile();}finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}} };
    //@formatter:on
    @Nonnull
    private final IRI iri;
    @Nonnull
    private final List<String> supportingFactories;

    Profiles(@Nonnull String name, @Nonnull String... supportingFactories) {try{__CLR4_5_23fd3fdlvicknup.R.inc(4451);
        __CLR4_5_23fd3fdlvicknup.R.inc(4452);iri = IRI.create("http://www.w3.org/ns/owl-profile/", name);
        __CLR4_5_23fd3fdlvicknup.R.inc(4453);this.supportingFactories = CollectionFactory.list(supportingFactories);
    }finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}}

    @Override
    public String getName() {try{__CLR4_5_23fd3fdlvicknup.R.inc(4454);
        __CLR4_5_23fd3fdlvicknup.R.inc(4455);return getOWLProfile().getName();
    }finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}}

    @Override
    public OWLProfileReport checkOntology(OWLOntology ontology) {try{__CLR4_5_23fd3fdlvicknup.R.inc(4456);
        __CLR4_5_23fd3fdlvicknup.R.inc(4457);return getOWLProfile().checkOntology(ontology);
    }finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_23fd3fdlvicknup.R.inc(4458);
        __CLR4_5_23fd3fdlvicknup.R.inc(4459);return iri;
    }finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}}

    /**
     * factory method for OWLProfile checkers
     * 
     * @return profile checker for this profile
     */
    @Provides
    public abstract OWLProfile getOWLProfile();

    /**
     * @return collection of OWLReasonerFactory class names known to support the
     *         expressivity of this profile. The factories can be instantiated
     *         through {@code instantiateFactory()} if the reasoner classes are
     *         on the classpath. Note that this list is provided for information
     *         only, and might be incorrect or incomplete due to changes in the
     *         reasoner implementations.<br>
     *         Should you know of a reasoner not mentioned here, or find an
     *         error in the reported supported profiles, please raise a bug
     *         about it.
     */
    public Collection<String> supportingReasoners() {try{__CLR4_5_23fd3fdlvicknup.R.inc(4460);
        __CLR4_5_23fd3fdlvicknup.R.inc(4461);return supportingFactories;
    }finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}}

    /**
     * @param factoryClassName
     *        class name to instantiate
     * @return an OWLReasonerFactory if the class name represents an
     *         OWLReasonerFactory implementation available on the classpath. Any
     *         exception raised by {@code Class.forName(factoryClassName)} is
     *         wrapped by an OWLRuntimeException.
     */
    public static OWLReasonerFactory
            instantiateFactory(String factoryClassName) {try{__CLR4_5_23fd3fdlvicknup.R.inc(4462);
        __CLR4_5_23fd3fdlvicknup.R.inc(4463);try {
            __CLR4_5_23fd3fdlvicknup.R.inc(4464);Class<?> c = Class.forName(factoryClassName);
            __CLR4_5_23fd3fdlvicknup.R.inc(4465);if ((((OWLReasonerFactory.class.isAssignableFrom(c))&&(__CLR4_5_23fd3fdlvicknup.R.iget(4466)!=0|true))||(__CLR4_5_23fd3fdlvicknup.R.iget(4467)==0&false))) {{
                __CLR4_5_23fd3fdlvicknup.R.inc(4468);return (OWLReasonerFactory) c.newInstance();
            }
            }__CLR4_5_23fd3fdlvicknup.R.inc(4469);throw new OWLRuntimeException(
                    "Reasoner factory cannot be instantiated: "
                            + factoryClassName);
        } catch (ClassNotFoundException e) {
            __CLR4_5_23fd3fdlvicknup.R.inc(4470);throw new OWLRuntimeException(
                    "Reasoner factory cannot be instantiated: "
                            + factoryClassName, e);
        } catch (InstantiationException e) {
            __CLR4_5_23fd3fdlvicknup.R.inc(4471);throw new OWLRuntimeException(
                    "Reasoner factory cannot be instantiated: "
                            + factoryClassName, e);
        } catch (IllegalAccessException e) {
            __CLR4_5_23fd3fdlvicknup.R.inc(4472);throw new OWLRuntimeException(
                    "Reasoner factory cannot be instantiated: "
                            + factoryClassName, e);
        }
    }finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}}

    /**
     * @param i
     *        IRI to match
     * @return Profiles with matching IRI, or null if none is found
     */
    public static Profiles valueForIRI(IRI i) {try{__CLR4_5_23fd3fdlvicknup.R.inc(4473);
        __CLR4_5_23fd3fdlvicknup.R.inc(4474);for (Profiles p : values()) {{
            __CLR4_5_23fd3fdlvicknup.R.inc(4475);if ((((p.iri.equals(i))&&(__CLR4_5_23fd3fdlvicknup.R.iget(4476)!=0|true))||(__CLR4_5_23fd3fdlvicknup.R.iget(4477)==0&false))) {{
                __CLR4_5_23fd3fdlvicknup.R.inc(4478);return p;
            }
        }}
        }__CLR4_5_23fd3fdlvicknup.R.inc(4479);return null;
    }finally{__CLR4_5_23fd3fdlvicknup.R.flushNeeded();}}
;public static class __CLR4_5_23fd3fdlvicknup{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,4480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
