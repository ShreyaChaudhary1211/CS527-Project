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
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.ChannelHelper;

import java.io.IOException;
import java.nio.ByteBuffer;

import com.googlecode.mp4parser.DataSource;

import java.nio.channels.WritableByteChannel;
import java.util.LinkedList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * A free box. Just a placeholder to enable editing without rewriting the whole file.
 */
public class FreeBox implements Box {public static class __CLR4_5_2r7r7lvl9eer1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,1053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "free";
    ByteBuffer data;
    List<Box> replacers = new LinkedList<Box>();
    private Container parent;
    private long offset;

    public FreeBox() {try{__CLR4_5_2r7r7lvl9eer1.R.inc(979);
        __CLR4_5_2r7r7lvl9eer1.R.inc(980);this.data = ByteBuffer.wrap(new byte[0]);
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public FreeBox(int size) {try{__CLR4_5_2r7r7lvl9eer1.R.inc(981);
        __CLR4_5_2r7r7lvl9eer1.R.inc(982);this.data = ByteBuffer.allocate(size);
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public long getOffset() {try{__CLR4_5_2r7r7lvl9eer1.R.inc(983);
        __CLR4_5_2r7r7lvl9eer1.R.inc(984);return offset;
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public ByteBuffer getData() {try{__CLR4_5_2r7r7lvl9eer1.R.inc(985);
        __CLR4_5_2r7r7lvl9eer1.R.inc(986);if ((((data != null)&&(__CLR4_5_2r7r7lvl9eer1.R.iget(987)!=0|true))||(__CLR4_5_2r7r7lvl9eer1.R.iget(988)==0&false))) {{
            __CLR4_5_2r7r7lvl9eer1.R.inc(989);return (ByteBuffer) data.duplicate().rewind();
        } }else {{
            __CLR4_5_2r7r7lvl9eer1.R.inc(990);return null;
        }
    }}finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public void setData(ByteBuffer data) {try{__CLR4_5_2r7r7lvl9eer1.R.inc(991);
        __CLR4_5_2r7r7lvl9eer1.R.inc(992);this.data = data;
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public void getBox(WritableByteChannel os) throws IOException {try{__CLR4_5_2r7r7lvl9eer1.R.inc(993);
        __CLR4_5_2r7r7lvl9eer1.R.inc(994);for (Box replacer : replacers) {{
            __CLR4_5_2r7r7lvl9eer1.R.inc(995);replacer.getBox(os);
        }
        }__CLR4_5_2r7r7lvl9eer1.R.inc(996);ByteBuffer header = ByteBuffer.allocate(8);
        __CLR4_5_2r7r7lvl9eer1.R.inc(997);IsoTypeWriter.writeUInt32(header, 8 + data.limit());
        __CLR4_5_2r7r7lvl9eer1.R.inc(998);header.put(TYPE.getBytes());
        __CLR4_5_2r7r7lvl9eer1.R.inc(999);header.rewind();
        __CLR4_5_2r7r7lvl9eer1.R.inc(1000);os.write(header);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1001);header.rewind();
        __CLR4_5_2r7r7lvl9eer1.R.inc(1002);data.rewind();
        __CLR4_5_2r7r7lvl9eer1.R.inc(1003);os.write(data);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1004);data.rewind();

    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public Container getParent() {try{__CLR4_5_2r7r7lvl9eer1.R.inc(1005);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1006);return parent;
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public void setParent(Container parent) {try{__CLR4_5_2r7r7lvl9eer1.R.inc(1007);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1008);this.parent = parent;
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public long getSize() {try{__CLR4_5_2r7r7lvl9eer1.R.inc(1009);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1010);long size = 8;
        __CLR4_5_2r7r7lvl9eer1.R.inc(1011);for (Box replacer : replacers) {{
            __CLR4_5_2r7r7lvl9eer1.R.inc(1012);size += replacer.getSize();
        }
        }__CLR4_5_2r7r7lvl9eer1.R.inc(1013);size += data.limit();
        __CLR4_5_2r7r7lvl9eer1.R.inc(1014);return size;
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public String getType() {try{__CLR4_5_2r7r7lvl9eer1.R.inc(1015);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1016);return TYPE;
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_2r7r7lvl9eer1.R.inc(1017);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1018);this.offset = dataSource.position() - header.remaining();
        __CLR4_5_2r7r7lvl9eer1.R.inc(1019);if ((((contentSize > 1024 * 1024)&&(__CLR4_5_2r7r7lvl9eer1.R.iget(1020)!=0|true))||(__CLR4_5_2r7r7lvl9eer1.R.iget(1021)==0&false))) {{
            // It's quite expensive to map a file into the memory. Just do it when the box is larger than a MB.
            __CLR4_5_2r7r7lvl9eer1.R.inc(1022);data = dataSource.map(dataSource.position(), contentSize);
            __CLR4_5_2r7r7lvl9eer1.R.inc(1023);dataSource.position(dataSource.position() + contentSize);
        } }else {{
            assert (((contentSize < Integer.MAX_VALUE)&&(__CLR4_5_2r7r7lvl9eer1.R.iget(1024)!=0|true))||(__CLR4_5_2r7r7lvl9eer1.R.iget(1025)==0&false));
            __CLR4_5_2r7r7lvl9eer1.R.inc(1026);data = ByteBuffer.allocate(l2i(contentSize));
            __CLR4_5_2r7r7lvl9eer1.R.inc(1027);dataSource.read(data);
        }
    }}finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}


    public void addAndReplace(Box box) {try{__CLR4_5_2r7r7lvl9eer1.R.inc(1028);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1029);data.position(l2i(box.getSize()));
        __CLR4_5_2r7r7lvl9eer1.R.inc(1030);data = data.slice();
        __CLR4_5_2r7r7lvl9eer1.R.inc(1031);replacers.add(box);
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2r7r7lvl9eer1.R.inc(1032);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1033);if ((((this == o)&&(__CLR4_5_2r7r7lvl9eer1.R.iget(1034)!=0|true))||(__CLR4_5_2r7r7lvl9eer1.R.iget(1035)==0&false))) {__CLR4_5_2r7r7lvl9eer1.R.inc(1036);return true;
        }__CLR4_5_2r7r7lvl9eer1.R.inc(1037);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2r7r7lvl9eer1.R.iget(1038)!=0|true))||(__CLR4_5_2r7r7lvl9eer1.R.iget(1039)==0&false))) {__CLR4_5_2r7r7lvl9eer1.R.inc(1040);return false;

        }__CLR4_5_2r7r7lvl9eer1.R.inc(1041);FreeBox freeBox = (FreeBox) o;

        __CLR4_5_2r7r7lvl9eer1.R.inc(1042);if (((((((getData() != null )&&(__CLR4_5_2r7r7lvl9eer1.R.iget(1043)!=0|true))||(__CLR4_5_2r7r7lvl9eer1.R.iget(1044)==0&false))? !getData().equals(freeBox.getData()) : freeBox.getData() != null)&&(__CLR4_5_2r7r7lvl9eer1.R.iget(1045)!=0|true))||(__CLR4_5_2r7r7lvl9eer1.R.iget(1046)==0&false))) {__CLR4_5_2r7r7lvl9eer1.R.inc(1047);return false;

        }__CLR4_5_2r7r7lvl9eer1.R.inc(1048);return true;
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2r7r7lvl9eer1.R.inc(1049);
        __CLR4_5_2r7r7lvl9eer1.R.inc(1050);return (((data != null )&&(__CLR4_5_2r7r7lvl9eer1.R.iget(1051)!=0|true))||(__CLR4_5_2r7r7lvl9eer1.R.iget(1052)==0&false))? data.hashCode() : 0;
    }finally{__CLR4_5_2r7r7lvl9eer1.R.flushNeeded();}}
}