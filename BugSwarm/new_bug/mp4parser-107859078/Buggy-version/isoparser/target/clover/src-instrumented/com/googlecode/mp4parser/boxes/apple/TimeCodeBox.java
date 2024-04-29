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
public class TimeCodeBox extends AbstractBox implements SampleEntry, Container {public static class __CLR4_5_2biibiilvl9ejtm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,14992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(TYPE);__CLR4_5_2biibiilvl9ejtm.R.inc(14923);try{__CLR4_5_2biibiilvl9ejtm.R.inc(14922);
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}


    @Override
    protected long getContentSize() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14924);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14925);return 8 + 4 + 4 + 4 + 4 + 1 + 3 + rest.length;

    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer bb) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14926);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14927);bb.put(new byte[]{0, 0, 0, 0, 0, 0});
        __CLR4_5_2biibiilvl9ejtm.R.inc(14928);IsoTypeWriter.writeUInt16(bb, dataReferenceIndex);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14929);bb.putInt(reserved1);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14930);IsoTypeWriter.writeUInt32(bb, flags);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14931);bb.putInt(timeScale);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14932);bb.putInt(frameDuration);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14933);IsoTypeWriter.writeUInt8(bb, numberOfFrames);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14934);IsoTypeWriter.writeUInt24(bb, reserved2);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14935);bb.put(rest);

    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}


    @Override
    protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14936);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14937);content.position(6);// ignore 6 reserved bytes;
        __CLR4_5_2biibiilvl9ejtm.R.inc(14938);dataReferenceIndex = IsoTypeReader.readUInt16(content);   // 8
        __CLR4_5_2biibiilvl9ejtm.R.inc(14939);reserved1 = content.getInt();
        __CLR4_5_2biibiilvl9ejtm.R.inc(14940);flags = IsoTypeReader.readUInt32(content);

        __CLR4_5_2biibiilvl9ejtm.R.inc(14941);timeScale = content.getInt();
        __CLR4_5_2biibiilvl9ejtm.R.inc(14942);frameDuration = content.getInt();
        __CLR4_5_2biibiilvl9ejtm.R.inc(14943);numberOfFrames = IsoTypeReader.readUInt8(content);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14944);reserved2 = IsoTypeReader.readUInt24(content);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14945);rest = new byte[content.remaining()];
        __CLR4_5_2biibiilvl9ejtm.R.inc(14946);content.get(rest);
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public int getDataReferenceIndex() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14947);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14948);return dataReferenceIndex;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void setDataReferenceIndex(int dataReferenceIndex) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14949);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14950);this.dataReferenceIndex = dataReferenceIndex;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}


    @Override
    public String toString() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14951);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14952);return "TimeCodeBox{" +
                "timeScale=" + timeScale +
                ", frameDuration=" + frameDuration +
                ", numberOfFrames=" + numberOfFrames +
                ", reserved1=" + reserved1 +
                ", reserved2=" + reserved2 +
                ", flags=" + flags +
                '}';
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public int getTimeScale() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14953);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14954);return timeScale;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void setTimeScale(int timeScale) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14955);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14956);this.timeScale = timeScale;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public int getFrameDuration() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14957);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14958);return frameDuration;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void setFrameDuration(int frameDuration) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14959);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14960);this.frameDuration = frameDuration;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public int getNumberOfFrames() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14961);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14962);return numberOfFrames;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void setNumberOfFrames(int numberOfFrames) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14963);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14964);this.numberOfFrames = numberOfFrames;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public int getReserved1() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14965);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14966);return reserved1;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void setReserved1(int reserved1) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14967);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14968);this.reserved1 = reserved1;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public int getReserved2() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14969);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14970);return reserved2;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void setReserved2(int reserved2) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14971);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14972);this.reserved2 = reserved2;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public long getFlags() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14973);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14974);return flags;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void setFlags(long flags) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14975);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14976);this.flags = flags;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public byte[] getRest() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14977);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14978);return rest;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void setRest(byte[] rest) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14979);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14980);this.rest = rest;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}


    public List<Box> getBoxes() {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14981);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14982);return Collections.emptyList();
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void setBoxes(List<Box> boxes) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14983);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14984);throw new RuntimeException("Time Code Box doesn't accept any children");
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public <T extends Box> List<T> getBoxes(Class<T> clazz) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14985);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14986);return Collections.emptyList();
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public <T extends Box> List<T> getBoxes(Class<T> clazz, boolean recursive) {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14987);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14988);return Collections.emptyList();
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public ByteBuffer getByteBuffer(long start, long size) throws IOException {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14989);
        __CLR4_5_2biibiilvl9ejtm.R.inc(14990);return null;
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}

    public void writeContainer(WritableByteChannel bb) throws IOException {try{__CLR4_5_2biibiilvl9ejtm.R.inc(14991);
    }finally{__CLR4_5_2biibiilvl9ejtm.R.flushNeeded();}}
}
