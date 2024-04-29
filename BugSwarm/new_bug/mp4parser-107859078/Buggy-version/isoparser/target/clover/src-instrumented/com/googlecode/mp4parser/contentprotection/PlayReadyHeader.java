/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.contentprotection;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
@java.lang.SuppressWarnings({"fallthrough"}) public class PlayReadyHeader extends ProtectionSpecificHeader {public static class __CLR4_5_2efuefulvl9ekpf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18824,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static UUID PROTECTION_SYSTEM_ID = UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95");

    private long length;
    private List<PlayReadyRecord> records;

    static {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18714);
        __CLR4_5_2efuefulvl9ekpf.R.inc(18715);uuidRegistry.put(PROTECTION_SYSTEM_ID, PlayReadyHeader.class);
    }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

    @Override
    public UUID getSystemId() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18716);
        __CLR4_5_2efuefulvl9ekpf.R.inc(18717);return PROTECTION_SYSTEM_ID;
    }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18718);
        /*
   Length DWORD 32

   PlayReady Record Count WORD 16

   PlayReady Records See Text Varies

        */

        __CLR4_5_2efuefulvl9ekpf.R.inc(18719);length = IsoTypeReader.readUInt32BE(byteBuffer);
        __CLR4_5_2efuefulvl9ekpf.R.inc(18720);int recordCount = IsoTypeReader.readUInt16BE(byteBuffer);

        __CLR4_5_2efuefulvl9ekpf.R.inc(18721);records = PlayReadyRecord.createFor(byteBuffer, recordCount);
    }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

    @Override
    public ByteBuffer getData() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18722);

        __CLR4_5_2efuefulvl9ekpf.R.inc(18723);int size = 4 + 2;
        __CLR4_5_2efuefulvl9ekpf.R.inc(18724);for (PlayReadyRecord record : records) {{
            __CLR4_5_2efuefulvl9ekpf.R.inc(18725);size += 2 + 2;
            __CLR4_5_2efuefulvl9ekpf.R.inc(18726);size += record.getValue().rewind().limit();
        }
        }__CLR4_5_2efuefulvl9ekpf.R.inc(18727);ByteBuffer byteBuffer = ByteBuffer.allocate(size);

        __CLR4_5_2efuefulvl9ekpf.R.inc(18728);IsoTypeWriter.writeUInt32BE(byteBuffer, size);
        __CLR4_5_2efuefulvl9ekpf.R.inc(18729);IsoTypeWriter.writeUInt16BE(byteBuffer, records.size());
        __CLR4_5_2efuefulvl9ekpf.R.inc(18730);for (PlayReadyRecord record : records) {{
            __CLR4_5_2efuefulvl9ekpf.R.inc(18731);IsoTypeWriter.writeUInt16BE(byteBuffer, record.type);
            __CLR4_5_2efuefulvl9ekpf.R.inc(18732);IsoTypeWriter.writeUInt16BE(byteBuffer, record.getValue().limit());
            __CLR4_5_2efuefulvl9ekpf.R.inc(18733);ByteBuffer tmp4debug = record.getValue();
            __CLR4_5_2efuefulvl9ekpf.R.inc(18734);byteBuffer.put(tmp4debug);
        }

        }__CLR4_5_2efuefulvl9ekpf.R.inc(18735);return byteBuffer;
    }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

    public void setRecords(List<PlayReadyRecord> records) {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18736);
        __CLR4_5_2efuefulvl9ekpf.R.inc(18737);this.records = records;
    }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

    public List<PlayReadyRecord> getRecords() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18738);
        __CLR4_5_2efuefulvl9ekpf.R.inc(18739);return Collections.unmodifiableList(records);
    }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18740);
        __CLR4_5_2efuefulvl9ekpf.R.inc(18741);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2efuefulvl9ekpf.R.inc(18742);sb.append("PlayReadyHeader");
        __CLR4_5_2efuefulvl9ekpf.R.inc(18743);sb.append("{length=").append(length);
        __CLR4_5_2efuefulvl9ekpf.R.inc(18744);sb.append(", recordCount=").append(records.size());
        __CLR4_5_2efuefulvl9ekpf.R.inc(18745);sb.append(", records=").append(records);
        __CLR4_5_2efuefulvl9ekpf.R.inc(18746);sb.append('}');
        __CLR4_5_2efuefulvl9ekpf.R.inc(18747);return sb.toString();
    }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

    public static abstract class PlayReadyRecord {
        int type;


        public PlayReadyRecord(int type) {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18748);
            __CLR4_5_2efuefulvl9ekpf.R.inc(18749);this.type = type;
        }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

        public static List<PlayReadyRecord> createFor(ByteBuffer byteBuffer, int recordCount) {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18750);
            __CLR4_5_2efuefulvl9ekpf.R.inc(18751);List<PlayReadyRecord> records = new ArrayList<PlayReadyRecord>(recordCount);

            __CLR4_5_2efuefulvl9ekpf.R.inc(18752);for (int i = 0; (((i < recordCount)&&(__CLR4_5_2efuefulvl9ekpf.R.iget(18753)!=0|true))||(__CLR4_5_2efuefulvl9ekpf.R.iget(18754)==0&false)); i++) {{
                __CLR4_5_2efuefulvl9ekpf.R.inc(18755);PlayReadyRecord record;
                __CLR4_5_2efuefulvl9ekpf.R.inc(18756);int type = IsoTypeReader.readUInt16BE(byteBuffer);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18757);int length = IsoTypeReader.readUInt16BE(byteBuffer);
                boolean __CLB4_5_2_bool0=false;__CLR4_5_2efuefulvl9ekpf.R.inc(18758);switch (type) {
                    case 0x1:if (!__CLB4_5_2_bool0) {__CLR4_5_2efuefulvl9ekpf.R.inc(18759);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2efuefulvl9ekpf.R.inc(18760);record = new RMHeader();
                        __CLR4_5_2efuefulvl9ekpf.R.inc(18761);break;
                    case 0x2:if (!__CLB4_5_2_bool0) {__CLR4_5_2efuefulvl9ekpf.R.inc(18762);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2efuefulvl9ekpf.R.inc(18763);record = new DefaulPlayReadyRecord(0x02);
                        __CLR4_5_2efuefulvl9ekpf.R.inc(18764);break;
                    case 0x3:if (!__CLB4_5_2_bool0) {__CLR4_5_2efuefulvl9ekpf.R.inc(18765);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2efuefulvl9ekpf.R.inc(18766);record = new EmeddedLicenseStore();
                        __CLR4_5_2efuefulvl9ekpf.R.inc(18767);break;
                    default:if (!__CLB4_5_2_bool0) {__CLR4_5_2efuefulvl9ekpf.R.inc(18768);__CLB4_5_2_bool0=true;}
                        __CLR4_5_2efuefulvl9ekpf.R.inc(18769);record = new DefaulPlayReadyRecord(type);
                }
                __CLR4_5_2efuefulvl9ekpf.R.inc(18770);record.parse((ByteBuffer) byteBuffer.slice().limit(length));
                __CLR4_5_2efuefulvl9ekpf.R.inc(18771);byteBuffer.position(byteBuffer.position() + length);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18772);records.add(record);
            }

            }__CLR4_5_2efuefulvl9ekpf.R.inc(18773);return records;
        }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

        public abstract void parse(ByteBuffer bytes);

        @Override
        public String toString() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18774);
            __CLR4_5_2efuefulvl9ekpf.R.inc(18775);final StringBuilder sb = new StringBuilder();
            __CLR4_5_2efuefulvl9ekpf.R.inc(18776);sb.append("PlayReadyRecord");
            __CLR4_5_2efuefulvl9ekpf.R.inc(18777);sb.append("{type=").append(type);
            __CLR4_5_2efuefulvl9ekpf.R.inc(18778);sb.append(", length=").append(getValue().limit());
