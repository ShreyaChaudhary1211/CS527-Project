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

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLDataPropertyAssertionAxiomImpl
        extends
        OWLIndividualRelationshipAxiomImpl<OWLDataPropertyExpression, OWLLiteral>
        implements OWLDataPropertyAssertionAxiom {public static class __CLR4_5_23uo3uolviclfnl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,5038,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * @param subject
     *        subject
     * @param property
     *        property
     * @param value
     *        value
     * @param annotations
     *        annotations
     */
    public OWLDataPropertyAssertionAxiomImpl(@Nonnull OWLIndividual subject,
            @Nonnull OWLDataPropertyExpression property,
            @Nonnull OWLLiteral value,
            @Nonnull Set<? extends OWLAnnotation> annotations) {
        super(subject, property, value, annotations);__CLR4_5_23uo3uolviclfnl.R.inc(4993);try{__CLR4_5_23uo3uolviclfnl.R.inc(4992);
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_23uo3uolviclfnl.R.inc(4994);
        __CLR4_5_23uo3uolviclfnl.R.inc(4995);if ((((getSubject().isNamed())&&(__CLR4_5_23uo3uolviclfnl.R.iget(4996)!=0|true))||(__CLR4_5_23uo3uolviclfnl.R.iget(4997)==0&false))) {{
            __CLR4_5_23uo3uolviclfnl.R.inc(4998);entities.add(getSubject().asOWLNamedIndividual());
        }
        }__CLR4_5_23uo3uolviclfnl.R.inc(4999);addSignatureEntitiesToSetForValue(entities, getProperty());
        __CLR4_5_23uo3uolviclfnl.R.inc(5000);addSignatureEntitiesToSetForValue(entities, getObject());
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_23uo3uolviclfnl.R.inc(5001);
        __CLR4_5_23uo3uolviclfnl.R.inc(5002);if ((((getSubject().isAnonymous())&&(__CLR4_5_23uo3uolviclfnl.R.iget(5003)!=0|true))||(__CLR4_5_23uo3uolviclfnl.R.iget(5004)==0&false))) {{
            __CLR4_5_23uo3uolviclfnl.R.inc(5005);anons.add(getSubject().asOWLAnonymousIndividual());
        }
        }__CLR4_5_23uo3uolviclfnl.R.inc(5006);addAnonymousIndividualsToSetForValue(anons, getProperty());
        __CLR4_5_23uo3uolviclfnl.R.inc(5007);addAnonymousIndividualsToSetForValue(anons, getObject());
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLSubClassOfAxiom asOWLSubClassOfAxiom() {try{__CLR4_5_23uo3uolviclfnl.R.inc(5008);
        __CLR4_5_23uo3uolviclfnl.R.inc(5009);return new OWLSubClassOfAxiomImpl(new OWLObjectOneOfImpl(
                CollectionFactory.createSet(getSubject())),
                new OWLDataHasValueImpl(getProperty(), getObject()),
                NO_ANNOTATIONS);
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public OWLDataPropertyAssertionAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_23uo3uolviclfnl.R.inc(5010);
        __CLR4_5_23uo3uolviclfnl.R.inc(5011);if ((((!isAnnotated())&&(__CLR4_5_23uo3uolviclfnl.R.iget(5012)!=0|true))||(__CLR4_5_23uo3uolviclfnl.R.iget(5013)==0&false))) {{
            __CLR4_5_23uo3uolviclfnl.R.inc(5014);return this;
        }
        }__CLR4_5_23uo3uolviclfnl.R.inc(5015);return new OWLDataPropertyAssertionAxiomImpl(getSubject(),
                getProperty(), getObject(), NO_ANNOTATIONS);
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public OWLDataPropertyAssertionAxiom getAnnotatedAxiom(
            Set<OWLAnnotation> annotations) {try{__CLR4_5_23uo3uolviclfnl.R.inc(5016);
        __CLR4_5_23uo3uolviclfnl.R.inc(5017);return new OWLDataPropertyAssertionAxiomImpl(getSubject(),
                getProperty(), getObject(), mergeAnnos(annotations));
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_23uo3uolviclfnl.R.inc(5018);
        __CLR4_5_23uo3uolviclfnl.R.inc(5019);if ((((this == obj)&&(__CLR4_5_23uo3uolviclfnl.R.iget(5020)!=0|true))||(__CLR4_5_23uo3uolviclfnl.R.iget(5021)==0&false))) {{
            __CLR4_5_23uo3uolviclfnl.R.inc(5022);return true;
        }
        }__CLR4_5_23uo3uolviclfnl.R.inc(5023);if ((((!super.equals(obj))&&(__CLR4_5_23uo3uolviclfnl.R.iget(5024)!=0|true))||(__CLR4_5_23uo3uolviclfnl.R.iget(5025)==0&false))) {{
            __CLR4_5_23uo3uolviclfnl.R.inc(5026);return false;
        }
        }__CLR4_5_23uo3uolviclfnl.R.inc(5027);return obj instanceof OWLDataPropertyAssertionAxiom;
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_23uo3uolviclfnl.R.inc(5028);
        __CLR4_5_23uo3uolviclfnl.R.inc(5029);visitor.visit(this);
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_23uo3uolviclfnl.R.inc(5030);
        __CLR4_5_23uo3uolviclfnl.R.inc(5031);visitor.visit(this);
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_23uo3uolviclfnl.R.inc(5032);
        __CLR4_5_23uo3uolviclfnl.R.inc(5033);return visitor.visit(this);
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_23uo3uolviclfnl.R.inc(5034);
        __CLR4_5_23uo3uolviclfnl.R.inc(5035);return visitor.visit(this);
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_23uo3uolviclfnl.R.inc(5036);
        __CLR4_5_23uo3uolviclfnl.R.inc(5037);return AxiomType.DATA_PROPERTY_ASSERTION;
    }finally{__CLR4_5_23uo3uolviclfnl.R.flushNeeded();}}
}
