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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.Node;

import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryInternalsImplNoCache;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 * @param <E>
 *        the type of entities in the node
 */
public abstract class DefaultNode<E extends OWLObject> implements Node<E> {public static class __CLR4_5_200lvicleia{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,56,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final OWLDataFactory DF = new OWLDataFactoryImpl(new OWLDataFactoryInternalsImplNoCache(false));
    @Nonnull
    protected static final OWLClass TOP_CLASS = DF.getOWLThing();
    @Nonnull
    protected static final OWLClassNode TOP_NODE = new OWLClassNode(TOP_CLASS);
    @Nonnull
    protected static final OWLClass BOTTOM_CLASS = DF.getOWLNothing();
    @Nonnull
    protected static final OWLClassNode BOTTOM_NODE = new OWLClassNode(BOTTOM_CLASS);
    @Nonnull
    protected static final OWLDataProperty TOP_DATA_PROPERTY = DF.getOWLTopDataProperty();
    @Nonnull
    protected static final OWLDataPropertyNode TOP_DATA_NODE = new OWLDataPropertyNode(TOP_DATA_PROPERTY);
    @Nonnull
    protected static final OWLDataProperty BOTTOM_DATA_PROPERTY = DF.getOWLBottomDataProperty();
    @Nonnull
    protected static final OWLDataPropertyNode BOTTOM_DATA_NODE = new OWLDataPropertyNode(BOTTOM_DATA_PROPERTY);
    @Nonnull
    protected static final OWLDatatype TOP_DATATYPE = DF.getTopDatatype();
    @Nonnull
    protected static final OWLObjectProperty TOP_OBJECT_PROPERTY = DF.getOWLTopObjectProperty();
    @Nonnull
    protected static final OWLObjectPropertyNode TOP_OBJECT_NODE = new OWLObjectPropertyNode(TOP_OBJECT_PROPERTY);
    @Nonnull
    protected static final OWLObjectProperty BOTTOM_OBJECT_PROPERTY = DF.getOWLBottomObjectProperty();
    @Nonnull
    protected static final OWLObjectPropertyNode BOTTOM_OBJECT_NODE = new OWLObjectPropertyNode(BOTTOM_OBJECT_PROPERTY);
    @Nonnull
    private final Set<E> entities = new HashSet<>(4);

