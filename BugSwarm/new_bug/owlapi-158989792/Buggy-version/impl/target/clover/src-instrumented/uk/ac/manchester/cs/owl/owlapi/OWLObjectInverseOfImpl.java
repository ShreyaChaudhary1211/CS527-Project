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

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectInverseOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLPropertyExpressionVisitor;
import org.semanticweb.owlapi.model.OWLPropertyExpressionVisitorEx;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLObjectInverseOfImpl extends OWLObjectPropertyExpressionImpl
        implements OWLObjectInverseOf {public static class __CLR4_5_279d79dlviclgdv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,9463,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    @Override
    protected int index() {try{__CLR4_5_279d79dlviclgdv.R.inc(9409);
        __CLR4_5_279d79dlviclgdv.R.inc(9410);return OWLObjectTypeIndexProvider.OBJECT_PROPERTY_INVERSE;
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Nonnull
    private final OWLObjectProperty inverseProperty;

    /**
     * @param inverseProperty
     *        property to invert
     */
    public OWLObjectInverseOfImpl(
            @Nonnull OWLObjectPropertyExpression inverseProperty) {try{__CLR4_5_279d79dlviclgdv.R.inc(9411);
        __CLR4_5_279d79dlviclgdv.R.inc(9412);if((((!(inverseProperty instanceof OWLObjectProperty))&&(__CLR4_5_279d79dlviclgdv.R.iget(9413)!=0|true))||(__CLR4_5_279d79dlviclgdv.R.iget(9414)==0&false))) {{
            __CLR4_5_279d79dlviclgdv.R.inc(9415);throw new IllegalArgumentException("ObjectInverseOf can only be applied to Object Properties");
        }

        }__CLR4_5_279d79dlviclgdv.R.inc(9416);this.inverseProperty = inverseProperty.asOWLObjectProperty();
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_279d79dlviclgdv.R.inc(9417);
        __CLR4_5_279d79dlviclgdv.R.inc(9418);addSignatureEntitiesToSetForValue(entities, inverseProperty);
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_279d79dlviclgdv.R.inc(9419);
        __CLR4_5_279d79dlviclgdv.R.inc(9420);addAnonymousIndividualsToSetForValue(anons, inverseProperty);
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectPropertyExpression getInverseProperty() {try{__CLR4_5_279d79dlviclgdv.R.inc(9421);
        __CLR4_5_279d79dlviclgdv.R.inc(9422);return getInverse();
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public OWLObjectProperty getInverse() {try{__CLR4_5_279d79dlviclgdv.R.inc(9423);
        __CLR4_5_279d79dlviclgdv.R.inc(9424);return inverseProperty;
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLObjectProperty getNamedProperty() {try{__CLR4_5_279d79dlviclgdv.R.inc(9425);
        __CLR4_5_279d79dlviclgdv.R.inc(9426);return inverseProperty;
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_279d79dlviclgdv.R.inc(9427);
        __CLR4_5_279d79dlviclgdv.R.inc(9428);if ((((this == obj)&&(__CLR4_5_279d79dlviclgdv.R.iget(9429)!=0|true))||(__CLR4_5_279d79dlviclgdv.R.iget(9430)==0&false))) {{
            __CLR4_5_279d79dlviclgdv.R.inc(9431);return true;
        }
        }__CLR4_5_279d79dlviclgdv.R.inc(9432);if ((((!super.equals(obj))&&(__CLR4_5_279d79dlviclgdv.R.iget(9433)!=0|true))||(__CLR4_5_279d79dlviclgdv.R.iget(9434)==0&false))) {{
            __CLR4_5_279d79dlviclgdv.R.inc(9435);return false;
        }
        }__CLR4_5_279d79dlviclgdv.R.inc(9436);if ((((!(obj instanceof OWLObjectInverseOf))&&(__CLR4_5_279d79dlviclgdv.R.iget(9437)!=0|true))||(__CLR4_5_279d79dlviclgdv.R.iget(9438)==0&false))) {{
            __CLR4_5_279d79dlviclgdv.R.inc(9439);return false;
        }
        }__CLR4_5_279d79dlviclgdv.R.inc(9440);return ((OWLObjectInverseOf) obj).getInverse().equals(inverseProperty);
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLPropertyExpressionVisitor visitor) {try{__CLR4_5_279d79dlviclgdv.R.inc(9441);
        __CLR4_5_279d79dlviclgdv.R.inc(9442);visitor.visit(this);
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_279d79dlviclgdv.R.inc(9443);
        __CLR4_5_279d79dlviclgdv.R.inc(9444);visitor.visit(this);
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLPropertyExpressionVisitorEx<O> visitor) {try{__CLR4_5_279d79dlviclgdv.R.inc(9445);
        __CLR4_5_279d79dlviclgdv.R.inc(9446);return visitor.visit(this);
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_279d79dlviclgdv.R.inc(9447);
        __CLR4_5_279d79dlviclgdv.R.inc(9448);return visitor.visit(this);
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_279d79dlviclgdv.R.inc(9449);
        __CLR4_5_279d79dlviclgdv.R.inc(9450);return true;
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public OWLObjectProperty asOWLObjectProperty() {try{__CLR4_5_279d79dlviclgdv.R.inc(9451);
        __CLR4_5_279d79dlviclgdv.R.inc(9452);throw new OWLRuntimeException(
                "Property is not a named property.  Check using the isAnonymous method before calling this method!");
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_279d79dlviclgdv.R.inc(9453);
        __CLR4_5_279d79dlviclgdv.R.inc(9454);return inverseProperty.compareTo(((OWLObjectInverseOf) object)
                .getInverse());
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public boolean isOWLTopObjectProperty() {try{__CLR4_5_279d79dlviclgdv.R.inc(9455);
        __CLR4_5_279d79dlviclgdv.R.inc(9456);return false;
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public boolean isOWLBottomObjectProperty() {try{__CLR4_5_279d79dlviclgdv.R.inc(9457);
        __CLR4_5_279d79dlviclgdv.R.inc(9458);return false;
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public boolean isOWLTopDataProperty() {try{__CLR4_5_279d79dlviclgdv.R.inc(9459);
        __CLR4_5_279d79dlviclgdv.R.inc(9460);return false;
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}

    @Override
    public boolean isOWLBottomDataProperty() {try{__CLR4_5_279d79dlviclgdv.R.inc(9461);
        __CLR4_5_279d79dlviclgdv.R.inc(9462);return false;
    }finally{__CLR4_5_279d79dlviclgdv.R.flushNeeded();}}
}
