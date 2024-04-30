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
package org.semanticweb.owlapi.dlsyntax.renderer;

import static org.semanticweb.owlapi.dlsyntax.renderer.DLSyntax.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.OWLObjectRenderer;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.*;

/**
 * Renders objects in unicode DL syntax.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class DLSyntaxObjectRenderer extends OWLObjectVisitorAdapter implements OWLObjectRenderer, OWLObjectVisitor {public static class __CLR4_5_237o37olvicm8wh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,4655,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ShortFormProvider shortFormProvider;
    private final IRIShortFormProvider iriShortFormProvider;
    private StringBuilder buffer;
    private OWLObject focusedObject;

    /** default constructor */
    public DLSyntaxObjectRenderer() {try{__CLR4_5_237o37olvicm8wh.R.inc(4164);
        __CLR4_5_237o37olvicm8wh.R.inc(4165);shortFormProvider = new SimpleShortFormProvider();
        __CLR4_5_237o37olvicm8wh.R.inc(4166);iriShortFormProvider = new SimpleIRIShortFormProvider();
        __CLR4_5_237o37olvicm8wh.R.inc(4167);buffer = new StringBuilder();
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    /**
     * @param focusedObject
     *        focusedObject
     */
    public void setFocusedObject(@Nonnull OWLObject focusedObject) {try{__CLR4_5_237o37olvicm8wh.R.inc(4168);
        __CLR4_5_237o37olvicm8wh.R.inc(4169);this.focusedObject = checkNotNull(focusedObject, "focusedObject cannot be null");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    /**
     * @param obj
     *        obj
     * @return true if obj is equal to focusedObject
     */
    public boolean isFocusedObject(OWLObject obj) {try{__CLR4_5_237o37olvicm8wh.R.inc(4170);
        __CLR4_5_237o37olvicm8wh.R.inc(4171);if ((((focusedObject == null)&&(__CLR4_5_237o37olvicm8wh.R.iget(4172)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4173)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4174);return false;
        }
        }__CLR4_5_237o37olvicm8wh.R.inc(4175);return focusedObject.equals(obj);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void setShortFormProvider(ShortFormProvider shortFormProvider) {try{__CLR4_5_237o37olvicm8wh.R.inc(4176);
        __CLR4_5_237o37olvicm8wh.R.inc(4177);this.shortFormProvider = checkNotNull(shortFormProvider, "shortFormProvider cannot be null");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Nonnull
    @Override
    public String render(OWLObject object) {try{__CLR4_5_237o37olvicm8wh.R.inc(4178);
        __CLR4_5_237o37olvicm8wh.R.inc(4179);buffer = new StringBuilder();
        __CLR4_5_237o37olvicm8wh.R.inc(4180);checkNotNull(object, "object cannot be null").accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4181);return buffer.toString();
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_237o37olvicm8wh.R.inc(4182);
        __CLR4_5_237o37olvicm8wh.R.inc(4183);checkNotNull(ontology, "ontology cannot be null");
        __CLR4_5_237o37olvicm8wh.R.inc(4184);for (OWLAxiom ax : CollectionFactory.sortOptionally(ontology.getLogicalAxioms())) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4185);ax.accept(this);
            __CLR4_5_237o37olvicm8wh.R.inc(4186);write("\n");
        }
    }}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    protected void write(@Nonnull String s) {try{__CLR4_5_237o37olvicm8wh.R.inc(4187);
        __CLR4_5_237o37olvicm8wh.R.inc(4188);buffer.append(checkNotNull(s, "s cannot be null"));
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Nonnull
    protected String renderEntity(@Nonnull OWLEntity entity) {try{__CLR4_5_237o37olvicm8wh.R.inc(4189);
        __CLR4_5_237o37olvicm8wh.R.inc(4190);return shortFormProvider.getShortForm(checkNotNull(entity, "entity cannot be null"));
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    protected void writeEntity(@Nonnull OWLEntity entity) {try{__CLR4_5_237o37olvicm8wh.R.inc(4191);
        __CLR4_5_237o37olvicm8wh.R.inc(4192);write(renderEntity(checkNotNull(entity, "entity cannot be null")));
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    protected void write(@Nonnull DLSyntax keyword) {try{__CLR4_5_237o37olvicm8wh.R.inc(4193);
        __CLR4_5_237o37olvicm8wh.R.inc(4194);write(checkNotNull(keyword, "keyword cannot be null").toString());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    protected void write(int i) {try{__CLR4_5_237o37olvicm8wh.R.inc(4195);
        __CLR4_5_237o37olvicm8wh.R.inc(4196);write(Integer.toString(i));
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    protected void writeNested(@Nonnull OWLObject object) {try{__CLR4_5_237o37olvicm8wh.R.inc(4197);
        __CLR4_5_237o37olvicm8wh.R.inc(4198);checkNotNull(object, "object cannot be null");
        __CLR4_5_237o37olvicm8wh.R.inc(4199);if ((((isBracketedIfNested(object))&&(__CLR4_5_237o37olvicm8wh.R.iget(4200)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4201)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4202);write("(");
        }
        }__CLR4_5_237o37olvicm8wh.R.inc(4203);object.accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4204);if ((((isBracketedIfNested(object))&&(__CLR4_5_237o37olvicm8wh.R.iget(4205)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4206)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4207);write(")");
        }
    }}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    protected static boolean isBracketedIfNested(@Nonnull OWLObject object) {try{__CLR4_5_237o37olvicm8wh.R.inc(4208);
        __CLR4_5_237o37olvicm8wh.R.inc(4209);checkNotNull(object, "object cannot be null");
        __CLR4_5_237o37olvicm8wh.R.inc(4210);return !(object instanceof OWLEntity);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeObject(@Nonnull OWLObject object, boolean nest) {try{__CLR4_5_237o37olvicm8wh.R.inc(4211);
        __CLR4_5_237o37olvicm8wh.R.inc(4212);checkNotNull(object, "object cannot be null");
        __CLR4_5_237o37olvicm8wh.R.inc(4213);if ((((nest)&&(__CLR4_5_237o37olvicm8wh.R.iget(4214)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4215)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4216);writeNested(object);
        } }else {{
            __CLR4_5_237o37olvicm8wh.R.inc(4217);object.accept(this);
        }
    }}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    protected void write(@Nonnull Collection<? extends OWLObject> objects, @Nonnull DLSyntax delim, boolean nest) {try{__CLR4_5_237o37olvicm8wh.R.inc(4218);
        __CLR4_5_237o37olvicm8wh.R.inc(4219);checkNotNull(objects, "objects cannot be null");
        __CLR4_5_237o37olvicm8wh.R.inc(4220);checkNotNull(delim, "delim cannot be null");
        __CLR4_5_237o37olvicm8wh.R.inc(4221);if ((((objects.size() == 2)&&(__CLR4_5_237o37olvicm8wh.R.iget(4222)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4223)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4224);Iterator<? extends OWLObject> it = objects.iterator();
            __CLR4_5_237o37olvicm8wh.R.inc(4225);OWLObject o1 = it.next();
            __CLR4_5_237o37olvicm8wh.R.inc(4226);OWLObject o2 = it.next();
            assert (((o1 != null)&&(__CLR4_5_237o37olvicm8wh.R.iget(4227)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4228)==0&false));
            assert (((o2 != null)&&(__CLR4_5_237o37olvicm8wh.R.iget(4229)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4230)==0&false));
            __CLR4_5_237o37olvicm8wh.R.inc(4231);if ((((isFocusedObject(o1) || !isFocusedObject(o2))&&(__CLR4_5_237o37olvicm8wh.R.iget(4232)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4233)==0&false))) {{
                __CLR4_5_237o37olvicm8wh.R.inc(4234);writeObject(o1, nest);
                __CLR4_5_237o37olvicm8wh.R.inc(4235);writeSpace();
                __CLR4_5_237o37olvicm8wh.R.inc(4236);write(delim);
                __CLR4_5_237o37olvicm8wh.R.inc(4237);writeSpace();
                __CLR4_5_237o37olvicm8wh.R.inc(4238);writeObject(o2, nest);
            } }else {{
                __CLR4_5_237o37olvicm8wh.R.inc(4239);writeObject(o2, nest);
                __CLR4_5_237o37olvicm8wh.R.inc(4240);writeSpace();
                __CLR4_5_237o37olvicm8wh.R.inc(4241);write(delim);
                __CLR4_5_237o37olvicm8wh.R.inc(4242);writeSpace();
                __CLR4_5_237o37olvicm8wh.R.inc(4243);writeObject(o1, nest);
            }
        }} }else {{
            __CLR4_5_237o37olvicm8wh.R.inc(4244);for (Iterator<? extends OWLObject> it = objects.iterator(); (((it.hasNext())&&(__CLR4_5_237o37olvicm8wh.R.iget(4245)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4246)==0&false));) {{
                __CLR4_5_237o37olvicm8wh.R.inc(4247);OWLObject o = it.next();
                assert (((o != null)&&(__CLR4_5_237o37olvicm8wh.R.iget(4248)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4249)==0&false));
                __CLR4_5_237o37olvicm8wh.R.inc(4250);writeObject(o, nest);
                __CLR4_5_237o37olvicm8wh.R.inc(4251);if ((((it.hasNext())&&(__CLR4_5_237o37olvicm8wh.R.iget(4252)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4253)==0&false))) {{
                    __CLR4_5_237o37olvicm8wh.R.inc(4254);writeSpace();
                    __CLR4_5_237o37olvicm8wh.R.inc(4255);write(delim);
                    __CLR4_5_237o37olvicm8wh.R.inc(4256);writeSpace();
                }
            }}
        }}
    }}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLSubClassOfAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4257);
        __CLR4_5_237o37olvicm8wh.R.inc(4258);checkNotNull(axiom, "axiom cannot be null").getSubClass().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4259);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4260);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4261);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4262);axiom.getSuperClass().accept(this);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writePropertyAssertion(@Nonnull OWLPropertyAssertionAxiom<?, ?> ax) {try{__CLR4_5_237o37olvicm8wh.R.inc(4263);
        __CLR4_5_237o37olvicm8wh.R.inc(4264);checkNotNull(ax, "ax cannot be null");
        __CLR4_5_237o37olvicm8wh.R.inc(4265);if ((((ax instanceof OWLNegativeObjectPropertyAssertionAxiom
            || ax instanceof OWLNegativeDataPropertyAssertionAxiom)&&(__CLR4_5_237o37olvicm8wh.R.iget(4266)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4267)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4268);write(NOT);
        }
        }__CLR4_5_237o37olvicm8wh.R.inc(4269);ax.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4270);write("(");
        __CLR4_5_237o37olvicm8wh.R.inc(4271);ax.getSubject().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4272);write(", ");
        __CLR4_5_237o37olvicm8wh.R.inc(4273);ax.getObject().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4274);write(")");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4275);
        __CLR4_5_237o37olvicm8wh.R.inc(4276);write(NOT);
        __CLR4_5_237o37olvicm8wh.R.inc(4277);writePropertyAssertion(axiom);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4278);
        __CLR4_5_237o37olvicm8wh.R.inc(4279);write(TOP);
        __CLR4_5_237o37olvicm8wh.R.inc(4280);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4281);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4282);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4283);write(EXISTS);
        __CLR4_5_237o37olvicm8wh.R.inc(4284);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4285);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4286);write(" .");
        __CLR4_5_237o37olvicm8wh.R.inc(4287);write(SELF);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointClassesAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4288);
        __CLR4_5_237o37olvicm8wh.R.inc(4289);List<OWLClassExpression> descs = new ArrayList<>(axiom.getClassExpressions());
        __CLR4_5_237o37olvicm8wh.R.inc(4290);for (int i = 0; (((i < descs.size() - 1)&&(__CLR4_5_237o37olvicm8wh.R.iget(4291)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4292)==0&false)); i++) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4293);for (int j = i + 1; (((j < descs.size())&&(__CLR4_5_237o37olvicm8wh.R.iget(4294)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4295)==0&false)); j++) {{
                __CLR4_5_237o37olvicm8wh.R.inc(4296);descs.get(i).accept(this);
                __CLR4_5_237o37olvicm8wh.R.inc(4297);writeSpace();
                __CLR4_5_237o37olvicm8wh.R.inc(4298);write(DISJOINT_WITH);
                __CLR4_5_237o37olvicm8wh.R.inc(4299);writeSpace();
                __CLR4_5_237o37olvicm8wh.R.inc(4300);descs.get(j).accept(this);
                __CLR4_5_237o37olvicm8wh.R.inc(4301);if ((((j < descs.size() - 1)&&(__CLR4_5_237o37olvicm8wh.R.iget(4302)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4303)==0&false))) {{
                    __CLR4_5_237o37olvicm8wh.R.inc(4304);write(", ");
                }
            }}
            }__CLR4_5_237o37olvicm8wh.R.inc(4305);if ((((i < descs.size() - 2)&&(__CLR4_5_237o37olvicm8wh.R.iget(4306)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4307)==0&false))) {{
                __CLR4_5_237o37olvicm8wh.R.inc(4308);write(", ");
            }
        }}
    }}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeDomainAxiom(@Nonnull OWLPropertyDomainAxiom<?> axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4309);
        __CLR4_5_237o37olvicm8wh.R.inc(4310);write(EXISTS);
        __CLR4_5_237o37olvicm8wh.R.inc(4311);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4312);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4313);writeRestrictionSeparator();
        __CLR4_5_237o37olvicm8wh.R.inc(4314);write(TOP);
        __CLR4_5_237o37olvicm8wh.R.inc(4315);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4316);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4317);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4318);writeNested(axiom.getDomain());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeRestrictionSeparator() {try{__CLR4_5_237o37olvicm8wh.R.inc(4319);
        __CLR4_5_237o37olvicm8wh.R.inc(4320);write(".");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4321);
        __CLR4_5_237o37olvicm8wh.R.inc(4322);writeDomainAxiom(axiom);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4323);
        __CLR4_5_237o37olvicm8wh.R.inc(4324);writeDomainAxiom(axiom);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4325);
        __CLR4_5_237o37olvicm8wh.R.inc(4326);write(axiom.getProperties(), EQUIVALENT_TO, false);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4327);
        __CLR4_5_237o37olvicm8wh.R.inc(4328);write(NOT);
        __CLR4_5_237o37olvicm8wh.R.inc(4329);writePropertyAssertion(axiom);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4330);
        __CLR4_5_237o37olvicm8wh.R.inc(4331);write(axiom.getIndividuals(), NOT_EQUAL, false);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4332);
        __CLR4_5_237o37olvicm8wh.R.inc(4333);write(axiom.getProperties(), DISJOINT_WITH, false);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4334);
        __CLR4_5_237o37olvicm8wh.R.inc(4335);write(axiom.getProperties(), DISJOINT_WITH, false);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeRangeAxiom(@Nonnull OWLPropertyRangeAxiom<?, ?> axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4336);
        __CLR4_5_237o37olvicm8wh.R.inc(4337);checkNotNull(axiom, "axiom cannot be null");
        __CLR4_5_237o37olvicm8wh.R.inc(4338);write(TOP);
        __CLR4_5_237o37olvicm8wh.R.inc(4339);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4340);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4341);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4342);write(FORALL);
        __CLR4_5_237o37olvicm8wh.R.inc(4343);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4344);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4345);writeRestrictionSeparator();
        __CLR4_5_237o37olvicm8wh.R.inc(4346);writeNested(axiom.getRange());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4347);
        __CLR4_5_237o37olvicm8wh.R.inc(4348);writeRangeAxiom(axiom);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4349);
        __CLR4_5_237o37olvicm8wh.R.inc(4350);writePropertyAssertion(axiom);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeFunctionalProperty(@Nonnull OWLPropertyExpression property) {try{__CLR4_5_237o37olvicm8wh.R.inc(4351);
        __CLR4_5_237o37olvicm8wh.R.inc(4352);checkNotNull(property, "property cannot be null");
        __CLR4_5_237o37olvicm8wh.R.inc(4353);write(TOP);
        __CLR4_5_237o37olvicm8wh.R.inc(4354);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4355);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4356);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4357);write(MAX);
        __CLR4_5_237o37olvicm8wh.R.inc(4358);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4359);write(1);
        __CLR4_5_237o37olvicm8wh.R.inc(4360);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4361);property.accept(this);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4362);
        __CLR4_5_237o37olvicm8wh.R.inc(4363);writeFunctionalProperty(axiom.getProperty());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4364);
        __CLR4_5_237o37olvicm8wh.R.inc(4365);axiom.getSubProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4366);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4367);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4368);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4369);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDisjointUnionAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4370);
        __CLR4_5_237o37olvicm8wh.R.inc(4371);axiom.getOWLClass().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4372);write(EQUAL);
        __CLR4_5_237o37olvicm8wh.R.inc(4373);write(axiom.getClassExpressions(), OR, false);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4374);
        __CLR4_5_237o37olvicm8wh.R.inc(4375);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4376);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4377);write(EQUIVALENT_TO);
        __CLR4_5_237o37olvicm8wh.R.inc(4378);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4379);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4380);write(INVERSE);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeSpace() {try{__CLR4_5_237o37olvicm8wh.R.inc(4381);
        __CLR4_5_237o37olvicm8wh.R.inc(4382);write(" ");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4383);
        __CLR4_5_237o37olvicm8wh.R.inc(4384);writeRangeAxiom(axiom);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4385);
        __CLR4_5_237o37olvicm8wh.R.inc(4386);writeFunctionalProperty(axiom.getProperty());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4387);
        __CLR4_5_237o37olvicm8wh.R.inc(4388);write(axiom.getProperties(), EQUIVALENT_TO, false);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLClassAssertionAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4389);
        __CLR4_5_237o37olvicm8wh.R.inc(4390);if ((((axiom.getClassExpression().isAnonymous())&&(__CLR4_5_237o37olvicm8wh.R.iget(4391)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4392)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4393);write("(");
        }
        }__CLR4_5_237o37olvicm8wh.R.inc(4394);axiom.getClassExpression().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4395);if ((((axiom.getClassExpression().isAnonymous())&&(__CLR4_5_237o37olvicm8wh.R.iget(4396)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4397)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4398);write(")");
        }
        }__CLR4_5_237o37olvicm8wh.R.inc(4399);write("(");
        __CLR4_5_237o37olvicm8wh.R.inc(4400);axiom.getIndividual().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4401);write(")");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4402);
        __CLR4_5_237o37olvicm8wh.R.inc(4403);write(axiom.getClassExpressions(), EQUIVALENT_TO, false);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4404);
        __CLR4_5_237o37olvicm8wh.R.inc(4405);writePropertyAssertion(axiom);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4406);
        __CLR4_5_237o37olvicm8wh.R.inc(4407);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4408);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4409);write(IN);
        __CLR4_5_237o37olvicm8wh.R.inc(4410);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4411);write("R");
        __CLR4_5_237o37olvicm8wh.R.inc(4412);write("\u207a");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4413);
        __CLR4_5_237o37olvicm8wh.R.inc(4414);write(TOP);
        __CLR4_5_237o37olvicm8wh.R.inc(4415);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4416);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4417);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4418);write(NOT);
        __CLR4_5_237o37olvicm8wh.R.inc(4419);write(EXISTS);
        __CLR4_5_237o37olvicm8wh.R.inc(4420);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4421);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4422);write(" .");
        __CLR4_5_237o37olvicm8wh.R.inc(4423);write(SELF);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4424);
        __CLR4_5_237o37olvicm8wh.R.inc(4425);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4426);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4427);write(DISJOINT_WITH);
        __CLR4_5_237o37olvicm8wh.R.inc(4428);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4429);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4430);write(INVERSE);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4431);
        __CLR4_5_237o37olvicm8wh.R.inc(4432);axiom.getSubProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4433);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4434);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4435);
        __CLR4_5_237o37olvicm8wh.R.inc(4436);write(TOP);
        __CLR4_5_237o37olvicm8wh.R.inc(4437);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4438);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4439);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4440);write(MAX);
        __CLR4_5_237o37olvicm8wh.R.inc(4441);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4442);write(1);
        __CLR4_5_237o37olvicm8wh.R.inc(4443);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4444);axiom.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4445);write(INVERSE);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4446);
        __CLR4_5_237o37olvicm8wh.R.inc(4447);write(axiom.getIndividuals(), EQUAL, false);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4448);
        __CLR4_5_237o37olvicm8wh.R.inc(4449);write(axiom.getPropertyChain(), COMP, false);
        __CLR4_5_237o37olvicm8wh.R.inc(4450);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4451);write(SUBCLASS);
        __CLR4_5_237o37olvicm8wh.R.inc(4452);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4453);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_237o37olvicm8wh.R.inc(4454);
        __CLR4_5_237o37olvicm8wh.R.inc(4455);OWLObject o1 = axiom.getFirstProperty();
        __CLR4_5_237o37olvicm8wh.R.inc(4456);OWLObject o2 = axiom.getSecondProperty();
        __CLR4_5_237o37olvicm8wh.R.inc(4457);OWLObject first;
        __CLR4_5_237o37olvicm8wh.R.inc(4458);OWLObject second;
        __CLR4_5_237o37olvicm8wh.R.inc(4459);if ((((isFocusedObject(o1) || !isFocusedObject(o2))&&(__CLR4_5_237o37olvicm8wh.R.iget(4460)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4461)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4462);first = o1;
            __CLR4_5_237o37olvicm8wh.R.inc(4463);second = o2;
        } }else {{
            __CLR4_5_237o37olvicm8wh.R.inc(4464);first = o2;
            __CLR4_5_237o37olvicm8wh.R.inc(4465);second = o1;
        }
        }__CLR4_5_237o37olvicm8wh.R.inc(4466);first.accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4467);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4468);write(EQUIVALENT_TO);
        __CLR4_5_237o37olvicm8wh.R.inc(4469);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4470);second.accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4471);write(INVERSE);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_237o37olvicm8wh.R.inc(4472);
        __CLR4_5_237o37olvicm8wh.R.inc(4473);write(rule.getHead(), WEDGE, false);
        __CLR4_5_237o37olvicm8wh.R.inc(4474);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4475);write(IMPLIES);
        __CLR4_5_237o37olvicm8wh.R.inc(4476);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4477);write(rule.getBody(), WEDGE, false);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4478);
        __CLR4_5_237o37olvicm8wh.R.inc(4479);if ((((ce.isOWLThing())&&(__CLR4_5_237o37olvicm8wh.R.iget(4480)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4481)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4482);write(TOP);
        } }else {__CLR4_5_237o37olvicm8wh.R.inc(4483);if ((((ce.isOWLNothing())&&(__CLR4_5_237o37olvicm8wh.R.iget(4484)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4485)==0&false))) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4486);write(BOTTOM);
        } }else {{
            __CLR4_5_237o37olvicm8wh.R.inc(4487);writeEntity(ce);
        }
    }}}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectIntersectionOf ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4488);
        __CLR4_5_237o37olvicm8wh.R.inc(4489);write(ce.getOperands(), AND, true);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectUnionOf ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4490);
        __CLR4_5_237o37olvicm8wh.R.inc(4491);write(ce.getOperands(), OR, true);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectComplementOf ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4492);
        __CLR4_5_237o37olvicm8wh.R.inc(4493);write(NOT);
        __CLR4_5_237o37olvicm8wh.R.inc(4494);writeNested(ce.getOperand());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeCardinalityRestriction(OWLDataCardinalityRestriction restriction, @Nonnull DLSyntax keyword) {try{__CLR4_5_237o37olvicm8wh.R.inc(4495);
        __CLR4_5_237o37olvicm8wh.R.inc(4496);write(keyword);
        __CLR4_5_237o37olvicm8wh.R.inc(4497);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4498);write(restriction.getCardinality());
        __CLR4_5_237o37olvicm8wh.R.inc(4499);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4500);restriction.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4501);writeRestrictionSeparator();
        __CLR4_5_237o37olvicm8wh.R.inc(4502);writeNested(restriction.getFiller());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeCardinalityRestriction(OWLObjectCardinalityRestriction restriction, @Nonnull DLSyntax keyword) {try{__CLR4_5_237o37olvicm8wh.R.inc(4503);
        __CLR4_5_237o37olvicm8wh.R.inc(4504);write(keyword);
        __CLR4_5_237o37olvicm8wh.R.inc(4505);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4506);write(restriction.getCardinality());
        __CLR4_5_237o37olvicm8wh.R.inc(4507);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4508);restriction.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4509);writeRestrictionSeparator();
        __CLR4_5_237o37olvicm8wh.R.inc(4510);writeNested(restriction.getFiller());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeQuantifiedRestriction(OWLQuantifiedDataRestriction restriction, @Nonnull DLSyntax keyword) {try{__CLR4_5_237o37olvicm8wh.R.inc(4511);
        __CLR4_5_237o37olvicm8wh.R.inc(4512);write(keyword);
        __CLR4_5_237o37olvicm8wh.R.inc(4513);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4514);restriction.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4515);writeRestrictionSeparator();
        __CLR4_5_237o37olvicm8wh.R.inc(4516);writeNested(restriction.getFiller());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private void writeQuantifiedRestriction(OWLQuantifiedObjectRestriction restriction, @Nonnull DLSyntax keyword) {try{__CLR4_5_237o37olvicm8wh.R.inc(4517);
        __CLR4_5_237o37olvicm8wh.R.inc(4518);write(keyword);
        __CLR4_5_237o37olvicm8wh.R.inc(4519);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4520);restriction.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4521);writeRestrictionSeparator();
        __CLR4_5_237o37olvicm8wh.R.inc(4522);writeNested(restriction.getFiller());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4523);
        __CLR4_5_237o37olvicm8wh.R.inc(4524);writeQuantifiedRestriction(ce, EXISTS);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4525);
        __CLR4_5_237o37olvicm8wh.R.inc(4526);writeQuantifiedRestriction(ce, FORALL);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    private <V extends OWLObject> void writeValueRestriction(OWLHasValueRestriction<V> restriction,
        OWLPropertyExpression p) {try{__CLR4_5_237o37olvicm8wh.R.inc(4527);
        __CLR4_5_237o37olvicm8wh.R.inc(4528);write(EXISTS);
        __CLR4_5_237o37olvicm8wh.R.inc(4529);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4530);p.accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4531);writeRestrictionSeparator();
        __CLR4_5_237o37olvicm8wh.R.inc(4532);write("{");
        __CLR4_5_237o37olvicm8wh.R.inc(4533);restriction.getFiller().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4534);write("}");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasValue ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4535);
        __CLR4_5_237o37olvicm8wh.R.inc(4536);writeValueRestriction(ce, ce.getProperty());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMinCardinality ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4537);
        __CLR4_5_237o37olvicm8wh.R.inc(4538);writeCardinalityRestriction(ce, MIN);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectExactCardinality ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4539);
        __CLR4_5_237o37olvicm8wh.R.inc(4540);writeCardinalityRestriction(ce, EQUAL);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectMaxCardinality ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4541);
        __CLR4_5_237o37olvicm8wh.R.inc(4542);writeCardinalityRestriction(ce, MAX);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectHasSelf ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4543);
        __CLR4_5_237o37olvicm8wh.R.inc(4544);write(EXISTS);
        __CLR4_5_237o37olvicm8wh.R.inc(4545);writeSpace();
        __CLR4_5_237o37olvicm8wh.R.inc(4546);ce.getProperty().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4547);write(" .");
        __CLR4_5_237o37olvicm8wh.R.inc(4548);write(SELF);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectOneOf ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4549);
        __CLR4_5_237o37olvicm8wh.R.inc(4550);for (Iterator<OWLIndividual> it = ce.getIndividuals().iterator(); (((it.hasNext())&&(__CLR4_5_237o37olvicm8wh.R.iget(4551)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4552)==0&false));) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4553);write("{");
            __CLR4_5_237o37olvicm8wh.R.inc(4554);it.next().accept(this);
            __CLR4_5_237o37olvicm8wh.R.inc(4555);write("}");
            __CLR4_5_237o37olvicm8wh.R.inc(4556);if ((((it.hasNext())&&(__CLR4_5_237o37olvicm8wh.R.iget(4557)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4558)==0&false))) {{
                __CLR4_5_237o37olvicm8wh.R.inc(4559);write(" ");
                __CLR4_5_237o37olvicm8wh.R.inc(4560);write(OR);
                __CLR4_5_237o37olvicm8wh.R.inc(4561);write(" ");
            }
        }}
    }}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4562);
        __CLR4_5_237o37olvicm8wh.R.inc(4563);writeQuantifiedRestriction(ce, EXISTS);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4564);
        __CLR4_5_237o37olvicm8wh.R.inc(4565);writeQuantifiedRestriction(ce, FORALL);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataHasValue ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4566);
        __CLR4_5_237o37olvicm8wh.R.inc(4567);writeValueRestriction(ce, ce.getProperty());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMinCardinality ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4568);
        __CLR4_5_237o37olvicm8wh.R.inc(4569);writeCardinalityRestriction(ce, MIN);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataExactCardinality ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4570);
        __CLR4_5_237o37olvicm8wh.R.inc(4571);writeCardinalityRestriction(ce, EQUAL);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataMaxCardinality ce) {try{__CLR4_5_237o37olvicm8wh.R.inc(4572);
        __CLR4_5_237o37olvicm8wh.R.inc(4573);writeCardinalityRestriction(ce, MAX);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4574);
        __CLR4_5_237o37olvicm8wh.R.inc(4575);write(shortFormProvider.getShortForm(node));
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataComplementOf node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4576);
        __CLR4_5_237o37olvicm8wh.R.inc(4577);write(NOT);
        __CLR4_5_237o37olvicm8wh.R.inc(4578);node.getDataRange().accept(this);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataOneOf node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4579);
        __CLR4_5_237o37olvicm8wh.R.inc(4580);for (Iterator<OWLLiteral> it = node.getValues().iterator(); (((it.hasNext())&&(__CLR4_5_237o37olvicm8wh.R.iget(4581)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4582)==0&false));) {{
            __CLR4_5_237o37olvicm8wh.R.inc(4583);write("{");
            __CLR4_5_237o37olvicm8wh.R.inc(4584);it.next().accept(this);
            __CLR4_5_237o37olvicm8wh.R.inc(4585);write("}");
            __CLR4_5_237o37olvicm8wh.R.inc(4586);if ((((it.hasNext())&&(__CLR4_5_237o37olvicm8wh.R.iget(4587)!=0|true))||(__CLR4_5_237o37olvicm8wh.R.iget(4588)==0&false))) {{
                __CLR4_5_237o37olvicm8wh.R.inc(4589);write(OR);
            }
        }}
    }}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeRestriction node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4590);}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLLiteral node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4591);
        __CLR4_5_237o37olvicm8wh.R.inc(4592);write(node.getLiteral());
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLFacetRestriction node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4593);}finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_237o37olvicm8wh.R.inc(4594);
        __CLR4_5_237o37olvicm8wh.R.inc(4595);writeEntity(property);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectInverseOf property) {try{__CLR4_5_237o37olvicm8wh.R.inc(4596);
        __CLR4_5_237o37olvicm8wh.R.inc(4597);property.getInverse().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4598);write(INVERSE);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_237o37olvicm8wh.R.inc(4599);
        __CLR4_5_237o37olvicm8wh.R.inc(4600);writeEntity(property);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_237o37olvicm8wh.R.inc(4601);
        __CLR4_5_237o37olvicm8wh.R.inc(4602);writeEntity(individual);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLClassAtom node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4603);
        __CLR4_5_237o37olvicm8wh.R.inc(4604);node.getPredicate().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4605);write("(");
        __CLR4_5_237o37olvicm8wh.R.inc(4606);node.getArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4607);write(")");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataRangeAtom node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4608);
        __CLR4_5_237o37olvicm8wh.R.inc(4609);node.getPredicate().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4610);write("(");
        __CLR4_5_237o37olvicm8wh.R.inc(4611);node.getArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4612);write(")");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLObjectPropertyAtom node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4613);
        __CLR4_5_237o37olvicm8wh.R.inc(4614);node.getPredicate().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4615);write("(");
        __CLR4_5_237o37olvicm8wh.R.inc(4616);node.getFirstArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4617);write(", ");
        __CLR4_5_237o37olvicm8wh.R.inc(4618);node.getSecondArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4619);write(")");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLDataPropertyAtom node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4620);
        __CLR4_5_237o37olvicm8wh.R.inc(4621);node.getPredicate().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4622);write("(");
        __CLR4_5_237o37olvicm8wh.R.inc(4623);node.getFirstArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4624);write(", ");
        __CLR4_5_237o37olvicm8wh.R.inc(4625);node.getSecondArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4626);write(")");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLBuiltInAtom node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4627);
        __CLR4_5_237o37olvicm8wh.R.inc(4628);write(node.getPredicate().toString());
        __CLR4_5_237o37olvicm8wh.R.inc(4629);write("(");
        __CLR4_5_237o37olvicm8wh.R.inc(4630);write(node.getArguments(), COMMA, true);
        __CLR4_5_237o37olvicm8wh.R.inc(4631);write(")");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLVariable node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4632);
        __CLR4_5_237o37olvicm8wh.R.inc(4633);write("?");
        __CLR4_5_237o37olvicm8wh.R.inc(4634);write(iriShortFormProvider.getShortForm(node.getIRI()));
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLIndividualArgument node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4635);
        __CLR4_5_237o37olvicm8wh.R.inc(4636);node.getIndividual().accept(this);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLLiteralArgument node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4637);
        __CLR4_5_237o37olvicm8wh.R.inc(4638);node.getLiteral().accept(this);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLSameIndividualAtom node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4639);
        __CLR4_5_237o37olvicm8wh.R.inc(4640);write("sameAs(");
        __CLR4_5_237o37olvicm8wh.R.inc(4641);node.getFirstArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4642);write(", ");
        __CLR4_5_237o37olvicm8wh.R.inc(4643);node.getSecondArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4644);write(")");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(SWRLDifferentIndividualsAtom node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4645);
        __CLR4_5_237o37olvicm8wh.R.inc(4646);write("differentFrom(");
        __CLR4_5_237o37olvicm8wh.R.inc(4647);node.getFirstArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4648);write(", ");
        __CLR4_5_237o37olvicm8wh.R.inc(4649);node.getSecondArgument().accept(this);
        __CLR4_5_237o37olvicm8wh.R.inc(4650);write(")");
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataIntersectionOf node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4651);
        __CLR4_5_237o37olvicm8wh.R.inc(4652);write(node.getOperands(), AND, true);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}

    @Override
    public void visit(OWLDataUnionOf node) {try{__CLR4_5_237o37olvicm8wh.R.inc(4653);
        __CLR4_5_237o37olvicm8wh.R.inc(4654);write(node.getOperands(), OR, true);
    }finally{__CLR4_5_237o37olvicm8wh.R.flushNeeded();}}
}
