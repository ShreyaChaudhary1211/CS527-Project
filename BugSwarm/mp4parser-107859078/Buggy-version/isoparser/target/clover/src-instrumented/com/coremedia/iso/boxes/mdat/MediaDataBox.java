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

package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;

import java.io.IOException;
import java.nio.ByteBuffer;

import com.googlecode.mp4parser.DataSource;

import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * This box contains the media data. In video tracks, this box would contain video frames. A presentation may
 * contain zero or more Media Data Boxes. The actual media data follows the type field; its structure is described
 * by the metadata (see {@link com.coremedia.iso.boxes.SampleTableBox}).<br>
 * In large presentations, it may be desirable to have more data in this box than a 32-bit size would permit. In this
 * case, the large variant of the size field is used.<br>
 * There may be any number of these boxes in the file (including zero, if all the media data is in other files). The
 * metadata refers to media data by its absolute offset within the file (see {@link com.coremedia.iso.boxes.StaticChunkOffsetBox});
 * so Media Data Box headers and free space may easily be skipped, and files without any box structure may
 * also be referenced and used.
 */
public final class MediaDataBox implements Box {public static class __CLR4_5_22zw2zwlvl9efmj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,3910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String TYPE = "mdat";

    Container parent;

    // These fields are for the special case of a DataSource as input.
    private DataSource dataSource;
    private long offset;
    private long size;


    public Container getParent() {try{__CLR4_5_22zw2zwlvl9efmj.R.inc(3884);
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3885);return parent;
    }finally{__CLR4_5_22zw2zwlvl9efmj.R.flushNeeded();}}

    public void setParent(Container parent) {try{__CLR4_5_22zw2zwlvl9efmj.R.inc(3886);
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3887);this.parent = parent;
    }finally{__CLR4_5_22zw2zwlvl9efmj.R.flushNeeded();}}

    public String getType() {try{__CLR4_5_22zw2zwlvl9efmj.R.inc(3888);
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3889);return TYPE;
    }finally{__CLR4_5_22zw2zwlvl9efmj.R.flushNeeded();}}

    private static void transfer(DataSource from, long position, long count, WritableByteChannel to) throws IOException {try{__CLR4_5_22zw2zwlvl9efmj.R.inc(3890);
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3891);long maxCount = (64 * 1024 * 1024) - (32 * 1024);
        // Transfer data in chunks a bit less than 64MB
        // People state that this is a kind of magic number on Windows.
        // I don't care. The size seems reasonable.
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3892);long offset = 0;
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3893);while ((((offset < count)&&(__CLR4_5_22zw2zwlvl9efmj.R.iget(3894)!=0|true))||(__CLR4_5_22zw2zwlvl9efmj.R.iget(3895)==0&false))) {{
            __CLR4_5_22zw2zwlvl9efmj.R.inc(3896);offset += from.transferTo(position + offset, Math.min(maxCount, count - offset), to);
        }
    }}finally{__CLR4_5_22zw2zwlvl9efmj.R.flushNeeded();}}

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {try{__CLR4_5_22zw2zwlvl9efmj.R.inc(3897);
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3898);transfer(dataSource, offset, size, writableByteChannel);
    }finally{__CLR4_5_22zw2zwlvl9efmj.R.flushNeeded();}}


    public long getSize() {try{__CLR4_5_22zw2zwlvl9efmj.R.inc(3899);
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3900);return size;
    }finally{__CLR4_5_22zw2zwlvl9efmj.R.flushNeeded();}}

    public long getOffset() {try{__CLR4_5_22zw2zwlvl9efmj.R.inc(3901);
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3902);return offset;
    }finally{__CLR4_5_22zw2zwlvl9efmj.R.flushNeeded();}}

    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_22zw2zwlvl9efmj.R.inc(3903);
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3904);this.offset = dataSource.position() - header.remaining();
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3905);this.dataSource = dataSource;
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3906);this.size = contentSize + header.remaining();
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3907);dataSource.position(dataSource.position() + contentSize);

    }finally{__CLR4_5_22zw2zwlvl9efmj.R.flushNeeded();}}


    @Override
    public String toString() {try{__CLR4_5_22zw2zwlvl9efmj.R.inc(3908);
        __CLR4_5_22zw2zwlvl9efmj.R.inc(3909);return "MediaDataBox{" +
                "size=" + size +
                '}';
    }finally{__CLR4_5_22zw2zwlvl9efmj.R.flushNeeded();}}

}
