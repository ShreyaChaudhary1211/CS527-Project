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
package org.semanticweb.owlapi.latex.renderer;

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.*;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.AbstractOWLRenderer;
import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLEntityComparator;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;

/**
 * @author Matthew Horridge, The University Of Manchester, Medical Informatics
 *         Group
 * @since 2.0.0
 */
public class LatexRenderer extends AbstractOWLRenderer {public static class __CLR4_5_2hl8hl8lvicmbja{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,22874,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final ShortFormProvider shortFormProvider = new SimpleShortFormProvider();

    private void writeEntitySection(@Nonnull OWLEntity entity, @Nonnull LatexWriter w) {try{__CLR4_5_2hl8hl8lvicmbja.R.inc(22796);
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22797);w.write("\\subsubsection*{");
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22798);w.write(escapeName(shortFormProvider.getShortForm(entity)));
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22799);w.write("}\n\n");
    }finally{__CLR4_5_2hl8hl8lvicmbja.R.flushNeeded();}}

    @Nonnull
    private static String escapeName(String name) {try{__CLR4_5_2hl8hl8lvicmbja.R.inc(22800);
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22801);return name.replace("_", "\\_");
    }finally{__CLR4_5_2hl8hl8lvicmbja.R.flushNeeded();}}

    @Override
    public void render(OWLOntology ontology, Writer writer) throws OWLRendererException {try{__CLR4_5_2hl8hl8lvicmbja.R.inc(22802);
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22803);try {
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22804);LatexWriter w = new LatexWriter(writer);
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22805);w.write("\\documentclass{article}\n");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22806);w.write("\\parskip 0pt\n");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22807);w.write("\\parindent 0pt\n");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22808);w.write("\\oddsidemargin 0cm\n");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22809);w.write("\\textwidth 19cm\n");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22810);w.write("\\begin{document}\n\n");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22811);LatexObjectVisitor renderer = new LatexObjectVisitor(w, ontology.getOWLOntologyManager()
                .getOWLDataFactory());
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22812);Collection<OWLClass> clses = sortEntities(ontology.getClassesInSignature());
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22813);if ((((!clses.isEmpty())&&(__CLR4_5_2hl8hl8lvicmbja.R.iget(22814)!=0|true))||(__CLR4_5_2hl8hl8lvicmbja.R.iget(22815)==0&false))) {{
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22816);w.write("\\subsection*{Classes}\n\n");
            }
            }__CLR4_5_2hl8hl8lvicmbja.R.inc(22817);for (OWLClass cls : clses) {{
                assert (((cls != null)&&(__CLR4_5_2hl8hl8lvicmbja.R.iget(22818)!=0|true))||(__CLR4_5_2hl8hl8lvicmbja.R.iget(22819)==0&false));
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22820);writeEntitySection(cls, w);
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22821);for (OWLAxiom ax : sortAxioms(ontology.getAxioms(cls, EXCLUDED))) {{
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22822);renderer.setSubject(cls);
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22823);ax.accept(renderer);
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22824);w.write("\n\n");
                }
            }}
            }__CLR4_5_2hl8hl8lvicmbja.R.inc(22825);w.write("\\section*{Object properties}");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22826);for (OWLObjectProperty prop : sortEntities(ontology.getObjectPropertiesInSignature())) {{
                assert (((prop != null)&&(__CLR4_5_2hl8hl8lvicmbja.R.iget(22827)!=0|true))||(__CLR4_5_2hl8hl8lvicmbja.R.iget(22828)==0&false));
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22829);writeEntitySection(prop, w);
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22830);for (OWLAxiom ax : sortAxioms(ontology.getAxioms(prop, EXCLUDED))) {{
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22831);ax.accept(renderer);
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22832);w.write("\n\n");
                }
            }}
            }__CLR4_5_2hl8hl8lvicmbja.R.inc(22833);w.write("\\section*{Data properties}");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22834);for (OWLDataProperty prop : sortEntities(ontology.getDataPropertiesInSignature())) {{
                assert (((prop != null)&&(__CLR4_5_2hl8hl8lvicmbja.R.iget(22835)!=0|true))||(__CLR4_5_2hl8hl8lvicmbja.R.iget(22836)==0&false));
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22837);writeEntitySection(prop, w);
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22838);for (OWLAxiom ax : sortAxioms(ontology.getAxioms(prop, EXCLUDED))) {{
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22839);ax.accept(renderer);
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22840);w.write("\n\n");
                }
            }}
            }__CLR4_5_2hl8hl8lvicmbja.R.inc(22841);w.write("\\section*{Individuals}");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22842);for (OWLNamedIndividual ind : sortEntities(ontology.getIndividualsInSignature())) {{
                assert (((ind != null)&&(__CLR4_5_2hl8hl8lvicmbja.R.iget(22843)!=0|true))||(__CLR4_5_2hl8hl8lvicmbja.R.iget(22844)==0&false));
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22845);writeEntitySection(ind, w);
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22846);for (OWLAxiom ax : sortAxioms(ontology.getAxioms(ind, EXCLUDED))) {{
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22847);ax.accept(renderer);
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22848);w.write("\n\n");
                }
            }}
            }__CLR4_5_2hl8hl8lvicmbja.R.inc(22849);w.write("\\section*{Datatypes}");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22850);for (OWLDatatype type : sortEntities(ontology.getDatatypesInSignature())) {{
                assert (((type != null)&&(__CLR4_5_2hl8hl8lvicmbja.R.iget(22851)!=0|true))||(__CLR4_5_2hl8hl8lvicmbja.R.iget(22852)==0&false));
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22853);writeEntitySection(type, w);
                __CLR4_5_2hl8hl8lvicmbja.R.inc(22854);for (OWLAxiom ax : sortAxioms(ontology.getAxioms(type, EXCLUDED))) {{
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22855);ax.accept(renderer);
                    __CLR4_5_2hl8hl8lvicmbja.R.inc(22856);w.write("\n\n");
                }
            }}
            }__CLR4_5_2hl8hl8lvicmbja.R.inc(22857);writer.write("\\end{document}\n");
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22858);writer.flush();
        } catch (IOException e) {
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22859);throw new LatexRendererIOException(e);
        }
    }finally{__CLR4_5_2hl8hl8lvicmbja.R.flushNeeded();}}

    private <T extends OWLEntity> Collection<T> sortEntities(Set<T> entites) {try{__CLR4_5_2hl8hl8lvicmbja.R.inc(22860);
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22861);List<T> list = new ArrayList<>(entites);
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22862);OWLEntityComparator entityComparator = new OWLEntityComparator(shortFormProvider);
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22863);Collections.sort(list, entityComparator);
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22864);return list;
    }finally{__CLR4_5_2hl8hl8lvicmbja.R.flushNeeded();}}

    private static Collection<OWLAxiom> sortAxioms(Set<? extends OWLAxiom> axioms) {try{__CLR4_5_2hl8hl8lvicmbja.R.inc(22865);
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22866);List<OWLAxiom> list = new ArrayList<>(axioms);
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22867);Collections.sort(list, new OWLAxiomComparator());
        __CLR4_5_2hl8hl8lvicmbja.R.inc(22868);return list;
    }finally{__CLR4_5_2hl8hl8lvicmbja.R.flushNeeded();}}

    private static class OWLAxiomComparator implements Comparator<OWLAxiom>, Serializable {

        private static final long serialVersionUID = 40000L;

        OWLAxiomComparator() {try{__CLR4_5_2hl8hl8lvicmbja.R.inc(22869);}finally{__CLR4_5_2hl8hl8lvicmbja.R.flushNeeded();}}

        @Override
        public int compare(OWLAxiom o1, OWLAxiom o2) {try{__CLR4_5_2hl8hl8lvicmbja.R.inc(22870);
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22871);int index1 = o1.getAxiomType().getIndex();
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22872);int index2 = o2.getAxiomType().getIndex();
            __CLR4_5_2hl8hl8lvicmbja.R.inc(22873);return index1 - index2;
        }finally{__CLR4_5_2hl8hl8lvicmbja.R.flushNeeded();}}
    }
}
