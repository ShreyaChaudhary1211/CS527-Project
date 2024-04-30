/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  NOTE:  Derived from openrdf sesame version 2.9.0.  See
 *  sesame distribution, available at https://bitbucket.org/openrdf/sesame
 * for license details referenced below.
 * Cloned from info.aduna.xml.SimpleSaxParser in order to be able to mask errors.

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

package org.semanticweb.owlapi.rio.utils;

import info.aduna.xml.SimpleSAXListener;
import info.aduna.xml.XMLReaderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 *
 * An XML parser that generates "simple" SAX-like events from a limited subset
 * of XML documents. The OWLAPISimpleSAXParser can parse simple XML documents; it
 * doesn't support processing instructions or elements that contain both
 * sub-element and character data; character data is only supported in the
 * "leaves" of the XML element tree.
 *
 * <h3>Example:</h3>
 * <p>
 * Parsing the following XML:
 * <pre>
 * &lt;?xml version='1.0' encoding='UTF-8'?&gt;
 * &lt;xml-doc&gt;
 *   &lt;foo a="1" b="2&amp;amp;3"/&gt;
 *   &lt;bar&gt;Hello World!&lt;/bar&gt;
 * &lt;/xml-doc&gt;
 *</pre>
 * <p>
 * will result in the following method calls to the
 * <tt>SimpleSAXListener</tt>:
 * <pre>
 * startDocument()
 * startTag("xml-doc", emptyMap, "")
 *
 * startTag("foo", a_b_Map, "")
 * endTag("foo")
 *
 * startTag("bar", emptyMap, "Hello World!")
 * endTag("bar")
 *
 * endTag("xml-doc")
 * endDocument()
 * </pre>
 */
public class OWLAPISimpleSAXParser {public static class __CLR4_5_2oioilvicnc78{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0072\u0069\u006f\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237333555L,8589935092L,953,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/*-----------*
	 * Variables *
	 *-----------*/

	/**
	 * The XMLReader to use for parsing the XML.
	 */
	private XMLReader xmlReader;

	/**
	 * The listener to report the events to.
	 */
	private SimpleSAXListener listener;

	/**
	 * Flag indicating whether leading and trailing whitespace in text elements
	 * should be preserved.
	 */
	private boolean preserveWhitespace = false;

	/*--------------*
	 * Constructors *
	 *--------------*/

