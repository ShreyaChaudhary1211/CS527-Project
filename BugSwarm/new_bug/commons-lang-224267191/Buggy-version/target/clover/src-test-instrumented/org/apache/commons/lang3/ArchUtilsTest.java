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
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Test class for {@link ArchUtils}.
 *
 * @author Tomschi
 */
public class ArchUtilsTest {static class __CLR4_5_2ihjihjlvha7e29{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,24041,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String X86 = "x86";
    private static final String X86_64 = "x86_64";
    private static final String IA64 = "ia64";
    private static final String IA64_32 = "ia64_32";
    private static final String PPC = "ppc";
    private static final String PPC64 = "ppc64";

    @Test
    public void testIs32BitJVM() {__CLR4_5_2ihjihjlvha7e29.R.globalSliceStart(getClass().getName(),23959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ebiul2ihj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ihjihjlvha7e29.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ihjihjlvha7e29.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArchUtilsTest.testIs32BitJVM",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23959,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ebiul2ihj(){try{__CLR4_5_2ihjihjlvha7e29.R.inc(23959);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23960);Processor processor = ArchUtils.getProcessor(X86);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23961);assertEqualsArchNotNull(Processor.Arch.BIT_32, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23962);assertTrue(processor.is32Bit());

        __CLR4_5_2ihjihjlvha7e29.R.inc(23963);processor = ArchUtils.getProcessor(IA64_32);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23964);assertEqualsArchNotNull(Processor.Arch.BIT_32, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23965);assertTrue(processor.is32Bit());

        __CLR4_5_2ihjihjlvha7e29.R.inc(23966);processor = ArchUtils.getProcessor(PPC);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23967);assertEqualsArchNotNull(Processor.Arch.BIT_32, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23968);processor.is32Bit();

        __CLR4_5_2ihjihjlvha7e29.R.inc(23969);processor = ArchUtils.getProcessor(X86_64);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23970);assertNotEqualsArchNotNull(Processor.Arch.BIT_32, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23971);assertFalse(processor.is32Bit());

