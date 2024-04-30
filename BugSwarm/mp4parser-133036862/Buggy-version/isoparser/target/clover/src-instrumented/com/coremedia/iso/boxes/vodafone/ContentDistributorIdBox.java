/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
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

package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * Vodafone specific box. Usage unclear.
 */
public class ContentDistributorIdBox extends AbstractFullBox {public static class __CLR4_5_23m93m9lvlulcqi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,4708,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "cdis";

    private String language;
    private String contentDistributorId;

    public ContentDistributorIdBox() {
        super(TYPE);__CLR4_5_23m93m9lvlulcqi.R.inc(4690);try{__CLR4_5_23m93m9lvlulcqi.R.inc(4689);
    }finally{__CLR4_5_23m93m9lvlulcqi.R.flushNeeded();}}

    public String getLanguage() {try{__CLR4_5_23m93m9lvlulcqi.R.inc(4691);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4692);return language;
    }finally{__CLR4_5_23m93m9lvlulcqi.R.flushNeeded();}}

    public String getContentDistributorId() {try{__CLR4_5_23m93m9lvlulcqi.R.inc(4693);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4694);return contentDistributorId;
    }finally{__CLR4_5_23m93m9lvlulcqi.R.flushNeeded();}}

    protected long getContentSize() {try{__CLR4_5_23m93m9lvlulcqi.R.inc(4695);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4696);return 2 + Utf8.utf8StringLengthInBytes(contentDistributorId) + 5;
    }finally{__CLR4_5_23m93m9lvlulcqi.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_23m93m9lvlulcqi.R.inc(4697);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4698);parseVersionAndFlags(content);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4699);language = IsoTypeReader.readIso639(content);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4700);contentDistributorId = IsoTypeReader.readString(content);
    }finally{__CLR4_5_23m93m9lvlulcqi.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_23m93m9lvlulcqi.R.inc(4701);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4702);writeVersionAndFlags(byteBuffer);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4703);IsoTypeWriter.writeIso639(byteBuffer, language);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4704);byteBuffer.put(Utf8.convert(contentDistributorId));
        __CLR4_5_23m93m9lvlulcqi.R.inc(4705);byteBuffer.put((byte) 0);

    }finally{__CLR4_5_23m93m9lvlulcqi.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_23m93m9lvlulcqi.R.inc(4706);
        __CLR4_5_23m93m9lvlulcqi.R.inc(4707);return "ContentDistributorIdBox[language=" + getLanguage() + ";contentDistributorId=" + getContentDistributorId() + "]";
    }finally{__CLR4_5_23m93m9lvlulcqi.R.flushNeeded();}}
}
