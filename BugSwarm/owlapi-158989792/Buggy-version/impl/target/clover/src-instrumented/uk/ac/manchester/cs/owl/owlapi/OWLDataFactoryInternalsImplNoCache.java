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

import static org.semanticweb.owlapi.vocab.OWL2Datatype.*;

import java.io.Serializable;
import java.util.Locale;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.XSDVocabulary;

/** no cache used @author ignazio */
public class OWLDataFactoryInternalsImplNoCache implements OWLDataFactoryInternals, Serializable {public static class __CLR4_5_23ma3malviclfmf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,4817,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private static final OWLDatatype PLAIN = new OWL2DatatypeImpl(
        RDF_PLAIN_LITERAL);
    @Nonnull
    private static final OWLDatatype XSDBOOLEAN = new OWL2DatatypeImpl(
        XSD_BOOLEAN);
    @Nonnull
    private static final OWLDatatype XSDDOUBLE = new OWL2DatatypeImpl(
        XSD_DOUBLE);
    @Nonnull
    private static final OWLDatatype XSDFLOAT = new OWL2DatatypeImpl(XSD_FLOAT);
    @Nonnull
    private static final OWLDatatype XSDINTEGER = new OWL2DatatypeImpl(
        XSD_INTEGER);
    @Nonnull
    private static final OWLDatatype RDFSLITERAL = new OWL2DatatypeImpl(
        RDFS_LITERAL);
    @Nonnull
    private static final OWLLiteral TRUELITERAL = new OWLLiteralImplBoolean(
        true, XSDBOOLEAN);
    @Nonnull
    private static final OWLLiteral FALSELITERAL = new OWLLiteralImplBoolean(
        false, XSDBOOLEAN);
    @Nullable
    private OWLLiteral negativeFloatZero;
    private final boolean useCompression;

