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
 * The Scheme Type Box identifies the protection scheme. Resides in  a Protection Scheme Information Box or
 * an SRTP Process Box.
 *
 * @see com.coremedia.iso.boxes.SchemeInformationBox
 */
public class SchemeTypeBox extends AbstractFullBox {public static class __CLR4_5_21sd1sdlvl9ef73{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,2361,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "schm";
    String schemeType = "    ";
    long schemeVersion;
    String schemeUri = null;

    public SchemeTypeBox() {
        super(TYPE);__CLR4_5_21sd1sdlvl9ef73.R.inc(2318);try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2317);
    }finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    public String getSchemeType() {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2319);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2320);return schemeType;
    }finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    public long getSchemeVersion() {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2321);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2322);return schemeVersion;
    }finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    public String getSchemeUri() {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2323);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2324);return schemeUri;
    }finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    public void setSchemeType(String schemeType) {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2325);
        assert (((schemeType != null && schemeType.length() == 4 )&&(__CLR4_5_21sd1sdlvl9ef73.R.iget(2326)!=0|true))||(__CLR4_5_21sd1sdlvl9ef73.R.iget(2327)==0&false)): "SchemeType may not be null or not 4 bytes long";
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2328);this.schemeType = schemeType;
    }finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    public void setSchemeVersion(int schemeVersion) {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2329);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2330);this.schemeVersion = schemeVersion;
    }finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    public void setSchemeUri(String schemeUri) {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2331);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2332);this.schemeUri = schemeUri;
    }finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2333);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2334);return 12 + ((((((getFlags() & 1) == 1) )&&(__CLR4_5_21sd1sdlvl9ef73.R.iget(2335)!=0|true))||(__CLR4_5_21sd1sdlvl9ef73.R.iget(2336)==0&false))? Utf8.utf8StringLengthInBytes(schemeUri) + 1 : 0);
    }finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2337);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2338);parseVersionAndFlags(content);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2339);schemeType = IsoTypeReader.read4cc(content);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2340);schemeVersion = IsoTypeReader.readUInt32(content);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2341);if (((((getFlags() & 1) == 1)&&(__CLR4_5_21sd1sdlvl9ef73.R.iget(2342)!=0|true))||(__CLR4_5_21sd1sdlvl9ef73.R.iget(2343)==0&false))) {{
            __CLR4_5_21sd1sdlvl9ef73.R.inc(2344);schemeUri = IsoTypeReader.readString(content);
        }
    }}finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2345);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2346);writeVersionAndFlags(byteBuffer);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2347);byteBuffer.put(IsoFile.fourCCtoBytes(schemeType));
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2348);IsoTypeWriter.writeUInt32(byteBuffer, schemeVersion);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2349);if (((((getFlags() & 1) == 1)&&(__CLR4_5_21sd1sdlvl9ef73.R.iget(2350)!=0|true))||(__CLR4_5_21sd1sdlvl9ef73.R.iget(2351)==0&false))) {{
            __CLR4_5_21sd1sdlvl9ef73.R.inc(2352);byteBuffer.put(Utf8.convert(schemeUri));
        }
    }}finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_21sd1sdlvl9ef73.R.inc(2353);
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2354);StringBuilder buffer = new StringBuilder();
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2355);buffer.append("Schema Type Box[");
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2356);buffer.append("schemeUri=").append(schemeUri).append("; ");
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2357);buffer.append("schemeType=").append(schemeType).append("; ");
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2358);buffer.append("schemeVersion=").append(schemeVersion).append("; ");
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2359);buffer.append("]");
        __CLR4_5_21sd1sdlvl9ef73.R.inc(2360);return buffer.toString();
    }finally{__CLR4_5_21sd1sdlvl9ef73.R.flushNeeded();}}
}
