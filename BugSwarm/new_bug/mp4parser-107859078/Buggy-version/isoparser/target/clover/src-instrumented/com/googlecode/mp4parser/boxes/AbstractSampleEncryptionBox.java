/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.mp4parser.iso23001.part7.CencSampleAuxiliaryDataFormat;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {public static class __CLR4_5_2albalblvl9ej9y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,13893,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected int algorithmId = -1;
    protected int ivSize = -1;
    protected byte[] kid = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    List<CencSampleAuxiliaryDataFormat> entries = Collections.emptyList();

    protected AbstractSampleEncryptionBox(String type) {
        super(type);__CLR4_5_2albalblvl9ej9y.R.inc(13728);try{__CLR4_5_2albalblvl9ej9y.R.inc(13727);
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    public int getOffsetToFirstIV() {try{__CLR4_5_2albalblvl9ej9y.R.inc(13729);
        __CLR4_5_2albalblvl9ej9y.R.inc(13730);int offset = ((((getSize() > (1l << 32) )&&(__CLR4_5_2albalblvl9ej9y.R.iget(13731)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13732)==0&false))? 16 : 8);
        __CLR4_5_2albalblvl9ej9y.R.inc(13733);offset += (((isOverrideTrackEncryptionBoxParameters() )&&(__CLR4_5_2albalblvl9ej9y.R.iget(13734)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13735)==0&false))? (4 + kid.length) : 0;
        __CLR4_5_2albalblvl9ej9y.R.inc(13736);offset += 4; //num entries
        __CLR4_5_2albalblvl9ej9y.R.inc(13737);return offset;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2albalblvl9ej9y.R.inc(13738);
        __CLR4_5_2albalblvl9ej9y.R.inc(13739);parseVersionAndFlags(content);

        __CLR4_5_2albalblvl9ej9y.R.inc(13740);if (((((getFlags() & 0x1) > 0)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13741)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13742)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13743);algorithmId = IsoTypeReader.readUInt24(content);
            __CLR4_5_2albalblvl9ej9y.R.inc(13744);ivSize = IsoTypeReader.readUInt8(content);
            __CLR4_5_2albalblvl9ej9y.R.inc(13745);kid = new byte[16];
            __CLR4_5_2albalblvl9ej9y.R.inc(13746);content.get(kid);
        }

        }__CLR4_5_2albalblvl9ej9y.R.inc(13747);long numOfEntries = IsoTypeReader.readUInt32(content);
        __CLR4_5_2albalblvl9ej9y.R.inc(13748);ByteBuffer parseEight = content.duplicate();
        __CLR4_5_2albalblvl9ej9y.R.inc(13749);ByteBuffer parseSixteen = content.duplicate();

        __CLR4_5_2albalblvl9ej9y.R.inc(13750);entries = parseEntries(parseEight, numOfEntries, 8);
        __CLR4_5_2albalblvl9ej9y.R.inc(13751);if ((((entries == null)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13752)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13753)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13754);entries = parseEntries(parseSixteen, numOfEntries, 16);
            __CLR4_5_2albalblvl9ej9y.R.inc(13755);content.position(content.position() + content.remaining() - parseSixteen.remaining());
        } }else {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13756);content.position(content.position() + content.remaining() - parseEight.remaining());
        }
        }__CLR4_5_2albalblvl9ej9y.R.inc(13757);if ((((entries == null)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13758)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13759)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13760);throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }

    }}finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    private List<CencSampleAuxiliaryDataFormat> parseEntries(ByteBuffer content, final long numOfEntries, int ivSize) {try{__CLR4_5_2albalblvl9ej9y.R.inc(13761);
        __CLR4_5_2albalblvl9ej9y.R.inc(13762);List<CencSampleAuxiliaryDataFormat> _entries = new ArrayList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2albalblvl9ej9y.R.inc(13763);try {
            __CLR4_5_2albalblvl9ej9y.R.inc(13764);long remainingNumOfEntries = numOfEntries;
            __CLR4_5_2albalblvl9ej9y.R.inc(13765);while ((((remainingNumOfEntries-- > 0)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13766)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13767)==0&false))) {{
                __CLR4_5_2albalblvl9ej9y.R.inc(13768);CencSampleAuxiliaryDataFormat e = new CencSampleAuxiliaryDataFormat();
                __CLR4_5_2albalblvl9ej9y.R.inc(13769);e.iv = new byte[ivSize];
                __CLR4_5_2albalblvl9ej9y.R.inc(13770);content.get(e.iv);
                __CLR4_5_2albalblvl9ej9y.R.inc(13771);if (((((getFlags() & 0x2) > 0)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13772)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13773)==0&false))) {{
                    __CLR4_5_2albalblvl9ej9y.R.inc(13774);int numOfPairs = IsoTypeReader.readUInt16(content);
                    __CLR4_5_2albalblvl9ej9y.R.inc(13775);e.pairs = new CencSampleAuxiliaryDataFormat.Pair[numOfPairs];
                    __CLR4_5_2albalblvl9ej9y.R.inc(13776);for (int i = 0; (((i < e.pairs.length)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13777)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13778)==0&false)); i++) {{
                        __CLR4_5_2albalblvl9ej9y.R.inc(13779);e.pairs[i] = e.createPair(
                                IsoTypeReader.readUInt16(content),
                                IsoTypeReader.readUInt32(content));
                    }                }}
                }__CLR4_5_2albalblvl9ej9y.R.inc(13780);_entries.add(e);
            }
        }} catch (BufferUnderflowException bue) {
            __CLR4_5_2albalblvl9ej9y.R.inc(13781);return null;
        }
        __CLR4_5_2albalblvl9ej9y.R.inc(13782);return _entries;

    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    public List<CencSampleAuxiliaryDataFormat> getEntries() {try{__CLR4_5_2albalblvl9ej9y.R.inc(13783);
        __CLR4_5_2albalblvl9ej9y.R.inc(13784);return entries;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    public void setEntries(List<CencSampleAuxiliaryDataFormat> entries) {try{__CLR4_5_2albalblvl9ej9y.R.inc(13785);
        __CLR4_5_2albalblvl9ej9y.R.inc(13786);this.entries = entries;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    @DoNotParseDetail
    public boolean isSubSampleEncryption() {try{__CLR4_5_2albalblvl9ej9y.R.inc(13787);
        __CLR4_5_2albalblvl9ej9y.R.inc(13788);return (getFlags() & 0x2) > 0;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    @DoNotParseDetail
    public void setSubSampleEncryption(boolean b) {try{__CLR4_5_2albalblvl9ej9y.R.inc(13789);
        __CLR4_5_2albalblvl9ej9y.R.inc(13790);if ((((b)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13791)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13792)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13793);setFlags(getFlags() | 0x2);
        } }else {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13794);setFlags(getFlags() & (0xffffff ^ 0x2));
        }
    }}finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    @DoNotParseDetail
    protected boolean isOverrideTrackEncryptionBoxParameters() {try{__CLR4_5_2albalblvl9ej9y.R.inc(13795);
        __CLR4_5_2albalblvl9ej9y.R.inc(13796);return (getFlags() & 0x1) > 0;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2albalblvl9ej9y.R.inc(13797);
        __CLR4_5_2albalblvl9ej9y.R.inc(13798);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2albalblvl9ej9y.R.inc(13799);if ((((isOverrideTrackEncryptionBoxParameters())&&(__CLR4_5_2albalblvl9ej9y.R.iget(13800)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13801)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13802);IsoTypeWriter.writeUInt24(byteBuffer, algorithmId);
            __CLR4_5_2albalblvl9ej9y.R.inc(13803);IsoTypeWriter.writeUInt8(byteBuffer, ivSize);
            __CLR4_5_2albalblvl9ej9y.R.inc(13804);byteBuffer.put(kid);
        }
        }__CLR4_5_2albalblvl9ej9y.R.inc(13805);IsoTypeWriter.writeUInt32(byteBuffer, getNonEmptyEntriesNum());
        __CLR4_5_2albalblvl9ej9y.R.inc(13806);for (CencSampleAuxiliaryDataFormat entry : entries) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13807);if ((((entry.getSize() > 0)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13808)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13809)==0&false))) {{
                __CLR4_5_2albalblvl9ej9y.R.inc(13810);if ((((entry.iv.length != 8 && entry.iv.length != 16)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13811)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13812)==0&false))) {{
                    __CLR4_5_2albalblvl9ej9y.R.inc(13813);throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
                }__CLR4_5_2albalblvl9ej9y.R.inc(13814);byteBuffer.put(entry.iv);
                __CLR4_5_2albalblvl9ej9y.R.inc(13815);if ((((isSubSampleEncryption())&&(__CLR4_5_2albalblvl9ej9y.R.iget(13816)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13817)==0&false))) {{
                    __CLR4_5_2albalblvl9ej9y.R.inc(13818);IsoTypeWriter.writeUInt16(byteBuffer, entry.pairs.length);
                    __CLR4_5_2albalblvl9ej9y.R.inc(13819);for (CencSampleAuxiliaryDataFormat.Pair pair : entry.pairs) {{
                        __CLR4_5_2albalblvl9ej9y.R.inc(13820);IsoTypeWriter.writeUInt16(byteBuffer, pair.clear());
                        __CLR4_5_2albalblvl9ej9y.R.inc(13821);IsoTypeWriter.writeUInt32(byteBuffer, pair.encrypted());
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    private int getNonEmptyEntriesNum() {try{__CLR4_5_2albalblvl9ej9y.R.inc(13822);
        __CLR4_5_2albalblvl9ej9y.R.inc(13823);int n = 0;
        __CLR4_5_2albalblvl9ej9y.R.inc(13824);for (CencSampleAuxiliaryDataFormat entry : entries) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13825);if ((((entry.getSize() > 0)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13826)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13827)==0&false))) {{
                __CLR4_5_2albalblvl9ej9y.R.inc(13828);n++;
            }
        }}

        }__CLR4_5_2albalblvl9ej9y.R.inc(13829);return n;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2albalblvl9ej9y.R.inc(13830);
        __CLR4_5_2albalblvl9ej9y.R.inc(13831);long contentSize = 4;
        __CLR4_5_2albalblvl9ej9y.R.inc(13832);if ((((isOverrideTrackEncryptionBoxParameters())&&(__CLR4_5_2albalblvl9ej9y.R.iget(13833)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13834)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13835);contentSize += 4;
            __CLR4_5_2albalblvl9ej9y.R.inc(13836);contentSize += kid.length;
        }
        }__CLR4_5_2albalblvl9ej9y.R.inc(13837);contentSize += 4;
        __CLR4_5_2albalblvl9ej9y.R.inc(13838);for (CencSampleAuxiliaryDataFormat entry : entries) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13839);contentSize += entry.getSize();
        }
        }__CLR4_5_2albalblvl9ej9y.R.inc(13840);return contentSize;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel os) throws IOException {try{__CLR4_5_2albalblvl9ej9y.R.inc(13841);
        __CLR4_5_2albalblvl9ej9y.R.inc(13842);super.getBox(os);
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2albalblvl9ej9y.R.inc(13843);
        __CLR4_5_2albalblvl9ej9y.R.inc(13844);if ((((this == o)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13845)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13846)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13847);return true;
        }
        }__CLR4_5_2albalblvl9ej9y.R.inc(13848);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2albalblvl9ej9y.R.iget(13849)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13850)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13851);return false;
        }

        }__CLR4_5_2albalblvl9ej9y.R.inc(13852);AbstractSampleEncryptionBox that = (AbstractSampleEncryptionBox) o;

        __CLR4_5_2albalblvl9ej9y.R.inc(13853);if ((((algorithmId != that.algorithmId)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13854)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13855)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13856);return false;
        }
        }__CLR4_5_2albalblvl9ej9y.R.inc(13857);if ((((ivSize != that.ivSize)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13858)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13859)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13860);return false;
        }
        }__CLR4_5_2albalblvl9ej9y.R.inc(13861);if (((((((entries != null )&&(__CLR4_5_2albalblvl9ej9y.R.iget(13862)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13863)==0&false))? !entries.equals(that.entries) : that.entries != null)&&(__CLR4_5_2albalblvl9ej9y.R.iget(13864)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13865)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13866);return false;
        }
        }__CLR4_5_2albalblvl9ej9y.R.inc(13867);if ((((!Arrays.equals(kid, that.kid))&&(__CLR4_5_2albalblvl9ej9y.R.iget(13868)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13869)==0&false))) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13870);return false;
        }

        }__CLR4_5_2albalblvl9ej9y.R.inc(13871);return true;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2albalblvl9ej9y.R.inc(13872);
        __CLR4_5_2albalblvl9ej9y.R.inc(13873);int result = algorithmId;
        __CLR4_5_2albalblvl9ej9y.R.inc(13874);result = 31 * result + ivSize;
        __CLR4_5_2albalblvl9ej9y.R.inc(13875);result = 31 * result + ((((kid != null )&&(__CLR4_5_2albalblvl9ej9y.R.iget(13876)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13877)==0&false))? Arrays.hashCode(kid) : 0);
        __CLR4_5_2albalblvl9ej9y.R.inc(13878);result = 31 * result + ((((entries != null )&&(__CLR4_5_2albalblvl9ej9y.R.iget(13879)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13880)==0&false))? entries.hashCode() : 0);
        __CLR4_5_2albalblvl9ej9y.R.inc(13881);return result;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}

    public List<Short> getEntrySizes() {try{__CLR4_5_2albalblvl9ej9y.R.inc(13882);
        __CLR4_5_2albalblvl9ej9y.R.inc(13883);List<Short> entrySizes = new ArrayList<Short>(entries.size());
        __CLR4_5_2albalblvl9ej9y.R.inc(13884);for (CencSampleAuxiliaryDataFormat entry : entries) {{
            __CLR4_5_2albalblvl9ej9y.R.inc(13885);short size = (short) entry.iv.length;
            __CLR4_5_2albalblvl9ej9y.R.inc(13886);if ((((isSubSampleEncryption())&&(__CLR4_5_2albalblvl9ej9y.R.iget(13887)!=0|true))||(__CLR4_5_2albalblvl9ej9y.R.iget(13888)==0&false))) {{
                __CLR4_5_2albalblvl9ej9y.R.inc(13889);size += 2; //numPairs
                __CLR4_5_2albalblvl9ej9y.R.inc(13890);size += entry.pairs.length * 6;
            }
            }__CLR4_5_2albalblvl9ej9y.R.inc(13891);entrySizes.add(size);
        }
        }__CLR4_5_2albalblvl9ej9y.R.inc(13892);return entrySizes;
    }finally{__CLR4_5_2albalblvl9ej9y.R.flushNeeded();}}
}
