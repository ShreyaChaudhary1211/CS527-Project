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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.UnsupportedOptionsException;
import org.tukaani.xz.XZOutputStream;

import com.google.common.io.Closeables;

/**
 * An ontology document target which can write to a XZ File. Notice that this
 * works best when the output stream is closed explicitly in the client code.
 *
 * @author ignazio
 * @since 3.4.8
 */
public class XZFileDocumentTarget implements OWLOntologyDocumentTarget, AutoCloseable {public static class __CLR4_5_21i91i9lvicklkw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,1987,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final File out;
    private final FilterOptions[] filterOptions;
    private OutputStream outputStream;

    /**
     * @param os            the actual file
     * @param filterOptions Settings for XZ compression
     */
    public XZFileDocumentTarget(@Nonnull File os, FilterOptions... filterOptions) {try{__CLR4_5_21i91i9lvicklkw.R.inc(1953);
        __CLR4_5_21i91i9lvicklkw.R.inc(1954);out = os;
        __CLR4_5_21i91i9lvicklkw.R.inc(1955);this.filterOptions = filterOptions;
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}

    /**
     * Construct an XZ document target using the selected compression preset
     *
     * @param os          target File
     * @param presetLevel LZMA2 Compression preset level
     * @throws UnsupportedOptionsException if the options selected are not acceptable
     */
    public XZFileDocumentTarget(@Nonnull File os, int presetLevel) throws UnsupportedOptionsException {
        this(os, new LZMA2Options(presetLevel));__CLR4_5_21i91i9lvicklkw.R.inc(1957);try{__CLR4_5_21i91i9lvicklkw.R.inc(1956);
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}
    /**
     * Construct an XZ document target
     *
     * @param file          target File
     */
    public XZFileDocumentTarget(@Nonnull File file) {
        this(file, new LZMA2Options());__CLR4_5_21i91i9lvicklkw.R.inc(1959);try{__CLR4_5_21i91i9lvicklkw.R.inc(1958);
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}
    @Override
    public boolean isWriterAvailable() {try{__CLR4_5_21i91i9lvicklkw.R.inc(1960);
        __CLR4_5_21i91i9lvicklkw.R.inc(1961);return isOutputStreamAvailable();
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}

    @Nonnull
    @Override
    public Writer getWriter() {try{__CLR4_5_21i91i9lvicklkw.R.inc(1962);
        __CLR4_5_21i91i9lvicklkw.R.inc(1963);if ((((!isWriterAvailable())&&(__CLR4_5_21i91i9lvicklkw.R.iget(1964)!=0|true))||(__CLR4_5_21i91i9lvicklkw.R.iget(1965)==0&false))) {{
            __CLR4_5_21i91i9lvicklkw.R.inc(1966);throw new UnsupportedOperationException(
                    "writer not available; check with isWriterAvailable() first.");
        }
        }__CLR4_5_21i91i9lvicklkw.R.inc(1967);return new OutputStreamWriter(getOutputStream());
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}

    @Override
    public boolean isOutputStreamAvailable() {try{__CLR4_5_21i91i9lvicklkw.R.inc(1968);
        __CLR4_5_21i91i9lvicklkw.R.inc(1969);return true;
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}

    @Override
    public OutputStream getOutputStream() {try{__CLR4_5_21i91i9lvicklkw.R.inc(1970);
        __CLR4_5_21i91i9lvicklkw.R.inc(1971);if ((((outputStream == null)&&(__CLR4_5_21i91i9lvicklkw.R.iget(1972)!=0|true))||(__CLR4_5_21i91i9lvicklkw.R.iget(1973)==0&false))) {{
            __CLR4_5_21i91i9lvicklkw.R.inc(1974);try {
                __CLR4_5_21i91i9lvicklkw.R.inc(1975);BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(out));
                __CLR4_5_21i91i9lvicklkw.R.inc(1976);outputStream = new XZOutputStream(bufferedOutputStream, filterOptions);
            } catch (IOException e) {
                __CLR4_5_21i91i9lvicklkw.R.inc(1977);throw new OWLRuntimeException(e);
            }
        }
        }__CLR4_5_21i91i9lvicklkw.R.inc(1978);return verifyNotNull(outputStream);
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}

    @Override
    public boolean isDocumentIRIAvailable() {try{__CLR4_5_21i91i9lvicklkw.R.inc(1979);
        __CLR4_5_21i91i9lvicklkw.R.inc(1980);return true;
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}

    @Override
    public IRI getDocumentIRI() {try{__CLR4_5_21i91i9lvicklkw.R.inc(1981);
        __CLR4_5_21i91i9lvicklkw.R.inc(1982);return IRI.create(out);
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}

    @Override
    public void close() throws Exception {try{__CLR4_5_21i91i9lvicklkw.R.inc(1983);
        __CLR4_5_21i91i9lvicklkw.R.inc(1984);OutputStream outputStream = this.outputStream;
        __CLR4_5_21i91i9lvicklkw.R.inc(1985);this.outputStream = null;
        __CLR4_5_21i91i9lvicklkw.R.inc(1986);Closeables.close(outputStream, false);
    }finally{__CLR4_5_21i91i9lvicklkw.R.flushNeeded();}}
}
