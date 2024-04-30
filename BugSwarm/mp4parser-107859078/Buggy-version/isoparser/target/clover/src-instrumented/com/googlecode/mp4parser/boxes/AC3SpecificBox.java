/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class AC3SpecificBox extends AbstractBox {public static class __CLR4_5_2ajvajvlvl9ej62{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,13727,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "dac3";
    int fscod;
    int bsid;
    int bsmod;
    int acmod;
    int lfeon;
    int bitRateCode;
    int reserved;

    public AC3SpecificBox() {
        super(TYPE);__CLR4_5_2ajvajvlvl9ej62.R.inc(13676);try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13675);
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13677);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13678);return 3;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13679);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13680);BitReaderBuffer brb = new BitReaderBuffer(content);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13681);fscod = brb.readBits(2);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13682);bsid = brb.readBits(5);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13683);bsmod = brb.readBits(3);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13684);acmod = brb.readBits(3);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13685);lfeon = brb.readBits(1);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13686);bitRateCode = brb.readBits(5);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13687);reserved = brb.readBits(5);
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13688);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13689);BitWriterBuffer bwb = new BitWriterBuffer(byteBuffer);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13690);bwb.writeBits(fscod, 2);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13691);bwb.writeBits(bsid, 5);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13692);bwb.writeBits(bsmod, 3);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13693);bwb.writeBits(acmod, 3);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13694);bwb.writeBits(lfeon, 1);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13695);bwb.writeBits(bitRateCode, 5);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13696);bwb.writeBits(reserved, 5);
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public int getFscod() {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13697);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13698);return fscod;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public void setFscod(int fscod) {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13699);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13700);this.fscod = fscod;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public int getBsid() {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13701);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13702);return bsid;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public void setBsid(int bsid) {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13703);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13704);this.bsid = bsid;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public int getBsmod() {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13705);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13706);return bsmod;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public void setBsmod(int bsmod) {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13707);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13708);this.bsmod = bsmod;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public int getAcmod() {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13709);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13710);return acmod;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public void setAcmod(int acmod) {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13711);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13712);this.acmod = acmod;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public int getLfeon() {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13713);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13714);return lfeon;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public void setLfeon(int lfeon) {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13715);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13716);this.lfeon = lfeon;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public int getBitRateCode() {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13717);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13718);return bitRateCode;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public void setBitRateCode(int bitRateCode) {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13719);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13720);this.bitRateCode = bitRateCode;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public int getReserved() {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13721);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13722);return reserved;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    public void setReserved(int reserved) {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13723);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13724);this.reserved = reserved;
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2ajvajvlvl9ej62.R.inc(13725);
        __CLR4_5_2ajvajvlvl9ej62.R.inc(13726);return "AC3SpecificBox{" +
                "fscod=" + fscod +
                ", bsid=" + bsid +
                ", bsmod=" + bsmod +
                ", acmod=" + acmod +
                ", lfeon=" + lfeon +
                ", bitRateCode=" + bitRateCode +
                ", reserved=" + reserved +
                '}';
    }finally{__CLR4_5_2ajvajvlvl9ej62.R.flushNeeded();}}
}
