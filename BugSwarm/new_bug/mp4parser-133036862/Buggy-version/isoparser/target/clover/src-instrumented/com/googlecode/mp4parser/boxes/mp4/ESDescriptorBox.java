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

package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * ES Descriptor Box.
 */
public class ESDescriptorBox extends AbstractDescriptorBox {public static class __CLR4_5_2cc6cc6lvlull2e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,16032,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "esds";


    public ESDescriptorBox() {
        super(TYPE);__CLR4_5_2cc6cc6lvlull2e.R.inc(15991);try{__CLR4_5_2cc6cc6lvlull2e.R.inc(15990);
    }finally{__CLR4_5_2cc6cc6lvlull2e.R.flushNeeded();}}

    public ESDescriptor getEsDescriptor() {try{__CLR4_5_2cc6cc6lvlull2e.R.inc(15992);
        __CLR4_5_2cc6cc6lvlull2e.R.inc(15993);return (ESDescriptor) super.getDescriptor();
    }finally{__CLR4_5_2cc6cc6lvlull2e.R.flushNeeded();}}

    public void setEsDescriptor(ESDescriptor esDescriptor) {try{__CLR4_5_2cc6cc6lvlull2e.R.inc(15994);
        __CLR4_5_2cc6cc6lvlull2e.R.inc(15995);super.setDescriptor(esDescriptor);
    }finally{__CLR4_5_2cc6cc6lvlull2e.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2cc6cc6lvlull2e.R.inc(15996);
        __CLR4_5_2cc6cc6lvlull2e.R.inc(15997);if ((((this == o)&&(__CLR4_5_2cc6cc6lvlull2e.R.iget(15998)!=0|true))||(__CLR4_5_2cc6cc6lvlull2e.R.iget(15999)==0&false))) {__CLR4_5_2cc6cc6lvlull2e.R.inc(16000);return true;
        }__CLR4_5_2cc6cc6lvlull2e.R.inc(16001);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2cc6cc6lvlull2e.R.iget(16002)!=0|true))||(__CLR4_5_2cc6cc6lvlull2e.R.iget(16003)==0&false))) {__CLR4_5_2cc6cc6lvlull2e.R.inc(16004);return false;

        }__CLR4_5_2cc6cc6lvlull2e.R.inc(16005);ESDescriptorBox that = (ESDescriptorBox) o;

        __CLR4_5_2cc6cc6lvlull2e.R.inc(16006);if (((((((data != null )&&(__CLR4_5_2cc6cc6lvlull2e.R.iget(16007)!=0|true))||(__CLR4_5_2cc6cc6lvlull2e.R.iget(16008)==0&false))? !data.equals(that.data) : that.data != null)&&(__CLR4_5_2cc6cc6lvlull2e.R.iget(16009)!=0|true))||(__CLR4_5_2cc6cc6lvlull2e.R.iget(16010)==0&false))) {__CLR4_5_2cc6cc6lvlull2e.R.inc(16011);return false;
        }__CLR4_5_2cc6cc6lvlull2e.R.inc(16012);return true;
    }finally{__CLR4_5_2cc6cc6lvlull2e.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2cc6cc6lvlull2e.R.inc(16013);
        __CLR4_5_2cc6cc6lvlull2e.R.inc(16014);return (((data != null )&&(__CLR4_5_2cc6cc6lvlull2e.R.iget(16015)!=0|true))||(__CLR4_5_2cc6cc6lvlull2e.R.iget(16016)==0&false))? data.hashCode() : 0;
    }finally{__CLR4_5_2cc6cc6lvlull2e.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_2cc6cc6lvlull2e.R.inc(16017);
        __CLR4_5_2cc6cc6lvlull2e.R.inc(16018);ESDescriptor esd = getEsDescriptor();
        __CLR4_5_2cc6cc6lvlull2e.R.inc(16019);if ((((esd != null)&&(__CLR4_5_2cc6cc6lvlull2e.R.iget(16020)!=0|true))||(__CLR4_5_2cc6cc6lvlull2e.R.iget(16021)==0&false))) {{
            __CLR4_5_2cc6cc6lvlull2e.R.inc(16022);return 4 + esd.getSize();
        } }else {{
            __CLR4_5_2cc6cc6lvlull2e.R.inc(16023);return 4 + data.remaining();
        }
    }}finally{__CLR4_5_2cc6cc6lvlull2e.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2cc6cc6lvlull2e.R.inc(16024);
        __CLR4_5_2cc6cc6lvlull2e.R.inc(16025);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2cc6cc6lvlull2e.R.inc(16026);ESDescriptor esd = getEsDescriptor();
        __CLR4_5_2cc6cc6lvlull2e.R.inc(16027);if ((((esd != null)&&(__CLR4_5_2cc6cc6lvlull2e.R.iget(16028)!=0|true))||(__CLR4_5_2cc6cc6lvlull2e.R.iget(16029)==0&false))) {{
            __CLR4_5_2cc6cc6lvlull2e.R.inc(16030);byteBuffer.put((ByteBuffer) esd.serialize().rewind());
        } }else {{
            __CLR4_5_2cc6cc6lvlull2e.R.inc(16031);byteBuffer.put(data.duplicate());
        }
    }}finally{__CLR4_5_2cc6cc6lvlull2e.R.flushNeeded();}}
}
