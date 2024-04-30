/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "uuid", 6d1d9b05-42d5-44e6-80e2-141daff757b2</h1>
  * The syntax of the fields defined in this section, specified in ABNF [RFC5234], is as follows:
 * TfxdBox = TfxdBoxLength TfxdBoxType [TfxdBoxLongLength] TfxdBoxUUID TfxdBoxFields
 * TfxdBoxChildren
 * TfxdBoxType = "u" "u" "i" "d"
 * TfxdBoxLength = BoxLength
 * TfxdBoxLongLength = LongBoxLength
 * TfxdBoxUUID = %x6D %x1D %x9B %x05 %x42 %xD5 %x44 %xE6
 * %x80 %xE2 %x14 %x1D %xAF %xF7 %x57 %xB2
 * TfxdBoxFields = TfxdBoxVersion
 * TfxdBoxFlags
 * TfxdBoxDataFields32 / TfxdBoxDataFields64
 * TfxdBoxVersion = %x00 / %x01
 * TfxdBoxFlags = 24*24 RESERVED_BIT
 * TfxdBoxDataFields32 = FragmentAbsoluteTime32
 * FragmentDuration32
 * TfxdBoxDataFields64 = FragmentAbsoluteTime64
 * FragmentDuration64
 * FragmentAbsoluteTime64 = UNSIGNED_INT32
 * FragmentDuration64 = UNSIGNED_INT32
 * FragmentAbsoluteTime64 = UNSIGNED_INT64
 * FragmentDuration64 = UNSIGNED_INT64
 * TfxdBoxChildren = *( VendorExtensionUUIDBox )
 */
//@ExtendedUserType(uuid = "6d1d9b05-42d5-44e6-80e2-141daff757b2")
public class TfxdBox extends AbstractFullBox {public static class __CLR4_5_2e7ze7zlvl9ekns{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18461,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public long fragmentAbsoluteTime;
    public long fragmentAbsoluteDuration;

    public TfxdBox() {
        super("uuid");__CLR4_5_2e7ze7zlvl9ekns.R.inc(18432);try{__CLR4_5_2e7ze7zlvl9ekns.R.inc(18431);
    }finally{__CLR4_5_2e7ze7zlvl9ekns.R.flushNeeded();}}

    @Override
    public byte[] getUserType() {try{__CLR4_5_2e7ze7zlvl9ekns.R.inc(18433);
        __CLR4_5_2e7ze7zlvl9ekns.R.inc(18434);return new byte[]{(byte) 0x6d, (byte) 0x1d, (byte) 0x9b, (byte) 0x05, (byte) 0x42, (byte) 0xd5, (byte) 0x44,
                (byte) 0xe6, (byte) 0x80, (byte) 0xe2, 0x14, (byte) 0x1d, (byte) 0xaf, (byte) 0xf7, (byte) 0x57, (byte) 0xb2};
    }finally{__CLR4_5_2e7ze7zlvl9ekns.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2e7ze7zlvl9ekns.R.inc(18435);
        __CLR4_5_2e7ze7zlvl9ekns.R.inc(18436);return (((getVersion() == 0x01 )&&(__CLR4_5_2e7ze7zlvl9ekns.R.iget(18437)!=0|true))||(__CLR4_5_2e7ze7zlvl9ekns.R.iget(18438)==0&false))? 20 : 12;
    }finally{__CLR4_5_2e7ze7zlvl9ekns.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2e7ze7zlvl9ekns.R.inc(18439);
        __CLR4_5_2e7ze7zlvl9ekns.R.inc(18440);parseVersionAndFlags(content);

        __CLR4_5_2e7ze7zlvl9ekns.R.inc(18441);if ((((getVersion() == 0x01)&&(__CLR4_5_2e7ze7zlvl9ekns.R.iget(18442)!=0|true))||(__CLR4_5_2e7ze7zlvl9ekns.R.iget(18443)==0&false))) {{
            __CLR4_5_2e7ze7zlvl9ekns.R.inc(18444);fragmentAbsoluteTime = IsoTypeReader.readUInt64(content);
            __CLR4_5_2e7ze7zlvl9ekns.R.inc(18445);fragmentAbsoluteDuration = IsoTypeReader.readUInt64(content);
        } }else {{
            __CLR4_5_2e7ze7zlvl9ekns.R.inc(18446);fragmentAbsoluteTime = IsoTypeReader.readUInt32(content);
            __CLR4_5_2e7ze7zlvl9ekns.R.inc(18447);fragmentAbsoluteDuration = IsoTypeReader.readUInt32(content);
        }
    }}finally{__CLR4_5_2e7ze7zlvl9ekns.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2e7ze7zlvl9ekns.R.inc(18448);
        __CLR4_5_2e7ze7zlvl9ekns.R.inc(18449);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2e7ze7zlvl9ekns.R.inc(18450);if ((((getVersion() == 0x01)&&(__CLR4_5_2e7ze7zlvl9ekns.R.iget(18451)!=0|true))||(__CLR4_5_2e7ze7zlvl9ekns.R.iget(18452)==0&false))) {{
            __CLR4_5_2e7ze7zlvl9ekns.R.inc(18453);IsoTypeWriter.writeUInt64(byteBuffer, fragmentAbsoluteTime);
            __CLR4_5_2e7ze7zlvl9ekns.R.inc(18454);IsoTypeWriter.writeUInt64(byteBuffer, fragmentAbsoluteDuration);
        } }else {{
            __CLR4_5_2e7ze7zlvl9ekns.R.inc(18455);IsoTypeWriter.writeUInt32(byteBuffer, fragmentAbsoluteTime);
            __CLR4_5_2e7ze7zlvl9ekns.R.inc(18456);IsoTypeWriter.writeUInt32(byteBuffer, fragmentAbsoluteDuration);
        }
    }}finally{__CLR4_5_2e7ze7zlvl9ekns.R.flushNeeded();}}

    public long getFragmentAbsoluteTime() {try{__CLR4_5_2e7ze7zlvl9ekns.R.inc(18457);
        __CLR4_5_2e7ze7zlvl9ekns.R.inc(18458);return fragmentAbsoluteTime;
    }finally{__CLR4_5_2e7ze7zlvl9ekns.R.flushNeeded();}}

    public long getFragmentAbsoluteDuration() {try{__CLR4_5_2e7ze7zlvl9ekns.R.inc(18459);
        __CLR4_5_2e7ze7zlvl9ekns.R.inc(18460);return fragmentAbsoluteDuration;
    }finally{__CLR4_5_2e7ze7zlvl9ekns.R.flushNeeded();}}
}
