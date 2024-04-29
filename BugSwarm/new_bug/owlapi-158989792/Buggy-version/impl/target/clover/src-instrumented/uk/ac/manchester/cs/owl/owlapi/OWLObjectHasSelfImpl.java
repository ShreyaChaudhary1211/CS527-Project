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

import org.semanticweb.owlapi.model.ClassExpressionType;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLClassExpressionVisitor;
import org.semanticweb.owlapi.model.OWLClassExpressionVisitorEx;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLObjectHasSelfImpl extends OWLRestrictionImpl implements
        OWLObjectHasSelf {public static class __CLR4_5_26vc6vclviclgb6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,8944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLObjectPropertyExpression property;

    @Override
    protected int index() {try{__CLR4_5_26vc6vclviclgb6.R.inc(8904);
        __CLR4_5_26vc6vclviclgb6.R.inc(8905);return OWLObjectTypeIndexProvider.CLASS_EXPRESSION_TYPE_INDEX_BASE + 11;
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    /**
     * @param property
     *        self property
     */
    public OWLObjectHasSelfImpl(@Nonnull OWLObjectPropertyExpression property) {try{__CLR4_5_26vc6vclviclgb6.R.inc(8906);
        __CLR4_5_26vc6vclviclgb6.R.inc(8907);this.property = checkNotNull(property, "property cannot be null");
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_26vc6vclviclgb6.R.inc(8908);
        __CLR4_5_26vc6vclviclgb6.R.inc(8909);addSignatureEntitiesToSetForValue(entities, property);
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_26vc6vclviclgb6.R.inc(8910);
        __CLR4_5_26vc6vclviclgb6.R.inc(8911);addAnonymousIndividualsToSetForValue(anons, property);
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public OWLObjectPropertyExpression getProperty() {try{__CLR4_5_26vc6vclviclgb6.R.inc(8912);
        __CLR4_5_26vc6vclviclgb6.R.inc(8913);return property;
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public ClassExpressionType getClassExpressionType() {try{__CLR4_5_26vc6vclviclgb6.R.inc(8914);
        __CLR4_5_26vc6vclviclgb6.R.inc(8915);return ClassExpressionType.OBJECT_HAS_SELF;
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public boolean isObjectRestriction() {try{__CLR4_5_26vc6vclviclgb6.R.inc(8916);
        __CLR4_5_26vc6vclviclgb6.R.inc(8917);return true;
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public boolean isDataRestriction() {try{__CLR4_5_26vc6vclviclgb6.R.inc(8918);
        __CLR4_5_26vc6vclviclgb6.R.inc(8919);return false;
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_26vc6vclviclgb6.R.inc(8920);
        __CLR4_5_26vc6vclviclgb6.R.inc(8921);if ((((this == obj)&&(__CLR4_5_26vc6vclviclgb6.R.iget(8922)!=0|true))||(__CLR4_5_26vc6vclviclgb6.R.iget(8923)==0&false))) {{
            __CLR4_5_26vc6vclviclgb6.R.inc(8924);return true;
        }
        }__CLR4_5_26vc6vclviclgb6.R.inc(8925);if ((((!super.equals(obj))&&(__CLR4_5_26vc6vclviclgb6.R.iget(8926)!=0|true))||(__CLR4_5_26vc6vclviclgb6.R.iget(8927)==0&false))) {{
            __CLR4_5_26vc6vclviclgb6.R.inc(8928);return false;
        }
        }__CLR4_5_26vc6vclviclgb6.R.inc(8929);if ((((!(obj instanceof OWLObjectHasSelf))&&(__CLR4_5_26vc6vclviclgb6.R.iget(8930)!=0|true))||(__CLR4_5_26vc6vclviclgb6.R.iget(8931)==0&false))) {{
            __CLR4_5_26vc6vclviclgb6.R.inc(8932);return false;
        }
        }__CLR4_5_26vc6vclviclgb6.R.inc(8933);return getProperty().equals(((OWLObjectHasSelf) obj).getProperty());
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLClassExpressionVisitor visitor) {try{__CLR4_5_26vc6vclviclgb6.R.inc(8934);
        __CLR4_5_26vc6vclviclgb6.R.inc(8935);visitor.visit(this);
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_26vc6vclviclgb6.R.inc(8936);
        __CLR4_5_26vc6vclviclgb6.R.inc(8937);visitor.visit(this);
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLClassExpressionVisitorEx<O> visitor) {try{__CLR4_5_26vc6vclviclgb6.R.inc(8938);
        __CLR4_5_26vc6vclviclgb6.R.inc(8939);return visitor.visit(this);
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_26vc6vclviclgb6.R.inc(8940);
        __CLR4_5_26vc6vclviclgb6.R.inc(8941);return visitor.visit(this);
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_26vc6vclviclgb6.R.inc(8942);
        __CLR4_5_26vc6vclviclgb6.R.inc(8943);return getProperty().compareTo(
                ((OWLObjectHasSelf) object).getProperty());
    }finally{__CLR4_5_26vc6vclviclgb6.R.flushNeeded();}}
}
