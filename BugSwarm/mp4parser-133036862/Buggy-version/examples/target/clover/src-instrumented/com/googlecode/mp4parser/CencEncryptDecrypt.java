/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.container.mp4.MovieCreator;
import com.googlecode.mp4parser.authoring.tracks.CencDecryptingTrackImpl;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptingTrackImpl;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.UUID;

/**
 * Created by user on 22.07.2014.
 */
public class CencEncryptDecrypt {public static class __CLR4_5_26a6alvlunzz4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448995581L,8589935092L,249,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_5_26a6alvlunzz4.R.inc(226);
        __CLR4_5_26a6alvlunzz4.R.inc(227);DefaultMp4Builder mp4Builder = new DefaultMp4Builder();

        __CLR4_5_26a6alvlunzz4.R.inc(228);Movie mOrig = MovieCreator.build(CencEncryptDecrypt.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "/1365070268951.mp4");


        __CLR4_5_26a6alvlunzz4.R.inc(229);Movie mEncryptOut = new Movie();
        __CLR4_5_26a6alvlunzz4.R.inc(230);SecretKey sk = new SecretKeySpec(new byte[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, "AES");
        __CLR4_5_26a6alvlunzz4.R.inc(231);for (Track track : mOrig.getTracks()) {{
            __CLR4_5_26a6alvlunzz4.R.inc(232);mEncryptOut.addTrack(new CencEncryptingTrackImpl(track, UUID.randomUUID(), sk, true));
        }

        }__CLR4_5_26a6alvlunzz4.R.inc(233);Container cEncrypted = mp4Builder.build(mEncryptOut);
        __CLR4_5_26a6alvlunzz4.R.inc(234);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_26a6alvlunzz4.R.inc(235);cEncrypted.writeContainer(Channels.newChannel(baos));

        __CLR4_5_26a6alvlunzz4.R.inc(236);FileOutputStream fos = new FileOutputStream("output-enc.mp4");
        __CLR4_5_26a6alvlunzz4.R.inc(237);fos.write(baos.toByteArray());

        __CLR4_5_26a6alvlunzz4.R.inc(238);Movie mEncryptIn = MovieCreator.build (new MemoryDataSourceImpl(baos.toByteArray()));
        __CLR4_5_26a6alvlunzz4.R.inc(239);Movie mDecrypt = new Movie();

        __CLR4_5_26a6alvlunzz4.R.inc(240);for (Track track : mEncryptIn.getTracks()) {{
            __CLR4_5_26a6alvlunzz4.R.inc(241);if ((((track instanceof CencEncryptedTrack)&&(__CLR4_5_26a6alvlunzz4.R.iget(242)!=0|true))||(__CLR4_5_26a6alvlunzz4.R.iget(243)==0&false))) {{
                __CLR4_5_26a6alvlunzz4.R.inc(244);mDecrypt.addTrack(new CencDecryptingTrackImpl((CencEncryptedTrack) track, sk));
            } }else {{
                __CLR4_5_26a6alvlunzz4.R.inc(245);mDecrypt.addTrack(track);
            }
        }}

        }__CLR4_5_26a6alvlunzz4.R.inc(246);Container cDecrypted = mp4Builder.build(mDecrypt);
        __CLR4_5_26a6alvlunzz4.R.inc(247);FileOutputStream fos2 = new FileOutputStream("output.mp4");
        __CLR4_5_26a6alvlunzz4.R.inc(248);cDecrypted.writeContainer(fos2.getChannel());

    }finally{__CLR4_5_26a6alvlunzz4.R.flushNeeded();}}
}
