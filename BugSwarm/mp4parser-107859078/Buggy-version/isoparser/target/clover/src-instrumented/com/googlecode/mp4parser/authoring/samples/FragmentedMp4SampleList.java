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
public class FragmentedMp4SampleList extends AbstractList<Sample> {public static class __CLR4_5_25r35r3lvl9ehcy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,7641,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public FragmentedMp4SampleList(long track, Container topLevel, IsoFile... fragments) {try{__CLR4_5_25r35r3lvl9ehcy.R.inc(7455);
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7456);this.topLevel = topLevel;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7457);this.fragments = fragments;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7458);List<TrackBox> tbs = Path.getPaths(topLevel, "moov[0]/trak");
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7459);for (TrackBox tb : tbs) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7460);if ((((tb.getTrackHeaderBox().getTrackId() == track)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7461)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7462)==0&false))) {{
                __CLR4_5_25r35r3lvl9ehcy.R.inc(7463);trackBox = tb;
            }
        }}
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7464);if ((((trackBox == null)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7465)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7466)==0&false))) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7467);throw new RuntimeException("This MP4 does not contain track " + track);
        }

        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7468);List<TrackExtendsBox> trexs = Path.getPaths(topLevel, "moov[0]/mvex[0]/trex");
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7469);for (TrackExtendsBox box : trexs) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7470);if ((((box.getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7471)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7472)==0&false))) {{
                __CLR4_5_25r35r3lvl9ehcy.R.inc(7473);trex = box;
            }
        }}
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7474);sampleCache = (SoftReference<Sample>[]) Array.newInstance(SoftReference.class, size());
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7475);initAllFragments();
    }finally{__CLR4_5_25r35r3lvl9ehcy.R.flushNeeded();}}

    private List<TrackFragmentBox> initAllFragments() {try{__CLR4_5_25r35r3lvl9ehcy.R.inc(7476);
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7477);if ((((allTrafs != null)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7478)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7479)==0&false))) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7480);return allTrafs;
        }
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7481);List<TrackFragmentBox> trafs = new ArrayList<TrackFragmentBox>();
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7482);for (MovieFragmentBox moof : topLevel.getBoxes(MovieFragmentBox.class)) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7483);for (TrackFragmentBox trackFragmentBox : moof.getBoxes(TrackFragmentBox.class)) {{
                __CLR4_5_25r35r3lvl9ehcy.R.inc(7484);if ((((trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7485)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7486)==0&false))) {{
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7487);trafs.add(trackFragmentBox);
                }
            }}
        }}
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7488);if ((((fragments != null)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7489)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7490)==0&false))) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7491);for (IsoFile fragment : fragments) {{
                __CLR4_5_25r35r3lvl9ehcy.R.inc(7492);for (MovieFragmentBox moof : fragment.getBoxes(MovieFragmentBox.class)) {{
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7493);for (TrackFragmentBox trackFragmentBox : moof.getBoxes(TrackFragmentBox.class)) {{
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7494);if ((((trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7495)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7496)==0&false))) {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7497);trafs.add(trackFragmentBox);
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7498);allTrafs = trafs;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7499);int firstSample = 1;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7500);firstSamples = new int[allTrafs.size()];
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7501);for (int i = 0; (((i < allTrafs.size())&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7502)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7503)==0&false)); i++) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7504);firstSamples[i] = firstSample;
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7505);firstSample += getTrafSize(allTrafs.get(i));
        }
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7506);return trafs;
    }finally{__CLR4_5_25r35r3lvl9ehcy.R.flushNeeded();}}

    private int getTrafSize(TrackFragmentBox traf) {try{__CLR4_5_25r35r3lvl9ehcy.R.inc(7507);
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7508);List<Box> boxes = traf.getBoxes();
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7509);int size = 0;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7510);for (int i = 0; (((i < boxes.size())&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7511)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7512)==0&false)); i++) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7513);Box b = boxes.get(i);
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7514);if ((((b instanceof TrackRunBox)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7515)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7516)==0&false))) {{
                __CLR4_5_25r35r3lvl9ehcy.R.inc(7517);size += l2i(((TrackRunBox) b).getSampleCount());
            }
        }}
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7518);return size;
    }finally{__CLR4_5_25r35r3lvl9ehcy.R.flushNeeded();}}

    @Override
    public Sample get(int index) {try{__CLR4_5_25r35r3lvl9ehcy.R.inc(7519);

        __CLR4_5_25r35r3lvl9ehcy.R.inc(7520);Sample cachedSample;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7521);if (sampleCache[index] != null && (cachedSample = sampleCache[index].get()) != null) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7524);return cachedSample;
        }


        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7525);int targetIndex = index + 1;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7526);int j = firstSamples.length - 1;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7527);while ((((targetIndex - firstSamples[j] < 0)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7528)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7529)==0&false))) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7530);j--;
        }
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7531);TrackFragmentBox trackFragmentBox = allTrafs.get(j);
        // we got the correct traf.
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7532);int sampleIndexWithInTraf = targetIndex - firstSamples[j];
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7533);int previousTrunsSize = 0;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7534);MovieFragmentBox moof = ((MovieFragmentBox) trackFragmentBox.getParent());

        __CLR4_5_25r35r3lvl9ehcy.R.inc(7535);for (Box box : trackFragmentBox.getBoxes()) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7536);if ((((box instanceof TrackRunBox)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7537)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7538)==0&false))) {{
                __CLR4_5_25r35r3lvl9ehcy.R.inc(7539);TrackRunBox trun = (TrackRunBox) box;


                __CLR4_5_25r35r3lvl9ehcy.R.inc(7540);if ((((trun.getEntries().size() <= (sampleIndexWithInTraf - previousTrunsSize))&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7541)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7542)==0&false))) {{
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7543);previousTrunsSize += trun.getEntries().size();
                } }else {{
                    // we are in correct trun box


                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7544);List<TrackRunBox.Entry> trackRunEntries = trun.getEntries();
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7545);TrackFragmentHeaderBox tfhd = trackFragmentBox.getTrackFragmentHeaderBox();
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7546);boolean sampleSizePresent = trun.isSampleSizePresent();
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7547);boolean hasDefaultSampleSize = tfhd.hasDefaultSampleSize();
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7548);long defaultSampleSize = 0;
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7549);if ((((!sampleSizePresent)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7550)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7551)==0&false))) {{
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7552);if ((((hasDefaultSampleSize)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7553)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7554)==0&false))) {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7555);defaultSampleSize = tfhd.getDefaultSampleSize();
                        } }else {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7556);if ((((trex == null)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7557)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7558)==0&false))) {{
                                __CLR4_5_25r35r3lvl9ehcy.R.inc(7559);throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                            }
                            }__CLR4_5_25r35r3lvl9ehcy.R.inc(7560);defaultSampleSize = trex.getDefaultSampleSize();
                        }
                    }}

                    }__CLR4_5_25r35r3lvl9ehcy.R.inc(7561);final SoftReference<ByteBuffer> trunDataRef = trunDataCache.get(trun);
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7562);ByteBuffer trunData = (((trunDataRef != null )&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7563)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7564)==0&false))? trunDataRef.get() : null;
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7565);if ((((trunData == null)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7566)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7567)==0&false))) {{
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7568);long offset = 0;
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7569);Container base;
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7570);if ((((tfhd.hasBaseDataOffset())&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7571)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7572)==0&false))) {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7573);offset += tfhd.getBaseDataOffset();
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7574);base = moof.getParent();
                        } }else {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7575);base = moof;
                        }

                        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7576);if ((((trun.isDataOffsetPresent())&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7577)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7578)==0&false))) {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7579);offset += trun.getDataOffset();
                        }
                        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7580);int size = 0;
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7581);for (TrackRunBox.Entry e : trackRunEntries) {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7582);if ((((sampleSizePresent)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7583)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7584)==0&false))) {{
                                __CLR4_5_25r35r3lvl9ehcy.R.inc(7585);size += e.getSampleSize();
                            } }else {{
                                __CLR4_5_25r35r3lvl9ehcy.R.inc(7586);size += defaultSampleSize;
                            }
                        }}
                        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7587);try {
                            //System.err.println("Mapped trun - offset: " + offset + " - size: " + size);
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7588);trunData = base.getByteBuffer(offset, size);
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7589);trunDataCache.put(trun, new SoftReference<ByteBuffer>(trunData));
                        } catch (IOException e) {
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7590);throw new RuntimeException(e);
                        }
                    }

                    }__CLR4_5_25r35r3lvl9ehcy.R.inc(7591);int offset = 0;
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7592);for (int i = 0; (((i < (sampleIndexWithInTraf - previousTrunsSize))&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7593)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7594)==0&false)); i++) {{
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7595);if ((((sampleSizePresent)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7596)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7597)==0&false))) {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7598);offset += trackRunEntries.get(i).getSampleSize();
                        } }else {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7599);offset += defaultSampleSize;
                        }
                    }}
                    }__CLR4_5_25r35r3lvl9ehcy.R.inc(7600);final long sampleSize;
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7601);if ((((sampleSizePresent)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7602)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7603)==0&false))) {{
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7604);sampleSize = trackRunEntries.get(sampleIndexWithInTraf- previousTrunsSize).getSampleSize();
                    } }else {{
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7605);sampleSize = defaultSampleSize;
                    }

                    }__CLR4_5_25r35r3lvl9ehcy.R.inc(7606);final ByteBuffer finalTrunData = trunData;
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7607);final int finalOffset = offset;
                    // System.err.println("sNo. " + index + " offset: " + finalOffset + " size: " + sampleSize);
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7608);Sample sample = new Sample() {
                        public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_25r35r3lvl9ehcy.R.inc(7609);
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7610);channel.write(asByteBuffer());
                        }finally{__CLR4_5_25r35r3lvl9ehcy.R.flushNeeded();}}

                        public long getSize() {try{__CLR4_5_25r35r3lvl9ehcy.R.inc(7611);
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7612);return sampleSize;
                        }finally{__CLR4_5_25r35r3lvl9ehcy.R.flushNeeded();}}

                        public ByteBuffer asByteBuffer() {try{__CLR4_5_25r35r3lvl9ehcy.R.inc(7613);
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7614);return (ByteBuffer) ((ByteBuffer)finalTrunData.position(finalOffset)).slice().limit(l2i(sampleSize));
                        }finally{__CLR4_5_25r35r3lvl9ehcy.R.flushNeeded();}}
                    };
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7615);sampleCache[index] = new SoftReference<Sample>(sample);
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7616);return sample;
                }
            }}
        }}

        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7617);throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }finally{__CLR4_5_25r35r3lvl9ehcy.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_25r35r3lvl9ehcy.R.inc(7618);
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7619);if ((((size_ != -1)&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7620)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7621)==0&false))) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7622);return size_;
        }
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7623);int i = 0;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7624);for (MovieFragmentBox moof : topLevel.getBoxes(MovieFragmentBox.class)) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7625);for (TrackFragmentBox trackFragmentBox : moof.getBoxes(TrackFragmentBox.class)) {{
                __CLR4_5_25r35r3lvl9ehcy.R.inc(7626);if ((((trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7627)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7628)==0&false))) {{
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7629);for (TrackRunBox trackRunBox : trackFragmentBox.getBoxes(TrackRunBox.class)) {{
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7630);i += trackRunBox.getSampleCount();
                    }

                }}
            }}
        }}
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7631);for (IsoFile fragment : fragments) {{
            __CLR4_5_25r35r3lvl9ehcy.R.inc(7632);for (MovieFragmentBox moof : fragment.getBoxes(MovieFragmentBox.class)) {{
                __CLR4_5_25r35r3lvl9ehcy.R.inc(7633);for (TrackFragmentBox trackFragmentBox : moof.getBoxes(TrackFragmentBox.class)) {{
                    __CLR4_5_25r35r3lvl9ehcy.R.inc(7634);if ((((trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())&&(__CLR4_5_25r35r3lvl9ehcy.R.iget(7635)!=0|true))||(__CLR4_5_25r35r3lvl9ehcy.R.iget(7636)==0&false))) {{
                        __CLR4_5_25r35r3lvl9ehcy.R.inc(7637);for (TrackRunBox trackRunBox : trackFragmentBox.getBoxes(TrackRunBox.class)) {{
                            __CLR4_5_25r35r3lvl9ehcy.R.inc(7638);i += trackRunBox.getSampleCount();
                        }
                    }}
                }}
            }}
        }}
        }__CLR4_5_25r35r3lvl9ehcy.R.inc(7639);size_ = i;
        __CLR4_5_25r35r3lvl9ehcy.R.inc(7640);return i;
    }finally{__CLR4_5_25r35r3lvl9ehcy.R.flushNeeded();}}


}
