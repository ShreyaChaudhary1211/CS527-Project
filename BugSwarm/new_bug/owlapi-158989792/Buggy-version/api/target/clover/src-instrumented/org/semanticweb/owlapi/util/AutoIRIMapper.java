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

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.*;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.annotations.HasPriority;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntologyIRIMapper;
import org.semanticweb.owlapi.vocab.Namespaces;
import org.semanticweb.owlapi.vocab.OWLXMLVocabulary;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.google.common.io.Closeables;

/**
 * A mapper which given a root folder attempts to automatically discover and map
 * files to ontologies. The mapper is only capable of mapping ontologies in
 * RDF/XML and OWL/XML (other serialisations are not supported).
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
@HasPriority(1)
public class AutoIRIMapper extends DefaultHandler implements OWLOntologyIRIMapper, Serializable {public static class __CLR4_5_24ut4utlvickp6t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,6478,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private final Set<String> fileExtensions = new HashSet<>();
    private boolean mapped;
    private final boolean recursive;
    private final Map<String, OntologyRootElementHandler> handlerMap = new HashMap<>();
    private final Map<IRI, IRI> ontologyIRI2PhysicalURIMap = new HashMap<>();
    private final Map<String, IRI> oboFileMap = new HashMap<>();
    private final String directoryPath;
    private transient File currentFile;

    /**
     * Creates an auto-mapper which examines ontologies that reside in the
     * specified root folder (and possibly sub-folders).
     * 
     * @param rootDirectory
     *        The root directory which should be searched for ontologies.
     * @param recursive
     *        Sub directories will be searched recursively if {@code true}.
     */
    public AutoIRIMapper(@Nonnull File rootDirectory, boolean recursive) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6293);
        __CLR4_5_24ut4utlvickp6t.R.inc(6294);directoryPath = checkNotNull(rootDirectory, "rootDirectory cannot be null").getAbsolutePath();
        __CLR4_5_24ut4utlvickp6t.R.inc(6295);this.recursive = recursive;
        __CLR4_5_24ut4utlvickp6t.R.inc(6296);fileExtensions.add("owl");
        __CLR4_5_24ut4utlvickp6t.R.inc(6297);fileExtensions.add("xml");
        __CLR4_5_24ut4utlvickp6t.R.inc(6298);fileExtensions.add("rdf");
        __CLR4_5_24ut4utlvickp6t.R.inc(6299);fileExtensions.add("omn");
        __CLR4_5_24ut4utlvickp6t.R.inc(6300);fileExtensions.add("ofn");
        __CLR4_5_24ut4utlvickp6t.R.inc(6301);mapped = false;
        __CLR4_5_24ut4utlvickp6t.R.inc(6302);handlerMap.put(Namespaces.RDF + "RDF", new RDFXMLOntologyRootElementHandler());
        __CLR4_5_24ut4utlvickp6t.R.inc(6303);handlerMap.put(OWLXMLVocabulary.ONTOLOGY.toString(), new OWLXMLOntologyRootElementHandler());
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    protected File getDirectory() {try{__CLR4_5_24ut4utlvickp6t.R.inc(6304);
        __CLR4_5_24ut4utlvickp6t.R.inc(6305);return new File(directoryPath);
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    /**
     * The mapper only examines files that have specified file extensions. This
     * method returns the file extensions that cause a file to be examined.
     * 
     * @return A {@code Set} of file extensions.
     */
    public Set<String> getFileExtensions() {try{__CLR4_5_24ut4utlvickp6t.R.inc(6306);
        __CLR4_5_24ut4utlvickp6t.R.inc(6307);return fileExtensions;
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    /**
     * Sets the extensions of files that are to be examined for ontological
     * content. (By default the extensions are, owl, xml and rdf). Only files
     * that have the specified extensions will be examined to see if they
     * contain ontologies.
     * 
     * @param extensions
     *        the set of extensions
     */
    public void setFileExtensions(Set<String> extensions) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6308);
        __CLR4_5_24ut4utlvickp6t.R.inc(6309);fileExtensions.clear();
        __CLR4_5_24ut4utlvickp6t.R.inc(6310);fileExtensions.addAll(extensions);
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    /**
     * Gets the set of ontology IRIs that this mapper has found.
     * 
     * @return A {@code Set} of ontology (logical) URIs
     */
    public Set<IRI> getOntologyIRIs() {try{__CLR4_5_24ut4utlvickp6t.R.inc(6311);
        __CLR4_5_24ut4utlvickp6t.R.inc(6312);if ((((!mapped)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6313)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6314)==0&false))) {{
            __CLR4_5_24ut4utlvickp6t.R.inc(6315);mapFiles();
        }
        }__CLR4_5_24ut4utlvickp6t.R.inc(6316);return new HashSet<>(ontologyIRI2PhysicalURIMap.keySet());
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    /** update the map. */
    public void update() {try{__CLR4_5_24ut4utlvickp6t.R.inc(6317);
        __CLR4_5_24ut4utlvickp6t.R.inc(6318);mapFiles();
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    @Override
    public IRI getDocumentIRI(IRI ontologyIRI) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6319);
        __CLR4_5_24ut4utlvickp6t.R.inc(6320);if ((((!mapped)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6321)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6322)==0&false))) {{
            __CLR4_5_24ut4utlvickp6t.R.inc(6323);mapFiles();
        }
        }__CLR4_5_24ut4utlvickp6t.R.inc(6324);if ((((ontologyIRI.toString().endsWith(".obo"))&&(__CLR4_5_24ut4utlvickp6t.R.iget(6325)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6326)==0&false))) {{
            __CLR4_5_24ut4utlvickp6t.R.inc(6327);String path = ontologyIRI.toURI().getPath();
            __CLR4_5_24ut4utlvickp6t.R.inc(6328);if ((((path != null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6329)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6330)==0&false))) {{
                __CLR4_5_24ut4utlvickp6t.R.inc(6331);int lastSepIndex = path.lastIndexOf('/');
                __CLR4_5_24ut4utlvickp6t.R.inc(6332);String name = path.substring(lastSepIndex + 1, path.length());
                __CLR4_5_24ut4utlvickp6t.R.inc(6333);IRI documentIRI = oboFileMap.get(name);
                __CLR4_5_24ut4utlvickp6t.R.inc(6334);if ((((documentIRI != null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6335)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6336)==0&false))) {{
                    __CLR4_5_24ut4utlvickp6t.R.inc(6337);return documentIRI;
                }
            }}
        }}
        }__CLR4_5_24ut4utlvickp6t.R.inc(6338);return ontologyIRI2PhysicalURIMap.get(ontologyIRI);
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    private void mapFiles() {try{__CLR4_5_24ut4utlvickp6t.R.inc(6339);
        __CLR4_5_24ut4utlvickp6t.R.inc(6340);mapped = true;
        __CLR4_5_24ut4utlvickp6t.R.inc(6341);ontologyIRI2PhysicalURIMap.clear();
        __CLR4_5_24ut4utlvickp6t.R.inc(6342);processFile(getDirectory());
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    private void processFile(File f) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6343);
        __CLR4_5_24ut4utlvickp6t.R.inc(6344);if ((((f.isHidden())&&(__CLR4_5_24ut4utlvickp6t.R.iget(6345)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6346)==0&false))) {{
            __CLR4_5_24ut4utlvickp6t.R.inc(6347);return;
        }
        }__CLR4_5_24ut4utlvickp6t.R.inc(6348);File[] files = f.listFiles();
        __CLR4_5_24ut4utlvickp6t.R.inc(6349);if ((((files != null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6350)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6351)==0&false))) {{
            __CLR4_5_24ut4utlvickp6t.R.inc(6352);for (File file : files) {{
                __CLR4_5_24ut4utlvickp6t.R.inc(6353);if ((((file.isDirectory() && recursive)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6354)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6355)==0&false))) {{
                    __CLR4_5_24ut4utlvickp6t.R.inc(6356);processFile(file);
                } }else {{
                    __CLR4_5_24ut4utlvickp6t.R.inc(6357);if ((((file.getName().endsWith(".obo"))&&(__CLR4_5_24ut4utlvickp6t.R.iget(6358)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6359)==0&false))) {{
                        __CLR4_5_24ut4utlvickp6t.R.inc(6360);oboFileMap.put(file.getName(), IRI.create(file));
                    } }else {__CLR4_5_24ut4utlvickp6t.R.inc(6361);if ((((file.getName().endsWith(".ofn"))&&(__CLR4_5_24ut4utlvickp6t.R.iget(6362)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6363)==0&false))) {{
                        __CLR4_5_24ut4utlvickp6t.R.inc(6364);parseFSSFile(file);
                    } }else {__CLR4_5_24ut4utlvickp6t.R.inc(6365);if ((((file.getName().endsWith(".omn"))&&(__CLR4_5_24ut4utlvickp6t.R.iget(6366)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6367)==0&false))) {{
                        __CLR4_5_24ut4utlvickp6t.R.inc(6368);parseManchesterSyntaxFile(file);
                    } }else {{
                        __CLR4_5_24ut4utlvickp6t.R.inc(6369);for (String ext : fileExtensions) {{
                            __CLR4_5_24ut4utlvickp6t.R.inc(6370);if ((((file.getName().endsWith(ext))&&(__CLR4_5_24ut4utlvickp6t.R.iget(6371)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6372)==0&false))) {{
                                __CLR4_5_24ut4utlvickp6t.R.inc(6373);parseFile(file);
                                __CLR4_5_24ut4utlvickp6t.R.inc(6374);break;
                            }
                        }}
                    }}
                }}}}
            }}
        }}
    }}finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    static final Pattern pattern = Pattern.compile("Ontology\\(<([^>]+)>");

    /**
     * Search first 100 lines for FSS style Ontology(&lt;IRI&gt; ...
     * 
     * @param file
     *        the file to parse
     */
    private void parseFSSFile(@Nonnull File file) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6375);
        __CLR4_5_24ut4utlvickp6t.R.inc(6376);BufferedReader br = null;
        __CLR4_5_24ut4utlvickp6t.R.inc(6377);try {
            __CLR4_5_24ut4utlvickp6t.R.inc(6378);br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            __CLR4_5_24ut4utlvickp6t.R.inc(6379);String line = "";
            __CLR4_5_24ut4utlvickp6t.R.inc(6380);IRI ontologyIRI = null;
            __CLR4_5_24ut4utlvickp6t.R.inc(6381);Matcher m = pattern.matcher(line);
            __CLR4_5_24ut4utlvickp6t.R.inc(6382);int n = 0;
            __CLR4_5_24ut4utlvickp6t.R.inc(6383);while ((line = br.readLine()) != null && n++ < 100) {{
                __CLR4_5_24ut4utlvickp6t.R.inc(6386);m.reset(line);
                __CLR4_5_24ut4utlvickp6t.R.inc(6387);if ((((m.matches())&&(__CLR4_5_24ut4utlvickp6t.R.iget(6388)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6389)==0&false))) {{
                    __CLR4_5_24ut4utlvickp6t.R.inc(6390);ontologyIRI = IRI.create(m.group(1));
                    __CLR4_5_24ut4utlvickp6t.R.inc(6391);addMapping(ontologyIRI, file);
                    __CLR4_5_24ut4utlvickp6t.R.inc(6392);break;
                }
            }}
        }} catch (IOException e) {
            // if we can't parse a file, then we can't map it
        } finally {
            __CLR4_5_24ut4utlvickp6t.R.inc(6393);Closeables.closeQuietly(br);
        }
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    private void parseFile(File file) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6394);
        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_24ut4utlvickp6t.R.inc(6395);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_24ut4utlvickp6t.R.inc(6396);}};FileInputStream in = new FileInputStream(file);
            __CLR4_5_2$AC0 __CLR$ACI1=new __CLR4_5_2$AC0(){{__CLR4_5_24ut4utlvickp6t.R.inc(6397);}};BufferedInputStream delegate = new BufferedInputStream(in);
            __CLR4_5_2$AC0 __CLR$ACI2=new __CLR4_5_2$AC0(){{__CLR4_5_24ut4utlvickp6t.R.inc(6398);}};InputStream is = OWLOntologyDocumentSourceBase.wrap(delegate);) {
            __CLR4_5_24ut4utlvickp6t.R.inc(6399);currentFile = file;
            __CLR4_5_24ut4utlvickp6t.R.inc(6400);SAXParsers.initParserWithOWLAPIStandards(null).parse(is, this);
        } catch (Exception e) {
            // if we can't parse a file, then we can't map it
        }
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    private void parseManchesterSyntaxFile(@Nonnull File file) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6401);
        __CLR4_5_24ut4utlvickp6t.R.inc(6402);BufferedReader br = null;
        __CLR4_5_24ut4utlvickp6t.R.inc(6403);try {
            // Ontology: <URI>
            __CLR4_5_24ut4utlvickp6t.R.inc(6404);br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            __CLR4_5_24ut4utlvickp6t.R.inc(6405);String line = br.readLine();
            __CLR4_5_24ut4utlvickp6t.R.inc(6406);IRI ontologyIRI = null;
            __CLR4_5_24ut4utlvickp6t.R.inc(6407);while ((((line != null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6408)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6409)==0&false))) {{
                __CLR4_5_24ut4utlvickp6t.R.inc(6410);StringTokenizer tokenizer = new StringTokenizer(line, " \r\n", false);
                __CLR4_5_24ut4utlvickp6t.R.inc(6411);line = br.readLine();
                __CLR4_5_24ut4utlvickp6t.R.inc(6412);while ((((tokenizer.hasMoreTokens())&&(__CLR4_5_24ut4utlvickp6t.R.iget(6413)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6414)==0&false))) {{
                    __CLR4_5_24ut4utlvickp6t.R.inc(6415);String tok = tokenizer.nextToken();
                    __CLR4_5_24ut4utlvickp6t.R.inc(6416);if ((((tok.startsWith("<") && tok.endsWith(">"))&&(__CLR4_5_24ut4utlvickp6t.R.iget(6417)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6418)==0&false))) {{
                        __CLR4_5_24ut4utlvickp6t.R.inc(6419);ontologyIRI = unquote(tok);
                        __CLR4_5_24ut4utlvickp6t.R.inc(6420);addMapping(ontologyIRI, file);
                        __CLR4_5_24ut4utlvickp6t.R.inc(6421);break;
                    }
                }}
                }__CLR4_5_24ut4utlvickp6t.R.inc(6422);if ((((ontologyIRI != null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6423)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6424)==0&false))) {{
                    __CLR4_5_24ut4utlvickp6t.R.inc(6425);break;
                }
            }}
        }} catch (IOException e) {
            // if we can't parse a file, then we can't map it
        } finally {
            __CLR4_5_24ut4utlvickp6t.R.inc(6426);try {
                __CLR4_5_24ut4utlvickp6t.R.inc(6427);if ((((br != null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6428)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6429)==0&false))) {{
                    __CLR4_5_24ut4utlvickp6t.R.inc(6430);br.close();
                }
            }} catch (IOException e2) {
                // not to do here
            }
        }
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    /**
     * @param tok
     *        token
     * @return IRI without quotes (&lt; and &gt;)
     */
    @Nonnull
    static IRI unquote(String tok) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6431);
        __CLR4_5_24ut4utlvickp6t.R.inc(6432);return IRI.create(tok.substring(1, tok.length() - 1));
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {try{__CLR4_5_24ut4utlvickp6t.R.inc(6433);
        __CLR4_5_24ut4utlvickp6t.R.inc(6434);OntologyRootElementHandler handler = handlerMap.get(uri + localName);
        __CLR4_5_24ut4utlvickp6t.R.inc(6435);if ((((handler != null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6436)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6437)==0&false))) {{
            __CLR4_5_24ut4utlvickp6t.R.inc(6438);IRI ontologyIRI = handler.handle(attributes);
            __CLR4_5_24ut4utlvickp6t.R.inc(6439);if ((((ontologyIRI != null && currentFile != null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6440)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6441)==0&false))) {{
                __CLR4_5_24ut4utlvickp6t.R.inc(6442);addMapping(ontologyIRI, verifyNotNull(currentFile));
            }
            }__CLR4_5_24ut4utlvickp6t.R.inc(6443);throw new SAXException();
        }
    }}finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    /**
     * @param ontologyIRI
     *        ontology
     * @param file
     *        file
     */
    protected void addMapping(@Nonnull IRI ontologyIRI, @Nonnull File file) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6444);
        __CLR4_5_24ut4utlvickp6t.R.inc(6445);ontologyIRI2PhysicalURIMap.put(ontologyIRI, IRI.create(file));
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_24ut4utlvickp6t.R.inc(6446);
        __CLR4_5_24ut4utlvickp6t.R.inc(6447);StringBuilder sb = new StringBuilder();
        __CLR4_5_24ut4utlvickp6t.R.inc(6448);sb.append("AutoURIMapper: (");
        __CLR4_5_24ut4utlvickp6t.R.inc(6449);sb.append(ontologyIRI2PhysicalURIMap.size());
        __CLR4_5_24ut4utlvickp6t.R.inc(6450);sb.append(" ontologies)\n");
        __CLR4_5_24ut4utlvickp6t.R.inc(6451);for (IRI iri : ontologyIRI2PhysicalURIMap.keySet()) {{
            __CLR4_5_24ut4utlvickp6t.R.inc(6452);sb.append("    ");
            __CLR4_5_24ut4utlvickp6t.R.inc(6453);sb.append(iri.toQuotedString());
            __CLR4_5_24ut4utlvickp6t.R.inc(6454);sb.append(" -> ");
            __CLR4_5_24ut4utlvickp6t.R.inc(6455);sb.append(ontologyIRI2PhysicalURIMap.get(iri));
            __CLR4_5_24ut4utlvickp6t.R.inc(6456);sb.append('\n');
        }
        }__CLR4_5_24ut4utlvickp6t.R.inc(6457);return sb.toString();
    }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

    /**
     * A simple interface which extracts an ontology IRI from a set of element
     * attributes.
     */
    private interface OntologyRootElementHandler extends Serializable {

        /**
         * Gets the ontology IRI.
         * 
         * @param attributes
         *        The attributes which will be examined for the ontology IRI.
         * @return The ontology IRI or {@code null} if no ontology IRI could be
         *         found.
         */
        IRI handle(Attributes attributes);
    }

    /**
     * A handler to handle RDF/XML files. The xml:base (if present) is taken to
     * be the ontology URI of the ontology document being parsed.
     */
    private static class RDFXMLOntologyRootElementHandler implements OntologyRootElementHandler, Serializable {

        private static final long serialVersionUID = 40000L;

        RDFXMLOntologyRootElementHandler() {try{__CLR4_5_24ut4utlvickp6t.R.inc(6458);}finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

        @Nullable
        @Override
        public IRI handle(Attributes attributes) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6459);
            __CLR4_5_24ut4utlvickp6t.R.inc(6460);String baseValue = attributes.getValue(Namespaces.XML.toString(), "base");
            __CLR4_5_24ut4utlvickp6t.R.inc(6461);if ((((baseValue == null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6462)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6463)==0&false))) {{
                __CLR4_5_24ut4utlvickp6t.R.inc(6464);return null;
            }
            }__CLR4_5_24ut4utlvickp6t.R.inc(6465);return IRI.create(baseValue);
        }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}
    }

    /** A handler that can handle OWL/XML files. */
    private static class OWLXMLOntologyRootElementHandler implements OntologyRootElementHandler, Serializable {

        private static final long serialVersionUID = 40000L;

        OWLXMLOntologyRootElementHandler() {try{__CLR4_5_24ut4utlvickp6t.R.inc(6466);}finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}

        @Override
        public IRI handle(Attributes attributes) {try{__CLR4_5_24ut4utlvickp6t.R.inc(6467);
            __CLR4_5_24ut4utlvickp6t.R.inc(6468);String ontURI = attributes.getValue(Namespaces.OWL.toString(), "ontologyIRI");
            __CLR4_5_24ut4utlvickp6t.R.inc(6469);if ((((ontURI == null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6470)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6471)==0&false))) {{
                __CLR4_5_24ut4utlvickp6t.R.inc(6472);ontURI = attributes.getValue("ontologyIRI");
            }
            }__CLR4_5_24ut4utlvickp6t.R.inc(6473);if ((((ontURI == null)&&(__CLR4_5_24ut4utlvickp6t.R.iget(6474)!=0|true))||(__CLR4_5_24ut4utlvickp6t.R.iget(6475)==0&false))) {{
                __CLR4_5_24ut4utlvickp6t.R.inc(6476);return null;
            }
            }__CLR4_5_24ut4utlvickp6t.R.inc(6477);return IRI.create(ontURI);
        }finally{__CLR4_5_24ut4utlvickp6t.R.flushNeeded();}}
    }
}
