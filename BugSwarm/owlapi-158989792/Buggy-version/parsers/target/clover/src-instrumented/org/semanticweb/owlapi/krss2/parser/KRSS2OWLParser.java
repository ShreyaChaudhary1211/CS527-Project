/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2011, Ulm University
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi.krss2.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.formats.KRSS2DocumentFormat;
import org.semanticweb.owlapi.formats.KRSS2DocumentFormatFactory;
import org.semanticweb.owlapi.io.AbstractOWLParser;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSource;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLDocumentFormatFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;

/**
 * The KRSS2OWLParser differs from the
 * {@link org.semanticweb.owlapi.krss1.parser.KRSSOWLParser KRSSOWLParser} that
 * it supports an extended KRSS vocabulary available in many reasoning systems.
 * For instance, CGIs can be added with help of (implies subclass superclass),
 * range, domain, inverse, functinal attribute can be provided for roles. Note
 * that DatatypeProperties are not supported within KRSS2. <br>
 * <b>Abbreviations</b>
 * <table summary="Abbreviations">
 * <tr>
 * <td>CN</td>
 * <td>concept name</td>
 * </tr>
 * <tr>
 * <td>C,D,E</td>
 * <td>concept expression</td>
 * </tr>
 * <tr>
 * <td>RN</td>
 * <td>role name</td>
 * </tr>
 * <tr>
 * <td>R, R1, R2,...</td>
 * <td>role expressions, i.e. role name or inverse role</td>
 * </tr>
 * </table>
 * <br>
 * <b>KRSS concept language</b>
 * <table summary="KRSS concept language">
 * <tr>
 * <td>KRSS</td>
 * <td>OWLDescription</td>
 * </tr>
 * <tr>
 * <td>(at-least n R C)</td>
 * <td>(OWLObjectMinCardinalityRestriction R n C)</td>
 * </tr>
 * <tr>
 * <td>(at-most n R C)</td>
 * <td>(OWLObjectMaxCardinalityRestriction R n C)</td>
 * </tr>
 * <tr>
 * <td>(exactly n R C)</td>
 * <td>(OWLObjectExactCardinalityRestriction R n C)</td>
 * </tr>
 * <tr>
 * <td>(some R C)</td>
 * <td>(OWLObjectSomeRestriction R C)</td>
 * </tr>
 * <tr>
 * <td>(all R C)</td>
 * <td>(OWLObjectAllRestriction R C)</td>
 * </tr>
 * <tr>
 * <td>(not C)</td>
 * <td>(OWLObjectComplementOf C)</td>
 * </tr>
 * <tr>
 * <td>(and C D E)</td>
 * <td>(OWLObjectIntersectionOf C D E)</td>
 * </tr>
 * <tr>
 * <td>(or C D E)</td>
 * <td>(OWLObjectUnionOf C D E)</td>
 * </tr>
 * </table>
 * <br>
 * <b>KRSS role language</b>
 * <table summary="KRSS role language">
 * <tr>
 * <td>KRSS</td>
 * <td>OWLObjectPropertyExpression</td>
 * </tr>
 * <tr>
 * <td>(inv R)</td>
 * <td>(OWLInverseObjectPropertiesAxiom R)</td>
 * </tr>
 * </table>
 * <br>
 * <table summary="remarks">
 * <tr>
 * <td>KRSS2</td>
 * <td>OWLAxiom</td>
 * <td>Remarks</td>
 * </tr>
 * <tr>
 * <td>(define-primitive-concept CN C)</td>
 * <td>(OWLSubClassOfAxiom CN C)</td>
 * <td>If C is not given owl:Thing will be used instead.</td>
 * </tr>
 * <tr>
 * <td>(define-concept CN C)</td>
 * <td>(OWLEquivalentClassesAxiom CN C)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(disjoint C D)</td>
 * <td>(OWLDisjointClassesAxiom C D)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(equivalent C D)</td>
 * <td>(OWLEquivalentClassesAxion C D)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(implies C D)</td>
 * <td>(OWLSubclassOf C D)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(define-role RN RN2)</td>
 * <td>(OWLEquivalentObjectPropertiesAxiom RN RN2)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(define-primitive-role RN :right-identity RN1)</td>
 * <td>(OWLObjectPropertyChainSubPropertyAxiom (RN RN1) RN)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(define-primitive-role RN :left-identity RN1)</td>
 * <td>(OWLObjectPropertyChainSubPropertyAxiom (RN1 RN) RN)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(define-primitive-role RN RN1)</td>
 * <td>(OWLSubObjectPropertyAxiom RN RN1)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(define-primitive-role RN :parents (RN1 RN2 ...RNn))</td>
 * <td>(OWLSubObjectPropertyAxiom RN RN1)<br>
 * (OWLSubObjectPropertyAxiom RN RN2)<br>
 * (OWLSubObjectPropertyAxiom RN RNn)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(define-primitive-role RN :domain (C D ...E) :range (C D ...E)
 * :transitive t :symmetric t :reflexive t :inverse RN1)</td>
 * <td></td>
 * <td>Corresponding axioms for domain and range as well as transitive,
 * symmetric, reflexive and inverse will be added.</td>
 * </tr>
 * <tr>
 * <td>(disjoint-roles R R1)</td>
 * <td>(OWLDisjointObjectPropertiesAxiom R R1)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(implies-role R R)</td>
 * <td>(OWLSubObjectPropertyAxiom R R1)</td>
 * <td>(OWLInverseObjectPropertiesAxiom R R1)</td>
 * </tr>
 * <tr>
 * <td>(inverse RN RN1)</td>
 * <td></td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(roles-equivalent R R1)</td>
 * <td>(OWLEquivalentObjectPropertiesAxiom R R1)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(role-inclusion (compose RN RN1) RN2</td>
 * <td>(OWLObjectPropertyChainSubPropertyAxiom (RN RN1) RN2)</td>
 * <td>RN1 can also be (compose RN3 ...).</td>
 * </tr>
 * <tr>
 * <td>(transitive RN)</td>
 * <td>(OWLTransitiveObjectPropertyAxiom RN)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(range RN C)</td>
 * <td>(OWLObjectPropertyRangeAxiom RN C)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(instance i C)</td>
 * <td>(OWLClassAssertionAxiom i C)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(related i R i2)</td>
 * <td>(OWLObjectPropertyAssertionAxiom i R i2)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(equal i1 i2)</td>
 * <td>(OWLSameIndividualsAxiom i1 i2)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>(distinct i1 i2)</td>
 * <td>(OWLDifferentIndividualsAxiom i1 i2)</td>
 * <td></td>
 * </tr>
 * </table>
 * 
 * @author Olaf Noppens, Ulm University, Institute of Artificial Intelligence
 */
