/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;

import java.nio.ByteBuffer;

/**
 * A sync sample sample group entry identifies samples containing a sync sample of a specific type.
 */
public class SyncSampleEntry extends GroupEntry {public static class __CLR4_5_2gn7gn7lvl9el98{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,21614,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "sync";

    int reserved;
    int nalUnitType;

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21571);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21572);int a = IsoTypeReader.readUInt8(byteBuffer);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21573);reserved = (a & 0xC0) >> 6;
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21574);nalUnitType = a & 0x3F;
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21575);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21576);ByteBuffer b = ByteBuffer.allocate(1);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21577);IsoTypeWriter.writeUInt8(b, (nalUnitType + (reserved << 6)));
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21578);return (ByteBuffer) b.rewind();
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21579);


        __CLR4_5_2gn7gn7lvl9el98.R.inc(21580);if ((((this == o)&&(__CLR4_5_2gn7gn7lvl9el98.R.iget(21581)!=0|true))||(__CLR4_5_2gn7gn7lvl9el98.R.iget(21582)==0&false))) {__CLR4_5_2gn7gn7lvl9el98.R.inc(21583);return true;
        }__CLR4_5_2gn7gn7lvl9el98.R.inc(21584);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2gn7gn7lvl9el98.R.iget(21585)!=0|true))||(__CLR4_5_2gn7gn7lvl9el98.R.iget(21586)==0&false))) {__CLR4_5_2gn7gn7lvl9el98.R.inc(21587);return false;

        }__CLR4_5_2gn7gn7lvl9el98.R.inc(21588);SyncSampleEntry that = (SyncSampleEntry) o;

        __CLR4_5_2gn7gn7lvl9el98.R.inc(21589);if ((((nalUnitType != that.nalUnitType)&&(__CLR4_5_2gn7gn7lvl9el98.R.iget(21590)!=0|true))||(__CLR4_5_2gn7gn7lvl9el98.R.iget(21591)==0&false))) {__CLR4_5_2gn7gn7lvl9el98.R.inc(21592);return false;
        }__CLR4_5_2gn7gn7lvl9el98.R.inc(21593);if ((((reserved != that.reserved)&&(__CLR4_5_2gn7gn7lvl9el98.R.iget(21594)!=0|true))||(__CLR4_5_2gn7gn7lvl9el98.R.iget(21595)==0&false))) {__CLR4_5_2gn7gn7lvl9el98.R.inc(21596);return false;

        }__CLR4_5_2gn7gn7lvl9el98.R.inc(21597);return true;
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21598);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21599);int result = reserved;
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21600);result = 31 * result + nalUnitType;
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21601);return result;
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}

    public int getReserved() {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21602);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21603);return reserved;
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}

    public void setReserved(int reserved) {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21604);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21605);this.reserved = reserved;
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}

    public int getNalUnitType() {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21606);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21607);return nalUnitType;
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}

    public void setNalUnitType(int nalUnitType) {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21608);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21609);this.nalUnitType = nalUnitType;
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}

    @Override
    public String getType() {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21610);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21611);return TYPE;
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2gn7gn7lvl9el98.R.inc(21612);
        __CLR4_5_2gn7gn7lvl9el98.R.inc(21613);return "SyncSampleEntry{" +
                "reserved=" + reserved +
                ", nalUnitType=" + nalUnitType +
                '}';
    }finally{__CLR4_5_2gn7gn7lvl9el98.R.flushNeeded();}}
}
