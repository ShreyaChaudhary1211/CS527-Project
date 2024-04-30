/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.io.IOException;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.DataSource;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class Ovc1VisualSampleEntryImpl extends AbstractSampleEntry {public static class __CLR4_5_237v37vlvl9efp3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,4196,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private byte[] vc1Content = new byte[0];
    public static final String TYPE = "ovc1";

    public Ovc1VisualSampleEntryImpl() {
        super(TYPE);__CLR4_5_237v37vlvl9efp3.R.inc(4172);try{__CLR4_5_237v37vlvl9efp3.R.inc(4171);
    }finally{__CLR4_5_237v37vlvl9efp3.R.flushNeeded();}}

    public byte[] getVc1Content() {try{__CLR4_5_237v37vlvl9efp3.R.inc(4173);
        __CLR4_5_237v37vlvl9efp3.R.inc(4174);return vc1Content;
    }finally{__CLR4_5_237v37vlvl9efp3.R.flushNeeded();}}

    public void setVc1Content(byte[] vc1Content) {try{__CLR4_5_237v37vlvl9efp3.R.inc(4175);
        __CLR4_5_237v37vlvl9efp3.R.inc(4176);this.vc1Content = vc1Content;
    }finally{__CLR4_5_237v37vlvl9efp3.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_237v37vlvl9efp3.R.inc(4177);
        __CLR4_5_237v37vlvl9efp3.R.inc(4178);ByteBuffer byteBuffer = ByteBuffer.allocate(l2i(contentSize));
        __CLR4_5_237v37vlvl9efp3.R.inc(4179);dataSource.read(byteBuffer);
        __CLR4_5_237v37vlvl9efp3.R.inc(4180);byteBuffer.position(6);
        __CLR4_5_237v37vlvl9efp3.R.inc(4181);dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        __CLR4_5_237v37vlvl9efp3.R.inc(4182);vc1Content = new byte[byteBuffer.remaining()];
        __CLR4_5_237v37vlvl9efp3.R.inc(4183);byteBuffer.get(vc1Content);
    }finally{__CLR4_5_237v37vlvl9efp3.R.flushNeeded();}}


    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_237v37vlvl9efp3.R.inc(4184);
        __CLR4_5_237v37vlvl9efp3.R.inc(4185);writableByteChannel.write(getHeader());
        __CLR4_5_237v37vlvl9efp3.R.inc(4186);ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        __CLR4_5_237v37vlvl9efp3.R.inc(4187);byteBuffer.position(6);
        __CLR4_5_237v37vlvl9efp3.R.inc(4188);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_237v37vlvl9efp3.R.inc(4189);writableByteChannel.write((ByteBuffer) byteBuffer.rewind());
        __CLR4_5_237v37vlvl9efp3.R.inc(4190);writableByteChannel.write(ByteBuffer.wrap(vc1Content));
    }finally{__CLR4_5_237v37vlvl9efp3.R.flushNeeded();}}

    @Override
    public long getSize() {try{__CLR4_5_237v37vlvl9efp3.R.inc(4191);
        __CLR4_5_237v37vlvl9efp3.R.inc(4192);long header = ((((largeBox || (vc1Content.length + 16) >= (1L << 32)) )&&(__CLR4_5_237v37vlvl9efp3.R.iget(4193)!=0|true))||(__CLR4_5_237v37vlvl9efp3.R.iget(4194)==0&false))? 16 : 8;
        __CLR4_5_237v37vlvl9efp3.R.inc(4195);return header + vc1Content.length + 8;
    }finally{__CLR4_5_237v37vlvl9efp3.R.flushNeeded();}}

}
