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

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 * @param <E>
 *        the type of owl objects in the node
 */
public abstract class DefaultNodeSet<E extends OWLObject> implements NodeSet<E> {public static class __CLR4_5_21k1klviclekg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Set<Node<E>> nodes = new LinkedHashSet<>();

    /** constructor for an empty node set. */
    public DefaultNodeSet() {try{__CLR4_5_21k1klviclekg.R.inc(56);}finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    /**
     * @param entity
     *        the entity to be contained
     */
    public DefaultNodeSet(@Nonnull E entity) {try{__CLR4_5_21k1klviclekg.R.inc(57);
        __CLR4_5_21k1klviclekg.R.inc(58);addNode(getNode(checkNotNull(entity, "entity cannot be null")));
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    /**
     * @param node
     *        the node to be contained
     */
    public DefaultNodeSet(@Nonnull Node<E> node) {try{__CLR4_5_21k1klviclekg.R.inc(59);
        __CLR4_5_21k1klviclekg.R.inc(60);addNode(checkNotNull(node, "node cannot be null"));
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    /**
     * @param nodes
     *        a set of nodes to be contained
     */
    public DefaultNodeSet(@Nonnull Set<Node<E>> nodes) {try{__CLR4_5_21k1klviclekg.R.inc(61);
        __CLR4_5_21k1klviclekg.R.inc(62);addAllNodes(checkNotNull(nodes, "nodes cannot be null"));
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<Node<E>> getNodes() {try{__CLR4_5_21k1klviclekg.R.inc(63);
        __CLR4_5_21k1klviclekg.R.inc(64);return CollectionFactory
                .getCopyOnRequestSetFromMutableCollection(nodes);
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    /**
     * Adds an entity to this {@code NodeSet} by wrapping it in a {@code Node}.
     * 
     * @param entity
     *        The entity to be added. The entity will be wrapped in the
     *        {@code Node} and the {@code Node} added to this set. Must not be
     *        {@code null}.
     * @throws NullPointerException
     *         if {@code entity} is {@code null}.
     */
    public void addEntity(@Nonnull E entity) {try{__CLR4_5_21k1klviclekg.R.inc(65);
        __CLR4_5_21k1klviclekg.R.inc(66);addNode(getNode(checkNotNull(entity, "entity cannot be null")));
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    /**
     * Adds a {@code Node} to this set.
     * 
     * @param node
     *        The {@code Node} to be added.
     * @throws NullPointerException
     *         if {@code entity} is {@code null}.
     */
    public void addNode(@Nonnull Node<E> node) {try{__CLR4_5_21k1klviclekg.R.inc(67);
        __CLR4_5_21k1klviclekg.R.inc(68);nodes.add(checkNotNull(node, "Cannot add null to a NodeSet"));
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    /**
     * Adds a collection of {@code Node}s to this set.
     * 
     * @param nodeset
     *        The {@code Node}s to be added. Note that if the collection is not
     *        a set then duplicate {@code Node}s will be filtered out.
     */
    public void addAllNodes(@Nonnull Collection<Node<E>> nodeset) {try{__CLR4_5_21k1klviclekg.R.inc(69);
        __CLR4_5_21k1klviclekg.R.inc(70);for (Node<E> node : nodeset) {{
            assert (((node != null)&&(__CLR4_5_21k1klviclekg.R.iget(71)!=0|true))||(__CLR4_5_21k1klviclekg.R.iget(72)==0&false));
            __CLR4_5_21k1klviclekg.R.inc(73);addNode(node);
        }
    }}finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    /**
     * Adds the set of entities as a {@code Node} to this set.
     * 
     * @param entities
     *        The set of entities to be added. The entities will be wrapped in a
     *        {@code Node} which will be added to this {@code NodeSet}.
     */
    public void addSameEntities(@Nonnull Set<E> entities) {try{__CLR4_5_21k1klviclekg.R.inc(74);
        __CLR4_5_21k1klviclekg.R.inc(75);nodes.add(getNode(entities));
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    /**
     * Adds the specified entities as {@code Node}s to this set.
     * 
     * @param entities
     *        The entities to be added. Each entity will be wrapped in a
     *        {@code Node} which will then be added to this {@code NodeSet}.
     */
    public void addDifferentEntities(@Nonnull Set<E> entities) {try{__CLR4_5_21k1klviclekg.R.inc(76);
        __CLR4_5_21k1klviclekg.R.inc(77);for (E e : entities) {{
            assert (((e != null)&&(__CLR4_5_21k1klviclekg.R.iget(78)!=0|true))||(__CLR4_5_21k1klviclekg.R.iget(79)==0&false));
            __CLR4_5_21k1klviclekg.R.inc(80);addNode(getNode(e));
        }
    }}finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Nonnull
    protected abstract DefaultNode<E> getNode(@Nonnull E entity);

    @Nonnull
    protected abstract DefaultNode<E> getNode(@Nonnull Set<E> entities);

    @Nonnull
    @Override
    public Set<E> getFlattened() {try{__CLR4_5_21k1klviclekg.R.inc(81);
        __CLR4_5_21k1klviclekg.R.inc(82);Set<E> result = new HashSet<>();
        __CLR4_5_21k1klviclekg.R.inc(83);for (Node<E> node : nodes) {{
            __CLR4_5_21k1klviclekg.R.inc(84);result.addAll(node.getEntities());
        }
        }__CLR4_5_21k1klviclekg.R.inc(85);return result;
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Override
    public boolean isEmpty() {try{__CLR4_5_21k1klviclekg.R.inc(86);
        __CLR4_5_21k1klviclekg.R.inc(87);return nodes.isEmpty();
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Override
    public boolean containsEntity(E e) {try{__CLR4_5_21k1klviclekg.R.inc(88);
        __CLR4_5_21k1klviclekg.R.inc(89);for (Node<E> node : nodes) {{
            __CLR4_5_21k1klviclekg.R.inc(90);if ((((node.contains(e))&&(__CLR4_5_21k1klviclekg.R.iget(91)!=0|true))||(__CLR4_5_21k1klviclekg.R.iget(92)==0&false))) {{
                __CLR4_5_21k1klviclekg.R.inc(93);return true;
            }
        }}
        }__CLR4_5_21k1klviclekg.R.inc(94);return false;
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Override
    public boolean isSingleton() {try{__CLR4_5_21k1klviclekg.R.inc(95);
        __CLR4_5_21k1klviclekg.R.inc(96);return nodes.size() == 1;
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Override
    public boolean isTopSingleton() {try{__CLR4_5_21k1klviclekg.R.inc(97);
        __CLR4_5_21k1klviclekg.R.inc(98);return isSingleton() && nodes.iterator().next().isTopNode();
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Override
    public boolean isBottomSingleton() {try{__CLR4_5_21k1klviclekg.R.inc(99);
        __CLR4_5_21k1klviclekg.R.inc(100);return isSingleton() && nodes.iterator().next().isBottomNode();
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Override
    public Iterator<Node<E>> iterator() {try{__CLR4_5_21k1klviclekg.R.inc(101);
        __CLR4_5_21k1klviclekg.R.inc(102);return nodes.iterator();
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_21k1klviclekg.R.inc(103);
        __CLR4_5_21k1klviclekg.R.inc(104);return "Nodeset" + nodes;
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_21k1klviclekg.R.inc(105);
        __CLR4_5_21k1klviclekg.R.inc(106);if ((((obj == null)&&(__CLR4_5_21k1klviclekg.R.iget(107)!=0|true))||(__CLR4_5_21k1klviclekg.R.iget(108)==0&false))) {{
            __CLR4_5_21k1klviclekg.R.inc(109);return false;
        }
        }__CLR4_5_21k1klviclekg.R.inc(110);if ((((obj == this)&&(__CLR4_5_21k1klviclekg.R.iget(111)!=0|true))||(__CLR4_5_21k1klviclekg.R.iget(112)==0&false))) {{
            __CLR4_5_21k1klviclekg.R.inc(113);return true;
        }
        }__CLR4_5_21k1klviclekg.R.inc(114);if ((((!(obj instanceof NodeSet))&&(__CLR4_5_21k1klviclekg.R.iget(115)!=0|true))||(__CLR4_5_21k1klviclekg.R.iget(116)==0&false))) {{
            __CLR4_5_21k1klviclekg.R.inc(117);return false;
        }
        }__CLR4_5_21k1klviclekg.R.inc(118);NodeSet<?> other = (NodeSet<?>) obj;
        __CLR4_5_21k1klviclekg.R.inc(119);return nodes.equals(other.getNodes());
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_21k1klviclekg.R.inc(120);
        __CLR4_5_21k1klviclekg.R.inc(121);return nodes.hashCode();
    }finally{__CLR4_5_21k1klviclekg.R.flushNeeded();}}
}
