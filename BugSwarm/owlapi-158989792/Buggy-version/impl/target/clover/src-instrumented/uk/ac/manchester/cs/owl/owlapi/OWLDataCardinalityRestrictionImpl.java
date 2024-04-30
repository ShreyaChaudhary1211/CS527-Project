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

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLDataCardinalityRestriction;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLObject;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class OWLDataCardinalityRestrictionImpl extends
        OWLCardinalityRestrictionImpl<OWLDataRange> implements
        OWLDataCardinalityRestriction {public static class __CLR4_5_22w02w0lviclfh2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,3789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLDataPropertyExpression property;

    protected OWLDataCardinalityRestrictionImpl(
            @Nonnull OWLDataPropertyExpression property, int cardinality,
            @Nonnull OWLDataRange filler) {
        super(cardinality, filler);__CLR4_5_22w02w0lviclfh2.R.inc(3745);try{__CLR4_5_22w02w0lviclfh2.R.inc(3744);
        __CLR4_5_22w02w0lviclfh2.R.inc(3746);this.property = checkNotNull(property, "property cannot be null");
    }finally{__CLR4_5_22w02w0lviclfh2.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_22w02w0lviclfh2.R.inc(3747);
        __CLR4_5_22w02w0lviclfh2.R.inc(3748);OWLDataRange filler = getFiller();
        __CLR4_5_22w02w0lviclfh2.R.inc(3749);addSignatureEntitiesToSetForValue(entities, filler);
        __CLR4_5_22w02w0lviclfh2.R.inc(3750);addSignatureEntitiesToSetForValue(entities, property);
    }finally{__CLR4_5_22w02w0lviclfh2.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_22w02w0lviclfh2.R.inc(3751);
        __CLR4_5_22w02w0lviclfh2.R.inc(3752);OWLDataRange filler = getFiller();
        __CLR4_5_22w02w0lviclfh2.R.inc(3753);addAnonymousIndividualsToSetForValue(anons, filler);
    }finally{__CLR4_5_22w02w0lviclfh2.R.flushNeeded();}}

    @Override
    public OWLDataPropertyExpression getProperty() {try{__CLR4_5_22w02w0lviclfh2.R.inc(3754);
        __CLR4_5_22w02w0lviclfh2.R.inc(3755);return property;
    }finally{__CLR4_5_22w02w0lviclfh2.R.flushNeeded();}}

    @Override
    public boolean isQualified() {try{__CLR4_5_22w02w0lviclfh2.R.inc(3756);
        __CLR4_5_22w02w0lviclfh2.R.inc(3757);return !getFiller().isTopDatatype();
    }finally{__CLR4_5_22w02w0lviclfh2.R.flushNeeded();}}

    @Override
    public boolean isObjectRestriction() {try{__CLR4_5_22w02w0lviclfh2.R.inc(3758);
        __CLR4_5_22w02w0lviclfh2.R.inc(3759);return false;
    }finally{__CLR4_5_22w02w0lviclfh2.R.flushNeeded();}}

    @Override
    public boolean isDataRestriction() {try{__CLR4_5_22w02w0lviclfh2.R.inc(3760);
        __CLR4_5_22w02w0lviclfh2.R.inc(3761);return true;
    }finally{__CLR4_5_22w02w0lviclfh2.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_22w02w0lviclfh2.R.inc(3762);
        __CLR4_5_22w02w0lviclfh2.R.inc(3763);if ((((this == obj)&&(__CLR4_5_22w02w0lviclfh2.R.iget(3764)!=0|true))||(__CLR4_5_22w02w0lviclfh2.R.iget(3765)==0&false))) {{
            __CLR4_5_22w02w0lviclfh2.R.inc(3766);return true;
        }
        }__CLR4_5_22w02w0lviclfh2.R.inc(3767);if ((((!super.equals(obj))&&(__CLR4_5_22w02w0lviclfh2.R.iget(3768)!=0|true))||(__CLR4_5_22w02w0lviclfh2.R.iget(3769)==0&false))) {{
            __CLR4_5_22w02w0lviclfh2.R.inc(3770);return false;
        }
        }__CLR4_5_22w02w0lviclfh2.R.inc(3771);if ((((!(obj instanceof OWLDataCardinalityRestriction))&&(__CLR4_5_22w02w0lviclfh2.R.iget(3772)!=0|true))||(__CLR4_5_22w02w0lviclfh2.R.iget(3773)==0&false))) {{
            __CLR4_5_22w02w0lviclfh2.R.inc(3774);return false;
        }
        }__CLR4_5_22w02w0lviclfh2.R.inc(3775);return getProperty().equals(
                ((OWLDataCardinalityRestriction) obj).getProperty());
    }finally{__CLR4_5_22w02w0lviclfh2.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_22w02w0lviclfh2.R.inc(3776);
        __CLR4_5_22w02w0lviclfh2.R.inc(3777);OWLDataCardinalityRestriction other = (OWLDataCardinalityRestriction) object;
        __CLR4_5_22w02w0lviclfh2.R.inc(3778);int diff = getProperty().compareTo(other.getProperty());
        __CLR4_5_22w02w0lviclfh2.R.inc(3779);if ((((diff != 0)&&(__CLR4_5_22w02w0lviclfh2.R.iget(3780)!=0|true))||(__CLR4_5_22w02w0lviclfh2.R.iget(3781)==0&false))) {{
            __CLR4_5_22w02w0lviclfh2.R.inc(3782);return diff;
        }
        }__CLR4_5_22w02w0lviclfh2.R.inc(3783);diff = getCardinality() - other.getCardinality();
        __CLR4_5_22w02w0lviclfh2.R.inc(3784);if ((((diff != 0)&&(__CLR4_5_22w02w0lviclfh2.R.iget(3785)!=0|true))||(__CLR4_5_22w02w0lviclfh2.R.iget(3786)==0&false))) {{
            __CLR4_5_22w02w0lviclfh2.R.inc(3787);return diff;
        }
        }__CLR4_5_22w02w0lviclfh2.R.inc(3788);return getFiller().compareTo(other.getFiller());
    }finally{__CLR4_5_22w02w0lviclfh2.R.flushNeeded();}}
}
