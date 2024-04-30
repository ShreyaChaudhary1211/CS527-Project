/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * A {@link DataSource} implementation that relies on direct reads from a {@link RandomAccessFile}.
 * It should be slower than {@link FileDataSourceImpl} but does not incur the implicit file locks of
 * memory mapped I/O on some JVMs. This implementation allows for a more controlled deletion of files
 * and might be preferred when working with temporary files.
 * @see <a href="http://bugs.java.com/view_bug.do?bug_id=4724038">JDK-4724038 : (fs) Add unmap method to MappedByteBuffer</a>
 * @see <a href="http://bugs.java.com/view_bug.do?bug_id=6359560">JDK-6359560 : (fs) File.deleteOnExit() doesn't work when MappedByteBuffer exists (win)</a>
 */
public class DirectFileReadDataSource implements DataSource {public static class __CLR4_5_23yq3yqlvlulcwq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,5182,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int TRANSFER_SIZE = 8192;

    private RandomAccessFile raf;
    private String filename;

    public DirectFileReadDataSource(File f) throws IOException {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5138);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5139);this.raf = new RandomAccessFile(f, "r");
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5140);this.filename = f.getName();
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}

    public int read(ByteBuffer byteBuffer) throws IOException {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5141);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5142);int len = byteBuffer.remaining();
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5143);int totalRead = 0;
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5144);int bytesRead = 0;
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5145);byte[] buf = new byte[TRANSFER_SIZE];
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5146);while ((((totalRead < len)&&(__CLR4_5_23yq3yqlvlulcwq.R.iget(5147)!=0|true))||(__CLR4_5_23yq3yqlvlulcwq.R.iget(5148)==0&false))) {{
            __CLR4_5_23yq3yqlvlulcwq.R.inc(5149);int bytesToRead = Math.min((len - totalRead), TRANSFER_SIZE);
            __CLR4_5_23yq3yqlvlulcwq.R.inc(5150);bytesRead = raf.read(buf, 0, bytesToRead);
            __CLR4_5_23yq3yqlvlulcwq.R.inc(5151);if ((((bytesRead < 0)&&(__CLR4_5_23yq3yqlvlulcwq.R.iget(5152)!=0|true))||(__CLR4_5_23yq3yqlvlulcwq.R.iget(5153)==0&false))) {{
                __CLR4_5_23yq3yqlvlulcwq.R.inc(5154);break;
            } }else {{
                __CLR4_5_23yq3yqlvlulcwq.R.inc(5155);totalRead += bytesRead;
            }
            }__CLR4_5_23yq3yqlvlulcwq.R.inc(5156);byteBuffer.put(buf, 0, bytesRead);
        }
        }__CLR4_5_23yq3yqlvlulcwq.R.inc(5157);return (((((bytesRead < 0) && (totalRead == 0)) )&&(__CLR4_5_23yq3yqlvlulcwq.R.iget(5158)!=0|true))||(__CLR4_5_23yq3yqlvlulcwq.R.iget(5159)==0&false))? -1 : totalRead;
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}

    public int readAllInOnce(ByteBuffer byteBuffer) throws IOException {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5160);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5161);byte[] buf = new byte[byteBuffer.remaining()];
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5162);int read = raf.read(buf);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5163);byteBuffer.put(buf, 0, read);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5164);return read;
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}

    public long size() throws IOException {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5165);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5166);return raf.length();
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}

    public long position() throws IOException {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5167);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5168);return raf.getFilePointer();
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}

    public void position(long nuPos) throws IOException {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5169);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5170);raf.seek(nuPos);
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}

    public long transferTo(long position, long count, WritableByteChannel target) throws IOException {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5171);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5172);return target.write(map(position, count));
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}

    public ByteBuffer map(long startPosition, long size) throws IOException {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5173);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5174);raf.seek(startPosition);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5175);byte[] payload = new byte[l2i(size)];
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5176);raf.readFully(payload);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5177);return ByteBuffer.wrap(payload);
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5178);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5179);raf.close();
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}


    @Override
    public String toString() {try{__CLR4_5_23yq3yqlvlulcwq.R.inc(5180);
        __CLR4_5_23yq3yqlvlulcwq.R.inc(5181);return filename;
    }finally{__CLR4_5_23yq3yqlvlulcwq.R.flushNeeded();}}
}
