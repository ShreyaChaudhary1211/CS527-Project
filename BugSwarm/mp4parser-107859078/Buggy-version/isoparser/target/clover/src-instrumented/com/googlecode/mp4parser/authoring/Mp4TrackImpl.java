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
package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.*;
import com.coremedia.iso.boxes.fragment.*;
import com.coremedia.iso.boxes.mdat.SampleList;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.Mp4Arrays;
import com.googlecode.mp4parser.util.Path;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Represents a single track of an MP4 file.
 */
public class Mp4TrackImpl extends AbstractTrack {public static class __CLR4_5_24c54c5lvl9egb2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,5828,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TrackBox trackBox;
    IsoFile[] fragments;
    private List<Sample> samples;
    private SampleDescriptionBox sampleDescriptionBox;
    private long[] decodingTimes;
    private List<CompositionTimeToSample.Entry> compositionTimeEntries;
    private long[] syncSamples = null;
    private List<SampleDependencyTypeBox.Entry> sampleDependencies;
    private TrackMetaData trackMetaData = new TrackMetaData();
    private String handler;
    private SubSampleInformationBox subSampleInformationBox = null;

    /**
     * Creates a track from a TrackBox and potentially fragments. Use <b>fragements parameter
     * only</b> to supply additional fragments that are not located in the main file.
     *
     * @param name      a name for the track for better identification
     * @param trackBox  the <code>TrackBox</code> describing the track.
     * @param fragments additional fragments if located in more than a single file
     */
    public Mp4TrackImpl(String name, TrackBox trackBox, IsoFile... fragments) {
        super(name);__CLR4_5_24c54c5lvl9egb2.R.inc(5622);try{__CLR4_5_24c54c5lvl9egb2.R.inc(5621);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5623);this.trackBox = trackBox;
        __CLR4_5_24c54c5lvl9egb2.R.inc(5624);final long trackId = trackBox.getTrackHeaderBox().getTrackId();
        __CLR4_5_24c54c5lvl9egb2.R.inc(5625);samples = new SampleList(trackBox, fragments);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5626);SampleTableBox stbl = trackBox.getMediaBox().getMediaInformationBox().getSampleTableBox();

        __CLR4_5_24c54c5lvl9egb2.R.inc(5627);handler = trackBox.getMediaBox().getHandlerBox().getHandlerType();

        __CLR4_5_24c54c5lvl9egb2.R.inc(5628);List<TimeToSampleBox.Entry> decodingTimeEntries = new ArrayList<TimeToSampleBox.Entry>();
        __CLR4_5_24c54c5lvl9egb2.R.inc(5629);compositionTimeEntries = new ArrayList<CompositionTimeToSample.Entry>();
        __CLR4_5_24c54c5lvl9egb2.R.inc(5630);sampleDependencies = new ArrayList<SampleDependencyTypeBox.Entry>();

