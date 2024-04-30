/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class AC3SpecificBox extends AbstractBox {public static class __CLR4_5_2amiamilvluljjh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,13822,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "dac3";
    int fscod;
    int bsid;
    int bsmod;
    int acmod;
    int lfeon;
    int bitRateCode;
    int reserved;

    public AC3SpecificBox() {
        super(TYPE);__CLR4_5_2amiamilvluljjh.R.inc(13771);try{__CLR4_5_2amiamilvluljjh.R.inc(13770);
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2amiamilvluljjh.R.inc(13772);
        __CLR4_5_2amiamilvluljjh.R.inc(13773);return 3;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2amiamilvluljjh.R.inc(13774);
        __CLR4_5_2amiamilvluljjh.R.inc(13775);BitReaderBuffer brb = new BitReaderBuffer(content);
        __CLR4_5_2amiamilvluljjh.R.inc(13776);fscod = brb.readBits(2);
        __CLR4_5_2amiamilvluljjh.R.inc(13777);bsid = brb.readBits(5);
        __CLR4_5_2amiamilvluljjh.R.inc(13778);bsmod = brb.readBits(3);
        __CLR4_5_2amiamilvluljjh.R.inc(13779);acmod = brb.readBits(3);
        __CLR4_5_2amiamilvluljjh.R.inc(13780);lfeon = brb.readBits(1);
        __CLR4_5_2amiamilvluljjh.R.inc(13781);bitRateCode = brb.readBits(5);
        __CLR4_5_2amiamilvluljjh.R.inc(13782);reserved = brb.readBits(5);
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2amiamilvluljjh.R.inc(13783);
        __CLR4_5_2amiamilvluljjh.R.inc(13784);BitWriterBuffer bwb = new BitWriterBuffer(byteBuffer);
        __CLR4_5_2amiamilvluljjh.R.inc(13785);bwb.writeBits(fscod, 2);
        __CLR4_5_2amiamilvluljjh.R.inc(13786);bwb.writeBits(bsid, 5);
        __CLR4_5_2amiamilvluljjh.R.inc(13787);bwb.writeBits(bsmod, 3);
        __CLR4_5_2amiamilvluljjh.R.inc(13788);bwb.writeBits(acmod, 3);
        __CLR4_5_2amiamilvluljjh.R.inc(13789);bwb.writeBits(lfeon, 1);
        __CLR4_5_2amiamilvluljjh.R.inc(13790);bwb.writeBits(bitRateCode, 5);
        __CLR4_5_2amiamilvluljjh.R.inc(13791);bwb.writeBits(reserved, 5);
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public int getFscod() {try{__CLR4_5_2amiamilvluljjh.R.inc(13792);
        __CLR4_5_2amiamilvluljjh.R.inc(13793);return fscod;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public void setFscod(int fscod) {try{__CLR4_5_2amiamilvluljjh.R.inc(13794);
        __CLR4_5_2amiamilvluljjh.R.inc(13795);this.fscod = fscod;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public int getBsid() {try{__CLR4_5_2amiamilvluljjh.R.inc(13796);
        __CLR4_5_2amiamilvluljjh.R.inc(13797);return bsid;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public void setBsid(int bsid) {try{__CLR4_5_2amiamilvluljjh.R.inc(13798);
        __CLR4_5_2amiamilvluljjh.R.inc(13799);this.bsid = bsid;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public int getBsmod() {try{__CLR4_5_2amiamilvluljjh.R.inc(13800);
        __CLR4_5_2amiamilvluljjh.R.inc(13801);return bsmod;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public void setBsmod(int bsmod) {try{__CLR4_5_2amiamilvluljjh.R.inc(13802);
        __CLR4_5_2amiamilvluljjh.R.inc(13803);this.bsmod = bsmod;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public int getAcmod() {try{__CLR4_5_2amiamilvluljjh.R.inc(13804);
        __CLR4_5_2amiamilvluljjh.R.inc(13805);return acmod;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public void setAcmod(int acmod) {try{__CLR4_5_2amiamilvluljjh.R.inc(13806);
        __CLR4_5_2amiamilvluljjh.R.inc(13807);this.acmod = acmod;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public int getLfeon() {try{__CLR4_5_2amiamilvluljjh.R.inc(13808);
        __CLR4_5_2amiamilvluljjh.R.inc(13809);return lfeon;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public void setLfeon(int lfeon) {try{__CLR4_5_2amiamilvluljjh.R.inc(13810);
        __CLR4_5_2amiamilvluljjh.R.inc(13811);this.lfeon = lfeon;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public int getBitRateCode() {try{__CLR4_5_2amiamilvluljjh.R.inc(13812);
        __CLR4_5_2amiamilvluljjh.R.inc(13813);return bitRateCode;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public void setBitRateCode(int bitRateCode) {try{__CLR4_5_2amiamilvluljjh.R.inc(13814);
        __CLR4_5_2amiamilvluljjh.R.inc(13815);this.bitRateCode = bitRateCode;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public int getReserved() {try{__CLR4_5_2amiamilvluljjh.R.inc(13816);
        __CLR4_5_2amiamilvluljjh.R.inc(13817);return reserved;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    public void setReserved(int reserved) {try{__CLR4_5_2amiamilvluljjh.R.inc(13818);
        __CLR4_5_2amiamilvluljjh.R.inc(13819);this.reserved = reserved;
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2amiamilvluljjh.R.inc(13820);
        __CLR4_5_2amiamilvluljjh.R.inc(13821);return "AC3SpecificBox{" +
                "fscod=" + fscod +
                ", bsid=" + bsid +
                ", bsmod=" + bsmod +
                ", acmod=" + acmod +
                ", lfeon=" + lfeon +
                ", bitRateCode=" + bitRateCode +
                ", reserved=" + reserved +
                '}';
    }finally{__CLR4_5_2amiamilvluljjh.R.flushNeeded();}}
}
