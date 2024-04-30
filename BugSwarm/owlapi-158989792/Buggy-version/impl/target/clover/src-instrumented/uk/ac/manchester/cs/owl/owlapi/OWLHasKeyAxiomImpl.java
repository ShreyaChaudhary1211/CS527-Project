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
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public class OWLHasKeyAxiomImpl extends
    OWLLogicalAxiomImplWithoutEntityAndAnonCaching implements
    OWLHasKeyAxiom {public static class __CLR4_5_24u54u5lviclfsf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,6347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLClassExpression expression;
    @Nonnull
    private final List<OWLPropertyExpression> propertyExpressions;

    /**
     * @param expression
     *        class expression
     * @param propertyExpressions
     *        properties
     * @param annotations
     *        annotations on the axiom
     */
    public OWLHasKeyAxiomImpl(@Nonnull OWLClassExpression expression,
        @Nonnull Set<? extends OWLPropertyExpression> propertyExpressions,
        @Nonnull Collection<? extends OWLAnnotation> annotations) {
        super(annotations);__CLR4_5_24u54u5lviclfsf.R.inc(6270);try{__CLR4_5_24u54u5lviclfsf.R.inc(6269);
        __CLR4_5_24u54u5lviclfsf.R.inc(6271);this.expression = checkNotNull(expression, "expression cannot be null");
        __CLR4_5_24u54u5lviclfsf.R.inc(6272);checkNotNull(
            propertyExpressions, "propertyExpressions cannot be null");
        __CLR4_5_24u54u5lviclfsf.R.inc(6273);this.propertyExpressions = CollectionFactory.sortOptionally((Set<OWLPropertyExpression>) propertyExpressions);
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_24u54u5lviclfsf.R.inc(6274);
        __CLR4_5_24u54u5lviclfsf.R.inc(6275);addSignatureEntitiesToSetForValue(entities, expression);
        __CLR4_5_24u54u5lviclfsf.R.inc(6276);for (OWLPropertyExpression propertyExpression : propertyExpressions) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6277);addSignatureEntitiesToSetForValue(entities, propertyExpression);
        }
    }}finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_24u54u5lviclfsf.R.inc(6278);
        __CLR4_5_24u54u5lviclfsf.R.inc(6279);addAnonymousIndividualsToSetForValue(anons, expression);
        __CLR4_5_24u54u5lviclfsf.R.inc(6280);for (OWLPropertyExpression propertyExpression : propertyExpressions) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6281);addAnonymousIndividualsToSetForValue(anons, propertyExpression);
        }
    }}finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public OWLHasKeyAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_24u54u5lviclfsf.R.inc(6282);
        __CLR4_5_24u54u5lviclfsf.R.inc(6283);if ((((!isAnnotated())&&(__CLR4_5_24u54u5lviclfsf.R.iget(6284)!=0|true))||(__CLR4_5_24u54u5lviclfsf.R.iget(6285)==0&false))) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6286);return this;
        }
        }__CLR4_5_24u54u5lviclfsf.R.inc(6287);return new OWLHasKeyAxiomImpl(getClassExpression(),
            getPropertyExpressions(), NO_ANNOTATIONS);
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public OWLHasKeyAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {try{__CLR4_5_24u54u5lviclfsf.R.inc(6288);
        __CLR4_5_24u54u5lviclfsf.R.inc(6289);return new OWLHasKeyAxiomImpl(getClassExpression(),
            getPropertyExpressions(), mergeAnnos(annotations));
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_24u54u5lviclfsf.R.inc(6290);
        __CLR4_5_24u54u5lviclfsf.R.inc(6291);return AxiomType.HAS_KEY;
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public OWLClassExpression getClassExpression() {try{__CLR4_5_24u54u5lviclfsf.R.inc(6292);
        __CLR4_5_24u54u5lviclfsf.R.inc(6293);return expression;
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public Set<OWLPropertyExpression> getPropertyExpressions() {try{__CLR4_5_24u54u5lviclfsf.R.inc(6294);
        __CLR4_5_24u54u5lviclfsf.R.inc(6295);return CollectionFactory
            .getCopyOnRequestSetFromImmutableCollection(propertyExpressions);
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public Set<OWLDataPropertyExpression> getDataPropertyExpressions() {try{__CLR4_5_24u54u5lviclfsf.R.inc(6296);
        __CLR4_5_24u54u5lviclfsf.R.inc(6297);Set<OWLDataPropertyExpression> props = new TreeSet<>();
        __CLR4_5_24u54u5lviclfsf.R.inc(6298);for (OWLPropertyExpression prop : propertyExpressions) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6299);if ((((prop.isDataPropertyExpression())&&(__CLR4_5_24u54u5lviclfsf.R.iget(6300)!=0|true))||(__CLR4_5_24u54u5lviclfsf.R.iget(6301)==0&false))) {{
                __CLR4_5_24u54u5lviclfsf.R.inc(6302);props.add((OWLDataPropertyExpression) prop);
            }
        }}
        }__CLR4_5_24u54u5lviclfsf.R.inc(6303);return props;
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public Set<OWLObjectPropertyExpression> getObjectPropertyExpressions() {try{__CLR4_5_24u54u5lviclfsf.R.inc(6304);
        __CLR4_5_24u54u5lviclfsf.R.inc(6305);Set<OWLObjectPropertyExpression> props = new TreeSet<>();
        __CLR4_5_24u54u5lviclfsf.R.inc(6306);for (OWLPropertyExpression prop : propertyExpressions) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6307);if ((((prop.isObjectPropertyExpression())&&(__CLR4_5_24u54u5lviclfsf.R.iget(6308)!=0|true))||(__CLR4_5_24u54u5lviclfsf.R.iget(6309)==0&false))) {{
                __CLR4_5_24u54u5lviclfsf.R.inc(6310);props.add((OWLObjectPropertyExpression) prop);
            }
        }}
        }__CLR4_5_24u54u5lviclfsf.R.inc(6311);return props;
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_24u54u5lviclfsf.R.inc(6312);
        __CLR4_5_24u54u5lviclfsf.R.inc(6313);OWLHasKeyAxiom other = (OWLHasKeyAxiom) object;
        __CLR4_5_24u54u5lviclfsf.R.inc(6314);int diff = expression.compareTo(other.getClassExpression());
        __CLR4_5_24u54u5lviclfsf.R.inc(6315);if ((((diff != 0)&&(__CLR4_5_24u54u5lviclfsf.R.iget(6316)!=0|true))||(__CLR4_5_24u54u5lviclfsf.R.iget(6317)==0&false))) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6318);return diff;
        }
        }__CLR4_5_24u54u5lviclfsf.R.inc(6319);return compareSets(propertyExpressions, other.getPropertyExpressions());
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_24u54u5lviclfsf.R.inc(6320);
        __CLR4_5_24u54u5lviclfsf.R.inc(6321);visitor.visit(this);
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_24u54u5lviclfsf.R.inc(6322);
        __CLR4_5_24u54u5lviclfsf.R.inc(6323);return visitor.visit(this);
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_24u54u5lviclfsf.R.inc(6324);
        __CLR4_5_24u54u5lviclfsf.R.inc(6325);visitor.visit(this);
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_24u54u5lviclfsf.R.inc(6326);
        __CLR4_5_24u54u5lviclfsf.R.inc(6327);return visitor.visit(this);
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_24u54u5lviclfsf.R.inc(6328);
        __CLR4_5_24u54u5lviclfsf.R.inc(6329);if ((((this == obj)&&(__CLR4_5_24u54u5lviclfsf.R.iget(6330)!=0|true))||(__CLR4_5_24u54u5lviclfsf.R.iget(6331)==0&false))) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6332);return true;
        }
        }__CLR4_5_24u54u5lviclfsf.R.inc(6333);if ((((!super.equals(obj))&&(__CLR4_5_24u54u5lviclfsf.R.iget(6334)!=0|true))||(__CLR4_5_24u54u5lviclfsf.R.iget(6335)==0&false))) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6336);return false;
        }
        // superclass is responsible for null, identity, owlaxiom type and
        // annotations
        }__CLR4_5_24u54u5lviclfsf.R.inc(6337);if ((((!(obj instanceof OWLHasKeyAxiom))&&(__CLR4_5_24u54u5lviclfsf.R.iget(6338)!=0|true))||(__CLR4_5_24u54u5lviclfsf.R.iget(6339)==0&false))) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6340);return false;
        }
        }__CLR4_5_24u54u5lviclfsf.R.inc(6341);if ((((obj instanceof OWLHasKeyAxiomImpl)&&(__CLR4_5_24u54u5lviclfsf.R.iget(6342)!=0|true))||(__CLR4_5_24u54u5lviclfsf.R.iget(6343)==0&false))) {{
            __CLR4_5_24u54u5lviclfsf.R.inc(6344);return expression.equals(((OWLHasKeyAxiomImpl) obj).expression) && propertyExpressions.equals(
                ((OWLHasKeyAxiomImpl) obj).propertyExpressions);
        }
        }__CLR4_5_24u54u5lviclfsf.R.inc(6345);OWLHasKeyAxiom other = (OWLHasKeyAxiom) obj;
        __CLR4_5_24u54u5lviclfsf.R.inc(6346);return expression.equals(other.getClassExpression())
            && getPropertyExpressions().equals(other.getPropertyExpressions());
    }finally{__CLR4_5_24u54u5lviclfsf.R.flushNeeded();}}
}
