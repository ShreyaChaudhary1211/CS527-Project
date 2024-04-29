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

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.*;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * This box contains a compact version of a table that allows indexing from decoding time to sample number.
 * Other tables give sample sizes and pointers, from the sample number. Each entry in the table gives the
 * number of consecutive samples with the same time delta, and the delta of those samples. By adding the
 * deltas a complete time-to-sample map may be built.<br>
 * The Decoding Time to Sample Box contains decode time delta's: <code>DT(n+1) = DT(n) + STTS(n)</code> where STTS(n)
 * is the (uncompressed) table entry for sample n.<br>
 * The sample entries are ordered by decoding time stamps; therefore the deltas are all non-negative. <br>
 * The DT axis has a zero origin; <code>DT(i) = SUM(for j=0 to i-1 of delta(j))</code>, and the sum of all
 * deltas gives the length of the media in the track (not mapped to the overall timescale, and not considering
 * any edit list).    <br>
 * The Edit List Box provides the initial CT value if it is non-empty (non-zero).
 */
public class TimeToSampleBox extends AbstractFullBox {public static class __CLR4_5_21y01y0lvl9efae{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,2581,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "stts";

    List<Entry> entries = Collections.emptyList();

    public TimeToSampleBox() {
        super(TYPE);__CLR4_5_21y01y0lvl9efae.R.inc(2521);try{__CLR4_5_21y01y0lvl9efae.R.inc(2520);
    }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_21y01y0lvl9efae.R.inc(2522);
        __CLR4_5_21y01y0lvl9efae.R.inc(2523);return 8 + entries.size() * 8;
    }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_21y01y0lvl9efae.R.inc(2524);
        __CLR4_5_21y01y0lvl9efae.R.inc(2525);parseVersionAndFlags(content);
        __CLR4_5_21y01y0lvl9efae.R.inc(2526);int entryCount = l2i(IsoTypeReader.readUInt32(content));
        __CLR4_5_21y01y0lvl9efae.R.inc(2527);entries = new ArrayList<Entry>(entryCount);

