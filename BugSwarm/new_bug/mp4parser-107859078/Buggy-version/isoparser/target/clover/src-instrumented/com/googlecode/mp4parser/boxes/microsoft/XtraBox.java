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

@java.lang.SuppressWarnings({"fallthrough"}) public class XtraBox extends AbstractBox {public static class __CLR4_5_2c05c05lvl9ek48{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,15868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "Xtra";

    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;

    private boolean successfulParse = false;

    Vector<XtraTag> tags = new Vector<XtraTag>();

    ByteBuffer data;

    public XtraBox() {
        super("Xtra");__CLR4_5_2c05c05lvl9ek48.R.inc(15558);try{__CLR4_5_2c05c05lvl9ek48.R.inc(15557);

    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    public XtraBox(String type) {
        super(type);__CLR4_5_2c05c05lvl9ek48.R.inc(15560);try{__CLR4_5_2c05c05lvl9ek48.R.inc(15559);
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15561);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15562);if ((((successfulParse)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15563)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15564)==0&false))) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15565);return detailSize();
        } }else {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15566);return data.limit();
        }
    }}finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    private int detailSize() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15567);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15568);int size = 0;
        __CLR4_5_2c05c05lvl9ek48.R.inc(15569);for (int i = 0; (((i < tags.size())&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15570)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15571)==0&false)); i++) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15572);size += tags.elementAt(i).getContentSize();
        }
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15573);return size;

    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15574);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15575);if ((((!this.isParsed())&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15576)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15577)==0&false))) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15578);this.parseDetails();
        }
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15579);StringBuffer b = new StringBuffer();
        __CLR4_5_2c05c05lvl9ek48.R.inc(15580);b.append("XtraBox[");
        __CLR4_5_2c05c05lvl9ek48.R.inc(15581);for (XtraTag tag : tags) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15582);for (XtraValue value : tag.values) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15583);b.append(tag.tagName);
                __CLR4_5_2c05c05lvl9ek48.R.inc(15584);b.append("=");
                __CLR4_5_2c05c05lvl9ek48.R.inc(15585);b.append(value.toString());
                __CLR4_5_2c05c05lvl9ek48.R.inc(15586);b.append(";");
            }
        }}
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15587);b.append("]");
        __CLR4_5_2c05c05lvl9ek48.R.inc(15588);return b.toString();
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}


    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15589);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15590);int boxSize = content.remaining();
        __CLR4_5_2c05c05lvl9ek48.R.inc(15591);data = content.slice(); //Keep this in case we fail to parse
        __CLR4_5_2c05c05lvl9ek48.R.inc(15592);successfulParse = false;
        __CLR4_5_2c05c05lvl9ek48.R.inc(15593);try {
            __CLR4_5_2c05c05lvl9ek48.R.inc(15594);tags.clear();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15595);while ((((content.remaining() > 0)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15596)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15597)==0&false))) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15598);XtraTag tag = new XtraTag();
                __CLR4_5_2c05c05lvl9ek48.R.inc(15599);tag.parse(content);
                __CLR4_5_2c05c05lvl9ek48.R.inc(15600);tags.addElement(tag);
            }
            }__CLR4_5_2c05c05lvl9ek48.R.inc(15601);int calcSize = detailSize();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15602);if ((((boxSize != calcSize)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15603)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15604)==0&false))) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15605);throw new RuntimeException("Improperly handled Xtra tag: Calculated sizes don't match ( " + boxSize + "/" + calcSize + ")");
            }
            }__CLR4_5_2c05c05lvl9ek48.R.inc(15606);successfulParse = true;
        } catch (Exception e) {
            __CLR4_5_2c05c05lvl9ek48.R.inc(15607);successfulParse = false;
            __CLR4_5_2c05c05lvl9ek48.R.inc(15608);System.err.println("Malformed Xtra Tag detected: " + e.toString());
            __CLR4_5_2c05c05lvl9ek48.R.inc(15609);e.printStackTrace();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15610);content.position(content.position() + content.remaining());
        } finally {
            __CLR4_5_2c05c05lvl9ek48.R.inc(15611);content.order(ByteOrder.BIG_ENDIAN); //Just in case we bailed out mid-parse we don't want to leave the byte order in MS land
        }
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15612);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15613);if ((((successfulParse)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15614)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15615)==0&false))) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15616);for (int i = 0; (((i < tags.size())&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15617)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15618)==0&false)); i++) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15619);tags.elementAt(i).getContent(byteBuffer);
            }
        }} }else {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15620);data.rewind();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15621);byteBuffer.put(data);
        }
    }}finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    /**
     * Returns a list of the tag names present in this Xtra Box
     *
     * @return Possibly empty (zero length) array of tag names present
     */
    public String[] getAllTagNames() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15622);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15623);String names[] = new String[tags.size()];
        __CLR4_5_2c05c05lvl9ek48.R.inc(15624);for (int i = 0; (((i < tags.size())&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15625)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15626)==0&false)); i++) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15627);XtraTag tag = tags.elementAt(i);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15628);names[i] = tag.tagName;
        }
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15629);return names;
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    /**
     * Returns the first String value found for this tag
     *
     * @param name Tag name
     * @return First String value found
     */
    public String getFirstStringValue(String name) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15630);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15631);Object objs[] = getValues(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15632);for (Object obj : objs) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15633);if ((((obj instanceof String)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15634)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15635)==0&false))) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15636);return (String) obj;
            }
        }}
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15637);return null;
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}


    /**
     * Returns the first Date value found for this tag
     *
     * @param name Tag name
     * @return First Date value found
     */
    public Date getFirstDateValue(String name) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15638);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15639);Object objs[] = getValues(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15640);for (Object obj : objs) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15641);if ((((obj instanceof Date)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15642)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15643)==0&false))) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15644);return (Date) obj;
            }
        }}
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15645);return null;
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}


    /**
     * Returns the first Long value found for this tag
     *
     * @param name Tag name
     * @return First long value found
     */
    public Long getFirstLongValue(String name) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15646);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15647);Object objs[] = getValues(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15648);for (Object obj : objs) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15649);if ((((obj instanceof Long)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15650)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15651)==0&false))) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15652);return (Long) obj;
            }
        }}
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15653);return null;
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    /**
     * Returns an array of values for this tag. Empty array when tag is not present
     *
     * @param name Tag name to retrieve
     * @return Possibly empty array of values (possible types are String, Long, Date and byte[] )
     */
    public Object[] getValues(String name) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15654);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15655);XtraTag tag = getTagByName(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15656);Object values[];
        __CLR4_5_2c05c05lvl9ek48.R.inc(15657);if ((((tag != null)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15658)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15659)==0&false))) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15660);values = new Object[tag.values.size()];
            __CLR4_5_2c05c05lvl9ek48.R.inc(15661);for (int i = 0; (((i < tag.values.size())&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15662)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15663)==0&false)); i++) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15664);values[i] = tag.values.elementAt(i).getValueAsObject();
            }
        }} }else {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15665);values = new Object[0];
        }
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15666);return values;
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}


    /**
     * Removes specified tag (all values for that tag will be removed)
     *
     * @param name Tag to remove
     */
    public void removeTag(String name) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15667);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15668);XtraTag tag = getTagByName(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15669);if ((((tag != null)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15670)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15671)==0&false))) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15672);tags.remove(tag);
        }
    }}finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    /**
     * Removes and recreates tag using specified String values
     *
     * @param name   Tag name to replace
     * @param values New String values
     */
    public void setTagValues(String name, String values[]) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15673);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15674);removeTag(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15675);XtraTag tag = new XtraTag(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15676);for (int i = 0; (((i < values.length)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15677)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15678)==0&false)); i++) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15679);tag.values.addElement(new XtraValue(values[i]));
        }
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15680);tags.addElement(tag);
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}


    /**
     * Removes and recreates tag using specified String value
     *
     * @param name  Tag name to replace
     * @param value New String value
     */
    public void setTagValue(String name, String value) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15681);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15682);setTagValues(name, new String[]{value});
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}


    /**
     * Removes and recreates tag using specified Date value
     *
     * @param name Tag name to replace
     * @param date New Date value
     */
    public void setTagValue(String name, Date date) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15683);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15684);removeTag(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15685);XtraTag tag = new XtraTag(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15686);tag.values.addElement(new XtraValue(date));
        __CLR4_5_2c05c05lvl9ek48.R.inc(15687);tags.addElement(tag);
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    /**
     * Removes and recreates tag using specified Long value
     *
     * @param name  Tag name to replace
     * @param value New Long value
     */
    public void setTagValue(String name, long value) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15688);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15689);removeTag(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15690);XtraTag tag = new XtraTag(name);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15691);tag.values.addElement(new XtraValue(value));
        __CLR4_5_2c05c05lvl9ek48.R.inc(15692);tags.addElement(tag);
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    private XtraTag getTagByName(String name) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15693);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15694);for (XtraTag tag : tags) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15695);if ((((tag.tagName.equals(name))&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15696)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15697)==0&false))) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15698);return tag;
            }
        }}
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15699);return null;
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    private static class XtraTag {
        private int inputSize; //For debugging only

        private String tagName;
        private Vector<XtraValue> values;

        private XtraTag() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15700);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15701);values = new Vector<XtraValue>();
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private XtraTag(String name) {
            this();__CLR4_5_2c05c05lvl9ek48.R.inc(15703);try{__CLR4_5_2c05c05lvl9ek48.R.inc(15702);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15704);tagName = name;
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private void parse(ByteBuffer content) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15705);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15706);inputSize = content.getInt();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15707);int tagLength = content.getInt();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15708);tagName = readAsciiString(content, tagLength);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15709);int count = content.getInt();

            __CLR4_5_2c05c05lvl9ek48.R.inc(15710);for (int i = 0; (((i < count)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15711)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15712)==0&false)); i++) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15713);XtraValue val = new XtraValue();
                __CLR4_5_2c05c05lvl9ek48.R.inc(15714);val.parse(content);
                __CLR4_5_2c05c05lvl9ek48.R.inc(15715);values.addElement(val);
            }
            }__CLR4_5_2c05c05lvl9ek48.R.inc(15716);if ((((inputSize != getContentSize())&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15717)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15718)==0&false))) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15719);throw new RuntimeException("Improperly handled Xtra tag: Sizes don't match ( " + inputSize + "/" + getContentSize() + ") on " + tagName);
            }
        }}finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private void getContent(ByteBuffer b) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15720);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15721);b.putInt(getContentSize());
            __CLR4_5_2c05c05lvl9ek48.R.inc(15722);b.putInt(tagName.length());
            __CLR4_5_2c05c05lvl9ek48.R.inc(15723);writeAsciiString(b, tagName);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15724);b.putInt(values.size());
            __CLR4_5_2c05c05lvl9ek48.R.inc(15725);for (int i = 0; (((i < values.size())&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15726)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15727)==0&false)); i++) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15728);values.elementAt(i).getContent(b);
            }
        }}finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private int getContentSize() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15729);
            //Size: 4
            //TagLength: 4
            //Tag: tagLength;
            //Count: 4
            //Values: count * values.getContentSize();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15730);int size = 12 + tagName.length();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15731);for (int i = 0; (((i < values.size())&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15732)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15733)==0&false)); i++) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15734);size += values.elementAt(i).getContentSize();
            }
            }__CLR4_5_2c05c05lvl9ek48.R.inc(15735);return size;
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15736);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15737);StringBuffer b = new StringBuffer();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15738);b.append(tagName);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15739);b.append(" [");
            __CLR4_5_2c05c05lvl9ek48.R.inc(15740);b.append(inputSize);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15741);b.append("/");
            __CLR4_5_2c05c05lvl9ek48.R.inc(15742);b.append(values.size());
            __CLR4_5_2c05c05lvl9ek48.R.inc(15743);b.append("]:\n");
            __CLR4_5_2c05c05lvl9ek48.R.inc(15744);for (int i = 0; (((i < values.size())&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15745)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15746)==0&false)); i++) {{
                __CLR4_5_2c05c05lvl9ek48.R.inc(15747);b.append("  ");
                __CLR4_5_2c05c05lvl9ek48.R.inc(15748);b.append(values.elementAt(i).toString());
                __CLR4_5_2c05c05lvl9ek48.R.inc(15749);b.append("\n");
            }
            }__CLR4_5_2c05c05lvl9ek48.R.inc(15750);return b.toString();
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    }


    private static class XtraValue {
        public int type;

        public String stringValue;
        public long longValue;
        public byte[] nonParsedValue;
        public Date fileTimeValue;

        private XtraValue() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15751);

        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private XtraValue(String val) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15752);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15753);type = MP4_XTRA_BT_UNICODE;
            __CLR4_5_2c05c05lvl9ek48.R.inc(15754);stringValue = val;
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private XtraValue(long longVal) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15755);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15756);type = MP4_XTRA_BT_INT64;
            __CLR4_5_2c05c05lvl9ek48.R.inc(15757);longValue = longVal;
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private XtraValue(Date time) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15758);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15759);type = MP4_XTRA_BT_FILETIME;
            __CLR4_5_2c05c05lvl9ek48.R.inc(15760);fileTimeValue = time;
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private Object getValueAsObject() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15761);
            boolean __CLB4_5_2_bool0=false;__CLR4_5_2c05c05lvl9ek48.R.inc(15762);switch (type) {
                case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool0) {__CLR4_5_2c05c05lvl9ek48.R.inc(15763);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15764);return stringValue;
                case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool0) {__CLR4_5_2c05c05lvl9ek48.R.inc(15765);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15766);return new Long(longValue);
                case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool0) {__CLR4_5_2c05c05lvl9ek48.R.inc(15767);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15768);return fileTimeValue;
                case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool0) {__CLR4_5_2c05c05lvl9ek48.R.inc(15769);__CLB4_5_2_bool0=true;}
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2c05c05lvl9ek48.R.inc(15770);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15771);return nonParsedValue;
            }
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private void parse(ByteBuffer content) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15772);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15773);int length = content.getInt() - 6; //length + type are included in length
            __CLR4_5_2c05c05lvl9ek48.R.inc(15774);type = content.getShort();
            __CLR4_5_2c05c05lvl9ek48.R.inc(15775);content.order(ByteOrder.LITTLE_ENDIAN);
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2c05c05lvl9ek48.R.inc(15776);switch (type) {
                case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool1) {__CLR4_5_2c05c05lvl9ek48.R.inc(15777);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15778);stringValue = readUtf16String(content, length);
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15779);break;
                case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool1) {__CLR4_5_2c05c05lvl9ek48.R.inc(15780);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15781);longValue = content.getLong();
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15782);break;
                case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool1) {__CLR4_5_2c05c05lvl9ek48.R.inc(15783);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15784);fileTimeValue = new Date(filetimeToMillis(content.getLong()));
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15785);break;
                case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool1) {__CLR4_5_2c05c05lvl9ek48.R.inc(15786);__CLB4_5_2_bool1=true;}
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2c05c05lvl9ek48.R.inc(15787);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15788);nonParsedValue = new byte[length];
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15789);content.get(nonParsedValue);
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15790);break;

            }
            __CLR4_5_2c05c05lvl9ek48.R.inc(15791);content.order(ByteOrder.BIG_ENDIAN);

        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private void getContent(ByteBuffer b) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15792);
            __CLR4_5_2c05c05lvl9ek48.R.inc(15793);try {
                __CLR4_5_2c05c05lvl9ek48.R.inc(15794);int length = getContentSize();
                __CLR4_5_2c05c05lvl9ek48.R.inc(15795);b.putInt(length);
                __CLR4_5_2c05c05lvl9ek48.R.inc(15796);b.putShort((short) type);
                __CLR4_5_2c05c05lvl9ek48.R.inc(15797);b.order(ByteOrder.LITTLE_ENDIAN);
                boolean __CLB4_5_2_bool2=false;__CLR4_5_2c05c05lvl9ek48.R.inc(15798);switch (type) {
                    case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool2) {__CLR4_5_2c05c05lvl9ek48.R.inc(15799);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2c05c05lvl9ek48.R.inc(15800);writeUtf16String(b, stringValue);
                        __CLR4_5_2c05c05lvl9ek48.R.inc(15801);break;
                    case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool2) {__CLR4_5_2c05c05lvl9ek48.R.inc(15802);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2c05c05lvl9ek48.R.inc(15803);b.putLong(longValue);
                        __CLR4_5_2c05c05lvl9ek48.R.inc(15804);break;
                    case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool2) {__CLR4_5_2c05c05lvl9ek48.R.inc(15805);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2c05c05lvl9ek48.R.inc(15806);b.putLong(millisToFiletime(fileTimeValue.getTime()));
                        __CLR4_5_2c05c05lvl9ek48.R.inc(15807);break;
                    case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool2) {__CLR4_5_2c05c05lvl9ek48.R.inc(15808);__CLB4_5_2_bool2=true;}
                    default:if (!__CLB4_5_2_bool2) {__CLR4_5_2c05c05lvl9ek48.R.inc(15809);__CLB4_5_2_bool2=true;}
                        __CLR4_5_2c05c05lvl9ek48.R.inc(15810);b.put(nonParsedValue);
                        __CLR4_5_2c05c05lvl9ek48.R.inc(15811);break;
                }
            } finally {
                __CLR4_5_2c05c05lvl9ek48.R.inc(15812);b.order(ByteOrder.BIG_ENDIAN);
            }
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        private int getContentSize() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15813);
            //Length: 4 bytes
            //Type: 2 bytes
            //Content: length bytes
            __CLR4_5_2c05c05lvl9ek48.R.inc(15814);int size = 6;

            boolean __CLB4_5_2_bool3=false;__CLR4_5_2c05c05lvl9ek48.R.inc(15815);switch (type) {
                case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool3) {__CLR4_5_2c05c05lvl9ek48.R.inc(15816);__CLB4_5_2_bool3=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15817);size += (stringValue.length() * 2) + 2; //Plus 2 for trailing null
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15818);break;
                case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool3) {__CLR4_5_2c05c05lvl9ek48.R.inc(15819);__CLB4_5_2_bool3=true;}
                case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool3) {__CLR4_5_2c05c05lvl9ek48.R.inc(15820);__CLB4_5_2_bool3=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15821);size += 8;
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15822);break;
                case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool3) {__CLR4_5_2c05c05lvl9ek48.R.inc(15823);__CLB4_5_2_bool3=true;}
                default:if (!__CLB4_5_2_bool3) {__CLR4_5_2c05c05lvl9ek48.R.inc(15824);__CLB4_5_2_bool3=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15825);size += nonParsedValue.length;
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15826);break;
            }
            __CLR4_5_2c05c05lvl9ek48.R.inc(15827);return size;
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15828);
            boolean __CLB4_5_2_bool4=false;__CLR4_5_2c05c05lvl9ek48.R.inc(15829);switch (type) {
                case MP4_XTRA_BT_UNICODE:if (!__CLB4_5_2_bool4) {__CLR4_5_2c05c05lvl9ek48.R.inc(15830);__CLB4_5_2_bool4=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15831);return "[string]" + stringValue;
                case MP4_XTRA_BT_INT64:if (!__CLB4_5_2_bool4) {__CLR4_5_2c05c05lvl9ek48.R.inc(15832);__CLB4_5_2_bool4=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15833);return "[long]" + String.valueOf(longValue);
                case MP4_XTRA_BT_FILETIME:if (!__CLB4_5_2_bool4) {__CLR4_5_2c05c05lvl9ek48.R.inc(15834);__CLB4_5_2_bool4=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15835);return "[filetime]" + fileTimeValue.toString();
                case MP4_XTRA_BT_GUID:if (!__CLB4_5_2_bool4) {__CLR4_5_2c05c05lvl9ek48.R.inc(15836);__CLB4_5_2_bool4=true;}
                default:if (!__CLB4_5_2_bool4) {__CLR4_5_2c05c05lvl9ek48.R.inc(15837);__CLB4_5_2_bool4=true;}
                    __CLR4_5_2c05c05lvl9ek48.R.inc(15838);return "[GUID](nonParsed)";

            }
        }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    }


    //http://stackoverflow.com/questions/5398557/java-library-for-dealing-with-win32-filetime
    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10 * 1000;

    private static long filetimeToMillis(final long filetime) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15839);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15840);return (filetime / FILETIME_ONE_MILLISECOND) - FILETIME_EPOCH_DIFF;
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    private static long millisToFiletime(final long millis) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15841);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15842);return (millis + FILETIME_EPOCH_DIFF) * FILETIME_ONE_MILLISECOND;
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    private static void writeAsciiString(ByteBuffer dest, String s) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15843);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15844);try {
            __CLR4_5_2c05c05lvl9ek48.R.inc(15845);dest.put(s.getBytes("US-ASCII"));
        } catch (UnsupportedEncodingException e) {
            __CLR4_5_2c05c05lvl9ek48.R.inc(15846);throw new RuntimeException("Shouldn't happen", e);
        }
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    private static String readAsciiString(ByteBuffer content, int length) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15847);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15848);byte s[] = new byte[length];
        __CLR4_5_2c05c05lvl9ek48.R.inc(15849);content.get(s);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15850);try {
            __CLR4_5_2c05c05lvl9ek48.R.inc(15851);return new String(s, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            __CLR4_5_2c05c05lvl9ek48.R.inc(15852);throw new RuntimeException("Shouldn't happen", e);
        }
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}


    private static String readUtf16String(ByteBuffer content, int length) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15853);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15854);char s[] = new char[(length / 2) - 1];
        __CLR4_5_2c05c05lvl9ek48.R.inc(15855);for (int i = 0; (((i < (length / 2) - 1)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15856)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15857)==0&false)); i++) {{
            __CLR4_5_2c05c05lvl9ek48.R.inc(15858);s[i] = content.getChar();
        }
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15859);content.getChar(); //Discard terminating null
        __CLR4_5_2c05c05lvl9ek48.R.inc(15860);return new String(s);
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

    private static void writeUtf16String(ByteBuffer dest, String s) {try{__CLR4_5_2c05c05lvl9ek48.R.inc(15861);
        __CLR4_5_2c05c05lvl9ek48.R.inc(15862);char ar[] = s.toCharArray();
        __CLR4_5_2c05c05lvl9ek48.R.inc(15863);for (int i = 0; (((i < ar.length)&&(__CLR4_5_2c05c05lvl9ek48.R.iget(15864)!=0|true))||(__CLR4_5_2c05c05lvl9ek48.R.iget(15865)==0&false)); i++) {{ //Probably not the best way to do this but it preserves the byte order
            __CLR4_5_2c05c05lvl9ek48.R.inc(15866);dest.putChar(ar[i]);
        }
        }__CLR4_5_2c05c05lvl9ek48.R.inc(15867);dest.putChar((char) 0); //Terminating null
    }finally{__CLR4_5_2c05c05lvl9ek48.R.flushNeeded();}}

}
