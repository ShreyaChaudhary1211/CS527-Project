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
public abstract class BoxRoundtripTest {static class __CLR4_5_2j3oj3olvl9emti{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413286414L,8589935092L,24856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

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


    public BoxRoundtripTest(Box boxUnderTest, Map.Entry<String, Object>... properties) {try{__CLR4_5_2j3oj3olvl9emti.R.inc(24756);
        __CLR4_5_2j3oj3olvl9emti.R.inc(24757);this.boxUnderTest = boxUnderTest;
        __CLR4_5_2j3oj3olvl9emti.R.inc(24758);this.props = new HashMap<String, Object>();
        __CLR4_5_2j3oj3olvl9emti.R.inc(24759);for (Map.Entry<String, Object> property : properties) {{
            __CLR4_5_2j3oj3olvl9emti.R.inc(24760);props.put(property.getKey(), property.getValue());
        }
    }}finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}

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
    public void roundtrip() throws Exception {__CLR4_5_2j3oj3olvl9emti.R.globalSliceStart(getClass().getName(),24761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lc6emyj3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2j3oj3olvl9emti.R.rethrow($CLV_t2$);}finally{__CLR4_5_2j3oj3olvl9emti.R.globalSliceEnd(getClass().getName(),"com.googlecode.mp4parser.boxes.BoxRoundtripTest.roundtrip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),24761,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lc6emyj3t() throws Exception{try{__CLR4_5_2j3oj3olvl9emti.R.inc(24761);

        __CLR4_5_2j3oj3olvl9emti.R.inc(24762);BeanInfo beanInfo = Introspector.getBeanInfo(boxUnderTest.getClass());
        __CLR4_5_2j3oj3olvl9emti.R.inc(24763);PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        __CLR4_5_2j3oj3olvl9emti.R.inc(24764);for (String property : props.keySet()) {{
            __CLR4_5_2j3oj3olvl9emti.R.inc(24765);boolean found = false;
            __CLR4_5_2j3oj3olvl9emti.R.inc(24766);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
                __CLR4_5_2j3oj3olvl9emti.R.inc(24767);if ((((property.equals(propertyDescriptor.getName()))&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24768)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24769)==0&false))) {{
                    __CLR4_5_2j3oj3olvl9emti.R.inc(24770);found = true;
                    __CLR4_5_2j3oj3olvl9emti.R.inc(24771);try {
                        __CLR4_5_2j3oj3olvl9emti.R.inc(24772);propertyDescriptor.getWriteMethod().invoke(boxUnderTest, props.get(property));
                    } catch (IllegalArgumentException e) {

                        __CLR4_5_2j3oj3olvl9emti.R.inc(24773);System.err.println(propertyDescriptor.getWriteMethod().getName() + "(" + propertyDescriptor.getWriteMethod().getParameterTypes()[0].getSimpleName() + ");");
                        __CLR4_5_2j3oj3olvl9emti.R.inc(24774);System.err.println("Called with " + props.get(property).getClass());


                        __CLR4_5_2j3oj3olvl9emti.R.inc(24775);throw e;
                    }
                    // do the next assertion on string level to not trap into the long vs java.lang.Long pitfall
                    __CLR4_5_2j3oj3olvl9emti.R.inc(24776);Assert.assertEquals("The symmetry between getter/setter of " + property + " is not given.", props.get(property), propertyDescriptor.getReadMethod().invoke(boxUnderTest));
                }
            }}
            }__CLR4_5_2j3oj3olvl9emti.R.inc(24777);if ((((!found)&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24778)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24779)==0&false))) {{
                __CLR4_5_2j3oj3olvl9emti.R.inc(24780);Assert.fail("Could not find any property descriptor for " + property);
            }
        }}


        }__CLR4_5_2j3oj3olvl9emti.R.inc(24781);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_5_2j3oj3olvl9emti.R.inc(24782);WritableByteChannel wbc = Channels.newChannel(baos);
        __CLR4_5_2j3oj3olvl9emti.R.inc(24783);boxUnderTest.getBox(wbc);
        __CLR4_5_2j3oj3olvl9emti.R.inc(24784);wbc.close();
        __CLR4_5_2j3oj3olvl9emti.R.inc(24785);baos.close();

        __CLR4_5_2j3oj3olvl9emti.R.inc(24786);IsoFile singleBoxIsoFile = new IsoFile(new MemoryDataSourceImpl(baos.toByteArray()));

        __CLR4_5_2j3oj3olvl9emti.R.inc(24787);Assert.assertEquals("Expected box and file size to be the same", boxUnderTest.getSize(), baos.size());
        __CLR4_5_2j3oj3olvl9emti.R.inc(24788);Assert.assertEquals("Expected a single box in the IsoFile structure", 1, singleBoxIsoFile.getBoxes().size());
        __CLR4_5_2j3oj3olvl9emti.R.inc(24789);Assert.assertEquals("Expected to find a box of different type ", boxUnderTest.getClass(), singleBoxIsoFile.getBoxes().get(0).getClass());

        __CLR4_5_2j3oj3olvl9emti.R.inc(24790);Box parsedBox = singleBoxIsoFile.getBoxes().get(0);


        __CLR4_5_2j3oj3olvl9emti.R.inc(24791);for (String property : props.keySet()) {{
            __CLR4_5_2j3oj3olvl9emti.R.inc(24792);boolean found = false;
            __CLR4_5_2j3oj3olvl9emti.R.inc(24793);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
                __CLR4_5_2j3oj3olvl9emti.R.inc(24794);if ((((property.equals(propertyDescriptor.getName()))&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24795)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24796)==0&false))) {{
                    __CLR4_5_2j3oj3olvl9emti.R.inc(24797);found = true;
                    __CLR4_5_2j3oj3olvl9emti.R.inc(24798);if ((((props.get(property) instanceof int[])&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24799)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24800)==0&false))) {{
                        __CLR4_5_2j3oj3olvl9emti.R.inc(24801);Assert.assertArrayEquals("Writing and parsing changed the value of " + property, (int[]) props.get(property), (int[]) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    } }else {__CLR4_5_2j3oj3olvl9emti.R.inc(24802);if ((((props.get(property) instanceof byte[])&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24803)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24804)==0&false))) {{
                        __CLR4_5_2j3oj3olvl9emti.R.inc(24805);Assert.assertArrayEquals("Writing and parsing changed the value of " + property, (byte[]) props.get(property), (byte[]) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    } }else {__CLR4_5_2j3oj3olvl9emti.R.inc(24806);if ((((props.get(property) instanceof long[])&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24807)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24808)==0&false))) {{
                        __CLR4_5_2j3oj3olvl9emti.R.inc(24809);Assert.assertArrayEquals("Writing and parsing changed the value of " + property, (long[]) props.get(property), (long[]) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    } }else {{
                        __CLR4_5_2j3oj3olvl9emti.R.inc(24810);Assert.assertEquals("Writing and parsing changed the value of " + property, props.get(property), (Object) propertyDescriptor.getReadMethod().invoke(parsedBox));
                    }
                }}}}
            }}
            }__CLR4_5_2j3oj3olvl9emti.R.inc(24811);if ((((!found)&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24812)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24813)==0&false))) {{
                __CLR4_5_2j3oj3olvl9emti.R.inc(24814);Assert.fail("Could not find any property descriptor for " + property);
            }
        }}

        }__CLR4_5_2j3oj3olvl9emti.R.inc(24815);Assert.assertEquals("Writing and parsing should not change the box size.", boxUnderTest.getSize(), parsedBox.getSize());

        __CLR4_5_2j3oj3olvl9emti.R.inc(24816);boolean output = false;
        __CLR4_5_2j3oj3olvl9emti.R.inc(24817);for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {{
            __CLR4_5_2j3oj3olvl9emti.R.inc(24818);if ((((!props.containsKey(propertyDescriptor.getName()))&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24819)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24820)==0&false))) {{
                __CLR4_5_2j3oj3olvl9emti.R.inc(24821);if ((((!skipList.contains(propertyDescriptor.getName()))&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24822)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24823)==0&false))) {{
                    __CLR4_5_2j3oj3olvl9emti.R.inc(24824);if ((((!output)&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24825)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24826)==0&false))) {{
                        __CLR4_5_2j3oj3olvl9emti.R.inc(24827);System.out.println("No value given for the following properties: ");
                        __CLR4_5_2j3oj3olvl9emti.R.inc(24828);output = true;
                    }
                    }__CLR4_5_2j3oj3olvl9emti.R.inc(24829);System.out.println(String.format("new E(\"%s\", (%s)) ),", propertyDescriptor.getName(), propertyDescriptor.getPropertyType().getSimpleName()));
                }
            }}
        }}

    }}finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}

    class DummyContainerBox extends AbstractContainerBox {

        public DummyContainerBox(String type) {
            super(type);__CLR4_5_2j3oj3olvl9emti.R.inc(24831);try{__CLR4_5_2j3oj3olvl9emti.R.inc(24830);
        }finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}
    }

    protected static class E implements Map.Entry<String,Object> {

        private String key;
        private Object value;

        public E(String key, Object value) {try{__CLR4_5_2j3oj3olvl9emti.R.inc(24832);
            __CLR4_5_2j3oj3olvl9emti.R.inc(24833);this.key = key;
            __CLR4_5_2j3oj3olvl9emti.R.inc(24834);this.value = value;
        }finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}

        public boolean equals(Object o) {try{__CLR4_5_2j3oj3olvl9emti.R.inc(24835);
            __CLR4_5_2j3oj3olvl9emti.R.inc(24836);if ((((!(o instanceof E))&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24837)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24838)==0&false))) {{
                __CLR4_5_2j3oj3olvl9emti.R.inc(24839);return false;
            }
            }__CLR4_5_2j3oj3olvl9emti.R.inc(24840);E other = (E) o;
            __CLR4_5_2j3oj3olvl9emti.R.inc(24841);return other.key.equals(key) &&
                    ((((value == null )&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24842)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24843)==0&false))? other.value == null : other.value.equals(value));
        }finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}

        public String getKey() {try{__CLR4_5_2j3oj3olvl9emti.R.inc(24844);
            __CLR4_5_2j3oj3olvl9emti.R.inc(24845);return key;
        }finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}

        public Object getValue() {try{__CLR4_5_2j3oj3olvl9emti.R.inc(24846);
            __CLR4_5_2j3oj3olvl9emti.R.inc(24847);return value;
        }finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}

        public Object setValue(Object newValue) {try{__CLR4_5_2j3oj3olvl9emti.R.inc(24848);
            __CLR4_5_2j3oj3olvl9emti.R.inc(24849);throw new UnsupportedOperationException();
        }finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}

        public int hashCode() {try{__CLR4_5_2j3oj3olvl9emti.R.inc(24850);
            __CLR4_5_2j3oj3olvl9emti.R.inc(24851);return key.hashCode() ^ ((((value==null )&&(__CLR4_5_2j3oj3olvl9emti.R.iget(24852)!=0|true))||(__CLR4_5_2j3oj3olvl9emti.R.iget(24853)==0&false))? 0 : value.hashCode());
        }finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2j3oj3olvl9emti.R.inc(24854);
            __CLR4_5_2j3oj3olvl9emti.R.inc(24855);return key +"="+value.toString();
        }finally{__CLR4_5_2j3oj3olvl9emti.R.flushNeeded();}}
    }

}
