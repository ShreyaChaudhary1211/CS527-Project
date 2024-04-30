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


public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {public static class __CLR4_5_2anyanylvluljob{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,13988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected int algorithmId = -1;
    protected int ivSize = -1;
    protected byte[] kid = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    List<CencSampleAuxiliaryDataFormat> entries = Collections.emptyList();

    protected AbstractSampleEncryptionBox(String type) {
        super(type);__CLR4_5_2anyanylvluljob.R.inc(13823);try{__CLR4_5_2anyanylvluljob.R.inc(13822);
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    public int getOffsetToFirstIV() {try{__CLR4_5_2anyanylvluljob.R.inc(13824);
        __CLR4_5_2anyanylvluljob.R.inc(13825);int offset = ((((getSize() > (1l << 32) )&&(__CLR4_5_2anyanylvluljob.R.iget(13826)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13827)==0&false))? 16 : 8);
        __CLR4_5_2anyanylvluljob.R.inc(13828);offset += (((isOverrideTrackEncryptionBoxParameters() )&&(__CLR4_5_2anyanylvluljob.R.iget(13829)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13830)==0&false))? (4 + kid.length) : 0;
        __CLR4_5_2anyanylvluljob.R.inc(13831);offset += 4; //num entries
        __CLR4_5_2anyanylvluljob.R.inc(13832);return offset;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2anyanylvluljob.R.inc(13833);
        __CLR4_5_2anyanylvluljob.R.inc(13834);parseVersionAndFlags(content);

        __CLR4_5_2anyanylvluljob.R.inc(13835);if (((((getFlags() & 0x1) > 0)&&(__CLR4_5_2anyanylvluljob.R.iget(13836)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13837)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13838);algorithmId = IsoTypeReader.readUInt24(content);
            __CLR4_5_2anyanylvluljob.R.inc(13839);ivSize = IsoTypeReader.readUInt8(content);
            __CLR4_5_2anyanylvluljob.R.inc(13840);kid = new byte[16];
            __CLR4_5_2anyanylvluljob.R.inc(13841);content.get(kid);
        }

        }__CLR4_5_2anyanylvluljob.R.inc(13842);long numOfEntries = IsoTypeReader.readUInt32(content);
        __CLR4_5_2anyanylvluljob.R.inc(13843);ByteBuffer parseEight = content.duplicate();
        __CLR4_5_2anyanylvluljob.R.inc(13844);ByteBuffer parseSixteen = content.duplicate();

        __CLR4_5_2anyanylvluljob.R.inc(13845);entries = parseEntries(parseEight, numOfEntries, 8);
        __CLR4_5_2anyanylvluljob.R.inc(13846);if ((((entries == null)&&(__CLR4_5_2anyanylvluljob.R.iget(13847)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13848)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13849);entries = parseEntries(parseSixteen, numOfEntries, 16);
            __CLR4_5_2anyanylvluljob.R.inc(13850);content.position(content.position() + content.remaining() - parseSixteen.remaining());
        } }else {{
            __CLR4_5_2anyanylvluljob.R.inc(13851);content.position(content.position() + content.remaining() - parseEight.remaining());
        }
        }__CLR4_5_2anyanylvluljob.R.inc(13852);if ((((entries == null)&&(__CLR4_5_2anyanylvluljob.R.iget(13853)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13854)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13855);throw new RuntimeException("Cannot parse SampleEncryptionBox");
        }

    }}finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    private List<CencSampleAuxiliaryDataFormat> parseEntries(ByteBuffer content, final long numOfEntries, int ivSize) {try{__CLR4_5_2anyanylvluljob.R.inc(13856);
        __CLR4_5_2anyanylvluljob.R.inc(13857);List<CencSampleAuxiliaryDataFormat> _entries = new ArrayList<CencSampleAuxiliaryDataFormat>();
        __CLR4_5_2anyanylvluljob.R.inc(13858);try {
            __CLR4_5_2anyanylvluljob.R.inc(13859);long remainingNumOfEntries = numOfEntries;
            __CLR4_5_2anyanylvluljob.R.inc(13860);while ((((remainingNumOfEntries-- > 0)&&(__CLR4_5_2anyanylvluljob.R.iget(13861)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13862)==0&false))) {{
                __CLR4_5_2anyanylvluljob.R.inc(13863);CencSampleAuxiliaryDataFormat e = new CencSampleAuxiliaryDataFormat();
                __CLR4_5_2anyanylvluljob.R.inc(13864);e.iv = new byte[ivSize];
                __CLR4_5_2anyanylvluljob.R.inc(13865);content.get(e.iv);
                __CLR4_5_2anyanylvluljob.R.inc(13866);if (((((getFlags() & 0x2) > 0)&&(__CLR4_5_2anyanylvluljob.R.iget(13867)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13868)==0&false))) {{
                    __CLR4_5_2anyanylvluljob.R.inc(13869);int numOfPairs = IsoTypeReader.readUInt16(content);
                    __CLR4_5_2anyanylvluljob.R.inc(13870);e.pairs = new CencSampleAuxiliaryDataFormat.Pair[numOfPairs];
                    __CLR4_5_2anyanylvluljob.R.inc(13871);for (int i = 0; (((i < e.pairs.length)&&(__CLR4_5_2anyanylvluljob.R.iget(13872)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13873)==0&false)); i++) {{
                        __CLR4_5_2anyanylvluljob.R.inc(13874);e.pairs[i] = e.createPair(
                                IsoTypeReader.readUInt16(content),
                                IsoTypeReader.readUInt32(content));
                    }                }}
                }__CLR4_5_2anyanylvluljob.R.inc(13875);_entries.add(e);
            }
        }} catch (BufferUnderflowException bue) {
            __CLR4_5_2anyanylvluljob.R.inc(13876);return null;
        }
        __CLR4_5_2anyanylvluljob.R.inc(13877);return _entries;

    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    public List<CencSampleAuxiliaryDataFormat> getEntries() {try{__CLR4_5_2anyanylvluljob.R.inc(13878);
        __CLR4_5_2anyanylvluljob.R.inc(13879);return entries;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    public void setEntries(List<CencSampleAuxiliaryDataFormat> entries) {try{__CLR4_5_2anyanylvluljob.R.inc(13880);
        __CLR4_5_2anyanylvluljob.R.inc(13881);this.entries = entries;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    @DoNotParseDetail
    public boolean isSubSampleEncryption() {try{__CLR4_5_2anyanylvluljob.R.inc(13882);
        __CLR4_5_2anyanylvluljob.R.inc(13883);return (getFlags() & 0x2) > 0;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    @DoNotParseDetail
    public void setSubSampleEncryption(boolean b) {try{__CLR4_5_2anyanylvluljob.R.inc(13884);
        __CLR4_5_2anyanylvluljob.R.inc(13885);if ((((b)&&(__CLR4_5_2anyanylvluljob.R.iget(13886)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13887)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13888);setFlags(getFlags() | 0x2);
        } }else {{
            __CLR4_5_2anyanylvluljob.R.inc(13889);setFlags(getFlags() & (0xffffff ^ 0x2));
        }
    }}finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    @DoNotParseDetail
    protected boolean isOverrideTrackEncryptionBoxParameters() {try{__CLR4_5_2anyanylvluljob.R.inc(13890);
        __CLR4_5_2anyanylvluljob.R.inc(13891);return (getFlags() & 0x1) > 0;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2anyanylvluljob.R.inc(13892);
        __CLR4_5_2anyanylvluljob.R.inc(13893);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2anyanylvluljob.R.inc(13894);if ((((isOverrideTrackEncryptionBoxParameters())&&(__CLR4_5_2anyanylvluljob.R.iget(13895)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13896)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13897);IsoTypeWriter.writeUInt24(byteBuffer, algorithmId);
            __CLR4_5_2anyanylvluljob.R.inc(13898);IsoTypeWriter.writeUInt8(byteBuffer, ivSize);
            __CLR4_5_2anyanylvluljob.R.inc(13899);byteBuffer.put(kid);
        }
        }__CLR4_5_2anyanylvluljob.R.inc(13900);IsoTypeWriter.writeUInt32(byteBuffer, getNonEmptyEntriesNum());
        __CLR4_5_2anyanylvluljob.R.inc(13901);for (CencSampleAuxiliaryDataFormat entry : entries) {{
            __CLR4_5_2anyanylvluljob.R.inc(13902);if ((((entry.getSize() > 0)&&(__CLR4_5_2anyanylvluljob.R.iget(13903)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13904)==0&false))) {{
                __CLR4_5_2anyanylvluljob.R.inc(13905);if ((((entry.iv.length != 8 && entry.iv.length != 16)&&(__CLR4_5_2anyanylvluljob.R.iget(13906)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13907)==0&false))) {{
                    __CLR4_5_2anyanylvluljob.R.inc(13908);throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
                }__CLR4_5_2anyanylvluljob.R.inc(13909);byteBuffer.put(entry.iv);
                __CLR4_5_2anyanylvluljob.R.inc(13910);if ((((isSubSampleEncryption())&&(__CLR4_5_2anyanylvluljob.R.iget(13911)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13912)==0&false))) {{
                    __CLR4_5_2anyanylvluljob.R.inc(13913);IsoTypeWriter.writeUInt16(byteBuffer, entry.pairs.length);
                    __CLR4_5_2anyanylvluljob.R.inc(13914);for (CencSampleAuxiliaryDataFormat.Pair pair : entry.pairs) {{
                        __CLR4_5_2anyanylvluljob.R.inc(13915);IsoTypeWriter.writeUInt16(byteBuffer, pair.clear());
                        __CLR4_5_2anyanylvluljob.R.inc(13916);IsoTypeWriter.writeUInt32(byteBuffer, pair.encrypted());
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    private int getNonEmptyEntriesNum() {try{__CLR4_5_2anyanylvluljob.R.inc(13917);
        __CLR4_5_2anyanylvluljob.R.inc(13918);int n = 0;
        __CLR4_5_2anyanylvluljob.R.inc(13919);for (CencSampleAuxiliaryDataFormat entry : entries) {{
            __CLR4_5_2anyanylvluljob.R.inc(13920);if ((((entry.getSize() > 0)&&(__CLR4_5_2anyanylvluljob.R.iget(13921)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13922)==0&false))) {{
                __CLR4_5_2anyanylvluljob.R.inc(13923);n++;
            }
        }}

        }__CLR4_5_2anyanylvluljob.R.inc(13924);return n;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2anyanylvluljob.R.inc(13925);
        __CLR4_5_2anyanylvluljob.R.inc(13926);long contentSize = 4;
        __CLR4_5_2anyanylvluljob.R.inc(13927);if ((((isOverrideTrackEncryptionBoxParameters())&&(__CLR4_5_2anyanylvluljob.R.iget(13928)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13929)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13930);contentSize += 4;
            __CLR4_5_2anyanylvluljob.R.inc(13931);contentSize += kid.length;
        }
        }__CLR4_5_2anyanylvluljob.R.inc(13932);contentSize += 4;
        __CLR4_5_2anyanylvluljob.R.inc(13933);for (CencSampleAuxiliaryDataFormat entry : entries) {{
            __CLR4_5_2anyanylvluljob.R.inc(13934);contentSize += entry.getSize();
        }
        }__CLR4_5_2anyanylvluljob.R.inc(13935);return contentSize;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    @Override
    public void getBox(WritableByteChannel os) throws IOException {try{__CLR4_5_2anyanylvluljob.R.inc(13936);
        __CLR4_5_2anyanylvluljob.R.inc(13937);super.getBox(os);
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2anyanylvluljob.R.inc(13938);
        __CLR4_5_2anyanylvluljob.R.inc(13939);if ((((this == o)&&(__CLR4_5_2anyanylvluljob.R.iget(13940)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13941)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13942);return true;
        }
        }__CLR4_5_2anyanylvluljob.R.inc(13943);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2anyanylvluljob.R.iget(13944)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13945)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13946);return false;
        }

        }__CLR4_5_2anyanylvluljob.R.inc(13947);AbstractSampleEncryptionBox that = (AbstractSampleEncryptionBox) o;

        __CLR4_5_2anyanylvluljob.R.inc(13948);if ((((algorithmId != that.algorithmId)&&(__CLR4_5_2anyanylvluljob.R.iget(13949)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13950)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13951);return false;
        }
        }__CLR4_5_2anyanylvluljob.R.inc(13952);if ((((ivSize != that.ivSize)&&(__CLR4_5_2anyanylvluljob.R.iget(13953)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13954)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13955);return false;
        }
        }__CLR4_5_2anyanylvluljob.R.inc(13956);if (((((((entries != null )&&(__CLR4_5_2anyanylvluljob.R.iget(13957)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13958)==0&false))? !entries.equals(that.entries) : that.entries != null)&&(__CLR4_5_2anyanylvluljob.R.iget(13959)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13960)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13961);return false;
        }
        }__CLR4_5_2anyanylvluljob.R.inc(13962);if ((((!Arrays.equals(kid, that.kid))&&(__CLR4_5_2anyanylvluljob.R.iget(13963)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13964)==0&false))) {{
            __CLR4_5_2anyanylvluljob.R.inc(13965);return false;
        }

        }__CLR4_5_2anyanylvluljob.R.inc(13966);return true;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2anyanylvluljob.R.inc(13967);
        __CLR4_5_2anyanylvluljob.R.inc(13968);int result = algorithmId;
        __CLR4_5_2anyanylvluljob.R.inc(13969);result = 31 * result + ivSize;
        __CLR4_5_2anyanylvluljob.R.inc(13970);result = 31 * result + ((((kid != null )&&(__CLR4_5_2anyanylvluljob.R.iget(13971)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13972)==0&false))? Arrays.hashCode(kid) : 0);
        __CLR4_5_2anyanylvluljob.R.inc(13973);result = 31 * result + ((((entries != null )&&(__CLR4_5_2anyanylvluljob.R.iget(13974)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13975)==0&false))? entries.hashCode() : 0);
        __CLR4_5_2anyanylvluljob.R.inc(13976);return result;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}

    public List<Short> getEntrySizes() {try{__CLR4_5_2anyanylvluljob.R.inc(13977);
        __CLR4_5_2anyanylvluljob.R.inc(13978);List<Short> entrySizes = new ArrayList<Short>(entries.size());
        __CLR4_5_2anyanylvluljob.R.inc(13979);for (CencSampleAuxiliaryDataFormat entry : entries) {{
            __CLR4_5_2anyanylvluljob.R.inc(13980);short size = (short) entry.iv.length;
            __CLR4_5_2anyanylvluljob.R.inc(13981);if ((((isSubSampleEncryption())&&(__CLR4_5_2anyanylvluljob.R.iget(13982)!=0|true))||(__CLR4_5_2anyanylvluljob.R.iget(13983)==0&false))) {{
                __CLR4_5_2anyanylvluljob.R.inc(13984);size += 2; //numPairs
                __CLR4_5_2anyanylvluljob.R.inc(13985);size += entry.pairs.length * 6;
            }
            }__CLR4_5_2anyanylvluljob.R.inc(13986);entrySizes.add(size);
        }
        }__CLR4_5_2anyanylvluljob.R.inc(13987);return entrySizes;
    }finally{__CLR4_5_2anyanylvluljob.R.flushNeeded();}}
}
