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
import com.googlecode.mp4parser.AbstractContainerBox;

import java.io.IOException;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.DataSource;
import java.nio.channels.WritableByteChannel;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * The data reference object contains a table of data references (normally URLs) that declare the location(s) of
 * the media data used within the presentation. The data reference index in the sample description ties entries in
 * this table to the samples in the track. A track may be split over several sources in this way.
 * If the flag is set indicating that the data is in the same file as this box, then no string (not even an empty one)
 * shall be supplied in the entry field.
 * The DataEntryBox within the DataReferenceBox shall be either a DataEntryUrnBox or a DataEntryUrlBox.
 *
 * @see com.coremedia.iso.boxes.DataEntryUrlBox
 * @see com.coremedia.iso.boxes.DataEntryUrnBox
 */
public class DataReferenceBox extends AbstractContainerBox implements FullBox {public static class __CLR4_5_2lululvl9eemz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,817,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE = "dref";

    public DataReferenceBox() {
        super(TYPE);__CLR4_5_2lululvl9eemz.R.inc(787);try{__CLR4_5_2lululvl9eemz.R.inc(786);

    }finally{__CLR4_5_2lululvl9eemz.R.flushNeeded();}}

    private int version;
    private int flags;

    public int getVersion() {try{__CLR4_5_2lululvl9eemz.R.inc(788);
        __CLR4_5_2lululvl9eemz.R.inc(789);return version;
    }finally{__CLR4_5_2lululvl9eemz.R.flushNeeded();}}

    public void setVersion(int version) {try{__CLR4_5_2lululvl9eemz.R.inc(790);
        __CLR4_5_2lululvl9eemz.R.inc(791);this.version = version;
    }finally{__CLR4_5_2lululvl9eemz.R.flushNeeded();}}

    public int getFlags() {try{__CLR4_5_2lululvl9eemz.R.inc(792);
        __CLR4_5_2lululvl9eemz.R.inc(793);return flags;
    }finally{__CLR4_5_2lululvl9eemz.R.flushNeeded();}}

    public void setFlags(int flags) {try{__CLR4_5_2lululvl9eemz.R.inc(794);
        __CLR4_5_2lululvl9eemz.R.inc(795);this.flags = flags;
    }finally{__CLR4_5_2lululvl9eemz.R.flushNeeded();}}


    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2lululvl9eemz.R.inc(796);
        __CLR4_5_2lululvl9eemz.R.inc(797);ByteBuffer versionFlagNumOfChildBoxes = ByteBuffer.allocate(8);
        __CLR4_5_2lululvl9eemz.R.inc(798);dataSource.read(versionFlagNumOfChildBoxes);
        __CLR4_5_2lululvl9eemz.R.inc(799);versionFlagNumOfChildBoxes.rewind();
        __CLR4_5_2lululvl9eemz.R.inc(800);version = IsoTypeReader.readUInt8(versionFlagNumOfChildBoxes);
        __CLR4_5_2lululvl9eemz.R.inc(801);flags = IsoTypeReader.readUInt24(versionFlagNumOfChildBoxes);
        // number of child boxes is not required - ignore
        __CLR4_5_2lululvl9eemz.R.inc(802);initContainer(dataSource, contentSize - 8, boxParser);
    }finally{__CLR4_5_2lululvl9eemz.R.flushNeeded();}}


    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_2lululvl9eemz.R.inc(803);
        __CLR4_5_2lululvl9eemz.R.inc(804);writableByteChannel.write(getHeader());
        __CLR4_5_2lululvl9eemz.R.inc(805);ByteBuffer versionFlagNumOfChildBoxes = ByteBuffer.allocate(8);
        __CLR4_5_2lululvl9eemz.R.inc(806);IsoTypeWriter.writeUInt8(versionFlagNumOfChildBoxes, version);
        __CLR4_5_2lululvl9eemz.R.inc(807);IsoTypeWriter.writeUInt24(versionFlagNumOfChildBoxes, flags);
        __CLR4_5_2lululvl9eemz.R.inc(808);IsoTypeWriter.writeUInt32(versionFlagNumOfChildBoxes, getBoxes().size());
        __CLR4_5_2lululvl9eemz.R.inc(809);writableByteChannel.write((ByteBuffer) versionFlagNumOfChildBoxes.rewind());
        __CLR4_5_2lululvl9eemz.R.inc(810);writeContainer(writableByteChannel);
    }finally{__CLR4_5_2lululvl9eemz.R.flushNeeded();}}

    @Override
    public long getSize() {try{__CLR4_5_2lululvl9eemz.R.inc(811);
        __CLR4_5_2lululvl9eemz.R.inc(812);long s = getContainerSize();
        __CLR4_5_2lululvl9eemz.R.inc(813);long t = 8;
        __CLR4_5_2lululvl9eemz.R.inc(814);return s + t + (((((largeBox || (s + t + 8) >= (1L << 32)) )&&(__CLR4_5_2lululvl9eemz.R.iget(815)!=0|true))||(__CLR4_5_2lululvl9eemz.R.iget(816)==0&false))? 16 : 8);

    }finally{__CLR4_5_2lululvl9eemz.R.flushNeeded();}}

}
