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
import java.nio.Buffer;
import java.nio.ByteBuffer;

/*
abstract aligned(8) expandable(228-1) class BaseDescriptor : bit(8) tag=0 {
// empty. To be filled by classes extending this class.
}

int sizeOfInstance = 0;
bit(1) nextByte;
bit(7) sizeOfInstance;
while(nextByte) {
bit(1) nextByte;
bit(7) sizeByte;
sizeOfInstance = sizeOfInstance<<7 | sizeByte;
}
 */
@Descriptor(tags = 0x00)
public abstract class BaseDescriptor {public static class __CLR4_5_2d2vd2vlvl9ek8o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,17005,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    int tag;
    int sizeOfInstance;
    int sizeBytes;

    public BaseDescriptor() {try{__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16951);
    }finally{__CLR4_5_2d2vd2vlvl9ek8o.R.flushNeeded();}}

    public int getTag() {try{__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16952);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16953);return tag;
    }finally{__CLR4_5_2d2vd2vlvl9ek8o.R.flushNeeded();}}

    public void writeSize(ByteBuffer bb, int size) {try{__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16954);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16955);int pos = bb.position();

        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16956);int i = 0;
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16957);while ((((size > 0 || i < sizeBytes)&&(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16958)!=0|true))||(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16959)==0&false))) {{
            __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16960);i++;
            __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16961);if ((((size > 0)&&(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16962)!=0|true))||(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16963)==0&false))) {{
                __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16964);bb.put(pos + getSizeSize() - i, (byte) (size & 0x7f));
            } }else {{
                __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16965);bb.put(pos + getSizeSize() - i, (byte) (0x80));
            }
            }__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16966);size >>>= 7;

        }

        }__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16967);bb.position(pos + getSizeSize());

    }finally{__CLR4_5_2d2vd2vlvl9ek8o.R.flushNeeded();}}

    public int getSizeSize() {try{__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16968);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16969);int size = getContentSize();
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16970);int i = 0;
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16971);while ((((size > 0 || i < sizeBytes)&&(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16972)!=0|true))||(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16973)==0&false))) {{
            __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16974);size >>>= 7;
            __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16975);i++;
        }
        }__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16976);return i;
    }finally{__CLR4_5_2d2vd2vlvl9ek8o.R.flushNeeded();}}


    public int getSize() {try{__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16977);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16978);return getContentSize() + getSizeSize() + 1;
    }finally{__CLR4_5_2d2vd2vlvl9ek8o.R.flushNeeded();}}

    public final void parse(int tag, ByteBuffer bb) throws IOException {try{__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16979);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16980);this.tag = tag;

        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16981);int i = 0;
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16982);int tmp = IsoTypeReader.readUInt8(bb);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16983);i++;
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16984);sizeOfInstance = tmp & 0x7f;
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16985);while ((((tmp >>> 7 == 1)&&(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16986)!=0|true))||(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16987)==0&false))) {{ //nextbyte indicator bit
            __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16988);tmp = IsoTypeReader.readUInt8(bb);
            __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16989);i++;
            //sizeOfInstance = sizeOfInstance<<7 | sizeByte;
            __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16990);sizeOfInstance = sizeOfInstance << 7 | tmp & 0x7f;
        }
        }__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16991);sizeBytes = i;
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16992);ByteBuffer detailSource = bb.slice();
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16993);detailSource.limit(sizeOfInstance);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16994);parseDetail(detailSource);
        assert (((detailSource.remaining() == 0 )&&(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16995)!=0|true))||(__CLR4_5_2d2vd2vlvl9ek8o.R.iget(16996)==0&false)): this.getClass().getSimpleName() + " has not been fully parsed";
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16997);bb.position(bb.position() + sizeOfInstance);
    }finally{__CLR4_5_2d2vd2vlvl9ek8o.R.flushNeeded();}}

    public abstract void parseDetail(ByteBuffer bb) throws IOException;

    public abstract ByteBuffer serialize();

    /**
     * without tag and size
     *
     * @return
     */
    abstract int getContentSize();

    @Override
    public String toString() {try{__CLR4_5_2d2vd2vlvl9ek8o.R.inc(16998);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(16999);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(17000);sb.append("BaseDescriptor");
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(17001);sb.append("{tag=").append(tag);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(17002);sb.append(", sizeOfInstance=").append(sizeOfInstance);
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(17003);sb.append('}');
        __CLR4_5_2d2vd2vlvl9ek8o.R.inc(17004);return sb.toString();
    }finally{__CLR4_5_2d2vd2vlvl9ek8o.R.flushNeeded();}}
}
