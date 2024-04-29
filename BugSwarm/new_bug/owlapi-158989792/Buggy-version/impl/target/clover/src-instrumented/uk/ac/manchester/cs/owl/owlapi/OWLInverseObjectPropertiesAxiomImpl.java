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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLPairwiseVisitor;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLInverseObjectPropertiesAxiomImpl extends
        OWLNaryPropertyAxiomImpl<OWLObjectPropertyExpression> implements
        OWLInverseObjectPropertiesAxiom {public static class __CLR4_5_25ot5otlviclfu6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,7423,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * @param first
     *        first property
     * @param second
     *        second peoperty
     * @param annotations
     *        annotations
     */
    public OWLInverseObjectPropertiesAxiomImpl(
            @Nonnull OWLObjectPropertyExpression first,
            @Nonnull OWLObjectPropertyExpression second,
            @Nonnull Collection<? extends OWLAnnotation> annotations) {
        super(annotations, checkNotNull(first, "first cannot be null"),
                checkNotNull(second, "second cannot be null"));__CLR4_5_25ot5otlviclfu6.R.inc(7374);try{__CLR4_5_25ot5otlviclfu6.R.inc(7373);
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public Set<OWLInverseObjectPropertiesAxiom> asPairwiseAxioms() {try{__CLR4_5_25ot5otlviclfu6.R.inc(7375);
        __CLR4_5_25ot5otlviclfu6.R.inc(7376);return CollectionFactory
                .createSet((OWLInverseObjectPropertiesAxiom) this);
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public Set<OWLInverseObjectPropertiesAxiom> splitToAnnotatedPairs() {try{__CLR4_5_25ot5otlviclfu6.R.inc(7377);
        __CLR4_5_25ot5otlviclfu6.R.inc(7378);return asPairwiseAxioms();
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public OWLInverseObjectPropertiesAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_25ot5otlviclfu6.R.inc(7379);
        __CLR4_5_25ot5otlviclfu6.R.inc(7380);if ((((!isAnnotated())&&(__CLR4_5_25ot5otlviclfu6.R.iget(7381)!=0|true))||(__CLR4_5_25ot5otlviclfu6.R.iget(7382)==0&false))) {{
            __CLR4_5_25ot5otlviclfu6.R.inc(7383);return this;
        }
        }__CLR4_5_25ot5otlviclfu6.R.inc(7384);return new OWLInverseObjectPropertiesAxiomImpl(getFirstProperty(),
                getSecondProperty(), NO_ANNOTATIONS);
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public OWLInverseObjectPropertiesAxiom getAnnotatedAxiom(
            Set<OWLAnnotation> annotations) {try{__CLR4_5_25ot5otlviclfu6.R.inc(7385);
        __CLR4_5_25ot5otlviclfu6.R.inc(7386);return new OWLInverseObjectPropertiesAxiomImpl(getFirstProperty(),
                getSecondProperty(), mergeAnnos(annotations));
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_25ot5otlviclfu6.R.inc(7387);
        __CLR4_5_25ot5otlviclfu6.R.inc(7388);visitor.visit(this);
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_25ot5otlviclfu6.R.inc(7389);
        __CLR4_5_25ot5otlviclfu6.R.inc(7390);visitor.visit(this);
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_25ot5otlviclfu6.R.inc(7391);
        __CLR4_5_25ot5otlviclfu6.R.inc(7392);return visitor.visit(this);
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_25ot5otlviclfu6.R.inc(7393);
        __CLR4_5_25ot5otlviclfu6.R.inc(7394);return visitor.visit(this);
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public OWLObjectPropertyExpression getFirstProperty() {try{__CLR4_5_25ot5otlviclfu6.R.inc(7395);
        __CLR4_5_25ot5otlviclfu6.R.inc(7396);return properties.get(0);
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public OWLObjectPropertyExpression getSecondProperty() {try{__CLR4_5_25ot5otlviclfu6.R.inc(7397);
        __CLR4_5_25ot5otlviclfu6.R.inc(7398);return properties.get(1);
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_25ot5otlviclfu6.R.inc(7399);
        __CLR4_5_25ot5otlviclfu6.R.inc(7400);if ((((this == obj)&&(__CLR4_5_25ot5otlviclfu6.R.iget(7401)!=0|true))||(__CLR4_5_25ot5otlviclfu6.R.iget(7402)==0&false))) {{
            __CLR4_5_25ot5otlviclfu6.R.inc(7403);return true;
        }
        }__CLR4_5_25ot5otlviclfu6.R.inc(7404);if ((((!super.equals(obj))&&(__CLR4_5_25ot5otlviclfu6.R.iget(7405)!=0|true))||(__CLR4_5_25ot5otlviclfu6.R.iget(7406)==0&false))) {{
            __CLR4_5_25ot5otlviclfu6.R.inc(7407);return false;
        }
        }__CLR4_5_25ot5otlviclfu6.R.inc(7408);return obj instanceof OWLInverseObjectPropertiesAxiom;
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_25ot5otlviclfu6.R.inc(7409);
        __CLR4_5_25ot5otlviclfu6.R.inc(7410);return AxiomType.INVERSE_OBJECT_PROPERTIES;
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public Set<OWLSubObjectPropertyOfAxiom> asSubObjectPropertyOfAxioms() {try{__CLR4_5_25ot5otlviclfu6.R.inc(7411);
        __CLR4_5_25ot5otlviclfu6.R.inc(7412);Set<OWLSubObjectPropertyOfAxiom> axs = new HashSet<>();
        __CLR4_5_25ot5otlviclfu6.R.inc(7413);axs.add(new OWLSubObjectPropertyOfAxiomImpl(getFirstProperty(),
                getSecondProperty().getInverseProperty().getSimplified(),
                NO_ANNOTATIONS));
        __CLR4_5_25ot5otlviclfu6.R.inc(7414);axs.add(new OWLSubObjectPropertyOfAxiomImpl(getSecondProperty(),
                getFirstProperty().getInverseProperty().getSimplified(),
                NO_ANNOTATIONS));
        __CLR4_5_25ot5otlviclfu6.R.inc(7415);return axs;
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}

    @Override
    public <T> Collection<T> walkPairwise(
            OWLPairwiseVisitor<T, OWLObjectPropertyExpression> visitor) {try{__CLR4_5_25ot5otlviclfu6.R.inc(7416);
        __CLR4_5_25ot5otlviclfu6.R.inc(7417);T t = visitor.visit(getFirstProperty(), getSecondProperty());
        __CLR4_5_25ot5otlviclfu6.R.inc(7418);if ((((t != null)&&(__CLR4_5_25ot5otlviclfu6.R.iget(7419)!=0|true))||(__CLR4_5_25ot5otlviclfu6.R.iget(7420)==0&false))) {{
            __CLR4_5_25ot5otlviclfu6.R.inc(7421);return CollectionFactory.createSet(t);
        }
        }__CLR4_5_25ot5otlviclfu6.R.inc(7422);return CollectionFactory.emptyList();
    }finally{__CLR4_5_25ot5otlviclfu6.R.flushNeeded();}}
}
