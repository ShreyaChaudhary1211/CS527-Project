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
package org.semanticweb.owlapi.rdf.rdfxml.parser;

import static org.semanticweb.owlapi.rdf.rdfxml.parser.RDFConstants.*;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.XMLUtils;
import org.semanticweb.owlapi.model.NodeID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

abstract class AbstractState {public static class __CLR4_5_2p7fp7flvicmcq5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32731,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //@formatter:off
    @Nonnull static final String DATATYPE_RESOURCE           = "rdf:datatype specified on a node with resource value.";
    @Nonnull static final String TEXT_SEEN                   = "Text was seen and new node is started.";
    @Nonnull static final String RDF_RDF                     = "Expecting rdf:RDF element.";
    @Nonnull static final String OP_EXPECTED                 = "Cannot answer characters when object properties are expected.";
    @Nonnull static final String CHARACTERS_NOT_EXPECTED     = "Characters were not expected.";
    @Nonnull static final String INCORRECT_START             = "incorrect element start encountered.";
    @Nonnull static final String EXPECTING_OBJECT            = "Expecting an object element instead of character content.";
    @Nonnull static final String RDF_RDF_EXPECTED            = "Expecting rdf:rdf element instead of character content.";
    @Nonnull static final String NODE_EXPECTED               = "Cannot answer characters when node is expected.";
    @Nonnull static final String NO_RDF_NODE_ID_ID_ABOUT     = "Element cannot specify both rdf:nodeID and rdf:ID or rdf:about attributes.";
    @Nonnull static final String NO_RDF_ID_AND_ABOUT         = "Element cannot specify both rdf:ID and rdf:about attributes.";
    @Nonnull static final String ABOUT_EACH_PREFIX_UNSUPPORTED = "rdf:aboutEachPrefix attribute is not supported.";
    @Nonnull static final String ABOUT_EACH_UNSUPPORTED      = "rdf:aboutEach attribute is not supported.";
    //@formatter:on
    protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractState.class);
    @Nonnull protected final RDFParser parser;

    AbstractState(@Nonnull RDFParser parser) {try{__CLR4_5_2p7fp7flvicmcq5.R.inc(32667);
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32668);this.parser = parser;
    }finally{__CLR4_5_2p7fp7flvicmcq5.R.flushNeeded();}}

    /**
     * Returns the reification manager for given attributes.
     * 
     * @param atts
     *        the attributes
     * @return the reification manager
     */
    @Nonnull
        ReificationManager getReificationManager(@Nonnull Attributes atts) {try{__CLR4_5_2p7fp7flvicmcq5.R.inc(32669);
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32670);String bagIDAttr = atts.getValue(RDFNS, ATTR_BAG_ID);
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32671);if ((((bagIDAttr == null)&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32672)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32673)==0&false))) {{
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32674);return ReificationManager.INSTANCE;
        } }else {{
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32675);String bagID = parser.resolveIRI('#' + bagIDAttr);
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32676);return new ReifiedStatementBag(bagID, parser);
        }
    }}finally{__CLR4_5_2p7fp7flvicmcq5.R.flushNeeded();}}

    /**
     * Parses the propertyAttributes production.
     * 
     * @param subjectIRI
     *        IRI of the resource whose properties are being parsed
     * @param atts
     *        attributes
     * @param reificationManager
     *        the reification manager
     */
    void propertyAttributes(@Nonnull String subjectIRI, @Nonnull Attributes atts,
        @Nonnull ReificationManager reificationManager) {try{__CLR4_5_2p7fp7flvicmcq5.R.inc(32677);
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32678);int length = atts.getLength();
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32679);for (int i = 0; (((i < length)&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32680)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32681)==0&false)); i++) {{
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32682);String nsIRI = atts.getURI(i);
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32683);String localName = atts.getLocalName(i);
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32684);String value = atts.getValue(i);
            assert (((value != null)&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32685)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32686)==0&false));
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32687);if ((((!XMLNS.equals(nsIRI) && !XMLLANG.equals(localName) && !(RDFNS.equals(nsIRI) && (ATTR_ID.equals(
                localName) || ATTR_NODE_ID.equals(localName) || ATTR_ABOUT.equals(localName) || ELT_TYPE.equals(
                    localName) || ATTR_RESOURCE.equals(localName) || ATTR_PARSE_TYPE.equals(localName)
                || ATTR_ABOUT_EACH.equals(localName) || ATTR_ABOUT_EACH_PREFIX.equals(localName) || ATTR_BAG_ID.equals(
                    localName))))&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32688)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32689)==0&false))) {{
                __CLR4_5_2p7fp7flvicmcq5.R.inc(32690);String reificationID = reificationManager.getReificationID(null, parser);
                __CLR4_5_2p7fp7flvicmcq5.R.inc(32691);parser.statementWithLiteralValue(subjectIRI, nsIRI + localName, value, null, reificationID);
            } }else {__CLR4_5_2p7fp7flvicmcq5.R.inc(32692);if ((((RDFNS.equals(nsIRI) && ELT_TYPE.equals(localName))&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32693)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32694)==0&false))) {{
                __CLR4_5_2p7fp7flvicmcq5.R.inc(32695);String resolvedValue = parser.resolveIRI(value);
                __CLR4_5_2p7fp7flvicmcq5.R.inc(32696);String reificationID = reificationManager.getReificationID(null, parser);
                __CLR4_5_2p7fp7flvicmcq5.R.inc(32697);parser.statementWithResourceValue(subjectIRI, nsIRI + localName, resolvedValue, reificationID);
            }
        }}}
    }}finally{__CLR4_5_2p7fp7flvicmcq5.R.flushNeeded();}}

    /**
     * Extracts the IRI of the resource from rdf:resource or rdf:nodeID
     * attribute. If no attribute is found, {@code null} is returned.
     * 
     * @param atts
     *        the attributes
     * @return the IRI of the resource or {@code null}
     */
    @Nullable
        String getNodeIDResourceResourceIRI(@Nonnull Attributes atts) {try{__CLR4_5_2p7fp7flvicmcq5.R.inc(32698);
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32699);String value = atts.getValue(RDFNS, ATTR_RESOURCE);
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32700);if ((((value != null)&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32701)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32702)==0&false))) {{
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32703);return parser.resolveIRI(value);
        } }else {{
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32704);value = atts.getValue(RDFNS, ATTR_NODE_ID);
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32705);if ((((value != null)&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32706)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32707)==0&false))) {{
                __CLR4_5_2p7fp7flvicmcq5.R.inc(32708);return NodeID.getIRIFromNodeID(value);
            } }else {{
                __CLR4_5_2p7fp7flvicmcq5.R.inc(32709);return null;
            }
        }}
    }}finally{__CLR4_5_2p7fp7flvicmcq5.R.flushNeeded();}}

    /**
     * Checks whether given characters contain only whitespace.
     * 
     * @param data
     *        the data being checked
     * @param start
     *        the start index (inclusive)
     * @param length
     *        the end index (non-inclusive)
     * @return {@code true} if characters contain whitespace
     */
    boolean notBlank(char[] data, int start, int length) {try{__CLR4_5_2p7fp7flvicmcq5.R.inc(32710);
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32711);int end = start + length;
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32712);for (int i = start; (((i < end)&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32713)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32714)==0&false)); i++) {{
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32715);if ((((notSpace(data[i]))&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32716)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32717)==0&false))) {{
                __CLR4_5_2p7fp7flvicmcq5.R.inc(32718);return true;
            }
        }}
        }__CLR4_5_2p7fp7flvicmcq5.R.inc(32719);return false;
    }finally{__CLR4_5_2p7fp7flvicmcq5.R.flushNeeded();}}

    /**
     * @param c
     *        character to test
     * @return true if the character is other than a space, carriage return, or
     *         tabulator
     */
    boolean notSpace(char c) {try{__CLR4_5_2p7fp7flvicmcq5.R.inc(32720);
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32721);return c != ' ' && c != '\n' && c != '\r' && c != '\t';
    }finally{__CLR4_5_2p7fp7flvicmcq5.R.flushNeeded();}}

    /**
     * Checks whether given characters contain only whitespace.
     * 
     * @param buffer
     *        the data being checked
     * @return {@code true} if characters contain whitespace
     */
    boolean notBlank(@Nonnull StringBuilder buffer) {try{__CLR4_5_2p7fp7flvicmcq5.R.inc(32722);
        __CLR4_5_2p7fp7flvicmcq5.R.inc(32723);for (int i = 0; (((i < buffer.length())&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32724)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32725)==0&false)); i++) {{
            __CLR4_5_2p7fp7flvicmcq5.R.inc(32726);if ((((notSpace(buffer.charAt(i)))&&(__CLR4_5_2p7fp7flvicmcq5.R.iget(32727)!=0|true))||(__CLR4_5_2p7fp7flvicmcq5.R.iget(32728)==0&false))) {{
                __CLR4_5_2p7fp7flvicmcq5.R.inc(32729);return true;
            }
        }}
        }__CLR4_5_2p7fp7flvicmcq5.R.inc(32730);return false;
    }finally{__CLR4_5_2p7fp7flvicmcq5.R.flushNeeded();}}
}

