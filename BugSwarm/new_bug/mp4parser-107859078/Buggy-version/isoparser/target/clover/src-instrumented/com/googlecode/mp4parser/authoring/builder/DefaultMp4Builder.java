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
package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.*;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;
import com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.Logger;
import com.googlecode.mp4parser.util.Mp4Arrays;
import com.googlecode.mp4parser.util.Path;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.*;

import static com.googlecode.mp4parser.util.CastUtils.l2i;
import static com.googlecode.mp4parser.util.Math.lcm;

/**
 * Creates a plain MP4 file from a video. Plain as plain can be.
 */
public class DefaultMp4Builder implements Mp4Builder {public static class __CLR4_5_24mv4mvlvl9egv5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,6534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Logger LOG = Logger.getLogger(DefaultMp4Builder.class);
    Map<Track, StaticChunkOffsetBox> chunkOffsetBoxes = new HashMap<Track, StaticChunkOffsetBox>();
    Set<SampleAuxiliaryInformationOffsetsBox> sampleAuxiliaryInformationOffsetsBoxes = new HashSet<SampleAuxiliaryInformationOffsetsBox>();
    HashMap<Track, List<Sample>> track2Sample = new HashMap<Track, List<Sample>>();
    HashMap<Track, long[]> track2SampleSizes = new HashMap<Track, long[]>();
    private Fragmenter fragmenter;

