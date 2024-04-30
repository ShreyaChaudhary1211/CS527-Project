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
import com.coremedia.iso.boxes.fragment.*;
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
import com.googlecode.mp4parser.util.Path;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.*;
import java.util.logging.Logger;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Creates a fragmented MP4 file.
 */
public class FragmentedMp4Builder implements Mp4Builder {public static class __CLR4_5_2545545lvlulf94{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,7197,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger LOG = Logger.getLogger(FragmentedMp4Builder.class.getName());

    protected Fragmenter fragmenter;

    public FragmentedMp4Builder() {try{__CLR4_5_2545545lvlulf94.R.inc(6629);
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    public Date getDate() {try{__CLR4_5_2545545lvlulf94.R.inc(6630);
        __CLR4_5_2545545lvlulf94.R.inc(6631);return new Date();
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    public Box createFtyp(Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(6632);
        __CLR4_5_2545545lvlulf94.R.inc(6633);List<String> minorBrands = new LinkedList<String>();
        __CLR4_5_2545545lvlulf94.R.inc(6634);minorBrands.add("mp42");
        __CLR4_5_2545545lvlulf94.R.inc(6635);minorBrands.add("iso6");
        __CLR4_5_2545545lvlulf94.R.inc(6636);minorBrands.add("avc1");
        __CLR4_5_2545545lvlulf94.R.inc(6637);minorBrands.add("isom");
        __CLR4_5_2545545lvlulf94.R.inc(6638);return new FileTypeBox("iso6", 1, minorBrands);
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * Sorts fragments by start time.
     *
     * @param tracks          the list of tracks to returned sorted
     * @param cycle           current fragment (sorting may vary between the fragments)
     * @param intersectionMap a map from tracks to their fragments' first samples.
     * @return the list of tracks in order of appearance in the fragment
     */
    protected List<Track> sortTracksInSequence(List<Track> tracks, final int cycle, final Map<Track, long[]> intersectionMap) {try{__CLR4_5_2545545lvlulf94.R.inc(6639);
        __CLR4_5_2545545lvlulf94.R.inc(6640);tracks = new LinkedList<Track>(tracks);
        __CLR4_5_2545545lvlulf94.R.inc(6641);Collections.sort(tracks, new Comparator<Track>() {
            public int compare(Track o1, Track o2) {try{__CLR4_5_2545545lvlulf94.R.inc(6642);
                __CLR4_5_2545545lvlulf94.R.inc(6643);long startSample1 = intersectionMap.get(o1)[cycle];
                // one based sample numbers - the first sample is 1
                __CLR4_5_2545545lvlulf94.R.inc(6644);long startSample2 = intersectionMap.get(o2)[cycle];
                // one based sample numbers - the first sample is 1

                // now let's get the start times
                __CLR4_5_2545545lvlulf94.R.inc(6645);long[] decTimes1 = o1.getSampleDurations();
                __CLR4_5_2545545lvlulf94.R.inc(6646);long[] decTimes2 = o2.getSampleDurations();
                __CLR4_5_2545545lvlulf94.R.inc(6647);long startTime1 = 0;
                __CLR4_5_2545545lvlulf94.R.inc(6648);long startTime2 = 0;

                __CLR4_5_2545545lvlulf94.R.inc(6649);for (int i = 1; (((i < startSample1)&&(__CLR4_5_2545545lvlulf94.R.iget(6650)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6651)==0&false)); i++) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6652);startTime1 += decTimes1[i - 1];
                }
                }__CLR4_5_2545545lvlulf94.R.inc(6653);for (int i = 1; (((i < startSample2)&&(__CLR4_5_2545545lvlulf94.R.iget(6654)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6655)==0&false)); i++) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6656);startTime2 += decTimes2[i - 1];
                }

                // and compare
                }__CLR4_5_2545545lvlulf94.R.inc(6657);return (int) (((double) startTime1 / o1.getTrackMetaData().getTimescale() - (double) startTime2 / o2.getTrackMetaData().getTimescale()) * 100);
            }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}
        });
        __CLR4_5_2545545lvlulf94.R.inc(6658);return tracks;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}


    protected List<Box> createMoofMdat(final Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(6659);
        __CLR4_5_2545545lvlulf94.R.inc(6660);List<Box> moofsMdats = new LinkedList<Box>();
        __CLR4_5_2545545lvlulf94.R.inc(6661);HashMap<Track, long[]> intersectionMap = new HashMap<Track, long[]>();
        __CLR4_5_2545545lvlulf94.R.inc(6662);HashMap<Track, Double> track2currentTime = new HashMap<Track, Double>();

        __CLR4_5_2545545lvlulf94.R.inc(6663);for (Track track : movie.getTracks()) {{
            __CLR4_5_2545545lvlulf94.R.inc(6664);long[] intersects = fragmenter.sampleNumbers(track);
            __CLR4_5_2545545lvlulf94.R.inc(6665);intersectionMap.put(track, intersects);
            __CLR4_5_2545545lvlulf94.R.inc(6666);track2currentTime.put(track, 0.0);

        }

        }__CLR4_5_2545545lvlulf94.R.inc(6667);int sequence = 1;
        __CLR4_5_2545545lvlulf94.R.inc(6668);while ((((!intersectionMap.isEmpty())&&(__CLR4_5_2545545lvlulf94.R.iget(6669)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6670)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(6671);Track earliestTrack = null;
            __CLR4_5_2545545lvlulf94.R.inc(6672);double earliestTime = Double.MAX_VALUE;
            __CLR4_5_2545545lvlulf94.R.inc(6673);for (Map.Entry<Track, Double> trackEntry : track2currentTime.entrySet()) {{
                __CLR4_5_2545545lvlulf94.R.inc(6674);if ((((trackEntry.getValue() < earliestTime)&&(__CLR4_5_2545545lvlulf94.R.iget(6675)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6676)==0&false))) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6677);earliestTime = trackEntry.getValue();
                    __CLR4_5_2545545lvlulf94.R.inc(6678);earliestTrack = trackEntry.getKey();
                }
            }}
            }assert (((earliestTrack != null)&&(__CLR4_5_2545545lvlulf94.R.iget(6679)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6680)==0&false));

            __CLR4_5_2545545lvlulf94.R.inc(6681);long[] startSamples = intersectionMap.get(earliestTrack);
            __CLR4_5_2545545lvlulf94.R.inc(6682);long startSample = startSamples[0];
            __CLR4_5_2545545lvlulf94.R.inc(6683);long endSample = (((startSamples.length > 1 )&&(__CLR4_5_2545545lvlulf94.R.iget(6684)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6685)==0&false))? startSamples[1] : earliestTrack.getSamples().size() + 1;

            __CLR4_5_2545545lvlulf94.R.inc(6686);long[] times = earliestTrack.getSampleDurations();
            __CLR4_5_2545545lvlulf94.R.inc(6687);long timscale = earliestTrack.getTrackMetaData().getTimescale();
            __CLR4_5_2545545lvlulf94.R.inc(6688);for (long i = startSample; (((i < endSample)&&(__CLR4_5_2545545lvlulf94.R.iget(6689)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6690)==0&false)); i++) {{
                __CLR4_5_2545545lvlulf94.R.inc(6691);earliestTime += (double) times[l2i(i-1)] / timscale;
            }
            }__CLR4_5_2545545lvlulf94.R.inc(6692);createFragment(moofsMdats, earliestTrack, startSample, endSample, sequence);

            __CLR4_5_2545545lvlulf94.R.inc(6693);if ((((startSamples.length == 1)&&(__CLR4_5_2545545lvlulf94.R.iget(6694)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6695)==0&false))) {{
                __CLR4_5_2545545lvlulf94.R.inc(6696);intersectionMap.remove(earliestTrack);
                __CLR4_5_2545545lvlulf94.R.inc(6697);track2currentTime.remove(earliestTrack);
                // all sample written.
            } }else {{
                __CLR4_5_2545545lvlulf94.R.inc(6698);long[] nuStartSamples = new long[startSamples.length - 1];
                __CLR4_5_2545545lvlulf94.R.inc(6699);System.arraycopy(startSamples, 1, nuStartSamples, 0, nuStartSamples.length);
                __CLR4_5_2545545lvlulf94.R.inc(6700);intersectionMap.put(earliestTrack, nuStartSamples);
                __CLR4_5_2545545lvlulf94.R.inc(6701);track2currentTime.put(earliestTrack, earliestTime);
            }


            }__CLR4_5_2545545lvlulf94.R.inc(6702);sequence++;

        }

