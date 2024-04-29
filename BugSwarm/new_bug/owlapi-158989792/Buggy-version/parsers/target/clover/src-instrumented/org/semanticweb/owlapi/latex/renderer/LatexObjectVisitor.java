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
package org.semanticweb.owlapi.latex.renderer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;

/**
 * NOTE: this class was not designed as a general purpose renderer, i.e., some
 * ontologies might be misrepresented in the output. Please report any
 * formatting error you find to the bug tracker or the mailing list.
 * 
 * @author Matthew Horridge, The University Of Manchester, Medical Informatics
 *         Group
 * @since 2.0.0
 */
public class LatexObjectVisitor implements OWLObjectVisitor {public static class __CLR4_5_2h3zh3zlvicmbg9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,22796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //@formatter:off
    /** AND */         @Nonnull  private static final String AND     = "\\ensuremath{\\sqcap}";
    /** OR */          @Nonnull  public static final String OR       = "\\ensuremath{\\sqcup}";
    /** NOT */         @Nonnull  public static final String NOT      = "\\ensuremath{\\lnot}";
    /** ALL */         @Nonnull  public static final String ALL      = "\\ensuremath{\\forall}";
    /** SOME */        @Nonnull  public static final String SOME     = "\\ensuremath{\\exists}";
    /** HASVALUE */    @Nonnull  public static final String HASVALUE = "\\ensuremath{hasValue}";
    /** MIN */         @Nonnull  public static final String MIN      = "\\ensuremath{\\geq}";
    /** MAX */         @Nonnull  public static final String MAX      = "\\ensuremath{\\leq}";
    /** EQUAL */       @Nonnull  public static final String EQUAL    = "\\ensuremath{=}";
    /** SUBCLASS */    @Nonnull  public static final String SUBCLASS = "\\ensuremath{\\sqsubseteq}";
    /** EQUIV */       @Nonnull  public static final String EQUIV    = "\\ensuremath{\\equiv}";
    /** NOT_EQUIV */   @Nonnull  public static final String NOT_EQUIV= "\\ensuremath{\\not\\equiv}";
    /** TOP */         @Nonnull  public static final String TOP      = "\\ensuremath{\\top}";
    /** BOTTOM */      @Nonnull  public static final String BOTTOM   = "\\ensuremath{\\bot}";
    /** SELF */        @Nonnull  public static final String SELF     = "\\ensuremath{\\Self}";
    /** CIRC */        @Nonnull  public static final String CIRC     = "\\ensuremath{\\circ}";
    //@formatter:on
    private OWLObject subject;
    private final LatexWriter writer;
    private boolean prettyPrint = true;
    private final OWLDataFactory df;
    private ShortFormProvider shortFormProvider;

