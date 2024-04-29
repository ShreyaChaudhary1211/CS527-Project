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

import org.semanticweb.owlapi.model.EntityType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLEntityVisitor;
import org.semanticweb.owlapi.model.OWLEntityVisitorEx;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNamedObjectVisitor;
import org.semanticweb.owlapi.model.OWLNamedObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;
import org.semanticweb.owlapi.model.OWLPropertyExpressionVisitor;
import org.semanticweb.owlapi.model.OWLPropertyExpressionVisitorEx;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLDataPropertyImpl extends OWLPropertyExpressionImpl implements
        OWLDataProperty {public static class __CLR4_5_23xe3xelviclfnu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,5182,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final IRI iri;
    private final boolean builtin;

    @Override
    protected int index() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5090);
        __CLR4_5_23xe3xelviclfnu.R.inc(5091);return OWLObjectTypeIndexProvider.DATA_PROPERTY;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    /**
     * @param iri
     *        property iri
     */
    public OWLDataPropertyImpl(@Nonnull IRI iri) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5092);
        __CLR4_5_23xe3xelviclfnu.R.inc(5093);this.iri = checkNotNull(iri, "iri cannot be null");
        __CLR4_5_23xe3xelviclfnu.R.inc(5094);builtin = iri.equals(OWLRDFVocabulary.OWL_TOP_DATA_PROPERTY.getIRI())
                || iri.equals(OWLRDFVocabulary.OWL_BOTTOM_DATA_PROPERTY
                        .getIRI());
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5095);
        __CLR4_5_23xe3xelviclfnu.R.inc(5096);entities.add(this);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5097);}finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5098);
        __CLR4_5_23xe3xelviclfnu.R.inc(5099);return isOWLTopDataProperty();
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isBottomEntity() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5100);
        __CLR4_5_23xe3xelviclfnu.R.inc(5101);return isOWLBottomDataProperty();
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public EntityType<?> getEntityType() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5102);
        __CLR4_5_23xe3xelviclfnu.R.inc(5103);return EntityType.DATA_PROPERTY;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isType(EntityType<?> entityType) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5104);
        __CLR4_5_23xe3xelviclfnu.R.inc(5105);return getEntityType().equals(entityType);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public String toStringID() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5106);
        __CLR4_5_23xe3xelviclfnu.R.inc(5107);return iri.toString();
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isDataPropertyExpression() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5108);
        __CLR4_5_23xe3xelviclfnu.R.inc(5109);return true;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isObjectPropertyExpression() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5110);
        __CLR4_5_23xe3xelviclfnu.R.inc(5111);return false;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5112);
        __CLR4_5_23xe3xelviclfnu.R.inc(5113);return iri;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isBuiltIn() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5114);
        __CLR4_5_23xe3xelviclfnu.R.inc(5115);return builtin;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5116);
        __CLR4_5_23xe3xelviclfnu.R.inc(5117);if ((((this == obj)&&(__CLR4_5_23xe3xelviclfnu.R.iget(5118)!=0|true))||(__CLR4_5_23xe3xelviclfnu.R.iget(5119)==0&false))) {{
            __CLR4_5_23xe3xelviclfnu.R.inc(5120);return true;
        }
        }__CLR4_5_23xe3xelviclfnu.R.inc(5121);if ((((!super.equals(obj))&&(__CLR4_5_23xe3xelviclfnu.R.iget(5122)!=0|true))||(__CLR4_5_23xe3xelviclfnu.R.iget(5123)==0&false))) {{
            __CLR4_5_23xe3xelviclfnu.R.inc(5124);return false;
        }
        }__CLR4_5_23xe3xelviclfnu.R.inc(5125);if ((((!(obj instanceof OWLDataProperty))&&(__CLR4_5_23xe3xelviclfnu.R.iget(5126)!=0|true))||(__CLR4_5_23xe3xelviclfnu.R.iget(5127)==0&false))) {{
            __CLR4_5_23xe3xelviclfnu.R.inc(5128);return false;
        }
        }__CLR4_5_23xe3xelviclfnu.R.inc(5129);return ((OWLDataProperty) obj).getIRI().equals(iri);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public void accept(OWLEntityVisitor visitor) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5130);
        __CLR4_5_23xe3xelviclfnu.R.inc(5131);visitor.visit(this);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public void accept(OWLPropertyExpressionVisitor visitor) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5132);
        __CLR4_5_23xe3xelviclfnu.R.inc(5133);visitor.visit(this);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5134);
        __CLR4_5_23xe3xelviclfnu.R.inc(5135);visitor.visit(this);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public void accept(OWLNamedObjectVisitor visitor) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5136);
        __CLR4_5_23xe3xelviclfnu.R.inc(5137);visitor.visit(this);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLNamedObjectVisitorEx<O> visitor) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5138);
        __CLR4_5_23xe3xelviclfnu.R.inc(5139);return visitor.visit(this);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLEntityVisitorEx<O> visitor) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5140);
        __CLR4_5_23xe3xelviclfnu.R.inc(5141);return visitor.visit(this);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLPropertyExpressionVisitorEx<O> visitor) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5142);
        __CLR4_5_23xe3xelviclfnu.R.inc(5143);return visitor.visit(this);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5144);
        __CLR4_5_23xe3xelviclfnu.R.inc(5145);return visitor.visit(this);
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5146);
        __CLR4_5_23xe3xelviclfnu.R.inc(5147);return false;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public OWLDataProperty asOWLDataProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5148);
        __CLR4_5_23xe3xelviclfnu.R.inc(5149);return this;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public OWLClass asOWLClass() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5150);
        __CLR4_5_23xe3xelviclfnu.R.inc(5151);throw new OWLRuntimeException("Not an OWLClass!");
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public OWLDatatype asOWLDatatype() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5152);
        __CLR4_5_23xe3xelviclfnu.R.inc(5153);throw new OWLRuntimeException("Not an OWLDatatype!");
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual asOWLNamedIndividual() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5154);
        __CLR4_5_23xe3xelviclfnu.R.inc(5155);throw new OWLRuntimeException("Not an OWLIndividual!");
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public OWLObjectProperty asOWLObjectProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5156);
        __CLR4_5_23xe3xelviclfnu.R.inc(5157);throw new OWLRuntimeException("Not an OWLObjectProperty!");
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLClass() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5158);
        __CLR4_5_23xe3xelviclfnu.R.inc(5159);return false;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLDataProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5160);
        __CLR4_5_23xe3xelviclfnu.R.inc(5161);return true;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLDatatype() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5162);
        __CLR4_5_23xe3xelviclfnu.R.inc(5163);return false;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLNamedIndividual() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5164);
        __CLR4_5_23xe3xelviclfnu.R.inc(5165);return false;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLObjectProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5166);
        __CLR4_5_23xe3xelviclfnu.R.inc(5167);return false;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLTopObjectProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5168);
        __CLR4_5_23xe3xelviclfnu.R.inc(5169);return false;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLBottomObjectProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5170);
        __CLR4_5_23xe3xelviclfnu.R.inc(5171);return false;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLTopDataProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5172);
        __CLR4_5_23xe3xelviclfnu.R.inc(5173);return iri.equals(OWLRDFVocabulary.OWL_TOP_DATA_PROPERTY.getIRI());
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLBottomDataProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5174);
        __CLR4_5_23xe3xelviclfnu.R.inc(5175);return iri.equals(OWLRDFVocabulary.OWL_BOTTOM_DATA_PROPERTY.getIRI());
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty asOWLAnnotationProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5176);
        __CLR4_5_23xe3xelviclfnu.R.inc(5177);throw new OWLRuntimeException("Not an annotation property");
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    public boolean isOWLAnnotationProperty() {try{__CLR4_5_23xe3xelviclfnu.R.inc(5178);
        __CLR4_5_23xe3xelviclfnu.R.inc(5179);return false;
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_23xe3xelviclfnu.R.inc(5180);
        __CLR4_5_23xe3xelviclfnu.R.inc(5181);return iri.compareTo(((OWLDataProperty) object).getIRI());
    }finally{__CLR4_5_23xe3xelviclfnu.R.flushNeeded();}}
}
