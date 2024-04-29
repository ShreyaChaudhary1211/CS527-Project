/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;

/**
 *
 */
public abstract class AbstractTrackEncryptionBox extends AbstractFullBox {public static class __CLR4_5_2apxapxlvl9ejaa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,13955,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    int defaultAlgorithmId;
    int defaultIvSize;
    byte[] default_KID;

    protected AbstractTrackEncryptionBox(String type) {
        super(type);__CLR4_5_2apxapxlvl9ejaa.R.inc(13894);try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13893);
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    public int getDefaultAlgorithmId() {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13895);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13896);return defaultAlgorithmId;
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    public void setDefaultAlgorithmId(int defaultAlgorithmId) {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13897);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13898);this.defaultAlgorithmId = defaultAlgorithmId;
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    public int getDefaultIvSize() {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13899);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13900);return defaultIvSize;
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    public void setDefaultIvSize(int defaultIvSize) {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13901);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13902);this.defaultIvSize = defaultIvSize;
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    public UUID getDefault_KID() {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13903);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13904);ByteBuffer b = ByteBuffer.wrap(default_KID);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13905);b.order(ByteOrder.BIG_ENDIAN);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13906);return new UUID(b.getLong(), b.getLong());
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    public void setDefault_KID(UUID uuid) {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13907);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13908);ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13909);bb.putLong(uuid.getMostSignificantBits());
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13910);bb.putLong(uuid.getLeastSignificantBits());
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13911);this.default_KID = bb.array();
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13912);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13913);parseVersionAndFlags(content);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13914);defaultAlgorithmId = IsoTypeReader.readUInt24(content);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13915);defaultIvSize = IsoTypeReader.readUInt8(content);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13916);default_KID = new byte[16];
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13917);content.get(default_KID);
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13918);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13919);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13920);IsoTypeWriter.writeUInt24(byteBuffer, defaultAlgorithmId);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13921);IsoTypeWriter.writeUInt8(byteBuffer, defaultIvSize);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13922);byteBuffer.put(default_KID);
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13923);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13924);return 24;
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13925);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13926);if ((((this == o)&&(__CLR4_5_2apxapxlvl9ejaa.R.iget(13927)!=0|true))||(__CLR4_5_2apxapxlvl9ejaa.R.iget(13928)==0&false))) {__CLR4_5_2apxapxlvl9ejaa.R.inc(13929);return true;
        }__CLR4_5_2apxapxlvl9ejaa.R.inc(13930);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2apxapxlvl9ejaa.R.iget(13931)!=0|true))||(__CLR4_5_2apxapxlvl9ejaa.R.iget(13932)==0&false))) {__CLR4_5_2apxapxlvl9ejaa.R.inc(13933);return false;

        }__CLR4_5_2apxapxlvl9ejaa.R.inc(13934);AbstractTrackEncryptionBox that = (AbstractTrackEncryptionBox) o;

        __CLR4_5_2apxapxlvl9ejaa.R.inc(13935);if ((((defaultAlgorithmId != that.defaultAlgorithmId)&&(__CLR4_5_2apxapxlvl9ejaa.R.iget(13936)!=0|true))||(__CLR4_5_2apxapxlvl9ejaa.R.iget(13937)==0&false))) {__CLR4_5_2apxapxlvl9ejaa.R.inc(13938);return false;
        }__CLR4_5_2apxapxlvl9ejaa.R.inc(13939);if ((((defaultIvSize != that.defaultIvSize)&&(__CLR4_5_2apxapxlvl9ejaa.R.iget(13940)!=0|true))||(__CLR4_5_2apxapxlvl9ejaa.R.iget(13941)==0&false))) {__CLR4_5_2apxapxlvl9ejaa.R.inc(13942);return false;
        }__CLR4_5_2apxapxlvl9ejaa.R.inc(13943);if ((((!Arrays.equals(default_KID, that.default_KID))&&(__CLR4_5_2apxapxlvl9ejaa.R.iget(13944)!=0|true))||(__CLR4_5_2apxapxlvl9ejaa.R.iget(13945)==0&false))) {__CLR4_5_2apxapxlvl9ejaa.R.inc(13946);return false;

        }__CLR4_5_2apxapxlvl9ejaa.R.inc(13947);return true;
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2apxapxlvl9ejaa.R.inc(13948);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13949);int result = defaultAlgorithmId;
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13950);result = 31 * result + defaultIvSize;
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13951);result = 31 * result + ((((default_KID != null )&&(__CLR4_5_2apxapxlvl9ejaa.R.iget(13952)!=0|true))||(__CLR4_5_2apxapxlvl9ejaa.R.iget(13953)==0&false))? Arrays.hashCode(default_KID) : 0);
        __CLR4_5_2apxapxlvl9ejaa.R.inc(13954);return result;
    }finally{__CLR4_5_2apxapxlvl9ejaa.R.flushNeeded();}}
}
