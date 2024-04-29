/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.contentprotection;

import com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader;

import java.nio.ByteBuffer;
import java.util.UUID;

/**
 * Specifications &gt; Microsoft PlayReady Format Specification &gt; 2. PlayReady Media Format &gt; 2.7. ASF GUIDs
 * <p>
 * ASF_Protection_System_Identifier_Object
 * 9A04F079-9840-4286-AB92E65BE0885F95</p>
 * <p>
 * ASF_Content_Protection_System_Microsoft_PlayReady
 * F4637010-03C3-42CD-B932B48ADF3A6A54    </p>
 * <p>
 * ASF_StreamType_PlayReady_Encrypted_Command_Media
 * 8683973A-6639-463A-ABD764F1CE3EEAE0</p>
 * <p>
 * Specifications &gt; Microsoft PlayReady Format Specification &gt; 2. PlayReady Media Format &gt; 2.5. Data Objects &gt; 2.5.1. Payload TrackExtension for AES in Counter Mode</p>
 * <p>
 * The sample Id is used as the IV in CTR mode. Block offset, starting at 0 and incremented by 1 after every 16 bytes, from the beginning of the sample is used as the Counter.</p>
 * <p>
 * The sample ID for each sample (media object) is stored as an ASF payload extension system with the ID of ASF_Payload_Extension_Encryption_SampleID = {6698B84E-0AFA-4330-AEB2-1C0A98D7A44D}. The payload extension can be stored as a fixed size extension of 8 bytes.</p>
 * <p>
 * The sample ID is always stored in big-endian byte order.</p>
 */
public class GenericHeader extends ProtectionSpecificHeader {public static class __CLR4_5_2efmefmlvl9ekoi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18714,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static UUID PROTECTION_SYSTEM_ID = UUID.fromString("00000000-0000-0000-0000-000000000000");

    static {try{__CLR4_5_2efmefmlvl9ekoi.R.inc(18706);
        __CLR4_5_2efmefmlvl9ekoi.R.inc(18707);uuidRegistry.put(PROTECTION_SYSTEM_ID, GenericHeader.class);
    }finally{__CLR4_5_2efmefmlvl9ekoi.R.flushNeeded();}}

    ByteBuffer data;

    @Override
    public UUID getSystemId() {try{__CLR4_5_2efmefmlvl9ekoi.R.inc(18708);
        __CLR4_5_2efmefmlvl9ekoi.R.inc(18709);return PROTECTION_SYSTEM_ID;
    }finally{__CLR4_5_2efmefmlvl9ekoi.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer buffer) {try{__CLR4_5_2efmefmlvl9ekoi.R.inc(18710);
        __CLR4_5_2efmefmlvl9ekoi.R.inc(18711);data = buffer;
    }finally{__CLR4_5_2efmefmlvl9ekoi.R.flushNeeded();}}

    @Override
    public ByteBuffer getData() {try{__CLR4_5_2efmefmlvl9ekoi.R.inc(18712);
        __CLR4_5_2efmefmlvl9ekoi.R.inc(18713);return data;
    }finally{__CLR4_5_2efmefmlvl9ekoi.R.flushNeeded();}}

}
