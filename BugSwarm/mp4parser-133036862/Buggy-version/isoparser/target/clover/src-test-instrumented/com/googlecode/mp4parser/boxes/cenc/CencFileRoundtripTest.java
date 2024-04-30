/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.cenc;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder;
import com.googlecode.mp4parser.authoring.builder.Mp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.CencDecryptingTrackImpl;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptingTrackImpl;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.*;

/**
 * Created by sannies on 27.09.2014.
 */
public class CencFileRoundtripTest {static class __CLR4_5_2k5kk5klvlulr4x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,26210,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String baseDir = CencFileRoundtripTest.class.getProtectionDomain().getCodeSource().getLocation().getFile();
    Map<UUID, SecretKey> keys;
    HashMap<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation1;
    HashMap<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation2;
    HashMap<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation3;
    UUID uuidDefault;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26120);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26121);uuidDefault = UUID.randomUUID();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26122);UUID uuidAlt = UUID.randomUUID();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26123);SecretKey cekDefault = new SecretKeySpec(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, "AES");
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26124);SecretKey cekAlt = new SecretKeySpec(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, "AES");

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26125);keys = new HashMap<UUID, SecretKey>();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26126);keys.put(uuidDefault, cekDefault);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26127);keys.put(uuidAlt, cekAlt);

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26128);CencSampleEncryptionInformationGroupEntry cencNone = new CencSampleEncryptionInformationGroupEntry();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26129);cencNone.setEncrypted(false);

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26130);CencSampleEncryptionInformationGroupEntry cencAlt = new CencSampleEncryptionInformationGroupEntry();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26131);cencAlt.setKid(uuidAlt);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26132);cencAlt.setIvSize(8);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26133);cencAlt.setEncrypted(true);

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26134);CencSampleEncryptionInformationGroupEntry cencDefault = new CencSampleEncryptionInformationGroupEntry();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26135);cencAlt.setKid(uuidDefault);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26136);cencAlt.setIvSize(8);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26137);cencAlt.setEncrypted(true);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26138);keyRotation1 = new HashMap<CencSampleEncryptionInformationGroupEntry, long[]>();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26139);keyRotation1.put(cencNone, new long[]{0, 1, 2, 3, 4});
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26140);keyRotation1.put(cencAlt, new long[]{10, 11, 12, 13});

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26141);keyRotation2 = new HashMap<CencSampleEncryptionInformationGroupEntry, long[]>();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26142);keyRotation2.put(cencNone, new long[]{0, 2, 4, 6, 8});

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26143);keyRotation3 = new HashMap<CencSampleEncryptionInformationGroupEntry, long[]>();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26144);keyRotation3.put(cencDefault, new long[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15});

    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testDefaultPlainFragMp4_cbc1() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28byadrk69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testDefaultPlainFragMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28byadrk69() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26145);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26146);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation3, "cbc1", null, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testDefaultPlainFragMp4_cenc() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25vzwivk6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testDefaultPlainFragMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26147,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25vzwivk6b() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26147);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26148);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation3, "cenc", null, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testDefaultPlainStdMp4_cbc1() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26kbr9mk6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testDefaultPlainStdMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26kbr9mk6d() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26149);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26150);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation3, "cbc1", null, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testDefaultPlainStdMp4_cenc() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27nmfn0k6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testDefaultPlainStdMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26151,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27nmfn0k6f() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26151);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26152);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation3, "cenc", null, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testSingleKeyMp4_cbc1() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lw9wzrk6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testSingleKeyMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lw9wzrk6h() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26153);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26154);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, null, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testSingleKeyMp4_cenc() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27obq35k6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testSingleKeyMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27obq35k6j() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26155);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26156);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, null, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testMultipleKeysStdMp4_cbc1() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2du84drk6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysStdMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2du84drk6l() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26157);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26158);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation1, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}


    @Test
    public void testMultipleKeysFragMp4_cbc1() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2krhf0qk6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26159,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2krhf0qk6n() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26159);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26160);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation1, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testMultipleKeysStdMp4_2_cbc1() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2olli9ok6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysStdMp4_2_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2olli9ok6p() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26161);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26162);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testMultipleKeysFragMp4_2_cbc1() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21i5btjk6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_2_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21i5btjk6r() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26163);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26164);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testMultipleKeysStdMp4_cenc() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dq2ivk6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysStdMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dq2ivk6t() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26165);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26166);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation1, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testMultipleKeysFragMp4_cenc() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jj844k6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jj844k6v() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26167);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26168);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation1, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testMultipleKeysStdMp4_2_cenc() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2adnbd2k6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysStdMp4_2_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2adnbd2k6x() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26169);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26170);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    @Test
    public void testMultipleKeysFragMp4_2_cenc() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cpsv33k6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_2_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26171,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cpsv33k6z() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26171);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26172);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}


    @Test
    public void testMultipleKeysFragMp4_2_cenc_pseudo_encrypted() throws IOException {__CLR4_5_2k5kk5klvlulr4x.R.globalSliceStart(getClass().getName(),26173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yd5ycxk71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2k5kk5klvlulr4x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2k5kk5klvlulr4x.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_2_cenc_pseudo_encrypted",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),26173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yd5ycxk71() throws IOException{try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26173);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26174);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cenc", uuidDefault, true);
    }finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    public void testMultipleKeys(Mp4Builder builder, String testFile, Map<UUID, SecretKey> keys,
                                 HashMap<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation,
                                 String encAlgo, UUID uuidDefault, boolean encryptButClear) throws IOException {try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26175);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26176);Movie m1 = MovieCreator.build(testFile);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26177);Movie m2 = new Movie();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26178);for (Track track : m1.getTracks()) {{

            __CLR4_5_2k5kk5klvlulr4x.R.inc(26179);CencEncryptingTrackImpl cencEncryptingTrack = new CencEncryptingTrackImpl(track, uuidDefault, keys, keyRotation, encAlgo, false, encryptButClear);
            __CLR4_5_2k5kk5klvlulr4x.R.inc(26180);m2.addTrack(cencEncryptingTrack);
        }
        }__CLR4_5_2k5kk5klvlulr4x.R.inc(26181);Container c = builder.build(m2);

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26182);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26183);c.writeContainer(Channels.newChannel(baos));
        //  new FileOutputStream("c:\\dev\\mp4parser\\m2.mp4").write(baos.toByteArray());

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26184);Movie m3 = MovieCreator.build(new MemoryDataSourceImpl(baos.toByteArray()));

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26185);Movie m4 = new Movie();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26186);for (Track track : m3.getTracks()) {{
            __CLR4_5_2k5kk5klvlulr4x.R.inc(26187);CencDecryptingTrackImpl cencDecryptingTrack =
                    new CencDecryptingTrackImpl((CencEncryptedTrack) track, keys);
            __CLR4_5_2k5kk5klvlulr4x.R.inc(26188);m4.addTrack(cencDecryptingTrack);
        }
        }__CLR4_5_2k5kk5klvlulr4x.R.inc(26189);Container c2 = builder.build(m4);

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26190);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26191);c2.writeContainer(Channels.newChannel(baos2));
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26192);Movie m5 = MovieCreator.build(new MemoryDataSourceImpl(baos2.toByteArray()));

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26193);Iterator<Track> tracksPlainIter = m1.getTracks().iterator();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26194);Iterator<Track> roundTrippedTracksIter = m5.getTracks().iterator();

        __CLR4_5_2k5kk5klvlulr4x.R.inc(26195);while ((((tracksPlainIter.hasNext() && roundTrippedTracksIter.hasNext())&&(__CLR4_5_2k5kk5klvlulr4x.R.iget(26196)!=0|true))||(__CLR4_5_2k5kk5klvlulr4x.R.iget(26197)==0&false))) {{
            __CLR4_5_2k5kk5klvlulr4x.R.inc(26198);verifySampleEquality(
                    tracksPlainIter.next().getSamples(),
                    roundTrippedTracksIter.next().getSamples());
        }

    }}finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}

    public void verifySampleEquality(List<Sample> orig, List<Sample> roundtripped) throws IOException {try{__CLR4_5_2k5kk5klvlulr4x.R.inc(26199);
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26200);Iterator<Sample> origIter = orig.iterator();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26201);Iterator<Sample> roundTrippedIter = roundtripped.iterator();
        __CLR4_5_2k5kk5klvlulr4x.R.inc(26202);while ((((origIter.hasNext() && roundTrippedIter.hasNext())&&(__CLR4_5_2k5kk5klvlulr4x.R.iget(26203)!=0|true))||(__CLR4_5_2k5kk5klvlulr4x.R.iget(26204)==0&false))) {{
            __CLR4_5_2k5kk5klvlulr4x.R.inc(26205);ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
            __CLR4_5_2k5kk5klvlulr4x.R.inc(26206);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
            __CLR4_5_2k5kk5klvlulr4x.R.inc(26207);origIter.next().writeTo(Channels.newChannel(baos1));
            __CLR4_5_2k5kk5klvlulr4x.R.inc(26208);roundTrippedIter.next().writeTo(Channels.newChannel(baos2));
            __CLR4_5_2k5kk5klvlulr4x.R.inc(26209);Assert.assertArrayEquals(baos1.toByteArray(), baos2.toByteArray());
        }

    }}finally{__CLR4_5_2k5kk5klvlulr4x.R.flushNeeded();}}
}
