/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.builder;

import static org.apache.commons.lang3.reflect.FieldUtils.readField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

/**
 * <p>
 * Assists in implementing {@link Diffable#diff(Object)} methods.
 * </p>
 * <p>
 * All non-static, non-transient fields (including inherited fields)
 * of the objects to diff are discovered using reflection and compared
 * for differences.
 * </p>
 * 
 * <p>
 * To use this class, write code as follows:
 * </p>
 * 
 * <pre>
 * public class Person implements Diffable&lt;Person&gt; {
 *   String name;
 *   int age;
 *   boolean smoker;
 *   ...
 *   
 *   public DiffResult diff(Person obj) {
 *     // No need for null check, as NullPointerException correct if obj is null
 *     return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE)
 *       .build();
 *   }
 * }
 * </pre>
 * 
 * <p>
 * The {@code ToStringStyle} passed to the constructor is embedded in the
 * returned {@code DiffResult} and influences the style of the
 * {@code DiffResult.toString()} method. This style choice can be overridden by
 * calling {@link DiffResult#toString(ToStringStyle)}.
 * </p>
 * @see Diffable
 * @see Diff
 * @see DiffResult
 * @see ToStringStyle
 * @since 3.6
 */
public class ReflectionDiffBuilder implements Builder<DiffResult> {public static class __CLR4_5_29lf9lflvha7aaz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,12468,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Object left;
    private final Object right;
    private final DiffBuilder diffBuilder;

    /**
     * <p>
     * Constructs a builder for the specified objects with the specified style.
     * </p>
     * 
     * <p>
     * If {@code lhs == rhs} or {@code lhs.equals(rhs)} then the builder will
     * not evaluate any calls to {@code append(...)} and will return an empty
     * {@link DiffResult} when {@link #build()} is executed.
     * </p>
     * @param <T>
     *            type of the objects to diff
     * @param lhs
     *            {@code this} object
     * @param rhs
     *            the object to diff against
     * @param style
     *            the style will use when outputting the objects, {@code null}
     *            uses the default
     * @throws IllegalArgumentException
     *             if {@code lhs} or {@code rhs} is {@code null}
     */
    public <T> ReflectionDiffBuilder(final T lhs, final T rhs, final ToStringStyle style) {try{__CLR4_5_29lf9lflvha7aaz.R.inc(12435);
        __CLR4_5_29lf9lflvha7aaz.R.inc(12436);this.left = lhs;
        __CLR4_5_29lf9lflvha7aaz.R.inc(12437);this.right = rhs;
        __CLR4_5_29lf9lflvha7aaz.R.inc(12438);diffBuilder = new DiffBuilder(lhs, rhs, style);
    }finally{__CLR4_5_29lf9lflvha7aaz.R.flushNeeded();}}

    @Override
    public DiffResult build() {try{__CLR4_5_29lf9lflvha7aaz.R.inc(12439);
        __CLR4_5_29lf9lflvha7aaz.R.inc(12440);if ((((left.equals(right))&&(__CLR4_5_29lf9lflvha7aaz.R.iget(12441)!=0|true))||(__CLR4_5_29lf9lflvha7aaz.R.iget(12442)==0&false))) {{
            __CLR4_5_29lf9lflvha7aaz.R.inc(12443);return diffBuilder.build();
        }

        }__CLR4_5_29lf9lflvha7aaz.R.inc(12444);appendFields(left.getClass());
        __CLR4_5_29lf9lflvha7aaz.R.inc(12445);return diffBuilder.build();
    }finally{__CLR4_5_29lf9lflvha7aaz.R.flushNeeded();}}

    private void appendFields(final Class<?> clazz) {try{__CLR4_5_29lf9lflvha7aaz.R.inc(12446);
        __CLR4_5_29lf9lflvha7aaz.R.inc(12447);for (final Field field : FieldUtils.getAllFields(clazz)) {{
            __CLR4_5_29lf9lflvha7aaz.R.inc(12448);if ((((accept(field))&&(__CLR4_5_29lf9lflvha7aaz.R.iget(12449)!=0|true))||(__CLR4_5_29lf9lflvha7aaz.R.iget(12450)==0&false))) {{
                __CLR4_5_29lf9lflvha7aaz.R.inc(12451);try {
                    __CLR4_5_29lf9lflvha7aaz.R.inc(12452);diffBuilder.append(field.getName(), readField(field, left, true),
                            readField(field, right, true));
                } catch (final IllegalAccessException ex) {
                    //this can't happen. Would get a Security exception instead
                    //throw a runtime exception in case the impossible happens.
                    __CLR4_5_29lf9lflvha7aaz.R.inc(12453);throw new InternalError("Unexpected IllegalAccessException: " + ex.getMessage());
                }
            }
        }}
    }}finally{__CLR4_5_29lf9lflvha7aaz.R.flushNeeded();}}

    private boolean accept(final Field field) {try{__CLR4_5_29lf9lflvha7aaz.R.inc(12454);
        __CLR4_5_29lf9lflvha7aaz.R.inc(12455);if ((((field.getName().indexOf(ClassUtils.INNER_CLASS_SEPARATOR_CHAR) != -1)&&(__CLR4_5_29lf9lflvha7aaz.R.iget(12456)!=0|true))||(__CLR4_5_29lf9lflvha7aaz.R.iget(12457)==0&false))) {{
            __CLR4_5_29lf9lflvha7aaz.R.inc(12458);return false;
        }
        }__CLR4_5_29lf9lflvha7aaz.R.inc(12459);if ((((Modifier.isTransient(field.getModifiers()))&&(__CLR4_5_29lf9lflvha7aaz.R.iget(12460)!=0|true))||(__CLR4_5_29lf9lflvha7aaz.R.iget(12461)==0&false))) {{
            __CLR4_5_29lf9lflvha7aaz.R.inc(12462);return false;
        }
        }__CLR4_5_29lf9lflvha7aaz.R.inc(12463);if ((((Modifier.isStatic(field.getModifiers()))&&(__CLR4_5_29lf9lflvha7aaz.R.iget(12464)!=0|true))||(__CLR4_5_29lf9lflvha7aaz.R.iget(12465)==0&false))) {{
            __CLR4_5_29lf9lflvha7aaz.R.inc(12466);return false;
        }
        }__CLR4_5_29lf9lflvha7aaz.R.inc(12467);return true;
    }finally{__CLR4_5_29lf9lflvha7aaz.R.flushNeeded();}}

}
