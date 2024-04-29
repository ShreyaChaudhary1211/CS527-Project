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

package com.googlecode.mp4parser;


import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.FullBox;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;

import java.nio.ByteBuffer;

/**
 * Base class for all ISO Full boxes.
 */
public abstract class AbstractFullBox extends AbstractBox implements FullBox {public static class __CLR4_5_23s73s7lvl9efw9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,4930,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private int version;
    private int flags;

    protected AbstractFullBox(String type) {
        super(type);__CLR4_5_23s73s7lvl9efw9.R.inc(4904);try{__CLR4_5_23s73s7lvl9efw9.R.inc(4903);
    }finally{__CLR4_5_23s73s7lvl9efw9.R.flushNeeded();}}

    protected AbstractFullBox(String type, byte[] userType) {
        super(type, userType);__CLR4_5_23s73s7lvl9efw9.R.inc(4906);try{__CLR4_5_23s73s7lvl9efw9.R.inc(4905);
    }finally{__CLR4_5_23s73s7lvl9efw9.R.flushNeeded();}}

    @DoNotParseDetail
    public int getVersion() {try{__CLR4_5_23s73s7lvl9efw9.R.inc(4907);
        // it's faster than the join point
        __CLR4_5_23s73s7lvl9efw9.R.inc(4908);if ((((!isParsed)&&(__CLR4_5_23s73s7lvl9efw9.R.iget(4909)!=0|true))||(__CLR4_5_23s73s7lvl9efw9.R.iget(4910)==0&false))) {{
            __CLR4_5_23s73s7lvl9efw9.R.inc(4911);parseDetails();
        }
        }__CLR4_5_23s73s7lvl9efw9.R.inc(4912);return version;
    }finally{__CLR4_5_23s73s7lvl9efw9.R.flushNeeded();}}

    public void setVersion(int version) {try{__CLR4_5_23s73s7lvl9efw9.R.inc(4913);
        __CLR4_5_23s73s7lvl9efw9.R.inc(4914);this.version = version;
    }finally{__CLR4_5_23s73s7lvl9efw9.R.flushNeeded();}}

    @DoNotParseDetail
    public int getFlags() {try{__CLR4_5_23s73s7lvl9efw9.R.inc(4915);
        // it's faster than the join point
        __CLR4_5_23s73s7lvl9efw9.R.inc(4916);if ((((!isParsed)&&(__CLR4_5_23s73s7lvl9efw9.R.iget(4917)!=0|true))||(__CLR4_5_23s73s7lvl9efw9.R.iget(4918)==0&false))) {{
            __CLR4_5_23s73s7lvl9efw9.R.inc(4919);parseDetails();
        }
        }__CLR4_5_23s73s7lvl9efw9.R.inc(4920);return flags;
    }finally{__CLR4_5_23s73s7lvl9efw9.R.flushNeeded();}}

    public void setFlags(int flags) {try{__CLR4_5_23s73s7lvl9efw9.R.inc(4921);
        __CLR4_5_23s73s7lvl9efw9.R.inc(4922);this.flags = flags;
    }finally{__CLR4_5_23s73s7lvl9efw9.R.flushNeeded();}}


    /**
     * Parses the version/flags header and returns the remaining box size.
     *
     * @param content the <code>ByteBuffer</code> that contains the version &amp; flag
     * @return number of bytes read
     */
    protected final long parseVersionAndFlags(ByteBuffer content) {try{__CLR4_5_23s73s7lvl9efw9.R.inc(4923);
        __CLR4_5_23s73s7lvl9efw9.R.inc(4924);version = IsoTypeReader.readUInt8(content);
        __CLR4_5_23s73s7lvl9efw9.R.inc(4925);flags = IsoTypeReader.readUInt24(content);
        __CLR4_5_23s73s7lvl9efw9.R.inc(4926);return 4;
    }finally{__CLR4_5_23s73s7lvl9efw9.R.flushNeeded();}}

    protected final void writeVersionAndFlags(ByteBuffer bb) {try{__CLR4_5_23s73s7lvl9efw9.R.inc(4927);
        __CLR4_5_23s73s7lvl9efw9.R.inc(4928);IsoTypeWriter.writeUInt8(bb, version);
        __CLR4_5_23s73s7lvl9efw9.R.inc(4929);IsoTypeWriter.writeUInt24(bb, flags);
    }finally{__CLR4_5_23s73s7lvl9efw9.R.flushNeeded();}}
}