/** State expecting start of RDF text. */
class StartRDF extends AbstractState implements State {public static class __CLR4_5_2p7fp97lvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32746,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    StartRDF(@Nonnull RDFParser parser) {
        super(parser);__CLR4_5_2p7fp97lvicmcq6.R.inc(32732);try{__CLR4_5_2p7fp97lvicmcq6.R.inc(32731);
    }finally{__CLR4_5_2p7fp97lvicmcq6.R.flushNeeded();}}

    @Override
    public void startElement(String namespaceIRI, String localName, String qName, @Nonnull Attributes atts) {try{__CLR4_5_2p7fp97lvicmcq6.R.inc(32733);
        __CLR4_5_2p7fp97lvicmcq6.R.inc(32734);parser.verify(!RDFNS.equals(namespaceIRI) || !ELT_RDF.equals(localName), RDF_RDF);
        __CLR4_5_2p7fp97lvicmcq6.R.inc(32735);String value = atts.getValue(XMLNS, "base");
        __CLR4_5_2p7fp97lvicmcq6.R.inc(32736);if ((((value == null)&&(__CLR4_5_2p7fp97lvicmcq6.R.iget(32737)!=0|true))||(__CLR4_5_2p7fp97lvicmcq6.R.iget(32738)==0&false))) {{
            __CLR4_5_2p7fp97lvicmcq6.R.inc(32739);LOGGER.info("Notice: root element does not have an xml:base. Relative IRIs will be resolved against {}",
                parser.getBaseIRI());
        }
        // the logical IRI is the current IRI that we have as the base IRI
        // at this point
        }__CLR4_5_2p7fp97lvicmcq6.R.inc(32740);parser.consumer.logicalURI(parser.getBaseIRI());
        __CLR4_5_2p7fp97lvicmcq6.R.inc(32741);parser.pushState(new NodeElementList(parser));
    }finally{__CLR4_5_2p7fp97lvicmcq6.R.flushNeeded();}}

    @Override
    public void endElement(String namespaceIRI, String localName, String qName) {try{__CLR4_5_2p7fp97lvicmcq6.R.inc(32742);
        __CLR4_5_2p7fp97lvicmcq6.R.inc(32743);parser.popState();
    }finally{__CLR4_5_2p7fp97lvicmcq6.R.flushNeeded();}}

    @Override
    public void characters(char[] data, int start, int length) {try{__CLR4_5_2p7fp97lvicmcq6.R.inc(32744);
        __CLR4_5_2p7fp97lvicmcq6.R.inc(32745);parser.verify(notBlank(data, start, length), RDF_RDF_EXPECTED);
    }finally{__CLR4_5_2p7fp97lvicmcq6.R.flushNeeded();}}
}

/** Parses emptyPropertyElt production. */
class EmptyPropertyElement extends AbstractState implements State {public static class __CLR4_5_2p7fp9mlvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32766,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull protected final NodeElement nodeElement;
    protected String pIRI;