	/**
	 * Creates a new OWLAPISimpleSAXParser that will use the supplied
	 * <tt>XMLReader</tt> for parsing the XML. One must set a
	 * <tt>SimpleSAXListener</tt> on this object before calling one of the
	 * <tt>parse()</tt> methods.
	 * 
	 * @param xmlReader
	 *        The XMLReader to use for parsing.
	 * 
	 * @see #setListener
	 */
	public OWLAPISimpleSAXParser(XMLReader xmlReader) {
		super();__CLR4_5_2oioilvicnc78.R.inc(883);try{__CLR4_5_2oioilvicnc78.R.inc(882);
		__CLR4_5_2oioilvicnc78.R.inc(884);this.xmlReader = xmlReader;
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/**
	 * Creates a new OWLAPISimpleSAXParser that will try to create a new
	 * <tt>XMLReader</tt> using <tt>info.aduna.xml.XMLReaderFactory</tt> for
	 * parsing the XML. One must set a <tt>SimpleSAXListener</tt> on this
	 * object before calling one of the <tt>parse()</tt> methods.
	 * 
	 * @throws SAXException
	 *         If the OWLAPISimpleSAXParser was unable to create an XMLReader.
	 * 
	 * @see #setListener
	 * @see XMLReader
	 * @see XMLReaderFactory
	 */
	public OWLAPISimpleSAXParser()
		throws SAXException
	{
		this(XMLReaderFactory.createXMLReader());__CLR4_5_2oioilvicnc78.R.inc(886);try{__CLR4_5_2oioilvicnc78.R.inc(885);
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/*---------*
	 * Methods *
	 *---------*/

	/**
	 * Sets the (new) listener that should receive any events from this parser.
	 * This listener will replace any previously set listener.
	 * 
	 * @param listener
	 *        The (new) listener for events from this parser.
	 */
	public void setListener(SimpleSAXListener listener) {try{__CLR4_5_2oioilvicnc78.R.inc(887);
		__CLR4_5_2oioilvicnc78.R.inc(888);this.listener = listener;
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/**
	 * Gets the listener that currently will receive any events from this parser.
	 * 
	 * @return The listener for events from this parser.
	 */
	public SimpleSAXListener getListener() {try{__CLR4_5_2oioilvicnc78.R.inc(889);
		__CLR4_5_2oioilvicnc78.R.inc(890);return listener;
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/**
	 * Sets whether leading and trailing whitespace characters in text elements
	 * should be preserved. Such whitespace characters are discarded by default.
	 */
	public void setPreserveWhitespace(boolean preserveWhitespace) {try{__CLR4_5_2oioilvicnc78.R.inc(891);
		__CLR4_5_2oioilvicnc78.R.inc(892);this.preserveWhitespace = preserveWhitespace;
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/**
	 * Checks whether leading and trailing whitespace characters in text elements
	 * are preserved. Defaults to <tt>false</tt>.
	 */
	public boolean isPreserveWhitespace() {try{__CLR4_5_2oioilvicnc78.R.inc(893);
		__CLR4_5_2oioilvicnc78.R.inc(894);return preserveWhitespace;
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/**
	 * Parses the content of the supplied <tt>File</tt> as XML.
	 * 
	 * @param file
	 *        The file containing the XML to parse.
	 */
	public void parse(File file)
		throws SAXException, IOException
	{try{__CLR4_5_2oioilvicnc78.R.inc(895);
		__CLR4_5_2oioilvicnc78.R.inc(896);InputStream in = new FileInputStream(file);
		__CLR4_5_2oioilvicnc78.R.inc(897);try {
			__CLR4_5_2oioilvicnc78.R.inc(898);parse(in);
		}
		finally {
			__CLR4_5_2oioilvicnc78.R.inc(899);try {
				__CLR4_5_2oioilvicnc78.R.inc(900);in.close();
			}
			catch (IOException ignore) {
			}
		}
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/**
	 * Parses the content of the supplied <tt>InputStream</tt> as XML.
	 * 
	 * @param in
	 *        An <tt>InputStream</tt> containing XML data.
	 */
	public void parse(InputStream in)
		throws SAXException, IOException
	{try{__CLR4_5_2oioilvicnc78.R.inc(901);
		__CLR4_5_2oioilvicnc78.R.inc(902);parse(new InputSource(in));
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/**
	 * Parses the content of the supplied <tt>Reader</tt> as XML.
	 * 
	 * @param reader
	 *        A <tt>Reader</tt> containing XML data.
	 */
	public void parse(Reader reader)
		throws SAXException, IOException
	{try{__CLR4_5_2oioilvicnc78.R.inc(903);
		__CLR4_5_2oioilvicnc78.R.inc(904);parse(new InputSource(reader));
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/**
	 * Parses the content of the supplied <tt>InputSource</tt> as XML.
	 * 
	 * @param inputSource
	 *        An <tt>InputSource</tt> containing XML data.
	 */
	private synchronized void parse(InputSource inputSource)
		throws SAXException, IOException
	{try{__CLR4_5_2oioilvicnc78.R.inc(905);
		__CLR4_5_2oioilvicnc78.R.inc(906);SimpleSAXDefaultHandler handler = new SimpleSAXDefaultHandler();
		__CLR4_5_2oioilvicnc78.R.inc(907);xmlReader.setContentHandler(handler);
		__CLR4_5_2oioilvicnc78.R.inc(908);xmlReader.setErrorHandler(handler);
		__CLR4_5_2oioilvicnc78.R.inc(909);xmlReader.parse(inputSource);
	}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	/*-------------------------------------*
	 * Inner class SimpleSAXDefaultHandler *
	 *-------------------------------------*/

	class SimpleSAXDefaultHandler extends DefaultHandler {

		/*-----------*
		 * Variables *
		 *-----------*/

		/**
		 * StringBuilder used to collect text during parsing.
		 */
		private StringBuilder charBuf = new StringBuilder(512);

		/**
		 * The tag name of a deferred start tag.
		 */
		private String deferredStartTag = null;

		/**
		 * The attributes of a deferred start tag.
		 */
		private Map<String, String> deferredAttributes = null;

		/*--------------*
		 * Constructors *
		 *--------------*/

		public SimpleSAXDefaultHandler() {
			super();__CLR4_5_2oioilvicnc78.R.inc(911);try{__CLR4_5_2oioilvicnc78.R.inc(910);
		}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

		/*---------*
		 * Methods *
		 *---------*/

		// overrides DefaultHandler.startDocument()
		public void startDocument()
			throws SAXException
		{try{__CLR4_5_2oioilvicnc78.R.inc(912);
			__CLR4_5_2oioilvicnc78.R.inc(913);listener.startDocument();
		}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

		// overrides DefaultHandler.endDocument()
		public void endDocument()
			throws SAXException
		{try{__CLR4_5_2oioilvicnc78.R.inc(914);
			__CLR4_5_2oioilvicnc78.R.inc(915);listener.endDocument();
		}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

		// overrides DefaultHandler.characters()
		public void characters(char[] ch, int start, int length)
			throws SAXException
		{try{__CLR4_5_2oioilvicnc78.R.inc(916);
			__CLR4_5_2oioilvicnc78.R.inc(917);charBuf.append(ch, start, length);
		}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

		// overrides DefaultHandler.startElement()
		public void startElement(String namespaceURI, String localName, String qName, Attributes attributes)
			throws SAXException
		{try{__CLR4_5_2oioilvicnc78.R.inc(918);
			// Report any deferred start tag
			__CLR4_5_2oioilvicnc78.R.inc(919);if ((((deferredStartTag != null)&&(__CLR4_5_2oioilvicnc78.R.iget(920)!=0|true))||(__CLR4_5_2oioilvicnc78.R.iget(921)==0&false))) {{
				__CLR4_5_2oioilvicnc78.R.inc(922);reportDeferredStartElement();
			}

			// Make current tag new deferred start tag
			}__CLR4_5_2oioilvicnc78.R.inc(923);deferredStartTag = localName;

			// Copy attributes to deferredAttributes
			__CLR4_5_2oioilvicnc78.R.inc(924);int attCount = attributes.getLength();
			__CLR4_5_2oioilvicnc78.R.inc(925);if ((((attCount == 0)&&(__CLR4_5_2oioilvicnc78.R.iget(926)!=0|true))||(__CLR4_5_2oioilvicnc78.R.iget(927)==0&false))) {{
				__CLR4_5_2oioilvicnc78.R.inc(928);deferredAttributes = Collections.emptyMap();
			}
			}else {{
				__CLR4_5_2oioilvicnc78.R.inc(929);deferredAttributes = new LinkedHashMap<String, String>(attCount * 2);

				__CLR4_5_2oioilvicnc78.R.inc(930);for (int i = 0; (((i < attCount)&&(__CLR4_5_2oioilvicnc78.R.iget(931)!=0|true))||(__CLR4_5_2oioilvicnc78.R.iget(932)==0&false)); i++) {{
					__CLR4_5_2oioilvicnc78.R.inc(933);deferredAttributes.put(attributes.getQName(i), attributes.getValue(i));
				}
			}}

			// Clear character buffer
			}__CLR4_5_2oioilvicnc78.R.inc(934);charBuf.setLength(0);
		}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

		private void reportDeferredStartElement()
			throws SAXException
		{try{__CLR4_5_2oioilvicnc78.R.inc(935);
			__CLR4_5_2oioilvicnc78.R.inc(936);listener.startTag(deferredStartTag, deferredAttributes, "");
			__CLR4_5_2oioilvicnc78.R.inc(937);deferredStartTag = null;
			__CLR4_5_2oioilvicnc78.R.inc(938);deferredAttributes = null;
		}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

		// overrides DefaultHandler.endElement()
		public void endElement(String namespaceURI, String localName, String qName)
			throws SAXException
		{try{__CLR4_5_2oioilvicnc78.R.inc(939);
			__CLR4_5_2oioilvicnc78.R.inc(940);if ((((deferredStartTag != null)&&(__CLR4_5_2oioilvicnc78.R.iget(941)!=0|true))||(__CLR4_5_2oioilvicnc78.R.iget(942)==0&false))) {{
				// Check if any character data has been collected in the charBuf
				__CLR4_5_2oioilvicnc78.R.inc(943);String text = charBuf.toString();
				__CLR4_5_2oioilvicnc78.R.inc(944);if ((((!preserveWhitespace)&&(__CLR4_5_2oioilvicnc78.R.iget(945)!=0|true))||(__CLR4_5_2oioilvicnc78.R.iget(946)==0&false))) {{
					__CLR4_5_2oioilvicnc78.R.inc(947);text = text.trim();
				}

				// Report deferred start tag
				}__CLR4_5_2oioilvicnc78.R.inc(948);listener.startTag(deferredStartTag, deferredAttributes, text);
				__CLR4_5_2oioilvicnc78.R.inc(949);deferredStartTag = null;
				__CLR4_5_2oioilvicnc78.R.inc(950);deferredAttributes = null;
			}

			// Report the end tag
			}__CLR4_5_2oioilvicnc78.R.inc(951);listener.endTag(localName);

			// Clear character buffer
			__CLR4_5_2oioilvicnc78.R.inc(952);charBuf.setLength(0);
		}finally{__CLR4_5_2oioilvicnc78.R.flushNeeded();}}

	}
}
