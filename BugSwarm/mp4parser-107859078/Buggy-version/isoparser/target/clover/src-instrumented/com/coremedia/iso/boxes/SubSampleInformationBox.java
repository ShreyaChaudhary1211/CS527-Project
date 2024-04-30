/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <pre>
 * aligned(8) class SubSampleInformationBox extends FullBox('subs', version, 0) {
 *  unsigned int(32) entry_count;
 *  int i,j;
 *  for (i=0; i &lt; entry_count; i++) {
 *   unsigned int(32) sample_delta;
 *   unsigned int(16) subsample_count;
 *   if (subsample_count &gt; 0) {
 *    for (j=0; j &lt; subsample_count; j++) {
 *     if(version == 1)
 *     {
 *      unsigned int(32) subsample_size;
 *     }
 *     else
 *     {
 *      unsigned int(16) subsample_size;
 *     }
 *     unsigned int(8) subsample_priority;
 *     unsigned int(8) discardable;
 *     unsigned int(32) reserved = 0;
 *    }
 *   }
 *  }
 * }
 * </pre>
 */
public class SubSampleInformationBox extends AbstractFullBox {public static class __CLR4_5_21um1umlvl9ef8b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,2487,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "subs";

    private List<SubSampleEntry> entries = new ArrayList<SubSampleEntry>();

