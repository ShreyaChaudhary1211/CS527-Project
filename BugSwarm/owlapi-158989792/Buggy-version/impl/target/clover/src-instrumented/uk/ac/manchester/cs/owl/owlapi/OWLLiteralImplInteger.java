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
public class OWLLiteralImplInteger extends OWLObjectImplWithoutEntityAndAnonCaching implements OWLLiteral {public static class __CLR4_5_263s63slviclg24{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,8006,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private final int literal;
    @Nonnull
    private final OWLDatatype datatype;

    @Override
    protected int index() {try{__CLR4_5_263s63slviclg24.R.inc(7912);
        __CLR4_5_263s63slviclg24.R.inc(7913);return OWLObjectTypeIndexProvider.DATA_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    /**
     * @param literal
     *        literal value
     * @param datatype
     *        datatype
     */
    public OWLLiteralImplInteger(int literal, @Nonnull OWLDatatype datatype) {try{__CLR4_5_263s63slviclg24.R.inc(7914);
        __CLR4_5_263s63slviclg24.R.inc(7915);this.literal = literal;
        __CLR4_5_263s63slviclg24.R.inc(7916);this.datatype = checkNotNull(datatype, "datatype cannot be null");
        __CLR4_5_263s63slviclg24.R.inc(7917);hashcode = getHashCode();
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_263s63slviclg24.R.inc(7918);
        __CLR4_5_263s63slviclg24.R.inc(7919);entities.add(datatype);
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_263s63slviclg24.R.inc(7920);}finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    private final int hashcode;

    @Override
    public int hashCode() {try{__CLR4_5_263s63slviclg24.R.inc(7921);
        __CLR4_5_263s63slviclg24.R.inc(7922);return hashcode;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    private int getHashCode() {try{__CLR4_5_263s63slviclg24.R.inc(7923);
        __CLR4_5_263s63slviclg24.R.inc(7924);int code = 277;
        __CLR4_5_263s63slviclg24.R.inc(7925);code = code * 37 + getDatatype().hashCode();
        __CLR4_5_263s63slviclg24.R.inc(7926);code = code * 37 + literal * 65536;
        __CLR4_5_263s63slviclg24.R.inc(7927);return code;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public String getLiteral() {try{__CLR4_5_263s63slviclg24.R.inc(7928);
        __CLR4_5_263s63slviclg24.R.inc(7929);return Integer.toString(literal);
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public boolean isRDFPlainLiteral() {try{__CLR4_5_263s63slviclg24.R.inc(7930);
        __CLR4_5_263s63slviclg24.R.inc(7931);return false;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public boolean hasLang() {try{__CLR4_5_263s63slviclg24.R.inc(7932);
        __CLR4_5_263s63slviclg24.R.inc(7933);return false;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public boolean isInteger() {try{__CLR4_5_263s63slviclg24.R.inc(7934);
        __CLR4_5_263s63slviclg24.R.inc(7935);return true;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public int parseInteger() {try{__CLR4_5_263s63slviclg24.R.inc(7936);
        __CLR4_5_263s63slviclg24.R.inc(7937);return literal;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public boolean isBoolean() {try{__CLR4_5_263s63slviclg24.R.inc(7938);
        __CLR4_5_263s63slviclg24.R.inc(7939);return false;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public boolean parseBoolean() {try{__CLR4_5_263s63slviclg24.R.inc(7940);
        __CLR4_5_263s63slviclg24.R.inc(7941);throw new NumberFormatException("this literal is not a boolean but a int");
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public boolean isDouble() {try{__CLR4_5_263s63slviclg24.R.inc(7942);
        __CLR4_5_263s63slviclg24.R.inc(7943);return false;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public double parseDouble() {try{__CLR4_5_263s63slviclg24.R.inc(7944);
        __CLR4_5_263s63slviclg24.R.inc(7945);throw new NumberFormatException("this literal is not a double but a int");
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public boolean isFloat() {try{__CLR4_5_263s63slviclg24.R.inc(7946);
        __CLR4_5_263s63slviclg24.R.inc(7947);return false;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public float parseFloat() {try{__CLR4_5_263s63slviclg24.R.inc(7948);
        __CLR4_5_263s63slviclg24.R.inc(7949);throw new NumberFormatException("this literal is not a float but a int");
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Nonnull
    @Override
    public String getLang() {try{__CLR4_5_263s63slviclg24.R.inc(7950);
        __CLR4_5_263s63slviclg24.R.inc(7951);return "";
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public boolean hasLang(String lang) {try{__CLR4_5_263s63slviclg24.R.inc(7952);
        __CLR4_5_263s63slviclg24.R.inc(7953);return false;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public OWLDatatype getDatatype() {try{__CLR4_5_263s63slviclg24.R.inc(7954);
        __CLR4_5_263s63slviclg24.R.inc(7955);return datatype;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_263s63slviclg24.R.inc(7956);
        __CLR4_5_263s63slviclg24.R.inc(7957);if ((((this == obj)&&(__CLR4_5_263s63slviclg24.R.iget(7958)!=0|true))||(__CLR4_5_263s63slviclg24.R.iget(7959)==0&false))) {{
            __CLR4_5_263s63slviclg24.R.inc(7960);return true;
        }
        }__CLR4_5_263s63slviclg24.R.inc(7961);if ((((!super.equals(obj))&&(__CLR4_5_263s63slviclg24.R.iget(7962)!=0|true))||(__CLR4_5_263s63slviclg24.R.iget(7963)==0&false))) {{
            __CLR4_5_263s63slviclg24.R.inc(7964);return false;
        }
        }__CLR4_5_263s63slviclg24.R.inc(7965);if ((((obj instanceof OWLLiteralImplInteger)&&(__CLR4_5_263s63slviclg24.R.iget(7966)!=0|true))||(__CLR4_5_263s63slviclg24.R.iget(7967)==0&false))) {{
            __CLR4_5_263s63slviclg24.R.inc(7968);OWLLiteralImplInteger other = (OWLLiteralImplInteger) obj;
            __CLR4_5_263s63slviclg24.R.inc(7969);return literal == other.literal;
        }
        }__CLR4_5_263s63slviclg24.R.inc(7970);if ((((obj instanceof OWLLiteral)&&(__CLR4_5_263s63slviclg24.R.iget(7971)!=0|true))||(__CLR4_5_263s63slviclg24.R.iget(7972)==0&false))) {{
            __CLR4_5_263s63slviclg24.R.inc(7973);return ((OWLLiteral) obj).isInteger() && ((OWLLiteral) obj).getLiteral().charAt(0) != '0'
                && literal == ((OWLLiteral) obj).parseInteger();
        }
        }__CLR4_5_263s63slviclg24.R.inc(7974);return false;
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public void accept(OWLDataVisitor visitor) {try{__CLR4_5_263s63slviclg24.R.inc(7975);
        __CLR4_5_263s63slviclg24.R.inc(7976);visitor.visit(this);
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataVisitorEx<O> visitor) {try{__CLR4_5_263s63slviclg24.R.inc(7977);
        __CLR4_5_263s63slviclg24.R.inc(7978);return visitor.visit(this);
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public void accept(OWLAnnotationValueVisitor visitor) {try{__CLR4_5_263s63slviclg24.R.inc(7979);
        __CLR4_5_263s63slviclg24.R.inc(7980);visitor.visit(this);
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAnnotationValueVisitorEx<O> visitor) {try{__CLR4_5_263s63slviclg24.R.inc(7981);
        __CLR4_5_263s63slviclg24.R.inc(7982);return visitor.visit(this);
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_263s63slviclg24.R.inc(7983);
        __CLR4_5_263s63slviclg24.R.inc(7984);OWLLiteral other = (OWLLiteral) object;
        __CLR4_5_263s63slviclg24.R.inc(7985);int diff = getLiteral().compareTo(other.getLiteral());
        __CLR4_5_263s63slviclg24.R.inc(7986);if ((((diff != 0)&&(__CLR4_5_263s63slviclg24.R.iget(7987)!=0|true))||(__CLR4_5_263s63slviclg24.R.iget(7988)==0&false))) {{
            __CLR4_5_263s63slviclg24.R.inc(7989);return diff;
        }
        }__CLR4_5_263s63slviclg24.R.inc(7990);int compareTo = datatype.compareTo(other.getDatatype());
        __CLR4_5_263s63slviclg24.R.inc(7991);if ((((compareTo != 0)&&(__CLR4_5_263s63slviclg24.R.iget(7992)!=0|true))||(__CLR4_5_263s63slviclg24.R.iget(7993)==0&false))) {{
            __CLR4_5_263s63slviclg24.R.inc(7994);return compareTo;
        }
        }__CLR4_5_263s63slviclg24.R.inc(7995);return Integer.compare(literal, other.parseInteger());
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_263s63slviclg24.R.inc(7996);
        __CLR4_5_263s63slviclg24.R.inc(7997);visitor.visit(this);
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_263s63slviclg24.R.inc(7998);
        __CLR4_5_263s63slviclg24.R.inc(7999);return visitor.visit(this);
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public Optional<IRI> asIRI() {try{__CLR4_5_263s63slviclg24.R.inc(8000);
        __CLR4_5_263s63slviclg24.R.inc(8001);return Optional.absent();
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public Optional<OWLAnonymousIndividual> asAnonymousIndividual() {try{__CLR4_5_263s63slviclg24.R.inc(8002);
        __CLR4_5_263s63slviclg24.R.inc(8003);return Optional.absent();
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}

    @Override
    public Optional<OWLLiteral> asLiteral() {try{__CLR4_5_263s63slviclg24.R.inc(8004);
        __CLR4_5_263s63slviclg24.R.inc(8005);return Optional.<OWLLiteral> of(this);
    }finally{__CLR4_5_263s63slviclg24.R.flushNeeded();}}
}
