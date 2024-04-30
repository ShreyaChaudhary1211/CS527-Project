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
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import com.google.common.base.Optional;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLLiteralImplNoCompression extends OWLObjectImplWithoutEntityAndAnonCaching implements OWLLiteral {public static class __CLR4_5_266e66elviclg33{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,8167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private static final OWLDatatype RDF_PLAIN_LITERAL = new OWL2DatatypeImpl(OWL2Datatype.RDF_PLAIN_LITERAL);
    @Nonnull
    private final String literal;
    @Nonnull
    private final OWLDatatype datatype;
    @Nonnull
    private final String language;

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_266e66elviclg33.R.inc(8006);
        __CLR4_5_266e66elviclg33.R.inc(8007);entities.add(datatype);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_266e66elviclg33.R.inc(8008);}finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    protected int index() {try{__CLR4_5_266e66elviclg33.R.inc(8009);
        __CLR4_5_266e66elviclg33.R.inc(8010);return OWLObjectTypeIndexProvider.DATA_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    /**
     * @param literal
     *        actual literal form
     * @param lang
     *        language for literal, can be null
     * @param datatype
     *        datatype for literal
     */
    public OWLLiteralImplNoCompression(@Nonnull String literal, @Nullable String lang, @Nullable OWLDatatype datatype) {try{__CLR4_5_266e66elviclg33.R.inc(8011);
        __CLR4_5_266e66elviclg33.R.inc(8012);this.literal = literal;
        __CLR4_5_266e66elviclg33.R.inc(8013);if ((((lang == null || lang.isEmpty())&&(__CLR4_5_266e66elviclg33.R.iget(8014)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8015)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8016);language = "";
            __CLR4_5_266e66elviclg33.R.inc(8017);if ((((datatype == null)&&(__CLR4_5_266e66elviclg33.R.iget(8018)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8019)==0&false))) {{
                __CLR4_5_266e66elviclg33.R.inc(8020);this.datatype = RDF_PLAIN_LITERAL;
            } }else {{
                __CLR4_5_266e66elviclg33.R.inc(8021);this.datatype = datatype;
            }
        }} }else {{
            __CLR4_5_266e66elviclg33.R.inc(8022);if ((((datatype != null && !datatype.isRDFPlainLiteral())&&(__CLR4_5_266e66elviclg33.R.iget(8023)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8024)==0&false))) {{
                // ERROR: attempting to build a literal with a language tag and
                // type different from plain literal
                __CLR4_5_266e66elviclg33.R.inc(8025);throw new OWLRuntimeException("Error: cannot build a literal with type: " + datatype.getIRI()
                    + " and language: " + lang);
            }
            }__CLR4_5_266e66elviclg33.R.inc(8026);language = lang;
            __CLR4_5_266e66elviclg33.R.inc(8027);this.datatype = RDF_PLAIN_LITERAL;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8028);hashCode = getHashCode();
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Nonnull
    @Override
    public String getLiteral() {try{__CLR4_5_266e66elviclg33.R.inc(8029);
        __CLR4_5_266e66elviclg33.R.inc(8030);return literal;
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public boolean isRDFPlainLiteral() {try{__CLR4_5_266e66elviclg33.R.inc(8031);
        __CLR4_5_266e66elviclg33.R.inc(8032);return datatype.getIRI().equals(OWL2Datatype.RDF_PLAIN_LITERAL.getIRI());
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public boolean hasLang() {try{__CLR4_5_266e66elviclg33.R.inc(8033);
        __CLR4_5_266e66elviclg33.R.inc(8034);return !language.isEmpty();
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public boolean isInteger() {try{__CLR4_5_266e66elviclg33.R.inc(8035);
        __CLR4_5_266e66elviclg33.R.inc(8036);return datatype.getIRI().equals(OWL2Datatype.XSD_INTEGER.getIRI());
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public int parseInteger() {try{__CLR4_5_266e66elviclg33.R.inc(8037);
        __CLR4_5_266e66elviclg33.R.inc(8038);return Integer.parseInt(getLiteral());
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public boolean isBoolean() {try{__CLR4_5_266e66elviclg33.R.inc(8039);
        __CLR4_5_266e66elviclg33.R.inc(8040);return datatype.getIRI().equals(OWL2Datatype.XSD_BOOLEAN.getIRI());
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public boolean parseBoolean() {try{__CLR4_5_266e66elviclg33.R.inc(8041);
        __CLR4_5_266e66elviclg33.R.inc(8042);if ((((literal.equals("0"))&&(__CLR4_5_266e66elviclg33.R.iget(8043)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8044)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8045);return false;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8046);if ((((literal.equals("1"))&&(__CLR4_5_266e66elviclg33.R.iget(8047)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8048)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8049);return true;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8050);if ((((literal.equals("true"))&&(__CLR4_5_266e66elviclg33.R.iget(8051)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8052)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8053);return true;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8054);if ((((literal.equals("false"))&&(__CLR4_5_266e66elviclg33.R.iget(8055)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8056)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8057);return false;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8058);return Boolean.parseBoolean(literal);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public boolean isDouble() {try{__CLR4_5_266e66elviclg33.R.inc(8059);
        __CLR4_5_266e66elviclg33.R.inc(8060);return datatype.getIRI().equals(OWL2Datatype.XSD_DOUBLE.getIRI());
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public double parseDouble() {try{__CLR4_5_266e66elviclg33.R.inc(8061);
        __CLR4_5_266e66elviclg33.R.inc(8062);return Double.parseDouble(literal);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public boolean isFloat() {try{__CLR4_5_266e66elviclg33.R.inc(8063);
        __CLR4_5_266e66elviclg33.R.inc(8064);return datatype.getIRI().equals(OWL2Datatype.XSD_FLOAT.getIRI());
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public float parseFloat() {try{__CLR4_5_266e66elviclg33.R.inc(8065);
        __CLR4_5_266e66elviclg33.R.inc(8066);if (((("inf".equalsIgnoreCase(literal))&&(__CLR4_5_266e66elviclg33.R.iget(8067)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8068)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8069);return Float.POSITIVE_INFINITY;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8070);if (((("-inf".equalsIgnoreCase(literal))&&(__CLR4_5_266e66elviclg33.R.iget(8071)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8072)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8073);return Float.NEGATIVE_INFINITY;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8074);return Float.parseFloat(literal);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Nonnull
    @Override
    public String getLang() {try{__CLR4_5_266e66elviclg33.R.inc(8075);
        __CLR4_5_266e66elviclg33.R.inc(8076);return language;
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public boolean hasLang(@Nullable String lang) {try{__CLR4_5_266e66elviclg33.R.inc(8077);
        __CLR4_5_266e66elviclg33.R.inc(8078);if ((((lang == null)&&(__CLR4_5_266e66elviclg33.R.iget(8079)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8080)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8081);return language.isEmpty();
        }
        }__CLR4_5_266e66elviclg33.R.inc(8082);return language.equalsIgnoreCase(lang.trim());
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDatatype getDatatype() {try{__CLR4_5_266e66elviclg33.R.inc(8083);
        __CLR4_5_266e66elviclg33.R.inc(8084);return datatype;
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_266e66elviclg33.R.inc(8085);
        __CLR4_5_266e66elviclg33.R.inc(8086);return hashCode;
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    private final int getHashCode() {try{__CLR4_5_266e66elviclg33.R.inc(8087);
        __CLR4_5_266e66elviclg33.R.inc(8088);int code = 277;
        __CLR4_5_266e66elviclg33.R.inc(8089);code = code * 37 + getDatatype().hashCode();
        __CLR4_5_266e66elviclg33.R.inc(8090);code *= 37;
        __CLR4_5_266e66elviclg33.R.inc(8091);try {
            __CLR4_5_266e66elviclg33.R.inc(8092);if ((((isInteger())&&(__CLR4_5_266e66elviclg33.R.iget(8093)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8094)==0&false))) {{
                __CLR4_5_266e66elviclg33.R.inc(8095);code += parseInteger() * 65536;
            } }else {__CLR4_5_266e66elviclg33.R.inc(8096);if ((((isDouble())&&(__CLR4_5_266e66elviclg33.R.iget(8097)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8098)==0&false))) {{
                __CLR4_5_266e66elviclg33.R.inc(8099);code += (int) parseDouble() * 65536;
            } }else {__CLR4_5_266e66elviclg33.R.inc(8100);if ((((isFloat())&&(__CLR4_5_266e66elviclg33.R.iget(8101)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8102)==0&false))) {{
                __CLR4_5_266e66elviclg33.R.inc(8103);code += (int) parseFloat() * 65536;
            } }else {__CLR4_5_266e66elviclg33.R.inc(8104);if ((((isBoolean())&&(__CLR4_5_266e66elviclg33.R.iget(8105)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8106)==0&false))) {{
                __CLR4_5_266e66elviclg33.R.inc(8107);code += (((parseBoolean() )&&(__CLR4_5_266e66elviclg33.R.iget(8108)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8109)==0&false))? 65536 : 0;
            } }else {{
                __CLR4_5_266e66elviclg33.R.inc(8110);code += getLiteral().hashCode() * 65536;
            }
        }}}}} catch (NumberFormatException e) {
            // it is possible that a literal does not have a value that's valid
            // for its datatype; not very useful for a consistent ontology but
            // some W3C reasoner tests use them
            __CLR4_5_266e66elviclg33.R.inc(8111);code += getLiteral().hashCode() * 65536;
        }
        __CLR4_5_266e66elviclg33.R.inc(8112);if ((((hasLang())&&(__CLR4_5_266e66elviclg33.R.iget(8113)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8114)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8115);code = code * 37 + getLang().hashCode();
        }
        }__CLR4_5_266e66elviclg33.R.inc(8116);return code;
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_266e66elviclg33.R.inc(8117);
        __CLR4_5_266e66elviclg33.R.inc(8118);if ((((this == obj)&&(__CLR4_5_266e66elviclg33.R.iget(8119)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8120)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8121);return true;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8122);if ((((!super.equals(obj))&&(__CLR4_5_266e66elviclg33.R.iget(8123)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8124)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8125);return false;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8126);if ((((!(obj instanceof OWLLiteral))&&(__CLR4_5_266e66elviclg33.R.iget(8127)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8128)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8129);return false;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8130);OWLLiteral other = (OWLLiteral) obj;
        __CLR4_5_266e66elviclg33.R.inc(8131);if ((((other instanceof OWLLiteralImplNoCompression)&&(__CLR4_5_266e66elviclg33.R.iget(8132)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8133)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8134);return literal.equals(((OWLLiteralImplNoCompression) other).literal) && datatype.equals(other.getDatatype())
                && language.equals(other.getLang());
        }
        }__CLR4_5_266e66elviclg33.R.inc(8135);return literal.equals(other.getLiteral()) && datatype.equals(other.getDatatype()) && language.equals(other
            .getLang());
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLDataVisitor visitor) {try{__CLR4_5_266e66elviclg33.R.inc(8136);
        __CLR4_5_266e66elviclg33.R.inc(8137);visitor.visit(this);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Nonnull
    @Override
    public <O> O accept(@Nonnull OWLDataVisitorEx<O> visitor) {try{__CLR4_5_266e66elviclg33.R.inc(8138);
        __CLR4_5_266e66elviclg33.R.inc(8139);return visitor.visit(this);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLAnnotationValueVisitor visitor) {try{__CLR4_5_266e66elviclg33.R.inc(8140);
        __CLR4_5_266e66elviclg33.R.inc(8141);visitor.visit(this);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Nonnull
    @Override
    public <O> O accept(@Nonnull OWLAnnotationValueVisitorEx<O> visitor) {try{__CLR4_5_266e66elviclg33.R.inc(8142);
        __CLR4_5_266e66elviclg33.R.inc(8143);return visitor.visit(this);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(@Nonnull OWLObject object) {try{__CLR4_5_266e66elviclg33.R.inc(8144);
        __CLR4_5_266e66elviclg33.R.inc(8145);OWLLiteral other = (OWLLiteral) object;
        __CLR4_5_266e66elviclg33.R.inc(8146);int diff = literal.compareTo(other.getLiteral());
        __CLR4_5_266e66elviclg33.R.inc(8147);if ((((diff != 0)&&(__CLR4_5_266e66elviclg33.R.iget(8148)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8149)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8150);return diff;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8151);diff = datatype.compareTo(other.getDatatype());
        __CLR4_5_266e66elviclg33.R.inc(8152);if ((((diff != 0)&&(__CLR4_5_266e66elviclg33.R.iget(8153)!=0|true))||(__CLR4_5_266e66elviclg33.R.iget(8154)==0&false))) {{
            __CLR4_5_266e66elviclg33.R.inc(8155);return diff;
        }
        }__CLR4_5_266e66elviclg33.R.inc(8156);return language.compareTo(other.getLang());
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLObjectVisitor visitor) {try{__CLR4_5_266e66elviclg33.R.inc(8157);
        __CLR4_5_266e66elviclg33.R.inc(8158);visitor.visit(this);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Nonnull
    @Override
    public <O> O accept(@Nonnull OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_266e66elviclg33.R.inc(8159);
        __CLR4_5_266e66elviclg33.R.inc(8160);return visitor.visit(this);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public Optional<IRI> asIRI() {try{__CLR4_5_266e66elviclg33.R.inc(8161);
        __CLR4_5_266e66elviclg33.R.inc(8162);return Optional.absent();
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public Optional<OWLAnonymousIndividual> asAnonymousIndividual() {try{__CLR4_5_266e66elviclg33.R.inc(8163);
        __CLR4_5_266e66elviclg33.R.inc(8164);return Optional.absent();
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}

    @Override
    public Optional<OWLLiteral> asLiteral() {try{__CLR4_5_266e66elviclg33.R.inc(8165);
        __CLR4_5_266e66elviclg33.R.inc(8166);return Optional.<OWLLiteral> of(this);
    }finally{__CLR4_5_266e66elviclg33.R.flushNeeded();}}
}
