/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 2012 Sebastian Annies, Hamburg
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
package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A Property file based BoxFactory
 */
public class PropertyBoxParserImpl extends AbstractBoxParser {public static class __CLR4_5_2a5a5lvl9eed3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,482,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Properties mapping;
    Pattern constuctorPattern = Pattern.compile("(.*)\\((.*?)\\)");

    public PropertyBoxParserImpl(String... customProperties) {try{__CLR4_5_2a5a5lvl9eed3.R.inc(365);
        __CLR4_5_2a5a5lvl9eed3.R.inc(366);InputStream is = getClass().getResourceAsStream("/isoparser-default.properties");
        __CLR4_5_2a5a5lvl9eed3.R.inc(367);try {
            __CLR4_5_2a5a5lvl9eed3.R.inc(368);mapping = new Properties();
            __CLR4_5_2a5a5lvl9eed3.R.inc(369);try {
                __CLR4_5_2a5a5lvl9eed3.R.inc(370);mapping.load(is);
                __CLR4_5_2a5a5lvl9eed3.R.inc(371);ClassLoader cl = Thread.currentThread().getContextClassLoader();
                __CLR4_5_2a5a5lvl9eed3.R.inc(372);if ((((cl == null)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(373)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(374)==0&false))) {{
                    __CLR4_5_2a5a5lvl9eed3.R.inc(375);cl = ClassLoader.getSystemClassLoader();
                }
                }__CLR4_5_2a5a5lvl9eed3.R.inc(376);Enumeration<URL> enumeration = cl.getResources("isoparser-custom.properties");

                __CLR4_5_2a5a5lvl9eed3.R.inc(377);while ((((enumeration.hasMoreElements())&&(__CLR4_5_2a5a5lvl9eed3.R.iget(378)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(379)==0&false))) {{
                    __CLR4_5_2a5a5lvl9eed3.R.inc(380);URL url = enumeration.nextElement();
                    __CLR4_5_2a5a5lvl9eed3.R.inc(381);InputStream customIS = url.openStream();
                    __CLR4_5_2a5a5lvl9eed3.R.inc(382);try {
                        __CLR4_5_2a5a5lvl9eed3.R.inc(383);mapping.load(customIS);
                    } finally {
                        __CLR4_5_2a5a5lvl9eed3.R.inc(384);customIS.close();
                    }
                }
                }__CLR4_5_2a5a5lvl9eed3.R.inc(385);for (String customProperty : customProperties) {{
                    __CLR4_5_2a5a5lvl9eed3.R.inc(386);mapping.load(getClass().getResourceAsStream(customProperty));
                }
            }} catch (IOException e) {
                __CLR4_5_2a5a5lvl9eed3.R.inc(387);throw new RuntimeException(e);
            }
        } finally {
            __CLR4_5_2a5a5lvl9eed3.R.inc(388);try {
                __CLR4_5_2a5a5lvl9eed3.R.inc(389);is.close();
            } catch (IOException e) {
                __CLR4_5_2a5a5lvl9eed3.R.inc(390);e.printStackTrace();
                // ignore - I can't help
            }
        }
    }finally{__CLR4_5_2a5a5lvl9eed3.R.flushNeeded();}}

    public PropertyBoxParserImpl(Properties mapping) {try{__CLR4_5_2a5a5lvl9eed3.R.inc(391);
        __CLR4_5_2a5a5lvl9eed3.R.inc(392);this.mapping = mapping;
    }finally{__CLR4_5_2a5a5lvl9eed3.R.flushNeeded();}}


    @Override
    public Box createBox(String type, byte[] userType, String parent) {try{__CLR4_5_2a5a5lvl9eed3.R.inc(393);

        __CLR4_5_2a5a5lvl9eed3.R.inc(394);invoke(type, userType, parent);
        __CLR4_5_2a5a5lvl9eed3.R.inc(395);String[] param = this.param.get();
        __CLR4_5_2a5a5lvl9eed3.R.inc(396);try {
            __CLR4_5_2a5a5lvl9eed3.R.inc(397);Class<Box> clazz = (Class<Box>) Class.forName(clazzName.get());
            __CLR4_5_2a5a5lvl9eed3.R.inc(398);if ((((param.length > 0)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(399)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(400)==0&false))) {{
                __CLR4_5_2a5a5lvl9eed3.R.inc(401);Class[] constructorArgsClazz = new Class[param.length];
                __CLR4_5_2a5a5lvl9eed3.R.inc(402);Object[] constructorArgs = new Object[param.length];
                __CLR4_5_2a5a5lvl9eed3.R.inc(403);for (int i = 0; (((i < param.length)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(404)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(405)==0&false)); i++) {{
                    __CLR4_5_2a5a5lvl9eed3.R.inc(406);if (((("userType".equals(param[i]))&&(__CLR4_5_2a5a5lvl9eed3.R.iget(407)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(408)==0&false))) {{
                        __CLR4_5_2a5a5lvl9eed3.R.inc(409);constructorArgs[i] = userType;
                        __CLR4_5_2a5a5lvl9eed3.R.inc(410);constructorArgsClazz[i] = byte[].class;
                    } }else {__CLR4_5_2a5a5lvl9eed3.R.inc(411);if (((("type".equals(param[i]))&&(__CLR4_5_2a5a5lvl9eed3.R.iget(412)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(413)==0&false))) {{
                        __CLR4_5_2a5a5lvl9eed3.R.inc(414);constructorArgs[i] = type;
                        __CLR4_5_2a5a5lvl9eed3.R.inc(415);constructorArgsClazz[i] = String.class;
                    } }else {__CLR4_5_2a5a5lvl9eed3.R.inc(416);if (((("parent".equals(param[i]))&&(__CLR4_5_2a5a5lvl9eed3.R.iget(417)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(418)==0&false))) {{
                        __CLR4_5_2a5a5lvl9eed3.R.inc(419);constructorArgs[i] = parent;
                        __CLR4_5_2a5a5lvl9eed3.R.inc(420);constructorArgsClazz[i] = String.class;
                    } }else {{
                        __CLR4_5_2a5a5lvl9eed3.R.inc(421);throw new InternalError("No such param: " + param[i]);
                    }
                }}}}

                }__CLR4_5_2a5a5lvl9eed3.R.inc(422);Constructor<Box> constructorObject = clazz.getConstructor(constructorArgsClazz);
                __CLR4_5_2a5a5lvl9eed3.R.inc(423);return constructorObject.newInstance(constructorArgs);
            } }else {{
                __CLR4_5_2a5a5lvl9eed3.R.inc(424);return clazz.newInstance();
            }

        }} catch (ClassNotFoundException e) {
            __CLR4_5_2a5a5lvl9eed3.R.inc(425);throw new RuntimeException(e);
        } catch (InstantiationException e) {
            __CLR4_5_2a5a5lvl9eed3.R.inc(426);throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            __CLR4_5_2a5a5lvl9eed3.R.inc(427);throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            __CLR4_5_2a5a5lvl9eed3.R.inc(428);throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            __CLR4_5_2a5a5lvl9eed3.R.inc(429);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_2a5a5lvl9eed3.R.flushNeeded();}}


    StringBuilder buildLookupStrings = new StringBuilder();
    ThreadLocal<String> clazzName = new ThreadLocal<String>();
    ThreadLocal<String[]> param = new ThreadLocal<String[]>();
    static String[] EMPTY_STRING_ARRAY = new String[0];

    public void invoke(String type, byte[] userType, String parent) {try{__CLR4_5_2a5a5lvl9eed3.R.inc(430);
        __CLR4_5_2a5a5lvl9eed3.R.inc(431);String constructor;
        __CLR4_5_2a5a5lvl9eed3.R.inc(432);if ((((userType != null)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(433)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(434)==0&false))) {{
            __CLR4_5_2a5a5lvl9eed3.R.inc(435);if ((((!"uuid".equals((type)))&&(__CLR4_5_2a5a5lvl9eed3.R.iget(436)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(437)==0&false))) {{
                __CLR4_5_2a5a5lvl9eed3.R.inc(438);throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
            }
            }__CLR4_5_2a5a5lvl9eed3.R.inc(439);constructor = mapping.getProperty("uuid[" + Hex.encodeHex(userType).toUpperCase() + "]");
            __CLR4_5_2a5a5lvl9eed3.R.inc(440);if ((((constructor == null)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(441)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(442)==0&false))) {{
                __CLR4_5_2a5a5lvl9eed3.R.inc(443);constructor = mapping.getProperty((parent) + "-uuid[" + Hex.encodeHex(userType).toUpperCase() + "]");
            }
            }__CLR4_5_2a5a5lvl9eed3.R.inc(444);if ((((constructor == null)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(445)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(446)==0&false))) {{
                __CLR4_5_2a5a5lvl9eed3.R.inc(447);constructor = mapping.getProperty("uuid");
            }
        }} }else {{
            __CLR4_5_2a5a5lvl9eed3.R.inc(448);constructor = mapping.getProperty((type));
            __CLR4_5_2a5a5lvl9eed3.R.inc(449);if ((((constructor == null)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(450)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(451)==0&false))) {{
                __CLR4_5_2a5a5lvl9eed3.R.inc(452);String lookup = buildLookupStrings.append(parent).append('-').append(type).toString();
                __CLR4_5_2a5a5lvl9eed3.R.inc(453);buildLookupStrings.setLength(0);
                __CLR4_5_2a5a5lvl9eed3.R.inc(454);constructor = mapping.getProperty(lookup);

            }
        }}
        }__CLR4_5_2a5a5lvl9eed3.R.inc(455);if ((((constructor == null)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(456)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(457)==0&false))) {{
            __CLR4_5_2a5a5lvl9eed3.R.inc(458);constructor = mapping.getProperty("default");
        }
        }__CLR4_5_2a5a5lvl9eed3.R.inc(459);if ((((constructor == null)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(460)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(461)==0&false))) {{
            __CLR4_5_2a5a5lvl9eed3.R.inc(462);throw new RuntimeException("No box object found for " + type);
        }
        }__CLR4_5_2a5a5lvl9eed3.R.inc(463);if ((((!constructor.endsWith(")"))&&(__CLR4_5_2a5a5lvl9eed3.R.iget(464)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(465)==0&false))) {{
            __CLR4_5_2a5a5lvl9eed3.R.inc(466);param.set( EMPTY_STRING_ARRAY);
            __CLR4_5_2a5a5lvl9eed3.R.inc(467);clazzName.set(constructor);
        } }else {{
            __CLR4_5_2a5a5lvl9eed3.R.inc(468);Matcher m = constuctorPattern.matcher(constructor);
            __CLR4_5_2a5a5lvl9eed3.R.inc(469);boolean matches = m.matches();
            __CLR4_5_2a5a5lvl9eed3.R.inc(470);if ((((!matches)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(471)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(472)==0&false))) {{
                __CLR4_5_2a5a5lvl9eed3.R.inc(473);throw new RuntimeException("Cannot work with that constructor: " + constructor);
            }
            }__CLR4_5_2a5a5lvl9eed3.R.inc(474);clazzName.set( m.group(1));
            __CLR4_5_2a5a5lvl9eed3.R.inc(475);if ((((m.group(2).length() == 0)&&(__CLR4_5_2a5a5lvl9eed3.R.iget(476)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(477)==0&false))) {{
                __CLR4_5_2a5a5lvl9eed3.R.inc(478);param.set(EMPTY_STRING_ARRAY);
            } }else {{
                __CLR4_5_2a5a5lvl9eed3.R.inc(479);param.set((((m.group(2).length() > 0 )&&(__CLR4_5_2a5a5lvl9eed3.R.iget(480)!=0|true))||(__CLR4_5_2a5a5lvl9eed3.R.iget(481)==0&false))? m.group(2).split(",") : new String[]{});
            }
        }}

    }}finally{__CLR4_5_2a5a5lvl9eed3.R.flushNeeded();}}
}
