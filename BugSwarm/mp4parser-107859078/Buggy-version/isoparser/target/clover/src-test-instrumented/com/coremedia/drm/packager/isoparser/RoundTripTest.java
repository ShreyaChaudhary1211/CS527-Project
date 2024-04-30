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
public class RoundTripTest extends TestCase {static class __CLR4_5_2hpqhpqlvl9em31{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,22992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String defaultTestFileDir;

    @Override
    protected void setUp() throws Exception {try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22958);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22959);super.setUp();
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22960);defaultTestFileDir = this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
/*        Logger.getLogger("").setLevel(Level.ALL);
    Handler[] handlers = Logger.getLogger("").getHandlers();
    for (Handler handler : handlers) {
      handler.setLevel(Level.ALL);
    }*/
    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}

    /*    public void testRoundDeleteMe() throws Exception {
        testRoundTrip_1("/suckerpunch-distantplanet_h1080p.mov");
    }*/
    public void testRoundTrip_TinyExamples_Old() throws Exception {__CLR4_5_2hpqhpqlvl9em31.R.globalSliceStart(getClass().getName(),22961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28qbrvahpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hpqhpqlvl9em31.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hpqhpqlvl9em31.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_TinyExamples_Old",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22961,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28qbrvahpt() throws Exception{try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22961);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22962);testRoundTrip_1(defaultTestFileDir + "/Tiny Sample - OLD.mp4");
    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}

    public void testRoundTrip_TinyExamples_Metaxed() throws Exception {__CLR4_5_2hpqhpqlvl9em31.R.globalSliceStart(getClass().getName(),22963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mz6mv5hpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hpqhpqlvl9em31.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hpqhpqlvl9em31.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_TinyExamples_Metaxed",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mz6mv5hpv() throws Exception{try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22963);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22964);testRoundTrip_1(defaultTestFileDir + "/Tiny Sample - NEW - Metaxed.mp4");
    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}

    public void testRoundTrip_TinyExamples_Untouched() throws Exception {__CLR4_5_2hpqhpqlvl9em31.R.globalSliceStart(getClass().getName(),22965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j15g0khpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hpqhpqlvl9em31.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hpqhpqlvl9em31.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_TinyExamples_Untouched",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22965,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j15g0khpx() throws Exception{try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22965);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22966);testRoundTrip_1(defaultTestFileDir + "/Tiny Sample - NEW - Untouched.mp4");
    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}


    public void testRoundTrip_1a() throws Exception {__CLR4_5_2hpqhpqlvl9em31.R.globalSliceStart(getClass().getName(),22967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ew57xxhpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hpqhpqlvl9em31.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hpqhpqlvl9em31.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1a",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ew57xxhpz() throws Exception{try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22967);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22968);testRoundTrip_1(defaultTestFileDir + "/multiTrack.3gp");
    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}

    public void testRoundTrip_1b() throws Exception {__CLR4_5_2hpqhpqlvl9em31.R.globalSliceStart(getClass().getName(),22969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i556qehq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hpqhpqlvl9em31.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hpqhpqlvl9em31.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1b",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22969,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i556qehq1() throws Exception{try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22969);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22970);testRoundTrip_1(defaultTestFileDir + "/MOV00006.3gp");
    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}

    public void testRoundTrip_1c() throws Exception {__CLR4_5_2hpqhpqlvl9em31.R.globalSliceStart(getClass().getName(),22971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2le55ivhq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hpqhpqlvl9em31.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hpqhpqlvl9em31.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1c",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22971,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2le55ivhq3() throws Exception{try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22971);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22972);testRoundTrip_1(defaultTestFileDir + "/Beethoven - Bagatelle op.119 no.11 i.m4a");
    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}

    public void testRoundTrip_1d() throws Exception {__CLR4_5_2hpqhpqlvl9em31.R.globalSliceStart(getClass().getName(),22973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2on54bchq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hpqhpqlvl9em31.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hpqhpqlvl9em31.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22973,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2on54bchq5() throws Exception{try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22973);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22974);testRoundTrip_1(defaultTestFileDir + "/test.m4p");
    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}

    public void testRoundTrip_1e() throws Exception {__CLR4_5_2hpqhpqlvl9em31.R.globalSliceStart(getClass().getName(),22975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rw533thq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2hpqhpqlvl9em31.R.rethrow($CLV_t2$);}finally{__CLR4_5_2hpqhpqlvl9em31.R.globalSliceEnd(getClass().getName(),"com.coremedia.drm.packager.isoparser.RoundTripTest.testRoundTrip_1e",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),22975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rw533thq7() throws Exception{try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22975);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22976);testRoundTrip_1(defaultTestFileDir + "/test-pod.m4a");
    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}


    public void testRoundTrip_1(String originalFile) throws Exception {try{__CLR4_5_2hpqhpqlvl9em31.R.inc(22977);

        __CLR4_5_2hpqhpqlvl9em31.R.inc(22978);long start1 = System.currentTimeMillis();
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22979);long start2 = System.currentTimeMillis();

        __CLR4_5_2hpqhpqlvl9em31.R.inc(22980);IsoFile isoFile = new IsoFile(originalFile);

        __CLR4_5_2hpqhpqlvl9em31.R.inc(22981);long start3 = System.currentTimeMillis();


        __CLR4_5_2hpqhpqlvl9em31.R.inc(22982);long start4 = System.currentTimeMillis();
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22983);Walk.through(isoFile);
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22984);long start5 = System.currentTimeMillis();


        __CLR4_5_2hpqhpqlvl9em31.R.inc(22985);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22986);isoFile.getBox(Channels.newChannel(baos));


        __CLR4_5_2hpqhpqlvl9em31.R.inc(22987);long start6 = System.currentTimeMillis();

     /*   System.err.println("Preparing tmp copy took: " + (start2 - start1) + "ms");
        System.err.println("Parsing took           : " + (start3 - start2) + "ms");
        System.err.println("Writing took           : " + (start6 - start3) + "ms");
        System.err.println("Walking took           : " + (start5 - start4) + "ms");*/


        __CLR4_5_2hpqhpqlvl9em31.R.inc(22988);IsoFile copyViaIsoFileReparsed = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22989);BoxComparator.check(isoFile, copyViaIsoFileReparsed, "/moov[0]/mvhd[0]", "/moov[0]/trak[0]/tkhd[0]", "/moov[0]/trak[0]/mdia[0]/mdhd[0]");
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22990);isoFile.close();
        __CLR4_5_2hpqhpqlvl9em31.R.inc(22991);copyViaIsoFileReparsed.close();
        // as windows cannot delete file when something is memory mapped and the garbage collector
        // doesn't necessarily free the Buffers quickly enough we cannot delete the file here (we could but only for linux)


    }finally{__CLR4_5_2hpqhpqlvl9em31.R.flushNeeded();}}


}
