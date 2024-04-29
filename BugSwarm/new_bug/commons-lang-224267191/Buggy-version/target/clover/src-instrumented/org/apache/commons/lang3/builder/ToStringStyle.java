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
package org.apache.commons.lang3.builder;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>Controls <code>String</code> formatting for {@link ToStringBuilder}.
 * The main public interface is always via <code>ToStringBuilder</code>.</p>
 *
 * <p>These classes are intended to be used as <code>Singletons</code>.
 * There is no need to instantiate a new style each time. A program
 * will generally use one of the predefined constants on this class.
 * Alternatively, the {@link StandardToStringStyle} class can be used
 * to set the individual settings. Thus most styles can be achieved
 * without subclassing.</p>
 *
 * <p>If required, a subclass can override as many or as few of the
 * methods as it requires. Each object type (from <code>boolean</code>
 * to <code>long</code> to <code>Object</code> to <code>int[]</code>) has
 * its own methods to output it. Most have two versions, detail and summary.
 *
 * <p>For example, the detail version of the array based methods will
 * output the whole array, whereas the summary method will just output
 * the array length.</p>
 *
 * <p>If you want to format the output of certain objects, such as dates, you
 * must create a subclass and override a method.
 * </p>
 * <pre>
 * public class MyStyle extends ToStringStyle {
 *   protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {
 *     if (value instanceof Date) {
 *       value = new SimpleDateFormat("yyyy-MM-dd").format(value);
 *     }
 *     buffer.append(value);
 *   }
 * }
 * </pre>
 *
 * @since 1.0
 */
public abstract class ToStringStyle implements Serializable {public static class __CLR4_5_29y49y4lvha7af2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,13759,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version ID.
     */
    private static final long serialVersionUID = -2587890625525655916L;

    /**
     * The default toString style. Using the <code>Person</code>
     * example from {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * Person@182f0db[name=John Doe,age=33,smoker=false]
     * </pre>
     */
    public static final ToStringStyle DEFAULT_STYLE = new DefaultToStringStyle();

    /**
     * The multi line toString style. Using the <code>Person</code>
     * example from {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * Person@182f0db[
     *   name=John Doe
     *   age=33
     *   smoker=false
     * ]
     * </pre>
     */
    public static final ToStringStyle MULTI_LINE_STYLE = new MultiLineToStringStyle();

    /**
     * The no field names toString style. Using the
     * <code>Person</code> example from {@link ToStringBuilder}, the output
     * would look like this:
     *
     * <pre>
     * Person@182f0db[John Doe,33,false]
     * </pre>
     */
    public static final ToStringStyle NO_FIELD_NAMES_STYLE = new NoFieldNameToStringStyle();

    /**
     * The short prefix toString style. Using the <code>Person</code> example
     * from {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * Person[name=John Doe,age=33,smoker=false]
     * </pre>
     *
     * @since 2.1
     */
    public static final ToStringStyle SHORT_PREFIX_STYLE = new ShortPrefixToStringStyle();

    /**
     * The simple toString style. Using the <code>Person</code>
     * example from {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * John Doe,33,false
     * </pre>
     */
    public static final ToStringStyle SIMPLE_STYLE = new SimpleToStringStyle();

    /**
     * The no class name toString style. Using the <code>Person</code>
     * example from {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * [name=John Doe,age=33,smoker=false]
     * </pre>
     *
     * @since 3.4
     */
    public static final ToStringStyle NO_CLASS_NAME_STYLE = new NoClassNameToStringStyle();

    /**
     * The JSON toString style. Using the <code>Person</code> example from
     * {@link ToStringBuilder}, the output would look like this:
     *
     * <pre>
     * {"name": "John Doe", "age": 33, "smoker": true}
     * </pre>
     *
     * <strong>Note:</strong> Since field names are mandatory in JSON, this
     * ToStringStyle will throw an {@link UnsupportedOperationException} if no
     * field name is passed in while appending. Furthermore This ToStringStyle
     * will only generate valid JSON if referenced objects also produce JSON
     * when calling {@code toString()} on them.
     *
     * @since 3.4
     * @see <a href="http://json.org">json.org</a>
     */
    public static final ToStringStyle JSON_STYLE = new JsonToStringStyle();

    /**
     * <p>
     * A registry of objects used by <code>reflectionToString</code> methods
     * to detect cyclical object references and avoid infinite loops.
     * </p>
     */
    private static final ThreadLocal<WeakHashMap<Object, Object>> REGISTRY =
        new ThreadLocal<>();
    /*
     * Note that objects of this class are generally shared between threads, so
     * an instance variable would not be suitable here.
     * 
     * In normal use the registry should always be left empty, because the caller
     * should call toString() which will clean up.
     * 
     * See LANG-792
     */

