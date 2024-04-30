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
public class TemporalLevelEntry extends GroupEntry {public static class __CLR4_5_2e3le3llvlulmrd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,18320,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "tele";
    private boolean levelIndependentlyDecodable;
    private short reserved;

    @Override
    public String getType() {try{__CLR4_5_2e3le3llvlulmrd.R.inc(18273);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18274);return TYPE;
    }finally{__CLR4_5_2e3le3llvlulmrd.R.flushNeeded();}}


    public boolean isLevelIndependentlyDecodable() {try{__CLR4_5_2e3le3llvlulmrd.R.inc(18275);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18276);return levelIndependentlyDecodable;
    }finally{__CLR4_5_2e3le3llvlulmrd.R.flushNeeded();}}

    public void setLevelIndependentlyDecodable(boolean levelIndependentlyDecodable) {try{__CLR4_5_2e3le3llvlulmrd.R.inc(18277);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18278);this.levelIndependentlyDecodable = levelIndependentlyDecodable;
    }finally{__CLR4_5_2e3le3llvlulmrd.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2e3le3llvlulmrd.R.inc(18279);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18280);final byte b = byteBuffer.get();
        __CLR4_5_2e3le3llvlulmrd.R.inc(18281);levelIndependentlyDecodable = ((b & 0x80) == 0x80);
    }finally{__CLR4_5_2e3le3llvlulmrd.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2e3le3llvlulmrd.R.inc(18282);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18283);ByteBuffer content = ByteBuffer.allocate(1);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18284);content.put((byte) ((((levelIndependentlyDecodable )&&(__CLR4_5_2e3le3llvlulmrd.R.iget(18285)!=0|true))||(__CLR4_5_2e3le3llvlulmrd.R.iget(18286)==0&false))? 0x80 : 0x00));
        __CLR4_5_2e3le3llvlulmrd.R.inc(18287);content.rewind();
        __CLR4_5_2e3le3llvlulmrd.R.inc(18288);return content;
    }finally{__CLR4_5_2e3le3llvlulmrd.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2e3le3llvlulmrd.R.inc(18289);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18290);if ((((this == o)&&(__CLR4_5_2e3le3llvlulmrd.R.iget(18291)!=0|true))||(__CLR4_5_2e3le3llvlulmrd.R.iget(18292)==0&false))) {__CLR4_5_2e3le3llvlulmrd.R.inc(18293);return true;
        }__CLR4_5_2e3le3llvlulmrd.R.inc(18294);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2e3le3llvlulmrd.R.iget(18295)!=0|true))||(__CLR4_5_2e3le3llvlulmrd.R.iget(18296)==0&false))) {__CLR4_5_2e3le3llvlulmrd.R.inc(18297);return false;

        }__CLR4_5_2e3le3llvlulmrd.R.inc(18298);TemporalLevelEntry that = (TemporalLevelEntry) o;

        __CLR4_5_2e3le3llvlulmrd.R.inc(18299);if ((((levelIndependentlyDecodable != that.levelIndependentlyDecodable)&&(__CLR4_5_2e3le3llvlulmrd.R.iget(18300)!=0|true))||(__CLR4_5_2e3le3llvlulmrd.R.iget(18301)==0&false))) {__CLR4_5_2e3le3llvlulmrd.R.inc(18302);return false;
        }__CLR4_5_2e3le3llvlulmrd.R.inc(18303);if ((((reserved != that.reserved)&&(__CLR4_5_2e3le3llvlulmrd.R.iget(18304)!=0|true))||(__CLR4_5_2e3le3llvlulmrd.R.iget(18305)==0&false))) {__CLR4_5_2e3le3llvlulmrd.R.inc(18306);return false;

        }__CLR4_5_2e3le3llvlulmrd.R.inc(18307);return true;
    }finally{__CLR4_5_2e3le3llvlulmrd.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2e3le3llvlulmrd.R.inc(18308);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18309);int result = ((((levelIndependentlyDecodable )&&(__CLR4_5_2e3le3llvlulmrd.R.iget(18310)!=0|true))||(__CLR4_5_2e3le3llvlulmrd.R.iget(18311)==0&false))? 1 : 0);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18312);result = 31 * result + (int) reserved;
        __CLR4_5_2e3le3llvlulmrd.R.inc(18313);return result;
    }finally{__CLR4_5_2e3le3llvlulmrd.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2e3le3llvlulmrd.R.inc(18314);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18315);final StringBuilder sb = new StringBuilder();
        __CLR4_5_2e3le3llvlulmrd.R.inc(18316);sb.append("TemporalLevelEntry");
        __CLR4_5_2e3le3llvlulmrd.R.inc(18317);sb.append("{levelIndependentlyDecodable=").append(levelIndependentlyDecodable);
        __CLR4_5_2e3le3llvlulmrd.R.inc(18318);sb.append('}');
        __CLR4_5_2e3le3llvlulmrd.R.inc(18319);return sb.toString();
    }finally{__CLR4_5_2e3le3llvlulmrd.R.flushNeeded();}}
}
