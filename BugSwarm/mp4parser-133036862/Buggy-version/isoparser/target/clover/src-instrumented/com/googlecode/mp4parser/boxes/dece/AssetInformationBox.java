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
public class AssetInformationBox extends AbstractFullBox {public static class __CLR4_5_2bvsbvslvlulket{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,15475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "ainf";

    String apid = "";
    String profileVersion = "0000";

    public static class Entry {
        public Entry(String namespace, String profileLevelIdc, String assetId) {try{__CLR4_5_2bvsbvslvlulket.R.inc(15400);
            __CLR4_5_2bvsbvslvlulket.R.inc(15401);this.namespace = namespace;
            __CLR4_5_2bvsbvslvlulket.R.inc(15402);this.profileLevelIdc = profileLevelIdc;
            __CLR4_5_2bvsbvslvlulket.R.inc(15403);this.assetId = assetId;
        }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

        public String namespace;
        public String profileLevelIdc;
        public String assetId;

        @Override
        public String toString() {try{__CLR4_5_2bvsbvslvlulket.R.inc(15404);
            __CLR4_5_2bvsbvslvlulket.R.inc(15405);return "{" +
                    "namespace='" + namespace + '\'' +
                    ", profileLevelIdc='" + profileLevelIdc + '\'' +
                    ", assetId='" + assetId + '\'' +
                    '}';
        }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2bvsbvslvlulket.R.inc(15406);
            __CLR4_5_2bvsbvslvlulket.R.inc(15407);if ((((this == o)&&(__CLR4_5_2bvsbvslvlulket.R.iget(15408)!=0|true))||(__CLR4_5_2bvsbvslvlulket.R.iget(15409)==0&false))) {__CLR4_5_2bvsbvslvlulket.R.inc(15410);return true;
            }__CLR4_5_2bvsbvslvlulket.R.inc(15411);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2bvsbvslvlulket.R.iget(15412)!=0|true))||(__CLR4_5_2bvsbvslvlulket.R.iget(15413)==0&false))) {__CLR4_5_2bvsbvslvlulket.R.inc(15414);return false;

            }__CLR4_5_2bvsbvslvlulket.R.inc(15415);Entry entry = (Entry) o;

