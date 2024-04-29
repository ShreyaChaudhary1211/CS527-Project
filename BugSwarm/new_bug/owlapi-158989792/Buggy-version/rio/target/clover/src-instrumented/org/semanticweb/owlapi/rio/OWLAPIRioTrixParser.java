/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * NOTE:  Dervived from openrdf sesame version 2.9.0.  See
 *  sesame distribution, available at https://bitbucket.org/openrdf/sesame
 * for license details referenced below.
 * Licensed to Aduna under one or more contributor license agreements.
 * See the NOTICE.txt file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Aduna licenses this file to you under the terms of the Aduna BSD
 * License (the "License"); you may not use this file except in compliance
 * with the License. See the LICENSE.txt file distributed with this work
 * for the full License.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.semanticweb.owlapi.rio;

import info.aduna.xml.SimpleSAXAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.input.BOMInputStream;
import org.openrdf.model.Resource;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.RDFParseException;
import org.openrdf.rio.helpers.RDFParserBase;
import org.openrdf.rio.helpers.TriXParserSettings;
import static org.openrdf.rio.trix.TriXConstants.*;
import org.semanticweb.owlapi.rio.utils.OWLAPISimpleSAXParser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * A parser that can parse RDF files that are in the <a
 * href="http://www.w3.org/2004/03/trix/">TriX format</a>.
 * Cloned from org.openrdf.rio.trix.TrixParser
 * @author Arjohn Kampman
 * Modified to install error handler by Simon Spero, because error handler.
 */

class OWLAPIRioTrixParser extends RDFParserBase{public static class __CLR4_5_24y4ylvicnc2m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0072\u0069\u006f\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237333555L,8589935092L,317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/*--------------*
	 * Constructors *
	 *--------------*/

    /**
     * Creates a new TriXParser that will use a {@link ValueFactoryImpl} to
     * create objects for resources, bNodes, literals and statements.
     */
    public OWLAPIRioTrixParser() {
        super();__CLR4_5_24y4ylvicnc2m.R.inc(179);try{__CLR4_5_24y4ylvicnc2m.R.inc(178);
    }finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}

    /**
     * Creates a new TriXParser that will use the supplied ValueFactory to create
     * objects for resources, bNodes, literals and statements.
     *
     * @param valueFactory
     *        A ValueFactory.
     */
    public OWLAPIRioTrixParser(ValueFactory valueFactory) {
        super(valueFactory);__CLR4_5_24y4ylvicnc2m.R.inc(181);try{__CLR4_5_24y4ylvicnc2m.R.inc(180);
    }finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}

	/*---------*
	 * Methods *
	 *---------*/

    public final RDFFormat getRDFFormat() {try{__CLR4_5_24y4ylvicnc2m.R.inc(182);
        __CLR4_5_24y4ylvicnc2m.R.inc(183);return RDFFormat.TRIX;
    }finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}

    public void parse(InputStream in, String baseURI)
            throws IOException, RDFParseException, RDFHandlerException
    {try{__CLR4_5_24y4ylvicnc2m.R.inc(184);
        __CLR4_5_24y4ylvicnc2m.R.inc(185);parse(new BOMInputStream(in, false));
    }finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}

    public void parse(Reader reader, String baseURI)
            throws IOException, RDFParseException, RDFHandlerException
    {try{__CLR4_5_24y4ylvicnc2m.R.inc(186);
        __CLR4_5_24y4ylvicnc2m.R.inc(187);parse(reader);
    }finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}

