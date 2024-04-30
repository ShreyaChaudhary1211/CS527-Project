/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;


import com.coremedia.iso.PropertyBoxParserImpl;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;

import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class BoxWriteReadBase<T extends Box> {public static class __CLR4_5_2k08k08lvlulr2h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,26010,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String dummyParent = null;

    protected BoxWriteReadBase(String dummyParent) {try{__CLR4_5_2k08k08lvlulr2h.R.inc(25928);
        __CLR4_5_2k08k08lvlulr2h.R.inc(25929);this.dummyParent = dummyParent;
    }finally{__CLR4_5_2k08k08lvlulr2h.R.flushNeeded();}}

    protected BoxWriteReadBase() {try{__CLR4_5_2k08k08lvlulr2h.R.inc(25930);
    }finally{__CLR4_5_2k08k08lvlulr2h.R.flushNeeded();}}

    private static final Collection<String> skipList = Arrays.asList(
            "class",
            "flags",
            "isoFile",
            "parent",
            "parsed",
            "path",
            "size",
            "offset",
            "type",
            "userType",
            "version");


    public abstract Class<T> getBoxUnderTest();

    public abstract void setupProperties(Map<String, Object> addPropsHere, T box);


    protected T getInstance(Class<T> clazz) throws Exception {try{__CLR4_5_2k08k08lvlulr2h.R.inc(25931);
        __CLR4_5_2k08k08lvlulr2h.R.inc(25932);Constructor<T> constructor = clazz.getConstructor();
        __CLR4_5_2k08k08lvlulr2h.R.inc(25933);return constructor.newInstance();
    }finally{__CLR4_5_2k08k08lvlulr2h.R.flushNeeded();}}

    @Test
    public void roundtrip() throws Exception {try{__CLR4_5_2k08k08lvlulr2h.R.inc(25934);
        __CLR4_5_2k08k08lvlulr2h.R.inc(25935);Class<T> clazz = getBoxUnderTest();
        __CLR4_5_2k08k08lvlulr2h.R.inc(25936);T box = getInstance(clazz);
        __CLR4_5_2k08k08lvlulr2h.R.inc(25937);BeanInfo beanInfo = Introspector.getBeanInfo(box.getClass());
        __CLR4_5_2k08k08lvlulr2h.R.inc(25938);PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        __CLR4_5_2k08k08lvlulr2h.R.inc(25939);Map<String, Object> props = new HashMap<String, Object>();
        __CLR4_5_2k08k08lvlulr2h.R.inc(25940);setupProperties(props, box);
        __CLR4_5_2k08k08lvlulr2h.R.inc(25941);for (String property : props.keySet()) {{
            __CLR4_5_2k08k08lvlulr2h.R.inc(25942);boolean found = false;
            __CLR4_5_2k08k08lvlulr2h.R.inc(25943);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
                __CLR4_5_2k08k08lvlulr2h.R.inc(25944);if ((((property.equals(propertyDescriptor.getName()))&&(__CLR4_5_2k08k08lvlulr2h.R.iget(25945)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(25946)==0&false))) {{
                    __CLR4_5_2k08k08lvlulr2h.R.inc(25947);found = true;
                    __CLR4_5_2k08k08lvlulr2h.R.inc(25948);try {
                        __CLR4_5_2k08k08lvlulr2h.R.inc(25949);propertyDescriptor.getWriteMethod().invoke(box, props.get(property));
                    } catch (IllegalArgumentException e) {

                        __CLR4_5_2k08k08lvlulr2h.R.inc(25950);System.err.println(propertyDescriptor.getWriteMethod().getName() + "(" + propertyDescriptor.getWriteMethod().getParameterTypes()[0].getSimpleName() + ");");
                        __CLR4_5_2k08k08lvlulr2h.R.inc(25951);System.err.println("Called with " + props.get(property).getClass());


                        __CLR4_5_2k08k08lvlulr2h.R.inc(25952);throw e;
                    }
                    // do the next assertion on string level to not trap into the long vs java.lang.Long pitfall
                    __CLR4_5_2k08k08lvlulr2h.R.inc(25953);Assert.assertEquals("The symmetry between getter/setter of " + property + " is not given.", props.get(property), propertyDescriptor.getReadMethod().invoke(box));
                }
            }}
            }__CLR4_5_2k08k08lvlulr2h.R.inc(25954);if ((((!found)&&(__CLR4_5_2k08k08lvlulr2h.R.iget(25955)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(25956)==0&false))) {{
                __CLR4_5_2k08k08lvlulr2h.R.inc(25957);Assert.fail("Could not find any property descriptor for " + property);
            }
        }}


        }__CLR4_5_2k08k08lvlulr2h.R.inc(25958);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2k08k08lvlulr2h.R.inc(25959);WritableByteChannel wbc = Channels.newChannel(baos);
        __CLR4_5_2k08k08lvlulr2h.R.inc(25960);box.getBox(wbc);
        __CLR4_5_2k08k08lvlulr2h.R.inc(25961);wbc.close();
        __CLR4_5_2k08k08lvlulr2h.R.inc(25962);baos.close();

        __CLR4_5_2k08k08lvlulr2h.R.inc(25963);DummyContainerBox singleBoxIsoFile = new DummyContainerBox(dummyParent);
        __CLR4_5_2k08k08lvlulr2h.R.inc(25964);singleBoxIsoFile.initContainer(new MemoryDataSourceImpl(baos.toByteArray()), baos.size(), new PropertyBoxParserImpl());
        __CLR4_5_2k08k08lvlulr2h.R.inc(25965);Assert.assertEquals("Expected box and file size to be the same", box.getSize(), baos.size());
        __CLR4_5_2k08k08lvlulr2h.R.inc(25966);Assert.assertEquals("Expected a single box in the IsoFile structure", 1, singleBoxIsoFile.getBoxes().size());
        __CLR4_5_2k08k08lvlulr2h.R.inc(25967);Assert.assertEquals("Expected to find a box of different type ", clazz, singleBoxIsoFile.getBoxes().get(0).getClass());

        __CLR4_5_2k08k08lvlulr2h.R.inc(25968);T parsedBox = (T) singleBoxIsoFile.getBoxes().get(0);


        __CLR4_5_2k08k08lvlulr2h.R.inc(25969);for (String property : props.keySet()) {{
            __CLR4_5_2k08k08lvlulr2h.R.inc(25970);boolean found = false;
            __CLR4_5_2k08k08lvlulr2h.R.inc(25971);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
                __CLR4_5_2k08k08lvlulr2h.R.inc(25972);if ((((property.equals(propertyDescriptor.getName()))&&(__CLR4_5_2k08k08lvlulr2h.R.iget(25973)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(25974)==0&false))) {{
                    __CLR4_5_2k08k08lvlulr2h.R.inc(25975);found = true;
                    __CLR4_5_2k08k08lvlulr2h.R.inc(25976);if ((((props.get(property) instanceof int[])&&(__CLR4_5_2k08k08lvlulr2h.R.iget(25977)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(25978)==0&false))) {{
                        __CLR4_5_2k08k08lvlulr2h.R.inc(25979);Assert.assertArrayEquals("Writing and parsing changed the value of " + property, (int[]) props.get(property), (int[]) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    } }else {__CLR4_5_2k08k08lvlulr2h.R.inc(25980);if ((((props.get(property) instanceof byte[])&&(__CLR4_5_2k08k08lvlulr2h.R.iget(25981)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(25982)==0&false))) {{
                        __CLR4_5_2k08k08lvlulr2h.R.inc(25983);Assert.assertArrayEquals("Writing and parsing changed the value of " + property, (byte[]) props.get(property), (byte[]) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    } }else {__CLR4_5_2k08k08lvlulr2h.R.inc(25984);if ((((props.get(property) instanceof long[])&&(__CLR4_5_2k08k08lvlulr2h.R.iget(25985)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(25986)==0&false))) {{
                        __CLR4_5_2k08k08lvlulr2h.R.inc(25987);Assert.assertArrayEquals("Writing and parsing changed the value of " + property, (long[]) props.get(property), (long[]) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    } }else {{
                        __CLR4_5_2k08k08lvlulr2h.R.inc(25988);Assert.assertEquals("Writing and parsing changed the value of " + property, props.get(property), (Object) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    }
                }}}}
            }}
            }__CLR4_5_2k08k08lvlulr2h.R.inc(25989);if ((((!found)&&(__CLR4_5_2k08k08lvlulr2h.R.iget(25990)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(25991)==0&false))) {{
                __CLR4_5_2k08k08lvlulr2h.R.inc(25992);Assert.fail("Could not find any property descriptor for " + property);
            }
        }}

        }__CLR4_5_2k08k08lvlulr2h.R.inc(25993);Assert.assertEquals("Writing and parsing should not change the box size.", box.getSize(), parsedBox.getSize());

        __CLR4_5_2k08k08lvlulr2h.R.inc(25994);boolean output = false;
        __CLR4_5_2k08k08lvlulr2h.R.inc(25995);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
            __CLR4_5_2k08k08lvlulr2h.R.inc(25996);if ((((!props.containsKey(propertyDescriptor.getName()))&&(__CLR4_5_2k08k08lvlulr2h.R.iget(25997)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(25998)==0&false))) {{
                __CLR4_5_2k08k08lvlulr2h.R.inc(25999);if ((((!skipList.contains(propertyDescriptor.getName()))&&(__CLR4_5_2k08k08lvlulr2h.R.iget(26000)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(26001)==0&false))) {{
                    __CLR4_5_2k08k08lvlulr2h.R.inc(26002);if ((((!output)&&(__CLR4_5_2k08k08lvlulr2h.R.iget(26003)!=0|true))||(__CLR4_5_2k08k08lvlulr2h.R.iget(26004)==0&false))) {{
                        __CLR4_5_2k08k08lvlulr2h.R.inc(26005);System.out.println("No value given for the following properties: ");
                        __CLR4_5_2k08k08lvlulr2h.R.inc(26006);output = true;
                    }
                    }__CLR4_5_2k08k08lvlulr2h.R.inc(26007);System.out.println(String.format("addPropsHere.put(\"%s\", (%s) );", propertyDescriptor.getName(), propertyDescriptor.getPropertyType().getSimpleName()));
                }
            }}
        }}

    }}finally{__CLR4_5_2k08k08lvlulr2h.R.flushNeeded();}}

    class DummyContainerBox extends AbstractContainerBox {

        public DummyContainerBox(String type) {
            super(type);__CLR4_5_2k08k08lvlulr2h.R.inc(26009);try{__CLR4_5_2k08k08lvlulr2h.R.inc(26008);
        }finally{__CLR4_5_2k08k08lvlulr2h.R.flushNeeded();}}
    }


}