        __CLR4_5_2ihjihjlvha7e29.R.inc(23972);processor = ArchUtils.getProcessor(PPC64);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23973);assertNotEqualsArchNotNull(Processor.Arch.BIT_32, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23974);assertFalse(processor.is32Bit());

        __CLR4_5_2ihjihjlvha7e29.R.inc(23975);processor = ArchUtils.getProcessor(IA64);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23976);assertNotEqualsArchNotNull(Processor.Arch.BIT_32, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23977);assertFalse(processor.is32Bit());
    }finally{__CLR4_5_2ihjihjlvha7e29.R.flushNeeded();}}

    @Test
    public void testIs64BitJVM() {__CLR4_5_2ihjihjlvha7e29.R.globalSliceStart(getClass().getName(),23978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z3dklxii2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ihjihjlvha7e29.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ihjihjlvha7e29.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArchUtilsTest.testIs64BitJVM",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z3dklxii2(){try{__CLR4_5_2ihjihjlvha7e29.R.inc(23978);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23979);Processor processor = ArchUtils.getProcessor(X86_64);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23980);assertEqualsArchNotNull(Processor.Arch.BIT_64, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23981);assertTrue(processor.is64Bit());

        __CLR4_5_2ihjihjlvha7e29.R.inc(23982);processor = ArchUtils.getProcessor(PPC64);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23983);assertEqualsArchNotNull(Processor.Arch.BIT_64, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23984);assertTrue(processor.is64Bit());

        __CLR4_5_2ihjihjlvha7e29.R.inc(23985);processor = ArchUtils.getProcessor(IA64);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23986);assertEqualsArchNotNull(Processor.Arch.BIT_64, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23987);assertTrue(processor.is64Bit());

        __CLR4_5_2ihjihjlvha7e29.R.inc(23988);processor = ArchUtils.getProcessor(X86);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23989);assertNotEqualsArchNotNull(Processor.Arch.BIT_64, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23990);assertFalse(processor.is64Bit());

        __CLR4_5_2ihjihjlvha7e29.R.inc(23991);processor = ArchUtils.getProcessor(PPC);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23992);assertNotEqualsArchNotNull(Processor.Arch.BIT_64, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23993);assertFalse(processor.is64Bit());

        __CLR4_5_2ihjihjlvha7e29.R.inc(23994);processor = ArchUtils.getProcessor(IA64_32);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23995);assertNotEqualsArchNotNull(Processor.Arch.BIT_64, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23996);assertFalse(processor.is64Bit());
    }finally{__CLR4_5_2ihjihjlvha7e29.R.flushNeeded();}}

    @Test
    public void testArch() {__CLR4_5_2ihjihjlvha7e29.R.globalSliceStart(getClass().getName(),23997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28yex5biil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ihjihjlvha7e29.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ihjihjlvha7e29.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArchUtilsTest.testArch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28yex5biil(){try{__CLR4_5_2ihjihjlvha7e29.R.inc(23997);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23998);Processor processor = ArchUtils.getProcessor(X86);
        __CLR4_5_2ihjihjlvha7e29.R.inc(23999);assertEqualsTypeNotNull(Processor.Type.X86, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24000);assertTrue(processor.isX86());
        __CLR4_5_2ihjihjlvha7e29.R.inc(24001);assertNotEqualsTypeNotNull(Processor.Type.PPC, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24002);assertFalse(processor.isPPC());

        __CLR4_5_2ihjihjlvha7e29.R.inc(24003);processor = ArchUtils.getProcessor(X86_64);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24004);assertEqualsTypeNotNull(Processor.Type.X86, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24005);assertTrue(processor.isX86());

        __CLR4_5_2ihjihjlvha7e29.R.inc(24006);processor = ArchUtils.getProcessor(IA64_32);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24007);assertEqualsTypeNotNull(Processor.Type.IA_64, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24008);assertTrue(processor.isIA64());

        __CLR4_5_2ihjihjlvha7e29.R.inc(24009);processor = ArchUtils.getProcessor(IA64);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24010);assertEqualsTypeNotNull(Processor.Type.IA_64, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24011);assertTrue(processor.isIA64());
        __CLR4_5_2ihjihjlvha7e29.R.inc(24012);assertNotEqualsTypeNotNull(Processor.Type.X86, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24013);assertFalse(processor.isX86());

        __CLR4_5_2ihjihjlvha7e29.R.inc(24014);processor = ArchUtils.getProcessor(PPC);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24015);assertEqualsTypeNotNull(Processor.Type.PPC, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24016);assertTrue(processor.isPPC());
        __CLR4_5_2ihjihjlvha7e29.R.inc(24017);assertNotEqualsTypeNotNull(Processor.Type.IA_64, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24018);assertFalse(processor.isIA64());

        __CLR4_5_2ihjihjlvha7e29.R.inc(24019);processor = ArchUtils.getProcessor(PPC64);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24020);assertEqualsTypeNotNull(Processor.Type.PPC, processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24021);assertTrue(processor.isPPC());
    }finally{__CLR4_5_2ihjihjlvha7e29.R.flushNeeded();}}

    @Test
    public void testGetProcessor() {__CLR4_5_2ihjihjlvha7e29.R.globalSliceStart(getClass().getName(),24022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vtpn1nija();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ihjihjlvha7e29.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ihjihjlvha7e29.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArchUtilsTest.testGetProcessor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vtpn1nija(){try{__CLR4_5_2ihjihjlvha7e29.R.inc(24022);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24023);assertNotNull(ArchUtils.getProcessor(X86));
        __CLR4_5_2ihjihjlvha7e29.R.inc(24024);assertNull(ArchUtils.getProcessor("NA"));
    }finally{__CLR4_5_2ihjihjlvha7e29.R.flushNeeded();}}

    private void assertEqualsArchNotNull(Processor.Arch arch, Processor processor) {try{__CLR4_5_2ihjihjlvha7e29.R.inc(24025);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24026);assertNotNull(arch);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24027);assertNotNull(processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24028);assertEquals(arch, processor.getArch());
    }finally{__CLR4_5_2ihjihjlvha7e29.R.flushNeeded();}}

    private void assertNotEqualsArchNotNull(Processor.Arch arch, Processor processor) {try{__CLR4_5_2ihjihjlvha7e29.R.inc(24029);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24030);assertNotNull(arch);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24031);assertNotNull(processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24032);assertNotEquals(arch, processor.getArch());
    }finally{__CLR4_5_2ihjihjlvha7e29.R.flushNeeded();}}

    private void assertEqualsTypeNotNull(Processor.Type type, Processor processor) {try{__CLR4_5_2ihjihjlvha7e29.R.inc(24033);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24034);assertNotNull(type);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24035);assertNotNull(processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24036);assertEquals(type, processor.getType());
    }finally{__CLR4_5_2ihjihjlvha7e29.R.flushNeeded();}}

    private void assertNotEqualsTypeNotNull(Processor.Type type, Processor processor) {try{__CLR4_5_2ihjihjlvha7e29.R.inc(24037);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24038);assertNotNull(type);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24039);assertNotNull(processor);
        __CLR4_5_2ihjihjlvha7e29.R.inc(24040);assertNotEquals(type, processor.getType());
    }finally{__CLR4_5_2ihjihjlvha7e29.R.flushNeeded();}}

}
