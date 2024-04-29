/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.mp4parser.iso23001.part7;

import com.coremedia.iso.Hex;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Each encrypted sample in a protected track shall have an Initialization Vector associated with it. Further, each
 * encrypted sample in protected AVC video tracks shall conform to ISO/IEC 14496-10 and ISO/IEC 14496-15
 * and shall use the subsample encryption scheme specified in 9.6.2, which requires subsample encryption data.
 * Both initialization vectors and subsample encryption data are provided as Sample Auxiliary Information with
 * aux_info_type equal to \u2018cenc\u2019 and aux_info_type_parameter equal to 0. For tracks protected using
 * the 'cenc' scheme, the default value for aux_info_type is equal to 'cenc' and the default value for the
 * aux_info_type_parameter is 0 so content may be created omitting these optional fields. Storage of
 * sample auxiliary information shall conform to ISO/IEC 14496-12.<br>
 *
 * This class can also be used for PIFF as it has been derived from the PIFF spec.
 */
public class CencSampleAuxiliaryDataFormat {public static class __CLR4_5_2gydgydlvl9elce{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,22163,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public byte[] iv = new byte[0];
    public Pair[] pairs = null;

    public int getSize() {try{__CLR4_5_2gydgydlvl9elce.R.inc(21973);
        __CLR4_5_2gydgydlvl9elce.R.inc(21974);int size = iv.length;
        __CLR4_5_2gydgydlvl9elce.R.inc(21975);if ((((pairs != null && pairs.length > 0)&&(__CLR4_5_2gydgydlvl9elce.R.iget(21976)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(21977)==0&false))) {{
            __CLR4_5_2gydgydlvl9elce.R.inc(21978);size += 2;
            __CLR4_5_2gydgydlvl9elce.R.inc(21979);size += (pairs.length * 6);
        }
        }__CLR4_5_2gydgydlvl9elce.R.inc(21980);return size;
    }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

    public Pair createPair(final int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(21981);
        // Memory saving!!!
        __CLR4_5_2gydgydlvl9elce.R.inc(21982);if ((((clear <= Byte.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(21983)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(21984)==0&false))) {{
            __CLR4_5_2gydgydlvl9elce.R.inc(21985);if ((((encrypted <= Byte.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(21986)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(21987)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(21988);return new ByteBytePair(clear, encrypted);
            } }else {__CLR4_5_2gydgydlvl9elce.R.inc(21989);if ((((encrypted <= Short.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(21990)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(21991)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(21992);return new ByteShortPair(clear, encrypted);
            } }else {__CLR4_5_2gydgydlvl9elce.R.inc(21993);if ((((encrypted <= Integer.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(21994)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(21995)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(21996);return new ByteIntPair(clear, encrypted);
            } }else {{
                __CLR4_5_2gydgydlvl9elce.R.inc(21997);return new ByteLongPair(clear, encrypted);
            }
        }}}} }else {__CLR4_5_2gydgydlvl9elce.R.inc(21998);if ((((clear <= Short.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(21999)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22000)==0&false))) {{
            __CLR4_5_2gydgydlvl9elce.R.inc(22001);if ((((encrypted <= Byte.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(22002)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22003)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22004);return new ShortBytePair(clear, encrypted);
            } }else {__CLR4_5_2gydgydlvl9elce.R.inc(22005);if ((((encrypted <= Short.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(22006)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22007)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22008);return new ShortShortPair(clear, encrypted);
            } }else {__CLR4_5_2gydgydlvl9elce.R.inc(22009);if ((((encrypted <= Integer.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(22010)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22011)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22012);return new ShortIntPair(clear, encrypted);
            } }else {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22013);return new ShortLongPair(clear, encrypted);
            }
        }}}} }else {{
            __CLR4_5_2gydgydlvl9elce.R.inc(22014);if ((((encrypted <= Byte.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(22015)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22016)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22017);return new IntBytePair(clear, encrypted);
            } }else {__CLR4_5_2gydgydlvl9elce.R.inc(22018);if ((((encrypted <= Short.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(22019)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22020)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22021);return new IntShortPair(clear, encrypted);
            } }else {__CLR4_5_2gydgydlvl9elce.R.inc(22022);if ((((encrypted <= Integer.MAX_VALUE)&&(__CLR4_5_2gydgydlvl9elce.R.iget(22023)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22024)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22025);return new IntIntPair(clear, encrypted);
            } }else {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22026);return new IntLongPair(clear, encrypted);
            }
        }}}}
    }}}finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22027);
        __CLR4_5_2gydgydlvl9elce.R.inc(22028);if ((((this == o)&&(__CLR4_5_2gydgydlvl9elce.R.iget(22029)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22030)==0&false))) {{
            __CLR4_5_2gydgydlvl9elce.R.inc(22031);return true;
        }
        }__CLR4_5_2gydgydlvl9elce.R.inc(22032);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2gydgydlvl9elce.R.iget(22033)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22034)==0&false))) {{
            __CLR4_5_2gydgydlvl9elce.R.inc(22035);return false;
        }

        }__CLR4_5_2gydgydlvl9elce.R.inc(22036);CencSampleAuxiliaryDataFormat entry = (CencSampleAuxiliaryDataFormat) o;

