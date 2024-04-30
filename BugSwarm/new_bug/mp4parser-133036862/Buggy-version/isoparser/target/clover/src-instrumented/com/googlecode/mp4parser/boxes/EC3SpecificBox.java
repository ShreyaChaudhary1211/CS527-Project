/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class EC3SpecificBox extends AbstractBox {public static class __CLR4_5_2b00b00lvluljr5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,14321,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "dec3";
    List<Entry> entries = new LinkedList<Entry>();
    int dataRate;
    int numIndSub;

    public EC3SpecificBox() {
        super(TYPE);__CLR4_5_2b00b00lvluljr5.R.inc(14257);try{__CLR4_5_2b00b00lvluljr5.R.inc(14256);
    }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    @Override
    public long getContentSize() {try{__CLR4_5_2b00b00lvluljr5.R.inc(14258);
        __CLR4_5_2b00b00lvluljr5.R.inc(14259);long size = 2;
        __CLR4_5_2b00b00lvluljr5.R.inc(14260);for (Entry entry : entries) {{
            __CLR4_5_2b00b00lvluljr5.R.inc(14261);if ((((entry.num_dep_sub > 0)&&(__CLR4_5_2b00b00lvluljr5.R.iget(14262)!=0|true))||(__CLR4_5_2b00b00lvluljr5.R.iget(14263)==0&false))) {{
                __CLR4_5_2b00b00lvluljr5.R.inc(14264);size += 4;
            } }else {{
                __CLR4_5_2b00b00lvluljr5.R.inc(14265);size += 3;
            }
        }}
        }__CLR4_5_2b00b00lvluljr5.R.inc(14266);return size;
    }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2b00b00lvluljr5.R.inc(14267);
        __CLR4_5_2b00b00lvluljr5.R.inc(14268);BitReaderBuffer brb = new BitReaderBuffer(content);
        __CLR4_5_2b00b00lvluljr5.R.inc(14269);dataRate = brb.readBits(13);
        __CLR4_5_2b00b00lvluljr5.R.inc(14270);numIndSub = brb.readBits(3) + 1;
        // This field indicates the number of independent substreams that are present in the Enhanced AC-3 bitstream. The value
        // of this field is one less than the number of independent substreams present.


        __CLR4_5_2b00b00lvluljr5.R.inc(14271);for (int i = 0; (((i < numIndSub)&&(__CLR4_5_2b00b00lvluljr5.R.iget(14272)!=0|true))||(__CLR4_5_2b00b00lvluljr5.R.iget(14273)==0&false)); i++) {{
            __CLR4_5_2b00b00lvluljr5.R.inc(14274);Entry e = new Entry();
            __CLR4_5_2b00b00lvluljr5.R.inc(14275);e.fscod = brb.readBits(2);
            __CLR4_5_2b00b00lvluljr5.R.inc(14276);e.bsid = brb.readBits(5);
            __CLR4_5_2b00b00lvluljr5.R.inc(14277);e.bsmod = brb.readBits(5);
            __CLR4_5_2b00b00lvluljr5.R.inc(14278);e.acmod = brb.readBits(3);
            __CLR4_5_2b00b00lvluljr5.R.inc(14279);e.lfeon = brb.readBits(1);
            __CLR4_5_2b00b00lvluljr5.R.inc(14280);e.reserved = brb.readBits(3);
            __CLR4_5_2b00b00lvluljr5.R.inc(14281);e.num_dep_sub = brb.readBits(4);
            __CLR4_5_2b00b00lvluljr5.R.inc(14282);if ((((e.num_dep_sub > 0)&&(__CLR4_5_2b00b00lvluljr5.R.iget(14283)!=0|true))||(__CLR4_5_2b00b00lvluljr5.R.iget(14284)==0&false))) {{
                __CLR4_5_2b00b00lvluljr5.R.inc(14285);e.chan_loc = brb.readBits(9);
            } }else {{
                __CLR4_5_2b00b00lvluljr5.R.inc(14286);e.reserved2 = brb.readBits(1);
            }
            }__CLR4_5_2b00b00lvluljr5.R.inc(14287);entries.add(e);
        }
    }}finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    @Override
    public void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2b00b00lvluljr5.R.inc(14288);
        __CLR4_5_2b00b00lvluljr5.R.inc(14289);BitWriterBuffer bwb = new BitWriterBuffer(byteBuffer);
        __CLR4_5_2b00b00lvluljr5.R.inc(14290);bwb.writeBits(dataRate, 13);
        __CLR4_5_2b00b00lvluljr5.R.inc(14291);bwb.writeBits(entries.size() - 1, 3);
        __CLR4_5_2b00b00lvluljr5.R.inc(14292);for (Entry e : entries) {{
            __CLR4_5_2b00b00lvluljr5.R.inc(14293);bwb.writeBits(e.fscod, 2);
            __CLR4_5_2b00b00lvluljr5.R.inc(14294);bwb.writeBits(e.bsid, 5);
            __CLR4_5_2b00b00lvluljr5.R.inc(14295);bwb.writeBits(e.bsmod, 5);
            __CLR4_5_2b00b00lvluljr5.R.inc(14296);bwb.writeBits(e.acmod, 3);
            __CLR4_5_2b00b00lvluljr5.R.inc(14297);bwb.writeBits(e.lfeon, 1);
            __CLR4_5_2b00b00lvluljr5.R.inc(14298);bwb.writeBits(e.reserved, 3);
            __CLR4_5_2b00b00lvluljr5.R.inc(14299);bwb.writeBits(e.num_dep_sub, 4);
            __CLR4_5_2b00b00lvluljr5.R.inc(14300);if ((((e.num_dep_sub > 0)&&(__CLR4_5_2b00b00lvluljr5.R.iget(14301)!=0|true))||(__CLR4_5_2b00b00lvluljr5.R.iget(14302)==0&false))) {{
                __CLR4_5_2b00b00lvluljr5.R.inc(14303);bwb.writeBits(e.chan_loc, 9);
            } }else {{
                __CLR4_5_2b00b00lvluljr5.R.inc(14304);bwb.writeBits(e.reserved2, 1);
            }
        }}
    }}finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}


    public List<Entry> getEntries() {try{__CLR4_5_2b00b00lvluljr5.R.inc(14305);
        __CLR4_5_2b00b00lvluljr5.R.inc(14306);return entries;
    }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_2b00b00lvluljr5.R.inc(14307);
        __CLR4_5_2b00b00lvluljr5.R.inc(14308);this.entries = entries;
    }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    public void addEntry(Entry entry) {try{__CLR4_5_2b00b00lvluljr5.R.inc(14309);
        __CLR4_5_2b00b00lvluljr5.R.inc(14310);this.entries.add(entry);
    }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    public int getDataRate() {try{__CLR4_5_2b00b00lvluljr5.R.inc(14311);
        __CLR4_5_2b00b00lvluljr5.R.inc(14312);return dataRate;
    }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    public void setDataRate(int dataRate) {try{__CLR4_5_2b00b00lvluljr5.R.inc(14313);
        __CLR4_5_2b00b00lvluljr5.R.inc(14314);this.dataRate = dataRate;
    }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    public int getNumIndSub() {try{__CLR4_5_2b00b00lvluljr5.R.inc(14315);
        __CLR4_5_2b00b00lvluljr5.R.inc(14316);return numIndSub;
    }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    public void setNumIndSub(int numIndSub) {try{__CLR4_5_2b00b00lvluljr5.R.inc(14317);
        __CLR4_5_2b00b00lvluljr5.R.inc(14318);this.numIndSub = numIndSub;
    }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}

    public static class Entry {
        public int fscod;
        public int bsid;
        public int bsmod;
        public int acmod;
        public int lfeon;
        public int reserved;
        public int num_dep_sub;
        public int chan_loc;
        public int reserved2;


        @Override
        public String toString() {try{__CLR4_5_2b00b00lvluljr5.R.inc(14319);
            __CLR4_5_2b00b00lvluljr5.R.inc(14320);return "Entry{" +
                    "fscod=" + fscod +
                    ", bsid=" + bsid +
                    ", bsmod=" + bsmod +
                    ", acmod=" + acmod +
                    ", lfeon=" + lfeon +
                    ", reserved=" + reserved +
                    ", num_dep_sub=" + num_dep_sub +
                    ", chan_loc=" + chan_loc +
                    ", reserved2=" + reserved2 +
                    '}';
        }finally{__CLR4_5_2b00b00lvluljr5.R.flushNeeded();}}
    }
}
