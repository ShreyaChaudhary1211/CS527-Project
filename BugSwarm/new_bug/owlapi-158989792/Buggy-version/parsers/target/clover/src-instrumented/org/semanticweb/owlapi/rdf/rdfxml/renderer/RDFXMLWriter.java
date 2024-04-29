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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.IOException;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.RDFResourceBlankNode;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class RDFXMLWriter {public static class __CLR4_5_2rscrsclvicmd62{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,36048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private static final IRI RDF_RDF = IRI.create(Namespaces.RDF.getPrefixIRI(), "RDF");
    @Nonnull private static final IRI RDF_RESOURCE = IRI.create(Namespaces.RDF.getPrefixIRI(), "resource");
    @Nonnull private static final String XML_LANG = "xml:lang";
    @Nonnull private static final IRI RDF_NODEID = IRI.create(Namespaces.RDF.getPrefixIRI(), "nodeID");
    @Nonnull private static final IRI RDF_ABOUT = IRI.create(Namespaces.RDF.getPrefixIRI(), "about");
    @Nonnull private static final IRI RDF_DATATYPE = IRI.create(Namespaces.RDF.getPrefixIRI(), "datatype");
    @Nonnull private static final IRI PARSETYPE_IRI = IRI.create(Namespaces.RDF.getPrefixIRI(), "parseType");
    private final XMLWriter writer;

    protected RDFXMLWriter(@Nonnull XMLWriter writer) {try{__CLR4_5_2rscrsclvicmd62.R.inc(36012);
        __CLR4_5_2rscrsclvicmd62.R.inc(36013);this.writer = checkNotNull(writer, "writer cannot be null");
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param elementName
     *        elementName
     * @throws IOException
     *         io exception
     */
    public void writeStartElement(@Nonnull IRI elementName) throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36014);
        // Sort out with namespace
        __CLR4_5_2rscrsclvicmd62.R.inc(36015);writer.writeStartElement(checkNotNull(elementName, "elementName cannot be null"));
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @throws IOException
     *         io exception
     */
    public void writeParseTypeAttribute() throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36016);
        __CLR4_5_2rscrsclvicmd62.R.inc(36017);writer.writeAttribute(PARSETYPE_IRI, "Collection");
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * Parse type attribute for literals.
     * 
     * @throws IOException
     *         io exception
     */
    public void writeParseTypeLiteralAttribute() throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36018);
        __CLR4_5_2rscrsclvicmd62.R.inc(36019);writer.writeAttribute(PARSETYPE_IRI, "Literal");
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param datatypeIRI
     *        datatypeIRI
     * @throws IOException
     *         io exception
     */
    public void writeDatatypeAttribute(@Nonnull IRI datatypeIRI) throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36020);
        __CLR4_5_2rscrsclvicmd62.R.inc(36021);checkNotNull(datatypeIRI, "datatypeIRI cannot be null");
        __CLR4_5_2rscrsclvicmd62.R.inc(36022);if ((((OWL2Datatype.RDF_XML_LITERAL.getIRI().equals(datatypeIRI))&&(__CLR4_5_2rscrsclvicmd62.R.iget(36023)!=0|true))||(__CLR4_5_2rscrsclvicmd62.R.iget(36024)==0&false))) {{
            __CLR4_5_2rscrsclvicmd62.R.inc(36025);writeParseTypeLiteralAttribute();
        } }else {{
            __CLR4_5_2rscrsclvicmd62.R.inc(36026);writer.writeAttribute(RDF_DATATYPE, datatypeIRI.toString());
        }
    }}finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param text
     *        text
     * @throws IOException
     *         io exception
     */
    public void writeTextContent(@Nonnull String text) throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36027);
        __CLR4_5_2rscrsclvicmd62.R.inc(36028);writer.writeTextContent(text);
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param lang
     *        lang
     * @throws IOException
     *         io exception
     */
    public void writeLangAttribute(@Nonnull String lang) throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36029);
        __CLR4_5_2rscrsclvicmd62.R.inc(36030);writer.writeAttribute(XML_LANG, lang);
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @throws IOException
     *         io exception
     */
    public void writeEndElement() throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36031);
        __CLR4_5_2rscrsclvicmd62.R.inc(36032);writer.writeEndElement();
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param value
     *        value
     * @throws IOException
     *         io exception
     */
    public void writeAboutAttribute(@Nonnull IRI value) throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36033);
        __CLR4_5_2rscrsclvicmd62.R.inc(36034);writeAttribute(RDF_ABOUT, value);
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param node
     *        node
     * @throws IOException
     *         io exception
     */
    public void writeNodeIDAttribute(@Nonnull RDFResourceBlankNode node) throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36035);
        __CLR4_5_2rscrsclvicmd62.R.inc(36036);writer.writeAttribute(RDF_NODEID, node.toString());
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param attributeName
     *        attribute name
     * @param value
     *        value
     * @throws IOException
     *         io exception
     */
    public void writeAttribute(@Nonnull IRI attributeName, @Nonnull IRI value) throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36037);
        __CLR4_5_2rscrsclvicmd62.R.inc(36038);writer.writeAttribute(attributeName, checkNotNull(value, "value cannot be null").toString());
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param owlObject
     *        owlObject
     */
    @SuppressWarnings("unused")
    public void writeOWLObject(OWLObject owlObject) {try{__CLR4_5_2rscrsclvicmd62.R.inc(36039);}finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param value
     *        value
     * @throws IOException
     *         io exception
     */
    public void writeResourceAttribute(@Nonnull IRI value) throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36040);
        __CLR4_5_2rscrsclvicmd62.R.inc(36041);writeAttribute(RDF_RESOURCE, value);
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @throws IOException
     *         io exception
     */
    public void startDocument() throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36042);
        __CLR4_5_2rscrsclvicmd62.R.inc(36043);writer.startDocument(RDF_RDF);
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @throws IOException
     *         io exception
     */
    public void endDocument() throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36044);
        __CLR4_5_2rscrsclvicmd62.R.inc(36045);writer.endDocument();
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}

    /**
     * @param comment
     *        comment
     * @throws IOException
     *         io exception
     */
    public void writeComment(@Nonnull String comment) throws IOException {try{__CLR4_5_2rscrsclvicmd62.R.inc(36046);
        __CLR4_5_2rscrsclvicmd62.R.inc(36047);writer.writeComment(comment);
    }finally{__CLR4_5_2rscrsclvicmd62.R.flushNeeded();}}
}
