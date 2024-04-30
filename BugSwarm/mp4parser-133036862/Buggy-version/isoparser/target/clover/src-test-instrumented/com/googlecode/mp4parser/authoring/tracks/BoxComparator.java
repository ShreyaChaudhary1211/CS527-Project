/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.Path;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Compares boxes for testing purposes.
 */
public class BoxComparator {public static class __CLR4_5_2jqajqalvlulqww{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25620,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public static boolean isIgnore(Box b, String[] ignores) {try{__CLR4_5_2jqajqalvlulqww.R.inc(25570);
        __CLR4_5_2jqajqalvlulqww.R.inc(25571);for (String ignore : ignores) {{
            __CLR4_5_2jqajqalvlulqww.R.inc(25572);if ((((Path.isContained(b, ignore))&&(__CLR4_5_2jqajqalvlulqww.R.iget(25573)!=0|true))||(__CLR4_5_2jqajqalvlulqww.R.iget(25574)==0&false))) {{
                __CLR4_5_2jqajqalvlulqww.R.inc(25575);return true;
            }
        }}
        }__CLR4_5_2jqajqalvlulqww.R.inc(25576);return false;
    }finally{__CLR4_5_2jqajqalvlulqww.R.flushNeeded();}}


    public static void check(Box b1, Box b2, String... ignores) throws IOException {try{__CLR4_5_2jqajqalvlulqww.R.inc(25577);
        //System.err.println(b1.getType() + " - " + b2.getType());
        __CLR4_5_2jqajqalvlulqww.R.inc(25578);Assert.assertEquals(b1.getType(), b2.getType());
        __CLR4_5_2jqajqalvlulqww.R.inc(25579);if ((((!isIgnore(b1, ignores))&&(__CLR4_5_2jqajqalvlulqww.R.iget(25580)!=0|true))||(__CLR4_5_2jqajqalvlulqww.R.iget(25581)==0&false))) {{
            //    System.err.println(b1.getType());
            __CLR4_5_2jqajqalvlulqww.R.inc(25582);Assert.assertEquals("Type differs. \ntypetrace ref : " + Path.createPath(b1) + "\ntypetrace new : " + Path.createPath(b2),
                    b1.getType(), b2.getType());
            __CLR4_5_2jqajqalvlulqww.R.inc(25583);if ((((b1 instanceof Container ^ !(b2 instanceof Container))&&(__CLR4_5_2jqajqalvlulqww.R.iget(25584)!=0|true))||(__CLR4_5_2jqajqalvlulqww.R.iget(25585)==0&false))) {{
                __CLR4_5_2jqajqalvlulqww.R.inc(25586);if ((((b1 instanceof Container)&&(__CLR4_5_2jqajqalvlulqww.R.iget(25587)!=0|true))||(__CLR4_5_2jqajqalvlulqww.R.iget(25588)==0&false))) {{
                    __CLR4_5_2jqajqalvlulqww.R.inc(25589);check((Container) b1, (Container) b2, ignores);
                } }else {{
                    __CLR4_5_2jqajqalvlulqww.R.inc(25590);checkBox(b1, b2, ignores);
                }
            }} }else {{
                __CLR4_5_2jqajqalvlulqww.R.inc(25591);Assert.fail("Either both boxes are container boxes or none");
            }
        }}
    }}finally{__CLR4_5_2jqajqalvlulqww.R.flushNeeded();}}

    private static void checkBox(Box b1, Box b2, String[] ignores) throws IOException {try{__CLR4_5_2jqajqalvlulqww.R.inc(25592);
        __CLR4_5_2jqajqalvlulqww.R.inc(25593);if ((((!isIgnore(b1, ignores))&&(__CLR4_5_2jqajqalvlulqww.R.iget(25594)!=0|true))||(__CLR4_5_2jqajqalvlulqww.R.iget(25595)==0&false))) {{
            __CLR4_5_2jqajqalvlulqww.R.inc(25596);ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
            __CLR4_5_2jqajqalvlulqww.R.inc(25597);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();

            __CLR4_5_2jqajqalvlulqww.R.inc(25598);b1.getBox(Channels.newChannel(baos1));
            __CLR4_5_2jqajqalvlulqww.R.inc(25599);b2.getBox(Channels.newChannel(baos2));

            __CLR4_5_2jqajqalvlulqww.R.inc(25600);baos1.close();
            __CLR4_5_2jqajqalvlulqww.R.inc(25601);baos2.close();

            __CLR4_5_2jqajqalvlulqww.R.inc(25602);Assert.assertArrayEquals("Box at " + Path.createPath(b1) + " differs from reference\n\n" + b1.toString() + "\n" + b2.toString(), baos1.toByteArray(), baos2.toByteArray());
        }
    }}finally{__CLR4_5_2jqajqalvlulqww.R.flushNeeded();}}

    public static void check(Container cb1, Container cb2, String... ignores) throws IOException {try{__CLR4_5_2jqajqalvlulqww.R.inc(25603);
        __CLR4_5_2jqajqalvlulqww.R.inc(25604);Iterator<Box> it1 = cb1.getBoxes().iterator();
        __CLR4_5_2jqajqalvlulqww.R.inc(25605);Iterator<Box> it2 = cb2.getBoxes().iterator();

        __CLR4_5_2jqajqalvlulqww.R.inc(25606);while ((((it1.hasNext() && it2.hasNext())&&(__CLR4_5_2jqajqalvlulqww.R.iget(25607)!=0|true))||(__CLR4_5_2jqajqalvlulqww.R.iget(25608)==0&false))) {{
            __CLR4_5_2jqajqalvlulqww.R.inc(25609);Box b1 = it1.next();
            __CLR4_5_2jqajqalvlulqww.R.inc(25610);Box b2 = it2.next();

            __CLR4_5_2jqajqalvlulqww.R.inc(25611);check(b1, b2, ignores);
        }
        }__CLR4_5_2jqajqalvlulqww.R.inc(25612);if ((((it1.hasNext())&&(__CLR4_5_2jqajqalvlulqww.R.iget(25613)!=0|true))||(__CLR4_5_2jqajqalvlulqww.R.iget(25614)==0&false))) {{
            __CLR4_5_2jqajqalvlulqww.R.inc(25615);Assert.fail("There is a box missing in the current output of the tool: " + it1.next());
        }
        }__CLR4_5_2jqajqalvlulqww.R.inc(25616);if ((((it2.hasNext())&&(__CLR4_5_2jqajqalvlulqww.R.iget(25617)!=0|true))||(__CLR4_5_2jqajqalvlulqww.R.iget(25618)==0&false))) {{
            __CLR4_5_2jqajqalvlulqww.R.inc(25619);Assert.fail("There is a box too much in the current output of the tool: " + it2.next());
        }

    }}finally{__CLR4_5_2jqajqalvlulqww.R.flushNeeded();}}


}
