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
package uk.ac.manchester.owl.owlapi.tutorialowled2011;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectVisitorAdapter;
import org.semanticweb.owlapi.util.QNameShortFormProvider;
import org.semanticweb.owlapi.util.ShortFormProvider;

/**
 * A renderer that provides an HTML version of the ontology.
 * 
 * @author Sean Bechhofer, The University Of Manchester, Information Management
 *         Group
 * @since 2.0.0
 */
@SuppressWarnings({ "javadoc", })
public class OWLTutorialSyntaxObjectRenderer extends OWLObjectVisitorAdapter {public static class __CLR4_5_22929lvicnyot{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237362759L,8589935092L,491,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final ShortFormProvider shortForms;
    private final Writer writer;
    private int pos;
    int lastNewLinePos;
    private static final boolean TABLES = true;
    private static final int TABLE_COLUMNS = 3;

    @Nonnull
    public String labelFor(@Nonnull OWLEntity entity) {try{__CLR4_5_22929lvicnyot.R.inc(81);
        __CLR4_5_22929lvicnyot.R.inc(82);return shortForms.getShortForm(entity);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public OWLTutorialSyntaxObjectRenderer(Writer writer) {try{__CLR4_5_22929lvicnyot.R.inc(83);
        __CLR4_5_22929lvicnyot.R.inc(84);this.writer = writer;
        __CLR4_5_22929lvicnyot.R.inc(85);shortForms = new QNameShortFormProvider();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private void write(@Nonnull String s) {try{__CLR4_5_22929lvicnyot.R.inc(86);
        __CLR4_5_22929lvicnyot.R.inc(87);try {
            __CLR4_5_22929lvicnyot.R.inc(88);int newLineIndex = s.indexOf('\n');
            __CLR4_5_22929lvicnyot.R.inc(89);if ((((newLineIndex != -1)&&(__CLR4_5_22929lvicnyot.R.iget(90)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(91)==0&false))) {{
                __CLR4_5_22929lvicnyot.R.inc(92);lastNewLinePos = pos + newLineIndex;
            }
            }__CLR4_5_22929lvicnyot.R.inc(93);pos += s.length();
            __CLR4_5_22929lvicnyot.R.inc(94);writer.write(s);
        } catch (IOException e) {
            __CLR4_5_22929lvicnyot.R.inc(95);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private void write(int i) {try{__CLR4_5_22929lvicnyot.R.inc(96);
        __CLR4_5_22929lvicnyot.R.inc(97);try {
            __CLR4_5_22929lvicnyot.R.inc(98);String s = " " + i + ' ';
            __CLR4_5_22929lvicnyot.R.inc(99);pos += s.length();
            __CLR4_5_22929lvicnyot.R.inc(100);writer.write(s);
        } catch (IOException e) {
            __CLR4_5_22929lvicnyot.R.inc(101);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private void write(@Nonnull IRI iri) {try{__CLR4_5_22929lvicnyot.R.inc(102);
        __CLR4_5_22929lvicnyot.R.inc(103);write("<");
        __CLR4_5_22929lvicnyot.R.inc(104);write(iri.toQuotedString());
        __CLR4_5_22929lvicnyot.R.inc(105);write(">");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void header() {try{__CLR4_5_22929lvicnyot.R.inc(106);
        __CLR4_5_22929lvicnyot.R.inc(107);write("<html>\n");
        __CLR4_5_22929lvicnyot.R.inc(108);write("<head>\n");
        __CLR4_5_22929lvicnyot.R.inc(109);write("<style>\n");
        __CLR4_5_22929lvicnyot.R.inc(110);write("body { font-family: sans-serif; }\n");
        __CLR4_5_22929lvicnyot.R.inc(111);write(".key { color: grey; font-size: 75%; }\n");
        __CLR4_5_22929lvicnyot.R.inc(112);write(".op { color: grey; }\n");
        __CLR4_5_22929lvicnyot.R.inc(113);write(".cl { color: #800; }\n");
        __CLR4_5_22929lvicnyot.R.inc(114);write(".pr { color: #080; }\n");
        __CLR4_5_22929lvicnyot.R.inc(115);write(".in { color: #008; }\n");
        __CLR4_5_22929lvicnyot.R.inc(116);write(".box { border: solid 1px grey; padding: 10px; margin: 10px; }\n");
        __CLR4_5_22929lvicnyot.R.inc(117);int width = 100 / TABLE_COLUMNS;
        __CLR4_5_22929lvicnyot.R.inc(118);write("table { width: 100%; }\n");
        __CLR4_5_22929lvicnyot.R.inc(119);write("td { padding-left: 10px; padding-right: 10px; width: " + width + "%;}\n");
        __CLR4_5_22929lvicnyot.R.inc(120);write("</style>\n");
        __CLR4_5_22929lvicnyot.R.inc(121);write("<body>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void footer() {try{__CLR4_5_22929lvicnyot.R.inc(122);
        __CLR4_5_22929lvicnyot.R.inc(123);write("</body>\n");
        __CLR4_5_22929lvicnyot.R.inc(124);write("</html>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private <T extends OWLObject> void writeCollection(@Nonnull Collection<T> objects) {try{__CLR4_5_22929lvicnyot.R.inc(125);
        __CLR4_5_22929lvicnyot.R.inc(126);if ((((TABLES)&&(__CLR4_5_22929lvicnyot.R.iget(127)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(128)==0&false))) {{
            __CLR4_5_22929lvicnyot.R.inc(129);writeTable(objects);
        } }else {{
            __CLR4_5_22929lvicnyot.R.inc(130);writeList(objects);
        }
    }}finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private <T extends OWLObject> void writeTable(@Nonnull Collection<T> objects) {try{__CLR4_5_22929lvicnyot.R.inc(131);
        __CLR4_5_22929lvicnyot.R.inc(132);writeTableStart();
        __CLR4_5_22929lvicnyot.R.inc(133);int count = 0;
        __CLR4_5_22929lvicnyot.R.inc(134);for (Iterator<T> it = objects.iterator(); (((it.hasNext())&&(__CLR4_5_22929lvicnyot.R.iget(135)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(136)==0&false));) {{
            __CLR4_5_22929lvicnyot.R.inc(137);if ((((count % TABLE_COLUMNS == 0)&&(__CLR4_5_22929lvicnyot.R.iget(138)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(139)==0&false))) {{
                __CLR4_5_22929lvicnyot.R.inc(140);if ((((count > 0)&&(__CLR4_5_22929lvicnyot.R.iget(141)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(142)==0&false))) {{
                    __CLR4_5_22929lvicnyot.R.inc(143);writeTableRowEnd();
                }
                }__CLR4_5_22929lvicnyot.R.inc(144);writeTableRowStart();
            }
            }__CLR4_5_22929lvicnyot.R.inc(145);writeTableCellStart();
            __CLR4_5_22929lvicnyot.R.inc(146);it.next().accept(this);
            __CLR4_5_22929lvicnyot.R.inc(147);writeTableCellEnd();
            __CLR4_5_22929lvicnyot.R.inc(148);count++;
        }
        }__CLR4_5_22929lvicnyot.R.inc(149);writeTableRowEnd();
        __CLR4_5_22929lvicnyot.R.inc(150);writeTableEnd();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private <T extends OWLObject> void writeList(@Nonnull Collection<T> objects) {try{__CLR4_5_22929lvicnyot.R.inc(151);
        __CLR4_5_22929lvicnyot.R.inc(152);writeListStart();
        __CLR4_5_22929lvicnyot.R.inc(153);for (Iterator<T> it = objects.iterator(); (((it.hasNext())&&(__CLR4_5_22929lvicnyot.R.iget(154)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(155)==0&false));) {{
            __CLR4_5_22929lvicnyot.R.inc(156);writeListItemStart();
            __CLR4_5_22929lvicnyot.R.inc(157);it.next().accept(this);
            __CLR4_5_22929lvicnyot.R.inc(158);writeListItemEnd();
        }
        }__CLR4_5_22929lvicnyot.R.inc(159);writeListEnd();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLOntology ontology) {try{__CLR4_5_22929lvicnyot.R.inc(160);
        __CLR4_5_22929lvicnyot.R.inc(161);header();
        __CLR4_5_22929lvicnyot.R.inc(162);write("<h1>");
        __CLR4_5_22929lvicnyot.R.inc(163);write(ontology.getOntologyID().toString());
        __CLR4_5_22929lvicnyot.R.inc(164);write("</h1>\n");
        __CLR4_5_22929lvicnyot.R.inc(165);write("<div>");
        __CLR4_5_22929lvicnyot.R.inc(166);write("<div class='box'>\n");
        __CLR4_5_22929lvicnyot.R.inc(167);for (OWLImportsDeclaration decl : ontology.getImportsDeclarations()) {{
            __CLR4_5_22929lvicnyot.R.inc(168);write("Imports: ");
            __CLR4_5_22929lvicnyot.R.inc(169);write(decl.getIRI().toString());
            __CLR4_5_22929lvicnyot.R.inc(170);write("\n");
        }
        }__CLR4_5_22929lvicnyot.R.inc(171);write("<h2>Classes</h2>\n");
        __CLR4_5_22929lvicnyot.R.inc(172);writeCollection(ontology.getClassesInSignature());
        __CLR4_5_22929lvicnyot.R.inc(173);write("</div>\n");
        __CLR4_5_22929lvicnyot.R.inc(174);write("<div class='box'>\n");
        __CLR4_5_22929lvicnyot.R.inc(175);write("<h2>Properties</h2>\n");
        __CLR4_5_22929lvicnyot.R.inc(176);writeCollection(ontology.getObjectPropertiesInSignature());
        __CLR4_5_22929lvicnyot.R.inc(177);writeCollection(ontology.getDataPropertiesInSignature());
        __CLR4_5_22929lvicnyot.R.inc(178);write("</div>\n");
        __CLR4_5_22929lvicnyot.R.inc(179);write("<div class='box'>\n");
        __CLR4_5_22929lvicnyot.R.inc(180);write("<h2>Individuals</h2>\n");
        __CLR4_5_22929lvicnyot.R.inc(181);writeCollection(ontology.getIndividualsInSignature());
        __CLR4_5_22929lvicnyot.R.inc(182);write("</div>");
        __CLR4_5_22929lvicnyot.R.inc(183);write("<div>");
        __CLR4_5_22929lvicnyot.R.inc(184);write("<div class='box'>");
        __CLR4_5_22929lvicnyot.R.inc(185);write("<h2>Axioms</h2>\n");
        __CLR4_5_22929lvicnyot.R.inc(186);writeListStart();
        __CLR4_5_22929lvicnyot.R.inc(187);for (OWLAxiom ax : ontology.getAxioms()) {{
            __CLR4_5_22929lvicnyot.R.inc(188);writeListItemStart();
            __CLR4_5_22929lvicnyot.R.inc(189);ax.accept(this);
            __CLR4_5_22929lvicnyot.R.inc(190);writeListEnd();
        }
        }__CLR4_5_22929lvicnyot.R.inc(191);writeListEnd();
        __CLR4_5_22929lvicnyot.R.inc(192);write("</div>");
        __CLR4_5_22929lvicnyot.R.inc(193);footer();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void write(@Nonnull String str, @Nonnull OWLObject o) {try{__CLR4_5_22929lvicnyot.R.inc(194);
        __CLR4_5_22929lvicnyot.R.inc(195);write(str);
        __CLR4_5_22929lvicnyot.R.inc(196);write("(");
        __CLR4_5_22929lvicnyot.R.inc(197);o.accept(this);
        __CLR4_5_22929lvicnyot.R.inc(198);write(")");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private void write(@Nonnull Collection<? extends OWLObject> objects, @Nonnull String separator) {try{__CLR4_5_22929lvicnyot.R.inc(199);
        __CLR4_5_22929lvicnyot.R.inc(200);for (Iterator<? extends OWLObject> it = objects.iterator(); (((it.hasNext())&&(__CLR4_5_22929lvicnyot.R.iget(201)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(202)==0&false));) {{
            __CLR4_5_22929lvicnyot.R.inc(203);it.next().accept(this);
            __CLR4_5_22929lvicnyot.R.inc(204);if ((((it.hasNext())&&(__CLR4_5_22929lvicnyot.R.iget(205)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(206)==0&false))) {{
                __CLR4_5_22929lvicnyot.R.inc(207);writeSpace();
                __CLR4_5_22929lvicnyot.R.inc(208);write(separator);
                __CLR4_5_22929lvicnyot.R.inc(209);writeSpace();
            }
        }}
    }}finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private void write(@Nonnull Collection<? extends OWLObject> objects) {try{__CLR4_5_22929lvicnyot.R.inc(210);
        __CLR4_5_22929lvicnyot.R.inc(211);write(objects, "");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeOpenBracket() {try{__CLR4_5_22929lvicnyot.R.inc(212);
        __CLR4_5_22929lvicnyot.R.inc(213);write("(");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeCloseBracket() {try{__CLR4_5_22929lvicnyot.R.inc(214);
        __CLR4_5_22929lvicnyot.R.inc(215);write(")");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeSpace() {try{__CLR4_5_22929lvicnyot.R.inc(216);
        __CLR4_5_22929lvicnyot.R.inc(217);write(" ");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeAnnotations(@SuppressWarnings("unused") OWLAxiom ax) {try{__CLR4_5_22929lvicnyot.R.inc(218);
        // TODO: IMPLEMENT
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeListStart() {try{__CLR4_5_22929lvicnyot.R.inc(219);
        __CLR4_5_22929lvicnyot.R.inc(220);write("<ul>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeListEnd() {try{__CLR4_5_22929lvicnyot.R.inc(221);
        __CLR4_5_22929lvicnyot.R.inc(222);write("</ul>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeTableStart() {try{__CLR4_5_22929lvicnyot.R.inc(223);
        __CLR4_5_22929lvicnyot.R.inc(224);write("<table>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeTableEnd() {try{__CLR4_5_22929lvicnyot.R.inc(225);
        __CLR4_5_22929lvicnyot.R.inc(226);write("</table>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeTableRowStart() {try{__CLR4_5_22929lvicnyot.R.inc(227);
        __CLR4_5_22929lvicnyot.R.inc(228);write("<tr>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeTableRowEnd() {try{__CLR4_5_22929lvicnyot.R.inc(229);
        __CLR4_5_22929lvicnyot.R.inc(230);write("</tr>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeTableCellStart() {try{__CLR4_5_22929lvicnyot.R.inc(231);
        __CLR4_5_22929lvicnyot.R.inc(232);write("<td>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeTableCellEnd() {try{__CLR4_5_22929lvicnyot.R.inc(233);
        __CLR4_5_22929lvicnyot.R.inc(234);write("</td>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeListItemStart() {try{__CLR4_5_22929lvicnyot.R.inc(235);
        __CLR4_5_22929lvicnyot.R.inc(236);write("<li>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void writeListItemEnd() {try{__CLR4_5_22929lvicnyot.R.inc(237);
        __CLR4_5_22929lvicnyot.R.inc(238);write("</li>\n");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @SuppressWarnings("unused")
    public void writePropertyCharacteristic(String str, OWLAxiom ax, @Nonnull OWLPropertyExpression prop) {try{__CLR4_5_22929lvicnyot.R.inc(239);
        __CLR4_5_22929lvicnyot.R.inc(240);write(keyword(str));
        __CLR4_5_22929lvicnyot.R.inc(241);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(242);prop.accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(243);
        __CLR4_5_22929lvicnyot.R.inc(244);writePropertyCharacteristic("asymmetric", axiom, axiom.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(245);
        __CLR4_5_22929lvicnyot.R.inc(246);axiom.getIndividual().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(247);write(keyword(":"));
        __CLR4_5_22929lvicnyot.R.inc(248);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(249);axiom.getClassExpression().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(250);
        __CLR4_5_22929lvicnyot.R.inc(251);axiom.getSubject().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(252);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(253);axiom.getProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(254);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(255);axiom.getObject().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(256);
        __CLR4_5_22929lvicnyot.R.inc(257);axiom.getProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(258);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(259);write(keyword("domain"));
        __CLR4_5_22929lvicnyot.R.inc(260);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(261);axiom.getDomain().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(262);
        __CLR4_5_22929lvicnyot.R.inc(263);axiom.getProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(264);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(265);write(keyword("range"));
        __CLR4_5_22929lvicnyot.R.inc(266);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(267);axiom.getRange().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(268);
        __CLR4_5_22929lvicnyot.R.inc(269);axiom.getSubProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(270);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(271);write(keyword("subProperty"));
        __CLR4_5_22929lvicnyot.R.inc(272);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(273);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(274);}finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(275);
        __CLR4_5_22929lvicnyot.R.inc(276);write(axiom.getIndividuals(), keyword("!="));
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(277);
        __CLR4_5_22929lvicnyot.R.inc(278);write(axiom.getClassExpressions(), keyword("|"));
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(279);
        __CLR4_5_22929lvicnyot.R.inc(280);write(axiom.getProperties(), keyword("|"));
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(281);
        __CLR4_5_22929lvicnyot.R.inc(282);write(keyword("disjoint"));
        __CLR4_5_22929lvicnyot.R.inc(283);write(axiom.getProperties(), keyword("|"));
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(284);
        __CLR4_5_22929lvicnyot.R.inc(285);axiom.getOWLClass().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(286);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(287);write(keyword("=="));
        __CLR4_5_22929lvicnyot.R.inc(288);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(289);write(axiom.getClassExpressions(), keyword("|"));
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(290);
        __CLR4_5_22929lvicnyot.R.inc(291);write(axiom.getClassExpressions(), keyword("=="));
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(292);
        __CLR4_5_22929lvicnyot.R.inc(293);write(axiom.getProperties(), keyword("=="));
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(294);
        __CLR4_5_22929lvicnyot.R.inc(295);write(axiom.getProperties(), keyword("=="));
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(296);
        __CLR4_5_22929lvicnyot.R.inc(297);writePropertyCharacteristic("functional", axiom, axiom.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(298);
        __CLR4_5_22929lvicnyot.R.inc(299);writePropertyCharacteristic("functional", axiom, axiom.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    public void visit(@Nonnull OWLImportsDeclaration axiom) {try{__CLR4_5_22929lvicnyot.R.inc(300);
        __CLR4_5_22929lvicnyot.R.inc(301);write(keyword("imports"));
        __CLR4_5_22929lvicnyot.R.inc(302);write(axiom.getIRI());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(303);
        __CLR4_5_22929lvicnyot.R.inc(304);writePropertyCharacteristic("inversefunctional", axiom, axiom.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(305);
        __CLR4_5_22929lvicnyot.R.inc(306);axiom.getFirstProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(307);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(308);write(keyword("inverse"));
        __CLR4_5_22929lvicnyot.R.inc(309);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(310);axiom.getSecondProperty().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(311);
        __CLR4_5_22929lvicnyot.R.inc(312);writePropertyCharacteristic("Irreflexive", axiom, axiom.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(313);
        __CLR4_5_22929lvicnyot.R.inc(314);axiom.getSubject().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(315);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(316);write(keyword("notvalue"));
        __CLR4_5_22929lvicnyot.R.inc(317);axiom.getProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(318);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(319);axiom.getObject().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(320);
        __CLR4_5_22929lvicnyot.R.inc(321);axiom.getSubject().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(322);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(323);write(keyword("notvalue"));
        __CLR4_5_22929lvicnyot.R.inc(324);axiom.getProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(325);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(326);axiom.getObject().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(327);
        __CLR4_5_22929lvicnyot.R.inc(328);axiom.getSubject().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(329);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(330);axiom.getProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(331);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(332);axiom.getObject().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(333);
        __CLR4_5_22929lvicnyot.R.inc(334);write("chain");
        __CLR4_5_22929lvicnyot.R.inc(335);writeOpenBracket();
        __CLR4_5_22929lvicnyot.R.inc(336);write(axiom.getPropertyChain());
        __CLR4_5_22929lvicnyot.R.inc(337);writeCloseBracket();
        __CLR4_5_22929lvicnyot.R.inc(338);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(339);write(keyword("subProperty"));
        __CLR4_5_22929lvicnyot.R.inc(340);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(341);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(342);
        __CLR4_5_22929lvicnyot.R.inc(343);axiom.getProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(344);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(345);write(keyword("domain"));
        __CLR4_5_22929lvicnyot.R.inc(346);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(347);axiom.getDomain().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(348);
        __CLR4_5_22929lvicnyot.R.inc(349);axiom.getProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(350);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(351);write(keyword("range"));
        __CLR4_5_22929lvicnyot.R.inc(352);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(353);axiom.getRange().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(354);
        __CLR4_5_22929lvicnyot.R.inc(355);axiom.getSubProperty().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(356);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(357);write(keyword("subProperty"));
        __CLR4_5_22929lvicnyot.R.inc(358);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(359);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(360);
        __CLR4_5_22929lvicnyot.R.inc(361);writePropertyCharacteristic("reflexive", axiom, axiom.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(362);
        __CLR4_5_22929lvicnyot.R.inc(363);write(axiom.getIndividuals(), keyword("="));
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(364);
        __CLR4_5_22929lvicnyot.R.inc(365);axiom.getSubClass().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(366);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(367);write(keyword("subClass"));
        __CLR4_5_22929lvicnyot.R.inc(368);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(369);axiom.getSuperClass().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(370);
        __CLR4_5_22929lvicnyot.R.inc(371);writePropertyCharacteristic("symmetric", axiom, axiom.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_22929lvicnyot.R.inc(372);
        __CLR4_5_22929lvicnyot.R.inc(373);writePropertyCharacteristic("transitive", axiom, axiom.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_22929lvicnyot.R.inc(374);
        __CLR4_5_22929lvicnyot.R.inc(375);write("<span class='cl'>" + labelFor(ce) + "</span>");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private void writeRestriction(@Nonnull String str, @Nonnull OWLCardinalityRestriction<?> restriction,
        @Nonnull OWLPropertyExpression property) {try{__CLR4_5_22929lvicnyot.R.inc(376);
        __CLR4_5_22929lvicnyot.R.inc(377);write(str);
        __CLR4_5_22929lvicnyot.R.inc(378);writeOpenBracket();
        __CLR4_5_22929lvicnyot.R.inc(379);write(restriction.getCardinality());
        __CLR4_5_22929lvicnyot.R.inc(380);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(381);property.accept(this);
        __CLR4_5_22929lvicnyot.R.inc(382);if ((((restriction.isQualified())&&(__CLR4_5_22929lvicnyot.R.iget(383)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(384)==0&false))) {{
            __CLR4_5_22929lvicnyot.R.inc(385);writeSpace();
            __CLR4_5_22929lvicnyot.R.inc(386);restriction.getFiller().accept(this);
        }
        }__CLR4_5_22929lvicnyot.R.inc(387);writeCloseBracket();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private void writeRestriction(@Nonnull String str, @Nonnull OWLQuantifiedDataRestriction restriction) {try{__CLR4_5_22929lvicnyot.R.inc(388);
        __CLR4_5_22929lvicnyot.R.inc(389);writeRestriction(str, restriction.getProperty(), restriction.getFiller());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private void writeRestriction(@Nonnull String str, @Nonnull OWLQuantifiedObjectRestriction restriction) {try{__CLR4_5_22929lvicnyot.R.inc(390);
        __CLR4_5_22929lvicnyot.R.inc(391);writeRestriction(str, restriction.getProperty(), restriction.getFiller());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    private void writeRestriction(@Nonnull String str, @Nonnull OWLPropertyExpression prop, @Nonnull OWLObject filler) {try{__CLR4_5_22929lvicnyot.R.inc(392);
        __CLR4_5_22929lvicnyot.R.inc(393);write(str);
        __CLR4_5_22929lvicnyot.R.inc(394);writeOpenBracket();
        __CLR4_5_22929lvicnyot.R.inc(395);prop.accept(this);
        __CLR4_5_22929lvicnyot.R.inc(396);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(397);filler.accept(this);
        __CLR4_5_22929lvicnyot.R.inc(398);writeCloseBracket();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_22929lvicnyot.R.inc(399);
        __CLR4_5_22929lvicnyot.R.inc(400);writeRestriction(operator("only"), ce);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataExactCardinality ce) {try{__CLR4_5_22929lvicnyot.R.inc(401);
        __CLR4_5_22929lvicnyot.R.inc(402);writeRestriction("exact", ce, ce.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMaxCardinality ce) {try{__CLR4_5_22929lvicnyot.R.inc(403);
        __CLR4_5_22929lvicnyot.R.inc(404);writeRestriction("atmost", ce, ce.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMinCardinality ce) {try{__CLR4_5_22929lvicnyot.R.inc(405);
        __CLR4_5_22929lvicnyot.R.inc(406);writeRestriction("atleast", ce, ce.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_22929lvicnyot.R.inc(407);
        __CLR4_5_22929lvicnyot.R.inc(408);writeRestriction(operator("some"), ce);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataHasValue ce) {try{__CLR4_5_22929lvicnyot.R.inc(409);
        __CLR4_5_22929lvicnyot.R.inc(410);writeRestriction("has-value", ce.getProperty(), ce.getFiller());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_22929lvicnyot.R.inc(411);
        __CLR4_5_22929lvicnyot.R.inc(412);writeRestriction(operator("only"), ce);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectComplementOf ce) {try{__CLR4_5_22929lvicnyot.R.inc(413);
        __CLR4_5_22929lvicnyot.R.inc(414);write(operator("not"), ce.getOperand());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectExactCardinality ce) {try{__CLR4_5_22929lvicnyot.R.inc(415);
        __CLR4_5_22929lvicnyot.R.inc(416);writeRestriction("exact", ce, ce.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectIntersectionOf ce) {try{__CLR4_5_22929lvicnyot.R.inc(417);
        __CLR4_5_22929lvicnyot.R.inc(418);writeOpenBracket();
        __CLR4_5_22929lvicnyot.R.inc(419);write(ce.getOperands(), keyword("and"));
        __CLR4_5_22929lvicnyot.R.inc(420);writeCloseBracket();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMaxCardinality ce) {try{__CLR4_5_22929lvicnyot.R.inc(421);
        __CLR4_5_22929lvicnyot.R.inc(422);writeRestriction("atmost", ce, ce.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMinCardinality ce) {try{__CLR4_5_22929lvicnyot.R.inc(423);
        __CLR4_5_22929lvicnyot.R.inc(424);writeRestriction("atleast", ce, ce.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectOneOf ce) {try{__CLR4_5_22929lvicnyot.R.inc(425);
        __CLR4_5_22929lvicnyot.R.inc(426);write(operator("one-of"));
        __CLR4_5_22929lvicnyot.R.inc(427);writeOpenBracket();
        __CLR4_5_22929lvicnyot.R.inc(428);write(ce.getIndividuals());
        __CLR4_5_22929lvicnyot.R.inc(429);writeCloseBracket();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasSelf ce) {try{__CLR4_5_22929lvicnyot.R.inc(430);
        __CLR4_5_22929lvicnyot.R.inc(431);write("self", ce.getProperty());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_22929lvicnyot.R.inc(432);
        __CLR4_5_22929lvicnyot.R.inc(433);writeRestriction(operator("some"), ce);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectUnionOf ce) {try{__CLR4_5_22929lvicnyot.R.inc(434);
        __CLR4_5_22929lvicnyot.R.inc(435);writeOpenBracket();
        __CLR4_5_22929lvicnyot.R.inc(436);write(ce.getOperands(), " or ");
        __CLR4_5_22929lvicnyot.R.inc(437);writeCloseBracket();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasValue ce) {try{__CLR4_5_22929lvicnyot.R.inc(438);
        __CLR4_5_22929lvicnyot.R.inc(439);writeRestriction("hasValue", ce.getProperty(), ce.getFiller());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataComplementOf node) {try{__CLR4_5_22929lvicnyot.R.inc(440);
        __CLR4_5_22929lvicnyot.R.inc(441);write(operator("not"), node.getDataRange());
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataOneOf node) {try{__CLR4_5_22929lvicnyot.R.inc(442);
        __CLR4_5_22929lvicnyot.R.inc(443);write(operator("one-of"));
        __CLR4_5_22929lvicnyot.R.inc(444);write("(");
        __CLR4_5_22929lvicnyot.R.inc(445);write(node.getValues());
        __CLR4_5_22929lvicnyot.R.inc(446);write(")");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatype node) {try{__CLR4_5_22929lvicnyot.R.inc(447);
        __CLR4_5_22929lvicnyot.R.inc(448);write("Datatype");
        __CLR4_5_22929lvicnyot.R.inc(449);writeOpenBracket();
        __CLR4_5_22929lvicnyot.R.inc(450);write(node.getIRI());
        __CLR4_5_22929lvicnyot.R.inc(451);writeCloseBracket();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeRestriction node) {try{__CLR4_5_22929lvicnyot.R.inc(452);
        __CLR4_5_22929lvicnyot.R.inc(453);write("DatatypeRestriction");
        __CLR4_5_22929lvicnyot.R.inc(454);writeOpenBracket();
        __CLR4_5_22929lvicnyot.R.inc(455);node.getDatatype().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(456);for (OWLFacetRestriction restriction : node.getFacetRestrictions()) {{
            __CLR4_5_22929lvicnyot.R.inc(457);writeSpace();
            __CLR4_5_22929lvicnyot.R.inc(458);restriction.accept(this);
        }
        }__CLR4_5_22929lvicnyot.R.inc(459);writeCloseBracket();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFacetRestriction node) {try{__CLR4_5_22929lvicnyot.R.inc(460);
        __CLR4_5_22929lvicnyot.R.inc(461);write(node.getFacet().getIRI());
        __CLR4_5_22929lvicnyot.R.inc(462);writeSpace();
        __CLR4_5_22929lvicnyot.R.inc(463);node.getFacetValue().accept(this);
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLLiteral node) {try{__CLR4_5_22929lvicnyot.R.inc(464);
        __CLR4_5_22929lvicnyot.R.inc(465);write("\"");
        __CLR4_5_22929lvicnyot.R.inc(466);write(node.getLiteral());
        __CLR4_5_22929lvicnyot.R.inc(467);write("\"");
        __CLR4_5_22929lvicnyot.R.inc(468);if ((((node.hasLang())&&(__CLR4_5_22929lvicnyot.R.iget(469)!=0|true))||(__CLR4_5_22929lvicnyot.R.iget(470)==0&false))) {{
            __CLR4_5_22929lvicnyot.R.inc(471);write("@");
            __CLR4_5_22929lvicnyot.R.inc(472);write(node.getLang());
        } }else {{
            __CLR4_5_22929lvicnyot.R.inc(473);write("^^");
            __CLR4_5_22929lvicnyot.R.inc(474);write(node.getDatatype().getIRI());
        }
    }}finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_22929lvicnyot.R.inc(475);
        __CLR4_5_22929lvicnyot.R.inc(476);write("<span class='pr'>" + labelFor(property) + "</span>");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_22929lvicnyot.R.inc(477);
        __CLR4_5_22929lvicnyot.R.inc(478);write("<span class='pr'>" + labelFor(property) + "</span>");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectInverseOf property) {try{__CLR4_5_22929lvicnyot.R.inc(479);
        __CLR4_5_22929lvicnyot.R.inc(480);write("inv");
        __CLR4_5_22929lvicnyot.R.inc(481);writeOpenBracket();
        __CLR4_5_22929lvicnyot.R.inc(482);property.getInverse().accept(this);
        __CLR4_5_22929lvicnyot.R.inc(483);writeCloseBracket();
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_22929lvicnyot.R.inc(484);
        __CLR4_5_22929lvicnyot.R.inc(485);write("<span class='in'>" + labelFor(individual) + "</span>");
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Override
    public void visit(SWRLRule rule) {try{__CLR4_5_22929lvicnyot.R.inc(486);}finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Nonnull
    public String keyword(String str) {try{__CLR4_5_22929lvicnyot.R.inc(487);
        __CLR4_5_22929lvicnyot.R.inc(488);return "<span class='key'>" + str + "</span>";
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}

    @Nonnull
    public String operator(String str) {try{__CLR4_5_22929lvicnyot.R.inc(489);
        __CLR4_5_22929lvicnyot.R.inc(490);return "<span class='op'>" + str + "</span>";
    }finally{__CLR4_5_22929lvicnyot.R.flushNeeded();}}
}