    @Nonnull
    protected String propertyIRI() {try{__CLR4_5_2p7fp9mlvicmcq6.R.inc(32746);
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32747);return verifyNotNull(pIRI);
    }finally{__CLR4_5_2p7fp9mlvicmcq6.R.flushNeeded();}}

    EmptyPropertyElement(@Nonnull NodeElement nodeElement, @Nonnull RDFParser parser) {
        super(parser);__CLR4_5_2p7fp9mlvicmcq6.R.inc(32749);try{__CLR4_5_2p7fp9mlvicmcq6.R.inc(32748);
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32750);this.nodeElement = nodeElement;
    }finally{__CLR4_5_2p7fp9mlvicmcq6.R.flushNeeded();}}

    @Override
    public void startElement(String namespaceIRI, String localName, String qName, @Nonnull Attributes atts) {try{__CLR4_5_2p7fp9mlvicmcq6.R.inc(32751);
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32752);parser.verify(pIRI != null, INCORRECT_START);
        // this is the invocation on the outer element
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32753);pIRI = nodeElement.getPropertyIRI(namespaceIRI + localName);
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32754);String reificationID = nodeElement.getReificationID(atts);
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32755);String objectIRI = getNodeIDResourceResourceIRI(atts);
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32756);if ((((objectIRI == null)&&(__CLR4_5_2p7fp9mlvicmcq6.R.iget(32757)!=0|true))||(__CLR4_5_2p7fp9mlvicmcq6.R.iget(32758)==0&false))) {{
            __CLR4_5_2p7fp9mlvicmcq6.R.inc(32759);objectIRI = NodeID.nextAnonymousIRI();
        }
        }__CLR4_5_2p7fp9mlvicmcq6.R.inc(32760);parser.statementWithResourceValue(nodeElement.subjectIRI(), propertyIRI(), objectIRI, reificationID);
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32761);propertyAttributes(objectIRI, atts, getReificationManager(atts));
    }finally{__CLR4_5_2p7fp9mlvicmcq6.R.flushNeeded();}}

    @Override
    public void endElement(String namespaceIRI, String localName, String qName) {try{__CLR4_5_2p7fp9mlvicmcq6.R.inc(32762);
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32763);parser.popState();
    }finally{__CLR4_5_2p7fp9mlvicmcq6.R.flushNeeded();}}

    @Override
    public void characters(char[] data, int start, int length) {try{__CLR4_5_2p7fp9mlvicmcq6.R.inc(32764);
        __CLR4_5_2p7fp9mlvicmcq6.R.inc(32765);parser.verify(true, CHARACTERS_NOT_EXPECTED);
    }finally{__CLR4_5_2p7fp9mlvicmcq6.R.flushNeeded();}}
}

/** Parses the nodeElement production. */
class NodeElement extends AbstractState implements State {public static class __CLR4_5_2p7fpa6lvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32829,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected String subjectIRI;
    protected ReificationManager reificationManager;
    @Nonnull protected final AtomicLong nextLi = new AtomicLong(1);

    NodeElement(@Nonnull RDFParser parser) {
        super(parser);__CLR4_5_2p7fpa6lvicmcq6.R.inc(32767);try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32766);
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}

    @Nonnull
    protected String subjectIRI() {try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32768);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32769);return verifyNotNull(subjectIRI);
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}

    void startDummyElement(@Nonnull Attributes atts) {try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32770);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32771);subjectIRI = NodeID.nextAnonymousIRI();
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32772);reificationManager = getReificationManager(atts);
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}

    /**
     * @param atts
     *        the atts
     * @return reification id
     */
    @Nullable
        String getReificationID(@Nonnull Attributes atts) {try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32773);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32774);String rdfID = atts.getValue(RDFNS, ATTR_ID);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32775);if ((((rdfID != null)&&(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32776)!=0|true))||(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32777)==0&false))) {{
            __CLR4_5_2p7fpa6lvicmcq6.R.inc(32778);rdfID = parser.resolveIRI('#' + rdfID);
        }
        }__CLR4_5_2p7fpa6lvicmcq6.R.inc(32779);return reificationManager.getReificationID(rdfID, parser);
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}

    /** @return next list item */
    @Nonnull
        String getNextLi() {try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32780);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32781);return RDFNS + '_' + nextLi.getAndIncrement();
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}

    /**
     * @param uri
     *        the uri
     * @return property iri
     */
    @Nonnull
        String getPropertyIRI(@Nonnull String uri) {try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32782);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32783);if ((((RDF_LI.equals(uri))&&(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32784)!=0|true))||(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32785)==0&false))) {{
            __CLR4_5_2p7fpa6lvicmcq6.R.inc(32786);return getNextLi();
        }
        }__CLR4_5_2p7fpa6lvicmcq6.R.inc(32787);return uri;
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}

    @Override
    public void startElement(String namespaceIRI, String localName, String qName, @Nonnull Attributes atts) {try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32788);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32789);subjectIRI = getIDNodeIDAboutResourceIRI(atts);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32790);boolean isRDFNS = RDFNS.equals(namespaceIRI);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32791);reificationManager = getReificationManager(atts);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32792);if ((((!isRDFNS || !ELT_DESCRIPTION.equals(localName))&&(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32793)!=0|true))||(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32794)==0&false))) {{
            __CLR4_5_2p7fpa6lvicmcq6.R.inc(32795);parser.statementWithResourceValue(subjectIRI(), RDF_TYPE, namespaceIRI + localName, reificationManager
                .getReificationID(null, parser));
        }
        // Checks if attribute list contains some of the unsupported attributes.
        }__CLR4_5_2p7fpa6lvicmcq6.R.inc(32796);parser.verify(atts.getIndex(RDFNS, ATTR_ABOUT_EACH) != -1, ABOUT_EACH_UNSUPPORTED);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32797);parser.verify(atts.getIndex(RDFNS, ATTR_ABOUT_EACH_PREFIX) != -1, ABOUT_EACH_PREFIX_UNSUPPORTED);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32798);propertyAttributes(subjectIRI(), atts, verifyNotNull(reificationManager));
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32799);parser.pushState(new PropertyElementList(this, parser));
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}

    /**
     * Extracts the IRI of the resource from rdf:ID, rdf:nodeID or rdf:about
     * attribute. If no attribute is found, an IRI is generated.
     * 
     * @param atts
     *        atts
     * @return string for IRI
     */
    @Nonnull
        String getIDNodeIDAboutResourceIRI(@Nonnull Attributes atts) {try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32800);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32801);checkNotNull(atts, "atts cannot be null");
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32802);String result = null;
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32803);String value = atts.getValue(RDFNS, ATTR_ID);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32804);if ((((value != null)&&(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32805)!=0|true))||(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32806)==0&false))) {{
            __CLR4_5_2p7fpa6lvicmcq6.R.inc(32807);result = parser.resolveIRI('#' + value);
        }
        }__CLR4_5_2p7fpa6lvicmcq6.R.inc(32808);value = atts.getValue(RDFNS, ATTR_ABOUT);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32809);if ((((value != null)&&(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32810)!=0|true))||(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32811)==0&false))) {{
            __CLR4_5_2p7fpa6lvicmcq6.R.inc(32812);parser.verify(result != null, NO_RDF_ID_AND_ABOUT);
            __CLR4_5_2p7fpa6lvicmcq6.R.inc(32813);result = parser.resolveIRI(value);
        }
        }__CLR4_5_2p7fpa6lvicmcq6.R.inc(32814);value = atts.getValue(RDFNS, ATTR_NODE_ID);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32815);if ((((value != null)&&(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32816)!=0|true))||(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32817)==0&false))) {{
            __CLR4_5_2p7fpa6lvicmcq6.R.inc(32818);parser.verify(result != null, NO_RDF_NODE_ID_ID_ABOUT);
            __CLR4_5_2p7fpa6lvicmcq6.R.inc(32819);result = NodeID.getIRIFromNodeID(value);
        }
        }__CLR4_5_2p7fpa6lvicmcq6.R.inc(32820);if ((((result == null)&&(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32821)!=0|true))||(__CLR4_5_2p7fpa6lvicmcq6.R.iget(32822)==0&false))) {{
            __CLR4_5_2p7fpa6lvicmcq6.R.inc(32823);result = NodeID.nextAnonymousIRI();
        }
        }__CLR4_5_2p7fpa6lvicmcq6.R.inc(32824);return result;
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}

    @Override
    public void endElement(String namespaceIRI, String localName, String qName) {try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32825);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32826);parser.popState();
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}

    @Override
    public void characters(char[] data, int start, int length) {try{__CLR4_5_2p7fpa6lvicmcq6.R.inc(32827);
        __CLR4_5_2p7fpa6lvicmcq6.R.inc(32828);parser.verify(notBlank(data, start, length), NODE_EXPECTED);
    }finally{__CLR4_5_2p7fpa6lvicmcq6.R.flushNeeded();}}
}

