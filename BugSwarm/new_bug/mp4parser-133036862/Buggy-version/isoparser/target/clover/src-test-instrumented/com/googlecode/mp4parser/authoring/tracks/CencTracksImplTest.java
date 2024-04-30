/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder;
import com.googlecode.mp4parser.authoring.builder.Mp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import org.junit.Test;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.nio.channels.Channels;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class CencTracksImplTest {static class __CLR4_5_2jrojrolvlulqxn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25654,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    @Test
    public void testEncryptDecryptDefaultMp4() throws Exception {__CLR4_5_2jrojrolvlulqxn.R.globalSliceStart(getClass().getName(),25620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p61m41jro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jrojrolvlulqxn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jrojrolvlulqxn.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.CencTracksImplTest.testEncryptDecryptDefaultMp4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25620,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p61m41jro() throws Exception{try{__CLR4_5_2jrojrolvlulqxn.R.inc(25620);
        __CLR4_5_2jrojrolvlulqxn.R.inc(25621);SecretKey sk = new SecretKeySpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, "AES");
        __CLR4_5_2jrojrolvlulqxn.R.inc(25622);Movie m = MovieCreator.build(
                CencTracksImplTest.class.getProtectionDomain().getCodeSource().getLocation().getFile() +
                        "/com/googlecode/mp4parser/authoring/samples/1365070268951.mp4");

        __CLR4_5_2jrojrolvlulqxn.R.inc(25623);List<Track> encTracks = new LinkedList<Track>();
        __CLR4_5_2jrojrolvlulqxn.R.inc(25624);for (Track track : m.getTracks()) {{
            __CLR4_5_2jrojrolvlulqxn.R.inc(25625);encTracks.add(new CencEncryptingTrackImpl(track, UUID.randomUUID(), sk, false));
        }
        }__CLR4_5_2jrojrolvlulqxn.R.inc(25626);m.setTracks(encTracks);

        __CLR4_5_2jrojrolvlulqxn.R.inc(25627);Mp4Builder mp4Builder = new DefaultMp4Builder();
        __CLR4_5_2jrojrolvlulqxn.R.inc(25628);Container c = mp4Builder.build(m);
        __CLR4_5_2jrojrolvlulqxn.R.inc(25629);ByteArrayOutputStream baos = new ByteArrayOutputStream();

        __CLR4_5_2jrojrolvlulqxn.R.inc(25630);c.writeContainer(Channels.newChannel(baos));

        //c.writeContainer(new FileOutputStream("output.mp4").getChannel());

        __CLR4_5_2jrojrolvlulqxn.R.inc(25631);Movie m2 = MovieCreator.build(new MemoryDataSourceImpl(baos.toByteArray()));
        __CLR4_5_2jrojrolvlulqxn.R.inc(25632);List<Track> decTracks = new LinkedList<Track>();
        __CLR4_5_2jrojrolvlulqxn.R.inc(25633);for (Track track : m2.getTracks()) {{
            __CLR4_5_2jrojrolvlulqxn.R.inc(25634);decTracks.add(new CencDecryptingTrackImpl((CencEncryptedTrack) track, sk));
        }
        }__CLR4_5_2jrojrolvlulqxn.R.inc(25635);m2.setTracks(decTracks);
        __CLR4_5_2jrojrolvlulqxn.R.inc(25636);c = mp4Builder.build(m2);

        //c.writeContainer(new FileOutputStream("output2.mp4").getChannel());


    }finally{__CLR4_5_2jrojrolvlulqxn.R.flushNeeded();}}
    @Test
    public void testEncryptDecryptFragmentedMp4() throws Exception {__CLR4_5_2jrojrolvlulqxn.R.globalSliceStart(getClass().getName(),25637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x3q6njs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jrojrolvlulqxn.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jrojrolvlulqxn.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.CencTracksImplTest.testEncryptDecryptFragmentedMp4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25637,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x3q6njs5() throws Exception{try{__CLR4_5_2jrojrolvlulqxn.R.inc(25637);
        __CLR4_5_2jrojrolvlulqxn.R.inc(25638);SecretKey sk = new SecretKeySpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, "AES");
        __CLR4_5_2jrojrolvlulqxn.R.inc(25639);Movie m = MovieCreator.build(
                CencTracksImplTest.class.getProtectionDomain().getCodeSource().getLocation().getFile() +
                        "/com/googlecode/mp4parser/authoring/samples/1365070268951.mp4");

        __CLR4_5_2jrojrolvlulqxn.R.inc(25640);List<Track> encTracks = new LinkedList<Track>();
        __CLR4_5_2jrojrolvlulqxn.R.inc(25641);for (Track track : m.getTracks()) {{
            __CLR4_5_2jrojrolvlulqxn.R.inc(25642);encTracks.add(new CencEncryptingTrackImpl(track, UUID.randomUUID(), sk, false));
        }
        }__CLR4_5_2jrojrolvlulqxn.R.inc(25643);m.setTracks(encTracks);

        __CLR4_5_2jrojrolvlulqxn.R.inc(25644);Mp4Builder mp4Builder = new FragmentedMp4Builder();
        __CLR4_5_2jrojrolvlulqxn.R.inc(25645);Container c = mp4Builder.build(m);
        __CLR4_5_2jrojrolvlulqxn.R.inc(25646);ByteArrayOutputStream baos = new ByteArrayOutputStream();

        __CLR4_5_2jrojrolvlulqxn.R.inc(25647);c.writeContainer(Channels.newChannel(baos));

        //c.writeContainer(new FileOutputStream("output.mp4").getChannel());

        __CLR4_5_2jrojrolvlulqxn.R.inc(25648);Movie m2 = MovieCreator.build(new MemoryDataSourceImpl(baos.toByteArray()));
        __CLR4_5_2jrojrolvlulqxn.R.inc(25649);List<Track> decTracks = new LinkedList<Track>();
        __CLR4_5_2jrojrolvlulqxn.R.inc(25650);for (Track track : m2.getTracks()) {{
            __CLR4_5_2jrojrolvlulqxn.R.inc(25651);decTracks.add(new CencDecryptingTrackImpl((CencEncryptedTrack) track, sk));
        }
        }__CLR4_5_2jrojrolvlulqxn.R.inc(25652);m2.setTracks(decTracks);
        __CLR4_5_2jrojrolvlulqxn.R.inc(25653);c = mp4Builder.build(m2);

        //c.writeContainer(new FileOutputStream("output2.mp4").getChannel());

    }finally{__CLR4_5_2jrojrolvlulqxn.R.flushNeeded();}}
}
