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
public class FragmentedMp4Builder implements Mp4Builder {public static class __CLR4_5_251i51ilvl9egzz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,7102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger LOG = Logger.getLogger(FragmentedMp4Builder.class.getName());

    protected Fragmenter fragmenter;

    public FragmentedMp4Builder() {try{__CLR4_5_251i51ilvl9egzz.R.inc(6534);
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    public Date getDate() {try{__CLR4_5_251i51ilvl9egzz.R.inc(6535);
        __CLR4_5_251i51ilvl9egzz.R.inc(6536);return new Date();
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    public Box createFtyp(Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6537);
        __CLR4_5_251i51ilvl9egzz.R.inc(6538);List<String> minorBrands = new LinkedList<String>();
        __CLR4_5_251i51ilvl9egzz.R.inc(6539);minorBrands.add("mp42");
        __CLR4_5_251i51ilvl9egzz.R.inc(6540);minorBrands.add("iso6");
        __CLR4_5_251i51ilvl9egzz.R.inc(6541);minorBrands.add("avc1");
        __CLR4_5_251i51ilvl9egzz.R.inc(6542);minorBrands.add("isom");
        __CLR4_5_251i51ilvl9egzz.R.inc(6543);return new FileTypeBox("iso6", 1, minorBrands);
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    /**
     * Sorts fragments by start time.
     *
     * @param tracks          the list of tracks to returned sorted
     * @param cycle           current fragment (sorting may vary between the fragments)
     * @param intersectionMap a map from tracks to their fragments' first samples.
     * @return the list of tracks in order of appearance in the fragment
     */
    protected List<Track> sortTracksInSequence(List<Track> tracks, final int cycle, final Map<Track, long[]> intersectionMap) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6544);
        __CLR4_5_251i51ilvl9egzz.R.inc(6545);tracks = new LinkedList<Track>(tracks);
        __CLR4_5_251i51ilvl9egzz.R.inc(6546);Collections.sort(tracks, new Comparator<Track>() {
            public int compare(Track o1, Track o2) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6547);
                __CLR4_5_251i51ilvl9egzz.R.inc(6548);long startSample1 = intersectionMap.get(o1)[cycle];
                // one based sample numbers - the first sample is 1
                __CLR4_5_251i51ilvl9egzz.R.inc(6549);long startSample2 = intersectionMap.get(o2)[cycle];
                // one based sample numbers - the first sample is 1

                // now let's get the start times
                __CLR4_5_251i51ilvl9egzz.R.inc(6550);long[] decTimes1 = o1.getSampleDurations();
                __CLR4_5_251i51ilvl9egzz.R.inc(6551);long[] decTimes2 = o2.getSampleDurations();
                __CLR4_5_251i51ilvl9egzz.R.inc(6552);long startTime1 = 0;
                __CLR4_5_251i51ilvl9egzz.R.inc(6553);long startTime2 = 0;

                __CLR4_5_251i51ilvl9egzz.R.inc(6554);for (int i = 1; (((i < startSample1)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6555)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6556)==0&false)); i++) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6557);startTime1 += decTimes1[i - 1];
                }
                }__CLR4_5_251i51ilvl9egzz.R.inc(6558);for (int i = 1; (((i < startSample2)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6559)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6560)==0&false)); i++) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6561);startTime2 += decTimes2[i - 1];
                }

                // and compare
                }__CLR4_5_251i51ilvl9egzz.R.inc(6562);return (int) (((double) startTime1 / o1.getTrackMetaData().getTimescale() - (double) startTime2 / o2.getTrackMetaData().getTimescale()) * 100);
            }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}
        });
        __CLR4_5_251i51ilvl9egzz.R.inc(6563);return tracks;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}


    protected List<Box> createMoofMdat(final Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6564);
        __CLR4_5_251i51ilvl9egzz.R.inc(6565);List<Box> moofsMdats = new LinkedList<Box>();
        __CLR4_5_251i51ilvl9egzz.R.inc(6566);HashMap<Track, long[]> intersectionMap = new HashMap<Track, long[]>();
        __CLR4_5_251i51ilvl9egzz.R.inc(6567);HashMap<Track, Double> track2currentTime = new HashMap<Track, Double>();

        __CLR4_5_251i51ilvl9egzz.R.inc(6568);for (Track track : movie.getTracks()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6569);long[] intersects = fragmenter.sampleNumbers(track);
            __CLR4_5_251i51ilvl9egzz.R.inc(6570);intersectionMap.put(track, intersects);
            __CLR4_5_251i51ilvl9egzz.R.inc(6571);track2currentTime.put(track, 0.0);

        }

        }__CLR4_5_251i51ilvl9egzz.R.inc(6572);int sequence = 1;
        __CLR4_5_251i51ilvl9egzz.R.inc(6573);while ((((!intersectionMap.isEmpty())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6574)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6575)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6576);Track earliestTrack = null;
            __CLR4_5_251i51ilvl9egzz.R.inc(6577);double earliestTime = Double.MAX_VALUE;
            __CLR4_5_251i51ilvl9egzz.R.inc(6578);for (Map.Entry<Track, Double> trackEntry : track2currentTime.entrySet()) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6579);if ((((trackEntry.getValue() < earliestTime)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6580)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6581)==0&false))) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6582);earliestTime = trackEntry.getValue();
                    __CLR4_5_251i51ilvl9egzz.R.inc(6583);earliestTrack = trackEntry.getKey();
                }
            }}
            }assert (((earliestTrack != null)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6584)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6585)==0&false));

            __CLR4_5_251i51ilvl9egzz.R.inc(6586);long[] startSamples = intersectionMap.get(earliestTrack);
            __CLR4_5_251i51ilvl9egzz.R.inc(6587);long startSample = startSamples[0];
            __CLR4_5_251i51ilvl9egzz.R.inc(6588);long endSample = (((startSamples.length > 1 )&&(__CLR4_5_251i51ilvl9egzz.R.iget(6589)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6590)==0&false))? startSamples[1] : earliestTrack.getSamples().size() + 1;

            __CLR4_5_251i51ilvl9egzz.R.inc(6591);long[] times = earliestTrack.getSampleDurations();
            __CLR4_5_251i51ilvl9egzz.R.inc(6592);long timscale = earliestTrack.getTrackMetaData().getTimescale();
            __CLR4_5_251i51ilvl9egzz.R.inc(6593);for (long i = startSample; (((i < endSample)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6594)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6595)==0&false)); i++) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6596);earliestTime += (double) times[l2i(i-1)] / timscale;
            }
            }__CLR4_5_251i51ilvl9egzz.R.inc(6597);createFragment(moofsMdats, earliestTrack, startSample, endSample, sequence);

            __CLR4_5_251i51ilvl9egzz.R.inc(6598);if ((((startSamples.length == 1)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6599)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6600)==0&false))) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6601);intersectionMap.remove(earliestTrack);
                __CLR4_5_251i51ilvl9egzz.R.inc(6602);track2currentTime.remove(earliestTrack);
                // all sample written.
            } }else {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6603);long[] nuStartSamples = new long[startSamples.length - 1];
                __CLR4_5_251i51ilvl9egzz.R.inc(6604);System.arraycopy(startSamples, 1, nuStartSamples, 0, nuStartSamples.length);
                __CLR4_5_251i51ilvl9egzz.R.inc(6605);intersectionMap.put(earliestTrack, nuStartSamples);
                __CLR4_5_251i51ilvl9egzz.R.inc(6606);track2currentTime.put(earliestTrack, earliestTime);
            }


            }__CLR4_5_251i51ilvl9egzz.R.inc(6607);sequence++;

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
        }__CLR4_5_251i51ilvl9egzz.R.inc(6608);return moofsMdats;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected int createFragment(List<Box> moofsMdats, Track track, long startSample, long endSample, int sequence) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6609);


        // if startSample == endSample the cycle is empty!
        __CLR4_5_251i51ilvl9egzz.R.inc(6610);if ((((startSample != endSample)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6611)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6612)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6613);moofsMdats.add(createMoof(startSample, endSample, track, sequence));
            __CLR4_5_251i51ilvl9egzz.R.inc(6614);moofsMdats.add(createMdat(startSample, endSample, track, sequence));
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6615);return sequence;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public Container build(Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6616);
        __CLR4_5_251i51ilvl9egzz.R.inc(6617);LOG.fine("Creating movie " + movie);
        __CLR4_5_251i51ilvl9egzz.R.inc(6618);if ((((fragmenter == null)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6619)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6620)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6621);fragmenter = new DefaultFragmenterImpl(2);
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6622);BasicContainer isoFile = new BasicContainer();


        __CLR4_5_251i51ilvl9egzz.R.inc(6623);isoFile.addBox(createFtyp(movie));
        //isoFile.addBox(createPdin(movie));
        __CLR4_5_251i51ilvl9egzz.R.inc(6624);isoFile.addBox(createMoov(movie));

        __CLR4_5_251i51ilvl9egzz.R.inc(6625);for (Box box : createMoofMdat(movie)) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6626);isoFile.addBox(box);
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6627);isoFile.addBox(createMfra(movie, isoFile));

        __CLR4_5_251i51ilvl9egzz.R.inc(6628);return isoFile;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createMdat(final long startSample, final long endSample, final Track track, final int i) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6629);

        class Mdat implements Box {
            Container parent;
            long size_ = -1;

            public Container getParent() {try{__CLR4_5_251i51ilvl9egzz.R.inc(6630);
                __CLR4_5_251i51ilvl9egzz.R.inc(6631);return parent;
            }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

            public void setParent(Container parent) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6632);
                __CLR4_5_251i51ilvl9egzz.R.inc(6633);this.parent = parent;
            }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

            public long getOffset() {try{__CLR4_5_251i51ilvl9egzz.R.inc(6634);
                __CLR4_5_251i51ilvl9egzz.R.inc(6635);throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
            }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

            public long getSize() {try{__CLR4_5_251i51ilvl9egzz.R.inc(6636);
                __CLR4_5_251i51ilvl9egzz.R.inc(6637);if ((((size_ != -1)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6638)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6639)==0&false))) {__CLR4_5_251i51ilvl9egzz.R.inc(6640);return size_;
                }__CLR4_5_251i51ilvl9egzz.R.inc(6641);long size = 8; // I don't expect 2gig fragments
                __CLR4_5_251i51ilvl9egzz.R.inc(6642);for (Sample sample : getSamples(startSample, endSample, track)) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6643);size += sample.getSize();
                }
                }__CLR4_5_251i51ilvl9egzz.R.inc(6644);size_ = size;
                __CLR4_5_251i51ilvl9egzz.R.inc(6645);return size;
            }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

            public String getType() {try{__CLR4_5_251i51ilvl9egzz.R.inc(6646);
                __CLR4_5_251i51ilvl9egzz.R.inc(6647);return "mdat";
            }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

            public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_251i51ilvl9egzz.R.inc(6648);
                __CLR4_5_251i51ilvl9egzz.R.inc(6649);ByteBuffer header = ByteBuffer.allocate(8);
                __CLR4_5_251i51ilvl9egzz.R.inc(6650);IsoTypeWriter.writeUInt32(header, l2i(getSize()));
                __CLR4_5_251i51ilvl9egzz.R.inc(6651);header.put(IsoFile.fourCCtoBytes(getType()));
                __CLR4_5_251i51ilvl9egzz.R.inc(6652);header.rewind();
                __CLR4_5_251i51ilvl9egzz.R.inc(6653);writableByteChannel.write(header);

                __CLR4_5_251i51ilvl9egzz.R.inc(6654);List<Sample> samples = getSamples(startSample, endSample, track);
                __CLR4_5_251i51ilvl9egzz.R.inc(6655);for (Sample sample : samples) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6656);sample.writeTo(writableByteChannel);
                }


            }}finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

            public void parse(DataSource fileChannel, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_251i51ilvl9egzz.R.inc(6657);

            }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}
        }

        __CLR4_5_251i51ilvl9egzz.R.inc(6658);return new Mdat();
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected void createTfhd(long startSample, long endSample, Track track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6659);
        __CLR4_5_251i51ilvl9egzz.R.inc(6660);TrackFragmentHeaderBox tfhd = new TrackFragmentHeaderBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6661);SampleFlags sf = new SampleFlags();

        __CLR4_5_251i51ilvl9egzz.R.inc(6662);tfhd.setDefaultSampleFlags(sf);
        __CLR4_5_251i51ilvl9egzz.R.inc(6663);tfhd.setBaseDataOffset(-1);
        __CLR4_5_251i51ilvl9egzz.R.inc(6664);tfhd.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_251i51ilvl9egzz.R.inc(6665);tfhd.setDefaultBaseIsMoof(true);
        __CLR4_5_251i51ilvl9egzz.R.inc(6666);parent.addBox(tfhd);
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected void createMfhd(long startSample, long endSample, Track track, int sequenceNumber, MovieFragmentBox parent) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6667);
        __CLR4_5_251i51ilvl9egzz.R.inc(6668);MovieFragmentHeaderBox mfhd = new MovieFragmentHeaderBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6669);mfhd.setSequenceNumber(sequenceNumber);
        __CLR4_5_251i51ilvl9egzz.R.inc(6670);parent.addBox(mfhd);
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected void createTraf(long startSample, long endSample, Track track, int sequenceNumber, MovieFragmentBox parent) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6671);
        __CLR4_5_251i51ilvl9egzz.R.inc(6672);TrackFragmentBox traf = new TrackFragmentBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6673);parent.addBox(traf);
        __CLR4_5_251i51ilvl9egzz.R.inc(6674);createTfhd(startSample, endSample, track, sequenceNumber, traf);
        __CLR4_5_251i51ilvl9egzz.R.inc(6675);createTfdt(startSample, track, traf);
        __CLR4_5_251i51ilvl9egzz.R.inc(6676);createTrun(startSample, endSample, track, sequenceNumber, traf);

        __CLR4_5_251i51ilvl9egzz.R.inc(6677);if ((((track instanceof CencEncryptedTrack)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6678)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6679)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6680);createSaiz(startSample, endSample, (CencEncryptedTrack) track, sequenceNumber, traf);
            __CLR4_5_251i51ilvl9egzz.R.inc(6681);createSenc(startSample, endSample, (CencEncryptedTrack) track, sequenceNumber, traf);
            __CLR4_5_251i51ilvl9egzz.R.inc(6682);createSaio(startSample, endSample, (CencEncryptedTrack) track, sequenceNumber, traf);
        }


        }__CLR4_5_251i51ilvl9egzz.R.inc(6683);Map<String, List<GroupEntry>> groupEntryFamilies = new HashMap<String, List<GroupEntry>>();
        __CLR4_5_251i51ilvl9egzz.R.inc(6684);for (Map.Entry<GroupEntry, long[]> sg : track.getSampleGroups().entrySet()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6685);String type = sg.getKey().getType();
            __CLR4_5_251i51ilvl9egzz.R.inc(6686);List<GroupEntry> groupEntries = groupEntryFamilies.get(type);
            __CLR4_5_251i51ilvl9egzz.R.inc(6687);if ((((groupEntries == null)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6688)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6689)==0&false))) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6690);groupEntries = new ArrayList<GroupEntry>();
                __CLR4_5_251i51ilvl9egzz.R.inc(6691);groupEntryFamilies.put(type, groupEntries);
            }
            }__CLR4_5_251i51ilvl9egzz.R.inc(6692);groupEntries.add(sg.getKey());
        }


        }__CLR4_5_251i51ilvl9egzz.R.inc(6693);for (Map.Entry<String, List<GroupEntry>> sg : groupEntryFamilies.entrySet()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6694);SampleGroupDescriptionBox sgpd = new SampleGroupDescriptionBox();
            __CLR4_5_251i51ilvl9egzz.R.inc(6695);String type = sg.getKey();
            __CLR4_5_251i51ilvl9egzz.R.inc(6696);sgpd.setGroupEntries(sg.getValue());
            __CLR4_5_251i51ilvl9egzz.R.inc(6697);sgpd.setGroupingType(type);
            __CLR4_5_251i51ilvl9egzz.R.inc(6698);SampleToGroupBox sbgp = new SampleToGroupBox();
            __CLR4_5_251i51ilvl9egzz.R.inc(6699);sbgp.setGroupingType(type);
            __CLR4_5_251i51ilvl9egzz.R.inc(6700);SampleToGroupBox.Entry last = null;
            __CLR4_5_251i51ilvl9egzz.R.inc(6701);for (int i = l2i(startSample - 1); (((i < l2i(endSample - 1))&&(__CLR4_5_251i51ilvl9egzz.R.iget(6702)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6703)==0&false)); i++) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6704);int index = 0;
                __CLR4_5_251i51ilvl9egzz.R.inc(6705);for (int j = 0; (((j < sg.getValue().size())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6706)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6707)==0&false)); j++) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6708);GroupEntry groupEntry = sg.getValue().get(j);
                    __CLR4_5_251i51ilvl9egzz.R.inc(6709);long[] sampleNums = track.getSampleGroups().get(groupEntry);
                    __CLR4_5_251i51ilvl9egzz.R.inc(6710);if ((((Arrays.binarySearch(sampleNums, i) >= 0)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6711)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6712)==0&false))) {{
                        __CLR4_5_251i51ilvl9egzz.R.inc(6713);index = j + 0x10001;
                    }
                }}
                }__CLR4_5_251i51ilvl9egzz.R.inc(6714);if ((((last == null || last.getGroupDescriptionIndex() != index)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6715)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6716)==0&false))) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6717);last = new SampleToGroupBox.Entry(1, index);
                    __CLR4_5_251i51ilvl9egzz.R.inc(6718);sbgp.getEntries().add(last);
                } }else {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6719);last.setSampleCount(last.getSampleCount() + 1);
                }
            }}
            }__CLR4_5_251i51ilvl9egzz.R.inc(6720);traf.addBox(sgpd);
            __CLR4_5_251i51ilvl9egzz.R.inc(6721);traf.addBox(sbgp);
        }


    }}finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected void createSenc(long startSample, long endSample, CencEncryptedTrack track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6722);
        __CLR4_5_251i51ilvl9egzz.R.inc(6723);SampleEncryptionBox senc = new SampleEncryptionBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6724);senc.setSubSampleEncryption(track.hasSubSampleEncryption());
        __CLR4_5_251i51ilvl9egzz.R.inc(6725);senc.setEntries(track.getSampleEncryptionEntries().subList(l2i(startSample - 1), l2i(endSample - 1)));
        __CLR4_5_251i51ilvl9egzz.R.inc(6726);parent.addBox(senc);
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected void createSaio(long startSample, long endSample, CencEncryptedTrack track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6727);
        __CLR4_5_251i51ilvl9egzz.R.inc(6728);SchemeTypeBox schm = Path.getPath(track.getSampleDescriptionBox(), "enc.[0]/sinf[0]/schm[0]");

        __CLR4_5_251i51ilvl9egzz.R.inc(6729);SampleAuxiliaryInformationOffsetsBox saio = new SampleAuxiliaryInformationOffsetsBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6730);parent.addBox(saio);
        assert (((parent.getBoxes(TrackRunBox.class).size() == 1 )&&(__CLR4_5_251i51ilvl9egzz.R.iget(6731)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6732)==0&false)): "Don't know how to deal with multiple Track Run Boxes when encrypting";
        __CLR4_5_251i51ilvl9egzz.R.inc(6733);saio.setAuxInfoType("cenc");
        __CLR4_5_251i51ilvl9egzz.R.inc(6734);saio.setFlags(1);
        __CLR4_5_251i51ilvl9egzz.R.inc(6735);long offset = 0;
        __CLR4_5_251i51ilvl9egzz.R.inc(6736);offset += 8; // traf header till 1st child box
        __CLR4_5_251i51ilvl9egzz.R.inc(6737);for (Box box : parent.getBoxes()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6738);if ((((box instanceof SampleEncryptionBox)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6739)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6740)==0&false))) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6741);offset += ((SampleEncryptionBox) box).getOffsetToFirstIV();
                __CLR4_5_251i51ilvl9egzz.R.inc(6742);break;
            } }else {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6743);offset += box.getSize();
            }
        }}
        }__CLR4_5_251i51ilvl9egzz.R.inc(6744);MovieFragmentBox moof = (MovieFragmentBox) parent.getParent();
        __CLR4_5_251i51ilvl9egzz.R.inc(6745);offset += 16; // traf header till 1st child box
        __CLR4_5_251i51ilvl9egzz.R.inc(6746);for (Box box : moof.getBoxes()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6747);if ((((box == parent)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6748)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6749)==0&false))) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6750);break;
            } }else {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6751);offset += box.getSize();
            }

        }}

        }__CLR4_5_251i51ilvl9egzz.R.inc(6752);saio.setOffsets(new long[]{offset});

    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected void createSaiz(long startSample, long endSample, CencEncryptedTrack track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6753);
        __CLR4_5_251i51ilvl9egzz.R.inc(6754);SampleDescriptionBox sampleDescriptionBox = track.getSampleDescriptionBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6755);SchemeTypeBox schm = Path.getPath(sampleDescriptionBox, "enc.[0]/sinf[0]/schm[0]");
        __CLR4_5_251i51ilvl9egzz.R.inc(6756);TrackEncryptionBox tenc = Path.getPath(sampleDescriptionBox, "enc.[0]/sinf[0]/schi[0]/tenc[0]");

        __CLR4_5_251i51ilvl9egzz.R.inc(6757);SampleAuxiliaryInformationSizesBox saiz = new SampleAuxiliaryInformationSizesBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6758);saiz.setAuxInfoType("cenc");
        __CLR4_5_251i51ilvl9egzz.R.inc(6759);saiz.setFlags(1);
        __CLR4_5_251i51ilvl9egzz.R.inc(6760);if ((((track.hasSubSampleEncryption())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6761)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6762)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6763);short[] sizes = new short[l2i(endSample - startSample)];
            __CLR4_5_251i51ilvl9egzz.R.inc(6764);List<CencSampleAuxiliaryDataFormat> auxs =
                    track.getSampleEncryptionEntries().subList(l2i(startSample - 1), l2i(endSample - 1));
            __CLR4_5_251i51ilvl9egzz.R.inc(6765);for (int i = 0; (((i < sizes.length)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6766)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6767)==0&false)); i++) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6768);sizes[i] = (short) auxs.get(i).getSize();
            }
            }__CLR4_5_251i51ilvl9egzz.R.inc(6769);saiz.setSampleInfoSizes(sizes);
        } }else {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6770);saiz.setDefaultSampleInfoSize(tenc.getDefaultIvSize());
            __CLR4_5_251i51ilvl9egzz.R.inc(6771);saiz.setSampleCount(l2i(endSample - startSample));
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6772);parent.addBox(saiz);
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}


    /**
     * Gets all samples starting with <code>startSample</code> (one based -&gt; one is the first) and
     * ending with <code>endSample</code> (exclusive).
     *
     * @param startSample low endpoint (inclusive) of the sample sequence
     * @param endSample   high endpoint (exclusive) of the sample sequence
     * @param track       source of the samples
     * @return a <code>List&lt;Sample&gt;</code> of raw samples
     */
    protected List<Sample> getSamples(long startSample, long endSample, Track track) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6773);
        // since startSample and endSample are one-based substract 1 before addressing list elements
        __CLR4_5_251i51ilvl9egzz.R.inc(6774);return track.getSamples().subList(l2i(startSample) - 1, l2i(endSample) - 1);
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    /**
     * Gets the sizes of a sequence of samples.
     *
     * @param startSample    low endpoint (inclusive) of the sample sequence
     * @param endSample      high endpoint (exclusive) of the sample sequence
     * @param track          source of the samples
     * @param sequenceNumber the fragment index of the requested list of samples
     * @return the sample sizes in the given interval
     */
    protected long[] getSampleSizes(long startSample, long endSample, Track track, int sequenceNumber) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6775);
        __CLR4_5_251i51ilvl9egzz.R.inc(6776);List<Sample> samples = getSamples(startSample, endSample, track);

        __CLR4_5_251i51ilvl9egzz.R.inc(6777);long[] sampleSizes = new long[samples.size()];
        __CLR4_5_251i51ilvl9egzz.R.inc(6778);for (int i = 0; (((i < sampleSizes.length)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6779)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6780)==0&false)); i++) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6781);sampleSizes[i] = samples.get(i).getSize();
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6782);return sampleSizes;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected void createTfdt(long startSample, Track track, TrackFragmentBox parent) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6783);
        __CLR4_5_251i51ilvl9egzz.R.inc(6784);TrackFragmentBaseMediaDecodeTimeBox tfdt = new TrackFragmentBaseMediaDecodeTimeBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6785);tfdt.setVersion(1);
        __CLR4_5_251i51ilvl9egzz.R.inc(6786);long startTime = 0;
        __CLR4_5_251i51ilvl9egzz.R.inc(6787);long[] times = track.getSampleDurations();
        __CLR4_5_251i51ilvl9egzz.R.inc(6788);for (int i = 1; (((i < startSample)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6789)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6790)==0&false)); i++) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6791);startTime += times[i - 1];
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6792);tfdt.setBaseMediaDecodeTime(startTime);
        __CLR4_5_251i51ilvl9egzz.R.inc(6793);parent.addBox(tfdt);
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    /**
     * Creates one or more track run boxes for a given sequence.
     *
     * @param startSample    low endpoint (inclusive) of the sample sequence
     * @param endSample      high endpoint (exclusive) of the sample sequence
     * @param track          source of the samples
     * @param sequenceNumber the fragment index of the requested list of samples
     * @param parent         the created box must be added to this box
     */
    protected void createTrun(long startSample, long endSample, Track track, int sequenceNumber, TrackFragmentBox parent) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6794);
        __CLR4_5_251i51ilvl9egzz.R.inc(6795);TrackRunBox trun = new TrackRunBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6796);trun.setVersion(1);
        __CLR4_5_251i51ilvl9egzz.R.inc(6797);long[] sampleSizes = getSampleSizes(startSample, endSample, track, sequenceNumber);

        __CLR4_5_251i51ilvl9egzz.R.inc(6798);trun.setSampleDurationPresent(true);
        __CLR4_5_251i51ilvl9egzz.R.inc(6799);trun.setSampleSizePresent(true);
        __CLR4_5_251i51ilvl9egzz.R.inc(6800);List<TrackRunBox.Entry> entries = new ArrayList<TrackRunBox.Entry>(l2i(endSample - startSample));


        __CLR4_5_251i51ilvl9egzz.R.inc(6801);List<CompositionTimeToSample.Entry> compositionTimeEntries = track.getCompositionTimeEntries();
        __CLR4_5_251i51ilvl9egzz.R.inc(6802);int compositionTimeQueueIndex = 0;
        __CLR4_5_251i51ilvl9egzz.R.inc(6803);CompositionTimeToSample.Entry[] compositionTimeQueue =
                (((compositionTimeEntries != null && compositionTimeEntries.size() > 0 )&&(__CLR4_5_251i51ilvl9egzz.R.iget(6804)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6805)==0&false))?
                        compositionTimeEntries.toArray(new CompositionTimeToSample.Entry[compositionTimeEntries.size()]) : null;
        __CLR4_5_251i51ilvl9egzz.R.inc(6806);long compositionTimeEntriesLeft = (((compositionTimeQueue != null )&&(__CLR4_5_251i51ilvl9egzz.R.iget(6807)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6808)==0&false))? compositionTimeQueue[compositionTimeQueueIndex].getCount() : -1;


        __CLR4_5_251i51ilvl9egzz.R.inc(6809);trun.setSampleCompositionTimeOffsetPresent(compositionTimeEntriesLeft > 0);

        // fast forward composition stuff
        __CLR4_5_251i51ilvl9egzz.R.inc(6810);for (long i = 1; (((i < startSample)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6811)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6812)==0&false)); i++) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6813);if ((((compositionTimeQueue != null)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6814)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6815)==0&false))) {{
                //trun.setSampleCompositionTimeOffsetPresent(true);
                __CLR4_5_251i51ilvl9egzz.R.inc(6816);if ((((--compositionTimeEntriesLeft == 0 && (compositionTimeQueue.length - compositionTimeQueueIndex) > 1)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6817)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6818)==0&false))) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6819);compositionTimeQueueIndex++;
                    __CLR4_5_251i51ilvl9egzz.R.inc(6820);compositionTimeEntriesLeft = compositionTimeQueue[compositionTimeQueueIndex].getCount();
                }
            }}
        }}

        }__CLR4_5_251i51ilvl9egzz.R.inc(6821);boolean sampleFlagsRequired = (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty() ||
                track.getSyncSamples() != null && track.getSyncSamples().length != 0);

        __CLR4_5_251i51ilvl9egzz.R.inc(6822);trun.setSampleFlagsPresent(sampleFlagsRequired);

        __CLR4_5_251i51ilvl9egzz.R.inc(6823);for (int i = 0; (((i < sampleSizes.length)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6824)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6825)==0&false)); i++) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6826);TrackRunBox.Entry entry = new TrackRunBox.Entry();
            __CLR4_5_251i51ilvl9egzz.R.inc(6827);entry.setSampleSize(sampleSizes[i]);
            __CLR4_5_251i51ilvl9egzz.R.inc(6828);if ((((sampleFlagsRequired)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6829)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6830)==0&false))) {{
                //if (false) {
                __CLR4_5_251i51ilvl9egzz.R.inc(6831);SampleFlags sflags = new SampleFlags();

                __CLR4_5_251i51ilvl9egzz.R.inc(6832);if ((((track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6833)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6834)==0&false))) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6835);SampleDependencyTypeBox.Entry e = track.getSampleDependencies().get(i);
                    __CLR4_5_251i51ilvl9egzz.R.inc(6836);sflags.setSampleDependsOn(e.getSampleDependsOn());
                    __CLR4_5_251i51ilvl9egzz.R.inc(6837);sflags.setSampleIsDependedOn(e.getSampleIsDependentOn());
                    __CLR4_5_251i51ilvl9egzz.R.inc(6838);sflags.setSampleHasRedundancy(e.getSampleHasRedundancy());
                }
                }__CLR4_5_251i51ilvl9egzz.R.inc(6839);if ((((track.getSyncSamples() != null && track.getSyncSamples().length > 0)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6840)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6841)==0&false))) {{
                    // we have to mark non-sync samples!
                    __CLR4_5_251i51ilvl9egzz.R.inc(6842);if ((((Arrays.binarySearch(track.getSyncSamples(), startSample + i) >= 0)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6843)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6844)==0&false))) {{
                        __CLR4_5_251i51ilvl9egzz.R.inc(6845);sflags.setSampleIsDifferenceSample(false);
                        __CLR4_5_251i51ilvl9egzz.R.inc(6846);sflags.setSampleDependsOn(2);
                    } }else {{
                        __CLR4_5_251i51ilvl9egzz.R.inc(6847);sflags.setSampleIsDifferenceSample(true);
                        __CLR4_5_251i51ilvl9egzz.R.inc(6848);sflags.setSampleDependsOn(1);
                    }
                }}
                // i don't have sample degradation
                }__CLR4_5_251i51ilvl9egzz.R.inc(6849);entry.setSampleFlags(sflags);

            }

            }__CLR4_5_251i51ilvl9egzz.R.inc(6850);entry.setSampleDuration(track.getSampleDurations()[l2i(startSample + i - 1)]);

            __CLR4_5_251i51ilvl9egzz.R.inc(6851);if ((((compositionTimeQueue != null)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6852)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6853)==0&false))) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6854);entry.setSampleCompositionTimeOffset(compositionTimeQueue[compositionTimeQueueIndex].getOffset());
                __CLR4_5_251i51ilvl9egzz.R.inc(6855);if ((((--compositionTimeEntriesLeft == 0 && (compositionTimeQueue.length - compositionTimeQueueIndex) > 1)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6856)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6857)==0&false))) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6858);compositionTimeQueueIndex++;
                    __CLR4_5_251i51ilvl9egzz.R.inc(6859);compositionTimeEntriesLeft = compositionTimeQueue[compositionTimeQueueIndex].getCount();
                }
            }}
            }__CLR4_5_251i51ilvl9egzz.R.inc(6860);entries.add(entry);
        }

        }__CLR4_5_251i51ilvl9egzz.R.inc(6861);trun.setEntries(entries);

        __CLR4_5_251i51ilvl9egzz.R.inc(6862);parent.addBox(trun);
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    /**
     * Creates a 'moof' box for a given sequence of samples.
     *
     * @param startSample    low endpoint (inclusive) of the sample sequence
     * @param endSample      high endpoint (exclusive) of the sample sequence
     * @param track          source of the samples
     * @param sequenceNumber the fragment index of the requested list of samples
     * @return the list of TrackRun boxes.
     */
    protected Box createMoof(long startSample, long endSample, Track track, int sequenceNumber) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6863);
        __CLR4_5_251i51ilvl9egzz.R.inc(6864);MovieFragmentBox moof = new MovieFragmentBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6865);createMfhd(startSample, endSample, track, sequenceNumber, moof);
        __CLR4_5_251i51ilvl9egzz.R.inc(6866);createTraf(startSample, endSample, track, sequenceNumber, moof);

        __CLR4_5_251i51ilvl9egzz.R.inc(6867);TrackRunBox firstTrun = moof.getTrackRunBoxes().get(0);
        __CLR4_5_251i51ilvl9egzz.R.inc(6868);firstTrun.setDataOffset(1); // dummy to make size correct
        __CLR4_5_251i51ilvl9egzz.R.inc(6869);firstTrun.setDataOffset((int) (8 + moof.getSize())); // mdat header + moof size

        __CLR4_5_251i51ilvl9egzz.R.inc(6870);return moof;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    /**
     * Creates a single 'mvhd' movie header box for a given movie.
     *
     * @param movie the concerned movie
     * @return an 'mvhd' box
     */
    protected Box createMvhd(Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6871);
        __CLR4_5_251i51ilvl9egzz.R.inc(6872);MovieHeaderBox mvhd = new MovieHeaderBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6873);mvhd.setVersion(1);
        __CLR4_5_251i51ilvl9egzz.R.inc(6874);mvhd.setCreationTime(getDate());
        __CLR4_5_251i51ilvl9egzz.R.inc(6875);mvhd.setModificationTime(getDate());
        __CLR4_5_251i51ilvl9egzz.R.inc(6876);mvhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_251i51ilvl9egzz.R.inc(6877);long movieTimeScale = movie.getTimescale();
        __CLR4_5_251i51ilvl9egzz.R.inc(6878);mvhd.setTimescale(movieTimeScale);
        // find the next available trackId
        __CLR4_5_251i51ilvl9egzz.R.inc(6879);long nextTrackId = 0;
        __CLR4_5_251i51ilvl9egzz.R.inc(6880);for (Track track : movie.getTracks()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6881);nextTrackId = (((nextTrackId < track.getTrackMetaData().getTrackId() )&&(__CLR4_5_251i51ilvl9egzz.R.iget(6882)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6883)==0&false))? track.getTrackMetaData().getTrackId() : nextTrackId;
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6884);mvhd.setNextTrackId(++nextTrackId);
        __CLR4_5_251i51ilvl9egzz.R.inc(6885);return mvhd;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

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
    protected Box createMoov(Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6886);
        __CLR4_5_251i51ilvl9egzz.R.inc(6887);MovieBox movieBox = new MovieBox();

        __CLR4_5_251i51ilvl9egzz.R.inc(6888);movieBox.addBox(createMvhd(movie));
        __CLR4_5_251i51ilvl9egzz.R.inc(6889);for (Track track : movie.getTracks()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6890);movieBox.addBox(createTrak(track, movie));
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6891);movieBox.addBox(createMvex(movie));

        // metadata here
        __CLR4_5_251i51ilvl9egzz.R.inc(6892);return movieBox;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    /**
     * Creates a 'tfra' - track fragment random access box for the given track with the isoFile.
     * The tfra contains a map of random access points with time as key and offset within the isofile
     * as value.
     *
     * @param track   the concerned track
     * @param isoFile the track is contained in
     * @return a track fragment random access box.
     */
    protected Box createTfra(Track track, Container isoFile) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6893);
        __CLR4_5_251i51ilvl9egzz.R.inc(6894);TrackFragmentRandomAccessBox tfra = new TrackFragmentRandomAccessBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6895);tfra.setVersion(1); // use long offsets and times
        __CLR4_5_251i51ilvl9egzz.R.inc(6896);List<TrackFragmentRandomAccessBox.Entry> offset2timeEntries = new LinkedList<TrackFragmentRandomAccessBox.Entry>();

        __CLR4_5_251i51ilvl9egzz.R.inc(6897);TrackExtendsBox trex = null;
        __CLR4_5_251i51ilvl9egzz.R.inc(6898);List<TrackExtendsBox> trexs = Path.getPaths(isoFile, "moov/mvex/trex");
        __CLR4_5_251i51ilvl9egzz.R.inc(6899);for (TrackExtendsBox innerTrex : trexs) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6900);if ((((innerTrex.getTrackId() == track.getTrackMetaData().getTrackId())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6901)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6902)==0&false))) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6903);trex = innerTrex;
            }
        }}

        }__CLR4_5_251i51ilvl9egzz.R.inc(6904);long offset = 0;
        __CLR4_5_251i51ilvl9egzz.R.inc(6905);long duration = 0;

        __CLR4_5_251i51ilvl9egzz.R.inc(6906);for (Box box : isoFile.getBoxes()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6907);if ((((box instanceof MovieFragmentBox)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6908)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6909)==0&false))) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6910);List<TrackFragmentBox> trafs = ((MovieFragmentBox) box).getBoxes(TrackFragmentBox.class);
                __CLR4_5_251i51ilvl9egzz.R.inc(6911);for (int i = 0; (((i < trafs.size())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6912)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6913)==0&false)); i++) {{
                    __CLR4_5_251i51ilvl9egzz.R.inc(6914);TrackFragmentBox traf = trafs.get(i);

                    __CLR4_5_251i51ilvl9egzz.R.inc(6915);if ((((traf.getTrackFragmentHeaderBox().getTrackId() == track.getTrackMetaData().getTrackId())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6916)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6917)==0&false))) {{

                        // here we are at the offset required for the current entry.
                        __CLR4_5_251i51ilvl9egzz.R.inc(6918);List<TrackRunBox> truns = traf.getBoxes(TrackRunBox.class);
                        __CLR4_5_251i51ilvl9egzz.R.inc(6919);for (int j = 0; (((j < truns.size())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6920)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6921)==0&false)); j++) {{
                            __CLR4_5_251i51ilvl9egzz.R.inc(6922);List<TrackFragmentRandomAccessBox.Entry> offset2timeEntriesThisTrun = new LinkedList<TrackFragmentRandomAccessBox.Entry>();
                            __CLR4_5_251i51ilvl9egzz.R.inc(6923);TrackRunBox trun = truns.get(j);
                            __CLR4_5_251i51ilvl9egzz.R.inc(6924);for (int k = 0; (((k < trun.getEntries().size())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6925)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6926)==0&false)); k++) {{
                                __CLR4_5_251i51ilvl9egzz.R.inc(6927);TrackRunBox.Entry trunEntry = trun.getEntries().get(k);
                                __CLR4_5_251i51ilvl9egzz.R.inc(6928);SampleFlags sf;
                                __CLR4_5_251i51ilvl9egzz.R.inc(6929);if ((((k == 0 && trun.isFirstSampleFlagsPresent())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6930)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6931)==0&false))) {{
                                    __CLR4_5_251i51ilvl9egzz.R.inc(6932);sf = trun.getFirstSampleFlags();
                                } }else {__CLR4_5_251i51ilvl9egzz.R.inc(6933);if ((((trun.isSampleFlagsPresent())&&(__CLR4_5_251i51ilvl9egzz.R.iget(6934)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6935)==0&false))) {{
                                    __CLR4_5_251i51ilvl9egzz.R.inc(6936);sf = trunEntry.getSampleFlags();
                                } }else {{
                                    __CLR4_5_251i51ilvl9egzz.R.inc(6937);sf = trex.getDefaultSampleFlags();
                                }
                                }}__CLR4_5_251i51ilvl9egzz.R.inc(6938);if ((((sf == null && track.getHandler().equals("vide"))&&(__CLR4_5_251i51ilvl9egzz.R.iget(6939)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6940)==0&false))) {{
                                    __CLR4_5_251i51ilvl9egzz.R.inc(6941);throw new RuntimeException("Cannot find SampleFlags for video track but it's required to build tfra");
                                }
                                }__CLR4_5_251i51ilvl9egzz.R.inc(6942);if ((((sf == null || sf.getSampleDependsOn() == 2)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6943)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6944)==0&false))) {{
                                    __CLR4_5_251i51ilvl9egzz.R.inc(6945);offset2timeEntriesThisTrun.add(new TrackFragmentRandomAccessBox.Entry(
                                            duration,
                                            offset,
                                            i + 1, j + 1, k + 1));
                                }
                                }__CLR4_5_251i51ilvl9egzz.R.inc(6946);duration += trunEntry.getSampleDuration();
                            }
                            }__CLR4_5_251i51ilvl9egzz.R.inc(6947);if ((((offset2timeEntriesThisTrun.size() == trun.getEntries().size() && trun.getEntries().size() > 0)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6948)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6949)==0&false))) {{
                                // Oooops every sample seems to be random access sample
                                // is this an audio track? I don't care.
                                // I just use the first for trun sample for tfra random access
                                __CLR4_5_251i51ilvl9egzz.R.inc(6950);offset2timeEntries.add(offset2timeEntriesThisTrun.get(0));
                            } }else {{
                                __CLR4_5_251i51ilvl9egzz.R.inc(6951);offset2timeEntries.addAll(offset2timeEntriesThisTrun);
                            }
                        }}
                    }}
                }}
            }}


            }__CLR4_5_251i51ilvl9egzz.R.inc(6952);offset += box.getSize();
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6953);tfra.setEntries(offset2timeEntries);
        __CLR4_5_251i51ilvl9egzz.R.inc(6954);tfra.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_251i51ilvl9egzz.R.inc(6955);return tfra;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    /**
     * Creates a 'mfra' - movie fragment random access box for the given movie in the given
     * isofile. Uses {@link #createTfra(com.googlecode.mp4parser.authoring.Track, Container)}
     * to generate the child boxes.
     *
     * @param movie   concerned movie
     * @param isoFile concerned isofile
     * @return a complete 'mfra' box
     */
    protected Box createMfra(Movie movie, Container isoFile) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6956);
        __CLR4_5_251i51ilvl9egzz.R.inc(6957);MovieFragmentRandomAccessBox mfra = new MovieFragmentRandomAccessBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6958);for (Track track : movie.getTracks()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6959);mfra.addBox(createTfra(track, isoFile));
        }

        }__CLR4_5_251i51ilvl9egzz.R.inc(6960);MovieFragmentRandomAccessOffsetBox mfro = new MovieFragmentRandomAccessOffsetBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6961);mfra.addBox(mfro);
        __CLR4_5_251i51ilvl9egzz.R.inc(6962);mfro.setMfraSize(mfra.getSize());
        __CLR4_5_251i51ilvl9egzz.R.inc(6963);return mfra;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createTrex(Movie movie, Track track) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6964);
        __CLR4_5_251i51ilvl9egzz.R.inc(6965);TrackExtendsBox trex = new TrackExtendsBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6966);trex.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_251i51ilvl9egzz.R.inc(6967);trex.setDefaultSampleDescriptionIndex(1);
        __CLR4_5_251i51ilvl9egzz.R.inc(6968);trex.setDefaultSampleDuration(0);
        __CLR4_5_251i51ilvl9egzz.R.inc(6969);trex.setDefaultSampleSize(0);
        __CLR4_5_251i51ilvl9egzz.R.inc(6970);SampleFlags sf = new SampleFlags();
        __CLR4_5_251i51ilvl9egzz.R.inc(6971);if (((("soun".equals(track.getHandler()) || "subt".equals(track.getHandler()))&&(__CLR4_5_251i51ilvl9egzz.R.iget(6972)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6973)==0&false))) {{
            // as far as I know there is no audio encoding
            // where the sample are not self contained.
            // same seems to be true for subtitle tracks
            __CLR4_5_251i51ilvl9egzz.R.inc(6974);sf.setSampleDependsOn(2);
            __CLR4_5_251i51ilvl9egzz.R.inc(6975);sf.setSampleIsDependedOn(2);
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6976);trex.setDefaultSampleFlags(sf);
        __CLR4_5_251i51ilvl9egzz.R.inc(6977);return trex;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    /**
     * Creates a 'mvex' - movie extends box and populates it with 'trex' boxes
     * by calling {@link #createTrex(com.googlecode.mp4parser.authoring.Movie, com.googlecode.mp4parser.authoring.Track)}
     * for each track to generate them
     *
     * @param movie the source movie
     * @return a complete 'mvex'
     */
    protected Box createMvex(Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6978);
        __CLR4_5_251i51ilvl9egzz.R.inc(6979);MovieExtendsBox mvex = new MovieExtendsBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6980);final MovieExtendsHeaderBox mved = new MovieExtendsHeaderBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6981);mved.setVersion(1);
        __CLR4_5_251i51ilvl9egzz.R.inc(6982);for (Track track : movie.getTracks()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6983);final long trackDuration = getTrackDuration(movie, track);
            __CLR4_5_251i51ilvl9egzz.R.inc(6984);if ((((mved.getFragmentDuration() < trackDuration)&&(__CLR4_5_251i51ilvl9egzz.R.iget(6985)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(6986)==0&false))) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(6987);mved.setFragmentDuration(trackDuration);
            }
        }}
        }__CLR4_5_251i51ilvl9egzz.R.inc(6988);mvex.addBox(mved);

        __CLR4_5_251i51ilvl9egzz.R.inc(6989);for (Track track : movie.getTracks()) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(6990);mvex.addBox(createTrex(movie, track));
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(6991);return mvex;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createTkhd(Movie movie, Track track) {try{__CLR4_5_251i51ilvl9egzz.R.inc(6992);
        __CLR4_5_251i51ilvl9egzz.R.inc(6993);TrackHeaderBox tkhd = new TrackHeaderBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(6994);tkhd.setVersion(1);
        __CLR4_5_251i51ilvl9egzz.R.inc(6995);tkhd.setFlags(7); // enabled, in movie, in previe, in poster

        __CLR4_5_251i51ilvl9egzz.R.inc(6996);tkhd.setAlternateGroup(track.getTrackMetaData().getGroup());
        __CLR4_5_251i51ilvl9egzz.R.inc(6997);tkhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        // We need to take edit list box into account in trackheader duration
        // but as long as I don't support edit list boxes it is sufficient to
        // just translate media duration to movie timescale
        __CLR4_5_251i51ilvl9egzz.R.inc(6998);tkhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_251i51ilvl9egzz.R.inc(6999);tkhd.setHeight(track.getTrackMetaData().getHeight());
        __CLR4_5_251i51ilvl9egzz.R.inc(7000);tkhd.setWidth(track.getTrackMetaData().getWidth());
        __CLR4_5_251i51ilvl9egzz.R.inc(7001);tkhd.setLayer(track.getTrackMetaData().getLayer());
        __CLR4_5_251i51ilvl9egzz.R.inc(7002);tkhd.setModificationTime(getDate());
        __CLR4_5_251i51ilvl9egzz.R.inc(7003);tkhd.setTrackId(track.getTrackMetaData().getTrackId());
        __CLR4_5_251i51ilvl9egzz.R.inc(7004);tkhd.setVolume(track.getTrackMetaData().getVolume());
        __CLR4_5_251i51ilvl9egzz.R.inc(7005);return tkhd;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    private long getTrackDuration(Movie movie, Track track) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7006);
        __CLR4_5_251i51ilvl9egzz.R.inc(7007);return (track.getDuration() * movie.getTimescale()) / track.getTrackMetaData().getTimescale();
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createMdhd(Movie movie, Track track) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7008);
        __CLR4_5_251i51ilvl9egzz.R.inc(7009);MediaHeaderBox mdhd = new MediaHeaderBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(7010);mdhd.setCreationTime(track.getTrackMetaData().getCreationTime());
        __CLR4_5_251i51ilvl9egzz.R.inc(7011);mdhd.setModificationTime(getDate());
        __CLR4_5_251i51ilvl9egzz.R.inc(7012);mdhd.setDuration(0);//no duration in moov for fragmented movies
        __CLR4_5_251i51ilvl9egzz.R.inc(7013);mdhd.setTimescale(track.getTrackMetaData().getTimescale());
        __CLR4_5_251i51ilvl9egzz.R.inc(7014);mdhd.setLanguage(track.getTrackMetaData().getLanguage());
        __CLR4_5_251i51ilvl9egzz.R.inc(7015);return mdhd;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createStbl(Movie movie, Track track) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7016);
        __CLR4_5_251i51ilvl9egzz.R.inc(7017);SampleTableBox stbl = new SampleTableBox();

        __CLR4_5_251i51ilvl9egzz.R.inc(7018);createStsd(track, stbl);
        __CLR4_5_251i51ilvl9egzz.R.inc(7019);stbl.addBox(new TimeToSampleBox());
        __CLR4_5_251i51ilvl9egzz.R.inc(7020);stbl.addBox(new SampleToChunkBox());
        __CLR4_5_251i51ilvl9egzz.R.inc(7021);stbl.addBox(new SampleSizeBox());
        __CLR4_5_251i51ilvl9egzz.R.inc(7022);stbl.addBox(new StaticChunkOffsetBox());
        __CLR4_5_251i51ilvl9egzz.R.inc(7023);return stbl;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected void createStsd(Track track, SampleTableBox stbl) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7024);
        __CLR4_5_251i51ilvl9egzz.R.inc(7025);stbl.addBox(track.getSampleDescriptionBox());
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createMinf(Track track, Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7026);
        __CLR4_5_251i51ilvl9egzz.R.inc(7027);MediaInformationBox minf = new MediaInformationBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(7028);if ((((track.getHandler().equals("vide"))&&(__CLR4_5_251i51ilvl9egzz.R.iget(7029)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(7030)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(7031);minf.addBox(new VideoMediaHeaderBox());
        } }else {__CLR4_5_251i51ilvl9egzz.R.inc(7032);if ((((track.getHandler().equals("soun"))&&(__CLR4_5_251i51ilvl9egzz.R.iget(7033)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(7034)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(7035);minf.addBox(new SoundMediaHeaderBox());
        } }else {__CLR4_5_251i51ilvl9egzz.R.inc(7036);if ((((track.getHandler().equals("text"))&&(__CLR4_5_251i51ilvl9egzz.R.iget(7037)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(7038)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(7039);minf.addBox(new NullMediaHeaderBox());
        } }else {__CLR4_5_251i51ilvl9egzz.R.inc(7040);if ((((track.getHandler().equals("subt"))&&(__CLR4_5_251i51ilvl9egzz.R.iget(7041)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(7042)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(7043);minf.addBox(new SubtitleMediaHeaderBox());
        } }else {__CLR4_5_251i51ilvl9egzz.R.inc(7044);if ((((track.getHandler().equals("hint"))&&(__CLR4_5_251i51ilvl9egzz.R.iget(7045)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(7046)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(7047);minf.addBox(new HintMediaHeaderBox());
        } }else {__CLR4_5_251i51ilvl9egzz.R.inc(7048);if ((((track.getHandler().equals("sbtl"))&&(__CLR4_5_251i51ilvl9egzz.R.iget(7049)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(7050)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(7051);minf.addBox(new NullMediaHeaderBox());
        }
        }}}}}}__CLR4_5_251i51ilvl9egzz.R.inc(7052);minf.addBox(createDinf(movie, track));
        __CLR4_5_251i51ilvl9egzz.R.inc(7053);minf.addBox(createStbl(movie, track));
        __CLR4_5_251i51ilvl9egzz.R.inc(7054);return minf;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createMdiaHdlr(Track track, Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7055);
        __CLR4_5_251i51ilvl9egzz.R.inc(7056);HandlerBox hdlr = new HandlerBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(7057);hdlr.setHandlerType(track.getHandler());
        __CLR4_5_251i51ilvl9egzz.R.inc(7058);return hdlr;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createMdia(Track track, Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7059);
        __CLR4_5_251i51ilvl9egzz.R.inc(7060);MediaBox mdia = new MediaBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(7061);mdia.addBox(createMdhd(movie, track));


        __CLR4_5_251i51ilvl9egzz.R.inc(7062);mdia.addBox(createMdiaHdlr(track, movie));


        __CLR4_5_251i51ilvl9egzz.R.inc(7063);mdia.addBox(createMinf(track, movie));
        __CLR4_5_251i51ilvl9egzz.R.inc(7064);return mdia;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createTrak(Track track, Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7065);
        __CLR4_5_251i51ilvl9egzz.R.inc(7066);LOG.fine("Creating Track " + track);
        __CLR4_5_251i51ilvl9egzz.R.inc(7067);TrackBox trackBox = new TrackBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(7068);trackBox.addBox(createTkhd(movie, track));
        __CLR4_5_251i51ilvl9egzz.R.inc(7069);Box edts = createEdts(track, movie);
        __CLR4_5_251i51ilvl9egzz.R.inc(7070);if ((((edts != null)&&(__CLR4_5_251i51ilvl9egzz.R.iget(7071)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(7072)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(7073);trackBox.addBox(edts);
        }
        }__CLR4_5_251i51ilvl9egzz.R.inc(7074);trackBox.addBox(createMdia(track, movie));
        __CLR4_5_251i51ilvl9egzz.R.inc(7075);return trackBox;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected Box createEdts(Track track, Movie movie) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7076);
        __CLR4_5_251i51ilvl9egzz.R.inc(7077);if ((((track.getEdits() != null && track.getEdits().size() > 0)&&(__CLR4_5_251i51ilvl9egzz.R.iget(7078)!=0|true))||(__CLR4_5_251i51ilvl9egzz.R.iget(7079)==0&false))) {{
            __CLR4_5_251i51ilvl9egzz.R.inc(7080);EditListBox elst = new EditListBox();
            __CLR4_5_251i51ilvl9egzz.R.inc(7081);elst.setVersion(1);
            __CLR4_5_251i51ilvl9egzz.R.inc(7082);List<EditListBox.Entry> entries = new ArrayList<EditListBox.Entry>();

            __CLR4_5_251i51ilvl9egzz.R.inc(7083);for (Edit edit : track.getEdits()) {{
                __CLR4_5_251i51ilvl9egzz.R.inc(7084);entries.add(new EditListBox.Entry(elst,
                        Math.round(edit.getSegmentDuration() * movie.getTimescale()),
                        edit.getMediaTime() * track.getTrackMetaData().getTimescale() / edit.getTimeScale(),
                        edit.getMediaRate()));
            }

            }__CLR4_5_251i51ilvl9egzz.R.inc(7085);elst.setEntries(entries);
            __CLR4_5_251i51ilvl9egzz.R.inc(7086);EditBox edts = new EditBox();
            __CLR4_5_251i51ilvl9egzz.R.inc(7087);edts.addBox(elst);
            __CLR4_5_251i51ilvl9egzz.R.inc(7088);return edts;
        } }else {{
            __CLR4_5_251i51ilvl9egzz.R.inc(7089);return null;
        }
    }}finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    protected DataInformationBox createDinf(Movie movie, Track track) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7090);
        __CLR4_5_251i51ilvl9egzz.R.inc(7091);DataInformationBox dinf = new DataInformationBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(7092);DataReferenceBox dref = new DataReferenceBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(7093);dinf.addBox(dref);
        __CLR4_5_251i51ilvl9egzz.R.inc(7094);DataEntryUrlBox url = new DataEntryUrlBox();
        __CLR4_5_251i51ilvl9egzz.R.inc(7095);url.setFlags(1);
        __CLR4_5_251i51ilvl9egzz.R.inc(7096);dref.addBox(url);
        __CLR4_5_251i51ilvl9egzz.R.inc(7097);return dinf;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    public Fragmenter getFragmenter() {try{__CLR4_5_251i51ilvl9egzz.R.inc(7098);
        __CLR4_5_251i51ilvl9egzz.R.inc(7099);return fragmenter;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}

    public void setFragmenter(Fragmenter fragmenter) {try{__CLR4_5_251i51ilvl9egzz.R.inc(7100);
        __CLR4_5_251i51ilvl9egzz.R.inc(7101);this.fragmenter = fragmenter;
    }finally{__CLR4_5_251i51ilvl9egzz.R.flushNeeded();}}


}