/** Parses the nodeElementList production. */
class NodeElementList extends AbstractState implements State {public static class __CLR4_5_2p7fpbxlvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32839,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    NodeElementList(@Nonnull RDFParser parser) {
        super(parser);__CLR4_5_2p7fpbxlvicmcq6.R.inc(32830);try{__CLR4_5_2p7fpbxlvicmcq6.R.inc(32829);
    }finally{__CLR4_5_2p7fpbxlvicmcq6.R.flushNeeded();}}

    @Override
    public void startElement(String namespaceIRI, String localName, String qName, Attributes atts) throws SAXException {try{__CLR4_5_2p7fpbxlvicmcq6.R.inc(32831);
        __CLR4_5_2p7fpbxlvicmcq6.R.inc(32832);parser.pushState(new NodeElement(parser));
        __CLR4_5_2p7fpbxlvicmcq6.R.inc(32833);parser.state.startElement(namespaceIRI, localName, qName, atts);
    }finally{__CLR4_5_2p7fpbxlvicmcq6.R.flushNeeded();}}

    @Override
    public void endElement(String namespaceIRI, String localName, String qName) throws SAXException {try{__CLR4_5_2p7fpbxlvicmcq6.R.inc(32834);
        __CLR4_5_2p7fpbxlvicmcq6.R.inc(32835);parser.popState();
        __CLR4_5_2p7fpbxlvicmcq6.R.inc(32836);parser.state.endElement(namespaceIRI, localName, qName);
    }finally{__CLR4_5_2p7fpbxlvicmcq6.R.flushNeeded();}}

    @Override
    public void characters(char[] data, int start, int length) {try{__CLR4_5_2p7fpbxlvicmcq6.R.inc(32837);
        __CLR4_5_2p7fpbxlvicmcq6.R.inc(32838);parser.verify(notBlank(data, start, length), EXPECTING_OBJECT);
    }finally{__CLR4_5_2p7fpbxlvicmcq6.R.flushNeeded();}}
}

/** Parses parseTypeCollectionPropertyElt production. */
class ParseTypeCollectionElement extends AbstractState implements State {public static class __CLR4_5_2p7fpc7lvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32876,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected final NodeElement nodeElement;
    protected String pIRI;
    @Nullable protected String reificationID;
    protected String lastCellIRI;