            __CLR4_5_2bvsbvslvlulket.R.inc(15416);if ((((!assetId.equals(entry.assetId))&&(__CLR4_5_2bvsbvslvlulket.R.iget(15417)!=0|true))||(__CLR4_5_2bvsbvslvlulket.R.iget(15418)==0&false))) {__CLR4_5_2bvsbvslvlulket.R.inc(15419);return false;
            }__CLR4_5_2bvsbvslvlulket.R.inc(15420);if ((((!namespace.equals(entry.namespace))&&(__CLR4_5_2bvsbvslvlulket.R.iget(15421)!=0|true))||(__CLR4_5_2bvsbvslvlulket.R.iget(15422)==0&false))) {__CLR4_5_2bvsbvslvlulket.R.inc(15423);return false;
            }__CLR4_5_2bvsbvslvlulket.R.inc(15424);if ((((!profileLevelIdc.equals(entry.profileLevelIdc))&&(__CLR4_5_2bvsbvslvlulket.R.iget(15425)!=0|true))||(__CLR4_5_2bvsbvslvlulket.R.iget(15426)==0&false))) {__CLR4_5_2bvsbvslvlulket.R.inc(15427);return false;

            }__CLR4_5_2bvsbvslvlulket.R.inc(15428);return true;
        }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2bvsbvslvlulket.R.inc(15429);
            __CLR4_5_2bvsbvslvlulket.R.inc(15430);int result = namespace.hashCode();
            __CLR4_5_2bvsbvslvlulket.R.inc(15431);result = 31 * result + profileLevelIdc.hashCode();
            __CLR4_5_2bvsbvslvlulket.R.inc(15432);result = 31 * result + assetId.hashCode();
            __CLR4_5_2bvsbvslvlulket.R.inc(15433);return result;
        }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

        public int getSize() {try{__CLR4_5_2bvsbvslvlulket.R.inc(15434);
            __CLR4_5_2bvsbvslvlulket.R.inc(15435);return 3 + Utf8.utf8StringLengthInBytes(namespace) +
                    Utf8.utf8StringLengthInBytes(profileLevelIdc) + Utf8.utf8StringLengthInBytes(assetId);
        }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}
    }

    public AssetInformationBox() {
        super(TYPE);__CLR4_5_2bvsbvslvlulket.R.inc(15437);try{__CLR4_5_2bvsbvslvlulket.R.inc(15436);
    }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bvsbvslvlulket.R.inc(15438);
        __CLR4_5_2bvsbvslvlulket.R.inc(15439);return Utf8.utf8StringLengthInBytes(apid) + 9;
    }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}


    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bvsbvslvlulket.R.inc(15440);
        __CLR4_5_2bvsbvslvlulket.R.inc(15441);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2bvsbvslvlulket.R.inc(15442);if ((((getVersion() == 0)&&(__CLR4_5_2bvsbvslvlulket.R.iget(15443)!=0|true))||(__CLR4_5_2bvsbvslvlulket.R.iget(15444)==0&false))) {{
            __CLR4_5_2bvsbvslvlulket.R.inc(15445);byteBuffer.put(Utf8.convert(profileVersion), 0, 4);
            __CLR4_5_2bvsbvslvlulket.R.inc(15446);byteBuffer.put(Utf8.convert(apid));
            __CLR4_5_2bvsbvslvlulket.R.inc(15447);byteBuffer.put((byte) 0);
        } }else {{
            __CLR4_5_2bvsbvslvlulket.R.inc(15448);throw new RuntimeException("Unknown ainf version " + getVersion());
        }
    }}finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}


    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bvsbvslvlulket.R.inc(15449);
        __CLR4_5_2bvsbvslvlulket.R.inc(15450);parseVersionAndFlags(content);
        __CLR4_5_2bvsbvslvlulket.R.inc(15451);profileVersion = IsoTypeReader.readString(content, 4);
        __CLR4_5_2bvsbvslvlulket.R.inc(15452);apid = IsoTypeReader.readString(content);
    }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

    public String getApid() {try{__CLR4_5_2bvsbvslvlulket.R.inc(15453);
        __CLR4_5_2bvsbvslvlulket.R.inc(15454);return apid;
    }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

    public void setApid(String apid) {try{__CLR4_5_2bvsbvslvlulket.R.inc(15455);
        __CLR4_5_2bvsbvslvlulket.R.inc(15456);this.apid = apid;
    }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

    public String getProfileVersion() {try{__CLR4_5_2bvsbvslvlulket.R.inc(15457);
        __CLR4_5_2bvsbvslvlulket.R.inc(15458);return profileVersion;
    }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

    public void setProfileVersion(String profileVersion) {try{__CLR4_5_2bvsbvslvlulket.R.inc(15459);
        assert (((profileVersion != null && profileVersion.length() == 4)&&(__CLR4_5_2bvsbvslvlulket.R.iget(15460)!=0|true))||(__CLR4_5_2bvsbvslvlulket.R.iget(15461)==0&false));
        __CLR4_5_2bvsbvslvlulket.R.inc(15462);this.profileVersion = profileVersion;
    }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}


    @DoNotParseDetail
    public boolean isHidden() {try{__CLR4_5_2bvsbvslvlulket.R.inc(15463);
        __CLR4_5_2bvsbvslvlulket.R.inc(15464);return (getFlags() & 1) == 1;
    }finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}

    @DoNotParseDetail
    public void setHidden(boolean hidden) {try{__CLR4_5_2bvsbvslvlulket.R.inc(15465);
        __CLR4_5_2bvsbvslvlulket.R.inc(15466);int flags = getFlags();
        __CLR4_5_2bvsbvslvlulket.R.inc(15467);if ((((isHidden() ^ hidden)&&(__CLR4_5_2bvsbvslvlulket.R.iget(15468)!=0|true))||(__CLR4_5_2bvsbvslvlulket.R.iget(15469)==0&false))) {{
            __CLR4_5_2bvsbvslvlulket.R.inc(15470);if ((((hidden)&&(__CLR4_5_2bvsbvslvlulket.R.iget(15471)!=0|true))||(__CLR4_5_2bvsbvslvlulket.R.iget(15472)==0&false))) {{
                __CLR4_5_2bvsbvslvlulket.R.inc(15473);setFlags(flags | 1);
            } }else {{
                __CLR4_5_2bvsbvslvlulket.R.inc(15474);setFlags(flags & 0xFFFFFE);
            }
        }}
    }}finally{__CLR4_5_2bvsbvslvlulket.R.flushNeeded();}}


}
