/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part12;


import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.DataSource;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

public class HintSampleEntry extends AbstractSampleEntry {public static class __CLR4_5_2g1dg1dlvlulnls{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,20811,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected byte[] data;

    public HintSampleEntry(String type) {
        super(type);__CLR4_5_2g1dg1dlvlulnls.R.inc(20786);try{__CLR4_5_2g1dg1dlvlulnls.R.inc(20785);
    }finally{__CLR4_5_2g1dg1dlvlulnls.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2g1dg1dlvlulnls.R.inc(20787);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20788);ByteBuffer b1 = ByteBuffer.allocate(8);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20789);dataSource.read(b1);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20790);b1.position(6);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20791);dataReferenceIndex = IsoTypeReader.readUInt16(b1);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20792);data = new byte[l2i(contentSize - 8)];
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20793);dataSource.read(ByteBuffer.wrap(data));
    }finally{__CLR4_5_2g1dg1dlvlulnls.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2g1dg1dlvlulnls.R.inc(20794);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20795);writableByteChannel.write(getHeader());

        __CLR4_5_2g1dg1dlvlulnls.R.inc(20796);ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20797);byteBuffer.position(6);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20798);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20799);byteBuffer.rewind();
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20800);writableByteChannel.write(byteBuffer);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20801);writableByteChannel.write(ByteBuffer.wrap(data));
    }finally{__CLR4_5_2g1dg1dlvlulnls.R.flushNeeded();}}

    public byte[] getData() {try{__CLR4_5_2g1dg1dlvlulnls.R.inc(20802);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20803);return data;
    }finally{__CLR4_5_2g1dg1dlvlulnls.R.flushNeeded();}}

    public void setData(byte[] data) {try{__CLR4_5_2g1dg1dlvlulnls.R.inc(20804);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20805);this.data = data;
    }finally{__CLR4_5_2g1dg1dlvlulnls.R.flushNeeded();}}



    @Override
    public long getSize() {try{__CLR4_5_2g1dg1dlvlulnls.R.inc(20806);
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20807);long s = 8 + data.length;
        __CLR4_5_2g1dg1dlvlulnls.R.inc(20808);return s + (((((largeBox || (s + 8) >= (1L << 32)) )&&(__CLR4_5_2g1dg1dlvlulnls.R.iget(20809)!=0|true))||(__CLR4_5_2g1dg1dlvlulnls.R.iget(20810)==0&false))? 16 : 8);
    }finally{__CLR4_5_2g1dg1dlvlulnls.R.flushNeeded();}}
}
