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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Assists with the serialization process and performs additional functionality based
 * on serialization.</p>
 *
 * <ul>
 * <li>Deep clone using serialization
 * <li>Serialize managing finally and IOException
 * <li>Deserialize managing finally and IOException
 * </ul>
 *
 * <p>This class throws exceptions for invalid {@code null} inputs.
 * Each method documents its behaviour in more detail.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 1.0
 */
public class SerializationUtils {public static class __CLR4_5_25hz5hzlvha79cg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,7189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>SerializationUtils instances should NOT be constructed in standard programming.
     * Instead, the class should be used as {@code SerializationUtils.clone(object)}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     * @since 2.0
     */
    public SerializationUtils() {
        super();__CLR4_5_25hz5hzlvha79cg.R.inc(7128);try{__CLR4_5_25hz5hzlvha79cg.R.inc(7127);
    }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

    // Clone
    //-----------------------------------------------------------------------
    /**
     * <p>Deep clone an {@code Object} using serialization.</p>
     *
     * <p>This is many times slower than writing clone methods by hand
     * on all objects in your object graph. However, for complex object
     * graphs, or for those that don't support deep cloning this can
     * be a simple alternative implementation. Of course all the objects
     * must be {@code Serializable}.</p>
     *
     * @param <T> the type of the object involved
     * @param object  the {@code Serializable} object to clone
     * @return the cloned object
     * @throws SerializationException (runtime) if the serialization fails
     */
    public static <T extends Serializable> T clone(final T object) {try{__CLR4_5_25hz5hzlvha79cg.R.inc(7129);
        __CLR4_5_25hz5hzlvha79cg.R.inc(7130);if ((((object == null)&&(__CLR4_5_25hz5hzlvha79cg.R.iget(7131)!=0|true))||(__CLR4_5_25hz5hzlvha79cg.R.iget(7132)==0&false))) {{
            __CLR4_5_25hz5hzlvha79cg.R.inc(7133);return null;
        }
        }__CLR4_5_25hz5hzlvha79cg.R.inc(7134);final byte[] objectData = serialize(object);
        __CLR4_5_25hz5hzlvha79cg.R.inc(7135);final ByteArrayInputStream bais = new ByteArrayInputStream(objectData);

        class __CLR4_5_2$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_25hz5hzlvha79cg.R.inc(7136);try (__CLR4_5_2$AC0 __CLR$ACI0=new __CLR4_5_2$AC0(){{__CLR4_5_25hz5hzlvha79cg.R.inc(7137);}};final ClassLoaderAwareObjectInputStream in = new ClassLoaderAwareObjectInputStream(bais,
                object.getClass().getClassLoader())) {
            /*
             * when we serialize and deserialize an object,
             * it is reasonable to assume the deserialized object
             * is of the same type as the original serialized object
             */
            __CLR4_5_25hz5hzlvha79cg.R.inc(7138);@SuppressWarnings("unchecked") // see above
            final T readObject = (T) in.readObject();
            __CLR4_5_25hz5hzlvha79cg.R.inc(7139);return readObject;

        } catch (final ClassNotFoundException ex) {
            __CLR4_5_25hz5hzlvha79cg.R.inc(7140);throw new SerializationException("ClassNotFoundException while reading cloned object data", ex);
        } catch (final IOException ex) {
            __CLR4_5_25hz5hzlvha79cg.R.inc(7141);throw new SerializationException("IOException while reading or closing cloned object data", ex);
        }
    }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

    /**
     * Performs a serialization roundtrip. Serializes and deserializes the given object, great for testing objects that
     * implement {@link Serializable}.
     *
     * @param <T>
     *           the type of the object involved
     * @param msg
     *            the object to roundtrip
     * @return the serialized and deserialized object
     * @since 3.3
     */
    @SuppressWarnings("unchecked") // OK, because we serialized a type `T`
    public static <T extends Serializable> T roundtrip(final T msg) {try{__CLR4_5_25hz5hzlvha79cg.R.inc(7142);
        __CLR4_5_25hz5hzlvha79cg.R.inc(7143);return (T) SerializationUtils.deserialize(SerializationUtils.serialize(msg));
    }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

    // Serialize
    //-----------------------------------------------------------------------
    /**
     * <p>Serializes an {@code Object} to the specified stream.</p>
     *
     * <p>The stream will be closed once the object is written.
     * This avoids the need for a finally clause, and maybe also exception
     * handling, in the application code.</p>
     *
     * <p>The stream passed in is not buffered internally within this method.
     * This is the responsibility of your application if desired.</p>
     *
     * @param obj  the object to serialize to bytes, may be null
     * @param outputStream  the stream to write to, must not be null
     * @throws IllegalArgumentException if {@code outputStream} is {@code null}
     * @throws SerializationException (runtime) if the serialization fails
     */
    public static void serialize(final Serializable obj, final OutputStream outputStream) {try{__CLR4_5_25hz5hzlvha79cg.R.inc(7144);
        __CLR4_5_25hz5hzlvha79cg.R.inc(7145);Validate.isTrue(outputStream != null, "The OutputStream must not be null");
        class __CLR4_5_2$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_25hz5hzlvha79cg.R.inc(7146);try (__CLR4_5_2$AC1 __CLR$ACI1=new __CLR4_5_2$AC1(){{__CLR4_5_25hz5hzlvha79cg.R.inc(7147);}};ObjectOutputStream out = new ObjectOutputStream(outputStream)){
            __CLR4_5_25hz5hzlvha79cg.R.inc(7148);out.writeObject(obj);
        } catch (final IOException ex) {
            __CLR4_5_25hz5hzlvha79cg.R.inc(7149);throw new SerializationException(ex);
        }
    }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

    /**
     * <p>Serializes an {@code Object} to a byte array for
     * storage/serialization.</p>
     *
     * @param obj  the object to serialize to bytes
     * @return a byte[] with the converted Serializable
     * @throws SerializationException (runtime) if the serialization fails
     */
    public static byte[] serialize(final Serializable obj) {try{__CLR4_5_25hz5hzlvha79cg.R.inc(7150);
        __CLR4_5_25hz5hzlvha79cg.R.inc(7151);final ByteArrayOutputStream baos = new ByteArrayOutputStream(512);
        __CLR4_5_25hz5hzlvha79cg.R.inc(7152);serialize(obj, baos);
        __CLR4_5_25hz5hzlvha79cg.R.inc(7153);return baos.toByteArray();
    }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

    // Deserialize
    //-----------------------------------------------------------------------
    /**
     * <p>
     * Deserializes an {@code Object} from the specified stream.
     * </p>
     * 
     * <p>
     * The stream will be closed once the object is written. This avoids the need for a finally clause, and maybe also
     * exception handling, in the application code.
     * </p>
     * 
     * <p>
     * The stream passed in is not buffered internally within this method. This is the responsibility of your
     * application if desired.
     * </p>
     * 
     * <p>
     * If the call site incorrectly types the return value, a {@link ClassCastException} is thrown from the call site.
     * Without Generics in this declaration, the call site must type cast and can cause the same ClassCastException.
     * Note that in both cases, the ClassCastException is in the call site, not in this method.
     * </p>
     *
     * @param <T>  the object type to be deserialized
     * @param inputStream
     *            the serialized object input stream, must not be null
     * @return the deserialized object
     * @throws IllegalArgumentException
     *             if {@code inputStream} is {@code null}
     * @throws SerializationException
     *             (runtime) if the serialization fails
     */
    public static <T> T deserialize(final InputStream inputStream) {try{__CLR4_5_25hz5hzlvha79cg.R.inc(7154);
        __CLR4_5_25hz5hzlvha79cg.R.inc(7155);Validate.isTrue(inputStream != null, "The InputStream must not be null");
        class __CLR4_5_2$AC2 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_5_25hz5hzlvha79cg.R.inc(7156);try (__CLR4_5_2$AC2 __CLR$ACI2=new __CLR4_5_2$AC2(){{__CLR4_5_25hz5hzlvha79cg.R.inc(7157);}};ObjectInputStream in = new ObjectInputStream(inputStream)) {
            __CLR4_5_25hz5hzlvha79cg.R.inc(7158);@SuppressWarnings("unchecked")
            final T obj = (T) in.readObject();
            __CLR4_5_25hz5hzlvha79cg.R.inc(7159);return obj;
        } catch (final ClassNotFoundException | IOException ex) {
            __CLR4_5_25hz5hzlvha79cg.R.inc(7160);throw new SerializationException(ex);
        }
    }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

    /**
     * <p>
     * Deserializes a single {@code Object} from an array of bytes.
     * </p>
     * 
     * <p>
     * If the call site incorrectly types the return value, a {@link ClassCastException} is thrown from the call site.
     * Without Generics in this declaration, the call site must type cast and can cause the same ClassCastException.
     * Note that in both cases, the ClassCastException is in the call site, not in this method.
     * </p>
     * 
     * @param <T>  the object type to be deserialized
     * @param objectData
     *            the serialized object, must not be null
     * @return the deserialized object
     * @throws IllegalArgumentException
     *             if {@code objectData} is {@code null}
     * @throws SerializationException
     *             (runtime) if the serialization fails
     */
    public static <T> T deserialize(final byte[] objectData) {try{__CLR4_5_25hz5hzlvha79cg.R.inc(7161);
        __CLR4_5_25hz5hzlvha79cg.R.inc(7162);Validate.isTrue(objectData != null, "The byte[] must not be null");
        __CLR4_5_25hz5hzlvha79cg.R.inc(7163);return SerializationUtils.<T>deserialize(new ByteArrayInputStream(objectData));
    }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

    /**
     * <p>Custom specialization of the standard JDK {@link java.io.ObjectInputStream}
     * that uses a custom  <code>ClassLoader</code> to resolve a class.
     * If the specified <code>ClassLoader</code> is not able to resolve the class,
     * the context classloader of the current thread will be used.
     * This way, the standard deserialization work also in web-application
     * containers and application servers, no matter in which of the
     * <code>ClassLoader</code> the particular class that encapsulates
     * serialization/deserialization lives. </p>
     * 
     * <p>For more in-depth information about the problem for which this
     * class here is a workaround, see the JIRA issue LANG-626. </p>
     */
     static class ClassLoaderAwareObjectInputStream extends ObjectInputStream {
        private static final Map<String, Class<?>> primitiveTypes = 
                new HashMap<>();

        static {try{__CLR4_5_25hz5hzlvha79cg.R.inc(7164);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7165);primitiveTypes.put("byte", byte.class);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7166);primitiveTypes.put("short", short.class);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7167);primitiveTypes.put("int", int.class);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7168);primitiveTypes.put("long", long.class);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7169);primitiveTypes.put("float", float.class);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7170);primitiveTypes.put("double", double.class);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7171);primitiveTypes.put("boolean", boolean.class);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7172);primitiveTypes.put("char", char.class);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7173);primitiveTypes.put("void", void.class);
        }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

