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
public class CencFileRoundtripTest {static class __CLR4_5_2jbsjbslvl9emwm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,25138,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String baseDir = CencFileRoundtripTest.class.getProtectionDomain().getCodeSource().getLocation().getFile();
    Map<UUID, SecretKey> keys;
    HashMap<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation1;
    HashMap<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation2;
    HashMap<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation3;
    UUID uuidDefault;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25048);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25049);uuidDefault = UUID.randomUUID();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25050);UUID uuidAlt = UUID.randomUUID();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25051);SecretKey cekDefault = new SecretKeySpec(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, "AES");
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25052);SecretKey cekAlt = new SecretKeySpec(new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, "AES");

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25053);keys = new HashMap<UUID, SecretKey>();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25054);keys.put(uuidDefault, cekDefault);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25055);keys.put(uuidAlt, cekAlt);

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25056);CencSampleEncryptionInformationGroupEntry cencNone = new CencSampleEncryptionInformationGroupEntry();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25057);cencNone.setEncrypted(false);

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25058);CencSampleEncryptionInformationGroupEntry cencAlt = new CencSampleEncryptionInformationGroupEntry();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25059);cencAlt.setKid(uuidAlt);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25060);cencAlt.setIvSize(8);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25061);cencAlt.setEncrypted(true);

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25062);CencSampleEncryptionInformationGroupEntry cencDefault = new CencSampleEncryptionInformationGroupEntry();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25063);cencAlt.setKid(uuidDefault);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25064);cencAlt.setIvSize(8);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25065);cencAlt.setEncrypted(true);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25066);keyRotation1 = new HashMap<CencSampleEncryptionInformationGroupEntry, long[]>();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25067);keyRotation1.put(cencNone, new long[]{0, 1, 2, 3, 4});
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25068);keyRotation1.put(cencAlt, new long[]{10, 11, 12, 13});

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25069);keyRotation2 = new HashMap<CencSampleEncryptionInformationGroupEntry, long[]>();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25070);keyRotation2.put(cencNone, new long[]{0, 2, 4, 6, 8});

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25071);keyRotation3 = new HashMap<CencSampleEncryptionInformationGroupEntry, long[]>();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25072);keyRotation3.put(cencDefault, new long[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15});

    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testDefaultPlainFragMp4_cbc1() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28byadrjch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testDefaultPlainFragMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25073,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28byadrjch() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25073);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25074);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation3, "cbc1", null, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testDefaultPlainFragMp4_cenc() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25vzwivjcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testDefaultPlainFragMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25075,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25vzwivjcj() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25075);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25076);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation3, "cenc", null, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testDefaultPlainStdMp4_cbc1() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26kbr9mjcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testDefaultPlainStdMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26kbr9mjcl() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25077);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25078);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation3, "cbc1", null, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testDefaultPlainStdMp4_cenc() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27nmfn0jcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testDefaultPlainStdMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27nmfn0jcn() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25079);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25080);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation3, "cenc", null, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testSingleKeyMp4_cbc1() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lw9wzrjcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testSingleKeyMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25081,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lw9wzrjcp() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25081);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25082);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, null, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testSingleKeyMp4_cenc() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27obq35jcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testSingleKeyMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27obq35jcr() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25083);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25084);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, null, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testMultipleKeysStdMp4_cbc1() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2du84drjct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysStdMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25085,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2du84drjct() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25085);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25086);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation1, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}


    @Test
    public void testMultipleKeysFragMp4_cbc1() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2krhf0qjcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2krhf0qjcv() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25087);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25088);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation1, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testMultipleKeysStdMp4_2_cbc1() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2olli9ojcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysStdMp4_2_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2olli9ojcx() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25089);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25090);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testMultipleKeysFragMp4_2_cbc1() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21i5btjjcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_2_cbc1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21i5btjjcz() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25091);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25092);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cbc1", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testMultipleKeysStdMp4_cenc() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dq2ivjd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysStdMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25093,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dq2ivjd1() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25093);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25094);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation1, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testMultipleKeysFragMp4_cenc() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jj844jd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25095,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jj844jd3() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25095);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25096);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation1, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testMultipleKeysStdMp4_2_cenc() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2adnbd2jd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysStdMp4_2_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25097,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2adnbd2jd5() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25097);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25098);testMultipleKeys(new DefaultMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    @Test
    public void testMultipleKeysFragMp4_2_cenc() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cpsv33jd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_2_cenc",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25099,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cpsv33jd7() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25099);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25100);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cenc", uuidDefault, false);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}


    @Test
    public void testMultipleKeysFragMp4_2_cenc_pseudo_encrypted() throws IOException {__CLR4_5_2jbsjbslvl9emwm.R.globalSliceStart(getClass().getName(),25101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yd5ycxjd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jbsjbslvl9emwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jbsjbslvl9emwm.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.cenc.CencFileRoundtripTest.testMultipleKeysFragMp4_2_cenc_pseudo_encrypted",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25101,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yd5ycxjd9() throws IOException{try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25101);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25102);testMultipleKeys(new FragmentedMp4Builder(), baseDir + "/BBB_qpfile_10sec/BBB_fixedres_B_180x320_80.mp4", keys, keyRotation2, "cenc", uuidDefault, true);
    }finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    public void testMultipleKeys(Mp4Builder builder, String testFile, Map<UUID, SecretKey> keys,
                                 HashMap<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation,
                                 String encAlgo, UUID uuidDefault, boolean encryptButClear) throws IOException {try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25103);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25104);Movie m1 = MovieCreator.build(testFile);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25105);Movie m2 = new Movie();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25106);for (Track track : m1.getTracks()) {{

            __CLR4_5_2jbsjbslvl9emwm.R.inc(25107);CencEncryptingTrackImpl cencEncryptingTrack = new CencEncryptingTrackImpl(track, uuidDefault, keys, keyRotation, encAlgo, false, encryptButClear);
            __CLR4_5_2jbsjbslvl9emwm.R.inc(25108);m2.addTrack(cencEncryptingTrack);
        }
        }__CLR4_5_2jbsjbslvl9emwm.R.inc(25109);Container c = builder.build(m2);

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25110);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25111);c.writeContainer(Channels.newChannel(baos));
        //  new FileOutputStream("c:\\dev\\mp4parser\\m2.mp4").write(baos.toByteArray());

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25112);Movie m3 = MovieCreator.build(new MemoryDataSourceImpl(baos.toByteArray()));

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25113);Movie m4 = new Movie();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25114);for (Track track : m3.getTracks()) {{
            __CLR4_5_2jbsjbslvl9emwm.R.inc(25115);CencDecryptingTrackImpl cencDecryptingTrack =
                    new CencDecryptingTrackImpl((CencEncryptedTrack) track, keys);
            __CLR4_5_2jbsjbslvl9emwm.R.inc(25116);m4.addTrack(cencDecryptingTrack);
        }
        }__CLR4_5_2jbsjbslvl9emwm.R.inc(25117);Container c2 = builder.build(m4);

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25118);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25119);c2.writeContainer(Channels.newChannel(baos2));
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25120);Movie m5 = MovieCreator.build(new MemoryDataSourceImpl(baos2.toByteArray()));

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25121);Iterator<Track> tracksPlainIter = m1.getTracks().iterator();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25122);Iterator<Track> roundTrippedTracksIter = m5.getTracks().iterator();

        __CLR4_5_2jbsjbslvl9emwm.R.inc(25123);while ((((tracksPlainIter.hasNext() && roundTrippedTracksIter.hasNext())&&(__CLR4_5_2jbsjbslvl9emwm.R.iget(25124)!=0|true))||(__CLR4_5_2jbsjbslvl9emwm.R.iget(25125)==0&false))) {{
            __CLR4_5_2jbsjbslvl9emwm.R.inc(25126);verifySampleEquality(
                    tracksPlainIter.next().getSamples(),
                    roundTrippedTracksIter.next().getSamples());
        }

    }}finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}

    public void verifySampleEquality(List<Sample> orig, List<Sample> roundtripped) throws IOException {try{__CLR4_5_2jbsjbslvl9emwm.R.inc(25127);
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25128);Iterator<Sample> origIter = orig.iterator();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25129);Iterator<Sample> roundTrippedIter = roundtripped.iterator();
        __CLR4_5_2jbsjbslvl9emwm.R.inc(25130);while ((((origIter.hasNext() && roundTrippedIter.hasNext())&&(__CLR4_5_2jbsjbslvl9emwm.R.iget(25131)!=0|true))||(__CLR4_5_2jbsjbslvl9emwm.R.iget(25132)==0&false))) {{
            __CLR4_5_2jbsjbslvl9emwm.R.inc(25133);ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
            __CLR4_5_2jbsjbslvl9emwm.R.inc(25134);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
            __CLR4_5_2jbsjbslvl9emwm.R.inc(25135);origIter.next().writeTo(Channels.newChannel(baos1));
            __CLR4_5_2jbsjbslvl9emwm.R.inc(25136);roundTrippedIter.next().writeTo(Channels.newChannel(baos2));
            __CLR4_5_2jbsjbslvl9emwm.R.inc(25137);Assert.assertArrayEquals(baos1.toByteArray(), baos2.toByteArray());
        }

    }}finally{__CLR4_5_2jbsjbslvl9emwm.R.flushNeeded();}}
}
