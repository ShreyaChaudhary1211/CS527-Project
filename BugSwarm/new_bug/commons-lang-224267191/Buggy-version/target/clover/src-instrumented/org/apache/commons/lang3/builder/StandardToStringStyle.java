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

/**
 * <p>Works with {@link ToStringBuilder} to create a <code>toString</code>.</p>
 *
 * <p>This class is intended to be used as a singleton.
 * There is no need to instantiate a new style each time.
 * Simply instantiate the class once, customize the values as required, and
 * store the result in a public static final variable for the rest of the
 * program to access.</p>
 *
 * @since 1.0
 */
public class StandardToStringStyle extends ToStringStyle {public static class __CLR4_5_29qc9qclvha7acf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,12694,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>Constructor.</p>
     */
    public StandardToStringStyle() {
        super();__CLR4_5_29qc9qclvha7acf.R.inc(12613);try{__CLR4_5_29qc9qclvha7acf.R.inc(12612);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}
    
    //---------------------------------------------------------------------
    
    /**
     * <p>Gets whether to use the class name.</p>
     *
     * @return the current useClassName flag
     */
    @Override
    public boolean isUseClassName() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12614); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12615);return super.isUseClassName();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets whether to use the class name.</p>
     *
     * @param useClassName  the new useClassName flag
     */
    @Override
    public void setUseClassName(final boolean useClassName) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12616); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12617);super.setUseClassName(useClassName);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets whether to output short or long class names.</p>
     *
     * @return the current useShortClassName flag
     * @since 2.0
     */
    @Override
    public boolean isUseShortClassName() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12618); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12619);return super.isUseShortClassName();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets whether to output short or long class names.</p>
     *
     * @param useShortClassName  the new useShortClassName flag
     * @since 2.0
     */
    @Override
    public void setUseShortClassName(final boolean useShortClassName) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12620); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12621);super.setUseShortClassName(useShortClassName);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets whether to use the identity hash code.</p>
     * @return the current useIdentityHashCode flag
     */
    @Override
    public boolean isUseIdentityHashCode() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12622); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12623);return super.isUseIdentityHashCode();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets whether to use the identity hash code.</p>
     *
     * @param useIdentityHashCode  the new useIdentityHashCode flag
     */
    @Override
    public void setUseIdentityHashCode(final boolean useIdentityHashCode) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12624); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12625);super.setUseIdentityHashCode(useIdentityHashCode);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets whether to use the field names passed in.</p>
     *
     * @return the current useFieldNames flag
     */
    @Override
    public boolean isUseFieldNames() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12626); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12627);return super.isUseFieldNames();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets whether to use the field names passed in.</p>
     *
     * @param useFieldNames  the new useFieldNames flag
     */
    @Override
    public void setUseFieldNames(final boolean useFieldNames) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12628); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12629);super.setUseFieldNames(useFieldNames);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets whether to use full detail when the caller doesn't
     * specify.</p>
     *
     * @return the current defaultFullDetail flag
     */
    @Override
    public boolean isDefaultFullDetail() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12630); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12631);return super.isDefaultFullDetail();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets whether to use full detail when the caller doesn't
     * specify.</p>
     *
     * @param defaultFullDetail  the new defaultFullDetail flag
     */
    @Override
    public void setDefaultFullDetail(final boolean defaultFullDetail) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12632); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12633);super.setDefaultFullDetail(defaultFullDetail);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets whether to output array content detail.</p>
     *
     * @return the current array content detail setting
     */
    @Override
    public boolean isArrayContentDetail() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12634); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12635);return super.isArrayContentDetail();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}
    
    /**
     * <p>Sets whether to output array content detail.</p>
     *
     * @param arrayContentDetail  the new arrayContentDetail flag
     */
    @Override
    public void setArrayContentDetail(final boolean arrayContentDetail) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12636); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12637);super.setArrayContentDetail(arrayContentDetail);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the array start text.</p>
     *
     * @return the current array start text
     */
    @Override
    public String getArrayStart() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12638); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12639);return super.getArrayStart();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the array start text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted
     * to an empty String.</p>
     *
     * @param arrayStart  the new array start text
     */
    @Override
    public void setArrayStart(final String arrayStart) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12640); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12641);super.setArrayStart(arrayStart);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the array end text.</p>
     *
     * @return the current array end text
     */
    @Override
    public String getArrayEnd() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12642); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12643);return super.getArrayEnd();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the array end text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted
     * to an empty String.</p>
     *
     * @param arrayEnd  the new array end text
     */
    @Override
    public void setArrayEnd(final String arrayEnd) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12644); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12645);super.setArrayEnd(arrayEnd);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the array separator text.</p>
     *
     * @return the current array separator text
     */
    @Override
    public String getArraySeparator() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12646); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12647);return super.getArraySeparator();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the array separator text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted
     * to an empty String.</p>
     *
     * @param arraySeparator  the new array separator text
     */
    @Override
    public void setArraySeparator(final String arraySeparator) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12648); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12649);super.setArraySeparator(arraySeparator);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the content start text.</p>
     *
     * @return the current content start text
     */
    @Override
    public String getContentStart() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12650); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12651);return super.getContentStart();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the content start text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted
     * to an empty String.</p>
     *
     * @param contentStart  the new content start text
     */
    @Override
    public void setContentStart(final String contentStart) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12652); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12653);super.setContentStart(contentStart);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the content end text.</p>
     *
     * @return the current content end text
     */
    @Override
    public String getContentEnd() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12654); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12655);return super.getContentEnd();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the content end text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted
     * to an empty String.</p>
     *
     * @param contentEnd  the new content end text
     */
    @Override
    public void setContentEnd(final String contentEnd) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12656); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12657);super.setContentEnd(contentEnd);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the field name value separator text.</p>
     *
     * @return the current field name value separator text
     */
    @Override
    public String getFieldNameValueSeparator() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12658); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12659);return super.getFieldNameValueSeparator();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the field name value separator text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted
     * to an empty String.</p>
     *
     * @param fieldNameValueSeparator  the new field name value separator text
     */
    @Override
    public void setFieldNameValueSeparator(final String fieldNameValueSeparator) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12660); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12661);super.setFieldNameValueSeparator(fieldNameValueSeparator);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the field separator text.</p>
     *
     * @return the current field separator text
     */
    @Override
    public String getFieldSeparator() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12662); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12663);return super.getFieldSeparator();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the field separator text.</p>
     *
     * <p><code>null</code> is accepted, but will be converted
     * to an empty String.</p>
     *
     * @param fieldSeparator  the new field separator text
     */
    @Override
    public void setFieldSeparator(final String fieldSeparator) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12664); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12665);super.setFieldSeparator(fieldSeparator);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets whether the field separator should be added at the start 
     * of each buffer.</p>
     * 
     * @return the fieldSeparatorAtStart flag
     * @since 2.0
     */
    @Override
    public boolean isFieldSeparatorAtStart() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12666); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12667);return super.isFieldSeparatorAtStart();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets whether the field separator should be added at the start 
     * of each buffer.</p>
     * 
     * @param fieldSeparatorAtStart  the fieldSeparatorAtStart flag
     * @since 2.0
     */
    @Override
    public void setFieldSeparatorAtStart(final boolean fieldSeparatorAtStart) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12668); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12669);super.setFieldSeparatorAtStart(fieldSeparatorAtStart);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets whether the field separator should be added at the end 
     * of each buffer.</p>
     * 
     * @return fieldSeparatorAtEnd flag
     * @since 2.0
     */
    @Override
    public boolean isFieldSeparatorAtEnd() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12670); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12671);return super.isFieldSeparatorAtEnd();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets whether the field separator should be added at the end 
     * of each buffer.</p>
     * 
     * @param fieldSeparatorAtEnd  the fieldSeparatorAtEnd flag
     * @since 2.0
     */
    @Override
    public void setFieldSeparatorAtEnd(final boolean fieldSeparatorAtEnd) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12672); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12673);super.setFieldSeparatorAtEnd(fieldSeparatorAtEnd);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the text to output when <code>null</code> found.</p>
     *
     * @return the current text to output when <code>null</code> found
     */
    @Override
    public String getNullText() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12674); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12675);return super.getNullText();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the text to output when <code>null</code> found.</p>
     *
     * <p><code>null</code> is accepted, but will be converted
     * to an empty String.</p>
     *
     * @param nullText  the new text to output when <code>null</code> found
     */
    @Override
    public void setNullText(final String nullText) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12676); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12677);super.setNullText(nullText);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the text to output when a <code>Collection</code>,
     * <code>Map</code> or <code>Array</code> size is output.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * @return the current start of size text
     */
    @Override
    public String getSizeStartText() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12678); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12679);return super.getSizeStartText();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the start text to output when a <code>Collection</code>,
     * <code>Map</code> or <code>Array</code> size is output.</p>
     *
     * <p>This is output before the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted to
     * an empty String.</p>
     *
     * @param sizeStartText  the new start of size text
     */
    @Override
    public void setSizeStartText(final String sizeStartText) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12680); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12681);super.setSizeStartText(sizeStartText);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the end text to output when a <code>Collection</code>,
     * <code>Map</code> or <code>Array</code> size is output.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * @return the current end of size text
     */
    @Override
    public String getSizeEndText() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12682); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12683);return super.getSizeEndText();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    /**
     * <p>Sets the end text to output when a <code>Collection</code>,
     * <code>Map</code> or <code>Array</code> size is output.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * <p><code>null</code> is accepted, but will be converted
     * to an empty String.</p>
     *
     * @param sizeEndText  the new end of size text
     */
    @Override
    public void setSizeEndText(final String sizeEndText) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12684); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12685);super.setSizeEndText(sizeEndText);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the start text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <P>This is output before the size value.</p>
     *
     * @return the current start of summary text
     */
    @Override
    public String getSummaryObjectStartText() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12686); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12687);return super.getSummaryObjectStartText();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

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
    @Override
    public void setSummaryObjectStartText(final String summaryObjectStartText) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12688); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12689);super.setSummaryObjectStartText(summaryObjectStartText);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
    /**
     * <p>Gets the end text to output when an <code>Object</code> is
     * output in summary mode.</p>
     *
     * <p>This is output after the size value.</p>
     *
     * @return the current end of summary text
     */
    @Override
    public String getSummaryObjectEndText() {try{__CLR4_5_29qc9qclvha7acf.R.inc(12690); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12691);return super.getSummaryObjectEndText();
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

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
    @Override
    public void setSummaryObjectEndText(final String summaryObjectEndText) {try{__CLR4_5_29qc9qclvha7acf.R.inc(12692); // NOPMD as this is implementing the abstract class
        __CLR4_5_29qc9qclvha7acf.R.inc(12693);super.setSummaryObjectEndText(summaryObjectEndText);
    }finally{__CLR4_5_29qc9qclvha7acf.R.flushNeeded();}}

    //---------------------------------------------------------------------
    
}
