/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.googlecode.mp4parser.util.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;


public class FileDataSourceViaHeapImpl implements DataSource {public static class __CLR4_5_240s40slvluld1c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,5243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger LOG = Logger.getLogger(FileDataSourceViaHeapImpl.class);
    FileChannel fc;
    String filename;


    public FileDataSourceViaHeapImpl(File f) throws FileNotFoundException {try{__CLR4_5_240s40slvluld1c.R.inc(5212);
        __CLR4_5_240s40slvluld1c.R.inc(5213);this.fc = new FileInputStream(f).getChannel();
        __CLR4_5_240s40slvluld1c.R.inc(5214);this.filename = f.getName();
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    public FileDataSourceViaHeapImpl(String f) throws FileNotFoundException {try{__CLR4_5_240s40slvluld1c.R.inc(5215);
        __CLR4_5_240s40slvluld1c.R.inc(5216);File file = new File(f);
        __CLR4_5_240s40slvluld1c.R.inc(5217);this.fc = new FileInputStream(file).getChannel();
        __CLR4_5_240s40slvluld1c.R.inc(5218);this.filename = file.getName();
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}


    public FileDataSourceViaHeapImpl(FileChannel fc) {try{__CLR4_5_240s40slvluld1c.R.inc(5219);
        __CLR4_5_240s40slvluld1c.R.inc(5220);this.fc = fc;
        __CLR4_5_240s40slvluld1c.R.inc(5221);this.filename = "unknown";
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    public FileDataSourceViaHeapImpl(FileChannel fc, String filename) {try{__CLR4_5_240s40slvluld1c.R.inc(5222);
        __CLR4_5_240s40slvluld1c.R.inc(5223);this.fc = fc;
        __CLR4_5_240s40slvluld1c.R.inc(5224);this.filename = filename;
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    public synchronized int read(ByteBuffer byteBuffer) throws IOException {try{__CLR4_5_240s40slvluld1c.R.inc(5225);
        __CLR4_5_240s40slvluld1c.R.inc(5226);return fc.read(byteBuffer);
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    public synchronized long size() throws IOException {try{__CLR4_5_240s40slvluld1c.R.inc(5227);
        __CLR4_5_240s40slvluld1c.R.inc(5228);return fc.size();
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    public synchronized long position() throws IOException {try{__CLR4_5_240s40slvluld1c.R.inc(5229);
        __CLR4_5_240s40slvluld1c.R.inc(5230);return fc.position();
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    public synchronized void position(long nuPos) throws IOException {try{__CLR4_5_240s40slvluld1c.R.inc(5231);
        __CLR4_5_240s40slvluld1c.R.inc(5232);fc.position(nuPos);
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    public synchronized long transferTo(long startPosition, long count, WritableByteChannel sink) throws IOException {try{__CLR4_5_240s40slvluld1c.R.inc(5233);
        __CLR4_5_240s40slvluld1c.R.inc(5234);return fc.transferTo(startPosition, count, sink);
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    public synchronized ByteBuffer map(long startPosition, long size) throws IOException {try{__CLR4_5_240s40slvluld1c.R.inc(5235);
        __CLR4_5_240s40slvluld1c.R.inc(5236);ByteBuffer bb = ByteBuffer.allocate(l2i(size));
        __CLR4_5_240s40slvluld1c.R.inc(5237);fc.read(bb, startPosition);
        __CLR4_5_240s40slvluld1c.R.inc(5238);return (ByteBuffer) bb.rewind();
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_240s40slvluld1c.R.inc(5239);
        __CLR4_5_240s40slvluld1c.R.inc(5240);fc.close();
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_240s40slvluld1c.R.inc(5241);
        __CLR4_5_240s40slvluld1c.R.inc(5242);return filename;
    }finally{__CLR4_5_240s40slvluld1c.R.flushNeeded();}}

}
