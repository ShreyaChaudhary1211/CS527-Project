/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.boxes.*;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitHeader;
import com.googlecode.mp4parser.authoring.tracks.h264.H264NalUnitTypes;
import com.googlecode.mp4parser.authoring.tracks.h264.H264TrackImpl;
import com.googlecode.mp4parser.authoring.tracks.h265.H265NalUnitHeader;
import com.googlecode.mp4parser.authoring.tracks.h265.H265NalUnitTypes;
import com.googlecode.mp4parser.authoring.tracks.h265.H265TrackImpl;
import com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import com.mp4parser.iso14496.part15.HevcConfigurationBox;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;

import javax.crypto.SecretKey;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.security.SecureRandom;
import java.util.*;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Encrypts a given track with common encryption.
 */
public class CencEncryptingTrackImpl implements CencEncryptedTrack {public static class __CLR4_5_26zm6zmlvlulhor{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,9277,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String encryptionAlgo;
    Track source;
    Map<UUID, SecretKey> keys = new HashMap<UUID, SecretKey>();
    UUID defaultKeyId;
    List<Sample> samples;
    List<CencSampleAuxiliaryDataFormat> cencSampleAuxiliaryData;
    boolean dummyIvs = false;
    boolean subSampleEncryption = false;
    SampleDescriptionBox stsd = null;

    RangeStartMap<Integer, SecretKey> indexToKey;
    Map<GroupEntry, long[]> sampleGroups;

    Object configurationBox;

