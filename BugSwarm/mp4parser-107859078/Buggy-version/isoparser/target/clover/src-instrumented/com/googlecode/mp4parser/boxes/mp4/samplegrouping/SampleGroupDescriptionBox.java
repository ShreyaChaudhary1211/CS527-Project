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

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.mp4parser.iso14496.part15.StepwiseTemporalLayerEntry;
import com.mp4parser.iso14496.part15.SyncSampleEntry;
import com.mp4parser.iso14496.part15.TemporalLayerSampleGroup;
import com.mp4parser.iso14496.part15.TemporalSubLayerSampleGroup;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <p>This description table gives information about the characteristics of sample groups. The descriptive
 * information is any other information needed to define or characterize the sample group.</p>
 * <p>There may be multiple instances of this box if there is more than one sample grouping for the samples in a
 * track. Each instance of the SampleGroupDescription box has a type code that distinguishes different
 * sample groupings. Within a track, there shall be at most one instance of this box with a particular grouping
 * type. The associated SampleToGroup shall indicate the same value for the grouping type.</p>
 * <p>The information is stored in the sample group description box after the entry-count. An abstract entry type is
 * defined and sample groupings shall define derived types to represent the description of each sample group.
 * For video tracks, an abstract VisualSampleGroupEntry is used with similar types for audio and hint tracks.</p>
 */
public class SampleGroupDescriptionBox extends AbstractFullBox {public static class __CLR4_5_2dusduslvl9ekl2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18101,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "sgpd";
    private String groupingType;
    private int defaultLength;
    private List<GroupEntry> groupEntries = new LinkedList<GroupEntry>();

