/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part30;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;

import java.io.IOException;
import java.nio.ByteBuffer;

import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.DataSource;

import java.nio.channels.WritableByteChannel;

public class XMLSubtitleSampleEntry extends AbstractSampleEntry {public static class __CLR4_5_2gzpgzplvlulnxm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,22068,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE = "stpp";

    private String namespace = "";
    private String schemaLocation = "";
    private String auxiliaryMimeTypes = "";

    public XMLSubtitleSampleEntry() {
        super(TYPE);__CLR4_5_2gzpgzplvlulnxm.R.inc(22022);try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22021);
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}

    @Override
    public long getSize() {try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22023);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22024);long s = getContainerSize();
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22025);long t = 8 + namespace.length() + schemaLocation.length() + auxiliaryMimeTypes.length() + 3;
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22026);return s + t + (((((largeBox || (s + t + 8) >= (1L << 32)) )&&(__CLR4_5_2gzpgzplvlulnxm.R.iget(22027)!=0|true))||(__CLR4_5_2gzpgzplvlulnxm.R.iget(22028)==0&false))? 16 : 8);
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22029);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22030);ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22031);dataSource.read((ByteBuffer) byteBuffer.rewind());
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22032);byteBuffer.position(6);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22033);dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);

        __CLR4_5_2gzpgzplvlulnxm.R.inc(22034);long start = dataSource.position();
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22035);ByteBuffer content = ByteBuffer.allocate(1024);

        __CLR4_5_2gzpgzplvlulnxm.R.inc(22036);dataSource.read((ByteBuffer) content.rewind());
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22037);namespace = IsoTypeReader.readString((ByteBuffer) content.rewind());
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22038);dataSource.position(start + namespace.length() + 1);

        __CLR4_5_2gzpgzplvlulnxm.R.inc(22039);dataSource.read((ByteBuffer) content.rewind());
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22040);schemaLocation = IsoTypeReader.readString((ByteBuffer) content.rewind());
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22041);dataSource.position(start + namespace.length() + schemaLocation.length() + 2);

        __CLR4_5_2gzpgzplvlulnxm.R.inc(22042);dataSource.read((ByteBuffer) content.rewind());
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22043);auxiliaryMimeTypes = IsoTypeReader.readString((ByteBuffer) content.rewind());
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22044);dataSource.position(start + namespace.length() + schemaLocation.length() + auxiliaryMimeTypes.length() + 3);

        __CLR4_5_2gzpgzplvlulnxm.R.inc(22045);initContainer(dataSource, contentSize - (header.remaining() + namespace.length() + schemaLocation.length() + auxiliaryMimeTypes.length() + 3), boxParser);
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22046);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22047);writableByteChannel.write(getHeader());
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22048);ByteBuffer byteBuffer = ByteBuffer.allocate(8 + namespace.length() + schemaLocation.length() + auxiliaryMimeTypes.length() + 3);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22049);byteBuffer.position(6);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22050);IsoTypeWriter.writeUInt16(byteBuffer, dataReferenceIndex);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22051);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, namespace);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22052);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, schemaLocation);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22053);IsoTypeWriter.writeZeroTermUtf8String(byteBuffer, auxiliaryMimeTypes);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22054);writableByteChannel.write((ByteBuffer) byteBuffer.rewind());
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22055);writeContainer(writableByteChannel);
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}

    public String getNamespace() {try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22056);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22057);return namespace;
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}

    public void setNamespace(String namespace) {try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22058);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22059);this.namespace = namespace;
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}

    public String getSchemaLocation() {try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22060);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22061);return schemaLocation;
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}

    public void setSchemaLocation(String schemaLocation) {try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22062);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22063);this.schemaLocation = schemaLocation;
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}

    public String getAuxiliaryMimeTypes() {try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22064);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22065);return auxiliaryMimeTypes;
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}

    public void setAuxiliaryMimeTypes(String auxiliaryMimeTypes) {try{__CLR4_5_2gzpgzplvlulnxm.R.inc(22066);
        __CLR4_5_2gzpgzplvlulnxm.R.inc(22067);this.auxiliaryMimeTypes = auxiliaryMimeTypes;
    }finally{__CLR4_5_2gzpgzplvlulnxm.R.flushNeeded();}}
}