    public SubSampleInformationBox() {
        super(TYPE);__CLR4_5_21um1umlvl9ef8b.R.inc(2399);try{__CLR4_5_21um1umlvl9ef8b.R.inc(2398);
    }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

    public List<SubSampleEntry> getEntries() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2400);
        __CLR4_5_21um1umlvl9ef8b.R.inc(2401);return entries;
    }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

    public void setEntries(List<SubSampleEntry> entries) {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2402);
        __CLR4_5_21um1umlvl9ef8b.R.inc(2403);this.entries = entries;
    }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2404);
        __CLR4_5_21um1umlvl9ef8b.R.inc(2405);long size = 8;

        __CLR4_5_21um1umlvl9ef8b.R.inc(2406);for (SubSampleEntry entry : entries) {{
            __CLR4_5_21um1umlvl9ef8b.R.inc(2407);size += 4;
            __CLR4_5_21um1umlvl9ef8b.R.inc(2408);size += 2;
            __CLR4_5_21um1umlvl9ef8b.R.inc(2409);for (int j = 0; (((j < entry.getSubsampleEntries().size())&&(__CLR4_5_21um1umlvl9ef8b.R.iget(2410)!=0|true))||(__CLR4_5_21um1umlvl9ef8b.R.iget(2411)==0&false)); j++) {{

                __CLR4_5_21um1umlvl9ef8b.R.inc(2412);if ((((getVersion() == 1)&&(__CLR4_5_21um1umlvl9ef8b.R.iget(2413)!=0|true))||(__CLR4_5_21um1umlvl9ef8b.R.iget(2414)==0&false))) {{
                    __CLR4_5_21um1umlvl9ef8b.R.inc(2415);size += 4;
                } }else {{
                    __CLR4_5_21um1umlvl9ef8b.R.inc(2416);size += 2;
                }
                }__CLR4_5_21um1umlvl9ef8b.R.inc(2417);size += 2;
                __CLR4_5_21um1umlvl9ef8b.R.inc(2418);size += 4;
            }
        }}
        }__CLR4_5_21um1umlvl9ef8b.R.inc(2419);return size;
    }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2420);
        __CLR4_5_21um1umlvl9ef8b.R.inc(2421);parseVersionAndFlags(content);

        __CLR4_5_21um1umlvl9ef8b.R.inc(2422);long entryCount = IsoTypeReader.readUInt32(content);

        __CLR4_5_21um1umlvl9ef8b.R.inc(2423);for (int i = 0; (((i < entryCount)&&(__CLR4_5_21um1umlvl9ef8b.R.iget(2424)!=0|true))||(__CLR4_5_21um1umlvl9ef8b.R.iget(2425)==0&false)); i++) {{
            __CLR4_5_21um1umlvl9ef8b.R.inc(2426);SubSampleEntry SubSampleEntry = new SubSampleEntry();
            __CLR4_5_21um1umlvl9ef8b.R.inc(2427);SubSampleEntry.setSampleDelta(IsoTypeReader.readUInt32(content));
            __CLR4_5_21um1umlvl9ef8b.R.inc(2428);int subsampleCount = IsoTypeReader.readUInt16(content);
            __CLR4_5_21um1umlvl9ef8b.R.inc(2429);for (int j = 0; (((j < subsampleCount)&&(__CLR4_5_21um1umlvl9ef8b.R.iget(2430)!=0|true))||(__CLR4_5_21um1umlvl9ef8b.R.iget(2431)==0&false)); j++) {{
                __CLR4_5_21um1umlvl9ef8b.R.inc(2432);SubSampleEntry.SubsampleEntry subsampleEntry = new SubSampleEntry.SubsampleEntry();
                __CLR4_5_21um1umlvl9ef8b.R.inc(2433);subsampleEntry.setSubsampleSize((((getVersion() == 1 )&&(__CLR4_5_21um1umlvl9ef8b.R.iget(2434)!=0|true))||(__CLR4_5_21um1umlvl9ef8b.R.iget(2435)==0&false))? IsoTypeReader.readUInt32(content) : IsoTypeReader.readUInt16(content));
                __CLR4_5_21um1umlvl9ef8b.R.inc(2436);subsampleEntry.setSubsamplePriority(IsoTypeReader.readUInt8(content));
                __CLR4_5_21um1umlvl9ef8b.R.inc(2437);subsampleEntry.setDiscardable(IsoTypeReader.readUInt8(content));
                __CLR4_5_21um1umlvl9ef8b.R.inc(2438);subsampleEntry.setReserved(IsoTypeReader.readUInt32(content));
                __CLR4_5_21um1umlvl9ef8b.R.inc(2439);SubSampleEntry.getSubsampleEntries().add(subsampleEntry);
            }
            }__CLR4_5_21um1umlvl9ef8b.R.inc(2440);entries.add(SubSampleEntry);
        }

    }}finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2441);
        __CLR4_5_21um1umlvl9ef8b.R.inc(2442);writeVersionAndFlags(byteBuffer);
        __CLR4_5_21um1umlvl9ef8b.R.inc(2443);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());
        __CLR4_5_21um1umlvl9ef8b.R.inc(2444);for (SubSampleEntry subSampleEntry : entries) {{
            __CLR4_5_21um1umlvl9ef8b.R.inc(2445);IsoTypeWriter.writeUInt32(byteBuffer, subSampleEntry.getSampleDelta());
            __CLR4_5_21um1umlvl9ef8b.R.inc(2446);IsoTypeWriter.writeUInt16(byteBuffer, subSampleEntry.getSubsampleCount());
            __CLR4_5_21um1umlvl9ef8b.R.inc(2447);List<SubSampleEntry.SubsampleEntry> subsampleEntries = subSampleEntry.getSubsampleEntries();
            __CLR4_5_21um1umlvl9ef8b.R.inc(2448);for (SubSampleEntry.SubsampleEntry subsampleEntry : subsampleEntries) {{
                __CLR4_5_21um1umlvl9ef8b.R.inc(2449);if ((((getVersion() == 1)&&(__CLR4_5_21um1umlvl9ef8b.R.iget(2450)!=0|true))||(__CLR4_5_21um1umlvl9ef8b.R.iget(2451)==0&false))) {{
                    __CLR4_5_21um1umlvl9ef8b.R.inc(2452);IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getSubsampleSize());
                } }else {{
                    __CLR4_5_21um1umlvl9ef8b.R.inc(2453);IsoTypeWriter.writeUInt16(byteBuffer, l2i(subsampleEntry.getSubsampleSize()));
                }
                }__CLR4_5_21um1umlvl9ef8b.R.inc(2454);IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getSubsamplePriority());
                __CLR4_5_21um1umlvl9ef8b.R.inc(2455);IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getDiscardable());
                __CLR4_5_21um1umlvl9ef8b.R.inc(2456);IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getReserved());
            }
        }}
    }}finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2457);
        __CLR4_5_21um1umlvl9ef8b.R.inc(2458);return "SubSampleInformationBox{" +
                "entryCount=" + entries.size() +
                ", entries=" + entries +
                '}';
    }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

    public static class SubSampleEntry {
        private long sampleDelta;
        private List<SubsampleEntry> subsampleEntries = new ArrayList<SubsampleEntry>();

        public long getSampleDelta() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2459);
            __CLR4_5_21um1umlvl9ef8b.R.inc(2460);return sampleDelta;
        }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

        public void setSampleDelta(long sampleDelta) {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2461);
            __CLR4_5_21um1umlvl9ef8b.R.inc(2462);this.sampleDelta = sampleDelta;
        }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

        public int getSubsampleCount() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2463);
            __CLR4_5_21um1umlvl9ef8b.R.inc(2464);return subsampleEntries.size();
        }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

        public List<SubsampleEntry> getSubsampleEntries() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2465);
            __CLR4_5_21um1umlvl9ef8b.R.inc(2466);return subsampleEntries;
        }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

        public static class SubsampleEntry {
            private long subsampleSize;
            private int subsamplePriority;
            private int discardable;
            private long reserved;

            public long getSubsampleSize() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2467);
                __CLR4_5_21um1umlvl9ef8b.R.inc(2468);return subsampleSize;
            }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

            public void setSubsampleSize(long subsampleSize) {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2469);
                __CLR4_5_21um1umlvl9ef8b.R.inc(2470);this.subsampleSize = subsampleSize;
            }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

            public int getSubsamplePriority() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2471);
                __CLR4_5_21um1umlvl9ef8b.R.inc(2472);return subsamplePriority;
            }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

            public void setSubsamplePriority(int subsamplePriority) {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2473);
                __CLR4_5_21um1umlvl9ef8b.R.inc(2474);this.subsamplePriority = subsamplePriority;
            }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

            public int getDiscardable() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2475);
                __CLR4_5_21um1umlvl9ef8b.R.inc(2476);return discardable;
            }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

            public void setDiscardable(int discardable) {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2477);
                __CLR4_5_21um1umlvl9ef8b.R.inc(2478);this.discardable = discardable;
            }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

            public long getReserved() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2479);
                __CLR4_5_21um1umlvl9ef8b.R.inc(2480);return reserved;
            }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

            public void setReserved(long reserved) {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2481);
                __CLR4_5_21um1umlvl9ef8b.R.inc(2482);this.reserved = reserved;
            }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}

            @Override
            public String toString() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2483);
                __CLR4_5_21um1umlvl9ef8b.R.inc(2484);return "SubsampleEntry{" +
                        "subsampleSize=" + subsampleSize +
                        ", subsamplePriority=" + subsamplePriority +
                        ", discardable=" + discardable +
                        ", reserved=" + reserved +
                        '}';
            }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}
        }

        @Override
        public String toString() {try{__CLR4_5_21um1umlvl9ef8b.R.inc(2485);
            __CLR4_5_21um1umlvl9ef8b.R.inc(2486);return "SampleEntry{" +
                    "sampleDelta=" + sampleDelta +
                    ", subsampleCount=" + subsampleEntries.size() +
                    ", subsampleEntries=" + subsampleEntries +
                    '}';
        }finally{__CLR4_5_21um1umlvl9ef8b.R.flushNeeded();}}
    }
}
