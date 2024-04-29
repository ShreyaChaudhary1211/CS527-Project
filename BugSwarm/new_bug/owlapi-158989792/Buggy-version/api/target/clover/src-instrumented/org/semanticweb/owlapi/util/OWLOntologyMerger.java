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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologySetProvider;

/**
 * A very very simple merger, which just creates an ontology which contains the
 * union of axioms from a set of ontologies.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLOntologyMerger implements OWLAxiomFilter {public static class __CLR4_5_2ao6ao6lvickrj2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,13868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OWLOntologySetProvider setProvider;
    private final OWLAxiomFilter axiomFilter;
    private final boolean mergeOnlyLogicalAxioms;

    /**
     * @param setProvider
     *        the ontology provider
     */
    public OWLOntologyMerger(@Nonnull OWLOntologySetProvider setProvider) {try{__CLR4_5_2ao6ao6lvickrj2.R.inc(13830);
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13831);this.setProvider = checkNotNull(setProvider,
                "setProvider cannot be null");
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13832);axiomFilter = this;
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13833);mergeOnlyLogicalAxioms = false;
    }finally{__CLR4_5_2ao6ao6lvickrj2.R.flushNeeded();}}

    /**
     * @param setProvider
     *        the ontology provider
     * @param mergeOnlyLogicalAxioms
     *        true if only logical axioms should be included
     */
    public OWLOntologyMerger(@Nonnull OWLOntologySetProvider setProvider,
            boolean mergeOnlyLogicalAxioms) {try{__CLR4_5_2ao6ao6lvickrj2.R.inc(13834);
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13835);this.setProvider = checkNotNull(setProvider,
                "setProvider cannot be null");
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13836);this.mergeOnlyLogicalAxioms = mergeOnlyLogicalAxioms;
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13837);axiomFilter = this;
    }finally{__CLR4_5_2ao6ao6lvickrj2.R.flushNeeded();}}

    /**
     * @param setProvider
     *        the ontology provider
     * @param axiomFilter
     *        the filter to use
     */
    public OWLOntologyMerger(@Nonnull OWLOntologySetProvider setProvider,
            OWLAxiomFilter axiomFilter) {try{__CLR4_5_2ao6ao6lvickrj2.R.inc(13838);
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13839);this.setProvider = checkNotNull(setProvider,
                "setProvider cannot be null");
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13840);this.axiomFilter = axiomFilter;
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13841);mergeOnlyLogicalAxioms = false;
    }finally{__CLR4_5_2ao6ao6lvickrj2.R.flushNeeded();}}

    /**
     * @param ontologyManager
     *        the manager containing the ontologies
     * @param ontologyIRI
     *        the new ontology IRI
     * @return the new ontology
     * @throws OWLOntologyCreationException
     *         if any creation exception arises
     */
    public OWLOntology createMergedOntology(OWLOntologyManager ontologyManager,
            @Nullable IRI ontologyIRI) throws OWLOntologyCreationException {try{__CLR4_5_2ao6ao6lvickrj2.R.inc(13842);
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13843);OWLOntology ontology;
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13844);if ((((ontologyIRI != null)&&(__CLR4_5_2ao6ao6lvickrj2.R.iget(13845)!=0|true))||(__CLR4_5_2ao6ao6lvickrj2.R.iget(13846)==0&false))) {{
            __CLR4_5_2ao6ao6lvickrj2.R.inc(13847);ontology = ontologyManager.createOntology(ontologyIRI);
        } }else {{
            __CLR4_5_2ao6ao6lvickrj2.R.inc(13848);ontology = ontologyManager.createOntology();
        }
        }__CLR4_5_2ao6ao6lvickrj2.R.inc(13849);List<AddAxiom> changes = new ArrayList<>();
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13850);for (OWLOntology ont : setProvider.getOntologies()) {{
            __CLR4_5_2ao6ao6lvickrj2.R.inc(13851);for (OWLAxiom ax : getAxioms(ont)) {{
                assert (((ax != null)&&(__CLR4_5_2ao6ao6lvickrj2.R.iget(13852)!=0|true))||(__CLR4_5_2ao6ao6lvickrj2.R.iget(13853)==0&false));
                __CLR4_5_2ao6ao6lvickrj2.R.inc(13854);if ((((axiomFilter.passes(ax))&&(__CLR4_5_2ao6ao6lvickrj2.R.iget(13855)!=0|true))||(__CLR4_5_2ao6ao6lvickrj2.R.iget(13856)==0&false))) {{
                    __CLR4_5_2ao6ao6lvickrj2.R.inc(13857);changes.add(new AddAxiom(ontology, ax));
                }
            }}
        }}
        }__CLR4_5_2ao6ao6lvickrj2.R.inc(13858);ontologyManager.applyChanges(changes);
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13859);return ontology;
    }finally{__CLR4_5_2ao6ao6lvickrj2.R.flushNeeded();}}

    private Set<? extends OWLAxiom> getAxioms(OWLOntology ont) {try{__CLR4_5_2ao6ao6lvickrj2.R.inc(13860);
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13861);if ((((mergeOnlyLogicalAxioms)&&(__CLR4_5_2ao6ao6lvickrj2.R.iget(13862)!=0|true))||(__CLR4_5_2ao6ao6lvickrj2.R.iget(13863)==0&false))) {{
            __CLR4_5_2ao6ao6lvickrj2.R.inc(13864);return ont.getLogicalAxioms();
        } }else {{
            __CLR4_5_2ao6ao6lvickrj2.R.inc(13865);return ont.getAxioms();
        }
    }}finally{__CLR4_5_2ao6ao6lvickrj2.R.flushNeeded();}}

    @Override
    public boolean passes(OWLAxiom axiom) {try{__CLR4_5_2ao6ao6lvickrj2.R.inc(13866);
        __CLR4_5_2ao6ao6lvickrj2.R.inc(13867);return true;
    }finally{__CLR4_5_2ao6ao6lvickrj2.R.flushNeeded();}}
}
