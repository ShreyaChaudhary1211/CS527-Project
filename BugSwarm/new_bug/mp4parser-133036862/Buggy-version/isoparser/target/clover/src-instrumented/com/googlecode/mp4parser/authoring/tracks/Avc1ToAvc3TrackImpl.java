/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.*;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.Path;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Converts an avc1 track to an avc3 track. The major difference is the location of SPS/PPS: While the avc1 track
 * has all SPS/PPS in the <code>SampleEntry</code> the avc3 track has all required SPS/PPS include in each sync sample.
 */
public class Avc1ToAvc3TrackImpl extends WrappingTrack {public static class __CLR4_5_26v66v6lvlulhlf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,8971,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    SampleDescriptionBox stsd;
    AvcConfigurationBox avcC;
    List<Sample> samples;

    public Avc1ToAvc3TrackImpl(Track parent) throws IOException {
        super(parent);__CLR4_5_26v66v6lvlulhlf.R.inc(8899);try{__CLR4_5_26v66v6lvlulhlf.R.inc(8898);
        __CLR4_5_26v66v6lvlulhlf.R.inc(8900);if ((((!"avc1".equals(parent.getSampleDescriptionBox().getSampleEntry().getType()))&&(__CLR4_5_26v66v6lvlulhlf.R.iget(8901)!=0|true))||(__CLR4_5_26v66v6lvlulhlf.R.iget(8902)==0&false))) {{
            __CLR4_5_26v66v6lvlulhlf.R.inc(8903);throw new RuntimeException("Only avc1 tracks can be converted to avc3 tracks");
        }

        }__CLR4_5_26v66v6lvlulhlf.R.inc(8904);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_26v66v6lvlulhlf.R.inc(8905);parent.getSampleDescriptionBox().getBox(Channels.newChannel(baos));
        __CLR4_5_26v66v6lvlulhlf.R.inc(8906);IsoFile isoFile = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));
        __CLR4_5_26v66v6lvlulhlf.R.inc(8907);this.stsd = Path.getPath(isoFile, "stsd");
        __CLR4_5_26v66v6lvlulhlf.R.inc(8908);((VisualSampleEntry) stsd.getSampleEntry()).setType("avc3");

        __CLR4_5_26v66v6lvlulhlf.R.inc(8909);avcC = Path.getPath(stsd, "avc./avcC");

