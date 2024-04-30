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

import com.google.common.io.Closeables;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import javax.annotation.Nonnull;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import static org.semanticweb.owlapi.util.OWLAPIPreconditions.verifyNotNull;
import org.tukaani.xz.FilterOptions;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.UnsupportedOptionsException;
import org.tukaani.xz.XZOutputStream;

/**
 * An ontology document target which can write to a XZ stream. Notice that
 * this works best when the output stream is closed explicitly in the client
 * code.
 * 
 * @author ignazio
 * @since 3.4.8
 */
public class XZStreamDocumentTarget implements OWLOntologyDocumentTarget,AutoCloseable {public static class __CLR4_5_21kb1kblvickllk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,2062,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final OutputStream outputStream;
    private XZOutputStream xzOutputStream;
    private FilterOptions filterOptions[];

    /**
     * @param os
     *        the actual output stream
     *        @param filterOptions XZ filter options to use.  If no options are supplied
     *                             use default LZMA2 Options.
     */
    public XZStreamDocumentTarget(OutputStream os,FilterOptions... filterOptions) {try{__CLR4_5_21kb1kblvickllk.R.inc(2027);
        __CLR4_5_21kb1kblvickllk.R.inc(2028);outputStream = os;
        __CLR4_5_21kb1kblvickllk.R.inc(2029);if((((filterOptions.length == 0)&&(__CLR4_5_21kb1kblvickllk.R.iget(2030)!=0|true))||(__CLR4_5_21kb1kblvickllk.R.iget(2031)==0&false))) {{
            __CLR4_5_21kb1kblvickllk.R.inc(2032);filterOptions = new FilterOptions[] {new LZMA2Options()};
        }
        }__CLR4_5_21kb1kblvickllk.R.inc(2033);this.filterOptions = filterOptions;
    }finally{__CLR4_5_21kb1kblvickllk.R.flushNeeded();}}

    /**
     *
     * @param os  output stream to wrap
     * @param presetLevel LZMA2 Preset Level to use
     * @throws UnsupportedOptionsException if an unsupported preset level is supplied
     */
    public XZStreamDocumentTarget(OutputStream os,int presetLevel) throws UnsupportedOptionsException {
        this(os,new LZMA2Options(presetLevel));__CLR4_5_21kb1kblvickllk.R.inc(2035);try{__CLR4_5_21kb1kblvickllk.R.inc(2034);
    }finally{__CLR4_5_21kb1kblvickllk.R.flushNeeded();}}

    @Override
    public boolean isWriterAvailable() {try{__CLR4_5_21kb1kblvickllk.R.inc(2036);
        __CLR4_5_21kb1kblvickllk.R.inc(2037);return isOutputStreamAvailable();
    }finally{__CLR4_5_21kb1kblvickllk.R.flushNeeded();}}

    @Nonnull
    @Override
    public Writer getWriter() {try{__CLR4_5_21kb1kblvickllk.R.inc(2038);
        __CLR4_5_21kb1kblvickllk.R.inc(2039);if ((((!isWriterAvailable())&&(__CLR4_5_21kb1kblvickllk.R.iget(2040)!=0|true))||(__CLR4_5_21kb1kblvickllk.R.iget(2041)==0&false))) {{
            __CLR4_5_21kb1kblvickllk.R.inc(2042);throw new UnsupportedOperationException(
                    "writer not available; check with isWriterAvailable() first.");
        }
        }__CLR4_5_21kb1kblvickllk.R.inc(2043);return new OutputStreamWriter(getOutputStream());
    }finally{__CLR4_5_21kb1kblvickllk.R.flushNeeded();}}

    @Override
    public boolean isOutputStreamAvailable() {try{__CLR4_5_21kb1kblvickllk.R.inc(2044);
        __CLR4_5_21kb1kblvickllk.R.inc(2045);return true;
    }finally{__CLR4_5_21kb1kblvickllk.R.flushNeeded();}}

    @Nonnull
    @Override
    public OutputStream getOutputStream() {try{__CLR4_5_21kb1kblvickllk.R.inc(2046);
        __CLR4_5_21kb1kblvickllk.R.inc(2047);if ((((xzOutputStream == null)&&(__CLR4_5_21kb1kblvickllk.R.iget(2048)!=0|true))||(__CLR4_5_21kb1kblvickllk.R.iget(2049)==0&false))) {{
            __CLR4_5_21kb1kblvickllk.R.inc(2050);try {
                __CLR4_5_21kb1kblvickllk.R.inc(2051);xzOutputStream = new XZOutputStream(outputStream,filterOptions);
            } catch (IOException e) {
                __CLR4_5_21kb1kblvickllk.R.inc(2052);throw new OWLRuntimeException(e);
            }
        }
        }__CLR4_5_21kb1kblvickllk.R.inc(2053);return verifyNotNull(xzOutputStream);
    }finally{__CLR4_5_21kb1kblvickllk.R.flushNeeded();}}

    @Override
    public boolean isDocumentIRIAvailable() {try{__CLR4_5_21kb1kblvickllk.R.inc(2054);
        __CLR4_5_21kb1kblvickllk.R.inc(2055);return false;
    }finally{__CLR4_5_21kb1kblvickllk.R.flushNeeded();}}

    @Nonnull
    @Override
    public IRI getDocumentIRI() {try{__CLR4_5_21kb1kblvickllk.R.inc(2056);
        __CLR4_5_21kb1kblvickllk.R.inc(2057);throw new UnsupportedOperationException(
                "iri not available; check with isDocumentIRIAvailable() first");
    }finally{__CLR4_5_21kb1kblvickllk.R.flushNeeded();}}

    @Override
    public void close() throws Exception {try{__CLR4_5_21kb1kblvickllk.R.inc(2058);
        __CLR4_5_21kb1kblvickllk.R.inc(2059);XZOutputStream xzOutputStream = this.xzOutputStream;
        __CLR4_5_21kb1kblvickllk.R.inc(2060);this.xzOutputStream = null;
        __CLR4_5_21kb1kblvickllk.R.inc(2061);Closeables.close(xzOutputStream,false);
    }finally{__CLR4_5_21kb1kblvickllk.R.flushNeeded();}}
}
