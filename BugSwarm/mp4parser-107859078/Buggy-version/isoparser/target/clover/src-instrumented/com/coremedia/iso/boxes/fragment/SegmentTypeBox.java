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

package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * This box identifies the specifications to which this file complies. <br>
 * Each brand is a printable four-character code, registered with ISO, that
 * identifies a precise specification.
 */
public class SegmentTypeBox extends AbstractBox {public static class __CLR4_5_22i82i8lvl9efjd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,3294,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "styp";

    private String majorBrand;
    private long minorVersion;
    private List<String> compatibleBrands = Collections.emptyList();

    public SegmentTypeBox() {
        super(TYPE);__CLR4_5_22i82i8lvl9efjd.R.inc(3249);try{__CLR4_5_22i82i8lvl9efjd.R.inc(3248);
    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    public SegmentTypeBox(String majorBrand, long minorVersion, List<String> compatibleBrands) {
        super(TYPE);__CLR4_5_22i82i8lvl9efjd.R.inc(3251);try{__CLR4_5_22i82i8lvl9efjd.R.inc(3250);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3252);this.majorBrand = majorBrand;
        __CLR4_5_22i82i8lvl9efjd.R.inc(3253);this.minorVersion = minorVersion;
        __CLR4_5_22i82i8lvl9efjd.R.inc(3254);this.compatibleBrands = compatibleBrands;
    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3255);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3256);return 8 + compatibleBrands.size() * 4;

    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3257);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3258);majorBrand = IsoTypeReader.read4cc(content);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3259);minorVersion = IsoTypeReader.readUInt32(content);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3260);int compatibleBrandsCount = content.remaining() / 4;
        __CLR4_5_22i82i8lvl9efjd.R.inc(3261);compatibleBrands = new LinkedList<String>();
        __CLR4_5_22i82i8lvl9efjd.R.inc(3262);for (int i = 0; (((i < compatibleBrandsCount)&&(__CLR4_5_22i82i8lvl9efjd.R.iget(3263)!=0|true))||(__CLR4_5_22i82i8lvl9efjd.R.iget(3264)==0&false)); i++) {{
            __CLR4_5_22i82i8lvl9efjd.R.inc(3265);compatibleBrands.add(IsoTypeReader.read4cc(content));
        }
    }}finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3266);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3267);byteBuffer.put(IsoFile.fourCCtoBytes(majorBrand));
        __CLR4_5_22i82i8lvl9efjd.R.inc(3268);IsoTypeWriter.writeUInt32(byteBuffer, minorVersion);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3269);for (String compatibleBrand : compatibleBrands) {{
            __CLR4_5_22i82i8lvl9efjd.R.inc(3270);byteBuffer.put(IsoFile.fourCCtoBytes(compatibleBrand));
        }

    }}finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    /**
     * Gets the brand identifier.
     *
     * @return the brand identifier
     */
    public String getMajorBrand() {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3271);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3272);return majorBrand;
    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    /**
     * Sets the major brand of the file used to determine an appropriate reader.
     *
     * @param majorBrand the new major brand
     */
    public void setMajorBrand(String majorBrand) {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3273);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3274);this.majorBrand = majorBrand;
    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    /**
     * Sets the "informative integer for the minor version of the major brand".
     *
     * @param minorVersion the version number of the major brand
     */
    public void setMinorVersion(long minorVersion) {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3275);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3276);this.minorVersion = minorVersion;
    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    /**
     * Gets an informative integer for the minor version of the major brand.
     *
     * @return an informative integer
     * @see SegmentTypeBox#getMajorBrand()
     */
    public long getMinorVersion() {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3277);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3278);return minorVersion;
    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    /**
     * Gets an array of 4-cc brands.
     *
     * @return the compatible brands
     */
    public List<String> getCompatibleBrands() {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3279);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3280);return compatibleBrands;
    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    public void setCompatibleBrands(List<String> compatibleBrands) {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3281);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3282);this.compatibleBrands = compatibleBrands;
    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}

    @DoNotParseDetail
    public String toString() {try{__CLR4_5_22i82i8lvl9efjd.R.inc(3283);
        __CLR4_5_22i82i8lvl9efjd.R.inc(3284);StringBuilder result = new StringBuilder();
        __CLR4_5_22i82i8lvl9efjd.R.inc(3285);result.append("SegmentTypeBox[");
        __CLR4_5_22i82i8lvl9efjd.R.inc(3286);result.append("majorBrand=").append(getMajorBrand());
        __CLR4_5_22i82i8lvl9efjd.R.inc(3287);result.append(";");
        __CLR4_5_22i82i8lvl9efjd.R.inc(3288);result.append("minorVersion=").append(getMinorVersion());
        __CLR4_5_22i82i8lvl9efjd.R.inc(3289);for (String compatibleBrand : compatibleBrands) {{
            __CLR4_5_22i82i8lvl9efjd.R.inc(3290);result.append(";");
            __CLR4_5_22i82i8lvl9efjd.R.inc(3291);result.append("compatibleBrand=").append(compatibleBrand);
        }
        }__CLR4_5_22i82i8lvl9efjd.R.inc(3292);result.append("]");
        __CLR4_5_22i82i8lvl9efjd.R.inc(3293);return result.toString();
    }finally{__CLR4_5_22i82i8lvl9efjd.R.flushNeeded();}}
}
