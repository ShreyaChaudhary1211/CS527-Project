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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.io.*;
import java.util.Arrays;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import com.google.common.base.Optional;

/**
 * Implementation of {@link OWLLiteral} that uses compression of strings. See
 * also {@link OWLLiteralImplNoCompression}
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLLiteralImpl extends OWLObjectImplWithoutEntityAndAnonCaching implements OWLLiteral {public static class __CLR4_5_25r35r3lviclfw3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,7628,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private static final int COMPRESSION_LIMIT = 160;
    private final LiteralWrapper literal;
    @Nonnull
    private static final OWLDatatype RDF_PLAIN_LITERAL = new OWL2DatatypeImpl(OWL2Datatype.RDF_PLAIN_LITERAL);
    @Nonnull
    private final OWLDatatype datatype;
    @Nonnull
    private final String language;
    private final int hashcode;

    @Override
    protected int index() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7455);
        __CLR4_5_25r35r3lviclfw3.R.inc(7456);return OWLObjectTypeIndexProvider.DATA_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    /**
     * @param literal
     *        the lexical form
     * @param lang
     *        the language; can be null or an empty string, in which case
     *        datatype can be any datatype but not null
     * @param datatype
     *        the datatype; if lang is null or the empty string, it can be null
     *        or it MUST be RDFPlainLiteral
     */
    public OWLLiteralImpl(@Nonnull String literal, @Nullable String lang, @Nullable OWLDatatype datatype) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7457);
        __CLR4_5_25r35r3lviclfw3.R.inc(7458);this.literal = new LiteralWrapper(checkNotNull(literal, "literal cannot be null"));
        __CLR4_5_25r35r3lviclfw3.R.inc(7459);if ((((lang == null || lang.isEmpty())&&(__CLR4_5_25r35r3lviclfw3.R.iget(7460)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7461)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7462);language = "";
            __CLR4_5_25r35r3lviclfw3.R.inc(7463);if ((((datatype == null)&&(__CLR4_5_25r35r3lviclfw3.R.iget(7464)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7465)==0&false))) {{
                __CLR4_5_25r35r3lviclfw3.R.inc(7466);this.datatype = RDF_PLAIN_LITERAL;
            } }else {{
                __CLR4_5_25r35r3lviclfw3.R.inc(7467);this.datatype = datatype;
            }
        }} }else {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7468);if ((((datatype != null && !datatype.isRDFPlainLiteral())&&(__CLR4_5_25r35r3lviclfw3.R.iget(7469)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7470)==0&false))) {{
                // ERROR: attempting to build a literal with a language tag and
                // type different from plain literal
                __CLR4_5_25r35r3lviclfw3.R.inc(7471);throw new OWLRuntimeException("Error: cannot build a literal with type: " + datatype.getIRI()
                    + " and language: " + lang);
            }
            }__CLR4_5_25r35r3lviclfw3.R.inc(7472);language = lang;
            __CLR4_5_25r35r3lviclfw3.R.inc(7473);this.datatype = RDF_PLAIN_LITERAL;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7474);hashcode = getHashCode();
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7475);
        __CLR4_5_25r35r3lviclfw3.R.inc(7476);entities.add(datatype);
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7477);}finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public String getLiteral() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7478);
        __CLR4_5_25r35r3lviclfw3.R.inc(7479);return literal.get();
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public boolean isRDFPlainLiteral() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7480);
        __CLR4_5_25r35r3lviclfw3.R.inc(7481);return datatype.getIRI().equals(OWL2Datatype.RDF_PLAIN_LITERAL.getIRI());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public boolean hasLang() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7482);
        __CLR4_5_25r35r3lviclfw3.R.inc(7483);return !language.isEmpty();
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public boolean isInteger() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7484);
        __CLR4_5_25r35r3lviclfw3.R.inc(7485);return datatype.getIRI().equals(OWL2Datatype.XSD_INTEGER.getIRI());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public int parseInteger() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7486);
        __CLR4_5_25r35r3lviclfw3.R.inc(7487);return Integer.parseInt(literal.get());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public boolean isBoolean() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7488);
        __CLR4_5_25r35r3lviclfw3.R.inc(7489);return datatype.getIRI().equals(OWL2Datatype.XSD_BOOLEAN.getIRI());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public boolean parseBoolean() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7490);
        __CLR4_5_25r35r3lviclfw3.R.inc(7491);if ((((literal.get().equals("0"))&&(__CLR4_5_25r35r3lviclfw3.R.iget(7492)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7493)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7494);return false;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7495);if ((((literal.get().equals("1"))&&(__CLR4_5_25r35r3lviclfw3.R.iget(7496)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7497)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7498);return true;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7499);if ((((literal.get().equals("true"))&&(__CLR4_5_25r35r3lviclfw3.R.iget(7500)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7501)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7502);return true;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7503);if ((((literal.get().equals("false"))&&(__CLR4_5_25r35r3lviclfw3.R.iget(7504)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7505)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7506);return false;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7507);return false;
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public boolean isDouble() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7508);
        __CLR4_5_25r35r3lviclfw3.R.inc(7509);return datatype.getIRI().equals(OWL2Datatype.XSD_DOUBLE.getIRI());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public double parseDouble() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7510);
        __CLR4_5_25r35r3lviclfw3.R.inc(7511);return Double.parseDouble(literal.get());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public boolean isFloat() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7512);
        __CLR4_5_25r35r3lviclfw3.R.inc(7513);return datatype.getIRI().equals(OWL2Datatype.XSD_FLOAT.getIRI());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public float parseFloat() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7514);
        __CLR4_5_25r35r3lviclfw3.R.inc(7515);return Float.parseFloat(literal.get());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public String getLang() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7516);
        __CLR4_5_25r35r3lviclfw3.R.inc(7517);return language;
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public boolean hasLang(String lang) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7518);
        __CLR4_5_25r35r3lviclfw3.R.inc(7519);if ((((lang == null)&&(__CLR4_5_25r35r3lviclfw3.R.iget(7520)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7521)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7522);return language.isEmpty();
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7523);return language.equalsIgnoreCase(lang.trim());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public OWLDatatype getDatatype() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7524);
        __CLR4_5_25r35r3lviclfw3.R.inc(7525);return datatype;
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7526);
        __CLR4_5_25r35r3lviclfw3.R.inc(7527);return hashcode;
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    private final int getHashCode() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7528);
        __CLR4_5_25r35r3lviclfw3.R.inc(7529);int code = 277;
        __CLR4_5_25r35r3lviclfw3.R.inc(7530);code = code * 37 + getDatatype().hashCode();
        __CLR4_5_25r35r3lviclfw3.R.inc(7531);code *= 37;
        __CLR4_5_25r35r3lviclfw3.R.inc(7532);if ((((literal.l != null)&&(__CLR4_5_25r35r3lviclfw3.R.iget(7533)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7534)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7535);code += literal.l.hashCode();
        } }else {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7536);code += Arrays.hashCode(literal.bytes);
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7537);if ((((hasLang())&&(__CLR4_5_25r35r3lviclfw3.R.iget(7538)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7539)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7540);code = code * 37 + getLang().hashCode();
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7541);return code;
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7542);
        __CLR4_5_25r35r3lviclfw3.R.inc(7543);if ((((this == obj)&&(__CLR4_5_25r35r3lviclfw3.R.iget(7544)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7545)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7546);return true;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7547);if ((((!super.equals(obj))&&(__CLR4_5_25r35r3lviclfw3.R.iget(7548)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7549)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7550);return false;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7551);if ((((!(obj instanceof OWLLiteral))&&(__CLR4_5_25r35r3lviclfw3.R.iget(7552)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7553)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7554);return false;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7555);OWLLiteral other = (OWLLiteral) obj;
        __CLR4_5_25r35r3lviclfw3.R.inc(7556);return literal.get().equals(other.getLiteral()) && datatype.equals(other.getDatatype()) && language.equals(other
            .getLang());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public void accept(OWLDataVisitor visitor) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7557);
        __CLR4_5_25r35r3lviclfw3.R.inc(7558);visitor.visit(this);
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataVisitorEx<O> visitor) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7559);
        __CLR4_5_25r35r3lviclfw3.R.inc(7560);return visitor.visit(this);
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public void accept(OWLAnnotationValueVisitor visitor) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7561);
        __CLR4_5_25r35r3lviclfw3.R.inc(7562);visitor.visit(this);
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAnnotationValueVisitorEx<O> visitor) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7563);
        __CLR4_5_25r35r3lviclfw3.R.inc(7564);return visitor.visit(this);
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7565);
        __CLR4_5_25r35r3lviclfw3.R.inc(7566);OWLLiteral other = (OWLLiteral) object;
        __CLR4_5_25r35r3lviclfw3.R.inc(7567);int diff = literal.get().compareTo(other.getLiteral());
        __CLR4_5_25r35r3lviclfw3.R.inc(7568);if ((((diff != 0)&&(__CLR4_5_25r35r3lviclfw3.R.iget(7569)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7570)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7571);return diff;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7572);diff = datatype.compareTo(other.getDatatype());
        __CLR4_5_25r35r3lviclfw3.R.inc(7573);if ((((diff != 0)&&(__CLR4_5_25r35r3lviclfw3.R.iget(7574)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7575)==0&false))) {{
            __CLR4_5_25r35r3lviclfw3.R.inc(7576);return diff;
        }
        }__CLR4_5_25r35r3lviclfw3.R.inc(7577);return language.compareTo(other.getLang());
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7578);
        __CLR4_5_25r35r3lviclfw3.R.inc(7579);visitor.visit(this);
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7580);
        __CLR4_5_25r35r3lviclfw3.R.inc(7581);return visitor.visit(this);
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public Optional<IRI> asIRI() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7582);
        __CLR4_5_25r35r3lviclfw3.R.inc(7583);return Optional.absent();
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public Optional<OWLAnonymousIndividual> asAnonymousIndividual() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7584);
        __CLR4_5_25r35r3lviclfw3.R.inc(7585);return Optional.absent();
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    @Override
    public Optional<OWLLiteral> asLiteral() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7586);
        __CLR4_5_25r35r3lviclfw3.R.inc(7587);return Optional.<OWLLiteral> of(this);
    }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

    // Literal Wrapper
    private static class LiteralWrapper implements Serializable {

        private static final long serialVersionUID = 40000L;
        String l;
        byte[] bytes;

        LiteralWrapper(String s) {try{__CLR4_5_25r35r3lviclfw3.R.inc(7588);
            __CLR4_5_25r35r3lviclfw3.R.inc(7589);if ((((s.length() > COMPRESSION_LIMIT)&&(__CLR4_5_25r35r3lviclfw3.R.iget(7590)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7591)==0&false))) {{
                __CLR4_5_25r35r3lviclfw3.R.inc(7592);try {
                    __CLR4_5_25r35r3lviclfw3.R.inc(7593);bytes = compress(s);
                    __CLR4_5_25r35r3lviclfw3.R.inc(7594);l = null;
                } catch (IOException e) {
                    // some problem happened - defaulting to no compression
                    __CLR4_5_25r35r3lviclfw3.R.inc(7595);l = s;
                    __CLR4_5_25r35r3lviclfw3.R.inc(7596);bytes = null;
                }
            } }else {{
                __CLR4_5_25r35r3lviclfw3.R.inc(7597);bytes = null;
                __CLR4_5_25r35r3lviclfw3.R.inc(7598);l = s;
            }
        }}finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

        @Nonnull
        String get() {try{__CLR4_5_25r35r3lviclfw3.R.inc(7599);
            __CLR4_5_25r35r3lviclfw3.R.inc(7600);if ((((l != null)&&(__CLR4_5_25r35r3lviclfw3.R.iget(7601)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7602)==0&false))) {{
                __CLR4_5_25r35r3lviclfw3.R.inc(7603);return verifyNotNull(l);
            }
            }__CLR4_5_25r35r3lviclfw3.R.inc(7604);try {
                __CLR4_5_25r35r3lviclfw3.R.inc(7605);return decompress(bytes);
            } catch (IOException e) {
                // some problem has happened - cannot recover from this
                __CLR4_5_25r35r3lviclfw3.R.inc(7606);throw new OWLRuntimeException(e);
            }
        }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

        @Nonnull
        static byte[] compress(String s) throws IOException {try{__CLR4_5_25r35r3lviclfw3.R.inc(7607);
            __CLR4_5_25r35r3lviclfw3.R.inc(7608);ByteArrayOutputStream out = new ByteArrayOutputStream();
            __CLR4_5_25r35r3lviclfw3.R.inc(7609);GZIPOutputStream zipout = new GZIPOutputStream(out);
            __CLR4_5_25r35r3lviclfw3.R.inc(7610);Writer writer = new OutputStreamWriter(zipout, COMPRESSED_ENCODING);
            __CLR4_5_25r35r3lviclfw3.R.inc(7611);writer.write(s);
            __CLR4_5_25r35r3lviclfw3.R.inc(7612);writer.flush();
            __CLR4_5_25r35r3lviclfw3.R.inc(7613);zipout.finish();
            __CLR4_5_25r35r3lviclfw3.R.inc(7614);zipout.flush();
            __CLR4_5_25r35r3lviclfw3.R.inc(7615);return out.toByteArray();
        }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

        @Nonnull
        static String decompress(byte[] result) throws IOException {try{__CLR4_5_25r35r3lviclfw3.R.inc(7616);
            __CLR4_5_25r35r3lviclfw3.R.inc(7617);ByteArrayInputStream in = new ByteArrayInputStream(result);
            __CLR4_5_25r35r3lviclfw3.R.inc(7618);GZIPInputStream zipin = new GZIPInputStream(in);
            __CLR4_5_25r35r3lviclfw3.R.inc(7619);Reader reader = new InputStreamReader(zipin, COMPRESSED_ENCODING);
            __CLR4_5_25r35r3lviclfw3.R.inc(7620);StringBuilder b = new StringBuilder();
            __CLR4_5_25r35r3lviclfw3.R.inc(7621);int c = reader.read();
            __CLR4_5_25r35r3lviclfw3.R.inc(7622);while ((((c > -1)&&(__CLR4_5_25r35r3lviclfw3.R.iget(7623)!=0|true))||(__CLR4_5_25r35r3lviclfw3.R.iget(7624)==0&false))) {{
                __CLR4_5_25r35r3lviclfw3.R.inc(7625);b.append((char) c);
                __CLR4_5_25r35r3lviclfw3.R.inc(7626);c = reader.read();
            }
            }__CLR4_5_25r35r3lviclfw3.R.inc(7627);return b.toString();
        }finally{__CLR4_5_25r35r3lviclfw3.R.flushNeeded();}}

        private static final String COMPRESSED_ENCODING = "UTF-16";
    }
}
