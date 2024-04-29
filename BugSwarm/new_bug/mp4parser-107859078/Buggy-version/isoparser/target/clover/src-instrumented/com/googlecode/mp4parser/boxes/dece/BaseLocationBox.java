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

package com.googlecode.mp4parser.boxes.dece;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class BaseLocationBox extends AbstractFullBox {public static class __CLR4_5_2bv8bv8lvl9ek0w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,15443,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "bloc";

    String baseLocation = "";
    String purchaseLocation = "";

    public BaseLocationBox() {
        super(TYPE);__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15381);try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15380);
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    public BaseLocationBox(String baseLocation, String purchaseLocation) {
        super(TYPE);__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15383);try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15382);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15384);this.baseLocation = baseLocation;
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15385);this.purchaseLocation = purchaseLocation;
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    public String getBaseLocation() {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15386);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15387);return baseLocation;
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    public void setBaseLocation(String baseLocation) {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15388);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15389);this.baseLocation = baseLocation;
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    public String getPurchaseLocation() {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15390);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15391);return purchaseLocation;
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    public void setPurchaseLocation(String purchaseLocation) {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15392);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15393);this.purchaseLocation = purchaseLocation;
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15394);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15395);return 1028;
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15396);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15397);parseVersionAndFlags(content);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15398);baseLocation = IsoTypeReader.readString(content);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15399);content.get(new byte[256 - Utf8.utf8StringLengthInBytes(baseLocation) - 1]);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15400);purchaseLocation = IsoTypeReader.readString(content);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15401);content.get(new byte[256 - Utf8.utf8StringLengthInBytes(purchaseLocation) - 1]);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15402);content.get(new byte[512]);
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15403);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15404);writeVersionAndFlags(byteBuffer);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15405);byteBuffer.put(Utf8.convert(baseLocation));
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15406);byteBuffer.put(new byte[256 - Utf8.utf8StringLengthInBytes(baseLocation)]); // string plus term zero
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15407);byteBuffer.put(Utf8.convert(purchaseLocation));
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15408);byteBuffer.put(new byte[256 - Utf8.utf8StringLengthInBytes(purchaseLocation)]); // string plus term zero
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15409);byteBuffer.put(new byte[512]);
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15410);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15411);if ((((this == o)&&(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15412)!=0|true))||(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15413)==0&false))) {__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15414);return true;
        }__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15415);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15416)!=0|true))||(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15417)==0&false))) {__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15418);return false;

        }__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15419);BaseLocationBox that = (BaseLocationBox) o;

        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15420);if (((((((baseLocation != null )&&(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15421)!=0|true))||(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15422)==0&false))? !baseLocation.equals(that.baseLocation) : that.baseLocation != null)&&(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15423)!=0|true))||(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15424)==0&false))) {__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15425);return false;
        }__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15426);if (((((((purchaseLocation != null )&&(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15427)!=0|true))||(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15428)==0&false))? !purchaseLocation.equals(that.purchaseLocation) : that.purchaseLocation != null)&&(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15429)!=0|true))||(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15430)==0&false)))
            {__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15431);return false;

        }__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15432);return true;
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15433);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15434);int result = (((baseLocation != null )&&(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15435)!=0|true))||(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15436)==0&false))? baseLocation.hashCode() : 0;
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15437);result = 31 * result + ((((purchaseLocation != null )&&(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15438)!=0|true))||(__CLR4_5_2bv8bv8lvl9ek0w.R.iget(15439)==0&false))? purchaseLocation.hashCode() : 0);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15440);return result;
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2bv8bv8lvl9ek0w.R.inc(15441);
        __CLR4_5_2bv8bv8lvl9ek0w.R.inc(15442);return "BaseLocationBox{" +
                "baseLocation='" + baseLocation + '\'' +
                ", purchaseLocation='" + purchaseLocation + '\'' +
                '}';
    }finally{__CLR4_5_2bv8bv8lvl9ek0w.R.flushNeeded();}}
}
