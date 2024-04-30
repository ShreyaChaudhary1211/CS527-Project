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
package org.semanticweb.owlapi.oboformat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.annotation.Nonnull;

import org.obolibrary.obo2owl.OWLAPIOwl2Obo;
import org.obolibrary.oboformat.model.OBODoc;
import org.obolibrary.oboformat.writer.OBOFormatWriter;
import org.obolibrary.oboformat.writer.OBOFormatWriter.NameProvider;
import org.obolibrary.oboformat.writer.OBOFormatWriter.OBODocNameProvider;
import org.obolibrary.oboformat.writer.OBOFormatWriter.OWLOntologyNameProvider;
import org.semanticweb.owlapi.formats.OBODocumentFormat;
import org.semanticweb.owlapi.io.OWLRenderer;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

/** renderer for obo */
public class OBOFormatRenderer implements OWLRenderer {public static class __CLR4_5_2573573lvicmt86{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,6763,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public void render(@Nonnull OWLOntology ontology, @Nonnull OutputStream os) throws OWLOntologyStorageException {try{__CLR4_5_2573573lvicmt86.R.inc(6735);
        __CLR4_5_2573573lvicmt86.R.inc(6736);render(ontology, new OutputStreamWriter(os), ontology.getOWLOntologyManager().getOntologyFormat(ontology));
    }finally{__CLR4_5_2573573lvicmt86.R.flushNeeded();}}

    /**
     * @param ontology
     *        ontology
     * @param writer
     *        writer
     * @param format
     *        format to write out
     * @throws OWLOntologyStorageException
     *         OWLOntologyStorageException
     */
    public static void render(@Nonnull OWLOntology ontology, @Nonnull Writer writer, OWLDocumentFormat format)
        throws OWLOntologyStorageException {try{__CLR4_5_2573573lvicmt86.R.inc(6737);
        __CLR4_5_2573573lvicmt86.R.inc(6738);try {
            __CLR4_5_2573573lvicmt86.R.inc(6739);OWLAPIOwl2Obo translator = new OWLAPIOwl2Obo(ontology.getOWLOntologyManager());
            __CLR4_5_2573573lvicmt86.R.inc(6740);final OBODoc result = translator.convert(ontology);
            __CLR4_5_2573573lvicmt86.R.inc(6741);boolean hasImports = ontology.getImports().isEmpty() == false;
            __CLR4_5_2573573lvicmt86.R.inc(6742);NameProvider nameProvider;
            __CLR4_5_2573573lvicmt86.R.inc(6743);if ((((hasImports)&&(__CLR4_5_2573573lvicmt86.R.iget(6744)!=0|true))||(__CLR4_5_2573573lvicmt86.R.iget(6745)==0&false))) {{
                // if the ontology has imports
                // use it as secondary lookup for labels
                __CLR4_5_2573573lvicmt86.R.inc(6746);final NameProvider primary = new OBODocNameProvider(result);
                __CLR4_5_2573573lvicmt86.R.inc(6747);final NameProvider secondary = new OWLOntologyNameProvider(ontology, primary.getDefaultOboNamespace());
                // combine primary and secondary name provider
                __CLR4_5_2573573lvicmt86.R.inc(6748);nameProvider = new NameProvider() {

                    @Override
                    public String getName(String id) {try{__CLR4_5_2573573lvicmt86.R.inc(6749);
                        __CLR4_5_2573573lvicmt86.R.inc(6750);String name = primary.getName(id);
                        __CLR4_5_2573573lvicmt86.R.inc(6751);if ((((name != null)&&(__CLR4_5_2573573lvicmt86.R.iget(6752)!=0|true))||(__CLR4_5_2573573lvicmt86.R.iget(6753)==0&false))) {{
                            __CLR4_5_2573573lvicmt86.R.inc(6754);return name;
                        }
                        }__CLR4_5_2573573lvicmt86.R.inc(6755);return secondary.getName(id);
                    }finally{__CLR4_5_2573573lvicmt86.R.flushNeeded();}}

                    @Override
                    public String getDefaultOboNamespace() {try{__CLR4_5_2573573lvicmt86.R.inc(6756);
                        __CLR4_5_2573573lvicmt86.R.inc(6757);return primary.getDefaultOboNamespace();
                    }finally{__CLR4_5_2573573lvicmt86.R.flushNeeded();}}
                };
            } }else {{
                __CLR4_5_2573573lvicmt86.R.inc(6758);nameProvider = new OBODocNameProvider(result);
            }
            }__CLR4_5_2573573lvicmt86.R.inc(6759);OBOFormatWriter oboFormatWriter = new OBOFormatWriter();
            __CLR4_5_2573573lvicmt86.R.inc(6760);oboFormatWriter.setCheckStructure((Boolean) format.getParameter(OBODocumentFormat.VALIDATION,
                Boolean.TRUE));
            __CLR4_5_2573573lvicmt86.R.inc(6761);oboFormatWriter.write(result, new BufferedWriter(writer), nameProvider);
        } catch (IOException e) {
            __CLR4_5_2573573lvicmt86.R.inc(6762);throw new OWLOntologyStorageException(e);
        }
    }finally{__CLR4_5_2573573lvicmt86.R.flushNeeded();}}
}
