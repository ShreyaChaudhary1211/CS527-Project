/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;

import java.nio.ByteBuffer;


/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class MLPSpecificBox extends AbstractBox {public static class __CLR4_5_2az6az6lvl9ejbn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,14258,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "dmlp";

    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    public MLPSpecificBox() {
        super(TYPE);__CLR4_5_2az6az6lvl9ejbn.R.inc(14227);try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14226);
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14228);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14229);return 10;
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14230);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14231);BitReaderBuffer brb = new BitReaderBuffer(content);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14232);format_info = brb.readBits(32);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14233);peak_data_rate = brb.readBits(15);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14234);reserved = brb.readBits(1);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14235);reserved2 = brb.readBits(32);
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14236);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14237);BitWriterBuffer bwb = new BitWriterBuffer(byteBuffer);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14238);bwb.writeBits(format_info, 32);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14239);bwb.writeBits(peak_data_rate, 15);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14240);bwb.writeBits(reserved, 1);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14241);bwb.writeBits(reserved2, 32);
        //To change body of implemented methods use File | Settings | File Templates.
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    public int getFormat_info() {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14242);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14243);return format_info;
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    public void setFormat_info(int format_info) {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14244);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14245);this.format_info = format_info;
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    public int getPeak_data_rate() {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14246);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14247);return peak_data_rate;
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    public void setPeak_data_rate(int peak_data_rate) {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14248);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14249);this.peak_data_rate = peak_data_rate;
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    public int getReserved() {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14250);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14251);return reserved;
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    public void setReserved(int reserved) {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14252);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14253);this.reserved = reserved;
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    public int getReserved2() {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14254);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14255);return reserved2;
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}

    public void setReserved2(int reserved2) {try{__CLR4_5_2az6az6lvl9ejbn.R.inc(14256);
        __CLR4_5_2az6az6lvl9ejbn.R.inc(14257);this.reserved2 = reserved2;
    }finally{__CLR4_5_2az6az6lvl9ejbn.R.flushNeeded();}}
}