    @Nonnull
    protected String lastCell() {try{__CLR4_5_2p7fpc7lvicmcq6.R.inc(32839);
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32840);return verifyNotNull(lastCellIRI);
    }finally{__CLR4_5_2p7fpc7lvicmcq6.R.flushNeeded();}}

    @Nonnull
    protected String propertyIRI() {try{__CLR4_5_2p7fpc7lvicmcq6.R.inc(32841);
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32842);return verifyNotNull(pIRI);
    }finally{__CLR4_5_2p7fpc7lvicmcq6.R.flushNeeded();}}

    ParseTypeCollectionElement(NodeElement nodeElement, @Nonnull RDFParser parser) {
        super(parser);__CLR4_5_2p7fpc7lvicmcq6.R.inc(32844);try{__CLR4_5_2p7fpc7lvicmcq6.R.inc(32843);
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32845);this.nodeElement = nodeElement;
    }finally{__CLR4_5_2p7fpc7lvicmcq6.R.flushNeeded();}}

    @Override
    public void startElement(String namespaceIRI, String localName, String qName, @Nonnull Attributes atts)
        throws SAXException {try{__CLR4_5_2p7fpc7lvicmcq6.R.inc(32846);
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32847);if ((((pIRI == null)&&(__CLR4_5_2p7fpc7lvicmcq6.R.iget(32848)!=0|true))||(__CLR4_5_2p7fpc7lvicmcq6.R.iget(32849)==0&false))) {{
            __CLR4_5_2p7fpc7lvicmcq6.R.inc(32850);pIRI = nodeElement.getPropertyIRI(namespaceIRI + localName);
            __CLR4_5_2p7fpc7lvicmcq6.R.inc(32851);reificationID = nodeElement.getReificationID(atts);
        } }else {{
            __CLR4_5_2p7fpc7lvicmcq6.R.inc(32852);NodeElement collectionNode = new NodeElement(parser);
            __CLR4_5_2p7fpc7lvicmcq6.R.inc(32853);parser.pushState(collectionNode);
            __CLR4_5_2p7fpc7lvicmcq6.R.inc(32854);parser.state.startElement(namespaceIRI, localName, qName, atts);
            __CLR4_5_2p7fpc7lvicmcq6.R.inc(32855);String newListCellIRI = listCell(collectionNode.subjectIRI());
            __CLR4_5_2p7fpc7lvicmcq6.R.inc(32856);if ((((lastCellIRI == null)&&(__CLR4_5_2p7fpc7lvicmcq6.R.iget(32857)!=0|true))||(__CLR4_5_2p7fpc7lvicmcq6.R.iget(32858)==0&false))) {{
                __CLR4_5_2p7fpc7lvicmcq6.R.inc(32859);parser.statementWithResourceValue(nodeElement.subjectIRI(), propertyIRI(), newListCellIRI,
                    reificationID);
            } }else {{
                __CLR4_5_2p7fpc7lvicmcq6.R.inc(32860);parser.statementWithResourceValue(lastCell(), RDF_REST, newListCellIRI, null);
            }
            }__CLR4_5_2p7fpc7lvicmcq6.R.inc(32861);lastCellIRI = newListCellIRI;
        }
    }}finally{__CLR4_5_2p7fpc7lvicmcq6.R.flushNeeded();}}

    @Nonnull
        String listCell(@Nonnull String valueIRI) {try{__CLR4_5_2p7fpc7lvicmcq6.R.inc(32862);
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32863);String listCellIRI = NodeID.nextAnonymousIRI();
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32864);parser.statementWithResourceValue(listCellIRI, RDF_FIRST, valueIRI, null);
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32865);parser.statementWithResourceValue(listCellIRI, RDF_TYPE, RDF_LIST, null);
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32866);return listCellIRI;
    }finally{__CLR4_5_2p7fpc7lvicmcq6.R.flushNeeded();}}

    @Override
    public void endElement(String namespaceIRI, String localName, String qName) {try{__CLR4_5_2p7fpc7lvicmcq6.R.inc(32867);
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32868);if ((((lastCellIRI == null)&&(__CLR4_5_2p7fpc7lvicmcq6.R.iget(32869)!=0|true))||(__CLR4_5_2p7fpc7lvicmcq6.R.iget(32870)==0&false))) {{
            __CLR4_5_2p7fpc7lvicmcq6.R.inc(32871);parser.statementWithResourceValue(nodeElement.subjectIRI(), propertyIRI(), RDF_NIL, reificationID);
        } }else {{
            __CLR4_5_2p7fpc7lvicmcq6.R.inc(32872);parser.statementWithResourceValue(lastCell(), RDF_REST, RDF_NIL, null);
        }
        }__CLR4_5_2p7fpc7lvicmcq6.R.inc(32873);parser.popState();
    }finally{__CLR4_5_2p7fpc7lvicmcq6.R.flushNeeded();}}

    @Override
    public void characters(char[] data, int start, int length) {try{__CLR4_5_2p7fpc7lvicmcq6.R.inc(32874);
        __CLR4_5_2p7fpc7lvicmcq6.R.inc(32875);parser.verify(notBlank(data, start, length), EXPECTING_OBJECT);
    }finally{__CLR4_5_2p7fpc7lvicmcq6.R.flushNeeded();}}
}

/**
 * Parses resourcePropertyElt or literalPropertyElt productions. m_text is
 * {@code null} when startElement is expected on the actual property element.
 */
class ResourceOrLiteralElement extends AbstractState implements State {public static class __CLR4_5_2p7fpd8lvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32907,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull protected final NodeElement nodeElement;
    protected String propertyIRI;
    @Nullable protected String reificationID;
    protected String datatype;
    protected StringBuilder text;
    protected NodeElement innerNode;

    @Nonnull
    protected String propertyIRI() {try{__CLR4_5_2p7fpd8lvicmcq6.R.inc(32876);
        __CLR4_5_2p7fpd8lvicmcq6.R.inc(32877);return verifyNotNull(propertyIRI);
    }finally{__CLR4_5_2p7fpd8lvicmcq6.R.flushNeeded();}}

    ResourceOrLiteralElement(@Nonnull NodeElement nodeElement, @Nonnull RDFParser parser) {
        super(parser);__CLR4_5_2p7fpd8lvicmcq6.R.inc(32879);try{__CLR4_5_2p7fpd8lvicmcq6.R.inc(32878);
        __CLR4_5_2p7fpd8lvicmcq6.R.inc(32880);this.nodeElement = nodeElement;
    }finally{__CLR4_5_2p7fpd8lvicmcq6.R.flushNeeded();}}

