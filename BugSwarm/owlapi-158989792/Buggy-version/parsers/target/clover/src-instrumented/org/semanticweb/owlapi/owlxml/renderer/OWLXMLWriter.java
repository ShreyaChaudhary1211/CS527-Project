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
package org.semanticweb.owlapi.owlxml.renderer;

import static org.semanticweb.owlapi.vocab.OWLXMLVocabulary.*;

import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.io.OWLRendererIOException;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.NodeID;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriter;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterFactory;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.XMLWriterNamespaceManager;
import org.semanticweb.owlapi.util.StringLengthComparator;
import org.semanticweb.owlapi.util.VersionInfo;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWLFacet;
import org.semanticweb.owlapi.vocab.OWLXMLVocabulary;

import com.google.common.base.Optional;

/**
 * Writes OWL/XML. In an OWL/XML documents written by this writer, the base is
 * always the ontology URI, and the default namespace is always the OWL
 * namespace (http://www.w3.org/2002/07/owl#). Unlike RDF/XML, entity URIs
 * aren't abbreviated using the XML namespace mechanism, instead they are
 * encoded using 'prefix' elements.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLXMLWriter {public static class __CLR4_5_2n5dn5dlvicmca1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,30131,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private static final String LANG_IRI = "xml:lang";
    @Nonnull
    private static final IRI VERSION_IRI = IRI.create(Namespaces.OWL.getPrefixIRI(), "versionIRI");
    @Nonnull
    private static final IRI ONTOLOGY_IRI = IRI.create(Namespaces.OWL.getPrefixIRI(), "ontologyIRI");
    private final XMLWriter writer;
    @Nonnull
    private final Map<String, String> iriPrefixMap = new TreeMap<>(new StringLengthComparator());

    /**
     * @param writer
     *        writer
     * @param ontology
     *        ontology
     */
    public OWLXMLWriter(@Nonnull Writer writer, @Nullable OWLOntology ontology) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30001);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30002);XMLWriterNamespaceManager nsm = new XMLWriterNamespaceManager(Namespaces.OWL.toString());
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30003);nsm.setPrefix("xsd", Namespaces.XSD.toString());
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30004);nsm.setPrefix("rdf", Namespaces.RDF.toString());
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30005);nsm.setPrefix("rdfs", Namespaces.RDFS.toString());
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30006);nsm.setPrefix("xml", Namespaces.XML.toString());
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30007);String base = Namespaces.OWL.toString();
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30008);if ((((ontology != null && !ontology.isAnonymous())&&(__CLR4_5_2n5dn5dlvicmca1.R.iget(30009)!=0|true))||(__CLR4_5_2n5dn5dlvicmca1.R.iget(30010)==0&false))) {{
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30011);base = ontology.getOntologyID().getOntologyIRI().get().toString();
        }
        }__CLR4_5_2n5dn5dlvicmca1.R.inc(30012);this.writer = XMLWriterFactory.createXMLWriter(writer, nsm, base);
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @return iri to prefix map
     */
    public Map<String, String> getIRIPrefixMap() {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30013);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30014);return iriPrefixMap;
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @return namespace manager
     */
    public XMLWriterNamespaceManager getNamespaceManager() {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30015);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30016);return writer.getNamespacePrefixes();
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * A convenience method to write a prefix.
     * 
     * @param prefixName
     *        The name of the prefix (e.g. owl: is the prefix name for the OWL
     *        prefix)
     * @param iri
     *        The prefix iri
     * @throws IOException
     *         io error
     */
    public void writePrefix(String prefixName, String iri) throws IOException {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30017);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30018);writer.writeStartElement(PREFIX.getIRI());
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30019);if ((((prefixName.endsWith(":"))&&(__CLR4_5_2n5dn5dlvicmca1.R.iget(30020)!=0|true))||(__CLR4_5_2n5dn5dlvicmca1.R.iget(30021)==0&false))) {{
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30022);String attName = prefixName.substring(0, prefixName.length() - 1);
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30023);writer.writeAttribute(NAME_ATTRIBUTE.getIRI(), attName);
        } }else {{
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30024);writer.writeAttribute(NAME_ATTRIBUTE.getIRI(), prefixName);
        }
        }__CLR4_5_2n5dn5dlvicmca1.R.inc(30025);writer.writeAttribute(IRI_ATTRIBUTE.getIRI(), iri);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30026);writer.writeEndElement();
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30027);iriPrefixMap.put(iri, prefixName);
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * Gets an IRI attribute value for a full IRI. If the IRI has a prefix that
     * coincides with a written prefix then the compact IRI will be returned,
     * otherwise the full IRI will be returned.
     * 
     * @param iri
     *        The IRI
     * @return Either the compact version of the IRI or the full IRI.
     */
    public String getIRIString(IRI iri) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30028);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30029);String prefixName = iriPrefixMap.get(iri.getNamespace());
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30030);if ((((prefixName == null)&&(__CLR4_5_2n5dn5dlvicmca1.R.iget(30031)!=0|true))||(__CLR4_5_2n5dn5dlvicmca1.R.iget(30032)==0&false))) {{
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30033);return iri.toString();
        }
        }__CLR4_5_2n5dn5dlvicmca1.R.inc(30034);return iri.prefixedBy(prefixName);
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @param ontology
     *        ontology
     * @throws OWLRendererException
     *         renderer error
     */
    public void startDocument(OWLOntology ontology) throws OWLRendererException {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30035);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30036);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30037);writer.startDocument(ONTOLOGY.getIRI());
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30038);if ((((!ontology.isAnonymous())&&(__CLR4_5_2n5dn5dlvicmca1.R.iget(30039)!=0|true))||(__CLR4_5_2n5dn5dlvicmca1.R.iget(30040)==0&false))) {{
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30041);writer.writeAttribute(ONTOLOGY_IRI, ontology.getOntologyID().getOntologyIRI().get().toString());
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30042);Optional<IRI> versionIRI = ontology.getOntologyID().getVersionIRI();
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30043);if ((((versionIRI.isPresent())&&(__CLR4_5_2n5dn5dlvicmca1.R.iget(30044)!=0|true))||(__CLR4_5_2n5dn5dlvicmca1.R.iget(30045)==0&false))) {{
                    __CLR4_5_2n5dn5dlvicmca1.R.inc(30046);writer.writeAttribute(VERSION_IRI, versionIRI.get().toString());
                }
            }}
        }} catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30047);throw new OWLRendererIOException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * 
     */
    public void endDocument() {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30048);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30049);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30050);writer.endDocument();
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30051);writer.writeComment(VersionInfo.getVersionInfo().getGeneratedByMessage());
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30052);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @param name
     *        name
     */
    public void writeStartElement(OWLXMLVocabulary name) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30053);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30054);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30055);writer.writeStartElement(name.getIRI());
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30056);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /** write end element */
    public void writeEndElement() {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30057);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30058);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30059);writer.writeEndElement();
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30060);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * Writes a datatype attributed (used on Literal elements). The full
     * datatype IRI is written out
     * 
     * @param datatype
     *        The datatype
     */
    public void writeDatatypeAttribute(OWLDatatype datatype) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30061);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30062);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30063);writer.writeAttribute(DATATYPE_IRI.getIRI(), datatype.getIRI().toString());
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30064);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @param nodeID
     *        nodeID
     */
    public void writeNodeIDAttribute(NodeID nodeID) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30065);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30066);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30067);writer.writeAttribute(NODE_ID.getIRI(), nodeID.getID());
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30068);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @param iri
     *        iri
     */
    public void writeIRIAttribute(IRI iri) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30069);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30070);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30071);IRI attName = IRI_ATTRIBUTE.getIRI();
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30072);String value = iri.toString();
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30073);if ((((value.startsWith(writer.getXMLBase()))&&(__CLR4_5_2n5dn5dlvicmca1.R.iget(30074)!=0|true))||(__CLR4_5_2n5dn5dlvicmca1.R.iget(30075)==0&false))) {{
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30076);writer.writeAttribute(attName, iriMinusBase(value));
            } }else {{
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30077);String val = getIRIString(iri);
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30078);if ((((!val.equals(iri.toString()))&&(__CLR4_5_2n5dn5dlvicmca1.R.iget(30079)!=0|true))||(__CLR4_5_2n5dn5dlvicmca1.R.iget(30080)==0&false))) {{
                    __CLR4_5_2n5dn5dlvicmca1.R.inc(30081);writer.writeAttribute(ABBREVIATED_IRI_ATTRIBUTE.getIRI(), val);
                } }else {{
                    __CLR4_5_2n5dn5dlvicmca1.R.inc(30082);writer.writeAttribute(attName, val);
                }
            }}
        }} catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30083);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}
    /**
     * @param iri
     *        iri
     */
    public void writeIRIAttribute(String iri) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30084);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30085);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30086);IRI attName = IRI_ATTRIBUTE.getIRI();
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30087);writer.writeAttribute(attName, iri);
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30088);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * Writes an IRI element for a given IRI.
     * 
     * @param iri
     *        The IRI to be written as an element. If the IRI can be abbreviated
     *        then an AbbreviatedIRI element will be written
     */
    public void writeIRIElement(IRI iri) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30089);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30090);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30091);String iriString = iri.toString();
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30092);if ((((iriString.startsWith(writer.getXMLBase()))&&(__CLR4_5_2n5dn5dlvicmca1.R.iget(30093)!=0|true))||(__CLR4_5_2n5dn5dlvicmca1.R.iget(30094)==0&false))) {{
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30095);writeStartElement(IRI_ELEMENT);
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30096);writeTextContent(iriMinusBase(iriString));
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30097);writeEndElement();
            } }else {{
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30098);String val = getIRIString(iri);
                __CLR4_5_2n5dn5dlvicmca1.R.inc(30099);if ((((!val.equals(iriString))&&(__CLR4_5_2n5dn5dlvicmca1.R.iget(30100)!=0|true))||(__CLR4_5_2n5dn5dlvicmca1.R.iget(30101)==0&false))) {{
                    __CLR4_5_2n5dn5dlvicmca1.R.inc(30102);writeStartElement(ABBREVIATED_IRI_ELEMENT);
                    __CLR4_5_2n5dn5dlvicmca1.R.inc(30103);writer.writeTextContent(val);
                    __CLR4_5_2n5dn5dlvicmca1.R.inc(30104);writeEndElement();
                } }else {{
                    __CLR4_5_2n5dn5dlvicmca1.R.inc(30105);writeStartElement(IRI_ELEMENT);
                    __CLR4_5_2n5dn5dlvicmca1.R.inc(30106);writer.writeTextContent(val);
                    __CLR4_5_2n5dn5dlvicmca1.R.inc(30107);writeEndElement();
                }
            }}
        }} catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30108);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    @Nonnull
    String iriMinusBase(String iriString) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30109);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30110);return iriString.substring(writer.getXMLBase().length(), iriString.length());
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @param lang
     *        lang
     */
    public void writeLangAttribute(@Nonnull String lang) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30111);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30112);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30113);writer.writeAttribute(LANG_IRI, lang);
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30114);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @param cardinality
     *        cardinality
     */
    public void writeCardinalityAttribute(int cardinality) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30115);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30116);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30117);writer.writeAttribute(CARDINALITY_ATTRIBUTE.getIRI(), Integer.toString(cardinality));
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30118);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @param text
     *        text
     */
    public void writeTextContent(@Nonnull String text) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30119);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30120);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30121);writer.writeTextContent(text);
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30122);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @param facet
     *        facet
     */
    public void writeFacetAttribute(OWLFacet facet) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30123);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30124);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30125);writer.writeAttribute(DATATYPE_FACET.getIRI(), facet.getIRI().toString());
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30126);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}

    /**
     * @param uri
     *        uri
     */
    public void writeAnnotationURIAttribute(URI uri) {try{__CLR4_5_2n5dn5dlvicmca1.R.inc(30127);
        __CLR4_5_2n5dn5dlvicmca1.R.inc(30128);try {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30129);writer.writeAttribute(ANNOTATION_URI.getIRI(), uri.toString());
        } catch (IOException e) {
            __CLR4_5_2n5dn5dlvicmca1.R.inc(30130);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2n5dn5dlvicmca1.R.flushNeeded();}}
}