    public SampleGroupDescriptionBox() {
        super(TYPE);__CLR4_5_2dusduslvl9ekl2.R.inc(17957);try{__CLR4_5_2dusduslvl9ekl2.R.inc(17956);
        __CLR4_5_2dusduslvl9ekl2.R.inc(17958);setVersion(1);
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    public String getGroupingType() {try{__CLR4_5_2dusduslvl9ekl2.R.inc(17959);
        __CLR4_5_2dusduslvl9ekl2.R.inc(17960);return groupingType;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    public void setGroupingType(String groupingType) {try{__CLR4_5_2dusduslvl9ekl2.R.inc(17961);
        __CLR4_5_2dusduslvl9ekl2.R.inc(17962);this.groupingType = groupingType;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2dusduslvl9ekl2.R.inc(17963);
        __CLR4_5_2dusduslvl9ekl2.R.inc(17964);long size = 8;
        __CLR4_5_2dusduslvl9ekl2.R.inc(17965);if ((((getVersion() == 1)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(17966)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(17967)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(17968);size += 4;
        }
        }__CLR4_5_2dusduslvl9ekl2.R.inc(17969);size += 4; // entryCount
        __CLR4_5_2dusduslvl9ekl2.R.inc(17970);for (GroupEntry groupEntry : groupEntries) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(17971);if ((((getVersion() == 1 && defaultLength == 0)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(17972)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(17973)==0&false))) {{
                __CLR4_5_2dusduslvl9ekl2.R.inc(17974);size += 4;
            }
            }__CLR4_5_2dusduslvl9ekl2.R.inc(17975);size += groupEntry.size();
        }
        }__CLR4_5_2dusduslvl9ekl2.R.inc(17976);return size;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2dusduslvl9ekl2.R.inc(17977);
        __CLR4_5_2dusduslvl9ekl2.R.inc(17978);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2dusduslvl9ekl2.R.inc(17979);byteBuffer.put(IsoFile.fourCCtoBytes(groupingType));
        __CLR4_5_2dusduslvl9ekl2.R.inc(17980);if ((((this.getVersion() == 1)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(17981)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(17982)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(17983);IsoTypeWriter.writeUInt32(byteBuffer, defaultLength);
        }
        }__CLR4_5_2dusduslvl9ekl2.R.inc(17984);IsoTypeWriter.writeUInt32(byteBuffer, this.groupEntries.size());
        __CLR4_5_2dusduslvl9ekl2.R.inc(17985);for (GroupEntry entry : groupEntries) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(17986);if ((((this.getVersion() == 1 && defaultLength == 0)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(17987)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(17988)==0&false))) {{
                __CLR4_5_2dusduslvl9ekl2.R.inc(17989);IsoTypeWriter.writeUInt32(byteBuffer, entry.get().limit());
            }
            }__CLR4_5_2dusduslvl9ekl2.R.inc(17990);byteBuffer.put(entry.get());
        }
    }}finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2dusduslvl9ekl2.R.inc(17991);
        __CLR4_5_2dusduslvl9ekl2.R.inc(17992);parseVersionAndFlags(content);
        __CLR4_5_2dusduslvl9ekl2.R.inc(17993);if ((((this.getVersion() != 1)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(17994)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(17995)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(17996);throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
        }__CLR4_5_2dusduslvl9ekl2.R.inc(17997);groupingType = IsoTypeReader.read4cc(content);
        __CLR4_5_2dusduslvl9ekl2.R.inc(17998);if ((((this.getVersion() == 1)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(17999)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18000)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18001);defaultLength = l2i(IsoTypeReader.readUInt32(content));
        }
        }__CLR4_5_2dusduslvl9ekl2.R.inc(18002);long entryCount = IsoTypeReader.readUInt32(content);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18003);while ((((entryCount-- > 0)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18004)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18005)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18006);int length = defaultLength;
            __CLR4_5_2dusduslvl9ekl2.R.inc(18007);if ((((this.getVersion() == 1)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18008)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18009)==0&false))) {{
                __CLR4_5_2dusduslvl9ekl2.R.inc(18010);if ((((defaultLength == 0)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18011)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18012)==0&false))) {{
                    __CLR4_5_2dusduslvl9ekl2.R.inc(18013);length = l2i(IsoTypeReader.readUInt32(content));
                }
            }} }else {{
                __CLR4_5_2dusduslvl9ekl2.R.inc(18014);throw new RuntimeException("This should be implemented");
            }
            }__CLR4_5_2dusduslvl9ekl2.R.inc(18015);int finalPos = content.position() + length;
            __CLR4_5_2dusduslvl9ekl2.R.inc(18016);ByteBuffer parseMe = content.slice();
            __CLR4_5_2dusduslvl9ekl2.R.inc(18017);parseMe.limit(length);
            __CLR4_5_2dusduslvl9ekl2.R.inc(18018);groupEntries.add(parseGroupEntry(parseMe, groupingType));
            __CLR4_5_2dusduslvl9ekl2.R.inc(18019);content.position(finalPos);
        }

    }}finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    private GroupEntry parseGroupEntry(ByteBuffer content, String groupingType) {try{__CLR4_5_2dusduslvl9ekl2.R.inc(18020);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18021);GroupEntry groupEntry;
        __CLR4_5_2dusduslvl9ekl2.R.inc(18022);if ((((RollRecoveryEntry.TYPE.equals(groupingType))&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18023)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18024)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18025);groupEntry = new RollRecoveryEntry();
        } }else {__CLR4_5_2dusduslvl9ekl2.R.inc(18026);if ((((RateShareEntry.TYPE.equals(groupingType))&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18027)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18028)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18029);groupEntry = new RateShareEntry();
        } }else {__CLR4_5_2dusduslvl9ekl2.R.inc(18030);if ((((CencSampleEncryptionInformationGroupEntry.TYPE.equals(groupingType))&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18031)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18032)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18033);groupEntry = new CencSampleEncryptionInformationGroupEntry();
        } }else {__CLR4_5_2dusduslvl9ekl2.R.inc(18034);if ((((VisualRandomAccessEntry.TYPE.equals(groupingType))&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18035)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18036)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18037);groupEntry = new VisualRandomAccessEntry();
        } }else {__CLR4_5_2dusduslvl9ekl2.R.inc(18038);if ((((TemporalLevelEntry.TYPE.equals(groupingType))&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18039)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18040)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18041);groupEntry = new TemporalLevelEntry();
        } }else {__CLR4_5_2dusduslvl9ekl2.R.inc(18042);if ((((SyncSampleEntry.TYPE.equals(groupingType))&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18043)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18044)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18045);groupEntry = new SyncSampleEntry();
        } }else {__CLR4_5_2dusduslvl9ekl2.R.inc(18046);if ((((TemporalLayerSampleGroup.TYPE.equals(groupingType))&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18047)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18048)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18049);groupEntry = new TemporalLayerSampleGroup();
        } }else {__CLR4_5_2dusduslvl9ekl2.R.inc(18050);if ((((TemporalSubLayerSampleGroup.TYPE.equals(groupingType))&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18051)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18052)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18053);groupEntry = new TemporalSubLayerSampleGroup();
        } }else {__CLR4_5_2dusduslvl9ekl2.R.inc(18054);if ((((StepwiseTemporalLayerEntry.TYPE.equals(groupingType))&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18055)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18056)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18057);groupEntry = new StepwiseTemporalLayerEntry();
        } }else {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18058);groupEntry = new UnknownEntry(groupingType);
        }
        }}}}}}}}}__CLR4_5_2dusduslvl9ekl2.R.inc(18059);groupEntry.parse(content);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18060);return groupEntry;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    public int getDefaultLength() {try{__CLR4_5_2dusduslvl9ekl2.R.inc(18061);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18062);return defaultLength;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    public void setDefaultLength(int defaultLength) {try{__CLR4_5_2dusduslvl9ekl2.R.inc(18063);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18064);this.defaultLength = defaultLength;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    public List<GroupEntry> getGroupEntries() {try{__CLR4_5_2dusduslvl9ekl2.R.inc(18065);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18066);return groupEntries;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    public void setGroupEntries(List<GroupEntry> groupEntries) {try{__CLR4_5_2dusduslvl9ekl2.R.inc(18067);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18068);this.groupEntries = groupEntries;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2dusduslvl9ekl2.R.inc(18069);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18070);if ((((this == o)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18071)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18072)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18073);return true;
        }
        }__CLR4_5_2dusduslvl9ekl2.R.inc(18074);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18075)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18076)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18077);return false;
        }

        }__CLR4_5_2dusduslvl9ekl2.R.inc(18078);SampleGroupDescriptionBox that = (SampleGroupDescriptionBox) o;

        __CLR4_5_2dusduslvl9ekl2.R.inc(18079);if ((((defaultLength != that.defaultLength)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18080)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18081)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18082);return false;
        }
        }__CLR4_5_2dusduslvl9ekl2.R.inc(18083);if (((((((groupEntries != null )&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18084)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18085)==0&false))? !groupEntries.equals(that.groupEntries) : that.groupEntries != null)&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18086)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18087)==0&false))) {{
            __CLR4_5_2dusduslvl9ekl2.R.inc(18088);return false;
        }

        }__CLR4_5_2dusduslvl9ekl2.R.inc(18089);return true;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2dusduslvl9ekl2.R.inc(18090);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18091);int result = 0;
        __CLR4_5_2dusduslvl9ekl2.R.inc(18092);result = 31 * result + defaultLength;
        __CLR4_5_2dusduslvl9ekl2.R.inc(18093);result = 31 * result + ((((groupEntries != null )&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18094)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18095)==0&false))? groupEntries.hashCode() : 0);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18096);return result;
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2dusduslvl9ekl2.R.inc(18097);
        __CLR4_5_2dusduslvl9ekl2.R.inc(18098);return "SampleGroupDescriptionBox{" +
                "groupingType='" + ((((groupEntries.size() > 0 )&&(__CLR4_5_2dusduslvl9ekl2.R.iget(18099)!=0|true))||(__CLR4_5_2dusduslvl9ekl2.R.iget(18100)==0&false))? groupEntries.get(0).getType() : "????") + '\'' +
                ", defaultLength=" + defaultLength +
                ", groupEntries=" + groupEntries +
                '}';
    }finally{__CLR4_5_2dusduslvl9ekl2.R.flushNeeded();}}
}