    @Override
    public void startElement(String namespaceIRI, String localName, String qName, @Nonnull Attributes atts)
        throws SAXException {try{__CLR4_5_2p7fpd8lvicmcq6.R.inc(32881);
        __CLR4_5_2p7fpd8lvicmcq6.R.inc(32882);if ((((text == null)&&(__CLR4_5_2p7fpd8lvicmcq6.R.iget(32883)!=0|true))||(__CLR4_5_2p7fpd8lvicmcq6.R.iget(32884)==0&false))) {{
            // this is the invocation on the outer element
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32885);propertyIRI = nodeElement.getPropertyIRI(namespaceIRI + localName);
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32886);reificationID = nodeElement.getReificationID(atts);
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32887);datatype = atts.getValue(RDFNS, ATTR_DATATYPE);
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32888);text = new StringBuilder();
        } }else {{
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32889);parser.verify(notBlank(verifyNotNull(text)), TEXT_SEEN);
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32890);parser.verify(datatype != null, DATATYPE_RESOURCE);
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32891);innerNode = new NodeElement(parser);
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32892);parser.pushState(innerNode);
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32893);parser.state.startElement(namespaceIRI, localName, qName, atts);
        }
    }}finally{__CLR4_5_2p7fpd8lvicmcq6.R.flushNeeded();}}

    @Override
    public void endElement(String namespaceIRI, String localName, String qName) {try{__CLR4_5_2p7fpd8lvicmcq6.R.inc(32894);
        __CLR4_5_2p7fpd8lvicmcq6.R.inc(32895);if ((((innerNode != null)&&(__CLR4_5_2p7fpd8lvicmcq6.R.iget(32896)!=0|true))||(__CLR4_5_2p7fpd8lvicmcq6.R.iget(32897)==0&false))) {{
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32898);parser.statementWithResourceValue(nodeElement.subjectIRI(), propertyIRI(), innerNode.subjectIRI(),
                reificationID);
        } }else {{
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32899);parser.statementWithLiteralValue(nodeElement.subjectIRI(), propertyIRI(), verifyNotNull(text.toString()),
                datatype, reificationID);
        }
        }__CLR4_5_2p7fpd8lvicmcq6.R.inc(32900);parser.popState();
    }finally{__CLR4_5_2p7fpd8lvicmcq6.R.flushNeeded();}}

    @Override
    public void characters(char[] data, int start, int length) {try{__CLR4_5_2p7fpd8lvicmcq6.R.inc(32901);
        __CLR4_5_2p7fpd8lvicmcq6.R.inc(32902);if ((((innerNode != null)&&(__CLR4_5_2p7fpd8lvicmcq6.R.iget(32903)!=0|true))||(__CLR4_5_2p7fpd8lvicmcq6.R.iget(32904)==0&false))) {{
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32905);parser.verify(notBlank(data, start, length), OP_EXPECTED);
        } }else {{
            __CLR4_5_2p7fpd8lvicmcq6.R.inc(32906);text.append(data, start, length);
        }
    }}finally{__CLR4_5_2p7fpd8lvicmcq6.R.flushNeeded();}}
}

/** Parses parseTypeLiteralPropertyElt production. */
class ParseTypeLiteralElement extends AbstractState implements State {public static class __CLR4_5_2p7fpe3lvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32948,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected final NodeElement nodeElement;
    protected String pIRI;
    @Nullable protected String reificationID;
    protected int depth;
    protected StringBuilder m_content;
    // avoid multiple redeclarations of namespace abbreviations in XML Literals
    protected Set<String> declaredNamespaces = new HashSet<>(2);

    @Nonnull
    protected String propertyIRI() {try{__CLR4_5_2p7fpe3lvicmcq6.R.inc(32907);
        __CLR4_5_2p7fpe3lvicmcq6.R.inc(32908);return verifyNotNull(pIRI);
    }finally{__CLR4_5_2p7fpe3lvicmcq6.R.flushNeeded();}}

    ParseTypeLiteralElement(NodeElement nodeElement, @Nonnull RDFParser parser) {
        super(parser);__CLR4_5_2p7fpe3lvicmcq6.R.inc(32910);try{__CLR4_5_2p7fpe3lvicmcq6.R.inc(32909);
        __CLR4_5_2p7fpe3lvicmcq6.R.inc(32911);this.nodeElement = nodeElement;
    }finally{__CLR4_5_2p7fpe3lvicmcq6.R.flushNeeded();}}

