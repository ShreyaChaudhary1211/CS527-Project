/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*  
 * Copyright 2008 CoreMedia AG, Hamburg
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

package com.coremedia.drm.packager.isoparser;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.util.Path;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Walks through a Container and its children to see that no getter throws any exception.
 */
public final class Walk {public static class __CLR4_5_2hqohqolvl9em4u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,23024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Collection<String> skipList = Arrays.asList("class",
            "boxes",
            "type",
            "size",
            "displayName",
            "contentSize",
            "offset",
            "header",
            "version",
            "flags",
            "isoFile",
            "parent",
            "omaDrmData",
            "content",
            "tracks",
            "sampleSizeAtIndex",
            "offset",
            "sampleCount");

    private Walk() {try{__CLR4_5_2hqohqolvl9em4u.R.inc(22992);
    }finally{__CLR4_5_2hqohqolvl9em4u.R.flushNeeded();}}

    public static void through(Container container) throws IntrospectionException, IllegalAccessException, InvocationTargetException {try{__CLR4_5_2hqohqolvl9em4u.R.inc(22993);
        __CLR4_5_2hqohqolvl9em4u.R.inc(22994);for (Box b : container.getBoxes()) {{
            __CLR4_5_2hqohqolvl9em4u.R.inc(22995);List<Box> myBoxes = (List<Box>) container.getBoxes(b.getClass());
            __CLR4_5_2hqohqolvl9em4u.R.inc(22996);boolean found = false;
            __CLR4_5_2hqohqolvl9em4u.R.inc(22997);for (Box myBox : myBoxes) {{
                __CLR4_5_2hqohqolvl9em4u.R.inc(22998);if ((((myBox == b)&&(__CLR4_5_2hqohqolvl9em4u.R.iget(22999)!=0|true))||(__CLR4_5_2hqohqolvl9em4u.R.iget(23000)==0&false))) {{
                    __CLR4_5_2hqohqolvl9em4u.R.inc(23001);found = true;
                }
            }}
            }__CLR4_5_2hqohqolvl9em4u.R.inc(23002);if ((((!found)&&(__CLR4_5_2hqohqolvl9em4u.R.iget(23003)!=0|true))||(__CLR4_5_2hqohqolvl9em4u.R.iget(23004)==0&false))) {{
                __CLR4_5_2hqohqolvl9em4u.R.inc(23005);throw new RuntimeException("Didn't find the box");
            }

            }__CLR4_5_2hqohqolvl9em4u.R.inc(23006);if ((((b instanceof Container)&&(__CLR4_5_2hqohqolvl9em4u.R.iget(23007)!=0|true))||(__CLR4_5_2hqohqolvl9em4u.R.iget(23008)==0&false))) {{
                __CLR4_5_2hqohqolvl9em4u.R.inc(23009);Walk.through((Container) b);
            }


            }__CLR4_5_2hqohqolvl9em4u.R.inc(23010);b.toString(); // Just test if some execption is trown

            __CLR4_5_2hqohqolvl9em4u.R.inc(23011);BeanInfo beanInfo = Introspector.getBeanInfo(b.getClass());
            __CLR4_5_2hqohqolvl9em4u.R.inc(23012);PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            __CLR4_5_2hqohqolvl9em4u.R.inc(23013);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
                __CLR4_5_2hqohqolvl9em4u.R.inc(23014);String name = propertyDescriptor.getName();
                __CLR4_5_2hqohqolvl9em4u.R.inc(23015);if ((((!Walk.skipList.contains(name) &&
                        propertyDescriptor.getReadMethod() != null &&
                        !Box.class.isAssignableFrom(propertyDescriptor.getReadMethod().getReturnType()))&&(__CLR4_5_2hqohqolvl9em4u.R.iget(23016)!=0|true))||(__CLR4_5_2hqohqolvl9em4u.R.iget(23017)==0&false))) {{
                    __CLR4_5_2hqohqolvl9em4u.R.inc(23018);propertyDescriptor.getReadMethod().invoke(b, (Object[]) null);
                }

            }}
            }__CLR4_5_2hqohqolvl9em4u.R.inc(23019);if ((((b instanceof AbstractBox)&&(__CLR4_5_2hqohqolvl9em4u.R.iget(23020)!=0|true))||(__CLR4_5_2hqohqolvl9em4u.R.iget(23021)==0&false))) {{
                assert (((((AbstractBox) b).isParsed())&&(__CLR4_5_2hqohqolvl9em4u.R.iget(23022)!=0|true))||(__CLR4_5_2hqohqolvl9em4u.R.iget(23023)==0&false)): "Box " + Path.createPath(b) + "(" + b.getClass().getSimpleName() + ") is not parsed.";
            }

        }}
    }}finally{__CLR4_5_2hqohqolvl9em4u.R.flushNeeded();}}
}
