/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.boxes.*;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;
import com.googlecode.mp4parser.util.Path;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;
import com.mp4parser.iso23001.part7.TrackEncryptionBox;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * This track implementation is to be used when MP4 track is CENC encrypted.
 */
public class CencMp4TrackImplImpl extends Mp4TrackImpl implements CencEncryptedTrack {public static class __CLR4_5_246k46klvluld8y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,5593,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private List<CencSampleAuxiliaryDataFormat> sampleEncryptionEntries;
    private UUID defaultKeyId;


    /**
     * Creates a track from a TrackBox and potentially fragments. Use <b>fragements parameter
     * only</b> to supply additional fragments that are not located in the main file.
     *
     * @param name      a name for the track for better identification
     * @param trackBox  the <code>TrackBox</code> describing the track.
     * @param fragments additional fragments if located in more than a single file
     * @throws java.io.IOException if reading from underlying <code>DataSource</code> fails
     */
    public CencMp4TrackImplImpl(String name, TrackBox trackBox, IsoFile... fragments) throws IOException {
        super(name, trackBox, fragments);__CLR4_5_246k46klvluld8y.R.inc(5421);try{__CLR4_5_246k46klvluld8y.R.inc(5420);

        __CLR4_5_246k46klvluld8y.R.inc(5422);SchemeTypeBox schm = Path.getPath(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
        assert (((schm != null && (schm.getSchemeType().equals("cenc") || schm.getSchemeType().equals("cbc1")) )&&(__CLR4_5_246k46klvluld8y.R.iget(5423)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5424)==0&false)): "Track must be CENC (cenc or cbc1) encrypted";

        __CLR4_5_246k46klvluld8y.R.inc(5425);sampleEncryptionEntries = new ArrayList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_246k46klvluld8y.R.inc(5426);long trackId = trackBox.getTrackHeaderBox().getTrackId();
        __CLR4_5_246k46klvluld8y.R.inc(5427);if ((((trackBox.getParent().getBoxes(MovieExtendsBox.class).size() > 0)&&(__CLR4_5_246k46klvluld8y.R.iget(5428)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5429)==0&false))) {{


            __CLR4_5_246k46klvluld8y.R.inc(5430);for (MovieFragmentBox movieFragmentBox : ((Box) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class)) {{
                __CLR4_5_246k46klvluld8y.R.inc(5431);List<TrackFragmentBox> trafs = movieFragmentBox.getBoxes(TrackFragmentBox.class);
                __CLR4_5_246k46klvluld8y.R.inc(5432);for (TrackFragmentBox traf : trafs) {{
                    __CLR4_5_246k46klvluld8y.R.inc(5433);if ((((traf.getTrackFragmentHeaderBox().getTrackId() == trackId)&&(__CLR4_5_246k46klvluld8y.R.iget(5434)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5435)==0&false))) {{
                        __CLR4_5_246k46klvluld8y.R.inc(5436);TrackEncryptionBox tenc = Path.getPath(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
                        __CLR4_5_246k46klvluld8y.R.inc(5437);defaultKeyId = tenc.getDefault_KID();
                        __CLR4_5_246k46klvluld8y.R.inc(5438);Container base;
                        __CLR4_5_246k46klvluld8y.R.inc(5439);long baseOffset;
                        __CLR4_5_246k46klvluld8y.R.inc(5440);if ((((traf.getTrackFragmentHeaderBox().hasBaseDataOffset())&&(__CLR4_5_246k46klvluld8y.R.iget(5441)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5442)==0&false))) {{
                            __CLR4_5_246k46klvluld8y.R.inc(5443);base = ((Box) trackBox.getParent()).getParent();
                            __CLR4_5_246k46klvluld8y.R.inc(5444);baseOffset = traf.getTrackFragmentHeaderBox().getBaseDataOffset();
                        } }else {{
                            __CLR4_5_246k46klvluld8y.R.inc(5445);base = movieFragmentBox;
                            __CLR4_5_246k46klvluld8y.R.inc(5446);baseOffset = 0;
                        }

                        }__CLR4_5_246k46klvluld8y.R.inc(5447);FindSaioSaizPair saizSaioPair = new FindSaioSaizPair(traf).invoke();
                        __CLR4_5_246k46klvluld8y.R.inc(5448);SampleAuxiliaryInformationOffsetsBox saio = saizSaioPair.getSaio();
                        __CLR4_5_246k46klvluld8y.R.inc(5449);SampleAuxiliaryInformationSizesBox saiz = saizSaioPair.getSaiz();
                        // now we have the correct saio/saiz combo!
                        assert (((saio != null)&&(__CLR4_5_246k46klvluld8y.R.iget(5450)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5451)==0&false));
                        __CLR4_5_246k46klvluld8y.R.inc(5452);long[] saioOffsets = saio.getOffsets();
                        assert (((saioOffsets.length == traf.getBoxes(TrackRunBox.class).size())&&(__CLR4_5_246k46klvluld8y.R.iget(5453)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5454)==0&false));
                        assert (((saiz != null)&&(__CLR4_5_246k46klvluld8y.R.iget(5455)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5456)==0&false));

                        __CLR4_5_246k46klvluld8y.R.inc(5457);List<TrackRunBox> truns = traf.getBoxes(TrackRunBox.class);
                        __CLR4_5_246k46klvluld8y.R.inc(5458);int sampleNo = 0;
                        __CLR4_5_246k46klvluld8y.R.inc(5459);for (int i = 0; (((i < saioOffsets.length)&&(__CLR4_5_246k46klvluld8y.R.iget(5460)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5461)==0&false)); i++) {{
                            __CLR4_5_246k46klvluld8y.R.inc(5462);int numSamples = truns.get(i).getEntries().size();
                            __CLR4_5_246k46klvluld8y.R.inc(5463);long offset = saioOffsets[i];
                            __CLR4_5_246k46klvluld8y.R.inc(5464);long length = 0;

                            __CLR4_5_246k46klvluld8y.R.inc(5465);for (int j = sampleNo; (((j < sampleNo + numSamples)&&(__CLR4_5_246k46klvluld8y.R.iget(5466)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5467)==0&false)); j++) {{
                                __CLR4_5_246k46klvluld8y.R.inc(5468);length += saiz.getSize(j);
                            }
                            }__CLR4_5_246k46klvluld8y.R.inc(5469);ByteBuffer trunsCencSampleAuxData = base.getByteBuffer(baseOffset + offset, length);
                            __CLR4_5_246k46klvluld8y.R.inc(5470);for (int j = sampleNo; (((j < sampleNo + numSamples)&&(__CLR4_5_246k46klvluld8y.R.iget(5471)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5472)==0&false)); j++) {{
                                __CLR4_5_246k46klvluld8y.R.inc(5473);int auxInfoSize = saiz.getSize(j);
                                __CLR4_5_246k46klvluld8y.R.inc(5474);sampleEncryptionEntries.add(
                                        parseCencAuxDataFormat(tenc.getDefaultIvSize(), trunsCencSampleAuxData, auxInfoSize)
                                );

                            }

                            }__CLR4_5_246k46klvluld8y.R.inc(5475);sampleNo += numSamples;
                        }
                    }}
                }}

            }}
        }} }else {{
            __CLR4_5_246k46klvluld8y.R.inc(5476);TrackEncryptionBox tenc = Path.getPath(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
            __CLR4_5_246k46klvluld8y.R.inc(5477);defaultKeyId = tenc.getDefault_KID();
            __CLR4_5_246k46klvluld8y.R.inc(5478);ChunkOffsetBox chunkOffsetBox = Path.getPath(trackBox, "mdia[0]/minf[0]/stbl[0]/stco[0]");

            __CLR4_5_246k46klvluld8y.R.inc(5479);if ((((chunkOffsetBox == null)&&(__CLR4_5_246k46klvluld8y.R.iget(5480)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5481)==0&false))) {{
                __CLR4_5_246k46klvluld8y.R.inc(5482);chunkOffsetBox = Path.getPath(trackBox, "mdia[0]/minf[0]/stbl[0]/co64[0]");
            }
            }__CLR4_5_246k46klvluld8y.R.inc(5483);long[] chunkSizes = trackBox.getSampleTableBox().getSampleToChunkBox().blowup(chunkOffsetBox.getChunkOffsets().length);


            __CLR4_5_246k46klvluld8y.R.inc(5484);FindSaioSaizPair saizSaioPair = new FindSaioSaizPair((Container) Path.getPath(trackBox, "mdia[0]/minf[0]/stbl[0]")).invoke();
            __CLR4_5_246k46klvluld8y.R.inc(5485);SampleAuxiliaryInformationOffsetsBox saio = saizSaioPair.saio;
            __CLR4_5_246k46klvluld8y.R.inc(5486);SampleAuxiliaryInformationSizesBox saiz = saizSaioPair.saiz;

            __CLR4_5_246k46klvluld8y.R.inc(5487);Container topLevel = ((MovieBox) trackBox.getParent()).getParent();

            __CLR4_5_246k46klvluld8y.R.inc(5488);if ((((saio.getOffsets().length == 1)&&(__CLR4_5_246k46klvluld8y.R.iget(5489)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5490)==0&false))) {{
                __CLR4_5_246k46klvluld8y.R.inc(5491);long offset = saio.getOffsets()[0];
                __CLR4_5_246k46klvluld8y.R.inc(5492);int sizeInTotal = 0;
                __CLR4_5_246k46klvluld8y.R.inc(5493);if ((((saiz.getDefaultSampleInfoSize() > 0)&&(__CLR4_5_246k46klvluld8y.R.iget(5494)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5495)==0&false))) {{
                    __CLR4_5_246k46klvluld8y.R.inc(5496);sizeInTotal += saiz.getSampleCount() * saiz.getDefaultSampleInfoSize();
                } }else {{
                    __CLR4_5_246k46klvluld8y.R.inc(5497);for (int i = 0; (((i < saiz.getSampleCount())&&(__CLR4_5_246k46klvluld8y.R.iget(5498)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5499)==0&false)); i++) {{
                        __CLR4_5_246k46klvluld8y.R.inc(5500);sizeInTotal += saiz.getSampleInfoSizes()[i];
                    }
                }}
                }__CLR4_5_246k46klvluld8y.R.inc(5501);ByteBuffer chunksCencSampleAuxData = topLevel.getByteBuffer(offset, sizeInTotal);
                __CLR4_5_246k46klvluld8y.R.inc(5502);for (int i = 0; (((i < saiz.getSampleCount())&&(__CLR4_5_246k46klvluld8y.R.iget(5503)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5504)==0&false)); i++) {{
                    __CLR4_5_246k46klvluld8y.R.inc(5505);sampleEncryptionEntries.add(
                            parseCencAuxDataFormat(tenc.getDefaultIvSize(), chunksCencSampleAuxData, saiz.getSize(i))
                    );
                }

            }} }else {__CLR4_5_246k46klvluld8y.R.inc(5506);if ((((saio.getOffsets().length == chunkSizes.length)&&(__CLR4_5_246k46klvluld8y.R.iget(5507)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5508)==0&false))) {{
                __CLR4_5_246k46klvluld8y.R.inc(5509);int currentSampleNo = 0;
                __CLR4_5_246k46klvluld8y.R.inc(5510);for (int i = 0; (((i < chunkSizes.length)&&(__CLR4_5_246k46klvluld8y.R.iget(5511)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5512)==0&false)); i++) {{
                    __CLR4_5_246k46klvluld8y.R.inc(5513);long offset = saio.getOffsets()[i];
                    __CLR4_5_246k46klvluld8y.R.inc(5514);long size = 0;
                    __CLR4_5_246k46klvluld8y.R.inc(5515);if ((((saiz.getDefaultSampleInfoSize() > 0)&&(__CLR4_5_246k46klvluld8y.R.iget(5516)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5517)==0&false))) {{
                        __CLR4_5_246k46klvluld8y.R.inc(5518);size += saiz.getSampleCount() * chunkSizes[i];
                    } }else {{
                        __CLR4_5_246k46klvluld8y.R.inc(5519);for (int j = 0; (((j < chunkSizes[i])&&(__CLR4_5_246k46klvluld8y.R.iget(5520)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5521)==0&false)); j++) {{
                            __CLR4_5_246k46klvluld8y.R.inc(5522);size += saiz.getSize(currentSampleNo + j);
                        }
                    }}

                    }__CLR4_5_246k46klvluld8y.R.inc(5523);ByteBuffer chunksCencSampleAuxData = topLevel.getByteBuffer(offset, size);
                    __CLR4_5_246k46klvluld8y.R.inc(5524);for (int j = 0; (((j < chunkSizes[i])&&(__CLR4_5_246k46klvluld8y.R.iget(5525)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5526)==0&false)); j++) {{
                        __CLR4_5_246k46klvluld8y.R.inc(5527);long auxInfoSize = saiz.getSize(currentSampleNo + j);
                        __CLR4_5_246k46klvluld8y.R.inc(5528);sampleEncryptionEntries.add(
                                // should I use the iv size from the sample group?
                                parseCencAuxDataFormat(tenc.getDefaultIvSize(), chunksCencSampleAuxData, auxInfoSize)
                        );
                    }
                    }__CLR4_5_246k46klvluld8y.R.inc(5529);currentSampleNo += chunkSizes[i];
                }
            }} }else {{
                __CLR4_5_246k46klvluld8y.R.inc(5530);throw new RuntimeException("Number of saio offsets must be either 1 or number of chunks");
            }
        }}}
    }}finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

    private CencSampleAuxiliaryDataFormat parseCencAuxDataFormat(int ivSize, ByteBuffer chunksCencSampleAuxData, long auxInfoSize) {try{__CLR4_5_246k46klvluld8y.R.inc(5531);
        __CLR4_5_246k46klvluld8y.R.inc(5532);CencSampleAuxiliaryDataFormat cadf = new CencSampleAuxiliaryDataFormat();
        __CLR4_5_246k46klvluld8y.R.inc(5533);if ((((auxInfoSize > 0)&&(__CLR4_5_246k46klvluld8y.R.iget(5534)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5535)==0&false))) {{
            __CLR4_5_246k46klvluld8y.R.inc(5536);cadf.iv = new byte[ivSize];
            __CLR4_5_246k46klvluld8y.R.inc(5537);chunksCencSampleAuxData.get(cadf.iv);
            __CLR4_5_246k46klvluld8y.R.inc(5538);if ((((auxInfoSize > ivSize)&&(__CLR4_5_246k46klvluld8y.R.iget(5539)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5540)==0&false))) {{
                __CLR4_5_246k46klvluld8y.R.inc(5541);int numOfPairs = IsoTypeReader.readUInt16(chunksCencSampleAuxData);
                __CLR4_5_246k46klvluld8y.R.inc(5542);cadf.pairs = new CencSampleAuxiliaryDataFormat.Pair[numOfPairs];
                __CLR4_5_246k46klvluld8y.R.inc(5543);for (int i = 0; (((i < cadf.pairs.length)&&(__CLR4_5_246k46klvluld8y.R.iget(5544)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5545)==0&false)); i++) {{
                    __CLR4_5_246k46klvluld8y.R.inc(5546);cadf.pairs[i] = cadf.createPair(
                            IsoTypeReader.readUInt16(chunksCencSampleAuxData),
                            IsoTypeReader.readUInt32(chunksCencSampleAuxData));
                }
            }}
        }}
        }__CLR4_5_246k46klvluld8y.R.inc(5547);return cadf;
    }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

    public UUID getDefaultKeyId() {try{__CLR4_5_246k46klvluld8y.R.inc(5548);
        __CLR4_5_246k46klvluld8y.R.inc(5549);return defaultKeyId;
    }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

    public boolean hasSubSampleEncryption() {try{__CLR4_5_246k46klvluld8y.R.inc(5550);
        __CLR4_5_246k46klvluld8y.R.inc(5551);return false;
    }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

    public List<CencSampleAuxiliaryDataFormat> getSampleEncryptionEntries() {try{__CLR4_5_246k46klvluld8y.R.inc(5552);
        __CLR4_5_246k46klvluld8y.R.inc(5553);return sampleEncryptionEntries;
    }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_246k46klvluld8y.R.inc(5554);
        __CLR4_5_246k46klvluld8y.R.inc(5555);return "CencMp4TrackImpl{" +
                "handler='" + getHandler() + '\'' +
                '}';
    }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

    @Override
    public String getName() {try{__CLR4_5_246k46klvluld8y.R.inc(5556);
        __CLR4_5_246k46klvluld8y.R.inc(5557);return "enc(" + super.getName() + ")";
    }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

    private class FindSaioSaizPair {
        private Container container;
        private SampleAuxiliaryInformationSizesBox saiz;
        private SampleAuxiliaryInformationOffsetsBox saio;

        public FindSaioSaizPair(Container container) {try{__CLR4_5_246k46klvluld8y.R.inc(5558);
            __CLR4_5_246k46klvluld8y.R.inc(5559);this.container = container;
        }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

        public SampleAuxiliaryInformationSizesBox getSaiz() {try{__CLR4_5_246k46klvluld8y.R.inc(5560);
            __CLR4_5_246k46klvluld8y.R.inc(5561);return saiz;
        }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

        public SampleAuxiliaryInformationOffsetsBox getSaio() {try{__CLR4_5_246k46klvluld8y.R.inc(5562);
            __CLR4_5_246k46klvluld8y.R.inc(5563);return saio;
        }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}

        public FindSaioSaizPair invoke() {try{__CLR4_5_246k46klvluld8y.R.inc(5564);
            __CLR4_5_246k46klvluld8y.R.inc(5565);List<SampleAuxiliaryInformationSizesBox> saizs = container.getBoxes(SampleAuxiliaryInformationSizesBox.class);
            __CLR4_5_246k46klvluld8y.R.inc(5566);List<SampleAuxiliaryInformationOffsetsBox> saios = container.getBoxes(SampleAuxiliaryInformationOffsetsBox.class);
            assert (((saizs.size() == saios.size())&&(__CLR4_5_246k46klvluld8y.R.iget(5567)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5568)==0&false));
            __CLR4_5_246k46klvluld8y.R.inc(5569);saiz = null;
            __CLR4_5_246k46klvluld8y.R.inc(5570);saio = null;

            __CLR4_5_246k46klvluld8y.R.inc(5571);for (int i = 0; (((i < saizs.size())&&(__CLR4_5_246k46klvluld8y.R.iget(5572)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5573)==0&false)); i++) {{
                __CLR4_5_246k46klvluld8y.R.inc(5574);if ((((saiz == null && (saizs.get(i).getAuxInfoType() == null) || "cenc".equals(saizs.get(i).getAuxInfoType()))&&(__CLR4_5_246k46klvluld8y.R.iget(5575)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5576)==0&false))) {{
                    __CLR4_5_246k46klvluld8y.R.inc(5577);saiz = saizs.get(i);
                } }else {__CLR4_5_246k46klvluld8y.R.inc(5578);if ((((saiz != null && saiz.getAuxInfoType() == null && "cenc".equals(saizs.get(i).getAuxInfoType()))&&(__CLR4_5_246k46klvluld8y.R.iget(5579)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5580)==0&false))) {{
                    __CLR4_5_246k46klvluld8y.R.inc(5581);saiz = saizs.get(i);
                } }else {{
                    __CLR4_5_246k46klvluld8y.R.inc(5582);throw new RuntimeException("Are there two cenc labeled saiz?");
                }
                }}__CLR4_5_246k46klvluld8y.R.inc(5583);if ((((saio == null && (saios.get(i).getAuxInfoType() == null) || "cenc".equals(saios.get(i).getAuxInfoType()))&&(__CLR4_5_246k46klvluld8y.R.iget(5584)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5585)==0&false))) {{
                    __CLR4_5_246k46klvluld8y.R.inc(5586);saio = saios.get(i);
                } }else {__CLR4_5_246k46klvluld8y.R.inc(5587);if ((((saio != null && saio.getAuxInfoType() == null && "cenc".equals(saios.get(i).getAuxInfoType()))&&(__CLR4_5_246k46klvluld8y.R.iget(5588)!=0|true))||(__CLR4_5_246k46klvluld8y.R.iget(5589)==0&false))) {{
                    __CLR4_5_246k46klvluld8y.R.inc(5590);saio = saios.get(i);
                } }else {{
                    __CLR4_5_246k46klvluld8y.R.inc(5591);throw new RuntimeException("Are there two cenc labeled saio?");
                }
            }}}
            }__CLR4_5_246k46klvluld8y.R.inc(5592);return this;
        }finally{__CLR4_5_246k46klvluld8y.R.flushNeeded();}}
    }
}
