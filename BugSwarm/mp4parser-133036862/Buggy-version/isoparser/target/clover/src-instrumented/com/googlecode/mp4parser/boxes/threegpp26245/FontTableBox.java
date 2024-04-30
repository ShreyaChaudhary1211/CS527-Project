/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.threegpp26245;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractBox;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class FontTableBox extends AbstractBox {public static class __CLR4_5_2eh6eh6lvlulmz5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,18801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "ftab";

    List<FontRecord> entries = new LinkedList<FontRecord>();

    public FontTableBox() {
        super("ftab");__CLR4_5_2eh6eh6lvlulmz5.R.inc(18763);try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18762);
    }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18764);
        __CLR4_5_2eh6eh6lvlulmz5.R.inc(18765);int size = 2;
        __CLR4_5_2eh6eh6lvlulmz5.R.inc(18766);for (FontRecord fontRecord : entries) {{
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18767);size += fontRecord.getSize();
        }
        }__CLR4_5_2eh6eh6lvlulmz5.R.inc(18768);return size;
    }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}


    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18769);
        __CLR4_5_2eh6eh6lvlulmz5.R.inc(18770);int numberOfRecords = IsoTypeReader.readUInt16(content);
        __CLR4_5_2eh6eh6lvlulmz5.R.inc(18771);for (int i = 0; (((i < numberOfRecords)&&(__CLR4_5_2eh6eh6lvlulmz5.R.iget(18772)!=0|true))||(__CLR4_5_2eh6eh6lvlulmz5.R.iget(18773)==0&false)); i++) {{
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18774);FontRecord fr = new FontRecord();
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18775);fr.parse(content);
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18776);entries.add(fr);
        }
    }}finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18777);
        __CLR4_5_2eh6eh6lvlulmz5.R.inc(18778);IsoTypeWriter.writeUInt16(byteBuffer, entries.size());
        __CLR4_5_2eh6eh6lvlulmz5.R.inc(18779);for (FontRecord record : entries) {{
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18780);record.getContent(byteBuffer);
        }
    }}finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

    public List<FontRecord> getEntries() {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18781);
        __CLR4_5_2eh6eh6lvlulmz5.R.inc(18782);return entries;
    }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

    public void setEntries(List<FontRecord> entries) {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18783);
        __CLR4_5_2eh6eh6lvlulmz5.R.inc(18784);this.entries = entries;
    }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

    public static class FontRecord {
        int fontId;
        String fontname;

        public FontRecord() {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18785);
        }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

        public FontRecord(int fontId, String fontname) {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18786);
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18787);this.fontId = fontId;
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18788);this.fontname = fontname;
        }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

        public void parse(ByteBuffer bb) {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18789);
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18790);fontId = IsoTypeReader.readUInt16(bb);
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18791);int length = IsoTypeReader.readUInt8(bb);
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18792);fontname = IsoTypeReader.readString(bb, length);
        }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

        public void getContent(ByteBuffer bb) {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18793);
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18794);IsoTypeWriter.writeUInt16(bb, fontId);
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18795);IsoTypeWriter.writeUInt8(bb, fontname.length());
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18796);bb.put(Utf8.convert(fontname));
        }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

        public int getSize() {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18797);
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18798);return Utf8.utf8StringLengthInBytes(fontname) + 3;
        }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2eh6eh6lvlulmz5.R.inc(18799);
            __CLR4_5_2eh6eh6lvlulmz5.R.inc(18800);return "FontRecord{" +
                    "fontId=" + fontId +
                    ", fontname='" + fontname + '\'' +
                    '}';
        }finally{__CLR4_5_2eh6eh6lvlulmz5.R.flushNeeded();}}
    }
}
