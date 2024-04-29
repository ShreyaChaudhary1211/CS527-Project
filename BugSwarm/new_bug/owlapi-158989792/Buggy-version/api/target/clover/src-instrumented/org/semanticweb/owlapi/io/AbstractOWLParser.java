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

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tukaani.xz.XZInputStream;
import org.xml.sax.InputSource;

/**
 * A convenience base class for parsers, which provides a mechanism to manage
 * the setting and getting of the {@code OWLOntologyManager} that should be
 * associated with the parser. Note: all current parser implementations are
 * stateless.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class AbstractOWLParser implements OWLParser, Serializable {public static class __CLR4_5_2m1m1lvickkm1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,951,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractOWLParser.class);
    private static final String ZIP_FILE_EXTENSION = ".zip";
    private static final String CONTENT_DISPOSITION_HEADER = "Content-Disposition";
    private static final Pattern CONTENT_DISPOSITION_FILE_NAME_PATTERN = Pattern.compile(".*filename=\"([^\\s;]*)\".*");
    private static final int CONTENT_DISPOSITION_FILE_NAME_PATTERN_GROUP = 1;
    private static final Pattern ZIP_ENTRY_ONTOLOGY_NAME_PATTERN = Pattern.compile(".*owl|rdf|xml|mos");
    private final String acceptableContentEncoding = "xz,gzip,deflate";

    protected AbstractOWLParser() {try{__CLR4_5_2m1m1lvickkm1.R.inc(793);}finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    @Nonnull
    protected String getRequestTypes() {try{__CLR4_5_2m1m1lvickkm1.R.inc(794);
        __CLR4_5_2m1m1lvickkm1.R.inc(795);return "application/rdf+xml, application/xml; q=0.5, text/xml; q=0.3, */*; q=0.2";
    }finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    /**
     * A convenience method that obtains an input stream from a URI. This method
     * sets up the correct request type and wraps the input stream within a
     * buffered input stream.
     * 
     * @param documentIRI
     *        The URI from which the input stream should be returned
     * @param config
     *        the load configuration
     * @return The input stream obtained from the URI
     * @throws IOException
     *         if there was an {@code IOException} in obtaining the input stream
     *         from the URI.
     */
    @Nonnull
    protected InputStream getInputStream(@Nonnull IRI documentIRI, @Nonnull OWLOntologyLoaderConfiguration config)
        throws IOException {try{__CLR4_5_2m1m1lvickkm1.R.inc(796);
        __CLR4_5_2m1m1lvickkm1.R.inc(797);String requestType = getRequestTypes();
        __CLR4_5_2m1m1lvickkm1.R.inc(798);URL originalURL = documentIRI.toURI().toURL();
        __CLR4_5_2m1m1lvickkm1.R.inc(799);String originalProtocol = originalURL.getProtocol();
        __CLR4_5_2m1m1lvickkm1.R.inc(800);URLConnection conn = originalURL.openConnection();
        __CLR4_5_2m1m1lvickkm1.R.inc(801);conn.addRequestProperty("Accept", requestType);
        __CLR4_5_2m1m1lvickkm1.R.inc(802);if ((((config.isAcceptingHTTPCompression())&&(__CLR4_5_2m1m1lvickkm1.R.iget(803)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(804)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(805);conn.setRequestProperty("Accept-Encoding", acceptableContentEncoding);
        }
        }__CLR4_5_2m1m1lvickkm1.R.inc(806);int connectionTimeout = config.getConnectionTimeout();
        __CLR4_5_2m1m1lvickkm1.R.inc(807);conn.setConnectTimeout(connectionTimeout);
        __CLR4_5_2m1m1lvickkm1.R.inc(808);if ((((conn instanceof HttpURLConnection && config.isFollowRedirects())&&(__CLR4_5_2m1m1lvickkm1.R.iget(809)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(810)==0&false))) {{
            // follow redirects to HTTPS
            __CLR4_5_2m1m1lvickkm1.R.inc(811);HttpURLConnection con = (HttpURLConnection) conn;
            __CLR4_5_2m1m1lvickkm1.R.inc(812);con.connect();
            __CLR4_5_2m1m1lvickkm1.R.inc(813);int responseCode = con.getResponseCode();
            // redirect
            __CLR4_5_2m1m1lvickkm1.R.inc(814);if ((((responseCode == HttpURLConnection.HTTP_MOVED_TEMP || responseCode == HttpURLConnection.HTTP_MOVED_PERM
                || responseCode == HttpURLConnection.HTTP_SEE_OTHER)&&(__CLR4_5_2m1m1lvickkm1.R.iget(815)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(816)==0&false))) {{
                __CLR4_5_2m1m1lvickkm1.R.inc(817);String location = con.getHeaderField("Location");
                __CLR4_5_2m1m1lvickkm1.R.inc(818);URL newURL = new URL(location);
                __CLR4_5_2m1m1lvickkm1.R.inc(819);String newProtocol = newURL.getProtocol();
                __CLR4_5_2m1m1lvickkm1.R.inc(820);if ((((!originalProtocol.equals(newProtocol))&&(__CLR4_5_2m1m1lvickkm1.R.iget(821)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(822)==0&false))) {{
                    // then different protocols: redirect won't follow
                    // automatically
                    __CLR4_5_2m1m1lvickkm1.R.inc(823);conn = newURL.openConnection();
                    __CLR4_5_2m1m1lvickkm1.R.inc(824);conn.addRequestProperty("Accept", requestType);
                    __CLR4_5_2m1m1lvickkm1.R.inc(825);if ((((config.isAcceptingHTTPCompression())&&(__CLR4_5_2m1m1lvickkm1.R.iget(826)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(827)==0&false))) {{
                        __CLR4_5_2m1m1lvickkm1.R.inc(828);conn.setRequestProperty("Accept-Encoding", acceptableContentEncoding);
                    }
                    }__CLR4_5_2m1m1lvickkm1.R.inc(829);conn.setConnectTimeout(connectionTimeout);
                }
            }}
        }}
        }__CLR4_5_2m1m1lvickkm1.R.inc(830);String contentEncoding = conn.getContentEncoding();
        __CLR4_5_2m1m1lvickkm1.R.inc(831);InputStream is = null;
        __CLR4_5_2m1m1lvickkm1.R.inc(832);int count = 0;
        __CLR4_5_2m1m1lvickkm1.R.inc(833);while ((((count < config.getRetriesToAttempt() && is == null)&&(__CLR4_5_2m1m1lvickkm1.R.iget(834)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(835)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(836);try {
                __CLR4_5_2m1m1lvickkm1.R.inc(837);is = getInputStreamFromContentEncoding(conn, contentEncoding);
            } catch (SocketTimeoutException e) {
                __CLR4_5_2m1m1lvickkm1.R.inc(838);count++;
                __CLR4_5_2m1m1lvickkm1.R.inc(839);if ((((count == 5)&&(__CLR4_5_2m1m1lvickkm1.R.iget(840)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(841)==0&false))) {{
                    __CLR4_5_2m1m1lvickkm1.R.inc(842);throw e;
                }
                }__CLR4_5_2m1m1lvickkm1.R.inc(843);conn.setConnectTimeout(connectionTimeout + connectionTimeout * count);
            }
        }
        }__CLR4_5_2m1m1lvickkm1.R.inc(844);if ((((is == null)&&(__CLR4_5_2m1m1lvickkm1.R.iget(845)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(846)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(847);throw new IOException("cannot connect to " + documentIRI + "; retry limit exhausted");
        }
        }__CLR4_5_2m1m1lvickkm1.R.inc(848);if ((((isZipName(documentIRI, conn))&&(__CLR4_5_2m1m1lvickkm1.R.iget(849)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(850)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(851);ZipInputStream zis = new ZipInputStream(is);
            __CLR4_5_2m1m1lvickkm1.R.inc(852);ZipEntry entry = null;
            __CLR4_5_2m1m1lvickkm1.R.inc(853);ZipEntry nextEntry = zis.getNextEntry();
            __CLR4_5_2m1m1lvickkm1.R.inc(854);while ((((entry != null && nextEntry != null)&&(__CLR4_5_2m1m1lvickkm1.R.iget(855)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(856)==0&false))) {{
                __CLR4_5_2m1m1lvickkm1.R.inc(857);if ((((couldBeOntology(nextEntry))&&(__CLR4_5_2m1m1lvickkm1.R.iget(858)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(859)==0&false))) {{
                    __CLR4_5_2m1m1lvickkm1.R.inc(860);entry = nextEntry;
                }
                }__CLR4_5_2m1m1lvickkm1.R.inc(861);nextEntry = zis.getNextEntry();
            }
            }__CLR4_5_2m1m1lvickkm1.R.inc(862);is = zis;
        }
        }__CLR4_5_2m1m1lvickkm1.R.inc(863);return is;
    }finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    private static boolean couldBeOntology(@Nullable ZipEntry zipEntry) {try{__CLR4_5_2m1m1lvickkm1.R.inc(864);
        __CLR4_5_2m1m1lvickkm1.R.inc(865);if ((((zipEntry == null)&&(__CLR4_5_2m1m1lvickkm1.R.iget(866)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(867)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(868);return false;
        }
        }__CLR4_5_2m1m1lvickkm1.R.inc(869);return ZIP_ENTRY_ONTOLOGY_NAME_PATTERN.matcher(zipEntry.getName()).matches();
    }finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    @Nonnull
    private static InputStream getInputStreamFromContentEncoding(@Nonnull URLConnection conn,
        @Nullable String contentEncoding) throws IOException {try{__CLR4_5_2m1m1lvickkm1.R.inc(870);
        __CLR4_5_2m1m1lvickkm1.R.inc(871);InputStream is = null;
        __CLR4_5_2m1m1lvickkm1.R.inc(872);InputStream connInputStream = conn.getInputStream();
        __CLR4_5_2m1m1lvickkm1.R.inc(873);if ((((contentEncoding != null)&&(__CLR4_5_2m1m1lvickkm1.R.iget(874)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(875)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(876);if (((("xz".equals(contentEncoding))&&(__CLR4_5_2m1m1lvickkm1.R.iget(877)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(878)==0&false))) {{
                __CLR4_5_2m1m1lvickkm1.R.inc(879);LOGGER.info("URL connection input stream is compressed using xz");
                __CLR4_5_2m1m1lvickkm1.R.inc(880);is = new BufferedInputStream(new XZInputStream(connInputStream));
            } }else {__CLR4_5_2m1m1lvickkm1.R.inc(881);if (((("gzip".equals(contentEncoding))&&(__CLR4_5_2m1m1lvickkm1.R.iget(882)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(883)==0&false))) {{
                __CLR4_5_2m1m1lvickkm1.R.inc(884);LOGGER.info("URL connection input stream is compressed using gzip");
                __CLR4_5_2m1m1lvickkm1.R.inc(885);is = new BufferedInputStream(new GZIPInputStream(connInputStream));
            } }else {__CLR4_5_2m1m1lvickkm1.R.inc(886);if (((("deflate".equals(contentEncoding))&&(__CLR4_5_2m1m1lvickkm1.R.iget(887)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(888)==0&false))) {{
                __CLR4_5_2m1m1lvickkm1.R.inc(889);LOGGER.info("URL connection input stream is compressed using deflate");
                __CLR4_5_2m1m1lvickkm1.R.inc(890);is = OWLOntologyDocumentSourceBase.wrap(new InflaterInputStream(connInputStream, new Inflater(true)));
            }
        }}}} }else {{
            __CLR4_5_2m1m1lvickkm1.R.inc(891);String fileName = getFileNameFromContentDisposition(conn);
            __CLR4_5_2m1m1lvickkm1.R.inc(892);if ((((fileName == null && conn.getURL() != null)&&(__CLR4_5_2m1m1lvickkm1.R.iget(893)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(894)==0&false))) {{
                __CLR4_5_2m1m1lvickkm1.R.inc(895);fileName = conn.getURL().toString();
            }
            }__CLR4_5_2m1m1lvickkm1.R.inc(896);if ((((fileName != null)&&(__CLR4_5_2m1m1lvickkm1.R.iget(897)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(898)==0&false))) {{
                __CLR4_5_2m1m1lvickkm1.R.inc(899);if ((((fileName.endsWith(".gz"))&&(__CLR4_5_2m1m1lvickkm1.R.iget(900)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(901)==0&false))) {{
                    __CLR4_5_2m1m1lvickkm1.R.inc(902);LOGGER.info("URL connection has no content encoding but name ends with .gz");
                    __CLR4_5_2m1m1lvickkm1.R.inc(903);is = new BufferedInputStream(new GZIPInputStream(connInputStream));
                } }else {__CLR4_5_2m1m1lvickkm1.R.inc(904);if ((((fileName.endsWith(".xz"))&&(__CLR4_5_2m1m1lvickkm1.R.iget(905)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(906)==0&false))) {{
                    __CLR4_5_2m1m1lvickkm1.R.inc(907);LOGGER.info("URL connection has no content encoding but name ends with .xz");
                    __CLR4_5_2m1m1lvickkm1.R.inc(908);is = new BufferedInputStream(new XZInputStream(connInputStream));
                }
            }}}
        }}
        }__CLR4_5_2m1m1lvickkm1.R.inc(909);if ((((is == null)&&(__CLR4_5_2m1m1lvickkm1.R.iget(910)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(911)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(912);is = OWLOntologyDocumentSourceBase.wrap(connInputStream);
        }
        }__CLR4_5_2m1m1lvickkm1.R.inc(913);return is;
    }finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    private static boolean isZipName(@Nonnull IRI documentIRI, @Nonnull URLConnection connection) {try{__CLR4_5_2m1m1lvickkm1.R.inc(914);
        __CLR4_5_2m1m1lvickkm1.R.inc(915);if ((((isZipFileName(documentIRI.toString()))&&(__CLR4_5_2m1m1lvickkm1.R.iget(916)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(917)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(918);return true;
        } }else {{
            __CLR4_5_2m1m1lvickkm1.R.inc(919);String fileName = getFileNameFromContentDisposition(connection);
            __CLR4_5_2m1m1lvickkm1.R.inc(920);return fileName != null && isZipFileName(fileName);
        }
    }}finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    @Nullable
    private static String getFileNameFromContentDisposition(@Nonnull URLConnection connection) {try{__CLR4_5_2m1m1lvickkm1.R.inc(921);
        __CLR4_5_2m1m1lvickkm1.R.inc(922);String contentDispositionHeaderValue = connection.getHeaderField(CONTENT_DISPOSITION_HEADER);
        __CLR4_5_2m1m1lvickkm1.R.inc(923);if ((((contentDispositionHeaderValue != null)&&(__CLR4_5_2m1m1lvickkm1.R.iget(924)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(925)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(926);Matcher matcher = CONTENT_DISPOSITION_FILE_NAME_PATTERN.matcher(contentDispositionHeaderValue);
            __CLR4_5_2m1m1lvickkm1.R.inc(927);if ((((matcher.matches())&&(__CLR4_5_2m1m1lvickkm1.R.iget(928)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(929)==0&false))) {{
                __CLR4_5_2m1m1lvickkm1.R.inc(930);return matcher.group(CONTENT_DISPOSITION_FILE_NAME_PATTERN_GROUP);
            }
        }}
        }__CLR4_5_2m1m1lvickkm1.R.inc(931);return null;
    }finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    private static boolean isZipFileName(@Nonnull String fileName) {try{__CLR4_5_2m1m1lvickkm1.R.inc(932);
        __CLR4_5_2m1m1lvickkm1.R.inc(933);return fileName.toLowerCase(Locale.getDefault()).endsWith(ZIP_FILE_EXTENSION);
    }finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    @Nonnull
    protected InputSource getInputSource(@Nonnull OWLOntologyDocumentSource documentSource,
        @Nonnull OWLOntologyLoaderConfiguration config) throws IOException {try{__CLR4_5_2m1m1lvickkm1.R.inc(934);
        __CLR4_5_2m1m1lvickkm1.R.inc(935);InputSource is;
        __CLR4_5_2m1m1lvickkm1.R.inc(936);if ((((documentSource.isReaderAvailable())&&(__CLR4_5_2m1m1lvickkm1.R.iget(937)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(938)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(939);is = new InputSource(documentSource.getReader());
        } }else {__CLR4_5_2m1m1lvickkm1.R.inc(940);if ((((documentSource.isInputStreamAvailable())&&(__CLR4_5_2m1m1lvickkm1.R.iget(941)!=0|true))||(__CLR4_5_2m1m1lvickkm1.R.iget(942)==0&false))) {{
            __CLR4_5_2m1m1lvickkm1.R.inc(943);is = new InputSource(documentSource.getInputStream());
        } }else {{
            __CLR4_5_2m1m1lvickkm1.R.inc(944);is = new InputSource(getInputStream(documentSource.getDocumentIRI(), config));
        }
        }}__CLR4_5_2m1m1lvickkm1.R.inc(945);is.setSystemId(documentSource.getDocumentIRI().toString());
        __CLR4_5_2m1m1lvickkm1.R.inc(946);return is;
    }finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLDocumentFormat parse(IRI documentIRI, OWLOntology ontology) throws IOException {try{__CLR4_5_2m1m1lvickkm1.R.inc(947);
        __CLR4_5_2m1m1lvickkm1.R.inc(948);return parse(new IRIDocumentSource(documentIRI, null, null), ontology, ontology.getOWLOntologyManager()
            .getOntologyLoaderConfiguration());
    }finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}

    @Override
    public String getName() {try{__CLR4_5_2m1m1lvickkm1.R.inc(949);
        __CLR4_5_2m1m1lvickkm1.R.inc(950);return getClass().getSimpleName();
    }finally{__CLR4_5_2m1m1lvickkm1.R.flushNeeded();}}
}
