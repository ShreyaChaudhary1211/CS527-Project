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

import com.coremedia.iso.Hex;

import java.nio.ByteBuffer;

/**
 *
 */
public class UnknownEntry extends GroupEntry {public static class __CLR4_5_2e29e29lvl9eklp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,18264,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ByteBuffer content;
    private String type;

    public UnknownEntry(String type) {try{__CLR4_5_2e29e29lvl9eklp.R.inc(18225);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18226);this.type = type;
    }finally{__CLR4_5_2e29e29lvl9eklp.R.flushNeeded();}}

    @Override
    public String getType() {try{__CLR4_5_2e29e29lvl9eklp.R.inc(18227);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18228);return type;
    }finally{__CLR4_5_2e29e29lvl9eklp.R.flushNeeded();}}

    public ByteBuffer getContent() {try{__CLR4_5_2e29e29lvl9eklp.R.inc(18229);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18230);return content;
    }finally{__CLR4_5_2e29e29lvl9eklp.R.flushNeeded();}}

    public void setContent(ByteBuffer content) {try{__CLR4_5_2e29e29lvl9eklp.R.inc(18231);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18232);this.content = (ByteBuffer) content.duplicate().rewind();
    }finally{__CLR4_5_2e29e29lvl9eklp.R.flushNeeded();}}

    @Override
    public void parse(ByteBuffer byteBuffer) {try{__CLR4_5_2e29e29lvl9eklp.R.inc(18233);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18234);this.content = (ByteBuffer) byteBuffer.duplicate().rewind();
    }finally{__CLR4_5_2e29e29lvl9eklp.R.flushNeeded();}}

    @Override
    public ByteBuffer get() {try{__CLR4_5_2e29e29lvl9eklp.R.inc(18235);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18236);return content.duplicate();
    }finally{__CLR4_5_2e29e29lvl9eklp.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2e29e29lvl9eklp.R.inc(18237);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18238);ByteBuffer bb = content.duplicate();
        __CLR4_5_2e29e29lvl9eklp.R.inc(18239);bb.rewind();
        __CLR4_5_2e29e29lvl9eklp.R.inc(18240);byte[] b = new byte[bb.limit()];
        __CLR4_5_2e29e29lvl9eklp.R.inc(18241);bb.get(b);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18242);return "UnknownEntry{" +
                "content=" + Hex.encodeHex(b) +
                '}';
    }finally{__CLR4_5_2e29e29lvl9eklp.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2e29e29lvl9eklp.R.inc(18243);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18244);if ((((this == o)&&(__CLR4_5_2e29e29lvl9eklp.R.iget(18245)!=0|true))||(__CLR4_5_2e29e29lvl9eklp.R.iget(18246)==0&false))) {{
            __CLR4_5_2e29e29lvl9eklp.R.inc(18247);return true;
        }
        }__CLR4_5_2e29e29lvl9eklp.R.inc(18248);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2e29e29lvl9eklp.R.iget(18249)!=0|true))||(__CLR4_5_2e29e29lvl9eklp.R.iget(18250)==0&false))) {{
            __CLR4_5_2e29e29lvl9eklp.R.inc(18251);return false;
        }

        }__CLR4_5_2e29e29lvl9eklp.R.inc(18252);UnknownEntry that = (UnknownEntry) o;

        __CLR4_5_2e29e29lvl9eklp.R.inc(18253);if (((((((content != null )&&(__CLR4_5_2e29e29lvl9eklp.R.iget(18254)!=0|true))||(__CLR4_5_2e29e29lvl9eklp.R.iget(18255)==0&false))? !content.equals(that.content) : that.content != null)&&(__CLR4_5_2e29e29lvl9eklp.R.iget(18256)!=0|true))||(__CLR4_5_2e29e29lvl9eklp.R.iget(18257)==0&false))) {{
            __CLR4_5_2e29e29lvl9eklp.R.inc(18258);return false;
        }

        }__CLR4_5_2e29e29lvl9eklp.R.inc(18259);return true;
    }finally{__CLR4_5_2e29e29lvl9eklp.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2e29e29lvl9eklp.R.inc(18260);
        __CLR4_5_2e29e29lvl9eklp.R.inc(18261);return (((content != null )&&(__CLR4_5_2e29e29lvl9eklp.R.iget(18262)!=0|true))||(__CLR4_5_2e29e29lvl9eklp.R.iget(18263)==0&false))? content.hashCode() : 0;
    }finally{__CLR4_5_2e29e29lvl9eklp.R.flushNeeded();}}
}
