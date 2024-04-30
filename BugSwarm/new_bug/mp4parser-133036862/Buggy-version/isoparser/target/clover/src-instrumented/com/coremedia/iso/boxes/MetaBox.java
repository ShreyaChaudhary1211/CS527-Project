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
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.MemoryDataSourceImpl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;


/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * A common base structure to contain general metadata. See ISO/IEC 14496-12 Ch. 8.44.1.
 */
public class MetaBox extends AbstractContainerBox {public static class __CLR4_5_218y18ylvlulbmf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,1667,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "meta";

    private boolean isFullBox = true; // default is fullbox cause that's what ISO defines, simple box is apple specifc

    private int version;
    private int flags;

    public MetaBox() {
        super(TYPE);__CLR4_5_218y18ylvlulbmf.R.inc(1619);try{__CLR4_5_218y18ylvlulbmf.R.inc(1618);
    }finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}

    public int getVersion() {try{__CLR4_5_218y18ylvlulbmf.R.inc(1620);
        __CLR4_5_218y18ylvlulbmf.R.inc(1621);return version;
    }finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}

    public void setVersion(int version) {try{__CLR4_5_218y18ylvlulbmf.R.inc(1622);
        __CLR4_5_218y18ylvlulbmf.R.inc(1623);this.version = version;
    }finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}

    public int getFlags() {try{__CLR4_5_218y18ylvlulbmf.R.inc(1624);
        __CLR4_5_218y18ylvlulbmf.R.inc(1625);return flags;
    }finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}

    public void setFlags(int flags) {try{__CLR4_5_218y18ylvlulbmf.R.inc(1626);
        __CLR4_5_218y18ylvlulbmf.R.inc(1627);this.flags = flags;
    }finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}

    /**
     * Parses the version/flags header and returns the remaining box size.
     *
     * @param content the <code>ByteBuffer</code> that contains the version &amp; flag
     * @return number of bytes read
     */
    protected final long parseVersionAndFlags(ByteBuffer content) {try{__CLR4_5_218y18ylvlulbmf.R.inc(1628);
        __CLR4_5_218y18ylvlulbmf.R.inc(1629);version = IsoTypeReader.readUInt8(content);
        __CLR4_5_218y18ylvlulbmf.R.inc(1630);flags = IsoTypeReader.readUInt24(content);
        __CLR4_5_218y18ylvlulbmf.R.inc(1631);return 4;
    }finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}

    protected final void writeVersionAndFlags(ByteBuffer bb) {try{__CLR4_5_218y18ylvlulbmf.R.inc(1632);
        __CLR4_5_218y18ylvlulbmf.R.inc(1633);IsoTypeWriter.writeUInt8(bb, version);
        __CLR4_5_218y18ylvlulbmf.R.inc(1634);IsoTypeWriter.writeUInt24(bb, flags);
    }finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}

    @Override
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_218y18ylvlulbmf.R.inc(1635);
        __CLR4_5_218y18ylvlulbmf.R.inc(1636);ByteBuffer bb = ByteBuffer.allocate(l2i(contentSize));
        __CLR4_5_218y18ylvlulbmf.R.inc(1637);dataSource.read(bb);
        __CLR4_5_218y18ylvlulbmf.R.inc(1638);bb.position(4);
        __CLR4_5_218y18ylvlulbmf.R.inc(1639);String isHdlr = IsoTypeReader.read4cc(bb);
        __CLR4_5_218y18ylvlulbmf.R.inc(1640);if (((("hdlr".equals(isHdlr))&&(__CLR4_5_218y18ylvlulbmf.R.iget(1641)!=0|true))||(__CLR4_5_218y18ylvlulbmf.R.iget(1642)==0&false))) {{
            __CLR4_5_218y18ylvlulbmf.R.inc(1643);isFullBox = false;
            __CLR4_5_218y18ylvlulbmf.R.inc(1644);initContainer(new MemoryDataSourceImpl((ByteBuffer) bb.rewind()), contentSize, boxParser);
            // we got apple specifc box here
        } }else {{
            __CLR4_5_218y18ylvlulbmf.R.inc(1645);isFullBox = true;
            __CLR4_5_218y18ylvlulbmf.R.inc(1646);parseVersionAndFlags((ByteBuffer) bb.rewind());
            __CLR4_5_218y18ylvlulbmf.R.inc(1647);initContainer(new MemoryDataSourceImpl((ByteBuffer) bb.rewind()), contentSize - 4, boxParser);
        }

    }}finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_218y18ylvlulbmf.R.inc(1648);
        __CLR4_5_218y18ylvlulbmf.R.inc(1649);writableByteChannel.write(getHeader());
        __CLR4_5_218y18ylvlulbmf.R.inc(1650);if ((((isFullBox)&&(__CLR4_5_218y18ylvlulbmf.R.iget(1651)!=0|true))||(__CLR4_5_218y18ylvlulbmf.R.iget(1652)==0&false))) {{
            __CLR4_5_218y18ylvlulbmf.R.inc(1653);ByteBuffer bb = ByteBuffer.allocate(4);
            __CLR4_5_218y18ylvlulbmf.R.inc(1654);writeVersionAndFlags(bb);
            __CLR4_5_218y18ylvlulbmf.R.inc(1655);writableByteChannel.write((ByteBuffer) bb.rewind());
        }
        }__CLR4_5_218y18ylvlulbmf.R.inc(1656);writeContainer(writableByteChannel);
    }finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}
    @Override
    public long getSize() {try{__CLR4_5_218y18ylvlulbmf.R.inc(1657);
        __CLR4_5_218y18ylvlulbmf.R.inc(1658);long s = getContainerSize();
        __CLR4_5_218y18ylvlulbmf.R.inc(1659);long t = 0; // bytes to container start
        __CLR4_5_218y18ylvlulbmf.R.inc(1660);if ((((isFullBox)&&(__CLR4_5_218y18ylvlulbmf.R.iget(1661)!=0|true))||(__CLR4_5_218y18ylvlulbmf.R.iget(1662)==0&false))) {{
            __CLR4_5_218y18ylvlulbmf.R.inc(1663);t += 4;
        }
        }__CLR4_5_218y18ylvlulbmf.R.inc(1664);return s + t + (((((largeBox || (s + t) >= (1L << 32)) )&&(__CLR4_5_218y18ylvlulbmf.R.iget(1665)!=0|true))||(__CLR4_5_218y18ylvlulbmf.R.iget(1666)==0&false))? 16 : 8);

    }finally{__CLR4_5_218y18ylvlulbmf.R.flushNeeded();}}
}
