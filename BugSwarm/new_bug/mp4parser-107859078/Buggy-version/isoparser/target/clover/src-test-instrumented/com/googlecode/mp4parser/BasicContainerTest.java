/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.boxes.FileTypeBox;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.security.SecureRandom;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BasicContainerTest {static class __CLR4_5_2i6mi6mlvl9emei{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,23602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testGetByteBuffer() throws IOException {__CLR4_5_2i6mi6mlvl9emei.R.globalSliceStart(getClass().getName(),23566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pl291pi6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2i6mi6mlvl9emei.R.rethrow($CLV_t2$);}finally{__CLR4_5_2i6mi6mlvl9emei.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.BasicContainerTest.testGetByteBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),23566,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pl291pi6m() throws IOException{try{__CLR4_5_2i6mi6mlvl9emei.R.inc(23566);
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23567);BasicContainer bc = new BasicContainer();
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23568);FileTypeBox ftyp1 = new FileTypeBox("1234", 213, Arrays.asList("cenc", "denc", "benc"));
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23569);FileTypeBox ftyp2 = new FileTypeBox("1234", 2213, Arrays.asList("cenc", "denc", "benc"));
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23570);FileTypeBox ftyp3 = new FileTypeBox("1234", 22213, Arrays.asList("cenc", "denc", "benc"));
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23571);bc.addBox(ftyp1);
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23572);bc.addBox(ftyp2);
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23573);bc.addBox(ftyp3);
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23574);ByteArrayOutputStream orig = new ByteArrayOutputStream();
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23575);WritableByteChannel wc = Channels.newChannel(orig);
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23576);bc.writeContainer(wc);

        __CLR4_5_2i6mi6mlvl9emei.R.inc(23577);for (int i = 0; (((i < orig.size())&&(__CLR4_5_2i6mi6mlvl9emei.R.iget(23578)!=0|true))||(__CLR4_5_2i6mi6mlvl9emei.R.iget(23579)==0&false)); i++) {{
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23580);ByteBuffer bb1 = bc.getByteBuffer(0, i);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23581);ByteBuffer bb2 = bc.getByteBuffer(i, orig.size() - i);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23582);ByteArrayOutputStream check = new ByteArrayOutputStream();
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23583);WritableByteChannel wcCheck = Channels.newChannel(check);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23584);wcCheck.write(bb1);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23585);wcCheck.write(bb2);

            __CLR4_5_2i6mi6mlvl9emei.R.inc(23586);Assert.assertArrayEquals("Test " + i, orig.toByteArray(), check.toByteArray());
        }

        }__CLR4_5_2i6mi6mlvl9emei.R.inc(23587);SecureRandom random = new SecureRandom();
        __CLR4_5_2i6mi6mlvl9emei.R.inc(23588);for (int i = 0; (((i < 100)&&(__CLR4_5_2i6mi6mlvl9emei.R.iget(23589)!=0|true))||(__CLR4_5_2i6mi6mlvl9emei.R.iget(23590)==0&false)); i++) {{
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23591);int firstLen = random.nextInt(orig.size()-1);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23592);int secondLen = random.nextInt(orig.size() - firstLen );


            __CLR4_5_2i6mi6mlvl9emei.R.inc(23593);ByteBuffer bb1 = bc.getByteBuffer(0, firstLen);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23594);ByteBuffer bb2 = bc.getByteBuffer(firstLen, secondLen);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23595);ByteBuffer bb3 = bc.getByteBuffer(firstLen + secondLen, orig.size() - (firstLen + secondLen));

            __CLR4_5_2i6mi6mlvl9emei.R.inc(23596);ByteArrayOutputStream check = new ByteArrayOutputStream();
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23597);WritableByteChannel wcCheck = Channels.newChannel(check);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23598);wcCheck.write(bb1);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23599);wcCheck.write(bb2);
            __CLR4_5_2i6mi6mlvl9emei.R.inc(23600);wcCheck.write(bb3);

            __CLR4_5_2i6mi6mlvl9emei.R.inc(23601);Assert.assertArrayEquals("Test " + firstLen + "|" + secondLen , orig.toByteArray(), check.toByteArray());
        }

    }}finally{__CLR4_5_2i6mi6mlvl9emei.R.flushNeeded();}}

}