    @Override
    public void startElement(String namespaceIRI, String localName, String qName, @Nonnull Attributes atts) {try{__CLR4_5_2p7fpe3lvicmcq6.R.inc(32912);
        __CLR4_5_2p7fpe3lvicmcq6.R.inc(32913);if ((((depth == 0)&&(__CLR4_5_2p7fpe3lvicmcq6.R.iget(32914)!=0|true))||(__CLR4_5_2p7fpe3lvicmcq6.R.iget(32915)==0&false))) {{
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32916);pIRI = nodeElement.getPropertyIRI(namespaceIRI + localName);
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32917);reificationID = nodeElement.getReificationID(atts);
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32918);m_content = new StringBuilder();
        } }else {{
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32919);m_content.append('<');
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32920);m_content.append(qName);
            // ensure namespace declarations are added at the root, and only if
            // not already added in a parent node
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32921);if ((((!localName.equals(qName) && declaredNamespaces.add(namespaceIRI))&&(__CLR4_5_2p7fpe3lvicmcq6.R.iget(32922)!=0|true))||(__CLR4_5_2p7fpe3lvicmcq6.R.iget(32923)==0&false))) {{
                __CLR4_5_2p7fpe3lvicmcq6.R.inc(32924);m_content.append(" xmlns:").append(qName.substring(0, qName.indexOf(':'))).append("=\"").append(
                    namespaceIRI).append('"');
            }
            }__CLR4_5_2p7fpe3lvicmcq6.R.inc(32925);int length = atts.getLength();
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32926);for (int i = 0; (((i < length)&&(__CLR4_5_2p7fpe3lvicmcq6.R.iget(32927)!=0|true))||(__CLR4_5_2p7fpe3lvicmcq6.R.iget(32928)==0&false)); i++) {{
                __CLR4_5_2p7fpe3lvicmcq6.R.inc(32929);m_content.append(' ');
                __CLR4_5_2p7fpe3lvicmcq6.R.inc(32930);m_content.append(atts.getQName(i));
                __CLR4_5_2p7fpe3lvicmcq6.R.inc(32931);m_content.append("=\"");
                __CLR4_5_2p7fpe3lvicmcq6.R.inc(32932);m_content.append(atts.getValue(i));
                __CLR4_5_2p7fpe3lvicmcq6.R.inc(32933);m_content.append('"');
            }
            }__CLR4_5_2p7fpe3lvicmcq6.R.inc(32934);m_content.append('>');
        }
        }__CLR4_5_2p7fpe3lvicmcq6.R.inc(32935);depth++;
    }finally{__CLR4_5_2p7fpe3lvicmcq6.R.flushNeeded();}}

    @Override
    public void endElement(String namespaceIRI, String localName, String qName) {try{__CLR4_5_2p7fpe3lvicmcq6.R.inc(32936);
        __CLR4_5_2p7fpe3lvicmcq6.R.inc(32937);if ((((depth == 1)&&(__CLR4_5_2p7fpe3lvicmcq6.R.iget(32938)!=0|true))||(__CLR4_5_2p7fpe3lvicmcq6.R.iget(32939)==0&false))) {{
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32940);parser.statementWithLiteralValue(nodeElement.subjectIRI(), propertyIRI(), verifyNotNull(m_content
                .toString()), RDF_XMLLITERAL, reificationID);
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32941);parser.popState();
        } }else {{
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32942);m_content.append("</");
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32943);m_content.append(qName);
            __CLR4_5_2p7fpe3lvicmcq6.R.inc(32944);m_content.append('>');
        }
        }__CLR4_5_2p7fpe3lvicmcq6.R.inc(32945);depth--;
    }finally{__CLR4_5_2p7fpe3lvicmcq6.R.flushNeeded();}}

    @Override
    public void characters(char[] data, int start, int length) {try{__CLR4_5_2p7fpe3lvicmcq6.R.inc(32946);
        __CLR4_5_2p7fpe3lvicmcq6.R.inc(32947);XMLUtils.escapeXML(data, start, length, m_content);
    }finally{__CLR4_5_2p7fpe3lvicmcq6.R.flushNeeded();}}
}

/** Parses parseTypeResourcePropertyElt production. */
class ParseTypeResourceElement extends AbstractState implements State {public static class __CLR4_5_2p7fpf8lvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32962,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected final NodeElement nodeElement;
    protected String mpIRI;
    @Nullable protected String reificationID;

    ParseTypeResourceElement(NodeElement nodeElement, @Nonnull RDFParser parser) {
        super(parser);__CLR4_5_2p7fpf8lvicmcq6.R.inc(32949);try{__CLR4_5_2p7fpf8lvicmcq6.R.inc(32948);
        __CLR4_5_2p7fpf8lvicmcq6.R.inc(32950);this.nodeElement = nodeElement;
    }finally{__CLR4_5_2p7fpf8lvicmcq6.R.flushNeeded();}}

    @Override
    public void startElement(String namespaceIRI, String localName, String qName, @Nonnull Attributes atts) {try{__CLR4_5_2p7fpf8lvicmcq6.R.inc(32951);
        __CLR4_5_2p7fpf8lvicmcq6.R.inc(32952);mpIRI = nodeElement.getPropertyIRI(namespaceIRI + localName);
        __CLR4_5_2p7fpf8lvicmcq6.R.inc(32953);reificationID = nodeElement.getReificationID(atts);
        __CLR4_5_2p7fpf8lvicmcq6.R.inc(32954);NodeElement anonymousNodeElement = new NodeElement(parser);
        __CLR4_5_2p7fpf8lvicmcq6.R.inc(32955);anonymousNodeElement.startDummyElement(atts);
        __CLR4_5_2p7fpf8lvicmcq6.R.inc(32956);parser.statementWithResourceValue(nodeElement.subjectIRI(), verifyNotNull(mpIRI), anonymousNodeElement
            .subjectIRI(), reificationID);
        __CLR4_5_2p7fpf8lvicmcq6.R.inc(32957);parser.pushState(new PropertyElementList(anonymousNodeElement, parser));
    }finally{__CLR4_5_2p7fpf8lvicmcq6.R.flushNeeded();}}

    @Override
    public void endElement(String namespaceIRI, String localName, String qName) {try{__CLR4_5_2p7fpf8lvicmcq6.R.inc(32958);
        __CLR4_5_2p7fpf8lvicmcq6.R.inc(32959);parser.popState();
    }finally{__CLR4_5_2p7fpf8lvicmcq6.R.flushNeeded();}}

    @Override
    public void characters(char[] data, int start, int length) {try{__CLR4_5_2p7fpf8lvicmcq6.R.inc(32960);
        __CLR4_5_2p7fpf8lvicmcq6.R.inc(32961);parser.verify(notBlank(data, start, length), OP_EXPECTED);
    }finally{__CLR4_5_2p7fpf8lvicmcq6.R.flushNeeded();}}
}

/**
 * Parses the propertyEltList production. The contents of the startElement
 * method implements also the propertyElt production.
 */
class PropertyElementList extends AbstractState implements State {public static class __CLR4_5_2p7fpfmlvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32995,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull protected final NodeElement node;

    PropertyElementList(@Nonnull NodeElement nodeElement, @Nonnull RDFParser parser) {
        super(parser);__CLR4_5_2p7fpfmlvicmcq6.R.inc(32963);try{__CLR4_5_2p7fpfmlvicmcq6.R.inc(32962);
        __CLR4_5_2p7fpfmlvicmcq6.R.inc(32964);node = nodeElement;
    }finally{__CLR4_5_2p7fpfmlvicmcq6.R.flushNeeded();}}

