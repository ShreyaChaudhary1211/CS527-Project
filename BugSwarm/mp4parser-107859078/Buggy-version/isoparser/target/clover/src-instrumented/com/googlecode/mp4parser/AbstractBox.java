/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2012 Sebastian Annies, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an AS IS BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import com.googlecode.mp4parser.util.Logger;
import com.googlecode.mp4parser.util.Path;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * A basic on-demand parsing box. Requires the implementation of three methods to become a fully working box:
 * <ol>
 * <li>{@link #_parseDetails(java.nio.ByteBuffer)}</li>
 * <li>{@link #getContent(java.nio.ByteBuffer)}</li>
 * <li>{@link #getContentSize()}</li>
 * </ol>
 * additionally this new box has to be put into the <code>isoparser-default.properties</code> file so that
 * it is accessible by the <code>PropertyBoxParserImpl</code>
 */
public abstract class AbstractBox implements Box {public static class __CLR4_5_23mt3mtlvl9efvf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,4860,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static Logger LOG = Logger.getLogger(AbstractBox.class);

    protected String type;
    private byte[] userType;
    private Container parent;
    boolean isParsed;


    private ByteBuffer content;

    long offset;
    DataSource dataSource;

    private ByteBuffer deadBytes = null;

    public long getOffset() {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4709);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4710);return offset;
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    protected AbstractBox(String type) {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4711);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4712);this.type = type;
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4713);isParsed = true;
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    protected AbstractBox(String type, byte[] userType) {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4714);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4715);this.type = type;
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4716);this.userType = userType;
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4717);isParsed = true;
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    /**
     * Get the box's content size without its header. This must be the exact number of bytes
     * that <code>getContent(ByteBuffer)</code> writes.
     *
     * @return Gets the box's content size in bytes
     * @see #getContent(java.nio.ByteBuffer)
     */
    protected abstract long getContentSize();

    /**
     * Write the box's content into the given <code>ByteBuffer</code>. This must include flags
     * and version in case of a full box. <code>byteBuffer</code> has been initialized with
     * <code>getSize()</code> bytes.
     *
     * @param byteBuffer the sink for the box's content
     */
    protected abstract void getContent(ByteBuffer byteBuffer);

    /**
     * Parse the box's fields and child boxes if any.
     *
     * @param content the box's raw content beginning after the 4-cc field.
     */
    protected abstract void _parseDetails(ByteBuffer content);

    /**
     * {@inheritDoc}
     */
    @DoNotParseDetail
    public void parse(DataSource dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4718);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4719);this.offset = dataSource.position() - header.remaining();
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4720);this.dataSource = dataSource;

        __CLR4_5_23mt3mtlvl9efvf.R.inc(4721);content = ByteBuffer.allocate(l2i(contentSize));
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4722);while ((((content.remaining() > 0)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4723)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4724)==0&false))) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4725);dataSource.read(content);
        }
        }__CLR4_5_23mt3mtlvl9efvf.R.inc(4726);content.position(0);

        __CLR4_5_23mt3mtlvl9efvf.R.inc(4727);isParsed = false;

    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    public void getBox(WritableByteChannel os) throws IOException {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4728);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4729);if ((((isParsed)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4730)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4731)==0&false))) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4732);ByteBuffer bb = ByteBuffer.allocate(l2i(getSize()));
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4733);getHeader(bb);
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4734);getContent(bb);
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4735);if ((((deadBytes != null)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4736)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4737)==0&false))) {{
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4738);deadBytes.rewind();
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4739);while ((((deadBytes.remaining() > 0)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4740)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4741)==0&false))) {{
                    __CLR4_5_23mt3mtlvl9efvf.R.inc(4742);bb.put(deadBytes);
                }
            }}
            }__CLR4_5_23mt3mtlvl9efvf.R.inc(4743);os.write((ByteBuffer) bb.rewind());
        } }else {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4744);ByteBuffer header = ByteBuffer.allocate(((((isSmallBox() )&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4745)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4746)==0&false))? 8 : 16) + ((((UserBox.TYPE.equals(getType()) )&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4747)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4748)==0&false))? 16 : 0));
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4749);getHeader(header);
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4750);os.write((ByteBuffer) header.rewind());
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4751);os.write((ByteBuffer) content.position(0));
        }


    }}finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}


    /**
     * Parses the raw content of the box. It surrounds the actual parsing
     * which is done
     */
    public synchronized final void parseDetails() {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4752);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4753);LOG.logDebug("parsing details of " + this.getType());
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4754);if ((((content != null)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4755)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4756)==0&false))) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4757);ByteBuffer content = this.content;
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4758);isParsed = true;
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4759);content.rewind();
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4760);_parseDetails(content);
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4761);if ((((content.remaining() > 0)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4762)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4763)==0&false))) {{
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4764);deadBytes = content.slice();
            }
            }__CLR4_5_23mt3mtlvl9efvf.R.inc(4765);this.content = null;
            assert (((verify(content))&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4766)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4767)==0&false));
        }
    }}finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}


    /**
     * Gets the full size of the box including header and content.
     *
     * @return the box's size
     */
    public long getSize() {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4768);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4769);long size = (((isParsed )&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4770)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4771)==0&false))? getContentSize() : (((content != null )&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4772)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4773)==0&false))? content.limit() : 0;
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4774);size += (8 + // size|type
                ((((size >= ((1L << 32) - 8) )&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4775)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4776)==0&false))? 8 : 0) + // 32bit - 8 byte size and type
                ((((UserBox.TYPE.equals(getType()) )&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4777)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4778)==0&false))? 16 : 0));
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4779);size += ((((deadBytes == null )&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4780)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4781)==0&false))? 0 : deadBytes.limit());
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4782);return size;
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    @DoNotParseDetail
    public String getType() {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4783);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4784);return type;
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    @DoNotParseDetail
    public byte[] getUserType() {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4785);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4786);return userType;
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    @DoNotParseDetail
    public Container getParent() {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4787);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4788);return parent;
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    @DoNotParseDetail
    public void setParent(Container parent) {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4789);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4790);this.parent = parent;
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    /**
     * Check if details are parsed.
     *
     * @return <code>true</code> whenever the content <code>ByteBuffer</code> is not <code>null</code>
     */
    public boolean isParsed() {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4791);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4792);return isParsed;
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}


    /**
     * Verifies that a box can be reconstructed byte-exact after parsing.
     *
     * @param content the raw content of the box
     * @return <code>true</code> if raw content exactly matches the reconstructed content
     */
    private boolean verify(ByteBuffer content) {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4793);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4794);ByteBuffer bb = ByteBuffer.allocate(l2i(getContentSize() + ((((deadBytes != null )&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4795)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4796)==0&false))? deadBytes.limit() : 0)));
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4797);getContent(bb);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4798);if ((((deadBytes != null)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4799)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4800)==0&false))) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4801);deadBytes.rewind();
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4802);while ((((deadBytes.remaining() > 0)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4803)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4804)==0&false))) {{
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4805);bb.put(deadBytes);
            }
        }}
        }__CLR4_5_23mt3mtlvl9efvf.R.inc(4806);content.rewind();
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4807);bb.rewind();


        __CLR4_5_23mt3mtlvl9efvf.R.inc(4808);if ((((content.remaining() != bb.remaining())&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4809)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4810)==0&false))) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4811);System.err.print(this.getType() + ": remaining differs " + content.remaining() + " vs. " + bb.remaining());
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4812);LOG.logError(this.getType() + ": remaining differs " + content.remaining() + " vs. " + bb.remaining());
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4813);return false;
        }
        }__CLR4_5_23mt3mtlvl9efvf.R.inc(4814);int p = content.position();
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4815);for (int i = content.limit() - 1, j = bb.limit() - 1; (((i >= p)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4816)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4817)==0&false)); i--, j--) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4818);byte v1 = content.get(i);
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4819);byte v2 = bb.get(j);
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4820);if ((((v1 != v2)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4821)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4822)==0&false))) {{
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4823);LOG.logError(String.format("%s: buffers differ at %d: %2X/%2X", this.getType(), i, v1, v2));
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4824);byte[] b1 = new byte[content.remaining()];
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4825);byte[] b2 = new byte[bb.remaining()];
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4826);content.get(b1);
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4827);bb.get(b2);
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4828);System.err.println("original      : " + Hex.encodeHex(b1, 4));
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4829);System.err.println("reconstructed : " + Hex.encodeHex(b2, 4));
                __CLR4_5_23mt3mtlvl9efvf.R.inc(4830);return false;
            }
        }}
        }__CLR4_5_23mt3mtlvl9efvf.R.inc(4831);return true;

    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    private boolean isSmallBox() {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4832);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4833);int baseSize = 8;
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4834);if ((((UserBox.TYPE.equals(getType()))&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4835)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4836)==0&false))) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4837);baseSize += 16;
        }
        }__CLR4_5_23mt3mtlvl9efvf.R.inc(4838);if ((((isParsed)&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4839)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4840)==0&false))) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4841);return (getContentSize() + ((((deadBytes != null )&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4842)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4843)==0&false))? deadBytes.limit() : 0) + baseSize) < (1L << 32);
        } }else {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4844);return content.limit() + baseSize < (1L << 32);
        }
    }}finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    private void getHeader(ByteBuffer byteBuffer) {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4845);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4846);if ((((isSmallBox())&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4847)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4848)==0&false))) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4849);IsoTypeWriter.writeUInt32(byteBuffer, this.getSize());
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4850);byteBuffer.put(IsoFile.fourCCtoBytes(getType()));
        } }else {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4851);IsoTypeWriter.writeUInt32(byteBuffer, 1);
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4852);byteBuffer.put(IsoFile.fourCCtoBytes(getType()));
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4853);IsoTypeWriter.writeUInt64(byteBuffer, getSize());
        }
        }__CLR4_5_23mt3mtlvl9efvf.R.inc(4854);if ((((UserBox.TYPE.equals(getType()))&&(__CLR4_5_23mt3mtlvl9efvf.R.iget(4855)!=0|true))||(__CLR4_5_23mt3mtlvl9efvf.R.iget(4856)==0&false))) {{
            __CLR4_5_23mt3mtlvl9efvf.R.inc(4857);byteBuffer.put(getUserType());
        }
    }}finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}

    @DoNotParseDetail
    public String getPath() {try{__CLR4_5_23mt3mtlvl9efvf.R.inc(4858);
        __CLR4_5_23mt3mtlvl9efvf.R.inc(4859);return Path.createPath(this);
    }finally{__CLR4_5_23mt3mtlvl9efvf.R.flushNeeded();}}
}
