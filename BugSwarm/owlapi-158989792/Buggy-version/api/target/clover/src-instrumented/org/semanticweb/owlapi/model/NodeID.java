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
package org.semanticweb.owlapi.model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Nonnull;

/**
 * Represents the Node ID for anonymous individuals
 * 
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public final class NodeID implements Comparable<NodeID>, Serializable {public static class __CLR4_5_21z41z4lvickm28{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,2616,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private static final AtomicLong COUNTER = new AtomicLong();
    private static final String NODE_ID_PREFIX = "genid";
    private static final String SHARED_NODE_ID_PREFIX = "genid-nodeid-";
    private static final String PREFIX = "_:";
    private static final String PREFIX_NODE = PREFIX + NODE_ID_PREFIX;
    private static final String PREFIX_SHARED_NODE = PREFIX + SHARED_NODE_ID_PREFIX;

    /**
     * @param id
     *        the node id
     * @return string version of id
     */
    @Nonnull
    public static String nodeString(int id) {try{__CLR4_5_21z41z4lvickm28.R.inc(2560);
        __CLR4_5_21z41z4lvickm28.R.inc(2561);return PREFIX_NODE + Integer.toString(id);
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * @param id
     *        id
     * @return IRI with full node id
     */
    @Nonnull
    public static IRI nodeId(int id) {try{__CLR4_5_21z41z4lvickm28.R.inc(2562);
        __CLR4_5_21z41z4lvickm28.R.inc(2563);return IRI.create(PREFIX_NODE + Integer.toString(id));
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * @return IRI with fresh node id
     */
    @Nonnull
    public static IRI nextFreshNodeId() {try{__CLR4_5_21z41z4lvickm28.R.inc(2564);
        __CLR4_5_21z41z4lvickm28.R.inc(2565);return IRI.create(PREFIX_NODE + COUNTER.incrementAndGet());
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * Returns an absolute IRI from a nodeID attribute.
     * 
     * @param nodeID
     *        the node id
     * @return absolute IRI
     */
    @Nonnull
    public static String getIRIFromNodeID(String nodeID) {try{__CLR4_5_21z41z4lvickm28.R.inc(2566);
        __CLR4_5_21z41z4lvickm28.R.inc(2567);if ((((nodeID.startsWith(PREFIX_SHARED_NODE))&&(__CLR4_5_21z41z4lvickm28.R.iget(2568)!=0|true))||(__CLR4_5_21z41z4lvickm28.R.iget(2569)==0&false))) {{
            __CLR4_5_21z41z4lvickm28.R.inc(2570);return nodeID;
        }
        }__CLR4_5_21z41z4lvickm28.R.inc(2571);return PREFIX_SHARED_NODE + nodeID.replace(NODE_ID_PREFIX, "");
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * Generates next anonymous IRI.
     * 
     * @return absolute IRI
     */
    @Nonnull
    public static String nextAnonymousIRI() {try{__CLR4_5_21z41z4lvickm28.R.inc(2572);
        __CLR4_5_21z41z4lvickm28.R.inc(2573);return PREFIX_NODE + COUNTER.incrementAndGet();
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * Tests whether supplied IRI was generated by this parser in order to label
     * an anonymous node.
     * 
     * @param uri
     *        the IRI
     * @return {@code true} if the IRI was generated by this parser to label an
     *         anonymous node
     */
    public static boolean isAnonymousNodeIRI(String uri) {try{__CLR4_5_21z41z4lvickm28.R.inc(2574);
        __CLR4_5_21z41z4lvickm28.R.inc(2575);return uri != null && uri.startsWith(PREFIX) && uri.contains(NODE_ID_PREFIX);
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * Tests whether supplied IRI was generated by this parser in order to label
     * an anonymous node.
     * 
     * @param iri
     *        the IRI
     * @return {@code true} if the IRI was generated by this parser to label an
     *         anonymous node
     */
    public static boolean isAnonymousNodeIRI(IRI iri) {try{__CLR4_5_21z41z4lvickm28.R.inc(2576);
        __CLR4_5_21z41z4lvickm28.R.inc(2577);return iri != null && iri.getNamespace().startsWith(PREFIX) && iri.getNamespace().contains(NODE_ID_PREFIX);
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * @param iri
     *        the iri or node id
     * @return true if the iri is an anonymous label
     */
    public static boolean isAnonymousNodeID(String iri) {try{__CLR4_5_21z41z4lvickm28.R.inc(2578);
        __CLR4_5_21z41z4lvickm28.R.inc(2579);return iri != null && iri.contains(PREFIX_SHARED_NODE);
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * Gets a NodeID with a specific identifier string
     * 
     * @param id
     *        The String that identifies the node. If the String doesn't start
     *        with "_:" then this will be concatenated to the front of the
     *        specified id String; if the string is empty or null, an
     *        autogenerated id will be used.
     * @return A NodeID
     */
    @Nonnull
    public static NodeID getNodeID(String id) {try{__CLR4_5_21z41z4lvickm28.R.inc(2580);
        __CLR4_5_21z41z4lvickm28.R.inc(2581);String nonBlankId = (((id == null || id.isEmpty() )&&(__CLR4_5_21z41z4lvickm28.R.iget(2582)!=0|true))||(__CLR4_5_21z41z4lvickm28.R.iget(2583)==0&false))? nextAnonymousIRI() : id;
        __CLR4_5_21z41z4lvickm28.R.inc(2584);return new NodeID(nonBlankId);
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * @return node id with fresh id value
     */
    @Nonnull
    public static NodeID getNodeID() {try{__CLR4_5_21z41z4lvickm28.R.inc(2585);
        __CLR4_5_21z41z4lvickm28.R.inc(2586);return getNodeID(nextAnonymousIRI());
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    @Nonnull private final String id;

    private NodeID(String id) {try{__CLR4_5_21z41z4lvickm28.R.inc(2587);
        __CLR4_5_21z41z4lvickm28.R.inc(2588);if ((((id.startsWith(PREFIX))&&(__CLR4_5_21z41z4lvickm28.R.iget(2589)!=0|true))||(__CLR4_5_21z41z4lvickm28.R.iget(2590)==0&false))) {{
            __CLR4_5_21z41z4lvickm28.R.inc(2591);this.id = id;
        } }else {{
            __CLR4_5_21z41z4lvickm28.R.inc(2592);this.id = PREFIX + id;
        }
    }}finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_21z41z4lvickm28.R.inc(2593);
        __CLR4_5_21z41z4lvickm28.R.inc(2594);return id;
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    @Override
    public int compareTo(NodeID o) {try{__CLR4_5_21z41z4lvickm28.R.inc(2595);
        __CLR4_5_21z41z4lvickm28.R.inc(2596);return id.compareTo(o.toString());
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_21z41z4lvickm28.R.inc(2597);
        __CLR4_5_21z41z4lvickm28.R.inc(2598);if ((((obj == null)&&(__CLR4_5_21z41z4lvickm28.R.iget(2599)!=0|true))||(__CLR4_5_21z41z4lvickm28.R.iget(2600)==0&false))) {{
            __CLR4_5_21z41z4lvickm28.R.inc(2601);return false;
        }
        }__CLR4_5_21z41z4lvickm28.R.inc(2602);if ((((obj == this)&&(__CLR4_5_21z41z4lvickm28.R.iget(2603)!=0|true))||(__CLR4_5_21z41z4lvickm28.R.iget(2604)==0&false))) {{
            __CLR4_5_21z41z4lvickm28.R.inc(2605);return true;
        }
        }__CLR4_5_21z41z4lvickm28.R.inc(2606);if ((((!(obj instanceof NodeID))&&(__CLR4_5_21z41z4lvickm28.R.iget(2607)!=0|true))||(__CLR4_5_21z41z4lvickm28.R.iget(2608)==0&false))) {{
            __CLR4_5_21z41z4lvickm28.R.inc(2609);return false;
        }
        }__CLR4_5_21z41z4lvickm28.R.inc(2610);NodeID other = (NodeID) obj;
        __CLR4_5_21z41z4lvickm28.R.inc(2611);return id.equals(other.id);
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_21z41z4lvickm28.R.inc(2612);
        __CLR4_5_21z41z4lvickm28.R.inc(2613);return id.hashCode();
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}

    /**
     * Gets the string representation of the node ID. This will begin with _:
     * 
     * @return The string representation of the node ID.
     */
    @Nonnull
    public String getID() {try{__CLR4_5_21z41z4lvickm28.R.inc(2614);
        __CLR4_5_21z41z4lvickm28.R.inc(2615);return id;
    }finally{__CLR4_5_21z41z4lvickm28.R.flushNeeded();}}
}