    @Override
    public void startElement(String namespaceIRI, String localName, String qName, @Nonnull Attributes atts)
        throws SAXException {try{__CLR4_5_2p7fpfmlvicmcq6.R.inc(32965);
        __CLR4_5_2p7fpfmlvicmcq6.R.inc(32966);String parseType = atts.getValue(RDFNS, ATTR_PARSE_TYPE);
        // allow for xml literals with specified dataype instead of just
        // parseType=Literal
        __CLR4_5_2p7fpfmlvicmcq6.R.inc(32967);if ((((PARSE_TYPE_LITERAL.equals(parseType) || RDF_XMLLITERAL.equals(atts.getValue(RDFNS, ATTR_DATATYPE)))&&(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32968)!=0|true))||(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32969)==0&false))) {{
            __CLR4_5_2p7fpfmlvicmcq6.R.inc(32970);parser.pushState(new ParseTypeLiteralElement(node, parser));
        } }else {__CLR4_5_2p7fpfmlvicmcq6.R.inc(32971);if ((((PARSE_TYPE_RESOURCE.equals(parseType))&&(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32972)!=0|true))||(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32973)==0&false))) {{
            __CLR4_5_2p7fpfmlvicmcq6.R.inc(32974);parser.pushState(new ParseTypeResourceElement(node, parser));
        } }else {__CLR4_5_2p7fpfmlvicmcq6.R.inc(32975);if ((((PARSE_TYPE_COLLECTION.equals(parseType))&&(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32976)!=0|true))||(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32977)==0&false))) {{
            __CLR4_5_2p7fpfmlvicmcq6.R.inc(32978);parser.pushState(new ParseTypeCollectionElement(node, parser));
        } }else {__CLR4_5_2p7fpfmlvicmcq6.R.inc(32979);if ((((parseType != null)&&(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32980)!=0|true))||(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32981)==0&false))) {{
            __CLR4_5_2p7fpfmlvicmcq6.R.inc(32982);parser.pushState(new ParseTypeLiteralElement(node, parser));
        } }else {{
            __CLR4_5_2p7fpfmlvicmcq6.R.inc(32983);String objectIRI = getNodeIDResourceResourceIRI(atts);
            __CLR4_5_2p7fpfmlvicmcq6.R.inc(32984);if ((((objectIRI != null)&&(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32985)!=0|true))||(__CLR4_5_2p7fpfmlvicmcq6.R.iget(32986)==0&false))) {{
                __CLR4_5_2p7fpfmlvicmcq6.R.inc(32987);parser.pushState(new EmptyPropertyElement(node, parser));
            } }else {{
                __CLR4_5_2p7fpfmlvicmcq6.R.inc(32988);parser.pushState(new ResourceOrLiteralElement(node, parser));
            }
        }}
        }}}}__CLR4_5_2p7fpfmlvicmcq6.R.inc(32989);parser.state.startElement(namespaceIRI, localName, qName, atts);
    }finally{__CLR4_5_2p7fpfmlvicmcq6.R.flushNeeded();}}

    @Override
    public void endElement(String namespaceIRI, String localName, String qName) throws SAXException {try{__CLR4_5_2p7fpfmlvicmcq6.R.inc(32990);
        __CLR4_5_2p7fpfmlvicmcq6.R.inc(32991);parser.popState();
        __CLR4_5_2p7fpfmlvicmcq6.R.inc(32992);parser.state.endElement(namespaceIRI, localName, qName);
    }finally{__CLR4_5_2p7fpfmlvicmcq6.R.flushNeeded();}}

    @Override
    public void characters(char[] data, int start, int length) {try{__CLR4_5_2p7fpfmlvicmcq6.R.inc(32993);
        __CLR4_5_2p7fpfmlvicmcq6.R.inc(32994);parser.verify(notBlank(data, start, length), OP_EXPECTED);
    }finally{__CLR4_5_2p7fpfmlvicmcq6.R.flushNeeded();}}
}

class ReificationManager {public static class __CLR4_5_2p7fpgjlvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32997,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull public static final ReificationManager INSTANCE = new ReificationManager();

    @Nullable
    @SuppressWarnings("unused")
        String getReificationID(String reificationID, @Nonnull RDFParser parser) {try{__CLR4_5_2p7fpgjlvicmcq6.R.inc(32995);
        __CLR4_5_2p7fpgjlvicmcq6.R.inc(32996);return reificationID;
    }finally{__CLR4_5_2p7fpgjlvicmcq6.R.flushNeeded();}}
}

class ReifiedStatementBag extends ReificationManager {public static class __CLR4_5_2p7fpgllvicmcq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,33009,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull protected final AtomicLong elements = new AtomicLong(1);
    @Nonnull protected final String iri;

    ReifiedStatementBag(@Nonnull String uri, @Nonnull RDFParser parser) {try{__CLR4_5_2p7fpgllvicmcq6.R.inc(32997);
        __CLR4_5_2p7fpgllvicmcq6.R.inc(32998);iri = uri;
        __CLR4_5_2p7fpgllvicmcq6.R.inc(32999);parser.statementWithResourceValue(iri, RDF_TYPE, RDF_BAG, null);
    }finally{__CLR4_5_2p7fpgllvicmcq6.R.flushNeeded();}}

    @Nullable
    @Override
        String getReificationID(@Nullable String reificationID, @Nonnull RDFParser parser) {try{__CLR4_5_2p7fpgllvicmcq6.R.inc(33000);
        __CLR4_5_2p7fpgllvicmcq6.R.inc(33001);String resultIRI;
        __CLR4_5_2p7fpgllvicmcq6.R.inc(33002);if ((((reificationID == null)&&(__CLR4_5_2p7fpgllvicmcq6.R.iget(33003)!=0|true))||(__CLR4_5_2p7fpgllvicmcq6.R.iget(33004)==0&false))) {{
            __CLR4_5_2p7fpgllvicmcq6.R.inc(33005);resultIRI = NodeID.nextAnonymousIRI();
        } }else {{
            __CLR4_5_2p7fpgllvicmcq6.R.inc(33006);resultIRI = reificationID;
        }
        }__CLR4_5_2p7fpgllvicmcq6.R.inc(33007);parser.statementWithResourceValue(iri, RDFNS + '_' + elements.getAndIncrement(), resultIRI, null);
        __CLR4_5_2p7fpgllvicmcq6.R.inc(33008);return resultIRI;
    }finally{__CLR4_5_2p7fpgllvicmcq6.R.flushNeeded();}}
}
