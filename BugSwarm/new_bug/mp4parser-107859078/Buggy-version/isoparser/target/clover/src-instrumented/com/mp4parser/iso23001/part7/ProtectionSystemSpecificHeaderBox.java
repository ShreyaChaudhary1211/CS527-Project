/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso23001.part7;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox;
import com.googlecode.mp4parser.util.UUIDConverter;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import static com.googlecode.mp4parser.util.CastUtils.l2i;


/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <p>This box contains information needed by a Content Protection System to play back the content. The
 * data format is specified by the system identified by the \u2018pssh\u2019 parameter SystemID, and is considered
 * opaque for the purposes of this specification.</p>
 * <p>The data encapsulated in the Data field may be read by the identified Content Protection System to
 * enable decryption key acquisition and decryption of media data. For license/rights-based systems, the
 * header information may include data such as the URL of license server(s) or rights issuer(s) used,
 * embedded licenses/rights, and/or other protection system specific metadata.</p>
 * <p>A single file may be constructed to be playable by multiple key and digital rights management (DRM)
 * systems, by including one Protection System-Specific Header box for each system supported. Readers
 * that process such presentations must match the SystemID field in this box to the SystemID(s) of the
 * DRM System(s) they support, and select or create the matching Protection System-Specific Header
 * box(es) for storage and retrieval of Protection-Specific information interpreted or created by that DRM
 * system.</p>
 */
public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox {public static class __CLR4_5_2h3nh3nlvl9elcr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,22223,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "pssh";

    public static byte[] OMA2_SYSTEM_ID = UUIDConverter.convert(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
    public static byte[] WIDEVINE = UUIDConverter.convert(UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"));
    public static byte[] PLAYREADY_SYSTEM_ID = UUIDConverter.convert(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));

    byte[] content;
    byte[] systemId;

    public ProtectionSystemSpecificHeaderBox(byte[] systemId, byte[] content) {
        super(TYPE);__CLR4_5_2h3nh3nlvl9elcr.R.inc(22164);try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22163);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22165);this.content = content;
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22166);this.systemId = systemId;
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    public List<UUID> getKeyIds() {try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22167);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22168);return keyIds;
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    public void setKeyIds(List<UUID> keyIds) {try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22169);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22170);this.keyIds = keyIds;
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    List<UUID> keyIds = new ArrayList<UUID>();


    public byte[] getSystemId() {try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22171);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22172);return systemId;
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    public void setSystemId(byte[] systemId) {try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22173);
        assert (((systemId.length == 16)&&(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22174)!=0|true))||(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22175)==0&false));
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22176);this.systemId = systemId;
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    public byte[] getContent() {try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22177);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22178);return content;
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    public void setContent(byte[] content) {try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22179);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22180);this.content = content;
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    public ProtectionSystemSpecificHeaderBox() {
        super(TYPE);__CLR4_5_2h3nh3nlvl9elcr.R.inc(22182);try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22181);
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22183);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22184);long l = 24 + content.length;
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22185);if ((((getVersion() > 0)&&(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22186)!=0|true))||(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22187)==0&false))) {{
            __CLR4_5_2h3nh3nlvl9elcr.R.inc(22188);l += 4;
            __CLR4_5_2h3nh3nlvl9elcr.R.inc(22189);l += 16 * keyIds.size();
        }
        }__CLR4_5_2h3nh3nlvl9elcr.R.inc(22190);return l;
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22191);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22192);writeVersionAndFlags(byteBuffer);
        assert (((systemId.length == 16)&&(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22193)!=0|true))||(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22194)==0&false));
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22195);byteBuffer.put(systemId, 0, 16);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22196);if ((((getVersion() > 0)&&(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22197)!=0|true))||(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22198)==0&false))) {{
            __CLR4_5_2h3nh3nlvl9elcr.R.inc(22199);IsoTypeWriter.writeUInt32(byteBuffer, keyIds.size());
            __CLR4_5_2h3nh3nlvl9elcr.R.inc(22200);for (UUID keyId : keyIds) {{
                __CLR4_5_2h3nh3nlvl9elcr.R.inc(22201);byteBuffer.put(UUIDConverter.convert(keyId));
            }
        }}

        }__CLR4_5_2h3nh3nlvl9elcr.R.inc(22202);IsoTypeWriter.writeUInt32(byteBuffer, content.length);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22203);byteBuffer.put(content);
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2h3nh3nlvl9elcr.R.inc(22204);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22205);parseVersionAndFlags(content);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22206);systemId = new byte[16];
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22207);content.get(systemId);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22208);if ((((getVersion() > 0)&&(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22209)!=0|true))||(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22210)==0&false))) {{
            __CLR4_5_2h3nh3nlvl9elcr.R.inc(22211);int count = l2i(IsoTypeReader.readUInt32(content));
            __CLR4_5_2h3nh3nlvl9elcr.R.inc(22212);while ((((count-- > 0)&&(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22213)!=0|true))||(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22214)==0&false))) {{
                __CLR4_5_2h3nh3nlvl9elcr.R.inc(22215);byte[] k = new byte[16];
                __CLR4_5_2h3nh3nlvl9elcr.R.inc(22216);content.get(k);
                __CLR4_5_2h3nh3nlvl9elcr.R.inc(22217);keyIds.add(UUIDConverter.convert(k));
            }
        }}
        }__CLR4_5_2h3nh3nlvl9elcr.R.inc(22218);long length = IsoTypeReader.readUInt32(content);
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22219);this.content = new byte[content.remaining()];
        __CLR4_5_2h3nh3nlvl9elcr.R.inc(22220);content.get(this.content);
        assert (((length == this.content.length)&&(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22221)!=0|true))||(__CLR4_5_2h3nh3nlvl9elcr.R.iget(22222)==0&false));
    }finally{__CLR4_5_2h3nh3nlvl9elcr.R.flushNeeded();}}
}
