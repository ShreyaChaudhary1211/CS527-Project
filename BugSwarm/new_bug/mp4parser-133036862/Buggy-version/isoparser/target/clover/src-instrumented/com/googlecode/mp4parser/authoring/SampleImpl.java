/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.Container;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

public class SampleImpl implements Sample {public static class __CLR4_5_24it4itlvluldn7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,5917,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final long offset;
    private final long size;
    private ByteBuffer[] data;
    private final Container parent;

    public SampleImpl(ByteBuffer buf) {try{__CLR4_5_24it4itlvluldn7.R.inc(5861);
        __CLR4_5_24it4itlvluldn7.R.inc(5862);this.offset = -1;
        __CLR4_5_24it4itlvluldn7.R.inc(5863);this.size = buf.limit();
        __CLR4_5_24it4itlvluldn7.R.inc(5864);this.data = new ByteBuffer[]{buf};
        __CLR4_5_24it4itlvluldn7.R.inc(5865);this.parent = null;
    }finally{__CLR4_5_24it4itlvluldn7.R.flushNeeded();}}

    public SampleImpl(ByteBuffer[] data) {try{__CLR4_5_24it4itlvluldn7.R.inc(5866);
        __CLR4_5_24it4itlvluldn7.R.inc(5867);this.offset = -1;
        __CLR4_5_24it4itlvluldn7.R.inc(5868);int _size = 0;
        __CLR4_5_24it4itlvluldn7.R.inc(5869);for (ByteBuffer byteBuffer : data) {{
            __CLR4_5_24it4itlvluldn7.R.inc(5870);_size += byteBuffer.remaining();
        }
        }__CLR4_5_24it4itlvluldn7.R.inc(5871);this.size = _size;
        __CLR4_5_24it4itlvluldn7.R.inc(5872);this.data = data;
        __CLR4_5_24it4itlvluldn7.R.inc(5873);this.parent = null;
    }finally{__CLR4_5_24it4itlvluldn7.R.flushNeeded();}}

    public SampleImpl(long offset, long sampleSize, ByteBuffer data) {try{__CLR4_5_24it4itlvluldn7.R.inc(5874);
        __CLR4_5_24it4itlvluldn7.R.inc(5875);this.offset = offset;
        __CLR4_5_24it4itlvluldn7.R.inc(5876);this.size = sampleSize;
        __CLR4_5_24it4itlvluldn7.R.inc(5877);this.data = new ByteBuffer[]{data};
        __CLR4_5_24it4itlvluldn7.R.inc(5878);this.parent = null;
    }finally{__CLR4_5_24it4itlvluldn7.R.flushNeeded();}}

    public SampleImpl(long offset, long sampleSize, Container parent) {try{__CLR4_5_24it4itlvluldn7.R.inc(5879);
        __CLR4_5_24it4itlvluldn7.R.inc(5880);this.offset = offset;
        __CLR4_5_24it4itlvluldn7.R.inc(5881);this.size = sampleSize;
        __CLR4_5_24it4itlvluldn7.R.inc(5882);this.data = null;
        __CLR4_5_24it4itlvluldn7.R.inc(5883);this.parent = parent;
    }finally{__CLR4_5_24it4itlvluldn7.R.flushNeeded();}}

    protected void ensureData() {try{__CLR4_5_24it4itlvluldn7.R.inc(5884);
        __CLR4_5_24it4itlvluldn7.R.inc(5885);if ((((data != null)&&(__CLR4_5_24it4itlvluldn7.R.iget(5886)!=0|true))||(__CLR4_5_24it4itlvluldn7.R.iget(5887)==0&false))) {__CLR4_5_24it4itlvluldn7.R.inc(5888);return;
        }__CLR4_5_24it4itlvluldn7.R.inc(5889);if ((((parent == null)&&(__CLR4_5_24it4itlvluldn7.R.iget(5890)!=0|true))||(__CLR4_5_24it4itlvluldn7.R.iget(5891)==0&false))) {{
            __CLR4_5_24it4itlvluldn7.R.inc(5892);throw new RuntimeException("Missing parent container, can't read sample " + this);
        }
        }__CLR4_5_24it4itlvluldn7.R.inc(5893);try {
            __CLR4_5_24it4itlvluldn7.R.inc(5894);data = new ByteBuffer[]{parent.getByteBuffer(offset, size)};
        } catch (IOException e) {
            __CLR4_5_24it4itlvluldn7.R.inc(5895);throw new RuntimeException("couldn't read sample " + this, e);
        }
    }finally{__CLR4_5_24it4itlvluldn7.R.flushNeeded();}}

    public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_24it4itlvluldn7.R.inc(5896);
        __CLR4_5_24it4itlvluldn7.R.inc(5897);ensureData();
        __CLR4_5_24it4itlvluldn7.R.inc(5898);for (ByteBuffer b : data) {{
            __CLR4_5_24it4itlvluldn7.R.inc(5899);channel.write(b.duplicate());
        }
    }}finally{__CLR4_5_24it4itlvluldn7.R.flushNeeded();}}

    public long getSize() {try{__CLR4_5_24it4itlvluldn7.R.inc(5900);
        __CLR4_5_24it4itlvluldn7.R.inc(5901);return size;
    }finally{__CLR4_5_24it4itlvluldn7.R.flushNeeded();}}

    public ByteBuffer asByteBuffer() {try{__CLR4_5_24it4itlvluldn7.R.inc(5902);
        __CLR4_5_24it4itlvluldn7.R.inc(5903);ensureData();
        __CLR4_5_24it4itlvluldn7.R.inc(5904);byte[] bCopy = new byte[l2i(size)];
        __CLR4_5_24it4itlvluldn7.R.inc(5905);ByteBuffer copy = ByteBuffer.wrap(bCopy);
        __CLR4_5_24it4itlvluldn7.R.inc(5906);for (ByteBuffer b : data) {{
            __CLR4_5_24it4itlvluldn7.R.inc(5907);copy.put(b.duplicate());
        }
        }__CLR4_5_24it4itlvluldn7.R.inc(5908);copy.rewind();
        __CLR4_5_24it4itlvluldn7.R.inc(5909);return copy;
    }finally{__CLR4_5_24it4itlvluldn7.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_24it4itlvluldn7.R.inc(5910);
        __CLR4_5_24it4itlvluldn7.R.inc(5911);final StringBuilder sb = new StringBuilder();
        __CLR4_5_24it4itlvluldn7.R.inc(5912);sb.append("SampleImpl");
        __CLR4_5_24it4itlvluldn7.R.inc(5913);sb.append("{offset=").append(offset);
        __CLR4_5_24it4itlvluldn7.R.inc(5914);sb.append("{size=").append(size);
        __CLR4_5_24it4itlvluldn7.R.inc(5915);sb.append('}');
        __CLR4_5_24it4itlvluldn7.R.inc(5916);return sb.toString();
    }finally{__CLR4_5_24it4itlvluldn7.R.flushNeeded();}}
}
