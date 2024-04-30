/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Created by sannies on 10/15/13.
 */
public class MemoryDataSourceImpl implements DataSource {public static class __CLR4_5_241x41xlvl9eg0e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,5288,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ByteBuffer data;

    public MemoryDataSourceImpl(byte[] data) {try{__CLR4_5_241x41xlvl9eg0e.R.inc(5253);
        __CLR4_5_241x41xlvl9eg0e.R.inc(5254);this.data = ByteBuffer.wrap(data);
    }finally{__CLR4_5_241x41xlvl9eg0e.R.flushNeeded();}}

    public MemoryDataSourceImpl(ByteBuffer buffer) {try{__CLR4_5_241x41xlvl9eg0e.R.inc(5255);
        __CLR4_5_241x41xlvl9eg0e.R.inc(5256);this.data = buffer;
    }finally{__CLR4_5_241x41xlvl9eg0e.R.flushNeeded();}}

    public int read(ByteBuffer byteBuffer) throws IOException {try{__CLR4_5_241x41xlvl9eg0e.R.inc(5257);
        __CLR4_5_241x41xlvl9eg0e.R.inc(5258);if ((((0 == data.remaining() && 0 != byteBuffer.remaining())&&(__CLR4_5_241x41xlvl9eg0e.R.iget(5259)!=0|true))||(__CLR4_5_241x41xlvl9eg0e.R.iget(5260)==0&false))) {{
            __CLR4_5_241x41xlvl9eg0e.R.inc(5261);return -1;
        }
        }__CLR4_5_241x41xlvl9eg0e.R.inc(5262);int size = Math.min(byteBuffer.remaining(), data.remaining());
        __CLR4_5_241x41xlvl9eg0e.R.inc(5263);if ((((byteBuffer.hasArray())&&(__CLR4_5_241x41xlvl9eg0e.R.iget(5264)!=0|true))||(__CLR4_5_241x41xlvl9eg0e.R.iget(5265)==0&false))) {{
            __CLR4_5_241x41xlvl9eg0e.R.inc(5266);byteBuffer.put(data.array(), data.position(), size);
            __CLR4_5_241x41xlvl9eg0e.R.inc(5267);data.position(data.position() + size);
        } }else {{
            __CLR4_5_241x41xlvl9eg0e.R.inc(5268);byte[] buf = new byte[size];
            __CLR4_5_241x41xlvl9eg0e.R.inc(5269);data.get(buf);
            __CLR4_5_241x41xlvl9eg0e.R.inc(5270);byteBuffer.put(buf);
        }
        }__CLR4_5_241x41xlvl9eg0e.R.inc(5271);return size;
    }finally{__CLR4_5_241x41xlvl9eg0e.R.flushNeeded();}}

    public long size() throws IOException {try{__CLR4_5_241x41xlvl9eg0e.R.inc(5272);
        __CLR4_5_241x41xlvl9eg0e.R.inc(5273);return data.capacity();
    }finally{__CLR4_5_241x41xlvl9eg0e.R.flushNeeded();}}

    public long position() throws IOException {try{__CLR4_5_241x41xlvl9eg0e.R.inc(5274);
        __CLR4_5_241x41xlvl9eg0e.R.inc(5275);return data.position();
    }finally{__CLR4_5_241x41xlvl9eg0e.R.flushNeeded();}}

    public void position(long nuPos) throws IOException {try{__CLR4_5_241x41xlvl9eg0e.R.inc(5276);
        __CLR4_5_241x41xlvl9eg0e.R.inc(5277);data.position(l2i(nuPos));
    }finally{__CLR4_5_241x41xlvl9eg0e.R.flushNeeded();}}

    public long transferTo(long position, long count, WritableByteChannel target) throws IOException {try{__CLR4_5_241x41xlvl9eg0e.R.inc(5278);
        __CLR4_5_241x41xlvl9eg0e.R.inc(5279);return target.write((ByteBuffer) ((ByteBuffer) data.position(l2i(position))).slice().limit(l2i(count)));
    }finally{__CLR4_5_241x41xlvl9eg0e.R.flushNeeded();}}

    public ByteBuffer map(long startPosition, long size) throws IOException {try{__CLR4_5_241x41xlvl9eg0e.R.inc(5280);
        __CLR4_5_241x41xlvl9eg0e.R.inc(5281);int oldPosition = data.position();
        __CLR4_5_241x41xlvl9eg0e.R.inc(5282);data.position(l2i(startPosition));
        __CLR4_5_241x41xlvl9eg0e.R.inc(5283);ByteBuffer result = data.slice();
        __CLR4_5_241x41xlvl9eg0e.R.inc(5284);result.limit(l2i(size));
        __CLR4_5_241x41xlvl9eg0e.R.inc(5285);data.position(oldPosition);
        __CLR4_5_241x41xlvl9eg0e.R.inc(5286);return result;
    }finally{__CLR4_5_241x41xlvl9eg0e.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_241x41xlvl9eg0e.R.inc(5287);
        //nop
    }finally{__CLR4_5_241x41xlvl9eg0e.R.flushNeeded();}}

}
