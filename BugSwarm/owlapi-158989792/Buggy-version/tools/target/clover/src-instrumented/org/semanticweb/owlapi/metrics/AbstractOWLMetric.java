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
package org.semanticweb.owlapi.metrics;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyChange;
import org.semanticweb.owlapi.model.OWLOntologyChangeListener;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.1.0
 * @param <M>
 *        the metric type
 */
public abstract class AbstractOWLMetric<M extends Serializable> implements
        OWLMetric<M>, OWLOntologyChangeListener {public static class __CLR4_5_21qg1qglviclz89{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u006f\u006f\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237269396L,8589935092L,2290,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private OWLOntology ontology;
    private boolean dirty;
    private boolean importsClosureUsed;
    private M value;

    /**
     * Instantiates a new abstract owl metric.
     * 
     * @param o
     *        the ontology to use
     */
    public AbstractOWLMetric(@Nonnull OWLOntology o) {try{__CLR4_5_21qg1qglviclz89.R.inc(2248);
        __CLR4_5_21qg1qglviclz89.R.inc(2249);ontology = checkNotNull(o, "o cannot be null");
        __CLR4_5_21qg1qglviclz89.R.inc(2250);ontology.getOWLOntologyManager().addOntologyChangeListener(this);
        __CLR4_5_21qg1qglviclz89.R.inc(2251);dirty = true;
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    @Override
    public OWLOntology getOntology() {try{__CLR4_5_21qg1qglviclz89.R.inc(2252);
        __CLR4_5_21qg1qglviclz89.R.inc(2253);return ontology;
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    @Override
    public void setOntology(OWLOntology ontology) {try{__CLR4_5_21qg1qglviclz89.R.inc(2254);
        __CLR4_5_21qg1qglviclz89.R.inc(2255);this.ontology.getOWLOntologyManager()
                .removeOntologyChangeListener(this);
        __CLR4_5_21qg1qglviclz89.R.inc(2256);this.ontology = ontology;
        __CLR4_5_21qg1qglviclz89.R.inc(2257);this.ontology.getOWLOntologyManager().addOntologyChangeListener(this);
        __CLR4_5_21qg1qglviclz89.R.inc(2258);setDirty(true);
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    /**
     * Recompute metric.
     * 
     * @return the m
     */
    @Nonnull
    protected abstract M recomputeMetric();

    @Override
    public M getValue() {try{__CLR4_5_21qg1qglviclz89.R.inc(2259);
        __CLR4_5_21qg1qglviclz89.R.inc(2260);if ((((dirty)&&(__CLR4_5_21qg1qglviclz89.R.iget(2261)!=0|true))||(__CLR4_5_21qg1qglviclz89.R.iget(2262)==0&false))) {{
            __CLR4_5_21qg1qglviclz89.R.inc(2263);value = recomputeMetric();
        }
        }__CLR4_5_21qg1qglviclz89.R.inc(2264);return verifyNotNull(value);
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    private void setDirty(boolean dirty) {try{__CLR4_5_21qg1qglviclz89.R.inc(2265);
        __CLR4_5_21qg1qglviclz89.R.inc(2266);this.dirty = dirty;
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    /**
     * Gets the ontologies.
     * 
     * @return ontologies as a set
     */
    @Nonnull
    public Set<OWLOntology> getOntologies() {try{__CLR4_5_21qg1qglviclz89.R.inc(2267);
        __CLR4_5_21qg1qglviclz89.R.inc(2268);if ((((importsClosureUsed)&&(__CLR4_5_21qg1qglviclz89.R.iget(2269)!=0|true))||(__CLR4_5_21qg1qglviclz89.R.iget(2270)==0&false))) {{
            __CLR4_5_21qg1qglviclz89.R.inc(2271);return ontology.getImportsClosure();
        } }else {{
            __CLR4_5_21qg1qglviclz89.R.inc(2272);return CollectionFactory.createSet(ontology);
        }
    }}finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    @Override
    public void ontologiesChanged(List<? extends OWLOntologyChange> changes) {try{__CLR4_5_21qg1qglviclz89.R.inc(2273);
        __CLR4_5_21qg1qglviclz89.R.inc(2274);if ((((isMetricInvalidated(changes))&&(__CLR4_5_21qg1qglviclz89.R.iget(2275)!=0|true))||(__CLR4_5_21qg1qglviclz89.R.iget(2276)==0&false))) {{
            __CLR4_5_21qg1qglviclz89.R.inc(2277);setDirty(true);
        }
    }}finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    @Override
    public OWLOntologyManager getManager() {try{__CLR4_5_21qg1qglviclz89.R.inc(2278);
        __CLR4_5_21qg1qglviclz89.R.inc(2279);return ontology.getOWLOntologyManager();
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    @Override
    public void dispose() {try{__CLR4_5_21qg1qglviclz89.R.inc(2280);
        __CLR4_5_21qg1qglviclz89.R.inc(2281);ontology.getOWLOntologyManager().removeOntologyChangeListener(this);
        __CLR4_5_21qg1qglviclz89.R.inc(2282);disposeMetric();
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    @Override
    public boolean isImportsClosureUsed() {try{__CLR4_5_21qg1qglviclz89.R.inc(2283);
        __CLR4_5_21qg1qglviclz89.R.inc(2284);return importsClosureUsed;
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    @Override
    public void setImportsClosureUsed(boolean b) {try{__CLR4_5_21qg1qglviclz89.R.inc(2285);
        __CLR4_5_21qg1qglviclz89.R.inc(2286);importsClosureUsed = b;
        __CLR4_5_21qg1qglviclz89.R.inc(2287);recomputeMetric();
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}

    /**
     * Determines if the specified list of changes will cause the value of this
     * metric to be invalid.
     * 
     * @param changes
     *        The list of changes which will be examined to determine if the
     *        metric is now invalid.
     * @return {@code true} if the metric value is invalidated by the specified
     *         list of changes, or {@code false} if the list of changes do not
     *         cause the value of this metric to be invalidated.
     */
    protected abstract boolean isMetricInvalidated(
            @Nonnull List<? extends OWLOntologyChange> changes);

    /** Dispose metric. */
    protected abstract void disposeMetric();

    @Nonnull
    @Override
    public String toString() {try{__CLR4_5_21qg1qglviclz89.R.inc(2288);
        __CLR4_5_21qg1qglviclz89.R.inc(2289);return getName() + ": " + getValue();
    }finally{__CLR4_5_21qg1qglviclz89.R.flushNeeded();}}
}
