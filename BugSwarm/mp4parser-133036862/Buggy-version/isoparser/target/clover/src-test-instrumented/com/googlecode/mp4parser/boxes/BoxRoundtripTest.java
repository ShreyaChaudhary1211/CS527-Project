/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser.boxes;


import com.coremedia.iso.IsoFile;
import com.coremedia.iso.PropertyBoxParserImpl;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.text.AttributedCharacterIterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RunWith(Parameterized.class)
public abstract class BoxRoundtripTest {static class __CLR4_5_2jxgjxglvlulr15{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448889527L,8589935092L,25928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    /*


    @Parameterized.Parameters
    public static Collection<Object[]> data() {


        return Collections.singletonList(
                new Object[]{new Box(),
                        new Map.Entry[]{
                                new E("prop", 1),
                                new E("prop2", 21)}
                });
    }



     */

    String dummyParent = null;
    Box boxUnderTest;
    Map<String, Object> props;


    public BoxRoundtripTest(Box boxUnderTest, Map.Entry<String, Object>... properties) {try{__CLR4_5_2jxgjxglvlulr15.R.inc(25828);
        __CLR4_5_2jxgjxglvlulr15.R.inc(25829);this.boxUnderTest = boxUnderTest;
        __CLR4_5_2jxgjxglvlulr15.R.inc(25830);this.props = new HashMap<String, Object>();
        __CLR4_5_2jxgjxglvlulr15.R.inc(25831);for (Map.Entry<String, Object> property : properties) {{
            __CLR4_5_2jxgjxglvlulr15.R.inc(25832);props.put(property.getKey(), property.getValue());
        }
    }}finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}

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


