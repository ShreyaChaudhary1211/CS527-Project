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
package org.semanticweb.owlapi.profiles;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * Describes a violation of an OWLProfile by an axiom. Ultimately, there may be
 * part of the axiom that violates the profile rather than the complete axiom.
 * 
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 4.0.0
 */
public abstract class OWLProfileViolation {public static class __CLR4_5_239b39blvicknsm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,4252,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    protected final OWLOntology ontology;
    @Nonnull
    protected final OWLDataFactory df;
    @Nullable
    protected final OWLAxiom axiom;
    @Nullable
    protected final Object expression;

    /**
     * @param ontology
     *        the ontology with the violation
     * @param axiom
     *        the axiom with the violation
     * @param o
     *        violation expression
     */
    public OWLProfileViolation(@Nonnull OWLOntology ontology, @Nullable OWLAxiom axiom, @Nullable Object o) {try{__CLR4_5_239b39blvicknsm.R.inc(4223);
        __CLR4_5_239b39blvicknsm.R.inc(4224);this.axiom = axiom;
        __CLR4_5_239b39blvicknsm.R.inc(4225);this.ontology = ontology;
        __CLR4_5_239b39blvicknsm.R.inc(4226);df = ontology.getOWLOntologyManager().getOWLDataFactory();
        __CLR4_5_239b39blvicknsm.R.inc(4227);expression = o;
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    /**
     * @return ontology id
     */
    public OWLOntologyID getOntologyID() {try{__CLR4_5_239b39blvicknsm.R.inc(4228);
        __CLR4_5_239b39blvicknsm.R.inc(4229);return ontology.getOntologyID();
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    /**
     * @return ontology
     */
    public OWLOntology getOntology() {try{__CLR4_5_239b39blvicknsm.R.inc(4230);
        __CLR4_5_239b39blvicknsm.R.inc(4231);return ontology;
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    /**
     * @return the expression object of this violation
     */
    @Nonnull
    public Object getExpression() {try{__CLR4_5_239b39blvicknsm.R.inc(4232);
        __CLR4_5_239b39blvicknsm.R.inc(4233);return verifyNotNull(expression);
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    /**
     * @return the offending axiom
     */
    @Nonnull
    public OWLAxiom getAxiom() {try{__CLR4_5_239b39blvicknsm.R.inc(4234);
        __CLR4_5_239b39blvicknsm.R.inc(4235);return verifyNotNull(axiom);
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    /**
     * @return a set of changes to fix the violation - it might be just an axiom
     *         removal, or a rewrite, or addition of other needed axioms.
     */
    @Nonnull
    public List<OWLOntologyChange> repair() {try{__CLR4_5_239b39blvicknsm.R.inc(4236);
        // default fix is to drop the axiom
        __CLR4_5_239b39blvicknsm.R.inc(4237);if ((((axiom != null)&&(__CLR4_5_239b39blvicknsm.R.iget(4238)!=0|true))||(__CLR4_5_239b39blvicknsm.R.iget(4239)==0&false))) {{
            __CLR4_5_239b39blvicknsm.R.inc(4240);return list(new RemoveAxiom(ontology, getAxiom()));
        }
        }__CLR4_5_239b39blvicknsm.R.inc(4241);return CollectionFactory.emptyList();
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    protected AddAxiom addDeclaration(@Nonnull OWLEntity e) {try{__CLR4_5_239b39blvicknsm.R.inc(4242);
        __CLR4_5_239b39blvicknsm.R.inc(4243);return new AddAxiom(ontology, df.getOWLDeclarationAxiom(e));
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    /**
     * visitor accept method
     * 
     * @param visitor
     *        visitor
     */
    public abstract void accept(@Nonnull OWLProfileViolationVisitor visitor);

    /**
     * @param visitor
     *        visitor
     * @param <O>
     *        visitor return type
     * @return visitor return value
     */
    @Nonnull
    public abstract <O> O accept(@Nonnull OWLProfileViolationVisitorEx<O> visitor);

    @Nonnull
    protected String toString(String template) {try{__CLR4_5_239b39blvicknsm.R.inc(4244);
        __CLR4_5_239b39blvicknsm.R.inc(4245);return String.format(template + " [%s in %s]", axiom, ontology.getOntologyID());
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    @Nonnull
    protected String toString(String template, Object object) {try{__CLR4_5_239b39blvicknsm.R.inc(4246);
        __CLR4_5_239b39blvicknsm.R.inc(4247);return String.format(template + " [%s in %s]", object, axiom, ontology.getOntologyID());
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    @Nonnull
    protected String toString(String template, Object object1, Object object2) {try{__CLR4_5_239b39blvicknsm.R.inc(4248);
        __CLR4_5_239b39blvicknsm.R.inc(4249);return String.format(template + " [%s in %s]", object1, object2, axiom, ontology.getOntologyID());
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}

    @Nonnull
    protected List<OWLOntologyChange> list(OWLOntologyChange... changes) {try{__CLR4_5_239b39blvicknsm.R.inc(4250);
        __CLR4_5_239b39blvicknsm.R.inc(4251);return CollectionFactory.list(changes);
    }finally{__CLR4_5_239b39blvicknsm.R.flushNeeded();}}
}
