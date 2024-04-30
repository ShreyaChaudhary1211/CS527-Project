/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Created by sannies on 10/15/13.
 */
public class MemoryDataSourceImpl implements DataSource {public static class __CLR4_5_242u42ulvluld2v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,5321,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ByteBuffer data;

    public MemoryDataSourceImpl(byte[] data) {try{__CLR4_5_242u42ulvluld2v.R.inc(5286);
        __CLR4_5_242u42ulvluld2v.R.inc(5287);this.data = ByteBuffer.wrap(data);
    }finally{__CLR4_5_242u42ulvluld2v.R.flushNeeded();}}

    public MemoryDataSourceImpl(ByteBuffer buffer) {try{__CLR4_5_242u42ulvluld2v.R.inc(5288);
        __CLR4_5_242u42ulvluld2v.R.inc(5289);this.data = buffer;
    }finally{__CLR4_5_242u42ulvluld2v.R.flushNeeded();}}

    public int read(ByteBuffer byteBuffer) throws IOException {try{__CLR4_5_242u42ulvluld2v.R.inc(5290);
        __CLR4_5_242u42ulvluld2v.R.inc(5291);if ((((0 == data.remaining() && 0 != byteBuffer.remaining())&&(__CLR4_5_242u42ulvluld2v.R.iget(5292)!=0|true))||(__CLR4_5_242u42ulvluld2v.R.iget(5293)==0&false))) {{
            __CLR4_5_242u42ulvluld2v.R.inc(5294);return -1;
        }
        }__CLR4_5_242u42ulvluld2v.R.inc(5295);int size = Math.min(byteBuffer.remaining(), data.remaining());
        __CLR4_5_242u42ulvluld2v.R.inc(5296);if ((((byteBuffer.hasArray())&&(__CLR4_5_242u42ulvluld2v.R.iget(5297)!=0|true))||(__CLR4_5_242u42ulvluld2v.R.iget(5298)==0&false))) {{
            __CLR4_5_242u42ulvluld2v.R.inc(5299);byteBuffer.put(data.array(), data.position(), size);
            __CLR4_5_242u42ulvluld2v.R.inc(5300);data.position(data.position() + size);
        } }else {{
            __CLR4_5_242u42ulvluld2v.R.inc(5301);byte[] buf = new byte[size];
            __CLR4_5_242u42ulvluld2v.R.inc(5302);data.get(buf);
            __CLR4_5_242u42ulvluld2v.R.inc(5303);byteBuffer.put(buf);
        }
        }__CLR4_5_242u42ulvluld2v.R.inc(5304);return size;
    }finally{__CLR4_5_242u42ulvluld2v.R.flushNeeded();}}

    public long size() throws IOException {try{__CLR4_5_242u42ulvluld2v.R.inc(5305);
        __CLR4_5_242u42ulvluld2v.R.inc(5306);return data.capacity();
    }finally{__CLR4_5_242u42ulvluld2v.R.flushNeeded();}}

    public long position() throws IOException {try{__CLR4_5_242u42ulvluld2v.R.inc(5307);
        __CLR4_5_242u42ulvluld2v.R.inc(5308);return data.position();
    }finally{__CLR4_5_242u42ulvluld2v.R.flushNeeded();}}

    public void position(long nuPos) throws IOException {try{__CLR4_5_242u42ulvluld2v.R.inc(5309);
        __CLR4_5_242u42ulvluld2v.R.inc(5310);data.position(l2i(nuPos));
    }finally{__CLR4_5_242u42ulvluld2v.R.flushNeeded();}}

    public long transferTo(long position, long count, WritableByteChannel target) throws IOException {try{__CLR4_5_242u42ulvluld2v.R.inc(5311);
        __CLR4_5_242u42ulvluld2v.R.inc(5312);return target.write((ByteBuffer) ((ByteBuffer) data.position(l2i(position))).slice().limit(l2i(count)));
    }finally{__CLR4_5_242u42ulvluld2v.R.flushNeeded();}}

    public ByteBuffer map(long startPosition, long size) throws IOException {try{__CLR4_5_242u42ulvluld2v.R.inc(5313);
        __CLR4_5_242u42ulvluld2v.R.inc(5314);int oldPosition = data.position();
        __CLR4_5_242u42ulvluld2v.R.inc(5315);data.position(l2i(startPosition));
        __CLR4_5_242u42ulvluld2v.R.inc(5316);ByteBuffer result = data.slice();
        __CLR4_5_242u42ulvluld2v.R.inc(5317);result.limit(l2i(size));
        __CLR4_5_242u42ulvluld2v.R.inc(5318);data.position(oldPosition);
        __CLR4_5_242u42ulvluld2v.R.inc(5319);return result;
    }finally{__CLR4_5_242u42ulvluld2v.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_242u42ulvluld2v.R.inc(5320);
        //nop
    }finally{__CLR4_5_242u42ulvluld2v.R.flushNeeded();}}

}