    private static long sum(int[] ls) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6007);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6008);long rc = 0;
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6009);for (long l : ls) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6010);rc += l;
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6011);return rc;
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    private static long sum(long[] ls) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6012);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6013);long rc = 0;
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6014);for (long l : ls) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6015);rc += l;
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6016);return rc;
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    public static long gcd(long a, long b) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6017);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6018);if ((((b == 0)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6019)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6020)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6021);return a;
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6022);return gcd(b, a % b);
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    public void setFragmenter(Fragmenter fragmenter) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6023);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6024);this.fragmenter = fragmenter;
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public Container build(Movie movie) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6025);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6026);if ((((fragmenter == null)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6027)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6028)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6029);fragmenter = new DefaultFragmenterImpl(2);
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6030);LOG.logDebug("Creating movie " + movie);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6031);for (Track track : movie.getTracks()) {{
            // getting the samples may be a time consuming activity
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6032);List<Sample> samples = track.getSamples();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6033);putSamples(track, samples);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6034);long[] sizes = new long[samples.size()];
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6035);for (int i = 0; (((i < sizes.length)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6036)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6037)==0&false)); i++) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6038);Sample b = samples.get(i);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6039);sizes[i] = b.getSize();
            }
            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6040);track2SampleSizes.put(track, sizes);

        }

        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6041);BasicContainer isoFile = new BasicContainer();

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6042);isoFile.addBox(createFileTypeBox(movie));

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6043);Map<Track, int[]> chunks = new HashMap<Track, int[]>();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6044);for (Track track : movie.getTracks()) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6045);chunks.put(track, getChunkSizes(track));
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6046);Box moov = createMovieBox(movie, chunks);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6047);isoFile.addBox(moov);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6048);List<SampleSizeBox> stszs = Path.getPaths(moov, "trak/mdia/minf/stbl/stsz");

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6049);long contentSize = 0;
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6050);for (SampleSizeBox stsz : stszs) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6051);contentSize += sum(stsz.getSampleSizes());

        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6052);LOG.logDebug("About to create mdat");
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6053);InterleaveChunkMdat mdat = new InterleaveChunkMdat(movie, chunks, contentSize);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6054);isoFile.addBox(mdat);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6055);LOG.logDebug("mdat crated");

        /*
        dataOffset is where the first sample starts. In this special mdat the samples always start
        at offset 16 so that we can use the same offset for large boxes and small boxes
         */
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6056);long dataOffset = mdat.getDataOffset();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6057);for (StaticChunkOffsetBox chunkOffsetBox : chunkOffsetBoxes.values()) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6058);long[] offsets = chunkOffsetBox.getChunkOffsets();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6059);for (int i = 0; (((i < offsets.length)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6060)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6061)==0&false)); i++) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6062);offsets[i] += dataOffset;
            }
        }}
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6063);for (SampleAuxiliaryInformationOffsetsBox saio : sampleAuxiliaryInformationOffsetsBoxes) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6064);long offset = saio.getSize(); // the calculation is systematically wrong by 4, I don't want to debug why. Just a quick correction --san 14.May.13
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6065);offset += 4 + 4 + 4 + 4 + 4 + 24;
            // size of all header we were missing otherwise (moov, trak, mdia, minf, stbl)
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6066);Object b = saio;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6067);do {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6068);Object current = b;
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6069);b = ((Box) b).getParent();

                __CLR4_5_24mv4mvlvl9egv5.R.inc(6070);for (Box box : ((Container) b).getBoxes()) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6071);if ((((box == current)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6072)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6073)==0&false))) {{
                        __CLR4_5_24mv4mvlvl9egv5.R.inc(6074);break;
                    }
                    }__CLR4_5_24mv4mvlvl9egv5.R.inc(6075);offset += box.getSize();
                }

            }} }while ((((b instanceof Box)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6076)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6077)==0&false)));

            __CLR4_5_24mv4mvlvl9egv5.R.inc(6078);long[] saioOffsets = saio.getOffsets();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6079);for (int i = 0; (((i < saioOffsets.length)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6080)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6081)==0&false)); i++) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6082);saioOffsets[i] = saioOffsets[i] + offset;

            }
            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6083);saio.setOffsets(saioOffsets);
        }


        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6084);return isoFile;
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected List<Sample> putSamples(Track track, List<Sample> samples) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6085);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6086);return track2Sample.put(track, samples);
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected FileTypeBox createFileTypeBox(Movie movie) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6087);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6088);List<String> minorBrands = new LinkedList<String>();

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6089);minorBrands.add("mp42");
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6090);minorBrands.add("iso6");
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6091);minorBrands.add("avc1");
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6092);minorBrands.add("isom");
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6093);return new FileTypeBox("iso6", 1, minorBrands);
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected MovieBox createMovieBox(Movie movie, Map<Track, int[]> chunks) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6094);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6095);MovieBox movieBox = new MovieBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6096);MovieHeaderBox mvhd = new MovieHeaderBox();

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6097);mvhd.setCreationTime(new Date());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6098);mvhd.setModificationTime(new Date());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6099);mvhd.setMatrix(movie.getMatrix());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6100);long movieTimeScale = getTimescale(movie);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6101);long duration = 0;

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6102);for (Track track : movie.getTracks()) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6103);long tracksDuration;

            __CLR4_5_24mv4mvlvl9egv5.R.inc(6104);if ((((track.getEdits() == null || track.getEdits().isEmpty())&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6105)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6106)==0&false))) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6107);tracksDuration = (track.getDuration() * movieTimeScale / track.getTrackMetaData().getTimescale());
            } }else {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6108);double d = 0;
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6109);for (Edit edit : track.getEdits()) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6110);d += (long) edit.getSegmentDuration();
                }
                }__CLR4_5_24mv4mvlvl9egv5.R.inc(6111);tracksDuration = (long) (d * movieTimeScale);
            }


            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6112);if ((((tracksDuration > duration)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6113)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6114)==0&false))) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6115);duration = tracksDuration;
            }


        }}

        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6116);mvhd.setDuration(duration);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6117);mvhd.setTimescale(movieTimeScale);
        // find the next available trackId
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6118);long nextTrackId = 0;
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6119);for (Track track : movie.getTracks()) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6120);nextTrackId = (((nextTrackId < track.getTrackMetaData().getTrackId() )&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6121)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6122)==0&false))? track.getTrackMetaData().getTrackId() : nextTrackId;
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6123);mvhd.setNextTrackId(++nextTrackId);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6124);movieBox.addBox(mvhd);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6125);for (Track track : movie.getTracks()) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6126);movieBox.addBox(createTrackBox(track, movie, chunks));
        }
        // metadata here
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6127);Box udta = createUdta(movie);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6128);if ((((udta != null)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6129)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6130)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6131);movieBox.addBox(udta);
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6132);return movieBox;

    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    /**
     * Override to create a user data box that may contain metadata.
     *
     * @param movie source movie
     * @return a 'udta' box or <code>null</code> if none provided
     */
    protected Box createUdta(Movie movie) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6133);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6134);return null;
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected TrackBox createTrackBox(Track track, Movie movie, Map<Track, int[]> chunks) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6135);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6136);TrackBox trackBox = new TrackBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6137);TrackHeaderBox tkhd = new TrackHeaderBox();

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6138);tkhd.setEnabled(true);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6139);tkhd.setInMovie(true);
//        tkhd.setInPreview(true);
//        tkhd.setInPoster(true);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6140);tkhd.setMatrix(track.getTrackMetaData().getMatrix());

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6141);tkhd.setAlternateGroup(track.getTrackMetaData().getGroup());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6142);tkhd.setCreationTime(track.getTrackMetaData().getCreationTime());

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6143);if ((((track.getEdits() == null || track.getEdits().isEmpty())&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6144)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6145)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6146);tkhd.setDuration(track.getDuration() * getTimescale(movie) / track.getTrackMetaData().getTimescale());
        } }else {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6147);long d = 0;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6148);for (Edit edit : track.getEdits()) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6149);d += (long) edit.getSegmentDuration();
            }
            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6150);tkhd.setDuration(d * track.getTrackMetaData().getTimescale());
        }


        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6151);tkhd.setHeight(track.getTrackMetaData().getHeight());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6152);tkhd.setWidth(track.getTrackMetaData().getWidth());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6153);tkhd.setLayer(track.getTrackMetaData().getLayer());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6154);tkhd.setModificationTime(new Date());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6155);tkhd.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6156);tkhd.setVolume(track.getTrackMetaData().getVolume());

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6157);trackBox.addBox(tkhd);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6158);trackBox.addBox(createEdts(track, movie));

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6159);MediaBox mdia = new MediaBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6160);trackBox.addBox(mdia);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6161);MediaHeaderBox mdhd = new MediaHeaderBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6162);mdhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6163);mdhd.setDuration(track.getDuration());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6164);mdhd.setTimescale(track.getTrackMetaData().getTimescale());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6165);mdhd.setLanguage(track.getTrackMetaData().getLanguage());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6166);mdia.addBox(mdhd);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6167);HandlerBox hdlr = new HandlerBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6168);mdia.addBox(hdlr);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6169);hdlr.setHandlerType(track.getHandler());

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6170);MediaInformationBox minf = new MediaInformationBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6171);if ((((track.getHandler().equals("vide"))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6172)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6173)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6174);minf.addBox(new VideoMediaHeaderBox());
        } }else {__CLR4_5_24mv4mvlvl9egv5.R.inc(6175);if ((((track.getHandler().equals("soun"))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6176)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6177)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6178);minf.addBox(new SoundMediaHeaderBox());
        } }else {__CLR4_5_24mv4mvlvl9egv5.R.inc(6179);if ((((track.getHandler().equals("text"))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6180)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6181)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6182);minf.addBox(new NullMediaHeaderBox());
        } }else {__CLR4_5_24mv4mvlvl9egv5.R.inc(6183);if ((((track.getHandler().equals("subt"))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6184)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6185)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6186);minf.addBox(new SubtitleMediaHeaderBox());
        } }else {__CLR4_5_24mv4mvlvl9egv5.R.inc(6187);if ((((track.getHandler().equals("hint"))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6188)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6189)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6190);minf.addBox(new HintMediaHeaderBox());
        } }else {__CLR4_5_24mv4mvlvl9egv5.R.inc(6191);if ((((track.getHandler().equals("sbtl"))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6192)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6193)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6194);minf.addBox(new NullMediaHeaderBox());
        }

        // dinf: all these three boxes tell us is that the actual
        // data is in the current file and not somewhere external
        }}}}}}__CLR4_5_24mv4mvlvl9egv5.R.inc(6195);DataInformationBox dinf = new DataInformationBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6196);DataReferenceBox dref = new DataReferenceBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6197);dinf.addBox(dref);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6198);DataEntryUrlBox url = new DataEntryUrlBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6199);url.setFlags(1);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6200);dref.addBox(url);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6201);minf.addBox(dinf);
        //

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6202);Box stbl = createStbl(track, movie, chunks);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6203);minf.addBox(stbl);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6204);mdia.addBox(minf);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6205);LOG.logDebug("done with trak for track_" + track.getTrackMetaData().getTrackId());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6206);return trackBox;
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected Box createEdts(Track track, Movie movie) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6207);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6208);if ((((track.getEdits() != null && track.getEdits().size() > 0)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6209)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6210)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6211);EditListBox elst = new EditListBox();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6212);elst.setVersion(0); // quicktime won't play file when version = 1
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6213);List<EditListBox.Entry> entries = new ArrayList<EditListBox.Entry>();

            __CLR4_5_24mv4mvlvl9egv5.R.inc(6214);for (Edit edit : track.getEdits()) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6215);entries.add(new EditListBox.Entry(elst,
                        Math.round(edit.getSegmentDuration() * movie.getTimescale()),
                        edit.getMediaTime() * track.getTrackMetaData().getTimescale() / edit.getTimeScale(),
                        edit.getMediaRate()));
            }

            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6216);elst.setEntries(entries);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6217);EditBox edts = new EditBox();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6218);edts.addBox(elst);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6219);return edts;
        } }else {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6220);return null;
        }
    }}finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected Box createStbl(Track track, Movie movie, Map<Track, int[]> chunks) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6221);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6222);SampleTableBox stbl = new SampleTableBox();

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6223);createStsd(track, stbl);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6224);createStts(track, stbl);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6225);createCtts(track, stbl);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6226);createStss(track, stbl);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6227);createSdtp(track, stbl);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6228);createStsc(track, chunks, stbl);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6229);createStsz(track, stbl);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6230);createStco(track, movie, chunks, stbl);


        __CLR4_5_24mv4mvlvl9egv5.R.inc(6231);Map<String, List<GroupEntry>> groupEntryFamilies = new HashMap<String, List<GroupEntry>>();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6232);for (Map.Entry<GroupEntry, long[]> sg : track.getSampleGroups().entrySet()) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6233);String type = sg.getKey().getType();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6234);List<GroupEntry> groupEntries = groupEntryFamilies.get(type);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6235);if ((((groupEntries == null)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6236)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6237)==0&false))) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6238);groupEntries = new ArrayList<GroupEntry>();
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6239);groupEntryFamilies.put(type, groupEntries);
            }
            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6240);groupEntries.add(sg.getKey());
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6241);for (Map.Entry<String, List<GroupEntry>> sg : groupEntryFamilies.entrySet()) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6242);SampleGroupDescriptionBox sgdb = new SampleGroupDescriptionBox();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6243);String type = sg.getKey();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6244);sgdb.setGroupingType(type);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6245);sgdb.setGroupEntries(sg.getValue());
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6246);SampleToGroupBox sbgp = new SampleToGroupBox();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6247);sbgp.setGroupingType(type);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6248);SampleToGroupBox.Entry last = null;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6249);for (int i = 0; (((i < track.getSamples().size())&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6250)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6251)==0&false)); i++) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6252);int index = 0;
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6253);for (int j = 0; (((j < sg.getValue().size())&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6254)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6255)==0&false)); j++) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6256);GroupEntry groupEntry = sg.getValue().get(j);
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6257);long[] sampleNums = track.getSampleGroups().get(groupEntry);
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6258);if ((((Arrays.binarySearch(sampleNums, i) >= 0)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6259)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6260)==0&false))) {{
                        __CLR4_5_24mv4mvlvl9egv5.R.inc(6261);index = j + 1;
                    }
                }}
                }__CLR4_5_24mv4mvlvl9egv5.R.inc(6262);if ((((last == null || last.getGroupDescriptionIndex() != index)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6263)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6264)==0&false))) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6265);last = new SampleToGroupBox.Entry(1, index);
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6266);sbgp.getEntries().add(last);
                } }else {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6267);last.setSampleCount(last.getSampleCount() + 1);
                }
            }}
            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6268);stbl.addBox(sgdb);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6269);stbl.addBox(sbgp);
        }

        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6270);if ((((track instanceof CencEncryptedTrack)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6271)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6272)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6273);createCencBoxes((CencEncryptedTrack) track, stbl, chunks.get(track));
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6274);createSubs(track, stbl);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6275);LOG.logDebug("done with stbl for track_" + track.getTrackMetaData().getTrackId());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6276);return stbl;
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createSubs(Track track, SampleTableBox stbl) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6277);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6278);if ((((track.getSubsampleInformationBox() != null)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6279)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6280)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6281);stbl.addBox(track.getSubsampleInformationBox());
        }
    }}finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createCencBoxes(CencEncryptedTrack track, SampleTableBox stbl, int[] chunkSizes) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6282);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6283);SampleAuxiliaryInformationSizesBox saiz = new SampleAuxiliaryInformationSizesBox();

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6284);saiz.setAuxInfoType("cenc");
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6285);saiz.setFlags(1);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6286);List<CencSampleAuxiliaryDataFormat> sampleEncryptionEntries = track.getSampleEncryptionEntries();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6287);if ((((track.hasSubSampleEncryption())&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6288)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6289)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6290);short[] sizes = new short[sampleEncryptionEntries.size()];
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6291);for (int i = 0; (((i < sizes.length)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6292)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6293)==0&false)); i++) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6294);sizes[i] = (short) sampleEncryptionEntries.get(i).getSize();
            }
            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6295);saiz.setSampleInfoSizes(sizes);
        } }else {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6296);saiz.setDefaultSampleInfoSize(8); // 8 bytes iv
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6297);saiz.setSampleCount(track.getSamples().size());
        }

        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6298);SampleAuxiliaryInformationOffsetsBox saio = new SampleAuxiliaryInformationOffsetsBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6299);SampleEncryptionBox senc = new SampleEncryptionBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6300);senc.setSubSampleEncryption(track.hasSubSampleEncryption());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6301);senc.setEntries(sampleEncryptionEntries);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6302);long offset = senc.getOffsetToFirstIV();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6303);int index = 0;
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6304);long[] offsets = new long[chunkSizes.length];


        __CLR4_5_24mv4mvlvl9egv5.R.inc(6305);for (int i = 0; (((i < chunkSizes.length)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6306)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6307)==0&false)); i++) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6308);offsets[i] = offset;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6309);for (int j = 0; (((j < chunkSizes[i])&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6310)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6311)==0&false)); j++) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6312);offset += sampleEncryptionEntries.get(index++).getSize();
            }
        }}
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6313);saio.setOffsets(offsets);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6314);stbl.addBox(saiz);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6315);stbl.addBox(saio);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6316);stbl.addBox(senc);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6317);sampleAuxiliaryInformationOffsetsBoxes.add(saio);


    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createStsd(Track track, SampleTableBox stbl) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6318);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6319);stbl.addBox(track.getSampleDescriptionBox());
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createStco(Track targetTrack, Movie movie, Map<Track, int[]> chunks, SampleTableBox stbl) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6320);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6321);if ((((chunkOffsetBoxes.get(targetTrack) == null)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6322)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6323)==0&false))) {{
            // The ChunkOffsetBox we create here is just a stub
            // since we haven't created the whole structure we can't tell where the
            // first chunk starts (mdat box). So I just let the chunk offset
            // start at zero and I will add the mdat offset later.

            __CLR4_5_24mv4mvlvl9egv5.R.inc(6324);long offset = 0;
            // all tracks have the same number of chunks
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6325);LOG.logDebug("Calculating chunk offsets for track_" + targetTrack.getTrackMetaData().getTrackId());

            __CLR4_5_24mv4mvlvl9egv5.R.inc(6326);List<Track> tracks = new ArrayList<Track>(chunks.keySet());
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6327);Collections.sort(tracks, new Comparator<Track>() {
                public int compare(Track o1, Track o2) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6328);
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6329);return l2i(o1.getTrackMetaData().getTrackId() - o2.getTrackMetaData().getTrackId());
                }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}
            });
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6330);Map<Track, Integer> trackToChunk = new HashMap<Track, Integer>();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6331);Map<Track, Integer> trackToSample = new HashMap<Track, Integer>();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6332);Map<Track, Double> trackToTime = new HashMap<Track, Double>();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6333);for (Track track : tracks) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6334);trackToChunk.put(track, 0);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6335);trackToSample.put(track, 0);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6336);trackToTime.put(track, 0.0);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6337);chunkOffsetBoxes.put(track, new StaticChunkOffsetBox());
            }

            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6338);while (true) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6339);Track nextChunksTrack = null;
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6340);for (Track track : tracks) {{
                    // This always chooses the least progressed track
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6341);if (((((nextChunksTrack == null || trackToTime.get(track) < trackToTime.get(nextChunksTrack)) &&
                            // either first OR track's next chunk's starttime is smaller than nextTrack's next chunks starttime
                            // AND their need to be chunks left!
                            (trackToChunk.get(track) < chunks.get(track).length))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6342)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6343)==0&false))) {{
                        __CLR4_5_24mv4mvlvl9egv5.R.inc(6344);nextChunksTrack = track;
                    }
                }}
                }__CLR4_5_24mv4mvlvl9egv5.R.inc(6345);if ((((nextChunksTrack == null)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6346)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6347)==0&false))) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6348);break; // no next
                }
                // found the next one
                }__CLR4_5_24mv4mvlvl9egv5.R.inc(6349);ChunkOffsetBox chunkOffsetBox = chunkOffsetBoxes.get(nextChunksTrack);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6350);chunkOffsetBox.setChunkOffsets(Mp4Arrays.copyOfAndAppend(chunkOffsetBox.getChunkOffsets(), offset));

                __CLR4_5_24mv4mvlvl9egv5.R.inc(6351);int nextChunksIndex = trackToChunk.get(nextChunksTrack);

                __CLR4_5_24mv4mvlvl9egv5.R.inc(6352);int numberOfSampleInNextChunk = chunks.get(nextChunksTrack)[nextChunksIndex];
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6353);int startSample = trackToSample.get(nextChunksTrack);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6354);double time = trackToTime.get(nextChunksTrack);

                __CLR4_5_24mv4mvlvl9egv5.R.inc(6355);long[] durs = nextChunksTrack.getSampleDurations();
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6356);for (int j = startSample; (((j < startSample + numberOfSampleInNextChunk)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6357)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6358)==0&false)); j++) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6359);offset += track2SampleSizes.get(nextChunksTrack)[j];
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6360);time += (double) durs[j] / nextChunksTrack.getTrackMetaData().getTimescale();
                }
                }__CLR4_5_24mv4mvlvl9egv5.R.inc(6361);trackToChunk.put(nextChunksTrack, nextChunksIndex + 1);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6362);trackToSample.put(nextChunksTrack, startSample + numberOfSampleInNextChunk);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6363);trackToTime.put(nextChunksTrack, time);
            }

        }}

        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6364);stbl.addBox(chunkOffsetBoxes.get(targetTrack));
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createStsz(Track track, SampleTableBox stbl) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6365);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6366);SampleSizeBox stsz = new SampleSizeBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6367);stsz.setSampleSizes(track2SampleSizes.get(track));

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6368);stbl.addBox(stsz);
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createStsc(Track track, Map<Track, int[]> chunks, SampleTableBox stbl) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6369);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6370);int[] tracksChunkSizes = chunks.get(track);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6371);SampleToChunkBox stsc = new SampleToChunkBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6372);stsc.setEntries(new LinkedList<SampleToChunkBox.Entry>());
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6373);long lastChunkSize = Integer.MIN_VALUE; // to be sure the first chunks hasn't got the same size
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6374);for (int i = 0; (((i < tracksChunkSizes.length)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6375)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6376)==0&false)); i++) {{
            // The sample description index references the sample description box
            // that describes the samples of this chunk. My Tracks cannot have more
            // than one sample description box. Therefore 1 is always right
            // the first chunk has the number '1'
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6377);if ((((lastChunkSize != tracksChunkSizes[i])&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6378)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6379)==0&false))) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6380);stsc.getEntries().add(new SampleToChunkBox.Entry(i + 1, tracksChunkSizes[i], 1));
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6381);lastChunkSize = tracksChunkSizes[i];
            }
        }}
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6382);stbl.addBox(stsc);
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createSdtp(Track track, SampleTableBox stbl) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6383);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6384);if ((((track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty())&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6385)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6386)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6387);SampleDependencyTypeBox sdtp = new SampleDependencyTypeBox();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6388);sdtp.setEntries(track.getSampleDependencies());
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6389);stbl.addBox(sdtp);
        }
    }}finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createStss(Track track, SampleTableBox stbl) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6390);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6391);long[] syncSamples = track.getSyncSamples();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6392);if ((((syncSamples != null && syncSamples.length > 0)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6393)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6394)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6395);SyncSampleBox stss = new SyncSampleBox();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6396);stss.setSampleNumber(syncSamples);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6397);stbl.addBox(stss);
        }
    }}finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createCtts(Track track, SampleTableBox stbl) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6398);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6399);List<CompositionTimeToSample.Entry> compositionTimeToSampleEntries = track.getCompositionTimeEntries();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6400);if ((((compositionTimeToSampleEntries != null && !compositionTimeToSampleEntries.isEmpty())&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6401)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6402)==0&false))) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6403);CompositionTimeToSample ctts = new CompositionTimeToSample();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6404);ctts.setEntries(compositionTimeToSampleEntries);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6405);stbl.addBox(ctts);
        }
    }}finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    protected void createStts(Track track, SampleTableBox stbl) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6406);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6407);TimeToSampleBox.Entry lastEntry = null;
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6408);List<TimeToSampleBox.Entry> entries = new ArrayList<TimeToSampleBox.Entry>();

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6409);for (long delta : track.getSampleDurations()) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6410);if ((((lastEntry != null && lastEntry.getDelta() == delta)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6411)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6412)==0&false))) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6413);lastEntry.setCount(lastEntry.getCount() + 1);
            } }else {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6414);lastEntry = new TimeToSampleBox.Entry(1, delta);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6415);entries.add(lastEntry);
            }

        }}
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6416);TimeToSampleBox stts = new TimeToSampleBox();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6417);stts.setEntries(entries);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6418);stbl.addBox(stts);
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    /**
     * Gets the chunk sizes for the given track.
     *
     * @param track the track we are talking about
     * @return the size of each chunk in number of samples
     */
    int[] getChunkSizes(Track track) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6419);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6420);long[] referenceChunkStarts = fragmenter.sampleNumbers(track);
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6421);int[] chunkSizes = new int[referenceChunkStarts.length];


        __CLR4_5_24mv4mvlvl9egv5.R.inc(6422);for (int i = 0; (((i < referenceChunkStarts.length)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6423)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6424)==0&false)); i++) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6425);long start = referenceChunkStarts[i] - 1;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6426);long end;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6427);if ((((referenceChunkStarts.length == i + 1)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6428)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6429)==0&false))) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6430);end = track.getSamples().size();
            } }else {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6431);end = referenceChunkStarts[i + 1] - 1;
            }

            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6432);chunkSizes[i] = l2i(end - start);
        }
        }assert (((DefaultMp4Builder.this.track2Sample.get(track).size() == sum(chunkSizes) )&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6433)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6434)==0&false)): "The number of samples and the sum of all chunk lengths must be equal";
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6435);return chunkSizes;


    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    public long getTimescale(Movie movie) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6436);

        __CLR4_5_24mv4mvlvl9egv5.R.inc(6437);long timescale = movie.getTracks().iterator().next().getTrackMetaData().getTimescale();
        __CLR4_5_24mv4mvlvl9egv5.R.inc(6438);for (Track track : movie.getTracks()) {{
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6439);timescale = lcm(timescale, track.getTrackMetaData().getTimescale());
        }
        }__CLR4_5_24mv4mvlvl9egv5.R.inc(6440);return timescale;
    }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    private class InterleaveChunkMdat implements Box {
        List<Track> tracks;
        List<List<Sample>> chunkList = new ArrayList<List<Sample>>();
        Container parent;

        long contentSize;

        private InterleaveChunkMdat(Movie movie, Map<Track, int[]> chunks, long contentSize) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6441);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6442);this.contentSize = contentSize;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6443);this.tracks = movie.getTracks();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6444);List<Track> tracks = new ArrayList<Track>(chunks.keySet());
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6445);Collections.sort(tracks, new Comparator<Track>() {
                public int compare(Track o1, Track o2) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6446);
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6447);return l2i(o1.getTrackMetaData().getTrackId() - o2.getTrackMetaData().getTrackId());
                }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}
            });
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6448);Map<Track, Integer> trackToChunk = new HashMap<Track, Integer>();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6449);Map<Track, Integer> trackToSample = new HashMap<Track, Integer>();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6450);Map<Track, Double> trackToTime = new HashMap<Track, Double>();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6451);for (Track track : tracks) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6452);trackToChunk.put(track, 0);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6453);trackToSample.put(track, 0);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6454);trackToTime.put(track, 0.0);
            }

            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6455);while (true) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6456);Track nextChunksTrack = null;
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6457);for (Track track : tracks) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6458);if (((((nextChunksTrack == null || trackToTime.get(track) < trackToTime.get(nextChunksTrack)) &&
                            // either first OR track's next chunk's starttime is smaller than nextTrack's next chunks starttime
                            // AND their need to be chunks left!
                            (trackToChunk.get(track) < chunks.get(track).length))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6459)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6460)==0&false))) {{
                        __CLR4_5_24mv4mvlvl9egv5.R.inc(6461);nextChunksTrack = track;
                    }
                }}
                }__CLR4_5_24mv4mvlvl9egv5.R.inc(6462);if ((((nextChunksTrack == null)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6463)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6464)==0&false))) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6465);break;
                }
                // found the next one

                }__CLR4_5_24mv4mvlvl9egv5.R.inc(6466);int nextChunksIndex = trackToChunk.get(nextChunksTrack);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6467);int numberOfSampleInNextChunk = chunks.get(nextChunksTrack)[nextChunksIndex];
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6468);int startSample = trackToSample.get(nextChunksTrack);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6469);double time = trackToTime.get(nextChunksTrack);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6470);for (int j = startSample; (((j < startSample + numberOfSampleInNextChunk)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6471)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6472)==0&false)); j++) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6473);time += (double) nextChunksTrack.getSampleDurations()[j] / nextChunksTrack.getTrackMetaData().getTimescale();
                }
                }__CLR4_5_24mv4mvlvl9egv5.R.inc(6474);chunkList.add(nextChunksTrack.getSamples().subList(startSample, startSample + numberOfSampleInNextChunk));

                __CLR4_5_24mv4mvlvl9egv5.R.inc(6475);trackToChunk.put(nextChunksTrack, nextChunksIndex + 1);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6476);trackToSample.put(nextChunksTrack, startSample + numberOfSampleInNextChunk);
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6477);trackToTime.put(nextChunksTrack, time);
            }


        }}finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

        public Container getParent() {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6478);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6479);return parent;
        }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

        public void setParent(Container parent) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6480);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6481);this.parent = parent;
        }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

        public long getOffset() {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6482);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6483);throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

        public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6484);
        }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

        public long getDataOffset() {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6485);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6486);Object b = this;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6487);long offset = 16;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6488);while ((((b instanceof Box)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6489)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6490)==0&false))) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6491);for (Box box : ((Box) b).getParent().getBoxes()) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6492);if ((((b == box)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6493)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6494)==0&false))) {{
                        __CLR4_5_24mv4mvlvl9egv5.R.inc(6495);break;
                    }
                    }__CLR4_5_24mv4mvlvl9egv5.R.inc(6496);offset += box.getSize();
                }
                }__CLR4_5_24mv4mvlvl9egv5.R.inc(6497);b = ((Box) b).getParent();
            }
            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6498);return offset;
        }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}


        public String getType() {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6499);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6500);return "mdat";
        }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6501);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6502);return 16 + contentSize;
        }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

        private boolean isSmallBox(long contentSize) {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6503);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6504);return (contentSize + 8) < 4294967296L;
        }finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}


        public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_24mv4mvlvl9egv5.R.inc(6505);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6506);ByteBuffer bb = ByteBuffer.allocate(16);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6507);long size = getSize();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6508);if ((((isSmallBox(size))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6509)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6510)==0&false))) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6511);IsoTypeWriter.writeUInt32(bb, size);
            } }else {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6512);IsoTypeWriter.writeUInt32(bb, 1);
            }
            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6513);bb.put(IsoFile.fourCCtoBytes("mdat"));
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6514);if ((((isSmallBox(size))&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6515)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6516)==0&false))) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6517);bb.put(new byte[8]);
            } }else {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6518);IsoTypeWriter.writeUInt64(bb, size);
            }
            }__CLR4_5_24mv4mvlvl9egv5.R.inc(6519);bb.rewind();
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6520);writableByteChannel.write(bb);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6521);long writtenBytes = 0;
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6522);long writtenMegaBytes = 0;

            __CLR4_5_24mv4mvlvl9egv5.R.inc(6523);LOG.logDebug("About to write " + contentSize);
            __CLR4_5_24mv4mvlvl9egv5.R.inc(6524);for (List<Sample> samples : chunkList) {{
                __CLR4_5_24mv4mvlvl9egv5.R.inc(6525);for (Sample sample : samples) {{
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6526);sample.writeTo(writableByteChannel);
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6527);writtenBytes += sample.getSize();
                    __CLR4_5_24mv4mvlvl9egv5.R.inc(6528);if ((((writtenBytes > 1024 * 1024)&&(__CLR4_5_24mv4mvlvl9egv5.R.iget(6529)!=0|true))||(__CLR4_5_24mv4mvlvl9egv5.R.iget(6530)==0&false))) {{
                        __CLR4_5_24mv4mvlvl9egv5.R.inc(6531);writtenBytes -= 1024 * 1024;
                        __CLR4_5_24mv4mvlvl9egv5.R.inc(6532);writtenMegaBytes++;
                        __CLR4_5_24mv4mvlvl9egv5.R.inc(6533);LOG.logDebug("Written " + writtenMegaBytes + "MB");
                    }
                }}
            }}

        }}finally{__CLR4_5_24mv4mvlvl9egv5.R.flushNeeded();}}

    }
}
