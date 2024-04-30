/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright \u00a9 2012, castLabs GmbH, www.castlabs.com
 */

package com.googlecode.mp4parser.boxes.cenc;


import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

public class CencEncryptingSampleList extends AbstractList<Sample> {public static class __CLR4_5_2bpvbpvlvl9ejxv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,15305,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String encryptionAlgo;
    Cipher cipher;
    List<CencSampleAuxiliaryDataFormat> auxiliaryDataFormats;
    RangeStartMap<Integer, SecretKey> ceks = new RangeStartMap<Integer, SecretKey>();
    List<Sample> parent;

    public CencEncryptingSampleList(
            SecretKey defaultCek,
            List<Sample> parent,
            List<CencSampleAuxiliaryDataFormat> auxiliaryDataFormats) {
        this(new RangeStartMap<Integer, SecretKey>(0, defaultCek), parent, auxiliaryDataFormats, "cenc");__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15188);try{__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15187);
    }finally{__CLR4_5_2bpvbpvlvl9ejxv.R.flushNeeded();}}

    public CencEncryptingSampleList(
            RangeStartMap<Integer, SecretKey> ceks,
            List<Sample> parent,
            List<CencSampleAuxiliaryDataFormat> auxiliaryDataFormats,
            String encryptionAlgo) {try{__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15189);
        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15190);this.auxiliaryDataFormats = auxiliaryDataFormats;
        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15191);this.ceks = ceks;
        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15192);this.encryptionAlgo = encryptionAlgo;
        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15193);this.parent = parent;
        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15194);try {
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15195);if (((("cenc".equals(encryptionAlgo))&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15196)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15197)==0&false))) {{
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15198);this.cipher = Cipher.getInstance("AES/CTR/NoPadding");
            } }else {__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15199);if (((("cbc1".equals(encryptionAlgo))&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15200)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15201)==0&false))) {{
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15202);this.cipher = Cipher.getInstance("AES/CBC/NoPadding");
            } }else {{
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15203);throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
            }
        }}} catch (NoSuchAlgorithmException e) {
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15204);throw new RuntimeException(e);
        } catch (NoSuchPaddingException e) {
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15205);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_2bpvbpvlvl9ejxv.R.flushNeeded();}}

    @Override
    public Sample get(int index) {try{__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15206);
        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15207);Sample clearSample = parent.get(index);
        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15208);if ((((ceks.get(index) != null)&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15209)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15210)==0&false))) {{
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15211);CencSampleAuxiliaryDataFormat entry = auxiliaryDataFormats.get(index);
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15212);return new EncryptedSampleImpl(clearSample, entry, cipher, ceks.get(index));
        } }else {{
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15213);return clearSample;
        }

    }}finally{__CLR4_5_2bpvbpvlvl9ejxv.R.flushNeeded();}}

    protected void initCipher(byte[] iv, SecretKey cek) {try{__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15214);
        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15215);try {
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15216);byte[] fullIv = new byte[16];
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15217);System.arraycopy(iv, 0, fullIv, 0, iv.length);
            // The IV
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15218);cipher.init(Cipher.ENCRYPT_MODE, cek, new IvParameterSpec(fullIv));
        } catch (InvalidAlgorithmParameterException e) {
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15219);throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15220);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_2bpvbpvlvl9ejxv.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15221);
        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15222);return parent.size();
    }finally{__CLR4_5_2bpvbpvlvl9ejxv.R.flushNeeded();}}

    private class EncryptedSampleImpl implements Sample {

        private final Sample clearSample;
        private final CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat;
        private final Cipher cipher;
        private final SecretKey cek;

        private EncryptedSampleImpl(
                Sample clearSample,
                CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat,
                Cipher cipher,
                SecretKey cek) {try{__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15223);

            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15224);this.clearSample = clearSample;
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15225);this.cencSampleAuxiliaryDataFormat = cencSampleAuxiliaryDataFormat;
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15226);this.cipher = cipher;
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15227);this.cek = cek;
        }finally{__CLR4_5_2bpvbpvlvl9ejxv.R.flushNeeded();}}

        public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15228);
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15229);ByteBuffer sample = (ByteBuffer) clearSample.asByteBuffer().rewind();
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15230);initCipher(cencSampleAuxiliaryDataFormat.iv, cek);
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15231);try {
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15232);if ((((cencSampleAuxiliaryDataFormat.pairs != null && cencSampleAuxiliaryDataFormat.pairs.length > 0)&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15233)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15234)==0&false))) {{
                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15235);byte[] fullSample = new byte[sample.limit()];
                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15236);sample.get(fullSample);
                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15237);int offset = 0;

                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15238);for (CencSampleAuxiliaryDataFormat.Pair pair : cencSampleAuxiliaryDataFormat.pairs) {{
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15239);offset += pair.clear();
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15240);if ((((pair.encrypted() > 0)&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15241)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15242)==0&false))) {{
                            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15243);cipher.update(fullSample,
                                    offset,
                                    l2i(pair.encrypted()),
                                    fullSample,
                                    offset);
                            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15244);offset += pair.encrypted();
                        }
                    }}
                    }__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15245);channel.write(ByteBuffer.wrap(fullSample));
                } }else {{
                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15246);byte[] fullyEncryptedSample = new byte[sample.limit()];
                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15247);sample.get(fullyEncryptedSample);
                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15248);if (((("cbc1".equals(encryptionAlgo))&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15249)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15250)==0&false))) {{
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15251);int encryptedLength = fullyEncryptedSample.length / 16 * 16;
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15252);channel.write(ByteBuffer.wrap(cipher.doFinal(fullyEncryptedSample, 0, encryptedLength)));
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15253);channel.write(ByteBuffer.wrap(fullyEncryptedSample, encryptedLength, fullyEncryptedSample.length - encryptedLength));
                    } }else {__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15254);if (((("cenc".equals(encryptionAlgo))&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15255)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15256)==0&false))) {{
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15257);channel.write(ByteBuffer.wrap(cipher.doFinal(fullyEncryptedSample)));
                    }
                }}}
                }__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15258);sample.rewind();
            } catch (IllegalBlockSizeException e) {
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15259);throw new RuntimeException(e);
            } catch (BadPaddingException e) {
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15260);throw new RuntimeException(e);
            } catch (ShortBufferException e) {
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15261);throw new RuntimeException(e);
            }

        }finally{__CLR4_5_2bpvbpvlvl9ejxv.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15262);
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15263);return clearSample.getSize();
        }finally{__CLR4_5_2bpvbpvlvl9ejxv.R.flushNeeded();}}

        public ByteBuffer asByteBuffer() {try{__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15264);

            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15265);ByteBuffer sample = (ByteBuffer) clearSample.asByteBuffer().rewind();
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15266);ByteBuffer encSample = ByteBuffer.allocate(sample.limit());

            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15267);CencSampleAuxiliaryDataFormat entry = cencSampleAuxiliaryDataFormat;
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15268);initCipher(cencSampleAuxiliaryDataFormat.iv, cek);
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15269);try {
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15270);if ((((entry.pairs != null)&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15271)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15272)==0&false))) {{
                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15273);for (CencSampleAuxiliaryDataFormat.Pair pair : entry.pairs) {{
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15274);byte[] clears = new byte[pair.clear()];
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15275);sample.get(clears);
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15276);encSample.put(clears);
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15277);if ((((pair.encrypted() > 0)&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15278)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15279)==0&false))) {{
                            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15280);byte[] toBeEncrypted = new byte[l2i(pair.encrypted())];
                            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15281);sample.get(toBeEncrypted);
                            assert ((((toBeEncrypted.length % 16) == 0)&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15282)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15283)==0&false));
                            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15284);byte[] encrypted = cipher.update(toBeEncrypted);
                            assert (((encrypted.length == toBeEncrypted.length)&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15285)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15286)==0&false));
                            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15287);encSample.put(encrypted);
                        }

                    }}
                }} }else {{

                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15288);byte[] fullyEncryptedSample = new byte[sample.limit()];
                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15289);sample.get(fullyEncryptedSample);
                    __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15290);if (((("cbc1".equals(encryptionAlgo))&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15291)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15292)==0&false))) {{
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15293);int encryptedLength = fullyEncryptedSample.length / 16 * 16;
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15294);encSample.put(cipher.doFinal(fullyEncryptedSample, 0, encryptedLength));
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15295);encSample.put(fullyEncryptedSample, encryptedLength, fullyEncryptedSample.length - encryptedLength);
                    } }else {__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15296);if (((("cenc".equals(encryptionAlgo))&&(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15297)!=0|true))||(__CLR4_5_2bpvbpvlvl9ejxv.R.iget(15298)==0&false))) {{
                        __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15299);encSample.put(cipher.doFinal(fullyEncryptedSample));
                    }
                }}}
                }__CLR4_5_2bpvbpvlvl9ejxv.R.inc(15300);sample.rewind();
            } catch (IllegalBlockSizeException e) {
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15301);throw new RuntimeException(e);
            } catch (BadPaddingException e) {
                __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15302);throw new RuntimeException(e);
            }
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15303);encSample.rewind();
            __CLR4_5_2bpvbpvlvl9ejxv.R.inc(15304);return encSample;
        }finally{__CLR4_5_2bpvbpvlvl9ejxv.R.flushNeeded();}}
    }

}
