/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2009 castLabs GmbH, Berlin
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

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <pre>
 * aligned(8) class SampleDependencyTypeBox extends FullBox('sdtp', version = 0, 0) {
 *  for (i=0; i &lt; sample_count; i++){
 *   unsigned int(2) isLeading;
 *   unsigned int(2) sample_depends_on;
 *   unsigned int(2) sample_is_depended_on;
 *   unsigned int(2) sample_has_redundancy;
 *  }
 * }
 * </pre>
 */
public class SampleDependencyTypeBox extends AbstractFullBox {public static class __CLR4_5_21k21k2lvl9ef4t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,2079,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "sdtp";

    private List<Entry> entries = new ArrayList<Entry>();

    public static class Entry {

        public Entry(int value) {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2018);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2019);this.value = value;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        private int value;


        public int getIsLeading() {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2020);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2021);return (value >> 6) & 0x03;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        public void setIsLeading(int res) {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2022);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2023);value = (res & 0x03) << 6 | value & 0x3f;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        public int getSampleDependsOn() {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2024);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2025);return (value >> 4) & 0x03;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        public void setSampleDependsOn(int sdo) {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2026);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2027);value = (sdo & 0x03) << 4 | value & 0xcf;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        public int getSampleIsDependentOn() {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2028);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2029);return (value >> 2) & 0x03;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        public void setSampleIsDependentOn(int sido) {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2030);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2031);value = (sido & 0x03) << 2 | value & 0xf3;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        public int getSampleHasRedundancy() {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2032);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2033);return value & 0x03;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        public void setSampleHasRedundancy(int shr) {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2034);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2035);value = shr & 0x03 | value & 0xfc;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2036);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2037);return "Entry{" +
                    "isLeading=" + getIsLeading() +
                    ", sampleDependsOn=" + getSampleDependsOn() +
                    ", sampleIsDependentOn=" + getSampleIsDependentOn() +
                    ", sampleHasRedundancy=" + getSampleHasRedundancy() +
                    '}';
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2038);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2039);if ((((this == o)&&(__CLR4_5_21k21k2lvl9ef4t.R.iget(2040)!=0|true))||(__CLR4_5_21k21k2lvl9ef4t.R.iget(2041)==0&false))) {__CLR4_5_21k21k2lvl9ef4t.R.inc(2042);return true;
            }__CLR4_5_21k21k2lvl9ef4t.R.inc(2043);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_21k21k2lvl9ef4t.R.iget(2044)!=0|true))||(__CLR4_5_21k21k2lvl9ef4t.R.iget(2045)==0&false))) {__CLR4_5_21k21k2lvl9ef4t.R.inc(2046);return false;

            }__CLR4_5_21k21k2lvl9ef4t.R.inc(2047);Entry entry = (Entry) o;

            __CLR4_5_21k21k2lvl9ef4t.R.inc(2048);if ((((value != entry.value)&&(__CLR4_5_21k21k2lvl9ef4t.R.iget(2049)!=0|true))||(__CLR4_5_21k21k2lvl9ef4t.R.iget(2050)==0&false))) {__CLR4_5_21k21k2lvl9ef4t.R.inc(2051);return false;

            }__CLR4_5_21k21k2lvl9ef4t.R.inc(2052);return true;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2053);
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2054);return value;
        }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}
    }

    public SampleDependencyTypeBox() {
        super(TYPE);__CLR4_5_21k21k2lvl9ef4t.R.inc(2056);try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2055);
    }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2057);
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2058);return 4 + entries.size();
    }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2059);
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2060);writeVersionAndFlags(byteBuffer);
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2061);for (Entry entry : entries) {{
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2062);IsoTypeWriter.writeUInt8(byteBuffer, entry.value);
        }
    }}finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2063);
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2064);parseVersionAndFlags(content);
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2065);while ((((content.remaining() > 0)&&(__CLR4_5_21k21k2lvl9ef4t.R.iget(2066)!=0|true))||(__CLR4_5_21k21k2lvl9ef4t.R.iget(2067)==0&false))) {{
            __CLR4_5_21k21k2lvl9ef4t.R.inc(2068);entries.add(new Entry(IsoTypeReader.readUInt8(content)));
        }
    }}finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2069);
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2070);return entries;
    }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2071);
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2072);this.entries = entries;
    }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_21k21k2lvl9ef4t.R.inc(2073);
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2074);final StringBuilder sb = new StringBuilder();
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2075);sb.append("SampleDependencyTypeBox");
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2076);sb.append("{entries=").append(entries);
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2077);sb.append('}');
        __CLR4_5_21k21k2lvl9ef4t.R.inc(2078);return sb.toString();
    }finally{__CLR4_5_21k21k2lvl9ef4t.R.flushNeeded();}}
}
