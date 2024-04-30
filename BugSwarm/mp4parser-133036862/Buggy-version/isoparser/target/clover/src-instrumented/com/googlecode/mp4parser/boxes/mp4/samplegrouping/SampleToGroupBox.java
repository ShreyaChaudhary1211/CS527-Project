/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 castLabs, Berlin
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

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <p>This table can be used to find the group that a sample belongs to and the associated description of that
 * sample group. The table is compactly coded with each entry giving the index of the first sample of a run of
 * samples with the same sample group descriptor. The sample group description ID is an index that refers to a
 * SampleGroupDescription box, which contains entries describing the characteristics of each sample group.</p>
 * <p>There may be multiple instances of this box if there is more than one sample grouping for the samples in a
 * track. Each instance of the SampleToGroup box has a type code that distinguishes different sample
 * groupings. Within a track, there shall be at most one instance of this box with a particular grouping type. The
 * associated SampleGroupDescription shall indicate the same value for the grouping type.</p>
 * <p>Version 1 of this box should only be used if a grouping type parameter is needed.</p>
 */
public class SampleToGroupBox extends AbstractFullBox {public static class __CLR4_5_2e1ge1glvlulmqp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,18273,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "sbgp";


    private String groupingType;
    private String groupingTypeParameter;

    List<Entry> entries = new LinkedList<Entry>();

    public SampleToGroupBox() {
        super(TYPE);__CLR4_5_2e1ge1glvlulmqp.R.inc(18197);try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18196);

    }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18198);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18199);return (((this.getVersion() == 1 )&&(__CLR4_5_2e1ge1glvlulmqp.R.iget(18200)!=0|true))||(__CLR4_5_2e1ge1glvlulmqp.R.iget(18201)==0&false))? entries.size() * 8 + 16 : entries.size() * 8 + 12;
    }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18202);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18203);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18204);byteBuffer.put(groupingType.getBytes());
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18205);if ((((this.getVersion() == 1)&&(__CLR4_5_2e1ge1glvlulmqp.R.iget(18206)!=0|true))||(__CLR4_5_2e1ge1glvlulmqp.R.iget(18207)==0&false))) {{
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18208);byteBuffer.put(groupingTypeParameter.getBytes());
        }
        }__CLR4_5_2e1ge1glvlulmqp.R.inc(18209);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18210);for (Entry entry : entries) {{
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18211);IsoTypeWriter.writeUInt32(byteBuffer, entry.getSampleCount());
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18212);IsoTypeWriter.writeUInt32(byteBuffer, entry.getGroupDescriptionIndex());
        }

    }}finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18213);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18214);parseVersionAndFlags(content);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18215);groupingType = IsoTypeReader.read4cc(content);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18216);if ((((this.getVersion() == 1)&&(__CLR4_5_2e1ge1glvlulmqp.R.iget(18217)!=0|true))||(__CLR4_5_2e1ge1glvlulmqp.R.iget(18218)==0&false))) {{
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18219);groupingTypeParameter = IsoTypeReader.read4cc(content);
        }
        }__CLR4_5_2e1ge1glvlulmqp.R.inc(18220);long entryCount = IsoTypeReader.readUInt32(content);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18221);while ((((entryCount-- > 0)&&(__CLR4_5_2e1ge1glvlulmqp.R.iget(18222)!=0|true))||(__CLR4_5_2e1ge1glvlulmqp.R.iget(18223)==0&false))) {{
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18224);entries.add(new Entry(l2i(IsoTypeReader.readUInt32(content)), l2i(IsoTypeReader.readUInt32(content))));
        }
    }}finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

    public static class Entry {
        private long sampleCount;
        private int groupDescriptionIndex;

        public Entry(long sampleCount, int groupDescriptionIndex) {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18225);
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18226);this.sampleCount = sampleCount;
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18227);this.groupDescriptionIndex = groupDescriptionIndex;
        }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

        public long getSampleCount() {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18228);
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18229);return sampleCount;
        }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

        public void setSampleCount(long sampleCount) {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18230);
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18231);this.sampleCount = sampleCount;
        }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

        public int getGroupDescriptionIndex() {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18232);
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18233);return groupDescriptionIndex;
        }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

        public void setGroupDescriptionIndex(int groupDescriptionIndex) {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18234);
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18235);this.groupDescriptionIndex = groupDescriptionIndex;
        }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18236);
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18237);return "Entry{" +
                    "sampleCount=" + sampleCount +
                    ", groupDescriptionIndex=" + groupDescriptionIndex +
                    '}';
        }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18238);
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18239);if ((((this == o)&&(__CLR4_5_2e1ge1glvlulmqp.R.iget(18240)!=0|true))||(__CLR4_5_2e1ge1glvlulmqp.R.iget(18241)==0&false))) {{
                __CLR4_5_2e1ge1glvlulmqp.R.inc(18242);return true;
            }
            }__CLR4_5_2e1ge1glvlulmqp.R.inc(18243);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2e1ge1glvlulmqp.R.iget(18244)!=0|true))||(__CLR4_5_2e1ge1glvlulmqp.R.iget(18245)==0&false))) {{
                __CLR4_5_2e1ge1glvlulmqp.R.inc(18246);return false;
            }

            }__CLR4_5_2e1ge1glvlulmqp.R.inc(18247);Entry entry = (Entry) o;

            __CLR4_5_2e1ge1glvlulmqp.R.inc(18248);if ((((groupDescriptionIndex != entry.groupDescriptionIndex)&&(__CLR4_5_2e1ge1glvlulmqp.R.iget(18249)!=0|true))||(__CLR4_5_2e1ge1glvlulmqp.R.iget(18250)==0&false))) {{
                __CLR4_5_2e1ge1glvlulmqp.R.inc(18251);return false;
            }
            }__CLR4_5_2e1ge1glvlulmqp.R.inc(18252);if ((((sampleCount != entry.sampleCount)&&(__CLR4_5_2e1ge1glvlulmqp.R.iget(18253)!=0|true))||(__CLR4_5_2e1ge1glvlulmqp.R.iget(18254)==0&false))) {{
                __CLR4_5_2e1ge1glvlulmqp.R.inc(18255);return false;
            }

            }__CLR4_5_2e1ge1glvlulmqp.R.inc(18256);return true;
        }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18257);
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18258);int result = (int) (sampleCount ^ (sampleCount >>> 32));
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18259);result = 31 * result + groupDescriptionIndex;
            __CLR4_5_2e1ge1glvlulmqp.R.inc(18260);return result;
        }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}
    }

    public String getGroupingType() {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18261);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18262);return groupingType;
    }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

    public void setGroupingType(String groupingType) {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18263);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18264);this.groupingType = groupingType;
    }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

    public String getGroupingTypeParameter() {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18265);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18266);return groupingTypeParameter;
    }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

    public void setGroupingTypeParameter(String groupingTypeParameter) {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18267);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18268);this.groupingTypeParameter = groupingTypeParameter;
    }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18269);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18270);return entries;
    }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_2e1ge1glvlulmqp.R.inc(18271);
        __CLR4_5_2e1ge1glvlulmqp.R.inc(18272);this.entries = entries;
    }finally{__CLR4_5_2e1ge1glvlulmqp.R.flushNeeded();}}
}
