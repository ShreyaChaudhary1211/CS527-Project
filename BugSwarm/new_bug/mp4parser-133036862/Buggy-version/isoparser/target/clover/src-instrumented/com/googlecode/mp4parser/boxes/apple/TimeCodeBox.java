/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Sebastian Annies, Hamburg
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
package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.AbstractBox;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class TimeCodeBox extends AbstractBox implements SampleEntry, Container {public static class __CLR4_5_2bl5bl5lvlulk47{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,15087,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "tmcd";

    int timeScale;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    long flags;
    int dataReferenceIndex;
    byte[] rest = new byte[0];

    public TimeCodeBox() {
        super(TYPE);__CLR4_5_2bl5bl5lvlulk47.R.inc(15018);try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15017);
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}


    @Override
    protected long getContentSize() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15019);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15020);return 8 + 4 + 4 + 4 + 4 + 1 + 3 + rest.length;

    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer bb) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15021);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15022);bb.put(new byte[]{0, 0, 0, 0, 0, 0});
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15023);IsoTypeWriter.writeUInt16(bb, dataReferenceIndex);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15024);bb.putInt(reserved1);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15025);IsoTypeWriter.writeUInt32(bb, flags);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15026);bb.putInt(timeScale);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15027);bb.putInt(frameDuration);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15028);IsoTypeWriter.writeUInt8(bb, numberOfFrames);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15029);IsoTypeWriter.writeUInt24(bb, reserved2);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15030);bb.put(rest);

    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}


    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15031);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15032);content.position(6);// ignore 6 reserved bytes;
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15033);dataReferenceIndex = IsoTypeReader.readUInt16(content);   // 8
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15034);reserved1 = content.getInt();
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15035);flags = IsoTypeReader.readUInt32(content);

        __CLR4_5_2bl5bl5lvlulk47.R.inc(15036);timeScale = content.getInt();
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15037);frameDuration = content.getInt();
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15038);numberOfFrames = IsoTypeReader.readUInt8(content);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15039);reserved2 = IsoTypeReader.readUInt24(content);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15040);rest = new byte[content.remaining()];
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15041);content.get(rest);
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public int getDataReferenceIndex() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15042);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15043);return dataReferenceIndex;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void setDataReferenceIndex(int dataReferenceIndex) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15044);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15045);this.dataReferenceIndex = dataReferenceIndex;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}


    @Override
    public String toString() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15046);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15047);return "TimeCodeBox{" +
                "timeScale=" + timeScale +
                ", frameDuration=" + frameDuration +
                ", numberOfFrames=" + numberOfFrames +
                ", reserved1=" + reserved1 +
                ", reserved2=" + reserved2 +
                ", flags=" + flags +
                '}';
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public int getTimeScale() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15048);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15049);return timeScale;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void setTimeScale(int timeScale) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15050);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15051);this.timeScale = timeScale;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public int getFrameDuration() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15052);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15053);return frameDuration;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void setFrameDuration(int frameDuration) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15054);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15055);this.frameDuration = frameDuration;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public int getNumberOfFrames() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15056);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15057);return numberOfFrames;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void setNumberOfFrames(int numberOfFrames) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15058);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15059);this.numberOfFrames = numberOfFrames;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public int getReserved1() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15060);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15061);return reserved1;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void setReserved1(int reserved1) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15062);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15063);this.reserved1 = reserved1;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public int getReserved2() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15064);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15065);return reserved2;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void setReserved2(int reserved2) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15066);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15067);this.reserved2 = reserved2;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public long getFlags() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15068);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15069);return flags;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void setFlags(long flags) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15070);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15071);this.flags = flags;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public byte[] getRest() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15072);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15073);return rest;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void setRest(byte[] rest) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15074);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15075);this.rest = rest;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}


    public List<Box> getBoxes() {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15076);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15077);return Collections.emptyList();
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void setBoxes(List<Box> boxes) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15078);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15079);throw new RuntimeException("Time Code Box doesn't accept any children");
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public <T extends Box> List<T> getBoxes(Class<T> clazz) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15080);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15081);return Collections.emptyList();
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public <T extends Box> List<T> getBoxes(Class<T> clazz, boolean recursive) {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15082);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15083);return Collections.emptyList();
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public ByteBuffer getByteBuffer(long start, long size) throws IOException {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15084);
        __CLR4_5_2bl5bl5lvlulk47.R.inc(15085);return null;
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}

    public void writeContainer(WritableByteChannel bb) throws IOException {try{__CLR4_5_2bl5bl5lvlulk47.R.inc(15086);
    }finally{__CLR4_5_2bl5bl5lvlulk47.R.flushNeeded();}}
}
