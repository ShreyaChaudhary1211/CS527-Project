/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.google.code.mp4parser.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;


public class GetHeight {public static class __CLR4_5_23131lvl9g0m2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,152,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    byte[] lastTkhd;
    List<String> containers = Arrays.asList(
            "moov",
            "mdia",
            "trak"
    );

    public static void main(String[] args) throws IOException {try{__CLR4_5_23131lvl9g0m2.R.inc(109);
        __CLR4_5_23131lvl9g0m2.R.inc(110);FileInputStream fis = new FileInputStream(new File(args[0]));

        __CLR4_5_23131lvl9g0m2.R.inc(111);GetHeight ps = new GetHeight();
        __CLR4_5_23131lvl9g0m2.R.inc(112);ps.find(fis);
    }finally{__CLR4_5_23131lvl9g0m2.R.flushNeeded();}}

    public static long readUint32(byte[] b, int s) {try{__CLR4_5_23131lvl9g0m2.R.inc(113);
        __CLR4_5_23131lvl9g0m2.R.inc(114);long result = 0;
        __CLR4_5_23131lvl9g0m2.R.inc(115);result |= ((b[s + 0] << 24) & 0xFF000000);
        __CLR4_5_23131lvl9g0m2.R.inc(116);result |= ((b[s + 1] << 16) & 0xFF0000);
        __CLR4_5_23131lvl9g0m2.R.inc(117);result |= ((b[s + 2] << 8) & 0xFF00);
        __CLR4_5_23131lvl9g0m2.R.inc(118);result |= ((b[s + 3]) & 0xFF);
        __CLR4_5_23131lvl9g0m2.R.inc(119);return result;
    }finally{__CLR4_5_23131lvl9g0m2.R.flushNeeded();}}

    public static double readFixedPoint1616(byte[] b, int s) {try{__CLR4_5_23131lvl9g0m2.R.inc(120);
        __CLR4_5_23131lvl9g0m2.R.inc(121);return ((double) readUint32(b, s)) / 65536;
    }finally{__CLR4_5_23131lvl9g0m2.R.flushNeeded();}}

    private void find(InputStream fis) throws IOException {try{__CLR4_5_23131lvl9g0m2.R.inc(122);

        __CLR4_5_23131lvl9g0m2.R.inc(123);while ((((fis.available() > 0)&&(__CLR4_5_23131lvl9g0m2.R.iget(124)!=0|true))||(__CLR4_5_23131lvl9g0m2.R.iget(125)==0&false))) {{
            __CLR4_5_23131lvl9g0m2.R.inc(126);byte[] header = new byte[8];
            __CLR4_5_23131lvl9g0m2.R.inc(127);fis.read(header);

            __CLR4_5_23131lvl9g0m2.R.inc(128);long size = readUint32(header, 0);
            __CLR4_5_23131lvl9g0m2.R.inc(129);String type = new String(header, 4, 4, "ISO-8859-1");
            __CLR4_5_23131lvl9g0m2.R.inc(130);if ((((containers.contains(type))&&(__CLR4_5_23131lvl9g0m2.R.iget(131)!=0|true))||(__CLR4_5_23131lvl9g0m2.R.iget(132)==0&false))) {{
                __CLR4_5_23131lvl9g0m2.R.inc(133);find(fis);
            } }else {{
                __CLR4_5_23131lvl9g0m2.R.inc(134);if ((((type.equals("tkhd"))&&(__CLR4_5_23131lvl9g0m2.R.iget(135)!=0|true))||(__CLR4_5_23131lvl9g0m2.R.iget(136)==0&false))) {{
                    __CLR4_5_23131lvl9g0m2.R.inc(137);lastTkhd = new byte[(int) (size - 8)];
                    __CLR4_5_23131lvl9g0m2.R.inc(138);fis.read(lastTkhd);
                } }else {{
                    __CLR4_5_23131lvl9g0m2.R.inc(139);if ((((type.equals("hdlr"))&&(__CLR4_5_23131lvl9g0m2.R.iget(140)!=0|true))||(__CLR4_5_23131lvl9g0m2.R.iget(141)==0&false))) {{
                        __CLR4_5_23131lvl9g0m2.R.inc(142);byte[] hdlr = new byte[(int) (size - 8)];
                        __CLR4_5_23131lvl9g0m2.R.inc(143);fis.read(hdlr);
                        __CLR4_5_23131lvl9g0m2.R.inc(144);if ((((hdlr[8] == 0x76 && hdlr[9] == 0x69 && hdlr[10] == 0x64 && hdlr[11] == 0x65)&&(__CLR4_5_23131lvl9g0m2.R.iget(145)!=0|true))||(__CLR4_5_23131lvl9g0m2.R.iget(146)==0&false))) {{
                            __CLR4_5_23131lvl9g0m2.R.inc(147);System.out.println("Video Track Header identified");
                            __CLR4_5_23131lvl9g0m2.R.inc(148);System.out.println("width: " + readFixedPoint1616(lastTkhd, lastTkhd.length - 8));
                            __CLR4_5_23131lvl9g0m2.R.inc(149);System.out.println("height: " + readFixedPoint1616(lastTkhd, lastTkhd.length - 4));
                            __CLR4_5_23131lvl9g0m2.R.inc(150);System.exit(1);
                        }
                    }} }else {{
                        __CLR4_5_23131lvl9g0m2.R.inc(151);fis.skip(size - 8);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_23131lvl9g0m2.R.flushNeeded();}}
}
