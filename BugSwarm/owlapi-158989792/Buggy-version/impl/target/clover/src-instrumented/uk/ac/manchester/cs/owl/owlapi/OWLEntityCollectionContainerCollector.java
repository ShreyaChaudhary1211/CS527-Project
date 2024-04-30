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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.util.Collection;
import java.util.Set;

import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * A utility class that visits axioms, class expressions etc. and accumulates
 * the named objects that are referred to in those axioms, class expressions
 * etc. For example, if the collector visited the axiom (propP some C)
 * subClassOf (propQ some D), it would contain the objects propP, C, propQ and
 * D.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLEntityCollectionContainerCollector extends
        AbstractEntityRegistrationManager {public static class __CLR4_5_24it4itlviclfr3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,5917,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Collection<OWLEntity> objects;
    @Nullable
    private final Collection<OWLAnonymousIndividual> anonymousIndividuals;
    private boolean collectClasses = true;
    private boolean collectObjectProperties = true;
    private boolean collectDataProperties = true;
    private boolean collectIndividuals = true;
    private boolean collectDatatypes = true;

    /**
     * @param toReturn
     *        the set that will contain the results
     * @param anonsToReturn
     *        the set that will contain the anon individuals
     */
    public OWLEntityCollectionContainerCollector(Set<OWLEntity> toReturn,
            Collection<OWLAnonymousIndividual> anonsToReturn) {try{__CLR4_5_24it4itlviclfr3.R.inc(5861);
        __CLR4_5_24it4itlviclfr3.R.inc(5862);objects = toReturn;
        __CLR4_5_24it4itlviclfr3.R.inc(5863);anonymousIndividuals = anonsToReturn;
    }finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    /**
     * @param toReturn
     *        the set that will contain the results
     */
    public OWLEntityCollectionContainerCollector(Set<OWLEntity> toReturn) {try{__CLR4_5_24it4itlviclfr3.R.inc(5864);
        __CLR4_5_24it4itlviclfr3.R.inc(5865);objects = toReturn;
        __CLR4_5_24it4itlviclfr3.R.inc(5866);anonymousIndividuals = null;
    }finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    /**
     * Clears all objects that have accumulated during the course of visiting
     * axioms, class expressions etc.
     * 
     * @param toReturn
     *        the set that will contain the results
     */
    // XXX not in the interface
    public void reset(Set<OWLEntity> toReturn) {try{__CLR4_5_24it4itlviclfr3.R.inc(5867);
        __CLR4_5_24it4itlviclfr3.R.inc(5868);objects = toReturn;
        __CLR4_5_24it4itlviclfr3.R.inc(5869);if ((((anonymousIndividuals != null)&&(__CLR4_5_24it4itlviclfr3.R.iget(5870)!=0|true))||(__CLR4_5_24it4itlviclfr3.R.iget(5871)==0&false))) {{
            __CLR4_5_24it4itlviclfr3.R.inc(5872);verifyNotNull(anonymousIndividuals).clear();
        }
    }}finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    /**
     * @param collectClasses
     *        true to collect classes
     */
    // XXX not in the interface
    public void setCollectClasses(boolean collectClasses) {try{__CLR4_5_24it4itlviclfr3.R.inc(5873);
        __CLR4_5_24it4itlviclfr3.R.inc(5874);this.collectClasses = collectClasses;
    }finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    /**
     * @param collectObjectProperties
     *        true to collect object properties
     */
    // XXX not in the interface
    public void setCollectObjectProperties(boolean collectObjectProperties) {try{__CLR4_5_24it4itlviclfr3.R.inc(5875);
        __CLR4_5_24it4itlviclfr3.R.inc(5876);this.collectObjectProperties = collectObjectProperties;
    }finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    /**
     * @param collectDataProperties
     *        true to collect data properties
     */
    public void setCollectDataProperties(boolean collectDataProperties) {try{__CLR4_5_24it4itlviclfr3.R.inc(5877);
        __CLR4_5_24it4itlviclfr3.R.inc(5878);this.collectDataProperties = collectDataProperties;
    }finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    /**
     * @param collectIndividuals
     *        true to collect individuals
     */
    // XXX not in the interface
    public void setCollectIndividuals(boolean collectIndividuals) {try{__CLR4_5_24it4itlviclfr3.R.inc(5879);
        __CLR4_5_24it4itlviclfr3.R.inc(5880);this.collectIndividuals = collectIndividuals;
    }finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    /**
     * @param collectDatatypes
     *        true to collect datatypes
     */
    // XXX not in the interface
    public void setCollectDatatypes(boolean collectDatatypes) {try{__CLR4_5_24it4itlviclfr3.R.inc(5881);
        __CLR4_5_24it4itlviclfr3.R.inc(5882);this.collectDatatypes = collectDatatypes;
    }finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_24it4itlviclfr3.R.inc(5883);
        __CLR4_5_24it4itlviclfr3.R.inc(5884);if ((((collectClasses)&&(__CLR4_5_24it4itlviclfr3.R.iget(5885)!=0|true))||(__CLR4_5_24it4itlviclfr3.R.iget(5886)==0&false))) {{
            __CLR4_5_24it4itlviclfr3.R.inc(5887);objects.add(ce);
        }
    }}finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_24it4itlviclfr3.R.inc(5888);
        __CLR4_5_24it4itlviclfr3.R.inc(5889);if ((((collectObjectProperties)&&(__CLR4_5_24it4itlviclfr3.R.iget(5890)!=0|true))||(__CLR4_5_24it4itlviclfr3.R.iget(5891)==0&false))) {{
            __CLR4_5_24it4itlviclfr3.R.inc(5892);objects.add(property);
        }
    }}finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_24it4itlviclfr3.R.inc(5893);
        __CLR4_5_24it4itlviclfr3.R.inc(5894);if ((((collectDataProperties)&&(__CLR4_5_24it4itlviclfr3.R.iget(5895)!=0|true))||(__CLR4_5_24it4itlviclfr3.R.iget(5896)==0&false))) {{
            __CLR4_5_24it4itlviclfr3.R.inc(5897);objects.add(property);
        }
    }}finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_24it4itlviclfr3.R.inc(5898);
        __CLR4_5_24it4itlviclfr3.R.inc(5899);if ((((collectIndividuals)&&(__CLR4_5_24it4itlviclfr3.R.iget(5900)!=0|true))||(__CLR4_5_24it4itlviclfr3.R.iget(5901)==0&false))) {{
            __CLR4_5_24it4itlviclfr3.R.inc(5902);objects.add(individual);
        }
    }}finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_24it4itlviclfr3.R.inc(5903);
        __CLR4_5_24it4itlviclfr3.R.inc(5904);if ((((collectDatatypes)&&(__CLR4_5_24it4itlviclfr3.R.iget(5905)!=0|true))||(__CLR4_5_24it4itlviclfr3.R.iget(5906)==0&false))) {{
            __CLR4_5_24it4itlviclfr3.R.inc(5907);objects.add(node);
        }
    }}finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_24it4itlviclfr3.R.inc(5908);
        // Anon individuals aren't entities
        // But store them in a set anyway for utility
        __CLR4_5_24it4itlviclfr3.R.inc(5909);if ((((anonymousIndividuals != null)&&(__CLR4_5_24it4itlviclfr3.R.iget(5910)!=0|true))||(__CLR4_5_24it4itlviclfr3.R.iget(5911)==0&false))) {{
            __CLR4_5_24it4itlviclfr3.R.inc(5912);verifyNotNull(anonymousIndividuals).add(individual);
        }
    }}finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_24it4itlviclfr3.R.inc(5913);
        __CLR4_5_24it4itlviclfr3.R.inc(5914);objects.addAll(ontology.getSignature());
    }finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_24it4itlviclfr3.R.inc(5915);
        __CLR4_5_24it4itlviclfr3.R.inc(5916);objects.add(property);
    }finally{__CLR4_5_24it4itlviclfr3.R.flushNeeded();}}
}
