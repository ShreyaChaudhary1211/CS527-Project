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
public class CencSampleAuxiliaryDataFormat {public static class __CLR4_5_2h10h10lvlulnyc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,22258,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public byte[] iv = new byte[0];
    public Pair[] pairs = null;

    public int getSize() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22068);
        __CLR4_5_2h10h10lvlulnyc.R.inc(22069);int size = iv.length;
        __CLR4_5_2h10h10lvlulnyc.R.inc(22070);if ((((pairs != null && pairs.length > 0)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22071)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22072)==0&false))) {{
            __CLR4_5_2h10h10lvlulnyc.R.inc(22073);size += 2;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22074);size += (pairs.length * 6);
        }
        }__CLR4_5_2h10h10lvlulnyc.R.inc(22075);return size;
    }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

    public Pair createPair(final int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22076);
        // Memory saving!!!
        __CLR4_5_2h10h10lvlulnyc.R.inc(22077);if ((((clear <= Byte.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22078)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22079)==0&false))) {{
            __CLR4_5_2h10h10lvlulnyc.R.inc(22080);if ((((encrypted <= Byte.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22081)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22082)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22083);return new ByteBytePair(clear, encrypted);
            } }else {__CLR4_5_2h10h10lvlulnyc.R.inc(22084);if ((((encrypted <= Short.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22085)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22086)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22087);return new ByteShortPair(clear, encrypted);
            } }else {__CLR4_5_2h10h10lvlulnyc.R.inc(22088);if ((((encrypted <= Integer.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22089)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22090)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22091);return new ByteIntPair(clear, encrypted);
            } }else {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22092);return new ByteLongPair(clear, encrypted);
            }
        }}}} }else {__CLR4_5_2h10h10lvlulnyc.R.inc(22093);if ((((clear <= Short.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22094)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22095)==0&false))) {{
            __CLR4_5_2h10h10lvlulnyc.R.inc(22096);if ((((encrypted <= Byte.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22097)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22098)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22099);return new ShortBytePair(clear, encrypted);
            } }else {__CLR4_5_2h10h10lvlulnyc.R.inc(22100);if ((((encrypted <= Short.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22101)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22102)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22103);return new ShortShortPair(clear, encrypted);
            } }else {__CLR4_5_2h10h10lvlulnyc.R.inc(22104);if ((((encrypted <= Integer.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22105)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22106)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22107);return new ShortIntPair(clear, encrypted);
            } }else {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22108);return new ShortLongPair(clear, encrypted);
            }
        }}}} }else {{
            __CLR4_5_2h10h10lvlulnyc.R.inc(22109);if ((((encrypted <= Byte.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22110)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22111)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22112);return new IntBytePair(clear, encrypted);
            } }else {__CLR4_5_2h10h10lvlulnyc.R.inc(22113);if ((((encrypted <= Short.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22114)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22115)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22116);return new IntShortPair(clear, encrypted);
            } }else {__CLR4_5_2h10h10lvlulnyc.R.inc(22117);if ((((encrypted <= Integer.MAX_VALUE)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22118)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22119)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22120);return new IntIntPair(clear, encrypted);
            } }else {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22121);return new IntLongPair(clear, encrypted);
            }
        }}}}
    }}}finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22122);
        __CLR4_5_2h10h10lvlulnyc.R.inc(22123);if ((((this == o)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22124)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22125)==0&false))) {{
            __CLR4_5_2h10h10lvlulnyc.R.inc(22126);return true;
        }
        }__CLR4_5_2h10h10lvlulnyc.R.inc(22127);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22128)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22129)==0&false))) {{
            __CLR4_5_2h10h10lvlulnyc.R.inc(22130);return false;
        }

        }__CLR4_5_2h10h10lvlulnyc.R.inc(22131);CencSampleAuxiliaryDataFormat entry = (CencSampleAuxiliaryDataFormat) o;

        __CLR4_5_2h10h10lvlulnyc.R.inc(22132);if ((((!new BigInteger(iv).equals(new BigInteger(entry.iv)))&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22133)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22134)==0&false))) {{
            __CLR4_5_2h10h10lvlulnyc.R.inc(22135);return false;
        }
        }__CLR4_5_2h10h10lvlulnyc.R.inc(22136);if (((((((pairs != null )&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22137)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22138)==0&false))? !Arrays.equals(pairs, entry.pairs) : entry.pairs != null)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22139)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22140)==0&false))) {{
            __CLR4_5_2h10h10lvlulnyc.R.inc(22141);return false;
        }

        }__CLR4_5_2h10h10lvlulnyc.R.inc(22142);return true;
    }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22143);
        __CLR4_5_2h10h10lvlulnyc.R.inc(22144);int result = (((iv != null )&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22145)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22146)==0&false))? Arrays.hashCode(iv) : 0;
        __CLR4_5_2h10h10lvlulnyc.R.inc(22147);result = 31 * result + ((((pairs != null )&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22148)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22149)==0&false))? Arrays.hashCode(pairs) : 0);
        __CLR4_5_2h10h10lvlulnyc.R.inc(22150);return result;
    }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22151);
        __CLR4_5_2h10h10lvlulnyc.R.inc(22152);return "Entry{" +
                "iv=" + Hex.encodeHex(iv) +
                ", pairs=" + Arrays.toString(pairs) +
                '}';
    }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    public interface Pair {
        int clear();
        long encrypted();
    }

    private class ByteBytePair extends AbstractPair {
        private byte clear;
        private byte encrypted;

        public ByteBytePair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22153);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22154);this.clear = (byte) clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22155);this.encrypted = (byte) encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22156);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22157);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22158);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22159);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

    }

    private class ByteShortPair extends AbstractPair {
        private byte clear;
        private short encrypted;

        public ByteShortPair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22160);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22161);this.clear = (byte) clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22162);this.encrypted = (short) encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22163);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22164);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22165);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22166);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class ByteIntPair extends AbstractPair {
        private byte clear;
        private int encrypted;

        public ByteIntPair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22167);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22168);this.clear = (byte) clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22169);this.encrypted = (int) encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22170);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22171);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22172);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22173);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class ByteLongPair extends AbstractPair {
        private byte clear;
        private long encrypted;

        public ByteLongPair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22174);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22175);this.clear = (byte) clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22176);this.encrypted = encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22177);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22178);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22179);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22180);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class ShortBytePair extends AbstractPair {
        private short clear;
        private byte encrypted;

        public ShortBytePair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22181);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22182);this.clear = (short) clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22183);this.encrypted = (byte) encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22184);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22185);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22186);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22187);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class ShortShortPair extends AbstractPair {
        private short clear;
        private short encrypted;

        public ShortShortPair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22188);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22189);this.clear = (short) clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22190);this.encrypted = (short) encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22191);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22192);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22193);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22194);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class ShortIntPair extends AbstractPair {
        private short clear;
        private int encrypted;

        public ShortIntPair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22195);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22196);this.clear = (short) clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22197);this.encrypted = (int) encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22198);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22199);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22200);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22201);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class ShortLongPair extends AbstractPair {
        private short clear;
        private long encrypted;

        public ShortLongPair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22202);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22203);this.clear = (short) clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22204);this.encrypted = encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22205);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22206);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22207);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22208);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class IntBytePair extends AbstractPair {
        private int clear;
        private byte encrypted;

        public IntBytePair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22209);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22210);this.clear = clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22211);this.encrypted = (byte) encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22212);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22213);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22214);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22215);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class IntShortPair extends AbstractPair {
        private int clear;
        private short encrypted;

        public IntShortPair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22216);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22217);this.clear = clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22218);this.encrypted = (short) encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22219);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22220);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22221);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22222);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class IntIntPair extends AbstractPair {
        private int clear;
        private int encrypted;

        public IntIntPair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22223);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22224);this.clear = clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22225);this.encrypted = (int) encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22226);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22227);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22228);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22229);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private class IntLongPair extends AbstractPair {
        private int clear;
        private long encrypted;

        public IntLongPair(int clear, long encrypted) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22230);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22231);this.clear = clear;
            __CLR4_5_2h10h10lvlulnyc.R.inc(22232);this.encrypted = encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public int clear() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22233);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22234);return clear;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public long encrypted() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22235);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22236);return encrypted;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }

    private abstract class AbstractPair implements Pair {

        public boolean equals(Object o) {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22237);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22238);if ((((this == o)&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22239)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22240)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22241);return true;
            }
            }__CLR4_5_2h10h10lvlulnyc.R.inc(22242);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22243)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22244)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22245);return false;
            }

            }__CLR4_5_2h10h10lvlulnyc.R.inc(22246);Pair pair = (Pair) o;

            __CLR4_5_2h10h10lvlulnyc.R.inc(22247);if ((((clear() != pair.clear())&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22248)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22249)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22250);return false;
            }
            }__CLR4_5_2h10h10lvlulnyc.R.inc(22251);if ((((encrypted() != pair.encrypted())&&(__CLR4_5_2h10h10lvlulnyc.R.iget(22252)!=0|true))||(__CLR4_5_2h10h10lvlulnyc.R.iget(22253)==0&false))) {{
                __CLR4_5_2h10h10lvlulnyc.R.inc(22254);return false;
            }

            }__CLR4_5_2h10h10lvlulnyc.R.inc(22255);return true;
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2h10h10lvlulnyc.R.inc(22256);
            __CLR4_5_2h10h10lvlulnyc.R.inc(22257);return "P(" + clear() + "|" + encrypted() + ")";
        }finally{__CLR4_5_2h10h10lvlulnyc.R.flushNeeded();}}
    }
}
