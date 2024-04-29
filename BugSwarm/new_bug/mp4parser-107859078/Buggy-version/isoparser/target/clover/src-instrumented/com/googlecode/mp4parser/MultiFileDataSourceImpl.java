/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * A rather naive DataSource implementation allowing multiple files as source. Not as performant and memory efficient
 * as a normal FileDataSourceImpl but helpful if video packets are dumped packet by packet to disk.
 */
public class MultiFileDataSourceImpl implements DataSource {public static class __CLR4_5_242w42wlvl9eg12{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,5349,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    FileChannel[] fcs;
    int index = 0;


    public MultiFileDataSourceImpl(File... f) throws FileNotFoundException {try{__CLR4_5_242w42wlvl9eg12.R.inc(5288);

        __CLR4_5_242w42wlvl9eg12.R.inc(5289);this.fcs = new FileChannel[f.length];
        __CLR4_5_242w42wlvl9eg12.R.inc(5290);for (int i = 0; (((i < f.length)&&(__CLR4_5_242w42wlvl9eg12.R.iget(5291)!=0|true))||(__CLR4_5_242w42wlvl9eg12.R.iget(5292)==0&false)); i++) {{
            __CLR4_5_242w42wlvl9eg12.R.inc(5293);fcs[i] = new FileInputStream(f[i]).getChannel();
        }
    }}finally{__CLR4_5_242w42wlvl9eg12.R.flushNeeded();}}


    public int read(ByteBuffer byteBuffer) throws IOException {try{__CLR4_5_242w42wlvl9eg12.R.inc(5294);
        __CLR4_5_242w42wlvl9eg12.R.inc(5295);int numOfBytesToRead = byteBuffer.remaining();
        __CLR4_5_242w42wlvl9eg12.R.inc(5296);int numOfBytesRead = 0;
        __CLR4_5_242w42wlvl9eg12.R.inc(5297);if ((numOfBytesRead = fcs[index].read(byteBuffer)) != numOfBytesToRead) {{
            __CLR4_5_242w42wlvl9eg12.R.inc(5300);index++;
            __CLR4_5_242w42wlvl9eg12.R.inc(5301);return numOfBytesRead + read(byteBuffer);
        } }else {{
            __CLR4_5_242w42wlvl9eg12.R.inc(5302);return numOfBytesRead;
        }

    }}finally{__CLR4_5_242w42wlvl9eg12.R.flushNeeded();}}

    public long size() throws IOException {try{__CLR4_5_242w42wlvl9eg12.R.inc(5303);
        __CLR4_5_242w42wlvl9eg12.R.inc(5304);long size = 0;
        __CLR4_5_242w42wlvl9eg12.R.inc(5305);for (FileChannel fileChannel : fcs) {{
            __CLR4_5_242w42wlvl9eg12.R.inc(5306);size += fileChannel.size();
        }
        }__CLR4_5_242w42wlvl9eg12.R.inc(5307);return size;
    }finally{__CLR4_5_242w42wlvl9eg12.R.flushNeeded();}}

    public long position() throws IOException {try{__CLR4_5_242w42wlvl9eg12.R.inc(5308);
        __CLR4_5_242w42wlvl9eg12.R.inc(5309);long position = 0;
        __CLR4_5_242w42wlvl9eg12.R.inc(5310);for (int i = 0; (((i < index)&&(__CLR4_5_242w42wlvl9eg12.R.iget(5311)!=0|true))||(__CLR4_5_242w42wlvl9eg12.R.iget(5312)==0&false)); i++) {{
            __CLR4_5_242w42wlvl9eg12.R.inc(5313);position += fcs[i].size();

        }
        }__CLR4_5_242w42wlvl9eg12.R.inc(5314);return position + fcs[index].position();
    }finally{__CLR4_5_242w42wlvl9eg12.R.flushNeeded();}}

