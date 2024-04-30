/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;


public class CencDecryptingSampleList extends AbstractList<Sample> {public static class __CLR4_5_2bqabqalvlulkaw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,15282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    List<CencSampleAuxiliaryDataFormat> sencInfo;
    RangeStartMap<Integer, SecretKey> keys = new RangeStartMap<Integer, SecretKey>();
    List<Sample> parent;
    String encryptionAlgo;

    public CencDecryptingSampleList(SecretKey secretKey, List<Sample> parent, List<CencSampleAuxiliaryDataFormat> sencInfo) {
        this(new RangeStartMap<Integer, SecretKey>(0, secretKey), parent, sencInfo, "cenc");__CLR4_5_2bqabqalvlulkaw.R.inc(15203);try{__CLR4_5_2bqabqalvlulkaw.R.inc(15202);

    }finally{__CLR4_5_2bqabqalvlulkaw.R.flushNeeded();}}

    public CencDecryptingSampleList(
            RangeStartMap<Integer, SecretKey> keys,
            List<Sample> parent, List<CencSampleAuxiliaryDataFormat> sencInfo,
            String encryptionAlgo) {try{__CLR4_5_2bqabqalvlulkaw.R.inc(15204);
        __CLR4_5_2bqabqalvlulkaw.R.inc(15205);this.sencInfo = sencInfo;
        __CLR4_5_2bqabqalvlulkaw.R.inc(15206);this.keys = keys;
        __CLR4_5_2bqabqalvlulkaw.R.inc(15207);this.parent = parent;
        __CLR4_5_2bqabqalvlulkaw.R.inc(15208);this.encryptionAlgo = encryptionAlgo;
    }finally{__CLR4_5_2bqabqalvlulkaw.R.flushNeeded();}}


    Cipher getCipher(SecretKey sk, byte[] iv) {try{__CLR4_5_2bqabqalvlulkaw.R.inc(15209);
        __CLR4_5_2bqabqalvlulkaw.R.inc(15210);byte[] fullIv = new byte[16];
        __CLR4_5_2bqabqalvlulkaw.R.inc(15211);System.arraycopy(iv, 0, fullIv, 0, iv.length);
        // The IV
        __CLR4_5_2bqabqalvlulkaw.R.inc(15212);try {
            __CLR4_5_2bqabqalvlulkaw.R.inc(15213);if (((("cenc".equals(encryptionAlgo))&&(__CLR4_5_2bqabqalvlulkaw.R.iget(15214)!=0|true))||(__CLR4_5_2bqabqalvlulkaw.R.iget(15215)==0&false))) {{
                __CLR4_5_2bqabqalvlulkaw.R.inc(15216);Cipher c = Cipher.getInstance("AES/CTR/NoPadding");
                __CLR4_5_2bqabqalvlulkaw.R.inc(15217);c.init(Cipher.DECRYPT_MODE, sk, new IvParameterSpec(fullIv));
                __CLR4_5_2bqabqalvlulkaw.R.inc(15218);return c;
            } }else {__CLR4_5_2bqabqalvlulkaw.R.inc(15219);if (((("cbc1".equals(encryptionAlgo))&&(__CLR4_5_2bqabqalvlulkaw.R.iget(15220)!=0|true))||(__CLR4_5_2bqabqalvlulkaw.R.iget(15221)==0&false))) {{
                __CLR4_5_2bqabqalvlulkaw.R.inc(15222);Cipher c = Cipher.getInstance("AES/CBC/NoPadding");
                __CLR4_5_2bqabqalvlulkaw.R.inc(15223);c.init(Cipher.DECRYPT_MODE, sk, new IvParameterSpec(fullIv));
                __CLR4_5_2bqabqalvlulkaw.R.inc(15224);return c;
            } }else {{
                __CLR4_5_2bqabqalvlulkaw.R.inc(15225);throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
            }
        }}} catch (NoSuchAlgorithmException e) {
            __CLR4_5_2bqabqalvlulkaw.R.inc(15226);throw new RuntimeException(e);
        } catch (NoSuchPaddingException e) {
            __CLR4_5_2bqabqalvlulkaw.R.inc(15227);throw new RuntimeException(e);
        } catch (InvalidAlgorithmParameterException e) {
            __CLR4_5_2bqabqalvlulkaw.R.inc(15228);throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            __CLR4_5_2bqabqalvlulkaw.R.inc(15229);throw new RuntimeException(e);
        }


    }finally{__CLR4_5_2bqabqalvlulkaw.R.flushNeeded();}}

