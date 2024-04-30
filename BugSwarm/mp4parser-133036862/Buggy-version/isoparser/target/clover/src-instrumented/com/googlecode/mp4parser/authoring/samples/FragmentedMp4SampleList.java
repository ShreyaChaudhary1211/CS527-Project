/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.*;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.Path;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.*;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Created by sannies on 25.05.13.
 */
public class FragmentedMp4SampleList extends AbstractList<Sample> {public static class __CLR4_5_25tq5tqlvlulfz5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,7736,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Container topLevel;
    IsoFile[] fragments;
    TrackBox trackBox = null;
    TrackExtendsBox trex = null;
    private SoftReference<Sample> sampleCache[];
    private List<TrackFragmentBox> allTrafs;
    private Map<TrackRunBox, SoftReference<ByteBuffer>>
            trunDataCache = new HashMap<TrackRunBox, SoftReference<ByteBuffer>>();
    private int firstSamples[];
    private int size_ = -1;

    public FragmentedMp4SampleList(long track, Container topLevel, IsoFile... fragments) {try{__CLR4_5_25tq5tqlvlulfz5.R.inc(7550);
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7551);this.topLevel = topLevel;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7552);this.fragments = fragments;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7553);List<TrackBox> tbs = Path.getPaths(topLevel, "moov[0]/trak");
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7554);for (TrackBox tb : tbs) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7555);if ((((tb.getTrackHeaderBox().getTrackId() == track)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7556)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7557)==0&false))) {{
                __CLR4_5_25tq5tqlvlulfz5.R.inc(7558);trackBox = tb;
            }
        }}
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7559);if ((((trackBox == null)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7560)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7561)==0&false))) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7562);throw new RuntimeException("This MP4 does not contain track " + track);
        }

        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7563);List<TrackExtendsBox> trexs = Path.getPaths(topLevel, "moov[0]/mvex[0]/trex");
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7564);for (TrackExtendsBox box : trexs) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7565);if ((((box.getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7566)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7567)==0&false))) {{
                __CLR4_5_25tq5tqlvlulfz5.R.inc(7568);trex = box;
            }
        }}
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7569);sampleCache = (SoftReference<Sample>[]) Array.newInstance(SoftReference.class, size());
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7570);initAllFragments();
    }finally{__CLR4_5_25tq5tqlvlulfz5.R.flushNeeded();}}

    private List<TrackFragmentBox> initAllFragments() {try{__CLR4_5_25tq5tqlvlulfz5.R.inc(7571);
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7572);if ((((allTrafs != null)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7573)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7574)==0&false))) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7575);return allTrafs;
        }
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7576);List<TrackFragmentBox> trafs = new ArrayList<TrackFragmentBox>();
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7577);for (MovieFragmentBox moof : topLevel.getBoxes(MovieFragmentBox.class)) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7578);for (TrackFragmentBox trackFragmentBox : moof.getBoxes(TrackFragmentBox.class)) {{
                __CLR4_5_25tq5tqlvlulfz5.R.inc(7579);if ((((trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7580)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7581)==0&false))) {{
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7582);trafs.add(trackFragmentBox);
                }
            }}
        }}
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7583);if ((((fragments != null)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7584)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7585)==0&false))) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7586);for (IsoFile fragment : fragments) {{
                __CLR4_5_25tq5tqlvlulfz5.R.inc(7587);for (MovieFragmentBox moof : fragment.getBoxes(MovieFragmentBox.class)) {{
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7588);for (TrackFragmentBox trackFragmentBox : moof.getBoxes(TrackFragmentBox.class)) {{
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7589);if ((((trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7590)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7591)==0&false))) {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7592);trafs.add(trackFragmentBox);
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7593);allTrafs = trafs;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7594);int firstSample = 1;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7595);firstSamples = new int[allTrafs.size()];
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7596);for (int i = 0; (((i < allTrafs.size())&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7597)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7598)==0&false)); i++) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7599);firstSamples[i] = firstSample;
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7600);firstSample += getTrafSize(allTrafs.get(i));
        }
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7601);return trafs;
    }finally{__CLR4_5_25tq5tqlvlulfz5.R.flushNeeded();}}

    private int getTrafSize(TrackFragmentBox traf) {try{__CLR4_5_25tq5tqlvlulfz5.R.inc(7602);
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7603);List<Box> boxes = traf.getBoxes();
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7604);int size = 0;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7605);for (int i = 0; (((i < boxes.size())&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7606)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7607)==0&false)); i++) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7608);Box b = boxes.get(i);
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7609);if ((((b instanceof TrackRunBox)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7610)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7611)==0&false))) {{
                __CLR4_5_25tq5tqlvlulfz5.R.inc(7612);size += l2i(((TrackRunBox) b).getSampleCount());
            }
        }}
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7613);return size;
    }finally{__CLR4_5_25tq5tqlvlulfz5.R.flushNeeded();}}

    @Override
    public Sample get(int index) {try{__CLR4_5_25tq5tqlvlulfz5.R.inc(7614);

        __CLR4_5_25tq5tqlvlulfz5.R.inc(7615);Sample cachedSample;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7616);if (sampleCache[index] != null && (cachedSample = sampleCache[index].get()) != null) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7619);return cachedSample;
        }


        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7620);int targetIndex = index + 1;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7621);int j = firstSamples.length - 1;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7622);while ((((targetIndex - firstSamples[j] < 0)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7623)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7624)==0&false))) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7625);j--;
        }
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7626);TrackFragmentBox trackFragmentBox = allTrafs.get(j);
        // we got the correct traf.
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7627);int sampleIndexWithInTraf = targetIndex - firstSamples[j];
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7628);int previousTrunsSize = 0;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7629);MovieFragmentBox moof = ((MovieFragmentBox) trackFragmentBox.getParent());

        __CLR4_5_25tq5tqlvlulfz5.R.inc(7630);for (Box box : trackFragmentBox.getBoxes()) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7631);if ((((box instanceof TrackRunBox)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7632)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7633)==0&false))) {{
                __CLR4_5_25tq5tqlvlulfz5.R.inc(7634);TrackRunBox trun = (TrackRunBox) box;


                __CLR4_5_25tq5tqlvlulfz5.R.inc(7635);if ((((trun.getEntries().size() <= (sampleIndexWithInTraf - previousTrunsSize))&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7636)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7637)==0&false))) {{
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7638);previousTrunsSize += trun.getEntries().size();
                } }else {{
                    // we are in correct trun box


                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7639);List<TrackRunBox.Entry> trackRunEntries = trun.getEntries();
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7640);TrackFragmentHeaderBox tfhd = trackFragmentBox.getTrackFragmentHeaderBox();
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7641);boolean sampleSizePresent = trun.isSampleSizePresent();
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7642);boolean hasDefaultSampleSize = tfhd.hasDefaultSampleSize();
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7643);long defaultSampleSize = 0;
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7644);if ((((!sampleSizePresent)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7645)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7646)==0&false))) {{
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7647);if ((((hasDefaultSampleSize)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7648)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7649)==0&false))) {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7650);defaultSampleSize = tfhd.getDefaultSampleSize();
                        } }else {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7651);if ((((trex == null)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7652)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7653)==0&false))) {{
                                __CLR4_5_25tq5tqlvlulfz5.R.inc(7654);throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                            }
                            }__CLR4_5_25tq5tqlvlulfz5.R.inc(7655);defaultSampleSize = trex.getDefaultSampleSize();
                        }
                    }}

                    }__CLR4_5_25tq5tqlvlulfz5.R.inc(7656);final SoftReference<ByteBuffer> trunDataRef = trunDataCache.get(trun);
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7657);ByteBuffer trunData = (((trunDataRef != null )&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7658)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7659)==0&false))? trunDataRef.get() : null;
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7660);if ((((trunData == null)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7661)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7662)==0&false))) {{
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7663);long offset = 0;
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7664);Container base;
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7665);if ((((tfhd.hasBaseDataOffset())&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7666)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7667)==0&false))) {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7668);offset += tfhd.getBaseDataOffset();
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7669);base = moof.getParent();
                        } }else {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7670);base = moof;
                        }

                        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7671);if ((((trun.isDataOffsetPresent())&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7672)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7673)==0&false))) {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7674);offset += trun.getDataOffset();
                        }
                        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7675);int size = 0;
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7676);for (TrackRunBox.Entry e : trackRunEntries) {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7677);if ((((sampleSizePresent)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7678)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7679)==0&false))) {{
                                __CLR4_5_25tq5tqlvlulfz5.R.inc(7680);size += e.getSampleSize();
                            } }else {{
                                __CLR4_5_25tq5tqlvlulfz5.R.inc(7681);size += defaultSampleSize;
                            }
                        }}
                        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7682);try {
                            //System.err.println("Mapped trun - offset: " + offset + " - size: " + size);
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7683);trunData = base.getByteBuffer(offset, size);
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7684);trunDataCache.put(trun, new SoftReference<ByteBuffer>(trunData));
                        } catch (IOException e) {
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7685);throw new RuntimeException(e);
                        }
                    }

                    }__CLR4_5_25tq5tqlvlulfz5.R.inc(7686);int offset = 0;
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7687);for (int i = 0; (((i < (sampleIndexWithInTraf - previousTrunsSize))&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7688)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7689)==0&false)); i++) {{
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7690);if ((((sampleSizePresent)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7691)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7692)==0&false))) {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7693);offset += trackRunEntries.get(i).getSampleSize();
                        } }else {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7694);offset += defaultSampleSize;
                        }
                    }}
                    }__CLR4_5_25tq5tqlvlulfz5.R.inc(7695);final long sampleSize;
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7696);if ((((sampleSizePresent)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7697)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7698)==0&false))) {{
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7699);sampleSize = trackRunEntries.get(sampleIndexWithInTraf- previousTrunsSize).getSampleSize();
                    } }else {{
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7700);sampleSize = defaultSampleSize;
                    }

                    }__CLR4_5_25tq5tqlvlulfz5.R.inc(7701);final ByteBuffer finalTrunData = trunData;
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7702);final int finalOffset = offset;
                    // System.err.println("sNo. " + index + " offset: " + finalOffset + " size: " + sampleSize);
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7703);Sample sample = new Sample() {
                        public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_25tq5tqlvlulfz5.R.inc(7704);
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7705);channel.write(asByteBuffer());
                        }finally{__CLR4_5_25tq5tqlvlulfz5.R.flushNeeded();}}

                        public long getSize() {try{__CLR4_5_25tq5tqlvlulfz5.R.inc(7706);
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7707);return sampleSize;
                        }finally{__CLR4_5_25tq5tqlvlulfz5.R.flushNeeded();}}

                        public ByteBuffer asByteBuffer() {try{__CLR4_5_25tq5tqlvlulfz5.R.inc(7708);
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7709);return (ByteBuffer) ((ByteBuffer)finalTrunData.position(finalOffset)).slice().limit(l2i(sampleSize));
                        }finally{__CLR4_5_25tq5tqlvlulfz5.R.flushNeeded();}}
                    };
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7710);sampleCache[index] = new SoftReference<Sample>(sample);
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7711);return sample;
                }
            }}
        }}

        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7712);throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }finally{__CLR4_5_25tq5tqlvlulfz5.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_25tq5tqlvlulfz5.R.inc(7713);
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7714);if ((((size_ != -1)&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7715)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7716)==0&false))) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7717);return size_;
        }
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7718);int i = 0;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7719);for (MovieFragmentBox moof : topLevel.getBoxes(MovieFragmentBox.class)) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7720);for (TrackFragmentBox trackFragmentBox : moof.getBoxes(TrackFragmentBox.class)) {{
                __CLR4_5_25tq5tqlvlulfz5.R.inc(7721);if ((((trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7722)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7723)==0&false))) {{
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7724);for (TrackRunBox trackRunBox : trackFragmentBox.getBoxes(TrackRunBox.class)) {{
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7725);i += trackRunBox.getSampleCount();
                    }

                }}
            }}
        }}
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7726);for (IsoFile fragment : fragments) {{
            __CLR4_5_25tq5tqlvlulfz5.R.inc(7727);for (MovieFragmentBox moof : fragment.getBoxes(MovieFragmentBox.class)) {{
                __CLR4_5_25tq5tqlvlulfz5.R.inc(7728);for (TrackFragmentBox trackFragmentBox : moof.getBoxes(TrackFragmentBox.class)) {{
                    __CLR4_5_25tq5tqlvlulfz5.R.inc(7729);if ((((trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25tq5tqlvlulfz5.R.iget(7730)!=0|true))||(__CLR4_5_25tq5tqlvlulfz5.R.iget(7731)==0&false))) {{
                        __CLR4_5_25tq5tqlvlulfz5.R.inc(7732);for (TrackRunBox trackRunBox : trackFragmentBox.getBoxes(TrackRunBox.class)) {{
                            __CLR4_5_25tq5tqlvlulfz5.R.inc(7733);i += trackRunBox.getSampleCount();
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_25tq5tqlvlulfz5.R.inc(7734);size_ = i;
        __CLR4_5_25tq5tqlvlulfz5.R.inc(7735);return i;
    }finally{__CLR4_5_25tq5tqlvlulfz5.R.flushNeeded();}}


}