        __CLR4_5_24c54c5lvl9egb2.R.inc(5631);decodingTimeEntries.addAll(stbl.getTimeToSampleBox().getEntries());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5632);if ((((stbl.getCompositionTimeToSample() != null)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5633)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5634)==0&false))) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5635);compositionTimeEntries.addAll(stbl.getCompositionTimeToSample().getEntries());
        }
        }__CLR4_5_24c54c5lvl9egb2.R.inc(5636);if ((((stbl.getSampleDependencyTypeBox() != null)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5637)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5638)==0&false))) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5639);sampleDependencies.addAll(stbl.getSampleDependencyTypeBox().getEntries());
        }
        }__CLR4_5_24c54c5lvl9egb2.R.inc(5640);if ((((stbl.getSyncSampleBox() != null)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5641)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5642)==0&false))) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5643);syncSamples = stbl.getSyncSampleBox().getSampleNumber();
        }
        }__CLR4_5_24c54c5lvl9egb2.R.inc(5644);subSampleInformationBox = Path.getPath(stbl, "subs");

        // gather all movie fragment boxes from the fragments
        __CLR4_5_24c54c5lvl9egb2.R.inc(5645);List<MovieFragmentBox> movieFragmentBoxes = new ArrayList<MovieFragmentBox>();
        __CLR4_5_24c54c5lvl9egb2.R.inc(5646);movieFragmentBoxes.addAll(((Box) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class));
        __CLR4_5_24c54c5lvl9egb2.R.inc(5647);for (IsoFile fragment : fragments) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5648);movieFragmentBoxes.addAll(fragment.getBoxes(MovieFragmentBox.class));
        }

        }__CLR4_5_24c54c5lvl9egb2.R.inc(5649);sampleDescriptionBox = stbl.getSampleDescriptionBox();
        __CLR4_5_24c54c5lvl9egb2.R.inc(5650);int lastSubsSample = 0;
        __CLR4_5_24c54c5lvl9egb2.R.inc(5651);final List<MovieExtendsBox> movieExtendsBoxes = trackBox.getParent().getBoxes(MovieExtendsBox.class);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5652);if ((((movieExtendsBoxes.size() > 0)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5653)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5654)==0&false))) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5655);for (MovieExtendsBox mvex : movieExtendsBoxes) {{
                __CLR4_5_24c54c5lvl9egb2.R.inc(5656);final List<TrackExtendsBox> trackExtendsBoxes = mvex.getBoxes(TrackExtendsBox.class);
                __CLR4_5_24c54c5lvl9egb2.R.inc(5657);for (TrackExtendsBox trex : trackExtendsBoxes) {{
                    __CLR4_5_24c54c5lvl9egb2.R.inc(5658);if ((((trex.getTrackId() == trackId)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5659)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5660)==0&false))) {{
                        __CLR4_5_24c54c5lvl9egb2.R.inc(5661);List<SubSampleInformationBox> subss = Path.getPaths(((Box) trackBox.getParent()).getParent(), "/moof/traf/subs");
                        __CLR4_5_24c54c5lvl9egb2.R.inc(5662);if ((((subss.size() > 0)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5663)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5664)==0&false))) {{
                            __CLR4_5_24c54c5lvl9egb2.R.inc(5665);subSampleInformationBox = new SubSampleInformationBox();
                        }

                        }__CLR4_5_24c54c5lvl9egb2.R.inc(5666);long sampleNumber = 1;
                        __CLR4_5_24c54c5lvl9egb2.R.inc(5667);for (MovieFragmentBox movieFragmentBox : movieFragmentBoxes) {{
                            __CLR4_5_24c54c5lvl9egb2.R.inc(5668);List<TrackFragmentBox> trafs = movieFragmentBox.getBoxes(TrackFragmentBox.class);
                            __CLR4_5_24c54c5lvl9egb2.R.inc(5669);for (TrackFragmentBox traf : trafs) {{
                                __CLR4_5_24c54c5lvl9egb2.R.inc(5670);if ((((traf.getTrackFragmentHeaderBox().getTrackId() == trackId)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5671)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5672)==0&false))) {{
                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5673);sampleGroups = getSampleGroups(
                                            stbl.getBoxes(SampleGroupDescriptionBox.class),  // global descriptions
                                            Path.<SampleGroupDescriptionBox>getPaths((Container) traf, "sgpd"),  // local description
                                            Path.<SampleToGroupBox>getPaths((Container) traf, "sbgp"),
                                            sampleGroups, sampleNumber - 1);

                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5674);SubSampleInformationBox subs = Path.getPath(traf, "subs");
                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5675);if ((((subs != null)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5676)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5677)==0&false))) {{
                                        __CLR4_5_24c54c5lvl9egb2.R.inc(5678);long difFromLastFragment = sampleNumber - lastSubsSample - 1;
                                        __CLR4_5_24c54c5lvl9egb2.R.inc(5679);for (SubSampleInformationBox.SubSampleEntry subSampleEntry : subs.getEntries()) {{
                                            __CLR4_5_24c54c5lvl9egb2.R.inc(5680);SubSampleInformationBox.SubSampleEntry se = new SubSampleInformationBox.SubSampleEntry();
                                            __CLR4_5_24c54c5lvl9egb2.R.inc(5681);se.getSubsampleEntries().addAll(subSampleEntry.getSubsampleEntries());
                                            __CLR4_5_24c54c5lvl9egb2.R.inc(5682);if ((((difFromLastFragment != 0)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5683)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5684)==0&false))) {{
                                                __CLR4_5_24c54c5lvl9egb2.R.inc(5685);se.setSampleDelta(difFromLastFragment + subSampleEntry.getSampleDelta());
                                                __CLR4_5_24c54c5lvl9egb2.R.inc(5686);difFromLastFragment = 0;
                                            } }else {{
                                                __CLR4_5_24c54c5lvl9egb2.R.inc(5687);se.setSampleDelta(subSampleEntry.getSampleDelta());
                                            }
                                            }__CLR4_5_24c54c5lvl9egb2.R.inc(5688);subSampleInformationBox.getEntries().add(se);
                                        }
                                    }}


                                    }__CLR4_5_24c54c5lvl9egb2.R.inc(5689);List<TrackRunBox> truns = traf.getBoxes(TrackRunBox.class);
                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5690);for (TrackRunBox trun : truns) {{
                                        __CLR4_5_24c54c5lvl9egb2.R.inc(5691);final TrackFragmentHeaderBox tfhd = ((TrackFragmentBox) trun.getParent()).getTrackFragmentHeaderBox();
                                        __CLR4_5_24c54c5lvl9egb2.R.inc(5692);boolean first = true;
                                        __CLR4_5_24c54c5lvl9egb2.R.inc(5693);for (TrackRunBox.Entry entry : trun.getEntries()) {{
                                            __CLR4_5_24c54c5lvl9egb2.R.inc(5694);if ((((trun.isSampleDurationPresent())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5695)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5696)==0&false))) {{
                                                __CLR4_5_24c54c5lvl9egb2.R.inc(5697);if ((((decodingTimeEntries.size() == 0 ||
                                                        decodingTimeEntries.get(decodingTimeEntries.size() - 1).getDelta() != entry.getSampleDuration())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5698)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5699)==0&false))) {{
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5700);decodingTimeEntries.add(new TimeToSampleBox.Entry(1, entry.getSampleDuration()));
                                                } }else {{
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5701);TimeToSampleBox.Entry e = decodingTimeEntries.get(decodingTimeEntries.size() - 1);
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5702);e.setCount(e.getCount() + 1);
                                                }
                                            }} }else {{
                                                __CLR4_5_24c54c5lvl9egb2.R.inc(5703);if ((((tfhd.hasDefaultSampleDuration())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5704)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5705)==0&false))) {{
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5706);decodingTimeEntries.add(new TimeToSampleBox.Entry(1, tfhd.getDefaultSampleDuration()));
                                                } }else {{
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5707);decodingTimeEntries.add(new TimeToSampleBox.Entry(1, trex.getDefaultSampleDuration()));
                                                }
                                            }}

                                            }__CLR4_5_24c54c5lvl9egb2.R.inc(5708);if ((((trun.isSampleCompositionTimeOffsetPresent())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5709)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5710)==0&false))) {{
                                                __CLR4_5_24c54c5lvl9egb2.R.inc(5711);if ((((compositionTimeEntries.size() == 0 ||
                                                        compositionTimeEntries.get(compositionTimeEntries.size() - 1).getOffset() != entry.getSampleCompositionTimeOffset())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5712)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5713)==0&false))) {{
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5714);compositionTimeEntries.add(new CompositionTimeToSample.Entry(1, l2i(entry.getSampleCompositionTimeOffset())));
                                                } }else {{
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5715);CompositionTimeToSample.Entry e = compositionTimeEntries.get(compositionTimeEntries.size() - 1);
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5716);e.setCount(e.getCount() + 1);
                                                }
                                            }}
                                            }__CLR4_5_24c54c5lvl9egb2.R.inc(5717);final SampleFlags sampleFlags;
                                            __CLR4_5_24c54c5lvl9egb2.R.inc(5718);if ((((trun.isSampleFlagsPresent())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5719)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5720)==0&false))) {{
                                                __CLR4_5_24c54c5lvl9egb2.R.inc(5721);sampleFlags = entry.getSampleFlags();
                                            } }else {{
                                                __CLR4_5_24c54c5lvl9egb2.R.inc(5722);if ((((first && trun.isFirstSampleFlagsPresent())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5723)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5724)==0&false))) {{
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5725);sampleFlags = trun.getFirstSampleFlags();
                                                } }else {{
                                                    __CLR4_5_24c54c5lvl9egb2.R.inc(5726);if ((((tfhd.hasDefaultSampleFlags())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5727)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5728)==0&false))) {{
                                                        __CLR4_5_24c54c5lvl9egb2.R.inc(5729);sampleFlags = tfhd.getDefaultSampleFlags();
                                                    } }else {{
                                                        __CLR4_5_24c54c5lvl9egb2.R.inc(5730);sampleFlags = trex.getDefaultSampleFlags();
                                                    }
                                                }}
                                            }}
                                            }__CLR4_5_24c54c5lvl9egb2.R.inc(5731);if ((((sampleFlags != null && !sampleFlags.isSampleIsDifferenceSample())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5732)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5733)==0&false))) {{
                                                //iframe
                                                __CLR4_5_24c54c5lvl9egb2.R.inc(5734);syncSamples = Mp4Arrays.copyOfAndAppend(syncSamples, sampleNumber);
                                            }
                                            }__CLR4_5_24c54c5lvl9egb2.R.inc(5735);sampleNumber++;
                                            __CLR4_5_24c54c5lvl9egb2.R.inc(5736);first = false;
                                        }
                                    }}
                                }}
                            }}
                        }}

                    }}
                }}
            }}
        }} }else {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5737);sampleGroups = getSampleGroups(stbl.getBoxes(SampleGroupDescriptionBox.class), null, stbl.getBoxes(SampleToGroupBox.class), sampleGroups, 0);
        }

        }__CLR4_5_24c54c5lvl9egb2.R.inc(5738);decodingTimes = TimeToSampleBox.blowupTimeToSamples(decodingTimeEntries);

        __CLR4_5_24c54c5lvl9egb2.R.inc(5739);MediaHeaderBox mdhd = trackBox.getMediaBox().getMediaHeaderBox();
        __CLR4_5_24c54c5lvl9egb2.R.inc(5740);TrackHeaderBox tkhd = trackBox.getTrackHeaderBox();

        __CLR4_5_24c54c5lvl9egb2.R.inc(5741);trackMetaData.setTrackId(tkhd.getTrackId());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5742);trackMetaData.setCreationTime(mdhd.getCreationTime());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5743);trackMetaData.setLanguage(mdhd.getLanguage());

        __CLR4_5_24c54c5lvl9egb2.R.inc(5744);trackMetaData.setModificationTime(mdhd.getModificationTime());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5745);trackMetaData.setTimescale(mdhd.getTimescale());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5746);trackMetaData.setHeight(tkhd.getHeight());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5747);trackMetaData.setWidth(tkhd.getWidth());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5748);trackMetaData.setLayer(tkhd.getLayer());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5749);trackMetaData.setMatrix(tkhd.getMatrix());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5750);trackMetaData.setVolume(tkhd.getVolume());
        __CLR4_5_24c54c5lvl9egb2.R.inc(5751);EditListBox elst = Path.getPath(trackBox, "edts/elst");
        __CLR4_5_24c54c5lvl9egb2.R.inc(5752);MovieHeaderBox mvhd = Path.getPath(trackBox, "../mvhd");
        __CLR4_5_24c54c5lvl9egb2.R.inc(5753);if ((((elst != null)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5754)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5755)==0&false))) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5756);for (EditListBox.Entry e : elst.getEntries()) {{
                __CLR4_5_24c54c5lvl9egb2.R.inc(5757);edits.add(new Edit(e.getMediaTime(), mdhd.getTimescale(), e.getMediaRate(), (double) e.getSegmentDuration() / mvhd.getTimescale()));
            }
        }}

    }}finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    private Map<GroupEntry, long[]> getSampleGroups(List<SampleGroupDescriptionBox> globalSgdbs, List<SampleGroupDescriptionBox> localSgdbs, List<SampleToGroupBox> sbgps,
                                                    Map<GroupEntry, long[]> sampleGroups, long startIndex) {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5758);

        __CLR4_5_24c54c5lvl9egb2.R.inc(5759);for (SampleToGroupBox sbgp : sbgps) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5760);int sampleNum = 0;
            __CLR4_5_24c54c5lvl9egb2.R.inc(5761);for (SampleToGroupBox.Entry entry : sbgp.getEntries()) {{
                __CLR4_5_24c54c5lvl9egb2.R.inc(5762);if ((((entry.getGroupDescriptionIndex() > 0)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5763)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5764)==0&false))) {{
                    __CLR4_5_24c54c5lvl9egb2.R.inc(5765);GroupEntry groupEntry = null;
                    __CLR4_5_24c54c5lvl9egb2.R.inc(5766);if ((((entry.getGroupDescriptionIndex() > 0xffff)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5767)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5768)==0&false))) {{
                        __CLR4_5_24c54c5lvl9egb2.R.inc(5769);for (SampleGroupDescriptionBox localSgdb : localSgdbs) {{
                            __CLR4_5_24c54c5lvl9egb2.R.inc(5770);if ((((localSgdb.getGroupingType().equals(sbgp.getGroupingType()))&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5771)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5772)==0&false))) {{
                                __CLR4_5_24c54c5lvl9egb2.R.inc(5773);groupEntry = localSgdb.getGroupEntries().get((entry.getGroupDescriptionIndex() - 1) & 0xffff);
                            }
                        }}
                    }} }else {{
                        __CLR4_5_24c54c5lvl9egb2.R.inc(5774);for (SampleGroupDescriptionBox globalSgdb : globalSgdbs) {{
                            __CLR4_5_24c54c5lvl9egb2.R.inc(5775);if ((((globalSgdb.getGroupingType().equals(sbgp.getGroupingType()))&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5776)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5777)==0&false))) {{
                                __CLR4_5_24c54c5lvl9egb2.R.inc(5778);groupEntry = globalSgdb.getGroupEntries().get((entry.getGroupDescriptionIndex() - 1));
                            }
                        }}
                    }}
                    }assert (((groupEntry != null)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5779)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5780)==0&false));
                    __CLR4_5_24c54c5lvl9egb2.R.inc(5781);long[] samples = sampleGroups.get(groupEntry);
                    __CLR4_5_24c54c5lvl9egb2.R.inc(5782);if ((((samples == null)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5783)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5784)==0&false))) {{
                        __CLR4_5_24c54c5lvl9egb2.R.inc(5785);samples = new long[0];
                    }

                    }__CLR4_5_24c54c5lvl9egb2.R.inc(5786);long[] nuSamples = new long[l2i(entry.getSampleCount()) + samples.length];
                    __CLR4_5_24c54c5lvl9egb2.R.inc(5787);System.arraycopy(samples, 0, nuSamples, 0, samples.length);
                    __CLR4_5_24c54c5lvl9egb2.R.inc(5788);for (int i = 0; (((i < entry.getSampleCount())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5789)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5790)==0&false)); i++) {{
                        __CLR4_5_24c54c5lvl9egb2.R.inc(5791);nuSamples[samples.length + i] = startIndex + sampleNum + i;
                    }
                    }__CLR4_5_24c54c5lvl9egb2.R.inc(5792);sampleGroups.put(groupEntry, nuSamples);

                }
                }__CLR4_5_24c54c5lvl9egb2.R.inc(5793);sampleNum += entry.getSampleCount();
            }
        }}


        }__CLR4_5_24c54c5lvl9egb2.R.inc(5794);return sampleGroups;
    }finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5795);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5796);Container c = trackBox.getParent();
        __CLR4_5_24c54c5lvl9egb2.R.inc(5797);if ((((c instanceof BasicContainer)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5798)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5799)==0&false))) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5800);((BasicContainer) c).close();
        }
        }__CLR4_5_24c54c5lvl9egb2.R.inc(5801);if ((((fragments != null)&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5802)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5803)==0&false))) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5804);for (IsoFile fragment : fragments) {{
                __CLR4_5_24c54c5lvl9egb2.R.inc(5805);fragment.close();
            }
        }}


    }}finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5806);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5807);return samples;
    }finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public synchronized long[] getSampleDurations() {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5808);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5809);return decodingTimes;
    }finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5810);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5811);return sampleDescriptionBox;
    }finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5812);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5813);return compositionTimeEntries;
    }finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5814);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5815);if ((((syncSamples == null || syncSamples.length == samples.size())&&(__CLR4_5_24c54c5lvl9egb2.R.iget(5816)!=0|true))||(__CLR4_5_24c54c5lvl9egb2.R.iget(5817)==0&false))) {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5818);return null;
        } }else {{
            __CLR4_5_24c54c5lvl9egb2.R.inc(5819);return syncSamples;
        }
    }}finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5820);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5821);return sampleDependencies;
    }finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5822);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5823);return trackMetaData;
    }finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5824);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5825);return handler;
    }finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_24c54c5lvl9egb2.R.inc(5826);
        __CLR4_5_24c54c5lvl9egb2.R.inc(5827);return subSampleInformationBox;
    }finally{__CLR4_5_24c54c5lvl9egb2.R.flushNeeded();}}


}
