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

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* class tag values of 14496-1
0x00 Forbidden
0x01 ObjectDescrTag
0x02 InitialObjectDescrTag
0x03 ES_DescrTag
0x04 DecoderConfigDescrTag
0x05 DecSpecificInfoTag
0x06 SLConfigDescrTag
0x07 ContentIdentDescrTag
0x08 SupplContentIdentDescrTag
0x09 IPI_DescrPointerTag
0x0A IPMP_DescrPointerTag
0x0B IPMP_DescrTag
0x0C QoS_DescrTag
0x0D RegistrationDescrTag
0x0E ES_ID_IncTag
0x0F ES_ID_RefTag
0x10 MP4_IOD_Tag
0x11 MP4_OD_Tag
0x12 IPL_DescrPointerRefTag
0x13 ExtensionProfileLevelDescrTag
0x14 profileLevelIndicationIndexDescrTag
0x15-0x3F Reserved for ISO use
0x40 ContentClassificationDescrTag
0x41 KeyWordDescrTag
0x42 RatingDescrTag
0x43 LanguageDescrTag
0x44 ShortTextualDescrTag
0x45 ExpandedTextualDescrTag
0x46 ContentCreatorNameDescrTag
0x47 ContentCreationDateDescrTag
0x48 OCICreatorNameDescrTag
0x49 OCICreationDateDescrTag
0x4A SmpteCameraPositionDescrTag
0x4B SegmentDescrTag
0x4C MediaTimeDescrTag
0x4D-0x5F Reserved for ISO use (OCI extensions)
0x60 IPMP_ToolsListDescrTag
0x61 IPMP_ToolTag
0x62 M4MuxTimingDescrTag
0x63 M4MuxCodeTableDescrTag
0x64 ExtSLConfigDescrTag
0x65 M4MuxBufferSizeDescrTag
0x66 M4MuxIdentDescrTag
0x67 DependencyPointerTag
0x68 DependencyMarkerTag
0x69 M4MuxChannelDescrTag
0x6A-0xBF Reserved for ISO use
0xC0-0xFE User private
0xFF Forbidden
 */

/* objectTypeIndication as of 14496-1
0x00 Forbidden
0x01 Systems ISO/IEC 14496-1 a
0x02 Systems ISO/IEC 14496-1 b
0x03 Interaction Stream
0x04 Systems ISO/IEC 14496-1 Extended BIFS Configuration c
0x05 Systems ISO/IEC 14496-1 AFX d
0x06 Font Data Stream
0x07 Synthesized Texture Stream
0x08 Streaming Text Stream
0x09-0x1F reserved for ISO use
0x20 Visual ISO/IEC 14496-2 e
0x21 Visual ITU-T Recommendation H.264 | ISO/IEC 14496-10 f
0x22 Parameter Sets for ITU-T Recommendation H.264 | ISO/IEC 14496-10 f
0x23-0x3F reserved for ISO use
0x40 Audio ISO/IEC 14496-3 g
0x41-0x5F reserved for ISO use
0x60 Visual ISO/IEC 13818-2 Simple Profile
0x61 Visual ISO/IEC 13818-2 Main Profile
0x62 Visual ISO/IEC 13818-2 SNR Profile
0x63 Visual ISO/IEC 13818-2 Spatial Profile
0x64 Visual ISO/IEC 13818-2 High Profile
0x65 Visual ISO/IEC 13818-2 422 Profile
0x66 Audio ISO/IEC 13818-7 Main Profile
0x67 Audio ISO/IEC 13818-7 LowComplexity Profile
0x68 Audio ISO/IEC 13818-7 Scaleable Sampling Rate Profile
0x69 Audio ISO/IEC 13818-3
0x6A Visual ISO/IEC 11172-2
0x6B Audio ISO/IEC 11172-3
0x6C Visual ISO/IEC 10918-1
0x6D reserved for registration authority
0x6E Visual ISO/IEC 15444-1
0x6F - 0x9F reserved for ISO use
0xA0 - 0xBF reserved for registration authority i
0xC0 - 0xE0 user private
0xE1 reserved for registration authority i
0xE2 - 0xFE user private
0xFF no object type specified h
 */
public class ObjectDescriptorFactory {public static class __CLR4_5_2dkfdkflvl9ekj4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,17627,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected static Logger log = Logger.getLogger(ObjectDescriptorFactory.class.getName());

    protected static Map<Integer, Map<Integer, Class<? extends BaseDescriptor>>> descriptorRegistry = new HashMap<Integer, Map<Integer, Class<? extends BaseDescriptor>>>();

