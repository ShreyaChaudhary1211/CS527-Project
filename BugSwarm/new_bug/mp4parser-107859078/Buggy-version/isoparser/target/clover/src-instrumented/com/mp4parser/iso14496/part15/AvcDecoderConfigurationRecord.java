/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso14496.part15;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.authoring.tracks.CleanInputStream;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
*
*/
public class AvcDecoderConfigurationRecord {public static class __CLR4_5_2g59g59lvl9el59{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,21058,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public int configurationVersion;
    public int avcProfileIndication;
    public int profileCompatibility;
    public int avcLevelIndication;
    public int lengthSizeMinusOne;
    public List<byte[]> sequenceParameterSets = new ArrayList<byte[]>();
    public List<byte[]> pictureParameterSets = new ArrayList<byte[]>();

    public boolean hasExts = true;
    public int chromaFormat = 1;
    public int bitDepthLumaMinus8 = 0;
    public int bitDepthChromaMinus8 = 0;
    public List<byte[]> sequenceParameterSetExts = new ArrayList<byte[]>();

    /**
     * Just for non-spec-conform encoders
     */
    public int lengthSizeMinusOnePaddingBits = 63;
    public int numberOfSequenceParameterSetsPaddingBits = 7;
    public int chromaFormatPaddingBits = 31;
    public int bitDepthLumaMinus8PaddingBits = 31;
    public int bitDepthChromaMinus8PaddingBits = 31;

    public AvcDecoderConfigurationRecord() {try{__CLR4_5_2g59g59lvl9el59.R.inc(20925);
    }finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}

    public AvcDecoderConfigurationRecord(ByteBuffer content) {try{__CLR4_5_2g59g59lvl9el59.R.inc(20926);
        __CLR4_5_2g59g59lvl9el59.R.inc(20927);configurationVersion = IsoTypeReader.readUInt8(content);
        __CLR4_5_2g59g59lvl9el59.R.inc(20928);avcProfileIndication = IsoTypeReader.readUInt8(content);
        __CLR4_5_2g59g59lvl9el59.R.inc(20929);profileCompatibility = IsoTypeReader.readUInt8(content);
        __CLR4_5_2g59g59lvl9el59.R.inc(20930);avcLevelIndication = IsoTypeReader.readUInt8(content);
        __CLR4_5_2g59g59lvl9el59.R.inc(20931);BitReaderBuffer brb = new BitReaderBuffer(content);
        __CLR4_5_2g59g59lvl9el59.R.inc(20932);lengthSizeMinusOnePaddingBits = brb.readBits(6);
        __CLR4_5_2g59g59lvl9el59.R.inc(20933);lengthSizeMinusOne = brb.readBits(2);
        __CLR4_5_2g59g59lvl9el59.R.inc(20934);numberOfSequenceParameterSetsPaddingBits = brb.readBits(3);
        __CLR4_5_2g59g59lvl9el59.R.inc(20935);int numberOfSeuqenceParameterSets = brb.readBits(5);
        __CLR4_5_2g59g59lvl9el59.R.inc(20936);for (int i = 0; (((i < numberOfSeuqenceParameterSets)&&(__CLR4_5_2g59g59lvl9el59.R.iget(20937)!=0|true))||(__CLR4_5_2g59g59lvl9el59.R.iget(20938)==0&false)); i++) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(20939);int sequenceParameterSetLength = IsoTypeReader.readUInt16(content);

            __CLR4_5_2g59g59lvl9el59.R.inc(20940);byte[] sequenceParameterSetNALUnit = new byte[sequenceParameterSetLength];
            __CLR4_5_2g59g59lvl9el59.R.inc(20941);content.get(sequenceParameterSetNALUnit);
            __CLR4_5_2g59g59lvl9el59.R.inc(20942);sequenceParameterSets.add(sequenceParameterSetNALUnit);
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(20943);long numberOfPictureParameterSets = IsoTypeReader.readUInt8(content);
        __CLR4_5_2g59g59lvl9el59.R.inc(20944);for (int i = 0; (((i < numberOfPictureParameterSets)&&(__CLR4_5_2g59g59lvl9el59.R.iget(20945)!=0|true))||(__CLR4_5_2g59g59lvl9el59.R.iget(20946)==0&false)); i++) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(20947);int pictureParameterSetLength = IsoTypeReader.readUInt16(content);
            __CLR4_5_2g59g59lvl9el59.R.inc(20948);byte[] pictureParameterSetNALUnit = new byte[pictureParameterSetLength];
            __CLR4_5_2g59g59lvl9el59.R.inc(20949);content.get(pictureParameterSetNALUnit);
            __CLR4_5_2g59g59lvl9el59.R.inc(20950);pictureParameterSets.add(pictureParameterSetNALUnit);
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(20951);if ((((content.remaining() < 4)&&(__CLR4_5_2g59g59lvl9el59.R.iget(20952)!=0|true))||(__CLR4_5_2g59g59lvl9el59.R.iget(20953)==0&false))) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(20954);hasExts = false;
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(20955);if ((((hasExts && (avcProfileIndication == 100 || avcProfileIndication == 110 || avcProfileIndication == 122 || avcProfileIndication == 144))&&(__CLR4_5_2g59g59lvl9el59.R.iget(20956)!=0|true))||(__CLR4_5_2g59g59lvl9el59.R.iget(20957)==0&false))) {{
            // actually only some bits are interesting so masking with & x would be good but not all Mp4 creating tools set the reserved bits to 1.
            // So we need to store all bits
            __CLR4_5_2g59g59lvl9el59.R.inc(20958);brb = new BitReaderBuffer(content);
            __CLR4_5_2g59g59lvl9el59.R.inc(20959);chromaFormatPaddingBits = brb.readBits(6);
            __CLR4_5_2g59g59lvl9el59.R.inc(20960);chromaFormat = brb.readBits(2);
            __CLR4_5_2g59g59lvl9el59.R.inc(20961);bitDepthLumaMinus8PaddingBits = brb.readBits(5);
            __CLR4_5_2g59g59lvl9el59.R.inc(20962);bitDepthLumaMinus8 = brb.readBits(3);
            __CLR4_5_2g59g59lvl9el59.R.inc(20963);bitDepthChromaMinus8PaddingBits = brb.readBits(5);
            __CLR4_5_2g59g59lvl9el59.R.inc(20964);bitDepthChromaMinus8 = brb.readBits(3);
            __CLR4_5_2g59g59lvl9el59.R.inc(20965);long numOfSequenceParameterSetExt = IsoTypeReader.readUInt8(content);
            __CLR4_5_2g59g59lvl9el59.R.inc(20966);for (int i = 0; (((i < numOfSequenceParameterSetExt)&&(__CLR4_5_2g59g59lvl9el59.R.iget(20967)!=0|true))||(__CLR4_5_2g59g59lvl9el59.R.iget(20968)==0&false)); i++) {{
                __CLR4_5_2g59g59lvl9el59.R.inc(20969);int sequenceParameterSetExtLength = IsoTypeReader.readUInt16(content);
                __CLR4_5_2g59g59lvl9el59.R.inc(20970);byte[] sequenceParameterSetExtNALUnit = new byte[sequenceParameterSetExtLength];
                __CLR4_5_2g59g59lvl9el59.R.inc(20971);content.get(sequenceParameterSetExtNALUnit);
                __CLR4_5_2g59g59lvl9el59.R.inc(20972);sequenceParameterSetExts.add(sequenceParameterSetExtNALUnit);
            }
        }} }else {{
            __CLR4_5_2g59g59lvl9el59.R.inc(20973);chromaFormat = -1;
            __CLR4_5_2g59g59lvl9el59.R.inc(20974);bitDepthLumaMinus8 = -1;
            __CLR4_5_2g59g59lvl9el59.R.inc(20975);bitDepthChromaMinus8 = -1;
        }
    }}finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}