    @Override
    public Sample get(int index) {try{__CLR4_5_2bqabqalvlulkaw.R.inc(15230);
        __CLR4_5_2bqabqalvlulkaw.R.inc(15231);if ((((keys.get(index) != null)&&(__CLR4_5_2bqabqalvlulkaw.R.iget(15232)!=0|true))||(__CLR4_5_2bqabqalvlulkaw.R.iget(15233)==0&false))) {{
            __CLR4_5_2bqabqalvlulkaw.R.inc(15234);Sample encSample = parent.get(index);
            __CLR4_5_2bqabqalvlulkaw.R.inc(15235);final ByteBuffer encSampleBuffer = encSample.asByteBuffer();
            __CLR4_5_2bqabqalvlulkaw.R.inc(15236);encSampleBuffer.rewind();
            __CLR4_5_2bqabqalvlulkaw.R.inc(15237);final ByteBuffer decSampleBuffer = ByteBuffer.allocate(encSampleBuffer.limit());
            __CLR4_5_2bqabqalvlulkaw.R.inc(15238);final CencSampleAuxiliaryDataFormat sencEntry = sencInfo.get(index);
            __CLR4_5_2bqabqalvlulkaw.R.inc(15239);Cipher cipher = getCipher(keys.get(index), sencEntry.iv);
            __CLR4_5_2bqabqalvlulkaw.R.inc(15240);try {
                __CLR4_5_2bqabqalvlulkaw.R.inc(15241);if ((((sencEntry.pairs != null && sencEntry.pairs.length > 0)&&(__CLR4_5_2bqabqalvlulkaw.R.iget(15242)!=0|true))||(__CLR4_5_2bqabqalvlulkaw.R.iget(15243)==0&false))) {{

                    __CLR4_5_2bqabqalvlulkaw.R.inc(15244);for (CencSampleAuxiliaryDataFormat.Pair pair : sencEntry.pairs) {{
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15245);final int clearBytes = pair.clear();
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15246);final int encrypted = l2i(pair.encrypted());

                        __CLR4_5_2bqabqalvlulkaw.R.inc(15247);byte[] clears = new byte[clearBytes];
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15248);encSampleBuffer.get(clears);
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15249);decSampleBuffer.put(clears);
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15250);if ((((encrypted > 0)&&(__CLR4_5_2bqabqalvlulkaw.R.iget(15251)!=0|true))||(__CLR4_5_2bqabqalvlulkaw.R.iget(15252)==0&false))) {{
                            __CLR4_5_2bqabqalvlulkaw.R.inc(15253);byte[] encs = new byte[encrypted];
                            __CLR4_5_2bqabqalvlulkaw.R.inc(15254);encSampleBuffer.get(encs);
                            __CLR4_5_2bqabqalvlulkaw.R.inc(15255);final byte[] decr = cipher.update(encs);
                            __CLR4_5_2bqabqalvlulkaw.R.inc(15256);decSampleBuffer.put(decr);
                        }

                    }}
                    }__CLR4_5_2bqabqalvlulkaw.R.inc(15257);if ((((encSampleBuffer.remaining() > 0)&&(__CLR4_5_2bqabqalvlulkaw.R.iget(15258)!=0|true))||(__CLR4_5_2bqabqalvlulkaw.R.iget(15259)==0&false))) {{
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15260);System.err.println("Decrypted sample but still data remaining: " + encSample.getSize());
                    }
                    }__CLR4_5_2bqabqalvlulkaw.R.inc(15261);decSampleBuffer.put(cipher.doFinal());
                } }else {{
                    __CLR4_5_2bqabqalvlulkaw.R.inc(15262);byte[] fullyEncryptedSample = new byte[encSampleBuffer.limit()];
                    __CLR4_5_2bqabqalvlulkaw.R.inc(15263);encSampleBuffer.get(fullyEncryptedSample);
                    __CLR4_5_2bqabqalvlulkaw.R.inc(15264);if (((("cbc1".equals(encryptionAlgo))&&(__CLR4_5_2bqabqalvlulkaw.R.iget(15265)!=0|true))||(__CLR4_5_2bqabqalvlulkaw.R.iget(15266)==0&false))) {{
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15267);int encryptedLength = fullyEncryptedSample.length / 16 * 16;
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15268);decSampleBuffer.put(cipher.doFinal(fullyEncryptedSample, 0, encryptedLength));
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15269);decSampleBuffer.put(fullyEncryptedSample, encryptedLength, fullyEncryptedSample.length - encryptedLength);
                    } }else {__CLR4_5_2bqabqalvlulkaw.R.inc(15270);if (((("cenc".equals(encryptionAlgo))&&(__CLR4_5_2bqabqalvlulkaw.R.iget(15271)!=0|true))||(__CLR4_5_2bqabqalvlulkaw.R.iget(15272)==0&false))) {{
                        __CLR4_5_2bqabqalvlulkaw.R.inc(15273);decSampleBuffer.put(cipher.doFinal(fullyEncryptedSample));
                    }
                }}}
                }__CLR4_5_2bqabqalvlulkaw.R.inc(15274);encSampleBuffer.rewind();
            } catch (IllegalBlockSizeException e) {
                __CLR4_5_2bqabqalvlulkaw.R.inc(15275);throw new RuntimeException(e);
            } catch (BadPaddingException e) {
                __CLR4_5_2bqabqalvlulkaw.R.inc(15276);throw new RuntimeException(e);
            }
            __CLR4_5_2bqabqalvlulkaw.R.inc(15277);decSampleBuffer.rewind();
            __CLR4_5_2bqabqalvlulkaw.R.inc(15278);return new SampleImpl(decSampleBuffer);
        } }else {{
            __CLR4_5_2bqabqalvlulkaw.R.inc(15279);return parent.get(index);
        }
    }}finally{__CLR4_5_2bqabqalvlulkaw.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_2bqabqalvlulkaw.R.inc(15280);
        __CLR4_5_2bqabqalvlulkaw.R.inc(15281);return parent.size();
    }finally{__CLR4_5_2bqabqalvlulkaw.R.flushNeeded();}}
}
