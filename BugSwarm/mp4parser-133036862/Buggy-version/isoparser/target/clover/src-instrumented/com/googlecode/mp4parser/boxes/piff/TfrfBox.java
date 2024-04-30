/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>4cc = "uuid", d4807ef2-ca39-4695-8e54-26cb9e46a79f</h1>
 * The syntax of the fields defined in this section, specified in ABNF [RFC5234], is as follows:
 * TfrfBox = TfrfBoxLength TfrfBoxType [TfrfBoxLongLength] TfrfBoxUUID TfrfBoxFields
 * TfrfBoxChildren
 * TfrfBoxType = "u" "u" "i" "d"
 * TfrfBoxLength = BoxLength
 * TfrfBoxLongLength = LongBoxLength
 * TfrfBoxUUID = %xD4 %x80 %x7E %xF2 %xCA %x39 %x46 %x95
 * %x8E %x54 %x26 %xCB %x9E %x46 %xA7 %x9F
 * TfrfBoxFields = TfrfBoxVersion
 * TfrfBoxFlags
 * FragmentCount
 * (1* TfrfBoxDataFields32) / (1* TfrfBoxDataFields64)
 * TfrfBoxVersion = %x00 / %x01
 * TfrfBoxFlags = 24*24 RESERVED_BIT
 * FragmentCount = UINT8
 * TfrfBoxDataFields32 = FragmentAbsoluteTime32
 * FragmentDuration32
 * TfrfBoxDataFields64 = FragmentAbsoluteTime64
 * FragmentDuration64
 * FragmentAbsoluteTime64 = UNSIGNED_INT32
 * FragmentDuration64 = UNSIGNED_INT32
 * FragmentAbsoluteTime64 = UNSIGNED_INT64
 * FragmentDuration64 = UNSIGNED_INT64
 * TfrfBoxChildren = *( VendorExtensionUUIDBox )
 */
public class TfrfBox extends AbstractFullBox {public static class __CLR4_5_2e93e93lvlulmvq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,18526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public List<Entry> entries = new ArrayList<Entry>();

    public TfrfBox() {
        super("uuid");__CLR4_5_2e93e93lvlulmvq.R.inc(18472);try{__CLR4_5_2e93e93lvlulmvq.R.inc(18471);
    }finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}