    public void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2g59g59lvl9el59.R.inc(20976);
        __CLR4_5_2g59g59lvl9el59.R.inc(20977);IsoTypeWriter.writeUInt8(byteBuffer, configurationVersion);
        __CLR4_5_2g59g59lvl9el59.R.inc(20978);IsoTypeWriter.writeUInt8(byteBuffer, avcProfileIndication);
        __CLR4_5_2g59g59lvl9el59.R.inc(20979);IsoTypeWriter.writeUInt8(byteBuffer, profileCompatibility);
        __CLR4_5_2g59g59lvl9el59.R.inc(20980);IsoTypeWriter.writeUInt8(byteBuffer, avcLevelIndication);
        __CLR4_5_2g59g59lvl9el59.R.inc(20981);BitWriterBuffer bwb = new BitWriterBuffer(byteBuffer);
        __CLR4_5_2g59g59lvl9el59.R.inc(20982);bwb.writeBits(lengthSizeMinusOnePaddingBits, 6);
        __CLR4_5_2g59g59lvl9el59.R.inc(20983);bwb.writeBits(lengthSizeMinusOne, 2);
        __CLR4_5_2g59g59lvl9el59.R.inc(20984);bwb.writeBits(numberOfSequenceParameterSetsPaddingBits, 3);
        __CLR4_5_2g59g59lvl9el59.R.inc(20985);bwb.writeBits(pictureParameterSets.size(), 5);
        __CLR4_5_2g59g59lvl9el59.R.inc(20986);for (byte[] sequenceParameterSetNALUnit : sequenceParameterSets) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(20987);IsoTypeWriter.writeUInt16(byteBuffer, sequenceParameterSetNALUnit.length);
            __CLR4_5_2g59g59lvl9el59.R.inc(20988);byteBuffer.put(sequenceParameterSetNALUnit);
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(20989);IsoTypeWriter.writeUInt8(byteBuffer, pictureParameterSets.size());
        __CLR4_5_2g59g59lvl9el59.R.inc(20990);for (byte[] pictureParameterSetNALUnit : pictureParameterSets) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(20991);IsoTypeWriter.writeUInt16(byteBuffer, pictureParameterSetNALUnit.length);
            __CLR4_5_2g59g59lvl9el59.R.inc(20992);byteBuffer.put(pictureParameterSetNALUnit);
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(20993);if ((((hasExts && (avcProfileIndication == 100 || avcProfileIndication == 110 || avcProfileIndication == 122 || avcProfileIndication == 144))&&(__CLR4_5_2g59g59lvl9el59.R.iget(20994)!=0|true))||(__CLR4_5_2g59g59lvl9el59.R.iget(20995)==0&false))) {{

            __CLR4_5_2g59g59lvl9el59.R.inc(20996);bwb = new BitWriterBuffer(byteBuffer);
            __CLR4_5_2g59g59lvl9el59.R.inc(20997);bwb.writeBits(chromaFormatPaddingBits, 6);
            __CLR4_5_2g59g59lvl9el59.R.inc(20998);bwb.writeBits(chromaFormat, 2);
            __CLR4_5_2g59g59lvl9el59.R.inc(20999);bwb.writeBits(bitDepthLumaMinus8PaddingBits, 5);
            __CLR4_5_2g59g59lvl9el59.R.inc(21000);bwb.writeBits(bitDepthLumaMinus8, 3);
            __CLR4_5_2g59g59lvl9el59.R.inc(21001);bwb.writeBits(bitDepthChromaMinus8PaddingBits, 5);
            __CLR4_5_2g59g59lvl9el59.R.inc(21002);bwb.writeBits(bitDepthChromaMinus8, 3);
            __CLR4_5_2g59g59lvl9el59.R.inc(21003);for (byte[] sequenceParameterSetExtNALUnit : sequenceParameterSetExts) {{
                __CLR4_5_2g59g59lvl9el59.R.inc(21004);IsoTypeWriter.writeUInt16(byteBuffer, sequenceParameterSetExtNALUnit.length);
                __CLR4_5_2g59g59lvl9el59.R.inc(21005);byteBuffer.put(sequenceParameterSetExtNALUnit);
            }
        }}
    }}finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}

    public long getContentSize() {try{__CLR4_5_2g59g59lvl9el59.R.inc(21006);
        __CLR4_5_2g59g59lvl9el59.R.inc(21007);long size = 5;
        __CLR4_5_2g59g59lvl9el59.R.inc(21008);size += 1; // sequenceParamsetLength
        __CLR4_5_2g59g59lvl9el59.R.inc(21009);for (byte[] sequenceParameterSetNALUnit : sequenceParameterSets) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(21010);size += 2; //lengthSizeMinusOne field
            __CLR4_5_2g59g59lvl9el59.R.inc(21011);size += sequenceParameterSetNALUnit.length;
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(21012);size += 1; // pictureParamsetLength
        __CLR4_5_2g59g59lvl9el59.R.inc(21013);for (byte[] pictureParameterSetNALUnit : pictureParameterSets) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(21014);size += 2; //lengthSizeMinusOne field
            __CLR4_5_2g59g59lvl9el59.R.inc(21015);size += pictureParameterSetNALUnit.length;
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(21016);if ((((hasExts && (avcProfileIndication == 100 || avcProfileIndication == 110 || avcProfileIndication == 122 || avcProfileIndication == 144))&&(__CLR4_5_2g59g59lvl9el59.R.iget(21017)!=0|true))||(__CLR4_5_2g59g59lvl9el59.R.iget(21018)==0&false))) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(21019);size += 4;
            __CLR4_5_2g59g59lvl9el59.R.inc(21020);for (byte[] sequenceParameterSetExtNALUnit : sequenceParameterSetExts) {{
                __CLR4_5_2g59g59lvl9el59.R.inc(21021);size += 2;
                __CLR4_5_2g59g59lvl9el59.R.inc(21022);size += sequenceParameterSetExtNALUnit.length;
            }
        }}

        }__CLR4_5_2g59g59lvl9el59.R.inc(21023);return size;
    }finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}

    public String[] getPPS() {try{__CLR4_5_2g59g59lvl9el59.R.inc(21024);
        __CLR4_5_2g59g59lvl9el59.R.inc(21025);ArrayList<String> l = new ArrayList<String>();
        __CLR4_5_2g59g59lvl9el59.R.inc(21026);for (byte[] pictureParameterSet : pictureParameterSets) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(21027);String details = "not parsable";
            __CLR4_5_2g59g59lvl9el59.R.inc(21028);try {
                // skip NalUnit Header (will not work 100% but at least most cases)
                __CLR4_5_2g59g59lvl9el59.R.inc(21029);details = PictureParameterSet.read(new ByteArrayInputStream(pictureParameterSet, 1, pictureParameterSet.length - 1)).toString();
            } catch (IOException e) {
                __CLR4_5_2g59g59lvl9el59.R.inc(21030);throw new RuntimeException(e);
            }

            __CLR4_5_2g59g59lvl9el59.R.inc(21031);l.add(details);
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(21032);return l.toArray(new String[l.size()]);
    }finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}

    public String[] getSPS() {try{__CLR4_5_2g59g59lvl9el59.R.inc(21033);
        __CLR4_5_2g59g59lvl9el59.R.inc(21034);ArrayList<String> l = new ArrayList<String>();
        __CLR4_5_2g59g59lvl9el59.R.inc(21035);for (byte[] sequenceParameterSet : sequenceParameterSets) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(21036);String detail = "not parsable";
            __CLR4_5_2g59g59lvl9el59.R.inc(21037);try {
                __CLR4_5_2g59g59lvl9el59.R.inc(21038);detail = SeqParameterSet.read(new CleanInputStream(new ByteArrayInputStream(sequenceParameterSet, 1, sequenceParameterSet.length - 1))).toString();
            } catch (IOException e) {

            }
            __CLR4_5_2g59g59lvl9el59.R.inc(21039);l.add(detail);
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(21040);return l.toArray(new String[l.size()]);
    }finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}

    public List<String> getSequenceParameterSetsAsStrings() {try{__CLR4_5_2g59g59lvl9el59.R.inc(21041);
        __CLR4_5_2g59g59lvl9el59.R.inc(21042);List<String> result = new ArrayList<String>(sequenceParameterSets.size());
        __CLR4_5_2g59g59lvl9el59.R.inc(21043);for (byte[] parameterSet : sequenceParameterSets) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(21044);result.add(Hex.encodeHex(parameterSet));
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(21045);return result;
    }finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}

    public List<String> getSequenceParameterSetExtsAsStrings() {try{__CLR4_5_2g59g59lvl9el59.R.inc(21046);
        __CLR4_5_2g59g59lvl9el59.R.inc(21047);List<String> result = new ArrayList<String>(sequenceParameterSetExts.size());
        __CLR4_5_2g59g59lvl9el59.R.inc(21048);for (byte[] parameterSet : sequenceParameterSetExts) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(21049);result.add(Hex.encodeHex(parameterSet));
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(21050);return result;
    }finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}

    public List<String> getPictureParameterSetsAsStrings() {try{__CLR4_5_2g59g59lvl9el59.R.inc(21051);
        __CLR4_5_2g59g59lvl9el59.R.inc(21052);List<String> result = new ArrayList<String>(pictureParameterSets.size());
        __CLR4_5_2g59g59lvl9el59.R.inc(21053);for (byte[] parameterSet : pictureParameterSets) {{
            __CLR4_5_2g59g59lvl9el59.R.inc(21054);result.add(Hex.encodeHex(parameterSet));
        }
        }__CLR4_5_2g59g59lvl9el59.R.inc(21055);return result;
    }finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2g59g59lvl9el59.R.inc(21056);
        __CLR4_5_2g59g59lvl9el59.R.inc(21057);return "AvcDecoderConfigurationRecord{" +
                "configurationVersion=" + configurationVersion +
                ", avcProfileIndication=" + avcProfileIndication +
                ", profileCompatibility=" + profileCompatibility +
                ", avcLevelIndication=" + avcLevelIndication +
                ", lengthSizeMinusOne=" + lengthSizeMinusOne +
                ", hasExts=" + hasExts +
                ", chromaFormat=" + chromaFormat +
                ", bitDepthLumaMinus8=" + bitDepthLumaMinus8 +
                ", bitDepthChromaMinus8=" + bitDepthChromaMinus8 +
                ", lengthSizeMinusOnePaddingBits=" + lengthSizeMinusOnePaddingBits +
                ", numberOfSequenceParameterSetsPaddingBits=" + numberOfSequenceParameterSetsPaddingBits +
                ", chromaFormatPaddingBits=" + chromaFormatPaddingBits +
                ", bitDepthLumaMinus8PaddingBits=" + bitDepthLumaMinus8PaddingBits +
                ", bitDepthChromaMinus8PaddingBits=" + bitDepthChromaMinus8PaddingBits +
                '}';
    }finally{__CLR4_5_2g59g59lvl9el59.R.flushNeeded();}}
}
