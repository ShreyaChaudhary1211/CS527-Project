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

import static org.semanticweb.owlapi.krss2.renderer.KRSS2Vocabulary.*;
import static org.semanticweb.owlapi.model.parameters.Imports.*;
import static org.semanticweb.owlapi.search.EntitySearcher.*;
import static org.semanticweb.owlapi.search.Searcher.*;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.search.Filters;

/**
 * {@code KRSS2ObjectRenderer} is an extension of {@link KRSSObjectRenderer
 * KRSSObjectRenderer} which uses the extended vocabulary. <br>
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
 * Each referenced class, object property as well as individual is defined using
 * <i>define-concept</i> resp. <i>define-primitive-concept</i>,
 * <i>define-role</i> and <i>define-individual</i>. In addition, axioms are
 * translated as follows. <br>
 * <table summary="remarks">
 * <tr>
 * <td>KRSS2</td>
 * <td>OWLAxiom</td>
 * <td>KRSS syntax</td>
 * <td>Remarks</td>
 * </tr>
 * <tr>
 * <td>OWLDisjointClassesAxiom</td>
 * <td>(disjoint C D)</td>
 * <td><i>OWLDisjointClasses C D1 D2 ... Dn</i> { (disjoint i(j) i(j+k)) | 1
 * &lt;= j &lt;=n, j&lt;k&lt;=n, j=|=k} <br>
 * </td>
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
 * <td>OWLSubClassOfAxiom</td>
 * <td>(define-primitive-concept C D)</td>
 * <td><i>OWLSubClassOfAxiom C D1...Dn</i> (n &gt; 1) will be translated to:<br>
 * (define-primitive-concept C (and D1...Dn)) <br>
 * Only applicable if there is no OWLEquivalentClasses axiom. In that case the
 * class will be introduced via (define-concept...) and all subclass axioms are
 * handled via implies</td>
 * </tr>
 * <tr>
 * <td>OWLSubClassOfAxiom</td>
 * <td>(implies D C)</td>
 * <td>Only in case of GCIs with concept expression (not named class) D, or in
 * case that D is a non-primitive concept. Otherwise superclasses are introduced
 * via (define-primitive-concept D ...)</td>
 * </tr>
 * <tr>
 * <td>OWLEquivalentObjectPropertiesAxiom</td>
 * <td>(roles-equivalent r s)</td>
 * <td>All roles are explicitly introduced via define-primitive-role.</td>
 * </tr>
 * <tr>
 * <td>OWLSubPropertyChainOfAxiom</td>
 * <td>(role-inclusion (compose r s) t)</td>
 * <td>Role inclusions of the kind (role-inclusion (compose r s) r) resp.
 * (role-inclusion (compose s r) r) are handled within the
 * (define-primitive-role) statement as right- resp. left-identities iff it is
 * the only role-inclusion wrt. the super property.</td>
 * </tr>
 * <tr>
 * <td>OWLSubObjectPropertyAxiom</td>
 * <td>(define-primitive-role R :parent S)<br>
 * (define-primitive-role R :parents S T U)<br>
 * Additional attributes:
 * <ul>
 * <li>:transitive t
 * <li>:symmetric t
 * <li>:reflexive t
 * <li>:inverse I
 * <li>:domain C resp. :domain (and C C1...Cn)
 * <li>:range D resp. :range (and D D1..Dn)
 * </ul>
 * </td>
 * <td>This will be only used if there is no OWLEquivalentClasses axiom
 * containing R (see define-role). The additional attributes are added if there
 * is an OWLTransitiveObjectProperyAxiom, OWLSymmetricObjectPropertyAxiom,
 * OWLReflexiveObjectPropertyAxiom, OWLObjectPropertyDomainAxiom,
 * OWLObjectPropertyRangeAxiom resp. OWLInverseObjectPropertiesAxiom. If there
 * are multiple OWLInverseObjectPropertiesAxioms only one inverse is handled
 * here, all others are handled via (inverse) statements. Domains/ranges of
 * multiple domain/range axioms are handled as (and C C1...Cn).</td>
 * </tr>
 * <tr>
 * <td>OWLSubObjectPropertyAxiom</td>
 * <td>(implies-role r s)</td>
 * <td>Only applicable if r is an inverse property, otherwise superproperties
 * are handled within the define-primitive-role statement.</td>
 * </tr>
 * <tr>
 * <td>OWLInverseObjectPropertiesAxiom</td>
 * <td>(inverse r s)</td>
 * <td>Only inverse properties which are not introduced via
 * define-primitive-role.</td>
 * </tr>
 * <tr>
 * <td>OWLObjectPropertyRangeAxiom</td>
 * <td></td>
 * <td>see define-primitive-role</td>
 * </tr>
 * <tr>
 * <td>OWLObjectPropertyDomainAxiom</td>
 * <td></td>
 * <td>see define-primitive-role</td>
 * </tr>
 * <tr>
 * <td>OWLSymmetricObjectPropertyAxiom</td>
 * <td></td>
 * <td>see define-primitive-role</td>
 * </tr>
 * <tr>
 * <td>OWLTransitiveObjectPropertyAxiom</td>
 * <td></td>
 * <td>see define-primitive-role</td>
 * </tr>
 * <tr>
 * <td>OWLReflexiveObjectPropertyAxiom</td>
 * <td></td>
 * <td>see define-primitive-role</td>
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
 * { (distinct i(j) i(j+k)) | 1 &lt;= j &lt;=n, j&lt;k&lt;=n, j=|=k} <br>
 * </td>
 * </tr>
 * <tr>
 * <td>OWLObjectPropertyAssertionAxiom</td>
 * <td>(related i1 P i2)</td>
 * <td>i1: subject, i2: object</td>
 * </tr>
 * <tr>
 * <td>OWLSameIndividualsAxiom</td>
 * <td>(equal i1 i2)</td>
 * <td><i>OWLSameIndividual i1 i2 ...i(n-1) in</i> in will be splitted into:<br>
 * { (equal i(j) i(j+k)) | 1 &lt;= j &lt;=n, j&lt;k&lt;=n, j=|=k} <br>
 * (equal i1 i2)<br>
 * (equal i1 i3)<br>
 * ...<br>
 * (equal i(n-1) in)</td>
 * </tr>
 * </table>
 * 
 * @author Olaf Noppens, Ulm University, Institute of Artificial Intelligence
 */
