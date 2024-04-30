/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

public class BitWriterBuffer {public static class __CLR4_5_2d80d80lvlulm12{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,17165,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    int initialPos;
    int position = 0;
    private ByteBuffer buffer;

    public BitWriterBuffer(ByteBuffer buffer) {try{__CLR4_5_2d80d80lvlulm12.R.inc(17136);
        __CLR4_5_2d80d80lvlulm12.R.inc(17137);this.buffer = buffer;
        __CLR4_5_2d80d80lvlulm12.R.inc(17138);this.initialPos = buffer.position();
    }finally{__CLR4_5_2d80d80lvlulm12.R.flushNeeded();}}

    public void writeBool(boolean b) {try{__CLR4_5_2d80d80lvlulm12.R.inc(17139);
        __CLR4_5_2d80d80lvlulm12.R.inc(17140);writeBits((((b )&&(__CLR4_5_2d80d80lvlulm12.R.iget(17141)!=0|true))||(__CLR4_5_2d80d80lvlulm12.R.iget(17142)==0&false))? 1 : 0, 1);
    }finally{__CLR4_5_2d80d80lvlulm12.R.flushNeeded();}}

    public void writeBits(int i, int numBits) {try{__CLR4_5_2d80d80lvlulm12.R.inc(17143);
        assert (((i <= ((1 << numBits) - 1) )&&(__CLR4_5_2d80d80lvlulm12.R.iget(17144)!=0|true))||(__CLR4_5_2d80d80lvlulm12.R.iget(17145)==0&false)): String.format("Trying to write a value bigger (%s) than the number bits (%s) allows. " +
                "Please mask the value before writing it and make your code is really working as intended.", i, (1 << numBits) - 1);

        __CLR4_5_2d80d80lvlulm12.R.inc(17146);int left = 8 - position % 8;
        __CLR4_5_2d80d80lvlulm12.R.inc(17147);if ((((numBits <= left)&&(__CLR4_5_2d80d80lvlulm12.R.iget(17148)!=0|true))||(__CLR4_5_2d80d80lvlulm12.R.iget(17149)==0&false))) {{
            __CLR4_5_2d80d80lvlulm12.R.inc(17150);int current = (buffer.get(initialPos + position / 8));
            __CLR4_5_2d80d80lvlulm12.R.inc(17151);current = (((current < 0 )&&(__CLR4_5_2d80d80lvlulm12.R.iget(17152)!=0|true))||(__CLR4_5_2d80d80lvlulm12.R.iget(17153)==0&false))? current + 256 : current;
            __CLR4_5_2d80d80lvlulm12.R.inc(17154);current += i << (left - numBits);
            __CLR4_5_2d80d80lvlulm12.R.inc(17155);buffer.put(initialPos + position / 8, (byte) ((((current > 127 )&&(__CLR4_5_2d80d80lvlulm12.R.iget(17156)!=0|true))||(__CLR4_5_2d80d80lvlulm12.R.iget(17157)==0&false))? current - 256 : current));
            __CLR4_5_2d80d80lvlulm12.R.inc(17158);position += numBits;
        } }else {{
            __CLR4_5_2d80d80lvlulm12.R.inc(17159);int bitsSecondWrite = numBits - left;
            __CLR4_5_2d80d80lvlulm12.R.inc(17160);writeBits(i >> bitsSecondWrite, left);
            __CLR4_5_2d80d80lvlulm12.R.inc(17161);writeBits(i & (1 << bitsSecondWrite) - 1, bitsSecondWrite);
        }
        }__CLR4_5_2d80d80lvlulm12.R.inc(17162);buffer.position(initialPos + position / 8 + (((((position % 8 > 0) )&&(__CLR4_5_2d80d80lvlulm12.R.iget(17163)!=0|true))||(__CLR4_5_2d80d80lvlulm12.R.iget(17164)==0&false))? 1 : 0));
    }finally{__CLR4_5_2d80d80lvlulm12.R.flushNeeded();}}


}
