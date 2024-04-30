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

public class CencEncryptingSampleList extends AbstractList<Sample> {public static class __CLR4_5_2bsibsilvlulkd1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,15400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String encryptionAlgo;
    Cipher cipher;
    List<CencSampleAuxiliaryDataFormat> auxiliaryDataFormats;
    RangeStartMap<Integer, SecretKey> ceks = new RangeStartMap<Integer, SecretKey>();
    List<Sample> parent;

    public CencEncryptingSampleList(
            SecretKey defaultCek,
            List<Sample> parent,
            List<CencSampleAuxiliaryDataFormat> auxiliaryDataFormats) {
        this(new RangeStartMap<Integer, SecretKey>(0, defaultCek), parent, auxiliaryDataFormats, "cenc");__CLR4_5_2bsibsilvlulkd1.R.inc(15283);try{__CLR4_5_2bsibsilvlulkd1.R.inc(15282);
    }finally{__CLR4_5_2bsibsilvlulkd1.R.flushNeeded();}}

    public CencEncryptingSampleList(
            RangeStartMap<Integer, SecretKey> ceks,
            List<Sample> parent,
            List<CencSampleAuxiliaryDataFormat> auxiliaryDataFormats,
            String encryptionAlgo) {try{__CLR4_5_2bsibsilvlulkd1.R.inc(15284);
        __CLR4_5_2bsibsilvlulkd1.R.inc(15285);this.auxiliaryDataFormats = auxiliaryDataFormats;
        __CLR4_5_2bsibsilvlulkd1.R.inc(15286);this.ceks = ceks;
        __CLR4_5_2bsibsilvlulkd1.R.inc(15287);this.encryptionAlgo = encryptionAlgo;
        __CLR4_5_2bsibsilvlulkd1.R.inc(15288);this.parent = parent;
        __CLR4_5_2bsibsilvlulkd1.R.inc(15289);try {
            __CLR4_5_2bsibsilvlulkd1.R.inc(15290);if (((("cenc".equals(encryptionAlgo))&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15291)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15292)==0&false))) {{
                __CLR4_5_2bsibsilvlulkd1.R.inc(15293);this.cipher = Cipher.getInstance("AES/CTR/NoPadding");
            } }else {__CLR4_5_2bsibsilvlulkd1.R.inc(15294);if (((("cbc1".equals(encryptionAlgo))&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15295)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15296)==0&false))) {{
                __CLR4_5_2bsibsilvlulkd1.R.inc(15297);this.cipher = Cipher.getInstance("AES/CBC/NoPadding");
            } }else {{
                __CLR4_5_2bsibsilvlulkd1.R.inc(15298);throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
            }
        }}} catch (NoSuchAlgorithmException e) {
            __CLR4_5_2bsibsilvlulkd1.R.inc(15299);throw new RuntimeException(e);
        } catch (NoSuchPaddingException e) {
            __CLR4_5_2bsibsilvlulkd1.R.inc(15300);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_2bsibsilvlulkd1.R.flushNeeded();}}

    @Override
    public Sample get(int index) {try{__CLR4_5_2bsibsilvlulkd1.R.inc(15301);
        __CLR4_5_2bsibsilvlulkd1.R.inc(15302);Sample clearSample = parent.get(index);
        __CLR4_5_2bsibsilvlulkd1.R.inc(15303);if ((((ceks.get(index) != null)&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15304)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15305)==0&false))) {{
            __CLR4_5_2bsibsilvlulkd1.R.inc(15306);CencSampleAuxiliaryDataFormat entry = auxiliaryDataFormats.get(index);
            __CLR4_5_2bsibsilvlulkd1.R.inc(15307);return new EncryptedSampleImpl(clearSample, entry, cipher, ceks.get(index));
        } }else {{
            __CLR4_5_2bsibsilvlulkd1.R.inc(15308);return clearSample;
        }

    }}finally{__CLR4_5_2bsibsilvlulkd1.R.flushNeeded();}}

    protected void initCipher(byte[] iv, SecretKey cek) {try{__CLR4_5_2bsibsilvlulkd1.R.inc(15309);
        __CLR4_5_2bsibsilvlulkd1.R.inc(15310);try {
            __CLR4_5_2bsibsilvlulkd1.R.inc(15311);byte[] fullIv = new byte[16];
            __CLR4_5_2bsibsilvlulkd1.R.inc(15312);System.arraycopy(iv, 0, fullIv, 0, iv.length);
            // The IV
            __CLR4_5_2bsibsilvlulkd1.R.inc(15313);cipher.init(Cipher.ENCRYPT_MODE, cek, new IvParameterSpec(fullIv));
        } catch (InvalidAlgorithmParameterException e) {
            __CLR4_5_2bsibsilvlulkd1.R.inc(15314);throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            __CLR4_5_2bsibsilvlulkd1.R.inc(15315);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_2bsibsilvlulkd1.R.flushNeeded();}}

    @Override
    public int size() {try{__CLR4_5_2bsibsilvlulkd1.R.inc(15316);
        __CLR4_5_2bsibsilvlulkd1.R.inc(15317);return parent.size();
    }finally{__CLR4_5_2bsibsilvlulkd1.R.flushNeeded();}}

    private class EncryptedSampleImpl implements Sample {

        private final Sample clearSample;
        private final CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat;
        private final Cipher cipher;
        private final SecretKey cek;

        private EncryptedSampleImpl(
                Sample clearSample,
                CencSampleAuxiliaryDataFormat cencSampleAuxiliaryDataFormat,
                Cipher cipher,
                SecretKey cek) {try{__CLR4_5_2bsibsilvlulkd1.R.inc(15318);

            __CLR4_5_2bsibsilvlulkd1.R.inc(15319);this.clearSample = clearSample;
            __CLR4_5_2bsibsilvlulkd1.R.inc(15320);this.cencSampleAuxiliaryDataFormat = cencSampleAuxiliaryDataFormat;
            __CLR4_5_2bsibsilvlulkd1.R.inc(15321);this.cipher = cipher;
            __CLR4_5_2bsibsilvlulkd1.R.inc(15322);this.cek = cek;
        }finally{__CLR4_5_2bsibsilvlulkd1.R.flushNeeded();}}

        public void writeTo(WritableByteChannel channel) throws IOException {try{__CLR4_5_2bsibsilvlulkd1.R.inc(15323);
            __CLR4_5_2bsibsilvlulkd1.R.inc(15324);ByteBuffer sample = (ByteBuffer) clearSample.asByteBuffer().rewind();
            __CLR4_5_2bsibsilvlulkd1.R.inc(15325);initCipher(cencSampleAuxiliaryDataFormat.iv, cek);
            __CLR4_5_2bsibsilvlulkd1.R.inc(15326);try {
                __CLR4_5_2bsibsilvlulkd1.R.inc(15327);if ((((cencSampleAuxiliaryDataFormat.pairs != null && cencSampleAuxiliaryDataFormat.pairs.length > 0)&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15328)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15329)==0&false))) {{
                    __CLR4_5_2bsibsilvlulkd1.R.inc(15330);byte[] fullSample = new byte[sample.limit()];
                    __CLR4_5_2bsibsilvlulkd1.R.inc(15331);sample.get(fullSample);
                    __CLR4_5_2bsibsilvlulkd1.R.inc(15332);int offset = 0;

                    __CLR4_5_2bsibsilvlulkd1.R.inc(15333);for (CencSampleAuxiliaryDataFormat.Pair pair : cencSampleAuxiliaryDataFormat.pairs) {{
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15334);offset += pair.clear();
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15335);if ((((pair.encrypted() > 0)&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15336)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15337)==0&false))) {{
                            __CLR4_5_2bsibsilvlulkd1.R.inc(15338);cipher.update(fullSample,
                                    offset,
                                    l2i(pair.encrypted()),
                                    fullSample,
                                    offset);
                            __CLR4_5_2bsibsilvlulkd1.R.inc(15339);offset += pair.encrypted();
                        }
                    }}
                    }__CLR4_5_2bsibsilvlulkd1.R.inc(15340);channel.write(ByteBuffer.wrap(fullSample));
                } }else {{
                    __CLR4_5_2bsibsilvlulkd1.R.inc(15341);byte[] fullyEncryptedSample = new byte[sample.limit()];
                    __CLR4_5_2bsibsilvlulkd1.R.inc(15342);sample.get(fullyEncryptedSample);
                    __CLR4_5_2bsibsilvlulkd1.R.inc(15343);if (((("cbc1".equals(encryptionAlgo))&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15344)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15345)==0&false))) {{
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15346);int encryptedLength = fullyEncryptedSample.length / 16 * 16;
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15347);channel.write(ByteBuffer.wrap(cipher.doFinal(fullyEncryptedSample, 0, encryptedLength)));
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15348);channel.write(ByteBuffer.wrap(fullyEncryptedSample, encryptedLength, fullyEncryptedSample.length - encryptedLength));
                    } }else {__CLR4_5_2bsibsilvlulkd1.R.inc(15349);if (((("cenc".equals(encryptionAlgo))&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15350)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15351)==0&false))) {{
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15352);channel.write(ByteBuffer.wrap(cipher.doFinal(fullyEncryptedSample)));
                    }
                }}}
                }__CLR4_5_2bsibsilvlulkd1.R.inc(15353);sample.rewind();
            } catch (IllegalBlockSizeException e) {
                __CLR4_5_2bsibsilvlulkd1.R.inc(15354);throw new RuntimeException(e);
            } catch (BadPaddingException e) {
                __CLR4_5_2bsibsilvlulkd1.R.inc(15355);throw new RuntimeException(e);
            } catch (ShortBufferException e) {
                __CLR4_5_2bsibsilvlulkd1.R.inc(15356);throw new RuntimeException(e);
            }

        }finally{__CLR4_5_2bsibsilvlulkd1.R.flushNeeded();}}

        public long getSize() {try{__CLR4_5_2bsibsilvlulkd1.R.inc(15357);
            __CLR4_5_2bsibsilvlulkd1.R.inc(15358);return clearSample.getSize();
        }finally{__CLR4_5_2bsibsilvlulkd1.R.flushNeeded();}}

        public ByteBuffer asByteBuffer() {try{__CLR4_5_2bsibsilvlulkd1.R.inc(15359);

            __CLR4_5_2bsibsilvlulkd1.R.inc(15360);ByteBuffer sample = (ByteBuffer) clearSample.asByteBuffer().rewind();
            __CLR4_5_2bsibsilvlulkd1.R.inc(15361);ByteBuffer encSample = ByteBuffer.allocate(sample.limit());

            __CLR4_5_2bsibsilvlulkd1.R.inc(15362);CencSampleAuxiliaryDataFormat entry = cencSampleAuxiliaryDataFormat;
            __CLR4_5_2bsibsilvlulkd1.R.inc(15363);initCipher(cencSampleAuxiliaryDataFormat.iv, cek);
            __CLR4_5_2bsibsilvlulkd1.R.inc(15364);try {
                __CLR4_5_2bsibsilvlulkd1.R.inc(15365);if ((((entry.pairs != null)&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15366)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15367)==0&false))) {{
                    __CLR4_5_2bsibsilvlulkd1.R.inc(15368);for (CencSampleAuxiliaryDataFormat.Pair pair : entry.pairs) {{
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15369);byte[] clears = new byte[pair.clear()];
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15370);sample.get(clears);
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15371);encSample.put(clears);
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15372);if ((((pair.encrypted() > 0)&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15373)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15374)==0&false))) {{
                            __CLR4_5_2bsibsilvlulkd1.R.inc(15375);byte[] toBeEncrypted = new byte[l2i(pair.encrypted())];
                            __CLR4_5_2bsibsilvlulkd1.R.inc(15376);sample.get(toBeEncrypted);
                            assert ((((toBeEncrypted.length % 16) == 0)&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15377)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15378)==0&false));
                            __CLR4_5_2bsibsilvlulkd1.R.inc(15379);byte[] encrypted = cipher.update(toBeEncrypted);
                            assert (((encrypted.length == toBeEncrypted.length)&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15380)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15381)==0&false));
                            __CLR4_5_2bsibsilvlulkd1.R.inc(15382);encSample.put(encrypted);
                        }

                    }}
                }} }else {{

                    __CLR4_5_2bsibsilvlulkd1.R.inc(15383);byte[] fullyEncryptedSample = new byte[sample.limit()];
                    __CLR4_5_2bsibsilvlulkd1.R.inc(15384);sample.get(fullyEncryptedSample);
                    __CLR4_5_2bsibsilvlulkd1.R.inc(15385);if (((("cbc1".equals(encryptionAlgo))&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15386)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15387)==0&false))) {{
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15388);int encryptedLength = fullyEncryptedSample.length / 16 * 16;
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15389);encSample.put(cipher.doFinal(fullyEncryptedSample, 0, encryptedLength));
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15390);encSample.put(fullyEncryptedSample, encryptedLength, fullyEncryptedSample.length - encryptedLength);
                    } }else {__CLR4_5_2bsibsilvlulkd1.R.inc(15391);if (((("cenc".equals(encryptionAlgo))&&(__CLR4_5_2bsibsilvlulkd1.R.iget(15392)!=0|true))||(__CLR4_5_2bsibsilvlulkd1.R.iget(15393)==0&false))) {{
                        __CLR4_5_2bsibsilvlulkd1.R.inc(15394);encSample.put(cipher.doFinal(fullyEncryptedSample));
                    }
                }}}
                }__CLR4_5_2bsibsilvlulkd1.R.inc(15395);sample.rewind();
            } catch (IllegalBlockSizeException e) {
                __CLR4_5_2bsibsilvlulkd1.R.inc(15396);throw new RuntimeException(e);
            } catch (BadPaddingException e) {
                __CLR4_5_2bsibsilvlulkd1.R.inc(15397);throw new RuntimeException(e);
            }
            __CLR4_5_2bsibsilvlulkd1.R.inc(15398);encSample.rewind();
            __CLR4_5_2bsibsilvlulkd1.R.inc(15399);return encSample;
        }finally{__CLR4_5_2bsibsilvlulkd1.R.flushNeeded();}}
    }

}
