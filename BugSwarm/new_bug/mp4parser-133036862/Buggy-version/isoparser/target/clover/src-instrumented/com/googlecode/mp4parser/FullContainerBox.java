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

package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.FullBox;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.logging.Logger;

/**
 * Abstract base class for a full iso box only containing ither boxes.
 */
public abstract class FullContainerBox extends AbstractContainerBox implements FullBox {public static class __CLR4_5_241n41nlvluld2d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,5286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger LOG = Logger.getLogger(FullContainerBox.class.getName());
    private int version;
    private int flags;

    public int getVersion() {try{__CLR4_5_241n41nlvluld2d.R.inc(5243);
        __CLR4_5_241n41nlvluld2d.R.inc(5244);return version;
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    public void setVersion(int version) {try{__CLR4_5_241n41nlvluld2d.R.inc(5245);
        __CLR4_5_241n41nlvluld2d.R.inc(5246);this.version = version;
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    public int getFlags() {try{__CLR4_5_241n41nlvluld2d.R.inc(5247);
        __CLR4_5_241n41nlvluld2d.R.inc(5248);return flags;
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    public void setFlags(int flags) {try{__CLR4_5_241n41nlvluld2d.R.inc(5249);
        __CLR4_5_241n41nlvluld2d.R.inc(5250);this.flags = flags;
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T extends Box> List<T> getBoxes(Class<T> clazz) {try{__CLR4_5_241n41nlvluld2d.R.inc(5251);
        __CLR4_5_241n41nlvluld2d.R.inc(5252);return getBoxes(clazz, false);
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    public FullContainerBox(String type) {
        super(type);__CLR4_5_241n41nlvluld2d.R.inc(5254);try{__CLR4_5_241n41nlvluld2d.R.inc(5253);
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_241n41nlvluld2d.R.inc(5255);
        __CLR4_5_241n41nlvluld2d.R.inc(5256);ByteBuffer versionAndFlags = ByteBuffer.allocate(4);
        __CLR4_5_241n41nlvluld2d.R.inc(5257);dataSource.read(versionAndFlags);
        __CLR4_5_241n41nlvluld2d.R.inc(5258);parseVersionAndFlags((ByteBuffer) versionAndFlags.rewind());
        __CLR4_5_241n41nlvluld2d.R.inc(5259);super.parse(dataSource, header, contentSize, boxParser);
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_241n41nlvluld2d.R.inc(5260);
        __CLR4_5_241n41nlvluld2d.R.inc(5261);super.getBox(writableByteChannel);
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_241n41nlvluld2d.R.inc(5262);
        __CLR4_5_241n41nlvluld2d.R.inc(5263);return this.getClass().getSimpleName() + "[childBoxes]";
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    /**
     * Parses the version/flags header and returns the remaining box size.
     *
     * @param content the <code>ByteBuffer</code> that contains the version &amp; flag
     * @return number of bytes read
     */
    protected final long parseVersionAndFlags(ByteBuffer content) {try{__CLR4_5_241n41nlvluld2d.R.inc(5264);
        __CLR4_5_241n41nlvluld2d.R.inc(5265);version = IsoTypeReader.readUInt8(content);
        __CLR4_5_241n41nlvluld2d.R.inc(5266);flags = IsoTypeReader.readUInt24(content);
        __CLR4_5_241n41nlvluld2d.R.inc(5267);return 4;
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    protected final void writeVersionAndFlags(ByteBuffer bb) {try{__CLR4_5_241n41nlvluld2d.R.inc(5268);
        __CLR4_5_241n41nlvluld2d.R.inc(5269);IsoTypeWriter.writeUInt8(bb, version);
        __CLR4_5_241n41nlvluld2d.R.inc(5270);IsoTypeWriter.writeUInt24(bb, flags);
    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

    @Override
    protected ByteBuffer getHeader() {try{__CLR4_5_241n41nlvluld2d.R.inc(5271);
        __CLR4_5_241n41nlvluld2d.R.inc(5272);ByteBuffer header;
        __CLR4_5_241n41nlvluld2d.R.inc(5273);if ((((largeBox || getSize() >= (1L << 32))&&(__CLR4_5_241n41nlvluld2d.R.iget(5274)!=0|true))||(__CLR4_5_241n41nlvluld2d.R.iget(5275)==0&false))) {{
            __CLR4_5_241n41nlvluld2d.R.inc(5276);header = ByteBuffer.wrap(new byte[]{0, 0, 0, 1, type.getBytes()[0], type.getBytes()[1], type.getBytes()[2], type.getBytes()[3], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
            __CLR4_5_241n41nlvluld2d.R.inc(5277);header.position(8);
            __CLR4_5_241n41nlvluld2d.R.inc(5278);IsoTypeWriter.writeUInt64(header, getSize());
            __CLR4_5_241n41nlvluld2d.R.inc(5279);writeVersionAndFlags(header);
        } }else {{
            __CLR4_5_241n41nlvluld2d.R.inc(5280);header = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, type.getBytes()[0], type.getBytes()[1], type.getBytes()[2], type.getBytes()[3], 0, 0, 0, 0});
            __CLR4_5_241n41nlvluld2d.R.inc(5281);IsoTypeWriter.writeUInt32(header, getSize());
            __CLR4_5_241n41nlvluld2d.R.inc(5282);header.position(8);
            __CLR4_5_241n41nlvluld2d.R.inc(5283);writeVersionAndFlags(header);
        }
        }__CLR4_5_241n41nlvluld2d.R.inc(5284);header.rewind();
        __CLR4_5_241n41nlvluld2d.R.inc(5285);return header;

    }finally{__CLR4_5_241n41nlvluld2d.R.flushNeeded();}}

}
