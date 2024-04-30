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
 * The Temporal Level sample grouping ('tele') provides a codec-independent sample grouping that can be used to group samples (access units) in a track (and potential track fragments) according to temporal level, where samples of one temporal level have no coding dependencies on samples of higher temporal levels. The temporal level equals the sample group description index (taking values 1, 2, 3, etc). The bitstream containing only the access units from the first temporal level to a higher temporal level remains conforming to the coding standard.
 * <p>
 * A grouping according to temporal level facilitates easy extraction of temporal subsequences, for instance using the Subsegment Indexing box in 0.</p>
 */
public class TemporalLevelEntry extends GroupEntry {public static class __CLR4_5_2e0ye0ylvl9eklk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18225,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "tele";
    private boolean levelIndependentlyDecodable;
    private short reserved;

    @Override
    public String getType() {try{__CLR4_5_2e0ye0ylvl9eklk.R.inc(18178);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18179);return TYPE;
    }finally{__CLR4_5_2e0ye0ylvl9eklk.R.flushNeeded();}}


    public boolean isLevelIndependentlyDecodable() {try{__CLR4_5_2e0ye0ylvl9eklk.R.inc(18180);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18181);return levelIndependentlyDecodable;
    }finally{__CLR4_5_2e0ye0ylvl9eklk.R.flushNeeded();}}

    public void setLevelIndependentlyDecodable(boolean levelIndependentlyDecodable) {try{__CLR4_5_2e0ye0ylvl9eklk.R.inc(18182);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18183);this.levelIndependentlyDecodable = levelIndependentlyDecodable;
    }finally{__CLR4_5_2e0ye0ylvl9eklk.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2e0ye0ylvl9eklk.R.inc(18184);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18185);final byte b = byteBuffer.get();
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18186);levelIndependentlyDecodable = ((b & 0x80) == 0x80);
    }finally{__CLR4_5_2e0ye0ylvl9eklk.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2e0ye0ylvl9eklk.R.inc(18187);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18188);ByteBuffer content = ByteBuffer.allocate(1);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18189);content.put((byte) ((((levelIndependentlyDecodable )&&(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18190)!=0|true))||(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18191)==0&false))? 0x80 : 0x00));
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18192);content.rewind();
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18193);return content;
    }finally{__CLR4_5_2e0ye0ylvl9eklk.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2e0ye0ylvl9eklk.R.inc(18194);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18195);if ((((this == o)&&(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18196)!=0|true))||(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18197)==0&false))) {__CLR4_5_2e0ye0ylvl9eklk.R.inc(18198);return true;
        }__CLR4_5_2e0ye0ylvl9eklk.R.inc(18199);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18200)!=0|true))||(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18201)==0&false))) {__CLR4_5_2e0ye0ylvl9eklk.R.inc(18202);return false;

        }__CLR4_5_2e0ye0ylvl9eklk.R.inc(18203);TemporalLevelEntry that = (TemporalLevelEntry) o;

        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18204);if ((((levelIndependentlyDecodable != that.levelIndependentlyDecodable)&&(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18205)!=0|true))||(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18206)==0&false))) {__CLR4_5_2e0ye0ylvl9eklk.R.inc(18207);return false;
        }__CLR4_5_2e0ye0ylvl9eklk.R.inc(18208);if ((((reserved != that.reserved)&&(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18209)!=0|true))||(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18210)==0&false))) {__CLR4_5_2e0ye0ylvl9eklk.R.inc(18211);return false;

        }__CLR4_5_2e0ye0ylvl9eklk.R.inc(18212);return true;
    }finally{__CLR4_5_2e0ye0ylvl9eklk.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2e0ye0ylvl9eklk.R.inc(18213);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18214);int result = ((((levelIndependentlyDecodable )&&(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18215)!=0|true))||(__CLR4_5_2e0ye0ylvl9eklk.R.iget(18216)==0&false))? 1 : 0);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18217);result = 31 * result + (int) reserved;
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18218);return result;
    }finally{__CLR4_5_2e0ye0ylvl9eklk.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2e0ye0ylvl9eklk.R.inc(18219);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18220);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18221);sb.append("TemporalLevelEntry");
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18222);sb.append("{levelIndependentlyDecodable=").append(levelIndependentlyDecodable);
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18223);sb.append('}');
        __CLR4_5_2e0ye0ylvl9eklk.R.inc(18224);return sb.toString();
    }finally{__CLR4_5_2e0ye0ylvl9eklk.R.flushNeeded();}}
}