    /**
     * @param writer
     *        writer
     * @param df
     *        data factory
     */
    public LatexObjectVisitor(LatexWriter writer, @Nonnull OWLDataFactory df) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22175);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22176);this.writer = writer;
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22177);this.df = df;
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22178);shortFormProvider = new SimpleShortFormProvider();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22179);subject = df.getOWLThing();
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    /**
     * @param subject
     *        subject
     */
    public void setSubject(OWLObject subject) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22180);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22181);this.subject = subject;
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    /**
     * @param shortFormProvder
     *        shortFormProvder
     */
    public void setShortFormProvider(ShortFormProvider shortFormProvder) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22182);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22183);shortFormProvider = shortFormProvder;
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    private void writeSpace() {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22184);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22185);writer.writeSpace();
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    private void write(@Nonnull Object o) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22186);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22187);writer.write(o);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    private void write(int i) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22188);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22189);writer.write(Integer.toString(i));
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    private void writeOpenBrace() {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22190);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22191);writer.writeOpenBrace();
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    private void writeCloseBrace() {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22192);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22193);writer.writeCloseBrace();
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    /**
     * @return true if pretty print
     */
    public boolean isPrettyPrint() {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22194);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22195);return prettyPrint;
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    /**
     * @param prettyPrint
     *        prettyPrint
     */
    public void setPrettyPrint(boolean prettyPrint) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22196);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22197);this.prettyPrint = prettyPrint;
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22198);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22199);for (Iterator<OWLClassExpression> it = ce.getOperands().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22200)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22201)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22202);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22203);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22204)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22205)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22206);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22207);write(AND);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22208);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22209);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22210);write(ALL);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22211);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22212);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22213);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22214);ce.getFiller().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22215);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22216);write(EQUAL);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22217);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22218);ce.getProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22219);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22220);write(MAX);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22221);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22222);write(ce.getCardinality());
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22223);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22224);ce.getProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22225);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22226);write(MIN);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22227);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22228);write(ce.getCardinality());
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22229);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22230);ce.getProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22231);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22232);write(SOME);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22233);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22234);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22235);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22236);ce.getFiller().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22237);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22238);write(HASVALUE);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22239);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22240);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22241);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22242);ce.getFiller().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22243);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22244);write(ALL);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22245);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22246);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22247);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22248);writeNested(ce.getFiller());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22249);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22250);write(EQUAL);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22251);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22252);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22253);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22254);writeNested(ce.getFiller());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22255);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22256);write(MAX);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22257);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22258);write(ce.getCardinality());
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22259);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22260);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22261);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22262);writeNested(ce.getFiller());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22263);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22264);write(MIN);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22265);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22266);write(ce.getCardinality());
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22267);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22268);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22269);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22270);writeNested(ce.getFiller());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22271);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22272);write(SOME);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22273);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22274);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22275);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22276);writeNested(ce.getFiller());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22277);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22278);write(SOME);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22279);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22280);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22281);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22282);writeOpenBrace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22283);ce.getFiller().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22284);writeCloseBrace();
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22285);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22286);write(NOT);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22287);writeNested(ce.getOperand());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22288);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22289);for (Iterator<OWLClassExpression> it = ce.getOperands().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22290)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22291)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22292);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22293);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22294)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22295)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22296);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22297);write(OR);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22298);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22299);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22300);write(escapeName(shortFormProvider.getShortForm(ce)));
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22301);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22302);for (Iterator<OWLIndividual> it = ce.getIndividuals().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22303)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22304)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22305);writeOpenBrace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22306);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22307);writeCloseBrace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22308);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22309)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22310)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22311);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22312);write(OR);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22313);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22314);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22315);write(escapeName(shortFormProvider.getShortForm(property)));
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22316);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22317);write(escapeName(shortFormProvider.getShortForm(property)));
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22318);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22319);write(escapeName(shortFormProvider.getShortForm(individual)));
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22320);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22321);write(SOME);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22322);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22323);ce.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22324);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22325);write(SELF);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22326);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22327);if ((((axiom.getClassExpressions().size() != 2)&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22328)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22329)==0&false))) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22330);for (OWLClassExpression left : axiom.getClassExpressions()) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22331);for (OWLClassExpression right : axiom.getClassExpressions()) {{
                    __CLR4_5_2h3zh3zlvicmbg9.R.inc(22332);if ((((left != right)&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22333)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22334)==0&false))) {{
                        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22335);if ((((left.equals(subject))&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22336)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22337)==0&false))) {{
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22338);left.accept(this);
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22339);writeSpace();
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22340);write(SUBCLASS);
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22341);writeSpace();
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22342);write(NOT);
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22343);writeSpace();
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22344);right.accept(this);
                        } }else {{
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22345);right.accept(this);
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22346);writeSpace();
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22347);write(SUBCLASS);
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22348);writeSpace();
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22349);write(NOT);
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22350);writeSpace();
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22351);left.accept(this);
                        }
                        }__CLR4_5_2h3zh3zlvicmbg9.R.inc(22352);writer.writeNewLine();
                    }
                }}
            }}
        }} }else {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22353);Iterator<OWLClassExpression> it = axiom.getClassExpressions().iterator();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22354);OWLClassExpression descA = it.next();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22355);OWLClassExpression descB = it.next();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22356);OWLClassExpression lhs;
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22357);OWLClassExpression rhs;
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22358);if ((((descA.equals(subject))&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22359)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22360)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22361);lhs = descA;
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22362);rhs = descB;
            } }else {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22363);lhs = descB;
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22364);rhs = descA;
            }
            }__CLR4_5_2h3zh3zlvicmbg9.R.inc(22365);lhs.accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22366);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22367);write(SUBCLASS);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22368);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22369);write(NOT);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22370);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22371);rhs.accept(this);
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22372);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22373);if ((((axiom.getClassExpressions().size() > 2)&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22374)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22375)==0&false))) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22376);Set<Set<OWLClassExpression>> rendered = new HashSet<>();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22377);for (OWLClassExpression left : axiom.getClassExpressions()) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22378);for (OWLClassExpression right : axiom.getClassExpressions()) {{
                    __CLR4_5_2h3zh3zlvicmbg9.R.inc(22379);if ((((left != right)&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22380)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22381)==0&false))) {{
                        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22382);Set<OWLClassExpression> cur = CollectionFactory.createSet(left, right);
                        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22383);if ((((!rendered.contains(cur))&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22384)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22385)==0&false))) {{
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22386);rendered.add(cur);
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22387);left.accept(this);
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22388);writeSpace();
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22389);write(EQUIV);
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22390);writeSpace();
                            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22391);right.accept(this);
                        }
                    }}
                }}
            }}
        }} }else {__CLR4_5_2h3zh3zlvicmbg9.R.inc(22392);if ((((axiom.getClassExpressions().size() == 2)&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22393)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22394)==0&false))) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22395);Iterator<OWLClassExpression> it = axiom.getClassExpressions().iterator();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22396);OWLClassExpression descA = it.next();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22397);OWLClassExpression descB = it.next();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22398);OWLClassExpression lhs;
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22399);OWLClassExpression rhs;
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22400);if ((((subject.equals(descA))&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22401)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22402)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22403);lhs = descA;
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22404);rhs = descB;
            } }else {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22405);lhs = descB;
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22406);rhs = descA;
            }
            }__CLR4_5_2h3zh3zlvicmbg9.R.inc(22407);lhs.accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22408);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22409);write(EQUIV);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22410);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22411);rhs.accept(this);
        }
    }}}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22412);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22413);setPrettyPrint(false);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22414);axiom.getSubClass().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22415);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22416);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22417);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22418);axiom.getSuperClass().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22419);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22420);setPrettyPrint(true);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22421);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22422);axiom.getIndividual().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22423);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22424);write(":");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22425);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22426);axiom.getClassExpression().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22427);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22428);write("AsymmetricProperty");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22429);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22430);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22431);axiom.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22432);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22433);write("(");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22434);axiom.getSubject().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22435);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22436);axiom.getObject().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22437);write(")");
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22438);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22439);df.getOWLDataSomeValuesFrom(axiom.getProperty(), df.getTopDatatype()).accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22440);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22441);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22442);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22443);axiom.getDomain().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22444);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22445);write(TOP);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22446);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22447);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22448);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22449);df.getOWLDataAllValuesFrom(axiom.getProperty(), axiom.getRange()).accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22450);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22451);axiom.getSubProperty();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22452);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22453);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22454);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22455);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22456);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22457);write("Declaration");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22458);axiom.getEntity().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22459);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22460);for (Iterator<OWLIndividual> it = axiom.getIndividuals().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22461)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22462)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22463);write("\\{");
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22464);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22465);write("\\}");
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22466);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22467)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22468)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22469);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22470);write(NOT_EQUIV);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22471);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22472);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22473);for (Iterator<OWLDataPropertyExpression> it = axiom.getProperties().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22474)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22475)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22476);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22477);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22478)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22479)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22480);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22481);write(NOT_EQUIV);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22482);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22483);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22484);write("DisjointObjectProperties");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22485);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22486);for (OWLObjectPropertyExpression p : axiom.getProperties()) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22487);p.accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22488);writeSpace();
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22489);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22490);write("DisjointUnion");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22491);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22492);for (OWLClassExpression p : axiom.getClassExpressions()) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22493);p.accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22494);writeSpace();
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22495);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22496);write("Annotation");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22497);axiom.getSubject().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22498);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22499);axiom.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22500);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22501);axiom.getValue().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22502);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22503);for (Iterator<OWLDataPropertyExpression> it = axiom.getProperties().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22504)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22505)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22506);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22507);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22508)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22509)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22510);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22511);write(NOT_EQUIV);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22512);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22513);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22514);for (Iterator<OWLObjectPropertyExpression> it = axiom.getProperties().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22515)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22516)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22517);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22518);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22519)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22520)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22521);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22522);write(EQUIV);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22523);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22524);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22525);write(TOP);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22526);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22527);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22528);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22529);df.getOWLDataMaxCardinality(1, axiom.getProperty()).accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22530);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22531);write(TOP);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22532);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22533);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22534);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22535);df.getOWLObjectMaxCardinality(1, axiom.getProperty()).accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    /**
     * @param axiom
     *        the axiom
     */
    public void visit(OWLImportsDeclaration axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22536);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22537);write("ImportsDeclaration");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22538);axiom.getIRI().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22539);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22540);write(TOP);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22541);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22542);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22543);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22544);OWLObjectPropertyExpression prop = df.getOWLObjectInverseOf(axiom.getProperty());
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22545);df.getOWLObjectMaxCardinality(1, prop).accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22546);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22547);axiom.getFirstProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22548);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22549);write(EQUIV);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22550);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22551);axiom.getSecondProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22552);write("\\ensuremath{^-}");
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22553);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22554);write("IrreflexiveObjectProperty");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22555);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22556);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22557);write(NOT);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22558);axiom.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22559);write("(");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22560);axiom.getSubject().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22561);write(", ");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22562);axiom.getObject().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22563);write(")");
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22564);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22565);write(NOT);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22566);axiom.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22567);write("(");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22568);axiom.getSubject().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22569);write(", ");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22570);axiom.getObject().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22571);write(")");
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22572);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22573);axiom.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22574);write("(");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22575);axiom.getSubject().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22576);write(", ");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22577);axiom.getObject().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22578);write(")");
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22579);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22580);for (Iterator<OWLObjectPropertyExpression> it = axiom.getPropertyChain().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22581)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22582)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22583);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22584);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22585)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22586)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22587);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22588);write(CIRC);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22589);writeSpace();
            }
        }}
        }__CLR4_5_2h3zh3zlvicmbg9.R.inc(22590);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22591);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22592);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22593);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22594);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22595);df.getOWLObjectSomeValuesFrom(axiom.getProperty(), df.getOWLThing()).accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22596);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22597);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22598);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22599);axiom.getDomain().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22600);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22601);write(TOP);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22602);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22603);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22604);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22605);df.getOWLObjectAllValuesFrom(axiom.getProperty(), axiom.getRange()).accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22606);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22607);axiom.getSubProperty();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22608);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22609);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22610);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22611);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22612);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22613);write("ReflexiveProperty");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22614);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22615);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22616);for (Iterator<OWLIndividual> it = axiom.getIndividuals().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22617)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22618)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22619);write("\\{");
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22620);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22621);write("\\}");
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22622);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22623)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22624)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22625);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22626);write(EQUIV);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22627);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22628);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22629);axiom.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22630);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22631);write(EQUIV);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22632);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22633);axiom.getProperty().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22634);write("\\ensuremath{^-}");
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22635);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22636);write("Datatype");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22637);axiom.getDatatype().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22638);write(EQUIV);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22639);axiom.getDataRange().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22640);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22641);write("TransitiveProperty");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22642);axiom.getProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22643);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22644);write("SWRLRule");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22645);for (SWRLAtom a : rule.getHead()) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22646);a.accept(this);
        }
        }__CLR4_5_2h3zh3zlvicmbg9.R.inc(22647);write("\\rightarrow");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22648);for (SWRLAtom a : rule.getBody()) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22649);a.accept(this);
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22650);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22651);write(node.getIRI());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    private void writeNested(@Nonnull OWLClassExpression classExpression) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22652);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22653);openBracket(classExpression);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22654);classExpression.accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22655);closeBracket(classExpression);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    private void writeNested(OWLObject expression) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22656);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22657);expression.accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    private void openBracket(@Nonnull OWLClassExpression classExpression) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22658);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22659);if ((((LatexBracketChecker.requiresBracket(classExpression))&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22660)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22661)==0&false))) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22662);write("(");
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    private void closeBracket(@Nonnull OWLClassExpression classExpression) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22663);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22664);if ((((LatexBracketChecker.requiresBracket(classExpression))&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22665)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22666)==0&false))) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22667);write(")");
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Nonnull
    private static String escapeName(String name) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22668);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22669);return name.replace("_", "\\_");
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22670);}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22671);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22672);property.getInverse().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22673);write("\\ensuremath{^-}");
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22674);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22675);write(NOT);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22676);writeNested(node.getDataRange());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22677);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22678);for (Iterator<OWLLiteral> it = node.getValues().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22679)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22680)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22681);writeOpenBrace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22682);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22683);writeCloseBrace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22684);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22685)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22686)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22687);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22688);write(OR);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22689);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22690);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22691);write("Facet");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22692);write(node.getFacet());
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22693);node.getFacetValue().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22694);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22695);write("DatatypeRestriction");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22696);node.getDatatype().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22697);for (OWLFacetRestriction r : node.getFacetRestrictions()) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22698);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22699);r.accept(this);
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22700);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22701);write("Datatype");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22702);write(node.getIRI());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22703);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22704);write("\"");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22705);write(node.getLiteral());
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22706);write("\"\\^\\^");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22707);write(node.getDatatype().getIRI());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22708);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22709);node.getLiteral().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22710);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22711);node.getIndividual().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22712);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22713);node.getPredicate().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22714);for (SWRLDArgument d : node.getArguments()) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22715);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22716);d.accept(this);
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22717);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22718);node.getArgument().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22719);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22720);node.getPredicate().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22721);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22722);node.getPredicate().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22723);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22724);for (SWRLArgument a : node.getAllArguments()) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22725);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22726);a.accept(this);
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22727);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22728);node.getPredicate().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22729);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22730);for (SWRLArgument a : node.getAllArguments()) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22731);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22732);a.accept(this);
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22733);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22734);write("AnnotationProperty");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22735);property.getIRI().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotation node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22736);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22737);write("Annotation");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22738);node.getProperty().getIRI().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22739);node.getValue().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22740);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22741);write("Domain");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22742);axiom.getProperty().getIRI().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22743);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22744);axiom.getDomain().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22745);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22746);write("Range");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22747);axiom.getProperty().getIRI().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22748);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22749);axiom.getRange().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22750);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22751);axiom.getSubProperty();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22752);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22753);write(SUBCLASS);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22754);writeSpace();
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22755);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    /**
     * @param value
     *        value
     */
    public void visit(OWLAnnotationValue value) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22756);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22757);value.accept(new OWLAnnotationValueVisitor() {

            @Override
            public void visit(IRI iri) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22758);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22759);iri.accept(LatexObjectVisitor.this);
            }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

            @Override
            public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22760);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22761);individual.accept(LatexObjectVisitor.this);
            }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

            @Override
            public void visit(OWLLiteral literal) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22762);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22763);literal.accept(LatexObjectVisitor.this);
            }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}
        });
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22764);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22765);write("HasKey");
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22766);axiom.getClassExpression().accept(this);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22767);for (OWLPropertyExpression p : axiom.getPropertyExpressions()) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22768);writeSpace();
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22769);p.accept(this);
        }
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22770);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22771);for (Iterator<OWLDataRange> it = node.getOperands().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22772)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22773)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22774);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22775);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22776)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22777)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22778);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22779);write(AND);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22780);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22781);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22782);for (Iterator<OWLDataRange> it = node.getOperands().iterator(); (((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22783)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22784)==0&false));) {{
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22785);it.next().accept(this);
            __CLR4_5_2h3zh3zlvicmbg9.R.inc(22786);if ((((it.hasNext())&&(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22787)!=0|true))||(__CLR4_5_2h3zh3zlvicmbg9.R.iget(22788)==0&false))) {{
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22789);writeSpace();
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22790);write(OR);
                __CLR4_5_2h3zh3zlvicmbg9.R.inc(22791);writeSpace();
            }
        }}
    }}finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(OWLAnonymousIndividual individual) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22792);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22793);write(individual.getID().toString());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}

    @Override
    public void visit(IRI iri) {try{__CLR4_5_2h3zh3zlvicmbg9.R.inc(22794);
        __CLR4_5_2h3zh3zlvicmbg9.R.inc(22795);write(iri.getShortForm());
    }finally{__CLR4_5_2h3zh3zlvicmbg9.R.flushNeeded();}}
}
