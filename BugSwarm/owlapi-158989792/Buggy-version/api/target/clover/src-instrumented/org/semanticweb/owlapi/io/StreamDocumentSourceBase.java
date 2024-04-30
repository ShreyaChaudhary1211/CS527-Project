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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLRuntimeException;

/**
 * Base class for common utilities among stream, reader and file input sources.
 * 
 * @since 4.0.0 TODO both stream and reader sources copy the input in memory in
 *        case reloading is needed. This can be bad for memory. Remote loading
 *        will download the ontologies multiple times too, until parsing fails.
 *        Both issues could be addressed with a local file copy.
 */
public abstract class StreamDocumentSourceBase extends
    OWLOntologyDocumentSourceBase {public static class __CLR4_5_215w15wlvickl4a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,1585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    protected final IRI documentIRI;
    protected byte[] byteBuffer;
    private String encoding = "UTF-8";
    @Nullable
    private Boolean readerAvailable = null;

    /**
     * Constructs an input source which will read an ontology from a
     * representation from the specified stream.
     * 
     * @param stream
     *        The stream that the ontology representation will be read from.
     * @param documentIRI
     *        The document IRI
     * @param format
     *        ontology format
     * @param mime
     *        mime type
     */
    public StreamDocumentSourceBase(@Nonnull InputStream stream,
        @Nonnull IRI documentIRI, OWLDocumentFormat format, String mime) {
        super(format, mime);__CLR4_5_215w15wlvickl4a.R.inc(1509);try{__CLR4_5_215w15wlvickl4a.R.inc(1508);
        __CLR4_5_215w15wlvickl4a.R.inc(1510);this.documentIRI = checkNotNull(documentIRI,
            "document iri cannot be null");
        __CLR4_5_215w15wlvickl4a.R.inc(1511);readIntoBuffer(checkNotNull(stream, "stream cannot be null"));
        __CLR4_5_215w15wlvickl4a.R.inc(1512);readerAvailable = format == null || format.isTextual();
    }finally{__CLR4_5_215w15wlvickl4a.R.flushNeeded();}}

    /**
     * Constructs an input source which will read an ontology from a
     * representation from the specified stream.
     * 
     * @param stream
     *        The stream that the ontology representation will be read from.
     * @param documentIRI
     *        The document IRI
     * @param format
     *        ontology format
     * @param mime
     *        mime type
     */
    public StreamDocumentSourceBase(@Nonnull Reader stream,
        @Nonnull IRI documentIRI, OWLDocumentFormat format, String mime) {
        super(format, mime);__CLR4_5_215w15wlvickl4a.R.inc(1514);try{__CLR4_5_215w15wlvickl4a.R.inc(1513);
        __CLR4_5_215w15wlvickl4a.R.inc(1515);this.documentIRI = checkNotNull(documentIRI,
            "document iri cannot be null");
        __CLR4_5_215w15wlvickl4a.R.inc(1516);checkNotNull(stream, "stream cannot be null");
        // if the input stream carries encoding information, use it; else leave
        // the default as UTF-8
        __CLR4_5_215w15wlvickl4a.R.inc(1517);if ((((stream instanceof InputStreamReader)&&(__CLR4_5_215w15wlvickl4a.R.iget(1518)!=0|true))||(__CLR4_5_215w15wlvickl4a.R.iget(1519)==0&false))) {{
            __CLR4_5_215w15wlvickl4a.R.inc(1520);encoding = ((InputStreamReader) stream).getEncoding();
        }
        }__CLR4_5_215w15wlvickl4a.R.inc(1521);readIntoBuffer(stream);
        __CLR4_5_215w15wlvickl4a.R.inc(1522);readerAvailable = format == null || format.isTextual();
    }finally{__CLR4_5_215w15wlvickl4a.R.flushNeeded();}}

    /**
     * Reads all the bytes from the specified stream into a temporary buffer,
     * which is necessary because we may need to access the input stream more
     * than once. In other words, this method caches the input stream.
     * 
     * @param reader
     *        The stream to be "cached"
     */
    private void readIntoBuffer(@Nonnull InputStream reader) {try{__CLR4_5_215w15wlvickl4a.R.inc(1523);
        __CLR4_5_215w15wlvickl4a.R.inc(1524);try {
            __CLR4_5_215w15wlvickl4a.R.inc(1525);ByteArrayOutputStream bos = new ByteArrayOutputStream();
            __CLR4_5_215w15wlvickl4a.R.inc(1526);GZIPOutputStream out = new GZIPOutputStream(bos);
            __CLR4_5_215w15wlvickl4a.R.inc(1527);int length = 100000;
            __CLR4_5_215w15wlvickl4a.R.inc(1528);byte[] tempBuffer = new byte[length];
            __CLR4_5_215w15wlvickl4a.R.inc(1529);int read = 0;
            __CLR4_5_215w15wlvickl4a.R.inc(1530);do {{
                __CLR4_5_215w15wlvickl4a.R.inc(1531);read = reader.read(tempBuffer, 0, length);
                __CLR4_5_215w15wlvickl4a.R.inc(1532);if ((((read > 0)&&(__CLR4_5_215w15wlvickl4a.R.iget(1533)!=0|true))||(__CLR4_5_215w15wlvickl4a.R.iget(1534)==0&false))) {{
                    __CLR4_5_215w15wlvickl4a.R.inc(1535);out.write(tempBuffer, 0, read);
                }
            }} }while ((((read > 0)&&(__CLR4_5_215w15wlvickl4a.R.iget(1536)!=0|true))||(__CLR4_5_215w15wlvickl4a.R.iget(1537)==0&false)));
            __CLR4_5_215w15wlvickl4a.R.inc(1538);out.finish();
            __CLR4_5_215w15wlvickl4a.R.inc(1539);out.flush();
            __CLR4_5_215w15wlvickl4a.R.inc(1540);byteBuffer = bos.toByteArray();
        } catch (IOException e) {
            __CLR4_5_215w15wlvickl4a.R.inc(1541);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_215w15wlvickl4a.R.flushNeeded();}}

    private void readIntoBuffer(Reader reader) {try{__CLR4_5_215w15wlvickl4a.R.inc(1542);
        __CLR4_5_215w15wlvickl4a.R.inc(1543);try {
            __CLR4_5_215w15wlvickl4a.R.inc(1544);ByteArrayOutputStream bos = new ByteArrayOutputStream();
            __CLR4_5_215w15wlvickl4a.R.inc(1545);GZIPOutputStream out = new GZIPOutputStream(bos);
            __CLR4_5_215w15wlvickl4a.R.inc(1546);OutputStreamWriter writer = new OutputStreamWriter(out);
            __CLR4_5_215w15wlvickl4a.R.inc(1547);int length = 100000;
            __CLR4_5_215w15wlvickl4a.R.inc(1548);char[] tempBuffer = new char[length];
            __CLR4_5_215w15wlvickl4a.R.inc(1549);int read = 0;
            __CLR4_5_215w15wlvickl4a.R.inc(1550);do {{
                __CLR4_5_215w15wlvickl4a.R.inc(1551);read = reader.read(tempBuffer, 0, length);
                __CLR4_5_215w15wlvickl4a.R.inc(1552);if ((((read > 0)&&(__CLR4_5_215w15wlvickl4a.R.iget(1553)!=0|true))||(__CLR4_5_215w15wlvickl4a.R.iget(1554)==0&false))) {{
                    __CLR4_5_215w15wlvickl4a.R.inc(1555);writer.write(tempBuffer, 0, read);
                }
            }} }while ((((read > 0)&&(__CLR4_5_215w15wlvickl4a.R.iget(1556)!=0|true))||(__CLR4_5_215w15wlvickl4a.R.iget(1557)==0&false)));
            __CLR4_5_215w15wlvickl4a.R.inc(1558);writer.flush();
            __CLR4_5_215w15wlvickl4a.R.inc(1559);out.finish();
            __CLR4_5_215w15wlvickl4a.R.inc(1560);out.flush();
            __CLR4_5_215w15wlvickl4a.R.inc(1561);byteBuffer = bos.toByteArray();
        } catch (IOException e) {
            __CLR4_5_215w15wlvickl4a.R.inc(1562);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_215w15wlvickl4a.R.flushNeeded();}}

    @Override
    public IRI getDocumentIRI() {try{__CLR4_5_215w15wlvickl4a.R.inc(1563);
        __CLR4_5_215w15wlvickl4a.R.inc(1564);return documentIRI;
    }finally{__CLR4_5_215w15wlvickl4a.R.flushNeeded();}}

    @Override
    public boolean isInputStreamAvailable() {try{__CLR4_5_215w15wlvickl4a.R.inc(1565);
        __CLR4_5_215w15wlvickl4a.R.inc(1566);return Boolean.FALSE.equals(readerAvailable);
    }finally{__CLR4_5_215w15wlvickl4a.R.flushNeeded();}}

    @Override
    public InputStream getInputStream() {try{__CLR4_5_215w15wlvickl4a.R.inc(1567);
        __CLR4_5_215w15wlvickl4a.R.inc(1568);if ((((!isInputStreamAvailable())&&(__CLR4_5_215w15wlvickl4a.R.iget(1569)!=0|true))||(__CLR4_5_215w15wlvickl4a.R.iget(1570)==0&false))) {{
            __CLR4_5_215w15wlvickl4a.R.inc(1571);throw new OWLOntologyInputSourceException(
                "InputStream not available. Check with OWLOntologyDocumentSource.isInputStreamAvailable()");
        }
        }__CLR4_5_215w15wlvickl4a.R.inc(1572);try {
            __CLR4_5_215w15wlvickl4a.R.inc(1573);return new GZIPInputStream(
                new ByteArrayInputStream(byteBuffer));
        } catch (IOException e) {
            __CLR4_5_215w15wlvickl4a.R.inc(1574);throw new OWLOntologyInputSourceException(e);
        }
    }finally{__CLR4_5_215w15wlvickl4a.R.flushNeeded();}}

    @Override
    public Reader getReader() {try{__CLR4_5_215w15wlvickl4a.R.inc(1575);
        __CLR4_5_215w15wlvickl4a.R.inc(1576);if ((((!isReaderAvailable())&&(__CLR4_5_215w15wlvickl4a.R.iget(1577)!=0|true))||(__CLR4_5_215w15wlvickl4a.R.iget(1578)==0&false))) {{
            __CLR4_5_215w15wlvickl4a.R.inc(1579);throw new OWLOntologyInputSourceException(
                "Reader not available.  Check with OWLOntologyDocumentSource.isReaderAvailable()");
        }
        }__CLR4_5_215w15wlvickl4a.R.inc(1580);try {
            __CLR4_5_215w15wlvickl4a.R.inc(1581);return new InputStreamReader(wrap(new GZIPInputStream(
                new ByteArrayInputStream(byteBuffer))), encoding);
        } catch (IOException e) {
            __CLR4_5_215w15wlvickl4a.R.inc(1582);throw new OWLOntologyInputSourceException(e);
        }
    }finally{__CLR4_5_215w15wlvickl4a.R.flushNeeded();}}

    @Override
    public boolean isReaderAvailable() {try{__CLR4_5_215w15wlvickl4a.R.inc(1583);
        __CLR4_5_215w15wlvickl4a.R.inc(1584);return Boolean.TRUE.equals(readerAvailable);
    }finally{__CLR4_5_215w15wlvickl4a.R.flushNeeded();}}
}
