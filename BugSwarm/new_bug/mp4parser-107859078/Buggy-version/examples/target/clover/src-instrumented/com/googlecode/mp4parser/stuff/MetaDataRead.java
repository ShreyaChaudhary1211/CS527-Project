/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.stuff;

import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.boxes.apple.AppleNameBox;
import com.googlecode.mp4parser.util.Path;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Change metadata and make sure chunkoffsets are corrected.
 */
public class MetaDataRead {public static class __CLR4_5_2zrzrlvl9g0vr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,1306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public static void main(String[] args) throws IOException {try{__CLR4_5_2zrzrlvl9g0vr.R.inc(1287);
        __CLR4_5_2zrzrlvl9g0vr.R.inc(1288);MetaDataRead cmd = new MetaDataRead();
        __CLR4_5_2zrzrlvl9g0vr.R.inc(1289);String xml = cmd.read("C:\\content\\Mobile_H264.mp4");
        __CLR4_5_2zrzrlvl9g0vr.R.inc(1290);System.err.println(xml);
    }finally{__CLR4_5_2zrzrlvl9g0vr.R.flushNeeded();}}

    public String read(String videoFilePath) throws IOException {try{__CLR4_5_2zrzrlvl9g0vr.R.inc(1291);

        __CLR4_5_2zrzrlvl9g0vr.R.inc(1292);File videoFile = new File(videoFilePath);
        __CLR4_5_2zrzrlvl9g0vr.R.inc(1293);if ((((!videoFile.exists())&&(__CLR4_5_2zrzrlvl9g0vr.R.iget(1294)!=0|true))||(__CLR4_5_2zrzrlvl9g0vr.R.iget(1295)==0&false))) {{
            __CLR4_5_2zrzrlvl9g0vr.R.inc(1296);throw new FileNotFoundException("File " + videoFilePath + " not exists");
        }

        }__CLR4_5_2zrzrlvl9g0vr.R.inc(1297);if ((((!videoFile.canRead())&&(__CLR4_5_2zrzrlvl9g0vr.R.iget(1298)!=0|true))||(__CLR4_5_2zrzrlvl9g0vr.R.iget(1299)==0&false))) {{
            __CLR4_5_2zrzrlvl9g0vr.R.inc(1300);throw new IllegalStateException("No read permissions to file " + videoFilePath);
        }
        }__CLR4_5_2zrzrlvl9g0vr.R.inc(1301);IsoFile isoFile = new IsoFile(new FileDataSourceImpl(videoFilePath));

        __CLR4_5_2zrzrlvl9g0vr.R.inc(1302);AppleNameBox nam = Path.getPath(isoFile, "/moov[0]/udta[0]/meta[0]/ilst/\u00a9nam");
        __CLR4_5_2zrzrlvl9g0vr.R.inc(1303);String xml = nam.getValue();
        __CLR4_5_2zrzrlvl9g0vr.R.inc(1304);isoFile.close();
        __CLR4_5_2zrzrlvl9g0vr.R.inc(1305);return xml;
    }finally{__CLR4_5_2zrzrlvl9g0vr.R.flushNeeded();}}
}
