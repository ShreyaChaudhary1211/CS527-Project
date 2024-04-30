/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks.mjpeg;

import com.coremedia.iso.Hex;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.*;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sannies on 13.02.2015.
 */
public class OneJpegPerIframe extends AbstractTrack {public static class __CLR4_5_29z59z5lvlulisd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,13040,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    File[] jpegs;
    TrackMetaData trackMetaData = new TrackMetaData();
    long[] sampleDurations;
    SampleDescriptionBox stsd;
    long[] syncSamples;


    public OneJpegPerIframe(String name, File[] jpegs, Track alignTo) throws IOException {
        super(name);__CLR4_5_29z59z5lvlulisd.R.inc(12930);try{__CLR4_5_29z59z5lvlulisd.R.inc(12929);
        __CLR4_5_29z59z5lvlulisd.R.inc(12931);this.jpegs = jpegs;
        __CLR4_5_29z59z5lvlulisd.R.inc(12932);if ((((alignTo.getSyncSamples().length != jpegs.length)&&(__CLR4_5_29z59z5lvlulisd.R.iget(12933)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(12934)==0&false))) {{
            __CLR4_5_29z59z5lvlulisd.R.inc(12935);throw new RuntimeException("Number of sync samples doesn't match the number of stills (" + alignTo.getSyncSamples().length + " vs. " + jpegs.length + ")");
        }
        }__CLR4_5_29z59z5lvlulisd.R.inc(12936);BufferedImage a = ImageIO.read(jpegs[0]);
        __CLR4_5_29z59z5lvlulisd.R.inc(12937);trackMetaData.setWidth(a.getWidth());
        __CLR4_5_29z59z5lvlulisd.R.inc(12938);trackMetaData.setHeight(a.getHeight());
        __CLR4_5_29z59z5lvlulisd.R.inc(12939);trackMetaData.setTimescale(alignTo.getTrackMetaData().getTimescale());


        __CLR4_5_29z59z5lvlulisd.R.inc(12940);long[] sampleDurationsToiAlignTo = alignTo.getSampleDurations();
        __CLR4_5_29z59z5lvlulisd.R.inc(12941);long[] syncSamples = alignTo.getSyncSamples();
        __CLR4_5_29z59z5lvlulisd.R.inc(12942);int currentSyncSample = 1;
        __CLR4_5_29z59z5lvlulisd.R.inc(12943);long duration = 0;
        __CLR4_5_29z59z5lvlulisd.R.inc(12944);sampleDurations = new long[syncSamples.length];

        __CLR4_5_29z59z5lvlulisd.R.inc(12945);for (int i = 1; (((i < sampleDurationsToiAlignTo.length)&&(__CLR4_5_29z59z5lvlulisd.R.iget(12946)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(12947)==0&false)); i++) {{
            __CLR4_5_29z59z5lvlulisd.R.inc(12948);if ((((currentSyncSample < syncSamples.length && i == syncSamples[currentSyncSample])&&(__CLR4_5_29z59z5lvlulisd.R.iget(12949)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(12950)==0&false))) {{
                __CLR4_5_29z59z5lvlulisd.R.inc(12951);sampleDurations[currentSyncSample - 1] = duration;
                __CLR4_5_29z59z5lvlulisd.R.inc(12952);duration = 0;
                __CLR4_5_29z59z5lvlulisd.R.inc(12953);currentSyncSample++;
            }
            }__CLR4_5_29z59z5lvlulisd.R.inc(12954);duration += sampleDurationsToiAlignTo[i];
        }
        }__CLR4_5_29z59z5lvlulisd.R.inc(12955);sampleDurations[sampleDurations.length - 1] = duration;

        __CLR4_5_29z59z5lvlulisd.R.inc(12956);stsd = new SampleDescriptionBox();
        __CLR4_5_29z59z5lvlulisd.R.inc(12957);VisualSampleEntry mp4v = new VisualSampleEntry("mp4v");
        __CLR4_5_29z59z5lvlulisd.R.inc(12958);stsd.addBox(mp4v);
        __CLR4_5_29z59z5lvlulisd.R.inc(12959);ESDescriptorBox esds = new ESDescriptorBox();
        __CLR4_5_29z59z5lvlulisd.R.inc(12960);esds.setData(ByteBuffer.wrap(Hex.decodeHex("038080801B000100048080800D6C11000000000A1CB4000A1CB4068080800102")));
        __CLR4_5_29z59z5lvlulisd.R.inc(12961);esds.setEsDescriptor((ESDescriptor) ObjectDescriptorFactory.createFrom(-1, ByteBuffer.wrap(Hex.decodeHex("038080801B000100048080800D6C11000000000A1CB4000A1CB4068080800102"))));
        __CLR4_5_29z59z5lvlulisd.R.inc(12962);mp4v.addBox(esds);
        __CLR4_5_29z59z5lvlulisd.R.inc(12963);this.syncSamples = new long[jpegs.length];
        __CLR4_5_29z59z5lvlulisd.R.inc(12964);for (int i = 0; (((i < this.syncSamples.length)&&(__CLR4_5_29z59z5lvlulisd.R.iget(12965)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(12966)==0&false)); i++) {{
            __CLR4_5_29z59z5lvlulisd.R.inc(12967);this.syncSamples[i] = i + 1;

        }

        }__CLR4_5_29z59z5lvlulisd.R.inc(12968);double earliestTrackPresentationTime = 0;
        __CLR4_5_29z59z5lvlulisd.R.inc(12969);boolean acceptDwell = true;
        __CLR4_5_29z59z5lvlulisd.R.inc(12970);boolean acceptEdit = true;
        __CLR4_5_29z59z5lvlulisd.R.inc(12971);for (Edit edit : alignTo.getEdits()) {{
            __CLR4_5_29z59z5lvlulisd.R.inc(12972);if ((((edit.getMediaTime() == -1 && !acceptDwell)&&(__CLR4_5_29z59z5lvlulisd.R.iget(12973)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(12974)==0&false))) {{
                __CLR4_5_29z59z5lvlulisd.R.inc(12975);throw new RuntimeException("Cannot accept edit list for processing (1)");
            }
            }__CLR4_5_29z59z5lvlulisd.R.inc(12976);if ((((edit.getMediaTime() >= 0 && !acceptEdit)&&(__CLR4_5_29z59z5lvlulisd.R.iget(12977)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(12978)==0&false))) {{
                __CLR4_5_29z59z5lvlulisd.R.inc(12979);throw new RuntimeException("Cannot accept edit list for processing (2)");
            }
            }__CLR4_5_29z59z5lvlulisd.R.inc(12980);if ((((edit.getMediaTime() == -1)&&(__CLR4_5_29z59z5lvlulisd.R.iget(12981)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(12982)==0&false))) {{
                __CLR4_5_29z59z5lvlulisd.R.inc(12983);earliestTrackPresentationTime += edit.getSegmentDuration();
            } }else /* if edit.getMediaTime() >= 0 */ {{
                __CLR4_5_29z59z5lvlulisd.R.inc(12984);earliestTrackPresentationTime -= (double) edit.getMediaTime() / edit.getTimeScale();
                __CLR4_5_29z59z5lvlulisd.R.inc(12985);acceptEdit = false;
                __CLR4_5_29z59z5lvlulisd.R.inc(12986);acceptDwell = false;
            }
        }}
        }__CLR4_5_29z59z5lvlulisd.R.inc(12987);if ((((alignTo.getCompositionTimeEntries() != null && alignTo.getCompositionTimeEntries().size() > 0)&&(__CLR4_5_29z59z5lvlulisd.R.iget(12988)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(12989)==0&false))) {{
            __CLR4_5_29z59z5lvlulisd.R.inc(12990);long currentTime = 0;
            __CLR4_5_29z59z5lvlulisd.R.inc(12991);int[] ptss = CompositionTimeToSample.blowupCompositionTimes(alignTo.getCompositionTimeEntries());
            __CLR4_5_29z59z5lvlulisd.R.inc(12992);for (int j = 0; (((j < ptss.length && j < 50)&&(__CLR4_5_29z59z5lvlulisd.R.iget(12993)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(12994)==0&false)); j++) {{
                __CLR4_5_29z59z5lvlulisd.R.inc(12995);ptss[j] += currentTime;
                __CLR4_5_29z59z5lvlulisd.R.inc(12996);currentTime += alignTo.getSampleDurations()[j];
            }
            }__CLR4_5_29z59z5lvlulisd.R.inc(12997);Arrays.sort(ptss);
            __CLR4_5_29z59z5lvlulisd.R.inc(12998);earliestTrackPresentationTime += (double) ptss[0] / alignTo.getTrackMetaData().getTimescale();

        }

        }__CLR4_5_29z59z5lvlulisd.R.inc(12999);if ((((earliestTrackPresentationTime < 0)&&(__CLR4_5_29z59z5lvlulisd.R.iget(13000)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(13001)==0&false))) {{
            __CLR4_5_29z59z5lvlulisd.R.inc(13002);getEdits().add(new Edit((long) (-earliestTrackPresentationTime * getTrackMetaData().getTimescale()), getTrackMetaData().getTimescale(), 1.0, (double) getDuration() / getTrackMetaData().getTimescale()));
        } }else {__CLR4_5_29z59z5lvlulisd.R.inc(13003);if ((((earliestTrackPresentationTime > 0)&&(__CLR4_5_29z59z5lvlulisd.R.iget(13004)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(13005)==0&false))) {{
            __CLR4_5_29z59z5lvlulisd.R.inc(13006);getEdits().add(new Edit(-1, getTrackMetaData().getTimescale(), 1.0, earliestTrackPresentationTime));
            __CLR4_5_29z59z5lvlulisd.R.inc(13007);getEdits().add(new Edit(0, getTrackMetaData().getTimescale(), 1.0, (double) getDuration() / getTrackMetaData().getTimescale()));
        }

    }}}finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_29z59z5lvlulisd.R.inc(13008);
        __CLR4_5_29z59z5lvlulisd.R.inc(13009);return stsd;
    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_29z59z5lvlulisd.R.inc(13010);
        __CLR4_5_29z59z5lvlulisd.R.inc(13011);return sampleDurations;
    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_29z59z5lvlulisd.R.inc(13012);
        __CLR4_5_29z59z5lvlulisd.R.inc(13013);return trackMetaData;
    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_29z59z5lvlulisd.R.inc(13014);
        __CLR4_5_29z59z5lvlulisd.R.inc(13015);return "vide";
    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}

    @Override
    public long[] getSyncSamples() {try{__CLR4_5_29z59z5lvlulisd.R.inc(13016);
        __CLR4_5_29z59z5lvlulisd.R.inc(13017);return syncSamples;
    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}


    public List<Sample> getSamples() {try{__CLR4_5_29z59z5lvlulisd.R.inc(13018);
        __CLR4_5_29z59z5lvlulisd.R.inc(13019);return new AbstractList<Sample>() {

            @Override
            public int size() {try{__CLR4_5_29z59z5lvlulisd.R.inc(13020);
                __CLR4_5_29z59z5lvlulisd.R.inc(13021);return jpegs.length;
            }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}

            @Override
            public Sample get(final int index) {try{__CLR4_5_29z59z5lvlulisd.R.inc(13022);
                __CLR4_5_29z59z5lvlulisd.R.inc(13023);return new Sample() {
                    ByteBuffer sample = null;

                    public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_29z59z5lvlulisd.R.inc(13024);
                        __CLR4_5_29z59z5lvlulisd.R.inc(13025);RandomAccessFile raf = new RandomAccessFile(jpegs[index], "r");
                        __CLR4_5_29z59z5lvlulisd.R.inc(13026);raf.getChannel().transferTo(0, raf.length(), channel);
                        __CLR4_5_29z59z5lvlulisd.R.inc(13027);raf.close();
                    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}

                    public long getSize() {try{__CLR4_5_29z59z5lvlulisd.R.inc(13028);
                        __CLR4_5_29z59z5lvlulisd.R.inc(13029);return jpegs[index].length();
                    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}

                    public ByteBuffer asByteBuffer() {try{__CLR4_5_29z59z5lvlulisd.R.inc(13030);
                        __CLR4_5_29z59z5lvlulisd.R.inc(13031);if ((((sample == null)&&(__CLR4_5_29z59z5lvlulisd.R.iget(13032)!=0|true))||(__CLR4_5_29z59z5lvlulisd.R.iget(13033)==0&false))) {{
                            __CLR4_5_29z59z5lvlulisd.R.inc(13034);try {
                                __CLR4_5_29z59z5lvlulisd.R.inc(13035);RandomAccessFile raf = new RandomAccessFile(jpegs[index], "r");
                                __CLR4_5_29z59z5lvlulisd.R.inc(13036);sample = raf.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, raf.length());
                            } catch (IOException e) {
                                __CLR4_5_29z59z5lvlulisd.R.inc(13037);throw new RuntimeException(e);
                            }
                        }
                        }__CLR4_5_29z59z5lvlulisd.R.inc(13038);return sample;
                    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}
                };
            }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}
        };
    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_29z59z5lvlulisd.R.inc(13039);

    }finally{__CLR4_5_29z59z5lvlulisd.R.flushNeeded();}}
}
