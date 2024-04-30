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
package org.semanticweb.owlapi.reasoner.impl;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public final class NodeFactory {public static class __CLR4_5_23e3elvicleku{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,159,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private NodeFactory() {try{__CLR4_5_23e3elvicleku.R.inc(122);}finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return a class node */
    @Nonnull
    public static DefaultNode<OWLClass> getOWLClassNode() {try{__CLR4_5_23e3elvicleku.R.inc(123);
        __CLR4_5_23e3elvicleku.R.inc(124);return new OWLClassNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /**
     * @param cls
     *        a class to be included in the node
     * @return a class node with one element
     */
    @Nonnull
    public static DefaultNode<OWLClass> getOWLClassNode(@Nonnull OWLClass cls) {try{__CLR4_5_23e3elvicleku.R.inc(125);
        __CLR4_5_23e3elvicleku.R.inc(126);return new OWLClassNode(checkNotNull(cls, "cls cannot be null"));
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /**
     * @param clses
     *        set of classes to be included
     * @return a class node with some elements
     */
    @Nonnull
    public static DefaultNode<OWLClass> getOWLClassNode(
            @Nonnull Set<OWLClass> clses) {try{__CLR4_5_23e3elvicleku.R.inc(127);
        __CLR4_5_23e3elvicleku.R.inc(128);return new OWLClassNode(checkNotNull(clses, "clses cannot be null"));
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return the top class node */
    public static DefaultNode<OWLClass> getOWLClassTopNode() {try{__CLR4_5_23e3elvicleku.R.inc(129);
        __CLR4_5_23e3elvicleku.R.inc(130);return OWLClassNode.getTopNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return the bottom class node */
    public static DefaultNode<OWLClass> getOWLClassBottomNode() {try{__CLR4_5_23e3elvicleku.R.inc(131);
        __CLR4_5_23e3elvicleku.R.inc(132);return OWLClassNode.getBottomNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return an object property node */
    @Nonnull
    public static DefaultNode<OWLObjectPropertyExpression>
            getOWLObjectPropertyNode() {try{__CLR4_5_23e3elvicleku.R.inc(133);
        __CLR4_5_23e3elvicleku.R.inc(134);return new OWLObjectPropertyNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /**
     * @param prop
     *        a property to be added
     * @return an object property node with one element
     */
    @Nonnull
    public static DefaultNode<OWLObjectPropertyExpression>
            getOWLObjectPropertyNode(@Nonnull OWLObjectPropertyExpression prop) {try{__CLR4_5_23e3elvicleku.R.inc(135);
        __CLR4_5_23e3elvicleku.R.inc(136);return new OWLObjectPropertyNode(prop);
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /**
     * @param properties
     *        some properties to be added
     * @return an object property node with some elements
     */
    @Nonnull
    public static DefaultNode<OWLObjectPropertyExpression>
            getOWLObjectPropertyNode(
                    @Nonnull Set<OWLObjectPropertyExpression> properties) {try{__CLR4_5_23e3elvicleku.R.inc(137);
        __CLR4_5_23e3elvicleku.R.inc(138);return new OWLObjectPropertyNode(properties);
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return the top object property node */
    public static DefaultNode<OWLObjectPropertyExpression>
            getOWLObjectPropertyTopNode() {try{__CLR4_5_23e3elvicleku.R.inc(139);
        __CLR4_5_23e3elvicleku.R.inc(140);return OWLObjectPropertyNode.getTopNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return the bottom object property node */
    public static DefaultNode<OWLObjectPropertyExpression>
            getOWLObjectPropertyBottomNode() {try{__CLR4_5_23e3elvicleku.R.inc(141);
        __CLR4_5_23e3elvicleku.R.inc(142);return OWLObjectPropertyNode.getBottomNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return a data property node */
    @Nonnull
    public static DefaultNode<OWLDataProperty> getOWLDataPropertyNode() {try{__CLR4_5_23e3elvicleku.R.inc(143);
        __CLR4_5_23e3elvicleku.R.inc(144);return new OWLDataPropertyNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /**
     * @param prop
     *        a property to be added
     * @return a data property node with one element
     */
    @Nonnull
    public static DefaultNode<OWLDataProperty> getOWLDataPropertyNode(
            @Nonnull OWLDataProperty prop) {try{__CLR4_5_23e3elvicleku.R.inc(145);
        __CLR4_5_23e3elvicleku.R.inc(146);return new OWLDataPropertyNode(prop);
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /**
     * @param properties
     *        some properties to be added
     * @return a data property node with some elements
     */
    @Nonnull
    public static DefaultNode<OWLDataProperty> getOWLDataPropertyNode(
            @Nonnull Set<OWLDataProperty> properties) {try{__CLR4_5_23e3elvicleku.R.inc(147);
        __CLR4_5_23e3elvicleku.R.inc(148);return new OWLDataPropertyNode(properties);
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return the top data property node */
    public static DefaultNode<OWLDataProperty> getOWLDataPropertyTopNode() {try{__CLR4_5_23e3elvicleku.R.inc(149);
        __CLR4_5_23e3elvicleku.R.inc(150);return OWLDataPropertyNode.getTopNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return the bottom data property node */
    public static DefaultNode<OWLDataProperty> getOWLDataPropertyBottomNode() {try{__CLR4_5_23e3elvicleku.R.inc(151);
        __CLR4_5_23e3elvicleku.R.inc(152);return OWLDataPropertyNode.getBottomNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /** @return an individual node */
    @Nonnull
    public static DefaultNode<OWLNamedIndividual> getOWLNamedIndividualNode() {try{__CLR4_5_23e3elvicleku.R.inc(153);
        __CLR4_5_23e3elvicleku.R.inc(154);return new OWLNamedIndividualNode();
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /**
     * @param ind
     *        an individual to be added
     * @return an individual node with one element
     */
    @Nonnull
    public static DefaultNode<OWLNamedIndividual> getOWLNamedIndividualNode(
            @Nonnull OWLNamedIndividual ind) {try{__CLR4_5_23e3elvicleku.R.inc(155);
        __CLR4_5_23e3elvicleku.R.inc(156);return new OWLNamedIndividualNode(ind);
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}

    /**
     * @param inds
     *        some individuals to be added
     * @return an individual node containing some individuals
     */
    @Nonnull
    public static DefaultNode<OWLNamedIndividual> getOWLNamedIndividualNode(
            @Nonnull Set<OWLNamedIndividual> inds) {try{__CLR4_5_23e3elvicleku.R.inc(157);
        __CLR4_5_23e3elvicleku.R.inc(158);return new OWLNamedIndividualNode(inds);
    }finally{__CLR4_5_23e3elvicleku.R.flushNeeded();}}
}
