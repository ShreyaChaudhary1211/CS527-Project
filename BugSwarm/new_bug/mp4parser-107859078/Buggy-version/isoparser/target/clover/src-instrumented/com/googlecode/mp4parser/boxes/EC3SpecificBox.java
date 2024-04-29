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
public class EC3SpecificBox extends AbstractBox {public static class __CLR4_5_2axdaxdlvl9ejbf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,14226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "dec3";
    List<Entry> entries = new LinkedList<Entry>();
    int dataRate;
    int numIndSub;

    public EC3SpecificBox() {
        super(TYPE);__CLR4_5_2axdaxdlvl9ejbf.R.inc(14162);try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14161);
    }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

    @Override
    public long getContentSize() {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14163);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14164);long size = 2;
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14165);for (Entry entry : entries) {{
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14166);if ((((entry.num_dep_sub > 0)&&(__CLR4_5_2axdaxdlvl9ejbf.R.iget(14167)!=0|true))||(__CLR4_5_2axdaxdlvl9ejbf.R.iget(14168)==0&false))) {{
                __CLR4_5_2axdaxdlvl9ejbf.R.inc(14169);size += 4;
            } }else {{
                __CLR4_5_2axdaxdlvl9ejbf.R.inc(14170);size += 3;
            }
        }}
        }__CLR4_5_2axdaxdlvl9ejbf.R.inc(14171);return size;
    }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14172);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14173);BitReaderBuffer brb = new BitReaderBuffer(content);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14174);dataRate = brb.readBits(13);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14175);numIndSub = brb.readBits(3) + 1;
        // This field indicates the number of independent substreams that are present in the Enhanced AC-3 bitstream. The value
        // of this field is one less than the number of independent substreams present.


        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14176);for (int i = 0; (((i < numIndSub)&&(__CLR4_5_2axdaxdlvl9ejbf.R.iget(14177)!=0|true))||(__CLR4_5_2axdaxdlvl9ejbf.R.iget(14178)==0&false)); i++) {{
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14179);Entry e = new Entry();
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14180);e.fscod = brb.readBits(2);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14181);e.bsid = brb.readBits(5);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14182);e.bsmod = brb.readBits(5);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14183);e.acmod = brb.readBits(3);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14184);e.lfeon = brb.readBits(1);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14185);e.reserved = brb.readBits(3);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14186);e.num_dep_sub = brb.readBits(4);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14187);if ((((e.num_dep_sub > 0)&&(__CLR4_5_2axdaxdlvl9ejbf.R.iget(14188)!=0|true))||(__CLR4_5_2axdaxdlvl9ejbf.R.iget(14189)==0&false))) {{
                __CLR4_5_2axdaxdlvl9ejbf.R.inc(14190);e.chan_loc = brb.readBits(9);
            } }else {{
                __CLR4_5_2axdaxdlvl9ejbf.R.inc(14191);e.reserved2 = brb.readBits(1);
            }
            }__CLR4_5_2axdaxdlvl9ejbf.R.inc(14192);entries.add(e);
        }
    }}finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

    @Override
    public void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14193);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14194);BitWriterBuffer bwb = new BitWriterBuffer(byteBuffer);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14195);bwb.writeBits(dataRate, 13);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14196);bwb.writeBits(entries.size() - 1, 3);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14197);for (Entry e : entries) {{
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14198);bwb.writeBits(e.fscod, 2);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14199);bwb.writeBits(e.bsid, 5);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14200);bwb.writeBits(e.bsmod, 5);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14201);bwb.writeBits(e.acmod, 3);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14202);bwb.writeBits(e.lfeon, 1);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14203);bwb.writeBits(e.reserved, 3);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14204);bwb.writeBits(e.num_dep_sub, 4);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14205);if ((((e.num_dep_sub > 0)&&(__CLR4_5_2axdaxdlvl9ejbf.R.iget(14206)!=0|true))||(__CLR4_5_2axdaxdlvl9ejbf.R.iget(14207)==0&false))) {{
                __CLR4_5_2axdaxdlvl9ejbf.R.inc(14208);bwb.writeBits(e.chan_loc, 9);
            } }else {{
                __CLR4_5_2axdaxdlvl9ejbf.R.inc(14209);bwb.writeBits(e.reserved2, 1);
            }
        }}
    }}finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}


    public List<Entry> getEntries() {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14210);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14211);return entries;
    }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14212);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14213);this.entries = entries;
    }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

    public void addEntry(Entry entry) {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14214);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14215);this.entries.add(entry);
    }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

    public int getDataRate() {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14216);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14217);return dataRate;
    }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

    public void setDataRate(int dataRate) {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14218);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14219);this.dataRate = dataRate;
    }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

    public int getNumIndSub() {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14220);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14221);return numIndSub;
    }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

    public void setNumIndSub(int numIndSub) {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14222);
        __CLR4_5_2axdaxdlvl9ejbf.R.inc(14223);this.numIndSub = numIndSub;
    }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}

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
        public String toString() {try{__CLR4_5_2axdaxdlvl9ejbf.R.inc(14224);
            __CLR4_5_2axdaxdlvl9ejbf.R.inc(14225);return "Entry{" +
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
        }finally{__CLR4_5_2axdaxdlvl9ejbf.R.flushNeeded();}}
    }
}
