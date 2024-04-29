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
public class BoxComparator {public static class __CLR4_5_2iwiiwilvl9emqk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,24548,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public static boolean isIgnore(Box b, String[] ignores) {try{__CLR4_5_2iwiiwilvl9emqk.R.inc(24498);
        __CLR4_5_2iwiiwilvl9emqk.R.inc(24499);for (String ignore : ignores) {{
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24500);if ((((Path.isContained(b, ignore))&&(__CLR4_5_2iwiiwilvl9emqk.R.iget(24501)!=0|true))||(__CLR4_5_2iwiiwilvl9emqk.R.iget(24502)==0&false))) {{
                __CLR4_5_2iwiiwilvl9emqk.R.inc(24503);return true;
            }
        }}
        }__CLR4_5_2iwiiwilvl9emqk.R.inc(24504);return false;
    }finally{__CLR4_5_2iwiiwilvl9emqk.R.flushNeeded();}}


    public static void check(Box b1, Box b2, String... ignores) throws IOException {try{__CLR4_5_2iwiiwilvl9emqk.R.inc(24505);
        //System.err.println(b1.getType() + " - " + b2.getType());
        __CLR4_5_2iwiiwilvl9emqk.R.inc(24506);Assert.assertEquals(b1.getType(), b2.getType());
        __CLR4_5_2iwiiwilvl9emqk.R.inc(24507);if ((((!isIgnore(b1, ignores))&&(__CLR4_5_2iwiiwilvl9emqk.R.iget(24508)!=0|true))||(__CLR4_5_2iwiiwilvl9emqk.R.iget(24509)==0&false))) {{
            //    System.err.println(b1.getType());
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24510);Assert.assertEquals("Type differs. \ntypetrace ref : " + Path.createPath(b1) + "\ntypetrace new : " + Path.createPath(b2),
                    b1.getType(), b2.getType());
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24511);if ((((b1 instanceof Container ^ !(b2 instanceof Container))&&(__CLR4_5_2iwiiwilvl9emqk.R.iget(24512)!=0|true))||(__CLR4_5_2iwiiwilvl9emqk.R.iget(24513)==0&false))) {{
                __CLR4_5_2iwiiwilvl9emqk.R.inc(24514);if ((((b1 instanceof Container)&&(__CLR4_5_2iwiiwilvl9emqk.R.iget(24515)!=0|true))||(__CLR4_5_2iwiiwilvl9emqk.R.iget(24516)==0&false))) {{
                    __CLR4_5_2iwiiwilvl9emqk.R.inc(24517);check((Container) b1, (Container) b2, ignores);
                } }else {{
                    __CLR4_5_2iwiiwilvl9emqk.R.inc(24518);checkBox(b1, b2, ignores);
                }
            }} }else {{
                __CLR4_5_2iwiiwilvl9emqk.R.inc(24519);Assert.fail("Either both boxes are container boxes or none");
            }
        }}
    }}finally{__CLR4_5_2iwiiwilvl9emqk.R.flushNeeded();}}

    private static void checkBox(Box b1, Box b2, String[] ignores) throws IOException {try{__CLR4_5_2iwiiwilvl9emqk.R.inc(24520);
        __CLR4_5_2iwiiwilvl9emqk.R.inc(24521);if ((((!isIgnore(b1, ignores))&&(__CLR4_5_2iwiiwilvl9emqk.R.iget(24522)!=0|true))||(__CLR4_5_2iwiiwilvl9emqk.R.iget(24523)==0&false))) {{
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24524);ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24525);ByteArrayOutputStream baos2 = new ByteArrayOutputStream();

            __CLR4_5_2iwiiwilvl9emqk.R.inc(24526);b1.getBox(Channels.newChannel(baos1));
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24527);b2.getBox(Channels.newChannel(baos2));

            __CLR4_5_2iwiiwilvl9emqk.R.inc(24528);baos1.close();
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24529);baos2.close();

            __CLR4_5_2iwiiwilvl9emqk.R.inc(24530);Assert.assertArrayEquals("Box at " + Path.createPath(b1) + " differs from reference\n\n" + b1.toString() + "\n" + b2.toString(), baos1.toByteArray(), baos2.toByteArray());
        }
    }}finally{__CLR4_5_2iwiiwilvl9emqk.R.flushNeeded();}}

    public static void check(Container cb1, Container cb2, String... ignores) throws IOException {try{__CLR4_5_2iwiiwilvl9emqk.R.inc(24531);
        __CLR4_5_2iwiiwilvl9emqk.R.inc(24532);Iterator<Box> it1 = cb1.getBoxes().iterator();
        __CLR4_5_2iwiiwilvl9emqk.R.inc(24533);Iterator<Box> it2 = cb2.getBoxes().iterator();

        __CLR4_5_2iwiiwilvl9emqk.R.inc(24534);while ((((it1.hasNext() && it2.hasNext())&&(__CLR4_5_2iwiiwilvl9emqk.R.iget(24535)!=0|true))||(__CLR4_5_2iwiiwilvl9emqk.R.iget(24536)==0&false))) {{
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24537);Box b1 = it1.next();
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24538);Box b2 = it2.next();

            __CLR4_5_2iwiiwilvl9emqk.R.inc(24539);check(b1, b2, ignores);
        }
        }__CLR4_5_2iwiiwilvl9emqk.R.inc(24540);if ((((it1.hasNext())&&(__CLR4_5_2iwiiwilvl9emqk.R.iget(24541)!=0|true))||(__CLR4_5_2iwiiwilvl9emqk.R.iget(24542)==0&false))) {{
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24543);Assert.fail("There is a box missing in the current output of the tool: " + it1.next());
        }
        }__CLR4_5_2iwiiwilvl9emqk.R.inc(24544);if ((((it2.hasNext())&&(__CLR4_5_2iwiiwilvl9emqk.R.iget(24545)!=0|true))||(__CLR4_5_2iwiiwilvl9emqk.R.iget(24546)==0&false))) {{
            __CLR4_5_2iwiiwilvl9emqk.R.inc(24547);Assert.fail("There is a box too much in the current output of the tool: " + it2.next());
        }

    }}finally{__CLR4_5_2iwiiwilvl9emqk.R.flushNeeded();}}


}
