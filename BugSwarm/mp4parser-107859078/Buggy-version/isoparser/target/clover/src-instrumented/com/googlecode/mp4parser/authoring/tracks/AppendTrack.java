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
public class AppendTrack extends AbstractTrack {public static class __CLR4_5_26hn6hnlvl9ei4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,8803,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger LOG = Logger.getLogger(AppendTrack.class);
    Track[] tracks;
    SampleDescriptionBox stsd;
    List<Sample> lists;
    long[] decodingTimes;

    public AppendTrack(Track... tracks) throws IOException {
        super(appendTracknames(tracks));__CLR4_5_26hn6hnlvl9ei4m.R.inc(8412);try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8411);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8413);this.tracks = tracks;

        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8414);for (Track track : tracks) {{

            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8415);if ((((stsd == null)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8416)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8417)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8418);stsd = new SampleDescriptionBox();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8419);stsd.addBox(track.getSampleDescriptionBox().getBoxes(SampleEntry.class).get(0));
            } }else {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8420);stsd = mergeStsds(stsd, track.getSampleDescriptionBox());

            }
        }}
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8421);lists = new ArrayList<Sample>();

        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8422);for (Track track : tracks) {{
            //System.err.println("Track " + track + " is about to be appended");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8423);lists.addAll(track.getSamples());
        }

        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8424);int numSamples = 0;
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8425);for (Track track : tracks) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8426);numSamples += track.getSampleDurations().length;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8427);decodingTimes = new long[numSamples];
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8428);int index = 0;
        // should use system arraycopy but this works too (yes it's slow ...)
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8429);for (Track track : tracks) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8430);long[] durs = track.getSampleDurations();
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8431);System.arraycopy(durs, 0, decodingTimes, index, durs.length);
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8432);index += durs.length;
        }
    }}finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public static String appendTracknames(Track... tracks) {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8433);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8434);String name = "";
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8435);for (Track track : tracks) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8436);name += track.getName() + " + ";
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8437);return name.substring(0, name.length() - 3);
    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8438);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8439);for (Track track : tracks) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8440);track.close();
        }
    }}finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    private SampleDescriptionBox mergeStsds(SampleDescriptionBox stsd1, SampleDescriptionBox stsd2) throws IOException {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8441);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8442);ByteArrayOutputStream curBaos = new ByteArrayOutputStream();
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8443);ByteArrayOutputStream refBaos = new ByteArrayOutputStream();
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8444);try {
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8445);stsd1.getBox(Channels.newChannel(curBaos));
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8446);stsd2.getBox(Channels.newChannel(refBaos));
        } catch (IOException e) {
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8447);LOG.logError(e.getMessage());
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8448);return null;
        }
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8449);byte[] cur = curBaos.toByteArray();
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8450);byte[] ref = refBaos.toByteArray();

        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8451);if ((((!Arrays.equals(ref, cur))&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8452)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8453)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8454);SampleEntry se = mergeSampleEntry(stsd1.getBoxes(SampleEntry.class).get(0), stsd2.getBoxes(SampleEntry.class).get(0));
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8455);if ((((se != null)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8456)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8457)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8458);stsd1.setBoxes(Collections.<Box>singletonList(se));
            } }else {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8459);throw new IOException("Cannot merge " + stsd1.getBoxes(SampleEntry.class).get(0) + " and " + stsd2.getBoxes(SampleEntry.class).get(0));
            }
        }}
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8460);return stsd1;
    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    private SampleEntry mergeSampleEntry(SampleEntry se1, SampleEntry se2) {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8461);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8462);if ((((!se1.getType().equals(se2.getType()))&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8463)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8464)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8465);return null;
        } }else {__CLR4_5_26hn6hnlvl9ei4m.R.inc(8466);if ((((se1 instanceof VisualSampleEntry && se2 instanceof VisualSampleEntry)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8467)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8468)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8469);return mergeVisualSampleEntry((VisualSampleEntry) se1, (VisualSampleEntry) se2);
        } }else {__CLR4_5_26hn6hnlvl9ei4m.R.inc(8470);if ((((se1 instanceof AudioSampleEntry && se2 instanceof AudioSampleEntry)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8471)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8472)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8473);return mergeAudioSampleEntries((AudioSampleEntry) se1, (AudioSampleEntry) se2);
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8474);return null;
        }
    }}}}finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    private VisualSampleEntry mergeVisualSampleEntry(VisualSampleEntry vse1, VisualSampleEntry vse2) {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8475);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8476);VisualSampleEntry vse = new VisualSampleEntry();
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8477);if ((((vse1.getHorizresolution() == vse2.getHorizresolution())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8478)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8479)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8480);vse.setHorizresolution(vse1.getHorizresolution());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8481);LOG.logError("Horizontal Resolution differs");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8482);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8483);vse.setCompressorname(vse1.getCompressorname()); // ignore if they differ
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8484);if ((((vse1.getDepth() == vse2.getDepth())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8485)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8486)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8487);vse.setDepth(vse1.getDepth());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8488);LOG.logError("Depth differs");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8489);return null;
        }

        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8490);if ((((vse1.getFrameCount() == vse2.getFrameCount())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8491)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8492)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8493);vse.setFrameCount(vse1.getFrameCount());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8494);LOG.logError("frame count differs");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8495);return null;
        }

        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8496);if ((((vse1.getHeight() == vse2.getHeight())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8497)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8498)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8499);vse.setHeight(vse1.getHeight());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8500);LOG.logError("height differs");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8501);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8502);if ((((vse1.getWidth() == vse2.getWidth())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8503)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8504)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8505);vse.setWidth(vse1.getWidth());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8506);LOG.logError("width differs");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8507);return null;
        }

        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8508);if ((((vse1.getVertresolution() == vse2.getVertresolution())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8509)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8510)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8511);vse.setVertresolution(vse1.getVertresolution());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8512);LOG.logError("vert resolution differs");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8513);return null;
        }

        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8514);if ((((vse1.getHorizresolution() == vse2.getHorizresolution())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8515)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8516)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8517);vse.setHorizresolution(vse1.getHorizresolution());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8518);LOG.logError("horizontal resolution differs");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8519);return null;
        }

        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8520);if ((((vse1.getBoxes().size() == vse2.getBoxes().size())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8521)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8522)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8523);Iterator<Box> bxs1 = vse1.getBoxes().iterator();
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8524);Iterator<Box> bxs2 = vse2.getBoxes().iterator();
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8525);while ((((bxs1.hasNext())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8526)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8527)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8528);Box cur1 = bxs1.next();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8529);Box cur2 = bxs2.next();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8530);ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8531);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8532);try {
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8533);cur1.getBox(Channels.newChannel(baos1));
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8534);cur2.getBox(Channels.newChannel(baos2));
                } catch (IOException e) {
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8535);LOG.logWarn(e.getMessage());
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8536);return null;
                }
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8537);if ((((Arrays.equals(baos1.toByteArray(), baos2.toByteArray()))&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8538)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8539)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8540);vse.addBox(cur1);
                } }else {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8541);if ((((cur1 instanceof AbstractDescriptorBox && cur2 instanceof AbstractDescriptorBox)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8542)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8543)==0&false))) {{
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8544);BaseDescriptor esd = mergeDescriptors(((AbstractDescriptorBox) cur1).getDescriptor(), ((AbstractDescriptorBox) cur2).getDescriptor());
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8545);((AbstractDescriptorBox) cur1).setDescriptor(esd);
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8546);vse.addBox(cur1);
                    }
                }}
            }}
        }}
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8547);return vse;
    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    private AudioSampleEntry mergeAudioSampleEntries(AudioSampleEntry ase1, AudioSampleEntry ase2) {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8548);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8549);AudioSampleEntry ase = new AudioSampleEntry(ase2.getType());
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8550);if ((((ase1.getBytesPerFrame() == ase2.getBytesPerFrame())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8551)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8552)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8553);ase.setBytesPerFrame(ase1.getBytesPerFrame());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8554);LOG.logError("BytesPerFrame differ");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8555);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8556);if ((((ase1.getBytesPerPacket() == ase2.getBytesPerPacket())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8557)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8558)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8559);ase.setBytesPerPacket(ase1.getBytesPerPacket());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8560);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8561);if ((((ase1.getBytesPerSample() == ase2.getBytesPerSample())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8562)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8563)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8564);ase.setBytesPerSample(ase1.getBytesPerSample());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8565);LOG.logError("BytesPerSample differ");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8566);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8567);if ((((ase1.getChannelCount() == ase2.getChannelCount())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8568)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8569)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8570);ase.setChannelCount(ase1.getChannelCount());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8571);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8572);if ((((ase1.getPacketSize() == ase2.getPacketSize())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8573)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8574)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8575);ase.setPacketSize(ase1.getPacketSize());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8576);LOG.logError("ChannelCount differ");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8577);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8578);if ((((ase1.getCompressionId() == ase2.getCompressionId())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8579)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8580)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8581);ase.setCompressionId(ase1.getCompressionId());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8582);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8583);if ((((ase1.getSampleRate() == ase2.getSampleRate())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8584)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8585)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8586);ase.setSampleRate(ase1.getSampleRate());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8587);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8588);if ((((ase1.getSampleSize() == ase2.getSampleSize())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8589)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8590)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8591);ase.setSampleSize(ase1.getSampleSize());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8592);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8593);if ((((ase1.getSamplesPerPacket() == ase2.getSamplesPerPacket())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8594)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8595)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8596);ase.setSamplesPerPacket(ase1.getSamplesPerPacket());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8597);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8598);if ((((ase1.getSoundVersion() == ase2.getSoundVersion())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8599)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8600)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8601);ase.setSoundVersion(ase1.getSoundVersion());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8602);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8603);if ((((Arrays.equals(ase1.getSoundVersion2Data(), ase2.getSoundVersion2Data()))&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8604)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8605)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8606);ase.setSoundVersion2Data(ase1.getSoundVersion2Data());
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8607);return null;
        }
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8608);if ((((ase1.getBoxes().size() == ase2.getBoxes().size())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8609)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8610)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8611);Iterator<Box> bxs1 = ase1.getBoxes().iterator();
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8612);Iterator<Box> bxs2 = ase2.getBoxes().iterator();
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8613);while ((((bxs1.hasNext())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8614)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8615)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8616);Box cur1 = bxs1.next();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8617);Box cur2 = bxs2.next();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8618);ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8619);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8620);try {
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8621);cur1.getBox(Channels.newChannel(baos1));
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8622);cur2.getBox(Channels.newChannel(baos2));
                } catch (IOException e) {
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8623);LOG.logWarn(e.getMessage());
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8624);return null;
                }
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8625);if ((((Arrays.equals(baos1.toByteArray(), baos2.toByteArray()))&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8626)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8627)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8628);ase.addBox(cur1);
                } }else {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8629);if ((((ESDescriptorBox.TYPE.equals(cur1.getType()) && ESDescriptorBox.TYPE.equals(cur2.getType()))&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8630)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8631)==0&false))) {{
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8632);ESDescriptorBox esdsBox1 = (ESDescriptorBox) cur1;
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8633);ESDescriptorBox esdsBox2 = (ESDescriptorBox) cur2;
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8634);ESDescriptor esd = mergeDescriptors(esdsBox1.getEsDescriptor(), esdsBox2.getEsDescriptor());
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8635);esdsBox1.setDescriptor(esd);
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8636);ase.addBox(cur1);
                    }
                }}
            }}
        }}
        }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8637);return ase;

    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}


    private ESDescriptor mergeDescriptors(BaseDescriptor des1, BaseDescriptor des2) {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8638);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8639);if ((((des1 instanceof ESDescriptor && des2 instanceof ESDescriptor)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8640)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8641)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8642);ESDescriptor esds1 = (ESDescriptor) des1;
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8643);ESDescriptor esds2 = (ESDescriptor) des2;
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8644);if ((((esds1.getURLFlag() != esds2.getURLFlag())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8645)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8646)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8647);return null;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8648);if ((((esds1.getURLLength() != esds2.getURLLength())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8649)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8650)==0&false))) {{
                // ignore different urls
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8651);if ((((esds1.getDependsOnEsId() != esds2.getDependsOnEsId())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8652)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8653)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8654);return null;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8655);if ((((esds1.getEsId() != esds2.getEsId())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8656)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8657)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8658);return null;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8659);if ((((esds1.getoCREsId() != esds2.getoCREsId())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8660)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8661)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8662);return null;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8663);if ((((esds1.getoCRstreamFlag() != esds2.getoCRstreamFlag())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8664)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8665)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8666);return null;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8667);if ((((esds1.getRemoteODFlag() != esds2.getRemoteODFlag())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8668)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8669)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8670);return null;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8671);if ((((esds1.getStreamDependenceFlag() != esds2.getStreamDependenceFlag())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8672)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8673)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8674);return null;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8675);if ((((esds1.getStreamPriority() != esds2.getStreamPriority())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8676)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8677)==0&false))) {{
                // use stream prio of first (why not)
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8678);if (((((((esds1.getURLString() != null )&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8679)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8680)==0&false))? !esds1.getURLString().equals(esds2.getURLString()) : esds2.getURLString() != null)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8681)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8682)==0&false))) {{
                // ignore different urls
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8683);if (((((((esds1.getDecoderConfigDescriptor() != null )&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8684)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8685)==0&false))? !esds1.getDecoderConfigDescriptor().equals(esds2.getDecoderConfigDescriptor()) : esds2.getDecoderConfigDescriptor() != null)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8686)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8687)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8688);DecoderConfigDescriptor dcd1 = esds1.getDecoderConfigDescriptor();
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8689);DecoderConfigDescriptor dcd2 = esds2.getDecoderConfigDescriptor();

                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8690);if ((((dcd1.getAudioSpecificInfo() != null && dcd2.getAudioSpecificInfo() != null && !dcd1.getAudioSpecificInfo().equals(dcd2.getAudioSpecificInfo()))&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8691)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8692)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8693);return null;
                }
                }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8694);if ((((dcd1.getAvgBitRate() != dcd2.getAvgBitRate())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8695)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8696)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8697);dcd1.setAvgBitRate((dcd1.getAvgBitRate() + dcd2.getAvgBitRate()) / 2);
                }
                }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8698);if ((((dcd1.getBufferSizeDB() != dcd2.getBufferSizeDB())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8699)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8700)==0&false))) {{
                    // I don't care
                }

                }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8701);if (((((((dcd1.getDecoderSpecificInfo() != null )&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8702)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8703)==0&false))? !dcd1.getDecoderSpecificInfo().equals(dcd2.getDecoderSpecificInfo()) : dcd2.getDecoderSpecificInfo() != null)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8704)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8705)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8706);return null;
                }

                }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8707);if ((((dcd1.getMaxBitRate() != dcd2.getMaxBitRate())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8708)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8709)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8710);dcd1.setMaxBitRate(Math.max(dcd1.getMaxBitRate(), dcd2.getMaxBitRate()));
                }
                }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8711);if ((((!dcd1.getProfileLevelIndicationDescriptors().equals(dcd2.getProfileLevelIndicationDescriptors()))&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8712)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8713)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8714);return null;
                }

                }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8715);if ((((dcd1.getObjectTypeIndication() != dcd2.getObjectTypeIndication())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8716)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8717)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8718);return null;
                }
                }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8719);if ((((dcd1.getStreamType() != dcd2.getStreamType())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8720)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8721)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8722);return null;
                }
                }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8723);if ((((dcd1.getUpStream() != dcd2.getUpStream())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8724)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8725)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8726);return null;
                }

            }}
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8727);if (((((((esds1.getOtherDescriptors() != null )&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8728)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8729)==0&false))? !esds1.getOtherDescriptors().equals(esds2.getOtherDescriptors()) : esds2.getOtherDescriptors() != null)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8730)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8731)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8732);return null;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8733);if (((((((esds1.getSlConfigDescriptor() != null )&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8734)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8735)==0&false))? !esds1.getSlConfigDescriptor().equals(esds2.getSlConfigDescriptor()) : esds2.getSlConfigDescriptor() != null)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8736)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8737)==0&false))) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8738);return null;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8739);return esds1;
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8740);LOG.logError("I can only merge ESDescriptors");
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8741);return null;
        }
    }}finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8742);


        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8743);return lists;
    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8744);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8745);return stsd;
    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public synchronized long[] getSampleDurations() {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8746);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8747);return decodingTimes;
    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8748);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8749);if ((((tracks[0].getCompositionTimeEntries() != null && !tracks[0].getCompositionTimeEntries().isEmpty())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8750)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8751)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8752);List<int[]> lists = new LinkedList<int[]>();
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8753);for (Track track : tracks) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8754);lists.add(CompositionTimeToSample.blowupCompositionTimes(track.getCompositionTimeEntries()));
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8755);LinkedList<CompositionTimeToSample.Entry> compositionTimeEntries = new LinkedList<CompositionTimeToSample.Entry>();
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8756);for (int[] list : lists) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8757);for (int compositionTime : list) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8758);if ((((compositionTimeEntries.isEmpty() || compositionTimeEntries.getLast().getOffset() != compositionTime)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8759)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8760)==0&false))) {{
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8761);CompositionTimeToSample.Entry e = new CompositionTimeToSample.Entry(1, compositionTime);
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8762);compositionTimeEntries.add(e);
                    } }else {{
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8763);CompositionTimeToSample.Entry e = compositionTimeEntries.getLast();
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8764);e.setCount(e.getCount() + 1);
                    }
                }}
            }}
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8765);return compositionTimeEntries;
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8766);return null;
        }
    }}finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8767);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8768);if ((((tracks[0].getSyncSamples() != null && tracks[0].getSyncSamples().length > 0)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8769)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8770)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8771);int numSyncSamples = 0;
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8772);for (Track track : tracks) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8773);numSyncSamples += (((track.getSyncSamples() != null )&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8774)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8775)==0&false))? track.getSyncSamples().length : 0;
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8776);long[] returnSyncSamples = new long[numSyncSamples];

            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8777);int pos = 0;
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8778);long samplesBefore = 0;
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8779);for (Track track : tracks) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8780);if ((((track.getSyncSamples() != null)&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8781)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8782)==0&false))) {{
                    __CLR4_5_26hn6hnlvl9ei4m.R.inc(8783);for (long l : track.getSyncSamples()) {{
                        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8784);returnSyncSamples[pos++] = samplesBefore + l;
                    }
                }}
                }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8785);samplesBefore += track.getSamples().size();
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8786);return returnSyncSamples;
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8787);return null;
        }
    }}finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8788);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8789);if ((((tracks[0].getSampleDependencies() != null && !tracks[0].getSampleDependencies().isEmpty())&&(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8790)!=0|true))||(__CLR4_5_26hn6hnlvl9ei4m.R.iget(8791)==0&false))) {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8792);List<SampleDependencyTypeBox.Entry> list = new LinkedList<SampleDependencyTypeBox.Entry>();
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8793);for (Track track : tracks) {{
                __CLR4_5_26hn6hnlvl9ei4m.R.inc(8794);list.addAll(track.getSampleDependencies());
            }
            }__CLR4_5_26hn6hnlvl9ei4m.R.inc(8795);return list;
        } }else {{
            __CLR4_5_26hn6hnlvl9ei4m.R.inc(8796);return null;
        }
    }}finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8797);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8798);return tracks[0].getTrackMetaData();
    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8799);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8800);return tracks[0].getHandler();
    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_26hn6hnlvl9ei4m.R.inc(8801);
        __CLR4_5_26hn6hnlvl9ei4m.R.inc(8802);return tracks[0].getSubsampleInformationBox();
    }finally{__CLR4_5_26hn6hnlvl9ei4m.R.flushNeeded();}}

}
