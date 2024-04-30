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
package uk.ac.manchester.cs.owl.explanation.ordering;

import java.io.PrintWriter;
import java.util.*;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 * @param <N>
 *        type of elements
 */
public class MutableTree<N> implements Tree<N> {public static class __CLR4_5_22cq2cqlvicm02i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,3188,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final N userObject;
    private MutableTree<N> parent;
    private final List<MutableTree<N>> children;
    private final Map<Tree<N>, Object> child2EdgeMap;
    private NodeRenderer<N> toStringRenderer;

    /**
     * @param userObject
     *        the user object
     */
    public MutableTree(N userObject) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3050);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3051);this.userObject = userObject;
        __CLR4_5_22cq2cqlvicm02i.R.inc(3052);children = new ArrayList<>();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3053);child2EdgeMap = new HashMap<>();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3054);toStringRenderer = new NodeRenderer<N>() {

            @Override
            public String render(Tree<N> object) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3055);
                __CLR4_5_22cq2cqlvicm02i.R.inc(3056);return object.toString();
            }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}
        };
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public N getUserObject() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3057);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3058);return userObject;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    /**
     * @param parent
     *        the new parent
     */
    public void setParent(MutableTree<N> parent) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3059);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3060);if ((((this.parent != null)&&(__CLR4_5_22cq2cqlvicm02i.R.iget(3061)!=0|true))||(__CLR4_5_22cq2cqlvicm02i.R.iget(3062)==0&false))) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3063);this.parent.children.remove(this);
        }
        }__CLR4_5_22cq2cqlvicm02i.R.inc(3064);this.parent = parent;
        __CLR4_5_22cq2cqlvicm02i.R.inc(3065);this.parent.children.add(this);
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    /**
     * @param child
     *        child to add
     */
    public void addChild(MutableTree<N> child) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3066);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3067);children.add(child);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3068);child.parent = this;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    /**
     * @param child
     *        child to add
     * @param edge
     *        the edge
     */
    public void addChild(MutableTree<N> child, Object edge) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3069);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3070);addChild(child);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3071);child2EdgeMap.put(child, edge);
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    /**
     * @param child
     *        child to remove
     */
    public void removeChild(MutableTree<N> child) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3072);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3073);children.remove(child);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3074);child.parent = null;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public Object getEdge(Tree<N> child) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3075);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3076);return child2EdgeMap.get(child);
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public void sortChildren(Comparator<Tree<N>> comparator) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3077);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3078);Collections.sort(children, comparator);
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    /** remove all children. */
    public void clearChildren() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3079);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3080);for (MutableTree<N> child : new ArrayList<>(children)) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3081);removeChild(child);
        }
    }}finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public Tree<N> getParent() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3082);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3083);return parent;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public List<Tree<N>> getChildren() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3084);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3085);return new ArrayList<Tree<N>>(children);
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public int getChildCount() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3086);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3087);return children.size();
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public boolean isRoot() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3088);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3089);return parent == null;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public boolean isLeaf() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3090);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3091);return children.isEmpty();
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public Tree<N> getRoot() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3092);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3093);if ((((parent == null)&&(__CLR4_5_22cq2cqlvicm02i.R.iget(3094)!=0|true))||(__CLR4_5_22cq2cqlvicm02i.R.iget(3095)==0&false))) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3096);return this;
        }
        }__CLR4_5_22cq2cqlvicm02i.R.inc(3097);return parent.getRoot();
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public List<Tree<N>> getPathToRoot() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3098);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3099);List<Tree<N>> path = new ArrayList<>();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3100);path.add(0, this);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3101);Tree<N> par = parent;
        __CLR4_5_22cq2cqlvicm02i.R.inc(3102);while ((((par != null)&&(__CLR4_5_22cq2cqlvicm02i.R.iget(3103)!=0|true))||(__CLR4_5_22cq2cqlvicm02i.R.iget(3104)==0&false))) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3105);path.add(0, par);
            __CLR4_5_22cq2cqlvicm02i.R.inc(3106);par = par.getParent();
        }
        }__CLR4_5_22cq2cqlvicm02i.R.inc(3107);return path;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public List<N> getUserObjectPathToRoot() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3108);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3109);List<N> path = new ArrayList<>();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3110);path.add(0, this.getUserObject());
        __CLR4_5_22cq2cqlvicm02i.R.inc(3111);Tree<N> par = parent;
        __CLR4_5_22cq2cqlvicm02i.R.inc(3112);while ((((par != null)&&(__CLR4_5_22cq2cqlvicm02i.R.iget(3113)!=0|true))||(__CLR4_5_22cq2cqlvicm02i.R.iget(3114)==0&false))) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3115);path.add(0, par.getUserObject());
            __CLR4_5_22cq2cqlvicm02i.R.inc(3116);par = par.getParent();
        }
        }__CLR4_5_22cq2cqlvicm02i.R.inc(3117);return path;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public Set<N> getUserObjectClosure() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3118);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3119);Set<N> objects = new HashSet<>();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3120);getUserObjectClosure(this, objects);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3121);return objects;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    private void getUserObjectClosure(Tree<N> tree, Set<N> bin) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3122);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3123);bin.add(tree.getUserObject());
        __CLR4_5_22cq2cqlvicm02i.R.inc(3124);for (Tree<N> child : tree.getChildren()) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3125);getUserObjectClosure(child, bin);
        }
    }}finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public void dump(PrintWriter writer) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3126);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3127);dump(writer, 0);
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public void dump(PrintWriter writer, int indent) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3128);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3129);int depth = getPathToRoot().size();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3130);StringBuilder sb = new StringBuilder();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3131);for (int i = 0; (((i < depth + indent)&&(__CLR4_5_22cq2cqlvicm02i.R.iget(3132)!=0|true))||(__CLR4_5_22cq2cqlvicm02i.R.iget(3133)==0&false)); i++) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3134);sb.append("\t");
        }
        }__CLR4_5_22cq2cqlvicm02i.R.inc(3135);writer.print(sb.toString());
        __CLR4_5_22cq2cqlvicm02i.R.inc(3136);String ren = toStringRenderer.render(this);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3137);ren = ren.replace("\n", "\n" + sb);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3138);writer.println(ren);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3139);for (Tree<N> child : getChildren()) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3140);Object edge = getEdge(child);
            __CLR4_5_22cq2cqlvicm02i.R.inc(3141);if ((((edge != null)&&(__CLR4_5_22cq2cqlvicm02i.R.iget(3142)!=0|true))||(__CLR4_5_22cq2cqlvicm02i.R.iget(3143)==0&false))) {{
                __CLR4_5_22cq2cqlvicm02i.R.inc(3144);writer.print(sb.toString());
                __CLR4_5_22cq2cqlvicm02i.R.inc(3145);writer.print("--- ");
                __CLR4_5_22cq2cqlvicm02i.R.inc(3146);writer.print(edge);
                __CLR4_5_22cq2cqlvicm02i.R.inc(3147);writer.print(" ---\n\n");
            }
            }__CLR4_5_22cq2cqlvicm02i.R.inc(3148);child.dump(writer, indent);
        }
        }__CLR4_5_22cq2cqlvicm02i.R.inc(3149);writer.flush();
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public void setNodeRenderer(NodeRenderer<N> renderer) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3150);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3151);this.toStringRenderer = renderer;
        __CLR4_5_22cq2cqlvicm02i.R.inc(3152);for (Tree<N> child : children) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3153);child.setNodeRenderer(toStringRenderer);
        }
    }}finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public List<N> fillDepthFirst() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3154);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3155);List<N> results = new ArrayList<>();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3156);fillDepthFirst(this, results);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3157);return results;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    private void fillDepthFirst(Tree<N> tree, List<N> bin) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3158);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3159);bin.add(tree.getUserObject());
        __CLR4_5_22cq2cqlvicm02i.R.inc(3160);for (Tree<N> child : tree.getChildren()) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3161);fillDepthFirst(child, bin);
        }
    }}finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    /**
     * @param tree
     *        the node to put in place of this one
     */
    public void replace(MutableTree<N> tree) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3162);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3163);parent.children.remove(this);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3164);parent.children.add(tree);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3165);parent = null;
        __CLR4_5_22cq2cqlvicm02i.R.inc(3166);tree.children.clear();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3167);tree.children.addAll(children);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3168);children.clear();
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3169);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3170);if ((((userObject != null)&&(__CLR4_5_22cq2cqlvicm02i.R.iget(3171)!=0|true))||(__CLR4_5_22cq2cqlvicm02i.R.iget(3172)==0&false))) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3173);return userObject.toString();
        } }else {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3174);return "";
        }
    }}finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    /**
     * @return the size
     */
    public int getSize() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3175);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3176);return getUserObjectClosure().size();
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    /**
     * @return the max depth
     */
    public int getMaxDepth() {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3177);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3178);return getMaxDepth(this);
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}

    private int getMaxDepth(Tree<N> tree) {try{__CLR4_5_22cq2cqlvicm02i.R.inc(3179);
        __CLR4_5_22cq2cqlvicm02i.R.inc(3180);int maxChildDepth = tree.getPathToRoot().size();
        __CLR4_5_22cq2cqlvicm02i.R.inc(3181);for (Tree<N> child : tree.getChildren()) {{
            __CLR4_5_22cq2cqlvicm02i.R.inc(3182);int childDepth = getMaxDepth(child);
            __CLR4_5_22cq2cqlvicm02i.R.inc(3183);if ((((childDepth > maxChildDepth)&&(__CLR4_5_22cq2cqlvicm02i.R.iget(3184)!=0|true))||(__CLR4_5_22cq2cqlvicm02i.R.iget(3185)==0&false))) {{
                __CLR4_5_22cq2cqlvicm02i.R.inc(3186);maxChildDepth = childDepth;
            }
        }}
        }__CLR4_5_22cq2cqlvicm02i.R.inc(3187);return maxChildDepth;
    }finally{__CLR4_5_22cq2cqlvicm02i.R.flushNeeded();}}
}
