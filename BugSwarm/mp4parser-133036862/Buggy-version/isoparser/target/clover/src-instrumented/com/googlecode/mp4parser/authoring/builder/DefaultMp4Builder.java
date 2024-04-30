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
public class DefaultMp4Builder implements Mp4Builder {public static class __CLR4_5_24pi4pilvlulerx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,6629,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Logger LOG = Logger.getLogger(DefaultMp4Builder.class);
    Map<Track, StaticChunkOffsetBox> chunkOffsetBoxes = new HashMap<Track, StaticChunkOffsetBox>();
    Set<SampleAuxiliaryInformationOffsetsBox> sampleAuxiliaryInformationOffsetsBoxes = new HashSet<SampleAuxiliaryInformationOffsetsBox>();
    HashMap<Track, List<Sample>> track2Sample = new HashMap<Track, List<Sample>>();
    HashMap<Track, long[]> track2SampleSizes = new HashMap<Track, long[]>();
    private Fragmenter fragmenter;

    private static long sum(int[] ls) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6102);
        __CLR4_5_24pi4pilvlulerx.R.inc(6103);long rc = 0;
        __CLR4_5_24pi4pilvlulerx.R.inc(6104);for (long l : ls) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6105);rc += l;
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6106);return rc;
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    private static long sum(long[] ls) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6107);
        __CLR4_5_24pi4pilvlulerx.R.inc(6108);long rc = 0;
        __CLR4_5_24pi4pilvlulerx.R.inc(6109);for (long l : ls) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6110);rc += l;
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6111);return rc;
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    public static long gcd(long a, long b) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6112);
        __CLR4_5_24pi4pilvlulerx.R.inc(6113);if ((((b == 0)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6114)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6115)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6116);return a;
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6117);return gcd(b, a % b);
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    public void setFragmenter(Fragmenter fragmenter) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6118);
        __CLR4_5_24pi4pilvlulerx.R.inc(6119);this.fragmenter = fragmenter;
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public Container build(Movie movie) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6120);
        __CLR4_5_24pi4pilvlulerx.R.inc(6121);if ((((fragmenter == null)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6122)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6123)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6124);fragmenter = new BetterFragmenter(2);
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6125);LOG.logDebug("Creating movie " + movie);
        __CLR4_5_24pi4pilvlulerx.R.inc(6126);for (Track track : movie.getTracks()) {{
            // getting the samples may be a time consuming activity
            __CLR4_5_24pi4pilvlulerx.R.inc(6127);List<Sample> samples = track.getSamples();
            __CLR4_5_24pi4pilvlulerx.R.inc(6128);putSamples(track, samples);
            __CLR4_5_24pi4pilvlulerx.R.inc(6129);long[] sizes = new long[samples.size()];
            __CLR4_5_24pi4pilvlulerx.R.inc(6130);for (int i = 0; (((i < sizes.length)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6131)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6132)==0&false)); i++) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6133);Sample b = samples.get(i);
                __CLR4_5_24pi4pilvlulerx.R.inc(6134);sizes[i] = b.getSize();
            }
            }__CLR4_5_24pi4pilvlulerx.R.inc(6135);track2SampleSizes.put(track, sizes);

        }

        }__CLR4_5_24pi4pilvlulerx.R.inc(6136);BasicContainer isoFile = new BasicContainer();

        __CLR4_5_24pi4pilvlulerx.R.inc(6137);isoFile.addBox(createFileTypeBox(movie));

        __CLR4_5_24pi4pilvlulerx.R.inc(6138);Map<Track, int[]> chunks = new HashMap<Track, int[]>();
        __CLR4_5_24pi4pilvlulerx.R.inc(6139);for (Track track : movie.getTracks()) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6140);chunks.put(track, getChunkSizes(track));
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6141);Box moov = createMovieBox(movie, chunks);
        __CLR4_5_24pi4pilvlulerx.R.inc(6142);isoFile.addBox(moov);
        __CLR4_5_24pi4pilvlulerx.R.inc(6143);List<SampleSizeBox> stszs = Path.getPaths(moov, "trak/mdia/minf/stbl/stsz");

        __CLR4_5_24pi4pilvlulerx.R.inc(6144);long contentSize = 0;
        __CLR4_5_24pi4pilvlulerx.R.inc(6145);for (SampleSizeBox stsz : stszs) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6146);contentSize += sum(stsz.getSampleSizes());

        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6147);LOG.logDebug("About to create mdat");
        __CLR4_5_24pi4pilvlulerx.R.inc(6148);InterleaveChunkMdat mdat = new InterleaveChunkMdat(movie, chunks, contentSize);
        __CLR4_5_24pi4pilvlulerx.R.inc(6149);isoFile.addBox(mdat);
        __CLR4_5_24pi4pilvlulerx.R.inc(6150);LOG.logDebug("mdat crated");

        /*
        dataOffset is where the first sample starts. In this special mdat the samples always start
        at offset 16 so that we can use the same offset for large boxes and small boxes
         */
        __CLR4_5_24pi4pilvlulerx.R.inc(6151);long dataOffset = mdat.getDataOffset();
        __CLR4_5_24pi4pilvlulerx.R.inc(6152);for (StaticChunkOffsetBox chunkOffsetBox : chunkOffsetBoxes.values()) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6153);long[] offsets = chunkOffsetBox.getChunkOffsets();
            __CLR4_5_24pi4pilvlulerx.R.inc(6154);for (int i = 0; (((i < offsets.length)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6155)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6156)==0&false)); i++) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6157);offsets[i] += dataOffset;
            }
        }}
        }__CLR4_5_24pi4pilvlulerx.R.inc(6158);for (SampleAuxiliaryInformationOffsetsBox saio : sampleAuxiliaryInformationOffsetsBoxes) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6159);long offset = saio.getSize(); // the calculation is systematically wrong by 4, I don't want to debug why. Just a quick correction --san 14.May.13
            __CLR4_5_24pi4pilvlulerx.R.inc(6160);offset += 4 + 4 + 4 + 4 + 4 + 24;
            // size of all header we were missing otherwise (moov, trak, mdia, minf, stbl)
            __CLR4_5_24pi4pilvlulerx.R.inc(6161);Object b = saio;
            __CLR4_5_24pi4pilvlulerx.R.inc(6162);do {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6163);Object current = b;
                __CLR4_5_24pi4pilvlulerx.R.inc(6164);b = ((Box) b).getParent();

                __CLR4_5_24pi4pilvlulerx.R.inc(6165);for (Box box : ((Container) b).getBoxes()) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6166);if ((((box == current)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6167)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6168)==0&false))) {{
                        __CLR4_5_24pi4pilvlulerx.R.inc(6169);break;
                    }
                    }__CLR4_5_24pi4pilvlulerx.R.inc(6170);offset += box.getSize();
                }

            }} }while ((((b instanceof Box)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6171)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6172)==0&false)));

            __CLR4_5_24pi4pilvlulerx.R.inc(6173);long[] saioOffsets = saio.getOffsets();
            __CLR4_5_24pi4pilvlulerx.R.inc(6174);for (int i = 0; (((i < saioOffsets.length)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6175)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6176)==0&false)); i++) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6177);saioOffsets[i] = saioOffsets[i] + offset;

            }
            }__CLR4_5_24pi4pilvlulerx.R.inc(6178);saio.setOffsets(saioOffsets);
        }


        }__CLR4_5_24pi4pilvlulerx.R.inc(6179);return isoFile;
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected List<Sample> putSamples(Track track, List<Sample> samples) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6180);
        __CLR4_5_24pi4pilvlulerx.R.inc(6181);return track2Sample.put(track, samples);
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected FileTypeBox createFileTypeBox(Movie movie) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6182);
        __CLR4_5_24pi4pilvlulerx.R.inc(6183);List<String> minorBrands = new LinkedList<String>();

        __CLR4_5_24pi4pilvlulerx.R.inc(6184);minorBrands.add("mp42");
        __CLR4_5_24pi4pilvlulerx.R.inc(6185);minorBrands.add("iso6");
        __CLR4_5_24pi4pilvlulerx.R.inc(6186);minorBrands.add("avc1");
        __CLR4_5_24pi4pilvlulerx.R.inc(6187);minorBrands.add("isom");
        __CLR4_5_24pi4pilvlulerx.R.inc(6188);return new FileTypeBox("iso6", 1, minorBrands);
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected MovieBox createMovieBox(Movie movie, Map<Track, int[]> chunks) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6189);
        __CLR4_5_24pi4pilvlulerx.R.inc(6190);MovieBox movieBox = new MovieBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6191);MovieHeaderBox mvhd = new MovieHeaderBox();

        __CLR4_5_24pi4pilvlulerx.R.inc(6192);mvhd.setCreationTime(new Date());
        __CLR4_5_24pi4pilvlulerx.R.inc(6193);mvhd.setModificationTime(new Date());
        __CLR4_5_24pi4pilvlulerx.R.inc(6194);mvhd.setMatrix(movie.getMatrix());
        __CLR4_5_24pi4pilvlulerx.R.inc(6195);long movieTimeScale = getTimescale(movie);
        __CLR4_5_24pi4pilvlulerx.R.inc(6196);long duration = 0;

        __CLR4_5_24pi4pilvlulerx.R.inc(6197);for (Track track : movie.getTracks()) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6198);long tracksDuration;

            __CLR4_5_24pi4pilvlulerx.R.inc(6199);if ((((track.getEdits() == null || track.getEdits().isEmpty())&&(__CLR4_5_24pi4pilvlulerx.R.iget(6200)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6201)==0&false))) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6202);tracksDuration = (track.getDuration() * movieTimeScale / track.getTrackMetaData().getTimescale());
            } }else {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6203);double d = 0;
                __CLR4_5_24pi4pilvlulerx.R.inc(6204);for (Edit edit : track.getEdits()) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6205);d += (long) edit.getSegmentDuration();
                }
                }__CLR4_5_24pi4pilvlulerx.R.inc(6206);tracksDuration = (long) (d * movieTimeScale);
            }


            }__CLR4_5_24pi4pilvlulerx.R.inc(6207);if ((((tracksDuration > duration)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6208)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6209)==0&false))) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6210);duration = tracksDuration;
            }


        }}

        }__CLR4_5_24pi4pilvlulerx.R.inc(6211);mvhd.setDuration(duration);
        __CLR4_5_24pi4pilvlulerx.R.inc(6212);mvhd.setTimescale(movieTimeScale);
        // find the next available trackId
        __CLR4_5_24pi4pilvlulerx.R.inc(6213);long nextTrackId = 0;
        __CLR4_5_24pi4pilvlulerx.R.inc(6214);for (Track track : movie.getTracks()) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6215);nextTrackId = (((nextTrackId < track.getTrackMetaData().getTrackId() )&&(__CLR4_5_24pi4pilvlulerx.R.iget(6216)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6217)==0&false))? track.getTrackMetaData().getTrackId() : nextTrackId;
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6218);mvhd.setNextTrackId(++nextTrackId);

        __CLR4_5_24pi4pilvlulerx.R.inc(6219);movieBox.addBox(mvhd);
        __CLR4_5_24pi4pilvlulerx.R.inc(6220);for (Track track : movie.getTracks()) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6221);movieBox.addBox(createTrackBox(track, movie, chunks));
        }
        // metadata here
        }__CLR4_5_24pi4pilvlulerx.R.inc(6222);Box udta = createUdta(movie);
        __CLR4_5_24pi4pilvlulerx.R.inc(6223);if ((((udta != null)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6224)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6225)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6226);movieBox.addBox(udta);
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6227);return movieBox;

    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    /**
     * Override to create a user data box that may contain metadata.
     *
     * @param movie source movie
     * @return a 'udta' box or <code>null</code> if none provided
     */
    protected Box createUdta(Movie movie) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6228);
        __CLR4_5_24pi4pilvlulerx.R.inc(6229);return null;
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected TrackBox createTrackBox(Track track, Movie movie, Map<Track, int[]> chunks) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6230);

        __CLR4_5_24pi4pilvlulerx.R.inc(6231);TrackBox trackBox = new TrackBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6232);TrackHeaderBox tkhd = new TrackHeaderBox();

        __CLR4_5_24pi4pilvlulerx.R.inc(6233);tkhd.setEnabled(true);
        __CLR4_5_24pi4pilvlulerx.R.inc(6234);tkhd.setInMovie(true);
