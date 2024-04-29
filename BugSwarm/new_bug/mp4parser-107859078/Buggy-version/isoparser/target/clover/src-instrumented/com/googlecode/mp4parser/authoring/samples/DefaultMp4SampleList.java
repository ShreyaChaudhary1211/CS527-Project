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


public class DefaultMp4SampleList extends AbstractList<Sample> {public static class __CLR4_5_25n35n3lvl9eh6b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,7455,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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


    public DefaultMp4SampleList(long track, Container topLevel) {try{__CLR4_5_25n35n3lvl9eh6b.R.inc(7311);
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7312);this.topLevel = topLevel;
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7313);MovieBox movieBox = topLevel.getBoxes(MovieBox.class).get(0);
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7314);List<TrackBox> trackBoxes = movieBox.getBoxes(TrackBox.class);

        __CLR4_5_25n35n3lvl9eh6b.R.inc(7315);for (TrackBox tb : trackBoxes) {{
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7316);if ((((tb.getTrackHeaderBox().getTrackId() == track)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7317)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7318)==0&false))) {{
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7319);trackBox = tb;
            }
        }}
        }__CLR4_5_25n35n3lvl9eh6b.R.inc(7320);if ((((trackBox == null)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7321)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7322)==0&false))) {{
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7323);throw new RuntimeException("This MP4 does not contain track " + track);
        }
        }__CLR4_5_25n35n3lvl9eh6b.R.inc(7324);chunkOffsets = trackBox.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7325);chunkSizes = new long[chunkOffsets.length];

        __CLR4_5_25n35n3lvl9eh6b.R.inc(7326);cache = new SoftReference[chunkOffsets.length];
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7327);Arrays.fill(cache, new SoftReference<ByteBuffer>(null));

        __CLR4_5_25n35n3lvl9eh6b.R.inc(7328);sampleOffsetsWithinChunks = new long[chunkOffsets.length][];
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7329);ssb = trackBox.getSampleTableBox().getSampleSizeBox();
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7330);List<SampleToChunkBox.Entry> s2chunkEntries = trackBox.getSampleTableBox().getSampleToChunkBox().getEntries();
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7331);SampleToChunkBox.Entry[] entries = s2chunkEntries.toArray(new SampleToChunkBox.Entry[s2chunkEntries.size()]);


        __CLR4_5_25n35n3lvl9eh6b.R.inc(7332);int s2cIndex = 0;
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7333);SampleToChunkBox.Entry next = entries[s2cIndex++];
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7334);int currentChunkNo = 0;
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7335);int currentSamplePerChunk = 0;

        __CLR4_5_25n35n3lvl9eh6b.R.inc(7336);long nextFirstChunk = next.getFirstChunk();
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7337);int nextSamplePerChunk = l2i(next.getSamplesPerChunk());

        __CLR4_5_25n35n3lvl9eh6b.R.inc(7338);int currentSampleNo = 1;
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7339);int lastSampleNo = size();


        __CLR4_5_25n35n3lvl9eh6b.R.inc(7340);do {{

            __CLR4_5_25n35n3lvl9eh6b.R.inc(7341);currentChunkNo++;
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7342);if ((((currentChunkNo == nextFirstChunk)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7343)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7344)==0&false))) {{
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7345);currentSamplePerChunk = nextSamplePerChunk;
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7346);if ((((entries.length > s2cIndex)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7347)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7348)==0&false))) {{
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7349);next = entries[s2cIndex++];
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7350);nextSamplePerChunk = l2i(next.getSamplesPerChunk());
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7351);nextFirstChunk = next.getFirstChunk();
                } }else {{
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7352);nextSamplePerChunk = -1;
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7353);nextFirstChunk = Long.MAX_VALUE;
                }
            }}
            }__CLR4_5_25n35n3lvl9eh6b.R.inc(7354);sampleOffsetsWithinChunks[currentChunkNo - 1] = new long[currentSamplePerChunk];

        } }while (((((currentSampleNo += currentSamplePerChunk) <= lastSampleNo)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7355)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7356)==0&false)));
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7357);chunkNumsStartSampleNum = new int[currentChunkNo + 1];
        // reset of algorithm
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7358);s2cIndex = 0;
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7359);next = entries[s2cIndex++];
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7360);currentChunkNo = 0;
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7361);currentSamplePerChunk = 0;

        __CLR4_5_25n35n3lvl9eh6b.R.inc(7362);nextFirstChunk = next.getFirstChunk();
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7363);nextSamplePerChunk = l2i(next.getSamplesPerChunk());

        __CLR4_5_25n35n3lvl9eh6b.R.inc(7364);currentSampleNo = 1;
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7365);do {{
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7366);chunkNumsStartSampleNum[currentChunkNo++] = currentSampleNo;
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7367);if ((((currentChunkNo == nextFirstChunk)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7368)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7369)==0&false))) {{
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7370);currentSamplePerChunk = nextSamplePerChunk;
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7371);if ((((entries.length > s2cIndex)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7372)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7373)==0&false))) {{
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7374);next = entries[s2cIndex++];
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7375);nextSamplePerChunk = l2i(next.getSamplesPerChunk());
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7376);nextFirstChunk = next.getFirstChunk();
                } }else {{
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7377);nextSamplePerChunk = -1;
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7378);nextFirstChunk = Long.MAX_VALUE;
                }
            }}

        }} }while (((((currentSampleNo += currentSamplePerChunk) <= lastSampleNo)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7379)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7380)==0&false)));
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7381);chunkNumsStartSampleNum[currentChunkNo] = Integer.MAX_VALUE;

        __CLR4_5_25n35n3lvl9eh6b.R.inc(7382);currentChunkNo = 0;
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7383);long sampleSum = 0;
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7384);for (int i = 1; (((i <= ssb.getSampleCount())&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7385)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7386)==0&false)); i++) {{
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7387);while ((((i == chunkNumsStartSampleNum[currentChunkNo])&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7388)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7389)==0&false))) {{
                // you might think that an if statement is enough but unfortunately you might as well declare chunks without any samples!
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7390);currentChunkNo++;
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7391);sampleSum = 0;
            }
            }__CLR4_5_25n35n3lvl9eh6b.R.inc(7392);chunkSizes[currentChunkNo - 1] += ssb.getSampleSizeAtIndex(i - 1);
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7393);long[] sampleOffsetsWithinChunkscurrentChunkNo = sampleOffsetsWithinChunks[currentChunkNo - 1];
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7394);int chunkNumsStartSampleNumcurrentChunkNo = chunkNumsStartSampleNum[currentChunkNo - 1];
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7395);sampleOffsetsWithinChunkscurrentChunkNo[i - chunkNumsStartSampleNumcurrentChunkNo] = sampleSum;
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7396);sampleSum += ssb.getSampleSizeAtIndex(i - 1);
        }

    }}finally{__CLR4_5_25n35n3lvl9eh6b.R.flushNeeded();}}

    synchronized int getChunkForSample(int index) {try{__CLR4_5_25n35n3lvl9eh6b.R.inc(7397);
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7398);int sampleNum = index + 1;
        // we always look for the next chunk in the last one to make linear access fast
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7399);if ((((sampleNum >= chunkNumsStartSampleNum[lastChunk] && sampleNum < chunkNumsStartSampleNum[lastChunk + 1])&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7400)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7401)==0&false))) {{
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7402);return lastChunk;
        } }else {__CLR4_5_25n35n3lvl9eh6b.R.inc(7403);if ((((sampleNum < chunkNumsStartSampleNum[lastChunk])&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7404)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7405)==0&false))) {{
            // we could search backwards but i don't believe there is much backward linear access
            // I'd then rather suspect a start from scratch
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7406);lastChunk = 0;

            __CLR4_5_25n35n3lvl9eh6b.R.inc(7407);while ((((chunkNumsStartSampleNum[lastChunk + 1] <= sampleNum)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7408)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7409)==0&false))) {{
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7410);lastChunk++;
            }
            }__CLR4_5_25n35n3lvl9eh6b.R.inc(7411);return lastChunk;

        } }else {{
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7412);lastChunk += 1;

            __CLR4_5_25n35n3lvl9eh6b.R.inc(7413);while ((((chunkNumsStartSampleNum[lastChunk + 1] <= sampleNum)&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7414)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7415)==0&false))) {{
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7416);lastChunk++;
            }
            }__CLR4_5_25n35n3lvl9eh6b.R.inc(7417);return lastChunk;
        }

    }}}finally{__CLR4_5_25n35n3lvl9eh6b.R.flushNeeded();}}

    @Override
    public Sample get(final int index) {try{__CLR4_5_25n35n3lvl9eh6b.R.inc(7418);
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7419);if ((((index >= ssb.getSampleCount())&&(__CLR4_5_25n35n3lvl9eh6b.R.iget(7420)!=0|true))||(__CLR4_5_25n35n3lvl9eh6b.R.iget(7421)==0&false))) {{
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7422);throw new IndexOutOfBoundsException();
        }
        }__CLR4_5_25n35n3lvl9eh6b.R.inc(7423);return new SampleImpl(index);
    }finally{__CLR4_5_25n35n3lvl9eh6b.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_25n35n3lvl9eh6b.R.inc(7424);
        __CLR4_5_25n35n3lvl9eh6b.R.inc(7425);return l2i(trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }finally{__CLR4_5_25n35n3lvl9eh6b.R.flushNeeded();}}

    class SampleImpl implements Sample {

        private int index;

        public SampleImpl(int index) {try{__CLR4_5_25n35n3lvl9eh6b.R.inc(7426);
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7427);this.index = index;
        }finally{__CLR4_5_25n35n3lvl9eh6b.R.flushNeeded();}}

        public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_25n35n3lvl9eh6b.R.inc(7428);
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7429);channel.write(asByteBuffer());
        }finally{__CLR4_5_25n35n3lvl9eh6b.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_25n35n3lvl9eh6b.R.inc(7430);
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7431);return ssb.getSampleSizeAtIndex(index);
        }finally{__CLR4_5_25n35n3lvl9eh6b.R.flushNeeded();}}

        public synchronized ByteBuffer asByteBuffer() {try{__CLR4_5_25n35n3lvl9eh6b.R.inc(7432);
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7433);ByteBuffer b;

            __CLR4_5_25n35n3lvl9eh6b.R.inc(7434);final int chunkNumber = getChunkForSample(index);
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7435);SoftReference<ByteBuffer> chunkBufferSr = cache[chunkNumber];

            __CLR4_5_25n35n3lvl9eh6b.R.inc(7436);final int chunkStartSample = chunkNumsStartSampleNum[chunkNumber] - 1;

            __CLR4_5_25n35n3lvl9eh6b.R.inc(7437);int sampleInChunk = index - chunkStartSample;
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7438);long[] sampleOffsetsWithinChunk = sampleOffsetsWithinChunks[l2i(chunkNumber)];
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7439);long offsetWithInChunk = sampleOffsetsWithinChunk[sampleInChunk];

            __CLR4_5_25n35n3lvl9eh6b.R.inc(7440);ByteBuffer chunkBuffer;
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7441);if (chunkBufferSr == null || (chunkBuffer = chunkBufferSr.get()) == null) {{
                __CLR4_5_25n35n3lvl9eh6b.R.inc(7444);try {

                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7445);chunkBuffer = topLevel.getByteBuffer(
                            chunkOffsets[l2i(chunkNumber)],
                            sampleOffsetsWithinChunk[sampleOffsetsWithinChunk.length - 1] + ssb.getSampleSizeAtIndex(chunkStartSample + sampleOffsetsWithinChunk.length - 1)
                    );
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7446);cache[chunkNumber] = new SoftReference<ByteBuffer>(chunkBuffer);
                } catch (IOException e) {
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7447);StringWriter sw = new StringWriter();
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7448);e.printStackTrace(new PrintWriter(sw));
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7449);LOG.logError(sw.toString());
                    __CLR4_5_25n35n3lvl9eh6b.R.inc(7450);throw new IndexOutOfBoundsException(e.getMessage());
                }
            }
            }__CLR4_5_25n35n3lvl9eh6b.R.inc(7451);b = (ByteBuffer) ((ByteBuffer) chunkBuffer.duplicate().position(l2i(offsetWithInChunk))).slice().limit(l2i(ssb.getSampleSizeAtIndex(index)));
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7452);return b;
        }finally{__CLR4_5_25n35n3lvl9eh6b.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_25n35n3lvl9eh6b.R.inc(7453);
            __CLR4_5_25n35n3lvl9eh6b.R.inc(7454);return "Sample(index: " + index + " size: " + ssb.getSampleSizeAtIndex(index) + ")";
        }finally{__CLR4_5_25n35n3lvl9eh6b.R.flushNeeded();}}
    }

    ;

}
