/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
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

package com.googlecode.mp4parser.boxes.microsoft;


import com.googlecode.mp4parser.AbstractBox;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Vector;


/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Windows Media Xtra Box.
 *
 * I can't find definitive documentation on this from Microsoft so it's cobbled together from
 * various sources. Mostly ExifTool for Perl.
 *
 * Various references:
 * https://msdn.microsoft.com/en-us/library/windows/desktop/dd743066(v=vs.85).aspx
 * https://metacpan.org/source/EXIFTOOL/Image-ExifTool-9.76/lib/Image/ExifTool/Microsoft.pm
 * http://www.ventismedia.com/mantis/view.php?id=12017
 * http://www.hydrogenaudio.org/forums/index.php?showtopic=75123&amp;st=250
 * http://www.mediamonkey.com/forum/viewtopic.php?f=1&amp;t=76321
 * https://code.google.com/p/mp4v2/issues/detail?id=113
 *
 * @author marwatk
 */

@java.lang.SuppressWarnings({"fallthrough"}) public class XtraBox extends AbstractBox {public static class __CLR4_5_2c2sc2slvlull05{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,15963,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "Xtra";

    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;

    private boolean successfulParse = false;

    Vector<XtraTag> tags = new Vector<XtraTag>();

    ByteBuffer data;

    public XtraBox() {
        super("Xtra");__CLR4_5_2c2sc2slvlull05.R.inc(15653);try{__CLR4_5_2c2sc2slvlull05.R.inc(15652);

    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    public XtraBox(String type) {
        super(type);__CLR4_5_2c2sc2slvlull05.R.inc(15655);try{__CLR4_5_2c2sc2slvlull05.R.inc(15654);
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15656);
        __CLR4_5_2c2sc2slvlull05.R.inc(15657);if ((((successfulParse)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15658)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15659)==0&false))) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15660);return detailSize();
        } }else {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15661);return data.limit();
        }
    }}finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    private int detailSize() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15662);
        __CLR4_5_2c2sc2slvlull05.R.inc(15663);int size = 0;
        __CLR4_5_2c2sc2slvlull05.R.inc(15664);for (int i = 0; (((i < tags.size())&&(__CLR4_5_2c2sc2slvlull05.R.iget(15665)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15666)==0&false)); i++) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15667);size += tags.elementAt(i).getContentSize();
        }
        }__CLR4_5_2c2sc2slvlull05.R.inc(15668);return size;

    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15669);
        __CLR4_5_2c2sc2slvlull05.R.inc(15670);if ((((!this.isParsed())&&(__CLR4_5_2c2sc2slvlull05.R.iget(15671)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15672)==0&false))) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15673);this.parseDetails();
        }
        }__CLR4_5_2c2sc2slvlull05.R.inc(15674);StringBuffer b = new StringBuffer();
        __CLR4_5_2c2sc2slvlull05.R.inc(15675);b.append("XtraBox[");
        __CLR4_5_2c2sc2slvlull05.R.inc(15676);for (XtraTag tag : tags) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15677);for (XtraValue value : tag.values) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15678);b.append(tag.tagName);
                __CLR4_5_2c2sc2slvlull05.R.inc(15679);b.append("=");
                __CLR4_5_2c2sc2slvlull05.R.inc(15680);b.append(value.toString());
                __CLR4_5_2c2sc2slvlull05.R.inc(15681);b.append(";");
            }
        }}
        }__CLR4_5_2c2sc2slvlull05.R.inc(15682);b.append("]");
        __CLR4_5_2c2sc2slvlull05.R.inc(15683);return b.toString();
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}


    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15684);
        __CLR4_5_2c2sc2slvlull05.R.inc(15685);int boxSize = content.remaining();
        __CLR4_5_2c2sc2slvlull05.R.inc(15686);data = content.slice(); //Keep this in case we fail to parse
        __CLR4_5_2c2sc2slvlull05.R.inc(15687);successfulParse = false;
        __CLR4_5_2c2sc2slvlull05.R.inc(15688);try {
            __CLR4_5_2c2sc2slvlull05.R.inc(15689);tags.clear();
            __CLR4_5_2c2sc2slvlull05.R.inc(15690);while ((((content.remaining() > 0)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15691)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15692)==0&false))) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15693);XtraTag tag = new XtraTag();
                __CLR4_5_2c2sc2slvlull05.R.inc(15694);tag.parse(content);
                __CLR4_5_2c2sc2slvlull05.R.inc(15695);tags.addElement(tag);
            }
            }__CLR4_5_2c2sc2slvlull05.R.inc(15696);int calcSize = detailSize();
            __CLR4_5_2c2sc2slvlull05.R.inc(15697);if ((((boxSize != calcSize)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15698)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15699)==0&false))) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15700);throw new RuntimeException("Improperly handled Xtra tag: Calculated sizes don't match ( " + boxSize + "/" + calcSize + ")");
            }
            }__CLR4_5_2c2sc2slvlull05.R.inc(15701);successfulParse = true;
        } catch (Exception e) {
            __CLR4_5_2c2sc2slvlull05.R.inc(15702);successfulParse = false;
            __CLR4_5_2c2sc2slvlull05.R.inc(15703);System.err.println("Malformed Xtra Tag detected: " + e.toString());
            __CLR4_5_2c2sc2slvlull05.R.inc(15704);e.printStackTrace();
            __CLR4_5_2c2sc2slvlull05.R.inc(15705);content.position(content.position() + content.remaining());
        } finally {
            __CLR4_5_2c2sc2slvlull05.R.inc(15706);content.order(ByteOrder.BIG_ENDIAN); //Just in case we bailed out mid-parse we don't want to leave the byte order in MS land
        }
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15707);
        __CLR4_5_2c2sc2slvlull05.R.inc(15708);if ((((successfulParse)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15709)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15710)==0&false))) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15711);for (int i = 0; (((i < tags.size())&&(__CLR4_5_2c2sc2slvlull05.R.iget(15712)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15713)==0&false)); i++) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15714);tags.elementAt(i).getContent(byteBuffer);
            }
        }} }else {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15715);data.rewind();
            __CLR4_5_2c2sc2slvlull05.R.inc(15716);byteBuffer.put(data);
        }
    }}finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    /**
     * Returns a list of the tag names present in this Xtra Box
     *
     * @return Possibly empty (zero length) array of tag names present
     */
    public String[] getAllTagNames() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15717);
        __CLR4_5_2c2sc2slvlull05.R.inc(15718);String names[] = new String[tags.size()];
        __CLR4_5_2c2sc2slvlull05.R.inc(15719);for (int i = 0; (((i < tags.size())&&(__CLR4_5_2c2sc2slvlull05.R.iget(15720)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15721)==0&false)); i++) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15722);XtraTag tag = tags.elementAt(i);
            __CLR4_5_2c2sc2slvlull05.R.inc(15723);names[i] = tag.tagName;
        }
        }__CLR4_5_2c2sc2slvlull05.R.inc(15724);return names;
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    /**
     * Returns the first String value found for this tag
     *
     * @param name Tag name
     * @return First String value found
     */
    public String getFirstStringValue(String name) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15725);
        __CLR4_5_2c2sc2slvlull05.R.inc(15726);Object objs[] = getValues(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15727);for (Object obj : objs) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15728);if ((((obj instanceof String)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15729)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15730)==0&false))) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15731);return (String) obj;
            }
        }}
        }__CLR4_5_2c2sc2slvlull05.R.inc(15732);return null;
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}


    /**
     * Returns the first Date value found for this tag
     *
     * @param name Tag name
     * @return First Date value found
     */
    public Date getFirstDateValue(String name) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15733);
        __CLR4_5_2c2sc2slvlull05.R.inc(15734);Object objs[] = getValues(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15735);for (Object obj : objs) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15736);if ((((obj instanceof Date)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15737)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15738)==0&false))) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15739);return (Date) obj;
            }
        }}
        }__CLR4_5_2c2sc2slvlull05.R.inc(15740);return null;
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}


    /**
     * Returns the first Long value found for this tag
     *
     * @param name Tag name
     * @return First long value found
     */
    public Long getFirstLongValue(String name) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15741);
        __CLR4_5_2c2sc2slvlull05.R.inc(15742);Object objs[] = getValues(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15743);for (Object obj : objs) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15744);if ((((obj instanceof Long)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15745)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15746)==0&false))) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15747);return (Long) obj;
            }
        }}
        }__CLR4_5_2c2sc2slvlull05.R.inc(15748);return null;
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    /**
     * Returns an array of values for this tag. Empty array when tag is not present
     *
     * @param name Tag name to retrieve
     * @return Possibly empty array of values (possible types are String, Long, Date and byte[] )
     */
    public Object[] getValues(String name) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15749);
        __CLR4_5_2c2sc2slvlull05.R.inc(15750);XtraTag tag = getTagByName(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15751);Object values[];
        __CLR4_5_2c2sc2slvlull05.R.inc(15752);if ((((tag != null)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15753)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15754)==0&false))) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15755);values = new Object[tag.values.size()];
            __CLR4_5_2c2sc2slvlull05.R.inc(15756);for (int i = 0; (((i < tag.values.size())&&(__CLR4_5_2c2sc2slvlull05.R.iget(15757)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15758)==0&false)); i++) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15759);values[i] = tag.values.elementAt(i).getValueAsObject();
            }
        }} }else {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15760);values = new Object[0];
        }
        }__CLR4_5_2c2sc2slvlull05.R.inc(15761);return values;
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}


    /**
     * Removes specified tag (all values for that tag will be removed)
     *
     * @param name Tag to remove
     */
    public void removeTag(String name) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15762);
        __CLR4_5_2c2sc2slvlull05.R.inc(15763);XtraTag tag = getTagByName(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15764);if ((((tag != null)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15765)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15766)==0&false))) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15767);tags.remove(tag);
        }
    }}finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    /**
     * Removes and recreates tag using specified String values
     *
     * @param name   Tag name to replace
     * @param values New String values
     */
    public void setTagValues(String name, String values[]) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15768);
        __CLR4_5_2c2sc2slvlull05.R.inc(15769);removeTag(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15770);XtraTag tag = new XtraTag(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15771);for (int i = 0; (((i < values.length)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15772)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15773)==0&false)); i++) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15774);tag.values.addElement(new XtraValue(values[i]));
        }
        }__CLR4_5_2c2sc2slvlull05.R.inc(15775);tags.addElement(tag);
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}


    /**
     * Removes and recreates tag using specified String value
     *
     * @param name  Tag name to replace
     * @param value New String value
     */
    public void setTagValue(String name, String value) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15776);
        __CLR4_5_2c2sc2slvlull05.R.inc(15777);setTagValues(name, new String[]{value});
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}


    /**
     * Removes and recreates tag using specified Date value
     *
     * @param name Tag name to replace
     * @param date New Date value
     */
    public void setTagValue(String name, Date date) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15778);
        __CLR4_5_2c2sc2slvlull05.R.inc(15779);removeTag(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15780);XtraTag tag = new XtraTag(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15781);tag.values.addElement(new XtraValue(date));
        __CLR4_5_2c2sc2slvlull05.R.inc(15782);tags.addElement(tag);
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    /**
     * Removes and recreates tag using specified Long value
     *
     * @param name  Tag name to replace
     * @param value New Long value
     */
    public void setTagValue(String name, long value) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15783);
        __CLR4_5_2c2sc2slvlull05.R.inc(15784);removeTag(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15785);XtraTag tag = new XtraTag(name);
        __CLR4_5_2c2sc2slvlull05.R.inc(15786);tag.values.addElement(new XtraValue(value));
        __CLR4_5_2c2sc2slvlull05.R.inc(15787);tags.addElement(tag);
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    private XtraTag getTagByName(String name) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15788);
        __CLR4_5_2c2sc2slvlull05.R.inc(15789);for (XtraTag tag : tags) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15790);if ((((tag.tagName.equals(name))&&(__CLR4_5_2c2sc2slvlull05.R.iget(15791)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15792)==0&false))) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15793);return tag;
            }
        }}
        }__CLR4_5_2c2sc2slvlull05.R.inc(15794);return null;
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    private static class XtraTag {
        private int inputSize; //For debugging only

        private String tagName;
        private Vector<XtraValue> values;

        private XtraTag() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15795);
            __CLR4_5_2c2sc2slvlull05.R.inc(15796);values = new Vector<XtraValue>();
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private XtraTag(String name) {
            this();__CLR4_5_2c2sc2slvlull05.R.inc(15798);try{__CLR4_5_2c2sc2slvlull05.R.inc(15797);
            __CLR4_5_2c2sc2slvlull05.R.inc(15799);tagName = name;
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private void parse(ByteBuffer content) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15800);
            __CLR4_5_2c2sc2slvlull05.R.inc(15801);inputSize = content.getInt();
            __CLR4_5_2c2sc2slvlull05.R.inc(15802);int tagLength = content.getInt();
            __CLR4_5_2c2sc2slvlull05.R.inc(15803);tagName = readAsciiString(content, tagLength);
            __CLR4_5_2c2sc2slvlull05.R.inc(15804);int count = content.getInt();

            __CLR4_5_2c2sc2slvlull05.R.inc(15805);for (int i = 0; (((i < count)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15806)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15807)==0&false)); i++) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15808);XtraValue val = new XtraValue();
                __CLR4_5_2c2sc2slvlull05.R.inc(15809);val.parse(content);
                __CLR4_5_2c2sc2slvlull05.R.inc(15810);values.addElement(val);
            }
            }__CLR4_5_2c2sc2slvlull05.R.inc(15811);if ((((inputSize != getContentSize())&&(__CLR4_5_2c2sc2slvlull05.R.iget(15812)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15813)==0&false))) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15814);throw new RuntimeException("Improperly handled Xtra tag: Sizes don't match ( " + inputSize + "/" + getContentSize() + ") on " + tagName);
            }
        }}finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private void getContent(ByteBuffer b) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15815);
            __CLR4_5_2c2sc2slvlull05.R.inc(15816);b.putInt(getContentSize());
            __CLR4_5_2c2sc2slvlull05.R.inc(15817);b.putInt(tagName.length());
            __CLR4_5_2c2sc2slvlull05.R.inc(15818);writeAsciiString(b, tagName);
            __CLR4_5_2c2sc2slvlull05.R.inc(15819);b.putInt(values.size());
            __CLR4_5_2c2sc2slvlull05.R.inc(15820);for (int i = 0; (((i < values.size())&&(__CLR4_5_2c2sc2slvlull05.R.iget(15821)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15822)==0&false)); i++) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15823);values.elementAt(i).getContent(b);
            }
        }}finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private int getContentSize() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15824);
            //Size: 4
            //TagLength: 4
            //Tag: tagLength;
            //Count: 4
            //Values: count * values.getContentSize();
            __CLR4_5_2c2sc2slvlull05.R.inc(15825);int size = 12 + tagName.length();
            __CLR4_5_2c2sc2slvlull05.R.inc(15826);for (int i = 0; (((i < values.size())&&(__CLR4_5_2c2sc2slvlull05.R.iget(15827)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15828)==0&false)); i++) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15829);size += values.elementAt(i).getContentSize();
            }
            }__CLR4_5_2c2sc2slvlull05.R.inc(15830);return size;
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15831);
            __CLR4_5_2c2sc2slvlull05.R.inc(15832);StringBuffer b = new StringBuffer();
            __CLR4_5_2c2sc2slvlull05.R.inc(15833);b.append(tagName);
            __CLR4_5_2c2sc2slvlull05.R.inc(15834);b.append(" [");
            __CLR4_5_2c2sc2slvlull05.R.inc(15835);b.append(inputSize);
            __CLR4_5_2c2sc2slvlull05.R.inc(15836);b.append("/");
            __CLR4_5_2c2sc2slvlull05.R.inc(15837);b.append(values.size());
            __CLR4_5_2c2sc2slvlull05.R.inc(15838);b.append("]:\n");
            __CLR4_5_2c2sc2slvlull05.R.inc(15839);for (int i = 0; (((i < values.size())&&(__CLR4_5_2c2sc2slvlull05.R.iget(15840)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15841)==0&false)); i++) {{
                __CLR4_5_2c2sc2slvlull05.R.inc(15842);b.append("  ");
                __CLR4_5_2c2sc2slvlull05.R.inc(15843);b.append(values.elementAt(i).toString());
                __CLR4_5_2c2sc2slvlull05.R.inc(15844);b.append("\n");
            }
            }__CLR4_5_2c2sc2slvlull05.R.inc(15845);return b.toString();
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    }


    private static class XtraValue {
        public int type;

        public String stringValue;
        public long longValue;
        public byte[] nonParsedValue;
        public Date fileTimeValue;

        private XtraValue() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15846);

        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private XtraValue(String val) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15847);
            __CLR4_5_2c2sc2slvlull05.R.inc(15848);type = MP4_XTRA_BT_UNICODE;
            __CLR4_5_2c2sc2slvlull05.R.inc(15849);stringValue = val;
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private XtraValue(long longVal) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15850);
            __CLR4_5_2c2sc2slvlull05.R.inc(15851);type = MP4_XTRA_BT_INT64;
            __CLR4_5_2c2sc2slvlull05.R.inc(15852);longValue = longVal;
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private XtraValue(Date time) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15853);
            __CLR4_5_2c2sc2slvlull05.R.inc(15854);type = MP4_XTRA_BT_FILETIME;
            __CLR4_5_2c2sc2slvlull05.R.inc(15855);fileTimeValue = time;
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private Object getValueAsObject() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15856);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2c2sc2slvlull05.R.inc(15857);switch (type) {
                case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool0) {__CLR4_5_2c2sc2slvlull05.R.inc(15858);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15859);return stringValue;
                case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool0) {__CLR4_5_2c2sc2slvlull05.R.inc(15860);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15861);return new Long(longValue);
                case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool0) {__CLR4_5_2c2sc2slvlull05.R.inc(15862);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15863);return fileTimeValue;
                case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool0) {__CLR4_5_2c2sc2slvlull05.R.inc(15864);__CLB4_5_2_bool0=true;}
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2c2sc2slvlull05.R.inc(15865);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15866);return nonParsedValue;
            }
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private void parse(ByteBuffer content) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15867);
            __CLR4_5_2c2sc2slvlull05.R.inc(15868);int length = content.getInt() - 6; //length + type are included in length
            __CLR4_5_2c2sc2slvlull05.R.inc(15869);type = content.getShort();
            __CLR4_5_2c2sc2slvlull05.R.inc(15870);content.order(ByteOrder.LITTLE_ENDIAN);
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2c2sc2slvlull05.R.inc(15871);switch (type) {
                case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool1) {__CLR4_5_2c2sc2slvlull05.R.inc(15872);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15873);stringValue = readUtf16String(content, length);
                    __CLR4_5_2c2sc2slvlull05.R.inc(15874);break;
                case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool1) {__CLR4_5_2c2sc2slvlull05.R.inc(15875);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15876);longValue = content.getLong();
                    __CLR4_5_2c2sc2slvlull05.R.inc(15877);break;
                case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool1) {__CLR4_5_2c2sc2slvlull05.R.inc(15878);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15879);fileTimeValue = new Date(filetimeToMillis(content.getLong()));
                    __CLR4_5_2c2sc2slvlull05.R.inc(15880);break;
                case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool1) {__CLR4_5_2c2sc2slvlull05.R.inc(15881);__CLB4_5_2_bool1=true;}
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2c2sc2slvlull05.R.inc(15882);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15883);nonParsedValue = new byte[length];
                    __CLR4_5_2c2sc2slvlull05.R.inc(15884);content.get(nonParsedValue);
                    __CLR4_5_2c2sc2slvlull05.R.inc(15885);break;

            }
            __CLR4_5_2c2sc2slvlull05.R.inc(15886);content.order(ByteOrder.BIG_ENDIAN);

        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private void getContent(ByteBuffer b) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15887);
            __CLR4_5_2c2sc2slvlull05.R.inc(15888);try {
                __CLR4_5_2c2sc2slvlull05.R.inc(15889);int length = getContentSize();
                __CLR4_5_2c2sc2slvlull05.R.inc(15890);b.putInt(length);
                __CLR4_5_2c2sc2slvlull05.R.inc(15891);b.putShort((short) type);
                __CLR4_5_2c2sc2slvlull05.R.inc(15892);b.order(ByteOrder.LITTLE_ENDIAN);
                boolean __CLB4_5_2_bool2=false;__CLR4_5_2c2sc2slvlull05.R.inc(15893);switch (type) {
                    case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool2) {__CLR4_5_2c2sc2slvlull05.R.inc(15894);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2c2sc2slvlull05.R.inc(15895);writeUtf16String(b, stringValue);
                        __CLR4_5_2c2sc2slvlull05.R.inc(15896);break;
                    case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool2) {__CLR4_5_2c2sc2slvlull05.R.inc(15897);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2c2sc2slvlull05.R.inc(15898);b.putLong(longValue);
                        __CLR4_5_2c2sc2slvlull05.R.inc(15899);break;
                    case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool2) {__CLR4_5_2c2sc2slvlull05.R.inc(15900);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2c2sc2slvlull05.R.inc(15901);b.putLong(millisToFiletime(fileTimeValue.getTime()));
                        __CLR4_5_2c2sc2slvlull05.R.inc(15902);break;
                    case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool2) {__CLR4_5_2c2sc2slvlull05.R.inc(15903);__CLB4_5_2_bool2=true;}
                    default:if (!__CLB4_5_2_bool2) {__CLR4_5_2c2sc2slvlull05.R.inc(15904);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2c2sc2slvlull05.R.inc(15905);b.put(nonParsedValue);
                        __CLR4_5_2c2sc2slvlull05.R.inc(15906);break;
                }
            } finally {
                __CLR4_5_2c2sc2slvlull05.R.inc(15907);b.order(ByteOrder.BIG_ENDIAN);
            }
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        private int getContentSize() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15908);
            //Length: 4 bytes
            //Type: 2 bytes
            //Content: length bytes
            __CLR4_5_2c2sc2slvlull05.R.inc(15909);int size = 6;

            boolean __CLB4_5_2_bool3=false;__CLR4_5_2c2sc2slvlull05.R.inc(15910);switch (type) {
                case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool3) {__CLR4_5_2c2sc2slvlull05.R.inc(15911);__CLB4_5_2_bool3=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15912);size += (stringValue.length() * 2) + 2; //Plus 2 for trailing null
                    __CLR4_5_2c2sc2slvlull05.R.inc(15913);break;
                case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool3) {__CLR4_5_2c2sc2slvlull05.R.inc(15914);__CLB4_5_2_bool3=true;}
                case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool3) {__CLR4_5_2c2sc2slvlull05.R.inc(15915);__CLB4_5_2_bool3=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15916);size += 8;
                    __CLR4_5_2c2sc2slvlull05.R.inc(15917);break;
                case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool3) {__CLR4_5_2c2sc2slvlull05.R.inc(15918);__CLB4_5_2_bool3=true;}
                default:if (!__CLB4_5_2_bool3) {__CLR4_5_2c2sc2slvlull05.R.inc(15919);__CLB4_5_2_bool3=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15920);size += nonParsedValue.length;
                    __CLR4_5_2c2sc2slvlull05.R.inc(15921);break;
            }
            __CLR4_5_2c2sc2slvlull05.R.inc(15922);return size;
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2c2sc2slvlull05.R.inc(15923);
            boolean __CLB4_5_2_bool4=false;__CLR4_5_2c2sc2slvlull05.R.inc(15924);switch (type) {
                case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool4) {__CLR4_5_2c2sc2slvlull05.R.inc(15925);__CLB4_5_2_bool4=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15926);return "[string]" + stringValue;
                case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool4) {__CLR4_5_2c2sc2slvlull05.R.inc(15927);__CLB4_5_2_bool4=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15928);return "[long]" + String.valueOf(longValue);
                case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool4) {__CLR4_5_2c2sc2slvlull05.R.inc(15929);__CLB4_5_2_bool4=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15930);return "[filetime]" + fileTimeValue.toString();
                case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool4) {__CLR4_5_2c2sc2slvlull05.R.inc(15931);__CLB4_5_2_bool4=true;}
                default:if (!__CLB4_5_2_bool4) {__CLR4_5_2c2sc2slvlull05.R.inc(15932);__CLB4_5_2_bool4=true;}
                    __CLR4_5_2c2sc2slvlull05.R.inc(15933);return "[GUID](nonParsed)";

            }
        }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    }


    //http://stackoverflow.com/questions/5398557/java-library-for-dealing-with-win32-filetime
    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10 * 1000;

    private static long filetimeToMillis(final long filetime) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15934);
        __CLR4_5_2c2sc2slvlull05.R.inc(15935);return (filetime / FILETIME_ONE_MILLISECOND) - FILETIME_EPOCH_DIFF;
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    private static long millisToFiletime(final long millis) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15936);
        __CLR4_5_2c2sc2slvlull05.R.inc(15937);return (millis + FILETIME_EPOCH_DIFF) * FILETIME_ONE_MILLISECOND;
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    private static void writeAsciiString(ByteBuffer dest, String s) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15938);
        __CLR4_5_2c2sc2slvlull05.R.inc(15939);try {
            __CLR4_5_2c2sc2slvlull05.R.inc(15940);dest.put(s.getBytes("US-ASCII"));
        } catch (UnsupportedEncodingException e) {
            __CLR4_5_2c2sc2slvlull05.R.inc(15941);throw new RuntimeException("Shouldn't happen", e);
        }
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    private static String readAsciiString(ByteBuffer content, int length) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15942);
        __CLR4_5_2c2sc2slvlull05.R.inc(15943);byte s[] = new byte[length];
        __CLR4_5_2c2sc2slvlull05.R.inc(15944);content.get(s);
        __CLR4_5_2c2sc2slvlull05.R.inc(15945);try {
            __CLR4_5_2c2sc2slvlull05.R.inc(15946);return new String(s, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            __CLR4_5_2c2sc2slvlull05.R.inc(15947);throw new RuntimeException("Shouldn't happen", e);
        }
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}


    private static String readUtf16String(ByteBuffer content, int length) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15948);
        __CLR4_5_2c2sc2slvlull05.R.inc(15949);char s[] = new char[(length / 2) - 1];
        __CLR4_5_2c2sc2slvlull05.R.inc(15950);for (int i = 0; (((i < (length / 2) - 1)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15951)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15952)==0&false)); i++) {{
            __CLR4_5_2c2sc2slvlull05.R.inc(15953);s[i] = content.getChar();
        }
        }__CLR4_5_2c2sc2slvlull05.R.inc(15954);content.getChar(); //Discard terminating null
        __CLR4_5_2c2sc2slvlull05.R.inc(15955);return new String(s);
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

    private static void writeUtf16String(ByteBuffer dest, String s) {try{__CLR4_5_2c2sc2slvlull05.R.inc(15956);
        __CLR4_5_2c2sc2slvlull05.R.inc(15957);char ar[] = s.toCharArray();
        __CLR4_5_2c2sc2slvlull05.R.inc(15958);for (int i = 0; (((i < ar.length)&&(__CLR4_5_2c2sc2slvlull05.R.iget(15959)!=0|true))||(__CLR4_5_2c2sc2slvlull05.R.iget(15960)==0&false)); i++) {{ //Probably not the best way to do this but it preserves the byte order
            __CLR4_5_2c2sc2slvlull05.R.inc(15961);dest.putChar(ar[i]);
        }
        }__CLR4_5_2c2sc2slvlull05.R.inc(15962);dest.putChar((char) 0); //Terminating null
    }finally{__CLR4_5_2c2sc2slvlull05.R.flushNeeded();}}

}
