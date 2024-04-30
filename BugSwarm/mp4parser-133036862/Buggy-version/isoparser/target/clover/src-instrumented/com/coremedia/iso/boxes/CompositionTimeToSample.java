/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <pre>
 * aligned(8) class CompositionOffsetBox extends FullBox(\u2018ctts\u2019, version = 0, 0) {
 *  unsigned int(32) entry_count;
 *  int i;
 *  if (version==0) {
 *   for (i=0; i &lt; entry_count; i++) {
 *    unsigned int(32) sample_count;
 *    unsigned int(32) sample_offset;
 *   }
 *  }
 *  else if (version == 1) {
 *   for (i=0; i &lt; entry_count; i++) {
 *    unsigned int(32) sample_count;
 *    signed int(32) sample_offset;
 *   }
 *  }
 * }
 * </pre>
 * <p>
 * This box provides the offset between decoding time and composition time.
 * In version 0 of this box the decoding time must be less than the composition time, and
 * the offsets are expressed as unsigned numbers such that</p>
 * <p>CT(n) = DT(n) + CTTS(n) where CTTS(n) is the (uncompressed) table entry for sample n.</p>
 * <p>In version 1 of this box, the composition timeline and the decoding timeline are
 * still derived from each other, but the offsets are signed.
 * It is recommended that for the computed composition timestamps, there is
 * exactly one with the value 0 (zero).</p>
 */
public class CompositionTimeToSample extends AbstractFullBox {public static class __CLR4_5_2izizlvlulb19{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,733,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "ctts";

    List<Entry> entries = Collections.emptyList();

    public CompositionTimeToSample() {
        super(TYPE);__CLR4_5_2izizlvlulb19.R.inc(684);try{__CLR4_5_2izizlvlulb19.R.inc(683);
    }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_2izizlvlulb19.R.inc(685);
        __CLR4_5_2izizlvlulb19.R.inc(686);return 8 + 8 * entries.size();
    }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_2izizlvlulb19.R.inc(687);
        __CLR4_5_2izizlvlulb19.R.inc(688);return entries;
    }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_2izizlvlulb19.R.inc(689);
        __CLR4_5_2izizlvlulb19.R.inc(690);this.entries = entries;
    }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2izizlvlulb19.R.inc(691);
        __CLR4_5_2izizlvlulb19.R.inc(692);parseVersionAndFlags(content);
        __CLR4_5_2izizlvlulb19.R.inc(693);int numberOfEntries = l2i(IsoTypeReader.readUInt32(content));
        __CLR4_5_2izizlvlulb19.R.inc(694);entries = new ArrayList<Entry>(numberOfEntries);
        __CLR4_5_2izizlvlulb19.R.inc(695);for (int i = 0; (((i < numberOfEntries)&&(__CLR4_5_2izizlvlulb19.R.iget(696)!=0|true))||(__CLR4_5_2izizlvlulb19.R.iget(697)==0&false)); i++) {{
            __CLR4_5_2izizlvlulb19.R.inc(698);Entry e = new Entry(l2i(IsoTypeReader.readUInt32(content)), content.getInt());
            __CLR4_5_2izizlvlulb19.R.inc(699);entries.add(e);
        }
    }}finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2izizlvlulb19.R.inc(700);
        __CLR4_5_2izizlvlulb19.R.inc(701);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2izizlvlulb19.R.inc(702);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());

        __CLR4_5_2izizlvlulb19.R.inc(703);for (Entry entry : entries) {{
            __CLR4_5_2izizlvlulb19.R.inc(704);IsoTypeWriter.writeUInt32(byteBuffer, entry.getCount());
            __CLR4_5_2izizlvlulb19.R.inc(705);byteBuffer.putInt(entry.getOffset());
        }

    }}finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}


    public static class Entry {
        int count;
        int offset;

        public Entry(int count, int offset) {try{__CLR4_5_2izizlvlulb19.R.inc(706);
            __CLR4_5_2izizlvlulb19.R.inc(707);this.count = count;
            __CLR4_5_2izizlvlulb19.R.inc(708);this.offset = offset;
        }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

        public int getCount() {try{__CLR4_5_2izizlvlulb19.R.inc(709);
            __CLR4_5_2izizlvlulb19.R.inc(710);return count;
        }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

        public int getOffset() {try{__CLR4_5_2izizlvlulb19.R.inc(711);
            __CLR4_5_2izizlvlulb19.R.inc(712);return offset;
        }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

        public void setCount(int count) {try{__CLR4_5_2izizlvlulb19.R.inc(713);
            __CLR4_5_2izizlvlulb19.R.inc(714);this.count = count;
        }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

        public void setOffset(int offset) {try{__CLR4_5_2izizlvlulb19.R.inc(715);
            __CLR4_5_2izizlvlulb19.R.inc(716);this.offset = offset;
        }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2izizlvlulb19.R.inc(717);
            __CLR4_5_2izizlvlulb19.R.inc(718);return "Entry{" +
                    "count=" + count +
                    ", offset=" + offset +
                    '}';
        }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}
    }


    /**
     * Decompresses the list of entries and returns the list of composition times.
     * @param entries composition time to sample entries in compressed form
     * @return decoding time per sample
     */
    public static int[] blowupCompositionTimes(List<CompositionTimeToSample.Entry> entries) {try{__CLR4_5_2izizlvlulb19.R.inc(719);
        __CLR4_5_2izizlvlulb19.R.inc(720);long numOfSamples = 0;
        __CLR4_5_2izizlvlulb19.R.inc(721);for (CompositionTimeToSample.Entry entry : entries) {{
            __CLR4_5_2izizlvlulb19.R.inc(722);numOfSamples += entry.getCount();
        }
        }assert (((numOfSamples <= Integer.MAX_VALUE)&&(__CLR4_5_2izizlvlulb19.R.iget(723)!=0|true))||(__CLR4_5_2izizlvlulb19.R.iget(724)==0&false));
        __CLR4_5_2izizlvlulb19.R.inc(725);int[] decodingTime = new int[(int) numOfSamples];

        __CLR4_5_2izizlvlulb19.R.inc(726);int current = 0;


        __CLR4_5_2izizlvlulb19.R.inc(727);for (CompositionTimeToSample.Entry entry : entries) {{
            __CLR4_5_2izizlvlulb19.R.inc(728);for (int i = 0; (((i < entry.getCount())&&(__CLR4_5_2izizlvlulb19.R.iget(729)!=0|true))||(__CLR4_5_2izizlvlulb19.R.iget(730)==0&false)); i++) {{
                __CLR4_5_2izizlvlulb19.R.inc(731);decodingTime[current++] = entry.getOffset();
            }
        }}

        }__CLR4_5_2izizlvlulb19.R.inc(732);return decodingTime;
    }finally{__CLR4_5_2izizlvlulb19.R.flushNeeded();}}

}
