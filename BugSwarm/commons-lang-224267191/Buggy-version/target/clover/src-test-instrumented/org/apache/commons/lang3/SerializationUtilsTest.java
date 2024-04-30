/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.SerializationUtils}.
 */
public class SerializationUtilsTest {static class __CLR4_5_2q3vq3vlvha7g5a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,34062,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  static final String CLASS_NOT_FOUND_MESSAGE = "ClassNotFoundSerialization.readObject fake exception";
    protected static final String SERIALIZE_IO_EXCEPTION_MESSAGE = "Anonymous OutputStream I/O exception";
  
    private String iString;
    private Integer iInteger;
    private HashMap<Object, Object> iMap;

    @Before
    public void setUp() {try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33835);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33836);iString = "foo";
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33837);iInteger = Integer.valueOf(7);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33838);iMap = new HashMap<>();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33839);iMap.put("FOO", iString);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33840);iMap.put("BAR", iInteger);
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testConstructor() {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uefs8hq41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testConstructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uefs8hq41(){try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33841);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33842);assertNotNull(new SerializationUtils());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33843);final Constructor<?>[] cons = SerializationUtils.class.getDeclaredConstructors();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33844);assertEquals(1, cons.length);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33845);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33846);assertTrue(Modifier.isPublic(SerializationUtils.class.getModifiers()));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33847);assertFalse(Modifier.isFinal(SerializationUtils.class.getModifiers()));
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}
    
    @Test
    public void testException() {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22aalq4q48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33848,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22aalq4q48(){try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33848);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33849);SerializationException serEx;
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33850);final Exception ex = new Exception();
        
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33851);serEx = new SerializationException();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33852);assertSame(null, serEx.getMessage());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33853);assertSame(null, serEx.getCause());
        
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33854);serEx = new SerializationException("Message");
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33855);assertSame("Message", serEx.getMessage());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33856);assertSame(null, serEx.getCause());
        
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33857);serEx = new SerializationException(ex);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33858);assertEquals("java.lang.Exception", serEx.getMessage());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33859);assertSame(ex, serEx.getCause());
        
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33860);serEx = new SerializationException("Message", ex);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33861);assertSame("Message", serEx.getMessage());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33862);assertSame(ex, serEx.getCause());
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------

    @Test
    public void testSerializeStream() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vpsyzq4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33863,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vpsyzq4n() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33863);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33864);final ByteArrayOutputStream streamTest = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33865);SerializationUtils.serialize(iMap, streamTest);

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33866);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33867);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33868);oos.writeObject(iMap);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33869);oos.flush();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33870);oos.close();

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33871);final byte[] testBytes = streamTest.toByteArray();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33872);final byte[] realBytes = streamReal.toByteArray();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33873);assertEquals(testBytes.length, realBytes.length);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33874);for (int i = 0; (((i < realBytes.length)&&(__CLR4_5_2q3vq3vlvha7g5a.R.iget(33875)!=0|true))||(__CLR4_5_2q3vq3vlvha7g5a.R.iget(33876)==0&false)); i++) {{
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33877);assertEquals(realBytes[i], testBytes[i]);
        }
    }}finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testSerializeStreamUnserializable() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22evm0jq52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamUnserializable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22evm0jq52() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33878);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33879);final ByteArrayOutputStream streamTest = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33880);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33881);iMap.put(new Object(), new Object());
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33882);SerializationUtils.serialize(iMap, streamTest);
        } catch (final SerializationException ex) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33883);return;
        }
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33884);fail();
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testSerializeStreamNullObj() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2irtz7tq59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullObj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2irtz7tq59() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33885);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33886);final ByteArrayOutputStream streamTest = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33887);SerializationUtils.serialize(null, streamTest);

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33888);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33889);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33890);oos.writeObject(null);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33891);oos.flush();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33892);oos.close();

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33893);final byte[] testBytes = streamTest.toByteArray();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33894);final byte[] realBytes = streamReal.toByteArray();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33895);assertEquals(testBytes.length, realBytes.length);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33896);for (int i = 0; (((i < realBytes.length)&&(__CLR4_5_2q3vq3vlvha7g5a.R.iget(33897)!=0|true))||(__CLR4_5_2q3vq3vlvha7g5a.R.iget(33898)==0&false)); i++) {{
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33899);assertEquals(realBytes[i], testBytes[i]);
        }
    }}finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testSerializeStreamObjNull() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_271v11lq5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamObjNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_271v11lq5o() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33900);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33901);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33902);SerializationUtils.serialize(iMap, null);
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33903);return;
        }
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33904);fail();
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testSerializeStreamNullNull() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p3b00tq5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeStreamNullNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p3b00tq5t() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33905);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33906);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33907);SerializationUtils.serialize(null, null);
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33908);return;
        }
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33909);fail();
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}
    
    @Test
    public void testSerializeIOException() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufu7paq5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeIOException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufu7paq5y() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33910);
        // forces an IOException when the ObjectOutputStream is created, to test not closing the stream
        // in the finally block
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33911);final OutputStream streamTest = new OutputStream() {
            @Override
            public void write(final int arg0) throws IOException {try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33912);
                __CLR4_5_2q3vq3vlvha7g5a.R.inc(33913);throw new IOException(SERIALIZE_IO_EXCEPTION_MESSAGE);
            }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}
        };
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33914);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33915);SerializationUtils.serialize(iMap, streamTest);
        }
        catch(final SerializationException e) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33916);assertEquals("java.io.IOException: " + SERIALIZE_IO_EXCEPTION_MESSAGE, e.getMessage());
        }
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testDeserializeStream() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z12710q65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z12710q65() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33917);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33918);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33919);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33920);oos.writeObject(iMap);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33921);oos.flush();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33922);oos.close();

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33923);final ByteArrayInputStream inTest = new ByteArrayInputStream(streamReal.toByteArray());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33924);final Object test = SerializationUtils.deserialize(inTest);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33925);assertNotNull(test);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33926);assertTrue(test instanceof HashMap<?, ?>);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33927);assertTrue(test != iMap);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33928);final HashMap<?, ?> testMap = (HashMap<?, ?>) test;
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33929);assertEquals(iString, testMap.get("FOO"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33930);assertTrue(iString != testMap.get("FOO"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33931);assertEquals(iInteger, testMap.get("BAR"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33932);assertTrue(iInteger != testMap.get("BAR"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33933);assertEquals(iMap, testMap);
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test(expected=ClassCastException.class)
    public void testDeserializeClassCastException() {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c6r838q6m();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,101,115,101,114,105,97,108,105,122,101,67,108,97,115,115,67,97,115,116,69,120,99,101,112,116,105,111,110,58,32,91,67,108,97,115,115,67,97,115,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ClassCastException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeClassCastException",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c6r838q6m(){try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33934);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33935);final String value = "Hello";
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33936);final byte[] serialized = SerializationUtils.serialize(value);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33937);Assert.assertEquals(value, SerializationUtils.deserialize(serialized));
        // Causes ClassCastException in call site, not in SerializationUtils.deserialize
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33938);@SuppressWarnings("unused") // needed to cause Exception
        final Integer i = SerializationUtils.deserialize(serialized);
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testDeserializeStreamOfNull() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ajfbdaq6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamOfNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33939,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ajfbdaq6r() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33939);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33940);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33941);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33942);oos.writeObject(null);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33943);oos.flush();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33944);oos.close();

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33945);final ByteArrayInputStream inTest = new ByteArrayInputStream(streamReal.toByteArray());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33946);final Object test = SerializationUtils.deserialize(inTest);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33947);assertNull(test);
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testDeserializeStreamNull() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tmrvs5q70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tmrvs5q70() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33948);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33949);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33950);SerializationUtils.deserialize((InputStream) null);
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33951);return;
        }
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33952);fail();
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testDeserializeStreamBadStream() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26clkqnq75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamBadStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26clkqnq75() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33953);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33954);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33955);SerializationUtils.deserialize(new ByteArrayInputStream(new byte[0]));
        } catch (final SerializationException ex) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33956);return;
        }
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33957);fail();
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testDeserializeStreamClassNotFound() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fgbu5bq7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeStreamClassNotFound",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fgbu5bq7a() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33958);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33959);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33960);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33961);oos.writeObject(new ClassNotFoundSerialization());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33962);oos.flush();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33963);oos.close();

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33964);final ByteArrayInputStream inTest = new ByteArrayInputStream(streamReal.toByteArray());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33965);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33966);@SuppressWarnings("unused")
            final
            Object test = SerializationUtils.deserialize(inTest);
        } catch(final SerializationException se) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33967);assertEquals("java.lang.ClassNotFoundException: " + CLASS_NOT_FOUND_MESSAGE, se.getMessage());
        }
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}
    
    @Test 
    public void testRoundtrip() {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2la7nh4q7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testRoundtrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2la7nh4q7k(){try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33968);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33969);final HashMap<Object, Object> newMap = SerializationUtils.roundtrip(iMap);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33970);assertEquals(iMap, newMap);
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------

    @Test
    public void testSerializeBytes() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ov75twq7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33971,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ov75twq7n() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33971);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33972);final byte[] testBytes = SerializationUtils.serialize(iMap);

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33973);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33974);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33975);oos.writeObject(iMap);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33976);oos.flush();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33977);oos.close();

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33978);final byte[] realBytes = streamReal.toByteArray();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33979);assertEquals(testBytes.length, realBytes.length);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33980);for (int i = 0; (((i < realBytes.length)&&(__CLR4_5_2q3vq3vlvha7g5a.R.iget(33981)!=0|true))||(__CLR4_5_2q3vq3vlvha7g5a.R.iget(33982)==0&false)); i++) {{
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33983);assertEquals(realBytes[i], testBytes[i]);
        }
    }}finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testSerializeBytesUnserializable() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x6yz7gq80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesUnserializable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33984,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x6yz7gq80() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33984);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33985);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33986);iMap.put(new Object(), new Object());
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33987);SerializationUtils.serialize(iMap);
        } catch (final SerializationException ex) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(33988);return;
        }
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33989);fail();
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testSerializeBytesNull() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),33990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mqdf91q86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testSerializeBytesNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),33990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mqdf91q86() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(33990);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33991);final byte[] testBytes = SerializationUtils.serialize(null);

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33992);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33993);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33994);oos.writeObject(null);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33995);oos.flush();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33996);oos.close();

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33997);final byte[] realBytes = streamReal.toByteArray();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33998);assertEquals(testBytes.length, realBytes.length);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(33999);for (int i = 0; (((i < realBytes.length)&&(__CLR4_5_2q3vq3vlvha7g5a.R.iget(34000)!=0|true))||(__CLR4_5_2q3vq3vlvha7g5a.R.iget(34001)==0&false)); i++) {{
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34002);assertEquals(realBytes[i], testBytes[i]);
        }
    }}finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testDeserializeBytes() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),34003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zbhvmtq8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34003,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zbhvmtq8j() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(34003);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34004);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34005);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34006);oos.writeObject(iMap);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34007);oos.flush();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34008);oos.close();

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34009);final Object test = SerializationUtils.deserialize(streamReal.toByteArray());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34010);assertNotNull(test);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34011);assertTrue(test instanceof HashMap<?, ?>);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34012);assertTrue(test != iMap);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34013);final HashMap<?, ?> testMap = (HashMap<?, ?>) test;
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34014);assertEquals(iString, testMap.get("FOO"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34015);assertTrue(iString != testMap.get("FOO"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34016);assertEquals(iInteger, testMap.get("BAR"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34017);assertTrue(iInteger != testMap.get("BAR"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34018);assertEquals(iMap, testMap);
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testDeserializeBytesOfNull() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),34019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ke4tz1q8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesOfNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34019,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ke4tz1q8z() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(34019);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34020);final ByteArrayOutputStream streamReal = new ByteArrayOutputStream();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34021);final ObjectOutputStream oos = new ObjectOutputStream(streamReal);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34022);oos.writeObject(null);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34023);oos.flush();
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34024);oos.close();

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34025);final Object test = SerializationUtils.deserialize(streamReal.toByteArray());
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34026);assertNull(test);
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testDeserializeBytesNull() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),34027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zh3j1oq97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zh3j1oq97() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(34027);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34028);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34029);SerializationUtils.deserialize((byte[]) null);
        } catch (final IllegalArgumentException ex) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34030);return;
        }
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34031);fail();
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testDeserializeBytesBadStream() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),34032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pbu60iq9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testDeserializeBytesBadStream",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pbu60iq9c() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(34032);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34033);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34034);SerializationUtils.deserialize(new byte[0]);
        } catch (final SerializationException ex) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34035);return;
        }
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34036);fail();
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testClone() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),34037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2csyejyq9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testClone",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2csyejyq9h() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(34037);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34038);final Object test = SerializationUtils.clone(iMap);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34039);assertNotNull(test);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34040);assertTrue(test instanceof HashMap<?,?>);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34041);assertTrue(test != iMap);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34042);final HashMap<?, ?> testMap = (HashMap<?, ?>) test;
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34043);assertEquals(iString, testMap.get("FOO"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34044);assertTrue(iString != testMap.get("FOO"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34045);assertEquals(iInteger, testMap.get("BAR"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34046);assertTrue(iInteger != testMap.get("BAR"));
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34047);assertEquals(iMap, testMap);
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testCloneNull() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),34048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_239os87q9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testCloneNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_239os87q9s() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(34048);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34049);final Object test = SerializationUtils.clone(null);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34050);assertNull(test);
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

    @Test
    public void testCloneUnserializable() throws Exception {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),34051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0blmeq9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testCloneUnserializable",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0blmeq9v() throws Exception{try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(34051);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34052);try {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34053);iMap.put(new Object(), new Object());
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34054);SerializationUtils.clone(iMap);
        } catch (final SerializationException ex) {
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34055);return;
        }
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34056);fail();
    }finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}
    
    @Test
    public void testPrimitiveTypeClassSerialization() {__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceStart(getClass().getName(),34057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2miwbceqa1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2q3vq3vlvha7g5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2q3vq3vlvha7g5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SerializationUtilsTest.testPrimitiveTypeClassSerialization",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),34057,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2miwbceqa1(){try{__CLR4_5_2q3vq3vlvha7g5a.R.inc(34057);
        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34058);final Class<?>[] primitiveTypes = { byte.class, short.class, int.class, long.class, float.class, double.class,
                boolean.class, char.class, void.class };

        __CLR4_5_2q3vq3vlvha7g5a.R.inc(34059);for (final Class<?> primitiveType : primitiveTypes) {{
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34060);final Class<?> clone = SerializationUtils.clone(primitiveType);
            __CLR4_5_2q3vq3vlvha7g5a.R.inc(34061);assertEquals(primitiveType, clone);
        }
    }}finally{__CLR4_5_2q3vq3vlvha7g5a.R.flushNeeded();}}

}

class ClassNotFoundSerialization implements Serializable
{public static class __CLR4_5_2q3vqa6lvha7g5c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172763741L,8589935092L,34064,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 1L;

    private void readObject(final ObjectInputStream in) throws ClassNotFoundException    {try{__CLR4_5_2q3vqa6lvha7g5c.R.inc(34062);
        __CLR4_5_2q3vqa6lvha7g5c.R.inc(34063);throw new ClassNotFoundException(SerializationUtilsTest.CLASS_NOT_FOUND_MESSAGE);
    }finally{__CLR4_5_2q3vqa6lvha7g5c.R.flushNeeded();}}
}
