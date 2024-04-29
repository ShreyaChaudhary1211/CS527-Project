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
package org.semanticweb.owlapi.rdf.rdfxml.renderer;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.XMLUtils;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.util.SAXParsers;
import org.semanticweb.owlapi.util.StringLengthComparator;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.google.common.collect.Lists;

/**
 * Developed as part of the CO-ODE project http://www.co-ode.org
 * 
 * @author Matthew Horridge, The University Of Manchester, Medical Informatics
 *         Group
 * @since 2.0.0
 */
public class XMLWriterImpl implements XMLWriter {public static class __CLR4_5_2rtertelvicmd9s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,36345,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private final Stack<XMLElement> elementStack;
    @Nonnull protected final Writer writer;
    private String encoding = "";
    @Nonnull private final String xmlBase;
    @Nonnull private final XMLWriterNamespaceManager xmlWriterNamespaceManager;
    private Map<String, String> entities;
    private static final int TEXT_CONTENT_WRAP_LIMIT = Integer.MAX_VALUE;
    private boolean preambleWritten;
    private static final String PERCENT_ENTITY = "&#37;";
    protected final XMLWriterPreferences xmlPreferences;

    /**
     * @param writer
     *        writer
     * @param xmlWriterNamespaceManager
     *        xmlWriterNamespaceManager
     * @param xmlBase
     *        xmlBase
     * @param preferences
     *        xml writer preferences instance
     */
    public XMLWriterImpl(@Nonnull Writer writer, @Nonnull XMLWriterNamespaceManager xmlWriterNamespaceManager,
        @Nonnull String xmlBase, @Nonnull XMLWriterPreferences preferences) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36050);
        __CLR4_5_2rtertelvicmd9s.R.inc(36051);this.writer = checkNotNull(writer, "writer cannot be null");
        __CLR4_5_2rtertelvicmd9s.R.inc(36052);this.xmlWriterNamespaceManager = checkNotNull(xmlWriterNamespaceManager,
            "xmlWriterNamespaceManager cannot be null");
        __CLR4_5_2rtertelvicmd9s.R.inc(36053);this.xmlBase = checkNotNull(xmlBase, "xmlBase cannot be null");
        __CLR4_5_2rtertelvicmd9s.R.inc(36054);xmlPreferences = checkNotNull(preferences, "preferences cannot be null");
        // no need to set it to UTF-8: it's supposed to be the default encoding
        // for XML.
        // Must be set correctly for the Writer anyway, or bugs will ensue.
        // this.encoding = "UTF-8";
        __CLR4_5_2rtertelvicmd9s.R.inc(36055);elementStack = new Stack<>();
        __CLR4_5_2rtertelvicmd9s.R.inc(36056);setupEntities();
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    private void setupEntities() {try{__CLR4_5_2rtertelvicmd9s.R.inc(36057);
        __CLR4_5_2rtertelvicmd9s.R.inc(36058);List<String> namespaces = Lists.newArrayList(xmlWriterNamespaceManager.getNamespaces());
        __CLR4_5_2rtertelvicmd9s.R.inc(36059);Collections.sort(namespaces, new StringLengthComparator());
        __CLR4_5_2rtertelvicmd9s.R.inc(36060);entities = new LinkedHashMap<>();
        __CLR4_5_2rtertelvicmd9s.R.inc(36061);for (String curNamespace : namespaces) {{
            assert (((curNamespace != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36062)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36063)==0&false));
            __CLR4_5_2rtertelvicmd9s.R.inc(36064);String curPrefix = "";
            __CLR4_5_2rtertelvicmd9s.R.inc(36065);if ((((xmlWriterNamespaceManager.getDefaultNamespace().equals(curNamespace))&&(__CLR4_5_2rtertelvicmd9s.R.iget(36066)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36067)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36068);curPrefix = xmlWriterNamespaceManager.getDefaultPrefix();
            } }else {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36069);curPrefix = xmlWriterNamespaceManager.getPrefixForNamespace(curNamespace);
            }
            }assert (((curPrefix != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36070)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36071)==0&false));
            __CLR4_5_2rtertelvicmd9s.R.inc(36072);if ((((!curPrefix.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36073)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36074)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36075);entities.put(curNamespace, '&' + curPrefix + ';');
            }
        }}
    }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    protected String swapForEntity(String value) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36076);
        __CLR4_5_2rtertelvicmd9s.R.inc(36077);for (String curEntity : entities.keySet()) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36078);String entityVal = entities.get(curEntity);
            __CLR4_5_2rtertelvicmd9s.R.inc(36079);if ((((value.length() > curEntity.length())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36080)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36081)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36082);String repVal = value.replace(curEntity, entityVal);
                __CLR4_5_2rtertelvicmd9s.R.inc(36083);if ((((repVal.length() < value.length())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36084)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36085)==0&false))) {{
                    __CLR4_5_2rtertelvicmd9s.R.inc(36086);return repVal;
                }
            }}
        }}
        }__CLR4_5_2rtertelvicmd9s.R.inc(36087);return value;
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    /**
     * @return default namespace
     */
    public String getDefaultNamespace() {try{__CLR4_5_2rtertelvicmd9s.R.inc(36088);
        __CLR4_5_2rtertelvicmd9s.R.inc(36089);return xmlWriterNamespaceManager.getDefaultNamespace();
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public String getXMLBase() {try{__CLR4_5_2rtertelvicmd9s.R.inc(36090);
        __CLR4_5_2rtertelvicmd9s.R.inc(36091);return xmlBase;
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public XMLWriterNamespaceManager getNamespacePrefixes() {try{__CLR4_5_2rtertelvicmd9s.R.inc(36092);
        __CLR4_5_2rtertelvicmd9s.R.inc(36093);return xmlWriterNamespaceManager;
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void setEncoding(String encoding) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36094);
        __CLR4_5_2rtertelvicmd9s.R.inc(36095);this.encoding = encoding;
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void setWrapAttributes(boolean b) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36096);
        __CLR4_5_2rtertelvicmd9s.R.inc(36097);if ((((!elementStack.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36098)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36099)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36100);XMLElement element = elementStack.peek();
            __CLR4_5_2rtertelvicmd9s.R.inc(36101);element.setWrapAttributes(b);
        }
    }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void writeStartElement(IRI name) throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36102);
        __CLR4_5_2rtertelvicmd9s.R.inc(36103);String qName = xmlWriterNamespaceManager.getQName(name);
        __CLR4_5_2rtertelvicmd9s.R.inc(36104);if ((((!XMLUtils.isQName(qName))&&(__CLR4_5_2rtertelvicmd9s.R.iget(36105)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36106)==0&false))) {{
            // Could not generate a valid QName, therefore, we cannot
            // write valid XML - just throw an exception!
            __CLR4_5_2rtertelvicmd9s.R.inc(36107);throw new IllegalElementNameException(name.toString());
        }
        }__CLR4_5_2rtertelvicmd9s.R.inc(36108);XMLElement element = new XMLElement(qName, elementStack.size());
        __CLR4_5_2rtertelvicmd9s.R.inc(36109);if ((((!elementStack.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36110)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36111)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36112);XMLElement topElement = elementStack.peek();
            __CLR4_5_2rtertelvicmd9s.R.inc(36113);if ((((topElement != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36114)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36115)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36116);topElement.writeElementStart(false);
            }
        }}
        }__CLR4_5_2rtertelvicmd9s.R.inc(36117);elementStack.push(element);
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void writeEndElement() throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36118);
        // Pop the element off the stack and write it out
        __CLR4_5_2rtertelvicmd9s.R.inc(36119);if ((((!elementStack.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36120)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36121)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36122);XMLElement element = elementStack.pop();
            __CLR4_5_2rtertelvicmd9s.R.inc(36123);element.writeElementEnd();
        }
    }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void writeAttribute(String attr, String val) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36124);
        __CLR4_5_2rtertelvicmd9s.R.inc(36125);XMLElement element = elementStack.peek();
        __CLR4_5_2rtertelvicmd9s.R.inc(36126);String qName = xmlWriterNamespaceManager.getQName(attr);
        __CLR4_5_2rtertelvicmd9s.R.inc(36127);if ((((qName != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36128)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36129)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36130);element.setAttribute(qName, val);
        }
    }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void writeAttribute(@Nonnull IRI attr, String val) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36131);
        __CLR4_5_2rtertelvicmd9s.R.inc(36132);XMLElement element = elementStack.peek();
        __CLR4_5_2rtertelvicmd9s.R.inc(36133);String qName = xmlWriterNamespaceManager.getQName(attr);
        __CLR4_5_2rtertelvicmd9s.R.inc(36134);if ((((qName != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36135)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36136)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36137);element.setAttribute(qName, val);
        }
    }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void writeTextContent(String text) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36138);
        __CLR4_5_2rtertelvicmd9s.R.inc(36139);XMLElement element = elementStack.peek();
        __CLR4_5_2rtertelvicmd9s.R.inc(36140);element.setText(text);
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void writeComment(String commentText) throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36141);
        __CLR4_5_2rtertelvicmd9s.R.inc(36142);XMLElement element = new XMLElement(null, elementStack.size());
        __CLR4_5_2rtertelvicmd9s.R.inc(36143);element.setText("<!-- " + commentText.replace("--", "&#45;&#45;") + " -->");
        __CLR4_5_2rtertelvicmd9s.R.inc(36144);if ((((!elementStack.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36145)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36146)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36147);XMLElement topElement = elementStack.peek();
            __CLR4_5_2rtertelvicmd9s.R.inc(36148);if ((((topElement != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36149)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36150)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36151);topElement.writeElementStart(false);
            }
        }}
        }__CLR4_5_2rtertelvicmd9s.R.inc(36152);if ((((preambleWritten)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36153)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36154)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36155);element.writeElementStart(true);
        } }else {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36156);elementStack.push(element);
        }
    }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    private void writeEntities(@Nonnull IRI rootName) throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36157);
        __CLR4_5_2rtertelvicmd9s.R.inc(36158);String qName = xmlWriterNamespaceManager.getQName(rootName);
        __CLR4_5_2rtertelvicmd9s.R.inc(36159);if ((((qName == null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36160)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36161)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36162);throw new IOException("Cannot create valid XML: qname for " + rootName + " is null");
        }
        }__CLR4_5_2rtertelvicmd9s.R.inc(36163);writer.write("\n\n<!DOCTYPE " + qName + " [\n");
        __CLR4_5_2rtertelvicmd9s.R.inc(36164);for (String entityVal : entities.keySet()) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36165);String entity = entities.get(entityVal);
            __CLR4_5_2rtertelvicmd9s.R.inc(36166);entity = entity.substring(1, entity.length() - 1);
            __CLR4_5_2rtertelvicmd9s.R.inc(36167);writer.write("    <!ENTITY ");
            __CLR4_5_2rtertelvicmd9s.R.inc(36168);writer.write(entity);
            __CLR4_5_2rtertelvicmd9s.R.inc(36169);writer.write(" \"");
            __CLR4_5_2rtertelvicmd9s.R.inc(36170);entityVal = XMLUtils.escapeXML(entityVal);
            __CLR4_5_2rtertelvicmd9s.R.inc(36171);entityVal = entityVal.replace("%", PERCENT_ENTITY);
            __CLR4_5_2rtertelvicmd9s.R.inc(36172);writer.write(entityVal);
            __CLR4_5_2rtertelvicmd9s.R.inc(36173);writer.write("\" >\n");
        }
        }__CLR4_5_2rtertelvicmd9s.R.inc(36174);writer.write("]>\n\n\n");
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void startDocument(@Nonnull IRI rootElement) throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36175);
        __CLR4_5_2rtertelvicmd9s.R.inc(36176);String encodingString = "";
        __CLR4_5_2rtertelvicmd9s.R.inc(36177);if ((((!encoding.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36178)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36179)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36180);encodingString = " encoding=\"" + encoding + '"';
        }
        }__CLR4_5_2rtertelvicmd9s.R.inc(36181);writer.write("<?xml version=\"1.0\"" + encodingString + "?>\n");
        __CLR4_5_2rtertelvicmd9s.R.inc(36182);if ((((xmlPreferences.isUseNamespaceEntities())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36183)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36184)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36185);writeEntities(rootElement);
        }
        }__CLR4_5_2rtertelvicmd9s.R.inc(36186);preambleWritten = true;
        __CLR4_5_2rtertelvicmd9s.R.inc(36187);while ((((!elementStack.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36188)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36189)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36190);elementStack.pop().writeElementStart(true);
        }
        }__CLR4_5_2rtertelvicmd9s.R.inc(36191);writeStartElement(rootElement);
        __CLR4_5_2rtertelvicmd9s.R.inc(36192);setWrapAttributes(true);
        __CLR4_5_2rtertelvicmd9s.R.inc(36193);writeAttribute("xmlns", xmlWriterNamespaceManager.getDefaultNamespace());
        __CLR4_5_2rtertelvicmd9s.R.inc(36194);if ((((!xmlBase.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36195)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36196)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36197);writeAttribute("xml:base", xmlBase);
        }
        }__CLR4_5_2rtertelvicmd9s.R.inc(36198);for (String curPrefix : xmlWriterNamespaceManager.getPrefixes()) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36199);if ((((!curPrefix.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36200)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36201)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36202);writeAttribute("xmlns:" + curPrefix, verifyNotNull(xmlWriterNamespaceManager.getNamespaceForPrefix(
                    curPrefix)));
            }
        }}
    }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    @Override
    public void endDocument() throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36203);
        // Pop of each element
        __CLR4_5_2rtertelvicmd9s.R.inc(36204);while ((((!elementStack.isEmpty())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36205)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36206)==0&false))) {{
            __CLR4_5_2rtertelvicmd9s.R.inc(36207);writeEndElement();
        }
        }__CLR4_5_2rtertelvicmd9s.R.inc(36208);writer.flush();
    }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

    /** xml element */
    public class XMLElement {

        private final String name;
        private final Map<String, String> attributes;
        @Nullable String textContent;
        private boolean startWritten;
        private int indentation;
        private boolean wrapAttributes;

        /**
         * @param name
         *        name
         * @param indentation
         *        indentation
         */
        public XMLElement(String name, int indentation) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36209);
            __CLR4_5_2rtertelvicmd9s.R.inc(36210);this.name = name;
            __CLR4_5_2rtertelvicmd9s.R.inc(36211);attributes = new LinkedHashMap<>();
            __CLR4_5_2rtertelvicmd9s.R.inc(36212);this.indentation = indentation;
            __CLR4_5_2rtertelvicmd9s.R.inc(36213);textContent = null;
            __CLR4_5_2rtertelvicmd9s.R.inc(36214);startWritten = false;
        }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        /**
         * @param b
         *        b
         */
        public void setWrapAttributes(boolean b) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36215);
            __CLR4_5_2rtertelvicmd9s.R.inc(36216);wrapAttributes = b;
        }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        /**
         * @param attribute
         *        attribute
         * @param value
         *        value
         */
        public void setAttribute(String attribute, String value) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36217);
            __CLR4_5_2rtertelvicmd9s.R.inc(36218);attributes.put(attribute, value);
        }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        /**
         * @param content
         *        content
         */
        public void setText(String content) {try{__CLR4_5_2rtertelvicmd9s.R.inc(36219);
            __CLR4_5_2rtertelvicmd9s.R.inc(36220);textContent = content;
        }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        /**
         * @param close
         *        close
         * @throws IOException
         *         io error
         */
        public void writeElementStart(boolean close) throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36221);
            __CLR4_5_2rtertelvicmd9s.R.inc(36222);if ((((!startWritten)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36223)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36224)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36225);startWritten = true;
                __CLR4_5_2rtertelvicmd9s.R.inc(36226);insertIndentation();
                __CLR4_5_2rtertelvicmd9s.R.inc(36227);if ((((name != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36228)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36229)==0&false))) {{
                    __CLR4_5_2rtertelvicmd9s.R.inc(36230);writer.write('<');
                    __CLR4_5_2rtertelvicmd9s.R.inc(36231);writer.write(name);
                    __CLR4_5_2rtertelvicmd9s.R.inc(36232);writeAttributes();
                    __CLR4_5_2rtertelvicmd9s.R.inc(36233);if ((((textContent != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36234)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36235)==0&false))) {{
                        __CLR4_5_2rtertelvicmd9s.R.inc(36236);boolean wrap = textContent.length() > TEXT_CONTENT_WRAP_LIMIT;
                        __CLR4_5_2rtertelvicmd9s.R.inc(36237);if ((((wrap)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36238)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36239)==0&false))) {{
                            __CLR4_5_2rtertelvicmd9s.R.inc(36240);writeNewLine();
                            __CLR4_5_2rtertelvicmd9s.R.inc(36241);indentation++;
                            __CLR4_5_2rtertelvicmd9s.R.inc(36242);insertIndentation();
                        }
                        }__CLR4_5_2rtertelvicmd9s.R.inc(36243);writer.write('>');
                        __CLR4_5_2rtertelvicmd9s.R.inc(36244);writeTextContent();
                        __CLR4_5_2rtertelvicmd9s.R.inc(36245);if ((((wrap)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36246)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36247)==0&false))) {{
                            __CLR4_5_2rtertelvicmd9s.R.inc(36248);indentation--;
                        }
                    }}
                    }__CLR4_5_2rtertelvicmd9s.R.inc(36249);if ((((close)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36250)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36251)==0&false))) {{
                        __CLR4_5_2rtertelvicmd9s.R.inc(36252);if ((((textContent != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36253)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36254)==0&false))) {{
                            __CLR4_5_2rtertelvicmd9s.R.inc(36255);writeElementEnd();
                        } }else {{
                            __CLR4_5_2rtertelvicmd9s.R.inc(36256);writer.write("/>");
                            __CLR4_5_2rtertelvicmd9s.R.inc(36257);writeNewLine();
                        }
                    }} }else {{
                        __CLR4_5_2rtertelvicmd9s.R.inc(36258);if ((((textContent == null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36259)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36260)==0&false))) {{
                            __CLR4_5_2rtertelvicmd9s.R.inc(36261);writer.write('>');
                            __CLR4_5_2rtertelvicmd9s.R.inc(36262);writeNewLine();
                        }
                    }}
                }} }else {{
                    // Name is null so by convension this is a comment
                    __CLR4_5_2rtertelvicmd9s.R.inc(36263);if ((((textContent != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36264)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36265)==0&false))) {{
                        __CLR4_5_2rtertelvicmd9s.R.inc(36266);writer.write("\n\n\n");
                        __CLR4_5_2rtertelvicmd9s.R.inc(36267);StringTokenizer tokenizer = new StringTokenizer(textContent, "\n", true);
                        __CLR4_5_2rtertelvicmd9s.R.inc(36268);while ((((tokenizer.hasMoreTokens())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36269)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36270)==0&false))) {{
                            __CLR4_5_2rtertelvicmd9s.R.inc(36271);String token = tokenizer.nextToken();
                            __CLR4_5_2rtertelvicmd9s.R.inc(36272);if ((((!token.equals("\n"))&&(__CLR4_5_2rtertelvicmd9s.R.iget(36273)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36274)==0&false))) {{
                                __CLR4_5_2rtertelvicmd9s.R.inc(36275);insertIndentation();
                            }
                            }__CLR4_5_2rtertelvicmd9s.R.inc(36276);writer.write(token);
                        }
                        }__CLR4_5_2rtertelvicmd9s.R.inc(36277);writer.write("\n\n");
                    }
                }}
            }}
        }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        /**
         * write end element
         * 
         * @throws IOException
         *         io error
         */
        public void writeElementEnd() throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36278);
            __CLR4_5_2rtertelvicmd9s.R.inc(36279);if ((((name != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36280)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36281)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36282);if ((((!startWritten)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36283)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36284)==0&false))) {{
                    __CLR4_5_2rtertelvicmd9s.R.inc(36285);writeElementStart(true);
                } }else {{
                    __CLR4_5_2rtertelvicmd9s.R.inc(36286);if ((((textContent == null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36287)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36288)==0&false))) {{
                        __CLR4_5_2rtertelvicmd9s.R.inc(36289);insertIndentation();
                    }
                    }__CLR4_5_2rtertelvicmd9s.R.inc(36290);writer.write("</");
                    __CLR4_5_2rtertelvicmd9s.R.inc(36291);writer.write(name);
                    __CLR4_5_2rtertelvicmd9s.R.inc(36292);writer.write(">");
                    __CLR4_5_2rtertelvicmd9s.R.inc(36293);writeNewLine();
                }
            }}
        }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        private void writeAttribute(String attr, String val) throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36294);
            __CLR4_5_2rtertelvicmd9s.R.inc(36295);writer.write(attr);
            __CLR4_5_2rtertelvicmd9s.R.inc(36296);writer.write('=');
            __CLR4_5_2rtertelvicmd9s.R.inc(36297);writer.write('"');
            __CLR4_5_2rtertelvicmd9s.R.inc(36298);if ((((xmlPreferences.isUseNamespaceEntities())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36299)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36300)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36301);writer.write(swapForEntity(XMLUtils.escapeXML(val)));
            } }else {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36302);writer.write(XMLUtils.escapeXML(val));
            }
            }__CLR4_5_2rtertelvicmd9s.R.inc(36303);writer.write('"');
        }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        private void writeAttributes() throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36304);
            __CLR4_5_2rtertelvicmd9s.R.inc(36305);for (Iterator<String> it = attributes.keySet().iterator(); (((it.hasNext())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36306)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36307)==0&false));) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36308);String attr = it.next();
                __CLR4_5_2rtertelvicmd9s.R.inc(36309);String val = attributes.get(attr);
                __CLR4_5_2rtertelvicmd9s.R.inc(36310);writer.write(' ');
                __CLR4_5_2rtertelvicmd9s.R.inc(36311);writeAttribute(attr, val);
                __CLR4_5_2rtertelvicmd9s.R.inc(36312);if ((((it.hasNext() && wrapAttributes)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36313)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36314)==0&false))) {{
                    __CLR4_5_2rtertelvicmd9s.R.inc(36315);writer.write("\n");
                    __CLR4_5_2rtertelvicmd9s.R.inc(36316);indentation++;
                    __CLR4_5_2rtertelvicmd9s.R.inc(36317);insertIndentation();
                    __CLR4_5_2rtertelvicmd9s.R.inc(36318);indentation--;
                }
            }}
        }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        private void writeTextContent() throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36319);
            __CLR4_5_2rtertelvicmd9s.R.inc(36320);if ((((textContent != null)&&(__CLR4_5_2rtertelvicmd9s.R.iget(36321)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36322)==0&false))) {{
                // only escape the data if this is not an XML literal
                __CLR4_5_2rtertelvicmd9s.R.inc(36323);if ((((isRDFXMLLiteral())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36324)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36325)==0&false))) {{
                    __CLR4_5_2rtertelvicmd9s.R.inc(36326);checkProperXMLLiteral(textContent);
                    __CLR4_5_2rtertelvicmd9s.R.inc(36327);writer.write(textContent);
                } }else {{
                    __CLR4_5_2rtertelvicmd9s.R.inc(36328);writer.write(XMLUtils.escapeXML(textContent));
                }
            }}
        }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        private boolean isRDFXMLLiteral() {try{__CLR4_5_2rtertelvicmd9s.R.inc(36329);
            __CLR4_5_2rtertelvicmd9s.R.inc(36330);return "http://www.w3.org/1999/02/22-rdf-syntax-ns#XMLLiteral".equals(attributes.get("rdf:datatype"))
                || "Literal".equals(attributes.get("rdf:parseType"));
        }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        private void checkProperXMLLiteral(String text) throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36331);
            __CLR4_5_2rtertelvicmd9s.R.inc(36332);try {
                __CLR4_5_2rtertelvicmd9s.R.inc(36333);SAXParsers.initParserWithOWLAPIStandards(null).parse(new InputSource(new StringReader(text)),
                    new DefaultHandler());
            } catch (SAXException e) {
                __CLR4_5_2rtertelvicmd9s.R.inc(36334);throw new IOException("XML literal is not self contained: \"" + text + "\"", e);
            }
        }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        private void insertIndentation() throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36335);
            __CLR4_5_2rtertelvicmd9s.R.inc(36336);if ((((xmlPreferences.isIndenting())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36337)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36338)==0&false))) {{
                __CLR4_5_2rtertelvicmd9s.R.inc(36339);for (int i = 0; (((i < indentation * xmlPreferences.getIndentSize())&&(__CLR4_5_2rtertelvicmd9s.R.iget(36340)!=0|true))||(__CLR4_5_2rtertelvicmd9s.R.iget(36341)==0&false)); i++) {{
                    __CLR4_5_2rtertelvicmd9s.R.inc(36342);writer.write(' ');
                }
            }}
        }}finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}

        private void writeNewLine() throws IOException {try{__CLR4_5_2rtertelvicmd9s.R.inc(36343);
            __CLR4_5_2rtertelvicmd9s.R.inc(36344);writer.write('\n');
        }finally{__CLR4_5_2rtertelvicmd9s.R.flushNeeded();}}
    }
}
