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
package org.semanticweb.owlapi.manchestersyntax.renderer;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.OWLRendererException;
import org.semanticweb.owlapi.io.OWLRendererIOException;
import org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax;
import org.semanticweb.owlapi.model.OWLRuntimeException;
import org.semanticweb.owlapi.util.ShortFormProvider;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class AbstractRenderer {public static class __CLR4_5_2jykjyklvicmbtr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,25941,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ShortFormProvider shortFormProvider;
    private int lastNewLinePos = -1;
    private int currentPos;
    private final Writer writer;
    private final List<Integer> tabs = new ArrayList<>();
    private boolean useTabbing = true;
    private boolean useWrapping = true;

    /**
     * @param writer
     *        writer
     * @param shortFormProvider
     *        shortFormProvider
     */
    protected AbstractRenderer(Writer writer,
            ShortFormProvider shortFormProvider) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25868);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25869);this.writer = writer;
        __CLR4_5_2jykjyklvicmbtr.R.inc(25870);this.shortFormProvider = shortFormProvider;
        __CLR4_5_2jykjyklvicmbtr.R.inc(25871);pushTab(0);
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    /**
     * @param useTabbing
     *        useTabbing
     */
    protected void setUseTabbing(boolean useTabbing) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25872);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25873);this.useTabbing = useTabbing;
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    /**
     * @param useWrapping
     *        useWrapping
     */
    protected void setUseWrapping(boolean useWrapping) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25874);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25875);this.useWrapping = useWrapping;
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    /** @return true if use wrapping */
    protected boolean isUseWrapping() {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25876);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25877);return useWrapping;
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    /** @return true if use tabbing */
    protected boolean isUseTabbing() {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25878);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25879);return useTabbing;
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    /**
     * Flush.
     * 
     * @throws OWLRendererException
     *         renderer error
     */
    protected void flush() throws OWLRendererException {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25880);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25881);try {
            __CLR4_5_2jykjyklvicmbtr.R.inc(25882);writer.flush();
        } catch (IOException e) {
            __CLR4_5_2jykjyklvicmbtr.R.inc(25883);throw new OWLRendererIOException(e);
        }
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void pushTab(int size) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25884);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25885);tabs.add(0, size);
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void incrementTab(int increment) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25886);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25887);int base = 0;
        __CLR4_5_2jykjyklvicmbtr.R.inc(25888);if ((((!tabs.isEmpty())&&(__CLR4_5_2jykjyklvicmbtr.R.iget(25889)!=0|true))||(__CLR4_5_2jykjyklvicmbtr.R.iget(25890)==0&false))) {{
            __CLR4_5_2jykjyklvicmbtr.R.inc(25891);base = tabs.get(0);
        }
        }__CLR4_5_2jykjyklvicmbtr.R.inc(25892);tabs.add(0, base + increment);
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void popTab() {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25893);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25894);tabs.remove(0);
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void writeTab() {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25895);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25896);int tab = tabs.get(0);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25897);for (int i = 0; (((i < tab)&&(__CLR4_5_2jykjyklvicmbtr.R.iget(25898)!=0|true))||(__CLR4_5_2jykjyklvicmbtr.R.iget(25899)==0&false)); i++) {{
            __CLR4_5_2jykjyklvicmbtr.R.inc(25900);write(" ");
        }
    }}finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected int getIndent() {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25901);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25902);return currentPos - lastNewLinePos - 2;
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void write(@Nullable String s) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25903);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25904);if ((((s == null)&&(__CLR4_5_2jykjyklvicmbtr.R.iget(25905)!=0|true))||(__CLR4_5_2jykjyklvicmbtr.R.iget(25906)==0&false))) {{
            __CLR4_5_2jykjyklvicmbtr.R.inc(25907);return;
        }
        }__CLR4_5_2jykjyklvicmbtr.R.inc(25908);int indexOfNewLine = s.indexOf('\n');
        __CLR4_5_2jykjyklvicmbtr.R.inc(25909);if ((((indexOfNewLine != -1)&&(__CLR4_5_2jykjyklvicmbtr.R.iget(25910)!=0|true))||(__CLR4_5_2jykjyklvicmbtr.R.iget(25911)==0&false))) {{
            __CLR4_5_2jykjyklvicmbtr.R.inc(25912);lastNewLinePos = currentPos + indexOfNewLine;
        }
        }__CLR4_5_2jykjyklvicmbtr.R.inc(25913);currentPos += s.length();
        __CLR4_5_2jykjyklvicmbtr.R.inc(25914);try {
            __CLR4_5_2jykjyklvicmbtr.R.inc(25915);writer.write(s);
        } catch (IOException e) {
            __CLR4_5_2jykjyklvicmbtr.R.inc(25916);throw new OWLRuntimeException(e);
        }
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void write(char ch) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25917);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25918);write(Character.toString(ch));
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void writeSpace() {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25919);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25920);write(" ");
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void write(@Nonnull ManchesterOWLSyntax keyword) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25921);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25922);write(" ", keyword, " ");
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void writeFrameKeyword(@Nonnull ManchesterOWLSyntax keyword) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25923);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25924);write("", keyword, ": ");
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void writeSectionKeyword(@Nonnull ManchesterOWLSyntax keyword) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25925);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25926);write(" ", keyword, ": ");
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void writeNewLine() {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25927);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25928);write("\n");
        __CLR4_5_2jykjyklvicmbtr.R.inc(25929);if ((((useTabbing)&&(__CLR4_5_2jykjyklvicmbtr.R.iget(25930)!=0|true))||(__CLR4_5_2jykjyklvicmbtr.R.iget(25931)==0&false))) {{
            __CLR4_5_2jykjyklvicmbtr.R.inc(25932);writeTab();
        }
    }}finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void write(String prefix, @Nonnull ManchesterOWLSyntax keyword,
            String suffix) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25933);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25934);write(prefix);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25935);write(keyword.toString());
        __CLR4_5_2jykjyklvicmbtr.R.inc(25936);write(suffix);
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected ShortFormProvider getShortFormProvider() {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25937);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25938);return shortFormProvider;
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}

    protected void setShortFormProvider(ShortFormProvider p) {try{__CLR4_5_2jykjyklvicmbtr.R.inc(25939);
        __CLR4_5_2jykjyklvicmbtr.R.inc(25940);shortFormProvider = p;
    }finally{__CLR4_5_2jykjyklvicmbtr.R.flushNeeded();}}
}
