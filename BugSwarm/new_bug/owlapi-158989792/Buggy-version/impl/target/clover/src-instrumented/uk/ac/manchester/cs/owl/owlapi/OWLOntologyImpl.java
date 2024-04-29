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
package uk.ac.manchester.cs.owl.owlapi;

import static org.semanticweb.owlapi.model.parameters.ChangeApplied.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.ChangeApplied;

import com.google.inject.assistedinject.Assisted;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLOntologyImpl extends OWLImmutableOntologyImpl implements
    OWLMutableOntology, Serializable {public static class __CLR4_5_27p87p8lviclgg9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,10043,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * @param manager
     *        ontology manager
     * @param ontologyID
     *        ontology id
     */
    @Inject
    public OWLOntologyImpl(@Nonnull OWLOntologyManager manager,
        @Nonnull @Assisted OWLOntologyID ontologyID) {
        super(manager, ontologyID);__CLR4_5_27p87p8lviclgg9.R.inc(9981);try{__CLR4_5_27p87p8lviclgg9.R.inc(9980);
    }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

    @Override
    public ChangeApplied applyChange(@Nonnull OWLOntologyChange change) {try{__CLR4_5_27p87p8lviclgg9.R.inc(9982);
        __CLR4_5_27p87p8lviclgg9.R.inc(9983);OWLOntologyChangeFilter changeFilter = new OWLOntologyChangeFilter();
        __CLR4_5_27p87p8lviclgg9.R.inc(9984);return change.accept(changeFilter);
    }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

    @Nonnull
    @Override
    public ChangeApplied applyChanges(
        @Nonnull List<? extends OWLOntologyChange> changes) {try{__CLR4_5_27p87p8lviclgg9.R.inc(9985);
        __CLR4_5_27p87p8lviclgg9.R.inc(9986);ChangeApplied appliedChanges = SUCCESSFULLY;
        __CLR4_5_27p87p8lviclgg9.R.inc(9987);OWLOntologyChangeFilter changeFilter = new OWLOntologyChangeFilter();
        __CLR4_5_27p87p8lviclgg9.R.inc(9988);for (OWLOntologyChange change : changes) {{
            __CLR4_5_27p87p8lviclgg9.R.inc(9989);ChangeApplied result = change.accept(changeFilter);
            __CLR4_5_27p87p8lviclgg9.R.inc(9990);if ((((appliedChanges == SUCCESSFULLY)&&(__CLR4_5_27p87p8lviclgg9.R.iget(9991)!=0|true))||(__CLR4_5_27p87p8lviclgg9.R.iget(9992)==0&false))) {{
                // overwrite only if appliedChanges is still successful. If one
                // change has been unsuccessful, we want to preserve that
                // information
                __CLR4_5_27p87p8lviclgg9.R.inc(9993);appliedChanges = result;
            }
        }}
        }__CLR4_5_27p87p8lviclgg9.R.inc(9994);return appliedChanges;
    }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

    @Override
    public ChangeApplied addAxiom(OWLAxiom axiom) {try{__CLR4_5_27p87p8lviclgg9.R.inc(9995);
        __CLR4_5_27p87p8lviclgg9.R.inc(9996);return getOWLOntologyManager().addAxiom(this, axiom);
    }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

    @Override
    public ChangeApplied addAxioms(Set<? extends OWLAxiom> axioms) {try{__CLR4_5_27p87p8lviclgg9.R.inc(9997);
        __CLR4_5_27p87p8lviclgg9.R.inc(9998);return getOWLOntologyManager().addAxioms(this, axioms);
    }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

    protected class OWLOntologyChangeFilter implements
        OWLOntologyChangeVisitorEx<ChangeApplied>, Serializable {

        private static final long serialVersionUID = 40000L;

        @Override
        public ChangeApplied visit(@Nonnull RemoveAxiom change) {try{__CLR4_5_27p87p8lviclgg9.R.inc(9999);
            __CLR4_5_27p87p8lviclgg9.R.inc(10000);if ((((ints.removeAxiom(change.getAxiom()))&&(__CLR4_5_27p87p8lviclgg9.R.iget(10001)!=0|true))||(__CLR4_5_27p87p8lviclgg9.R.iget(10002)==0&false))) {{
                __CLR4_5_27p87p8lviclgg9.R.inc(10003);return SUCCESSFULLY;
            }
            }__CLR4_5_27p87p8lviclgg9.R.inc(10004);return NO_OPERATION;
        }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

        @Override
        public ChangeApplied visit(@Nonnull SetOntologyID change) {try{__CLR4_5_27p87p8lviclgg9.R.inc(10005);
            __CLR4_5_27p87p8lviclgg9.R.inc(10006);OWLOntologyID id = change.getNewOntologyID();
            __CLR4_5_27p87p8lviclgg9.R.inc(10007);if ((((!id.equals(ontologyID))&&(__CLR4_5_27p87p8lviclgg9.R.iget(10008)!=0|true))||(__CLR4_5_27p87p8lviclgg9.R.iget(10009)==0&false))) {{
                __CLR4_5_27p87p8lviclgg9.R.inc(10010);ontologyID = id;
                __CLR4_5_27p87p8lviclgg9.R.inc(10011);return SUCCESSFULLY;
            }
            }__CLR4_5_27p87p8lviclgg9.R.inc(10012);return NO_OPERATION;
        }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

        @Override
        public ChangeApplied visit(@Nonnull AddAxiom change) {try{__CLR4_5_27p87p8lviclgg9.R.inc(10013);
            __CLR4_5_27p87p8lviclgg9.R.inc(10014);if ((((ints.addAxiom(change.getAxiom()))&&(__CLR4_5_27p87p8lviclgg9.R.iget(10015)!=0|true))||(__CLR4_5_27p87p8lviclgg9.R.iget(10016)==0&false))) {{
                __CLR4_5_27p87p8lviclgg9.R.inc(10017);return SUCCESSFULLY;
            }
            }__CLR4_5_27p87p8lviclgg9.R.inc(10018);return NO_OPERATION;
        }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

        @Override
        public ChangeApplied visit(@Nonnull AddImport change) {try{__CLR4_5_27p87p8lviclgg9.R.inc(10019);
            // TODO change this to be done inside
            __CLR4_5_27p87p8lviclgg9.R.inc(10020);if ((((ints.addImportsDeclaration(change.getImportDeclaration()))&&(__CLR4_5_27p87p8lviclgg9.R.iget(10021)!=0|true))||(__CLR4_5_27p87p8lviclgg9.R.iget(10022)==0&false))) {{
                __CLR4_5_27p87p8lviclgg9.R.inc(10023);return SUCCESSFULLY;
            }
            }__CLR4_5_27p87p8lviclgg9.R.inc(10024);return NO_OPERATION;
        }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

        @Override
        public ChangeApplied visit(@Nonnull RemoveImport change) {try{__CLR4_5_27p87p8lviclgg9.R.inc(10025);
            __CLR4_5_27p87p8lviclgg9.R.inc(10026);if ((((ints.removeImportsDeclaration(change.getImportDeclaration()))&&(__CLR4_5_27p87p8lviclgg9.R.iget(10027)!=0|true))||(__CLR4_5_27p87p8lviclgg9.R.iget(10028)==0&false))) {{
                __CLR4_5_27p87p8lviclgg9.R.inc(10029);return SUCCESSFULLY;
            }
            }__CLR4_5_27p87p8lviclgg9.R.inc(10030);return NO_OPERATION;
        }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

        @Override
        public ChangeApplied visit(@Nonnull AddOntologyAnnotation change) {try{__CLR4_5_27p87p8lviclgg9.R.inc(10031);
            __CLR4_5_27p87p8lviclgg9.R.inc(10032);if ((((ints.addOntologyAnnotation(change.getAnnotation()))&&(__CLR4_5_27p87p8lviclgg9.R.iget(10033)!=0|true))||(__CLR4_5_27p87p8lviclgg9.R.iget(10034)==0&false))) {{
                __CLR4_5_27p87p8lviclgg9.R.inc(10035);return SUCCESSFULLY;
            }
            }__CLR4_5_27p87p8lviclgg9.R.inc(10036);return NO_OPERATION;
        }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}

        @Override
        public ChangeApplied visit(@Nonnull RemoveOntologyAnnotation change) {try{__CLR4_5_27p87p8lviclgg9.R.inc(10037);
            __CLR4_5_27p87p8lviclgg9.R.inc(10038);if ((((ints.removeOntologyAnnotation(change.getAnnotation()))&&(__CLR4_5_27p87p8lviclgg9.R.iget(10039)!=0|true))||(__CLR4_5_27p87p8lviclgg9.R.iget(10040)==0&false))) {{
                __CLR4_5_27p87p8lviclgg9.R.inc(10041);return SUCCESSFULLY;
            }
            }__CLR4_5_27p87p8lviclgg9.R.inc(10042);return NO_OPERATION;
        }finally{__CLR4_5_27p87p8lviclgg9.R.flushNeeded();}}
    }
}
