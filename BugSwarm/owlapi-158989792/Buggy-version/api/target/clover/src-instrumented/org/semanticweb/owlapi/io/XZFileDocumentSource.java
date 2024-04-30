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
package org.semanticweb.owlapi.io;

import java.io.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.tukaani.xz.XZInputStream;

/**
 * An ontology document source which can read from a XZ (LZMA) compressed File.
 * 
 * @author ignazio
 * @since 3.4.8
 */
public class XZFileDocumentSource extends OWLOntologyDocumentSourceBase {public static class __CLR4_5_21ho1holvicklj7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,1953,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final IRI documentIRI;
    @Nonnull
    private final File file;

    /**
     * Constructs an input source which will read an ontology from a
     * representation from the specified file.
     *
     * @param is
     *        The file that the ontology representation will be read from.
     */
    public XZFileDocumentSource(@Nonnull File is) {
        this(is, getNextDocumentIRI("file:ontology"), null, null);__CLR4_5_21ho1holvicklj7.R.inc(1933);try{__CLR4_5_21ho1holvicklj7.R.inc(1932);
    }finally{__CLR4_5_21ho1holvicklj7.R.flushNeeded();}}

    /**
     * Constructs an input source which will read an ontology from a
     * representation from the specified file.
     *
     * @param stream
     *        The file that the ontology representation will be read from.
     * @param documentIRI
     *        The document IRI
     * @param format
     *        ontology format
     * @param mime
     *        mime type
     */
    public XZFileDocumentSource(@Nonnull File stream,
        @Nonnull IRI documentIRI, @Nullable OWLDocumentFormat format,
        @Nullable String mime) {
        super(format, mime);__CLR4_5_21ho1holvicklj7.R.inc(1935);try{__CLR4_5_21ho1holvicklj7.R.inc(1934);
        __CLR4_5_21ho1holvicklj7.R.inc(1936);this.documentIRI = documentIRI;
        __CLR4_5_21ho1holvicklj7.R.inc(1937);file = stream;
    }finally{__CLR4_5_21ho1holvicklj7.R.flushNeeded();}}

    @Override
    public boolean isInputStreamAvailable() {try{__CLR4_5_21ho1holvicklj7.R.inc(1938);
        __CLR4_5_21ho1holvicklj7.R.inc(1939);return file.exists();
    }finally{__CLR4_5_21ho1holvicklj7.R.flushNeeded();}}

    @Nonnull
    @Override
    public InputStream getInputStream() {try{__CLR4_5_21ho1holvicklj7.R.inc(1940);
        __CLR4_5_21ho1holvicklj7.R.inc(1941);try {
            __CLR4_5_21ho1holvicklj7.R.inc(1942);return new XZInputStream(new BufferedInputStream(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            __CLR4_5_21ho1holvicklj7.R.inc(1943);throw new OWLOntologyInputSourceException(
                "File not found - check that the file is available before calling this method.",
                e);
        } catch (IOException e) {
            __CLR4_5_21ho1holvicklj7.R.inc(1944);throw new OWLOntologyInputSourceException(e);
        }
    }finally{__CLR4_5_21ho1holvicklj7.R.flushNeeded();}}

    @Override
    public IRI getDocumentIRI() {try{__CLR4_5_21ho1holvicklj7.R.inc(1945);
        __CLR4_5_21ho1holvicklj7.R.inc(1946);return documentIRI;
    }finally{__CLR4_5_21ho1holvicklj7.R.flushNeeded();}}

    @Override
    public Reader getReader() {try{__CLR4_5_21ho1holvicklj7.R.inc(1947);
        __CLR4_5_21ho1holvicklj7.R.inc(1948);try {
            __CLR4_5_21ho1holvicklj7.R.inc(1949);return new InputStreamReader(wrap(getInputStream()), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            // will never happen though - UTF-8 is always supported
            __CLR4_5_21ho1holvicklj7.R.inc(1950);throw new OWLOntologyInputSourceException(e);
        }
    }finally{__CLR4_5_21ho1holvicklj7.R.flushNeeded();}}

    @Override
    public boolean isReaderAvailable() {try{__CLR4_5_21ho1holvicklj7.R.inc(1951);
        __CLR4_5_21ho1holvicklj7.R.inc(1952);return file.exists();
    }finally{__CLR4_5_21ho1holvicklj7.R.flushNeeded();}}
}
