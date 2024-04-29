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

import org.semanticweb.owlapi.model.DataRangeType;
import org.semanticweb.owlapi.model.EntityType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataRangeVisitor;
import org.semanticweb.owlapi.model.OWLDataRangeVisitorEx;
import org.semanticweb.owlapi.model.OWLDataVisitor;
import org.semanticweb.owlapi.model.OWLDataVisitorEx;
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
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWL2Datatype;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLDatatypeImpl extends OWLObjectImplWithoutEntityAndAnonCaching
        implements OWLDatatype {public static class __CLR4_5_2445445lviclfp7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,5434,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final IRI iri;
    private final boolean top;
    private final boolean builtin;

    @Override
    protected int index() {try{__CLR4_5_2445445lviclfp7.R.inc(5333);
        __CLR4_5_2445445lviclfp7.R.inc(5334);return OWLObjectTypeIndexProvider.DATA_TYPE_INDEX_BASE + 1;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    /**
     * @param iri
     *        datatype iri
     */
    public OWLDatatypeImpl(@Nonnull IRI iri) {try{__CLR4_5_2445445lviclfp7.R.inc(5335);
        __CLR4_5_2445445lviclfp7.R.inc(5336);this.iri = checkNotNull(iri, "iri cannot be null");
        __CLR4_5_2445445lviclfp7.R.inc(5337);top = iri.equals(OWLRDFVocabulary.RDFS_LITERAL.getIRI());
        __CLR4_5_2445445lviclfp7.R.inc(5338);builtin = top || OWL2Datatype.isBuiltIn(iri)
                || iri.equals(OWLRDFVocabulary.RDF_PLAIN_LITERAL.getIRI());
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_2445445lviclfp7.R.inc(5339);
        __CLR4_5_2445445lviclfp7.R.inc(5340);return top;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isRDFPlainLiteral() {try{__CLR4_5_2445445lviclfp7.R.inc(5341);
        __CLR4_5_2445445lviclfp7.R.inc(5342);return iri.isPlainLiteral();
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public EntityType<?> getEntityType() {try{__CLR4_5_2445445lviclfp7.R.inc(5343);
        __CLR4_5_2445445lviclfp7.R.inc(5344);return EntityType.DATATYPE;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isType(EntityType<?> entityType) {try{__CLR4_5_2445445lviclfp7.R.inc(5345);
        __CLR4_5_2445445lviclfp7.R.inc(5346);return getEntityType().equals(entityType);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public String toStringID() {try{__CLR4_5_2445445lviclfp7.R.inc(5347);
        __CLR4_5_2445445lviclfp7.R.inc(5348);return iri.toString();
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_2445445lviclfp7.R.inc(5349);
        __CLR4_5_2445445lviclfp7.R.inc(5350);return iri;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isBuiltIn() {try{__CLR4_5_2445445lviclfp7.R.inc(5351);
        __CLR4_5_2445445lviclfp7.R.inc(5352);return builtin;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public DataRangeType getDataRangeType() {try{__CLR4_5_2445445lviclfp7.R.inc(5353);
        __CLR4_5_2445445lviclfp7.R.inc(5354);return DataRangeType.DATATYPE;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public OWL2Datatype getBuiltInDatatype() {try{__CLR4_5_2445445lviclfp7.R.inc(5355);
        __CLR4_5_2445445lviclfp7.R.inc(5356);if ((((!builtin)&&(__CLR4_5_2445445lviclfp7.R.iget(5357)!=0|true))||(__CLR4_5_2445445lviclfp7.R.iget(5358)==0&false))) {{
            __CLR4_5_2445445lviclfp7.R.inc(5359);throw new OWLRuntimeException(
                    iri
                            + " is not a built in datatype.  The getBuiltInDatatype() method should only be called on built in datatypes.");
        } }else {{
            __CLR4_5_2445445lviclfp7.R.inc(5360);return OWL2Datatype.getDatatype(iri);
        }
    }}finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isDouble() {try{__CLR4_5_2445445lviclfp7.R.inc(5361);
        __CLR4_5_2445445lviclfp7.R.inc(5362);return iri.equals(OWL2Datatype.XSD_DOUBLE.getIRI());
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isFloat() {try{__CLR4_5_2445445lviclfp7.R.inc(5363);
        __CLR4_5_2445445lviclfp7.R.inc(5364);return iri.equals(OWL2Datatype.XSD_FLOAT.getIRI());
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isInteger() {try{__CLR4_5_2445445lviclfp7.R.inc(5365);
        __CLR4_5_2445445lviclfp7.R.inc(5366);return iri.equals(OWL2Datatype.XSD_INTEGER.getIRI());
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isString() {try{__CLR4_5_2445445lviclfp7.R.inc(5367);
        __CLR4_5_2445445lviclfp7.R.inc(5368);return iri.equals(OWL2Datatype.XSD_STRING.getIRI());
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isBoolean() {try{__CLR4_5_2445445lviclfp7.R.inc(5369);
        __CLR4_5_2445445lviclfp7.R.inc(5370);return iri.equals(OWL2Datatype.XSD_BOOLEAN.getIRI());
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isDatatype() {try{__CLR4_5_2445445lviclfp7.R.inc(5371);
        __CLR4_5_2445445lviclfp7.R.inc(5372);return true;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isTopDatatype() {try{__CLR4_5_2445445lviclfp7.R.inc(5373);
        __CLR4_5_2445445lviclfp7.R.inc(5374);return top;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2445445lviclfp7.R.inc(5375);
        __CLR4_5_2445445lviclfp7.R.inc(5376);if ((((this == obj)&&(__CLR4_5_2445445lviclfp7.R.iget(5377)!=0|true))||(__CLR4_5_2445445lviclfp7.R.iget(5378)==0&false))) {{
            __CLR4_5_2445445lviclfp7.R.inc(5379);return true;
        }
        }__CLR4_5_2445445lviclfp7.R.inc(5380);if ((((obj instanceof OWLDatatype)&&(__CLR4_5_2445445lviclfp7.R.iget(5381)!=0|true))||(__CLR4_5_2445445lviclfp7.R.iget(5382)==0&false))) {{
            __CLR4_5_2445445lviclfp7.R.inc(5383);return ((OWLDatatype) obj).getIRI().equals(getIRI());
        }
        }__CLR4_5_2445445lviclfp7.R.inc(5384);return false;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public OWLClass asOWLClass() {try{__CLR4_5_2445445lviclfp7.R.inc(5385);
        __CLR4_5_2445445lviclfp7.R.inc(5386);throw new OWLRuntimeException("Not an OWLClass!");
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public OWLDataProperty asOWLDataProperty() {try{__CLR4_5_2445445lviclfp7.R.inc(5387);
        __CLR4_5_2445445lviclfp7.R.inc(5388);throw new OWLRuntimeException("Not a data property!");
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public OWLDatatype asOWLDatatype() {try{__CLR4_5_2445445lviclfp7.R.inc(5389);
        __CLR4_5_2445445lviclfp7.R.inc(5390);return this;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual asOWLNamedIndividual() {try{__CLR4_5_2445445lviclfp7.R.inc(5391);
        __CLR4_5_2445445lviclfp7.R.inc(5392);throw new OWLRuntimeException("Not an individual!");
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public OWLObjectProperty asOWLObjectProperty() {try{__CLR4_5_2445445lviclfp7.R.inc(5393);
        __CLR4_5_2445445lviclfp7.R.inc(5394);throw new OWLRuntimeException("Not an object property");
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isOWLClass() {try{__CLR4_5_2445445lviclfp7.R.inc(5395);
        __CLR4_5_2445445lviclfp7.R.inc(5396);return false;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isOWLDataProperty() {try{__CLR4_5_2445445lviclfp7.R.inc(5397);
        __CLR4_5_2445445lviclfp7.R.inc(5398);return false;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isOWLDatatype() {try{__CLR4_5_2445445lviclfp7.R.inc(5399);
        __CLR4_5_2445445lviclfp7.R.inc(5400);return true;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isOWLNamedIndividual() {try{__CLR4_5_2445445lviclfp7.R.inc(5401);
        __CLR4_5_2445445lviclfp7.R.inc(5402);return false;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isOWLObjectProperty() {try{__CLR4_5_2445445lviclfp7.R.inc(5403);
        __CLR4_5_2445445lviclfp7.R.inc(5404);return false;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty asOWLAnnotationProperty() {try{__CLR4_5_2445445lviclfp7.R.inc(5405);
        __CLR4_5_2445445lviclfp7.R.inc(5406);throw new OWLRuntimeException("Not an annotation property");
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public boolean isOWLAnnotationProperty() {try{__CLR4_5_2445445lviclfp7.R.inc(5407);
        __CLR4_5_2445445lviclfp7.R.inc(5408);return false;
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public void accept(OWLEntityVisitor visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5409);
        __CLR4_5_2445445lviclfp7.R.inc(5410);visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public void accept(OWLDataVisitor visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5411);
        __CLR4_5_2445445lviclfp7.R.inc(5412);visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5413);
        __CLR4_5_2445445lviclfp7.R.inc(5414);visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public void accept(OWLNamedObjectVisitor visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5415);
        __CLR4_5_2445445lviclfp7.R.inc(5416);visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLNamedObjectVisitorEx<O> visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5417);
        __CLR4_5_2445445lviclfp7.R.inc(5418);return visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLEntityVisitorEx<O> visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5419);
        __CLR4_5_2445445lviclfp7.R.inc(5420);return visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataVisitorEx<O> visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5421);
        __CLR4_5_2445445lviclfp7.R.inc(5422);return visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5423);
        __CLR4_5_2445445lviclfp7.R.inc(5424);return visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public void accept(OWLDataRangeVisitor visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5425);
        __CLR4_5_2445445lviclfp7.R.inc(5426);visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataRangeVisitorEx<O> visitor) {try{__CLR4_5_2445445lviclfp7.R.inc(5427);
        __CLR4_5_2445445lviclfp7.R.inc(5428);return visitor.visit(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_2445445lviclfp7.R.inc(5429);
        __CLR4_5_2445445lviclfp7.R.inc(5430);return iri.compareTo(((OWLDatatype) object).getIRI());
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_2445445lviclfp7.R.inc(5431);
        __CLR4_5_2445445lviclfp7.R.inc(5432);entities.add(this);
    }finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_2445445lviclfp7.R.inc(5433);}finally{__CLR4_5_2445445lviclfp7.R.flushNeeded();}}
}
