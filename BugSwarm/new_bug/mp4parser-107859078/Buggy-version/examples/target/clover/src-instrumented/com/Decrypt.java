/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Decrypt {public static class __CLR4_5_21v1vlvl9g0l8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413351766L,8589935092L,82,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


    public static String encodeHex(byte[] data) {try{__CLR4_5_21v1vlvl9g0l8.R.inc(67);
        __CLR4_5_21v1vlvl9g0l8.R.inc(68);int l = data.length;
        __CLR4_5_21v1vlvl9g0l8.R.inc(69);char[] out = new char[(l << 1)];
        // two characters form the hex value.
        __CLR4_5_21v1vlvl9g0l8.R.inc(70);for (int i = 0, j = 0; (((i < l)&&(__CLR4_5_21v1vlvl9g0l8.R.iget(71)!=0|true))||(__CLR4_5_21v1vlvl9g0l8.R.iget(72)==0&false)); i++) {{
            __CLR4_5_21v1vlvl9g0l8.R.inc(73);out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
            __CLR4_5_21v1vlvl9g0l8.R.inc(74);out[j++] = DIGITS[0x0F & data[i]];
        }
        }__CLR4_5_21v1vlvl9g0l8.R.inc(75);return new String(out);
    }finally{__CLR4_5_21v1vlvl9g0l8.R.flushNeeded();}}

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {try{__CLR4_5_21v1vlvl9g0l8.R.inc(76);
        __CLR4_5_21v1vlvl9g0l8.R.inc(77);byte enc[] = new byte[]{(byte) 0x9d, (byte) 0xbb, (byte) 0xed, (byte) 0x89, 0x4d, (byte) 0xd6, 0x3c, 0x3b, (byte) 0x88, 0x1a, 0x7a, 0x59, 0x6f, (byte) 0xb9, (byte) 0xeb, 0x24, (byte) 0xa6, 0x62, (byte) 0xe9, 0x22};
        __CLR4_5_21v1vlvl9g0l8.R.inc(78);Cipher c = Cipher.getInstance("AES/CTR/NoPadding");
        __CLR4_5_21v1vlvl9g0l8.R.inc(79);c.init(Cipher.DECRYPT_MODE, new SecretKeySpec(new byte[16], "AES"), new IvParameterSpec(new byte[16]));
        __CLR4_5_21v1vlvl9g0l8.R.inc(80);byte[] plain = c.doFinal(enc);
        __CLR4_5_21v1vlvl9g0l8.R.inc(81);System.err.println(encodeHex(plain));
    }finally{__CLR4_5_21v1vlvl9g0l8.R.flushNeeded();}}
}