    public void position(long nuPos) throws IOException {try{__CLR4_5_242w42wlvl9eg12.R.inc(5315);
        __CLR4_5_242w42wlvl9eg12.R.inc(5316);for (int i = 0; (((i < fcs.length)&&(__CLR4_5_242w42wlvl9eg12.R.iget(5317)!=0|true))||(__CLR4_5_242w42wlvl9eg12.R.iget(5318)==0&false)); i++) {{
            __CLR4_5_242w42wlvl9eg12.R.inc(5319);if (((((nuPos - fcs[i].size()) < 0)&&(__CLR4_5_242w42wlvl9eg12.R.iget(5320)!=0|true))||(__CLR4_5_242w42wlvl9eg12.R.iget(5321)==0&false))) {{
                __CLR4_5_242w42wlvl9eg12.R.inc(5322);fcs[i].position(nuPos);
                __CLR4_5_242w42wlvl9eg12.R.inc(5323);index = i;
                __CLR4_5_242w42wlvl9eg12.R.inc(5324);break;
            } }else {{
                __CLR4_5_242w42wlvl9eg12.R.inc(5325);nuPos -= fcs[i].size();
            }
        }}
    }}finally{__CLR4_5_242w42wlvl9eg12.R.flushNeeded();}}

    public long transferTo(long startPosition, long count, WritableByteChannel sink) throws IOException {try{__CLR4_5_242w42wlvl9eg12.R.inc(5326);
        __CLR4_5_242w42wlvl9eg12.R.inc(5327);if ((((count == 0)&&(__CLR4_5_242w42wlvl9eg12.R.iget(5328)!=0|true))||(__CLR4_5_242w42wlvl9eg12.R.iget(5329)==0&false))) {{
            __CLR4_5_242w42wlvl9eg12.R.inc(5330);return 0;
        }
        }__CLR4_5_242w42wlvl9eg12.R.inc(5331);long currentPos = 0;
        __CLR4_5_242w42wlvl9eg12.R.inc(5332);for (FileChannel fc : fcs) {{
            __CLR4_5_242w42wlvl9eg12.R.inc(5333);long size = fc.size();
            __CLR4_5_242w42wlvl9eg12.R.inc(5334);if ((((startPosition >= currentPos && startPosition < currentPos + size && startPosition + count > currentPos)&&(__CLR4_5_242w42wlvl9eg12.R.iget(5335)!=0|true))||(__CLR4_5_242w42wlvl9eg12.R.iget(5336)==0&false))) {{ // current fcs reaches into fcs
                __CLR4_5_242w42wlvl9eg12.R.inc(5337);long bytesToTransfer = Math.min(count, size - (startPosition - currentPos));
                __CLR4_5_242w42wlvl9eg12.R.inc(5338);fc.transferTo(startPosition - currentPos, bytesToTransfer, sink);
                __CLR4_5_242w42wlvl9eg12.R.inc(5339);return bytesToTransfer + transferTo(startPosition + bytesToTransfer, count - bytesToTransfer, sink);
            }
            }__CLR4_5_242w42wlvl9eg12.R.inc(5340);currentPos += size;

        }
        }__CLR4_5_242w42wlvl9eg12.R.inc(5341);return 0;
    }finally{__CLR4_5_242w42wlvl9eg12.R.flushNeeded();}}

    public ByteBuffer map(long startPosition, long size) throws IOException {try{__CLR4_5_242w42wlvl9eg12.R.inc(5342);
        __CLR4_5_242w42wlvl9eg12.R.inc(5343);ByteArrayOutputStream baos = new ByteArrayOutputStream(l2i(size));
        __CLR4_5_242w42wlvl9eg12.R.inc(5344);transferTo(startPosition, size, Channels.newChannel(baos));
        __CLR4_5_242w42wlvl9eg12.R.inc(5345);return ByteBuffer.wrap(baos.toByteArray());
    }finally{__CLR4_5_242w42wlvl9eg12.R.flushNeeded();}}


    public void close() throws IOException {try{__CLR4_5_242w42wlvl9eg12.R.inc(5346);
        __CLR4_5_242w42wlvl9eg12.R.inc(5347);for (FileChannel fileChannel : fcs) {{
            __CLR4_5_242w42wlvl9eg12.R.inc(5348);fileChannel.close();
        }
    }}finally{__CLR4_5_242w42wlvl9eg12.R.flushNeeded();}}

}
