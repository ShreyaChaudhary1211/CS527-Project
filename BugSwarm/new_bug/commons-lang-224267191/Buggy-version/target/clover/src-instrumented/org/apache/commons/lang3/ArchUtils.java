/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import org.apache.commons.lang3.arch.Processor;

import java.util.HashMap;
import java.util.Map;

/**
 * An utility class for the os.arch System Property. The class defines methods for
 * identifying the architecture of the current JVM.
 * <p>
 * Important: The os.arch System Property returns the architecture used by the JVM
 * not of the operating system.
 * </p>
 * @since 3.6
 */
public class ArchUtils {public static class __CLR4_5_25u5ulvha77iw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,252,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Map<String, Processor> ARCH_TO_PROCESSOR;

    static {try{__CLR4_5_25u5ulvha77iw.R.inc(210);
        __CLR4_5_25u5ulvha77iw.R.inc(211);ARCH_TO_PROCESSOR = new HashMap<>();
        __CLR4_5_25u5ulvha77iw.R.inc(212);init();
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    private static final void init() {try{__CLR4_5_25u5ulvha77iw.R.inc(213);
        __CLR4_5_25u5ulvha77iw.R.inc(214);init_X86_32Bit();
        __CLR4_5_25u5ulvha77iw.R.inc(215);init_X86_64Bit();
        __CLR4_5_25u5ulvha77iw.R.inc(216);init_IA64_32Bit();
        __CLR4_5_25u5ulvha77iw.R.inc(217);init_IA64_64Bit();
        __CLR4_5_25u5ulvha77iw.R.inc(218);init_PPC_32Bit();
        __CLR4_5_25u5ulvha77iw.R.inc(219);init_PPC_64Bit();
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    private static final void init_X86_32Bit() {try{__CLR4_5_25u5ulvha77iw.R.inc(220);
        __CLR4_5_25u5ulvha77iw.R.inc(221);Processor processor = new Processor(Processor.Arch.BIT_32, Processor.Type.X86);
        __CLR4_5_25u5ulvha77iw.R.inc(222);addProcessors(processor, "x86", "i386", "i486", "i586", "i686", "pentium");
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    private static final void init_X86_64Bit() {try{__CLR4_5_25u5ulvha77iw.R.inc(223);
        __CLR4_5_25u5ulvha77iw.R.inc(224);Processor processor = new Processor(Processor.Arch.BIT_64, Processor.Type.X86);
        __CLR4_5_25u5ulvha77iw.R.inc(225);addProcessors(processor, "x86_64", "amd64", "em64t", "universal");
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    private static final void init_IA64_32Bit() {try{__CLR4_5_25u5ulvha77iw.R.inc(226);
        __CLR4_5_25u5ulvha77iw.R.inc(227);Processor processor = new Processor(Processor.Arch.BIT_32, Processor.Type.IA_64);
        __CLR4_5_25u5ulvha77iw.R.inc(228);addProcessors(processor, "ia64_32", "ia64n");
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    private static final void init_IA64_64Bit() {try{__CLR4_5_25u5ulvha77iw.R.inc(229);
        __CLR4_5_25u5ulvha77iw.R.inc(230);Processor processor = new Processor(Processor.Arch.BIT_64, Processor.Type.IA_64);
        __CLR4_5_25u5ulvha77iw.R.inc(231);addProcessors(processor, "ia64", "ia64w");
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    private static final void init_PPC_32Bit() {try{__CLR4_5_25u5ulvha77iw.R.inc(232);
        __CLR4_5_25u5ulvha77iw.R.inc(233);Processor processor = new Processor(Processor.Arch.BIT_32, Processor.Type.PPC);
        __CLR4_5_25u5ulvha77iw.R.inc(234);addProcessors(processor, "ppc", "power", "powerpc", "power_pc", "power_rs");
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    private static final void init_PPC_64Bit() {try{__CLR4_5_25u5ulvha77iw.R.inc(235);
        __CLR4_5_25u5ulvha77iw.R.inc(236);Processor processor = new Processor(Processor.Arch.BIT_64, Processor.Type.PPC);
        __CLR4_5_25u5ulvha77iw.R.inc(237);addProcessors(processor, "ppc64", "power64", "powerpc64", "power_pc64", "power_rs64");
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    /**
     * Adds the given {@link Processor} with the given key {@link String} to the map.
     *
     * @param key The key as {@link String}.
     * @param processor The {@link Processor} to add.
     * @throws IllegalStateException If the key already exists.
     */
    private static final void addProcessor(String key, Processor processor) throws IllegalStateException {try{__CLR4_5_25u5ulvha77iw.R.inc(238);
        __CLR4_5_25u5ulvha77iw.R.inc(239);if ((((!ARCH_TO_PROCESSOR.containsKey(key))&&(__CLR4_5_25u5ulvha77iw.R.iget(240)!=0|true))||(__CLR4_5_25u5ulvha77iw.R.iget(241)==0&false))) {{
            __CLR4_5_25u5ulvha77iw.R.inc(242);ARCH_TO_PROCESSOR.put(key, processor);
        } }else {{
            __CLR4_5_25u5ulvha77iw.R.inc(243);String msg = "Key " + key + " already exists in processor map";
            __CLR4_5_25u5ulvha77iw.R.inc(244);throw new IllegalStateException(msg);
        }
    }}finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    /**
     * Adds the given {@link Processor} with the given keys to the map.
     *
     * @param keys The keys.
     * @param processor The {@link Processor} to add.
     * @throws IllegalStateException If the key already exists.
     */
    private static final void addProcessors(Processor processor, String... keys) throws IllegalStateException {try{__CLR4_5_25u5ulvha77iw.R.inc(245);
        __CLR4_5_25u5ulvha77iw.R.inc(246);for (String key : keys) {{
            __CLR4_5_25u5ulvha77iw.R.inc(247);addProcessor(key, processor);
        }
    }}finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    /**
     * Returns a {@link Processor} object of the current JVM.
     *
     * <p>
     * Important: The os.arch System Property returns the architecture used by the JVM
     * not of the operating system.
     * </p>
     *
     * @return A {@link Processor} when supported, else <code>null</code>.
     */
    public static final Processor getProcessor() {try{__CLR4_5_25u5ulvha77iw.R.inc(248);
        __CLR4_5_25u5ulvha77iw.R.inc(249);return getProcessor(SystemUtils.OS_ARCH);
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

    /**
     * Returns a {@link Processor} object the given value {@link String}. The {@link String} must be
     * like a value returned by the os.arch System Property.
     *
     * @param value A {@link String} like a value returned by the os.arch System Property.
     * @return A {@link Processor} when it exists, else <code>null</code>.
     */
    public static final Processor getProcessor(String value) {try{__CLR4_5_25u5ulvha77iw.R.inc(250);
        __CLR4_5_25u5ulvha77iw.R.inc(251);return ARCH_TO_PROCESSOR.get(value);
    }finally{__CLR4_5_25u5ulvha77iw.R.flushNeeded();}}

}