    /**
     * <p>
     * Returns the registry of objects being traversed by the <code>reflectionToString</code>
     * methods in the current thread.
     * </p>
     *
     * @return Set the registry of objects being traversed
     */
    static Map<Object, Object> getRegistry() {try{__CLR4_5_29y49y4lvha7af2.R.inc(12892);
        __CLR4_5_29y49y4lvha7af2.R.inc(12893);return REGISTRY.get();
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>
     * Returns <code>true</code> if the registry contains the given object.
     * Used by the reflection methods to avoid infinite loops.
     * </p>
     *
     * @param value
     *                  The object to lookup in the registry.
     * @return boolean <code>true</code> if the registry contains the given
     *             object.
     */
    static boolean isRegistered(final Object value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12894);
        __CLR4_5_29y49y4lvha7af2.R.inc(12895);final Map<Object, Object> m = getRegistry();
        __CLR4_5_29y49y4lvha7af2.R.inc(12896);return m != null && m.containsKey(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>
     * Registers the given object. Used by the reflection methods to avoid
     * infinite loops.
     * </p>
     *
     * @param value
     *                  The object to register.
     */
    static void register(final Object value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12897);
        __CLR4_5_29y49y4lvha7af2.R.inc(12898);if ((((value != null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12899)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12900)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(12901);final Map<Object, Object> m = getRegistry();
            __CLR4_5_29y49y4lvha7af2.R.inc(12902);if ((((m == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12903)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12904)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(12905);REGISTRY.set(new WeakHashMap<>());
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(12906);getRegistry().put(value, null);
        }
    }}finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>
     * Unregisters the given object.
     * </p>
     *
     * <p>
     * Used by the reflection methods to avoid infinite loops.
     * </p>
     *
     * @param value
     *                  The object to unregister.
     */
    static void unregister(final Object value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12907);
        __CLR4_5_29y49y4lvha7af2.R.inc(12908);if ((((value != null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12909)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12910)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(12911);final Map<Object, Object> m = getRegistry();
            __CLR4_5_29y49y4lvha7af2.R.inc(12912);if ((((m != null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12913)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12914)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(12915);m.remove(value);
                __CLR4_5_29y49y4lvha7af2.R.inc(12916);if ((((m.isEmpty())&&(__CLR4_5_29y49y4lvha7af2.R.iget(12917)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12918)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(12919);REGISTRY.remove();
                }
            }}
        }}
    }}finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * Whether to use the field names, the default is <code>true</code>.
     */
    private boolean useFieldNames = true;

    /**
     * Whether to use the class name, the default is <code>true</code>.
     */
    private boolean useClassName = true;

    /**
     * Whether to use short class names, the default is <code>false</code>.
     */
    private boolean useShortClassName = false;

    /**
     * Whether to use the identity hash code, the default is <code>true</code>.
     */
    private boolean useIdentityHashCode = true;

    /**
     * The content start <code>'['</code>.
     */
    private String contentStart = "[";

    /**
     * The content end <code>']'</code>.
     */
    private String contentEnd = "]";

    /**
     * The field name value separator <code>'='</code>.
     */
    private String fieldNameValueSeparator = "=";

    /**
     * Whether the field separator should be added before any other fields.
     */
    private boolean fieldSeparatorAtStart = false;

    /**
     * Whether the field separator should be added after any other fields.
     */
    private boolean fieldSeparatorAtEnd = false;

    /**
     * The field separator <code>','</code>.
     */
    private String fieldSeparator = ",";

    /**
     * The array start <code>'{'</code>.
     */
    private String arrayStart = "{";

    /**
     * The array separator <code>','</code>.
     */
    private String arraySeparator = ",";

    /**
     * The detail for array content.
     */
    private boolean arrayContentDetail = true;

    /**
     * The array end <code>'}'</code>.
     */
    private String arrayEnd = "}";

    /**
     * The value to use when fullDetail is <code>null</code>,
     * the default value is <code>true</code>.
     */
    private boolean defaultFullDetail = true;

    /**
     * The <code>null</code> text <code>'&lt;null&gt;'</code>.
     */
    private String nullText = "<null>";

    /**
     * The summary size text start <code>'&lt;size'</code>.
     */
    private String sizeStartText = "<size=";

    /**
     * The summary size text start <code>'&gt;'</code>.
     */
    private String sizeEndText = ">";

    /**
     * The summary object text start <code>'&lt;'</code>.
     */
    private String summaryObjectStartText = "<";

    /**
     * The summary object text start <code>'&gt;'</code>.
     */
    private String summaryObjectEndText = ">";

    //----------------------------------------------------------------------------

    /**
     * <p>Constructor.</p>
     */
    protected ToStringStyle() {
        super();__CLR4_5_29y49y4lvha7af2.R.inc(12921);try{__CLR4_5_29y49y4lvha7af2.R.inc(12920);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> the superclass toString.</p>
     * <p>NOTE: It assumes that the toString has been created from the same ToStringStyle. </p>
     *
     * <p>A <code>null</code> <code>superToString</code> is ignored.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param superToString  the <code>super.toString()</code>
     * @since 2.0
     */
    public void appendSuper(final StringBuffer buffer, final String superToString) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12922);
        __CLR4_5_29y49y4lvha7af2.R.inc(12923);appendToString(buffer, superToString);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> another toString.</p>
     * <p>NOTE: It assumes that the toString has been created from the same ToStringStyle. </p>
     *
     * <p>A <code>null</code> <code>toString</code> is ignored.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param toString  the additional <code>toString</code>
     * @since 2.0
     */
    public void appendToString(final StringBuffer buffer, final String toString) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12924);
        __CLR4_5_29y49y4lvha7af2.R.inc(12925);if ((((toString != null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12926)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12927)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(12928);final int pos1 = toString.indexOf(contentStart) + contentStart.length();
            __CLR4_5_29y49y4lvha7af2.R.inc(12929);final int pos2 = toString.lastIndexOf(contentEnd);
            __CLR4_5_29y49y4lvha7af2.R.inc(12930);if ((((pos1 != pos2 && pos1 >= 0 && pos2 >= 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12931)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12932)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(12933);final String data = toString.substring(pos1, pos2);
                __CLR4_5_29y49y4lvha7af2.R.inc(12934);if ((((fieldSeparatorAtStart)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12935)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12936)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(12937);removeLastFieldSeparator(buffer);
                }
                }__CLR4_5_29y49y4lvha7af2.R.inc(12938);buffer.append(data);
                __CLR4_5_29y49y4lvha7af2.R.inc(12939);appendFieldSeparator(buffer);
            }
        }}
    }}finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the start of data indicator.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param object  the <code>Object</code> to build a <code>toString</code> for
     */
    public void appendStart(final StringBuffer buffer, final Object object) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12940);
        __CLR4_5_29y49y4lvha7af2.R.inc(12941);if ((((object != null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12942)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12943)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(12944);appendClassName(buffer, object);
            __CLR4_5_29y49y4lvha7af2.R.inc(12945);appendIdentityHashCode(buffer, object);
            __CLR4_5_29y49y4lvha7af2.R.inc(12946);appendContentStart(buffer);
            __CLR4_5_29y49y4lvha7af2.R.inc(12947);if ((((fieldSeparatorAtStart)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12948)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12949)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(12950);appendFieldSeparator(buffer);
            }
        }}
    }}finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the end of data indicator.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param object  the <code>Object</code> to build a
     *  <code>toString</code> for.
     */
    public void appendEnd(final StringBuffer buffer, final Object object) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12951);
        __CLR4_5_29y49y4lvha7af2.R.inc(12952);if ((((this.fieldSeparatorAtEnd == false)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12953)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12954)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(12955);removeLastFieldSeparator(buffer);
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(12956);appendContentEnd(buffer);
        __CLR4_5_29y49y4lvha7af2.R.inc(12957);unregister(object);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Remove the last field separator from the buffer.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @since 2.0
     */
    protected void removeLastFieldSeparator(final StringBuffer buffer) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12958);
        __CLR4_5_29y49y4lvha7af2.R.inc(12959);final int len = buffer.length();
        __CLR4_5_29y49y4lvha7af2.R.inc(12960);final int sepLen = fieldSeparator.length();
        __CLR4_5_29y49y4lvha7af2.R.inc(12961);if ((((len > 0 && sepLen > 0 && len >= sepLen)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12962)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12963)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(12964);boolean match = true;
            __CLR4_5_29y49y4lvha7af2.R.inc(12965);for (int i = 0; (((i < sepLen)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12966)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12967)==0&false)); i++) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(12968);if ((((buffer.charAt(len - 1 - i) != fieldSeparator.charAt(sepLen - 1 - i))&&(__CLR4_5_29y49y4lvha7af2.R.iget(12969)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12970)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(12971);match = false;
                    __CLR4_5_29y49y4lvha7af2.R.inc(12972);break;
                }
            }}
            }__CLR4_5_29y49y4lvha7af2.R.inc(12973);if ((((match)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12974)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12975)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(12976);buffer.setLength(len - sepLen);
            }
        }}
    }}finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value, printing the full <code>toString</code> of the
     * <code>Object</code> passed in.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final Object value, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12977);
        __CLR4_5_29y49y4lvha7af2.R.inc(12978);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(12979);if ((((value == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12980)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12981)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(12982);appendNullText(buffer, fieldName);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(12983);appendInternal(buffer, fieldName, value, isFullDetail(fullDetail));
        }

        }__CLR4_5_29y49y4lvha7af2.R.inc(12984);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>,
     * correctly interpreting its type.</p>
     *
     * <p>This method performs the main lookup by Class type to correctly
     * route arrays, <code>Collections</code>, <code>Maps</code> and
     * <code>Objects</code> to the appropriate method.</p>
     *
     * <p>Either detail or summary views can be specified.</p>
     *
     * <p>If a cycle is detected, an object will be appended with the
     * <code>Object.toString()</code> format.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>,
     *  not <code>null</code>
     * @param detail  output detail or not
     */
    protected void appendInternal(final StringBuffer buffer, final String fieldName, final Object value, final boolean detail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(12985);
        __CLR4_5_29y49y4lvha7af2.R.inc(12986);if ((((isRegistered(value)
            && !(value instanceof Number || value instanceof Boolean || value instanceof Character))&&(__CLR4_5_29y49y4lvha7af2.R.iget(12987)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12988)==0&false))) {{
           __CLR4_5_29y49y4lvha7af2.R.inc(12989);appendCyclicObject(buffer, fieldName, value);
           __CLR4_5_29y49y4lvha7af2.R.inc(12990);return;
        }

        }__CLR4_5_29y49y4lvha7af2.R.inc(12991);register(value);

        __CLR4_5_29y49y4lvha7af2.R.inc(12992);try {
            __CLR4_5_29y49y4lvha7af2.R.inc(12993);if ((((value instanceof Collection<?>)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12994)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12995)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(12996);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(12997)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(12998)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(12999);appendDetail(buffer, fieldName, (Collection<?>) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13000);appendSummarySize(buffer, fieldName, ((Collection<?>) value).size());
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13001);if ((((value instanceof Map<?, ?>)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13002)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13003)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13004);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13005)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13006)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13007);appendDetail(buffer, fieldName, (Map<?, ?>) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13008);appendSummarySize(buffer, fieldName, ((Map<?, ?>) value).size());
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13009);if ((((value instanceof long[])&&(__CLR4_5_29y49y4lvha7af2.R.iget(13010)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13011)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13012);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13013)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13014)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13015);appendDetail(buffer, fieldName, (long[]) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13016);appendSummary(buffer, fieldName, (long[]) value);
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13017);if ((((value instanceof int[])&&(__CLR4_5_29y49y4lvha7af2.R.iget(13018)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13019)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13020);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13021)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13022)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13023);appendDetail(buffer, fieldName, (int[]) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13024);appendSummary(buffer, fieldName, (int[]) value);
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13025);if ((((value instanceof short[])&&(__CLR4_5_29y49y4lvha7af2.R.iget(13026)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13027)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13028);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13029)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13030)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13031);appendDetail(buffer, fieldName, (short[]) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13032);appendSummary(buffer, fieldName, (short[]) value);
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13033);if ((((value instanceof byte[])&&(__CLR4_5_29y49y4lvha7af2.R.iget(13034)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13035)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13036);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13037)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13038)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13039);appendDetail(buffer, fieldName, (byte[]) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13040);appendSummary(buffer, fieldName, (byte[]) value);
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13041);if ((((value instanceof char[])&&(__CLR4_5_29y49y4lvha7af2.R.iget(13042)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13043)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13044);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13045)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13046)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13047);appendDetail(buffer, fieldName, (char[]) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13048);appendSummary(buffer, fieldName, (char[]) value);
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13049);if ((((value instanceof double[])&&(__CLR4_5_29y49y4lvha7af2.R.iget(13050)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13051)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13052);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13053)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13054)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13055);appendDetail(buffer, fieldName, (double[]) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13056);appendSummary(buffer, fieldName, (double[]) value);
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13057);if ((((value instanceof float[])&&(__CLR4_5_29y49y4lvha7af2.R.iget(13058)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13059)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13060);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13061)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13062)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13063);appendDetail(buffer, fieldName, (float[]) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13064);appendSummary(buffer, fieldName, (float[]) value);
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13065);if ((((value instanceof boolean[])&&(__CLR4_5_29y49y4lvha7af2.R.iget(13066)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13067)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13068);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13069)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13070)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13071);appendDetail(buffer, fieldName, (boolean[]) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13072);appendSummary(buffer, fieldName, (boolean[]) value);
                }

            }} }else {__CLR4_5_29y49y4lvha7af2.R.inc(13073);if ((((value.getClass().isArray())&&(__CLR4_5_29y49y4lvha7af2.R.iget(13074)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13075)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13076);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13077)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13078)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13079);appendDetail(buffer, fieldName, (Object[]) value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13080);appendSummary(buffer, fieldName, (Object[]) value);
                }

            }} }else {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13081);if ((((detail)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13082)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13083)==0&false))) {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13084);appendDetail(buffer, fieldName, value);
                } }else {{
                    __CLR4_5_29y49y4lvha7af2.R.inc(13085);appendSummary(buffer, fieldName, value);
                }
            }}
        }}}}}}}}}}}} finally {
            __CLR4_5_29y49y4lvha7af2.R.inc(13086);unregister(value);
        }
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value that has been detected to participate in a cycle. This
     * implementation will print the standard string value of the value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>,
     *  not <code>null</code>
     *
     * @since 2.2
     */
    protected void appendCyclicObject(final StringBuffer buffer, final String fieldName, final Object value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13087);
       __CLR4_5_29y49y4lvha7af2.R.inc(13088);ObjectUtils.identityToString(buffer, value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value, printing the full detail of the <code>Object</code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final Object value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13089);
        __CLR4_5_29y49y4lvha7af2.R.inc(13090);buffer.append(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>Collection</code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param coll  the <code>Collection</code> to add to the
     *  <code>toString</code>, not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final Collection<?> coll) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13091);
        __CLR4_5_29y49y4lvha7af2.R.inc(13092);buffer.append(coll);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>Map</code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param map  the <code>Map</code> to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final Map<?, ?> map) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13093);
        __CLR4_5_29y49y4lvha7af2.R.inc(13094);buffer.append(map);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * value, printing a summary of the <code>Object</code>.</P>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final Object value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13095);
        __CLR4_5_29y49y4lvha7af2.R.inc(13096);buffer.append(summaryObjectStartText);
        __CLR4_5_29y49y4lvha7af2.R.inc(13097);buffer.append(getShortClassName(value.getClass()));
        __CLR4_5_29y49y4lvha7af2.R.inc(13098);buffer.append(summaryObjectEndText);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final long value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13099);
        __CLR4_5_29y49y4lvha7af2.R.inc(13100);appendFieldStart(buffer, fieldName);
        __CLR4_5_29y49y4lvha7af2.R.inc(13101);appendDetail(buffer, fieldName, value);
        __CLR4_5_29y49y4lvha7af2.R.inc(13102);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final long value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13103);
        __CLR4_5_29y49y4lvha7af2.R.inc(13104);buffer.append(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final int value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13105);
        __CLR4_5_29y49y4lvha7af2.R.inc(13106);appendFieldStart(buffer, fieldName);
        __CLR4_5_29y49y4lvha7af2.R.inc(13107);appendDetail(buffer, fieldName, value);
        __CLR4_5_29y49y4lvha7af2.R.inc(13108);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final int value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13109);
        __CLR4_5_29y49y4lvha7af2.R.inc(13110);buffer.append(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final short value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13111);
        __CLR4_5_29y49y4lvha7af2.R.inc(13112);appendFieldStart(buffer, fieldName);
        __CLR4_5_29y49y4lvha7af2.R.inc(13113);appendDetail(buffer, fieldName, value);
        __CLR4_5_29y49y4lvha7af2.R.inc(13114);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final short value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13115);
        __CLR4_5_29y49y4lvha7af2.R.inc(13116);buffer.append(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final byte value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13117);
        __CLR4_5_29y49y4lvha7af2.R.inc(13118);appendFieldStart(buffer, fieldName);
        __CLR4_5_29y49y4lvha7af2.R.inc(13119);appendDetail(buffer, fieldName, value);
        __CLR4_5_29y49y4lvha7af2.R.inc(13120);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final byte value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13121);
        __CLR4_5_29y49y4lvha7af2.R.inc(13122);buffer.append(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final char value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13123);
        __CLR4_5_29y49y4lvha7af2.R.inc(13124);appendFieldStart(buffer, fieldName);
        __CLR4_5_29y49y4lvha7af2.R.inc(13125);appendDetail(buffer, fieldName, value);
        __CLR4_5_29y49y4lvha7af2.R.inc(13126);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final char value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13127);
        __CLR4_5_29y49y4lvha7af2.R.inc(13128);buffer.append(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final double value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13129);
        __CLR4_5_29y49y4lvha7af2.R.inc(13130);appendFieldStart(buffer, fieldName);
        __CLR4_5_29y49y4lvha7af2.R.inc(13131);appendDetail(buffer, fieldName, value);
        __CLR4_5_29y49y4lvha7af2.R.inc(13132);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final double value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13133);
        __CLR4_5_29y49y4lvha7af2.R.inc(13134);buffer.append(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final float value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13135);
        __CLR4_5_29y49y4lvha7af2.R.inc(13136);appendFieldStart(buffer, fieldName);
        __CLR4_5_29y49y4lvha7af2.R.inc(13137);appendDetail(buffer, fieldName, value);
        __CLR4_5_29y49y4lvha7af2.R.inc(13138);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final float value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13139);
        __CLR4_5_29y49y4lvha7af2.R.inc(13140);buffer.append(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param value  the value to add to the <code>toString</code>
     */
    public void append(final StringBuffer buffer, final String fieldName, final boolean value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13141);
        __CLR4_5_29y49y4lvha7af2.R.inc(13142);appendFieldStart(buffer, fieldName);
        __CLR4_5_29y49y4lvha7af2.R.inc(13143);appendDetail(buffer, fieldName, value);
        __CLR4_5_29y49y4lvha7af2.R.inc(13144);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * value.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param value  the value to add to the <code>toString</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final boolean value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13145);
        __CLR4_5_29y49y4lvha7af2.R.inc(13146);buffer.append(value);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an <code>Object</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the toString
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final Object[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13147);
        __CLR4_5_29y49y4lvha7af2.R.inc(13148);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(13149);if ((((array == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13150)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13151)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13152);appendNullText(buffer, fieldName);

        } }else {__CLR4_5_29y49y4lvha7af2.R.inc(13153);if ((((isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13154)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13155)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13156);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13157);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_5_29y49y4lvha7af2.R.inc(13158);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> the detail of an
     * <code>Object</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final Object[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13159);
        __CLR4_5_29y49y4lvha7af2.R.inc(13160);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13161);for (int i = 0; (((i < array.length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13162)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13163)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13164);final Object item = array[i];
            __CLR4_5_29y49y4lvha7af2.R.inc(13165);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13166)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13167)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13168);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13169);if ((((item == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13170)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13171)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13172);appendNullText(buffer, fieldName);

            } }else {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13173);appendInternal(buffer, fieldName, item, arrayContentDetail);
            }
        }}
        }__CLR4_5_29y49y4lvha7af2.R.inc(13174);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of an array type.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     * @since 2.0
     */
    protected void reflectionAppendArrayDetail(final StringBuffer buffer, final String fieldName, final Object array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13175);
        __CLR4_5_29y49y4lvha7af2.R.inc(13176);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13177);final int length = Array.getLength(array);
        __CLR4_5_29y49y4lvha7af2.R.inc(13178);for (int i = 0; (((i < length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13179)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13180)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13181);final Object item = Array.get(array, i);
            __CLR4_5_29y49y4lvha7af2.R.inc(13182);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13183)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13184)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13185);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13186);if ((((item == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13187)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13188)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13189);appendNullText(buffer, fieldName);

            } }else {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13190);appendInternal(buffer, fieldName, item, arrayContentDetail);
            }
        }}
        }__CLR4_5_29y49y4lvha7af2.R.inc(13191);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of an
     * <code>Object</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final Object[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13192);
        __CLR4_5_29y49y4lvha7af2.R.inc(13193);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>long</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final long[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13194);
        __CLR4_5_29y49y4lvha7af2.R.inc(13195);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(13196);if ((((array == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13197)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13198)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13199);appendNullText(buffer, fieldName);

        } }else {__CLR4_5_29y49y4lvha7af2.R.inc(13200);if ((((isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13201)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13202)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13203);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13204);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_5_29y49y4lvha7af2.R.inc(13205);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>long</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final long[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13206);
        __CLR4_5_29y49y4lvha7af2.R.inc(13207);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13208);for (int i = 0; (((i < array.length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13209)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13210)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13211);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13212)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13213)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13214);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13215);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13216);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>long</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final long[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13217);
        __CLR4_5_29y49y4lvha7af2.R.inc(13218);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> an <code>int</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final int[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13219);
        __CLR4_5_29y49y4lvha7af2.R.inc(13220);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(13221);if ((((array == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13222)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13223)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13224);appendNullText(buffer, fieldName);

        } }else {__CLR4_5_29y49y4lvha7af2.R.inc(13225);if ((((isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13226)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13227)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13228);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13229);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_5_29y49y4lvha7af2.R.inc(13230);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of an
     * <code>int</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final int[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13231);
        __CLR4_5_29y49y4lvha7af2.R.inc(13232);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13233);for (int i = 0; (((i < array.length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13234)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13235)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13236);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13237)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13238)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13239);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13240);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13241);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of an
     * <code>int</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final int[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13242);
        __CLR4_5_29y49y4lvha7af2.R.inc(13243);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>short</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final short[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13244);
        __CLR4_5_29y49y4lvha7af2.R.inc(13245);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(13246);if ((((array == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13247)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13248)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13249);appendNullText(buffer, fieldName);

        } }else {__CLR4_5_29y49y4lvha7af2.R.inc(13250);if ((((isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13251)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13252)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13253);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13254);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_5_29y49y4lvha7af2.R.inc(13255);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>short</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final short[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13256);
        __CLR4_5_29y49y4lvha7af2.R.inc(13257);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13258);for (int i = 0; (((i < array.length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13259)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13260)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13261);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13262)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13263)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13264);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13265);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13266);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>short</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final short[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13267);
        __CLR4_5_29y49y4lvha7af2.R.inc(13268);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>byte</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final byte[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13269);
        __CLR4_5_29y49y4lvha7af2.R.inc(13270);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(13271);if ((((array == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13272)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13273)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13274);appendNullText(buffer, fieldName);

        } }else {__CLR4_5_29y49y4lvha7af2.R.inc(13275);if ((((isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13276)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13277)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13278);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13279);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_5_29y49y4lvha7af2.R.inc(13280);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>byte</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final byte[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13281);
        __CLR4_5_29y49y4lvha7af2.R.inc(13282);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13283);for (int i = 0; (((i < array.length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13284)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13285)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13286);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13287)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13288)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13289);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13290);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13291);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>byte</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final byte[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13292);
        __CLR4_5_29y49y4lvha7af2.R.inc(13293);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>char</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the <code>toString</code>
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final char[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13294);
        __CLR4_5_29y49y4lvha7af2.R.inc(13295);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(13296);if ((((array == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13297)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13298)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13299);appendNullText(buffer, fieldName);

        } }else {__CLR4_5_29y49y4lvha7af2.R.inc(13300);if ((((isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13301)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13302)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13303);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13304);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_5_29y49y4lvha7af2.R.inc(13305);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>char</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final char[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13306);
        __CLR4_5_29y49y4lvha7af2.R.inc(13307);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13308);for (int i = 0; (((i < array.length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13309)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13310)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13311);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13312)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13313)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13314);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13315);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13316);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>char</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final char[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13317);
        __CLR4_5_29y49y4lvha7af2.R.inc(13318);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>double</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the toString
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final double[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13319);
        __CLR4_5_29y49y4lvha7af2.R.inc(13320);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(13321);if ((((array == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13322)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13323)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13324);appendNullText(buffer, fieldName);

        } }else {__CLR4_5_29y49y4lvha7af2.R.inc(13325);if ((((isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13326)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13327)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13328);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13329);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_5_29y49y4lvha7af2.R.inc(13330);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>double</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final double[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13331);
        __CLR4_5_29y49y4lvha7af2.R.inc(13332);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13333);for (int i = 0; (((i < array.length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13334)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13335)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13336);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13337)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13338)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13339);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13340);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13341);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>double</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final double[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13342);
        __CLR4_5_29y49y4lvha7af2.R.inc(13343);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>float</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the toString
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final float[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13344);
        __CLR4_5_29y49y4lvha7af2.R.inc(13345);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(13346);if ((((array == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13347)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13348)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13349);appendNullText(buffer, fieldName);

        } }else {__CLR4_5_29y49y4lvha7af2.R.inc(13350);if ((((isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13351)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13352)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13353);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13354);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_5_29y49y4lvha7af2.R.inc(13355);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>float</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final float[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13356);
        __CLR4_5_29y49y4lvha7af2.R.inc(13357);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13358);for (int i = 0; (((i < array.length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13359)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13360)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13361);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13362)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13363)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13364);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13365);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13366);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>float</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final float[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13367);
        __CLR4_5_29y49y4lvha7af2.R.inc(13368);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> a <code>boolean</code>
     * array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     * @param array  the array to add to the toString
     * @param fullDetail  <code>true</code> for detail, <code>false</code>
     *  for summary info, <code>null</code> for style decides
     */
    public void append(final StringBuffer buffer, final String fieldName, final boolean[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13369);
        __CLR4_5_29y49y4lvha7af2.R.inc(13370);appendFieldStart(buffer, fieldName);

        __CLR4_5_29y49y4lvha7af2.R.inc(13371);if ((((array == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13372)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13373)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13374);appendNullText(buffer, fieldName);

        } }else {__CLR4_5_29y49y4lvha7af2.R.inc(13375);if ((((isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13376)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13377)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13378);appendDetail(buffer, fieldName, array);

        } }else {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13379);appendSummary(buffer, fieldName, array);
        }

        }}__CLR4_5_29y49y4lvha7af2.R.inc(13380);appendFieldEnd(buffer, fieldName);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the detail of a
     * <code>boolean</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendDetail(final StringBuffer buffer, final String fieldName, final boolean[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13381);
        __CLR4_5_29y49y4lvha7af2.R.inc(13382);buffer.append(arrayStart);
        __CLR4_5_29y49y4lvha7af2.R.inc(13383);for (int i = 0; (((i < array.length)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13384)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13385)==0&false)); i++) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13386);if ((((i > 0)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13387)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13388)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13389);buffer.append(arraySeparator);
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13390);appendDetail(buffer, fieldName, array[i]);
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13391);buffer.append(arrayEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a summary of a
     * <code>boolean</code> array.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param array  the array to add to the <code>toString</code>,
     *  not <code>null</code>
     */
    protected void appendSummary(final StringBuffer buffer, final String fieldName, final boolean[] array) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13392);
        __CLR4_5_29y49y4lvha7af2.R.inc(13393);appendSummarySize(buffer, fieldName, array.length);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Append to the <code>toString</code> the class name.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param object  the <code>Object</code> whose name to output
     */
    protected void appendClassName(final StringBuffer buffer, final Object object) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13394);
        __CLR4_5_29y49y4lvha7af2.R.inc(13395);if ((((useClassName && object != null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13396)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13397)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13398);register(object);
            __CLR4_5_29y49y4lvha7af2.R.inc(13399);if ((((useShortClassName)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13400)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13401)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13402);buffer.append(getShortClassName(object.getClass()));
            } }else {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13403);buffer.append(object.getClass().getName());
            }
        }}
    }}finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append the {@link System#identityHashCode(java.lang.Object)}.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param object  the <code>Object</code> whose id to output
     */
    protected void appendIdentityHashCode(final StringBuffer buffer, final Object object) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13404);
        __CLR4_5_29y49y4lvha7af2.R.inc(13405);if ((((this.isUseIdentityHashCode() && object!=null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13406)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13407)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13408);register(object);
            __CLR4_5_29y49y4lvha7af2.R.inc(13409);buffer.append('@');
            __CLR4_5_29y49y4lvha7af2.R.inc(13410);buffer.append(Integer.toHexString(System.identityHashCode(object)));
        }
    }}finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the content start.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     */
    protected void appendContentStart(final StringBuffer buffer) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13411);
        __CLR4_5_29y49y4lvha7af2.R.inc(13412);buffer.append(contentStart);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the content end.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     */
    protected void appendContentEnd(final StringBuffer buffer) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13413);
        __CLR4_5_29y49y4lvha7af2.R.inc(13414);buffer.append(contentEnd);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> an indicator for <code>null</code>.</p>
     *
     * <p>The default indicator is <code>'&lt;null&gt;'</code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     */
    protected void appendNullText(final StringBuffer buffer, final String fieldName) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13415);
        __CLR4_5_29y49y4lvha7af2.R.inc(13416);buffer.append(nullText);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the field separator.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     */
    protected void appendFieldSeparator(final StringBuffer buffer) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13417);
        __CLR4_5_29y49y4lvha7af2.R.inc(13418);buffer.append(fieldSeparator);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the field start.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name
     */
    protected void appendFieldStart(final StringBuffer buffer, final String fieldName) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13419);
        __CLR4_5_29y49y4lvha7af2.R.inc(13420);if ((((useFieldNames && fieldName != null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13421)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13422)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13423);buffer.append(fieldName);
            __CLR4_5_29y49y4lvha7af2.R.inc(13424);buffer.append(fieldNameValueSeparator);
        }
    }}finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> the field end.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     */
    protected void appendFieldEnd(final StringBuffer buffer, final String fieldName) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13425);
        __CLR4_5_29y49y4lvha7af2.R.inc(13426);appendFieldSeparator(buffer);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Append to the <code>toString</code> a size summary.</p>
     *
     * <p>The size summary is used to summarize the contents of
     * <code>Collections</code>, <code>Maps</code> and arrays.</p>
     *
     * <p>The output consists of a prefix, the passed in size
     * and a suffix.</p>
     *
     * <p>The default format is <code>'&lt;size=n&gt;'</code>.</p>
     *
     * @param buffer  the <code>StringBuffer</code> to populate
     * @param fieldName  the field name, typically not used as already appended
     * @param size  the size to append
     */
    protected void appendSummarySize(final StringBuffer buffer, final String fieldName, final int size) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13427);
        __CLR4_5_29y49y4lvha7af2.R.inc(13428);buffer.append(sizeStartText);
        __CLR4_5_29y49y4lvha7af2.R.inc(13429);buffer.append(size);
        __CLR4_5_29y49y4lvha7af2.R.inc(13430);buffer.append(sizeEndText);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Is this field to be output in full detail.</p>
     *
     * <p>This method converts a detail request into a detail level.
     * The calling code may request full detail (<code>true</code>),
     * but a subclass might ignore that and always return
     * <code>false</code>. The calling code may pass in
     * <code>null</code> indicating that it doesn't care about
     * the detail level. In this case the default detail level is
     * used.</p>
     *
     * @param fullDetailRequest  the detail level requested
     * @return whether full detail is to be shown
     */
    protected boolean isFullDetail(final Boolean fullDetailRequest) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13431);
        __CLR4_5_29y49y4lvha7af2.R.inc(13432);if ((((fullDetailRequest == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13433)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13434)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13435);return defaultFullDetail;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13436);return fullDetailRequest.booleanValue();
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Gets the short class name for a class.</p>
     *
     * <p>The short class name is the classname excluding
     * the package name.</p>
     *
     * @param cls  the <code>Class</code> to get the short name of
     * @return the short name
     */
    protected String getShortClassName(final Class<?> cls) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13437);
        __CLR4_5_29y49y4lvha7af2.R.inc(13438);return ClassUtils.getShortClassName(cls);
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    // Setters and getters for the customizable parts of the style
    // These methods are not expected to be overridden, except to make public
    // (They are not public so that immutable subclasses can be written)
    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to use the class name.</p>
     *
     * @return the current useClassName flag
     */
    protected boolean isUseClassName() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13439);
        __CLR4_5_29y49y4lvha7af2.R.inc(13440);return useClassName;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets whether to use the class name.</p>
     *
     * @param useClassName  the new useClassName flag
     */
    protected void setUseClassName(final boolean useClassName) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13441);
        __CLR4_5_29y49y4lvha7af2.R.inc(13442);this.useClassName = useClassName;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to output short or long class names.</p>
     *
     * @return the current useShortClassName flag
     * @since 2.0
     */
    protected boolean isUseShortClassName() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13443);
        __CLR4_5_29y49y4lvha7af2.R.inc(13444);return useShortClassName;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets whether to output short or long class names.</p>
     *
     * @param useShortClassName  the new useShortClassName flag
     * @since 2.0
     */
    protected void setUseShortClassName(final boolean useShortClassName) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13445);
        __CLR4_5_29y49y4lvha7af2.R.inc(13446);this.useShortClassName = useShortClassName;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to use the identity hash code.</p>
     *
     * @return the current useIdentityHashCode flag
     */
    protected boolean isUseIdentityHashCode() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13447);
        __CLR4_5_29y49y4lvha7af2.R.inc(13448);return useIdentityHashCode;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets whether to use the identity hash code.</p>
     *
     * @param useIdentityHashCode  the new useIdentityHashCode flag
     */
    protected void setUseIdentityHashCode(final boolean useIdentityHashCode) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13449);
        __CLR4_5_29y49y4lvha7af2.R.inc(13450);this.useIdentityHashCode = useIdentityHashCode;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to use the field names passed in.</p>
     *
     * @return the current useFieldNames flag
     */
    protected boolean isUseFieldNames() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13451);
        __CLR4_5_29y49y4lvha7af2.R.inc(13452);return useFieldNames;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets whether to use the field names passed in.</p>
     *
     * @param useFieldNames  the new useFieldNames flag
     */
    protected void setUseFieldNames(final boolean useFieldNames) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13453);
        __CLR4_5_29y49y4lvha7af2.R.inc(13454);this.useFieldNames = useFieldNames;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to use full detail when the caller doesn't
     * specify.</p>
     *
     * @return the current defaultFullDetail flag
     */
    protected boolean isDefaultFullDetail() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13455);
        __CLR4_5_29y49y4lvha7af2.R.inc(13456);return defaultFullDetail;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets whether to use full detail when the caller doesn't
     * specify.</p>
     *
     * @param defaultFullDetail  the new defaultFullDetail flag
     */
    protected void setDefaultFullDetail(final boolean defaultFullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13457);
        __CLR4_5_29y49y4lvha7af2.R.inc(13458);this.defaultFullDetail = defaultFullDetail;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether to output array content detail.</p>
     *
     * @return the current array content detail setting
     */
    protected boolean isArrayContentDetail() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13459);
        __CLR4_5_29y49y4lvha7af2.R.inc(13460);return arrayContentDetail;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets whether to output array content detail.</p>
     *
     * @param arrayContentDetail  the new arrayContentDetail flag
     */
    protected void setArrayContentDetail(final boolean arrayContentDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13461);
        __CLR4_5_29y49y4lvha7af2.R.inc(13462);this.arrayContentDetail = arrayContentDetail;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the array start text.</p>
     *
     * @return the current array start text
     */
    protected String getArrayStart() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13463);
        __CLR4_5_29y49y4lvha7af2.R.inc(13464);return arrayStart;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the array start text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param arrayStart  the new array start text
     */
    protected void setArrayStart(String arrayStart) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13465);
        __CLR4_5_29y49y4lvha7af2.R.inc(13466);if ((((arrayStart == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13467)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13468)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13469);arrayStart = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13470);this.arrayStart = arrayStart;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the array end text.</p>
     *
     * @return the current array end text
     */
    protected String getArrayEnd() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13471);
        __CLR4_5_29y49y4lvha7af2.R.inc(13472);return arrayEnd;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the array end text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param arrayEnd  the new array end text
     */
    protected void setArrayEnd(String arrayEnd) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13473);
        __CLR4_5_29y49y4lvha7af2.R.inc(13474);if ((((arrayEnd == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13475)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13476)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13477);arrayEnd = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13478);this.arrayEnd = arrayEnd;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the array separator text.</p>
     *
     * @return the current array separator text
     */
    protected String getArraySeparator() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13479);
        __CLR4_5_29y49y4lvha7af2.R.inc(13480);return arraySeparator;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the array separator text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param arraySeparator  the new array separator text
     */
    protected void setArraySeparator(String arraySeparator) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13481);
        __CLR4_5_29y49y4lvha7af2.R.inc(13482);if ((((arraySeparator == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13483)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13484)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13485);arraySeparator = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13486);this.arraySeparator = arraySeparator;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the content start text.</p>
     *
     * @return the current content start text
     */
    protected String getContentStart() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13487);
        __CLR4_5_29y49y4lvha7af2.R.inc(13488);return contentStart;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the content start text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param contentStart  the new content start text
     */
    protected void setContentStart(String contentStart) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13489);
        __CLR4_5_29y49y4lvha7af2.R.inc(13490);if ((((contentStart == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13491)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13492)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13493);contentStart = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13494);this.contentStart = contentStart;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the content end text.</p>
     *
     * @return the current content end text
     */
    protected String getContentEnd() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13495);
        __CLR4_5_29y49y4lvha7af2.R.inc(13496);return contentEnd;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the content end text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param contentEnd  the new content end text
     */
    protected void setContentEnd(String contentEnd) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13497);
        __CLR4_5_29y49y4lvha7af2.R.inc(13498);if ((((contentEnd == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13499)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13500)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13501);contentEnd = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13502);this.contentEnd = contentEnd;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the field name value separator text.</p>
     *
     * @return the current field name value separator text
     */
    protected String getFieldNameValueSeparator() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13503);
        __CLR4_5_29y49y4lvha7af2.R.inc(13504);return fieldNameValueSeparator;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the field name value separator text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param fieldNameValueSeparator  the new field name value separator text
     */
    protected void setFieldNameValueSeparator(String fieldNameValueSeparator) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13505);
        __CLR4_5_29y49y4lvha7af2.R.inc(13506);if ((((fieldNameValueSeparator == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13507)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13508)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13509);fieldNameValueSeparator = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13510);this.fieldNameValueSeparator = fieldNameValueSeparator;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the field separator text.</p>
     *
     * @return the current field separator text
     */
    protected String getFieldSeparator() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13511);
        __CLR4_5_29y49y4lvha7af2.R.inc(13512);return fieldSeparator;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the field separator text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param fieldSeparator  the new field separator text
     */
    protected void setFieldSeparator(String fieldSeparator) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13513);
        __CLR4_5_29y49y4lvha7af2.R.inc(13514);if ((((fieldSeparator == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13515)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13516)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13517);fieldSeparator = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13518);this.fieldSeparator = fieldSeparator;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether the field separator should be added at the start
     * of each buffer.</p>
     *
     * @return the fieldSeparatorAtStart flag
     * @since 2.0
     */
    protected boolean isFieldSeparatorAtStart() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13519);
        __CLR4_5_29y49y4lvha7af2.R.inc(13520);return fieldSeparatorAtStart;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets whether the field separator should be added at the start
     * of each buffer.</p>
     *
     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag
     * @since 2.0
     */
    protected void setFieldSeparatorAtStart(final boolean fieldSeparatorAtStart) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13521);
        __CLR4_5_29y49y4lvha7af2.R.inc(13522);this.fieldSeparatorAtStart = fieldSeparatorAtStart;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets whether the field separator should be added at the end
     * of each buffer.</p>
     *
     * @return fieldSeparatorAtEnd flag
     * @since 2.0
     */
    protected boolean isFieldSeparatorAtEnd() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13523);
        __CLR4_5_29y49y4lvha7af2.R.inc(13524);return fieldSeparatorAtEnd;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets whether the field separator should be added at the end
     * of each buffer.</p>
     *
     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag
     * @since 2.0
     */
    protected void setFieldSeparatorAtEnd(final boolean fieldSeparatorAtEnd) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13525);
        __CLR4_5_29y49y4lvha7af2.R.inc(13526);this.fieldSeparatorAtEnd = fieldSeparatorAtEnd;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the text to output when <code>null</code> found.</p>
     *
     * @return the current text to output when null found
     */
    protected String getNullText() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13527);
        __CLR4_5_29y49y4lvha7af2.R.inc(13528);return nullText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the text to output when <code>null</code> found.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param nullText  the new text to output when null found
     */
    protected void setNullText(String nullText) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13529);
        __CLR4_5_29y49y4lvha7af2.R.inc(13530);if ((((nullText == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13531)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13532)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13533);nullText = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13534);this.nullText = nullText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the start text to output when a <code>Collection</code>,
     * <code>Map</code> or array size is output.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * @return the current start of size text
     */
    protected String getSizeStartText() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13535);
        __CLR4_5_29y49y4lvha7af2.R.inc(13536);return sizeStartText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the start text to output when a <code>Collection</code>,
     * <code>Map</code> or array size is output.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param sizeStartText  the new start of size text
     */
    protected void setSizeStartText(String sizeStartText) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13537);
        __CLR4_5_29y49y4lvha7af2.R.inc(13538);if ((((sizeStartText == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13539)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13540)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13541);sizeStartText = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13542);this.sizeStartText = sizeStartText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the end text to output when a <code>Collection</code>,
     * <code>Map</code> or array size is output.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * @return the current end of size text
     */
    protected String getSizeEndText() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13543);
        __CLR4_5_29y49y4lvha7af2.R.inc(13544);return sizeEndText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the end text to output when a <code>Collection</code>,
     * <code>Map</code> or array size is output.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param sizeEndText  the new end of size text
     */
    protected void setSizeEndText(String sizeEndText) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13545);
        __CLR4_5_29y49y4lvha7af2.R.inc(13546);if ((((sizeEndText == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13547)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13548)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13549);sizeEndText = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13550);this.sizeEndText = sizeEndText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the start text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * @return the current start of summary text
     */
    protected String getSummaryObjectStartText() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13551);
        __CLR4_5_29y49y4lvha7af2.R.inc(13552);return summaryObjectStartText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the start text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param summaryObjectStartText  the new start of summary text
     */
    protected void setSummaryObjectStartText(String summaryObjectStartText) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13553);
        __CLR4_5_29y49y4lvha7af2.R.inc(13554);if ((((summaryObjectStartText == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13555)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13556)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13557);summaryObjectStartText = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13558);this.summaryObjectStartText = summaryObjectStartText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * <p>Gets the end text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * @return the current end of summary text
     */
    protected String getSummaryObjectEndText() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13559);
        __CLR4_5_29y49y4lvha7af2.R.inc(13560);return summaryObjectEndText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    /**
     * <p>Sets the end text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param summaryObjectEndText  the new end of summary text
     */
    protected void setSummaryObjectEndText(String summaryObjectEndText) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13561);
        __CLR4_5_29y49y4lvha7af2.R.inc(13562);if ((((summaryObjectEndText == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13563)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13564)==0&false))) {{
            __CLR4_5_29y49y4lvha7af2.R.inc(13565);summaryObjectEndText = StringUtils.EMPTY;
        }
        }__CLR4_5_29y49y4lvha7af2.R.inc(13566);this.summaryObjectEndText = summaryObjectEndText;
    }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    //----------------------------------------------------------------------------

    /**
     * <p>Default <code>ToStringStyle</code>.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.</p>
     */
    private static final class DefaultToStringStyle extends ToStringStyle {

        /**
         * Required for serialization support.
         *
         * @see java.io.Serializable
         */
        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        DefaultToStringStyle() {
            super();__CLR4_5_29y49y4lvha7af2.R.inc(13568);try{__CLR4_5_29y49y4lvha7af2.R.inc(13567);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</code> after serialization.</p>
         *
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13569);
            __CLR4_5_29y49y4lvha7af2.R.inc(13570);return ToStringStyle.DEFAULT_STYLE;
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    }

    //----------------------------------------------------------------------------

    /**
     * <p><code>ToStringStyle</code> that does not print out
     * the field names.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.
     */
    private static final class NoFieldNameToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        NoFieldNameToStringStyle() {
            super();__CLR4_5_29y49y4lvha7af2.R.inc(13572);try{__CLR4_5_29y49y4lvha7af2.R.inc(13571);
            __CLR4_5_29y49y4lvha7af2.R.inc(13573);this.setUseFieldNames(false);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</code> after serialization.</p>
         *
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13574);
            __CLR4_5_29y49y4lvha7af2.R.inc(13575);return ToStringStyle.NO_FIELD_NAMES_STYLE;
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    }

    //----------------------------------------------------------------------------

    /**
     * <p><code>ToStringStyle</code> that prints out the short
     * class name and no identity hashcode.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.</p>
     */
    private static final class ShortPrefixToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        ShortPrefixToStringStyle() {
            super();__CLR4_5_29y49y4lvha7af2.R.inc(13577);try{__CLR4_5_29y49y4lvha7af2.R.inc(13576);
            __CLR4_5_29y49y4lvha7af2.R.inc(13578);this.setUseShortClassName(true);
            __CLR4_5_29y49y4lvha7af2.R.inc(13579);this.setUseIdentityHashCode(false);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</ode> after serialization.</p>
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13580);
            __CLR4_5_29y49y4lvha7af2.R.inc(13581);return ToStringStyle.SHORT_PREFIX_STYLE;
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    }

    //----------------------------------------------------------------------------

    /**
     * <p><code>ToStringStyle</code> that does not print out the
     * classname, identity hashcode, content start or field name.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.</p>
     */
    private static final class SimpleToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        SimpleToStringStyle() {
            super();__CLR4_5_29y49y4lvha7af2.R.inc(13583);try{__CLR4_5_29y49y4lvha7af2.R.inc(13582);
            __CLR4_5_29y49y4lvha7af2.R.inc(13584);this.setUseClassName(false);
            __CLR4_5_29y49y4lvha7af2.R.inc(13585);this.setUseIdentityHashCode(false);
            __CLR4_5_29y49y4lvha7af2.R.inc(13586);this.setUseFieldNames(false);
            __CLR4_5_29y49y4lvha7af2.R.inc(13587);this.setContentStart(StringUtils.EMPTY);
            __CLR4_5_29y49y4lvha7af2.R.inc(13588);this.setContentEnd(StringUtils.EMPTY);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</ode> after serialization.</p>
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13589);
            __CLR4_5_29y49y4lvha7af2.R.inc(13590);return ToStringStyle.SIMPLE_STYLE;
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    }

    //----------------------------------------------------------------------------

    /**
     * <p><code>ToStringStyle</code> that outputs on multiple lines.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.</p>
     */
    private static final class MultiLineToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        MultiLineToStringStyle() {
            super();__CLR4_5_29y49y4lvha7af2.R.inc(13592);try{__CLR4_5_29y49y4lvha7af2.R.inc(13591);
            __CLR4_5_29y49y4lvha7af2.R.inc(13593);this.setContentStart("[");
            __CLR4_5_29y49y4lvha7af2.R.inc(13594);this.setFieldSeparator(System.lineSeparator() + "  ");
            __CLR4_5_29y49y4lvha7af2.R.inc(13595);this.setFieldSeparatorAtStart(true);
            __CLR4_5_29y49y4lvha7af2.R.inc(13596);this.setContentEnd(System.lineSeparator() + "]");
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</code> after serialization.</p>
         *
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13597);
            __CLR4_5_29y49y4lvha7af2.R.inc(13598);return ToStringStyle.MULTI_LINE_STYLE;
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    }

    //----------------------------------------------------------------------------

    /**
     * <p><code>ToStringStyle</code> that does not print out the classname
     * and identity hash code but prints content start and field names.</p>
     *
     * <p>This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.</p>
     */
    private static final class NoClassNameToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        NoClassNameToStringStyle() {
            super();__CLR4_5_29y49y4lvha7af2.R.inc(13600);try{__CLR4_5_29y49y4lvha7af2.R.inc(13599);
            __CLR4_5_29y49y4lvha7af2.R.inc(13601);this.setUseClassName(false);
            __CLR4_5_29y49y4lvha7af2.R.inc(13602);this.setUseIdentityHashCode(false);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        /**
         * <p>Ensure <code>Singleton</code> after serialization.</p>
         *
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13603);
            __CLR4_5_29y49y4lvha7af2.R.inc(13604);return ToStringStyle.NO_CLASS_NAME_STYLE;
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    }

    // ----------------------------------------------------------------------------

    /**
     * <p>
     * <code>ToStringStyle</code> that outputs with JSON format.
     * </p>
     *
     * <p>
     * This is an inner class rather than using
     * <code>StandardToStringStyle</code> to ensure its immutability.
     * </p>
     *
     * @since 3.4
     * @see <a href="http://json.org">json.org</a>
     */
    private static final class JsonToStringStyle extends ToStringStyle {

        private static final long serialVersionUID = 1L;

        private static final String FIELD_NAME_QUOTE = "\"";

        /**
         * <p>
         * Constructor.
         * </p>
         *
         * <p>
         * Use the static constant rather than instantiating.
         * </p>
         */
        JsonToStringStyle() {
            super();__CLR4_5_29y49y4lvha7af2.R.inc(13606);try{__CLR4_5_29y49y4lvha7af2.R.inc(13605);

            __CLR4_5_29y49y4lvha7af2.R.inc(13607);this.setUseClassName(false);
            __CLR4_5_29y49y4lvha7af2.R.inc(13608);this.setUseIdentityHashCode(false);

            __CLR4_5_29y49y4lvha7af2.R.inc(13609);this.setContentStart("{");
            __CLR4_5_29y49y4lvha7af2.R.inc(13610);this.setContentEnd("}");

            __CLR4_5_29y49y4lvha7af2.R.inc(13611);this.setArrayStart("[");
            __CLR4_5_29y49y4lvha7af2.R.inc(13612);this.setArrayEnd("]");

            __CLR4_5_29y49y4lvha7af2.R.inc(13613);this.setFieldSeparator(",");
            __CLR4_5_29y49y4lvha7af2.R.inc(13614);this.setFieldNameValueSeparator(":");

            __CLR4_5_29y49y4lvha7af2.R.inc(13615);this.setNullText("null");

            __CLR4_5_29y49y4lvha7af2.R.inc(13616);this.setSummaryObjectStartText("\"<");
            __CLR4_5_29y49y4lvha7af2.R.inc(13617);this.setSummaryObjectEndText(">\"");

            __CLR4_5_29y49y4lvha7af2.R.inc(13618);this.setSizeStartText("\"<size=");
            __CLR4_5_29y49y4lvha7af2.R.inc(13619);this.setSizeEndText(">\"");
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName,
                           final Object[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13620);

            __CLR4_5_29y49y4lvha7af2.R.inc(13621);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13622)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13623)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13624);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13625);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13626)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13627)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13628);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13629);super.append(buffer, fieldName, array, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName, final long[] array,
                           final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13630);

            __CLR4_5_29y49y4lvha7af2.R.inc(13631);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13632)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13633)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13634);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13635);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13636)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13637)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13638);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13639);super.append(buffer, fieldName, array, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName, final int[] array,
                           final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13640);

            __CLR4_5_29y49y4lvha7af2.R.inc(13641);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13642)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13643)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13644);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13645);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13646)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13647)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13648);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13649);super.append(buffer, fieldName, array, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName,
                           final short[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13650);

            __CLR4_5_29y49y4lvha7af2.R.inc(13651);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13652)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13653)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13654);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13655);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13656)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13657)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13658);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13659);super.append(buffer, fieldName, array, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName, final byte[] array,
                           final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13660);

            __CLR4_5_29y49y4lvha7af2.R.inc(13661);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13662)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13663)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13664);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13665);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13666)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13667)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13668);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13669);super.append(buffer, fieldName, array, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName, final char[] array,
                           final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13670);

            __CLR4_5_29y49y4lvha7af2.R.inc(13671);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13672)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13673)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13674);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13675);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13676)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13677)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13678);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13679);super.append(buffer, fieldName, array, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName,
                           final double[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13680);

            __CLR4_5_29y49y4lvha7af2.R.inc(13681);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13682)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13683)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13684);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13685);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13686)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13687)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13688);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13689);super.append(buffer, fieldName, array, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName,
                           final float[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13690);

            __CLR4_5_29y49y4lvha7af2.R.inc(13691);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13692)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13693)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13694);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13695);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13696)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13697)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13698);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13699);super.append(buffer, fieldName, array, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName,
                           final boolean[] array, final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13700);

            __CLR4_5_29y49y4lvha7af2.R.inc(13701);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13702)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13703)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13704);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13705);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13706)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13707)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13708);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13709);super.append(buffer, fieldName, array, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        public void append(final StringBuffer buffer, final String fieldName, final Object value,
                           final Boolean fullDetail) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13710);

            __CLR4_5_29y49y4lvha7af2.R.inc(13711);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13712)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13713)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13714);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }
            }__CLR4_5_29y49y4lvha7af2.R.inc(13715);if ((((!isFullDetail(fullDetail))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13716)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13717)==0&false))){{
                __CLR4_5_29y49y4lvha7af2.R.inc(13718);throw new UnsupportedOperationException(
                        "FullDetail must be true when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13719);super.append(buffer, fieldName, value, fullDetail);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        protected void appendDetail(final StringBuffer buffer, final String fieldName, final char value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13720);
            __CLR4_5_29y49y4lvha7af2.R.inc(13721);appendValueAsString(buffer, String.valueOf(value));
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        protected void appendDetail(final StringBuffer buffer, final String fieldName, final Object value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13722);

            __CLR4_5_29y49y4lvha7af2.R.inc(13723);if ((((value == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13724)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13725)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13726);appendNullText(buffer, fieldName);
                __CLR4_5_29y49y4lvha7af2.R.inc(13727);return;
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13728);if ((((value instanceof String || value instanceof Character)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13729)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13730)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13731);appendValueAsString(buffer, value.toString());
                __CLR4_5_29y49y4lvha7af2.R.inc(13732);return;
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13733);if ((((value instanceof Number || value instanceof Boolean)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13734)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13735)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13736);buffer.append(value);
                __CLR4_5_29y49y4lvha7af2.R.inc(13737);return;
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13738);final String valueAsString = value.toString();
            __CLR4_5_29y49y4lvha7af2.R.inc(13739);if ((((isJsonObject(valueAsString) || isJsonArray(valueAsString))&&(__CLR4_5_29y49y4lvha7af2.R.iget(13740)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13741)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13742);buffer.append(value);
                __CLR4_5_29y49y4lvha7af2.R.inc(13743);return;
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13744);appendDetail(buffer, fieldName, valueAsString);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        private boolean isJsonArray(final String valueAsString) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13745);
            __CLR4_5_29y49y4lvha7af2.R.inc(13746);return valueAsString.startsWith(getArrayStart())
                    && valueAsString.startsWith(getArrayEnd());
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        private boolean isJsonObject(final String valueAsString) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13747);
            __CLR4_5_29y49y4lvha7af2.R.inc(13748);return valueAsString.startsWith(getContentStart())
                    && valueAsString.endsWith(getContentEnd());
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        /**
         * Appends the given String in parenthesis to the given StringBuffer.
         * 
         * @param buffer the StringBuffer to append the value to.
         * @param value the value to append.
         */
        private void appendValueAsString(final StringBuffer buffer, final String value) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13749);
            __CLR4_5_29y49y4lvha7af2.R.inc(13750);buffer.append("\"" + value + "\"");
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        @Override
        protected void appendFieldStart(final StringBuffer buffer, final String fieldName) {try{__CLR4_5_29y49y4lvha7af2.R.inc(13751);

            __CLR4_5_29y49y4lvha7af2.R.inc(13752);if ((((fieldName == null)&&(__CLR4_5_29y49y4lvha7af2.R.iget(13753)!=0|true))||(__CLR4_5_29y49y4lvha7af2.R.iget(13754)==0&false))) {{
                __CLR4_5_29y49y4lvha7af2.R.inc(13755);throw new UnsupportedOperationException(
                        "Field names are mandatory when using JsonToStringStyle");
            }

            }__CLR4_5_29y49y4lvha7af2.R.inc(13756);super.appendFieldStart(buffer, FIELD_NAME_QUOTE + fieldName
                    + FIELD_NAME_QUOTE);
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

        /**
         * <p>
         * Ensure <code>Singleton</code> after serialization.
         * </p>
         *
         * @return the singleton
         */
        private Object readResolve() {try{__CLR4_5_29y49y4lvha7af2.R.inc(13757);
            __CLR4_5_29y49y4lvha7af2.R.inc(13758);return ToStringStyle.JSON_STYLE;
        }finally{__CLR4_5_29y49y4lvha7af2.R.flushNeeded();}}

    }
}