    /**
     * @param entity
     *        the entity to add
     */
    public DefaultNode(@Nonnull E entity) {try{__CLR4_5_200lvicleia.R.inc(0);
        __CLR4_5_200lvicleia.R.inc(1);entities.add(checkNotNull(entity, "entity cannot be null"));
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    /**
     * @param entities
     *        the set of entities to add
     */
    public DefaultNode(@Nonnull Set<E> entities) {try{__CLR4_5_200lvicleia.R.inc(2);
        __CLR4_5_200lvicleia.R.inc(3);this.entities.addAll(checkNotNull(entities, "entities cannot be null"));
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    protected DefaultNode() {try{__CLR4_5_200lvicleia.R.inc(4);}finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    protected abstract E getTopEntity();

    protected abstract E getBottomEntity();

    /**
     * @param entity
     *        entity to be added
     */
    public void add(E entity) {try{__CLR4_5_200lvicleia.R.inc(5);
        __CLR4_5_200lvicleia.R.inc(6);entities.add(entity);
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Override
    public boolean isTopNode() {try{__CLR4_5_200lvicleia.R.inc(7);
        __CLR4_5_200lvicleia.R.inc(8);return entities.contains(getTopEntity());
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Override
    public boolean isBottomNode() {try{__CLR4_5_200lvicleia.R.inc(9);
        __CLR4_5_200lvicleia.R.inc(10);return entities.contains(getBottomEntity());
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<E> getEntities() {try{__CLR4_5_200lvicleia.R.inc(11);
        __CLR4_5_200lvicleia.R.inc(12);return entities;
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Override
    public int getSize() {try{__CLR4_5_200lvicleia.R.inc(13);
        __CLR4_5_200lvicleia.R.inc(14);return entities.size();
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Override
    public boolean contains(E entity) {try{__CLR4_5_200lvicleia.R.inc(15);
        __CLR4_5_200lvicleia.R.inc(16);return entities.contains(entity);
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<E> getEntitiesMinus(E e) {try{__CLR4_5_200lvicleia.R.inc(17);
        __CLR4_5_200lvicleia.R.inc(18);HashSet<E> result = new HashSet<>(entities);
        __CLR4_5_200lvicleia.R.inc(19);result.remove(e);
        __CLR4_5_200lvicleia.R.inc(20);return result;
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<E> getEntitiesMinusTop() {try{__CLR4_5_200lvicleia.R.inc(21);
        __CLR4_5_200lvicleia.R.inc(22);return getEntitiesMinus(getTopEntity());
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Nonnull
    @Override
    public Set<E> getEntitiesMinusBottom() {try{__CLR4_5_200lvicleia.R.inc(23);
        __CLR4_5_200lvicleia.R.inc(24);return getEntitiesMinus(getBottomEntity());
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Override
    public boolean isSingleton() {try{__CLR4_5_200lvicleia.R.inc(25);
        __CLR4_5_200lvicleia.R.inc(26);return entities.size() == 1;
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Nonnull
    @Override
    public E getRepresentativeElement() {try{__CLR4_5_200lvicleia.R.inc(27);
        __CLR4_5_200lvicleia.R.inc(28);return entities.iterator().next();
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Nonnull
    @Override
    public Iterator<E> iterator() {try{__CLR4_5_200lvicleia.R.inc(29);
        __CLR4_5_200lvicleia.R.inc(30);return entities.iterator();
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_200lvicleia.R.inc(31);
        __CLR4_5_200lvicleia.R.inc(32);StringBuilder sb = new StringBuilder();
        __CLR4_5_200lvicleia.R.inc(33);sb.append("Node( ");
        __CLR4_5_200lvicleia.R.inc(34);for (OWLObject entity : entities) {{
            __CLR4_5_200lvicleia.R.inc(35);sb.append(entity);
            __CLR4_5_200lvicleia.R.inc(36);sb.append(' ');
        }
        }__CLR4_5_200lvicleia.R.inc(37);sb.append(')');
        __CLR4_5_200lvicleia.R.inc(38);return verifyNotNull(sb.toString());
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_200lvicleia.R.inc(39);
        __CLR4_5_200lvicleia.R.inc(40);if ((((obj == null)&&(__CLR4_5_200lvicleia.R.iget(41)!=0|true))||(__CLR4_5_200lvicleia.R.iget(42)==0&false))) {{
            __CLR4_5_200lvicleia.R.inc(43);return false;
        }
        }__CLR4_5_200lvicleia.R.inc(44);if ((((obj == this)&&(__CLR4_5_200lvicleia.R.iget(45)!=0|true))||(__CLR4_5_200lvicleia.R.iget(46)==0&false))) {{
            __CLR4_5_200lvicleia.R.inc(47);return true;
        }
        }__CLR4_5_200lvicleia.R.inc(48);if ((((!(obj instanceof Node))&&(__CLR4_5_200lvicleia.R.iget(49)!=0|true))||(__CLR4_5_200lvicleia.R.iget(50)==0&false))) {{
            __CLR4_5_200lvicleia.R.inc(51);return false;
        }
        }__CLR4_5_200lvicleia.R.inc(52);Node<?> other = (Node<?>) obj;
        __CLR4_5_200lvicleia.R.inc(53);return entities.equals(other.getEntities());
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_200lvicleia.R.inc(54);
        __CLR4_5_200lvicleia.R.inc(55);return entities.hashCode();
    }finally{__CLR4_5_200lvicleia.R.flushNeeded();}}
}