    @Test
    public void roundtrip() throws Exception {__CLR4_5_2jxgjxglvlulr15.R.globalSliceStart(getClass().getName(),25833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lc6emyjxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2jxgjxglvlulr15.R.rethrow($CLV_t2$);}finally{__CLR4_5_2jxgjxglvlulr15.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.BoxRoundtripTest.roundtrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),25833,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lc6emyjxl() throws Exception{try{__CLR4_5_2jxgjxglvlulr15.R.inc(25833);

        __CLR4_5_2jxgjxglvlulr15.R.inc(25834);BeanInfo beanInfo = Introspector.getBeanInfo(boxUnderTest.getClass());
        __CLR4_5_2jxgjxglvlulr15.R.inc(25835);PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        __CLR4_5_2jxgjxglvlulr15.R.inc(25836);for (String property : props.keySet()) {{
            __CLR4_5_2jxgjxglvlulr15.R.inc(25837);boolean found = false;
            __CLR4_5_2jxgjxglvlulr15.R.inc(25838);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
                __CLR4_5_2jxgjxglvlulr15.R.inc(25839);if ((((property.equals(propertyDescriptor.getName()))&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25840)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25841)==0&false))) {{
                    __CLR4_5_2jxgjxglvlulr15.R.inc(25842);found = true;
                    __CLR4_5_2jxgjxglvlulr15.R.inc(25843);try {
                        __CLR4_5_2jxgjxglvlulr15.R.inc(25844);propertyDescriptor.getWriteMethod().invoke(boxUnderTest, props.get(property));
                    } catch (IllegalArgumentException e) {

                        __CLR4_5_2jxgjxglvlulr15.R.inc(25845);System.err.println(propertyDescriptor.getWriteMethod().getName() + "(" + propertyDescriptor.getWriteMethod().getParameterTypes()[0].getSimpleName() + ");");
                        __CLR4_5_2jxgjxglvlulr15.R.inc(25846);System.err.println("Called with " + props.get(property).getClass());


                        __CLR4_5_2jxgjxglvlulr15.R.inc(25847);throw e;
                    }
                    // do the next assertion on string level to not trap into the long vs java.lang.Long pitfall
                    __CLR4_5_2jxgjxglvlulr15.R.inc(25848);Assert.assertEquals("The symmetry between getter/setter of " + property + " is not given.", props.get(property), propertyDescriptor.getReadMethod().invoke(boxUnderTest));
                }
            }}
            }__CLR4_5_2jxgjxglvlulr15.R.inc(25849);if ((((!found)&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25850)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25851)==0&false))) {{
                __CLR4_5_2jxgjxglvlulr15.R.inc(25852);Assert.fail("Could not find any property descriptor for " + property);
            }
        }}


        }__CLR4_5_2jxgjxglvlulr15.R.inc(25853);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2jxgjxglvlulr15.R.inc(25854);WritableByteChannel wbc = Channels.newChannel(baos);
        __CLR4_5_2jxgjxglvlulr15.R.inc(25855);boxUnderTest.getBox(wbc);
        __CLR4_5_2jxgjxglvlulr15.R.inc(25856);wbc.close();
        __CLR4_5_2jxgjxglvlulr15.R.inc(25857);baos.close();

        __CLR4_5_2jxgjxglvlulr15.R.inc(25858);IsoFile singleBoxIsoFile = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));

        __CLR4_5_2jxgjxglvlulr15.R.inc(25859);Assert.assertEquals("Expected box and file size to be the same", boxUnderTest.getSize(), baos.size());
        __CLR4_5_2jxgjxglvlulr15.R.inc(25860);Assert.assertEquals("Expected a single box in the IsoFile structure", 1, singleBoxIsoFile.getBoxes().size());
        __CLR4_5_2jxgjxglvlulr15.R.inc(25861);Assert.assertEquals("Expected to find a box of different type ", boxUnderTest.getClass(), singleBoxIsoFile.getBoxes().get(0).getClass());

        __CLR4_5_2jxgjxglvlulr15.R.inc(25862);Box parsedBox = singleBoxIsoFile.getBoxes().get(0);


        __CLR4_5_2jxgjxglvlulr15.R.inc(25863);for (String property : props.keySet()) {{
            __CLR4_5_2jxgjxglvlulr15.R.inc(25864);boolean found = false;
            __CLR4_5_2jxgjxglvlulr15.R.inc(25865);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
                __CLR4_5_2jxgjxglvlulr15.R.inc(25866);if ((((property.equals(propertyDescriptor.getName()))&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25867)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25868)==0&false))) {{
                    __CLR4_5_2jxgjxglvlulr15.R.inc(25869);found = true;
                    __CLR4_5_2jxgjxglvlulr15.R.inc(25870);if ((((props.get(property) instanceof int[])&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25871)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25872)==0&false))) {{
                        __CLR4_5_2jxgjxglvlulr15.R.inc(25873);Assert.assertArrayEquals("Writing and parsing changed the value of " + property, (int[]) props.get(property), (int[]) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    } }else {__CLR4_5_2jxgjxglvlulr15.R.inc(25874);if ((((props.get(property) instanceof byte[])&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25875)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25876)==0&false))) {{
                        __CLR4_5_2jxgjxglvlulr15.R.inc(25877);Assert.assertArrayEquals("Writing and parsing changed the value of " + property, (byte[]) props.get(property), (byte[]) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    } }else {__CLR4_5_2jxgjxglvlulr15.R.inc(25878);if ((((props.get(property) instanceof long[])&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25879)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25880)==0&false))) {{
                        __CLR4_5_2jxgjxglvlulr15.R.inc(25881);Assert.assertArrayEquals("Writing and parsing changed the value of " + property, (long[]) props.get(property), (long[]) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    } }else {{
                        __CLR4_5_2jxgjxglvlulr15.R.inc(25882);Assert.assertEquals("Writing and parsing changed the value of " + property, props.get(property), (Object) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    }
                }}}}
            }}
            }__CLR4_5_2jxgjxglvlulr15.R.inc(25883);if ((((!found)&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25884)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25885)==0&false))) {{
                __CLR4_5_2jxgjxglvlulr15.R.inc(25886);Assert.fail("Could not find any property descriptor for " + property);
            }
        }}

        }__CLR4_5_2jxgjxglvlulr15.R.inc(25887);Assert.assertEquals("Writing and parsing should not change the box size.", boxUnderTest.getSize(), parsedBox.getSize());

        __CLR4_5_2jxgjxglvlulr15.R.inc(25888);boolean output = false;
        __CLR4_5_2jxgjxglvlulr15.R.inc(25889);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
            __CLR4_5_2jxgjxglvlulr15.R.inc(25890);if ((((!props.containsKey(propertyDescriptor.getName()))&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25891)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25892)==0&false))) {{
                __CLR4_5_2jxgjxglvlulr15.R.inc(25893);if ((((!skipList.contains(propertyDescriptor.getName()))&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25894)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25895)==0&false))) {{
                    __CLR4_5_2jxgjxglvlulr15.R.inc(25896);if ((((!output)&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25897)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25898)==0&false))) {{
                        __CLR4_5_2jxgjxglvlulr15.R.inc(25899);System.out.println("No value given for the following properties: ");
                        __CLR4_5_2jxgjxglvlulr15.R.inc(25900);output = true;
                    }
                    }__CLR4_5_2jxgjxglvlulr15.R.inc(25901);System.out.println(String.format("new E(\"%s\", (%s)) ),", propertyDescriptor.getName(), propertyDescriptor.getPropertyType().getSimpleName()));
                }
            }}
        }}

    }}finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}

    class DummyContainerBox extends AbstractContainerBox {

        public DummyContainerBox(String type) {
            super(type);__CLR4_5_2jxgjxglvlulr15.R.inc(25903);try{__CLR4_5_2jxgjxglvlulr15.R.inc(25902);
        }finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}
    }

    protected static class E implements Map.Entry<String,Object> {

        private String key;
        private Object value;

        public E(String key, Object value) {try{__CLR4_5_2jxgjxglvlulr15.R.inc(25904);
            __CLR4_5_2jxgjxglvlulr15.R.inc(25905);this.key = key;
            __CLR4_5_2jxgjxglvlulr15.R.inc(25906);this.value = value;
        }finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}

        public boolean equals(Object o) {try{__CLR4_5_2jxgjxglvlulr15.R.inc(25907);
            __CLR4_5_2jxgjxglvlulr15.R.inc(25908);if ((((!(o instanceof E))&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25909)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25910)==0&false))) {{
                __CLR4_5_2jxgjxglvlulr15.R.inc(25911);return false;
            }
            }__CLR4_5_2jxgjxglvlulr15.R.inc(25912);E other = (E) o;
            __CLR4_5_2jxgjxglvlulr15.R.inc(25913);return other.key.equals(key) &&
                    ((((value == null )&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25914)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25915)==0&false))? other.value == null : other.value.equals(value));
        }finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}

        public String getKey() {try{__CLR4_5_2jxgjxglvlulr15.R.inc(25916);
            __CLR4_5_2jxgjxglvlulr15.R.inc(25917);return key;
        }finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}

        public Object getValue() {try{__CLR4_5_2jxgjxglvlulr15.R.inc(25918);
            __CLR4_5_2jxgjxglvlulr15.R.inc(25919);return value;
        }finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}

        public Object setValue(Object newValue) {try{__CLR4_5_2jxgjxglvlulr15.R.inc(25920);
            __CLR4_5_2jxgjxglvlulr15.R.inc(25921);throw new UnsupportedOperationException();
        }finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}

        public int hashCode() {try{__CLR4_5_2jxgjxglvlulr15.R.inc(25922);
            __CLR4_5_2jxgjxglvlulr15.R.inc(25923);return key.hashCode() ^ ((((value==null )&&(__CLR4_5_2jxgjxglvlulr15.R.iget(25924)!=0|true))||(__CLR4_5_2jxgjxglvlulr15.R.iget(25925)==0&false))? 0 : value.hashCode());
        }finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2jxgjxglvlulr15.R.inc(25926);
            __CLR4_5_2jxgjxglvlulr15.R.inc(25927);return key +"="+value.toString();
        }finally{__CLR4_5_2jxgjxglvlulr15.R.flushNeeded();}}
    }

}
