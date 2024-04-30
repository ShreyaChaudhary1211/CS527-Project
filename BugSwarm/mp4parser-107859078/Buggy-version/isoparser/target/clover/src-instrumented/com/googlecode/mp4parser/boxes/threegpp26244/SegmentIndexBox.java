/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.threegpp26244;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <pre>
 * aligned(8) class SegmentIndexBox extends FullBox(\u2018sidx\u2019, version, 0) {
 *  unsigned int(32) reference_ID;
 *  unsigned int(32) timescale;
 *  if (version==0)
 *  {
 *   unsigned int(32) earliest_presentation_time;
 *   unsigned int(32) first_offset;
 *  }
 *  else
 *  {
 *   unsigned int(64) earliest_presentation_time;
 *   unsigned int(64) first_offset;
 *  }
 *  unsigned int(16) reserved = 0;
 *  unsigned int(16) reference_count;
 *  for(i=1; i &lt;= reference_count; i++)
 *  {
 *   bit (1)            reference_type;
 *   unsigned int(31)   referenced_size;
 *   unsigned int(32)   subsegment_duration;
 *   bit(1)             starts_with_SAP;
 *   unsigned int(3)    SAP_type;
 *   unsigned int(28)   SAP_delta_time;
 *  }
 * }
 * </pre>
 */
public class SegmentIndexBox extends AbstractFullBox {public static class __CLR4_5_2e9xe9xlvl9ekob{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18667,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "sidx";
    List<Entry> entries = new ArrayList<Entry>();

    long referenceId;
    long timeScale;
    long earliestPresentationTime;
    long firstOffset;
    int reserved;


