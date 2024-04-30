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

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;

import com.google.common.base.Optional;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLLiteralImplBoolean extends OWLObjectImplWithoutEntityAndAnonCaching implements OWLLiteral {public static class __CLR4_5_25vw5vwlviclg0m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,7724,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private final boolean literal;
    @Nonnull
    private final OWLDatatype datatype;

    @Override
    protected int index() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7628);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7629);return OWLObjectTypeIndexProvider.DATA_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    /**
     * @param literal
     *        literal value
     * @param datatype
     *        datatype
     */
    public OWLLiteralImplBoolean(boolean literal, @Nonnull OWLDatatype datatype) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7630);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7631);this.datatype = checkNotNull(datatype, "datatype cannot be null");
        __CLR4_5_25vw5vwlviclg0m.R.inc(7632);this.literal = literal;
        __CLR4_5_25vw5vwlviclg0m.R.inc(7633);hashcode = getHashCode();
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7634);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7635);entities.add(datatype);
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7636);}finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    private final int hashcode;

    @Override
    public int hashCode() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7637);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7638);return hashcode;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    private int getHashCode() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7639);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7640);int code = 277;
        __CLR4_5_25vw5vwlviclg0m.R.inc(7641);code = code * 37 + getDatatype().hashCode();
        __CLR4_5_25vw5vwlviclg0m.R.inc(7642);code = code * 37 + ((((literal )&&(__CLR4_5_25vw5vwlviclg0m.R.iget(7643)!=0|true))||(__CLR4_5_25vw5vwlviclg0m.R.iget(7644)==0&false))? 65536 : 0);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7645);return code;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public String getLiteral() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7646);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7647);return Boolean.toString(literal);
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public boolean isRDFPlainLiteral() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7648);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7649);return false;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public boolean hasLang() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7650);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7651);return false;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public boolean isInteger() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7652);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7653);return false;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public int parseInteger() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7654);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7655);throw new NumberFormatException("this literal is not an integer but a boolean");
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public boolean isBoolean() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7656);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7657);return true;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public boolean parseBoolean() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7658);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7659);return literal;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public boolean isDouble() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7660);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7661);return false;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public double parseDouble() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7662);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7663);throw new NumberFormatException("this literal is not a double but a boolean");
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public boolean isFloat() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7664);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7665);return false;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public float parseFloat() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7666);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7667);throw new NumberFormatException("this literal is not a float but a boolean");
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Nonnull
    @Override
    public String getLang() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7668);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7669);return "";
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public boolean hasLang(String lang) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7670);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7671);return false;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public OWLDatatype getDatatype() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7672);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7673);return datatype;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7674);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7675);if ((((this == obj)&&(__CLR4_5_25vw5vwlviclg0m.R.iget(7676)!=0|true))||(__CLR4_5_25vw5vwlviclg0m.R.iget(7677)==0&false))) {{
            __CLR4_5_25vw5vwlviclg0m.R.inc(7678);return true;
        }
        }__CLR4_5_25vw5vwlviclg0m.R.inc(7679);if ((((!super.equals(obj))&&(__CLR4_5_25vw5vwlviclg0m.R.iget(7680)!=0|true))||(__CLR4_5_25vw5vwlviclg0m.R.iget(7681)==0&false))) {{
            __CLR4_5_25vw5vwlviclg0m.R.inc(7682);return false;
        }
        }__CLR4_5_25vw5vwlviclg0m.R.inc(7683);if ((((obj instanceof OWLLiteralImplBoolean)&&(__CLR4_5_25vw5vwlviclg0m.R.iget(7684)!=0|true))||(__CLR4_5_25vw5vwlviclg0m.R.iget(7685)==0&false))) {{
            __CLR4_5_25vw5vwlviclg0m.R.inc(7686);OWLLiteralImplBoolean other = (OWLLiteralImplBoolean) obj;
            __CLR4_5_25vw5vwlviclg0m.R.inc(7687);return literal == other.literal;
        }
        }__CLR4_5_25vw5vwlviclg0m.R.inc(7688);if ((((obj instanceof OWLLiteral)&&(__CLR4_5_25vw5vwlviclg0m.R.iget(7689)!=0|true))||(__CLR4_5_25vw5vwlviclg0m.R.iget(7690)==0&false))) {{
            __CLR4_5_25vw5vwlviclg0m.R.inc(7691);return ((OWLLiteral) obj).isBoolean() && literal == ((OWLLiteral) obj).parseBoolean();
        }
        }__CLR4_5_25vw5vwlviclg0m.R.inc(7692);return false;
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public void accept(OWLDataVisitor visitor) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7693);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7694);visitor.visit(this);
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataVisitorEx<O> visitor) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7695);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7696);return visitor.visit(this);
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public void accept(OWLAnnotationValueVisitor visitor) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7697);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7698);visitor.visit(this);
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAnnotationValueVisitorEx<O> visitor) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7699);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7700);return visitor.visit(this);
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7701);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7702);OWLLiteral other = (OWLLiteral) object;
        __CLR4_5_25vw5vwlviclg0m.R.inc(7703);int diff = getLiteral().compareTo(other.getLiteral());
        __CLR4_5_25vw5vwlviclg0m.R.inc(7704);if ((((diff != 0)&&(__CLR4_5_25vw5vwlviclg0m.R.iget(7705)!=0|true))||(__CLR4_5_25vw5vwlviclg0m.R.iget(7706)==0&false))) {{
            __CLR4_5_25vw5vwlviclg0m.R.inc(7707);return diff;
        }
        }__CLR4_5_25vw5vwlviclg0m.R.inc(7708);int compareTo = datatype.compareTo(other.getDatatype());
        __CLR4_5_25vw5vwlviclg0m.R.inc(7709);if ((((compareTo != 0)&&(__CLR4_5_25vw5vwlviclg0m.R.iget(7710)!=0|true))||(__CLR4_5_25vw5vwlviclg0m.R.iget(7711)==0&false))) {{
            __CLR4_5_25vw5vwlviclg0m.R.inc(7712);return compareTo;
        }
        }__CLR4_5_25vw5vwlviclg0m.R.inc(7713);return Boolean.compare(literal, other.parseBoolean());
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7714);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7715);visitor.visit(this);
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7716);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7717);return visitor.visit(this);
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public Optional<IRI> asIRI() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7718);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7719);return Optional.absent();
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public Optional<OWLAnonymousIndividual> asAnonymousIndividual() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7720);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7721);return Optional.absent();
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}

    @Override
    public Optional<OWLLiteral> asLiteral() {try{__CLR4_5_25vw5vwlviclg0m.R.inc(7722);
        __CLR4_5_25vw5vwlviclg0m.R.inc(7723);return Optional.<OWLLiteral> of(this);
    }finally{__CLR4_5_25vw5vwlviclg0m.R.flushNeeded();}}
}
