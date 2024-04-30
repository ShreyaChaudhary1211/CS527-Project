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
import static org.semanticweb.owlapi.model.parameters.Imports.INCLUDED;
import static org.semanticweb.owlapi.search.EntitySearcher.*;
import static org.semanticweb.owlapi.search.Searcher.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLClassAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectInverseOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.search.Filters;
import org.semanticweb.owlapi.util.OWLObjectVisitorAdapter;

/** @author Olaf Noppens */
public class KRSS2OWLObjectRenderer extends OWLObjectVisitorAdapter {public static class __CLR4_5_2g70g70lvicmbbr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,21297,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final Writer writer;

    /**
     * @param writer
     *        writer
     */
    public KRSS2OWLObjectRenderer(@Nonnull Writer writer) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(20988);
        __CLR4_5_2g70g70lvicmbbr.R.inc(20989);this.writer = checkNotNull(writer);
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void writeOpenBracket() {try{__CLR4_5_2g70g70lvicmbbr.R.inc(20990);
        __CLR4_5_2g70g70lvicmbbr.R.inc(20991);try {
            __CLR4_5_2g70g70lvicmbbr.R.inc(20992);writer.write("(");
        } catch (IOException e) {
            __CLR4_5_2g70g70lvicmbbr.R.inc(20993);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void writeCloseBracket() {try{__CLR4_5_2g70g70lvicmbbr.R.inc(20994);
        __CLR4_5_2g70g70lvicmbbr.R.inc(20995);try {
            __CLR4_5_2g70g70lvicmbbr.R.inc(20996);writer.write(")");
        } catch (IOException e) {
            __CLR4_5_2g70g70lvicmbbr.R.inc(20997);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void write(int i) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(20998);
        __CLR4_5_2g70g70lvicmbbr.R.inc(20999);try {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21000);writer.write(" " + i);
        } catch (IOException e) {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21001);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void write(@Nonnull IRI iri) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21002);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21003);try {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21004);writer.write(iri.toString());
        } catch (IOException e) {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21005);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void writeAttribute(KRSS2Vocabulary v) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21006);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21007);try {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21008);writeSpace();
            __CLR4_5_2g70g70lvicmbbr.R.inc(21009);writer.write(":");
            __CLR4_5_2g70g70lvicmbbr.R.inc(21010);writer.write(v.toString());
        } catch (IOException e) {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21011);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void write(KRSS2Vocabulary v) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21012);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21013);try {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21014);writer.write(v.toString());
        } catch (IOException e) {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21015);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void writeSpace() {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21016);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21017);try {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21018);writer.write(" ");
        } catch (IOException e) {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21019);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void writeln() {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21020);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21021);try {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21022);writer.write("\n");
        } catch (IOException e) {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21023);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void write(OWLClassExpression obj) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21024);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21025);writeSpace();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21026);obj.accept(this);
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void write(OWLIndividual ind) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21027);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21028);writeSpace();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21029);ind.accept(this);
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void write(OWLPropertyExpression obj) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21030);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21031);writeSpace();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21032);obj.accept(this);
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void write(OWLDataRange obj) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21033);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21034);writeSpace();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21035);obj.accept(this);
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    private void flatten(Collection<OWLClassExpression> inputClassExpressions) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21036);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21037);List<OWLClassExpression> classExpressions;
        __CLR4_5_2g70g70lvicmbbr.R.inc(21038);if ((((inputClassExpressions instanceof List)&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21039)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21040)==0&false))) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21041);classExpressions = (List<OWLClassExpression>) inputClassExpressions;
        } }else {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21042);classExpressions = new ArrayList<>(inputClassExpressions);
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21043);if ((((classExpressions.isEmpty())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21044)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21045)==0&false))) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21046);return;
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21047);OWLClassExpression desc = classExpressions.iterator().next();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21048);if ((((classExpressions.size() == 1)&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21049)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21050)==0&false))) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21051);write(desc);
            __CLR4_5_2g70g70lvicmbbr.R.inc(21052);return;
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21053);classExpressions.remove(0);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21054);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21055);write(AND);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21056);write(desc);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21057);flatten(classExpressions);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21058);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21059);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21060);for (OWLClass eachClass : ontology.getClassesInSignature()) {{
            assert (((eachClass != null)&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21061)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21062)==0&false));
            __CLR4_5_2g70g70lvicmbbr.R.inc(21063);boolean primitive = !isDefined(eachClass, ontology);
            __CLR4_5_2g70g70lvicmbbr.R.inc(21064);if ((((primitive)&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21065)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21066)==0&false))) {{
                __CLR4_5_2g70g70lvicmbbr.R.inc(21067);writeOpenBracket();
                __CLR4_5_2g70g70lvicmbbr.R.inc(21068);write(DEFINE_PRIMITIVE_CONCEPT);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21069);write(eachClass);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21070);writeSpace();
                __CLR4_5_2g70g70lvicmbbr.R.inc(21071);Collection<OWLAxiom> axioms = ontology.filterAxioms(
                        Filters.subClassWithSub, eachClass, INCLUDED);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21072);Collection<OWLClassExpression> superClasses = sup(axioms,
                        OWLClassExpression.class);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21073);flatten(superClasses);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21074);writeCloseBracket(); // ==> end definition of primitive-concept
                __CLR4_5_2g70g70lvicmbbr.R.inc(21075);writeln();
                __CLR4_5_2g70g70lvicmbbr.R.inc(21076);Collection<OWLClassExpression> classes = equivalent(
                        ontology.getEquivalentClassesAxioms(eachClass),
                        OWLClassExpression.class);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21077);for (OWLClassExpression classExpression : classes) {{
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21078);writeOpenBracket();
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21079);write(eachClass);
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21080);write(EQUIVALENT);
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21081);writeSpace();
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21082);classExpression.accept(this);
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21083);writeCloseBracket();
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21084);writeln();
                }
            }} }else {{
                __CLR4_5_2g70g70lvicmbbr.R.inc(21085);writeOpenBracket();
                __CLR4_5_2g70g70lvicmbbr.R.inc(21086);write(DEFINE_CONCEPT);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21087);write(eachClass);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21088);Collection<OWLClassExpression> classes = equivalent(
                        ontology.getEquivalentClassesAxioms(eachClass),
                        OWLClassExpression.class);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21089);if ((((classes.isEmpty())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21090)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21091)==0&false))) {{
                    // ?
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21092);writeCloseBracket();
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21093);writeln();
                } }else {__CLR4_5_2g70g70lvicmbbr.R.inc(21094);if ((((classes.size() == 1)&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21095)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21096)==0&false))) {{
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21097);write(classes.iterator().next());
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21098);writeCloseBracket();
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21099);writeln();
                } }else {{
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21100);Iterator<OWLClassExpression> iter = classes.iterator();
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21101);write(iter.next());
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21102);writeCloseBracket();
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21103);writeln();
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21104);while ((((iter.hasNext())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21105)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21106)==0&false))) {{
                        __CLR4_5_2g70g70lvicmbbr.R.inc(21107);writeOpenBracket();
                        __CLR4_5_2g70g70lvicmbbr.R.inc(21108);write(EQUIVALENT);
                        __CLR4_5_2g70g70lvicmbbr.R.inc(21109);write(eachClass);
                        __CLR4_5_2g70g70lvicmbbr.R.inc(21110);writeSpace();
                        __CLR4_5_2g70g70lvicmbbr.R.inc(21111);iter.next().accept(this);
                        __CLR4_5_2g70g70lvicmbbr.R.inc(21112);writeCloseBracket();
                        __CLR4_5_2g70g70lvicmbbr.R.inc(21113);writeln();
                    }
                }}
            }}}
        }}
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21114);for (OWLClassAxiom axiom : ontology.getGeneralClassAxioms()) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21115);axiom.accept(this);
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21116);for (OWLObjectProperty property : ontology
                .getObjectPropertiesInSignature()) {{
            assert (((property != null)&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21117)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21118)==0&false));
            __CLR4_5_2g70g70lvicmbbr.R.inc(21119);writeOpenBracket();
            __CLR4_5_2g70g70lvicmbbr.R.inc(21120);write(DEFINE_PRIMITIVE_ROLE);
            __CLR4_5_2g70g70lvicmbbr.R.inc(21121);write(property);
            __CLR4_5_2g70g70lvicmbbr.R.inc(21122);if ((((isTransitive(property, ontology))&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21123)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21124)==0&false))) {{
                __CLR4_5_2g70g70lvicmbbr.R.inc(21125);writeAttribute(TRANSITIVE_ATTR);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21126);writeSpace();
                __CLR4_5_2g70g70lvicmbbr.R.inc(21127);write(TRUE);
            }
            }__CLR4_5_2g70g70lvicmbbr.R.inc(21128);if ((((isSymmetric(property, ontology))&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21129)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21130)==0&false))) {{
                __CLR4_5_2g70g70lvicmbbr.R.inc(21131);writeAttribute(SYMMETRIC_ATTR);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21132);writeSpace();
                __CLR4_5_2g70g70lvicmbbr.R.inc(21133);write(TRUE);
            }
            }__CLR4_5_2g70g70lvicmbbr.R.inc(21134);Collection<OWLClassExpression> domains = domain(ontology
                    .getObjectPropertyDomainAxioms(property));
            __CLR4_5_2g70g70lvicmbbr.R.inc(21135);if ((((!domains.isEmpty())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21136)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21137)==0&false))) {{
                __CLR4_5_2g70g70lvicmbbr.R.inc(21138);writeAttribute(DOMAIN);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21139);flatten(domains);
            }
            }__CLR4_5_2g70g70lvicmbbr.R.inc(21140);Collection<OWLClassExpression> ranges = range(ontology
                    .getObjectPropertyRangeAxioms(property));
            __CLR4_5_2g70g70lvicmbbr.R.inc(21141);if ((((!ranges.isEmpty())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21142)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21143)==0&false))) {{
                __CLR4_5_2g70g70lvicmbbr.R.inc(21144);writeAttribute(RANGE_ATTR);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21145);flatten(ranges);
            }
            }__CLR4_5_2g70g70lvicmbbr.R.inc(21146);Collection<OWLAxiom> axioms = ontology.filterAxioms(
                    Filters.subObjectPropertyWithSub, property, INCLUDED);
            __CLR4_5_2g70g70lvicmbbr.R.inc(21147);Collection<OWLObjectPropertyExpression> superProperties = sup(
                    axioms, OWLObjectPropertyExpression.class);
            __CLR4_5_2g70g70lvicmbbr.R.inc(21148);if ((((!superProperties.isEmpty())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21149)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21150)==0&false))) {{
                __CLR4_5_2g70g70lvicmbbr.R.inc(21151);writeAttribute(PARENTS_ATTR);
                __CLR4_5_2g70g70lvicmbbr.R.inc(21152);writeOpenBracket();
                __CLR4_5_2g70g70lvicmbbr.R.inc(21153);for (OWLObjectPropertyExpression express : superProperties) {{
                    __CLR4_5_2g70g70lvicmbbr.R.inc(21154);write(express);
                }
                }__CLR4_5_2g70g70lvicmbbr.R.inc(21155);writeCloseBracket();
            }
            }__CLR4_5_2g70g70lvicmbbr.R.inc(21156);writeCloseBracket();
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21157);try {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21158);writer.flush();
        } catch (IOException io) {
            __CLR4_5_2g70g70lvicmbbr.R.inc(21159);throw new OWLRuntimeException(io);
        }
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21160);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21161);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21162);write(IMPLIES);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21163);write(axiom.getSubClass());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21164);write(axiom.getSuperClass());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21165);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21166);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21167);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21168);for (OWLClassExpression desc : axiom.getClassExpressions()) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21169);write(desc);
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21170);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21171);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21172);write(RELATED);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21173);write(axiom.getSubject());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21174);write(axiom.getObject());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21175);write(axiom.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21176);writeln();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21177);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21178);write(INSTANCE);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21179);write(axiom.getIndividual());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21180);write(axiom.getClassExpression());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21181);writeln();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21182);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21183);write(ce.getIRI());
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21184);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21185);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21186);write(AND);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21187);for (OWLClassExpression des : ce.getOperands()) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21188);write(des);
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21189);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21190);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21191);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21192);write(OR);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21193);for (OWLClassExpression des : ce.getOperands()) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21194);write(des);
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21195);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21196);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21197);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21198);write(NOT);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21199);write(ce.getOperand());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21200);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21201);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21202);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21203);write(SOME);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21204);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21205);write(ce.getFiller());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21206);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21207);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21208);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21209);write(ALL);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21210);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21211);write(ce.getFiller());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21212);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21213);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21214);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21215);write(AT_LEAST);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21216);write(ce.getCardinality());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21217);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21218);if ((((ce.isQualified())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21219)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21220)==0&false))) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21221);write(ce.getFiller());
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21222);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21223);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21224);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21225);write(EXACTLY);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21226);write(ce.getCardinality());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21227);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21228);if ((((ce.isQualified())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21229)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21230)==0&false))) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21231);write(ce.getFiller());
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21232);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21233);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21234);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21235);write(AT_MOST);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21236);write(ce.getCardinality());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21237);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21238);if ((((ce.isQualified())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21239)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21240)==0&false))) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21241);write(ce.getFiller());
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21242);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21243);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21244);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21245);write(SOME);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21246);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21247);write(ce.getFiller());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21248);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21249);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21250);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21251);write(ALL);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21252);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21253);write(ce.getFiller());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21254);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21255);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21256);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21257);write(AT_LEAST);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21258);write(ce.getCardinality());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21259);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21260);if ((((ce.isQualified())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21261)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21262)==0&false))) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21263);write(ce.getFiller());
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21264);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21265);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21266);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21267);write(EXACTLY);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21268);write(ce.getCardinality());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21269);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21270);if ((((ce.isQualified())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21271)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21272)==0&false))) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21273);write(ce.getFiller());
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21274);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21275);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21276);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21277);write(AT_MOST);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21278);write(ce.getCardinality());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21279);write(ce.getProperty());
        __CLR4_5_2g70g70lvicmbbr.R.inc(21280);if ((((ce.isQualified())&&(__CLR4_5_2g70g70lvicmbbr.R.iget(21281)!=0|true))||(__CLR4_5_2g70g70lvicmbbr.R.iget(21282)==0&false))) {{
            __CLR4_5_2g70g70lvicmbbr.R.inc(21283);write(ce.getFiller());
        }
        }__CLR4_5_2g70g70lvicmbbr.R.inc(21284);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21285);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21286);write(property.getIRI());
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21287);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21288);writeOpenBracket();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21289);write(INVERSE);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21290);writeSpace();
        __CLR4_5_2g70g70lvicmbbr.R.inc(21291);property.getInverse().accept(this);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21292);writeCloseBracket();
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21293);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21294);write(property.getIRI());
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2g70g70lvicmbbr.R.inc(21295);
        __CLR4_5_2g70g70lvicmbbr.R.inc(21296);write(individual.getIRI());
    }finally{__CLR4_5_2g70g70lvicmbbr.R.flushNeeded();}}
}
