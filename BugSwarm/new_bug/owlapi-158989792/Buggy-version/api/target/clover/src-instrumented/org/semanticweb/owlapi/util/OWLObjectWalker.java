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
package org.semanticweb.owlapi.util;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;
import static org.semanticweb.owlapi.util.StructureWalker.AnnotationWalkingControl.WALK_ONTOLOGY_ANNOTATIONS_ONLY;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.StructureWalker.AnnotationWalkingControl;

/**
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 * @param <O>
 *        the returned type
 */
public class OWLObjectWalker<O extends OWLObject> {public static class __CLR4_5_2ajxajxlvickrhj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,13753,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected OWLOntology ontology;
    private final Collection<O> objects;
    @Nullable
    protected OWLObjectVisitor visitor;
    @Nullable
    private OWLObjectVisitorEx<?> visitorEx;
    protected final boolean visitDuplicates;
    protected OWLAxiom ax;
    protected OWLAnnotation annotation;
    private final List<OWLClassExpression> classExpressionPath = new ArrayList<>();
    private final List<OWLDataRange> dataRangePath = new ArrayList<>();
    @Nonnull
    private StructureWalker<O> walker;

    /**
     * @param objects
     *        the set of objects to visit Visit duplicates. Only walk ontology
     *        anotations.
     */
    public OWLObjectWalker(@Nonnull Set<O> objects) {
        this(objects, WALK_ONTOLOGY_ANNOTATIONS_ONLY);__CLR4_5_2ajxajxlvickrhj.R.inc(13678);try{__CLR4_5_2ajxajxlvickrhj.R.inc(13677);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param objects
     *        the list of objects to visit
     */
    public OWLObjectWalker(@Nonnull List<O> objects) {
        this(objects, WALK_ONTOLOGY_ANNOTATIONS_ONLY);__CLR4_5_2ajxajxlvickrhj.R.inc(13680);try{__CLR4_5_2ajxajxlvickrhj.R.inc(13679);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param visitDuplicates
     *        true if duplicates should be visited
     * @param objects
     *        the set of objects to visit Only walk ontology annotations.
     */
    public OWLObjectWalker(@Nonnull Set<O> objects, boolean visitDuplicates) {
        this(objects, visitDuplicates, WALK_ONTOLOGY_ANNOTATIONS_ONLY);__CLR4_5_2ajxajxlvickrhj.R.inc(13682);try{__CLR4_5_2ajxajxlvickrhj.R.inc(13681);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param visitDuplicates
     *        true if duplicates should be visited
     * @param objects
     *        the list of objects to visit
     */
    public OWLObjectWalker(@Nonnull List<O> objects, boolean visitDuplicates) {
        this(objects, visitDuplicates, WALK_ONTOLOGY_ANNOTATIONS_ONLY);__CLR4_5_2ajxajxlvickrhj.R.inc(13684);try{__CLR4_5_2ajxajxlvickrhj.R.inc(13683);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param objects
     *        objects to walk
     * @param walkFlag
     *        walking flag
     */
    public OWLObjectWalker(@Nonnull Set<O> objects, AnnotationWalkingControl walkFlag) {
        this(objects, true, walkFlag);__CLR4_5_2ajxajxlvickrhj.R.inc(13686);try{__CLR4_5_2ajxajxlvickrhj.R.inc(13685);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param objects
     *        objects to walk
     * @param walkFlag
     *        walking flag
     */
    public OWLObjectWalker(@Nonnull List<O> objects, AnnotationWalkingControl walkFlag) {
        this(objects, true, walkFlag);__CLR4_5_2ajxajxlvickrhj.R.inc(13688);try{__CLR4_5_2ajxajxlvickrhj.R.inc(13687);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param objects
     *        objects to walk
     * @param visitDuplicates
     *        true if duplicates should be visited
     * @param walkFlag
     *        walking flag
     */
    public OWLObjectWalker(@Nonnull Set<O> objects, boolean visitDuplicates, AnnotationWalkingControl walkFlag) {
        this(new ArrayList<>(checkNotNull(objects, "objects cannot be null")), visitDuplicates, walkFlag);__CLR4_5_2ajxajxlvickrhj.R.inc(13690);try{__CLR4_5_2ajxajxlvickrhj.R.inc(13689);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param objects
     *        objects to walk
     * @param visitDuplicates
     *        true if duplicates should be visited
     * @param walkFlag
     *        walking flag
     */
    public OWLObjectWalker(@Nonnull List<O> objects, boolean visitDuplicates, AnnotationWalkingControl walkFlag) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13691);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13692);this.objects = checkNotNull(objects, "objects cannot be null");
        __CLR4_5_2ajxajxlvickrhj.R.inc(13693);this.visitDuplicates = visitDuplicates;
        __CLR4_5_2ajxajxlvickrhj.R.inc(13694);this.walker = new StructureWalker<>(this, walkFlag);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    protected Object passToVisitor(OWLObject o) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13695);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13696);if ((((visitor != null)&&(__CLR4_5_2ajxajxlvickrhj.R.iget(13697)!=0|true))||(__CLR4_5_2ajxajxlvickrhj.R.iget(13698)==0&false))) {{
            __CLR4_5_2ajxajxlvickrhj.R.inc(13699);o.accept(visitor);
            __CLR4_5_2ajxajxlvickrhj.R.inc(13700);return null;
        } }else {{
            assert (((visitorEx != null)&&(__CLR4_5_2ajxajxlvickrhj.R.iget(13701)!=0|true))||(__CLR4_5_2ajxajxlvickrhj.R.iget(13702)==0&false));
            __CLR4_5_2ajxajxlvickrhj.R.inc(13703);return o.accept(visitorEx);
        }
    }}finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    protected void setVisitor(OWLObjectVisitorEx<?> visitor) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13704);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13705);visitorEx = visitor;
        __CLR4_5_2ajxajxlvickrhj.R.inc(13706);this.visitor = null;
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    protected void setVisitor(OWLObjectVisitor visitor) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13707);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13708);this.visitor = visitor;
        __CLR4_5_2ajxajxlvickrhj.R.inc(13709);visitorEx = null;
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param walker
     *        the structure walker to use with this object walker
     */
    public void setStructureWalker(@Nonnull StructureWalker<O> walker) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13710);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13711);this.walker = walker;
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param v
     *        visitor to use over the objects
     */
    public void walkStructure(@Nonnull OWLObjectVisitorEx<?> v) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13712);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13713);setVisitor(checkNotNull(v, "v cannot be null"));
        __CLR4_5_2ajxajxlvickrhj.R.inc(13714);for (O o : objects) {{
            __CLR4_5_2ajxajxlvickrhj.R.inc(13715);o.accept(walker);
        }
    }}finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * @param v
     *        visitor to use over the objects
     */
    public void walkStructure(@Nonnull OWLObjectVisitor v) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13716);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13717);setVisitor(checkNotNull(v, "v cannot be null"));
        __CLR4_5_2ajxajxlvickrhj.R.inc(13718);for (O o : objects) {{
            __CLR4_5_2ajxajxlvickrhj.R.inc(13719);o.accept(walker);
        }
    }}finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Gets the last ontology to be visited.
     * 
     * @return The last ontology to be visited
     */
    @Nullable
    public OWLOntology getOntology() {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13720);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13721);return ontology;
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Gets the last axiom to be visited.
     * 
     * @return The last axiom to be visited, or {@code null} if an axiom has not
     *         be visited
     */
    public OWLAxiom getAxiom() {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13722);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13723);return ax;
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Gets the last annotation to be visited.
     * 
     * @return The last annotation to be visited (may be {@code null})
     */
    public OWLAnnotation getAnnotation() {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13724);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13725);return annotation;
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Gets the current class expression path. The current class expression path
     * is a list of class expressions that represents the containing expressions
     * for the current class expressions. The first item in the path (list) is
     * the root class expression that was visited. For i between 0 and
     * pathLength, the item at index i+1 is a direct sub-expression of the item
     * at index i. The last item in the path is the current class expression
     * being visited.
     * 
     * @return A list of class expressions that represents the path of class
     *         expressions, with the root of the class expression being the
     *         first element in the list.
     */
    @Nonnull
    public List<OWLClassExpression> getClassExpressionPath() {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13726);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13727);return new ArrayList<>(classExpressionPath);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Determines if a particular class expression is the first (or root) class
     * expression in the current class expression path.
     * 
     * @param classExpression
     *        The class expression
     * @return {@code true} if the specified class expression is the first class
     *         expression in the current class expression path, otherwise
     *         {@code false} ({@code false} if the path is empty)
     */
    public boolean isFirstClassExpressionInPath(@Nonnull OWLClassExpression classExpression) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13728);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13729);checkNotNull(classExpression, "classExpression cannot be null");
        __CLR4_5_2ajxajxlvickrhj.R.inc(13730);return !classExpressionPath.isEmpty() && classExpressionPath.get(0).equals(classExpression);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Pushes a class expression onto the class expression path.
     * 
     * @param ce
     *        The class expression to be pushed onto the path
     */
    protected void pushClassExpression(@Nonnull OWLClassExpression ce) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13731);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13732);checkNotNull(ce, "ce cannot be null");
        __CLR4_5_2ajxajxlvickrhj.R.inc(13733);classExpressionPath.add(ce);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Pops a class expression from the class expression path. If the path is
     * empty then this method has no effect.
     */
    protected void popClassExpression() {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13734);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13735);if ((((!classExpressionPath.isEmpty())&&(__CLR4_5_2ajxajxlvickrhj.R.iget(13736)!=0|true))||(__CLR4_5_2ajxajxlvickrhj.R.iget(13737)==0&false))) {{
            __CLR4_5_2ajxajxlvickrhj.R.inc(13738);classExpressionPath.remove(classExpressionPath.size() - 1);
        }
    }}finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Gets the current data range path. The current data range path is a list
     * of data ranges that represents the containing expressions for the current
     * data ranges. The first item in the path (list) is the root data range
     * that was visited. For i between 0 and pathLength, the item at index i+1
     * is a direct sub-expression of the item at index i. The last item in the
     * path is the current data range being visited.
     * 
     * @return A list of data ranges that represents the path of data ranges,
     *         with the root of the data range being the first element in the
     *         list.
     */
    @Nonnull
    public List<OWLDataRange> getDataRangePath() {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13739);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13740);return new ArrayList<>(dataRangePath);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Pushes a data range on to the data range path.
     * 
     * @param dr
     *        The data range to be pushed onto the path
     */
    protected void pushDataRange(@Nonnull OWLDataRange dr) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13741);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13742);checkNotNull(dr, "dr cannot be null");
        __CLR4_5_2ajxajxlvickrhj.R.inc(13743);dataRangePath.add(dr);
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Pops a data range from the data range expression path. If the path is
     * empty then this method has no effect.
     */
    protected void popDataRange() {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13744);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13745);if ((((!dataRangePath.isEmpty())&&(__CLR4_5_2ajxajxlvickrhj.R.iget(13746)!=0|true))||(__CLR4_5_2ajxajxlvickrhj.R.iget(13747)==0&false))) {{
            __CLR4_5_2ajxajxlvickrhj.R.inc(13748);dataRangePath.remove(dataRangePath.size() - 1);
        }
    }}finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Allow the structure walker to set the current axiom
     * 
     * @param axiom
     *        the axiom to set
     */
    public void setAxiom(OWLAxiom axiom) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13749);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13750);ax = axiom;
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}

    /**
     * Allow the structure walker to set the current annotation
     * 
     * @param node
     *        the annotation to set
     */
    public void setAnnotation(OWLAnnotation node) {try{__CLR4_5_2ajxajxlvickrhj.R.inc(13751);
        __CLR4_5_2ajxajxlvickrhj.R.inc(13752);annotation = node;
    }finally{__CLR4_5_2ajxajxlvickrhj.R.flushNeeded();}}
}
