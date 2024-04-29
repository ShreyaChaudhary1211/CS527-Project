/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Bundles common functionality and parsing patterns of NAL based formats such as H264(AVC) and H265 (HEVC).
 */
public abstract class AbstractH26XTrack extends AbstractTrack {public static class __CLR4_5_26dr6drlvl9ei1s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,8368,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static int BUFFER = 65535 << 10;
    private DataSource dataSource;


    protected long[] decodingTimes;
    protected List<CompositionTimeToSample.Entry> ctts = new ArrayList<CompositionTimeToSample.Entry>();
    protected List<SampleDependencyTypeBox.Entry> sdtp = new ArrayList<SampleDependencyTypeBox.Entry>();
    protected List<Integer> stss = new ArrayList<Integer>();
    protected TrackMetaData trackMetaData = new TrackMetaData();

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8271);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8272);return trackMetaData;
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

    boolean tripleZeroIsEndOfSequence = true;

    public AbstractH26XTrack(DataSource dataSource, boolean tripleZeroIsEndOfSequence) {

        super(dataSource.toString());__CLR4_5_26dr6drlvl9ei1s.R.inc(8274);try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8273);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8275);this.dataSource = dataSource;
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8276);this.tripleZeroIsEndOfSequence = tripleZeroIsEndOfSequence;
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

    public AbstractH26XTrack(DataSource dataSource) {
        this(dataSource, true);__CLR4_5_26dr6drlvl9ei1s.R.inc(8278);try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8277);
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

    public static class LookAhead {
        long bufferStartPos = 0;
        int inBufferPos = 0;
        DataSource dataSource;
        ByteBuffer buffer;

        long start;

        public void fillBuffer() throws IOException {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8279);
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8280);buffer = dataSource.map(bufferStartPos, Math.min(dataSource.size() - bufferStartPos, BUFFER));
        }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}


        public LookAhead(DataSource dataSource) throws IOException {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8281);
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8282);this.dataSource = dataSource;
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8283);fillBuffer();
        }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

        public boolean nextThreeEquals001() throws IOException {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8284);
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8285);if ((((buffer.limit() - inBufferPos >= 3)&&(__CLR4_5_26dr6drlvl9ei1s.R.iget(8286)!=0|true))||(__CLR4_5_26dr6drlvl9ei1s.R.iget(8287)==0&false))) {{
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8288);return (buffer.get(inBufferPos) == 0 &&
                        buffer.get(inBufferPos + 1) == 0 &&
                        buffer.get(inBufferPos + 2) == 1);
            }
            }__CLR4_5_26dr6drlvl9ei1s.R.inc(8289);if ((((bufferStartPos + inBufferPos + 3 >= dataSource.size())&&(__CLR4_5_26dr6drlvl9ei1s.R.iget(8290)!=0|true))||(__CLR4_5_26dr6drlvl9ei1s.R.iget(8291)==0&false))) {{
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8292);throw new EOFException();
            }
            }__CLR4_5_26dr6drlvl9ei1s.R.inc(8293);return false;
        }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

        public boolean nextThreeEquals000or001orEof(boolean tripleZeroIsEndOfSequence) throws IOException {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8294);
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8295);if ((((buffer.limit() - inBufferPos >= 3)&&(__CLR4_5_26dr6drlvl9ei1s.R.iget(8296)!=0|true))||(__CLR4_5_26dr6drlvl9ei1s.R.iget(8297)==0&false))) {{
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8298);return ((buffer.get(inBufferPos) == 0 &&
                        buffer.get(inBufferPos + 1) == 0 &&
                        ((buffer.get(inBufferPos + 2) == 0 && tripleZeroIsEndOfSequence) || buffer.get(inBufferPos + 2) == 1)));
            } }else {{
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8299);if ((((bufferStartPos + inBufferPos + 3 > dataSource.size())&&(__CLR4_5_26dr6drlvl9ei1s.R.iget(8300)!=0|true))||(__CLR4_5_26dr6drlvl9ei1s.R.iget(8301)==0&false))) {{
                    __CLR4_5_26dr6drlvl9ei1s.R.inc(8302);return bufferStartPos + inBufferPos == dataSource.size();
                } }else {{
                    __CLR4_5_26dr6drlvl9ei1s.R.inc(8303);bufferStartPos = start;
                    __CLR4_5_26dr6drlvl9ei1s.R.inc(8304);inBufferPos = 0;
                    __CLR4_5_26dr6drlvl9ei1s.R.inc(8305);fillBuffer();
                    __CLR4_5_26dr6drlvl9ei1s.R.inc(8306);return nextThreeEquals000or001orEof(tripleZeroIsEndOfSequence);
                }
            }}
        }}finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

        public void discardByte() {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8307);
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8308);inBufferPos++;
        }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

        public void discardNext3AndMarkStart() {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8309);
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8310);inBufferPos += 3;
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8311);start = bufferStartPos + inBufferPos;
        }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

        public ByteBuffer getNal() {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8312);
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8313);if ((((start >= bufferStartPos)&&(__CLR4_5_26dr6drlvl9ei1s.R.iget(8314)!=0|true))||(__CLR4_5_26dr6drlvl9ei1s.R.iget(8315)==0&false))) {{

                __CLR4_5_26dr6drlvl9ei1s.R.inc(8316);buffer.position((int) (start - bufferStartPos));
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8317);Buffer sample = buffer.slice();
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8318);sample.limit((int) (inBufferPos - (start - bufferStartPos)));
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8319);return (ByteBuffer) sample;
            } }else {{
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8320);throw new RuntimeException("damn! NAL exceeds buffer");
                // this can only happen if NAL is bigger than the buffer
                // and that most likely cannot happen with correct inputs
            }

        }}finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}
    }

    protected ByteBuffer findNextNal(LookAhead la) throws IOException {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8321);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8322);try {
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8323);while ((((!la.nextThreeEquals001())&&(__CLR4_5_26dr6drlvl9ei1s.R.iget(8324)!=0|true))||(__CLR4_5_26dr6drlvl9ei1s.R.iget(8325)==0&false))) {{
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8326);la.discardByte();
            }
            }__CLR4_5_26dr6drlvl9ei1s.R.inc(8327);la.discardNext3AndMarkStart();

            __CLR4_5_26dr6drlvl9ei1s.R.inc(8328);while ((((!la.nextThreeEquals000or001orEof(tripleZeroIsEndOfSequence))&&(__CLR4_5_26dr6drlvl9ei1s.R.iget(8329)!=0|true))||(__CLR4_5_26dr6drlvl9ei1s.R.iget(8330)==0&false))) {{
                __CLR4_5_26dr6drlvl9ei1s.R.inc(8331);la.discardByte();
            }
            }__CLR4_5_26dr6drlvl9ei1s.R.inc(8332);return la.getNal();
        } catch (EOFException e) {
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8333);return null;
        }
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}


    /**
     * Builds an MP4 sample from a list of NALs. Each NAL will be preceded by its
     * 4 byte (unit32) length.
     *
     * @param nals a list of NALs that form the sample
     * @return sample as it appears in the MP4 file
     */
    protected Sample createSampleObject(List<? extends ByteBuffer> nals) {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8334);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8335);byte[] sizeInfo = new byte[nals.size() * 4];
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8336);ByteBuffer sizeBuf = ByteBuffer.wrap(sizeInfo);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8337);for (ByteBuffer b : nals) {{
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8338);sizeBuf.putInt(b.remaining());
        }

        }__CLR4_5_26dr6drlvl9ei1s.R.inc(8339);ByteBuffer[] data = new ByteBuffer[nals.size() * 2];

        __CLR4_5_26dr6drlvl9ei1s.R.inc(8340);for (int i = 0; (((i < nals.size())&&(__CLR4_5_26dr6drlvl9ei1s.R.iget(8341)!=0|true))||(__CLR4_5_26dr6drlvl9ei1s.R.iget(8342)==0&false)); i++) {{
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8343);data[2 * i] = ByteBuffer.wrap(sizeInfo, i * 4, 4);
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8344);data[2 * i + 1] = nals.get(i);
        }

        }__CLR4_5_26dr6drlvl9ei1s.R.inc(8345);return new SampleImpl(data);
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8346);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8347);return decodingTimes;
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8348);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8349);return ctts;
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8350);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8351);long[] returns = new long[stss.size()];
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8352);for (int i = 0; (((i < stss.size())&&(__CLR4_5_26dr6drlvl9ei1s.R.iget(8353)!=0|true))||(__CLR4_5_26dr6drlvl9ei1s.R.iget(8354)==0&false)); i++) {{
            __CLR4_5_26dr6drlvl9ei1s.R.inc(8355);returns[i] = stss.get(i);
        }
        }__CLR4_5_26dr6drlvl9ei1s.R.inc(8356);return returns;
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8357);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8358);return sdtp;
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}


    protected static InputStream cleanBuffer(InputStream is) {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8359);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8360);return new CleanInputStream(is);
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

    protected static byte[] toArray(ByteBuffer buf) {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8361);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8362);buf = buf.duplicate();
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8363);byte[] b = new byte[buf.remaining()];
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8364);buf.get(b, 0, b.length);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8365);return b;
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_26dr6drlvl9ei1s.R.inc(8366);
        __CLR4_5_26dr6drlvl9ei1s.R.inc(8367);dataSource.close();
    }finally{__CLR4_5_26dr6drlvl9ei1s.R.flushNeeded();}}
}