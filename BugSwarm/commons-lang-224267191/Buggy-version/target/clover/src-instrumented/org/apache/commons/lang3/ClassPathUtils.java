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

/**
 * Operations regarding the classpath.
 *
 * <p>The methods of this class do not allow {@code null} inputs.</p>
 *
 * @since 3.3
 */
//@Immutable
public class ClassPathUtils {public static class __CLR4_5_23ow3owlvha78ps{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,4802,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>{@code ClassPathUtils} instances should NOT be constructed in
     * standard programming. Instead, the class should be used as
     * {@code ClassPathUtils.toFullyQualifiedName(MyClass.class, "MyClass.properties");}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public ClassPathUtils() {
        super();__CLR4_5_23ow3owlvha78ps.R.inc(4785);try{__CLR4_5_23ow3owlvha78ps.R.inc(4784);
    }finally{__CLR4_5_23ow3owlvha78ps.R.flushNeeded();}}

    /**
     * Returns the fully qualified name for the resource with name {@code resourceName} relative to the given context.
     *
     * <p>Note that this method does not check whether the resource actually exists.
     * It only constructs the name.
     * Null inputs are not allowed.</p>
     *
     * <pre>
     * ClassPathUtils.toFullyQualifiedName(StringUtils.class, "StringUtils.properties") = "org.apache.commons.lang3.StringUtils.properties"
     * </pre>
     *
     * @param context The context for constructing the name.
     * @param resourceName the resource name to construct the fully qualified name for.
     * @return the fully qualified name of the resource with name {@code resourceName}.
     * @throws java.lang.NullPointerException if either {@code context} or {@code resourceName} is null.
     */
    public static String toFullyQualifiedName(final Class<?> context, final String resourceName) {try{__CLR4_5_23ow3owlvha78ps.R.inc(4786);
        __CLR4_5_23ow3owlvha78ps.R.inc(4787);Validate.notNull(context, "Parameter '%s' must not be null!", "context" );
        __CLR4_5_23ow3owlvha78ps.R.inc(4788);Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        __CLR4_5_23ow3owlvha78ps.R.inc(4789);return toFullyQualifiedName(context.getPackage(), resourceName);
    }finally{__CLR4_5_23ow3owlvha78ps.R.flushNeeded();}}

    /**
     * Returns the fully qualified name for the resource with name {@code resourceName} relative to the given context.
     *
     * <p>Note that this method does not check whether the resource actually exists.
     * It only constructs the name.
     * Null inputs are not allowed.</p>
     *
     * <pre>
     * ClassPathUtils.toFullyQualifiedName(StringUtils.class.getPackage(), "StringUtils.properties") = "org.apache.commons.lang3.StringUtils.properties"
     * </pre>
     *
     * @param context The context for constructing the name.
     * @param resourceName the resource name to construct the fully qualified name for.
     * @return the fully qualified name of the resource with name {@code resourceName}.
     * @throws java.lang.NullPointerException if either {@code context} or {@code resourceName} is null.
     */
    public static String toFullyQualifiedName(final Package context, final String resourceName) {try{__CLR4_5_23ow3owlvha78ps.R.inc(4790);
        __CLR4_5_23ow3owlvha78ps.R.inc(4791);Validate.notNull(context, "Parameter '%s' must not be null!", "context" );
        __CLR4_5_23ow3owlvha78ps.R.inc(4792);Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        __CLR4_5_23ow3owlvha78ps.R.inc(4793);return context.getName() + "." + resourceName;
    }finally{__CLR4_5_23ow3owlvha78ps.R.flushNeeded();}}

    /**
     * Returns the fully qualified path for the resource with name {@code resourceName} relative to the given context.
     *
     * <p>Note that this method does not check whether the resource actually exists.
     * It only constructs the path.
     * Null inputs are not allowed.</p>
     *
     * <pre>
     * ClassPathUtils.toFullyQualifiedPath(StringUtils.class, "StringUtils.properties") = "org/apache/commons/lang3/StringUtils.properties"
     * </pre>
     *
     * @param context The context for constructing the path.
     * @param resourceName the resource name to construct the fully qualified path for.
     * @return the fully qualified path of the resource with name {@code resourceName}.
     * @throws java.lang.NullPointerException if either {@code context} or {@code resourceName} is null.
     */
    public static String toFullyQualifiedPath(final Class<?> context, final String resourceName) {try{__CLR4_5_23ow3owlvha78ps.R.inc(4794);
        __CLR4_5_23ow3owlvha78ps.R.inc(4795);Validate.notNull(context, "Parameter '%s' must not be null!", "context" );
        __CLR4_5_23ow3owlvha78ps.R.inc(4796);Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        __CLR4_5_23ow3owlvha78ps.R.inc(4797);return toFullyQualifiedPath(context.getPackage(), resourceName);
    }finally{__CLR4_5_23ow3owlvha78ps.R.flushNeeded();}}


    /**
     * Returns the fully qualified path for the resource with name {@code resourceName} relative to the given context.
     *
     * <p>Note that this method does not check whether the resource actually exists.
     * It only constructs the path.
     * Null inputs are not allowed.</p>
     *
     * <pre>
     * ClassPathUtils.toFullyQualifiedPath(StringUtils.class.getPackage(), "StringUtils.properties") = "org/apache/commons/lang3/StringUtils.properties"
     * </pre>
     *
     * @param context The context for constructing the path.
     * @param resourceName the resource name to construct the fully qualified path for.
     * @return the fully qualified path of the resource with name {@code resourceName}.
     * @throws java.lang.NullPointerException if either {@code context} or {@code resourceName} is null.
     */
    public static String toFullyQualifiedPath(final Package context, final String resourceName) {try{__CLR4_5_23ow3owlvha78ps.R.inc(4798);
        __CLR4_5_23ow3owlvha78ps.R.inc(4799);Validate.notNull(context, "Parameter '%s' must not be null!", "context" );
        __CLR4_5_23ow3owlvha78ps.R.inc(4800);Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        __CLR4_5_23ow3owlvha78ps.R.inc(4801);return context.getName().replace('.', '/') + "/" + resourceName;
    }finally{__CLR4_5_23ow3owlvha78ps.R.flushNeeded();}}

}