//            sb.append(", value=").append(Hex.encodeHex(getValue())).append('\'');
            __CLR4_5_2efuefulvl9ekpf.R.inc(18779);sb.append('}');
            __CLR4_5_2efuefulvl9ekpf.R.inc(18780);return sb.toString();
        }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

        public abstract ByteBuffer getValue();

        public static class RMHeader extends PlayReadyRecord {
            String header;

            public RMHeader() {
                super(0x01);__CLR4_5_2efuefulvl9ekpf.R.inc(18782);try{__CLR4_5_2efuefulvl9ekpf.R.inc(18781);
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            @Override
            public void parse(ByteBuffer bytes) {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18783);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18784);try {
                    __CLR4_5_2efuefulvl9ekpf.R.inc(18785);byte[] str = new byte[bytes.slice().limit()];
                    __CLR4_5_2efuefulvl9ekpf.R.inc(18786);bytes.get(str);
                    __CLR4_5_2efuefulvl9ekpf.R.inc(18787);header = new String(str, "UTF-16LE");
                } catch (UnsupportedEncodingException e) {
                    __CLR4_5_2efuefulvl9ekpf.R.inc(18788);throw new RuntimeException(e);
                }
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            @Override
            public ByteBuffer getValue() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18789);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18790);byte[] headerBytes;
                __CLR4_5_2efuefulvl9ekpf.R.inc(18791);try {
                    __CLR4_5_2efuefulvl9ekpf.R.inc(18792);headerBytes = header.getBytes("UTF-16LE");
                } catch (UnsupportedEncodingException e) {
                    __CLR4_5_2efuefulvl9ekpf.R.inc(18793);throw new RuntimeException(e);
                }
                __CLR4_5_2efuefulvl9ekpf.R.inc(18794);return ByteBuffer.wrap(headerBytes);
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            public void setHeader(String header) {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18795);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18796);this.header = header;
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            public String getHeader() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18797);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18798);return header;
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            @Override
            public String toString() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18799);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18800);final StringBuilder sb = new StringBuilder();
                __CLR4_5_2efuefulvl9ekpf.R.inc(18801);sb.append("RMHeader");
                __CLR4_5_2efuefulvl9ekpf.R.inc(18802);sb.append("{length=").append(getValue().limit());
                __CLR4_5_2efuefulvl9ekpf.R.inc(18803);sb.append(", header='").append(header).append('\'');
                __CLR4_5_2efuefulvl9ekpf.R.inc(18804);sb.append('}');
                __CLR4_5_2efuefulvl9ekpf.R.inc(18805);return sb.toString();
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}
        }

        public static class EmeddedLicenseStore extends PlayReadyRecord {
            ByteBuffer value;

            public EmeddedLicenseStore() {
                super(0x03);__CLR4_5_2efuefulvl9ekpf.R.inc(18807);try{__CLR4_5_2efuefulvl9ekpf.R.inc(18806);
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            @Override
            public void parse(ByteBuffer bytes) {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18808);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18809);this.value = bytes.duplicate();
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            @Override
            public ByteBuffer getValue() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18810);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18811);return value;
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            @Override
            public String toString() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18812);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18813);final StringBuilder sb = new StringBuilder();
                __CLR4_5_2efuefulvl9ekpf.R.inc(18814);sb.append("EmeddedLicenseStore");
                __CLR4_5_2efuefulvl9ekpf.R.inc(18815);sb.append("{length=").append(getValue().limit());
                //sb.append(", value='").append(Hex.encodeHex(getValue())).append('\'');
                __CLR4_5_2efuefulvl9ekpf.R.inc(18816);sb.append('}');
                __CLR4_5_2efuefulvl9ekpf.R.inc(18817);return sb.toString();
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}
        }

        public static class DefaulPlayReadyRecord extends PlayReadyRecord {
            ByteBuffer value;

            public DefaulPlayReadyRecord(int type) {
                super(type);__CLR4_5_2efuefulvl9ekpf.R.inc(18819);try{__CLR4_5_2efuefulvl9ekpf.R.inc(18818);
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            @Override
            public void parse(ByteBuffer bytes) {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18820);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18821);this.value = bytes.duplicate();
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

            @Override
            public ByteBuffer getValue() {try{__CLR4_5_2efuefulvl9ekpf.R.inc(18822);
                __CLR4_5_2efuefulvl9ekpf.R.inc(18823);return value;
            }finally{__CLR4_5_2efuefulvl9ekpf.R.flushNeeded();}}

        }

    }

}
