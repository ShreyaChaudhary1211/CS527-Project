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
package org.semanticweb.owlapitools.builders;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.profiles.OWL2DLProfile;
import org.semanticweb.owlapi.profiles.OWLProfile;
import org.semanticweb.owlapi.profiles.OWLProfileReport;
import org.semanticweb.owlapi.profiles.OWLProfileViolation;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * Base builder class, providing annotations storage
 * 
 * @author ignazio
 * @param <T>
 *        built type
 * @param <B>
 *        builder type
 */
public abstract class BaseBuilder<T extends OWLObject, B> implements Builder<T> {public static class __CLR4_5_277lvicn1n5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0066\u0069\u0078\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237320134L,8589935092L,30,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    protected final OWLDataFactory df;
    @Nonnull
    protected final Set<OWLAnnotation> annotations = new HashSet<>();
    @Nonnull
    private final OWLProfile profile = new OWL2DLProfile();

    /**
     * @param df
     *        data factory
     */
    @Inject
    protected BaseBuilder(OWLDataFactory df) {try{__CLR4_5_277lvicn1n5.R.inc(7);
        __CLR4_5_277lvicn1n5.R.inc(8);this.df = checkNotNull(df);
    }finally{__CLR4_5_277lvicn1n5.R.flushNeeded();}}

    /**
     * @param arg
     *        annotation
     * @return builder
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    public B withAnnotation(OWLAnnotation arg) {try{__CLR4_5_277lvicn1n5.R.inc(9);
        __CLR4_5_277lvicn1n5.R.inc(10);annotations.add(arg);
        __CLR4_5_277lvicn1n5.R.inc(11);return (B) this;
    }finally{__CLR4_5_277lvicn1n5.R.flushNeeded();}}

    /**
     * @param arg
     *        annotation
     * @return builder
     */
    @Nonnull
    @SuppressWarnings("unchecked")
    public B withAnnotations(@Nonnull Collection<OWLAnnotation> arg) {try{__CLR4_5_277lvicn1n5.R.inc(12);
        __CLR4_5_277lvicn1n5.R.inc(13);annotations.addAll(arg);
        __CLR4_5_277lvicn1n5.R.inc(14);return (B) this;
    }finally{__CLR4_5_277lvicn1n5.R.flushNeeded();}}

    @Override
    public abstract T buildObject();

    @Nonnull
    @Override
    public List<OWLOntologyChange> applyChanges(@Nonnull OWLOntology o) {try{__CLR4_5_277lvicn1n5.R.inc(15);
        __CLR4_5_277lvicn1n5.R.inc(16);T object = buildObject();
        __CLR4_5_277lvicn1n5.R.inc(17);if ((((!(object instanceof OWLAxiom))&&(__CLR4_5_277lvicn1n5.R.iget(18)!=0|true))||(__CLR4_5_277lvicn1n5.R.iget(19)==0&false))) {{
            __CLR4_5_277lvicn1n5.R.inc(20);return CollectionFactory.emptyList();
        }
        // create and apply the new change
        }__CLR4_5_277lvicn1n5.R.inc(21);AddAxiom change = new AddAxiom(o, (OWLAxiom) object);
        __CLR4_5_277lvicn1n5.R.inc(22);o.getOWLOntologyManager().applyChange(change);
        __CLR4_5_277lvicn1n5.R.inc(23);List<OWLOntologyChange> changes = new ArrayList<>();
        // check conformity to the profile
        __CLR4_5_277lvicn1n5.R.inc(24);OWLProfileReport report = profile.checkOntology(o);
        __CLR4_5_277lvicn1n5.R.inc(25);for (OWLProfileViolation v : report.getViolations()) {{
            // collect all changes to fix the ontology
            __CLR4_5_277lvicn1n5.R.inc(26);changes.addAll(v.repair());
        }
        // fix the ontology
        }__CLR4_5_277lvicn1n5.R.inc(27);o.getOWLOntologyManager().applyChanges(changes);
        // return all applied changes for reference
        __CLR4_5_277lvicn1n5.R.inc(28);changes.add(change);
        __CLR4_5_277lvicn1n5.R.inc(29);return changes;
    }finally{__CLR4_5_277lvicn1n5.R.flushNeeded();}}
}
