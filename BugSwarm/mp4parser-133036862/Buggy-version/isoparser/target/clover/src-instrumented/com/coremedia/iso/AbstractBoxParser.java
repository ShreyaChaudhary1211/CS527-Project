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
package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.DataSource;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/**
 * This BoxParser handles the basic stuff like reading size and extracting box type.
 */
public abstract class AbstractBoxParser implements BoxParser {public static class __CLR4_5_200lvlula0i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,58,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Logger LOG = Logger.getLogger(AbstractBoxParser.class.getName());
    ThreadLocal<ByteBuffer> header = new ThreadLocal<ByteBuffer>() {
        @Override
        protected ByteBuffer initialValue() {try{__CLR4_5_200lvlula0i.R.inc(0);
            __CLR4_5_200lvlula0i.R.inc(1);return ByteBuffer.allocate(32);
        }finally{__CLR4_5_200lvlula0i.R.flushNeeded();}}
    };

    public abstract Box createBox(String type, byte[] userType, String parent);

    /**
     * Parses the next size and type, creates a box instance and parses the box's content.
     *
     * @param byteChannel the DataSource pointing to the ISO file
     * @param parent      the current box's parent (null if no parent)
     * @return the box just parsed
     * @throws java.io.IOException if reading from <code>in</code> fails
     */
    public Box parseBox(DataSource byteChannel, Container parent) throws IOException {try{__CLR4_5_200lvlula0i.R.inc(2);
        __CLR4_5_200lvlula0i.R.inc(3);long startPos = byteChannel.position();
        __CLR4_5_200lvlula0i.R.inc(4);header.get().rewind().limit(8);

        __CLR4_5_200lvlula0i.R.inc(5);int bytesRead = 0;
        __CLR4_5_200lvlula0i.R.inc(6);int b = 0;
        __CLR4_5_200lvlula0i.R.inc(7);while ((b = byteChannel.read(header.get())) != 8) {{
            __CLR4_5_200lvlula0i.R.inc(10);if ((((b < 0)&&(__CLR4_5_200lvlula0i.R.iget(11)!=0|true))||(__CLR4_5_200lvlula0i.R.iget(12)==0&false))) {{
                __CLR4_5_200lvlula0i.R.inc(13);byteChannel.position(startPos);
                __CLR4_5_200lvlula0i.R.inc(14);throw new EOFException();
            } }else {{
                __CLR4_5_200lvlula0i.R.inc(15);bytesRead += b;
            }
        }}
        }__CLR4_5_200lvlula0i.R.inc(16);header.get().rewind();

        __CLR4_5_200lvlula0i.R.inc(17);long size = IsoTypeReader.readUInt32(header.get());
        // do plausibility check
        __CLR4_5_200lvlula0i.R.inc(18);if ((((size < 8 && size > 1)&&(__CLR4_5_200lvlula0i.R.iget(19)!=0|true))||(__CLR4_5_200lvlula0i.R.iget(20)==0&false))) {{
            __CLR4_5_200lvlula0i.R.inc(21);LOG.severe("Plausibility check failed: size < 8 (size = " + size + "). Stop parsing!");
            __CLR4_5_200lvlula0i.R.inc(22);return null;
        }


        }__CLR4_5_200lvlula0i.R.inc(23);String type = IsoTypeReader.read4cc(header.get());
        //System.err.println(type);
        __CLR4_5_200lvlula0i.R.inc(24);byte[] usertype = null;
        __CLR4_5_200lvlula0i.R.inc(25);long contentSize;

        __CLR4_5_200lvlula0i.R.inc(26);if ((((size == 1)&&(__CLR4_5_200lvlula0i.R.iget(27)!=0|true))||(__CLR4_5_200lvlula0i.R.iget(28)==0&false))) {{
            __CLR4_5_200lvlula0i.R.inc(29);header.get().limit(16);
            __CLR4_5_200lvlula0i.R.inc(30);byteChannel.read(header.get());
            __CLR4_5_200lvlula0i.R.inc(31);header.get().position(8);
            __CLR4_5_200lvlula0i.R.inc(32);size = IsoTypeReader.readUInt64(header.get());
            __CLR4_5_200lvlula0i.R.inc(33);contentSize = size - 16;
        } }else {__CLR4_5_200lvlula0i.R.inc(34);if ((((size == 0)&&(__CLR4_5_200lvlula0i.R.iget(35)!=0|true))||(__CLR4_5_200lvlula0i.R.iget(36)==0&false))) {{
            __CLR4_5_200lvlula0i.R.inc(37);contentSize = byteChannel.size() - byteChannel.position();
            __CLR4_5_200lvlula0i.R.inc(38);size = contentSize + 8;
        } }else {{
            __CLR4_5_200lvlula0i.R.inc(39);contentSize = size - 8;
        }
        }}__CLR4_5_200lvlula0i.R.inc(40);if ((((UserBox.TYPE.equals(type))&&(__CLR4_5_200lvlula0i.R.iget(41)!=0|true))||(__CLR4_5_200lvlula0i.R.iget(42)==0&false))) {{
            __CLR4_5_200lvlula0i.R.inc(43);header.get().limit(header.get().limit() + 16);
            __CLR4_5_200lvlula0i.R.inc(44);byteChannel.read(header.get());
            __CLR4_5_200lvlula0i.R.inc(45);usertype = new byte[16];
            __CLR4_5_200lvlula0i.R.inc(46);for (int i = header.get().position() - 16; (((i < header.get().position())&&(__CLR4_5_200lvlula0i.R.iget(47)!=0|true))||(__CLR4_5_200lvlula0i.R.iget(48)==0&false)); i++) {{
                __CLR4_5_200lvlula0i.R.inc(49);usertype[i - (header.get().position() - 16)] = header.get().get(i);
            }
            }__CLR4_5_200lvlula0i.R.inc(50);contentSize -= 16;
        }
        }__CLR4_5_200lvlula0i.R.inc(51);Box box = createBox(type, usertype, ((((parent instanceof Box) )&&(__CLR4_5_200lvlula0i.R.iget(52)!=0|true))||(__CLR4_5_200lvlula0i.R.iget(53)==0&false))? ((Box) parent).getType() : "");
        __CLR4_5_200lvlula0i.R.inc(54);box.setParent(parent);
        //LOG.finest("Parsing " + box.getType());
        // System.out.println("parsing " + Mp4Arrays.toString(box.getType()) + " " + box.getClass().getName() + " size=" + size);
        __CLR4_5_200lvlula0i.R.inc(55);header.get().rewind();

        __CLR4_5_200lvlula0i.R.inc(56);box.parse(byteChannel, header.get(), contentSize, this);
        __CLR4_5_200lvlula0i.R.inc(57);return box;
    }finally{__CLR4_5_200lvlula0i.R.flushNeeded();}}


}
