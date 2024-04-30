/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <pre>
 * aligned(8) class TrickPlayBox extends FullBox(\u2018trik\u2019, version=0, flags=0)
 * {
 *  for (i=0; I &lt; sample_count; i++) {
 *   unsigned int(2) pic_type;
 *   unsigned int(6) dependency_level;
 *  }
 * }
 * </pre>
 */
public class TrickPlayBox extends AbstractFullBox {public static class __CLR4_5_22bi2bilvl9efgx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,3049,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "trik";

    private List<Entry> entries = new ArrayList<Entry>();

    public TrickPlayBox() {
        super(TYPE);__CLR4_5_22bi2bilvl9efgx.R.inc(3007);try{__CLR4_5_22bi2bilvl9efgx.R.inc(3006);
    }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3008);
        __CLR4_5_22bi2bilvl9efgx.R.inc(3009);this.entries = entries;
    }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3010);
        __CLR4_5_22bi2bilvl9efgx.R.inc(3011);return entries;
    }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

    public static class Entry {

        public Entry() {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3012);
        }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

        public Entry(int value) {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3013);
            __CLR4_5_22bi2bilvl9efgx.R.inc(3014);this.value = value;
        }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}


        private int value;

        public int getPicType() {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3015);
            __CLR4_5_22bi2bilvl9efgx.R.inc(3016);return (value >> 6) & 0x03;
        }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

        public void setPicType(int picType) {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3017);
            __CLR4_5_22bi2bilvl9efgx.R.inc(3018);value = value & (0xff >> 3);
            __CLR4_5_22bi2bilvl9efgx.R.inc(3019);value = (picType & 0x03) << 6 | value;
        }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

        public int getDependencyLevel() {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3020);
            __CLR4_5_22bi2bilvl9efgx.R.inc(3021);return value & 0x3f;
        }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

        public void setDependencyLevel(int dependencyLevel) {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3022);
            __CLR4_5_22bi2bilvl9efgx.R.inc(3023);value = (dependencyLevel & 0x3f) | value;
        }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}


        @Override
        public String toString() {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3024);
            __CLR4_5_22bi2bilvl9efgx.R.inc(3025);final StringBuilder sb = new StringBuilder();
            __CLR4_5_22bi2bilvl9efgx.R.inc(3026);sb.append("Entry");
            __CLR4_5_22bi2bilvl9efgx.R.inc(3027);sb.append("{picType=").append(getPicType());
            __CLR4_5_22bi2bilvl9efgx.R.inc(3028);sb.append(",dependencyLevel=").append(getDependencyLevel());
            __CLR4_5_22bi2bilvl9efgx.R.inc(3029);sb.append('}');
            __CLR4_5_22bi2bilvl9efgx.R.inc(3030);return sb.toString();
        }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}
    }

    @Override
    protected long getContentSize() {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3031);
        __CLR4_5_22bi2bilvl9efgx.R.inc(3032);return 4 + entries.size();
    }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3033);
        __CLR4_5_22bi2bilvl9efgx.R.inc(3034);parseVersionAndFlags(content);
        __CLR4_5_22bi2bilvl9efgx.R.inc(3035);while ((((content.remaining() > 0)&&(__CLR4_5_22bi2bilvl9efgx.R.iget(3036)!=0|true))||(__CLR4_5_22bi2bilvl9efgx.R.iget(3037)==0&false))) {{
            __CLR4_5_22bi2bilvl9efgx.R.inc(3038);entries.add(new Entry(IsoTypeReader.readUInt8(content)));
        }
    }}finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3039);
        __CLR4_5_22bi2bilvl9efgx.R.inc(3040);writeVersionAndFlags(byteBuffer);
        __CLR4_5_22bi2bilvl9efgx.R.inc(3041);for (Entry entry : entries) {{
            __CLR4_5_22bi2bilvl9efgx.R.inc(3042);IsoTypeWriter.writeUInt8(byteBuffer, entry.value);
        }
    }}finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22bi2bilvl9efgx.R.inc(3043);
        __CLR4_5_22bi2bilvl9efgx.R.inc(3044);final StringBuilder sb = new StringBuilder();
        __CLR4_5_22bi2bilvl9efgx.R.inc(3045);sb.append("TrickPlayBox");
        __CLR4_5_22bi2bilvl9efgx.R.inc(3046);sb.append("{entries=").append(entries);
        __CLR4_5_22bi2bilvl9efgx.R.inc(3047);sb.append('}');
        __CLR4_5_22bi2bilvl9efgx.R.inc(3048);return sb.toString();
    }finally{__CLR4_5_22bi2bilvl9efgx.R.flushNeeded();}}
}
