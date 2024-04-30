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
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;


/**
 * Abstract base class suitable for most boxes acting purely as container for other boxes.
 */
public class AbstractContainerBox extends BasicContainer implements Box {public static class __CLR4_5_23rx3rxlvlulcsb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,4936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Container parent;
    protected String type;
    protected boolean largeBox;
    private long offset;


    public AbstractContainerBox(String type) {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4893);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4894);this.type = type;
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}

    public Container getParent() {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4895);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4896);return parent;
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}

    public long getOffset() {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4897);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4898);return offset;
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}

    public void setParent(Container parent) {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4899);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4900);this.parent = parent;
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}

    public long getSize() {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4901);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4902);long s = getContainerSize();
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4903);return s + (((((largeBox || (s + 8) >= (1L << 32)) )&&(__CLR4_5_23rx3rxlvlulcsb.R.iget(4904)!=0|true))||(__CLR4_5_23rx3rxlvlulcsb.R.iget(4905)==0&false))? 16 : 8);
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}

    public String getType() {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4906);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4907);return type;
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}

    protected ByteBuffer getHeader() {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4908);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4909);ByteBuffer header;
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4910);if ((((largeBox || getSize() >= (1L << 32))&&(__CLR4_5_23rx3rxlvlulcsb.R.iget(4911)!=0|true))||(__CLR4_5_23rx3rxlvlulcsb.R.iget(4912)==0&false))) {{
            __CLR4_5_23rx3rxlvlulcsb.R.inc(4913);header = ByteBuffer.wrap(new byte[]{0, 0, 0, 1, type.getBytes()[0], type.getBytes()[1], type.getBytes()[2], type.getBytes()[3], 0, 0, 0, 0, 0, 0, 0, 0});
            __CLR4_5_23rx3rxlvlulcsb.R.inc(4914);header.position(8);
            __CLR4_5_23rx3rxlvlulcsb.R.inc(4915);IsoTypeWriter.writeUInt64(header, getSize());
        } }else {{
            __CLR4_5_23rx3rxlvlulcsb.R.inc(4916);header = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, type.getBytes()[0], type.getBytes()[1], type.getBytes()[2], type.getBytes()[3]});
            __CLR4_5_23rx3rxlvlulcsb.R.inc(4917);IsoTypeWriter.writeUInt32(header, getSize());
        }
        }__CLR4_5_23rx3rxlvlulcsb.R.inc(4918);header.rewind();
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4919);return header;
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}

    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4920);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4921);this.offset = dataSource.position() - header.remaining();
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4922);this.largeBox = header.remaining() == 16; // sometime people use large boxes without requiring them
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4923);initContainer(dataSource, contentSize, boxParser);
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}


    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4924);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4925);writableByteChannel.write(getHeader());
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4926);writeContainer(writableByteChannel);
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}

    public void initContainer(DataSource dataSource, long containerSize, BoxParser boxParser) throws IOException {try{__CLR4_5_23rx3rxlvlulcsb.R.inc(4927);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4928);this.dataSource = dataSource;
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4929);this.parsePosition = dataSource.position();
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4930);this.startPosition =  parsePosition - ((((((largeBox || (containerSize + 8) >= (1L << 32)) )&&(__CLR4_5_23rx3rxlvlulcsb.R.iget(4931)!=0|true))||(__CLR4_5_23rx3rxlvlulcsb.R.iget(4932)==0&false))? 16 : 8));
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4933);dataSource.position(dataSource.position() + containerSize);
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4934);this.endPosition = dataSource.position();
        __CLR4_5_23rx3rxlvlulcsb.R.inc(4935);this.boxParser = boxParser;
    }finally{__CLR4_5_23rx3rxlvlulcsb.R.flushNeeded();}}

}
