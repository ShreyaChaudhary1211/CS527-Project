/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack;
import com.googlecode.mp4parser.authoring.tracks.CleanInputStream;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * Created by sannies on 11.02.2015.
 */
public class ParseMdatByHand {public static class __CLR4_5_2ewewlvl9g0ph{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,570,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static ByteBuffer findNextNal(AbstractH26XTrack.LookAhead la) throws IOException {try{__CLR4_5_2ewewlvl9g0ph.R.inc(536);
        __CLR4_5_2ewewlvl9g0ph.R.inc(537);try {
            __CLR4_5_2ewewlvl9g0ph.R.inc(538);while ((((!la.nextThreeEquals001())&&(__CLR4_5_2ewewlvl9g0ph.R.iget(539)!=0|true))||(__CLR4_5_2ewewlvl9g0ph.R.iget(540)==0&false))) {{
                __CLR4_5_2ewewlvl9g0ph.R.inc(541);la.discardByte();
            }
            }__CLR4_5_2ewewlvl9g0ph.R.inc(542);la.discardNext3AndMarkStart();

            __CLR4_5_2ewewlvl9g0ph.R.inc(543);while ((((!la.nextThreeEquals000or001orEof(true))&&(__CLR4_5_2ewewlvl9g0ph.R.iget(544)!=0|true))||(__CLR4_5_2ewewlvl9g0ph.R.iget(545)==0&false))) {{
                __CLR4_5_2ewewlvl9g0ph.R.inc(546);la.discardByte();
            }
            }__CLR4_5_2ewewlvl9g0ph.R.inc(547);return la.getNal();
        } catch (EOFException e) {
            __CLR4_5_2ewewlvl9g0ph.R.inc(548);return null;
        }
    }finally{__CLR4_5_2ewewlvl9g0ph.R.flushNeeded();}}


    public static void main(String[] args) throws IOException {try{__CLR4_5_2ewewlvl9g0ph.R.inc(549);
        __CLR4_5_2ewewlvl9g0ph.R.inc(550);File dir = new File("C:\\dev\\ASAN\\record");
        __CLR4_5_2ewewlvl9g0ph.R.inc(551);File[] h264s = dir.listFiles();
        __CLR4_5_2ewewlvl9g0ph.R.inc(552);Arrays.sort(h264s);
        __CLR4_5_2ewewlvl9g0ph.R.inc(553);int i = 0;
        __CLR4_5_2ewewlvl9g0ph.R.inc(554);for (File h264 : h264s) {{
            __CLR4_5_2ewewlvl9g0ph.R.inc(555);AbstractH26XTrack.LookAhead lookAhead = new AbstractH26XTrack.LookAhead(new FileDataSourceImpl(h264));
            __CLR4_5_2ewewlvl9g0ph.R.inc(556);ByteBuffer nal = null;

            __CLR4_5_2ewewlvl9g0ph.R.inc(557);while ((nal = findNextNal(lookAhead))!=null) {{
                __CLR4_5_2ewewlvl9g0ph.R.inc(560);int type = nal.get(0);
                __CLR4_5_2ewewlvl9g0ph.R.inc(561);int nal_ref_idc = (type >> 5) & 3;
                __CLR4_5_2ewewlvl9g0ph.R.inc(562);int nal_unit_type = type & 0x1f;
                //System.err.println(nal_unit_type);
                __CLR4_5_2ewewlvl9g0ph.R.inc(563);if ((((nal_unit_type == 7)&&(__CLR4_5_2ewewlvl9g0ph.R.iget(564)!=0|true))||(__CLR4_5_2ewewlvl9g0ph.R.iget(565)==0&false))) {{
                    __CLR4_5_2ewewlvl9g0ph.R.inc(566);byte[] nalArray = new byte[nal.remaining()];
                    __CLR4_5_2ewewlvl9g0ph.R.inc(567);nal.get(nalArray);
                    //SeqParameterSet sps = SeqParameterSet.read(new CleanInputStream(new ByteArrayInputStream(nalArray)));
                    __CLR4_5_2ewewlvl9g0ph.R.inc(568);System.err.println(i++);
                } }else {{
                    __CLR4_5_2ewewlvl9g0ph.R.inc(569);i++;
                }
            }}
            //System.err.println("--------------");
        }}
    }}finally{__CLR4_5_2ewewlvl9g0ph.R.flushNeeded();}}
}
