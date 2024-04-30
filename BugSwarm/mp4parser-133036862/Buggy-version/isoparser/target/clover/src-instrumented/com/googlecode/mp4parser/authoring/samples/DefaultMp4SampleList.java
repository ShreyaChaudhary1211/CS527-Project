/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.boxes.*;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.Logger;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;


public class DefaultMp4SampleList extends AbstractList<Sample> {public static class __CLR4_5_25pq5pqlvlulfuh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,7550,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Logger LOG = Logger.getLogger(DefaultMp4SampleList.class);

    Container topLevel;
    TrackBox trackBox = null;
    SoftReference<ByteBuffer>[] cache = null;
    int[] chunkNumsStartSampleNum;
    long[] chunkOffsets;
    long[] chunkSizes;
    long[][] sampleOffsetsWithinChunks;
    SampleSizeBox ssb;
    int lastChunk = 0;


    public DefaultMp4SampleList(long track, Container topLevel) {try{__CLR4_5_25pq5pqlvlulfuh.R.inc(7406);
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7407);this.topLevel = topLevel;
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7408);MovieBox movieBox = topLevel.getBoxes(MovieBox.class).get(0);
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7409);List<TrackBox> trackBoxes = movieBox.getBoxes(TrackBox.class);

        __CLR4_5_25pq5pqlvlulfuh.R.inc(7410);for (TrackBox tb : trackBoxes) {{
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7411);if ((((tb.getTrackHeaderBox().getTrackId() == track)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7412)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7413)==0&false))) {{
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7414);trackBox = tb;
            }
        }}
        }__CLR4_5_25pq5pqlvlulfuh.R.inc(7415);if ((((trackBox == null)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7416)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7417)==0&false))) {{
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7418);throw new RuntimeException("This MP4 does not contain track " + track);
        }
        }__CLR4_5_25pq5pqlvlulfuh.R.inc(7419);chunkOffsets = trackBox.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7420);chunkSizes = new long[chunkOffsets.length];

        __CLR4_5_25pq5pqlvlulfuh.R.inc(7421);cache = new SoftReference[chunkOffsets.length];
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7422);Arrays.fill(cache, new SoftReference<ByteBuffer>(null));

        __CLR4_5_25pq5pqlvlulfuh.R.inc(7423);sampleOffsetsWithinChunks = new long[chunkOffsets.length][];
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7424);ssb = trackBox.getSampleTableBox().getSampleSizeBox();
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7425);List<SampleToChunkBox.Entry> s2chunkEntries = trackBox.getSampleTableBox().getSampleToChunkBox().getEntries();
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7426);SampleToChunkBox.Entry[] entries = s2chunkEntries.toArray(new SampleToChunkBox.Entry[s2chunkEntries.size()]);


        __CLR4_5_25pq5pqlvlulfuh.R.inc(7427);int s2cIndex = 0;
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7428);SampleToChunkBox.Entry next = entries[s2cIndex++];
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7429);int currentChunkNo = 0;
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7430);int currentSamplePerChunk = 0;

        __CLR4_5_25pq5pqlvlulfuh.R.inc(7431);long nextFirstChunk = next.getFirstChunk();
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7432);int nextSamplePerChunk = l2i(next.getSamplesPerChunk());

        __CLR4_5_25pq5pqlvlulfuh.R.inc(7433);int currentSampleNo = 1;
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7434);int lastSampleNo = size();


        __CLR4_5_25pq5pqlvlulfuh.R.inc(7435);do {{

            __CLR4_5_25pq5pqlvlulfuh.R.inc(7436);currentChunkNo++;
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7437);if ((((currentChunkNo == nextFirstChunk)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7438)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7439)==0&false))) {{
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7440);currentSamplePerChunk = nextSamplePerChunk;
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7441);if ((((entries.length > s2cIndex)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7442)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7443)==0&false))) {{
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7444);next = entries[s2cIndex++];
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7445);nextSamplePerChunk = l2i(next.getSamplesPerChunk());
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7446);nextFirstChunk = next.getFirstChunk();
                } }else {{
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7447);nextSamplePerChunk = -1;
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7448);nextFirstChunk = Long.MAX_VALUE;
                }
            }}
            }__CLR4_5_25pq5pqlvlulfuh.R.inc(7449);sampleOffsetsWithinChunks[currentChunkNo - 1] = new long[currentSamplePerChunk];

        } }while (((((currentSampleNo += currentSamplePerChunk) <= lastSampleNo)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7450)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7451)==0&false)));
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7452);chunkNumsStartSampleNum = new int[currentChunkNo + 1];
        // reset of algorithm
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7453);s2cIndex = 0;
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7454);next = entries[s2cIndex++];
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7455);currentChunkNo = 0;
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7456);currentSamplePerChunk = 0;

        __CLR4_5_25pq5pqlvlulfuh.R.inc(7457);nextFirstChunk = next.getFirstChunk();
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7458);nextSamplePerChunk = l2i(next.getSamplesPerChunk());

        __CLR4_5_25pq5pqlvlulfuh.R.inc(7459);currentSampleNo = 1;
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7460);do {{
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7461);chunkNumsStartSampleNum[currentChunkNo++] = currentSampleNo;
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7462);if ((((currentChunkNo == nextFirstChunk)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7463)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7464)==0&false))) {{
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7465);currentSamplePerChunk = nextSamplePerChunk;
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7466);if ((((entries.length > s2cIndex)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7467)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7468)==0&false))) {{
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7469);next = entries[s2cIndex++];
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7470);nextSamplePerChunk = l2i(next.getSamplesPerChunk());
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7471);nextFirstChunk = next.getFirstChunk();
                } }else {{
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7472);nextSamplePerChunk = -1;
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7473);nextFirstChunk = Long.MAX_VALUE;
                }
            }}

        }} }while (((((currentSampleNo += currentSamplePerChunk) <= lastSampleNo)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7474)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7475)==0&false)));
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7476);chunkNumsStartSampleNum[currentChunkNo] = Integer.MAX_VALUE;

        __CLR4_5_25pq5pqlvlulfuh.R.inc(7477);currentChunkNo = 0;
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7478);long sampleSum = 0;
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7479);for (int i = 1; (((i <= ssb.getSampleCount())&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7480)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7481)==0&false)); i++) {{
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7482);while ((((i == chunkNumsStartSampleNum[currentChunkNo])&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7483)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7484)==0&false))) {{
                // you might think that an if statement is enough but unfortunately you might as well declare chunks without any samples!
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7485);currentChunkNo++;
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7486);sampleSum = 0;
            }
            }__CLR4_5_25pq5pqlvlulfuh.R.inc(7487);chunkSizes[currentChunkNo - 1] += ssb.getSampleSizeAtIndex(i - 1);
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7488);long[] sampleOffsetsWithinChunkscurrentChunkNo = sampleOffsetsWithinChunks[currentChunkNo - 1];
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7489);int chunkNumsStartSampleNumcurrentChunkNo = chunkNumsStartSampleNum[currentChunkNo - 1];
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7490);sampleOffsetsWithinChunkscurrentChunkNo[i - chunkNumsStartSampleNumcurrentChunkNo] = sampleSum;
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7491);sampleSum += ssb.getSampleSizeAtIndex(i - 1);
        }

    }}finally{__CLR4_5_25pq5pqlvlulfuh.R.flushNeeded();}}

    synchronized int getChunkForSample(int index) {try{__CLR4_5_25pq5pqlvlulfuh.R.inc(7492);
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7493);int sampleNum = index + 1;
        // we always look for the next chunk in the last one to make linear access fast
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7494);if ((((sampleNum >= chunkNumsStartSampleNum[lastChunk] && sampleNum < chunkNumsStartSampleNum[lastChunk + 1])&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7495)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7496)==0&false))) {{
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7497);return lastChunk;
        } }else {__CLR4_5_25pq5pqlvlulfuh.R.inc(7498);if ((((sampleNum < chunkNumsStartSampleNum[lastChunk])&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7499)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7500)==0&false))) {{
            // we could search backwards but i don't believe there is much backward linear access
            // I'd then rather suspect a start from scratch
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7501);lastChunk = 0;

            __CLR4_5_25pq5pqlvlulfuh.R.inc(7502);while ((((chunkNumsStartSampleNum[lastChunk + 1] <= sampleNum)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7503)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7504)==0&false))) {{
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7505);lastChunk++;
            }
            }__CLR4_5_25pq5pqlvlulfuh.R.inc(7506);return lastChunk;

        } }else {{
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7507);lastChunk += 1;

            __CLR4_5_25pq5pqlvlulfuh.R.inc(7508);while ((((chunkNumsStartSampleNum[lastChunk + 1] <= sampleNum)&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7509)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7510)==0&false))) {{
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7511);lastChunk++;
            }
            }__CLR4_5_25pq5pqlvlulfuh.R.inc(7512);return lastChunk;
        }

    }}}finally{__CLR4_5_25pq5pqlvlulfuh.R.flushNeeded();}}

    @Override
    public Sample get(final int index) {try{__CLR4_5_25pq5pqlvlulfuh.R.inc(7513);
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7514);if ((((index >= ssb.getSampleCount())&&(__CLR4_5_25pq5pqlvlulfuh.R.iget(7515)!=0|true))||(__CLR4_5_25pq5pqlvlulfuh.R.iget(7516)==0&false))) {{
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7517);throw new IndexOutOfBoundsException();
        }
        }__CLR4_5_25pq5pqlvlulfuh.R.inc(7518);return new SampleImpl(index);
    }finally{__CLR4_5_25pq5pqlvlulfuh.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_25pq5pqlvlulfuh.R.inc(7519);
        __CLR4_5_25pq5pqlvlulfuh.R.inc(7520);return l2i(trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }finally{__CLR4_5_25pq5pqlvlulfuh.R.flushNeeded();}}

    class SampleImpl implements Sample {

        private int index;

        public SampleImpl(int index) {try{__CLR4_5_25pq5pqlvlulfuh.R.inc(7521);
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7522);this.index = index;
        }finally{__CLR4_5_25pq5pqlvlulfuh.R.flushNeeded();}}

        public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_25pq5pqlvlulfuh.R.inc(7523);
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7524);channel.write(asByteBuffer());
        }finally{__CLR4_5_25pq5pqlvlulfuh.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_25pq5pqlvlulfuh.R.inc(7525);
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7526);return ssb.getSampleSizeAtIndex(index);
        }finally{__CLR4_5_25pq5pqlvlulfuh.R.flushNeeded();}}

        public synchronized ByteBuffer asByteBuffer() {try{__CLR4_5_25pq5pqlvlulfuh.R.inc(7527);
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7528);ByteBuffer b;

            __CLR4_5_25pq5pqlvlulfuh.R.inc(7529);final int chunkNumber = getChunkForSample(index);
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7530);SoftReference<ByteBuffer> chunkBufferSr = cache[chunkNumber];

            __CLR4_5_25pq5pqlvlulfuh.R.inc(7531);final int chunkStartSample = chunkNumsStartSampleNum[chunkNumber] - 1;

            __CLR4_5_25pq5pqlvlulfuh.R.inc(7532);int sampleInChunk = index - chunkStartSample;
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7533);long[] sampleOffsetsWithinChunk = sampleOffsetsWithinChunks[l2i(chunkNumber)];
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7534);long offsetWithInChunk = sampleOffsetsWithinChunk[sampleInChunk];

            __CLR4_5_25pq5pqlvlulfuh.R.inc(7535);ByteBuffer chunkBuffer;
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7536);if (chunkBufferSr == null || (chunkBuffer = chunkBufferSr.get()) == null) {{
                __CLR4_5_25pq5pqlvlulfuh.R.inc(7539);try {

                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7540);chunkBuffer = topLevel.getByteBuffer(
                            chunkOffsets[l2i(chunkNumber)],
                            sampleOffsetsWithinChunk[sampleOffsetsWithinChunk.length - 1] + ssb.getSampleSizeAtIndex(chunkStartSample + sampleOffsetsWithinChunk.length - 1)
                    );
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7541);cache[chunkNumber] = new SoftReference<ByteBuffer>(chunkBuffer);
                } catch (IOException e) {
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7542);StringWriter sw = new StringWriter();
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7543);e.printStackTrace(new PrintWriter(sw));
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7544);LOG.logError(sw.toString());
                    __CLR4_5_25pq5pqlvlulfuh.R.inc(7545);throw new IndexOutOfBoundsException(e.getMessage());
                }
            }
            }__CLR4_5_25pq5pqlvlulfuh.R.inc(7546);b = (ByteBuffer) ((ByteBuffer) chunkBuffer.duplicate().position(l2i(offsetWithInChunk))).slice().limit(l2i(ssb.getSampleSizeAtIndex(index)));
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7547);return b;
        }finally{__CLR4_5_25pq5pqlvlulfuh.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_25pq5pqlvlulfuh.R.inc(7548);
            __CLR4_5_25pq5pqlvlulfuh.R.inc(7549);return "Sample(index: " + index + " size: " + ssb.getSampleSizeAtIndex(index) + ")";
        }finally{__CLR4_5_25pq5pqlvlulfuh.R.flushNeeded();}}
    }

    ;

}
