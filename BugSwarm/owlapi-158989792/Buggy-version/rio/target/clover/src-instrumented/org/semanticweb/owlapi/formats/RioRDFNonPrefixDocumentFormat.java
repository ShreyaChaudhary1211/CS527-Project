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
package org.semanticweb.owlapi.formats;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import javax.annotation.Nonnull;

import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFParserRegistry;
import org.semanticweb.owlapi.model.MIMETypeAware;

/**
 * This format is designed to encapsulate any Sesame Rio RDFFormat within
 * RDFOntologyFormat, and more generally OWLOntologyFormat. <br>
 * 
 * @author Peter Ansell p_ansell@yahoo.com
 * @since 4.0.0
 */
public class RioRDFNonPrefixDocumentFormat extends
        AbstractRDFNonPrefixDocumentFormat implements MIMETypeAware,
        RioRDFDocumentFormat {public static class __CLR4_5_21m1mlvicnc0u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0072\u0069\u006f\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237333555L,8589935092L,89,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    private transient RDFFormat format;
    private final String formatName;

    private void readObject(ObjectInputStream in) throws IOException,
            ClassNotFoundException {try{__CLR4_5_21m1mlvicnc0u.R.inc(58);
        __CLR4_5_21m1mlvicnc0u.R.inc(59);in.defaultReadObject();
        __CLR4_5_21m1mlvicnc0u.R.inc(60);for (RDFFormat f : RDFParserRegistry.getInstance().getKeys()) {{
            __CLR4_5_21m1mlvicnc0u.R.inc(61);if ((((f.getName().equals(formatName))&&(__CLR4_5_21m1mlvicnc0u.R.iget(62)!=0|true))||(__CLR4_5_21m1mlvicnc0u.R.iget(63)==0&false))) {{
                __CLR4_5_21m1mlvicnc0u.R.inc(64);format = f;
                __CLR4_5_21m1mlvicnc0u.R.inc(65);return;
            }
        }}
    }}finally{__CLR4_5_21m1mlvicnc0u.R.flushNeeded();}}

    /**
     * Constructor for super-classes to specify which
     * {@link org.openrdf.rio.RDFFormat} they support.
     *
     * @param format
     *        The {@link org.openrdf.rio.RDFFormat} that this instance supports.
     */
    public RioRDFNonPrefixDocumentFormat(RDFFormat format) {try{__CLR4_5_21m1mlvicnc0u.R.inc(66);
        __CLR4_5_21m1mlvicnc0u.R.inc(67);this.format = format;
        __CLR4_5_21m1mlvicnc0u.R.inc(68);formatName = this.format.getName();
    }finally{__CLR4_5_21m1mlvicnc0u.R.flushNeeded();}}

    /**
     * Determines if this format is an instance of a format that uses prefixes
     * to shorted IRIs.
     *
     * @return {@code true} if this format is an instance of
     *         {@link org.semanticweb.owlapi.formats.PrefixDocumentFormat} other
     *         wise {@code false}.
     */
    @Override
    public boolean isPrefixOWLOntologyFormat() {try{__CLR4_5_21m1mlvicnc0u.R.inc(69);
        __CLR4_5_21m1mlvicnc0u.R.inc(70);return false;
    }finally{__CLR4_5_21m1mlvicnc0u.R.flushNeeded();}}

    /**
     * If this format is an instance of
     * {@link org.semanticweb.owlapi.formats.PrefixDocumentFormat} then this
     * method will obtain it as a
     * {@link org.semanticweb.owlapi.formats.PrefixDocumentFormat}.
     *
     * @return This format as a more specific
     *         {@link org.semanticweb.owlapi.formats.PrefixDocumentFormat}.
     * @throws ClassCastException
     *         if this format is not an instance of
     *         {@link org.semanticweb.owlapi.formats.PrefixDocumentFormat}
     */
    @Nonnull
    @Override
    public PrefixDocumentFormat asPrefixOWLOntologyFormat() {try{__CLR4_5_21m1mlvicnc0u.R.inc(71);
        __CLR4_5_21m1mlvicnc0u.R.inc(72);throw new ClassCastException("Not a Prefix Document Format");
    }finally{__CLR4_5_21m1mlvicnc0u.R.flushNeeded();}}

    @Override
    public String getKey() {try{__CLR4_5_21m1mlvicnc0u.R.inc(73);
        __CLR4_5_21m1mlvicnc0u.R.inc(74);String name = format.getName();
        assert (((name != null)&&(__CLR4_5_21m1mlvicnc0u.R.iget(75)!=0|true))||(__CLR4_5_21m1mlvicnc0u.R.iget(76)==0&false));
        __CLR4_5_21m1mlvicnc0u.R.inc(77);return name;
    }finally{__CLR4_5_21m1mlvicnc0u.R.flushNeeded();}}

    @Override
    public RDFFormat getRioFormat() {try{__CLR4_5_21m1mlvicnc0u.R.inc(78);
        __CLR4_5_21m1mlvicnc0u.R.inc(79);return format;
    }finally{__CLR4_5_21m1mlvicnc0u.R.flushNeeded();}}

    @Override
    public String getDefaultMIMEType() {try{__CLR4_5_21m1mlvicnc0u.R.inc(80);
        __CLR4_5_21m1mlvicnc0u.R.inc(81);return format.getDefaultMIMEType();
    }finally{__CLR4_5_21m1mlvicnc0u.R.flushNeeded();}}

    @Override
    public List<String> getMIMETypes() {try{__CLR4_5_21m1mlvicnc0u.R.inc(82);
        __CLR4_5_21m1mlvicnc0u.R.inc(83);List<String> mimeTypes = format.getMIMETypes();
        assert (((mimeTypes != null)&&(__CLR4_5_21m1mlvicnc0u.R.iget(84)!=0|true))||(__CLR4_5_21m1mlvicnc0u.R.iget(85)==0&false));
        __CLR4_5_21m1mlvicnc0u.R.inc(86);return mimeTypes;
    }finally{__CLR4_5_21m1mlvicnc0u.R.flushNeeded();}}

    @Override
    public boolean handlesMimeType(String mimeType) {try{__CLR4_5_21m1mlvicnc0u.R.inc(87);
        __CLR4_5_21m1mlvicnc0u.R.inc(88);return format.hasMIMEType(mimeType);
    }finally{__CLR4_5_21m1mlvicnc0u.R.flushNeeded();}}
}
