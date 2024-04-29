/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * This file is part of the OWL API.
 * 
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * 
 * Copyright (C) 2014, Commonwealth Scientific and Industrial Research Organisation
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program. If
 * not, see http://www.gnu.org/licenses/.
 * 
 * 
 * Alternatively, the contents of this file may be used under the terms of the Apache License,
 * Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable
 * instead of those above.
 * 
 * Copyright 2014, Commonwealth Scientific and Industrial Research Organisation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.semanticweb.owlapi.rio;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

import org.openrdf.rio.RDFFormat;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.ManchesterSyntaxDocumentFormat;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormat;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLDocumentFormatFactory;

/**
 * Extended {@link RDFFormat} constants for OWL formats that can be translated
 * into RDF.
 * 
 * @author Peter Ansell p_ansell@yahoo.com
 * @since 4.0.0
 */
public class OWLAPIRDFFormat extends RDFFormat {public static class __CLR4_5_24747lvicnc21{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0072\u0069\u006f\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237333555L,8589935092L,178,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The <a href="http://www.w3.org/TR/owl2-manchester-syntax/">Manchester OWL
     * Syntax</a> file format.
     * <p>
     * The file extension {@code .omn} is recommended for Manchester OWL Syntax
     * documents. The media type is {@code text/owl-manchester} and encoding is
     * in UTF-8.
     * </p>
     * 
     * @see <a href="http://www.w3.org/TR/owl2-manchester-syntax/">OWL 2 Web
     *      Ontology Language Manchester Syntax (Second Edition)</a>
     */
    public static final OWLAPIRDFFormat MANCHESTER_OWL = new OWLAPIRDFFormat(
            "Manchester OWL Syntax", Arrays.asList("text/owl-manchester"),
            Charset.forName("UTF-8"), Arrays.asList("omn"),
            SUPPORTS_NAMESPACES, NO_CONTEXTS,
            new ManchesterSyntaxDocumentFormat());
    /**
     * The <a href="http://www.w3.org/TR/owl2-xml-serialization/">OWL/XML</a>
     * file format.
     * <p>
     * The file extension {@code .owx} is recommended for OWL/XML documents. The
     * media type is {@code application/owl+xml} and encoding is in UTF-8.
     * </p>
     * 
     * @see <a href="http://www.w3.org/TR/owl2-xml-serialization/">OWL 2 Web
     *      Ontology Language XML Serialization (Second Edition)</a>
     */
    public static final OWLAPIRDFFormat OWL_XML = new OWLAPIRDFFormat(
            "OWL/XML Syntax", Arrays.asList("application/owl+xml"),
            Charset.forName("UTF-8"), Arrays.asList("owx"),
            SUPPORTS_NAMESPACES, NO_CONTEXTS, new OWLXMLDocumentFormat());
    /**
     * The <a href="http://www.w3.org/TR/owl2-syntax/">OWL Functional Syntax</a>
     * file format.
     * <p>
     * The file extension {@code .ofn} is recommended for OWL Functional Syntax
     * documents. The media type is {@code text/owl-functional} and encoding is
     * in UTF-8.
     * </p>
     * 
     * @see <a href="http://www.w3.org/TR/owl2-syntax/">OWL 2 Web Ontology
     *      Language Structural Specification and Functional-Style Syntax
     *      (Second Edition)</a>
     */
    public static final OWLAPIRDFFormat OWL_FUNCTIONAL = new OWLAPIRDFFormat(
            "OWL Functional Syntax", Arrays.asList("text/owl-functional"),
            Charset.forName("UTF-8"), Arrays.asList("ofn"),
            SUPPORTS_NAMESPACES, NO_CONTEXTS,
            new FunctionalSyntaxDocumentFormat());
    private OWLDocumentFormat owlFormat;
    private OWLDocumentFormatFactory owlFormatFactory;

    /**
     * @param name
     *        name
     * @param mimeType
     *        mimeType
     * @param charset
     *        charset
     * @param fileExtension
     *        fileExtension
     * @param supportsNamespaces
     *        supportsNamespaces
     * @param supportsContexts
     *        supportsContexts
     * @param owlFormat
     *        owlFormat
     */
    public OWLAPIRDFFormat(String name, String mimeType, Charset charset,
            String fileExtension, boolean supportsNamespaces,
            boolean supportsContexts, OWLDocumentFormatFactory owlFormat) {
        super(name, mimeType, charset, fileExtension, supportsNamespaces,
                supportsContexts);__CLR4_5_24747lvicnc21.R.inc(152);try{__CLR4_5_24747lvicnc21.R.inc(151);
        __CLR4_5_24747lvicnc21.R.inc(153);owlFormatFactory = owlFormat;
    }finally{__CLR4_5_24747lvicnc21.R.flushNeeded();}}

    /**
     * @param name
     *        name
     * @param mimeType
     *        mimeType
     * @param charset
     *        charset
     * @param fileExtensions
     *        fileExtensions
     * @param supportsNamespaces
     *        supportsNamespaces
     * @param supportsContexts
     *        supportsContexts
     * @param owlFormat
     *        owlFormat
     */
    public OWLAPIRDFFormat(String name, String mimeType, Charset charset,
            Collection<String> fileExtensions, boolean supportsNamespaces,
            boolean supportsContexts, OWLDocumentFormatFactory owlFormat) {
        super(name, mimeType, charset, fileExtensions, supportsNamespaces,
                supportsContexts);__CLR4_5_24747lvicnc21.R.inc(155);try{__CLR4_5_24747lvicnc21.R.inc(154);
        __CLR4_5_24747lvicnc21.R.inc(156);owlFormatFactory = owlFormat;
    }finally{__CLR4_5_24747lvicnc21.R.flushNeeded();}}