    public CencEncryptingTrackImpl(Track source, UUID defaultKeyId, SecretKey key, boolean dummyIvs) {
        this(source, defaultKeyId, Collections.singletonMap(defaultKeyId, key),
                null,
                "cenc", dummyIvs);__CLR4_5_26zm6zmlvlulhor.R.inc(9059);try{__CLR4_5_26zm6zmlvlulhor.R.inc(9058);
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public CencEncryptingTrackImpl(Track source, UUID defaultKeyId, Map<UUID, SecretKey> keys,
                                   Map<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation,
                                   String encryptionAlgo, boolean dummyIvs) {
        this(source, defaultKeyId, keys, keyRotation, encryptionAlgo, dummyIvs, false);__CLR4_5_26zm6zmlvlulhor.R.inc(9061);try{__CLR4_5_26zm6zmlvlulhor.R.inc(9060);

    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    /**
     * Encrypts a given source track.
     *
     * @param source             unencrypted source file
     * @param defaultKeyId       the default key ID - might be null if sample are not encrypted by default
     * @param keys               key ID to key map
     * @param keyRotation        assigns an encryption group to a number of samples
     * @param encryptionAlgo     cenc or cbc1 (don't use cbc1)
     * @param dummyIvs           disables RNG for IVs and use IVs starting with 0x00...000
     * @param encryptButAllClear will cause sub sample encryption format to keep full sample in clear (clear/encrypted pair will be len(sample)/0
     */
    public CencEncryptingTrackImpl(Track source, UUID defaultKeyId, Map<UUID, SecretKey> keys,
                                   Map<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation,
                                   String encryptionAlgo, boolean dummyIvs, boolean encryptButAllClear) {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9062);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9063);this.source = source;
        __CLR4_5_26zm6zmlvlulhor.R.inc(9064);this.keys = keys;
        __CLR4_5_26zm6zmlvlulhor.R.inc(9065);this.defaultKeyId = defaultKeyId;
        __CLR4_5_26zm6zmlvlulhor.R.inc(9066);this.dummyIvs = dummyIvs;
        __CLR4_5_26zm6zmlvlulhor.R.inc(9067);this.encryptionAlgo = encryptionAlgo;
        __CLR4_5_26zm6zmlvlulhor.R.inc(9068);this.sampleGroups = new HashMap<GroupEntry, long[]>();
        __CLR4_5_26zm6zmlvlulhor.R.inc(9069);for (Map.Entry<GroupEntry, long[]> entry : source.getSampleGroups().entrySet()) {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9070);if ((((!(entry.getKey() instanceof CencSampleEncryptionInformationGroupEntry))&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9071)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9072)==0&false))) {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9073);sampleGroups.put(entry.getKey(), entry.getValue());
            }
        }}
        }__CLR4_5_26zm6zmlvlulhor.R.inc(9074);if ((((keyRotation != null)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9075)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9076)==0&false))) {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9077);for (Map.Entry<CencSampleEncryptionInformationGroupEntry, long[]> entry : keyRotation.entrySet()) {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9078);sampleGroups.put(entry.getKey(), entry.getValue());
            }
        }}
        }__CLR4_5_26zm6zmlvlulhor.R.inc(9079);this.sampleGroups = new HashMap<GroupEntry, long[]>(sampleGroups) {
            @Override
            public long[] put(GroupEntry key, long[] value) {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9080);
                __CLR4_5_26zm6zmlvlulhor.R.inc(9081);if ((((key instanceof CencSampleEncryptionInformationGroupEntry)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9082)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9083)==0&false))) {{
                    __CLR4_5_26zm6zmlvlulhor.R.inc(9084);throw new RuntimeException("Please supply CencSampleEncryptionInformationGroupEntries in the constructor");
                }
                }__CLR4_5_26zm6zmlvlulhor.R.inc(9085);return super.put(key, value);
            }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}
        };


        __CLR4_5_26zm6zmlvlulhor.R.inc(9086);this.samples = source.getSamples();
        __CLR4_5_26zm6zmlvlulhor.R.inc(9087);this.cencSampleAuxiliaryData = new ArrayList<CencSampleAuxiliaryDataFormat>();

        __CLR4_5_26zm6zmlvlulhor.R.inc(9088);BigInteger one = new BigInteger("1");
        __CLR4_5_26zm6zmlvlulhor.R.inc(9089);byte[] init = new byte[]{0, 0, 0, 0, 0, 0, 0, 0};

        __CLR4_5_26zm6zmlvlulhor.R.inc(9090);if ((((!dummyIvs)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9091)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9092)==0&false))) {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9093);Random random = new SecureRandom();
            __CLR4_5_26zm6zmlvlulhor.R.inc(9094);random.nextBytes(init);
        }
        }__CLR4_5_26zm6zmlvlulhor.R.inc(9095);BigInteger ivInt = new BigInteger(1, init);

        __CLR4_5_26zm6zmlvlulhor.R.inc(9096);List<CencSampleEncryptionInformationGroupEntry> groupEntries =
                new ArrayList<CencSampleEncryptionInformationGroupEntry>();
        __CLR4_5_26zm6zmlvlulhor.R.inc(9097);if ((((keyRotation != null)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9098)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9099)==0&false))) {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9100);groupEntries.addAll(keyRotation.keySet());
        }
        }__CLR4_5_26zm6zmlvlulhor.R.inc(9101);indexToKey = new RangeStartMap<Integer, SecretKey>();
        __CLR4_5_26zm6zmlvlulhor.R.inc(9102);int lastSampleGroupDescriptionIndex = -1;
        __CLR4_5_26zm6zmlvlulhor.R.inc(9103);for (int i = 0; (((i < source.getSamples().size())&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9104)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9105)==0&false)); i++) {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9106);int index = 0;
            __CLR4_5_26zm6zmlvlulhor.R.inc(9107);for (int j = 0; (((j < groupEntries.size())&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9108)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9109)==0&false)); j++) {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9110);GroupEntry groupEntry = groupEntries.get(j);
                __CLR4_5_26zm6zmlvlulhor.R.inc(9111);long[] sampleNums = getSampleGroups().get(groupEntry);
                __CLR4_5_26zm6zmlvlulhor.R.inc(9112);if ((((Arrays.binarySearch(sampleNums, i) >= 0)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9113)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9114)==0&false))) {{
                    __CLR4_5_26zm6zmlvlulhor.R.inc(9115);index = j + 1;
                }
            }}
            }__CLR4_5_26zm6zmlvlulhor.R.inc(9116);if ((((lastSampleGroupDescriptionIndex != index)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9117)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9118)==0&false))) {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9119);if ((((index == 0)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9120)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9121)==0&false))) {{
                    __CLR4_5_26zm6zmlvlulhor.R.inc(9122);indexToKey.put(i, keys.get(defaultKeyId));
                } }else {{
                    __CLR4_5_26zm6zmlvlulhor.R.inc(9123);if ((((groupEntries.get(index - 1).getKid() != null)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9124)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9125)==0&false))) {{
                        __CLR4_5_26zm6zmlvlulhor.R.inc(9126);SecretKey sk = keys.get(groupEntries.get(index - 1).getKid());
                        __CLR4_5_26zm6zmlvlulhor.R.inc(9127);if ((((sk == null)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9128)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9129)==0&false))) {{
                            __CLR4_5_26zm6zmlvlulhor.R.inc(9130);throw new RuntimeException("Key " + groupEntries.get(index - 1).getKid() + " was not supplied for decryption");
                        }
                        }__CLR4_5_26zm6zmlvlulhor.R.inc(9131);indexToKey.put(i, sk);
                    } }else {{
                        __CLR4_5_26zm6zmlvlulhor.R.inc(9132);indexToKey.put(i, null);
                    }
                }}
                }__CLR4_5_26zm6zmlvlulhor.R.inc(9133);lastSampleGroupDescriptionIndex = index;

            }
        }}


        }__CLR4_5_26zm6zmlvlulhor.R.inc(9134);List<Box> boxes = source.getSampleDescriptionBox().getSampleEntry().getBoxes();
        __CLR4_5_26zm6zmlvlulhor.R.inc(9135);int nalLengthSize = -1;
        __CLR4_5_26zm6zmlvlulhor.R.inc(9136);for (Box box : boxes) {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9137);if ((((box instanceof AvcConfigurationBox)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9138)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9139)==0&false))) {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9140);AvcConfigurationBox avcC = (AvcConfigurationBox) (configurationBox = box);
                __CLR4_5_26zm6zmlvlulhor.R.inc(9141);subSampleEncryption = true;
                __CLR4_5_26zm6zmlvlulhor.R.inc(9142);nalLengthSize = avcC.getLengthSizeMinusOne() + 1;
            }
            }__CLR4_5_26zm6zmlvlulhor.R.inc(9143);if ((((box instanceof HevcConfigurationBox)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9144)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9145)==0&false))) {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9146);HevcConfigurationBox hvcC = (HevcConfigurationBox) (configurationBox = box);
                __CLR4_5_26zm6zmlvlulhor.R.inc(9147);subSampleEncryption = true;
                __CLR4_5_26zm6zmlvlulhor.R.inc(9148);nalLengthSize = hvcC.getLengthSizeMinusOne() + 1;
            }
        }}


        }__CLR4_5_26zm6zmlvlulhor.R.inc(9149);for (int i = 0; (((i < samples.size())&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9150)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9151)==0&false)); i++) {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9152);Sample origSample = samples.get(i);
            __CLR4_5_26zm6zmlvlulhor.R.inc(9153);CencSampleAuxiliaryDataFormat e = new CencSampleAuxiliaryDataFormat();
            __CLR4_5_26zm6zmlvlulhor.R.inc(9154);this.cencSampleAuxiliaryData.add(e);
            __CLR4_5_26zm6zmlvlulhor.R.inc(9155);if ((((indexToKey.get(i) != null)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9156)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9157)==0&false))) {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9158);byte[] iv = ivInt.toByteArray();
                __CLR4_5_26zm6zmlvlulhor.R.inc(9159);byte[] eightByteIv = new byte[]{0, 0, 0, 0, 0, 0, 0, 0};
                __CLR4_5_26zm6zmlvlulhor.R.inc(9160);System.arraycopy(
                        iv,
                        (((iv.length - 8 > 0 )&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9161)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9162)==0&false))? iv.length - 8 : 0,
                        eightByteIv,
                        ((((8 - iv.length) < 0 )&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9163)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9164)==0&false))? 0 : (8 - iv.length),
                        (((iv.length > 8 )&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9165)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9166)==0&false))? 8 : iv.length);

                __CLR4_5_26zm6zmlvlulhor.R.inc(9167);e.iv = eightByteIv;

                __CLR4_5_26zm6zmlvlulhor.R.inc(9168);ByteBuffer sample = (ByteBuffer) origSample.asByteBuffer().rewind();


                __CLR4_5_26zm6zmlvlulhor.R.inc(9169);if ((((subSampleEncryption)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9170)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9171)==0&false))) {{
                    __CLR4_5_26zm6zmlvlulhor.R.inc(9172);if ((((encryptButAllClear)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9173)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9174)==0&false))) {{
                        __CLR4_5_26zm6zmlvlulhor.R.inc(9175);e.pairs = new CencSampleAuxiliaryDataFormat.Pair[]{e.createPair(sample.remaining(), 0)};
                    } }else {{
                        __CLR4_5_26zm6zmlvlulhor.R.inc(9176);List<CencSampleAuxiliaryDataFormat.Pair> pairs = new ArrayList<CencSampleAuxiliaryDataFormat.Pair>(5);
                        __CLR4_5_26zm6zmlvlulhor.R.inc(9177);while ((((sample.remaining() > 0)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9178)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9179)==0&false))) {{
                            __CLR4_5_26zm6zmlvlulhor.R.inc(9180);int nalLength = l2i(IsoTypeReaderVariable.read(sample, nalLengthSize));
                            __CLR4_5_26zm6zmlvlulhor.R.inc(9181);int clearBytes;
                            __CLR4_5_26zm6zmlvlulhor.R.inc(9182);int nalGrossSize = nalLength + nalLengthSize;
                            __CLR4_5_26zm6zmlvlulhor.R.inc(9183);if ((((nalGrossSize < 112 || isClearNal(sample.duplicate()))&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9184)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9185)==0&false))) {{
                                __CLR4_5_26zm6zmlvlulhor.R.inc(9186);clearBytes = nalGrossSize;
                            } }else {{
                                __CLR4_5_26zm6zmlvlulhor.R.inc(9187);clearBytes = 96 + nalGrossSize % 16;
                            }
                            }__CLR4_5_26zm6zmlvlulhor.R.inc(9188);pairs.add(e.createPair(clearBytes, nalGrossSize - clearBytes));
                            __CLR4_5_26zm6zmlvlulhor.R.inc(9189);sample.position(sample.position() + nalLength);
                        }
                        }__CLR4_5_26zm6zmlvlulhor.R.inc(9190);e.pairs = pairs.toArray(new CencSampleAuxiliaryDataFormat.Pair[pairs.size()]);
                    }
                }}

                }__CLR4_5_26zm6zmlvlulhor.R.inc(9191);ivInt = ivInt.add(one);
            }
        }}
    }}finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public UUID getDefaultKeyId() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9192);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9193);return defaultKeyId;
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public boolean hasSubSampleEncryption() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9194);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9195);return subSampleEncryption;
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public List<CencSampleAuxiliaryDataFormat> getSampleEncryptionEntries() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9196);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9197);return cencSampleAuxiliaryData;
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public synchronized SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9198);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9199);if ((((stsd == null)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9200)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9201)==0&false))) {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9202);ByteArrayOutputStream baos = new ByteArrayOutputStream();
            __CLR4_5_26zm6zmlvlulhor.R.inc(9203);try {
                __CLR4_5_26zm6zmlvlulhor.R.inc(9204);source.getSampleDescriptionBox().getBox(Channels.newChannel(baos));
                __CLR4_5_26zm6zmlvlulhor.R.inc(9205);stsd = (SampleDescriptionBox) new IsoFile(new MemoryDataSourceImpl(baos.toByteArray())).getBoxes().get(0);
            } catch (IOException e) {
                __CLR4_5_26zm6zmlvlulhor.R.inc(9206);throw new RuntimeException("Dumping stsd to memory failed");
            }
            // stsd is now a copy of the original stsd. Not very efficient but we don't have to do that a hundred times ...

            __CLR4_5_26zm6zmlvlulhor.R.inc(9207);OriginalFormatBox originalFormatBox = new OriginalFormatBox();
            __CLR4_5_26zm6zmlvlulhor.R.inc(9208);originalFormatBox.setDataFormat(stsd.getSampleEntry().getType());

            __CLR4_5_26zm6zmlvlulhor.R.inc(9209);if ((((stsd.getSampleEntry() instanceof AudioSampleEntry)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9210)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9211)==0&false))) {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9212);((AudioSampleEntry) stsd.getSampleEntry()).setType("enca");
            } }else {__CLR4_5_26zm6zmlvlulhor.R.inc(9213);if ((((stsd.getSampleEntry() instanceof VisualSampleEntry)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9214)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9215)==0&false))) {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9216);((VisualSampleEntry) stsd.getSampleEntry()).setType("encv");
            } }else {{
                __CLR4_5_26zm6zmlvlulhor.R.inc(9217);throw new RuntimeException("I don't know how to cenc " + stsd.getSampleEntry().getType());
            }
            }}__CLR4_5_26zm6zmlvlulhor.R.inc(9218);ProtectionSchemeInformationBox sinf = new ProtectionSchemeInformationBox();
            __CLR4_5_26zm6zmlvlulhor.R.inc(9219);sinf.addBox(originalFormatBox);

            __CLR4_5_26zm6zmlvlulhor.R.inc(9220);SchemeTypeBox schm = new SchemeTypeBox();
            __CLR4_5_26zm6zmlvlulhor.R.inc(9221);schm.setSchemeType(encryptionAlgo);
            __CLR4_5_26zm6zmlvlulhor.R.inc(9222);schm.setSchemeVersion(0x00010000);
            __CLR4_5_26zm6zmlvlulhor.R.inc(9223);sinf.addBox(schm);

            __CLR4_5_26zm6zmlvlulhor.R.inc(9224);SchemeInformationBox schi = new SchemeInformationBox();
            __CLR4_5_26zm6zmlvlulhor.R.inc(9225);TrackEncryptionBox trackEncryptionBox = new TrackEncryptionBox();
            __CLR4_5_26zm6zmlvlulhor.R.inc(9226);trackEncryptionBox.setDefaultIvSize((((defaultKeyId == null )&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9227)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9228)==0&false))? 0 : 8);
            __CLR4_5_26zm6zmlvlulhor.R.inc(9229);trackEncryptionBox.setDefaultAlgorithmId((((defaultKeyId == null )&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9230)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9231)==0&false))? 0x0 : 0x01);
            __CLR4_5_26zm6zmlvlulhor.R.inc(9232);trackEncryptionBox.setDefault_KID((((defaultKeyId == null )&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9233)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9234)==0&false))? new UUID(0, 0) : defaultKeyId);
            __CLR4_5_26zm6zmlvlulhor.R.inc(9235);schi.addBox(trackEncryptionBox);

            __CLR4_5_26zm6zmlvlulhor.R.inc(9236);sinf.addBox(schi);
            __CLR4_5_26zm6zmlvlulhor.R.inc(9237);stsd.getSampleEntry().addBox(sinf);
        }
        }__CLR4_5_26zm6zmlvlulhor.R.inc(9238);return stsd;

    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9239);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9240);return source.getSampleDurations();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9241);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9242);return source.getDuration();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9243);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9244);return source.getCompositionTimeEntries();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9245);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9246);return source.getSyncSamples();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9247);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9248);return source.getSampleDependencies();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9249);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9250);return source.getTrackMetaData();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9251);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9252);return source.getHandler();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9253);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9254);return new CencEncryptingSampleList(indexToKey, source.getSamples(), cencSampleAuxiliaryData, encryptionAlgo);
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9255);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9256);return source.getSubsampleInformationBox();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9257);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9258);source.close();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9259);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9260);return "enc(" + source.getName() + ")";
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public List<Edit> getEdits() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9261);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9262);return source.getEdits();
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public Map<GroupEntry, long[]> getSampleGroups() {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9263);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9264);return sampleGroups;
    }finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}

    public boolean isClearNal(ByteBuffer s) {try{__CLR4_5_26zm6zmlvlulhor.R.inc(9265);
        __CLR4_5_26zm6zmlvlulhor.R.inc(9266);if ((((configurationBox instanceof HevcConfigurationBox)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9267)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9268)==0&false))) {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9269);H265NalUnitHeader nuh = H265TrackImpl.getNalUnitHeader(s.slice());
            __CLR4_5_26zm6zmlvlulhor.R.inc(9270);return !( // These ranges are all slices --> NOT CLEAR
                    (nuh.nalUnitType >= H265NalUnitTypes.NAL_TYPE_TRAIL_N && (nuh.nalUnitType <= H265NalUnitTypes.NAL_TYPE_RASL_R)) ||
                    (nuh.nalUnitType >= H265NalUnitTypes.NAL_TYPE_BLA_W_LP && (nuh.nalUnitType <= H265NalUnitTypes.NAL_TYPE_CRA_NUT)) ||
                    (nuh.nalUnitType >= H265NalUnitTypes.NAL_TYPE_BLA_W_LP && (nuh.nalUnitType <= H265NalUnitTypes.NAL_TYPE_CRA_NUT))
                    );
        } }else {__CLR4_5_26zm6zmlvlulhor.R.inc(9271);if ((((configurationBox instanceof AvcConfigurationBox)&&(__CLR4_5_26zm6zmlvlulhor.R.iget(9272)!=0|true))||(__CLR4_5_26zm6zmlvlulhor.R.iget(9273)==0&false))) {{
            // only encrypt
            __CLR4_5_26zm6zmlvlulhor.R.inc(9274);H264NalUnitHeader nuh = H264TrackImpl.getNalUnitHeader(s.slice());
            __CLR4_5_26zm6zmlvlulhor.R.inc(9275);return !(nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_AUX_PIC ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_DATA_PART_A ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_DATA_PART_B ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_DATA_PART_C ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_EXT ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_IDR ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_NON_IDR
            );

        } }else {{
            __CLR4_5_26zm6zmlvlulhor.R.inc(9276);throw new RuntimeException("Subsample encryption is activated but the CencEncryptingTrackImpl can't say if this sample is to be encrypted or not!");
    }
}}}finally{__CLR4_5_26zm6zmlvlulhor.R.flushNeeded();}}


}