public class KRSS2OWLParser extends AbstractOWLParser {public static class __CLR4_5_2c70c70lvicmai0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,15838,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    @Nonnull
    @Override
    public String getName() {try{__CLR4_5_2c70c70lvicmai0.R.inc(15804);
        __CLR4_5_2c70c70lvicmai0.R.inc(15805);return "KRSS2OWLParser";
    }finally{__CLR4_5_2c70c70lvicmai0.R.flushNeeded();}}

    @Override
    public OWLDocumentFormatFactory getSupportedFormat() {try{__CLR4_5_2c70c70lvicmai0.R.inc(15806);
        __CLR4_5_2c70c70lvicmai0.R.inc(15807);return new KRSS2DocumentFormatFactory();
    }finally{__CLR4_5_2c70c70lvicmai0.R.flushNeeded();}}

    @Override
    public OWLDocumentFormat parse(OWLOntologyDocumentSource documentSource,
            OWLOntology ontology, OWLOntologyLoaderConfiguration configuration)
            throws IOException {try{__CLR4_5_2c70c70lvicmai0.R.inc(15808);
        __CLR4_5_2c70c70lvicmai0.R.inc(15809);Reader reader = null;
        __CLR4_5_2c70c70lvicmai0.R.inc(15810);InputStream is = null;
        __CLR4_5_2c70c70lvicmai0.R.inc(15811);try {
            __CLR4_5_2c70c70lvicmai0.R.inc(15812);KRSS2DocumentFormat format = new KRSS2DocumentFormat();
            __CLR4_5_2c70c70lvicmai0.R.inc(15813);KRSS2Parser parser;
            __CLR4_5_2c70c70lvicmai0.R.inc(15814);if ((((documentSource.isReaderAvailable())&&(__CLR4_5_2c70c70lvicmai0.R.iget(15815)!=0|true))||(__CLR4_5_2c70c70lvicmai0.R.iget(15816)==0&false))) {{
                __CLR4_5_2c70c70lvicmai0.R.inc(15817);reader = documentSource.getReader();
                __CLR4_5_2c70c70lvicmai0.R.inc(15818);parser = new KRSS2Parser(reader);
            } }else {__CLR4_5_2c70c70lvicmai0.R.inc(15819);if ((((documentSource.isInputStreamAvailable())&&(__CLR4_5_2c70c70lvicmai0.R.iget(15820)!=0|true))||(__CLR4_5_2c70c70lvicmai0.R.iget(15821)==0&false))) {{
                __CLR4_5_2c70c70lvicmai0.R.inc(15822);is = documentSource.getInputStream();
                __CLR4_5_2c70c70lvicmai0.R.inc(15823);parser = new KRSS2Parser(is);
            } }else {{
                __CLR4_5_2c70c70lvicmai0.R.inc(15824);is = getInputStream(documentSource.getDocumentIRI(),
                        configuration);
                __CLR4_5_2c70c70lvicmai0.R.inc(15825);parser = new KRSS2Parser(is);
            }
            }}__CLR4_5_2c70c70lvicmai0.R.inc(15826);parser.setOntology(ontology, ontology.getOWLOntologyManager()
                    .getOWLDataFactory());
            __CLR4_5_2c70c70lvicmai0.R.inc(15827);parser.parse();
            __CLR4_5_2c70c70lvicmai0.R.inc(15828);return format;
        } catch (ParseException e) {
            __CLR4_5_2c70c70lvicmai0.R.inc(15829);throw new KRSS2OWLParserException(e);
        } finally {
            __CLR4_5_2c70c70lvicmai0.R.inc(15830);if ((((is != null)&&(__CLR4_5_2c70c70lvicmai0.R.iget(15831)!=0|true))||(__CLR4_5_2c70c70lvicmai0.R.iget(15832)==0&false))) {{
                __CLR4_5_2c70c70lvicmai0.R.inc(15833);is.close();
            }
            }__CLR4_5_2c70c70lvicmai0.R.inc(15834);if ((((reader != null)&&(__CLR4_5_2c70c70lvicmai0.R.iget(15835)!=0|true))||(__CLR4_5_2c70c70lvicmai0.R.iget(15836)==0&false))) {{
                __CLR4_5_2c70c70lvicmai0.R.inc(15837);reader.close();
            }
        }}
    }finally{__CLR4_5_2c70c70lvicmai0.R.flushNeeded();}}
}
