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
public class SampleToGroupBox extends AbstractFullBox {public static class __CLR4_5_2dytdytlvl9eklc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18178,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "sbgp";


    private String groupingType;
    private String groupingTypeParameter;

    List<Entry> entries = new LinkedList<Entry>();

    public SampleToGroupBox() {
        super(TYPE);__CLR4_5_2dytdytlvl9eklc.R.inc(18102);try{__CLR4_5_2dytdytlvl9eklc.R.inc(18101);

    }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18103);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18104);return (((this.getVersion() == 1 )&&(__CLR4_5_2dytdytlvl9eklc.R.iget(18105)!=0|true))||(__CLR4_5_2dytdytlvl9eklc.R.iget(18106)==0&false))? entries.size() * 8 + 16 : entries.size() * 8 + 12;
    }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18107);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18108);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18109);byteBuffer.put(groupingType.getBytes());
        __CLR4_5_2dytdytlvl9eklc.R.inc(18110);if ((((this.getVersion() == 1)&&(__CLR4_5_2dytdytlvl9eklc.R.iget(18111)!=0|true))||(__CLR4_5_2dytdytlvl9eklc.R.iget(18112)==0&false))) {{
            __CLR4_5_2dytdytlvl9eklc.R.inc(18113);byteBuffer.put(groupingTypeParameter.getBytes());
        }
        }__CLR4_5_2dytdytlvl9eklc.R.inc(18114);IsoTypeWriter.writeUInt32(byteBuffer, entries.size());
        __CLR4_5_2dytdytlvl9eklc.R.inc(18115);for (Entry entry : entries) {{
            __CLR4_5_2dytdytlvl9eklc.R.inc(18116);IsoTypeWriter.writeUInt32(byteBuffer, entry.getSampleCount());
            __CLR4_5_2dytdytlvl9eklc.R.inc(18117);IsoTypeWriter.writeUInt32(byteBuffer, entry.getGroupDescriptionIndex());
        }

    }}finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18118);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18119);parseVersionAndFlags(content);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18120);groupingType = IsoTypeReader.read4cc(content);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18121);if ((((this.getVersion() == 1)&&(__CLR4_5_2dytdytlvl9eklc.R.iget(18122)!=0|true))||(__CLR4_5_2dytdytlvl9eklc.R.iget(18123)==0&false))) {{
            __CLR4_5_2dytdytlvl9eklc.R.inc(18124);groupingTypeParameter = IsoTypeReader.read4cc(content);
        }
        }__CLR4_5_2dytdytlvl9eklc.R.inc(18125);long entryCount = IsoTypeReader.readUInt32(content);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18126);while ((((entryCount-- > 0)&&(__CLR4_5_2dytdytlvl9eklc.R.iget(18127)!=0|true))||(__CLR4_5_2dytdytlvl9eklc.R.iget(18128)==0&false))) {{
            __CLR4_5_2dytdytlvl9eklc.R.inc(18129);entries.add(new Entry(l2i(IsoTypeReader.readUInt32(content)), l2i(IsoTypeReader.readUInt32(content))));
        }
    }}finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

    public static class Entry {
        private long sampleCount;
        private int groupDescriptionIndex;

        public Entry(long sampleCount, int groupDescriptionIndex) {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18130);
            __CLR4_5_2dytdytlvl9eklc.R.inc(18131);this.sampleCount = sampleCount;
            __CLR4_5_2dytdytlvl9eklc.R.inc(18132);this.groupDescriptionIndex = groupDescriptionIndex;
        }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

        public long getSampleCount() {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18133);
            __CLR4_5_2dytdytlvl9eklc.R.inc(18134);return sampleCount;
        }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

        public void setSampleCount(long sampleCount) {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18135);
            __CLR4_5_2dytdytlvl9eklc.R.inc(18136);this.sampleCount = sampleCount;
        }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

        public int getGroupDescriptionIndex() {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18137);
            __CLR4_5_2dytdytlvl9eklc.R.inc(18138);return groupDescriptionIndex;
        }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

        public void setGroupDescriptionIndex(int groupDescriptionIndex) {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18139);
            __CLR4_5_2dytdytlvl9eklc.R.inc(18140);this.groupDescriptionIndex = groupDescriptionIndex;
        }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18141);
            __CLR4_5_2dytdytlvl9eklc.R.inc(18142);return "Entry{" +
                    "sampleCount=" + sampleCount +
                    ", groupDescriptionIndex=" + groupDescriptionIndex +
                    '}';
        }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18143);
            __CLR4_5_2dytdytlvl9eklc.R.inc(18144);if ((((this == o)&&(__CLR4_5_2dytdytlvl9eklc.R.iget(18145)!=0|true))||(__CLR4_5_2dytdytlvl9eklc.R.iget(18146)==0&false))) {{
                __CLR4_5_2dytdytlvl9eklc.R.inc(18147);return true;
            }
            }__CLR4_5_2dytdytlvl9eklc.R.inc(18148);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2dytdytlvl9eklc.R.iget(18149)!=0|true))||(__CLR4_5_2dytdytlvl9eklc.R.iget(18150)==0&false))) {{
                __CLR4_5_2dytdytlvl9eklc.R.inc(18151);return false;
            }

            }__CLR4_5_2dytdytlvl9eklc.R.inc(18152);Entry entry = (Entry) o;

            __CLR4_5_2dytdytlvl9eklc.R.inc(18153);if ((((groupDescriptionIndex != entry.groupDescriptionIndex)&&(__CLR4_5_2dytdytlvl9eklc.R.iget(18154)!=0|true))||(__CLR4_5_2dytdytlvl9eklc.R.iget(18155)==0&false))) {{
                __CLR4_5_2dytdytlvl9eklc.R.inc(18156);return false;
            }
            }__CLR4_5_2dytdytlvl9eklc.R.inc(18157);if ((((sampleCount != entry.sampleCount)&&(__CLR4_5_2dytdytlvl9eklc.R.iget(18158)!=0|true))||(__CLR4_5_2dytdytlvl9eklc.R.iget(18159)==0&false))) {{
                __CLR4_5_2dytdytlvl9eklc.R.inc(18160);return false;
            }

            }__CLR4_5_2dytdytlvl9eklc.R.inc(18161);return true;
        }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18162);
            __CLR4_5_2dytdytlvl9eklc.R.inc(18163);int result = (int) (sampleCount ^ (sampleCount >>> 32));
            __CLR4_5_2dytdytlvl9eklc.R.inc(18164);result = 31 * result + groupDescriptionIndex;
            __CLR4_5_2dytdytlvl9eklc.R.inc(18165);return result;
        }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}
    }

    public String getGroupingType() {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18166);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18167);return groupingType;
    }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

    public void setGroupingType(String groupingType) {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18168);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18169);this.groupingType = groupingType;
    }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

    public String getGroupingTypeParameter() {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18170);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18171);return groupingTypeParameter;
    }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

    public void setGroupingTypeParameter(String groupingTypeParameter) {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18172);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18173);this.groupingTypeParameter = groupingTypeParameter;
    }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18174);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18175);return entries;
    }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_2dytdytlvl9eklc.R.inc(18176);
        __CLR4_5_2dytdytlvl9eklc.R.inc(18177);this.entries = entries;
    }finally{__CLR4_5_2dytdytlvl9eklc.R.flushNeeded();}}
}