    /**
     * @param name
     *        name
     * @param mimeTypes
     *        mimeTypes
     * @param charset
     *        charset
     * @param fileExtensions
     *        fileExtensions
     * @param supportsNamespaces
     *        supportsNamespaces
     * @param supportsContexts
     *        supportsContexts
     * @param owlFormat
     *        owlFormat
     */
    public OWLAPIRDFFormat(String name, Collection<String> mimeTypes,
            Charset charset, Collection<String> fileExtensions,
            boolean supportsNamespaces, boolean supportsContexts,
            OWLDocumentFormatFactory owlFormat) {
        super(name, mimeTypes, charset, fileExtensions, supportsNamespaces,
                supportsContexts);__CLR4_5_24747lvicnc21.R.inc(158);try{__CLR4_5_24747lvicnc21.R.inc(157);
        __CLR4_5_24747lvicnc21.R.inc(159);owlFormatFactory = owlFormat;
    }finally{__CLR4_5_24747lvicnc21.R.flushNeeded();}}

    /**
     * @param name
     *        name
     * @param mimeType
     *        mimeType
     * @param charset
     *        charset
     * @param fileExtension
     *        fileExtension
     * @param supportsNamespaces
     *        supportsNamespaces
     * @param supportsContexts
     *        supportsContexts
     * @param owlFormat
     *        owlFormat
     */
    public OWLAPIRDFFormat(String name, String mimeType, Charset charset,
            String fileExtension, boolean supportsNamespaces,
            boolean supportsContexts, OWLDocumentFormat owlFormat) {
        super(name, mimeType, charset, fileExtension, supportsNamespaces,
                supportsContexts);__CLR4_5_24747lvicnc21.R.inc(161);try{__CLR4_5_24747lvicnc21.R.inc(160);
        __CLR4_5_24747lvicnc21.R.inc(162);this.owlFormat = owlFormat;
    }finally{__CLR4_5_24747lvicnc21.R.flushNeeded();}}

    /**
     * @param name
     *        name
     * @param mimeType
     *        mimeType
     * @param charset
     *        charset
     * @param fileExtensions
     *        fileExtensions
     * @param supportsNamespaces
     *        supportsNamespaces
     * @param supportsContexts
     *        supportsContexts
     * @param owlFormat
     *        owlFormat
     */
    public OWLAPIRDFFormat(String name, String mimeType, Charset charset,
            Collection<String> fileExtensions, boolean supportsNamespaces,
            boolean supportsContexts, OWLDocumentFormat owlFormat) {
        super(name, mimeType, charset, fileExtensions, supportsNamespaces,
                supportsContexts);__CLR4_5_24747lvicnc21.R.inc(164);try{__CLR4_5_24747lvicnc21.R.inc(163);
        __CLR4_5_24747lvicnc21.R.inc(165);this.owlFormat = owlFormat;
    }finally{__CLR4_5_24747lvicnc21.R.flushNeeded();}}

    /**
     * @param name
     *        name
     * @param mimeTypes
     *        mimeTypes
     * @param charset
     *        charset
     * @param fileExtensions
     *        fileExtensions
     * @param supportsNamespaces
     *        supportsNamespaces
     * @param supportsContexts
     *        supportsContexts
     * @param owlFormat
     *        owlFormat
     */
    public OWLAPIRDFFormat(String name, Collection<String> mimeTypes,
            Charset charset, Collection<String> fileExtensions,
            boolean supportsNamespaces, boolean supportsContexts,
            OWLDocumentFormat owlFormat) {
        super(name, mimeTypes, charset, fileExtensions, supportsNamespaces,
                supportsContexts);__CLR4_5_24747lvicnc21.R.inc(167);try{__CLR4_5_24747lvicnc21.R.inc(166);
        __CLR4_5_24747lvicnc21.R.inc(168);this.owlFormat = owlFormat;
    }finally{__CLR4_5_24747lvicnc21.R.flushNeeded();}}

    /**
     * @return A fresh instance of the matching {@link OWLDocumentFormat} for
     *         this OWLAPIRDFFormat.
     */
    public OWLDocumentFormat getOWLFormat() {try{__CLR4_5_24747lvicnc21.R.inc(169);
        __CLR4_5_24747lvicnc21.R.inc(170);if ((((owlFormatFactory != null)&&(__CLR4_5_24747lvicnc21.R.iget(171)!=0|true))||(__CLR4_5_24747lvicnc21.R.iget(172)==0&false))) {{
            __CLR4_5_24747lvicnc21.R.inc(173);return owlFormatFactory.createFormat();
        } }else {{
            __CLR4_5_24747lvicnc21.R.inc(174);try {
                __CLR4_5_24747lvicnc21.R.inc(175);return owlFormat.getClass().newInstance();
            } catch (InstantiationException e) {
                __CLR4_5_24747lvicnc21.R.inc(176);throw new RuntimeException(
                        "Format did not have a factory or a public default constructor",
                        e);
            } catch (IllegalAccessException e) {
                __CLR4_5_24747lvicnc21.R.inc(177);throw new RuntimeException(
                        "Format did not have a factory or a public default constructor",
                        e);
            }
        }
    }}finally{__CLR4_5_24747lvicnc21.R.flushNeeded();}}
}
