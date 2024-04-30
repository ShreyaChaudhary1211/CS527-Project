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
package org.semanticweb.owlapi.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.io.OWLOntologyDocumentTarget;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLStorer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for ontology storers. Note that all current implementations are
 * stateless.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public abstract class AbstractOWLStorer implements OWLStorer {public static class __CLR4_5_24qz4qzlvickp19{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,6219,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    protected static final String UTF_8 = "UTF-8";
    protected static final Logger LOGGER = LoggerFactory
            .getLogger(AbstractOWLStorer.class);

    @Override
    public void storeOntology(OWLOntology ontology, @Nonnull IRI documentIRI,
            OWLDocumentFormat ontologyFormat)
            throws OWLOntologyStorageException {try{__CLR4_5_24qz4qzlvickp19.R.inc(6155);
        __CLR4_5_24qz4qzlvickp19.R.inc(6156);if ((((!documentIRI.isAbsolute())&&(__CLR4_5_24qz4qzlvickp19.R.iget(6157)!=0|true))||(__CLR4_5_24qz4qzlvickp19.R.iget(6158)==0&false))) {{
            __CLR4_5_24qz4qzlvickp19.R.inc(6159);throw new OWLOntologyStorageException(
                    "Document IRI must be absolute: " + documentIRI);
        }
        }__CLR4_5_24qz4qzlvickp19.R.inc(6160);try {
            __CLR4_5_24qz4qzlvickp19.R.inc(6161);OutputStream os = null;
            __CLR4_5_24qz4qzlvickp19.R.inc(6162);try {
                // prepare actual output
                __CLR4_5_24qz4qzlvickp19.R.inc(6163);os = prepareActualOutput(documentIRI);
                __CLR4_5_24qz4qzlvickp19.R.inc(6164);store(ontology, ontologyFormat, os);
            } finally {
                __CLR4_5_24qz4qzlvickp19.R.inc(6165);if ((((os != null)&&(__CLR4_5_24qz4qzlvickp19.R.iget(6166)!=0|true))||(__CLR4_5_24qz4qzlvickp19.R.iget(6167)==0&false))) {{
                    __CLR4_5_24qz4qzlvickp19.R.inc(6168);os.close();
                }
            }}
        } catch (IOException e) {
            __CLR4_5_24qz4qzlvickp19.R.inc(6169);throw new OWLOntologyStorageException(e);
        }
    }finally{__CLR4_5_24qz4qzlvickp19.R.flushNeeded();}}

    @Nonnull
    private static OutputStream prepareActualOutput(@Nonnull IRI documentIRI)
            throws IOException {try{__CLR4_5_24qz4qzlvickp19.R.inc(6170);
        __CLR4_5_24qz4qzlvickp19.R.inc(6171);OutputStream os;
        __CLR4_5_24qz4qzlvickp19.R.inc(6172);if (((("file".equals(documentIRI.getScheme()))&&(__CLR4_5_24qz4qzlvickp19.R.iget(6173)!=0|true))||(__CLR4_5_24qz4qzlvickp19.R.iget(6174)==0&false))) {{
            __CLR4_5_24qz4qzlvickp19.R.inc(6175);File file = new File(documentIRI.toURI());
            // Ensure that the necessary directories exist.
            __CLR4_5_24qz4qzlvickp19.R.inc(6176);file.getParentFile().mkdirs();
            __CLR4_5_24qz4qzlvickp19.R.inc(6177);os = new FileOutputStream(file);
        } }else {{
            __CLR4_5_24qz4qzlvickp19.R.inc(6178);URL url = documentIRI.toURI().toURL();
            __CLR4_5_24qz4qzlvickp19.R.inc(6179);URLConnection conn = url.openConnection();
            __CLR4_5_24qz4qzlvickp19.R.inc(6180);os = conn.getOutputStream();
        }
        }assert (((os != null)&&(__CLR4_5_24qz4qzlvickp19.R.iget(6181)!=0|true))||(__CLR4_5_24qz4qzlvickp19.R.iget(6182)==0&false));
        __CLR4_5_24qz4qzlvickp19.R.inc(6183);return os;
    }finally{__CLR4_5_24qz4qzlvickp19.R.flushNeeded();}}

    private void store(@Nonnull OWLOntology ontology,
            @Nonnull OWLDocumentFormat ontologyFormat,
            @Nonnull OutputStream tempOutputStream)
            throws OWLOntologyStorageException, IOException {try{__CLR4_5_24qz4qzlvickp19.R.inc(6184);
        __CLR4_5_24qz4qzlvickp19.R.inc(6185);Writer tempWriter = new BufferedWriter(new OutputStreamWriter(
                tempOutputStream, UTF_8));
        __CLR4_5_24qz4qzlvickp19.R.inc(6186);storeOntology(ontology, tempWriter, ontologyFormat);
        __CLR4_5_24qz4qzlvickp19.R.inc(6187);tempWriter.flush();
        __CLR4_5_24qz4qzlvickp19.R.inc(6188);tempWriter.close();
    }finally{__CLR4_5_24qz4qzlvickp19.R.flushNeeded();}}

    @Override
    public void
            storeOntology(OWLOntology ontology,
                    @Nonnull OWLOntologyDocumentTarget target,
                    OWLDocumentFormat format)
                    throws OWLOntologyStorageException {try{__CLR4_5_24qz4qzlvickp19.R.inc(6189);
        __CLR4_5_24qz4qzlvickp19.R.inc(6190);if ((((format.isTextual() && target.isWriterAvailable())&&(__CLR4_5_24qz4qzlvickp19.R.iget(6191)!=0|true))||(__CLR4_5_24qz4qzlvickp19.R.iget(6192)==0&false))) {{
            class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_24qz4qzlvickp19.R.inc(6193);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_24qz4qzlvickp19.R.inc(6194);}};Writer w = target.getWriter();) {
                __CLR4_5_24qz4qzlvickp19.R.inc(6195);storeOntology(ontology, w, format);
                __CLR4_5_24qz4qzlvickp19.R.inc(6196);w.flush();
            } catch (IOException e) {
                __CLR4_5_24qz4qzlvickp19.R.inc(6197);throw new OWLOntologyStorageException(e);
            }
        } }else {__CLR4_5_24qz4qzlvickp19.R.inc(6198);if ((((target.isOutputStreamAvailable())&&(__CLR4_5_24qz4qzlvickp19.R.iget(6199)!=0|true))||(__CLR4_5_24qz4qzlvickp19.R.iget(6200)==0&false))) {{
            __CLR4_5_24qz4qzlvickp19.R.inc(6201);try {
                __CLR4_5_24qz4qzlvickp19.R.inc(6202);storeOntology(ontology, target.getOutputStream(), format);
            } catch (IOException e) {
                __CLR4_5_24qz4qzlvickp19.R.inc(6203);throw new OWLOntologyStorageException(e);
            }
        } }else {__CLR4_5_24qz4qzlvickp19.R.inc(6204);if ((((target.isDocumentIRIAvailable())&&(__CLR4_5_24qz4qzlvickp19.R.iget(6205)!=0|true))||(__CLR4_5_24qz4qzlvickp19.R.iget(6206)==0&false))) {{
            __CLR4_5_24qz4qzlvickp19.R.inc(6207);storeOntology(ontology, target.getDocumentIRI(), format);
        } }else {{
            __CLR4_5_24qz4qzlvickp19.R.inc(6208);throw new OWLOntologyStorageException(
                    "Neither a Writer, OutputStream or Document IRI could be obtained to store the ontology in this format: "
                            + format.getKey());
        }
    }}}}finally{__CLR4_5_24qz4qzlvickp19.R.flushNeeded();}}

    /*
     * Override this to support textual serialisation.
     */
    protected abstract void storeOntology(@Nonnull OWLOntology ontology,
            @Nonnull Writer writer, @Nonnull OWLDocumentFormat format)
            throws OWLOntologyStorageException;

    /*
     * Override this to support direct binary serialisation without the UTF-8
     * encoding being applied.
     */
    protected void storeOntology(@Nonnull OWLOntology ontology,
            @Nonnull OutputStream outputStream,
            @Nonnull OWLDocumentFormat format)
            throws OWLOntologyStorageException {try{__CLR4_5_24qz4qzlvickp19.R.inc(6209);
        __CLR4_5_24qz4qzlvickp19.R.inc(6210);if ((((!format.isTextual())&&(__CLR4_5_24qz4qzlvickp19.R.iget(6211)!=0|true))||(__CLR4_5_24qz4qzlvickp19.R.iget(6212)==0&false))) {{
            __CLR4_5_24qz4qzlvickp19.R.inc(6213);throw new OWLOntologyStorageException(
                    "This method must be overridden to support this binary format: "
                            + format.getKey());
        }
        }__CLR4_5_24qz4qzlvickp19.R.inc(6214);try {
            __CLR4_5_24qz4qzlvickp19.R.inc(6215);Writer writer = new BufferedWriter(new OutputStreamWriter(
                    outputStream, UTF_8));
            __CLR4_5_24qz4qzlvickp19.R.inc(6216);storeOntology(ontology, writer, format);
            __CLR4_5_24qz4qzlvickp19.R.inc(6217);writer.flush();
        } catch (IOException e) {
            __CLR4_5_24qz4qzlvickp19.R.inc(6218);throw new OWLOntologyStorageException(e);
        }
    }finally{__CLR4_5_24qz4qzlvickp19.R.flushNeeded();}}
}