        private final ClassLoader classLoader;
        
        /**
         * Constructor.
         * @param in The <code>InputStream</code>.
         * @param classLoader classloader to use
         * @throws IOException if an I/O error occurs while reading stream header.
         * @see java.io.ObjectInputStream
         */
        public ClassLoaderAwareObjectInputStream(final InputStream in, final ClassLoader classLoader) throws IOException {
            super(in);__CLR4_5_25hz5hzlvha79cg.R.inc(7175);try{__CLR4_5_25hz5hzlvha79cg.R.inc(7174);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7176);this.classLoader = classLoader;
        }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

        /**
         * Overridden version that uses the parameterized <code>ClassLoader</code> or the <code>ClassLoader</code>
         * of the current <code>Thread</code> to resolve the class.
         * @param desc An instance of class <code>ObjectStreamClass</code>.
         * @return A <code>Class</code> object corresponding to <code>desc</code>.
         * @throws IOException Any of the usual Input/Output exceptions.
         * @throws ClassNotFoundException If class of a serialized object cannot be found.
         */
        @Override
        protected Class<?> resolveClass(final ObjectStreamClass desc) throws IOException, ClassNotFoundException {try{__CLR4_5_25hz5hzlvha79cg.R.inc(7177);
            __CLR4_5_25hz5hzlvha79cg.R.inc(7178);final String name = desc.getName();
            __CLR4_5_25hz5hzlvha79cg.R.inc(7179);try {
                __CLR4_5_25hz5hzlvha79cg.R.inc(7180);return Class.forName(name, false, classLoader);
            } catch (final ClassNotFoundException ex) {
                __CLR4_5_25hz5hzlvha79cg.R.inc(7181);try {
                    __CLR4_5_25hz5hzlvha79cg.R.inc(7182);return Class.forName(name, false, Thread.currentThread().getContextClassLoader());
                } catch (final ClassNotFoundException cnfe) {
                    __CLR4_5_25hz5hzlvha79cg.R.inc(7183);final Class<?> cls = primitiveTypes.get(name);
                    __CLR4_5_25hz5hzlvha79cg.R.inc(7184);if ((((cls != null)&&(__CLR4_5_25hz5hzlvha79cg.R.iget(7185)!=0|true))||(__CLR4_5_25hz5hzlvha79cg.R.iget(7186)==0&false))) {{
                        __CLR4_5_25hz5hzlvha79cg.R.inc(7187);return cls;
                    }
                    }__CLR4_5_25hz5hzlvha79cg.R.inc(7188);throw cnfe;
                }
            }
        }finally{__CLR4_5_25hz5hzlvha79cg.R.flushNeeded();}}

    }

}