    public SegmentIndexBox() {
        super(TYPE);__CLR4_5_2e9xe9xlvl9ekob.R.inc(18502);try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18501);
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18503);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18504);long size = 4;
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18505);size += 4;
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18506);size += 4;
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18507);size += (((getVersion() == 0 )&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18508)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18509)==0&false))? 8 : 16;
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18510);size += 2; // reserved
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18511);size += 2; // reference count

        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18512);size += entries.size() * 12;

        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18513);return size;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18514);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18515);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18516);IsoTypeWriter.writeUInt32(byteBuffer, referenceId);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18517);IsoTypeWriter.writeUInt32(byteBuffer, timeScale);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18518);if ((((getVersion() == 0)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18519)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18520)==0&false))) {{
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18521);IsoTypeWriter.writeUInt32(byteBuffer, earliestPresentationTime);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18522);IsoTypeWriter.writeUInt32(byteBuffer, firstOffset);
        } }else {{
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18523);IsoTypeWriter.writeUInt64(byteBuffer, earliestPresentationTime);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18524);IsoTypeWriter.writeUInt64(byteBuffer, firstOffset);
        }
        }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18525);IsoTypeWriter.writeUInt16(byteBuffer, reserved);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18526);IsoTypeWriter.writeUInt16(byteBuffer, entries.size());
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18527);for (Entry entry : entries) {{
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18528);BitWriterBuffer b = new BitWriterBuffer(byteBuffer);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18529);b.writeBits(entry.getReferenceType(), 1);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18530);b.writeBits(entry.getReferencedSize(), 31);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18531);IsoTypeWriter.writeUInt32(byteBuffer, entry.getSubsegmentDuration());
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18532);b = new BitWriterBuffer(byteBuffer);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18533);b.writeBits(entry.getStartsWithSap(), 1);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18534);b.writeBits(entry.getSapType(), 3);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18535);b.writeBits(entry.getSapDeltaTime(), 28);
        }

    }}finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18536);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18537);parseVersionAndFlags(content);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18538);referenceId = IsoTypeReader.readUInt32(content);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18539);timeScale = IsoTypeReader.readUInt32(content);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18540);if ((((getVersion() == 0)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18541)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18542)==0&false))) {{
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18543);earliestPresentationTime = IsoTypeReader.readUInt32(content);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18544);firstOffset = IsoTypeReader.readUInt32(content);
        } }else {{
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18545);earliestPresentationTime = IsoTypeReader.readUInt64(content);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18546);firstOffset = IsoTypeReader.readUInt64(content);
        }
        }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18547);reserved = IsoTypeReader.readUInt16(content);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18548);int numEntries = IsoTypeReader.readUInt16(content);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18549);for (int i = 0; (((i < numEntries)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18550)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18551)==0&false)); i++) {{
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18552);BitReaderBuffer b = new BitReaderBuffer(content);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18553);Entry e = new Entry();
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18554);e.setReferenceType((byte) b.readBits(1));
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18555);e.setReferencedSize(b.readBits(31));
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18556);e.setSubsegmentDuration(IsoTypeReader.readUInt32(content));
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18557);b = new BitReaderBuffer(content);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18558);e.setStartsWithSap((byte) b.readBits(1));
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18559);e.setSapType((byte) b.readBits(3));
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18560);e.setSapDeltaTime(b.readBits(28));
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18561);entries.add(e);
        }
    }}finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}


    public List<Entry> getEntries() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18562);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18563);return entries;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18564);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18565);this.entries = entries;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public long getReferenceId() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18566);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18567);return referenceId;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public void setReferenceId(long referenceId) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18568);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18569);this.referenceId = referenceId;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public long getTimeScale() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18570);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18571);return timeScale;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public void setTimeScale(long timeScale) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18572);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18573);this.timeScale = timeScale;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public long getEarliestPresentationTime() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18574);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18575);return earliestPresentationTime;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public void setEarliestPresentationTime(long earliestPresentationTime) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18576);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18577);this.earliestPresentationTime = earliestPresentationTime;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public long getFirstOffset() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18578);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18579);return firstOffset;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public void setFirstOffset(long firstOffset) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18580);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18581);this.firstOffset = firstOffset;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public int getReserved() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18582);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18583);return reserved;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public void setReserved(int reserved) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18584);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18585);this.reserved = reserved;
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

    public static class Entry {
        byte referenceType;
        int referencedSize;
        long subsegmentDuration;
        byte startsWithSap;
        byte sapType;
        int sapDeltaTime;

        public Entry() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18586);
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public Entry(int referenceType, int referencedSize, long subsegmentDuration, boolean startsWithSap, int sapType, int sapDeltaTime) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18587);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18588);this.referenceType = (byte) referenceType;
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18589);this.referencedSize = referencedSize;
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18590);this.subsegmentDuration = subsegmentDuration;
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18591);this.startsWithSap = (byte) ((((startsWithSap)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18592)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18593)==0&false))?1:0);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18594);this.sapType = (byte) sapType;
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18595);this.sapDeltaTime = sapDeltaTime;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        /**
         * When set to 1 indicates that the reference is to a segment index ('sidx') box;
         * otherwise the reference is to media content (e.g., in the case of files based on this specification, to a
         * movie fragment box); if a separate index segment is used, then entries with reference t
         * @return the reference type
         */
        public byte getReferenceType() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18596);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18597);return referenceType;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        /**
         * When set to 1 indicates that the reference is to a segment index ('sidx') box;
         * otherwise the reference is to media content (e.g., in the case of files based on this specification, to a
         * movie fragment box); if a separate index segment is used, then entries with reference t
         * @param referenceType the new reference type
         */
        public void setReferenceType(byte referenceType) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18598);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18599);this.referenceType = referenceType;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public int getReferencedSize() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18600);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18601);return referencedSize;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public void setReferencedSize(int referencedSize) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18602);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18603);this.referencedSize = referencedSize;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public long getSubsegmentDuration() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18604);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18605);return subsegmentDuration;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public void setSubsegmentDuration(long subsegmentDuration) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18606);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18607);this.subsegmentDuration = subsegmentDuration;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public byte getStartsWithSap() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18608);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18609);return startsWithSap;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public void setStartsWithSap(byte startsWithSap) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18610);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18611);this.startsWithSap = startsWithSap;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public byte getSapType() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18612);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18613);return sapType;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public void setSapType(byte sapType) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18614);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18615);this.sapType = sapType;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public int getSapDeltaTime() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18616);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18617);return sapDeltaTime;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        public void setSapDeltaTime(int sapDeltaTime) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18618);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18619);this.sapDeltaTime = sapDeltaTime;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18620);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18621);return "Entry{" +
                    "referenceType=" + referenceType +
                    ", referencedSize=" + referencedSize +
                    ", subsegmentDuration=" + subsegmentDuration +
                    ", startsWithSap=" + startsWithSap +
                    ", sapType=" + sapType +
                    ", sapDeltaTime=" + sapDeltaTime +
                    '}';
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18622);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18623);if ((((this == o)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18624)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18625)==0&false))) {__CLR4_5_2e9xe9xlvl9ekob.R.inc(18626);return true;
            }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18627);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18628)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18629)==0&false))) {__CLR4_5_2e9xe9xlvl9ekob.R.inc(18630);return false;

            }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18631);Entry entry = (Entry) o;

            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18632);if ((((referenceType != entry.referenceType)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18633)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18634)==0&false))) {__CLR4_5_2e9xe9xlvl9ekob.R.inc(18635);return false;
            }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18636);if ((((referencedSize != entry.referencedSize)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18637)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18638)==0&false))) {__CLR4_5_2e9xe9xlvl9ekob.R.inc(18639);return false;
            }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18640);if ((((sapDeltaTime != entry.sapDeltaTime)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18641)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18642)==0&false))) {__CLR4_5_2e9xe9xlvl9ekob.R.inc(18643);return false;
            }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18644);if ((((sapType != entry.sapType)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18645)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18646)==0&false))) {__CLR4_5_2e9xe9xlvl9ekob.R.inc(18647);return false;
            }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18648);if ((((startsWithSap != entry.startsWithSap)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18649)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18650)==0&false))) {__CLR4_5_2e9xe9xlvl9ekob.R.inc(18651);return false;
            }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18652);if ((((subsegmentDuration != entry.subsegmentDuration)&&(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18653)!=0|true))||(__CLR4_5_2e9xe9xlvl9ekob.R.iget(18654)==0&false))) {__CLR4_5_2e9xe9xlvl9ekob.R.inc(18655);return false;

            }__CLR4_5_2e9xe9xlvl9ekob.R.inc(18656);return true;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18657);
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18658);int result = (int) referenceType;
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18659);result = 31 * result + referencedSize;
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18660);result = 31 * result + (int) (subsegmentDuration ^ (subsegmentDuration >>> 32));
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18661);result = 31 * result + (int) startsWithSap;
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18662);result = 31 * result + (int) sapType;
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18663);result = 31 * result + sapDeltaTime;
            __CLR4_5_2e9xe9xlvl9ekob.R.inc(18664);return result;
        }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}
    }

    @Override
    public String toString() {try{__CLR4_5_2e9xe9xlvl9ekob.R.inc(18665);
        __CLR4_5_2e9xe9xlvl9ekob.R.inc(18666);return "SegmentIndexBox{" +
                "entries=" + entries +
                ", referenceId=" + referenceId +
                ", timeScale=" + timeScale +
                ", earliestPresentationTime=" + earliestPresentationTime +
                ", firstOffset=" + firstOffset +
                ", reserved=" + reserved +
                '}';
    }finally{__CLR4_5_2e9xe9xlvl9ekob.R.flushNeeded();}}
}