        __CLR4_5_26v66v6lvlulhlf.R.inc(8910);samples = new ReplaceSyncSamplesList(parent.getSamples());
    }finally{__CLR4_5_26v66v6lvlulhlf.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_26v66v6lvlulhlf.R.inc(8911);
        __CLR4_5_26v66v6lvlulhlf.R.inc(8912);return stsd;
    }finally{__CLR4_5_26v66v6lvlulhlf.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_26v66v6lvlulhlf.R.inc(8913);
        __CLR4_5_26v66v6lvlulhlf.R.inc(8914);return samples;
    }finally{__CLR4_5_26v66v6lvlulhlf.R.flushNeeded();}}

    private class ReplaceSyncSamplesList extends AbstractList<Sample> {
        List<Sample> parentSamples;
        public ReplaceSyncSamplesList(List<Sample> parentSamples) {try{__CLR4_5_26v66v6lvlulhlf.R.inc(8915);
            __CLR4_5_26v66v6lvlulhlf.R.inc(8916);this.parentSamples = parentSamples;
        }finally{__CLR4_5_26v66v6lvlulhlf.R.flushNeeded();}}

        @Override
        public Sample get(final int index) {try{__CLR4_5_26v66v6lvlulhlf.R.inc(8917);
            __CLR4_5_26v66v6lvlulhlf.R.inc(8918);if ((((Arrays.binarySearch(Avc1ToAvc3TrackImpl.this.getSyncSamples(), index + 1) >= 0)&&(__CLR4_5_26v66v6lvlulhlf.R.iget(8919)!=0|true))||(__CLR4_5_26v66v6lvlulhlf.R.iget(8920)==0&false))) {{
                __CLR4_5_26v66v6lvlulhlf.R.inc(8921);final int len = avcC.getLengthSizeMinusOne()+1;
                __CLR4_5_26v66v6lvlulhlf.R.inc(8922);final ByteBuffer buf = ByteBuffer.allocate(len);
                __CLR4_5_26v66v6lvlulhlf.R.inc(8923);final Sample orignalSample = parentSamples.get(index);
                __CLR4_5_26v66v6lvlulhlf.R.inc(8924);return new Sample() {

                    public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_26v66v6lvlulhlf.R.inc(8925);

                        __CLR4_5_26v66v6lvlulhlf.R.inc(8926);for (byte[] bytes : avcC.getSequenceParameterSets()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8927);IsoTypeWriterVariable.write(bytes.length, (ByteBuffer) buf.rewind(), len);
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8928);channel.write((ByteBuffer) buf.rewind());
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8929);channel.write(ByteBuffer.wrap(bytes));
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8930);for (byte[] bytes : avcC.getSequenceParameterSetExts()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8931);IsoTypeWriterVariable.write(bytes.length, (ByteBuffer) buf.rewind(), len);
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8932);channel.write((ByteBuffer) buf.rewind());
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8933);channel.write(ByteBuffer.wrap(bytes));
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8934);for (byte[] bytes : avcC.getPictureParameterSets()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8935);IsoTypeWriterVariable.write(bytes.length, (ByteBuffer) buf.rewind(), len);
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8936);channel.write((ByteBuffer) buf.rewind());
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8937);channel.write(ByteBuffer.wrap(bytes));
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8938);orignalSample.writeTo(channel);
                    }finally{__CLR4_5_26v66v6lvlulhlf.R.flushNeeded();}}

                    public long getSize() {try{__CLR4_5_26v66v6lvlulhlf.R.inc(8939);

                        __CLR4_5_26v66v6lvlulhlf.R.inc(8940);int spsPpsSize = 0;
                        __CLR4_5_26v66v6lvlulhlf.R.inc(8941);for (byte[] bytes : avcC.getSequenceParameterSets()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8942);spsPpsSize += len + bytes.length;
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8943);for (byte[] bytes : avcC.getSequenceParameterSetExts()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8944);spsPpsSize += len + bytes.length;
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8945);for (byte[] bytes : avcC.getPictureParameterSets()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8946);spsPpsSize += len + bytes.length;
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8947);return orignalSample.getSize() + spsPpsSize;
                    }finally{__CLR4_5_26v66v6lvlulhlf.R.flushNeeded();}}

                    public ByteBuffer asByteBuffer() {try{__CLR4_5_26v66v6lvlulhlf.R.inc(8948);

                        __CLR4_5_26v66v6lvlulhlf.R.inc(8949);int spsPpsSize = 0;
                        __CLR4_5_26v66v6lvlulhlf.R.inc(8950);for (byte[] bytes : avcC.getSequenceParameterSets()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8951);spsPpsSize += len + bytes.length;
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8952);for (byte[] bytes : avcC.getSequenceParameterSetExts()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8953);spsPpsSize += len + bytes.length;
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8954);for (byte[] bytes : avcC.getPictureParameterSets()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8955);spsPpsSize += len + bytes.length;
                        }



                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8956);ByteBuffer data = ByteBuffer.allocate (l2i(orignalSample.getSize()) + spsPpsSize);
                        __CLR4_5_26v66v6lvlulhlf.R.inc(8957);for (byte[] bytes : avcC.getSequenceParameterSets()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8958);IsoTypeWriterVariable.write(bytes.length, data, len);
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8959);data.put(bytes);
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8960);for (byte[] bytes : avcC.getSequenceParameterSetExts()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8961);IsoTypeWriterVariable.write(bytes.length, data, len);
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8962);data.put(bytes);
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8963);for (byte[] bytes : avcC.getPictureParameterSets()) {{
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8964);IsoTypeWriterVariable.write(bytes.length, data, len);
                            __CLR4_5_26v66v6lvlulhlf.R.inc(8965);data.put(bytes);
                        }
                        }__CLR4_5_26v66v6lvlulhlf.R.inc(8966);data.put(orignalSample.asByteBuffer());
                        __CLR4_5_26v66v6lvlulhlf.R.inc(8967);return (ByteBuffer) data.rewind();
                    }finally{__CLR4_5_26v66v6lvlulhlf.R.flushNeeded();}}
                };

            } }else {{
                __CLR4_5_26v66v6lvlulhlf.R.inc(8968);return parentSamples.get(index);
            }
        }}finally{__CLR4_5_26v66v6lvlulhlf.R.flushNeeded();}}

        @Override
        public int size() {try{__CLR4_5_26v66v6lvlulhlf.R.inc(8969);
            __CLR4_5_26v66v6lvlulhlf.R.inc(8970);return parentSamples.size();
        }finally{__CLR4_5_26v66v6lvlulhlf.R.flushNeeded();}}
    }

}
