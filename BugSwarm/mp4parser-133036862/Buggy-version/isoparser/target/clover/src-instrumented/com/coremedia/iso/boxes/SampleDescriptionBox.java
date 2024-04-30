/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an AS IS BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.AbstractContainerBox;

import java.io.IOException;
import java.nio.ByteBuffer;

import com.googlecode.mp4parser.DataSource;

import java.nio.channels.WritableByteChannel;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * The sample description table gives detailed information about the coding type used, and any initialization
 * information needed for that coding. <br>
 * The information stored in the sample description box after the entry-count is both track-type specific as
 * documented here, and can also have variants within a track type (e.g. different codings may use different
 * specific information after some common fields, even within a video track).<br>
 * For video tracks, a VisualSampleEntry is used; for audio tracks, an AudioSampleEntry. Hint tracks use an
 * entry format specific to their protocol, with an appropriate name. Timed Text tracks use a TextSampleEntry
 * For hint tracks, the sample description contains appropriate declarative data for the streaming protocol being
 * used, and the format of the hint track. The definition of the sample description is specific to the protocol.
 * Multiple descriptions may be used within a track.<br>
 * The 'protocol' and 'codingname' fields are registered identifiers that uniquely identify the streaming protocol or
 * compression format decoder to be used. A given protocol or codingname may have optional or required
 * extensions to the sample description (e.g. codec initialization parameters). All such extensions shall be within
 * boxes; these boxes occur after the required fields. Unrecognized boxes shall be ignored.
 * <br>
 * Defined in ISO/IEC 14496-12
 *
 * @see com.coremedia.iso.boxes.sampleentry.VisualSampleEntry
 * @see com.coremedia.iso.boxes.sampleentry.TextSampleEntry
 * @see com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
 */
public class SampleDescriptionBox extends AbstractContainerBox implements FullBox {public static class __CLR4_5_21m61m6lvlulbvd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,2129,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "stsd";

    public SampleDescriptionBox() {
        super(TYPE);__CLR4_5_21m61m6lvlulbvd.R.inc(2095);try{__CLR4_5_21m61m6lvlulbvd.R.inc(2094);
    }finally{__CLR4_5_21m61m6lvlulbvd.R.flushNeeded();}}

    private int version;
    private int flags;

    public int getVersion() {try{__CLR4_5_21m61m6lvlulbvd.R.inc(2096);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2097);return version;
    }finally{__CLR4_5_21m61m6lvlulbvd.R.flushNeeded();}}

    public void setVersion(int version) {try{__CLR4_5_21m61m6lvlulbvd.R.inc(2098);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2099);this.version = version;
    }finally{__CLR4_5_21m61m6lvlulbvd.R.flushNeeded();}}

    public int getFlags() {try{__CLR4_5_21m61m6lvlulbvd.R.inc(2100);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2101);return flags;
    }finally{__CLR4_5_21m61m6lvlulbvd.R.flushNeeded();}}

    public void setFlags(int flags) {try{__CLR4_5_21m61m6lvlulbvd.R.inc(2102);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2103);this.flags = flags;
    }finally{__CLR4_5_21m61m6lvlulbvd.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_21m61m6lvlulbvd.R.inc(2104);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2105);ByteBuffer versionFlagNumOfChildBoxes = ByteBuffer.allocate(8);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2106);dataSource.read(versionFlagNumOfChildBoxes);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2107);versionFlagNumOfChildBoxes.rewind();
        __CLR4_5_21m61m6lvlulbvd.R.inc(2108);version = IsoTypeReader.readUInt8(versionFlagNumOfChildBoxes);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2109);flags = IsoTypeReader.readUInt24(versionFlagNumOfChildBoxes);
        // number of child boxes is not required
        __CLR4_5_21m61m6lvlulbvd.R.inc(2110);initContainer(dataSource, contentSize - 8, boxParser);
    }finally{__CLR4_5_21m61m6lvlulbvd.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_21m61m6lvlulbvd.R.inc(2111);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2112);writableByteChannel.write(getHeader());
        __CLR4_5_21m61m6lvlulbvd.R.inc(2113);ByteBuffer versionFlagNumOfChildBoxes = ByteBuffer.allocate(8);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2114);IsoTypeWriter.writeUInt8(versionFlagNumOfChildBoxes, version);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2115);IsoTypeWriter.writeUInt24(versionFlagNumOfChildBoxes, flags);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2116);IsoTypeWriter.writeUInt32(versionFlagNumOfChildBoxes, getBoxes().size());
        __CLR4_5_21m61m6lvlulbvd.R.inc(2117);writableByteChannel.write((ByteBuffer) versionFlagNumOfChildBoxes.rewind());
        __CLR4_5_21m61m6lvlulbvd.R.inc(2118);writeContainer(writableByteChannel);
    }finally{__CLR4_5_21m61m6lvlulbvd.R.flushNeeded();}}

    public AbstractSampleEntry getSampleEntry() {try{__CLR4_5_21m61m6lvlulbvd.R.inc(2119);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2120);for (AbstractSampleEntry box : getBoxes(AbstractSampleEntry.class)) {{
            __CLR4_5_21m61m6lvlulbvd.R.inc(2121);return box;
        }
        }__CLR4_5_21m61m6lvlulbvd.R.inc(2122);return null;
    }finally{__CLR4_5_21m61m6lvlulbvd.R.flushNeeded();}}

    @Override
    public long getSize() {try{__CLR4_5_21m61m6lvlulbvd.R.inc(2123);
        __CLR4_5_21m61m6lvlulbvd.R.inc(2124);long s = getContainerSize();
        __CLR4_5_21m61m6lvlulbvd.R.inc(2125);long t = 8;
        __CLR4_5_21m61m6lvlulbvd.R.inc(2126);return s + t + (((((largeBox || (s + t + 8) >= (1L << 32)) )&&(__CLR4_5_21m61m6lvlulbvd.R.iget(2127)!=0|true))||(__CLR4_5_21m61m6lvlulbvd.R.iget(2128)==0&false))? 16 : 8);

    }finally{__CLR4_5_21m61m6lvlulbvd.R.flushNeeded();}}
}
