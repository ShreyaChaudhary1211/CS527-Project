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

public class CencDecryptingTrackImpl extends AbstractTrack {public static class __CLR4_5_26uk6uklvl9ei79{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,8963,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    CencDecryptingSampleList samples;
    Track original;
    RangeStartMap<Integer, SecretKey> indexToKey = new RangeStartMap<Integer, SecretKey>();

    public CencDecryptingTrackImpl(CencEncryptedTrack original, SecretKey sk) {
        this(original, Collections.singletonMap(original.getDefaultKeyId(), sk));__CLR4_5_26uk6uklvl9ei79.R.inc(8877);try{__CLR4_5_26uk6uklvl9ei79.R.inc(8876);

    }finally{__CLR4_5_26uk6uklvl9ei79.R.flushNeeded();}}

    public CencDecryptingTrackImpl(CencEncryptedTrack original, Map<UUID, SecretKey> keys) {
        super("dec(" + original.getName() + ")");__CLR4_5_26uk6uklvl9ei79.R.inc(8879);try{__CLR4_5_26uk6uklvl9ei79.R.inc(8878);
        __CLR4_5_26uk6uklvl9ei79.R.inc(8880);this.original = original;
        __CLR4_5_26uk6uklvl9ei79.R.inc(8881);SchemeTypeBox schm = Path.getPath(original.getSampleDescriptionBox(), "enc./sinf/schm");
        __CLR4_5_26uk6uklvl9ei79.R.inc(8882);if ((((!("cenc".equals(schm.getSchemeType()) || "cbc1".equals(schm.getSchemeType())))&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8883)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8884)==0&false))) {{
            __CLR4_5_26uk6uklvl9ei79.R.inc(8885);throw new RuntimeException("You can only use the CencDecryptingTrackImpl with CENC (cenc or cbc1) encrypted tracks");
        }

        }__CLR4_5_26uk6uklvl9ei79.R.inc(8886);List<CencSampleEncryptionInformationGroupEntry> groupEntries = new ArrayList<CencSampleEncryptionInformationGroupEntry>();
        __CLR4_5_26uk6uklvl9ei79.R.inc(8887);for (Map.Entry<GroupEntry, long[]> groupEntry : original.getSampleGroups().entrySet()) {{
            __CLR4_5_26uk6uklvl9ei79.R.inc(8888);if ((((groupEntry.getKey() instanceof CencSampleEncryptionInformationGroupEntry)&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8889)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8890)==0&false))) {{
                __CLR4_5_26uk6uklvl9ei79.R.inc(8891);groupEntries.add((CencSampleEncryptionInformationGroupEntry) groupEntry.getKey());
            } }else {{
                __CLR4_5_26uk6uklvl9ei79.R.inc(8892);getSampleGroups().put(groupEntry.getKey(), groupEntry.getValue());
            }
        }}


        }__CLR4_5_26uk6uklvl9ei79.R.inc(8893);int lastSampleGroupDescriptionIndex = -1;
        __CLR4_5_26uk6uklvl9ei79.R.inc(8894);for (int i = 0; (((i < original.getSamples().size())&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8895)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8896)==0&false)); i++) {{
            __CLR4_5_26uk6uklvl9ei79.R.inc(8897);int index = 0;
            __CLR4_5_26uk6uklvl9ei79.R.inc(8898);for (int j = 0; (((j < groupEntries.size())&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8899)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8900)==0&false)); j++) {{
                __CLR4_5_26uk6uklvl9ei79.R.inc(8901);GroupEntry groupEntry = groupEntries.get(j);
                __CLR4_5_26uk6uklvl9ei79.R.inc(8902);long[] sampleNums = original.getSampleGroups().get(groupEntry);
                __CLR4_5_26uk6uklvl9ei79.R.inc(8903);if ((((Arrays.binarySearch(sampleNums, i) >= 0)&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8904)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8905)==0&false))) {{
                    __CLR4_5_26uk6uklvl9ei79.R.inc(8906);index = j + 1;
                }
            }}
            }__CLR4_5_26uk6uklvl9ei79.R.inc(8907);if ((((lastSampleGroupDescriptionIndex != index)&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8908)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8909)==0&false))) {{
                __CLR4_5_26uk6uklvl9ei79.R.inc(8910);if ((((index == 0)&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8911)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8912)==0&false))) {{
                    // if default_encrypted == false then keys.get(original.getDefaultKeyId()) == null
                    __CLR4_5_26uk6uklvl9ei79.R.inc(8913);indexToKey.put(i, keys.get(original.getDefaultKeyId()));
                } }else {{
                    __CLR4_5_26uk6uklvl9ei79.R.inc(8914);if ((((groupEntries.get(index - 1).isEncrypted())&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8915)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8916)==0&false))) {{
                        __CLR4_5_26uk6uklvl9ei79.R.inc(8917);SecretKey sk = keys.get(groupEntries.get(index - 1).getKid());
                        __CLR4_5_26uk6uklvl9ei79.R.inc(8918);if ((((sk == null)&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8919)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8920)==0&false))) {{
                            __CLR4_5_26uk6uklvl9ei79.R.inc(8921);throw new RuntimeException("Key " + groupEntries.get(index - 1).getKid() + " was not supplied for decryption");
                        }
                        }__CLR4_5_26uk6uklvl9ei79.R.inc(8922);indexToKey.put(i, sk);
                    } }else {{
                        __CLR4_5_26uk6uklvl9ei79.R.inc(8923);indexToKey.put(i, null);
                    }
                }}
                }__CLR4_5_26uk6uklvl9ei79.R.inc(8924);lastSampleGroupDescriptionIndex = index;
            }
        }}


        }__CLR4_5_26uk6uklvl9ei79.R.inc(8925);samples = new CencDecryptingSampleList(indexToKey, original.getSamples(), original.getSampleEncryptionEntries(), schm.getSchemeType());
    }finally{__CLR4_5_26uk6uklvl9ei79.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_26uk6uklvl9ei79.R.inc(8926);
        __CLR4_5_26uk6uklvl9ei79.R.inc(8927);original.close();
    }finally{__CLR4_5_26uk6uklvl9ei79.R.flushNeeded();}}

    public long[] getSyncSamples() {try{__CLR4_5_26uk6uklvl9ei79.R.inc(8928);
        __CLR4_5_26uk6uklvl9ei79.R.inc(8929);return original.getSyncSamples();
    }finally{__CLR4_5_26uk6uklvl9ei79.R.flushNeeded();}}

    public SampleDescriptionBox getSampleDescriptionBox() {try{__CLR4_5_26uk6uklvl9ei79.R.inc(8930);
        __CLR4_5_26uk6uklvl9ei79.R.inc(8931);OriginalFormatBox frma = Path.getPath(original.getSampleDescriptionBox(), "enc./sinf/frma");
        __CLR4_5_26uk6uklvl9ei79.R.inc(8932);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_26uk6uklvl9ei79.R.inc(8933);SampleDescriptionBox stsd;
        __CLR4_5_26uk6uklvl9ei79.R.inc(8934);try {
            __CLR4_5_26uk6uklvl9ei79.R.inc(8935);original.getSampleDescriptionBox().getBox(Channels.newChannel(baos));
            __CLR4_5_26uk6uklvl9ei79.R.inc(8936);stsd = (SampleDescriptionBox) new IsoFile(new MemoryDataSourceImpl(baos.toByteArray())).getBoxes().get(0);
        } catch (IOException e) {
            __CLR4_5_26uk6uklvl9ei79.R.inc(8937);throw new RuntimeException("Dumping stsd to memory failed");
        }

        __CLR4_5_26uk6uklvl9ei79.R.inc(8938);if ((((stsd.getSampleEntry() instanceof AudioSampleEntry)&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8939)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8940)==0&false))) {{
            __CLR4_5_26uk6uklvl9ei79.R.inc(8941);((AudioSampleEntry) stsd.getSampleEntry()).setType(frma.getDataFormat());
        } }else {__CLR4_5_26uk6uklvl9ei79.R.inc(8942);if ((((stsd.getSampleEntry() instanceof VisualSampleEntry)&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8943)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8944)==0&false))) {{
            __CLR4_5_26uk6uklvl9ei79.R.inc(8945);((VisualSampleEntry) stsd.getSampleEntry()).setType(frma.getDataFormat());
        } }else {{
            __CLR4_5_26uk6uklvl9ei79.R.inc(8946);throw new RuntimeException("I don't know " + stsd.getSampleEntry().getType());
        }
        }}__CLR4_5_26uk6uklvl9ei79.R.inc(8947);List<Box> nuBoxes = new LinkedList<Box>();
        __CLR4_5_26uk6uklvl9ei79.R.inc(8948);for (Box box : stsd.getSampleEntry().getBoxes()) {{
            __CLR4_5_26uk6uklvl9ei79.R.inc(8949);if ((((!box.getType().equals("sinf"))&&(__CLR4_5_26uk6uklvl9ei79.R.iget(8950)!=0|true))||(__CLR4_5_26uk6uklvl9ei79.R.iget(8951)==0&false))) {{
                __CLR4_5_26uk6uklvl9ei79.R.inc(8952);nuBoxes.add(box);
            }
        }}
        }__CLR4_5_26uk6uklvl9ei79.R.inc(8953);stsd.getSampleEntry().setBoxes(nuBoxes);
        __CLR4_5_26uk6uklvl9ei79.R.inc(8954);return stsd;
    }finally{__CLR4_5_26uk6uklvl9ei79.R.flushNeeded();}}


    public long[] getSampleDurations() {try{__CLR4_5_26uk6uklvl9ei79.R.inc(8955);
        __CLR4_5_26uk6uklvl9ei79.R.inc(8956);return original.getSampleDurations();
    }finally{__CLR4_5_26uk6uklvl9ei79.R.flushNeeded();}}

    public TrackMetaData getTrackMetaData() {try{__CLR4_5_26uk6uklvl9ei79.R.inc(8957);
        __CLR4_5_26uk6uklvl9ei79.R.inc(8958);return original.getTrackMetaData();
    }finally{__CLR4_5_26uk6uklvl9ei79.R.flushNeeded();}}

    public String getHandler() {try{__CLR4_5_26uk6uklvl9ei79.R.inc(8959);
        __CLR4_5_26uk6uklvl9ei79.R.inc(8960);return original.getHandler();
    }finally{__CLR4_5_26uk6uklvl9ei79.R.flushNeeded();}}

    public List<Sample> getSamples() {try{__CLR4_5_26uk6uklvl9ei79.R.inc(8961);
        __CLR4_5_26uk6uklvl9ei79.R.inc(8962);return samples;
    }finally{__CLR4_5_26uk6uklvl9ei79.R.flushNeeded();}}

}
