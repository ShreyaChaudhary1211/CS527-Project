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

import java.util.Collections;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import com.google.common.base.Optional;

/**
 * An OWLLiteral with xsd:string datatype and no language tag
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group, Date: 26-Oct-2006
 */
public class OWLLiteralImplString implements OWLLiteral {public static class __CLR4_5_26ee6eelviclg3l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,8412,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 30406L;
    @Nonnull
    private static final OWLDatatype XSD_STRING = new OWL2DatatypeImpl(OWL2Datatype.XSD_STRING);
    @Nonnull
    private final String literal;

    /**
     * @param literal
     *        the lexical form
     */
    public OWLLiteralImplString(@Nonnull String literal) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8294);
        __CLR4_5_26ee6eelviclg3l.R.inc(8295);this.literal = literal;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    private static int index() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8296);
        __CLR4_5_26ee6eelviclg3l.R.inc(8297);return OWLObjectTypeIndexProvider.DATA_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public String getLiteral() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8298);
        __CLR4_5_26ee6eelviclg3l.R.inc(8299);return literal;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean hasLang() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8300);
        __CLR4_5_26ee6eelviclg3l.R.inc(8301);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public int parseInteger() throws NumberFormatException {try{__CLR4_5_26ee6eelviclg3l.R.inc(8302);
        __CLR4_5_26ee6eelviclg3l.R.inc(8303);return Integer.parseInt(getLiteral());
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean isRDFPlainLiteral() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8304);
        __CLR4_5_26ee6eelviclg3l.R.inc(8305);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean isInteger() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8306);
        __CLR4_5_26ee6eelviclg3l.R.inc(8307);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean isBoolean() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8308);
        __CLR4_5_26ee6eelviclg3l.R.inc(8309);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean isDouble() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8310);
        __CLR4_5_26ee6eelviclg3l.R.inc(8311);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean isFloat() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8312);
        __CLR4_5_26ee6eelviclg3l.R.inc(8313);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean parseBoolean() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8314);
        __CLR4_5_26ee6eelviclg3l.R.inc(8315);throw new OWLRuntimeException(getClass().getName() + " does not have a boolean value");
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public double parseDouble() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8316);
        __CLR4_5_26ee6eelviclg3l.R.inc(8317);throw new OWLRuntimeException(getClass().getName() + " does not have a double value");
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public float parseFloat() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8318);
        __CLR4_5_26ee6eelviclg3l.R.inc(8319);throw new OWLRuntimeException(getClass().getName() + " does not have a float value");
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public String getLang() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8320);
        __CLR4_5_26ee6eelviclg3l.R.inc(8321);return "";
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean hasLang(String l) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8322);
        __CLR4_5_26ee6eelviclg3l.R.inc(8323);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public OWLDatatype getDatatype() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8324);
        __CLR4_5_26ee6eelviclg3l.R.inc(8325);return XSD_STRING;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8326);
        __CLR4_5_26ee6eelviclg3l.R.inc(8327);return literal.hashCode();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8328);
        __CLR4_5_26ee6eelviclg3l.R.inc(8329);if ((((obj == null)&&(__CLR4_5_26ee6eelviclg3l.R.iget(8330)!=0|true))||(__CLR4_5_26ee6eelviclg3l.R.iget(8331)==0&false))) {{
            __CLR4_5_26ee6eelviclg3l.R.inc(8332);return false;
        }
        }__CLR4_5_26ee6eelviclg3l.R.inc(8333);if ((((this == obj)&&(__CLR4_5_26ee6eelviclg3l.R.iget(8334)!=0|true))||(__CLR4_5_26ee6eelviclg3l.R.iget(8335)==0&false))) {{
            __CLR4_5_26ee6eelviclg3l.R.inc(8336);return true;
        }
        }__CLR4_5_26ee6eelviclg3l.R.inc(8337);if ((((!(obj instanceof OWLLiteral))&&(__CLR4_5_26ee6eelviclg3l.R.iget(8338)!=0|true))||(__CLR4_5_26ee6eelviclg3l.R.iget(8339)==0&false))) {{
            __CLR4_5_26ee6eelviclg3l.R.inc(8340);return false;
        }
        }__CLR4_5_26ee6eelviclg3l.R.inc(8341);OWLLiteral other = (OWLLiteral) obj;
        __CLR4_5_26ee6eelviclg3l.R.inc(8342);return getLiteral().equals(other.getLiteral()) && getDatatype().equals(other.getDatatype()) && getLang().equals(
            other.getLang());
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public void accept(OWLDataVisitor visitor) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8343);
        __CLR4_5_26ee6eelviclg3l.R.inc(8344);visitor.visit(this);
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataVisitorEx<O> visitor) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8345);
        __CLR4_5_26ee6eelviclg3l.R.inc(8346);return visitor.visit(this);
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public void accept(OWLAnnotationValueVisitor visitor) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8347);
        __CLR4_5_26ee6eelviclg3l.R.inc(8348);visitor.visit(this);
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAnnotationValueVisitorEx<O> visitor) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8349);
        __CLR4_5_26ee6eelviclg3l.R.inc(8350);return visitor.visit(this);
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8351);
        __CLR4_5_26ee6eelviclg3l.R.inc(8352);OWLLiteral other = (OWLLiteral) object;
        __CLR4_5_26ee6eelviclg3l.R.inc(8353);int diff = getLiteral().compareTo(other.getLiteral());
        __CLR4_5_26ee6eelviclg3l.R.inc(8354);if ((((diff != 0)&&(__CLR4_5_26ee6eelviclg3l.R.iget(8355)!=0|true))||(__CLR4_5_26ee6eelviclg3l.R.iget(8356)==0&false))) {{
            __CLR4_5_26ee6eelviclg3l.R.inc(8357);return diff;
        }
        }__CLR4_5_26ee6eelviclg3l.R.inc(8358);diff = getDatatype().compareTo(other.getDatatype());
        __CLR4_5_26ee6eelviclg3l.R.inc(8359);if ((((diff != 0)&&(__CLR4_5_26ee6eelviclg3l.R.iget(8360)!=0|true))||(__CLR4_5_26ee6eelviclg3l.R.iget(8361)==0&false))) {{
            __CLR4_5_26ee6eelviclg3l.R.inc(8362);return diff;
        }
        }__CLR4_5_26ee6eelviclg3l.R.inc(8363);return getLang().compareTo(other.getLang());
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8364);
        __CLR4_5_26ee6eelviclg3l.R.inc(8365);visitor.visit(this);
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8366);
        __CLR4_5_26ee6eelviclg3l.R.inc(8367);return visitor.visit(this);
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getSignature() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8368);
        __CLR4_5_26ee6eelviclg3l.R.inc(8369);return Collections.singleton((OWLEntity) XSD_STRING);
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Set<OWLAnonymousIndividual> getAnonymousIndividuals() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8370);
        __CLR4_5_26ee6eelviclg3l.R.inc(8371);return CollectionFactory.emptySet();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Set<OWLClass> getClassesInSignature() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8372);
        __CLR4_5_26ee6eelviclg3l.R.inc(8373);return CollectionFactory.emptySet();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Set<OWLAnnotationProperty> getAnnotationPropertiesInSignature() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8374);
        __CLR4_5_26ee6eelviclg3l.R.inc(8375);return CollectionFactory.emptySet();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Set<OWLDataProperty> getDataPropertiesInSignature() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8376);
        __CLR4_5_26ee6eelviclg3l.R.inc(8377);return CollectionFactory.emptySet();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Set<OWLObjectProperty> getObjectPropertiesInSignature() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8378);
        __CLR4_5_26ee6eelviclg3l.R.inc(8379);return CollectionFactory.emptySet();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Set<OWLNamedIndividual> getIndividualsInSignature() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8380);
        __CLR4_5_26ee6eelviclg3l.R.inc(8381);return CollectionFactory.emptySet();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Set<OWLDatatype> getDatatypesInSignature() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8382);
        __CLR4_5_26ee6eelviclg3l.R.inc(8383);return CollectionFactory.emptySet();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Set<OWLClassExpression> getNestedClassExpressions() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8384);
        __CLR4_5_26ee6eelviclg3l.R.inc(8385);return CollectionFactory.emptySet();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean isTopEntity() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8386);
        __CLR4_5_26ee6eelviclg3l.R.inc(8387);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean isBottomEntity() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8388);
        __CLR4_5_26ee6eelviclg3l.R.inc(8389);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public int compareTo(OWLObject o) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8390);
        __CLR4_5_26ee6eelviclg3l.R.inc(8391);int thisTypeIndex = index();
        __CLR4_5_26ee6eelviclg3l.R.inc(8392);int otherTypeIndex = 0;
        __CLR4_5_26ee6eelviclg3l.R.inc(8393);if ((((o instanceof OWLObjectImplWithEntityAndAnonCaching)&&(__CLR4_5_26ee6eelviclg3l.R.iget(8394)!=0|true))||(__CLR4_5_26ee6eelviclg3l.R.iget(8395)==0&false))) {{
            __CLR4_5_26ee6eelviclg3l.R.inc(8396);otherTypeIndex = ((OWLObjectImplWithEntityAndAnonCaching) o).index();
        } }else {{
            __CLR4_5_26ee6eelviclg3l.R.inc(8397);otherTypeIndex = OWLObjectImplWithEntityAndAnonCaching.OWLOBJECT_TYPEINDEX_PROVIDER.getTypeIndex(o);
        }
        }__CLR4_5_26ee6eelviclg3l.R.inc(8398);int diff = thisTypeIndex - otherTypeIndex;
        __CLR4_5_26ee6eelviclg3l.R.inc(8399);if ((((diff == 0)&&(__CLR4_5_26ee6eelviclg3l.R.iget(8400)!=0|true))||(__CLR4_5_26ee6eelviclg3l.R.iget(8401)==0&false))) {{
            // Objects are the same type
            __CLR4_5_26ee6eelviclg3l.R.inc(8402);return compareObjectOfSameType(o);
        } }else {{
            __CLR4_5_26ee6eelviclg3l.R.inc(8403);return diff;
        }
    }}finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public boolean containsEntityInSignature(OWLEntity owlEntity) {try{__CLR4_5_26ee6eelviclg3l.R.inc(8404);
        __CLR4_5_26ee6eelviclg3l.R.inc(8405);return false;
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Optional<IRI> asIRI() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8406);
        __CLR4_5_26ee6eelviclg3l.R.inc(8407);return Optional.absent();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Optional<OWLAnonymousIndividual> asAnonymousIndividual() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8408);
        __CLR4_5_26ee6eelviclg3l.R.inc(8409);return Optional.absent();
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}

    @Override
    public Optional<OWLLiteral> asLiteral() {try{__CLR4_5_26ee6eelviclg3l.R.inc(8410);
        __CLR4_5_26ee6eelviclg3l.R.inc(8411);return Optional.<OWLLiteral> of(this);
    }finally{__CLR4_5_26ee6eelviclg3l.R.flushNeeded();}}
}
