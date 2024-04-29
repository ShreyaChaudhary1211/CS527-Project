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

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;


/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Contained a the <code>UserDataBox</code> and containing information about the media's rating. E.g.
 * PG13or FSK16.
 */
public class RatingBox extends AbstractFullBox {public static class __CLR4_5_21ii1iilvl9ef4d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,2004,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "rtng";

    private String ratingEntity;
    private String ratingCriteria;
    private String language;
    private String ratingInfo;

    public RatingBox() {
        super(TYPE);__CLR4_5_21ii1iilvl9ef4d.R.inc(1963);try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1962);
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}


    public void setRatingEntity(String ratingEntity) {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1964);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1965);this.ratingEntity = ratingEntity;
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    public void setRatingCriteria(String ratingCriteria) {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1966);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1967);this.ratingCriteria = ratingCriteria;
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    public void setLanguage(String language) {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1968);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1969);this.language = language;
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    public void setRatingInfo(String ratingInfo) {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1970);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1971);this.ratingInfo = ratingInfo;
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    public String getLanguage() {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1972);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1973);return language;
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    /**
     * Gets a four-character code that indicates the rating entity grading the asset, e.g., 'BBFC'. The values of this
     * field should follow common names of worldwide movie rating systems, such as those mentioned in
     * [http://www.movie-ratings.net/, October 2002].
     *
     * @return the rating organization
     */
    public String getRatingEntity() {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1974);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1975);return ratingEntity;
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    /**
     * Gets the four-character code that indicates which rating criteria are being used for the corresponding rating
     * entity, e.g., 'PG13'.
     *
     * @return the actual rating
     */
    public String getRatingCriteria() {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1976);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1977);return ratingCriteria;
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    public String getRatingInfo() {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1978);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1979);return ratingInfo;
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1980);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1981);return 15 + Utf8.utf8StringLengthInBytes(ratingInfo);
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1982);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1983);parseVersionAndFlags(content);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1984);ratingEntity = IsoTypeReader.read4cc(content);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1985);ratingCriteria = IsoTypeReader.read4cc(content);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1986);language = IsoTypeReader.readIso639(content);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1987);ratingInfo = IsoTypeReader.readString(content);

    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1988);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1989);writeVersionAndFlags(byteBuffer);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1990);byteBuffer.put(IsoFile.fourCCtoBytes(ratingEntity));
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1991);byteBuffer.put(IsoFile.fourCCtoBytes(ratingCriteria));
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1992);IsoTypeWriter.writeIso639(byteBuffer, language);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1993);byteBuffer.put(Utf8.convert(ratingInfo));
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1994);byteBuffer.put((byte) 0);
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_21ii1iilvl9ef4d.R.inc(1995);
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1996);StringBuilder buffer = new StringBuilder();
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1997);buffer.append("RatingBox[language=").append(getLanguage());
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1998);buffer.append("ratingEntity=").append(getRatingEntity());
        __CLR4_5_21ii1iilvl9ef4d.R.inc(1999);buffer.append(";ratingCriteria=").append(getRatingCriteria());
        __CLR4_5_21ii1iilvl9ef4d.R.inc(2000);buffer.append(";language=").append(getLanguage());
        __CLR4_5_21ii1iilvl9ef4d.R.inc(2001);buffer.append(";ratingInfo=").append(getRatingInfo());
        __CLR4_5_21ii1iilvl9ef4d.R.inc(2002);buffer.append("]");
        __CLR4_5_21ii1iilvl9ef4d.R.inc(2003);return buffer.toString();
    }finally{__CLR4_5_21ii1iilvl9ef4d.R.flushNeeded();}}
}
