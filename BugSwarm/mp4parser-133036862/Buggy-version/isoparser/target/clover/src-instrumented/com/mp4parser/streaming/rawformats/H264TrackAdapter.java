/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.streaming.rawformats;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl;
import com.mp4parser.streaming.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by sannies on 25.05.2015.
 */
public class H264TrackAdapter extends AbstractStreamingTrack {public static class __CLR4_5_2hrdhrdlvluloba{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,23053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    H264TrackImpl h264Track;


    public H264TrackAdapter(final H264TrackImpl h264Track) throws InterruptedException {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23017);
        __CLR4_5_2hrdhrdlvluloba.R.inc(23018);this.h264Track = h264Track;
        __CLR4_5_2hrdhrdlvluloba.R.inc(23019);samples = new ArrayBlockingQueue<StreamingSample>(100, true);
        __CLR4_5_2hrdhrdlvluloba.R.inc(23020);new Thread() {
            @Override
            public void run() {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23021);
                __CLR4_5_2hrdhrdlvluloba.R.inc(23022);try {
                    __CLR4_5_2hrdhrdlvluloba.R.inc(23023);parse();
                } catch (InterruptedException e) {
                    __CLR4_5_2hrdhrdlvluloba.R.inc(23024);e.printStackTrace();
                }
            }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}
        }.start();
        __CLR4_5_2hrdhrdlvluloba.R.inc(23025);stsd = h264Track.getSampleDescriptionBox();
    }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}

    public void parse() throws InterruptedException {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23026);

        __CLR4_5_2hrdhrdlvluloba.R.inc(23027);List<Sample> oldsamples = h264Track.getSamples();

        __CLR4_5_2hrdhrdlvluloba.R.inc(23028);for (int i = 0; (((i < oldsamples.size())&&(__CLR4_5_2hrdhrdlvluloba.R.iget(23029)!=0|true))||(__CLR4_5_2hrdhrdlvluloba.R.iget(23030)==0&false)); i++) {{
            __CLR4_5_2hrdhrdlvluloba.R.inc(23031);System.err.println("Jo! " + i + " of " + oldsamples.size());
            __CLR4_5_2hrdhrdlvluloba.R.inc(23032);final long duration = h264Track.getSampleDurations()[i];
            __CLR4_5_2hrdhrdlvluloba.R.inc(23033);final Sample sample = oldsamples.get(i);

            __CLR4_5_2hrdhrdlvluloba.R.inc(23034);samples.put(new StreamingSample() {
                public ByteBuffer getContent() {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23035);
                    __CLR4_5_2hrdhrdlvluloba.R.inc(23036);return sample.asByteBuffer().duplicate();
                }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}

                public long getDuration() {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23037);
                    __CLR4_5_2hrdhrdlvluloba.R.inc(23038);return duration;
                }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}

                public SampleExtension[] getExtensions() {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23039);
                    __CLR4_5_2hrdhrdlvluloba.R.inc(23040);return new SampleExtension[0];
                }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}
            });

        }
        }__CLR4_5_2hrdhrdlvluloba.R.inc(23041);System.err.println("Jo!");

    }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}

    public long getTimescale() {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23042);
        __CLR4_5_2hrdhrdlvluloba.R.inc(23043);return h264Track.getTrackMetaData().getTimescale();
    }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23044);
        __CLR4_5_2hrdhrdlvluloba.R.inc(23045);return h264Track.getHandler();
    }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}

    public String getLanguage() {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23046);
        __CLR4_5_2hrdhrdlvluloba.R.inc(23047);return h264Track.getTrackMetaData().getLanguage();
    }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}


    public static void main(String[] args) throws IOException, InterruptedException {try{__CLR4_5_2hrdhrdlvluloba.R.inc(23048);
        __CLR4_5_2hrdhrdlvluloba.R.inc(23049);H264TrackImpl h264Track = new H264TrackImpl(new FileDataSourceImpl("c:\\content\\big_buck_bunny_1080p_h264-2min.h264"));
        __CLR4_5_2hrdhrdlvluloba.R.inc(23050);final StreamingTrack streamingTrack = new H264TrackAdapter(h264Track);
        __CLR4_5_2hrdhrdlvluloba.R.inc(23051);MultiTrackFragmentedMp4Writer mp4Writer
                = new MultiTrackFragmentedMp4Writer(new StreamingTrack[]{streamingTrack}, new FileOutputStream("output.mp4"));
        __CLR4_5_2hrdhrdlvluloba.R.inc(23052);mp4Writer.write();
    }finally{__CLR4_5_2hrdhrdlvluloba.R.flushNeeded();}}
}
