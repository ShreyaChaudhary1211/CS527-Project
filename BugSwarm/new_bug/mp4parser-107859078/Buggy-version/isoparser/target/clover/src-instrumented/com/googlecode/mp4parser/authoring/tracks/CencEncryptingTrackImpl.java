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
public class CencEncryptingTrackImpl implements CencEncryptedTrack {public static class __CLR4_5_26wz6wzlvl9ei7v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,9182,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
                "cenc", dummyIvs);__CLR4_5_26wz6wzlvl9ei7v.R.inc(8964);try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(8963);
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public CencEncryptingTrackImpl(Track source, UUID defaultKeyId, Map<UUID, SecretKey> keys,
                                   Map<CencSampleEncryptionInformationGroupEntry, long[]> keyRotation,
                                   String encryptionAlgo, boolean dummyIvs) {
        this(source, defaultKeyId, keys, keyRotation, encryptionAlgo, dummyIvs, false);__CLR4_5_26wz6wzlvl9ei7v.R.inc(8966);try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(8965);

    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

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
                                   String encryptionAlgo, boolean dummyIvs, boolean encryptButAllClear) {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(8967);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8968);this.source = source;
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8969);this.keys = keys;
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8970);this.defaultKeyId = defaultKeyId;
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8971);this.dummyIvs = dummyIvs;
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8972);this.encryptionAlgo = encryptionAlgo;
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8973);this.sampleGroups = new HashMap<GroupEntry, long[]>();
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8974);for (Map.Entry<GroupEntry, long[]> entry : source.getSampleGroups().entrySet()) {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(8975);if ((((!(entry.getKey() instanceof CencSampleEncryptionInformationGroupEntry))&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(8976)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(8977)==0&false))) {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(8978);sampleGroups.put(entry.getKey(), entry.getValue());
            }
        }}
        }__CLR4_5_26wz6wzlvl9ei7v.R.inc(8979);if ((((keyRotation != null)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(8980)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(8981)==0&false))) {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(8982);for (Map.Entry<CencSampleEncryptionInformationGroupEntry, long[]> entry : keyRotation.entrySet()) {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(8983);sampleGroups.put(entry.getKey(), entry.getValue());
            }
        }}
        }__CLR4_5_26wz6wzlvl9ei7v.R.inc(8984);this.sampleGroups = new HashMap<GroupEntry, long[]>(sampleGroups) {
            @Override
            public long[] put(GroupEntry key, long[] value) {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(8985);
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(8986);if ((((key instanceof CencSampleEncryptionInformationGroupEntry)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(8987)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(8988)==0&false))) {{
                    __CLR4_5_26wz6wzlvl9ei7v.R.inc(8989);throw new RuntimeException("Please supply CencSampleEncryptionInformationGroupEntries in the constructor");
                }
                }__CLR4_5_26wz6wzlvl9ei7v.R.inc(8990);return super.put(key, value);
            }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}
        };


        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8991);this.samples = source.getSamples();
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8992);this.cencSampleAuxiliaryData = new ArrayList<CencSampleAuxiliaryDataFormat>();

        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8993);BigInteger one = new BigInteger("1");
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8994);byte[] init = new byte[]{0, 0, 0, 0, 0, 0, 0, 0};

        __CLR4_5_26wz6wzlvl9ei7v.R.inc(8995);if ((((!dummyIvs)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(8996)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(8997)==0&false))) {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(8998);Random random = new SecureRandom();
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(8999);random.nextBytes(init);
        }
        }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9000);BigInteger ivInt = new BigInteger(1, init);

        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9001);List<CencSampleEncryptionInformationGroupEntry> groupEntries =
                new ArrayList<CencSampleEncryptionInformationGroupEntry>();
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9002);if ((((keyRotation != null)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9003)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9004)==0&false))) {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9005);groupEntries.addAll(keyRotation.keySet());
        }
        }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9006);indexToKey = new RangeStartMap<Integer, SecretKey>();
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9007);int lastSampleGroupDescriptionIndex = -1;
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9008);for (int i = 0; (((i < source.getSamples().size())&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9009)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9010)==0&false)); i++) {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9011);int index = 0;
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9012);for (int j = 0; (((j < groupEntries.size())&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9013)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9014)==0&false)); j++) {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9015);GroupEntry groupEntry = groupEntries.get(j);
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9016);long[] sampleNums = getSampleGroups().get(groupEntry);
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9017);if ((((Arrays.binarySearch(sampleNums, i) >= 0)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9018)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9019)==0&false))) {{
                    __CLR4_5_26wz6wzlvl9ei7v.R.inc(9020);index = j + 1;
                }
            }}
            }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9021);if ((((lastSampleGroupDescriptionIndex != index)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9022)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9023)==0&false))) {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9024);if ((((index == 0)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9025)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9026)==0&false))) {{
                    __CLR4_5_26wz6wzlvl9ei7v.R.inc(9027);indexToKey.put(i, keys.get(defaultKeyId));
                } }else {{
                    __CLR4_5_26wz6wzlvl9ei7v.R.inc(9028);if ((((groupEntries.get(index - 1).getKid() != null)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9029)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9030)==0&false))) {{
                        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9031);SecretKey sk = keys.get(groupEntries.get(index - 1).getKid());
                        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9032);if ((((sk == null)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9033)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9034)==0&false))) {{
                            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9035);throw new RuntimeException("Key " + groupEntries.get(index - 1).getKid() + " was not supplied for decryption");
                        }
                        }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9036);indexToKey.put(i, sk);
                    } }else {{
                        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9037);indexToKey.put(i, null);
                    }
                }}
                }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9038);lastSampleGroupDescriptionIndex = index;

            }
        }}


        }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9039);List<Box> boxes = source.getSampleDescriptionBox().getSampleEntry().getBoxes();
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9040);int nalLengthSize = -1;
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9041);for (Box box : boxes) {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9042);if ((((box instanceof AvcConfigurationBox)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9043)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9044)==0&false))) {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9045);AvcConfigurationBox avcC = (AvcConfigurationBox) (configurationBox = box);
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9046);subSampleEncryption = true;
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9047);nalLengthSize = avcC.getLengthSizeMinusOne() + 1;
            }
            }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9048);if ((((box instanceof HevcConfigurationBox)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9049)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9050)==0&false))) {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9051);HevcConfigurationBox hvcC = (HevcConfigurationBox) (configurationBox = box);
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9052);subSampleEncryption = true;
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9053);nalLengthSize = hvcC.getLengthSizeMinusOne() + 1;
            }
        }}


        }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9054);for (int i = 0; (((i < samples.size())&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9055)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9056)==0&false)); i++) {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9057);Sample origSample = samples.get(i);
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9058);CencSampleAuxiliaryDataFormat e = new CencSampleAuxiliaryDataFormat();
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9059);this.cencSampleAuxiliaryData.add(e);
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9060);if ((((indexToKey.get(i) != null)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9061)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9062)==0&false))) {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9063);byte[] iv = ivInt.toByteArray();
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9064);byte[] eightByteIv = new byte[]{0, 0, 0, 0, 0, 0, 0, 0};
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9065);System.arraycopy(
                        iv,
                        (((iv.length - 8 > 0 )&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9066)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9067)==0&false))? iv.length - 8 : 0,
                        eightByteIv,
                        ((((8 - iv.length) < 0 )&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9068)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9069)==0&false))? 0 : (8 - iv.length),
                        (((iv.length > 8 )&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9070)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9071)==0&false))? 8 : iv.length);

                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9072);e.iv = eightByteIv;

                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9073);ByteBuffer sample = (ByteBuffer) origSample.asByteBuffer().rewind();


                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9074);if ((((subSampleEncryption)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9075)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9076)==0&false))) {{
                    __CLR4_5_26wz6wzlvl9ei7v.R.inc(9077);if ((((encryptButAllClear)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9078)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9079)==0&false))) {{
                        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9080);e.pairs = new CencSampleAuxiliaryDataFormat.Pair[]{e.createPair(sample.remaining(), 0)};
                    } }else {{
                        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9081);List<CencSampleAuxiliaryDataFormat.Pair> pairs = new ArrayList<CencSampleAuxiliaryDataFormat.Pair>(5);
                        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9082);while ((((sample.remaining() > 0)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9083)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9084)==0&false))) {{
                            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9085);int nalLength = l2i(IsoTypeReaderVariable.read(sample, nalLengthSize));
                            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9086);int clearBytes;
                            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9087);int nalGrossSize = nalLength + nalLengthSize;
                            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9088);if ((((nalGrossSize < 112 || isClearNal(sample.duplicate()))&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9089)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9090)==0&false))) {{
                                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9091);clearBytes = nalGrossSize;
                            } }else {{
                                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9092);clearBytes = 96 + nalGrossSize % 16;
                            }
                            }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9093);pairs.add(e.createPair(clearBytes, nalGrossSize - clearBytes));
                            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9094);sample.position(sample.position() + nalLength);
                        }
                        }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9095);e.pairs = pairs.toArray(new CencSampleAuxiliaryDataFormat.Pair[pairs.size()]);
                    }
                }}

                }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9096);ivInt = ivInt.add(one);
            }
        }}
    }}finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public UUID getDefaultKeyId() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9097);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9098);return defaultKeyId;
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public boolean hasSubSampleEncryption() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9099);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9100);return subSampleEncryption;
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public List<CencSampleAuxiliaryDataFormat> getSampleEncryptionEntries() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9101);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9102);return cencSampleAuxiliaryData;
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public synchronized SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9103);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9104);if ((((stsd == null)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9105)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9106)==0&false))) {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9107);ByteArrayOutputStream baos = new ByteArrayOutputStream();
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9108);try {
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9109);source.getSampleDescriptionBox().getBox(Channels.newChannel(baos));
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9110);stsd = (SampleDescriptionBox) new IsoFile(new MemoryDataSourceImpl(baos.toByteArray())).getBoxes().get(0);
            } catch (IOException e) {
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9111);throw new RuntimeException("Dumping stsd to memory failed");
            }
            // stsd is now a copy of the original stsd. Not very efficient but we don't have to do that a hundred times ...

            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9112);OriginalFormatBox originalFormatBox = new OriginalFormatBox();
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9113);originalFormatBox.setDataFormat(stsd.getSampleEntry().getType());

            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9114);if ((((stsd.getSampleEntry() instanceof AudioSampleEntry)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9115)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9116)==0&false))) {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9117);((AudioSampleEntry) stsd.getSampleEntry()).setType("enca");
            } }else {__CLR4_5_26wz6wzlvl9ei7v.R.inc(9118);if ((((stsd.getSampleEntry() instanceof VisualSampleEntry)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9119)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9120)==0&false))) {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9121);((VisualSampleEntry) stsd.getSampleEntry()).setType("encv");
            } }else {{
                __CLR4_5_26wz6wzlvl9ei7v.R.inc(9122);throw new RuntimeException("I don't know how to cenc " + stsd.getSampleEntry().getType());
            }
            }}__CLR4_5_26wz6wzlvl9ei7v.R.inc(9123);ProtectionSchemeInformationBox sinf = new ProtectionSchemeInformationBox();
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9124);sinf.addBox(originalFormatBox);

            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9125);SchemeTypeBox schm = new SchemeTypeBox();
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9126);schm.setSchemeType(encryptionAlgo);
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9127);schm.setSchemeVersion(0x00010000);
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9128);sinf.addBox(schm);

            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9129);SchemeInformationBox schi = new SchemeInformationBox();
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9130);TrackEncryptionBox trackEncryptionBox = new TrackEncryptionBox();
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9131);trackEncryptionBox.setDefaultIvSize((((defaultKeyId == null )&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9132)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9133)==0&false))? 0 : 8);
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9134);trackEncryptionBox.setDefaultAlgorithmId((((defaultKeyId == null )&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9135)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9136)==0&false))? 0x0 : 0x01);
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9137);trackEncryptionBox.setDefault_KID((((defaultKeyId == null )&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9138)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9139)==0&false))? new UUID(0, 0) : defaultKeyId);
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9140);schi.addBox(trackEncryptionBox);

            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9141);sinf.addBox(schi);
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9142);stsd.getSampleEntry().addBox(sinf);
        }
        }__CLR4_5_26wz6wzlvl9ei7v.R.inc(9143);return stsd;

    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public long[] getSampleDurations() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9144);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9145);return source.getSampleDurations();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public long getDuration() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9146);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9147);return source.getDuration();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9148);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9149);return source.getCompositionTimeEntries();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9150);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9151);return source.getSyncSamples();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9152);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9153);return source.getSampleDependencies();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9154);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9155);return source.getTrackMetaData();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9156);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9157);return source.getHandler();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9158);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9159);return new CencEncryptingSampleList(indexToKey, source.getSamples(), cencSampleAuxiliaryData, encryptionAlgo);
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public SubSampleInformationBox getSubsampleInformationBox() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9160);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9161);return source.getSubsampleInformationBox();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9162);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9163);source.close();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9164);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9165);return "enc(" + source.getName() + ")";
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public List<Edit> getEdits() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9166);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9167);return source.getEdits();
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public Map<GroupEntry, long[]> getSampleGroups() {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9168);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9169);return sampleGroups;
    }finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}

    public boolean isClearNal(ByteBuffer s) {try{__CLR4_5_26wz6wzlvl9ei7v.R.inc(9170);
        __CLR4_5_26wz6wzlvl9ei7v.R.inc(9171);if ((((configurationBox instanceof HevcConfigurationBox)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9172)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9173)==0&false))) {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9174);H265NalUnitHeader nuh = H265TrackImpl.getNalUnitHeader(s.slice());
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9175);return !( // These ranges are all slices --> NOT CLEAR
                    (nuh.nalUnitType >= H265NalUnitTypes.NAL_TYPE_TRAIL_N && (nuh.nalUnitType <= H265NalUnitTypes.NAL_TYPE_RASL_R)) ||
                    (nuh.nalUnitType >= H265NalUnitTypes.NAL_TYPE_BLA_W_LP && (nuh.nalUnitType <= H265NalUnitTypes.NAL_TYPE_CRA_NUT)) ||
                    (nuh.nalUnitType >= H265NalUnitTypes.NAL_TYPE_BLA_W_LP && (nuh.nalUnitType <= H265NalUnitTypes.NAL_TYPE_CRA_NUT))
                    );
        } }else {__CLR4_5_26wz6wzlvl9ei7v.R.inc(9176);if ((((configurationBox instanceof AvcConfigurationBox)&&(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9177)!=0|true))||(__CLR4_5_26wz6wzlvl9ei7v.R.iget(9178)==0&false))) {{
            // only encrypt
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9179);H264NalUnitHeader nuh = H264TrackImpl.getNalUnitHeader(s.slice());
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9180);return !(nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_AUX_PIC ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_DATA_PART_A ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_DATA_PART_B ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_DATA_PART_C ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_EXT ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_IDR ||
                    nuh.nal_unit_type == H264NalUnitTypes.CODED_SLICE_NON_IDR
            );

        } }else {{
            __CLR4_5_26wz6wzlvl9ei7v.R.inc(9181);throw new RuntimeException("Subsample encryption is activated but the CencEncryptingTrackImpl can't say if this sample is to be encrypted or not!");
    }
}}}finally{__CLR4_5_26wz6wzlvl9ei7v.R.flushNeeded();}}


}
