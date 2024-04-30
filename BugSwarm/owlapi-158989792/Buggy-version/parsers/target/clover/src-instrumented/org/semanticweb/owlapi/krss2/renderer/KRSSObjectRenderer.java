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
package org.semanticweb.owlapi.krss2.renderer;

import static org.semanticweb.owlapi.krss2.renderer.KRSSVocabulary.*;
import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;
import static org.semanticweb.owlapi.search.EntitySearcher.isDefined;
import static org.semanticweb.owlapi.search.Searcher.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.search.Filters;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.OWLObjectVisitorAdapter;

/**
 * A {@code KRSSObjectRenderer} renderes an OWLOntology in the original KRSS
 * syntax. Note that only a subset of OWL can be expressed in KRSS. <br>
 * <b>Abbreviations</b>
 * <table summary="abbreviations">
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
 * <table summary="krss concept language">
 * <tr>
 * <td>KRSS</td>
 * <td>OWLClassExpression</td>
 * </tr>
 * <tr>
 * <td>(at-least n R C)</td>
 * <td>(OWLObjectMinCardinality R n C)</td>
 * </tr>
 * <tr>
 * <td>(at-most n R C)</td>
 * <td>(OWLObjectMaxCardinality R n C)</td>
 * </tr>
 * <tr>
 * <td>(exactly n R C)</td>
 * <td>(OWLObjectExactCardinality R n C)</td>
 * </tr>
 * <tr>
 * <td>(some R C)</td>
 * <td>(OWLObjectSomeValuesFrom R C)</td>
 * </tr>
 * <tr>
 * <td>(all R C)</td>
 * <td>(OWLObjectAllValuesFrom R C)</td>
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
 * <table summary="krss role language">
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
 * Each referenced class, object property as well as individual is defined using
 * <i>define-concept</i> resp. <i>define-primitive-concept</i>,
 * <i>define-role</i> and <i>define-individual</i>. In addition, axioms are
 * translated as follows. <br>
 * <table summary="remarks">
 * <tr>
 * <td>OWLAxiom</td>
 * <td>KRSS syntax</td>
 * <td>Remarks</td>
 * </tr>
 * <tr>
 * <td>OWLEquivalentClasses</td>
 * <td>(define-concept C D)</td>
 * <td><i>OWLEquivalentClasses C D1 D2...Dn</i> will be translated to:<br>
 * (define-concept C (and D1 D2...Dn)) <br>
 * Only applicable if there is no OWLSubClassOf axiom. <br>
 * </td>
 * </tr>
 * <tr>
 * <td>OWLDisjointClassesAxiom</td>
 * <td>(disjoint C D)</td>
 * <td>multiple pairwise disjoint statements are added in case of more than 2
 * disjoint expressions</td>
 * </tr>
 * <tr>
 * <td>OWLSubClassOf</td>
 * <td>(define-primitive-concept C D)</td>
 * <td>Multiple OWLSubClassOf axioms for C will be combined: <br>
 * (define-primitive-concept C (and D1...Dn)) <br>
 * Only applicable if there is no OWLEquivalentClasses axiom.<br>
 * KRSS does not allow both define-concept C and define-primitive-concept C.
 * GCIs not supported in KRSS (see KRSS2)</td>
 * </tr>
 * <tr>
 * <td>OWLEquivalentObjectPropertiesAxiom</td>
 * <td>(define-role R S)</td>
 * <td>Only applicable if the is no OWLSubObjectPropertyOf for R and the number
 * of the involved properties must be two</td>
 * </tr>
 * <tr>
 * <td>OWLObjectPropertyDomainAxiom</td>
 * <td>(domain P D)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>OWLObjectPropertyRangeAxiom</td>
 * <td>(range P D)</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>OWLSubObjectPropertyOf</td>
 * <td>(define-primitive-role R S)</td>
 * <td>Only applicable if the is no OWLEquivalentObjectPropertiesAxiom for R and
 * only one OWLSubObjectPropertyOf axiom for a given property is allowed. If
 * there are more one is randomly chosen.</td>
 * </tr>
 * <tr>
 * <td>OWLTransitiveObjectPropertyAxiom</td>
 * <td>(transitive P)</td>
 * </tr>
 * <tr>
 * <td>OWLClassAssertionAxiom</td>
 * <td>(instance i D)</td>
 * </tr>
 * <tr>
 * <td>OWLDifferentIndividualsAxiom</td>
 * <td>(distinct i1 i2)</td>
 * <td><i>OWLDifferentIndividualsAxiom i1 i2 ... in</i> will be splitted into:
 * <br>
 * { (distinct i(j) i(j+k)) | 1 &lt;= j &lt;=n, j&lt;k&lt;=n, j=|=k}</td>
 * </tr>
 * <tr>
 * <td>OWLObjectPropertyAssertionAxiom</td>
 * <td>(related i1 P i2)</td>
 * <td>i1: subject, i2: object</td>
 * </tr>
 * <tr>
 * <td>OWLSameIndividualsAxiom</td>
 * <td>(equal i1 i2)</td>
 * <td><i>OWLSameIndividual i1 i2 ...i(n-1)</i> in will be splitted into:<br>
 * { (equal i(j) i(j+k)) | 1 &lt;= j &lt;=n, j&lt;k&lt;=n, j=|=k} <br>
 * </td>
 * </tr>
 * </table>
 * 
 * @author Olaf Noppens, Ulm University, Institute of Artificial Intelligence
 */
