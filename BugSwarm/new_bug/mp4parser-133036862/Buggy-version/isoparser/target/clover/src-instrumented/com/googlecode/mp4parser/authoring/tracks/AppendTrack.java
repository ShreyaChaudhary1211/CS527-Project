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

import com.coremedia.iso.boxes.*;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.util.Logger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.*;

/**
 * Appends two or more <code>Tracks</code> of the same type. No only that the type must be equal
 * also the decoder settings must be the same.
 */
public class AppendTrack extends AbstractTrack {public static class __CLR4_5_26ka6kalvlulhjt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,8898,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger LOG = Logger.getLogger(AppendTrack.class);
    Track[] tracks;
    SampleDescriptionBox stsd;
    List<Sample> lists;
    long[] decodingTimes;

    public AppendTrack(Track... tracks) throws IOException {
        super(appendTracknames(tracks));__CLR4_5_26ka6kalvlulhjt.R.inc(8507);try{__CLR4_5_26ka6kalvlulhjt.R.inc(8506);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8508);this.tracks = tracks;

        __CLR4_5_26ka6kalvlulhjt.R.inc(8509);for (Track track : tracks) {{

            __CLR4_5_26ka6kalvlulhjt.R.inc(8510);if ((((stsd == null)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8511)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8512)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8513);stsd = new SampleDescriptionBox();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8514);stsd.addBox(track.getSampleDescriptionBox().getBoxes(SampleEntry.class).get(0));
            } }else {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8515);stsd = mergeStsds(stsd, track.getSampleDescriptionBox());

            }
        }}
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8516);lists = new ArrayList<Sample>();

        __CLR4_5_26ka6kalvlulhjt.R.inc(8517);for (Track track : tracks) {{
            //System.err.println("Track " + track + " is about to be appended");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8518);lists.addAll(track.getSamples());
        }

        }__CLR4_5_26ka6kalvlulhjt.R.inc(8519);int numSamples = 0;
        __CLR4_5_26ka6kalvlulhjt.R.inc(8520);for (Track track : tracks) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8521);numSamples += track.getSampleDurations().length;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8522);decodingTimes = new long[numSamples];
        __CLR4_5_26ka6kalvlulhjt.R.inc(8523);int index = 0;
        // should use system arraycopy but this works too (yes it's slow ...)
        __CLR4_5_26ka6kalvlulhjt.R.inc(8524);for (Track track : tracks) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8525);long[] durs = track.getSampleDurations();
            __CLR4_5_26ka6kalvlulhjt.R.inc(8526);System.arraycopy(durs, 0, decodingTimes, index, durs.length);
            __CLR4_5_26ka6kalvlulhjt.R.inc(8527);index += durs.length;
        }
    }}finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public static String appendTracknames(Track... tracks) {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8528);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8529);String name = "";
        __CLR4_5_26ka6kalvlulhjt.R.inc(8530);for (Track track : tracks) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8531);name += track.getName() + " + ";
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8532);return name.substring(0, name.length() - 3);
    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8533);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8534);for (Track track : tracks) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8535);track.close();
        }
    }}finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    private SampleDescriptionBox mergeStsds(SampleDescriptionBox stsd1, SampleDescriptionBox stsd2) throws IOException {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8536);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8537);ByteArrayOutputStream curBaos = new ByteArrayOutputStream();
        __CLR4_5_26ka6kalvlulhjt.R.inc(8538);ByteArrayOutputStream refBaos = new ByteArrayOutputStream();
        __CLR4_5_26ka6kalvlulhjt.R.inc(8539);try {
            __CLR4_5_26ka6kalvlulhjt.R.inc(8540);stsd1.getBox(Channels.newChannel(curBaos));
            __CLR4_5_26ka6kalvlulhjt.R.inc(8541);stsd2.getBox(Channels.newChannel(refBaos));
        } catch (IOException e) {
            __CLR4_5_26ka6kalvlulhjt.R.inc(8542);LOG.logError(e.getMessage());
            __CLR4_5_26ka6kalvlulhjt.R.inc(8543);return null;
        }
        __CLR4_5_26ka6kalvlulhjt.R.inc(8544);byte[] cur = curBaos.toByteArray();
        __CLR4_5_26ka6kalvlulhjt.R.inc(8545);byte[] ref = refBaos.toByteArray();

        __CLR4_5_26ka6kalvlulhjt.R.inc(8546);if ((((!Arrays.equals(ref, cur))&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8547)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8548)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8549);SampleEntry se = mergeSampleEntry(stsd1.getBoxes(SampleEntry.class).get(0), stsd2.getBoxes(SampleEntry.class).get(0));
            __CLR4_5_26ka6kalvlulhjt.R.inc(8550);if ((((se != null)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8551)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8552)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8553);stsd1.setBoxes(Collections.<Box>singletonList(se));
            } }else {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8554);throw new IOException("Cannot merge " + stsd1.getBoxes(SampleEntry.class).get(0) + " and " + stsd2.getBoxes(SampleEntry.class).get(0));
            }
        }}
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8555);return stsd1;
    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    private SampleEntry mergeSampleEntry(SampleEntry se1, SampleEntry se2) {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8556);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8557);if ((((!se1.getType().equals(se2.getType()))&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8558)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8559)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8560);return null;
        } }else {__CLR4_5_26ka6kalvlulhjt.R.inc(8561);if ((((se1 instanceof VisualSampleEntry && se2 instanceof VisualSampleEntry)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8562)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8563)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8564);return mergeVisualSampleEntry((VisualSampleEntry) se1, (VisualSampleEntry) se2);
        } }else {__CLR4_5_26ka6kalvlulhjt.R.inc(8565);if ((((se1 instanceof AudioSampleEntry && se2 instanceof AudioSampleEntry)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8566)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8567)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8568);return mergeAudioSampleEntries((AudioSampleEntry) se1, (AudioSampleEntry) se2);
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8569);return null;
        }
    }}}}finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    private VisualSampleEntry mergeVisualSampleEntry(VisualSampleEntry vse1, VisualSampleEntry vse2) {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8570);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8571);VisualSampleEntry vse = new VisualSampleEntry();
        __CLR4_5_26ka6kalvlulhjt.R.inc(8572);if ((((vse1.getHorizresolution() == vse2.getHorizresolution())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8573)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8574)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8575);vse.setHorizresolution(vse1.getHorizresolution());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8576);LOG.logError("Horizontal Resolution differs");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8577);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8578);vse.setCompressorname(vse1.getCompressorname()); // ignore if they differ
        __CLR4_5_26ka6kalvlulhjt.R.inc(8579);if ((((vse1.getDepth() == vse2.getDepth())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8580)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8581)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8582);vse.setDepth(vse1.getDepth());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8583);LOG.logError("Depth differs");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8584);return null;
        }

        }__CLR4_5_26ka6kalvlulhjt.R.inc(8585);if ((((vse1.getFrameCount() == vse2.getFrameCount())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8586)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8587)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8588);vse.setFrameCount(vse1.getFrameCount());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8589);LOG.logError("frame count differs");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8590);return null;
        }

        }__CLR4_5_26ka6kalvlulhjt.R.inc(8591);if ((((vse1.getHeight() == vse2.getHeight())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8592)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8593)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8594);vse.setHeight(vse1.getHeight());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8595);LOG.logError("height differs");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8596);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8597);if ((((vse1.getWidth() == vse2.getWidth())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8598)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8599)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8600);vse.setWidth(vse1.getWidth());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8601);LOG.logError("width differs");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8602);return null;
        }

        }__CLR4_5_26ka6kalvlulhjt.R.inc(8603);if ((((vse1.getVertresolution() == vse2.getVertresolution())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8604)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8605)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8606);vse.setVertresolution(vse1.getVertresolution());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8607);LOG.logError("vert resolution differs");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8608);return null;
        }

        }__CLR4_5_26ka6kalvlulhjt.R.inc(8609);if ((((vse1.getHorizresolution() == vse2.getHorizresolution())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8610)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8611)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8612);vse.setHorizresolution(vse1.getHorizresolution());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8613);LOG.logError("horizontal resolution differs");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8614);return null;
        }

        }__CLR4_5_26ka6kalvlulhjt.R.inc(8615);if ((((vse1.getBoxes().size() == vse2.getBoxes().size())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8616)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8617)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8618);Iterator<Box> bxs1 = vse1.getBoxes().iterator();
            __CLR4_5_26ka6kalvlulhjt.R.inc(8619);Iterator<Box> bxs2 = vse2.getBoxes().iterator();
            __CLR4_5_26ka6kalvlulhjt.R.inc(8620);while ((((bxs1.hasNext())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8621)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8622)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8623);Box cur1 = bxs1.next();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8624);Box cur2 = bxs2.next();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8625);ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8626);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8627);try {
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8628);cur1.getBox(Channels.newChannel(baos1));
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8629);cur2.getBox(Channels.newChannel(baos2));
                } catch (IOException e) {
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8630);LOG.logWarn(e.getMessage());
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8631);return null;
                }
                __CLR4_5_26ka6kalvlulhjt.R.inc(8632);if ((((Arrays.equals(baos1.toByteArray(), baos2.toByteArray()))&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8633)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8634)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8635);vse.addBox(cur1);
                } }else {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8636);if ((((cur1 instanceof AbstractDescriptorBox && cur2 instanceof AbstractDescriptorBox)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8637)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8638)==0&false))) {{
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8639);BaseDescriptor esd = mergeDescriptors(((AbstractDescriptorBox) cur1).getDescriptor(), ((AbstractDescriptorBox) cur2).getDescriptor());
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8640);((AbstractDescriptorBox) cur1).setDescriptor(esd);
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8641);vse.addBox(cur1);
                    }
                }}
            }}
        }}
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8642);return vse;
    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    private AudioSampleEntry mergeAudioSampleEntries(AudioSampleEntry ase1, AudioSampleEntry ase2) {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8643);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8644);AudioSampleEntry ase = new AudioSampleEntry(ase2.getType());
        __CLR4_5_26ka6kalvlulhjt.R.inc(8645);if ((((ase1.getBytesPerFrame() == ase2.getBytesPerFrame())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8646)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8647)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8648);ase.setBytesPerFrame(ase1.getBytesPerFrame());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8649);LOG.logError("BytesPerFrame differ");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8650);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8651);if ((((ase1.getBytesPerPacket() == ase2.getBytesPerPacket())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8652)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8653)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8654);ase.setBytesPerPacket(ase1.getBytesPerPacket());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8655);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8656);if ((((ase1.getBytesPerSample() == ase2.getBytesPerSample())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8657)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8658)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8659);ase.setBytesPerSample(ase1.getBytesPerSample());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8660);LOG.logError("BytesPerSample differ");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8661);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8662);if ((((ase1.getChannelCount() == ase2.getChannelCount())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8663)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8664)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8665);ase.setChannelCount(ase1.getChannelCount());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8666);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8667);if ((((ase1.getPacketSize() == ase2.getPacketSize())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8668)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8669)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8670);ase.setPacketSize(ase1.getPacketSize());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8671);LOG.logError("ChannelCount differ");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8672);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8673);if ((((ase1.getCompressionId() == ase2.getCompressionId())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8674)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8675)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8676);ase.setCompressionId(ase1.getCompressionId());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8677);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8678);if ((((ase1.getSampleRate() == ase2.getSampleRate())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8679)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8680)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8681);ase.setSampleRate(ase1.getSampleRate());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8682);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8683);if ((((ase1.getSampleSize() == ase2.getSampleSize())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8684)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8685)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8686);ase.setSampleSize(ase1.getSampleSize());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8687);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8688);if ((((ase1.getSamplesPerPacket() == ase2.getSamplesPerPacket())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8689)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8690)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8691);ase.setSamplesPerPacket(ase1.getSamplesPerPacket());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8692);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8693);if ((((ase1.getSoundVersion() == ase2.getSoundVersion())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8694)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8695)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8696);ase.setSoundVersion(ase1.getSoundVersion());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8697);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8698);if ((((Arrays.equals(ase1.getSoundVersion2Data(), ase2.getSoundVersion2Data()))&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8699)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8700)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8701);ase.setSoundVersion2Data(ase1.getSoundVersion2Data());
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8702);return null;
        }
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8703);if ((((ase1.getBoxes().size() == ase2.getBoxes().size())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8704)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8705)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8706);Iterator<Box> bxs1 = ase1.getBoxes().iterator();
            __CLR4_5_26ka6kalvlulhjt.R.inc(8707);Iterator<Box> bxs2 = ase2.getBoxes().iterator();
            __CLR4_5_26ka6kalvlulhjt.R.inc(8708);while ((((bxs1.hasNext())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8709)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8710)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8711);Box cur1 = bxs1.next();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8712);Box cur2 = bxs2.next();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8713);ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8714);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8715);try {
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8716);cur1.getBox(Channels.newChannel(baos1));
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8717);cur2.getBox(Channels.newChannel(baos2));
                } catch (IOException e) {
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8718);LOG.logWarn(e.getMessage());
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8719);return null;
                }
                __CLR4_5_26ka6kalvlulhjt.R.inc(8720);if ((((Arrays.equals(baos1.toByteArray(), baos2.toByteArray()))&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8721)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8722)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8723);ase.addBox(cur1);
                } }else {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8724);if ((((ESDescriptorBox.TYPE.equals(cur1.getType()) && ESDescriptorBox.TYPE.equals(cur2.getType()))&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8725)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8726)==0&false))) {{
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8727);ESDescriptorBox esdsBox1 = (ESDescriptorBox) cur1;
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8728);ESDescriptorBox esdsBox2 = (ESDescriptorBox) cur2;
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8729);ESDescriptor esd = mergeDescriptors(esdsBox1.getEsDescriptor(), esdsBox2.getEsDescriptor());
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8730);esdsBox1.setDescriptor(esd);
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8731);ase.addBox(cur1);
                    }
                }}
            }}
        }}
        }__CLR4_5_26ka6kalvlulhjt.R.inc(8732);return ase;

    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}


    private ESDescriptor mergeDescriptors(BaseDescriptor des1, BaseDescriptor des2) {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8733);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8734);if ((((des1 instanceof ESDescriptor && des2 instanceof ESDescriptor)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8735)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8736)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8737);ESDescriptor esds1 = (ESDescriptor) des1;
            __CLR4_5_26ka6kalvlulhjt.R.inc(8738);ESDescriptor esds2 = (ESDescriptor) des2;
            __CLR4_5_26ka6kalvlulhjt.R.inc(8739);if ((((esds1.getURLFlag() != esds2.getURLFlag())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8740)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8741)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8742);return null;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8743);if ((((esds1.getURLLength() != esds2.getURLLength())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8744)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8745)==0&false))) {{
                // ignore different urls
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8746);if ((((esds1.getDependsOnEsId() != esds2.getDependsOnEsId())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8747)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8748)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8749);return null;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8750);if ((((esds1.getEsId() != esds2.getEsId())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8751)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8752)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8753);return null;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8754);if ((((esds1.getoCREsId() != esds2.getoCREsId())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8755)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8756)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8757);return null;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8758);if ((((esds1.getoCRstreamFlag() != esds2.getoCRstreamFlag())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8759)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8760)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8761);return null;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8762);if ((((esds1.getRemoteODFlag() != esds2.getRemoteODFlag())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8763)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8764)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8765);return null;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8766);if ((((esds1.getStreamDependenceFlag() != esds2.getStreamDependenceFlag())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8767)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8768)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8769);return null;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8770);if ((((esds1.getStreamPriority() != esds2.getStreamPriority())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8771)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8772)==0&false))) {{
                // use stream prio of first (why not)
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8773);if (((((((esds1.getURLString() != null )&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8774)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8775)==0&false))? !esds1.getURLString().equals(esds2.getURLString()) : esds2.getURLString() != null)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8776)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8777)==0&false))) {{
                // ignore different urls
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8778);if (((((((esds1.getDecoderConfigDescriptor() != null )&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8779)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8780)==0&false))? !esds1.getDecoderConfigDescriptor().equals(esds2.getDecoderConfigDescriptor()) : esds2.getDecoderConfigDescriptor() != null)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8781)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8782)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8783);DecoderConfigDescriptor dcd1 = esds1.getDecoderConfigDescriptor();
                __CLR4_5_26ka6kalvlulhjt.R.inc(8784);DecoderConfigDescriptor dcd2 = esds2.getDecoderConfigDescriptor();

                __CLR4_5_26ka6kalvlulhjt.R.inc(8785);if ((((dcd1.getAudioSpecificInfo() != null && dcd2.getAudioSpecificInfo() != null && !dcd1.getAudioSpecificInfo().equals(dcd2.getAudioSpecificInfo()))&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8786)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8787)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8788);return null;
                }
                }__CLR4_5_26ka6kalvlulhjt.R.inc(8789);if ((((dcd1.getAvgBitRate() != dcd2.getAvgBitRate())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8790)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8791)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8792);dcd1.setAvgBitRate((dcd1.getAvgBitRate() + dcd2.getAvgBitRate()) / 2);
                }
                }__CLR4_5_26ka6kalvlulhjt.R.inc(8793);if ((((dcd1.getBufferSizeDB() != dcd2.getBufferSizeDB())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8794)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8795)==0&false))) {{
                    // I don't care
                }

                }__CLR4_5_26ka6kalvlulhjt.R.inc(8796);if (((((((dcd1.getDecoderSpecificInfo() != null )&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8797)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8798)==0&false))? !dcd1.getDecoderSpecificInfo().equals(dcd2.getDecoderSpecificInfo()) : dcd2.getDecoderSpecificInfo() != null)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8799)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8800)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8801);return null;
                }

                }__CLR4_5_26ka6kalvlulhjt.R.inc(8802);if ((((dcd1.getMaxBitRate() != dcd2.getMaxBitRate())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8803)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8804)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8805);dcd1.setMaxBitRate(Math.max(dcd1.getMaxBitRate(), dcd2.getMaxBitRate()));
                }
                }__CLR4_5_26ka6kalvlulhjt.R.inc(8806);if ((((!dcd1.getProfileLevelIndicationDescriptors().equals(dcd2.getProfileLevelIndicationDescriptors()))&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8807)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8808)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8809);return null;
                }

                }__CLR4_5_26ka6kalvlulhjt.R.inc(8810);if ((((dcd1.getObjectTypeIndication() != dcd2.getObjectTypeIndication())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8811)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8812)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8813);return null;
                }
                }__CLR4_5_26ka6kalvlulhjt.R.inc(8814);if ((((dcd1.getStreamType() != dcd2.getStreamType())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8815)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8816)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8817);return null;
                }
                }__CLR4_5_26ka6kalvlulhjt.R.inc(8818);if ((((dcd1.getUpStream() != dcd2.getUpStream())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8819)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8820)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8821);return null;
                }

            }}
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8822);if (((((((esds1.getOtherDescriptors() != null )&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8823)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8824)==0&false))? !esds1.getOtherDescriptors().equals(esds2.getOtherDescriptors()) : esds2.getOtherDescriptors() != null)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8825)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8826)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8827);return null;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8828);if (((((((esds1.getSlConfigDescriptor() != null )&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8829)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8830)==0&false))? !esds1.getSlConfigDescriptor().equals(esds2.getSlConfigDescriptor()) : esds2.getSlConfigDescriptor() != null)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8831)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8832)==0&false))) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8833);return null;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8834);return esds1;
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8835);LOG.logError("I can only merge ESDescriptors");
            __CLR4_5_26ka6kalvlulhjt.R.inc(8836);return null;
        }
    }}finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8837);


        __CLR4_5_26ka6kalvlulhjt.R.inc(8838);return lists;
    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8839);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8840);return stsd;
    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public synchronized long[] getSampleDurations() {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8841);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8842);return decodingTimes;
    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8843);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8844);if ((((tracks[0].getCompositionTimeEntries() != null && !tracks[0].getCompositionTimeEntries().isEmpty())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8845)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8846)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8847);List<int[]> lists = new LinkedList<int[]>();
            __CLR4_5_26ka6kalvlulhjt.R.inc(8848);for (Track track : tracks) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8849);lists.add(CompositionTimeToSample.blowupCompositionTimes(track.getCompositionTimeEntries()));
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8850);LinkedList<CompositionTimeToSample.Entry> compositionTimeEntries = new LinkedList<CompositionTimeToSample.Entry>();
            __CLR4_5_26ka6kalvlulhjt.R.inc(8851);for (int[] list : lists) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8852);for (int compositionTime : list) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8853);if ((((compositionTimeEntries.isEmpty() || compositionTimeEntries.getLast().getOffset() != compositionTime)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8854)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8855)==0&false))) {{
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8856);CompositionTimeToSample.Entry e = new CompositionTimeToSample.Entry(1, compositionTime);
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8857);compositionTimeEntries.add(e);
                    } }else {{
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8858);CompositionTimeToSample.Entry e = compositionTimeEntries.getLast();
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8859);e.setCount(e.getCount() + 1);
                    }
                }}
            }}
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8860);return compositionTimeEntries;
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8861);return null;
        }
    }}finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8862);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8863);if ((((tracks[0].getSyncSamples() != null && tracks[0].getSyncSamples().length > 0)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8864)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8865)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8866);int numSyncSamples = 0;
            __CLR4_5_26ka6kalvlulhjt.R.inc(8867);for (Track track : tracks) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8868);numSyncSamples += (((track.getSyncSamples() != null )&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8869)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8870)==0&false))? track.getSyncSamples().length : 0;
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8871);long[] returnSyncSamples = new long[numSyncSamples];

            __CLR4_5_26ka6kalvlulhjt.R.inc(8872);int pos = 0;
            __CLR4_5_26ka6kalvlulhjt.R.inc(8873);long samplesBefore = 0;
            __CLR4_5_26ka6kalvlulhjt.R.inc(8874);for (Track track : tracks) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8875);if ((((track.getSyncSamples() != null)&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8876)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8877)==0&false))) {{
                    __CLR4_5_26ka6kalvlulhjt.R.inc(8878);for (long l : track.getSyncSamples()) {{
                        __CLR4_5_26ka6kalvlulhjt.R.inc(8879);returnSyncSamples[pos++] = samplesBefore + l;
                    }
                }}
                }__CLR4_5_26ka6kalvlulhjt.R.inc(8880);samplesBefore += track.getSamples().size();
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8881);return returnSyncSamples;
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8882);return null;
        }
    }}finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8883);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8884);if ((((tracks[0].getSampleDependencies() != null && !tracks[0].getSampleDependencies().isEmpty())&&(__CLR4_5_26ka6kalvlulhjt.R.iget(8885)!=0|true))||(__CLR4_5_26ka6kalvlulhjt.R.iget(8886)==0&false))) {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8887);List<SampleDependencyTypeBox.Entry> list = new LinkedList<SampleDependencyTypeBox.Entry>();
            __CLR4_5_26ka6kalvlulhjt.R.inc(8888);for (Track track : tracks) {{
                __CLR4_5_26ka6kalvlulhjt.R.inc(8889);list.addAll(track.getSampleDependencies());
            }
            }__CLR4_5_26ka6kalvlulhjt.R.inc(8890);return list;
        } }else {{
            __CLR4_5_26ka6kalvlulhjt.R.inc(8891);return null;
        }
    }}finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8892);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8893);return tracks[0].getTrackMetaData();
    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8894);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8895);return tracks[0].getHandler();
    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_26ka6kalvlulhjt.R.inc(8896);
        __CLR4_5_26ka6kalvlulhjt.R.inc(8897);return tracks[0].getSubsampleInformationBox();
    }finally{__CLR4_5_26ka6kalvlulhjt.R.flushNeeded();}}

}
