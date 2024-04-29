/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2011 castLabs, Berlin
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

package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <pre>
 * AssetInformationBox as defined the DECE Common File Format Spec.
 * aligned(8) class AssetInformationBox
 * extends FullBox(\u2018ainf\u2019, version=1, flags)
 * {
 *  string 				mimeSubtypeName;
 *  string				codecs;
 *  unsigned int(8) 	encrypted;
 *  unsigned int(8) 	entry_count;
 *  for( int i=0; i &lt; entry_count; i++)
 *  {
 *   string	namespace;
 *   string	profile-level-idc;
 *   string	asset_id;
 *  }
 * }
 * </pre>
 */
public class AssetInformationBox extends AbstractFullBox {public static class __CLR4_5_2bt5bt5lvl9ek01{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,15380,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "ainf";

    String apid = "";
    String profileVersion = "0000";

    public static class Entry {
        public Entry(String namespace, String profileLevelIdc, String assetId) {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15305);
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15306);this.namespace = namespace;
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15307);this.profileLevelIdc = profileLevelIdc;
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15308);this.assetId = assetId;
        }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

        public String namespace;
        public String profileLevelIdc;
        public String assetId;

        @Override
        public String toString() {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15309);
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15310);return "{" +
                    "namespace='" + namespace + '\'' +
                    ", profileLevelIdc='" + profileLevelIdc + '\'' +
                    ", assetId='" + assetId + '\'' +
                    '}';
        }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15311);
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15312);if ((((this == o)&&(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15313)!=0|true))||(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15314)==0&false))) {__CLR4_5_2bt5bt5lvl9ek01.R.inc(15315);return true;
            }__CLR4_5_2bt5bt5lvl9ek01.R.inc(15316);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15317)!=0|true))||(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15318)==0&false))) {__CLR4_5_2bt5bt5lvl9ek01.R.inc(15319);return false;

            }__CLR4_5_2bt5bt5lvl9ek01.R.inc(15320);Entry entry = (Entry) o;

            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15321);if ((((!assetId.equals(entry.assetId))&&(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15322)!=0|true))||(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15323)==0&false))) {__CLR4_5_2bt5bt5lvl9ek01.R.inc(15324);return false;
            }__CLR4_5_2bt5bt5lvl9ek01.R.inc(15325);if ((((!namespace.equals(entry.namespace))&&(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15326)!=0|true))||(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15327)==0&false))) {__CLR4_5_2bt5bt5lvl9ek01.R.inc(15328);return false;
            }__CLR4_5_2bt5bt5lvl9ek01.R.inc(15329);if ((((!profileLevelIdc.equals(entry.profileLevelIdc))&&(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15330)!=0|true))||(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15331)==0&false))) {__CLR4_5_2bt5bt5lvl9ek01.R.inc(15332);return false;

            }__CLR4_5_2bt5bt5lvl9ek01.R.inc(15333);return true;
        }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15334);
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15335);int result = namespace.hashCode();
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15336);result = 31 * result + profileLevelIdc.hashCode();
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15337);result = 31 * result + assetId.hashCode();
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15338);return result;
        }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

        public int getSize() {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15339);
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15340);return 3 + Utf8.utf8StringLengthInBytes(namespace) +
                    Utf8.utf8StringLengthInBytes(profileLevelIdc) + Utf8.utf8StringLengthInBytes(assetId);
        }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}
    }

    public AssetInformationBox() {
        super(TYPE);__CLR4_5_2bt5bt5lvl9ek01.R.inc(15342);try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15341);
    }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15343);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15344);return Utf8.utf8StringLengthInBytes(apid) + 9;
    }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}


    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15345);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15346);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15347);if ((((getVersion() == 0)&&(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15348)!=0|true))||(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15349)==0&false))) {{
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15350);byteBuffer.put(Utf8.convert(profileVersion), 0, 4);
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15351);byteBuffer.put(Utf8.convert(apid));
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15352);byteBuffer.put((byte) 0);
        } }else {{
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15353);throw new RuntimeException("Unknown ainf version " + getVersion());
        }
    }}finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}


    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15354);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15355);parseVersionAndFlags(content);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15356);profileVersion = IsoTypeReader.readString(content, 4);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15357);apid = IsoTypeReader.readString(content);
    }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

    public String getApid() {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15358);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15359);return apid;
    }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

    public void setApid(String apid) {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15360);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15361);this.apid = apid;
    }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

    public String getProfileVersion() {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15362);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15363);return profileVersion;
    }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

    public void setProfileVersion(String profileVersion) {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15364);
        assert (((profileVersion != null && profileVersion.length() == 4)&&(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15365)!=0|true))||(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15366)==0&false));
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15367);this.profileVersion = profileVersion;
    }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}


    @DoNotParseDetail
    public boolean isHidden() {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15368);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15369);return (getFlags() & 1) == 1;
    }finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}

    @DoNotParseDetail
    public void setHidden(boolean hidden) {try{__CLR4_5_2bt5bt5lvl9ek01.R.inc(15370);
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15371);int flags = getFlags();
        __CLR4_5_2bt5bt5lvl9ek01.R.inc(15372);if ((((isHidden() ^ hidden)&&(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15373)!=0|true))||(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15374)==0&false))) {{
            __CLR4_5_2bt5bt5lvl9ek01.R.inc(15375);if ((((hidden)&&(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15376)!=0|true))||(__CLR4_5_2bt5bt5lvl9ek01.R.iget(15377)==0&false))) {{
                __CLR4_5_2bt5bt5lvl9ek01.R.inc(15378);setFlags(flags | 1);
            } }else {{
                __CLR4_5_2bt5bt5lvl9ek01.R.inc(15379);setFlags(flags & 0xFFFFFE);
            }
        }}
    }}finally{__CLR4_5_2bt5bt5lvl9ek01.R.flushNeeded();}}


}
