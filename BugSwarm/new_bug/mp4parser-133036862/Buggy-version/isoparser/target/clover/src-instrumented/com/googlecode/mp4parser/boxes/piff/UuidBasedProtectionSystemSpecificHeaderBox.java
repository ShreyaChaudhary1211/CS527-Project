/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.util.UUIDConverter;

import java.nio.ByteBuffer;
import java.util.UUID;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "uuid", d08a4f18-10f3-4a82-b6c8-32d8aba183d3</h1>
 * aligned(8) class UuidBasedProtectionSystemSpecificHeaderBox extends FullBox(\u2018uuid\u2019,
 * extended_type=0xd08a4f18-10f3-4a82-b6c8-32d8aba183d3,
 * version=0, flags=0)
 * {
 * unsigned int(8)[16] SystemID;
 * unsigned int(32) DataSize;
 * unsigned int(8)[DataSize] Data;
 * }
 */
public class UuidBasedProtectionSystemSpecificHeaderBox extends AbstractFullBox {public static class __CLR4_5_2ebgebglvlulmxm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,18596,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static byte[] USER_TYPE = new byte[]{(byte) 0xd0, (byte) 0x8a, 0x4f, 0x18, 0x10, (byte) 0xf3, 0x4a, (byte) 0x82,
            (byte) 0xb6, (byte) 0xc8, 0x32, (byte) 0xd8, (byte) 0xab, (byte) 0xa1, (byte) 0x83, (byte) 0xd3};

    UUID systemId;

    ProtectionSpecificHeader protectionSpecificHeader;

    public UuidBasedProtectionSystemSpecificHeaderBox() {
        super("uuid", USER_TYPE);__CLR4_5_2ebgebglvlulmxm.R.inc(18557);try{__CLR4_5_2ebgebglvlulmxm.R.inc(18556);
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18558);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18559);return 24 + protectionSpecificHeader.getData().limit();
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    @Override
    public byte[] getUserType() {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18560);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18561);return USER_TYPE;
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18562);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18563);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18564);IsoTypeWriter.writeUInt64(byteBuffer, systemId.getMostSignificantBits());
        __CLR4_5_2ebgebglvlulmxm.R.inc(18565);IsoTypeWriter.writeUInt64(byteBuffer, systemId.getLeastSignificantBits());
        __CLR4_5_2ebgebglvlulmxm.R.inc(18566);ByteBuffer data = protectionSpecificHeader.getData();
        __CLR4_5_2ebgebglvlulmxm.R.inc(18567);data.rewind();
        __CLR4_5_2ebgebglvlulmxm.R.inc(18568);IsoTypeWriter.writeUInt32(byteBuffer, data.limit());
        __CLR4_5_2ebgebglvlulmxm.R.inc(18569);byteBuffer.put(data);
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18570);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18571);parseVersionAndFlags(content);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18572);byte[] systemIdBytes = new byte[16];
        __CLR4_5_2ebgebglvlulmxm.R.inc(18573);content.get(systemIdBytes);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18574);systemId = UUIDConverter.convert(systemIdBytes);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18575);int dataSize = l2i(IsoTypeReader.readUInt32(content));
        __CLR4_5_2ebgebglvlulmxm.R.inc(18576);protectionSpecificHeader = ProtectionSpecificHeader.createFor(systemId, content);
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    public UUID getSystemId() {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18577);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18578);return systemId;
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    public void setSystemId(UUID systemId) {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18579);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18580);this.systemId = systemId;
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    public String getSystemIdString() {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18581);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18582);return systemId.toString();
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    public ProtectionSpecificHeader getProtectionSpecificHeader() {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18583);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18584);return protectionSpecificHeader;
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    public String getProtectionSpecificHeaderString() {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18585);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18586);return protectionSpecificHeader.toString();
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    public void setProtectionSpecificHeader(ProtectionSpecificHeader protectionSpecificHeader) {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18587);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18588);this.protectionSpecificHeader = protectionSpecificHeader;
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2ebgebglvlulmxm.R.inc(18589);
        __CLR4_5_2ebgebglvlulmxm.R.inc(18590);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2ebgebglvlulmxm.R.inc(18591);sb.append("UuidBasedProtectionSystemSpecificHeaderBox");
        __CLR4_5_2ebgebglvlulmxm.R.inc(18592);sb.append("{systemId=").append(systemId.toString());
        __CLR4_5_2ebgebglvlulmxm.R.inc(18593);sb.append(", dataSize=").append(protectionSpecificHeader.getData().limit());
        __CLR4_5_2ebgebglvlulmxm.R.inc(18594);sb.append('}');
        __CLR4_5_2ebgebglvlulmxm.R.inc(18595);return sb.toString();
    }finally{__CLR4_5_2ebgebglvlulmxm.R.flushNeeded();}}


}
