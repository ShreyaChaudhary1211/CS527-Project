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

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.NodeID;
import org.semanticweb.owlapi.util.SAXParsers;
import org.xml.sax.*;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.LocatorImpl;

/**
 * This class parses the RDF according to the syntax specified in
 * <a href="http://www.w3.org/TR/rdf-syntax-grammar/" >http://www.w3.org/TR/rdf-
 * syntax-grammar/</a>.
 */
public class RDFParser extends DefaultHandler implements IRIProvider {public static class __CLR4_5_2p0bp0blvicmco2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,32607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String WRONGRESOLVE = "IRI '%s' cannot be resolved against current base IRI %s reason is: %s";
    @Nonnull
    protected static final Locator nullDocumentLocator = new LocatorImpl();
    private final Map<String, String> resolvedIRIs = new HashMap<>();
    protected final Map<String, IRI> uriCache = new HashMap<>();
    /** Registered error handler. */
    protected ErrorHandler errorHandler = new ErrorHandler() {

        @Override
        public void warning(SAXParseException exception) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32411);}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

        @Override
        public void fatalError(SAXParseException exception) throws SAXException {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32412);
            __CLR4_5_2p0bp0blvicmco2.R.inc(32413);throw exception;
        }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

        @Override
        public void error(SAXParseException exception) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32414);}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}
    };
    /** Stack of base IRIs. */
    protected final LinkedList<IRI> baseIRIs = new LinkedList<>();
    private final Map<IRI, URI> baseURICache = new HashMap<>();
    /** IRI of the document being parsed. */
    protected IRI baseIRI;
    /** The stack of languages. */
    @Nonnull
    protected final LinkedList<String> languages = new LinkedList<>();
    /** The current language. */
    protected String language;
    /** Consumer receiving notifications about parsing events. */
    protected RDFConsumer consumer;
    /** Current parser's state. */
    protected State state;
    /** Stack of parser states. */
    protected final List<State> states = new ArrayList<>();
    /** Document locator. */
    protected Locator documentLocator;

    @Nonnull
    protected IRI getBaseIRI() {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32415);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32416);return verifyNotNull(baseIRI, "base IRI has not been set yet");
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Nonnull
    protected Locator getDocumentLocator() {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32417);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32418);if ((((documentLocator != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32419)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32420)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32421);return verifyNotNull(documentLocator);
        }
        }__CLR4_5_2p0bp0blvicmco2.R.inc(32422);return nullDocumentLocator;
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Parses RDF from given input source.
     * 
     * @param source
     *        specifies where RDF comes from
     * @param inputConsumer
     *        receives notifications about RDF parsing events
     * @throws SAXException
     *         SAXException
     * @throws IOException
     *         IOException
     */
    public void parse(@Nonnull InputSource source, @Nonnull RDFConsumer inputConsumer) throws SAXException,
        IOException {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32423);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32424);InputSource s = checkNotNull(source, "source cannot be null");
        __CLR4_5_2p0bp0blvicmco2.R.inc(32425);checkNotNull(inputConsumer, "consumer cannot be null");
        __CLR4_5_2p0bp0blvicmco2.R.inc(32426);String systemID = s.getSystemId();
        __CLR4_5_2p0bp0blvicmco2.R.inc(32427);try {
            __CLR4_5_2p0bp0blvicmco2.R.inc(32428);if ((((systemID != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32429)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32430)==0&false))) {{
                __CLR4_5_2p0bp0blvicmco2.R.inc(32431);baseIRI = IRI.create(new URI(source.getSystemId()));
            } }else {{
                __CLR4_5_2p0bp0blvicmco2.R.inc(32432);throw new SAXException(
                    "Supplied InputSource object myst have systemId property set, which is needed for IRI resolution.");
            }
            }__CLR4_5_2p0bp0blvicmco2.R.inc(32433);consumer = inputConsumer;
            __CLR4_5_2p0bp0blvicmco2.R.inc(32434);inputConsumer.startModel(getBaseIRI());
            __CLR4_5_2p0bp0blvicmco2.R.inc(32435);DeclHandler handler = new DeclHandler() {

                @Override
                public void internalEntityDecl(String name, String value) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32436);
                    __CLR4_5_2p0bp0blvicmco2.R.inc(32437);consumer.addPrefix(name, value);
                }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

                @Override
                public void externalEntityDecl(String name, String publicId, String systemId) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32438);}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

                @Override
                public void elementDecl(String name, String model) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32439);}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

                @Override
                public void attributeDecl(String eName, String aName, String type, String mode, String value) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32440);}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}
            };
            __CLR4_5_2p0bp0blvicmco2.R.inc(32441);SAXParsers.initParserWithOWLAPIStandards(handler).parse(source, this);
            __CLR4_5_2p0bp0blvicmco2.R.inc(32442);inputConsumer.endModel();
        } catch (URISyntaxException e) {
            __CLR4_5_2p0bp0blvicmco2.R.inc(32443);throw new SAXException("Invalid SystemID '" + systemID + "'of the supplied input source.", e);
        } finally {
            __CLR4_5_2p0bp0blvicmco2.R.inc(32444);state = null;
            __CLR4_5_2p0bp0blvicmco2.R.inc(32445);states.clear();
            __CLR4_5_2p0bp0blvicmco2.R.inc(32446);baseIRIs.clear();
        }
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void setDocumentLocator(Locator locator) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32447);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32448);documentLocator = checkNotNull(locator, "locator cannot be null");
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Sets the error handler.
     * 
     * @param errorHandler
     *        the error handler
     */
    public void setErrorHandler(@Nonnull ErrorHandler errorHandler) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32449);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32450);this.errorHandler = checkNotNull(errorHandler, "errorHandler cannot be null");
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void warning(SAXParseException e) throws SAXException {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32451);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32452);errorHandler.warning(e);
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void error(SAXParseException e) throws SAXException {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32453);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32454);errorHandler.error(e);
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void fatalError(SAXParseException e) throws SAXException {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32455);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32456);errorHandler.fatalError(e);
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void startDocument() {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32457);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32458);states.clear();
        __CLR4_5_2p0bp0blvicmco2.R.inc(32459);pushState(new StartRDF(this));
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void endDocument() {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32460);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32461);verify(state != null, "RDF content not finished.");
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32462);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32463);processXMLBase(attributes);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32464);processXMLLanguage(attributes);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32465);state.startElement(uri, localName, qName, attributes);
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32466);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32467);state.endElement(uri, localName, qName);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32468);baseIRI = baseIRIs.remove(0);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32469);language = languages.remove(0);
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32470);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32471);state.characters(ch, start, length);
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    public void processingInstruction(String target, String data) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32472);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32473);if (((("include-rdf".equals(target))&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32474)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32475)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32476);Map<String, String> arguments = parseStringArguments(data);
            __CLR4_5_2p0bp0blvicmco2.R.inc(32477);verify(arguments.size() > 2, "Incorrect number of arguments for 'include-rdf' processing instruction.");
            __CLR4_5_2p0bp0blvicmco2.R.inc(32478);String logicalIRI = arguments.get("logicalIRI");
            __CLR4_5_2p0bp0blvicmco2.R.inc(32479);String physicalIRI = arguments.get("physicalIRI");
            __CLR4_5_2p0bp0blvicmco2.R.inc(32480);if ((((physicalIRI != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32481)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32482)==0&false))) {{
                __CLR4_5_2p0bp0blvicmco2.R.inc(32483);physicalIRI = resolveIRI(physicalIRI);
            }
            }__CLR4_5_2p0bp0blvicmco2.R.inc(32484);consumer.includeModel(logicalIRI, physicalIRI);
        }
    }}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Pushes a new state on the state stack.
     * 
     * @param s
     *        new state
     */
    public void pushState(State s) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32485);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32486);states.add(s);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32487);state = s;
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Pops a state from the stack.
     */
    public void popState() {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32488);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32489);int size = states.size();
        __CLR4_5_2p0bp0blvicmco2.R.inc(32490);verify(size == 0, "Internal exception: state stack is empty.");
        __CLR4_5_2p0bp0blvicmco2.R.inc(32491);if ((((size == 1)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32492)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32493)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32494);state = null;
        } }else {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32495);state = states.get(size - 2);
        }
        }__CLR4_5_2p0bp0blvicmco2.R.inc(32496);states.remove(size - 1);
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Nonnull
    private IRI resolveFromDelegate(@Nonnull IRI iri, @Nonnull String value) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32497);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32498);checkNotNull(iri, "iri cannot be null");
        __CLR4_5_2p0bp0blvicmco2.R.inc(32499);checkNotNull(value, "value cannot be null");
        __CLR4_5_2p0bp0blvicmco2.R.inc(32500);if ((((NodeID.isAnonymousNodeIRI(value))&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32501)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32502)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32503);return IRI.create(value, null);
        }
        // cache the delegate URI if not there already
        }__CLR4_5_2p0bp0blvicmco2.R.inc(32504);if ((((!baseURICache.containsKey(getBaseIRI()))&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32505)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32506)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32507);baseURICache.put(getBaseIRI(), getBaseIRI().toURI());
        }
        // get hold of the delegate URI
        }__CLR4_5_2p0bp0blvicmco2.R.inc(32508);URI delegateURI = baseURICache.get(getBaseIRI());
        assert (((delegateURI != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32509)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32510)==0&false));
        // resolve against delegate
        __CLR4_5_2p0bp0blvicmco2.R.inc(32511);URI resolve = delegateURI.resolve(value.replace(" ", "%20"));
        assert (((resolve != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32512)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32513)==0&false));
        __CLR4_5_2p0bp0blvicmco2.R.inc(32514);return IRI.create(resolve);
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Processes xml:base reference if there is one.
     * 
     * @param atts
     *        the attributes potentially containing xml:base declaration
     */
    private void processXMLBase(@Nonnull Attributes atts) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32515);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32516);checkNotNull(atts, "atts cannot be null");
        __CLR4_5_2p0bp0blvicmco2.R.inc(32517);baseIRIs.add(0, getBaseIRI());
        __CLR4_5_2p0bp0blvicmco2.R.inc(32518);String value = atts.getValue(XMLNS, "base");
        __CLR4_5_2p0bp0blvicmco2.R.inc(32519);if ((((value != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32520)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32521)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32522);try {
                __CLR4_5_2p0bp0blvicmco2.R.inc(32523);baseIRI = resolveFromDelegate(getBaseIRI(), value);
                __CLR4_5_2p0bp0blvicmco2.R.inc(32524);resolvedIRIs.clear();
            } catch (IllegalArgumentException e) {
                __CLR4_5_2p0bp0blvicmco2.R.inc(32525);throw new RDFParserException(e, String.format(WRONGRESOLVE, value, getBaseIRI(), e.getMessage()),
                    getDocumentLocator());
            }
        }
    }}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Processes xml:language reference is there is one.
     * 
     * @param atts
     *        the attributes potentially containing xml:language declaration
     */
    private void processXMLLanguage(@Nonnull Attributes atts) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32526);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32527);checkNotNull(atts, "atts cannot be null");
        __CLR4_5_2p0bp0blvicmco2.R.inc(32528);languages.add(0, language);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32529);String value = atts.getValue(XMLLANG);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32530);if ((((value != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32531)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32532)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32533);language = value;
        }
    }}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Resolves an IRI with the current base.
     * 
     * @param uri
     *        the IRI being resolved
     * @return the resolved IRI
     */
    @Nonnull
    public String resolveIRI(@Nonnull String uri) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32534);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32535);checkNotNull(uri, "uri cannot be null");
        __CLR4_5_2p0bp0blvicmco2.R.inc(32536);if ((((uri.isEmpty())&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32537)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32538)==0&false))) {{
            // MH - Fix for resolving a "This document" reference against base
            // IRIs.
            __CLR4_5_2p0bp0blvicmco2.R.inc(32539);String namespace = getBaseIRI().getNamespace();
            __CLR4_5_2p0bp0blvicmco2.R.inc(32540);if ((((namespace.charAt(namespace.length() - 1) == '#')&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32541)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32542)==0&false))) {{
                __CLR4_5_2p0bp0blvicmco2.R.inc(32543);return namespace.substring(0, namespace.length() - 1);
            }
            }__CLR4_5_2p0bp0blvicmco2.R.inc(32544);String base = getBaseIRI().toString();
            __CLR4_5_2p0bp0blvicmco2.R.inc(32545);int hashIndex = base.indexOf('#');
            __CLR4_5_2p0bp0blvicmco2.R.inc(32546);if ((((hashIndex != -1)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32547)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32548)==0&false))) {{
                __CLR4_5_2p0bp0blvicmco2.R.inc(32549);return base.substring(0, hashIndex);
            } }else {{
                __CLR4_5_2p0bp0blvicmco2.R.inc(32550);return base;
            }
        }} }else {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32551);try {
                __CLR4_5_2p0bp0blvicmco2.R.inc(32552);String resolved = resolvedIRIs.get(uri);
                __CLR4_5_2p0bp0blvicmco2.R.inc(32553);if ((((resolved != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32554)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32555)==0&false))) {{
                    __CLR4_5_2p0bp0blvicmco2.R.inc(32556);return resolved;
                } }else {{
                    __CLR4_5_2p0bp0blvicmco2.R.inc(32557);IRI theIRI = resolveFromDelegate(getBaseIRI(), uri);
                    __CLR4_5_2p0bp0blvicmco2.R.inc(32558);String u = theIRI.toString();
                    __CLR4_5_2p0bp0blvicmco2.R.inc(32559);uriCache.put(u, theIRI);
                    __CLR4_5_2p0bp0blvicmco2.R.inc(32560);resolvedIRIs.put(uri, u);
                    __CLR4_5_2p0bp0blvicmco2.R.inc(32561);return u;
                }
            }} catch (IllegalArgumentException e) {
                __CLR4_5_2p0bp0blvicmco2.R.inc(32562);throw new RDFParserException(e, String.format(WRONGRESOLVE, uri, getBaseIRI(), e.getMessage()),
                    getDocumentLocator());
            }
        }
    }}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Called when a statement with resource value is added to the model.
     * 
     * @param subject
     *        IRI of the subject resource
     * @param predicate
     *        IRI of the predicate resource
     * @param object
     *        IRI of the object resource
     * @param reificationID
     *        if not {@code null}, contains IRI of the resource that will wold
     *        the reified statement
     */
    public void statementWithResourceValue(@Nonnull String subject, @Nonnull String predicate, @Nonnull String object,
        @Nullable String reificationID) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32563);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32564);String remappedSubject = consumer.remapOnlyIfRemapped(subject);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32565);consumer.statementWithResourceValue(remappedSubject, predicate, object);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32566);if ((((reificationID != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32567)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32568)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32569);consumer.statementWithResourceValue(reificationID, RDF_TYPE, RDF_STATEMENT);
            __CLR4_5_2p0bp0blvicmco2.R.inc(32570);consumer.statementWithResourceValue(reificationID, RDF_SUBJECT, remappedSubject);
            __CLR4_5_2p0bp0blvicmco2.R.inc(32571);consumer.statementWithResourceValue(reificationID, RDF_PREDICATE, predicate);
            __CLR4_5_2p0bp0blvicmco2.R.inc(32572);consumer.statementWithResourceValue(reificationID, RDF_OBJECT, object);
        }
    }}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Called when a statement with literal value is added to the model.
     * 
     * @param subject
     *        IRI of the subject resource
     * @param predicate
     *        IRI of the predicate resource
     * @param object
     *        literal object value
     * @param dataType
     *        the IRI of the literal's datatype (may be {@code null})
     * @param reificationID
     *        if not {@code null}, contains IRI of the resource that will wold
     *        the reified statement
     */
    public void statementWithLiteralValue(@Nonnull String subject, @Nonnull String predicate, @Nonnull String object,
        @Nullable String dataType, @Nullable String reificationID) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32573);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32574);consumer.statementWithLiteralValue(subject, predicate, object, language, dataType);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32575);if ((((reificationID != null)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32576)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32577)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32578);consumer.statementWithResourceValue(reificationID, RDF_TYPE, RDF_STATEMENT);
            __CLR4_5_2p0bp0blvicmco2.R.inc(32579);consumer.statementWithResourceValue(reificationID, RDF_SUBJECT, subject);
            __CLR4_5_2p0bp0blvicmco2.R.inc(32580);consumer.statementWithResourceValue(reificationID, RDF_PREDICATE, predicate);
            __CLR4_5_2p0bp0blvicmco2.R.inc(32581);consumer.statementWithLiteralValue(reificationID, RDF_OBJECT, object, language, dataType);
        }
    }}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * Parses the string into a map of name-value pairs.
     * 
     * @param string
     *        string to be parsed
     * @return map of name-value pairs
     */
    private Map<String, String> parseStringArguments(String string) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32582);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32583);try {
            __CLR4_5_2p0bp0blvicmco2.R.inc(32584);StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(string));
            __CLR4_5_2p0bp0blvicmco2.R.inc(32585);Map<String, String> result = new HashMap<>();
            __CLR4_5_2p0bp0blvicmco2.R.inc(32586);tokenizer.nextToken();
            __CLR4_5_2p0bp0blvicmco2.R.inc(32587);while ((((tokenizer.ttype != StreamTokenizer.TT_EOF)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32588)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32589)==0&false))) {{
                __CLR4_5_2p0bp0blvicmco2.R.inc(32590);verify(tokenizer.ttype != StreamTokenizer.TT_WORD, "Invalid processing instruction argument.");
                __CLR4_5_2p0bp0blvicmco2.R.inc(32591);String name = tokenizer.sval;
                __CLR4_5_2p0bp0blvicmco2.R.inc(32592);verify('=' != tokenizer.nextToken(), "Expecting token '='");
                __CLR4_5_2p0bp0blvicmco2.R.inc(32593);tokenizer.nextToken();
                __CLR4_5_2p0bp0blvicmco2.R.inc(32594);verify(tokenizer.ttype != '\"' && tokenizer.ttype != '\'', "Invalid processing instruction argument.");
                __CLR4_5_2p0bp0blvicmco2.R.inc(32595);String value = tokenizer.sval;
                __CLR4_5_2p0bp0blvicmco2.R.inc(32596);result.put(name, value);
                __CLR4_5_2p0bp0blvicmco2.R.inc(32597);tokenizer.nextToken();
            }
            }__CLR4_5_2p0bp0blvicmco2.R.inc(32598);return result;
        } catch (IOException e) {
            __CLR4_5_2p0bp0blvicmco2.R.inc(32599);throw new RDFParserException(e, "I/O error", getDocumentLocator());
        }
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    @Override
    @Nonnull
    public IRI getIRI(@Nonnull String s) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32600);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32601);return uriCache.get(checkNotNull(s, "s cannot be null"));
    }finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}

    /**
     * If conditon b is true, throw an exception with provided message
     * 
     * @param b
     *        condition to verify
     * @param message
     *        message for the exception
     * @throws RDFParserException
     *         exception thrown
     */
    public void verify(boolean b, @Nonnull String message) {try{__CLR4_5_2p0bp0blvicmco2.R.inc(32602);
        __CLR4_5_2p0bp0blvicmco2.R.inc(32603);if ((((b)&&(__CLR4_5_2p0bp0blvicmco2.R.iget(32604)!=0|true))||(__CLR4_5_2p0bp0blvicmco2.R.iget(32605)==0&false))) {{
            __CLR4_5_2p0bp0blvicmco2.R.inc(32606);throw new RDFParserException(message, getDocumentLocator());
        }
    }}finally{__CLR4_5_2p0bp0blvicmco2.R.flushNeeded();}}
}