//        tkhd.setInPreview(true);
//        tkhd.setInPoster(true);
        __CLR4_5_24pi4pilvlulerx.R.inc(6235);tkhd.setMatrix(track.getTrackMetaData().getMatrix());

        __CLR4_5_24pi4pilvlulerx.R.inc(6236);tkhd.setAlternateGroup(track.getTrackMetaData().getGroup());
        __CLR4_5_24pi4pilvlulerx.R.inc(6237);tkhd.setCreationTime(track.getTrackMetaData().getCreationTime());

        __CLR4_5_24pi4pilvlulerx.R.inc(6238);if ((((track.getEdits() == null || track.getEdits().isEmpty())&&(__CLR4_5_24pi4pilvlulerx.R.iget(6239)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6240)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6241);tkhd.setDuration(track.getDuration() * getTimescale(movie) / track.getTrackMetaData().getTimescale());
        } }else {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6242);long d = 0;
            __CLR4_5_24pi4pilvlulerx.R.inc(6243);for (Edit edit : track.getEdits()) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6244);d += (long) edit.getSegmentDuration();
            }
            }__CLR4_5_24pi4pilvlulerx.R.inc(6245);tkhd.setDuration(d * track.getTrackMetaData().getTimescale());
        }


        }__CLR4_5_24pi4pilvlulerx.R.inc(6246);tkhd.setHeight(track.getTrackMetaData().getHeight());
        __CLR4_5_24pi4pilvlulerx.R.inc(6247);tkhd.setWidth(track.getTrackMetaData().getWidth());
        __CLR4_5_24pi4pilvlulerx.R.inc(6248);tkhd.setLayer(track.getTrackMetaData().getLayer());
        __CLR4_5_24pi4pilvlulerx.R.inc(6249);tkhd.setModificationTime(new Date());
        __CLR4_5_24pi4pilvlulerx.R.inc(6250);tkhd.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_24pi4pilvlulerx.R.inc(6251);tkhd.setVolume(track.getTrackMetaData().getVolume());

        __CLR4_5_24pi4pilvlulerx.R.inc(6252);trackBox.addBox(tkhd);

        __CLR4_5_24pi4pilvlulerx.R.inc(6253);trackBox.addBox(createEdts(track, movie));

        __CLR4_5_24pi4pilvlulerx.R.inc(6254);MediaBox mdia = new MediaBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6255);trackBox.addBox(mdia);
        __CLR4_5_24pi4pilvlulerx.R.inc(6256);MediaHeaderBox mdhd = new MediaHeaderBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6257);mdhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        __CLR4_5_24pi4pilvlulerx.R.inc(6258);mdhd.setDuration(track.getDuration());
        __CLR4_5_24pi4pilvlulerx.R.inc(6259);mdhd.setTimescale(track.getTrackMetaData().getTimescale());
        __CLR4_5_24pi4pilvlulerx.R.inc(6260);mdhd.setLanguage(track.getTrackMetaData().getLanguage());
        __CLR4_5_24pi4pilvlulerx.R.inc(6261);mdia.addBox(mdhd);
        __CLR4_5_24pi4pilvlulerx.R.inc(6262);HandlerBox hdlr = new HandlerBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6263);mdia.addBox(hdlr);

        __CLR4_5_24pi4pilvlulerx.R.inc(6264);hdlr.setHandlerType(track.getHandler());

        __CLR4_5_24pi4pilvlulerx.R.inc(6265);MediaInformationBox minf = new MediaInformationBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6266);if ((((track.getHandler().equals("vide"))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6267)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6268)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6269);minf.addBox(new VideoMediaHeaderBox());
        } }else {__CLR4_5_24pi4pilvlulerx.R.inc(6270);if ((((track.getHandler().equals("soun"))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6271)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6272)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6273);minf.addBox(new SoundMediaHeaderBox());
        } }else {__CLR4_5_24pi4pilvlulerx.R.inc(6274);if ((((track.getHandler().equals("text"))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6275)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6276)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6277);minf.addBox(new NullMediaHeaderBox());
        } }else {__CLR4_5_24pi4pilvlulerx.R.inc(6278);if ((((track.getHandler().equals("subt"))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6279)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6280)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6281);minf.addBox(new SubtitleMediaHeaderBox());
        } }else {__CLR4_5_24pi4pilvlulerx.R.inc(6282);if ((((track.getHandler().equals("hint"))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6283)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6284)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6285);minf.addBox(new HintMediaHeaderBox());
        } }else {__CLR4_5_24pi4pilvlulerx.R.inc(6286);if ((((track.getHandler().equals("sbtl"))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6287)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6288)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6289);minf.addBox(new NullMediaHeaderBox());
        }

        // dinf: all these three boxes tell us is that the actual
        // data is in the current file and not somewhere external
        }}}}}}__CLR4_5_24pi4pilvlulerx.R.inc(6290);DataInformationBox dinf = new DataInformationBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6291);DataReferenceBox dref = new DataReferenceBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6292);dinf.addBox(dref);
        __CLR4_5_24pi4pilvlulerx.R.inc(6293);DataEntryUrlBox url = new DataEntryUrlBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6294);url.setFlags(1);
        __CLR4_5_24pi4pilvlulerx.R.inc(6295);dref.addBox(url);
        __CLR4_5_24pi4pilvlulerx.R.inc(6296);minf.addBox(dinf);
        //

        __CLR4_5_24pi4pilvlulerx.R.inc(6297);Box stbl = createStbl(track, movie, chunks);
        __CLR4_5_24pi4pilvlulerx.R.inc(6298);minf.addBox(stbl);
        __CLR4_5_24pi4pilvlulerx.R.inc(6299);mdia.addBox(minf);
        __CLR4_5_24pi4pilvlulerx.R.inc(6300);LOG.logDebug("done with trak for track_" + track.getTrackMetaData().getTrackId());
        __CLR4_5_24pi4pilvlulerx.R.inc(6301);return trackBox;
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected Box createEdts(Track track, Movie movie) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6302);
        __CLR4_5_24pi4pilvlulerx.R.inc(6303);if ((((track.getEdits() != null && track.getEdits().size() > 0)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6304)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6305)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6306);EditListBox elst = new EditListBox();
            __CLR4_5_24pi4pilvlulerx.R.inc(6307);elst.setVersion(0); // quicktime won't play file when version = 1
            __CLR4_5_24pi4pilvlulerx.R.inc(6308);List<EditListBox.Entry> entries = new ArrayList<EditListBox.Entry>();

            __CLR4_5_24pi4pilvlulerx.R.inc(6309);for (Edit edit : track.getEdits()) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6310);entries.add(new EditListBox.Entry(elst,
                        Math.round(edit.getSegmentDuration() * movie.getTimescale()),
                        edit.getMediaTime() * track.getTrackMetaData().getTimescale() / edit.getTimeScale(),
                        edit.getMediaRate()));
            }

            }__CLR4_5_24pi4pilvlulerx.R.inc(6311);elst.setEntries(entries);
            __CLR4_5_24pi4pilvlulerx.R.inc(6312);EditBox edts = new EditBox();
            __CLR4_5_24pi4pilvlulerx.R.inc(6313);edts.addBox(elst);
            __CLR4_5_24pi4pilvlulerx.R.inc(6314);return edts;
        } }else {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6315);return null;
        }
    }}finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected Box createStbl(Track track, Movie movie, Map<Track, int[]> chunks) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6316);
        __CLR4_5_24pi4pilvlulerx.R.inc(6317);SampleTableBox stbl = new SampleTableBox();

        __CLR4_5_24pi4pilvlulerx.R.inc(6318);createStsd(track, stbl);
        __CLR4_5_24pi4pilvlulerx.R.inc(6319);createStts(track, stbl);
        __CLR4_5_24pi4pilvlulerx.R.inc(6320);createCtts(track, stbl);
        __CLR4_5_24pi4pilvlulerx.R.inc(6321);createStss(track, stbl);
        __CLR4_5_24pi4pilvlulerx.R.inc(6322);createSdtp(track, stbl);
        __CLR4_5_24pi4pilvlulerx.R.inc(6323);createStsc(track, chunks, stbl);
        __CLR4_5_24pi4pilvlulerx.R.inc(6324);createStsz(track, stbl);
        __CLR4_5_24pi4pilvlulerx.R.inc(6325);createStco(track, movie, chunks, stbl);


        __CLR4_5_24pi4pilvlulerx.R.inc(6326);Map<String, List<GroupEntry>> groupEntryFamilies = new HashMap<String, List<GroupEntry>>();
        __CLR4_5_24pi4pilvlulerx.R.inc(6327);for (Map.Entry<GroupEntry, long[]> sg : track.getSampleGroups().entrySet()) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6328);String type = sg.getKey().getType();
            __CLR4_5_24pi4pilvlulerx.R.inc(6329);List<GroupEntry> groupEntries = groupEntryFamilies.get(type);
            __CLR4_5_24pi4pilvlulerx.R.inc(6330);if ((((groupEntries == null)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6331)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6332)==0&false))) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6333);groupEntries = new ArrayList<GroupEntry>();
                __CLR4_5_24pi4pilvlulerx.R.inc(6334);groupEntryFamilies.put(type, groupEntries);
            }
            }__CLR4_5_24pi4pilvlulerx.R.inc(6335);groupEntries.add(sg.getKey());
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6336);for (Map.Entry<String, List<GroupEntry>> sg : groupEntryFamilies.entrySet()) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6337);SampleGroupDescriptionBox sgdb = new SampleGroupDescriptionBox();
            __CLR4_5_24pi4pilvlulerx.R.inc(6338);String type = sg.getKey();
            __CLR4_5_24pi4pilvlulerx.R.inc(6339);sgdb.setGroupingType(type);
            __CLR4_5_24pi4pilvlulerx.R.inc(6340);sgdb.setGroupEntries(sg.getValue());
            __CLR4_5_24pi4pilvlulerx.R.inc(6341);SampleToGroupBox sbgp = new SampleToGroupBox();
            __CLR4_5_24pi4pilvlulerx.R.inc(6342);sbgp.setGroupingType(type);
            __CLR4_5_24pi4pilvlulerx.R.inc(6343);SampleToGroupBox.Entry last = null;
            __CLR4_5_24pi4pilvlulerx.R.inc(6344);for (int i = 0; (((i < track.getSamples().size())&&(__CLR4_5_24pi4pilvlulerx.R.iget(6345)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6346)==0&false)); i++) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6347);int index = 0;
                __CLR4_5_24pi4pilvlulerx.R.inc(6348);for (int j = 0; (((j < sg.getValue().size())&&(__CLR4_5_24pi4pilvlulerx.R.iget(6349)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6350)==0&false)); j++) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6351);GroupEntry groupEntry = sg.getValue().get(j);
                    __CLR4_5_24pi4pilvlulerx.R.inc(6352);long[] sampleNums = track.getSampleGroups().get(groupEntry);
                    __CLR4_5_24pi4pilvlulerx.R.inc(6353);if ((((Arrays.binarySearch(sampleNums, i) >= 0)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6354)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6355)==0&false))) {{
                        __CLR4_5_24pi4pilvlulerx.R.inc(6356);index = j + 1;
                    }
                }}
                }__CLR4_5_24pi4pilvlulerx.R.inc(6357);if ((((last == null || last.getGroupDescriptionIndex() != index)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6358)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6359)==0&false))) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6360);last = new SampleToGroupBox.Entry(1, index);
                    __CLR4_5_24pi4pilvlulerx.R.inc(6361);sbgp.getEntries().add(last);
                } }else {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6362);last.setSampleCount(last.getSampleCount() + 1);
                }
            }}
            }__CLR4_5_24pi4pilvlulerx.R.inc(6363);stbl.addBox(sgdb);
            __CLR4_5_24pi4pilvlulerx.R.inc(6364);stbl.addBox(sbgp);
        }

        }__CLR4_5_24pi4pilvlulerx.R.inc(6365);if ((((track instanceof CencEncryptedTrack)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6366)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6367)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6368);createCencBoxes((CencEncryptedTrack) track, stbl, chunks.get(track));
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6369);createSubs(track, stbl);
        __CLR4_5_24pi4pilvlulerx.R.inc(6370);LOG.logDebug("done with stbl for track_" + track.getTrackMetaData().getTrackId());
        __CLR4_5_24pi4pilvlulerx.R.inc(6371);return stbl;
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createSubs(Track track, SampleTableBox stbl) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6372);
        __CLR4_5_24pi4pilvlulerx.R.inc(6373);if ((((track.getSubsampleInformationBox() != null)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6374)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6375)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6376);stbl.addBox(track.getSubsampleInformationBox());
        }
    }}finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createCencBoxes(CencEncryptedTrack track, SampleTableBox stbl, int[] chunkSizes) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6377);

        __CLR4_5_24pi4pilvlulerx.R.inc(6378);SampleAuxiliaryInformationSizesBox saiz = new SampleAuxiliaryInformationSizesBox();

        __CLR4_5_24pi4pilvlulerx.R.inc(6379);saiz.setAuxInfoType("cenc");
        __CLR4_5_24pi4pilvlulerx.R.inc(6380);saiz.setFlags(1);
        __CLR4_5_24pi4pilvlulerx.R.inc(6381);List<CencSampleAuxiliaryDataFormat> sampleEncryptionEntries = track.getSampleEncryptionEntries();
        __CLR4_5_24pi4pilvlulerx.R.inc(6382);if ((((track.hasSubSampleEncryption())&&(__CLR4_5_24pi4pilvlulerx.R.iget(6383)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6384)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6385);short[] sizes = new short[sampleEncryptionEntries.size()];
            __CLR4_5_24pi4pilvlulerx.R.inc(6386);for (int i = 0; (((i < sizes.length)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6387)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6388)==0&false)); i++) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6389);sizes[i] = (short) sampleEncryptionEntries.get(i).getSize();
            }
            }__CLR4_5_24pi4pilvlulerx.R.inc(6390);saiz.setSampleInfoSizes(sizes);
        } }else {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6391);saiz.setDefaultSampleInfoSize(8); // 8 bytes iv
            __CLR4_5_24pi4pilvlulerx.R.inc(6392);saiz.setSampleCount(track.getSamples().size());
        }

        }__CLR4_5_24pi4pilvlulerx.R.inc(6393);SampleAuxiliaryInformationOffsetsBox saio = new SampleAuxiliaryInformationOffsetsBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6394);SampleEncryptionBox senc = new SampleEncryptionBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6395);senc.setSubSampleEncryption(track.hasSubSampleEncryption());
        __CLR4_5_24pi4pilvlulerx.R.inc(6396);senc.setEntries(sampleEncryptionEntries);

        __CLR4_5_24pi4pilvlulerx.R.inc(6397);long offset = senc.getOffsetToFirstIV();
        __CLR4_5_24pi4pilvlulerx.R.inc(6398);int index = 0;
        __CLR4_5_24pi4pilvlulerx.R.inc(6399);long[] offsets = new long[chunkSizes.length];


        __CLR4_5_24pi4pilvlulerx.R.inc(6400);for (int i = 0; (((i < chunkSizes.length)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6401)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6402)==0&false)); i++) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6403);offsets[i] = offset;
            __CLR4_5_24pi4pilvlulerx.R.inc(6404);for (int j = 0; (((j < chunkSizes[i])&&(__CLR4_5_24pi4pilvlulerx.R.iget(6405)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6406)==0&false)); j++) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6407);offset += sampleEncryptionEntries.get(index++).getSize();
            }
        }}
        }__CLR4_5_24pi4pilvlulerx.R.inc(6408);saio.setOffsets(offsets);

        __CLR4_5_24pi4pilvlulerx.R.inc(6409);stbl.addBox(saiz);
        __CLR4_5_24pi4pilvlulerx.R.inc(6410);stbl.addBox(saio);
        __CLR4_5_24pi4pilvlulerx.R.inc(6411);stbl.addBox(senc);
        __CLR4_5_24pi4pilvlulerx.R.inc(6412);sampleAuxiliaryInformationOffsetsBoxes.add(saio);


    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createStsd(Track track, SampleTableBox stbl) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6413);
        __CLR4_5_24pi4pilvlulerx.R.inc(6414);stbl.addBox(track.getSampleDescriptionBox());
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createStco(Track targetTrack, Movie movie, Map<Track, int[]> chunks, SampleTableBox stbl) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6415);
        __CLR4_5_24pi4pilvlulerx.R.inc(6416);if ((((chunkOffsetBoxes.get(targetTrack) == null)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6417)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6418)==0&false))) {{
            // The ChunkOffsetBox we create here is just a stub
            // since we haven't created the whole structure we can't tell where the
            // first chunk starts (mdat box). So I just let the chunk offset
            // start at zero and I will add the mdat offset later.

            __CLR4_5_24pi4pilvlulerx.R.inc(6419);long offset = 0;
            // all tracks have the same number of chunks
            __CLR4_5_24pi4pilvlulerx.R.inc(6420);LOG.logDebug("Calculating chunk offsets for track_" + targetTrack.getTrackMetaData().getTrackId());

            __CLR4_5_24pi4pilvlulerx.R.inc(6421);List<Track> tracks = new ArrayList<Track>(chunks.keySet());
            __CLR4_5_24pi4pilvlulerx.R.inc(6422);Collections.sort(tracks, new Comparator<Track>() {
                public int compare(Track o1, Track o2) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6423);
                    __CLR4_5_24pi4pilvlulerx.R.inc(6424);return l2i(o1.getTrackMetaData().getTrackId() - o2.getTrackMetaData().getTrackId());
                }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}
            });
            __CLR4_5_24pi4pilvlulerx.R.inc(6425);Map<Track, Integer> trackToChunk = new HashMap<Track, Integer>();
            __CLR4_5_24pi4pilvlulerx.R.inc(6426);Map<Track, Integer> trackToSample = new HashMap<Track, Integer>();
            __CLR4_5_24pi4pilvlulerx.R.inc(6427);Map<Track, Double> trackToTime = new HashMap<Track, Double>();
            __CLR4_5_24pi4pilvlulerx.R.inc(6428);for (Track track : tracks) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6429);trackToChunk.put(track, 0);
                __CLR4_5_24pi4pilvlulerx.R.inc(6430);trackToSample.put(track, 0);
                __CLR4_5_24pi4pilvlulerx.R.inc(6431);trackToTime.put(track, 0.0);
                __CLR4_5_24pi4pilvlulerx.R.inc(6432);chunkOffsetBoxes.put(track, new StaticChunkOffsetBox());
            }

            }__CLR4_5_24pi4pilvlulerx.R.inc(6433);while (true) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6434);Track nextChunksTrack = null;
                __CLR4_5_24pi4pilvlulerx.R.inc(6435);for (Track track : tracks) {{
                    // This always chooses the least progressed track
                    __CLR4_5_24pi4pilvlulerx.R.inc(6436);if (((((nextChunksTrack == null || trackToTime.get(track) < trackToTime.get(nextChunksTrack)) &&
                            // either first OR track's next chunk's starttime is smaller than nextTrack's next chunks starttime
                            // AND their need to be chunks left!
                            (trackToChunk.get(track) < chunks.get(track).length))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6437)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6438)==0&false))) {{
                        __CLR4_5_24pi4pilvlulerx.R.inc(6439);nextChunksTrack = track;
                    }
                }}
                }__CLR4_5_24pi4pilvlulerx.R.inc(6440);if ((((nextChunksTrack == null)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6441)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6442)==0&false))) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6443);break; // no next
                }
                // found the next one
                }__CLR4_5_24pi4pilvlulerx.R.inc(6444);ChunkOffsetBox chunkOffsetBox = chunkOffsetBoxes.get(nextChunksTrack);
                __CLR4_5_24pi4pilvlulerx.R.inc(6445);chunkOffsetBox.setChunkOffsets(Mp4Arrays.copyOfAndAppend(chunkOffsetBox.getChunkOffsets(), offset));

                __CLR4_5_24pi4pilvlulerx.R.inc(6446);int nextChunksIndex = trackToChunk.get(nextChunksTrack);

                __CLR4_5_24pi4pilvlulerx.R.inc(6447);int numberOfSampleInNextChunk = chunks.get(nextChunksTrack)[nextChunksIndex];
                __CLR4_5_24pi4pilvlulerx.R.inc(6448);int startSample = trackToSample.get(nextChunksTrack);
                __CLR4_5_24pi4pilvlulerx.R.inc(6449);double time = trackToTime.get(nextChunksTrack);

                __CLR4_5_24pi4pilvlulerx.R.inc(6450);long[] durs = nextChunksTrack.getSampleDurations();
                __CLR4_5_24pi4pilvlulerx.R.inc(6451);for (int j = startSample; (((j < startSample + numberOfSampleInNextChunk)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6452)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6453)==0&false)); j++) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6454);offset += track2SampleSizes.get(nextChunksTrack)[j];
                    __CLR4_5_24pi4pilvlulerx.R.inc(6455);time += (double) durs[j] / nextChunksTrack.getTrackMetaData().getTimescale();
                }
                }__CLR4_5_24pi4pilvlulerx.R.inc(6456);trackToChunk.put(nextChunksTrack, nextChunksIndex + 1);
                __CLR4_5_24pi4pilvlulerx.R.inc(6457);trackToSample.put(nextChunksTrack, startSample + numberOfSampleInNextChunk);
                __CLR4_5_24pi4pilvlulerx.R.inc(6458);trackToTime.put(nextChunksTrack, time);
            }

        }}

        }__CLR4_5_24pi4pilvlulerx.R.inc(6459);stbl.addBox(chunkOffsetBoxes.get(targetTrack));
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createStsz(Track track, SampleTableBox stbl) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6460);
        __CLR4_5_24pi4pilvlulerx.R.inc(6461);SampleSizeBox stsz = new SampleSizeBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6462);stsz.setSampleSizes(track2SampleSizes.get(track));

        __CLR4_5_24pi4pilvlulerx.R.inc(6463);stbl.addBox(stsz);
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createStsc(Track track, Map<Track, int[]> chunks, SampleTableBox stbl) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6464);
        __CLR4_5_24pi4pilvlulerx.R.inc(6465);int[] tracksChunkSizes = chunks.get(track);

        __CLR4_5_24pi4pilvlulerx.R.inc(6466);SampleToChunkBox stsc = new SampleToChunkBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6467);stsc.setEntries(new LinkedList<SampleToChunkBox.Entry>());
        __CLR4_5_24pi4pilvlulerx.R.inc(6468);long lastChunkSize = Integer.MIN_VALUE; // to be sure the first chunks hasn't got the same size
        __CLR4_5_24pi4pilvlulerx.R.inc(6469);for (int i = 0; (((i < tracksChunkSizes.length)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6470)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6471)==0&false)); i++) {{
            // The sample description index references the sample description box
            // that describes the samples of this chunk. My Tracks cannot have more
            // than one sample description box. Therefore 1 is always right
            // the first chunk has the number '1'
            __CLR4_5_24pi4pilvlulerx.R.inc(6472);if ((((lastChunkSize != tracksChunkSizes[i])&&(__CLR4_5_24pi4pilvlulerx.R.iget(6473)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6474)==0&false))) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6475);stsc.getEntries().add(new SampleToChunkBox.Entry(i + 1, tracksChunkSizes[i], 1));
                __CLR4_5_24pi4pilvlulerx.R.inc(6476);lastChunkSize = tracksChunkSizes[i];
            }
        }}
        }__CLR4_5_24pi4pilvlulerx.R.inc(6477);stbl.addBox(stsc);
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createSdtp(Track track, SampleTableBox stbl) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6478);
        __CLR4_5_24pi4pilvlulerx.R.inc(6479);if ((((track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty())&&(__CLR4_5_24pi4pilvlulerx.R.iget(6480)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6481)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6482);SampleDependencyTypeBox sdtp = new SampleDependencyTypeBox();
            __CLR4_5_24pi4pilvlulerx.R.inc(6483);sdtp.setEntries(track.getSampleDependencies());
            __CLR4_5_24pi4pilvlulerx.R.inc(6484);stbl.addBox(sdtp);
        }
    }}finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createStss(Track track, SampleTableBox stbl) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6485);
        __CLR4_5_24pi4pilvlulerx.R.inc(6486);long[] syncSamples = track.getSyncSamples();
        __CLR4_5_24pi4pilvlulerx.R.inc(6487);if ((((syncSamples != null && syncSamples.length > 0)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6488)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6489)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6490);SyncSampleBox stss = new SyncSampleBox();
            __CLR4_5_24pi4pilvlulerx.R.inc(6491);stss.setSampleNumber(syncSamples);
            __CLR4_5_24pi4pilvlulerx.R.inc(6492);stbl.addBox(stss);
        }
    }}finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createCtts(Track track, SampleTableBox stbl) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6493);
        __CLR4_5_24pi4pilvlulerx.R.inc(6494);List<CompositionTimeToSample.Entry> compositionTimeToSampleEntries = track.getCompositionTimeEntries();
        __CLR4_5_24pi4pilvlulerx.R.inc(6495);if ((((compositionTimeToSampleEntries != null && !compositionTimeToSampleEntries.isEmpty())&&(__CLR4_5_24pi4pilvlulerx.R.iget(6496)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6497)==0&false))) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6498);CompositionTimeToSample ctts = new CompositionTimeToSample();
            __CLR4_5_24pi4pilvlulerx.R.inc(6499);ctts.setEntries(compositionTimeToSampleEntries);
            __CLR4_5_24pi4pilvlulerx.R.inc(6500);stbl.addBox(ctts);
        }
    }}finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    protected void createStts(Track track, SampleTableBox stbl) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6501);
        __CLR4_5_24pi4pilvlulerx.R.inc(6502);TimeToSampleBox.Entry lastEntry = null;
        __CLR4_5_24pi4pilvlulerx.R.inc(6503);List<TimeToSampleBox.Entry> entries = new ArrayList<TimeToSampleBox.Entry>();

        __CLR4_5_24pi4pilvlulerx.R.inc(6504);for (long delta : track.getSampleDurations()) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6505);if ((((lastEntry != null && lastEntry.getDelta() == delta)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6506)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6507)==0&false))) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6508);lastEntry.setCount(lastEntry.getCount() + 1);
            } }else {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6509);lastEntry = new TimeToSampleBox.Entry(1, delta);
                __CLR4_5_24pi4pilvlulerx.R.inc(6510);entries.add(lastEntry);
            }

        }}
        }__CLR4_5_24pi4pilvlulerx.R.inc(6511);TimeToSampleBox stts = new TimeToSampleBox();
        __CLR4_5_24pi4pilvlulerx.R.inc(6512);stts.setEntries(entries);
        __CLR4_5_24pi4pilvlulerx.R.inc(6513);stbl.addBox(stts);
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    /**
     * Gets the chunk sizes for the given track.
     *
     * @param track the track we are talking about
     * @return the size of each chunk in number of samples
     */
    int[] getChunkSizes(Track track) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6514);

        __CLR4_5_24pi4pilvlulerx.R.inc(6515);long[] referenceChunkStarts = fragmenter.sampleNumbers(track);
        __CLR4_5_24pi4pilvlulerx.R.inc(6516);int[] chunkSizes = new int[referenceChunkStarts.length];


        __CLR4_5_24pi4pilvlulerx.R.inc(6517);for (int i = 0; (((i < referenceChunkStarts.length)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6518)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6519)==0&false)); i++) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6520);long start = referenceChunkStarts[i] - 1;
            __CLR4_5_24pi4pilvlulerx.R.inc(6521);long end;
            __CLR4_5_24pi4pilvlulerx.R.inc(6522);if ((((referenceChunkStarts.length == i + 1)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6523)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6524)==0&false))) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6525);end = track.getSamples().size();
            } }else {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6526);end = referenceChunkStarts[i + 1] - 1;
            }

            }__CLR4_5_24pi4pilvlulerx.R.inc(6527);chunkSizes[i] = l2i(end - start);
        }
        }assert (((DefaultMp4Builder.this.track2Sample.get(track).size() == sum(chunkSizes) )&&(__CLR4_5_24pi4pilvlulerx.R.iget(6528)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6529)==0&false)): "The number of samples and the sum of all chunk lengths must be equal";
        __CLR4_5_24pi4pilvlulerx.R.inc(6530);return chunkSizes;


    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    public long getTimescale(Movie movie) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6531);

        __CLR4_5_24pi4pilvlulerx.R.inc(6532);long timescale = movie.getTracks().iterator().next().getTrackMetaData().getTimescale();
        __CLR4_5_24pi4pilvlulerx.R.inc(6533);for (Track track : movie.getTracks()) {{
            __CLR4_5_24pi4pilvlulerx.R.inc(6534);timescale = lcm(timescale, track.getTrackMetaData().getTimescale());
        }
        }__CLR4_5_24pi4pilvlulerx.R.inc(6535);return timescale;
    }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    private class InterleaveChunkMdat implements Box {
        List<Track> tracks;
        List<List<Sample>> chunkList = new ArrayList<List<Sample>>();
        Container parent;

        long contentSize;

        private InterleaveChunkMdat(Movie movie, Map<Track, int[]> chunks, long contentSize) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6536);
            __CLR4_5_24pi4pilvlulerx.R.inc(6537);this.contentSize = contentSize;
            __CLR4_5_24pi4pilvlulerx.R.inc(6538);this.tracks = movie.getTracks();
            __CLR4_5_24pi4pilvlulerx.R.inc(6539);List<Track> tracks = new ArrayList<Track>(chunks.keySet());
            __CLR4_5_24pi4pilvlulerx.R.inc(6540);Collections.sort(tracks, new Comparator<Track>() {
                public int compare(Track o1, Track o2) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6541);
                    __CLR4_5_24pi4pilvlulerx.R.inc(6542);return l2i(o1.getTrackMetaData().getTrackId() - o2.getTrackMetaData().getTrackId());
                }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}
            });
            __CLR4_5_24pi4pilvlulerx.R.inc(6543);Map<Track, Integer> trackToChunk = new HashMap<Track, Integer>();
            __CLR4_5_24pi4pilvlulerx.R.inc(6544);Map<Track, Integer> trackToSample = new HashMap<Track, Integer>();
            __CLR4_5_24pi4pilvlulerx.R.inc(6545);Map<Track, Double> trackToTime = new HashMap<Track, Double>();
            __CLR4_5_24pi4pilvlulerx.R.inc(6546);for (Track track : tracks) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6547);trackToChunk.put(track, 0);
                __CLR4_5_24pi4pilvlulerx.R.inc(6548);trackToSample.put(track, 0);
                __CLR4_5_24pi4pilvlulerx.R.inc(6549);trackToTime.put(track, 0.0);
            }

            }__CLR4_5_24pi4pilvlulerx.R.inc(6550);while (true) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6551);Track nextChunksTrack = null;
                __CLR4_5_24pi4pilvlulerx.R.inc(6552);for (Track track : tracks) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6553);if (((((nextChunksTrack == null || trackToTime.get(track) < trackToTime.get(nextChunksTrack)) &&
                            // either first OR track's next chunk's starttime is smaller than nextTrack's next chunks starttime
                            // AND their need to be chunks left!
                            (trackToChunk.get(track) < chunks.get(track).length))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6554)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6555)==0&false))) {{
                        __CLR4_5_24pi4pilvlulerx.R.inc(6556);nextChunksTrack = track;
                    }
                }}
                }__CLR4_5_24pi4pilvlulerx.R.inc(6557);if ((((nextChunksTrack == null)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6558)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6559)==0&false))) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6560);break;
                }
                // found the next one

                }__CLR4_5_24pi4pilvlulerx.R.inc(6561);int nextChunksIndex = trackToChunk.get(nextChunksTrack);
                __CLR4_5_24pi4pilvlulerx.R.inc(6562);int numberOfSampleInNextChunk = chunks.get(nextChunksTrack)[nextChunksIndex];
                __CLR4_5_24pi4pilvlulerx.R.inc(6563);int startSample = trackToSample.get(nextChunksTrack);
                __CLR4_5_24pi4pilvlulerx.R.inc(6564);double time = trackToTime.get(nextChunksTrack);
                __CLR4_5_24pi4pilvlulerx.R.inc(6565);for (int j = startSample; (((j < startSample + numberOfSampleInNextChunk)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6566)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6567)==0&false)); j++) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6568);time += (double) nextChunksTrack.getSampleDurations()[j] / nextChunksTrack.getTrackMetaData().getTimescale();
                }
                }__CLR4_5_24pi4pilvlulerx.R.inc(6569);chunkList.add(nextChunksTrack.getSamples().subList(startSample, startSample + numberOfSampleInNextChunk));

                __CLR4_5_24pi4pilvlulerx.R.inc(6570);trackToChunk.put(nextChunksTrack, nextChunksIndex + 1);
                __CLR4_5_24pi4pilvlulerx.R.inc(6571);trackToSample.put(nextChunksTrack, startSample + numberOfSampleInNextChunk);
                __CLR4_5_24pi4pilvlulerx.R.inc(6572);trackToTime.put(nextChunksTrack, time);
            }


        }}finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

        public Container getParent() {try{__CLR4_5_24pi4pilvlulerx.R.inc(6573);
            __CLR4_5_24pi4pilvlulerx.R.inc(6574);return parent;
        }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

        public void setParent(Container parent) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6575);
            __CLR4_5_24pi4pilvlulerx.R.inc(6576);this.parent = parent;
        }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

        public long getOffset() {try{__CLR4_5_24pi4pilvlulerx.R.inc(6577);
            __CLR4_5_24pi4pilvlulerx.R.inc(6578);throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

        public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_24pi4pilvlulerx.R.inc(6579);
        }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

        public long getDataOffset() {try{__CLR4_5_24pi4pilvlulerx.R.inc(6580);
            __CLR4_5_24pi4pilvlulerx.R.inc(6581);Object b = this;
            __CLR4_5_24pi4pilvlulerx.R.inc(6582);long offset = 16;
            __CLR4_5_24pi4pilvlulerx.R.inc(6583);while ((((b instanceof Box)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6584)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6585)==0&false))) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6586);for (Box box : ((Box) b).getParent().getBoxes()) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6587);if ((((b == box)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6588)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6589)==0&false))) {{
                        __CLR4_5_24pi4pilvlulerx.R.inc(6590);break;
                    }
                    }__CLR4_5_24pi4pilvlulerx.R.inc(6591);offset += box.getSize();
                }
                }__CLR4_5_24pi4pilvlulerx.R.inc(6592);b = ((Box) b).getParent();
            }
            }__CLR4_5_24pi4pilvlulerx.R.inc(6593);return offset;
        }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}


        public String getType() {try{__CLR4_5_24pi4pilvlulerx.R.inc(6594);
            __CLR4_5_24pi4pilvlulerx.R.inc(6595);return "mdat";
        }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_24pi4pilvlulerx.R.inc(6596);
            __CLR4_5_24pi4pilvlulerx.R.inc(6597);return 16 + contentSize;
        }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

        private boolean isSmallBox(long contentSize) {try{__CLR4_5_24pi4pilvlulerx.R.inc(6598);
            __CLR4_5_24pi4pilvlulerx.R.inc(6599);return (contentSize + 8) < 4294967296L;
        }finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}


        public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_24pi4pilvlulerx.R.inc(6600);
            __CLR4_5_24pi4pilvlulerx.R.inc(6601);ByteBuffer bb = ByteBuffer.allocate(16);
            __CLR4_5_24pi4pilvlulerx.R.inc(6602);long size = getSize();
            __CLR4_5_24pi4pilvlulerx.R.inc(6603);if ((((isSmallBox(size))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6604)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6605)==0&false))) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6606);IsoTypeWriter.writeUInt32(bb, size);
            } }else {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6607);IsoTypeWriter.writeUInt32(bb, 1);
            }
            }__CLR4_5_24pi4pilvlulerx.R.inc(6608);bb.put(IsoFile.fourCCtoBytes("mdat"));
            __CLR4_5_24pi4pilvlulerx.R.inc(6609);if ((((isSmallBox(size))&&(__CLR4_5_24pi4pilvlulerx.R.iget(6610)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6611)==0&false))) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6612);bb.put(new byte[8]);
            } }else {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6613);IsoTypeWriter.writeUInt64(bb, size);
            }
            }__CLR4_5_24pi4pilvlulerx.R.inc(6614);bb.rewind();
            __CLR4_5_24pi4pilvlulerx.R.inc(6615);writableByteChannel.write(bb);
            __CLR4_5_24pi4pilvlulerx.R.inc(6616);long writtenBytes = 0;
            __CLR4_5_24pi4pilvlulerx.R.inc(6617);long writtenMegaBytes = 0;

            __CLR4_5_24pi4pilvlulerx.R.inc(6618);LOG.logDebug("About to write " + contentSize);
            __CLR4_5_24pi4pilvlulerx.R.inc(6619);for (List<Sample> samples : chunkList) {{
                __CLR4_5_24pi4pilvlulerx.R.inc(6620);for (Sample sample : samples) {{
                    __CLR4_5_24pi4pilvlulerx.R.inc(6621);sample.writeTo(writableByteChannel);
                    __CLR4_5_24pi4pilvlulerx.R.inc(6622);writtenBytes += sample.getSize();
                    __CLR4_5_24pi4pilvlulerx.R.inc(6623);if ((((writtenBytes > 1024 * 1024)&&(__CLR4_5_24pi4pilvlulerx.R.iget(6624)!=0|true))||(__CLR4_5_24pi4pilvlulerx.R.iget(6625)==0&false))) {{
                        __CLR4_5_24pi4pilvlulerx.R.inc(6626);writtenBytes -= 1024 * 1024;
                        __CLR4_5_24pi4pilvlulerx.R.inc(6627);writtenMegaBytes++;
                        __CLR4_5_24pi4pilvlulerx.R.inc(6628);LOG.logDebug("Written " + writtenMegaBytes + "MB");
                    }
                }}
            }}

        }}finally{__CLR4_5_24pi4pilvlulerx.R.flushNeeded();}}

    }
}
