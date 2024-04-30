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
package org.apache.commons.lang3.reflect;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Utilities for working with {@link Field}s by reflection. Adapted and refactored from the dormant [reflect] Commons
 * sandbox component.
 * <p>
 * The ability is provided to break the scoping restrictions coded by the programmer. This can allow fields to be
 * changed that shouldn't be. This facility should be used with care.
 * 
 * @since 2.5
 */
public class FieldUtils {public static class __CLR4_5_2cwwcwwlvha7b2v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,16919,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * {@link FieldUtils} instances should NOT be constructed in standard programming.
     * <p>
     * This constructor is {@code public} to permit tools that require a JavaBean instance to operate.
     * </p>
     */
    public FieldUtils() {
        super();__CLR4_5_2cwwcwwlvha7b2v.R.inc(16737);try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16736);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets an accessible {@link Field} by name respecting scope. Superclasses/interfaces will be considered.
     * 
     * @param cls
     *            the {@link Class} to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class is {@code null}, or the field name is blank or empty
     */
    public static Field getField(final Class<?> cls, final String fieldName) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16738);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16739);final Field field = getField(cls, fieldName, false);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16740);MemberUtils.setAccessibleWorkaround(field);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16741);return field;
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets an accessible {@link Field} by name, breaking scope if requested. Superclasses/interfaces will be
     * considered.
     * 
     * @param cls
     *            the {@link Class} to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class is {@code null}, or the field name is blank or empty or is matched at multiple places
     *             in the inheritance hierarchy
     */
    public static Field getField(final Class<?> cls, final String fieldName, final boolean forceAccess) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16742);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16743);Validate.isTrue(cls != null, "The class must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16744);Validate.isTrue(StringUtils.isNotBlank(fieldName), "The field name must not be blank/empty");
        // FIXME is this workaround still needed? lang requires Java 6
        // Sun Java 1.3 has a bugged implementation of getField hence we write the
        // code ourselves

        // getField() will return the Field object with the declaring class
        // set correctly to the class that declares the field. Thus requesting the
        // field on a subclass will return the field from the superclass.
        //
        // priority order for lookup:
        // searchclass private/protected/package/public
        // superclass protected/package/public
        // private/different package blocks access to further superclasses
        // implementedinterface public

        // check up the superclass hierarchy
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16745);for (Class<?> acls = cls; (((acls != null)&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16746)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16747)==0&false)); acls = acls.getSuperclass()) {{
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16748);try {
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16749);final Field field = acls.getDeclaredField(fieldName);
                // getDeclaredField checks for non-public scopes as well
                // and it returns accurate results
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16750);if ((((!Modifier.isPublic(field.getModifiers()))&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16751)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16752)==0&false))) {{
                    __CLR4_5_2cwwcwwlvha7b2v.R.inc(16753);if ((((forceAccess)&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16754)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16755)==0&false))) {{
                        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16756);field.setAccessible(true);
                    } }else {{
                        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16757);continue;
                    }
                }}
                }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16758);return field;
            } catch (final NoSuchFieldException ex) { // NOPMD
                // ignore
            }
        }
        // check the public interface case. This must be manually searched for
        // incase there is a public supersuperclass field hidden by a private/package
        // superclass field.
        }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16759);Field match = null;
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16760);for (final Class<?> class1 : ClassUtils.getAllInterfaces(cls)) {{
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16761);try {
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16762);final Field test = class1.getField(fieldName);
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16763);Validate.isTrue(match == null, "Reference to field %s is ambiguous relative to %s"
                        + "; a matching field exists on two or more implemented interfaces.", fieldName, cls);
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16764);match = test;
            } catch (final NoSuchFieldException ex) { // NOPMD
                // ignore
            }
        }
        }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16765);return match;
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets an accessible {@link Field} by name respecting scope. Only the specified class will be considered.
     * 
     * @param cls
     *            the {@link Class} to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class is {@code null}, or the field name is blank or empty
     */
    public static Field getDeclaredField(final Class<?> cls, final String fieldName) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16766);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16767);return getDeclaredField(cls, fieldName, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets an accessible {@link Field} by name, breaking scope if requested. Only the specified class will be
     * considered.
     * 
     * @param cls
     *            the {@link Class} to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class is {@code null}, or the field name is blank or empty
     */
    public static Field getDeclaredField(final Class<?> cls, final String fieldName, final boolean forceAccess) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16768);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16769);Validate.isTrue(cls != null, "The class must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16770);Validate.isTrue(StringUtils.isNotBlank(fieldName), "The field name must not be blank/empty");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16771);try {
            // only consider the specified class by using getDeclaredField()
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16772);final Field field = cls.getDeclaredField(fieldName);
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16773);if ((((!MemberUtils.isAccessible(field))&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16774)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16775)==0&false))) {{
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16776);if ((((forceAccess)&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16777)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16778)==0&false))) {{
                    __CLR4_5_2cwwcwwlvha7b2v.R.inc(16779);field.setAccessible(true);
                } }else {{
                    __CLR4_5_2cwwcwwlvha7b2v.R.inc(16780);return null;
                }
            }}
            }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16781);return field;
        } catch (final NoSuchFieldException e) { // NOPMD
            // ignore
        }
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16782);return null;
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets all fields of the given class and its parents (if any).
     * 
     * @param cls
     *            the {@link Class} to query
     * @return an array of Fields (possibly empty).
     * @throws IllegalArgumentException
     *             if the class is {@code null}
     * @since 3.2
     */
    public static Field[] getAllFields(final Class<?> cls) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16783);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16784);final List<Field> allFieldsList = getAllFieldsList(cls);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16785);return allFieldsList.toArray(new Field[allFieldsList.size()]);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets all fields of the given class and its parents (if any).
     * 
     * @param cls
     *            the {@link Class} to query
     * @return an array of Fields (possibly empty).
     * @throws IllegalArgumentException
     *             if the class is {@code null}
     * @since 3.2
     */
    public static List<Field> getAllFieldsList(final Class<?> cls) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16786);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16787);Validate.isTrue(cls != null, "The class must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16788);final List<Field> allFields = new ArrayList<>();
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16789);Class<?> currentClass = cls;
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16790);while ((((currentClass != null)&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16791)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16792)==0&false))) {{
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16793);final Field[] declaredFields = currentClass.getDeclaredFields();
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16794);for (final Field field : declaredFields) {{
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16795);allFields.add(field);
            }
            }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16796);currentClass = currentClass.getSuperclass();
        }
        }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16797);return allFields;
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets all fields of the given class and its parents (if any) that are annotated with the given annotation.
     * @param cls
     *            the {@link Class} to query
     * @param annotationCls
     *            the {@link Annotation} that must be present on a field to be matched
     * @return an array of Fields (possibly empty).
     * @throws IllegalArgumentException
     *            if the class or annotation are {@code null}
     * @since 3.4
     */
    public static Field[] getFieldsWithAnnotation(final Class<?> cls, final Class<? extends Annotation> annotationCls) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16798);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16799);final List<Field> annotatedFieldsList = getFieldsListWithAnnotation(cls, annotationCls);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16800);return annotatedFieldsList.toArray(new Field[annotatedFieldsList.size()]);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets all fields of the given class and its parents (if any) that are annotated with the given annotation.
     * @param cls
     *            the {@link Class} to query
     * @param annotationCls
     *            the {@link Annotation} that must be present on a field to be matched
     * @return a list of Fields (possibly empty).
     * @throws IllegalArgumentException
     *            if the class or annotation are {@code null}
     * @since 3.4
     */
    public static List<Field> getFieldsListWithAnnotation(final Class<?> cls, final Class<? extends Annotation> annotationCls) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16801);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16802);Validate.isTrue(annotationCls != null, "The annotation class must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16803);final List<Field> allFields = getAllFieldsList(cls);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16804);final List<Field> annotatedFields = new ArrayList<>();
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16805);for (final Field field : allFields) {{
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16806);if ((((field.getAnnotation(annotationCls) != null)&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16807)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16808)==0&false))) {{
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16809);annotatedFields.add(field);
            }
        }}
        }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16810);return annotatedFields;
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Reads an accessible {@code static} {@link Field}.
     * 
     * @param field
     *            to read
     * @return the field value
     * @throws IllegalArgumentException
     *             if the field is {@code null}, or not {@code static}
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static Object readStaticField(final Field field) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16811);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16812);return readStaticField(field, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Reads a static {@link Field}.
     * 
     * @param field
     *            to read
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method.
     * @return the field value
     * @throws IllegalArgumentException
     *             if the field is {@code null} or not {@code static}
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readStaticField(final Field field, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16813);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16814);Validate.isTrue(field != null, "The field must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16815);Validate.isTrue(Modifier.isStatic(field.getModifiers()), "The field '%s' is not static", field.getName());
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16816);return readField(field, (Object) null, forceAccess);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Reads the named {@code public static} {@link Field}. Superclasses will be considered.
     * 
     * @param cls
     *            the {@link Class} to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @return the value of the field
     * @throws IllegalArgumentException
     *             if the class is {@code null}, or the field name is blank or empty, is not {@code static}, or could
     *             not be found
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static Object readStaticField(final Class<?> cls, final String fieldName) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16817);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16818);return readStaticField(cls, fieldName, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Reads the named {@code static} {@link Field}. Superclasses will be considered.
     * 
     * @param cls
     *            the {@link Class} to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class is {@code null}, or the field name is blank or empty, is not {@code static}, or could
     *             not be found
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readStaticField(final Class<?> cls, final String fieldName, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16819);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16820);final Field field = getField(cls, fieldName, forceAccess);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16821);Validate.isTrue(field != null, "Cannot locate field '%s' on %s", fieldName, cls);
        // already forced access above, don't repeat it here:
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16822);return readStaticField(field, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets the value of a {@code static} {@link Field} by name. The field must be {@code public}. Only the specified
     * class will be considered.
     * 
     * @param cls
     *            the {@link Class} to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @return the value of the field
     * @throws IllegalArgumentException
     *             if the class is {@code null}, or the field name is blank or empty, is not {@code static}, or could
     *             not be found
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static Object readDeclaredStaticField(final Class<?> cls, final String fieldName) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16823);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16824);return readDeclaredStaticField(cls, fieldName, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets the value of a {@code static} {@link Field} by name. Only the specified class will be considered.
     * 
     * @param cls
     *            the {@link Class} to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if the class is {@code null}, or the field name is blank or empty, is not {@code static}, or could
     *             not be found
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readDeclaredStaticField(final Class<?> cls, final String fieldName, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16825);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16826);final Field field = getDeclaredField(cls, fieldName, forceAccess);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16827);Validate.isTrue(field != null, "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        // already forced access above, don't repeat it here:
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16828);return readStaticField(field, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Reads an accessible {@link Field}.
     * 
     * @param field
     *            the field to use
     * @param target
     *            the object to call on, may be {@code null} for {@code static} fields
     * @return the field value
     * @throws IllegalArgumentException
     *             if the field is {@code null}
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static Object readField(final Field field, final Object target) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16829);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16830);return readField(field, target, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Reads a {@link Field}.
     * 
     * @param field
     *            the field to use
     * @param target
     *            the object to call on, may be {@code null} for {@code static} fields
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method.
     * @return the field value
     * @throws IllegalArgumentException
     *             if the field is {@code null}
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readField(final Field field, final Object target, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16831);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16832);Validate.isTrue(field != null, "The field must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16833);if ((((forceAccess && !field.isAccessible())&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16834)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16835)==0&false))) {{
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16836);field.setAccessible(true);
        } }else {{
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16837);MemberUtils.setAccessibleWorkaround(field);
        }
        }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16838);return field.get(target);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Reads the named {@code public} {@link Field}. Superclasses will be considered.
     * 
     * @param target
     *            the object to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @return the value of the field
     * @throws IllegalArgumentException
     *             if the class is {@code null}, or the field name is blank or empty or could not be found
     * @throws IllegalAccessException
     *             if the named field is not {@code public}
     */
    public static Object readField(final Object target, final String fieldName) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16839);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16840);return readField(target, fieldName, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Reads the named {@link Field}. Superclasses will be considered.
     * 
     * @param target
     *            the object to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @return the field value
     * @throws IllegalArgumentException
     *             if {@code target} is {@code null}, or the field name is blank or empty or could not be found
     * @throws IllegalAccessException
     *             if the named field is not made accessible
     */
    public static Object readField(final Object target, final String fieldName, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16841);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16842);Validate.isTrue(target != null, "target object must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16843);final Class<?> cls = target.getClass();
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16844);final Field field = getField(cls, fieldName, forceAccess);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16845);Validate.isTrue(field != null, "Cannot locate field %s on %s", fieldName, cls);
        // already forced access above, don't repeat it here:
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16846);return readField(field, target, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Reads the named {@code public} {@link Field}. Only the class of the specified object will be considered.
     * 
     * @param target
     *            the object to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @return the value of the field
     * @throws IllegalArgumentException
     *             if {@code target} is {@code null}, or the field name is blank or empty or could not be found
     * @throws IllegalAccessException
     *             if the named field is not {@code public}
     */
    public static Object readDeclaredField(final Object target, final String fieldName) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16847);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16848);return readDeclaredField(target, fieldName, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Gets a {@link Field} value by name. Only the class of the specified object will be considered.
     * 
     * @param target
     *            the object to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match public fields.
     * @return the Field object
     * @throws IllegalArgumentException
     *             if {@code target} is {@code null}, or the field name is blank or empty or could not be found
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static Object readDeclaredField(final Object target, final String fieldName, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16849);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16850);Validate.isTrue(target != null, "target object must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16851);final Class<?> cls = target.getClass();
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16852);final Field field = getDeclaredField(cls, fieldName, forceAccess);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16853);Validate.isTrue(field != null, "Cannot locate declared field %s.%s", cls, fieldName);
        // already forced access above, don't repeat it here:
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16854);return readField(field, target, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a {@code public static} {@link Field}.
     * 
     * @param field
     *            to write
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if the field is {@code null} or not {@code static}, or {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not {@code public} or is {@code final}
     */
    public static void writeStaticField(final Field field, final Object value) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16855);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16856);writeStaticField(field, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a static {@link Field}.
     * 
     * @param field
     *            to write
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @throws IllegalArgumentException
     *             if the field is {@code null} or not {@code static}, or {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not made accessible or is {@code final}
     */
    public static void writeStaticField(final Field field, final Object value, final boolean forceAccess) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16857);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16858);Validate.isTrue(field != null, "The field must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16859);Validate.isTrue(Modifier.isStatic(field.getModifiers()), "The field %s.%s is not static", field.getDeclaringClass().getName(),
                field.getName());
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16860);writeField(field, (Object) null, value, forceAccess);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a named {@code public static} {@link Field}. Superclasses will be considered.
     * 
     * @param cls
     *            {@link Class} on which the field is to be found
     * @param fieldName
     *            to write
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if {@code cls} is {@code null}, the field name is blank or empty, the field cannot be located or is
     *             not {@code static}, or {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not {@code public} or is {@code final}
     */
    public static void writeStaticField(final Class<?> cls, final String fieldName, final Object value) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16861);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16862);writeStaticField(cls, fieldName, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a named {@code static} {@link Field}. Superclasses will be considered.
     * 
     * @param cls
     *            {@link Class} on which the field is to be found
     * @param fieldName
     *            to write
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @throws IllegalArgumentException
     *             if {@code cls} is {@code null}, the field name is blank or empty, the field cannot be located or is
     *             not {@code static}, or {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not made accessible or is {@code final}
     */
    public static void writeStaticField(final Class<?> cls, final String fieldName, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16863);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16864);final Field field = getField(cls, fieldName, forceAccess);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16865);Validate.isTrue(field != null, "Cannot locate field %s on %s", fieldName, cls);
        // already forced access above, don't repeat it here:
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16866);writeStaticField(field, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a named {@code public static} {@link Field}. Only the specified class will be considered.
     * 
     * @param cls
     *            {@link Class} on which the field is to be found
     * @param fieldName
     *            to write
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if {@code cls} is {@code null}, the field name is blank or empty, the field cannot be located or is
     *             not {@code static}, or {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not {@code public} or is {@code final}
     */
    public static void writeDeclaredStaticField(final Class<?> cls, final String fieldName, final Object value) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16867);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16868);writeDeclaredStaticField(cls, fieldName, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a named {@code static} {@link Field}. Only the specified class will be considered.
     * 
     * @param cls
     *            {@link Class} on which the field is to be found
     * @param fieldName
     *            to write
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the {@code AccessibleObject#setAccessible(boolean)} method.
     *            {@code false} will only match {@code public} fields.
     * @throws IllegalArgumentException
     *             if {@code cls} is {@code null}, the field name is blank or empty, the field cannot be located or is
     *             not {@code static}, or {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not made accessible or is {@code final}
     */
    public static void writeDeclaredStaticField(final Class<?> cls, final String fieldName, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16869);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16870);final Field field = getDeclaredField(cls, fieldName, forceAccess);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16871);Validate.isTrue(field != null, "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        // already forced access above, don't repeat it here:
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16872);writeField(field, (Object) null, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes an accessible {@link Field}.
     * 
     * @param field
     *            to write
     * @param target
     *            the object to call on, may be {@code null} for {@code static} fields
     * @param value
     *            to set
     * @throws IllegalAccessException
     *             if the field or target is {@code null}, the field is not accessible or is {@code final}, or
     *             {@code value} is not assignable
     */
    public static void writeField(final Field field, final Object target, final Object value) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16873);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16874);writeField(field, target, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a {@link Field}.
     * 
     * @param field
     *            to write
     * @param target
     *            the object to call on, may be {@code null} for {@code static} fields
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @throws IllegalArgumentException
     *             if the field is {@code null} or {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not made accessible or is {@code final}
     */
    public static void writeField(final Field field, final Object target, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16875);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16876);Validate.isTrue(field != null, "The field must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16877);if ((((forceAccess && !field.isAccessible())&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16878)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16879)==0&false))) {{
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16880);field.setAccessible(true);
        } }else {{
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16881);MemberUtils.setAccessibleWorkaround(field);
        }
        }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16882);field.set(target, value);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Removes the final modifier from a {@link Field}.
     * 
     * @param field
     *            to remove the final modifier
     * @throws IllegalArgumentException
     *             if the field is {@code null}
     * @since 3.2
     */
    public static void removeFinalModifier(final Field field) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16883);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16884);removeFinalModifier(field, true);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Removes the final modifier from a {@link Field}.
     * 
     * @param field
     *            to remove the final modifier
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @throws IllegalArgumentException
     *             if the field is {@code null}
     * @since 3.3
     */
    public static void removeFinalModifier(final Field field, final boolean forceAccess) {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16885);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16886);Validate.isTrue(field != null, "The field must not be null");

        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16887);try {
            __CLR4_5_2cwwcwwlvha7b2v.R.inc(16888);if ((((Modifier.isFinal(field.getModifiers()))&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16889)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16890)==0&false))) {{
                // Do all JREs implement Field with a private ivar called "modifiers"?
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16891);final Field modifiersField = Field.class.getDeclaredField("modifiers");
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16892);final boolean doForceAccess = forceAccess && !modifiersField.isAccessible();
                __CLR4_5_2cwwcwwlvha7b2v.R.inc(16893);if ((((doForceAccess)&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16894)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16895)==0&false))) {{
                    __CLR4_5_2cwwcwwlvha7b2v.R.inc(16896);modifiersField.setAccessible(true);
                }
                }__CLR4_5_2cwwcwwlvha7b2v.R.inc(16897);try {
                    __CLR4_5_2cwwcwwlvha7b2v.R.inc(16898);modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                } finally {
                    __CLR4_5_2cwwcwwlvha7b2v.R.inc(16899);if ((((doForceAccess)&&(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16900)!=0|true))||(__CLR4_5_2cwwcwwlvha7b2v.R.iget(16901)==0&false))) {{
                        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16902);modifiersField.setAccessible(false);
                    }
                }}
            }
        }} catch (final NoSuchFieldException ignored) {
            // The field class contains always a modifiers field
        } catch (final IllegalAccessException ignored) {
            // The modifiers field is made accessible
        }
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a {@code public} {@link Field}. Superclasses will be considered.
     * 
     * @param target
     *            the object to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if {@code target} is {@code null}, {@code fieldName} is blank or empty or could not be found, or
     *             {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not accessible
     */
    public static void writeField(final Object target, final String fieldName, final Object value) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16903);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16904);writeField(target, fieldName, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a {@link Field}. Superclasses will be considered.
     * 
     * @param target
     *            the object to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @throws IllegalArgumentException
     *             if {@code target} is {@code null}, {@code fieldName} is blank or empty or could not be found, or
     *             {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static void writeField(final Object target, final String fieldName, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16905);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16906);Validate.isTrue(target != null, "target object must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16907);final Class<?> cls = target.getClass();
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16908);final Field field = getField(cls, fieldName, forceAccess);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16909);Validate.isTrue(field != null, "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        // already forced access above, don't repeat it here:
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16910);writeField(field, target, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a {@code public} {@link Field}. Only the specified class will be considered.
     * 
     * @param target
     *            the object to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param value
     *            to set
     * @throws IllegalArgumentException
     *             if {@code target} is {@code null}, {@code fieldName} is blank or empty or could not be found, or
     *             {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static void writeDeclaredField(final Object target, final String fieldName, final Object value) throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16911);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16912);writeDeclaredField(target, fieldName, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}

    /**
     * Writes a {@code public} {@link Field}. Only the specified class will be considered.
     * 
     * @param target
     *            the object to reflect, must not be {@code null}
     * @param fieldName
     *            the field name to obtain
     * @param value
     *            to set
     * @param forceAccess
     *            whether to break scope restrictions using the
     *            {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} method. {@code false} will only
     *            match {@code public} fields.
     * @throws IllegalArgumentException
     *             if {@code target} is {@code null}, {@code fieldName} is blank or empty or could not be found, or
     *             {@code value} is not assignable
     * @throws IllegalAccessException
     *             if the field is not made accessible
     */
    public static void writeDeclaredField(final Object target, final String fieldName, final Object value, final boolean forceAccess)
            throws IllegalAccessException {try{__CLR4_5_2cwwcwwlvha7b2v.R.inc(16913);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16914);Validate.isTrue(target != null, "target object must not be null");
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16915);final Class<?> cls = target.getClass();
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16916);final Field field = getDeclaredField(cls, fieldName, forceAccess);
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16917);Validate.isTrue(field != null, "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        // already forced access above, don't repeat it here:
        __CLR4_5_2cwwcwwlvha7b2v.R.inc(16918);writeField(field, target, value, false);
    }finally{__CLR4_5_2cwwcwwlvha7b2v.R.flushNeeded();}}
}
