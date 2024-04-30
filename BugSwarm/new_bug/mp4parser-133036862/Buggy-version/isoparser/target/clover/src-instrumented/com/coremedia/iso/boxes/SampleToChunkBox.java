/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
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

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Samples within the media data are grouped into chunks. Chunks can be of different sizes, and the
 * samples within a chunk can have different sizes. This table can be used to find the chunk that
 * contains a sample, its position, and the associated sample description. Defined in ISO/IEC 14496-12.
 */
public class SampleToChunkBox extends AbstractFullBox {public static class __CLR4_5_21qa1qalvlulbxa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,2330,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    List<Entry> entries = Collections.emptyList();

    public static final String TYPE = "stsc";

    public SampleToChunkBox() {
        super(TYPE);__CLR4_5_21qa1qalvlulbxa.R.inc(2243);try{__CLR4_5_21qa1qalvlulbxa.R.inc(2242);
    }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2244);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2245);return entries;
    }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2246);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2247);this.entries = entries;
    }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2248);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2249);return entries.size() * 12 + 8;
    }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2250);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2251);parseVersionAndFlags(content);

        __CLR4_5_21qa1qalvlulbxa.R.inc(2252);int entryCount = l2i(IsoTypeReader.readUInt32(content));
        __CLR4_5_21qa1qalvlulbxa.R.inc(2253);entries = new ArrayList<Entry>(entryCount);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2254);for (int i = 0; (((i < entryCount)&&(__CLR4_5_21qa1qalvlulbxa.R.iget(2255)!=0|true))||(__CLR4_5_21qa1qalvlulbxa.R.iget(2256)==0&false)); i++) {{
            __CLR4_5_21qa1qalvlulbxa.R.inc(2257);entries.add(new Entry(
                    IsoTypeReader.readUInt32(content),
                    IsoTypeReader.readUInt32(content),
                    IsoTypeReader.readUInt32(content)));
        }
    }}finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2258);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2259);writeVersionAndFlags(byteBuffer);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2260);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());
        __CLR4_5_21qa1qalvlulbxa.R.inc(2261);for (Entry entry : entries) {{
            __CLR4_5_21qa1qalvlulbxa.R.inc(2262);IsoTypeWriter.writeUInt32(byteBuffer, entry.getFirstChunk());
            __CLR4_5_21qa1qalvlulbxa.R.inc(2263);IsoTypeWriter.writeUInt32(byteBuffer, entry.getSamplesPerChunk());
            __CLR4_5_21qa1qalvlulbxa.R.inc(2264);IsoTypeWriter.writeUInt32(byteBuffer, entry.getSampleDescriptionIndex());
        }
    }}finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2265);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2266);return "SampleToChunkBox[entryCount=" + entries.size() + "]";
    }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

    /**
     * Decompresses the list of entries and returns the number of samples per chunk for
     * every single chunk.
     *
     * @param chunkCount overall number of chunks
     * @return number of samples per chunk
     */
    public long[] blowup(int chunkCount) {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2267);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2268);long[] numberOfSamples = new long[chunkCount];
        __CLR4_5_21qa1qalvlulbxa.R.inc(2269);int j = 0;
        __CLR4_5_21qa1qalvlulbxa.R.inc(2270);List<SampleToChunkBox.Entry> sampleToChunkEntries = new LinkedList<Entry>(entries);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2271);Collections.reverse(sampleToChunkEntries);
        __CLR4_5_21qa1qalvlulbxa.R.inc(2272);Iterator<Entry> iterator = sampleToChunkEntries.iterator();
        __CLR4_5_21qa1qalvlulbxa.R.inc(2273);SampleToChunkBox.Entry currentEntry = iterator.next();

        __CLR4_5_21qa1qalvlulbxa.R.inc(2274);for (int i = numberOfSamples.length; (((i > 1)&&(__CLR4_5_21qa1qalvlulbxa.R.iget(2275)!=0|true))||(__CLR4_5_21qa1qalvlulbxa.R.iget(2276)==0&false)); i--) {{
            __CLR4_5_21qa1qalvlulbxa.R.inc(2277);numberOfSamples[i - 1] = currentEntry.getSamplesPerChunk();
            __CLR4_5_21qa1qalvlulbxa.R.inc(2278);if ((((i == currentEntry.getFirstChunk())&&(__CLR4_5_21qa1qalvlulbxa.R.iget(2279)!=0|true))||(__CLR4_5_21qa1qalvlulbxa.R.iget(2280)==0&false))) {{
                __CLR4_5_21qa1qalvlulbxa.R.inc(2281);currentEntry = iterator.next();
            }
        }}
        }__CLR4_5_21qa1qalvlulbxa.R.inc(2282);numberOfSamples[0] = currentEntry.getSamplesPerChunk();
        __CLR4_5_21qa1qalvlulbxa.R.inc(2283);return numberOfSamples;
    }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

    public static class Entry {
        long firstChunk;
        long samplesPerChunk;
        long sampleDescriptionIndex;

        public Entry(long firstChunk, long samplesPerChunk, long sampleDescriptionIndex) {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2284);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2285);this.firstChunk = firstChunk;
            __CLR4_5_21qa1qalvlulbxa.R.inc(2286);this.samplesPerChunk = samplesPerChunk;
            __CLR4_5_21qa1qalvlulbxa.R.inc(2287);this.sampleDescriptionIndex = sampleDescriptionIndex;
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

        public long getFirstChunk() {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2288);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2289);return firstChunk;
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

        public void setFirstChunk(long firstChunk) {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2290);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2291);this.firstChunk = firstChunk;
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

        public long getSamplesPerChunk() {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2292);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2293);return samplesPerChunk;
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

        public void setSamplesPerChunk(long samplesPerChunk) {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2294);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2295);this.samplesPerChunk = samplesPerChunk;
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

        public long getSampleDescriptionIndex() {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2296);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2297);return sampleDescriptionIndex;
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

        public void setSampleDescriptionIndex(long sampleDescriptionIndex) {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2298);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2299);this.sampleDescriptionIndex = sampleDescriptionIndex;
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2300);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2301);return "Entry{" +
                    "firstChunk=" + firstChunk +
                    ", samplesPerChunk=" + samplesPerChunk +
                    ", sampleDescriptionIndex=" + sampleDescriptionIndex +
                    '}';
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2302);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2303);if ((((this == o)&&(__CLR4_5_21qa1qalvlulbxa.R.iget(2304)!=0|true))||(__CLR4_5_21qa1qalvlulbxa.R.iget(2305)==0&false))) {__CLR4_5_21qa1qalvlulbxa.R.inc(2306);return true;
            }__CLR4_5_21qa1qalvlulbxa.R.inc(2307);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_21qa1qalvlulbxa.R.iget(2308)!=0|true))||(__CLR4_5_21qa1qalvlulbxa.R.iget(2309)==0&false))) {__CLR4_5_21qa1qalvlulbxa.R.inc(2310);return false;

            }__CLR4_5_21qa1qalvlulbxa.R.inc(2311);Entry entry = (Entry) o;

            __CLR4_5_21qa1qalvlulbxa.R.inc(2312);if ((((firstChunk != entry.firstChunk)&&(__CLR4_5_21qa1qalvlulbxa.R.iget(2313)!=0|true))||(__CLR4_5_21qa1qalvlulbxa.R.iget(2314)==0&false))) {__CLR4_5_21qa1qalvlulbxa.R.inc(2315);return false;
            }__CLR4_5_21qa1qalvlulbxa.R.inc(2316);if ((((sampleDescriptionIndex != entry.sampleDescriptionIndex)&&(__CLR4_5_21qa1qalvlulbxa.R.iget(2317)!=0|true))||(__CLR4_5_21qa1qalvlulbxa.R.iget(2318)==0&false))) {__CLR4_5_21qa1qalvlulbxa.R.inc(2319);return false;
            }__CLR4_5_21qa1qalvlulbxa.R.inc(2320);if ((((samplesPerChunk != entry.samplesPerChunk)&&(__CLR4_5_21qa1qalvlulbxa.R.iget(2321)!=0|true))||(__CLR4_5_21qa1qalvlulbxa.R.iget(2322)==0&false))) {__CLR4_5_21qa1qalvlulbxa.R.inc(2323);return false;

            }__CLR4_5_21qa1qalvlulbxa.R.inc(2324);return true;
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_21qa1qalvlulbxa.R.inc(2325);
            __CLR4_5_21qa1qalvlulbxa.R.inc(2326);int result = (int) (firstChunk ^ (firstChunk >>> 32));
            __CLR4_5_21qa1qalvlulbxa.R.inc(2327);result = 31 * result + (int) (samplesPerChunk ^ (samplesPerChunk >>> 32));
            __CLR4_5_21qa1qalvlulbxa.R.inc(2328);result = 31 * result + (int) (sampleDescriptionIndex ^ (sampleDescriptionIndex >>> 32));
            __CLR4_5_21qa1qalvlulbxa.R.inc(2329);return result;
        }finally{__CLR4_5_21qa1qalvlulbxa.R.flushNeeded();}}
    }
}
