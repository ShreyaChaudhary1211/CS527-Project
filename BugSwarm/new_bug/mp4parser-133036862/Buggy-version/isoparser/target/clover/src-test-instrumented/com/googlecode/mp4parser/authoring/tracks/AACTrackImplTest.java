/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Sebastian Annies, Hamburg
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
package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.util.Path;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;

/**
 * Simple test to make sure nothing breaks.
 */
public class AACTrackImplTest {static class __CLR4_5_2jpkjpklvlulqw1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25562,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws IOException {try{__CLR4_5_2jpkjpklvlulqw1.R.inc(25544);
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25545);ESDescriptorBox esds = Path.getPath(new IsoFile("C:\\dev\\mp4parer\\aac-sample.mp4"), "/moov[0]/trak[0]/mdia[0]/minf[0]/stbl[0]/stsd[0]/mp4v[0]/esds[0]");
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25546);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25547);esds.getBox(Channels.newChannel(baos));
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25548);System.err.println(Hex.encodeHex(baos.toByteArray()));
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25549);System.err.println(esds.getEsDescriptor());
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25550);baos = new ByteArrayOutputStream();
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25551);esds.getBox(Channels.newChannel(baos));
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25552);System.err.println(Hex.encodeHex(baos.toByteArray()));
    }finally{__CLR4_5_2jpkjpklvlulqw1.R.flushNeeded();}}

    @Test
    public void freeze() throws IOException {__CLR4_5_2jpkjpklvlulqw1.R.globalSliceStart(getClass().getName(),25553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nqur5qjpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jpkjpklvlulqw1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jpkjpklvlulqw1.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.authoring.tracks.AACTrackImplTest.freeze",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nqur5qjpt() throws IOException{try{__CLR4_5_2jpkjpklvlulqw1.R.inc(25553);
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25554);Track t = new AACTrackImpl(new FileDataSourceImpl(this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile() + "/com/googlecode/mp4parser/authoring/tracks/aac-sample.aac"));
        //Track t = new AACTrackImpl2(new FileInputStream(this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile() + "/com/googlecode/mp4parser/authoring/tracks/aac-sample.aac"));
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25555);Movie m = new Movie();
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25556);m.addTrack(t);

        __CLR4_5_2jpkjpklvlulqw1.R.inc(25557);DefaultMp4Builder mp4Builder = new DefaultMp4Builder();
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25558);Container c = mp4Builder.build(m);
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25559);c.writeContainer(new FileOutputStream("C:\\dev\\mp4parser\\isoparser\\src\\test\\resources\\com\\googlecode\\mp4parser\\authoring\\tracks\\aac-sample.mp4").getChannel());

        __CLR4_5_2jpkjpklvlulqw1.R.inc(25560);IsoFile isoFileReference = new IsoFile(this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile() + "/com/googlecode/mp4parser/authoring/tracks/aac-sample.mp4");
        __CLR4_5_2jpkjpklvlulqw1.R.inc(25561);BoxComparator.check(c, isoFileReference, "/ftyp", "/moov[0]/mvhd[0]", "/moov[0]/trak[0]/tkhd[0]", "/moov[0]/trak[0]/mdia[0]/mdhd[0]", "/moov[0]/trak[0]/mdia[0]/minf[0]/stbl[0]/stco[0]");
    }finally{__CLR4_5_2jpkjpklvlulqw1.R.flushNeeded();}}
}
