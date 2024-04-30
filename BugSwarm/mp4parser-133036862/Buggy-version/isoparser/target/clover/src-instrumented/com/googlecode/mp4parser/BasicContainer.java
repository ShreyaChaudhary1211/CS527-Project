/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.LazyList;
import com.googlecode.mp4parser.util.Logger;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.*;

import static com.googlecode.mp4parser.util.CastUtils.l2i;

/**
 * Created by sannies on 18.05.13.
 */
public class BasicContainer implements Container, Iterator<Box>, Closeable {public static class __CLR4_5_23tv3tvlvlulcu6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,5138,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Box EOF = new AbstractBox("eof ") {

        @Override
        protected long getContentSize() {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(4963);
            __CLR4_5_23tv3tvlvlulcu6.R.inc(4964);return 0;
        }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

        @Override
        protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(4965);
        }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

        @Override
        protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(4966);
        }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}
    };
    private static Logger LOG = Logger.getLogger(BasicContainer.class);
    protected BoxParser boxParser;
    protected DataSource dataSource;
    Box lookahead = null;
    long parsePosition = 0;
    long startPosition = 0;
    long endPosition = 0;
    private List<Box> boxes = new ArrayList<Box>();

    public BasicContainer() {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(4967);
    }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    public List<Box> getBoxes() {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(4968);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4969);if ((((dataSource != null && lookahead != EOF)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(4970)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(4971)==0&false))) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(4972);return new LazyList<Box>(boxes, this);
        } }else {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(4973);return boxes;
        }
    }}finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    public void setBoxes(List<Box> boxes) {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(4974);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4975);this.boxes = new ArrayList<Box>(boxes);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4976);this.lookahead = EOF;
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4977);this.dataSource = null;
    }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    protected long getContainerSize() {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(4978);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4979);long contentSize = 0;
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4980);for (int i = 0; (((i < getBoxes().size())&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(4981)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(4982)==0&false)); i++) {{
            // it's quicker to iterate an array list like that since no iterator
            // needs to be instantiated
            __CLR4_5_23tv3tvlvlulcu6.R.inc(4983);contentSize += boxes.get(i).getSize();
        }
        }__CLR4_5_23tv3tvlvlulcu6.R.inc(4984);return contentSize;
    }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T extends Box> List<T> getBoxes(Class<T> clazz) {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(4985);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4986);List<T> boxesToBeReturned = null;
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4987);T oneBox = null;
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4988);List<Box> boxes = getBoxes();
        __CLR4_5_23tv3tvlvlulcu6.R.inc(4989);for (int i = 0; (((i < boxes.size())&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(4990)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(4991)==0&false)); i++) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(4992);Box boxe = boxes.get(i);
            //clazz.isInstance(boxe) / clazz == boxe.getClass()?
            // I hereby finally decide to use isInstance

            __CLR4_5_23tv3tvlvlulcu6.R.inc(4993);if ((((clazz.isInstance(boxe))&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(4994)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(4995)==0&false))) {{
                __CLR4_5_23tv3tvlvlulcu6.R.inc(4996);if ((((oneBox == null)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(4997)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(4998)==0&false))) {{
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(4999);oneBox = (T) boxe;
                } }else {{
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5000);if ((((boxesToBeReturned == null)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5001)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5002)==0&false))) {{
                        __CLR4_5_23tv3tvlvlulcu6.R.inc(5003);boxesToBeReturned = new ArrayList<T>(2);
                        __CLR4_5_23tv3tvlvlulcu6.R.inc(5004);boxesToBeReturned.add(oneBox);
                    }
                    }__CLR4_5_23tv3tvlvlulcu6.R.inc(5005);boxesToBeReturned.add((T) boxe);
                }
            }}
        }}
        }__CLR4_5_23tv3tvlvlulcu6.R.inc(5006);if ((((boxesToBeReturned != null)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5007)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5008)==0&false))) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5009);return boxesToBeReturned;
        } }else {__CLR4_5_23tv3tvlvlulcu6.R.inc(5010);if ((((oneBox != null)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5011)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5012)==0&false))) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5013);return Collections.singletonList(oneBox);
        } }else {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5014);return Collections.emptyList();
        }
    }}}finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T extends Box> List<T> getBoxes(Class<T> clazz, boolean recursive) {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5015);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5016);List<T> boxesToBeReturned = new ArrayList<T>(2);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5017);List<Box> boxes = getBoxes();
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5018);for (int i = 0; (((i < boxes.size())&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5019)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5020)==0&false)); i++) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5021);Box boxe = boxes.get(i);
            //clazz.isInstance(boxe) / clazz == boxe.getClass()?
            // I hereby finally decide to use isInstance

            __CLR4_5_23tv3tvlvlulcu6.R.inc(5022);if ((((clazz.isInstance(boxe))&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5023)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5024)==0&false))) {{
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5025);boxesToBeReturned.add((T) boxe);
            }

            }__CLR4_5_23tv3tvlvlulcu6.R.inc(5026);if ((((recursive && boxe instanceof Container)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5027)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5028)==0&false))) {{
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5029);boxesToBeReturned.addAll(((Container) boxe).getBoxes(clazz, recursive));
            }
        }}
        }__CLR4_5_23tv3tvlvlulcu6.R.inc(5030);return boxesToBeReturned;
    }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    /**
     * Add <code>box</code> to the container and sets the parent correctly. If <code>box</code> is <code>null</code>
     * nochange will be performed and no error thrown.
     *
     * @param box will be added to the container
     */
    public void addBox(Box box) {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5031);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5032);if ((((box != null)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5033)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5034)==0&false))) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5035);boxes = new ArrayList<Box>(getBoxes());
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5036);box.setParent(this);
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5037);boxes.add(box);
        }
    }}finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    public void initContainer(DataSource dataSource, long containerSize, BoxParser boxParser) throws IOException {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5038);

        __CLR4_5_23tv3tvlvlulcu6.R.inc(5039);this.dataSource = dataSource;
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5040);this.parsePosition = this.startPosition = dataSource.position();
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5041);dataSource.position(dataSource.position() + containerSize);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5042);this.endPosition = dataSource.position();
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5043);this.boxParser = boxParser;
    }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    public void remove() {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5044);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5045);throw new UnsupportedOperationException();
    }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    public boolean hasNext() {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5046);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5047);if ((((lookahead == EOF)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5048)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5049)==0&false))) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5050);return false;
        }
        }__CLR4_5_23tv3tvlvlulcu6.R.inc(5051);if ((((lookahead != null)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5052)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5053)==0&false))) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5054);return true;
        } }else {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5055);try {
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5056);lookahead = next();
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5057);return true;
            } catch (NoSuchElementException e) {
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5058);lookahead = EOF;
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5059);return false;
            }
        }
    }}finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    public Box next() {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5060);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5061);if ((((lookahead != null && lookahead != EOF)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5062)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5063)==0&false))) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5064);Box b = lookahead;
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5065);lookahead = null;
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5066);return b;
        } }else {{
           // LOG.logDebug("Parsing next() box");
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5067);if ((((dataSource == null || parsePosition >= endPosition)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5068)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5069)==0&false))) {{
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5070);lookahead = EOF;
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5071);throw new NoSuchElementException();
            }

            }__CLR4_5_23tv3tvlvlulcu6.R.inc(5072);try {
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5073);synchronized (dataSource) {
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5074);dataSource.position(parsePosition);
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5075);Box b = boxParser.parseBox(dataSource, this);
                    //System.err.println(b.getType());
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5076);parsePosition = dataSource.position();
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5077);return b;
                }
            } catch (EOFException e) {
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5078);throw new NoSuchElementException();
            } catch (IOException e) {
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5079);throw new NoSuchElementException();
            }
        }

    }}finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5080);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5081);StringBuilder buffer = new StringBuilder();

        __CLR4_5_23tv3tvlvlulcu6.R.inc(5082);buffer.append(this.getClass().getSimpleName()).append("[");
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5083);for (int i = 0; (((i < boxes.size())&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5084)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5085)==0&false)); i++) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5086);if ((((i > 0)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5087)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5088)==0&false))) {{
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5089);buffer.append(";");
            }
            }__CLR4_5_23tv3tvlvlulcu6.R.inc(5090);buffer.append(boxes.get(i).toString());
        }
        }__CLR4_5_23tv3tvlvlulcu6.R.inc(5091);buffer.append("]");
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5092);return buffer.toString();
    }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}


    public final void writeContainer(WritableByteChannel bb) throws IOException {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5093);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5094);for (Box box : getBoxes()) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5095);box.getBox(bb);
        }
    }}finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    public ByteBuffer getByteBuffer(long rangeStart, long size) throws IOException {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5096);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5097);if ((((this.dataSource != null)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5098)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5099)==0&false))) {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5100);synchronized (this.dataSource) {
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5101);return this.dataSource.map(this.startPosition + rangeStart, size);
            }
        } }else {{
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5102);ByteBuffer out = ByteBuffer.allocate(l2i(size));
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5103);long rangeEnd = rangeStart + size;
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5104);long boxStart;
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5105);long boxEnd = 0;
            __CLR4_5_23tv3tvlvlulcu6.R.inc(5106);for (Box box : boxes) {{
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5107);boxStart = boxEnd;
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5108);boxEnd = boxStart + box.getSize();
                __CLR4_5_23tv3tvlvlulcu6.R.inc(5109);if ((((!(boxEnd <= rangeStart || boxStart >= rangeEnd))&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5110)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5111)==0&false))) {{
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5112);ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5113);WritableByteChannel wbc = Channels.newChannel(baos);
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5114);box.getBox(wbc);
                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5115);wbc.close();

                    __CLR4_5_23tv3tvlvlulcu6.R.inc(5116);if ((((boxStart >= rangeStart && boxEnd <= rangeEnd)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5117)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5118)==0&false))) {{
                        __CLR4_5_23tv3tvlvlulcu6.R.inc(5119);out.put(baos.toByteArray());
                        // within -> use full box
                    } }else {__CLR4_5_23tv3tvlvlulcu6.R.inc(5120);if ((((boxStart < rangeStart && boxEnd > rangeEnd)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5121)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5122)==0&false))) {{
                        // around -> use 'middle' of box
                        __CLR4_5_23tv3tvlvlulcu6.R.inc(5123);int length = l2i(box.getSize() - (rangeStart - boxStart) - (boxEnd - rangeEnd));
                        __CLR4_5_23tv3tvlvlulcu6.R.inc(5124);out.put(baos.toByteArray(), l2i(rangeStart - boxStart), length);
                    } }else {__CLR4_5_23tv3tvlvlulcu6.R.inc(5125);if ((((boxStart < rangeStart && boxEnd <= rangeEnd)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5126)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5127)==0&false))) {{
                        // endwith
                        __CLR4_5_23tv3tvlvlulcu6.R.inc(5128);int length = l2i(box.getSize() - (rangeStart - boxStart));
                        __CLR4_5_23tv3tvlvlulcu6.R.inc(5129);out.put(baos.toByteArray(), l2i(rangeStart - boxStart), length);
                    } }else {__CLR4_5_23tv3tvlvlulcu6.R.inc(5130);if ((((boxStart >= rangeStart && boxEnd > rangeEnd)&&(__CLR4_5_23tv3tvlvlulcu6.R.iget(5131)!=0|true))||(__CLR4_5_23tv3tvlvlulcu6.R.iget(5132)==0&false))) {{
                        __CLR4_5_23tv3tvlvlulcu6.R.inc(5133);int length = l2i(box.getSize() - (boxEnd - rangeEnd));
                        __CLR4_5_23tv3tvlvlulcu6.R.inc(5134);out.put(baos.toByteArray(), 0, length);
                    }
                }}}}}
            }}
            }__CLR4_5_23tv3tvlvlulcu6.R.inc(5135);return (ByteBuffer) out.rewind();
        }
    }}finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_23tv3tvlvlulcu6.R.inc(5136);
        __CLR4_5_23tv3tvlvlulcu6.R.inc(5137);dataSource.close();
    }finally{__CLR4_5_23tv3tvlvlulcu6.R.flushNeeded();}}
}
