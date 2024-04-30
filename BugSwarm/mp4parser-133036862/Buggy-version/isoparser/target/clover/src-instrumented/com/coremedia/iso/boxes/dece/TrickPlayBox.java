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
public class TrickPlayBox extends AbstractFullBox {public static class __CLR4_5_22bz2bzlvlulc6a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,3066,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "trik";

    private List<Entry> entries = new ArrayList<Entry>();

    public TrickPlayBox() {
        super(TYPE);__CLR4_5_22bz2bzlvlulc6a.R.inc(3024);try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3023);
    }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3025);
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3026);this.entries = entries;
    }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3027);
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3028);return entries;
    }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

    public static class Entry {

        public Entry() {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3029);
        }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

        public Entry(int value) {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3030);
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3031);this.value = value;
        }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}


        private int value;

        public int getPicType() {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3032);
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3033);return (value >> 6) & 0x03;
        }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

        public void setPicType(int picType) {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3034);
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3035);value = value & (0xff >> 3);
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3036);value = (picType & 0x03) << 6 | value;
        }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

        public int getDependencyLevel() {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3037);
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3038);return value & 0x3f;
        }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

        public void setDependencyLevel(int dependencyLevel) {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3039);
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3040);value = (dependencyLevel & 0x3f) | value;
        }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}


        @Override
        public String toString() {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3041);
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3042);final StringBuilder sb = new StringBuilder();
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3043);sb.append("Entry");
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3044);sb.append("{picType=").append(getPicType());
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3045);sb.append(",dependencyLevel=").append(getDependencyLevel());
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3046);sb.append('}');
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3047);return sb.toString();
        }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}
    }

    @Override
    protected long getContentSize() {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3048);
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3049);return 4 + entries.size();
    }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3050);
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3051);parseVersionAndFlags(content);
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3052);while ((((content.remaining() > 0)&&(__CLR4_5_22bz2bzlvlulc6a.R.iget(3053)!=0|true))||(__CLR4_5_22bz2bzlvlulc6a.R.iget(3054)==0&false))) {{
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3055);entries.add(new Entry(IsoTypeReader.readUInt8(content)));
        }
    }}finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3056);
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3057);writeVersionAndFlags(byteBuffer);
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3058);for (Entry entry : entries) {{
            __CLR4_5_22bz2bzlvlulc6a.R.inc(3059);IsoTypeWriter.writeUInt8(byteBuffer, entry.value);
        }
    }}finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_22bz2bzlvlulc6a.R.inc(3060);
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3061);final StringBuilder sb = new StringBuilder();
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3062);sb.append("TrickPlayBox");
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3063);sb.append("{entries=").append(entries);
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3064);sb.append('}');
        __CLR4_5_22bz2bzlvlulc6a.R.inc(3065);return sb.toString();
    }finally{__CLR4_5_22bz2bzlvlulc6a.R.flushNeeded();}}
}