public class KRSSObjectRenderer extends OWLObjectVisitorAdapter {public static class __CLR4_5_2gr3gr3lvicmbem{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,22100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private static final String OPEN_BRACKET = "(";
    @Nonnull
    private static final String CLOSE_BRACKET = ")";
    @Nonnull
    private static final String NEWLINE = "\n";
    @Nonnull
    protected final OWLOntology ont;
    @Nonnull
    protected final Writer writer;
    private int pos = 0;
    private int lastNewLinePos = 0;

    /**
     * @param ontology
     *        ontology
     * @param writer
     *        writer
     */
    public KRSSObjectRenderer(@Nonnull OWLOntology ontology, @Nonnull Writer writer) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21711);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21712);ont = checkNotNull(ontology);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21713);this.writer = new PrintWriter(writer);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Nonnull
    protected static <T extends OWLObject> List<T> sort(@Nonnull Collection<T> objects) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21714);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21715);return CollectionFactory.sortOptionally(objects);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Nonnull
    protected static <T extends OWLObject> List<T> sort(@Nonnull Iterable<T> objects) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21716);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21717);Collection<T> sortedDescriptions = new ArrayList<>();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21718);for (T t : objects) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21719);sortedDescriptions.add(t);
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21720);return CollectionFactory.sortOptionally(sortedDescriptions);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void writeOpenBracket() {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21721);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21722);write(OPEN_BRACKET);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void writeCloseBracket() {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21723);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21724);write(CLOSE_BRACKET);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void write(int i) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21725);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21726);write(" " + i);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void write(@Nonnull IRI iri) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21727);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21728);write(iri.toString());
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void write(@Nonnull KRSSVocabulary v) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21729);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21730);write(v.toString());
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void writeSpace() {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21731);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21732);write(" ");
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void write(@Nonnull String s) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21733);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21734);try {
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21735);int newLineIndex = s.indexOf('\n');
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21736);if ((((newLineIndex != -1)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21737)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21738)==0&false))) {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21739);lastNewLinePos = pos + newLineIndex;
            }
            }__CLR4_5_2gr3gr3lvicmbem.R.inc(21740);pos += s.length();
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21741);writer.write(s);
        } catch (IOException e) {
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21742);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected int getIndent() {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21743);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21744);return pos - lastNewLinePos - 1;
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void writeIndent(int indent) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21745);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21746);for (int i = 0; (((i < indent)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21747)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21748)==0&false)); i++) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21749);writeSpace();
        }
    }}finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void writeln() {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21750);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21751);write(NEWLINE);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void write(@Nonnull OWLClassExpression obj) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21752);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21753);writeSpace();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21754);obj.accept(this);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void write(@Nonnull OWLIndividual ind) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21755);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21756);writeSpace();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21757);ind.accept(this);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void write(@Nonnull OWLPropertyExpression obj) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21758);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21759);writeSpace();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21760);obj.accept(this);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void write(@Nonnull OWLDataRange obj) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21761);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21762);writeSpace();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21763);obj.accept(this);
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void flattenProperties(@Nonnull Iterable<OWLObjectPropertyExpression> properties,
        @Nullable KRSSVocabulary junctor) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21764);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21765);List<OWLObjectPropertyExpression> props = sort(properties);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21766);int size = props.size();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21767);if ((((size == 0)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21768)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21769)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21770);return;
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21771);if ((((size == 1)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21772)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21773)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21774);write(properties.iterator().next());
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21775);return;
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21776);if ((((junctor != null)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21777)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21778)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21779);writeOpenBracket();
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21780);write(junctor);
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21781);write(props.get(0));
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21782);int indent = getIndent();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21783);for (int i = 1; (((i < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21784)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21785)==0&false)); i++) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21786);writeln();
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21787);writeIndent(indent);
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21788);write(props.get(i));
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21789);if ((((junctor != null)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21790)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21791)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21792);writeCloseBracket();
        }
    }}finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    protected void flatten(@Nonnull Iterable<OWLClassExpression> description, @Nonnull KRSSVocabulary junctor) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21793);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21794);List<OWLClassExpression> descs = sort(description);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21795);int size = descs.size();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21796);if ((((size == 0)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21797)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21798)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21799);return;
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21800);write(descs.get(0));
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21801);if ((((size == 1)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21802)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21803)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21804);return;
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21805);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21806);write(junctor);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21807);int indent = getIndent();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21808);for (int i = 1; (((i < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21809)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21810)==0&false)); i++) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21811);writeln();
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21812);writeIndent(indent);
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21813);write(descs.get(i));
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21814);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLOntology ontology) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21815);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21816);Set<OWLClass> classes = ontology.getClassesInSignature();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21817);classes.remove(ontology.getOWLOntologyManager().getOWLDataFactory().getOWLThing());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21818);classes.remove(ontology.getOWLOntologyManager().getOWLDataFactory().getOWLNothing());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21819);for (OWLClass eachClass : sort(classes)) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21820);boolean primitive = !isDefined(eachClass, ontology);
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21821);if ((((primitive)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21822)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21823)==0&false))) {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21824);writeOpenBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21825);write(DEFINE_PRIMITIVE_CONCEPT);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21826);write(eachClass);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21827);writeSpace();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21828);Iterable<OWLClassExpression> supclasses = sup(ontology.getSubClassAxiomsForSubClass(eachClass),
                    OWLClassExpression.class);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21829);flatten(supclasses, AND);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21830);writeCloseBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21831);writeln();
            } }else {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21832);writeOpenBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21833);write(DEFINE_CONCEPT);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21834);write(eachClass);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21835);Iterable<OWLClassExpression> equivalentClasses = equivalent(ontology.getEquivalentClassesAxioms(
                    eachClass));
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21836);flatten(equivalentClasses, AND);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21837);writeCloseBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21838);writeln();
            }
        }}
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21839);for (OWLObjectProperty property : sort(ontology.getObjectPropertiesInSignature())) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21840);writeOpenBracket();
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21841);Collection<OWLObjectPropertyExpression> properties = equivalent(ontology
                .getEquivalentObjectPropertiesAxioms(property));
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21842);boolean isDefined = !properties.isEmpty();
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21843);if ((((isDefined)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21844)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21845)==0&false))) {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21846);write(DEFINE_ROLE);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21847);write(property);
                // choose randomly one property (KRSS restriction)
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21848);properties.remove(property);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21849);if ((((!properties.isEmpty())&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21850)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21851)==0&false))) {{
                    __CLR4_5_2gr3gr3lvicmbem.R.inc(21852);write(properties.iterator().next());
                }
            }} }else {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21853);write(DEFINE_PRIMITIVE_ROLE);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21854);write(property);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21855);writeSpace();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21856);Collection<OWLAxiom> axioms = ontology.filterAxioms(Filters.subObjectPropertyWithSub, property,
                    INCLUDED);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21857);properties = sup(axioms, OWLObjectPropertyExpression.class);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21858);if ((((!properties.isEmpty())&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21859)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21860)==0&false))) {{
                    __CLR4_5_2gr3gr3lvicmbem.R.inc(21861);write(properties.iterator().next());
                }
            }}
            }__CLR4_5_2gr3gr3lvicmbem.R.inc(21862);writeCloseBracket();
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21863);writeln();
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21864);for (OWLAxiom axiom : ontology.getAxioms()) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21865);axiom.accept(this);
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21866);try {
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21867);writer.flush();
        } catch (IOException io) {
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21868);throw new OWLRuntimeException(io);
        }
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21869);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21870);List<OWLClassExpression> classes = sort(axiom.getClassExpressions());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21871);int size = classes.size();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21872);if ((((size <= 1)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21873)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21874)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21875);return;
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21876);for (int i = 0; (((i < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21877)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21878)==0&false)); i++) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21879);for (int j = i + 1; (((j < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21880)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21881)==0&false)); j++) {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21882);writeOpenBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21883);write(DISJOINT);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21884);write(classes.get(i));
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21885);write(classes.get(j));
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21886);writeCloseBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21887);writeln();
            }
        }}
    }}finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21888);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21889);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21890);write(DOMAIN);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21891);write(axiom.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21892);write(axiom.getDomain());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21893);writeCloseBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21894);writeln();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21895);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21896);List<OWLIndividual> individuals = sort(axiom.getIndividuals());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21897);int size = individuals.size();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21898);if ((((size <= 1)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21899)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21900)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21901);return;
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21902);for (int i = 0; (((i < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21903)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21904)==0&false)); i++) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21905);for (int j = i + 1; (((j < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21906)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21907)==0&false)); j++) {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21908);writeOpenBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21909);write(DISTINCT);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21910);write(individuals.get(i));
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21911);write(individuals.get(j));
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21912);writeCloseBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21913);writeln();
            }
        }}
    }}finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21914);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21915);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21916);write(RANGE);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21917);write(axiom.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21918);write(axiom.getRange());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21919);writeCloseBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21920);writeln();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21921);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21922);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21923);write(RELATED);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21924);write(axiom.getSubject());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21925);write(axiom.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21926);write(axiom.getObject());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21927);writeCloseBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21928);writeln();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21929);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21930);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21931);write(INSTANCE);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21932);write(axiom.getIndividual());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21933);write(axiom.getClassExpression());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21934);writeCloseBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21935);writeln();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21936);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21937);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21938);write(TRANSITIVE);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21939);write(axiom.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21940);writeCloseBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21941);writeln();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21942);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21943);List<OWLIndividual> individuals = sort(axiom.getIndividuals());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21944);int size = individuals.size();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21945);if ((((size <= 1)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21946)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21947)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21948);return;
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21949);for (int i = 0; (((i < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21950)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21951)==0&false)); i++) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21952);for (int j = i + 1; (((j < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21953)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21954)==0&false)); j++) {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21955);writeOpenBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21956);write(EQUAL);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21957);write(individuals.get(i));
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21958);write(individuals.get(j));
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21959);writeCloseBracket();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21960);writeln();
            }
        }}
    }}finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClass ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21961);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21962);write(ce.getIRI());
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectIntersectionOf ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21963);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21964);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21965);write(AND);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21966);List<OWLClassExpression> operands = sort(ce.getOperands());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21967);int size = operands.size();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21968);if ((((size > 0)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21969)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21970)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21971);int indent = getIndent();
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21972);write(operands.get(0));
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21973);for (int i = 1; (((i < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21974)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21975)==0&false)); i++) {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21976);writeln();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21977);writeIndent(indent);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21978);write(operands.get(i));
            }
        }}
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21979);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectUnionOf ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21980);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21981);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21982);write(OR);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21983);List<OWLClassExpression> operands = sort(ce.getOperands());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21984);int size = operands.size();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21985);if ((((size > 0)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21986)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21987)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21988);int indent = getIndent();
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21989);write(operands.get(0));
            __CLR4_5_2gr3gr3lvicmbem.R.inc(21990);for (int i = 1; (((i < size)&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(21991)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(21992)==0&false)); i++) {{
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21993);writeln();
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21994);writeIndent(indent);
                __CLR4_5_2gr3gr3lvicmbem.R.inc(21995);write(operands.get(i));
            }
        }}
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(21996);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectComplementOf ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(21997);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21998);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(21999);write(NOT);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22000);write(ce.getOperand());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22001);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22002);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22003);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22004);write(SOME);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22005);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22006);write(ce.getFiller());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22007);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectAllValuesFrom ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22008);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22009);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22010);write(ALL);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22011);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22012);write(ce.getFiller());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22013);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMinCardinality ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22014);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22015);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22016);write(AT_LEAST);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22017);write(ce.getCardinality());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22018);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22019);if ((((ce.isQualified())&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(22020)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(22021)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(22022);write(ce.getFiller());
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(22023);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectExactCardinality ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22024);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22025);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22026);write(EXACTLY);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22027);write(ce.getCardinality());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22028);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22029);if ((((ce.isQualified())&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(22030)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(22031)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(22032);write(ce.getFiller());
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(22033);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMaxCardinality ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22034);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22035);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22036);write(AT_MOST);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22037);write(ce.getCardinality());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22038);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22039);if ((((ce.isQualified())&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(22040)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(22041)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(22042);write(ce.getFiller());
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(22043);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataSomeValuesFrom ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22044);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22045);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22046);write(SOME);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22047);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22048);write(ce.getFiller());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22049);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataAllValuesFrom ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22050);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22051);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22052);write(ALL);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22053);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22054);write(ce.getFiller());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22055);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMinCardinality ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22056);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22057);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22058);write(AT_LEAST);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22059);write(ce.getCardinality());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22060);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22061);if ((((ce.isQualified())&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(22062)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(22063)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(22064);write(ce.getFiller());
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(22065);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataExactCardinality ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22066);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22067);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22068);write(EXACTLY);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22069);write(ce.getCardinality());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22070);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22071);if ((((ce.isQualified())&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(22072)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(22073)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(22074);write(ce.getFiller());
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(22075);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMaxCardinality ce) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22076);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22077);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22078);write(AT_MOST);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22079);write(ce.getCardinality());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22080);write(ce.getProperty());
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22081);if ((((ce.isQualified())&&(__CLR4_5_2gr3gr3lvicmbem.R.iget(22082)!=0|true))||(__CLR4_5_2gr3gr3lvicmbem.R.iget(22083)==0&false))) {{
            __CLR4_5_2gr3gr3lvicmbem.R.inc(22084);write(ce.getFiller());
        }
        }__CLR4_5_2gr3gr3lvicmbem.R.inc(22085);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLLiteral node) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22086);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22087);write(node.getLiteral());
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectProperty property) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22088);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22089);write(property.getIRI());
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectInverseOf property) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22090);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22091);writeOpenBracket();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22092);write(INVERSE);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22093);writeSpace();
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22094);property.getInverse().accept(this);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22095);writeCloseBracket();
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataProperty property) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22096);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22097);write(property.getIRI());
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNamedIndividual individual) {try{__CLR4_5_2gr3gr3lvicmbem.R.inc(22098);
        __CLR4_5_2gr3gr3lvicmbem.R.inc(22099);write(individual.getIRI());
    }finally{__CLR4_5_2gr3gr3lvicmbem.R.flushNeeded();}}
}
