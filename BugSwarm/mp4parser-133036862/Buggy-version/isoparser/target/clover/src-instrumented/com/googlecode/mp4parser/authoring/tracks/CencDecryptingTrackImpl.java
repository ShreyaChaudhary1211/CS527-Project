/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.cenc.CencDecryptingSampleList;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.Path;
import com.googlecode.mp4parser.util.RangeStartMap;

import javax.crypto.SecretKey;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.*;

public class CencDecryptingTrackImpl extends AbstractTrack {public static class __CLR4_5_26x76x7lvlulhmh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,9058,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    CencDecryptingSampleList samples;
    Track original;
    RangeStartMap<Integer, SecretKey> indexToKey = new RangeStartMap<Integer, SecretKey>();

    public CencDecryptingTrackImpl(CencEncryptedTrack original, SecretKey sk) {
        this(original, Collections.singletonMap(original.getDefaultKeyId(), sk));__CLR4_5_26x76x7lvlulhmh.R.inc(8972);try{__CLR4_5_26x76x7lvlulhmh.R.inc(8971);

    }finally{__CLR4_5_26x76x7lvlulhmh.R.flushNeeded();}}

    public CencDecryptingTrackImpl(CencEncryptedTrack original, Map<UUID, SecretKey> keys) {
        super("dec(" + original.getName() + ")");__CLR4_5_26x76x7lvlulhmh.R.inc(8974);try{__CLR4_5_26x76x7lvlulhmh.R.inc(8973);
        __CLR4_5_26x76x7lvlulhmh.R.inc(8975);this.original = original;
        __CLR4_5_26x76x7lvlulhmh.R.inc(8976);SchemeTypeBox schm = Path.getPath(original.getSampleDescriptionBox(), "enc./sinf/schm");
        __CLR4_5_26x76x7lvlulhmh.R.inc(8977);if ((((!("cenc".equals(schm.getSchemeType()) || "cbc1".equals(schm.getSchemeType())))&&(__CLR4_5_26x76x7lvlulhmh.R.iget(8978)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(8979)==0&false))) {{
            __CLR4_5_26x76x7lvlulhmh.R.inc(8980);throw new RuntimeException("You can only use the CencDecryptingTrackImpl with CENC (cenc or cbc1) encrypted tracks");
        }

        }__CLR4_5_26x76x7lvlulhmh.R.inc(8981);List<CencSampleEncryptionInformationGroupEntry> groupEntries = new ArrayList<CencSampleEncryptionInformationGroupEntry>();
        __CLR4_5_26x76x7lvlulhmh.R.inc(8982);for (Map.Entry<GroupEntry, long[]> groupEntry : original.getSampleGroups().entrySet()) {{
            __CLR4_5_26x76x7lvlulhmh.R.inc(8983);if ((((groupEntry.getKey() instanceof CencSampleEncryptionInformationGroupEntry)&&(__CLR4_5_26x76x7lvlulhmh.R.iget(8984)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(8985)==0&false))) {{
                __CLR4_5_26x76x7lvlulhmh.R.inc(8986);groupEntries.add((CencSampleEncryptionInformationGroupEntry) groupEntry.getKey());
            } }else {{
                __CLR4_5_26x76x7lvlulhmh.R.inc(8987);getSampleGroups().put(groupEntry.getKey(), groupEntry.getValue());
            }
        }}


        }__CLR4_5_26x76x7lvlulhmh.R.inc(8988);int lastSampleGroupDescriptionIndex = -1;
        __CLR4_5_26x76x7lvlulhmh.R.inc(8989);for (int i = 0; (((i < original.getSamples().size())&&(__CLR4_5_26x76x7lvlulhmh.R.iget(8990)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(8991)==0&false)); i++) {{
            __CLR4_5_26x76x7lvlulhmh.R.inc(8992);int index = 0;
            __CLR4_5_26x76x7lvlulhmh.R.inc(8993);for (int j = 0; (((j < groupEntries.size())&&(__CLR4_5_26x76x7lvlulhmh.R.iget(8994)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(8995)==0&false)); j++) {{
                __CLR4_5_26x76x7lvlulhmh.R.inc(8996);GroupEntry groupEntry = groupEntries.get(j);
                __CLR4_5_26x76x7lvlulhmh.R.inc(8997);long[] sampleNums = original.getSampleGroups().get(groupEntry);
                __CLR4_5_26x76x7lvlulhmh.R.inc(8998);if ((((Arrays.binarySearch(sampleNums, i) >= 0)&&(__CLR4_5_26x76x7lvlulhmh.R.iget(8999)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(9000)==0&false))) {{
                    __CLR4_5_26x76x7lvlulhmh.R.inc(9001);index = j + 1;
                }
            }}
            }__CLR4_5_26x76x7lvlulhmh.R.inc(9002);if ((((lastSampleGroupDescriptionIndex != index)&&(__CLR4_5_26x76x7lvlulhmh.R.iget(9003)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(9004)==0&false))) {{
                __CLR4_5_26x76x7lvlulhmh.R.inc(9005);if ((((index == 0)&&(__CLR4_5_26x76x7lvlulhmh.R.iget(9006)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(9007)==0&false))) {{
                    // if default_encrypted == false then keys.get(original.getDefaultKeyId()) == null
                    __CLR4_5_26x76x7lvlulhmh.R.inc(9008);indexToKey.put(i, keys.get(original.getDefaultKeyId()));
                } }else {{
                    __CLR4_5_26x76x7lvlulhmh.R.inc(9009);if ((((groupEntries.get(index - 1).isEncrypted())&&(__CLR4_5_26x76x7lvlulhmh.R.iget(9010)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(9011)==0&false))) {{
                        __CLR4_5_26x76x7lvlulhmh.R.inc(9012);SecretKey sk = keys.get(groupEntries.get(index - 1).getKid());
                        __CLR4_5_26x76x7lvlulhmh.R.inc(9013);if ((((sk == null)&&(__CLR4_5_26x76x7lvlulhmh.R.iget(9014)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(9015)==0&false))) {{
                            __CLR4_5_26x76x7lvlulhmh.R.inc(9016);throw new RuntimeException("Key " + groupEntries.get(index - 1).getKid() + " was not supplied for decryption");
                        }
                        }__CLR4_5_26x76x7lvlulhmh.R.inc(9017);indexToKey.put(i, sk);
                    } }else {{
                        __CLR4_5_26x76x7lvlulhmh.R.inc(9018);indexToKey.put(i, null);
                    }
                }}
                }__CLR4_5_26x76x7lvlulhmh.R.inc(9019);lastSampleGroupDescriptionIndex = index;
            }
        }}


        }__CLR4_5_26x76x7lvlulhmh.R.inc(9020);samples = new CencDecryptingSampleList(indexToKey, original.getSamples(), original.getSampleEncryptionEntries(), schm.getSchemeType());
    }finally{__CLR4_5_26x76x7lvlulhmh.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_26x76x7lvlulhmh.R.inc(9021);
        __CLR4_5_26x76x7lvlulhmh.R.inc(9022);original.close();
    }finally{__CLR4_5_26x76x7lvlulhmh.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_26x76x7lvlulhmh.R.inc(9023);
        __CLR4_5_26x76x7lvlulhmh.R.inc(9024);return original.getSyncSamples();
    }finally{__CLR4_5_26x76x7lvlulhmh.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_26x76x7lvlulhmh.R.inc(9025);
        __CLR4_5_26x76x7lvlulhmh.R.inc(9026);OriginalFormatBox frma = Path.getPath(original.getSampleDescriptionBox(), "enc./sinf/frma");
        __CLR4_5_26x76x7lvlulhmh.R.inc(9027);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_26x76x7lvlulhmh.R.inc(9028);SampleDescriptionBox stsd;
        __CLR4_5_26x76x7lvlulhmh.R.inc(9029);try {
            __CLR4_5_26x76x7lvlulhmh.R.inc(9030);original.getSampleDescriptionBox().getBox(Channels.newChannel(baos));
            __CLR4_5_26x76x7lvlulhmh.R.inc(9031);stsd = (SampleDescriptionBox) new IsoFile(new MemoryDataSourceImpl(baos.toByteArray())).getBoxes().get(0);
        } catch (IOException e) {
            __CLR4_5_26x76x7lvlulhmh.R.inc(9032);throw new RuntimeException("Dumping stsd to memory failed");
        }

        __CLR4_5_26x76x7lvlulhmh.R.inc(9033);if ((((stsd.getSampleEntry() instanceof AudioSampleEntry)&&(__CLR4_5_26x76x7lvlulhmh.R.iget(9034)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(9035)==0&false))) {{
            __CLR4_5_26x76x7lvlulhmh.R.inc(9036);((AudioSampleEntry) stsd.getSampleEntry()).setType(frma.getDataFormat());
        } }else {__CLR4_5_26x76x7lvlulhmh.R.inc(9037);if ((((stsd.getSampleEntry() instanceof VisualSampleEntry)&&(__CLR4_5_26x76x7lvlulhmh.R.iget(9038)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(9039)==0&false))) {{
            __CLR4_5_26x76x7lvlulhmh.R.inc(9040);((VisualSampleEntry) stsd.getSampleEntry()).setType(frma.getDataFormat());
        } }else {{
            __CLR4_5_26x76x7lvlulhmh.R.inc(9041);throw new RuntimeException("I don't know " + stsd.getSampleEntry().getType());
        }
        }}__CLR4_5_26x76x7lvlulhmh.R.inc(9042);List<Box> nuBoxes = new LinkedList<Box>();
        __CLR4_5_26x76x7lvlulhmh.R.inc(9043);for (Box box : stsd.getSampleEntry().getBoxes()) {{
            __CLR4_5_26x76x7lvlulhmh.R.inc(9044);if ((((!box.getType().equals("sinf"))&&(__CLR4_5_26x76x7lvlulhmh.R.iget(9045)!=0|true))||(__CLR4_5_26x76x7lvlulhmh.R.iget(9046)==0&false))) {{
                __CLR4_5_26x76x7lvlulhmh.R.inc(9047);nuBoxes.add(box);
            }
        }}
        }__CLR4_5_26x76x7lvlulhmh.R.inc(9048);stsd.getSampleEntry().setBoxes(nuBoxes);
        __CLR4_5_26x76x7lvlulhmh.R.inc(9049);return stsd;
    }finally{__CLR4_5_26x76x7lvlulhmh.R.flushNeeded();}}


    public long[] getSampleDurations() {try{__CLR4_5_26x76x7lvlulhmh.R.inc(9050);
        __CLR4_5_26x76x7lvlulhmh.R.inc(9051);return original.getSampleDurations();
    }finally{__CLR4_5_26x76x7lvlulhmh.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_26x76x7lvlulhmh.R.inc(9052);
        __CLR4_5_26x76x7lvlulhmh.R.inc(9053);return original.getTrackMetaData();
    }finally{__CLR4_5_26x76x7lvlulhmh.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_26x76x7lvlulhmh.R.inc(9054);
        __CLR4_5_26x76x7lvlulhmh.R.inc(9055);return original.getHandler();
    }finally{__CLR4_5_26x76x7lvlulhmh.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_26x76x7lvlulhmh.R.inc(9056);
        __CLR4_5_26x76x7lvlulhmh.R.inc(9057);return samples;
    }finally{__CLR4_5_26x76x7lvlulhmh.R.flushNeeded();}}

}