    private void parse(Object inputStreamOrReader)
            throws IOException, RDFParseException, RDFHandlerException
    {try{__CLR4_5_24y4ylvicnc2m.R.inc(188);
        __CLR4_5_24y4ylvicnc2m.R.inc(189);if ((((rdfHandler != null)&&(__CLR4_5_24y4ylvicnc2m.R.iget(190)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(191)==0&false))) {{
            __CLR4_5_24y4ylvicnc2m.R.inc(192);rdfHandler.startRDF();
        }

        }__CLR4_5_24y4ylvicnc2m.R.inc(193);try {
            __CLR4_5_24y4ylvicnc2m.R.inc(194);OWLAPISimpleSAXParser saxParser = new OWLAPISimpleSAXParser();
            __CLR4_5_24y4ylvicnc2m.R.inc(195);saxParser.setPreserveWhitespace(true);
            __CLR4_5_24y4ylvicnc2m.R.inc(196);saxParser.setListener(new TriXSAXHandler());


            __CLR4_5_24y4ylvicnc2m.R.inc(197);if ((((inputStreamOrReader instanceof InputStream)&&(__CLR4_5_24y4ylvicnc2m.R.iget(198)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(199)==0&false))) {{
                __CLR4_5_24y4ylvicnc2m.R.inc(200);saxParser.parse((InputStream)inputStreamOrReader);
            }
            }else {{
                __CLR4_5_24y4ylvicnc2m.R.inc(201);saxParser.parse((Reader)inputStreamOrReader);
            }
        }}
        catch (SAXParseException e) {
            __CLR4_5_24y4ylvicnc2m.R.inc(202);Exception wrappedExc = e.getException();

            __CLR4_5_24y4ylvicnc2m.R.inc(203);if ((((wrappedExc == null)&&(__CLR4_5_24y4ylvicnc2m.R.iget(204)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(205)==0&false))) {{
                __CLR4_5_24y4ylvicnc2m.R.inc(206);reportFatalError(e, e.getLineNumber(), e.getColumnNumber());
            }
            }else {{
                __CLR4_5_24y4ylvicnc2m.R.inc(207);reportFatalError(wrappedExc, e.getLineNumber(), e.getColumnNumber());
            }
        }}
        catch (SAXException e) {
            __CLR4_5_24y4ylvicnc2m.R.inc(208);Exception wrappedExc = e.getException();

            __CLR4_5_24y4ylvicnc2m.R.inc(209);if ((((wrappedExc == null)&&(__CLR4_5_24y4ylvicnc2m.R.iget(210)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(211)==0&false))) {{
                __CLR4_5_24y4ylvicnc2m.R.inc(212);reportFatalError(e);
            }
            }else {__CLR4_5_24y4ylvicnc2m.R.inc(213);if ((((wrappedExc instanceof RDFParseException)&&(__CLR4_5_24y4ylvicnc2m.R.iget(214)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(215)==0&false))) {{
                __CLR4_5_24y4ylvicnc2m.R.inc(216);throw (RDFParseException)wrappedExc;
            }
            }else {__CLR4_5_24y4ylvicnc2m.R.inc(217);if ((((wrappedExc instanceof RDFHandlerException)&&(__CLR4_5_24y4ylvicnc2m.R.iget(218)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(219)==0&false))) {{
                __CLR4_5_24y4ylvicnc2m.R.inc(220);throw (RDFHandlerException)wrappedExc;
            }
            }else {{
                __CLR4_5_24y4ylvicnc2m.R.inc(221);reportFatalError(wrappedExc);
            }
        }}}}
        finally {
            __CLR4_5_24y4ylvicnc2m.R.inc(222);clear();
        }

        __CLR4_5_24y4ylvicnc2m.R.inc(223);if ((((rdfHandler != null)&&(__CLR4_5_24y4ylvicnc2m.R.iget(224)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(225)==0&false))) {{
            __CLR4_5_24y4ylvicnc2m.R.inc(226);rdfHandler.endRDF();
        }
    }}finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}

	/*----------------------------*
	 * Inner class TriXSAXHandler *
	 *----------------------------*/

    private class TriXSAXHandler extends SimpleSAXAdapter {

        private Resource currentContext;

        private boolean parsingContext;

        private List<Value> valueList;

        public TriXSAXHandler() {try{__CLR4_5_24y4ylvicnc2m.R.inc(227);
            __CLR4_5_24y4ylvicnc2m.R.inc(228);currentContext = null;
            __CLR4_5_24y4ylvicnc2m.R.inc(229);valueList = new ArrayList<Value>(3);
        }finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}

        @Override
        public void startTag(String tagName, Map<String, String> atts, String text)
                throws SAXException
        {try{__CLR4_5_24y4ylvicnc2m.R.inc(230);
            __CLR4_5_24y4ylvicnc2m.R.inc(231);try {
                __CLR4_5_24y4ylvicnc2m.R.inc(232);if ((((tagName.equals(URI_TAG))&&(__CLR4_5_24y4ylvicnc2m.R.iget(233)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(234)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(235);valueList.add(createURI(text));
                }
                }else {__CLR4_5_24y4ylvicnc2m.R.inc(236);if ((((tagName.equals(BNODE_TAG))&&(__CLR4_5_24y4ylvicnc2m.R.iget(237)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(238)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(239);valueList.add(createBNode(text));
                }
                }else {__CLR4_5_24y4ylvicnc2m.R.inc(240);if ((((tagName.equals(PLAIN_LITERAL_TAG))&&(__CLR4_5_24y4ylvicnc2m.R.iget(241)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(242)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(243);String lang = atts.get(LANGUAGE_ATT);
                    __CLR4_5_24y4ylvicnc2m.R.inc(244);valueList.add(createLiteral(text, lang, null));
                }
                }else {__CLR4_5_24y4ylvicnc2m.R.inc(245);if ((((tagName.equals(TYPED_LITERAL_TAG))&&(__CLR4_5_24y4ylvicnc2m.R.iget(246)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(247)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(248);String datatype = atts.get(DATATYPE_ATT);

                    __CLR4_5_24y4ylvicnc2m.R.inc(249);if ((((datatype == null)&&(__CLR4_5_24y4ylvicnc2m.R.iget(250)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(251)==0&false))) {{
                        __CLR4_5_24y4ylvicnc2m.R.inc(252);reportError(DATATYPE_ATT + " attribute missing for typed literal",
                                TriXParserSettings.FAIL_ON_TRIX_MISSING_DATATYPE);
                        __CLR4_5_24y4ylvicnc2m.R.inc(253);valueList.add(createLiteral(text, null, null));
                    }
                    }else {{
                        __CLR4_5_24y4ylvicnc2m.R.inc(254);URI dtURI = createURI(datatype);
                        __CLR4_5_24y4ylvicnc2m.R.inc(255);valueList.add(createLiteral(text, null, dtURI));
                    }
                }}
                }else {__CLR4_5_24y4ylvicnc2m.R.inc(256);if ((((tagName.equals(TRIPLE_TAG))&&(__CLR4_5_24y4ylvicnc2m.R.iget(257)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(258)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(259);if ((((parsingContext)&&(__CLR4_5_24y4ylvicnc2m.R.iget(260)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(261)==0&false))) {{
                        __CLR4_5_24y4ylvicnc2m.R.inc(262);try {
                            // First triple in a context, valueList can contain
                            // context information
                            __CLR4_5_24y4ylvicnc2m.R.inc(263);if ((((valueList.size() > 1)&&(__CLR4_5_24y4ylvicnc2m.R.iget(264)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(265)==0&false))) {{
                                __CLR4_5_24y4ylvicnc2m.R.inc(266);reportError("At most 1 resource can be specified for the context",
                                        TriXParserSettings.FAIL_ON_TRIX_INVALID_STATEMENT);
                            }
                            }else {__CLR4_5_24y4ylvicnc2m.R.inc(267);if ((((valueList.size() == 1)&&(__CLR4_5_24y4ylvicnc2m.R.iget(268)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(269)==0&false))) {{
                                __CLR4_5_24y4ylvicnc2m.R.inc(270);try {
                                    __CLR4_5_24y4ylvicnc2m.R.inc(271);currentContext = (Resource)valueList.get(0);
                                }
                                catch (ClassCastException e) {
                                    __CLR4_5_24y4ylvicnc2m.R.inc(272);reportError("Context identifier should be a URI or blank node",
                                            TriXParserSettings.FAIL_ON_TRIX_INVALID_STATEMENT);
                                }
                            }
                        }}}
                        finally {
                            __CLR4_5_24y4ylvicnc2m.R.inc(273);parsingContext = false;
                            __CLR4_5_24y4ylvicnc2m.R.inc(274);valueList.clear();
                        }
                    }
                }}
                }else {__CLR4_5_24y4ylvicnc2m.R.inc(275);if ((((tagName.equals(CONTEXT_TAG))&&(__CLR4_5_24y4ylvicnc2m.R.iget(276)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(277)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(278);parsingContext = true;
                }
            }}}}}}}
            catch (RDFParseException e) {
                __CLR4_5_24y4ylvicnc2m.R.inc(279);throw new SAXException(e);
            }
        }finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}

        @Override
        public void endTag(String tagName)
                throws SAXException
        {try{__CLR4_5_24y4ylvicnc2m.R.inc(280);
            __CLR4_5_24y4ylvicnc2m.R.inc(281);try {
                __CLR4_5_24y4ylvicnc2m.R.inc(282);if ((((tagName.equals(TRIPLE_TAG))&&(__CLR4_5_24y4ylvicnc2m.R.iget(283)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(284)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(285);reportStatement();
                }
                }else {__CLR4_5_24y4ylvicnc2m.R.inc(286);if ((((tagName.equals(CONTEXT_TAG))&&(__CLR4_5_24y4ylvicnc2m.R.iget(287)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(288)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(289);currentContext = null;
                }
            }}}
            catch (RDFParseException e) {
                __CLR4_5_24y4ylvicnc2m.R.inc(290);throw new SAXException(e);
            }
            catch (RDFHandlerException e) {
                __CLR4_5_24y4ylvicnc2m.R.inc(291);throw new SAXException(e);
            }
        }finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}

        private void reportStatement()
                throws RDFParseException, RDFHandlerException
        {try{__CLR4_5_24y4ylvicnc2m.R.inc(292);
            __CLR4_5_24y4ylvicnc2m.R.inc(293);try {
                __CLR4_5_24y4ylvicnc2m.R.inc(294);if ((((valueList.size() != 3)&&(__CLR4_5_24y4ylvicnc2m.R.iget(295)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(296)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(297);reportError("exactly 3 values are required for a triple",
                            TriXParserSettings.FAIL_ON_TRIX_INVALID_STATEMENT);
                    __CLR4_5_24y4ylvicnc2m.R.inc(298);return;
                }

                }__CLR4_5_24y4ylvicnc2m.R.inc(299);Resource subj;
                __CLR4_5_24y4ylvicnc2m.R.inc(300);URI pred;
                __CLR4_5_24y4ylvicnc2m.R.inc(301);Value obj;

                __CLR4_5_24y4ylvicnc2m.R.inc(302);try {
                    __CLR4_5_24y4ylvicnc2m.R.inc(303);subj = (Resource)valueList.get(0);
                }
                catch (ClassCastException e) {
                    __CLR4_5_24y4ylvicnc2m.R.inc(304);reportError("First value for a triple should be a URI or blank node",
                            TriXParserSettings.FAIL_ON_TRIX_INVALID_STATEMENT);
                    __CLR4_5_24y4ylvicnc2m.R.inc(305);return;
                }

                __CLR4_5_24y4ylvicnc2m.R.inc(306);try {
                    __CLR4_5_24y4ylvicnc2m.R.inc(307);pred = (URI)valueList.get(1);
                }
                catch (ClassCastException e) {
                    __CLR4_5_24y4ylvicnc2m.R.inc(308);reportError("Second value for a triple should be a URI",
                            TriXParserSettings.FAIL_ON_TRIX_INVALID_STATEMENT);
                    __CLR4_5_24y4ylvicnc2m.R.inc(309);return;
                }

                __CLR4_5_24y4ylvicnc2m.R.inc(310);obj = valueList.get(2);

                __CLR4_5_24y4ylvicnc2m.R.inc(311);Statement st = createStatement(subj, pred, obj, currentContext);
                __CLR4_5_24y4ylvicnc2m.R.inc(312);if ((((rdfHandler != null)&&(__CLR4_5_24y4ylvicnc2m.R.iget(313)!=0|true))||(__CLR4_5_24y4ylvicnc2m.R.iget(314)==0&false))) {{
                    __CLR4_5_24y4ylvicnc2m.R.inc(315);rdfHandler.handleStatement(st);
                }
            }}
            finally {
                __CLR4_5_24y4ylvicnc2m.R.inc(316);valueList.clear();
            }
        }finally{__CLR4_5_24y4ylvicnc2m.R.flushNeeded();}}
    } // end inner class TriXSAXHandler

}
