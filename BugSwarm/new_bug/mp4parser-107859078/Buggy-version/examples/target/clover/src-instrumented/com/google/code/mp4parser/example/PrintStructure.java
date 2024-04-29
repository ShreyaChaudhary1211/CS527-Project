/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.google.code.mp4parser.example;

import com.coremedia.iso.IsoTypeReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

import com.googlecode.mp4parser.DataSource;

import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sannies
 * Date: 8/5/11
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintStructure {public static class __CLR4_5_24848lvl9g0mh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,191,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_5_24848lvl9g0mh.R.inc(152);
        __CLR4_5_24848lvl9g0mh.R.inc(153);System.out.println("PWD: " + System.getProperty("user.dir"));
        __CLR4_5_24848lvl9g0mh.R.inc(154);System.out.println("Input: " + args[0]);
        __CLR4_5_24848lvl9g0mh.R.inc(155);FileInputStream fis = new FileInputStream(new File(args[0]));
        __CLR4_5_24848lvl9g0mh.R.inc(156);System.out.println("input size: " + fis.getChannel().size());

        __CLR4_5_24848lvl9g0mh.R.inc(157);PrintStructure ps = new PrintStructure();
        __CLR4_5_24848lvl9g0mh.R.inc(158);ps.print(fis.getChannel(), 0, 0, 0);
    }finally{__CLR4_5_24848lvl9g0mh.R.flushNeeded();}}


    /** Parses the FileChannel, in the range [start, end) and prints the elements found
     *
     * Elements are printed, indented by "level" number of spaces.  If an element is
     * a container, then its contents will be, recursively, printed, with a greater
     * indentation.
     *
     * @param fc
     * @param level
     * @param start
     * @param end
     * @throws IOException
     */
    private void print(FileChannel fc, int level, long start, long end) throws IOException {try{__CLR4_5_24848lvl9g0mh.R.inc(159);
        __CLR4_5_24848lvl9g0mh.R.inc(160);fc.position(start);
        __CLR4_5_24848lvl9g0mh.R.inc(161);if((((end <= 0)&&(__CLR4_5_24848lvl9g0mh.R.iget(162)!=0|true))||(__CLR4_5_24848lvl9g0mh.R.iget(163)==0&false))) {{
            __CLR4_5_24848lvl9g0mh.R.inc(164);end = start + fc.size();
            __CLR4_5_24848lvl9g0mh.R.inc(165);System.out.println("Setting END to " + end);
        }
        }__CLR4_5_24848lvl9g0mh.R.inc(166);while ((((end - fc.position() > 8)&&(__CLR4_5_24848lvl9g0mh.R.iget(167)!=0|true))||(__CLR4_5_24848lvl9g0mh.R.iget(168)==0&false))) {{
            __CLR4_5_24848lvl9g0mh.R.inc(169);long begin = fc.position();
            __CLR4_5_24848lvl9g0mh.R.inc(170);ByteBuffer bb = ByteBuffer.allocate(8);
            __CLR4_5_24848lvl9g0mh.R.inc(171);fc.read(bb);
            __CLR4_5_24848lvl9g0mh.R.inc(172);bb.rewind();
            __CLR4_5_24848lvl9g0mh.R.inc(173);long size = IsoTypeReader.readUInt32(bb);
            __CLR4_5_24848lvl9g0mh.R.inc(174);String type = IsoTypeReader.read4cc(bb);
            __CLR4_5_24848lvl9g0mh.R.inc(175);long fin = begin + size;
            // indent by the required number of spaces
            __CLR4_5_24848lvl9g0mh.R.inc(176);for (int i = 0; (((i < level)&&(__CLR4_5_24848lvl9g0mh.R.iget(177)!=0|true))||(__CLR4_5_24848lvl9g0mh.R.iget(178)==0&false)); i++) {{
                __CLR4_5_24848lvl9g0mh.R.inc(179);System.out.print(" ");
            }

            }__CLR4_5_24848lvl9g0mh.R.inc(180);System.out.println(type + "@" + (begin) + " size: " + size);
            __CLR4_5_24848lvl9g0mh.R.inc(181);if ((((containers.contains(type))&&(__CLR4_5_24848lvl9g0mh.R.iget(182)!=0|true))||(__CLR4_5_24848lvl9g0mh.R.iget(183)==0&false))) {{
                __CLR4_5_24848lvl9g0mh.R.inc(184);print(fc, level + 1, begin + 8, fin);
                __CLR4_5_24848lvl9g0mh.R.inc(185);if((((fc.position() != fin)&&(__CLR4_5_24848lvl9g0mh.R.iget(186)!=0|true))||(__CLR4_5_24848lvl9g0mh.R.iget(187)==0&false))) {{
                    __CLR4_5_24848lvl9g0mh.R.inc(188);System.out.println("End of container contents at " + fc.position());
                    __CLR4_5_24848lvl9g0mh.R.inc(189);System.out.println("  FIN = " + fin);
                }
            }}

            }__CLR4_5_24848lvl9g0mh.R.inc(190);fc.position(fin);

        }
    }}finally{__CLR4_5_24848lvl9g0mh.R.flushNeeded();}}

    List<String> containers = Arrays.asList(
            "moov",
            "trak",
            "mdia",
            "minf",
            "udta",
            "stbl"
    );
}