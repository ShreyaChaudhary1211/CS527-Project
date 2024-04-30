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

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * <p>
 * For some coding systems a sync sample is specified to be a random access point after which all samples in decoding
 * order can be correctly decoded. However, it may be possible to encode an \u201copen\u201d random access point, after which all
 * samples in output order can be correctly decoded, but some samples following the random access point in decoding
 * order and preceding the random access point in output order need not be correctly decodable. For example, an intra
 * picture starting an open group of pictures can be followed in decoding order by (bi-)predicted pictures that however
 * precede the intra picture in output order; though they possibly cannot be correctly decoded if the decoding starts
 * from the intra picture, they are not needed.
 * </p>
 * <p>
 * Such "open" random-access samples can be marked by being a member of this group. Samples marked by this group must
 * be random access points, and may also be sync points (i.e. it is not required that samples marked by the sync sample
 * table be excluded).
 * </p>
 */
public class VisualRandomAccessEntry extends GroupEntry {public static class __CLR4_5_2e5ze5zlvlulmse{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,18412,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "rap ";
    private boolean numLeadingSamplesKnown;
    private short numLeadingSamples;

    @Override
    public String getType() {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18359);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18360);return TYPE;
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}


    public boolean isNumLeadingSamplesKnown() {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18361);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18362);return numLeadingSamplesKnown;
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}

    public void setNumLeadingSamplesKnown(boolean numLeadingSamplesKnown) {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18363);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18364);this.numLeadingSamplesKnown = numLeadingSamplesKnown;
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}

    public short getNumLeadingSamples() {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18365);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18366);return numLeadingSamples;
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}

    public void setNumLeadingSamples(short numLeadingSamples) {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18367);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18368);this.numLeadingSamples = numLeadingSamples;
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18369);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18370);final byte b = byteBuffer.get();
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18371);numLeadingSamplesKnown = ((b & 0x80) == 0x80);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18372);numLeadingSamples = (short) (b & 0x7f);
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18373);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18374);ByteBuffer content = ByteBuffer.allocate(1);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18375);content.put((byte) (((((numLeadingSamplesKnown )&&(__CLR4_5_2e5ze5zlvlulmse.R.iget(18376)!=0|true))||(__CLR4_5_2e5ze5zlvlulmse.R.iget(18377)==0&false))? 0x80 : 0x00) | (numLeadingSamples & 0x7f)));
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18378);content.rewind();
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18379);return content;
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18380);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18381);if ((((this == o)&&(__CLR4_5_2e5ze5zlvlulmse.R.iget(18382)!=0|true))||(__CLR4_5_2e5ze5zlvlulmse.R.iget(18383)==0&false))) {__CLR4_5_2e5ze5zlvlulmse.R.inc(18384);return true;
        }__CLR4_5_2e5ze5zlvlulmse.R.inc(18385);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2e5ze5zlvlulmse.R.iget(18386)!=0|true))||(__CLR4_5_2e5ze5zlvlulmse.R.iget(18387)==0&false))) {__CLR4_5_2e5ze5zlvlulmse.R.inc(18388);return false;

        }__CLR4_5_2e5ze5zlvlulmse.R.inc(18389);VisualRandomAccessEntry that = (VisualRandomAccessEntry) o;

        __CLR4_5_2e5ze5zlvlulmse.R.inc(18390);if ((((numLeadingSamples != that.numLeadingSamples)&&(__CLR4_5_2e5ze5zlvlulmse.R.iget(18391)!=0|true))||(__CLR4_5_2e5ze5zlvlulmse.R.iget(18392)==0&false))) {__CLR4_5_2e5ze5zlvlulmse.R.inc(18393);return false;
        }__CLR4_5_2e5ze5zlvlulmse.R.inc(18394);if ((((numLeadingSamplesKnown != that.numLeadingSamplesKnown)&&(__CLR4_5_2e5ze5zlvlulmse.R.iget(18395)!=0|true))||(__CLR4_5_2e5ze5zlvlulmse.R.iget(18396)==0&false))) {__CLR4_5_2e5ze5zlvlulmse.R.inc(18397);return false;

        }__CLR4_5_2e5ze5zlvlulmse.R.inc(18398);return true;
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18399);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18400);int result = ((((numLeadingSamplesKnown )&&(__CLR4_5_2e5ze5zlvlulmse.R.iget(18401)!=0|true))||(__CLR4_5_2e5ze5zlvlulmse.R.iget(18402)==0&false))? 1 : 0);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18403);result = 31 * result + (int) numLeadingSamples;
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18404);return result;
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2e5ze5zlvlulmse.R.inc(18405);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18406);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18407);sb.append("VisualRandomAccessEntry");
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18408);sb.append("{numLeadingSamplesKnown=").append(numLeadingSamplesKnown);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18409);sb.append(", numLeadingSamples=").append(numLeadingSamples);
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18410);sb.append('}');
        __CLR4_5_2e5ze5zlvlulmse.R.inc(18411);return sb.toString();
    }finally{__CLR4_5_2e5ze5zlvlulmse.R.flushNeeded();}}
}
