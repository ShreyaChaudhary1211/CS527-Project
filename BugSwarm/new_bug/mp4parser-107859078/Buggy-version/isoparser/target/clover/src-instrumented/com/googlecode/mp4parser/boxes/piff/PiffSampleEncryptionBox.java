/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox;

/**
 * <pre>
 * aligned(8) class SampleEncryptionBox extends FullBox(\u2018uuid\u2019, extended_type= 0xA2394F52-5A9B-4f14-A244-6C427C648DF4, version=0, flags=0)
 * {
 *  if (flags &amp; 0x000001)
 *  {
 *   unsigned int(24) AlgorithmID;
 *   unsigned int(8) IV_size;
 *   unsigned int(8)[16] KID;
 *  }
 *  unsigned int (32) sample_count;
 *  {
 *   unsigned int(IV_size) InitializationVector;
 *   if (flags &amp; 0x000002)
 *   {
 *    unsigned int(16) NumberOfEntries;
 *    {
 *     unsigned int(16) BytesOfClearData;
 *     unsigned int(32) BytesOfEncryptedData;
 *    } [ NumberOfEntries]
 *   }
 *  }[ sample_count ]
 * }
 * </pre>
 */
public class PiffSampleEncryptionBox extends AbstractSampleEncryptionBox {public static class __CLR4_5_2e4te4tlvl9ekm6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18341,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Creates a AbstractSampleEncryptionBox for non-h264 tracks.
     */
    public PiffSampleEncryptionBox() {
        super("uuid");__CLR4_5_2e4te4tlvl9ekm6.R.inc(18318);try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18317);

    }finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}

    @Override
    public byte[] getUserType() {try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18319);
        __CLR4_5_2e4te4tlvl9ekm6.R.inc(18320);return new byte[]{(byte) 0xA2, 0x39, 0x4F, 0x52, 0x5A, (byte) 0x9B, 0x4f, 0x14, (byte) 0xA2, 0x44, 0x6C, 0x42, 0x7C, 0x64, (byte) 0x8D, (byte) 0xF4};
    }finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}

    public int getAlgorithmId() {try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18321);
        __CLR4_5_2e4te4tlvl9ekm6.R.inc(18322);return algorithmId;
    }finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}

    public void setAlgorithmId(int algorithmId) {try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18323);
        __CLR4_5_2e4te4tlvl9ekm6.R.inc(18324);this.algorithmId = algorithmId;
    }finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}

    public int getIvSize() {try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18325);
        __CLR4_5_2e4te4tlvl9ekm6.R.inc(18326);return ivSize;
    }finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}

    public void setIvSize(int ivSize) {try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18327);
        __CLR4_5_2e4te4tlvl9ekm6.R.inc(18328);this.ivSize = ivSize;
    }finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}

    public byte[] getKid() {try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18329);
        __CLR4_5_2e4te4tlvl9ekm6.R.inc(18330);return kid;
    }finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}

    public void setKid(byte[] kid) {try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18331);
        __CLR4_5_2e4te4tlvl9ekm6.R.inc(18332);this.kid = kid;
    }finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}

    @DoNotParseDetail
    public boolean isOverrideTrackEncryptionBoxParameters() {try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18333);
        __CLR4_5_2e4te4tlvl9ekm6.R.inc(18334);return (getFlags() & 0x1) > 0;
    }finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}


    @DoNotParseDetail
    public void setOverrideTrackEncryptionBoxParameters(boolean b) {try{__CLR4_5_2e4te4tlvl9ekm6.R.inc(18335);
        __CLR4_5_2e4te4tlvl9ekm6.R.inc(18336);if ((((b)&&(__CLR4_5_2e4te4tlvl9ekm6.R.iget(18337)!=0|true))||(__CLR4_5_2e4te4tlvl9ekm6.R.iget(18338)==0&false))) {{
            __CLR4_5_2e4te4tlvl9ekm6.R.inc(18339);setFlags(getFlags() | 0x1);
        } }else {{
            __CLR4_5_2e4te4tlvl9ekm6.R.inc(18340);setFlags(getFlags() & (0xffffff ^ 0x1));
        }
    }}finally{__CLR4_5_2e4te4tlvl9ekm6.R.flushNeeded();}}

}
