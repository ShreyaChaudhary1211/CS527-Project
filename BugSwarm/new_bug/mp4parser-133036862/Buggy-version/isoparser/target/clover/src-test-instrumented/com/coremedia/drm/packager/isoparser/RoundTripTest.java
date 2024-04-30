/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an AS IS BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.coremedia.drm.packager.isoparser;

import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.tracks.BoxComparator;
import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.nio.channels.Channels;

/**
 * Tests ISO Roundtrip.
 */
public class RoundTripTest extends TestCase {static class __CLR4_5_2hsdhsdlvlulpnz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,23087,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String defaultTestFileDir;

    @Override
    protected void setUp() throws Exception {try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23053);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23054);super.setUp();
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23055);defaultTestFileDir = this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
/*        Logger.getLogger("").setLevel(Level.ALL);
    Handler[] handlers = Logger.getLogger("").getHandlers();
    for (Handler handler : handlers) {
      handler.setLevel(Level.ALL);
    }*/
    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}

    /*    public void testRoundDeleteMe() throws Exception {
        testRoundTrip_1("/suckerpunch-distantplanet_h1080p.mov");
    }*/
    public void testRoundTrip_TinyExamples_Old() throws Exception {__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceStart(getClass().getName(),23056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28qbrvahsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdlvlulpnz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_TinyExamples_Old",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28qbrvahsg() throws Exception{try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23056);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23057);testRoundTrip_1(defaultTestFileDir + "/Tiny Sample - OLD.mp4");
    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}

    public void testRoundTrip_TinyExamples_Metaxed() throws Exception {__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceStart(getClass().getName(),23058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mz6mv5hsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdlvlulpnz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_TinyExamples_Metaxed",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23058,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mz6mv5hsi() throws Exception{try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23058);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23059);testRoundTrip_1(defaultTestFileDir + "/Tiny Sample - NEW - Metaxed.mp4");
    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}

    public void testRoundTrip_TinyExamples_Untouched() throws Exception {__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceStart(getClass().getName(),23060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j15g0khsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdlvlulpnz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_TinyExamples_Untouched",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j15g0khsk() throws Exception{try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23060);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23061);testRoundTrip_1(defaultTestFileDir + "/Tiny Sample - NEW - Untouched.mp4");
    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}


    public void testRoundTrip_1a() throws Exception {__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceStart(getClass().getName(),23062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ew57xxhsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdlvlulpnz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1a",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ew57xxhsm() throws Exception{try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23062);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23063);testRoundTrip_1(defaultTestFileDir + "/multiTrack.3gp");
    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}

    public void testRoundTrip_1b() throws Exception {__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceStart(getClass().getName(),23064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i556qehso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdlvlulpnz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1b",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i556qehso() throws Exception{try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23064);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23065);testRoundTrip_1(defaultTestFileDir + "/MOV00006.3gp");
    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}

    public void testRoundTrip_1c() throws Exception {__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceStart(getClass().getName(),23066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2le55ivhsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdlvlulpnz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1c",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2le55ivhsq() throws Exception{try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23066);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23067);testRoundTrip_1(defaultTestFileDir + "/Beethoven - Bagatelle op.119 no.11 i.m4a");
    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}

    public void testRoundTrip_1d() throws Exception {__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceStart(getClass().getName(),23068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2on54bchss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdlvlulpnz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2on54bchss() throws Exception{try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23068);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23069);testRoundTrip_1(defaultTestFileDir + "/test.m4p");
    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}

    public void testRoundTrip_1e() throws Exception {__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceStart(getClass().getName(),23070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rw533thsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hsdhsdlvlulpnz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hsdhsdlvlulpnz.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1e",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rw533thsu() throws Exception{try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23070);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23071);testRoundTrip_1(defaultTestFileDir + "/test-pod.m4a");
    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}


    public void testRoundTrip_1(String originalFile) throws Exception {try{__CLR4_5_2hsdhsdlvlulpnz.R.inc(23072);

        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23073);long start1 = System.currentTimeMillis();
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23074);long start2 = System.currentTimeMillis();

        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23075);IsoFile isoFile = new IsoFile(originalFile);

        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23076);long start3 = System.currentTimeMillis();


        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23077);long start4 = System.currentTimeMillis();
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23078);Walk.through(isoFile);
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23079);long start5 = System.currentTimeMillis();


        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23080);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23081);isoFile.getBox(Channels.newChannel(baos));


        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23082);long start6 = System.currentTimeMillis();

     /*   System.err.println("Preparing tmp copy took: " + (start2 - start1) + "ms");
        System.err.println("Parsing took           : " + (start3 - start2) + "ms");
        System.err.println("Writing took           : " + (start6 - start3) + "ms");
        System.err.println("Walking took           : " + (start5 - start4) + "ms");*/


        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23083);IsoFile copyViaIsoFileReparsed = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23084);BoxComparator.check(isoFile, copyViaIsoFileReparsed, "/moov[0]/mvhd[0]", "/moov[0]/trak[0]/tkhd[0]", "/moov[0]/trak[0]/mdia[0]/mdhd[0]");
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23085);isoFile.close();
        __CLR4_5_2hsdhsdlvlulpnz.R.inc(23086);copyViaIsoFileReparsed.close();
        // as windows cannot delete file when something is memory mapped and the garbage collector
        // doesn't necessarily free the Buffers quickly enough we cannot delete the file here (we could but only for linux)


    }finally{__CLR4_5_2hsdhsdlvlulpnz.R.flushNeeded();}}


}