        __CLR4_5_21y01y0lvl9efae.R.inc(2528);for (int i = 0; (((i < entryCount)&&(__CLR4_5_21y01y0lvl9efae.R.iget(2529)!=0|true))||(__CLR4_5_21y01y0lvl9efae.R.iget(2530)==0&false)); i++) {{
            __CLR4_5_21y01y0lvl9efae.R.inc(2531);entries.add(new Entry(IsoTypeReader.readUInt32(content), IsoTypeReader.readUInt32(content)));
        }

    }}finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_21y01y0lvl9efae.R.inc(2532);
        __CLR4_5_21y01y0lvl9efae.R.inc(2533);writeVersionAndFlags(byteBuffer);
        __CLR4_5_21y01y0lvl9efae.R.inc(2534);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());
        __CLR4_5_21y01y0lvl9efae.R.inc(2535);for (Entry entry : entries) {{
            __CLR4_5_21y01y0lvl9efae.R.inc(2536);IsoTypeWriter.writeUInt32(byteBuffer, entry.getCount());
            __CLR4_5_21y01y0lvl9efae.R.inc(2537);IsoTypeWriter.writeUInt32(byteBuffer, entry.getDelta());
        }
    }}finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_21y01y0lvl9efae.R.inc(2538);
        __CLR4_5_21y01y0lvl9efae.R.inc(2539);return entries;
    }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_21y01y0lvl9efae.R.inc(2540);
        __CLR4_5_21y01y0lvl9efae.R.inc(2541);this.entries = entries;
    }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_21y01y0lvl9efae.R.inc(2542);
        __CLR4_5_21y01y0lvl9efae.R.inc(2543);return "TimeToSampleBox[entryCount=" + entries.size() + "]";
    }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

    public static class Entry {
        long count;
        long delta;

        public Entry(long count, long delta) {try{__CLR4_5_21y01y0lvl9efae.R.inc(2544);
            __CLR4_5_21y01y0lvl9efae.R.inc(2545);this.count = count;
            __CLR4_5_21y01y0lvl9efae.R.inc(2546);this.delta = delta;
        }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

        public long getCount() {try{__CLR4_5_21y01y0lvl9efae.R.inc(2547);
            __CLR4_5_21y01y0lvl9efae.R.inc(2548);return count;
        }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

        public long getDelta() {try{__CLR4_5_21y01y0lvl9efae.R.inc(2549);
            __CLR4_5_21y01y0lvl9efae.R.inc(2550);return delta;
        }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

        public void setCount(long count) {try{__CLR4_5_21y01y0lvl9efae.R.inc(2551);
            __CLR4_5_21y01y0lvl9efae.R.inc(2552);this.count = count;
        }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

        public void setDelta(long delta) {try{__CLR4_5_21y01y0lvl9efae.R.inc(2553);
            __CLR4_5_21y01y0lvl9efae.R.inc(2554);this.delta = delta;
        }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21y01y0lvl9efae.R.inc(2555);
            __CLR4_5_21y01y0lvl9efae.R.inc(2556);return "Entry{" +
                    "count=" + count +
                    ", delta=" + delta +
                    '}';
        }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}
    }


    static Map<List<Entry>, SoftReference<long[]>> cache = new WeakHashMap<List<Entry>, SoftReference<long[]>>();

    /**
     * Decompresses the list of entries and returns the list of decoding times.
     *
     * @param entries compressed entries
     * @return decoding time per sample
     */
    public static synchronized long[] blowupTimeToSamples(List<TimeToSampleBox.Entry> entries) {try{__CLR4_5_21y01y0lvl9efae.R.inc(2557);
        __CLR4_5_21y01y0lvl9efae.R.inc(2558);SoftReference<long[]> cacheEntry;
        __CLR4_5_21y01y0lvl9efae.R.inc(2559);if ((cacheEntry = cache.get(entries)) != null) {{
            __CLR4_5_21y01y0lvl9efae.R.inc(2562);long[] cacheVal;
            __CLR4_5_21y01y0lvl9efae.R.inc(2563);if ((cacheVal = cacheEntry.get()) != null) {{
                __CLR4_5_21y01y0lvl9efae.R.inc(2566);return cacheVal;
            }
        }}
        }__CLR4_5_21y01y0lvl9efae.R.inc(2567);long numOfSamples = 0;
        __CLR4_5_21y01y0lvl9efae.R.inc(2568);for (TimeToSampleBox.Entry entry : entries) {{
            __CLR4_5_21y01y0lvl9efae.R.inc(2569);numOfSamples += entry.getCount();
        }
        }assert (((numOfSamples <= Integer.MAX_VALUE)&&(__CLR4_5_21y01y0lvl9efae.R.iget(2570)!=0|true))||(__CLR4_5_21y01y0lvl9efae.R.iget(2571)==0&false));
        __CLR4_5_21y01y0lvl9efae.R.inc(2572);long[] decodingTime = new long[(int) numOfSamples];

        __CLR4_5_21y01y0lvl9efae.R.inc(2573);int current = 0;


        __CLR4_5_21y01y0lvl9efae.R.inc(2574);for (TimeToSampleBox.Entry entry : entries) {{
            __CLR4_5_21y01y0lvl9efae.R.inc(2575);for (int i = 0; (((i < entry.getCount())&&(__CLR4_5_21y01y0lvl9efae.R.iget(2576)!=0|true))||(__CLR4_5_21y01y0lvl9efae.R.iget(2577)==0&false)); i++) {{
                __CLR4_5_21y01y0lvl9efae.R.inc(2578);decodingTime[current++] = entry.getDelta();
            }
        }}
        }__CLR4_5_21y01y0lvl9efae.R.inc(2579);cache.put(entries, new SoftReference<long[]>(decodingTime));
        __CLR4_5_21y01y0lvl9efae.R.inc(2580);return decodingTime;
    }finally{__CLR4_5_21y01y0lvl9efae.R.flushNeeded();}}


}