    static {try{__CLR4_5_2dkfdkflvl9ekj4.R.inc(17583);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17584);Set<Class<? extends BaseDescriptor>> annotated = new HashSet<Class<? extends BaseDescriptor>>();

        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17585);annotated.add(DecoderSpecificInfo.class);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17586);annotated.add(SLConfigDescriptor.class);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17587);annotated.add(BaseDescriptor.class);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17588);annotated.add(ExtensionDescriptor.class);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17589);annotated.add(ObjectDescriptorBase.class);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17590);annotated.add(ProfileLevelIndicationDescriptor.class);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17591);annotated.add(AudioSpecificConfig.class);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17592);annotated.add(ExtensionProfileLevelDescriptor.class);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17593);annotated.add(ESDescriptor.class);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17594);annotated.add(DecoderConfigDescriptor.class);
        //annotated.add(ObjectDescriptor.class);

        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17595);for (Class<? extends BaseDescriptor> clazz : annotated) {{
            __CLR4_5_2dkfdkflvl9ekj4.R.inc(17596);final Descriptor descriptor = clazz.getAnnotation(Descriptor.class);
            __CLR4_5_2dkfdkflvl9ekj4.R.inc(17597);final int[] tags = descriptor.tags();
            __CLR4_5_2dkfdkflvl9ekj4.R.inc(17598);final int objectTypeInd = descriptor.objectTypeIndication();

            __CLR4_5_2dkfdkflvl9ekj4.R.inc(17599);Map<Integer, Class<? extends BaseDescriptor>> tagMap = descriptorRegistry.get(objectTypeInd);
            __CLR4_5_2dkfdkflvl9ekj4.R.inc(17600);if ((((tagMap == null)&&(__CLR4_5_2dkfdkflvl9ekj4.R.iget(17601)!=0|true))||(__CLR4_5_2dkfdkflvl9ekj4.R.iget(17602)==0&false))) {{
                __CLR4_5_2dkfdkflvl9ekj4.R.inc(17603);tagMap = new HashMap<Integer, Class<? extends BaseDescriptor>>();
            }
            }__CLR4_5_2dkfdkflvl9ekj4.R.inc(17604);for (int tag : tags) {{
                __CLR4_5_2dkfdkflvl9ekj4.R.inc(17605);tagMap.put(tag, clazz);
            }
            }__CLR4_5_2dkfdkflvl9ekj4.R.inc(17606);descriptorRegistry.put(objectTypeInd, tagMap);
        }
    }}finally{__CLR4_5_2dkfdkflvl9ekj4.R.flushNeeded();}}

    public static BaseDescriptor createFrom(int objectTypeIndication, ByteBuffer bb) throws IOException {try{__CLR4_5_2dkfdkflvl9ekj4.R.inc(17607);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17608);int tag = IsoTypeReader.readUInt8(bb);

        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17609);Map<Integer, Class<? extends BaseDescriptor>> tagMap = descriptorRegistry.get(objectTypeIndication);
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17610);if ((((tagMap == null)&&(__CLR4_5_2dkfdkflvl9ekj4.R.iget(17611)!=0|true))||(__CLR4_5_2dkfdkflvl9ekj4.R.iget(17612)==0&false))) {{
            __CLR4_5_2dkfdkflvl9ekj4.R.inc(17613);tagMap = descriptorRegistry.get(-1);
        }
        }__CLR4_5_2dkfdkflvl9ekj4.R.inc(17614);Class<? extends BaseDescriptor> aClass = tagMap.get(tag);

//    if (tag == 0x00) {
//      log.warning("Found illegal tag 0x00! objectTypeIndication " + Integer.toHexString(objectTypeIndication) +
//              " and tag " + Integer.toHexString(tag) + " using: " + aClass);
//      aClass = BaseDescriptor.class;
//    }

        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17615);BaseDescriptor baseDescriptor;
        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17616);if ((((aClass == null || aClass.isInterface() || Modifier.isAbstract(aClass.getModifiers()))&&(__CLR4_5_2dkfdkflvl9ekj4.R.iget(17617)!=0|true))||(__CLR4_5_2dkfdkflvl9ekj4.R.iget(17618)==0&false))) {{
            __CLR4_5_2dkfdkflvl9ekj4.R.inc(17619);log.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(objectTypeIndication) +
                    " and tag " + Integer.toHexString(tag) + " found: " + aClass);
            __CLR4_5_2dkfdkflvl9ekj4.R.inc(17620);baseDescriptor = new UnknownDescriptor();
        } }else {{
            __CLR4_5_2dkfdkflvl9ekj4.R.inc(17621);try {
                __CLR4_5_2dkfdkflvl9ekj4.R.inc(17622);baseDescriptor = aClass.newInstance();
            } catch (Exception e) {
                __CLR4_5_2dkfdkflvl9ekj4.R.inc(17623);log.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + aClass + " for objectTypeIndication " + objectTypeIndication + " and tag " + tag, e);
                __CLR4_5_2dkfdkflvl9ekj4.R.inc(17624);throw new RuntimeException(e);
            }
        }

        //ByteBuffer orig = bb.slice();
        }__CLR4_5_2dkfdkflvl9ekj4.R.inc(17625);baseDescriptor.parse(tag, bb);
        //byte[] b1 = new byte[baseDescriptor.sizeOfInstance + baseDescriptor.sizeBytes];
        //orig.get(b1);
        //byte[] b2 = baseDescriptor.serialize().array();
        //System.err.println(baseDescriptor.getClass().getName() + " orig: " + Hex.encodeHex(b1) + " serialized: " + Hex.encodeHex(b2));

        __CLR4_5_2dkfdkflvl9ekj4.R.inc(17626);return baseDescriptor;
    }finally{__CLR4_5_2dkfdkflvl9ekj4.R.flushNeeded();}}
}