    @Override
    public byte[] getUserType() {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18473);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18474);return new byte[]{(byte) 0xd4, (byte) 0x80, (byte) 0x7e, (byte) 0xf2, (byte) 0xca, (byte) 0x39, (byte) 0x46,
                (byte) 0x95, (byte) 0x8e, (byte) 0x54, 0x26, (byte) 0xcb, (byte) 0x9e, (byte) 0x46, (byte) 0xa7, (byte) 0x9f};
    }finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18475);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18476);return 5 + entries.size() * ((((getVersion() == 0x01 )&&(__CLR4_5_2e93e93lvlulmvq.R.iget(18477)!=0|true))||(__CLR4_5_2e93e93lvlulmvq.R.iget(18478)==0&false))? 16 : 8);
    }finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18479);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18480);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18481);IsoTypeWriter.writeUInt8(byteBuffer, entries.size());

        __CLR4_5_2e93e93lvlulmvq.R.inc(18482);for (Entry entry : entries) {{
            __CLR4_5_2e93e93lvlulmvq.R.inc(18483);if ((((getVersion() == 0x01)&&(__CLR4_5_2e93e93lvlulmvq.R.iget(18484)!=0|true))||(__CLR4_5_2e93e93lvlulmvq.R.iget(18485)==0&false))) {{
                __CLR4_5_2e93e93lvlulmvq.R.inc(18486);IsoTypeWriter.writeUInt64(byteBuffer, entry.fragmentAbsoluteTime);
                __CLR4_5_2e93e93lvlulmvq.R.inc(18487);IsoTypeWriter.writeUInt64(byteBuffer, entry.fragmentAbsoluteDuration);
            } }else {{
                __CLR4_5_2e93e93lvlulmvq.R.inc(18488);IsoTypeWriter.writeUInt32(byteBuffer, entry.fragmentAbsoluteTime);
                __CLR4_5_2e93e93lvlulmvq.R.inc(18489);IsoTypeWriter.writeUInt32(byteBuffer, entry.fragmentAbsoluteDuration);
            }
        }}
    }}finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18490);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18491);parseVersionAndFlags(content);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18492);int fragmentCount = IsoTypeReader.readUInt8(content);

        __CLR4_5_2e93e93lvlulmvq.R.inc(18493);for (int i = 0; (((i < fragmentCount)&&(__CLR4_5_2e93e93lvlulmvq.R.iget(18494)!=0|true))||(__CLR4_5_2e93e93lvlulmvq.R.iget(18495)==0&false)); i++) {{
            __CLR4_5_2e93e93lvlulmvq.R.inc(18496);Entry entry = new Entry();
            __CLR4_5_2e93e93lvlulmvq.R.inc(18497);if ((((getVersion() == 0x01)&&(__CLR4_5_2e93e93lvlulmvq.R.iget(18498)!=0|true))||(__CLR4_5_2e93e93lvlulmvq.R.iget(18499)==0&false))) {{
                __CLR4_5_2e93e93lvlulmvq.R.inc(18500);entry.fragmentAbsoluteTime = IsoTypeReader.readUInt64(content);
                __CLR4_5_2e93e93lvlulmvq.R.inc(18501);entry.fragmentAbsoluteDuration = IsoTypeReader.readUInt64(content);
            } }else {{
                __CLR4_5_2e93e93lvlulmvq.R.inc(18502);entry.fragmentAbsoluteTime = IsoTypeReader.readUInt32(content);
                __CLR4_5_2e93e93lvlulmvq.R.inc(18503);entry.fragmentAbsoluteDuration = IsoTypeReader.readUInt32(content);
            }
            }__CLR4_5_2e93e93lvlulmvq.R.inc(18504);entries.add(entry);
        }
    }}finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}


    public long getFragmentCount() {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18505);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18506);return entries.size();
    }finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18507);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18508);return entries;
    }finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18509);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18510);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2e93e93lvlulmvq.R.inc(18511);sb.append("TfrfBox");
        __CLR4_5_2e93e93lvlulmvq.R.inc(18512);sb.append("{entries=").append(entries);
        __CLR4_5_2e93e93lvlulmvq.R.inc(18513);sb.append('}');
        __CLR4_5_2e93e93lvlulmvq.R.inc(18514);return sb.toString();
    }finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}

    public class Entry {
        long fragmentAbsoluteTime;
        long fragmentAbsoluteDuration;

        public long getFragmentAbsoluteTime() {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18515);
            __CLR4_5_2e93e93lvlulmvq.R.inc(18516);return fragmentAbsoluteTime;
        }finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}

        public long getFragmentAbsoluteDuration() {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18517);
            __CLR4_5_2e93e93lvlulmvq.R.inc(18518);return fragmentAbsoluteDuration;
        }finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2e93e93lvlulmvq.R.inc(18519);
            __CLR4_5_2e93e93lvlulmvq.R.inc(18520);final StringBuilder sb = new StringBuilder();
            __CLR4_5_2e93e93lvlulmvq.R.inc(18521);sb.append("Entry");
            __CLR4_5_2e93e93lvlulmvq.R.inc(18522);sb.append("{fragmentAbsoluteTime=").append(fragmentAbsoluteTime);
            __CLR4_5_2e93e93lvlulmvq.R.inc(18523);sb.append(", fragmentAbsoluteDuration=").append(fragmentAbsoluteDuration);
            __CLR4_5_2e93e93lvlulmvq.R.inc(18524);sb.append('}');
            __CLR4_5_2e93e93lvlulmvq.R.inc(18525);return sb.toString();
        }finally{__CLR4_5_2e93e93lvlulmvq.R.flushNeeded();}}
    }
}