        __CLR4_5_2gydgydlvl9elce.R.inc(22037);if ((((!new BigInteger(iv).equals(new BigInteger(entry.iv)))&&(__CLR4_5_2gydgydlvl9elce.R.iget(22038)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22039)==0&false))) {{
            __CLR4_5_2gydgydlvl9elce.R.inc(22040);return false;
        }
        }__CLR4_5_2gydgydlvl9elce.R.inc(22041);if (((((((pairs != null )&&(__CLR4_5_2gydgydlvl9elce.R.iget(22042)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22043)==0&false))? !Arrays.equals(pairs, entry.pairs) : entry.pairs != null)&&(__CLR4_5_2gydgydlvl9elce.R.iget(22044)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22045)==0&false))) {{
            __CLR4_5_2gydgydlvl9elce.R.inc(22046);return false;
        }

        }__CLR4_5_2gydgydlvl9elce.R.inc(22047);return true;
    }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22048);
        __CLR4_5_2gydgydlvl9elce.R.inc(22049);int result = (((iv != null )&&(__CLR4_5_2gydgydlvl9elce.R.iget(22050)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22051)==0&false))? Arrays.hashCode(iv) : 0;
        __CLR4_5_2gydgydlvl9elce.R.inc(22052);result = 31 * result + ((((pairs != null )&&(__CLR4_5_2gydgydlvl9elce.R.iget(22053)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22054)==0&false))? Arrays.hashCode(pairs) : 0);
        __CLR4_5_2gydgydlvl9elce.R.inc(22055);return result;
    }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22056);
        __CLR4_5_2gydgydlvl9elce.R.inc(22057);return "Entry{" +
                "iv=" + Hex.encodeHex(iv) +
                ", pairs=" + Arrays.toString(pairs) +
                '}';
    }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    public interface Pair {
        int clear();
        long encrypted();
    }

    private class ByteBytePair extends AbstractPair {
        private byte clear;
        private byte encrypted;

        public ByteBytePair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22058);
            __CLR4_5_2gydgydlvl9elce.R.inc(22059);this.clear = (byte) clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22060);this.encrypted = (byte) encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22061);
            __CLR4_5_2gydgydlvl9elce.R.inc(22062);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22063);
            __CLR4_5_2gydgydlvl9elce.R.inc(22064);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

    }

    private class ByteShortPair extends AbstractPair {
        private byte clear;
        private short encrypted;

        public ByteShortPair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22065);
            __CLR4_5_2gydgydlvl9elce.R.inc(22066);this.clear = (byte) clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22067);this.encrypted = (short) encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22068);
            __CLR4_5_2gydgydlvl9elce.R.inc(22069);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22070);
            __CLR4_5_2gydgydlvl9elce.R.inc(22071);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class ByteIntPair extends AbstractPair {
        private byte clear;
        private int encrypted;

        public ByteIntPair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22072);
            __CLR4_5_2gydgydlvl9elce.R.inc(22073);this.clear = (byte) clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22074);this.encrypted = (int) encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22075);
            __CLR4_5_2gydgydlvl9elce.R.inc(22076);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22077);
            __CLR4_5_2gydgydlvl9elce.R.inc(22078);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class ByteLongPair extends AbstractPair {
        private byte clear;
        private long encrypted;

        public ByteLongPair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22079);
            __CLR4_5_2gydgydlvl9elce.R.inc(22080);this.clear = (byte) clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22081);this.encrypted = encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22082);
            __CLR4_5_2gydgydlvl9elce.R.inc(22083);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22084);
            __CLR4_5_2gydgydlvl9elce.R.inc(22085);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class ShortBytePair extends AbstractPair {
        private short clear;
        private byte encrypted;

        public ShortBytePair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22086);
            __CLR4_5_2gydgydlvl9elce.R.inc(22087);this.clear = (short) clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22088);this.encrypted = (byte) encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22089);
            __CLR4_5_2gydgydlvl9elce.R.inc(22090);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22091);
            __CLR4_5_2gydgydlvl9elce.R.inc(22092);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class ShortShortPair extends AbstractPair {
        private short clear;
        private short encrypted;

        public ShortShortPair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22093);
            __CLR4_5_2gydgydlvl9elce.R.inc(22094);this.clear = (short) clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22095);this.encrypted = (short) encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22096);
            __CLR4_5_2gydgydlvl9elce.R.inc(22097);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22098);
            __CLR4_5_2gydgydlvl9elce.R.inc(22099);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class ShortIntPair extends AbstractPair {
        private short clear;
        private int encrypted;

        public ShortIntPair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22100);
            __CLR4_5_2gydgydlvl9elce.R.inc(22101);this.clear = (short) clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22102);this.encrypted = (int) encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22103);
            __CLR4_5_2gydgydlvl9elce.R.inc(22104);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22105);
            __CLR4_5_2gydgydlvl9elce.R.inc(22106);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class ShortLongPair extends AbstractPair {
        private short clear;
        private long encrypted;

        public ShortLongPair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22107);
            __CLR4_5_2gydgydlvl9elce.R.inc(22108);this.clear = (short) clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22109);this.encrypted = encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22110);
            __CLR4_5_2gydgydlvl9elce.R.inc(22111);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22112);
            __CLR4_5_2gydgydlvl9elce.R.inc(22113);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class IntBytePair extends AbstractPair {
        private int clear;
        private byte encrypted;

        public IntBytePair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22114);
            __CLR4_5_2gydgydlvl9elce.R.inc(22115);this.clear = clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22116);this.encrypted = (byte) encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22117);
            __CLR4_5_2gydgydlvl9elce.R.inc(22118);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22119);
            __CLR4_5_2gydgydlvl9elce.R.inc(22120);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class IntShortPair extends AbstractPair {
        private int clear;
        private short encrypted;

        public IntShortPair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22121);
            __CLR4_5_2gydgydlvl9elce.R.inc(22122);this.clear = clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22123);this.encrypted = (short) encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22124);
            __CLR4_5_2gydgydlvl9elce.R.inc(22125);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22126);
            __CLR4_5_2gydgydlvl9elce.R.inc(22127);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class IntIntPair extends AbstractPair {
        private int clear;
        private int encrypted;

        public IntIntPair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22128);
            __CLR4_5_2gydgydlvl9elce.R.inc(22129);this.clear = clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22130);this.encrypted = (int) encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22131);
            __CLR4_5_2gydgydlvl9elce.R.inc(22132);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22133);
            __CLR4_5_2gydgydlvl9elce.R.inc(22134);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private class IntLongPair extends AbstractPair {
        private int clear;
        private long encrypted;

        public IntLongPair(int clear, long encrypted) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22135);
            __CLR4_5_2gydgydlvl9elce.R.inc(22136);this.clear = clear;
            __CLR4_5_2gydgydlvl9elce.R.inc(22137);this.encrypted = encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22138);
            __CLR4_5_2gydgydlvl9elce.R.inc(22139);return clear;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22140);
            __CLR4_5_2gydgydlvl9elce.R.inc(22141);return encrypted;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }

    private abstract class AbstractPair implements Pair {

        public boolean equals(Object o) {try{__CLR4_5_2gydgydlvl9elce.R.inc(22142);
            __CLR4_5_2gydgydlvl9elce.R.inc(22143);if ((((this == o)&&(__CLR4_5_2gydgydlvl9elce.R.iget(22144)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22145)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22146);return true;
            }
            }__CLR4_5_2gydgydlvl9elce.R.inc(22147);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2gydgydlvl9elce.R.iget(22148)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22149)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22150);return false;
            }

            }__CLR4_5_2gydgydlvl9elce.R.inc(22151);Pair pair = (Pair) o;

            __CLR4_5_2gydgydlvl9elce.R.inc(22152);if ((((clear() != pair.clear())&&(__CLR4_5_2gydgydlvl9elce.R.iget(22153)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22154)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22155);return false;
            }
            }__CLR4_5_2gydgydlvl9elce.R.inc(22156);if ((((encrypted() != pair.encrypted())&&(__CLR4_5_2gydgydlvl9elce.R.iget(22157)!=0|true))||(__CLR4_5_2gydgydlvl9elce.R.iget(22158)==0&false))) {{
                __CLR4_5_2gydgydlvl9elce.R.inc(22159);return false;
            }

            }__CLR4_5_2gydgydlvl9elce.R.inc(22160);return true;
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2gydgydlvl9elce.R.inc(22161);
            __CLR4_5_2gydgydlvl9elce.R.inc(22162);return "P(" + clear() + "|" + encrypted() + ")";
        }finally{__CLR4_5_2gydgydlvl9elce.R.flushNeeded();}}
    }
}
