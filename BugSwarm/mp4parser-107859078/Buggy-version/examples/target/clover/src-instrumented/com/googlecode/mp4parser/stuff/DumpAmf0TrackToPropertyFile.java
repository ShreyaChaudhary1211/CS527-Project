/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.stuff;

import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import org.apache.commons.codec.binary.Base64;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Properties;


public class DumpAmf0TrackToPropertyFile {public static class __CLR4_5_2vivilvl9g0vc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,1154,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_5_2vivilvl9g0vc.R.inc(1134);
        __CLR4_5_2vivilvl9g0vc.R.inc(1135);Movie movie = MovieCreator.build(DumpAmf0TrackToPropertyFile.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/example.f4v");


        __CLR4_5_2vivilvl9g0vc.R.inc(1136);for (Track track : movie.getTracks()) {{
            __CLR4_5_2vivilvl9g0vc.R.inc(1137);if ((((track.getHandler().equals("data") )&&(__CLR4_5_2vivilvl9g0vc.R.iget(1138)!=0|true))||(__CLR4_5_2vivilvl9g0vc.R.iget(1139)==0&false))) {{
                __CLR4_5_2vivilvl9g0vc.R.inc(1140);long time = 0;
                __CLR4_5_2vivilvl9g0vc.R.inc(1141);Iterator<Sample> samples = track.getSamples().iterator();
                __CLR4_5_2vivilvl9g0vc.R.inc(1142);Properties properties = new Properties();
                __CLR4_5_2vivilvl9g0vc.R.inc(1143);File f = File.createTempFile(DumpAmf0TrackToPropertyFile.class.getSimpleName(), "" + track.getTrackMetaData().getTrackId());
                __CLR4_5_2vivilvl9g0vc.R.inc(1144);for (long decodingTime : track.getSampleDurations()) {{
                    __CLR4_5_2vivilvl9g0vc.R.inc(1145);ByteBuffer sample = samples.next().asByteBuffer();
                    __CLR4_5_2vivilvl9g0vc.R.inc(1146);byte[] sampleBytes = new byte[sample.limit()];
                    __CLR4_5_2vivilvl9g0vc.R.inc(1147);sample.reset();
                    __CLR4_5_2vivilvl9g0vc.R.inc(1148);sample.get(sampleBytes);
                    __CLR4_5_2vivilvl9g0vc.R.inc(1149);properties.put("" + time, new String(Base64.encodeBase64(sampleBytes, false, false)));
                    __CLR4_5_2vivilvl9g0vc.R.inc(1150);time += decodingTime;
                }
                }__CLR4_5_2vivilvl9g0vc.R.inc(1151);FileOutputStream fos = new FileOutputStream(f);
                __CLR4_5_2vivilvl9g0vc.R.inc(1152);System.err.println(properties);
                __CLR4_5_2vivilvl9g0vc.R.inc(1153);properties.store(fos, "");

            }
        }}
    }}finally{__CLR4_5_2vivilvl9g0vc.R.flushNeeded();}}


}