    /**
     * @param useCompression
     *        true if compression of literals should be used
     */
    public OWLDataFactoryInternalsImplNoCache(boolean useCompression) {try{__CLR4_5_23ma3malviclfmf.R.inc(4690);
        __CLR4_5_23ma3malviclfmf.R.inc(4691);this.useCompression = useCompression;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public void purge() {try{__CLR4_5_23ma3malviclfmf.R.inc(4692);}finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLClass getOWLClass(IRI iri) {try{__CLR4_5_23ma3malviclfmf.R.inc(4693);
        __CLR4_5_23ma3malviclfmf.R.inc(4694);return new OWLClassImpl(iri);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLObjectProperty getOWLObjectProperty(IRI iri) {try{__CLR4_5_23ma3malviclfmf.R.inc(4695);
        __CLR4_5_23ma3malviclfmf.R.inc(4696);return new OWLObjectPropertyImpl(iri);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLDataProperty getOWLDataProperty(IRI iri) {try{__CLR4_5_23ma3malviclfmf.R.inc(4697);
        __CLR4_5_23ma3malviclfmf.R.inc(4698);return new OWLDataPropertyImpl(iri);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLNamedIndividual getOWLNamedIndividual(IRI iri) {try{__CLR4_5_23ma3malviclfmf.R.inc(4699);
        __CLR4_5_23ma3malviclfmf.R.inc(4700);return new OWLNamedIndividualImpl(iri);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLDatatype getOWLDatatype(IRI iri) {try{__CLR4_5_23ma3malviclfmf.R.inc(4701);
        __CLR4_5_23ma3malviclfmf.R.inc(4702);return new OWLDatatypeImpl(iri);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLAnnotationProperty getOWLAnnotationProperty(IRI iri) {try{__CLR4_5_23ma3malviclfmf.R.inc(4703);
        __CLR4_5_23ma3malviclfmf.R.inc(4704);return new OWLAnnotationPropertyImpl(iri);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(float value) {try{__CLR4_5_23ma3malviclfmf.R.inc(4705);
        __CLR4_5_23ma3malviclfmf.R.inc(4706);return new OWLLiteralImplFloat(value, getFloatOWLDatatype());
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(@Nonnull String value) {try{__CLR4_5_23ma3malviclfmf.R.inc(4707);
        __CLR4_5_23ma3malviclfmf.R.inc(4708);if ((((useCompression)&&(__CLR4_5_23ma3malviclfmf.R.iget(4709)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4710)==0&false))) {{
            __CLR4_5_23ma3malviclfmf.R.inc(4711);return new OWLLiteralImpl(value, "",
                getOWLDatatype(XSDVocabulary.STRING.getIRI()));
        }
        }__CLR4_5_23ma3malviclfmf.R.inc(4712);return new OWLLiteralImplString(value);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(String literal, @Nullable String lang) {try{__CLR4_5_23ma3malviclfmf.R.inc(4713);
        __CLR4_5_23ma3malviclfmf.R.inc(4714);String normalisedLang;
        __CLR4_5_23ma3malviclfmf.R.inc(4715);if ((((lang == null)&&(__CLR4_5_23ma3malviclfmf.R.iget(4716)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4717)==0&false))) {{
            __CLR4_5_23ma3malviclfmf.R.inc(4718);normalisedLang = "";
        } }else {{
            __CLR4_5_23ma3malviclfmf.R.inc(4719);normalisedLang = lang.trim().toLowerCase(Locale.ENGLISH);
        }
        }__CLR4_5_23ma3malviclfmf.R.inc(4720);if ((((useCompression)&&(__CLR4_5_23ma3malviclfmf.R.iget(4721)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4722)==0&false))) {{
            __CLR4_5_23ma3malviclfmf.R.inc(4723);return new OWLLiteralImpl(literal, normalisedLang, null);
        }
        }__CLR4_5_23ma3malviclfmf.R.inc(4724);return new OWLLiteralImplPlain(literal, normalisedLang);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(int value) {try{__CLR4_5_23ma3malviclfmf.R.inc(4725);
        __CLR4_5_23ma3malviclfmf.R.inc(4726);return new OWLLiteralImplInteger(value, getIntegerOWLDatatype());
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(boolean value) {try{__CLR4_5_23ma3malviclfmf.R.inc(4727);
        __CLR4_5_23ma3malviclfmf.R.inc(4728);return (((value )&&(__CLR4_5_23ma3malviclfmf.R.iget(4729)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4730)==0&false))? TRUELITERAL : FALSELITERAL;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLLiteral getOWLLiteral(double value) {try{__CLR4_5_23ma3malviclfmf.R.inc(4731);
        __CLR4_5_23ma3malviclfmf.R.inc(4732);return new OWLLiteralImplDouble(value, getDoubleOWLDatatype());
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @SuppressWarnings("null")
    @Override
    public OWLLiteral getOWLLiteral(@Nonnull String lexicalValue,
        @Nonnull OWLDatatype datatype) {try{__CLR4_5_23ma3malviclfmf.R.inc(4733);
        __CLR4_5_23ma3malviclfmf.R.inc(4734);OWLLiteral literal;
        __CLR4_5_23ma3malviclfmf.R.inc(4735);if ((((datatype.isRDFPlainLiteral())&&(__CLR4_5_23ma3malviclfmf.R.iget(4736)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4737)==0&false))) {{
            __CLR4_5_23ma3malviclfmf.R.inc(4738);int sep = lexicalValue.lastIndexOf('@');
            __CLR4_5_23ma3malviclfmf.R.inc(4739);if ((((sep != -1)&&(__CLR4_5_23ma3malviclfmf.R.iget(4740)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4741)==0&false))) {{
                __CLR4_5_23ma3malviclfmf.R.inc(4742);String lex = lexicalValue.substring(0, sep);
                __CLR4_5_23ma3malviclfmf.R.inc(4743);String lang = lexicalValue.substring(sep + 1);
                __CLR4_5_23ma3malviclfmf.R.inc(4744);literal = getBasicLiteral(lex, lang, getRDFPlainLiteral());
            } }else {{
                __CLR4_5_23ma3malviclfmf.R.inc(4745);literal = getBasicLiteral(lexicalValue, datatype);
            }
        }} }else {{
            // check the special cases
            __CLR4_5_23ma3malviclfmf.R.inc(4746);try {
                __CLR4_5_23ma3malviclfmf.R.inc(4747);if ((((datatype.isString())&&(__CLR4_5_23ma3malviclfmf.R.iget(4748)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4749)==0&false))) {{
                    __CLR4_5_23ma3malviclfmf.R.inc(4750);literal = getOWLLiteral(lexicalValue);
                } }else {__CLR4_5_23ma3malviclfmf.R.inc(4751);if ((((datatype.isBoolean())&&(__CLR4_5_23ma3malviclfmf.R.iget(4752)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4753)==0&false))) {{
                    __CLR4_5_23ma3malviclfmf.R.inc(4754);literal = getOWLLiteral(isBooleanTrueValue(lexicalValue
                        .trim()));
                } }else {__CLR4_5_23ma3malviclfmf.R.inc(4755);if ((((datatype.isFloat())&&(__CLR4_5_23ma3malviclfmf.R.iget(4756)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4757)==0&false))) {{
                    __CLR4_5_23ma3malviclfmf.R.inc(4758);if ((((lexicalValue.trim().equals("-0.0"))&&(__CLR4_5_23ma3malviclfmf.R.iget(4759)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4760)==0&false))) {{
                        // according to some W3C test, this needs to be
                        // different from 0.0; Java floats disagree
                        __CLR4_5_23ma3malviclfmf.R.inc(4761);if ((((negativeFloatZero == null)&&(__CLR4_5_23ma3malviclfmf.R.iget(4762)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4763)==0&false))) {{
                            __CLR4_5_23ma3malviclfmf.R.inc(4764);negativeFloatZero = getBasicLiteral("-0.0",
                                XSDFLOAT);
                        }
                        }__CLR4_5_23ma3malviclfmf.R.inc(4765);literal = negativeFloatZero;
                    } }else {{
                        __CLR4_5_23ma3malviclfmf.R.inc(4766);try {
                            __CLR4_5_23ma3malviclfmf.R.inc(4767);float f = Float.parseFloat(lexicalValue);
                            __CLR4_5_23ma3malviclfmf.R.inc(4768);literal = getOWLLiteral(f);
                        } catch (NumberFormatException e) {
                            __CLR4_5_23ma3malviclfmf.R.inc(4769);literal = getBasicLiteral(lexicalValue, datatype);
                        }
                    }
                }} }else {__CLR4_5_23ma3malviclfmf.R.inc(4770);if ((((datatype.isDouble())&&(__CLR4_5_23ma3malviclfmf.R.iget(4771)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4772)==0&false))) {{
                    __CLR4_5_23ma3malviclfmf.R.inc(4773);literal = getOWLLiteral(Double.parseDouble(lexicalValue));
                } }else {__CLR4_5_23ma3malviclfmf.R.inc(4774);if ((((datatype.isInteger())&&(__CLR4_5_23ma3malviclfmf.R.iget(4775)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4776)==0&false))) {{
                    // again, some W3C tests require padding zeroes to make
                    // literals different
                    __CLR4_5_23ma3malviclfmf.R.inc(4777);if ((((lexicalValue.trim().charAt(0) == '0')&&(__CLR4_5_23ma3malviclfmf.R.iget(4778)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4779)==0&false))) {{
                        __CLR4_5_23ma3malviclfmf.R.inc(4780);literal = getBasicLiteral(lexicalValue,
                            getIntegerOWLDatatype());
                    } }else {{
                        __CLR4_5_23ma3malviclfmf.R.inc(4781);try {
                            // this is fine for values that can be parsed as
                            // ints - not all values are
                            __CLR4_5_23ma3malviclfmf.R.inc(4782);literal = getOWLLiteral(Integer
                                .parseInt(lexicalValue));
                        } catch (NumberFormatException ex) {
                            // try as a big decimal
                            __CLR4_5_23ma3malviclfmf.R.inc(4783);literal = getBasicLiteral(lexicalValue, datatype);
                        }
                    }
                }} }else {{
                    __CLR4_5_23ma3malviclfmf.R.inc(4784);literal = getBasicLiteral(lexicalValue, datatype);
                }
            }}}}}} catch (NumberFormatException e) {
                // some literal is malformed, i.e., wrong format
                __CLR4_5_23ma3malviclfmf.R.inc(4785);literal = getBasicLiteral(lexicalValue, datatype);
            }
        }
        }__CLR4_5_23ma3malviclfmf.R.inc(4786);return literal;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Nonnull
    protected OWLLiteral getBasicLiteral(@Nonnull String lexicalValue,
        OWLDatatype datatype) {try{__CLR4_5_23ma3malviclfmf.R.inc(4787);
        __CLR4_5_23ma3malviclfmf.R.inc(4788);return getBasicLiteral(lexicalValue, "", datatype);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Nonnull
    protected OWLLiteral getBasicLiteral(@Nonnull String lexicalValue,
        String lang, OWLDatatype datatype) {try{__CLR4_5_23ma3malviclfmf.R.inc(4789);
        __CLR4_5_23ma3malviclfmf.R.inc(4790);OWLLiteral literal = null;
        __CLR4_5_23ma3malviclfmf.R.inc(4791);if ((((useCompression)&&(__CLR4_5_23ma3malviclfmf.R.iget(4792)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4793)==0&false))) {{
            __CLR4_5_23ma3malviclfmf.R.inc(4794);if ((((datatype == null || datatype.isRDFPlainLiteral())&&(__CLR4_5_23ma3malviclfmf.R.iget(4795)!=0|true))||(__CLR4_5_23ma3malviclfmf.R.iget(4796)==0&false))) {{
                __CLR4_5_23ma3malviclfmf.R.inc(4797);literal = new OWLLiteralImplPlain(lexicalValue, lang);
            } }else {{
                __CLR4_5_23ma3malviclfmf.R.inc(4798);literal = new OWLLiteralImpl(lexicalValue, lang, datatype);
            }
        }} }else {{
            __CLR4_5_23ma3malviclfmf.R.inc(4799);literal = new OWLLiteralImplNoCompression(lexicalValue, lang,
                datatype);
        }
        }__CLR4_5_23ma3malviclfmf.R.inc(4800);return literal;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    private static boolean isBooleanTrueValue(@Nonnull String lexicalValue) {try{__CLR4_5_23ma3malviclfmf.R.inc(4801);
        __CLR4_5_23ma3malviclfmf.R.inc(4802);return lexicalValue.equals("1") || lexicalValue.equals("true");
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLDatatype getTopDatatype() {try{__CLR4_5_23ma3malviclfmf.R.inc(4803);
        __CLR4_5_23ma3malviclfmf.R.inc(4804);return RDFSLITERAL;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLDatatype getIntegerOWLDatatype() {try{__CLR4_5_23ma3malviclfmf.R.inc(4805);
        __CLR4_5_23ma3malviclfmf.R.inc(4806);return XSDINTEGER;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLDatatype getFloatOWLDatatype() {try{__CLR4_5_23ma3malviclfmf.R.inc(4807);
        __CLR4_5_23ma3malviclfmf.R.inc(4808);return XSDFLOAT;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLDatatype getDoubleOWLDatatype() {try{__CLR4_5_23ma3malviclfmf.R.inc(4809);
        __CLR4_5_23ma3malviclfmf.R.inc(4810);return XSDDOUBLE;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLDatatype getBooleanOWLDatatype() {try{__CLR4_5_23ma3malviclfmf.R.inc(4811);
        __CLR4_5_23ma3malviclfmf.R.inc(4812);return XSDBOOLEAN;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLDatatype getRDFPlainLiteral() {try{__CLR4_5_23ma3malviclfmf.R.inc(4813);
        __CLR4_5_23ma3malviclfmf.R.inc(4814);return PLAIN;
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}

    @Override
    public OWLAnnotation getOWLAnnotation(OWLAnnotationProperty property, OWLAnnotationValue value,
        @Nonnull Set<? extends OWLAnnotation> annotations) {try{__CLR4_5_23ma3malviclfmf.R.inc(4815);
        __CLR4_5_23ma3malviclfmf.R.inc(4816);return new OWLAnnotationImpl(property, value, annotations);
    }finally{__CLR4_5_23ma3malviclfmf.R.flushNeeded();}}
}