public class KRSS2ObjectRenderer extends KRSSObjectRenderer {public static class __CLR4_5_2gfzgfzlvicmbdg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,21695,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final Set<OWLSubPropertyChainOfAxiom> leftRightIdentityUsed;
    /**
     * If declarations are ignored, entities which are only referenced in a
     * declaration are not rendered.
     */
    protected boolean ignoreDeclarations = false;

    /**
     * @param ontology
     *        ontology to render
     * @param writer
     *        writer to render to
     */
    public KRSS2ObjectRenderer(@Nonnull OWLOntology ontology, @Nonnull Writer writer) {
        super(ontology, writer);__CLR4_5_2gfzgfzlvicmbdg.R.inc(21312);try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21311);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21313);leftRightIdentityUsed = new HashSet<>();
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    /**
     * @param ignoreDeclarations
     *        true if declarations should be ignored
     */
    public void setIgnoreDeclarations(boolean ignoreDeclarations) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21314);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21315);this.ignoreDeclarations = ignoreDeclarations;
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    protected void write(KRSS2Vocabulary v) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21316);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21317);write(v.toString());
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21318);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21319);reset();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21320);for (OWLClass eachClass : ontology.getClassesInSignature()) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21321);if ((((ignoreDeclarations)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21322)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21323)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21324);if ((((ontology.getAxioms(eachClass, EXCLUDED).size() == 1 && ontology.getDeclarationAxioms(eachClass)
                    .size() == 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21325)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21326)==0&false))) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21327);continue;
                }
            }}
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21328);boolean primitive = !isDefined(eachClass, ontology);
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21329);writeOpenBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21330);if ((((primitive)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21331)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21332)==0&false))) {{ // there is no equivalentclasses axiom!
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21333);write(DEFINE_PRIMITIVE_CONCEPT);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21334);write(eachClass);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21335);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21336);Collection<OWLAxiom> axioms = ontology.filterAxioms(Filters.subClassWithSub, eachClass, INCLUDED);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21337);flatten(sup(axioms, OWLClassExpression.class), KRSSVocabulary.AND);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21338);writeCloseBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21339);writeln();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21340);Collection<OWLClassExpression> classes = equivalent(ontology.getEquivalentClassesAxioms(eachClass),
                    OWLClassExpression.class);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21341);for (OWLClassExpression description : classes) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21342);writeOpenBracket();
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21343);write(eachClass);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21344);write(EQUIVALENT);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21345);write(description);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21346);writeCloseBracket();
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21347);writeln();
                }
            }} }else {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21348);writeOpenBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21349);write(DEFINE_CONCEPT);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21350);write(eachClass);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21351);Collection<OWLClassExpression> classes = equivalent(ontology.getEquivalentClassesAxioms(eachClass),
                    OWLClassExpression.class);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21352);flatten(classes, KRSSVocabulary.AND);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21353);writeCloseBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21354);writeln();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21355);Collection<OWLClassExpression> supclasses = sup(ontology.getSubClassAxiomsForSubClass(eachClass),
                    OWLClassExpression.class);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21356);for (OWLClassExpression description : supclasses) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21357);writeOpenBracket();
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21358);write(eachClass);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21359);write(IMPLIES);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21360);write(description);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21361);writeCloseBracket();
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21362);writeln();
                }
            }}
        }}
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21363);for (OWLObjectProperty property : sort(ontology.getObjectPropertiesInSignature())) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21364);if ((((ignoreDeclarations)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21365)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21366)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21367);if ((((ontology.getAxioms(property, EXCLUDED).size() == 1 && ontology.getDeclarationAxioms(property)
                    .size() == 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21368)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21369)==0&false))) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21370);continue;
                }
            }}
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21371);writeOpenBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21372);Collection<OWLObjectPropertyExpression> properties = equivalent(ontology
                .getEquivalentObjectPropertiesAxioms(property));
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21373);boolean isPrimitive = properties.isEmpty();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21374);if ((((isPrimitive)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21375)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21376)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21377);write(DEFINE_PRIMITIVE_ROLE);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21378);write(property);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21379);Collection<OWLAxiom> axioms = ontology.filterAxioms(Filters.subObjectPropertyWithSub, property,
                    INCLUDED);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21380);Collection<OWLObjectPropertyExpression> superProperties = sup(axioms,
                    OWLObjectPropertyExpression.class);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21381);int superSize = superProperties.size();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21382);if ((((superSize == 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21383)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21384)==0&false))) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21385);writeSpace();
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21386);write(PARENT_ATTR);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21387);writeSpace();
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21388);write(superProperties.iterator().next());
                } }else {__CLR4_5_2gfzgfzlvicmbdg.R.inc(21389);if ((((superSize > 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21390)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21391)==0&false))) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21392);writeSpace();
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21393);write(PARENTS_ATTR);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21394);writeSpace();
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21395);flattenProperties(superProperties, null);
                } }else {{
                    // right/left identity?
                    // we only allow for either right or left identity axiom,
                    // otherwise it is
                    // expressed via role-inclusion axioms
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21396);Set<OWLSubPropertyChainOfAxiom> chainAxioms = getPropertyChainSubPropertyAxiomsFor(property);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21397);if ((((chainAxioms.size() == 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21398)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21399)==0&false))) {{
                        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21400);OWLSubPropertyChainOfAxiom axiom = chainAxioms.iterator().next();
                        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21401);if ((((isLeftIdentityAxiom(axiom, property))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21402)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21403)==0&false))) {{
                            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21404);leftRightIdentityUsed.add(axiom);
                            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21405);writeSpace();
                            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21406);write(LEFTIDENTITY_ATTR);
                            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21407);write(axiom.getPropertyChain().get(0));
                        } }else {__CLR4_5_2gfzgfzlvicmbdg.R.inc(21408);if ((((isRightIdentityAxiom(axiom, property))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21409)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21410)==0&false))) {{
                            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21411);leftRightIdentityUsed.add(axiom);
                            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21412);writeSpace();
                            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21413);write(RIGHTIDENTITY_ATTR);
                            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21414);write(axiom.getPropertyChain().get(1));
                        }
                    }}}
                }}
            }}} }else {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21415);if ((((properties.isEmpty())&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21416)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21417)==0&false))) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21418);write(DEFINE_PRIMITIVE_ROLE);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21419);write(property);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21420);writeSpace();
                } }else {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21421);write(DEFINE_ROLE);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21422);write(property);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21423);OWLObjectPropertyExpression expr = properties.iterator().next();
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21424);write(expr);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21425);properties.remove(expr);
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21426);writeSpace();
                }
            }}
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21427);if ((((isTransitive(property, ontology))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21428)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21429)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21430);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21431);write(TRANSITIVE_ATTR);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21432);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21433);write(TRUE);
            }
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21434);if ((((isSymmetric(property, ontology))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21435)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21436)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21437);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21438);write(SYMMETRIC_ATTR);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21439);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21440);write(TRUE);
            }
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21441);if ((((isReflexive(property, ontology))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21442)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21443)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21444);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21445);write(REFLEXIVE_ATTR);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21446);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21447);write(TRUE);
            }
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21448);Iterator<OWLObjectPropertyExpression> inverses = inverse(ontology.getInverseObjectPropertyAxioms(property),
                property).iterator();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21449);if ((((!inverses.hasNext())&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21450)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21451)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21452);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21453);write(INVERSE_ATTR);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21454);write(inverses.next());
            }
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21455);Collection<OWLClassExpression> desc = domain(ontology.getObjectPropertyDomainAxioms(property));
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21456);if ((((!desc.isEmpty())&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21457)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21458)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21459);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21460);write(DOMAIN_ATTR);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21461);flatten(desc, KRSSVocabulary.AND);
            }
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21462);desc = range(ontology.getObjectPropertyRangeAxioms(property));
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21463);if ((((!desc.isEmpty())&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21464)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21465)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21466);writeSpace();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21467);write(RANGE_ATTR);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21468);flatten(desc, KRSSVocabulary.AND);
            }
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21469);writeCloseBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21470);writeln();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21471);while ((((inverses.hasNext())&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21472)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21473)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21474);writeOpenBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21475);write(INVERSE);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21476);write(property);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21477);write(inverses.next());
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21478);writeOpenBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21479);writeln();
            }
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21480);for (OWLObjectPropertyExpression expr : properties) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21481);writeOpenBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21482);write(ROLES_EQUIVALENT);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21483);write(property);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21484);write(expr);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21485);writeCloseBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21486);writeln();
            }
        }}
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21487);for (OWLNamedIndividual individual : sort(ontology.getIndividualsInSignature())) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21488);if ((((ignoreDeclarations)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21489)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21490)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21491);if ((((ontology.getAxioms(individual, EXCLUDED).size() == 1 && ontology.getDeclarationAxioms(individual)
                    .size() == 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21492)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21493)==0&false))) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21494);continue;
                }
            }}
            }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21495);writeOpenBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21496);write(DEFINE_INDIVIDUAL);
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21497);write(individual);
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21498);writeCloseBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21499);writeln();
        }
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21500);for (OWLAxiom axiom : ontology.getAxioms()) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21501);axiom.accept(this);
        }
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21502);try {
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21503);writer.flush();
        } catch (IOException io) {
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21504);throw new OWLRuntimeException(io);
        }
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21505);
        // we only handle GCIs
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21506);if ((((!(axiom.getSubClass() instanceof OWLClass))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21507)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21508)==0&false))) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21509);writeOpenBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21510);write(IMPLIES);
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21511);write(axiom.getSubClass());
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21512);write(axiom.getSuperClass());
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21513);writeCloseBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21514);writeln();
        }
    }}finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21515);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21516);List<OWLClassExpression> descs = sort(axiom.getClassExpressions());
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21517);int size = descs.size();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21518);if ((((size <= 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21519)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21520)==0&false))) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21521);return;
        }
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21522);for (int i = 0; (((i < size)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21523)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21524)==0&false)); i++) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21525);for (int j = i + 1; (((j < size)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21526)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21527)==0&false)); j++) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21528);writeOpenBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21529);write(DISJOINT);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21530);write(descs.get(i));
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21531);write(descs.get(j));
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21532);writeCloseBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21533);writeln();
            }
        }}
    }}finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21534);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21535);List<OWLObjectPropertyExpression> properties = sort(axiom.getProperties());
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21536);int size = properties.size();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21537);for (int i = 0; (((i < size)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21538)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21539)==0&false)); i++) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21540);for (int j = i + 1; (((j < size)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21541)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21542)==0&false)); j++) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21543);writeOpenBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21544);write(ROLES_EQUIVALENT);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21545);write(properties.get(i));
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21546);write(properties.get(j));
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21547);writeCloseBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21548);writeln();
            }
        }}
    }}finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21549);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21550);List<OWLObjectPropertyExpression> properties = sort(axiom.getProperties());
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21551);int size = properties.size();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21552);if ((((size <= 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21553)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21554)==0&false))) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21555);return;
        }
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21556);for (int i = 0; (((i < size)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21557)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21558)==0&false)); i++) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21559);for (int j = i + 1; (((j < size)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21560)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21561)==0&false)); j++) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21562);writeOpenBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21563);write(DISJOINT_ROLES);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21564);write(properties.get(i));
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21565);write(properties.get(j));
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21566);writeCloseBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21567);writeln();
            }
        }}
    }}finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21568);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21569);write(RELATED);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21570);write(axiom.getSubject());
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21571);write(axiom.getProperty());
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21572);write(axiom.getObject());
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21573);writeln();
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21574);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21575);if ((((!(axiom.getSubProperty() instanceof OWLObjectProperty))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21576)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21577)==0&false))) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21578);writeOpenBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21579);write(IMPLIES_ROLE);
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21580);write(axiom.getSubProperty());
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21581);write(axiom.getSuperProperty());
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21582);writeCloseBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21583);writeln();
        }
    }}finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21584);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21585);List<OWLClassExpression> descriptions = sort(axiom.getClassExpressions());
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21586);int size = descriptions.size();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21587);if ((((size <= 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21588)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21589)==0&false))) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21590);return;
        }
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21591);for (int i = 0; (((i < size)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21592)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21593)==0&false)); i++) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21594);for (int j = i + 1; (((j < size)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21595)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21596)==0&false)); j++) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21597);writeOpenBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21598);write(EQUIVALENT);
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21599);write(descriptions.get(i));
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21600);write(descriptions.get(j));
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21601);writeCloseBracket();
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21602);writeln();
            }
        }}
    }}finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21603);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21604);if ((((leftRightIdentityUsed.contains(axiom))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21605)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21606)==0&false))) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21607);return;
        }
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21608);writeOpenBracket();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21609);write(ROLE_INCLUSTION);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21610);writeSpace();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21611);writeChain(axiom.getPropertyChain(), 0);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21612);writeSpace();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21613);write(axiom.getSuperProperty());
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21614);writeCloseBracket();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21615);writeln();
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    protected void writeChain(List<OWLObjectPropertyExpression> expressions, int i) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21616);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21617);if ((((i == expressions.size() - 1)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21618)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21619)==0&false))) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21620);write(expressions.get(i));
        } }else {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21621);writeOpenBracket();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21622);write(COMPOSE);
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21623);write(expressions.get(i));
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21624);writeChain(expressions, i + 1);
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21625);writeCloseBracket();
        }
    }}finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21626);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21627);writeOpenBracket();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21628);write(INVERSE);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21629);axiom.getFirstProperty().accept(this);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21630);axiom.getSecondProperty().accept(this);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21631);writeCloseBracket();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21632);writeln();
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLClass desc) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21633);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21634);write(desc.getIRI());
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21635);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21636);writeOpenBracket();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21637);write(ONE_OF);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21638);for (OWLIndividual individual : ce.getIndividuals()) {{
            assert (((individual != null)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21639)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21640)==0&false));
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21641);write(individual);
        }
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21642);writeCloseBracket();
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21643);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21644);write(property.getIRI());
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21645);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21646);writeOpenBracket();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21647);write(INV);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21648);writeSpace();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21649);property.getInverseProperty();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21650);property.getInverse().accept(this);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21651);writeCloseBracket();
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    protected static boolean isLeftIdentityAxiom(OWLSubPropertyChainOfAxiom axiom, OWLObjectProperty property) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21652);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21653);if ((((axiom.getSuperProperty().equals(property))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21654)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21655)==0&false))) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21656);Iterator<OWLObjectPropertyExpression> chain = axiom.getPropertyChain().iterator();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21657);if ((((chain.hasNext())&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21658)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21659)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21660);if ((((chain.next() instanceof OWLObjectProperty)&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21661)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21662)==0&false))) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21663);if ((((chain.hasNext() && chain.next().equals(property))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21664)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21665)==0&false))) {{
                        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21666);return !chain.hasNext();
                    }
                }}
            }}
        }}
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21667);return false;
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    protected static boolean isRightIdentityAxiom(OWLSubPropertyChainOfAxiom axiom, OWLObjectProperty property) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21668);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21669);if ((((axiom.getSuperProperty().equals(property))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21670)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21671)==0&false))) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21672);Iterator<OWLObjectPropertyExpression> chain = axiom.getPropertyChain().iterator();
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21673);if ((((chain.hasNext())&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21674)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21675)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21676);if ((((chain.next().equals(property))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21677)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21678)==0&false))) {{
                    __CLR4_5_2gfzgfzlvicmbdg.R.inc(21679);if ((((chain.hasNext())&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21680)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21681)==0&false))) {{
                        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21682);chain.next();
                        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21683);return !chain.hasNext();
                    }
                }}
            }}
        }}
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21684);return false;
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    protected Set<OWLSubPropertyChainOfAxiom> getPropertyChainSubPropertyAxiomsFor(OWLPropertyExpression property) {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21685);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21686);Set<OWLSubPropertyChainOfAxiom> axioms = new HashSet<>();
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21687);for (OWLSubPropertyChainOfAxiom axiom : ont.getAxioms(AxiomType.SUB_PROPERTY_CHAIN_OF)) {{
            __CLR4_5_2gfzgfzlvicmbdg.R.inc(21688);if ((((axiom.getSuperProperty().equals(property))&&(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21689)!=0|true))||(__CLR4_5_2gfzgfzlvicmbdg.R.iget(21690)==0&false))) {{
                __CLR4_5_2gfzgfzlvicmbdg.R.inc(21691);axioms.add(axiom);
            }
        }}
        }__CLR4_5_2gfzgfzlvicmbdg.R.inc(21692);return axioms;
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}

    protected void reset() {try{__CLR4_5_2gfzgfzlvicmbdg.R.inc(21693);
        __CLR4_5_2gfzgfzlvicmbdg.R.inc(21694);leftRightIdentityUsed.clear();
    }finally{__CLR4_5_2gfzgfzlvicmbdg.R.flushNeeded();}}
}
