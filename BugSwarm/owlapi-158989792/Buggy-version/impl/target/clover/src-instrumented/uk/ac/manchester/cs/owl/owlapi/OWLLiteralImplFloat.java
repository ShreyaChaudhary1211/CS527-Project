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
public class OWLLiteralImplFloat extends OWLObjectImplWithoutEntityAndAnonCaching implements OWLLiteral {public static class __CLR4_5_2616616lviclg1x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,7912,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private final float literal;
    @Nonnull
    private final OWLDatatype datatype;

    @Override
    protected int index() {try{__CLR4_5_2616616lviclg1x.R.inc(7818);
        __CLR4_5_2616616lviclg1x.R.inc(7819);return OWLObjectTypeIndexProvider.DATA_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    /**
     * @param literal
     *        literal value
     * @param datatype
     *        datatype
     */
    public OWLLiteralImplFloat(float literal, @Nonnull OWLDatatype datatype) {try{__CLR4_5_2616616lviclg1x.R.inc(7820);
        __CLR4_5_2616616lviclg1x.R.inc(7821);this.literal = literal;
        __CLR4_5_2616616lviclg1x.R.inc(7822);this.datatype = checkNotNull(datatype, "datatype cannot be null");
        __CLR4_5_2616616lviclg1x.R.inc(7823);hashcode = getHashCode();
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_2616616lviclg1x.R.inc(7824);
        __CLR4_5_2616616lviclg1x.R.inc(7825);entities.add(datatype);
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_2616616lviclg1x.R.inc(7826);}finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    private final int hashcode;

    @Override
    public int hashCode() {try{__CLR4_5_2616616lviclg1x.R.inc(7827);
        __CLR4_5_2616616lviclg1x.R.inc(7828);return hashcode;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    private int getHashCode() {try{__CLR4_5_2616616lviclg1x.R.inc(7829);
        __CLR4_5_2616616lviclg1x.R.inc(7830);int code = 277;
        __CLR4_5_2616616lviclg1x.R.inc(7831);code = code * 37 + getDatatype().hashCode();
        __CLR4_5_2616616lviclg1x.R.inc(7832);code = code * 37 + (int) (literal * 65536);
        __CLR4_5_2616616lviclg1x.R.inc(7833);return code;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public String getLiteral() {try{__CLR4_5_2616616lviclg1x.R.inc(7834);
        __CLR4_5_2616616lviclg1x.R.inc(7835);return Float.toString(literal);
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public boolean isRDFPlainLiteral() {try{__CLR4_5_2616616lviclg1x.R.inc(7836);
        __CLR4_5_2616616lviclg1x.R.inc(7837);return false;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public boolean hasLang() {try{__CLR4_5_2616616lviclg1x.R.inc(7838);
        __CLR4_5_2616616lviclg1x.R.inc(7839);return false;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public boolean isInteger() {try{__CLR4_5_2616616lviclg1x.R.inc(7840);
        __CLR4_5_2616616lviclg1x.R.inc(7841);return false;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public int parseInteger() {try{__CLR4_5_2616616lviclg1x.R.inc(7842);
        __CLR4_5_2616616lviclg1x.R.inc(7843);throw new NumberFormatException("this literal is not an integer but a float");
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public boolean isBoolean() {try{__CLR4_5_2616616lviclg1x.R.inc(7844);
        __CLR4_5_2616616lviclg1x.R.inc(7845);return false;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public boolean parseBoolean() {try{__CLR4_5_2616616lviclg1x.R.inc(7846);
        __CLR4_5_2616616lviclg1x.R.inc(7847);throw new NumberFormatException("this literal is not a boolean but a float");
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public boolean isDouble() {try{__CLR4_5_2616616lviclg1x.R.inc(7848);
        __CLR4_5_2616616lviclg1x.R.inc(7849);return false;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public double parseDouble() {try{__CLR4_5_2616616lviclg1x.R.inc(7850);
        __CLR4_5_2616616lviclg1x.R.inc(7851);throw new NumberFormatException("this literal is not a double but a float");
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public boolean isFloat() {try{__CLR4_5_2616616lviclg1x.R.inc(7852);
        __CLR4_5_2616616lviclg1x.R.inc(7853);return true;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public float parseFloat() {try{__CLR4_5_2616616lviclg1x.R.inc(7854);
        __CLR4_5_2616616lviclg1x.R.inc(7855);return literal;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Nonnull
    @Override
    public String getLang() {try{__CLR4_5_2616616lviclg1x.R.inc(7856);
        __CLR4_5_2616616lviclg1x.R.inc(7857);return "";
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public boolean hasLang(String lang) {try{__CLR4_5_2616616lviclg1x.R.inc(7858);
        __CLR4_5_2616616lviclg1x.R.inc(7859);return false;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public OWLDatatype getDatatype() {try{__CLR4_5_2616616lviclg1x.R.inc(7860);
        __CLR4_5_2616616lviclg1x.R.inc(7861);return datatype;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2616616lviclg1x.R.inc(7862);
        __CLR4_5_2616616lviclg1x.R.inc(7863);if ((((this == obj)&&(__CLR4_5_2616616lviclg1x.R.iget(7864)!=0|true))||(__CLR4_5_2616616lviclg1x.R.iget(7865)==0&false))) {{
            __CLR4_5_2616616lviclg1x.R.inc(7866);return true;
        }
        }__CLR4_5_2616616lviclg1x.R.inc(7867);if ((((!super.equals(obj))&&(__CLR4_5_2616616lviclg1x.R.iget(7868)!=0|true))||(__CLR4_5_2616616lviclg1x.R.iget(7869)==0&false))) {{
            __CLR4_5_2616616lviclg1x.R.inc(7870);return false;
        }
        }__CLR4_5_2616616lviclg1x.R.inc(7871);if ((((obj instanceof OWLLiteralImplFloat)&&(__CLR4_5_2616616lviclg1x.R.iget(7872)!=0|true))||(__CLR4_5_2616616lviclg1x.R.iget(7873)==0&false))) {{
            __CLR4_5_2616616lviclg1x.R.inc(7874);OWLLiteralImplFloat other = (OWLLiteralImplFloat) obj;
            __CLR4_5_2616616lviclg1x.R.inc(7875);return literal == other.literal && datatype.equals(other.getDatatype());
        }
        }__CLR4_5_2616616lviclg1x.R.inc(7876);if ((((obj instanceof OWLLiteral)&&(__CLR4_5_2616616lviclg1x.R.iget(7877)!=0|true))||(__CLR4_5_2616616lviclg1x.R.iget(7878)==0&false))) {{
            __CLR4_5_2616616lviclg1x.R.inc(7879);return ((OWLLiteral) obj).isFloat() && Float.compare(literal, ((OWLLiteral) obj).parseFloat()) == 0;
        }
        }__CLR4_5_2616616lviclg1x.R.inc(7880);return false;
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public void accept(OWLDataVisitor visitor) {try{__CLR4_5_2616616lviclg1x.R.inc(7881);
        __CLR4_5_2616616lviclg1x.R.inc(7882);visitor.visit(this);
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataVisitorEx<O> visitor) {try{__CLR4_5_2616616lviclg1x.R.inc(7883);
        __CLR4_5_2616616lviclg1x.R.inc(7884);return visitor.visit(this);
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public void accept(OWLAnnotationValueVisitor visitor) {try{__CLR4_5_2616616lviclg1x.R.inc(7885);
        __CLR4_5_2616616lviclg1x.R.inc(7886);visitor.visit(this);
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAnnotationValueVisitorEx<O> visitor) {try{__CLR4_5_2616616lviclg1x.R.inc(7887);
        __CLR4_5_2616616lviclg1x.R.inc(7888);return visitor.visit(this);
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_2616616lviclg1x.R.inc(7889);
        __CLR4_5_2616616lviclg1x.R.inc(7890);OWLLiteral other = (OWLLiteral) object;
        __CLR4_5_2616616lviclg1x.R.inc(7891);int diff = getLiteral().compareTo(other.getLiteral());
        __CLR4_5_2616616lviclg1x.R.inc(7892);if ((((diff != 0)&&(__CLR4_5_2616616lviclg1x.R.iget(7893)!=0|true))||(__CLR4_5_2616616lviclg1x.R.iget(7894)==0&false))) {{
            __CLR4_5_2616616lviclg1x.R.inc(7895);return diff;
        }
        }__CLR4_5_2616616lviclg1x.R.inc(7896);int compareTo = datatype.compareTo(other.getDatatype());
        __CLR4_5_2616616lviclg1x.R.inc(7897);if ((((compareTo != 0)&&(__CLR4_5_2616616lviclg1x.R.iget(7898)!=0|true))||(__CLR4_5_2616616lviclg1x.R.iget(7899)==0&false))) {{
            __CLR4_5_2616616lviclg1x.R.inc(7900);return compareTo;
        }
        }__CLR4_5_2616616lviclg1x.R.inc(7901);return Float.compare(literal, other.parseFloat());
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_2616616lviclg1x.R.inc(7902);
        __CLR4_5_2616616lviclg1x.R.inc(7903);visitor.visit(this);
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_2616616lviclg1x.R.inc(7904);
        __CLR4_5_2616616lviclg1x.R.inc(7905);return visitor.visit(this);
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public Optional<IRI> asIRI() {try{__CLR4_5_2616616lviclg1x.R.inc(7906);
        __CLR4_5_2616616lviclg1x.R.inc(7907);return Optional.absent();
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public Optional<OWLAnonymousIndividual> asAnonymousIndividual() {try{__CLR4_5_2616616lviclg1x.R.inc(7908);
        __CLR4_5_2616616lviclg1x.R.inc(7909);return Optional.absent();
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}

    @Override
    public Optional<OWLLiteral> asLiteral() {try{__CLR4_5_2616616lviclg1x.R.inc(7910);
        __CLR4_5_2616616lviclg1x.R.inc(7911);return Optional.<OWLLiteral> of(this);
    }finally{__CLR4_5_2616616lviclg1x.R.flushNeeded();}}
}
