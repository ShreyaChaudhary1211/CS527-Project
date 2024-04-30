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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.OWLObjectRenderer;
import org.semanticweb.owlapi.model.OWLAxiom;

/**
 * Orders an explanation in a flat list, sorting axioms alphabetically.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class AlphaExplanationOrderer implements ExplanationOrderer {public static class __CLR4_5_220v20vlviclztq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,2640,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The renderer. */
    protected final OWLObjectRenderer renderer;

    /**
     * Instantiates a new alpha explanation orderer.
     * 
     * @param renderer
     *        the renderer to use
     */
    public AlphaExplanationOrderer(@Nonnull OWLObjectRenderer renderer) {try{__CLR4_5_220v20vlviclztq.R.inc(2623);
        __CLR4_5_220v20vlviclztq.R.inc(2624);this.renderer = checkNotNull(renderer, "renderer cannot be null");
    }finally{__CLR4_5_220v20vlviclztq.R.flushNeeded();}}

    @Nonnull
    @Override
    public ExplanationTree getOrderedExplanation(OWLAxiom entailment,
            @Nonnull Set<OWLAxiom> axioms) {try{__CLR4_5_220v20vlviclztq.R.inc(2625);
        __CLR4_5_220v20vlviclztq.R.inc(2626);EntailedAxiomTree root = new EntailedAxiomTree(entailment);
        __CLR4_5_220v20vlviclztq.R.inc(2627);List<OWLAxiom> sortedAxioms = new ArrayList<>(axioms);
        __CLR4_5_220v20vlviclztq.R.inc(2628);Collections.sort(sortedAxioms, new Comparator<OWLAxiom>() {

            @Override
            public int compare(OWLAxiom o1, OWLAxiom o2) {try{__CLR4_5_220v20vlviclztq.R.inc(2629);
                assert (((o1 != null)&&(__CLR4_5_220v20vlviclztq.R.iget(2630)!=0|true))||(__CLR4_5_220v20vlviclztq.R.iget(2631)==0&false));
                assert (((o2 != null)&&(__CLR4_5_220v20vlviclztq.R.iget(2632)!=0|true))||(__CLR4_5_220v20vlviclztq.R.iget(2633)==0&false));
                __CLR4_5_220v20vlviclztq.R.inc(2634);return renderer.render(o1).compareTo(renderer.render(o2));
            }finally{__CLR4_5_220v20vlviclztq.R.flushNeeded();}}
        });
        __CLR4_5_220v20vlviclztq.R.inc(2635);for (OWLAxiom ax : sortedAxioms) {{
            assert (((ax != null)&&(__CLR4_5_220v20vlviclztq.R.iget(2636)!=0|true))||(__CLR4_5_220v20vlviclztq.R.iget(2637)==0&false));
            __CLR4_5_220v20vlviclztq.R.inc(2638);root.addChild(new ExplanationTree(ax));
        }
        }__CLR4_5_220v20vlviclztq.R.inc(2639);return root;
    }finally{__CLR4_5_220v20vlviclztq.R.flushNeeded();}}
}