      /* sequence = 1;
        // this loop has two indices:

        for (int cycle = 0; cycle < maxNumberOfFragments; cycle++) {

            final List<Track> sortedTracks = sortTracksInSequence(movie.getTracks(), cycle, intersectionMap);

            for (Track track : sortedTracks) {
                long[] startSamples = intersectionMap.get(track);
                long startSample = startSamples[cycle];
                // one based sample numbers - the first sample is 1
                long endSample = cycle + 1 < startSamples.length ? startSamples[cycle + 1] : track.getSamples().size() + 1;
                createFragment(moofsMdats, track, startSample, endSample, sequence);
                sequence++;
            }
        }*/
        }__CLR4_5_2545545lvlulf94.R.inc(6703);return moofsMdats;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected int createFragment(List<Box> moofsMdats, Track track, long startSample, long endSample, int sequence) {try{__CLR4_5_2545545lvlulf94.R.inc(6704);


        // if startSample == endSample the cycle is empty!
        __CLR4_5_2545545lvlulf94.R.inc(6705);if ((((startSample != endSample)&&(__CLR4_5_2545545lvlulf94.R.iget(6706)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6707)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(6708);moofsMdats.add(createMoof(startSample, endSample, track, sequence));
            __CLR4_5_2545545lvlulf94.R.inc(6709);moofsMdats.add(createMdat(startSample, endSample, track, sequence));
        }
        }__CLR4_5_2545545lvlulf94.R.inc(6710);return sequence;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public Container build(Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(6711);
        __CLR4_5_2545545lvlulf94.R.inc(6712);LOG.fine("Creating movie " + movie);
        __CLR4_5_2545545lvlulf94.R.inc(6713);if ((((fragmenter == null)&&(__CLR4_5_2545545lvlulf94.R.iget(6714)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6715)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(6716);fragmenter = new BetterFragmenter(2);
        }
        }__CLR4_5_2545545lvlulf94.R.inc(6717);BasicContainer isoFile = new BasicContainer();


        __CLR4_5_2545545lvlulf94.R.inc(6718);isoFile.addBox(createFtyp(movie));
        //isoFile.addBox(createPdin(movie));
        __CLR4_5_2545545lvlulf94.R.inc(6719);isoFile.addBox(createMoov(movie));

        __CLR4_5_2545545lvlulf94.R.inc(6720);for (Box box : createMoofMdat(movie)) {{
            __CLR4_5_2545545lvlulf94.R.inc(6721);isoFile.addBox(box);
        }
        }__CLR4_5_2545545lvlulf94.R.inc(6722);isoFile.addBox(createMfra(movie, isoFile));

        __CLR4_5_2545545lvlulf94.R.inc(6723);return isoFile;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createMdat(final long startSample, final long endSample, final Track track, final int i) {try{__CLR4_5_2545545lvlulf94.R.inc(6724);

        class Mdat implements Box {
            Container parent;
            long size_ = -1;

            public Container getParent() {try{__CLR4_5_2545545lvlulf94.R.inc(6725);
                __CLR4_5_2545545lvlulf94.R.inc(6726);return parent;
            }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

            public void setParent(Container parent) {try{__CLR4_5_2545545lvlulf94.R.inc(6727);
                __CLR4_5_2545545lvlulf94.R.inc(6728);this.parent = parent;
            }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

            public long getOffset() {try{__CLR4_5_2545545lvlulf94.R.inc(6729);
                __CLR4_5_2545545lvlulf94.R.inc(6730);throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
            }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

            public long getSize() {try{__CLR4_5_2545545lvlulf94.R.inc(6731);
                __CLR4_5_2545545lvlulf94.R.inc(6732);if ((((size_ != -1)&&(__CLR4_5_2545545lvlulf94.R.iget(6733)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6734)==0&false))) {__CLR4_5_2545545lvlulf94.R.inc(6735);return size_;
                }__CLR4_5_2545545lvlulf94.R.inc(6736);long size = 8; // I don't expect 2gig fragments
                __CLR4_5_2545545lvlulf94.R.inc(6737);for (Sample sample : getSamples(startSample, endSample, track)) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6738);size += sample.getSize();
                }
                }__CLR4_5_2545545lvlulf94.R.inc(6739);size_ = size;
                __CLR4_5_2545545lvlulf94.R.inc(6740);return size;
            }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

            public String getType() {try{__CLR4_5_2545545lvlulf94.R.inc(6741);
                __CLR4_5_2545545lvlulf94.R.inc(6742);return "mdat";
            }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

            public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2545545lvlulf94.R.inc(6743);
                __CLR4_5_2545545lvlulf94.R.inc(6744);ByteBuffer header = ByteBuffer.allocate(8);
                __CLR4_5_2545545lvlulf94.R.inc(6745);IsoTypeWriter.writeUInt32(header, l2i(getSize()));
                __CLR4_5_2545545lvlulf94.R.inc(6746);header.put(IsoFile.fourCCtoBytes(getType()));
                __CLR4_5_2545545lvlulf94.R.inc(6747);header.rewind();
                __CLR4_5_2545545lvlulf94.R.inc(6748);writableByteChannel.write(header);

                __CLR4_5_2545545lvlulf94.R.inc(6749);List<Sample> samples = getSamples(startSample, endSample, track);
                __CLR4_5_2545545lvlulf94.R.inc(6750);for (Sample sample : samples) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6751);sample.writeTo(writableByteChannel);
                }


            }}finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

            public void parse(DataSource fileChannel, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2545545lvlulf94.R.inc(6752);

            }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}
        }

        __CLR4_5_2545545lvlulf94.R.inc(6753);return new Mdat();
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected void createTfhd(long startSample, long endSample, Track track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_2545545lvlulf94.R.inc(6754);
        __CLR4_5_2545545lvlulf94.R.inc(6755);TrackFragmentHeaderBox tfhd = new TrackFragmentHeaderBox();
        __CLR4_5_2545545lvlulf94.R.inc(6756);SampleFlags sf = new SampleFlags();

        __CLR4_5_2545545lvlulf94.R.inc(6757);tfhd.setDefaultSampleFlags(sf);
        __CLR4_5_2545545lvlulf94.R.inc(6758);tfhd.setBaseDataOffset(-1);
        __CLR4_5_2545545lvlulf94.R.inc(6759);tfhd.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_2545545lvlulf94.R.inc(6760);tfhd.setDefaultBaseIsMoof(true);
        __CLR4_5_2545545lvlulf94.R.inc(6761);parent.addBox(tfhd);
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected void createMfhd(long startSample, long endSample, Track track, int sequenceNumber, MovieFragmentBox parent) {try{__CLR4_5_2545545lvlulf94.R.inc(6762);
        __CLR4_5_2545545lvlulf94.R.inc(6763);MovieFragmentHeaderBox mfhd = new MovieFragmentHeaderBox();
        __CLR4_5_2545545lvlulf94.R.inc(6764);mfhd.setSequenceNumber(sequenceNumber);
        __CLR4_5_2545545lvlulf94.R.inc(6765);parent.addBox(mfhd);
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected void createTraf(long startSample, long endSample, Track track, int sequenceNumber, MovieFragmentBox parent) {try{__CLR4_5_2545545lvlulf94.R.inc(6766);
        __CLR4_5_2545545lvlulf94.R.inc(6767);TrackFragmentBox traf = new TrackFragmentBox();
        __CLR4_5_2545545lvlulf94.R.inc(6768);parent.addBox(traf);
        __CLR4_5_2545545lvlulf94.R.inc(6769);createTfhd(startSample, endSample, track, sequenceNumber, traf);
        __CLR4_5_2545545lvlulf94.R.inc(6770);createTfdt(startSample, track, traf);
        __CLR4_5_2545545lvlulf94.R.inc(6771);createTrun(startSample, endSample, track, sequenceNumber, traf);

        __CLR4_5_2545545lvlulf94.R.inc(6772);if ((((track instanceof CencEncryptedTrack)&&(__CLR4_5_2545545lvlulf94.R.iget(6773)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6774)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(6775);createSaiz(startSample, endSample, (CencEncryptedTrack) track, sequenceNumber, traf);
            __CLR4_5_2545545lvlulf94.R.inc(6776);createSenc(startSample, endSample, (CencEncryptedTrack) track, sequenceNumber, traf);
            __CLR4_5_2545545lvlulf94.R.inc(6777);createSaio(startSample, endSample, (CencEncryptedTrack) track, sequenceNumber, traf);
        }


        }__CLR4_5_2545545lvlulf94.R.inc(6778);Map<String, List<GroupEntry>> groupEntryFamilies = new HashMap<String, List<GroupEntry>>();
        __CLR4_5_2545545lvlulf94.R.inc(6779);for (Map.Entry<GroupEntry, long[]> sg : track.getSampleGroups().entrySet()) {{
            __CLR4_5_2545545lvlulf94.R.inc(6780);String type = sg.getKey().getType();
            __CLR4_5_2545545lvlulf94.R.inc(6781);List<GroupEntry> groupEntries = groupEntryFamilies.get(type);
            __CLR4_5_2545545lvlulf94.R.inc(6782);if ((((groupEntries == null)&&(__CLR4_5_2545545lvlulf94.R.iget(6783)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6784)==0&false))) {{
                __CLR4_5_2545545lvlulf94.R.inc(6785);groupEntries = new ArrayList<GroupEntry>();
                __CLR4_5_2545545lvlulf94.R.inc(6786);groupEntryFamilies.put(type, groupEntries);
            }
            }__CLR4_5_2545545lvlulf94.R.inc(6787);groupEntries.add(sg.getKey());
        }


        }__CLR4_5_2545545lvlulf94.R.inc(6788);for (Map.Entry<String, List<GroupEntry>> sg : groupEntryFamilies.entrySet()) {{
            __CLR4_5_2545545lvlulf94.R.inc(6789);SampleGroupDescriptionBox sgpd = new SampleGroupDescriptionBox();
            __CLR4_5_2545545lvlulf94.R.inc(6790);String type = sg.getKey();
            __CLR4_5_2545545lvlulf94.R.inc(6791);sgpd.setGroupEntries(sg.getValue());
            __CLR4_5_2545545lvlulf94.R.inc(6792);sgpd.setGroupingType(type);
            __CLR4_5_2545545lvlulf94.R.inc(6793);SampleToGroupBox sbgp = new SampleToGroupBox();
            __CLR4_5_2545545lvlulf94.R.inc(6794);sbgp.setGroupingType(type);
            __CLR4_5_2545545lvlulf94.R.inc(6795);SampleToGroupBox.Entry last = null;
            __CLR4_5_2545545lvlulf94.R.inc(6796);for (int i = l2i(startSample - 1); (((i < l2i(endSample - 1))&&(__CLR4_5_2545545lvlulf94.R.iget(6797)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6798)==0&false)); i++) {{
                __CLR4_5_2545545lvlulf94.R.inc(6799);int index = 0;
                __CLR4_5_2545545lvlulf94.R.inc(6800);for (int j = 0; (((j < sg.getValue().size())&&(__CLR4_5_2545545lvlulf94.R.iget(6801)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6802)==0&false)); j++) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6803);GroupEntry groupEntry = sg.getValue().get(j);
                    __CLR4_5_2545545lvlulf94.R.inc(6804);long[] sampleNums = track.getSampleGroups().get(groupEntry);
                    __CLR4_5_2545545lvlulf94.R.inc(6805);if ((((Arrays.binarySearch(sampleNums, i) >= 0)&&(__CLR4_5_2545545lvlulf94.R.iget(6806)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6807)==0&false))) {{
                        __CLR4_5_2545545lvlulf94.R.inc(6808);index = j + 0x10001;
                    }
                }}
                }__CLR4_5_2545545lvlulf94.R.inc(6809);if ((((last == null || last.getGroupDescriptionIndex() != index)&&(__CLR4_5_2545545lvlulf94.R.iget(6810)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6811)==0&false))) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6812);last = new SampleToGroupBox.Entry(1, index);
                    __CLR4_5_2545545lvlulf94.R.inc(6813);sbgp.getEntries().add(last);
                } }else {{
                    __CLR4_5_2545545lvlulf94.R.inc(6814);last.setSampleCount(last.getSampleCount() + 1);
                }
            }}
            }__CLR4_5_2545545lvlulf94.R.inc(6815);traf.addBox(sgpd);
            __CLR4_5_2545545lvlulf94.R.inc(6816);traf.addBox(sbgp);
        }


    }}finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected void createSenc(long startSample, long endSample, CencEncryptedTrack track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_2545545lvlulf94.R.inc(6817);
        __CLR4_5_2545545lvlulf94.R.inc(6818);SampleEncryptionBox senc = new SampleEncryptionBox();
        __CLR4_5_2545545lvlulf94.R.inc(6819);senc.setSubSampleEncryption(track.hasSubSampleEncryption());
        __CLR4_5_2545545lvlulf94.R.inc(6820);senc.setEntries(track.getSampleEncryptionEntries().subList(l2i(startSample - 1), l2i(endSample - 1)));
        __CLR4_5_2545545lvlulf94.R.inc(6821);parent.addBox(senc);
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected void createSaio(long startSample, long endSample, CencEncryptedTrack track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_2545545lvlulf94.R.inc(6822);
        __CLR4_5_2545545lvlulf94.R.inc(6823);SchemeTypeBox schm = Path.getPath(track.getSampleDescriptionBox(), "enc.[0]/sinf[0]/schm[0]");

        __CLR4_5_2545545lvlulf94.R.inc(6824);SampleAuxiliaryInformationOffsetsBox saio = new SampleAuxiliaryInformationOffsetsBox();
        __CLR4_5_2545545lvlulf94.R.inc(6825);parent.addBox(saio);
        assert (((parent.getBoxes(TrackRunBox.class).size() == 1 )&&(__CLR4_5_2545545lvlulf94.R.iget(6826)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6827)==0&false)): "Don't know how to deal with multiple Track Run Boxes when encrypting";
        __CLR4_5_2545545lvlulf94.R.inc(6828);saio.setAuxInfoType("cenc");
        __CLR4_5_2545545lvlulf94.R.inc(6829);saio.setFlags(1);
        __CLR4_5_2545545lvlulf94.R.inc(6830);long offset = 0;
        __CLR4_5_2545545lvlulf94.R.inc(6831);offset += 8; // traf header till 1st child box
        __CLR4_5_2545545lvlulf94.R.inc(6832);for (Box box : parent.getBoxes()) {{
            __CLR4_5_2545545lvlulf94.R.inc(6833);if ((((box instanceof SampleEncryptionBox)&&(__CLR4_5_2545545lvlulf94.R.iget(6834)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6835)==0&false))) {{
                __CLR4_5_2545545lvlulf94.R.inc(6836);offset += ((SampleEncryptionBox) box).getOffsetToFirstIV();
                __CLR4_5_2545545lvlulf94.R.inc(6837);break;
            } }else {{
                __CLR4_5_2545545lvlulf94.R.inc(6838);offset += box.getSize();
            }
        }}
        }__CLR4_5_2545545lvlulf94.R.inc(6839);MovieFragmentBox moof = (MovieFragmentBox) parent.getParent();
        __CLR4_5_2545545lvlulf94.R.inc(6840);offset += 16; // traf header till 1st child box
        __CLR4_5_2545545lvlulf94.R.inc(6841);for (Box box : moof.getBoxes()) {{
            __CLR4_5_2545545lvlulf94.R.inc(6842);if ((((box == parent)&&(__CLR4_5_2545545lvlulf94.R.iget(6843)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6844)==0&false))) {{
                __CLR4_5_2545545lvlulf94.R.inc(6845);break;
            } }else {{
                __CLR4_5_2545545lvlulf94.R.inc(6846);offset += box.getSize();
            }

        }}

        }__CLR4_5_2545545lvlulf94.R.inc(6847);saio.setOffsets(new long[]{offset});

    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected void createSaiz(long startSample, long endSample, CencEncryptedTrack track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_2545545lvlulf94.R.inc(6848);
        __CLR4_5_2545545lvlulf94.R.inc(6849);SampleDescriptionBox sampleDescriptionBox = track.getSampleDescriptionBox();
        __CLR4_5_2545545lvlulf94.R.inc(6850);SchemeTypeBox schm = Path.getPath(sampleDescriptionBox, "enc.[0]/sinf[0]/schm[0]");
        __CLR4_5_2545545lvlulf94.R.inc(6851);TrackEncryptionBox tenc = Path.getPath(sampleDescriptionBox, "enc.[0]/sinf[0]/schi[0]/tenc[0]");

        __CLR4_5_2545545lvlulf94.R.inc(6852);SampleAuxiliaryInformationSizesBox saiz = new SampleAuxiliaryInformationSizesBox();
        __CLR4_5_2545545lvlulf94.R.inc(6853);saiz.setAuxInfoType("cenc");
        __CLR4_5_2545545lvlulf94.R.inc(6854);saiz.setFlags(1);
        __CLR4_5_2545545lvlulf94.R.inc(6855);if ((((track.hasSubSampleEncryption())&&(__CLR4_5_2545545lvlulf94.R.iget(6856)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6857)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(6858);short[] sizes = new short[l2i(endSample - startSample)];
            __CLR4_5_2545545lvlulf94.R.inc(6859);List<CencSampleAuxiliaryDataFormat> auxs =
                    track.getSampleEncryptionEntries().subList(l2i(startSample - 1), l2i(endSample - 1));
            __CLR4_5_2545545lvlulf94.R.inc(6860);for (int i = 0; (((i < sizes.length)&&(__CLR4_5_2545545lvlulf94.R.iget(6861)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6862)==0&false)); i++) {{
                __CLR4_5_2545545lvlulf94.R.inc(6863);sizes[i] = (short) auxs.get(i).getSize();
            }
            }__CLR4_5_2545545lvlulf94.R.inc(6864);saiz.setSampleInfoSizes(sizes);
        } }else {{
            __CLR4_5_2545545lvlulf94.R.inc(6865);saiz.setDefaultSampleInfoSize(tenc.getDefaultIvSize());
            __CLR4_5_2545545lvlulf94.R.inc(6866);saiz.setSampleCount(l2i(endSample - startSample));
        }
        }__CLR4_5_2545545lvlulf94.R.inc(6867);parent.addBox(saiz);
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}


    /**
     * Gets all samples starting with <code>startSample</code> (one based -&gt; one is the first) and
     * ending with <code>endSample</code> (exclusive).
     *
     * @param startSample low endpoint (inclusive) of the sample sequence
     * @param endSample   high endpoint (exclusive) of the sample sequence
     * @param track       source of the samples
     * @return a <code>List&lt;Sample&gt;</code> of raw samples
     */
    protected List<Sample> getSamples(long startSample, long endSample, Track track) {try{__CLR4_5_2545545lvlulf94.R.inc(6868);
        // since startSample and endSample are one-based substract 1 before addressing list elements
        __CLR4_5_2545545lvlulf94.R.inc(6869);return track.getSamples().subList(l2i(startSample) - 1, l2i(endSample) - 1);
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * Gets the sizes of a sequence of samples.
     *
     * @param startSample    low endpoint (inclusive) of the sample sequence
     * @param endSample      high endpoint (exclusive) of the sample sequence
     * @param track          source of the samples
     * @param sequenceNumber the fragment index of the requested list of samples
     * @return the sample sizes in the given interval
     */
    protected long[] getSampleSizes(long startSample, long endSample, Track track, int sequenceNumber) {try{__CLR4_5_2545545lvlulf94.R.inc(6870);
        __CLR4_5_2545545lvlulf94.R.inc(6871);List<Sample> samples = getSamples(startSample, endSample, track);

        __CLR4_5_2545545lvlulf94.R.inc(6872);long[] sampleSizes = new long[samples.size()];
        __CLR4_5_2545545lvlulf94.R.inc(6873);for (int i = 0; (((i < sampleSizes.length)&&(__CLR4_5_2545545lvlulf94.R.iget(6874)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6875)==0&false)); i++) {{
            __CLR4_5_2545545lvlulf94.R.inc(6876);sampleSizes[i] = samples.get(i).getSize();
        }
        }__CLR4_5_2545545lvlulf94.R.inc(6877);return sampleSizes;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected void createTfdt(long startSample, Track track, TrackFragmentBox parent) {try{__CLR4_5_2545545lvlulf94.R.inc(6878);
        __CLR4_5_2545545lvlulf94.R.inc(6879);TrackFragmentBaseMediaDecodeTimeBox tfdt = new TrackFragmentBaseMediaDecodeTimeBox();
        __CLR4_5_2545545lvlulf94.R.inc(6880);tfdt.setVersion(1);
        __CLR4_5_2545545lvlulf94.R.inc(6881);long startTime = 0;
        __CLR4_5_2545545lvlulf94.R.inc(6882);long[] times = track.getSampleDurations();
        __CLR4_5_2545545lvlulf94.R.inc(6883);for (int i = 1; (((i < startSample)&&(__CLR4_5_2545545lvlulf94.R.iget(6884)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6885)==0&false)); i++) {{
            __CLR4_5_2545545lvlulf94.R.inc(6886);startTime += times[i - 1];
        }
        }__CLR4_5_2545545lvlulf94.R.inc(6887);tfdt.setBaseMediaDecodeTime(startTime);
        __CLR4_5_2545545lvlulf94.R.inc(6888);parent.addBox(tfdt);
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * Creates one or more track run boxes for a given sequence.
     *
     * @param startSample    low endpoint (inclusive) of the sample sequence
     * @param endSample      high endpoint (exclusive) of the sample sequence
     * @param track          source of the samples
     * @param sequenceNumber the fragment index of the requested list of samples
     * @param parent         the created box must be added to this box
     */
    protected void createTrun(long startSample, long endSample, Track track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_2545545lvlulf94.R.inc(6889);
        __CLR4_5_2545545lvlulf94.R.inc(6890);TrackRunBox trun = new TrackRunBox();
        __CLR4_5_2545545lvlulf94.R.inc(6891);trun.setVersion(1);
        __CLR4_5_2545545lvlulf94.R.inc(6892);long[] sampleSizes = getSampleSizes(startSample, endSample, track, sequenceNumber);

        __CLR4_5_2545545lvlulf94.R.inc(6893);trun.setSampleDurationPresent(true);
        __CLR4_5_2545545lvlulf94.R.inc(6894);trun.setSampleSizePresent(true);
        __CLR4_5_2545545lvlulf94.R.inc(6895);List<TrackRunBox.Entry> entries = new ArrayList<TrackRunBox.Entry>(l2i(endSample - startSample));


        __CLR4_5_2545545lvlulf94.R.inc(6896);List<CompositionTimeToSample.Entry> compositionTimeEntries = track.getCompositionTimeEntries();
        __CLR4_5_2545545lvlulf94.R.inc(6897);int compositionTimeQueueIndex = 0;
        __CLR4_5_2545545lvlulf94.R.inc(6898);CompositionTimeToSample.Entry[] compositionTimeQueue =
                (((compositionTimeEntries != null && compositionTimeEntries.size() > 0 )&&(__CLR4_5_2545545lvlulf94.R.iget(6899)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6900)==0&false))?
                        compositionTimeEntries.toArray(new CompositionTimeToSample.Entry[compositionTimeEntries.size()]) : null;
        __CLR4_5_2545545lvlulf94.R.inc(6901);long compositionTimeEntriesLeft = (((compositionTimeQueue != null )&&(__CLR4_5_2545545lvlulf94.R.iget(6902)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6903)==0&false))? compositionTimeQueue[compositionTimeQueueIndex].getCount() : -1;


        __CLR4_5_2545545lvlulf94.R.inc(6904);trun.setSampleCompositionTimeOffsetPresent(compositionTimeEntriesLeft > 0);

        // fast forward composition stuff
        __CLR4_5_2545545lvlulf94.R.inc(6905);for (long i = 1; (((i < startSample)&&(__CLR4_5_2545545lvlulf94.R.iget(6906)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6907)==0&false)); i++) {{
            __CLR4_5_2545545lvlulf94.R.inc(6908);if ((((compositionTimeQueue != null)&&(__CLR4_5_2545545lvlulf94.R.iget(6909)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6910)==0&false))) {{
                //trun.setSampleCompositionTimeOffsetPresent(true);
                __CLR4_5_2545545lvlulf94.R.inc(6911);if ((((--compositionTimeEntriesLeft == 0 && (compositionTimeQueue.length - compositionTimeQueueIndex) > 1)&&(__CLR4_5_2545545lvlulf94.R.iget(6912)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6913)==0&false))) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6914);compositionTimeQueueIndex++;
                    __CLR4_5_2545545lvlulf94.R.inc(6915);compositionTimeEntriesLeft = compositionTimeQueue[compositionTimeQueueIndex].getCount();
                }
            }}
        }}

        }__CLR4_5_2545545lvlulf94.R.inc(6916);boolean sampleFlagsRequired = (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty() ||
                track.getSyncSamples() != null && track.getSyncSamples().length != 0);

        __CLR4_5_2545545lvlulf94.R.inc(6917);trun.setSampleFlagsPresent(sampleFlagsRequired);

        __CLR4_5_2545545lvlulf94.R.inc(6918);for (int i = 0; (((i < sampleSizes.length)&&(__CLR4_5_2545545lvlulf94.R.iget(6919)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6920)==0&false)); i++) {{
            __CLR4_5_2545545lvlulf94.R.inc(6921);TrackRunBox.Entry entry = new TrackRunBox.Entry();
            __CLR4_5_2545545lvlulf94.R.inc(6922);entry.setSampleSize(sampleSizes[i]);
            __CLR4_5_2545545lvlulf94.R.inc(6923);if ((((sampleFlagsRequired)&&(__CLR4_5_2545545lvlulf94.R.iget(6924)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6925)==0&false))) {{
                //if (false) {
                __CLR4_5_2545545lvlulf94.R.inc(6926);SampleFlags sflags = new SampleFlags();

                __CLR4_5_2545545lvlulf94.R.inc(6927);if ((((track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty())&&(__CLR4_5_2545545lvlulf94.R.iget(6928)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6929)==0&false))) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6930);SampleDependencyTypeBox.Entry e = track.getSampleDependencies().get(i);
                    __CLR4_5_2545545lvlulf94.R.inc(6931);sflags.setSampleDependsOn(e.getSampleDependsOn());
                    __CLR4_5_2545545lvlulf94.R.inc(6932);sflags.setSampleIsDependedOn(e.getSampleIsDependentOn());
                    __CLR4_5_2545545lvlulf94.R.inc(6933);sflags.setSampleHasRedundancy(e.getSampleHasRedundancy());
                }
                }__CLR4_5_2545545lvlulf94.R.inc(6934);if ((((track.getSyncSamples() != null && track.getSyncSamples().length > 0)&&(__CLR4_5_2545545lvlulf94.R.iget(6935)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6936)==0&false))) {{
                    // we have to mark non-sync samples!
                    __CLR4_5_2545545lvlulf94.R.inc(6937);if ((((Arrays.binarySearch(track.getSyncSamples(), startSample + i) >= 0)&&(__CLR4_5_2545545lvlulf94.R.iget(6938)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6939)==0&false))) {{
                        __CLR4_5_2545545lvlulf94.R.inc(6940);sflags.setSampleIsDifferenceSample(false);
                        __CLR4_5_2545545lvlulf94.R.inc(6941);sflags.setSampleDependsOn(2);
                    } }else {{
                        __CLR4_5_2545545lvlulf94.R.inc(6942);sflags.setSampleIsDifferenceSample(true);
                        __CLR4_5_2545545lvlulf94.R.inc(6943);sflags.setSampleDependsOn(1);
                    }
                }}
                // i don't have sample degradation
                }__CLR4_5_2545545lvlulf94.R.inc(6944);entry.setSampleFlags(sflags);

            }

            }__CLR4_5_2545545lvlulf94.R.inc(6945);entry.setSampleDuration(track.getSampleDurations()[l2i(startSample + i - 1)]);

            __CLR4_5_2545545lvlulf94.R.inc(6946);if ((((compositionTimeQueue != null)&&(__CLR4_5_2545545lvlulf94.R.iget(6947)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6948)==0&false))) {{
                __CLR4_5_2545545lvlulf94.R.inc(6949);entry.setSampleCompositionTimeOffset(compositionTimeQueue[compositionTimeQueueIndex].getOffset());
                __CLR4_5_2545545lvlulf94.R.inc(6950);if ((((--compositionTimeEntriesLeft == 0 && (compositionTimeQueue.length - compositionTimeQueueIndex) > 1)&&(__CLR4_5_2545545lvlulf94.R.iget(6951)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6952)==0&false))) {{
                    __CLR4_5_2545545lvlulf94.R.inc(6953);compositionTimeQueueIndex++;
                    __CLR4_5_2545545lvlulf94.R.inc(6954);compositionTimeEntriesLeft = compositionTimeQueue[compositionTimeQueueIndex].getCount();
                }
            }}
            }__CLR4_5_2545545lvlulf94.R.inc(6955);entries.add(entry);
        }

        }__CLR4_5_2545545lvlulf94.R.inc(6956);trun.setEntries(entries);

        __CLR4_5_2545545lvlulf94.R.inc(6957);parent.addBox(trun);
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * Creates a 'moof' box for a given sequence of samples.
     *
     * @param startSample    low endpoint (inclusive) of the sample sequence
     * @param endSample      high endpoint (exclusive) of the sample sequence
     * @param track          source of the samples
     * @param sequenceNumber the fragment index of the requested list of samples
     * @return the list of TrackRun boxes.
     */
    protected Box createMoof(long startSample, long endSample, Track track, int sequenceNumber) {try{__CLR4_5_2545545lvlulf94.R.inc(6958);
        __CLR4_5_2545545lvlulf94.R.inc(6959);MovieFragmentBox moof = new MovieFragmentBox();
        __CLR4_5_2545545lvlulf94.R.inc(6960);createMfhd(startSample, endSample, track, sequenceNumber, moof);
        __CLR4_5_2545545lvlulf94.R.inc(6961);createTraf(startSample, endSample, track, sequenceNumber, moof);

        __CLR4_5_2545545lvlulf94.R.inc(6962);TrackRunBox firstTrun = moof.getTrackRunBoxes().get(0);
        __CLR4_5_2545545lvlulf94.R.inc(6963);firstTrun.setDataOffset(1); // dummy to make size correct
        __CLR4_5_2545545lvlulf94.R.inc(6964);firstTrun.setDataOffset((int) (8 + moof.getSize())); // mdat header + moof size

        __CLR4_5_2545545lvlulf94.R.inc(6965);return moof;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * Creates a single 'mvhd' movie header box for a given movie.
     *
     * @param movie the concerned movie
     * @return an 'mvhd' box
     */
    protected Box createMvhd(Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(6966);
        __CLR4_5_2545545lvlulf94.R.inc(6967);MovieHeaderBox mvhd = new MovieHeaderBox();
        __CLR4_5_2545545lvlulf94.R.inc(6968);mvhd.setVersion(1);
        __CLR4_5_2545545lvlulf94.R.inc(6969);mvhd.setCreationTime(getDate());
        __CLR4_5_2545545lvlulf94.R.inc(6970);mvhd.setModificationTime(getDate());
        __CLR4_5_2545545lvlulf94.R.inc(6971);mvhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_2545545lvlulf94.R.inc(6972);long movieTimeScale = movie.getTimescale();
        __CLR4_5_2545545lvlulf94.R.inc(6973);mvhd.setTimescale(movieTimeScale);
        // find the next available trackId
        __CLR4_5_2545545lvlulf94.R.inc(6974);long nextTrackId = 0;
        __CLR4_5_2545545lvlulf94.R.inc(6975);for (Track track : movie.getTracks()) {{
            __CLR4_5_2545545lvlulf94.R.inc(6976);nextTrackId = (((nextTrackId < track.getTrackMetaData().getTrackId() )&&(__CLR4_5_2545545lvlulf94.R.iget(6977)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6978)==0&false))? track.getTrackMetaData().getTrackId() : nextTrackId;
        }
        }__CLR4_5_2545545lvlulf94.R.inc(6979);mvhd.setNextTrackId(++nextTrackId);
        __CLR4_5_2545545lvlulf94.R.inc(6980);return mvhd;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * Creates a fully populated 'moov' box with all child boxes. Child boxes are:
     * <ul>
     * <li>{@link #createMvhd(com.googlecode.mp4parser.authoring.Movie) mvhd}</li>
     * <li>{@link #createMvex(com.googlecode.mp4parser.authoring.Movie)  mvex}</li>
     * <li>a {@link #createTrak(com.googlecode.mp4parser.authoring.Track, com.googlecode.mp4parser.authoring.Movie)  trak} for every track</li>
     * </ul>
     *
     * @param movie the concerned movie
     * @return fully populated 'moov'
     */
    protected Box createMoov(Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(6981);
        __CLR4_5_2545545lvlulf94.R.inc(6982);MovieBox movieBox = new MovieBox();

        __CLR4_5_2545545lvlulf94.R.inc(6983);movieBox.addBox(createMvhd(movie));
        __CLR4_5_2545545lvlulf94.R.inc(6984);for (Track track : movie.getTracks()) {{
            __CLR4_5_2545545lvlulf94.R.inc(6985);movieBox.addBox(createTrak(track, movie));
        }
        }__CLR4_5_2545545lvlulf94.R.inc(6986);movieBox.addBox(createMvex(movie));

        // metadata here
        __CLR4_5_2545545lvlulf94.R.inc(6987);return movieBox;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * Creates a 'tfra' - track fragment random access box for the given track with the isoFile.
     * The tfra contains a map of random access points with time as key and offset within the isofile
     * as value.
     *
     * @param track   the concerned track
     * @param isoFile the track is contained in
     * @return a track fragment random access box.
     */
    protected Box createTfra(Track track, Container isoFile) {try{__CLR4_5_2545545lvlulf94.R.inc(6988);
        __CLR4_5_2545545lvlulf94.R.inc(6989);TrackFragmentRandomAccessBox tfra = new TrackFragmentRandomAccessBox();
        __CLR4_5_2545545lvlulf94.R.inc(6990);tfra.setVersion(1); // use long offsets and times
        __CLR4_5_2545545lvlulf94.R.inc(6991);List<TrackFragmentRandomAccessBox.Entry> offset2timeEntries = new LinkedList<TrackFragmentRandomAccessBox.Entry>();

        __CLR4_5_2545545lvlulf94.R.inc(6992);TrackExtendsBox trex = null;
        __CLR4_5_2545545lvlulf94.R.inc(6993);List<TrackExtendsBox> trexs = Path.getPaths(isoFile, "moov/mvex/trex");
        __CLR4_5_2545545lvlulf94.R.inc(6994);for (TrackExtendsBox innerTrex : trexs) {{
            __CLR4_5_2545545lvlulf94.R.inc(6995);if ((((innerTrex.getTrackId() == track.getTrackMetaData().getTrackId())&&(__CLR4_5_2545545lvlulf94.R.iget(6996)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(6997)==0&false))) {{
                __CLR4_5_2545545lvlulf94.R.inc(6998);trex = innerTrex;
            }
        }}

        }__CLR4_5_2545545lvlulf94.R.inc(6999);long offset = 0;
        __CLR4_5_2545545lvlulf94.R.inc(7000);long duration = 0;

        __CLR4_5_2545545lvlulf94.R.inc(7001);for (Box box : isoFile.getBoxes()) {{
            __CLR4_5_2545545lvlulf94.R.inc(7002);if ((((box instanceof MovieFragmentBox)&&(__CLR4_5_2545545lvlulf94.R.iget(7003)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7004)==0&false))) {{
                __CLR4_5_2545545lvlulf94.R.inc(7005);List<TrackFragmentBox> trafs = ((MovieFragmentBox) box).getBoxes(TrackFragmentBox.class);
                __CLR4_5_2545545lvlulf94.R.inc(7006);for (int i = 0; (((i < trafs.size())&&(__CLR4_5_2545545lvlulf94.R.iget(7007)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7008)==0&false)); i++) {{
                    __CLR4_5_2545545lvlulf94.R.inc(7009);TrackFragmentBox traf = trafs.get(i);

                    __CLR4_5_2545545lvlulf94.R.inc(7010);if ((((traf.getTrackFragmentHeaderBox().getTrackId() == track.getTrackMetaData().getTrackId())&&(__CLR4_5_2545545lvlulf94.R.iget(7011)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7012)==0&false))) {{

                        // here we are at the offset required for the current entry.
                        __CLR4_5_2545545lvlulf94.R.inc(7013);List<TrackRunBox> truns = traf.getBoxes(TrackRunBox.class);
                        __CLR4_5_2545545lvlulf94.R.inc(7014);for (int j = 0; (((j < truns.size())&&(__CLR4_5_2545545lvlulf94.R.iget(7015)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7016)==0&false)); j++) {{
                            __CLR4_5_2545545lvlulf94.R.inc(7017);List<TrackFragmentRandomAccessBox.Entry> offset2timeEntriesThisTrun = new LinkedList<TrackFragmentRandomAccessBox.Entry>();
                            __CLR4_5_2545545lvlulf94.R.inc(7018);TrackRunBox trun = truns.get(j);
                            __CLR4_5_2545545lvlulf94.R.inc(7019);for (int k = 0; (((k < trun.getEntries().size())&&(__CLR4_5_2545545lvlulf94.R.iget(7020)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7021)==0&false)); k++) {{
                                __CLR4_5_2545545lvlulf94.R.inc(7022);TrackRunBox.Entry trunEntry = trun.getEntries().get(k);
                                __CLR4_5_2545545lvlulf94.R.inc(7023);SampleFlags sf;
                                __CLR4_5_2545545lvlulf94.R.inc(7024);if ((((k == 0 && trun.isFirstSampleFlagsPresent())&&(__CLR4_5_2545545lvlulf94.R.iget(7025)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7026)==0&false))) {{
                                    __CLR4_5_2545545lvlulf94.R.inc(7027);sf = trun.getFirstSampleFlags();
                                } }else {__CLR4_5_2545545lvlulf94.R.inc(7028);if ((((trun.isSampleFlagsPresent())&&(__CLR4_5_2545545lvlulf94.R.iget(7029)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7030)==0&false))) {{
                                    __CLR4_5_2545545lvlulf94.R.inc(7031);sf = trunEntry.getSampleFlags();
                                } }else {{
                                    __CLR4_5_2545545lvlulf94.R.inc(7032);sf = trex.getDefaultSampleFlags();
                                }
                                }}__CLR4_5_2545545lvlulf94.R.inc(7033);if ((((sf == null && track.getHandler().equals("vide"))&&(__CLR4_5_2545545lvlulf94.R.iget(7034)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7035)==0&false))) {{
                                    __CLR4_5_2545545lvlulf94.R.inc(7036);throw new RuntimeException("Cannot find SampleFlags for video track but it's required to build tfra");
                                }
                                }__CLR4_5_2545545lvlulf94.R.inc(7037);if ((((sf == null || sf.getSampleDependsOn() == 2)&&(__CLR4_5_2545545lvlulf94.R.iget(7038)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7039)==0&false))) {{
                                    __CLR4_5_2545545lvlulf94.R.inc(7040);offset2timeEntriesThisTrun.add(new TrackFragmentRandomAccessBox.Entry(
                                            duration,
                                            offset,
                                            i + 1, j + 1, k + 1));
                                }
                                }__CLR4_5_2545545lvlulf94.R.inc(7041);duration += trunEntry.getSampleDuration();
                            }
                            }__CLR4_5_2545545lvlulf94.R.inc(7042);if ((((offset2timeEntriesThisTrun.size() == trun.getEntries().size() && trun.getEntries().size() > 0)&&(__CLR4_5_2545545lvlulf94.R.iget(7043)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7044)==0&false))) {{
                                // Oooops every sample seems to be random access sample
                                // is this an audio track? I don't care.
                                // I just use the first for trun sample for tfra random access
                                __CLR4_5_2545545lvlulf94.R.inc(7045);offset2timeEntries.add(offset2timeEntriesThisTrun.get(0));
                            } }else {{
                                __CLR4_5_2545545lvlulf94.R.inc(7046);offset2timeEntries.addAll(offset2timeEntriesThisTrun);
                            }
                        }}
                    }}
                }}
            }}


            }__CLR4_5_2545545lvlulf94.R.inc(7047);offset += box.getSize();
        }
        }__CLR4_5_2545545lvlulf94.R.inc(7048);tfra.setEntries(offset2timeEntries);
        __CLR4_5_2545545lvlulf94.R.inc(7049);tfra.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_2545545lvlulf94.R.inc(7050);return tfra;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * Creates a 'mfra' - movie fragment random access box for the given movie in the given
     * isofile. Uses {@link #createTfra(com.googlecode.mp4parser.authoring.Track, Container)}
     * to generate the child boxes.
     *
     * @param movie   concerned movie
     * @param isoFile concerned isofile
     * @return a complete 'mfra' box
     */
    protected Box createMfra(Movie movie, Container isoFile) {try{__CLR4_5_2545545lvlulf94.R.inc(7051);
        __CLR4_5_2545545lvlulf94.R.inc(7052);MovieFragmentRandomAccessBox mfra = new MovieFragmentRandomAccessBox();
        __CLR4_5_2545545lvlulf94.R.inc(7053);for (Track track : movie.getTracks()) {{
            __CLR4_5_2545545lvlulf94.R.inc(7054);mfra.addBox(createTfra(track, isoFile));
        }

        }__CLR4_5_2545545lvlulf94.R.inc(7055);MovieFragmentRandomAccessOffsetBox mfro = new MovieFragmentRandomAccessOffsetBox();
        __CLR4_5_2545545lvlulf94.R.inc(7056);mfra.addBox(mfro);
        __CLR4_5_2545545lvlulf94.R.inc(7057);mfro.setMfraSize(mfra.getSize());
        __CLR4_5_2545545lvlulf94.R.inc(7058);return mfra;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createTrex(Movie movie, Track track) {try{__CLR4_5_2545545lvlulf94.R.inc(7059);
        __CLR4_5_2545545lvlulf94.R.inc(7060);TrackExtendsBox trex = new TrackExtendsBox();
        __CLR4_5_2545545lvlulf94.R.inc(7061);trex.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_2545545lvlulf94.R.inc(7062);trex.setDefaultSampleDescriptionIndex(1);
        __CLR4_5_2545545lvlulf94.R.inc(7063);trex.setDefaultSampleDuration(0);
        __CLR4_5_2545545lvlulf94.R.inc(7064);trex.setDefaultSampleSize(0);
        __CLR4_5_2545545lvlulf94.R.inc(7065);SampleFlags sf = new SampleFlags();
        __CLR4_5_2545545lvlulf94.R.inc(7066);if (((("soun".equals(track.getHandler()) || "subt".equals(track.getHandler()))&&(__CLR4_5_2545545lvlulf94.R.iget(7067)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7068)==0&false))) {{
            // as far as I know there is no audio encoding
            // where the sample are not self contained.
            // same seems to be true for subtitle tracks
            __CLR4_5_2545545lvlulf94.R.inc(7069);sf.setSampleDependsOn(2);
            __CLR4_5_2545545lvlulf94.R.inc(7070);sf.setSampleIsDependedOn(2);
        }
        }__CLR4_5_2545545lvlulf94.R.inc(7071);trex.setDefaultSampleFlags(sf);
        __CLR4_5_2545545lvlulf94.R.inc(7072);return trex;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    /**
     * Creates a 'mvex' - movie extends box and populates it with 'trex' boxes
     * by calling {@link #createTrex(com.googlecode.mp4parser.authoring.Movie, com.googlecode.mp4parser.authoring.Track)}
     * for each track to generate them
     *
     * @param movie the source movie
     * @return a complete 'mvex'
     */
    protected Box createMvex(Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(7073);
        __CLR4_5_2545545lvlulf94.R.inc(7074);MovieExtendsBox mvex = new MovieExtendsBox();
        __CLR4_5_2545545lvlulf94.R.inc(7075);final MovieExtendsHeaderBox mved = new MovieExtendsHeaderBox();
        __CLR4_5_2545545lvlulf94.R.inc(7076);mved.setVersion(1);
        __CLR4_5_2545545lvlulf94.R.inc(7077);for (Track track : movie.getTracks()) {{
            __CLR4_5_2545545lvlulf94.R.inc(7078);final long trackDuration = getTrackDuration(movie, track);
            __CLR4_5_2545545lvlulf94.R.inc(7079);if ((((mved.getFragmentDuration() < trackDuration)&&(__CLR4_5_2545545lvlulf94.R.iget(7080)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7081)==0&false))) {{
                __CLR4_5_2545545lvlulf94.R.inc(7082);mved.setFragmentDuration(trackDuration);
            }
        }}
        }__CLR4_5_2545545lvlulf94.R.inc(7083);mvex.addBox(mved);

        __CLR4_5_2545545lvlulf94.R.inc(7084);for (Track track : movie.getTracks()) {{
            __CLR4_5_2545545lvlulf94.R.inc(7085);mvex.addBox(createTrex(movie, track));
        }
        }__CLR4_5_2545545lvlulf94.R.inc(7086);return mvex;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createTkhd(Movie movie, Track track) {try{__CLR4_5_2545545lvlulf94.R.inc(7087);
        __CLR4_5_2545545lvlulf94.R.inc(7088);TrackHeaderBox tkhd = new TrackHeaderBox();
        __CLR4_5_2545545lvlulf94.R.inc(7089);tkhd.setVersion(1);
        __CLR4_5_2545545lvlulf94.R.inc(7090);tkhd.setFlags(7); // enabled, in movie, in previe, in poster

        __CLR4_5_2545545lvlulf94.R.inc(7091);tkhd.setAlternateGroup(track.getTrackMetaData().getGroup());
        __CLR4_5_2545545lvlulf94.R.inc(7092);tkhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        // We need to take edit list box into account in trackheader duration
        // but as long as I don't support edit list boxes it is sufficient to
        // just translate media duration to movie timescale
        __CLR4_5_2545545lvlulf94.R.inc(7093);tkhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_2545545lvlulf94.R.inc(7094);tkhd.setHeight(track.getTrackMetaData().getHeight());
        __CLR4_5_2545545lvlulf94.R.inc(7095);tkhd.setWidth(track.getTrackMetaData().getWidth());
        __CLR4_5_2545545lvlulf94.R.inc(7096);tkhd.setLayer(track.getTrackMetaData().getLayer());
        __CLR4_5_2545545lvlulf94.R.inc(7097);tkhd.setModificationTime(getDate());
        __CLR4_5_2545545lvlulf94.R.inc(7098);tkhd.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_2545545lvlulf94.R.inc(7099);tkhd.setVolume(track.getTrackMetaData().getVolume());
        __CLR4_5_2545545lvlulf94.R.inc(7100);return tkhd;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    private long getTrackDuration(Movie movie, Track track) {try{__CLR4_5_2545545lvlulf94.R.inc(7101);
        __CLR4_5_2545545lvlulf94.R.inc(7102);return (track.getDuration() * movie.getTimescale()) / track.getTrackMetaData().getTimescale();
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createMdhd(Movie movie, Track track) {try{__CLR4_5_2545545lvlulf94.R.inc(7103);
        __CLR4_5_2545545lvlulf94.R.inc(7104);MediaHeaderBox mdhd = new MediaHeaderBox();
        __CLR4_5_2545545lvlulf94.R.inc(7105);mdhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        __CLR4_5_2545545lvlulf94.R.inc(7106);mdhd.setModificationTime(getDate());
        __CLR4_5_2545545lvlulf94.R.inc(7107);mdhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_2545545lvlulf94.R.inc(7108);mdhd.setTimescale(track.getTrackMetaData().getTimescale());
        __CLR4_5_2545545lvlulf94.R.inc(7109);mdhd.setLanguage(track.getTrackMetaData().getLanguage());
        __CLR4_5_2545545lvlulf94.R.inc(7110);return mdhd;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createStbl(Movie movie, Track track) {try{__CLR4_5_2545545lvlulf94.R.inc(7111);
        __CLR4_5_2545545lvlulf94.R.inc(7112);SampleTableBox stbl = new SampleTableBox();

        __CLR4_5_2545545lvlulf94.R.inc(7113);createStsd(track, stbl);
        __CLR4_5_2545545lvlulf94.R.inc(7114);stbl.addBox(new TimeToSampleBox());
        __CLR4_5_2545545lvlulf94.R.inc(7115);stbl.addBox(new SampleToChunkBox());
        __CLR4_5_2545545lvlulf94.R.inc(7116);stbl.addBox(new SampleSizeBox());
        __CLR4_5_2545545lvlulf94.R.inc(7117);stbl.addBox(new StaticChunkOffsetBox());
        __CLR4_5_2545545lvlulf94.R.inc(7118);return stbl;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected void createStsd(Track track, SampleTableBox stbl) {try{__CLR4_5_2545545lvlulf94.R.inc(7119);
        __CLR4_5_2545545lvlulf94.R.inc(7120);stbl.addBox(track.getSampleDescriptionBox());
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createMinf(Track track, Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(7121);
        __CLR4_5_2545545lvlulf94.R.inc(7122);MediaInformationBox minf = new MediaInformationBox();
        __CLR4_5_2545545lvlulf94.R.inc(7123);if ((((track.getHandler().equals("vide"))&&(__CLR4_5_2545545lvlulf94.R.iget(7124)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7125)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(7126);minf.addBox(new VideoMediaHeaderBox());
        } }else {__CLR4_5_2545545lvlulf94.R.inc(7127);if ((((track.getHandler().equals("soun"))&&(__CLR4_5_2545545lvlulf94.R.iget(7128)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7129)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(7130);minf.addBox(new SoundMediaHeaderBox());
        } }else {__CLR4_5_2545545lvlulf94.R.inc(7131);if ((((track.getHandler().equals("text"))&&(__CLR4_5_2545545lvlulf94.R.iget(7132)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7133)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(7134);minf.addBox(new NullMediaHeaderBox());
        } }else {__CLR4_5_2545545lvlulf94.R.inc(7135);if ((((track.getHandler().equals("subt"))&&(__CLR4_5_2545545lvlulf94.R.iget(7136)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7137)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(7138);minf.addBox(new SubtitleMediaHeaderBox());
        } }else {__CLR4_5_2545545lvlulf94.R.inc(7139);if ((((track.getHandler().equals("hint"))&&(__CLR4_5_2545545lvlulf94.R.iget(7140)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7141)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(7142);minf.addBox(new HintMediaHeaderBox());
        } }else {__CLR4_5_2545545lvlulf94.R.inc(7143);if ((((track.getHandler().equals("sbtl"))&&(__CLR4_5_2545545lvlulf94.R.iget(7144)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7145)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(7146);minf.addBox(new NullMediaHeaderBox());
        }
        }}}}}}__CLR4_5_2545545lvlulf94.R.inc(7147);minf.addBox(createDinf(movie, track));
        __CLR4_5_2545545lvlulf94.R.inc(7148);minf.addBox(createStbl(movie, track));
        __CLR4_5_2545545lvlulf94.R.inc(7149);return minf;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createMdiaHdlr(Track track, Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(7150);
        __CLR4_5_2545545lvlulf94.R.inc(7151);HandlerBox hdlr = new HandlerBox();
        __CLR4_5_2545545lvlulf94.R.inc(7152);hdlr.setHandlerType(track.getHandler());
        __CLR4_5_2545545lvlulf94.R.inc(7153);return hdlr;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createMdia(Track track, Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(7154);
        __CLR4_5_2545545lvlulf94.R.inc(7155);MediaBox mdia = new MediaBox();
        __CLR4_5_2545545lvlulf94.R.inc(7156);mdia.addBox(createMdhd(movie, track));


        __CLR4_5_2545545lvlulf94.R.inc(7157);mdia.addBox(createMdiaHdlr(track, movie));


        __CLR4_5_2545545lvlulf94.R.inc(7158);mdia.addBox(createMinf(track, movie));
        __CLR4_5_2545545lvlulf94.R.inc(7159);return mdia;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createTrak(Track track, Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(7160);
        __CLR4_5_2545545lvlulf94.R.inc(7161);LOG.fine("Creating Track " + track);
        __CLR4_5_2545545lvlulf94.R.inc(7162);TrackBox trackBox = new TrackBox();
        __CLR4_5_2545545lvlulf94.R.inc(7163);trackBox.addBox(createTkhd(movie, track));
        __CLR4_5_2545545lvlulf94.R.inc(7164);Box edts = createEdts(track, movie);
        __CLR4_5_2545545lvlulf94.R.inc(7165);if ((((edts != null)&&(__CLR4_5_2545545lvlulf94.R.iget(7166)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7167)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(7168);trackBox.addBox(edts);
        }
        }__CLR4_5_2545545lvlulf94.R.inc(7169);trackBox.addBox(createMdia(track, movie));
        __CLR4_5_2545545lvlulf94.R.inc(7170);return trackBox;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected Box createEdts(Track track, Movie movie) {try{__CLR4_5_2545545lvlulf94.R.inc(7171);
        __CLR4_5_2545545lvlulf94.R.inc(7172);if ((((track.getEdits() != null && track.getEdits().size() > 0)&&(__CLR4_5_2545545lvlulf94.R.iget(7173)!=0|true))||(__CLR4_5_2545545lvlulf94.R.iget(7174)==0&false))) {{
            __CLR4_5_2545545lvlulf94.R.inc(7175);EditListBox elst = new EditListBox();
            __CLR4_5_2545545lvlulf94.R.inc(7176);elst.setVersion(1);
            __CLR4_5_2545545lvlulf94.R.inc(7177);List<EditListBox.Entry> entries = new ArrayList<EditListBox.Entry>();

            __CLR4_5_2545545lvlulf94.R.inc(7178);for (Edit edit : track.getEdits()) {{
                __CLR4_5_2545545lvlulf94.R.inc(7179);entries.add(new EditListBox.Entry(elst,
                        Math.round(edit.getSegmentDuration() * movie.getTimescale()),
                        edit.getMediaTime() * track.getTrackMetaData().getTimescale() / edit.getTimeScale(),
                        edit.getMediaRate()));
            }

            }__CLR4_5_2545545lvlulf94.R.inc(7180);elst.setEntries(entries);
            __CLR4_5_2545545lvlulf94.R.inc(7181);EditBox edts = new EditBox();
            __CLR4_5_2545545lvlulf94.R.inc(7182);edts.addBox(elst);
            __CLR4_5_2545545lvlulf94.R.inc(7183);return edts;
        } }else {{
            __CLR4_5_2545545lvlulf94.R.inc(7184);return null;
        }
    }}finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    protected DataInformationBox createDinf(Movie movie, Track track) {try{__CLR4_5_2545545lvlulf94.R.inc(7185);
        __CLR4_5_2545545lvlulf94.R.inc(7186);DataInformationBox dinf = new DataInformationBox();
        __CLR4_5_2545545lvlulf94.R.inc(7187);DataReferenceBox dref = new DataReferenceBox();
        __CLR4_5_2545545lvlulf94.R.inc(7188);dinf.addBox(dref);
        __CLR4_5_2545545lvlulf94.R.inc(7189);DataEntryUrlBox url = new DataEntryUrlBox();
        __CLR4_5_2545545lvlulf94.R.inc(7190);url.setFlags(1);
        __CLR4_5_2545545lvlulf94.R.inc(7191);dref.addBox(url);
        __CLR4_5_2545545lvlulf94.R.inc(7192);return dinf;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    public Fragmenter getFragmenter() {try{__CLR4_5_2545545lvlulf94.R.inc(7193);
        __CLR4_5_2545545lvlulf94.R.inc(7194);return fragmenter;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}

    public void setFragmenter(Fragmenter fragmenter) {try{__CLR4_5_2545545lvlulf94.R.inc(7195);
        __CLR4_5_2545545lvlulf94.R.inc(7196);this.fragmenter = fragmenter;
    }finally{__CLR4_5_2545545lvlulf94.R.flushNeeded();}}


}
