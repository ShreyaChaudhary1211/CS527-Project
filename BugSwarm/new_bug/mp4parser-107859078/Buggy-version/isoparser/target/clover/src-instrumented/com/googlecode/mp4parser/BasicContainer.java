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
public class BasicContainer implements Container, Iterator<Box>, Closeable {public static class __CLR4_5_23sy3sylvl9efxr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0030\u0037\u0038\u0035\u0039\u0030\u0037\u0038\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714413275835L,8589935092L,5105,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Box EOF = new AbstractBox("eof ") {

        @Override
        protected long getContentSize() {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4930);
            __CLR4_5_23sy3sylvl9efxr.R.inc(4931);return 0;
        }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

        @Override
        protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4932);
        }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

        @Override
        protected void _parseDetails(ByteBuffer content) {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4933);
        }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}
    };
    private static Logger LOG = Logger.getLogger(BasicContainer.class);
    protected BoxParser boxParser;
    protected DataSource dataSource;
    Box lookahead = null;
    long parsePosition = 0;
    long startPosition = 0;
    long endPosition = 0;
    private List<Box> boxes = new ArrayList<Box>();

    public BasicContainer() {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4934);
    }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    public List<Box> getBoxes() {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4935);
        __CLR4_5_23sy3sylvl9efxr.R.inc(4936);if ((((dataSource != null && lookahead != EOF)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4937)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4938)==0&false))) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(4939);return new LazyList<Box>(boxes, this);
        } }else {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(4940);return boxes;
        }
    }}finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    public void setBoxes(List<Box> boxes) {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4941);
        __CLR4_5_23sy3sylvl9efxr.R.inc(4942);this.boxes = new ArrayList<Box>(boxes);
        __CLR4_5_23sy3sylvl9efxr.R.inc(4943);this.lookahead = EOF;
        __CLR4_5_23sy3sylvl9efxr.R.inc(4944);this.dataSource = null;
    }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    protected long getContainerSize() {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4945);
        __CLR4_5_23sy3sylvl9efxr.R.inc(4946);long contentSize = 0;
        __CLR4_5_23sy3sylvl9efxr.R.inc(4947);for (int i = 0; (((i < getBoxes().size())&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4948)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4949)==0&false)); i++) {{
            // it's quicker to iterate an array list like that since no iterator
            // needs to be instantiated
            __CLR4_5_23sy3sylvl9efxr.R.inc(4950);contentSize += boxes.get(i).getSize();
        }
        }__CLR4_5_23sy3sylvl9efxr.R.inc(4951);return contentSize;
    }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T extends Box> List<T> getBoxes(Class<T> clazz) {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4952);
        __CLR4_5_23sy3sylvl9efxr.R.inc(4953);List<T> boxesToBeReturned = null;
        __CLR4_5_23sy3sylvl9efxr.R.inc(4954);T oneBox = null;
        __CLR4_5_23sy3sylvl9efxr.R.inc(4955);List<Box> boxes = getBoxes();
        __CLR4_5_23sy3sylvl9efxr.R.inc(4956);for (int i = 0; (((i < boxes.size())&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4957)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4958)==0&false)); i++) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(4959);Box boxe = boxes.get(i);
            //clazz.isInstance(boxe) / clazz == boxe.getClass()?
            // I hereby finally decide to use isInstance

            __CLR4_5_23sy3sylvl9efxr.R.inc(4960);if ((((clazz.isInstance(boxe))&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4961)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4962)==0&false))) {{
                __CLR4_5_23sy3sylvl9efxr.R.inc(4963);if ((((oneBox == null)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4964)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4965)==0&false))) {{
                    __CLR4_5_23sy3sylvl9efxr.R.inc(4966);oneBox = (T) boxe;
                } }else {{
                    __CLR4_5_23sy3sylvl9efxr.R.inc(4967);if ((((boxesToBeReturned == null)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4968)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4969)==0&false))) {{
                        __CLR4_5_23sy3sylvl9efxr.R.inc(4970);boxesToBeReturned = new ArrayList<T>(2);
                        __CLR4_5_23sy3sylvl9efxr.R.inc(4971);boxesToBeReturned.add(oneBox);
                    }
                    }__CLR4_5_23sy3sylvl9efxr.R.inc(4972);boxesToBeReturned.add((T) boxe);
                }
            }}
        }}
        }__CLR4_5_23sy3sylvl9efxr.R.inc(4973);if ((((boxesToBeReturned != null)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4974)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4975)==0&false))) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(4976);return boxesToBeReturned;
        } }else {__CLR4_5_23sy3sylvl9efxr.R.inc(4977);if ((((oneBox != null)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4978)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4979)==0&false))) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(4980);return Collections.singletonList(oneBox);
        } }else {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(4981);return Collections.emptyList();
        }
    }}}finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T extends Box> List<T> getBoxes(Class<T> clazz, boolean recursive) {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4982);
        __CLR4_5_23sy3sylvl9efxr.R.inc(4983);List<T> boxesToBeReturned = new ArrayList<T>(2);
        __CLR4_5_23sy3sylvl9efxr.R.inc(4984);List<Box> boxes = getBoxes();
        __CLR4_5_23sy3sylvl9efxr.R.inc(4985);for (int i = 0; (((i < boxes.size())&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4986)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4987)==0&false)); i++) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(4988);Box boxe = boxes.get(i);
            //clazz.isInstance(boxe) / clazz == boxe.getClass()?
            // I hereby finally decide to use isInstance

            __CLR4_5_23sy3sylvl9efxr.R.inc(4989);if ((((clazz.isInstance(boxe))&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4990)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4991)==0&false))) {{
                __CLR4_5_23sy3sylvl9efxr.R.inc(4992);boxesToBeReturned.add((T) boxe);
            }

            }__CLR4_5_23sy3sylvl9efxr.R.inc(4993);if ((((recursive && boxe instanceof Container)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(4994)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(4995)==0&false))) {{
                __CLR4_5_23sy3sylvl9efxr.R.inc(4996);boxesToBeReturned.addAll(((Container) boxe).getBoxes(clazz, recursive));
            }
        }}
        }__CLR4_5_23sy3sylvl9efxr.R.inc(4997);return boxesToBeReturned;
    }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    /**
     * Add <code>box</code> to the container and sets the parent correctly. If <code>box</code> is <code>null</code>
     * nochange will be performed and no error thrown.
     *
     * @param box will be added to the container
     */
    public void addBox(Box box) {try{__CLR4_5_23sy3sylvl9efxr.R.inc(4998);
        __CLR4_5_23sy3sylvl9efxr.R.inc(4999);if ((((box != null)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5000)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5001)==0&false))) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(5002);boxes = new ArrayList<Box>(getBoxes());
            __CLR4_5_23sy3sylvl9efxr.R.inc(5003);box.setParent(this);
            __CLR4_5_23sy3sylvl9efxr.R.inc(5004);boxes.add(box);
        }
    }}finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    public void initContainer(DataSource dataSource, long containerSize, BoxParser boxParser) throws IOException {try{__CLR4_5_23sy3sylvl9efxr.R.inc(5005);

        __CLR4_5_23sy3sylvl9efxr.R.inc(5006);this.dataSource = dataSource;
        __CLR4_5_23sy3sylvl9efxr.R.inc(5007);this.parsePosition = this.startPosition = dataSource.position();
        __CLR4_5_23sy3sylvl9efxr.R.inc(5008);dataSource.position(dataSource.position() + containerSize);
        __CLR4_5_23sy3sylvl9efxr.R.inc(5009);this.endPosition = dataSource.position();
        __CLR4_5_23sy3sylvl9efxr.R.inc(5010);this.boxParser = boxParser;
    }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    public void remove() {try{__CLR4_5_23sy3sylvl9efxr.R.inc(5011);
        __CLR4_5_23sy3sylvl9efxr.R.inc(5012);throw new UnsupportedOperationException();
    }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    public boolean hasNext() {try{__CLR4_5_23sy3sylvl9efxr.R.inc(5013);
        __CLR4_5_23sy3sylvl9efxr.R.inc(5014);if ((((lookahead == EOF)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5015)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5016)==0&false))) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(5017);return false;
        }
        }__CLR4_5_23sy3sylvl9efxr.R.inc(5018);if ((((lookahead != null)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5019)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5020)==0&false))) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(5021);return true;
        } }else {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(5022);try {
                __CLR4_5_23sy3sylvl9efxr.R.inc(5023);lookahead = next();
                __CLR4_5_23sy3sylvl9efxr.R.inc(5024);return true;
            } catch (NoSuchElementException e) {
                __CLR4_5_23sy3sylvl9efxr.R.inc(5025);lookahead = EOF;
                __CLR4_5_23sy3sylvl9efxr.R.inc(5026);return false;
            }
        }
    }}finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    public Box next() {try{__CLR4_5_23sy3sylvl9efxr.R.inc(5027);
        __CLR4_5_23sy3sylvl9efxr.R.inc(5028);if ((((lookahead != null && lookahead != EOF)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5029)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5030)==0&false))) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(5031);Box b = lookahead;
            __CLR4_5_23sy3sylvl9efxr.R.inc(5032);lookahead = null;
            __CLR4_5_23sy3sylvl9efxr.R.inc(5033);return b;
        } }else {{
           // LOG.logDebug("Parsing next() box");
            __CLR4_5_23sy3sylvl9efxr.R.inc(5034);if ((((dataSource == null || parsePosition >= endPosition)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5035)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5036)==0&false))) {{
                __CLR4_5_23sy3sylvl9efxr.R.inc(5037);lookahead = EOF;
                __CLR4_5_23sy3sylvl9efxr.R.inc(5038);throw new NoSuchElementException();
            }

            }__CLR4_5_23sy3sylvl9efxr.R.inc(5039);try {
                __CLR4_5_23sy3sylvl9efxr.R.inc(5040);synchronized (dataSource) {
                    __CLR4_5_23sy3sylvl9efxr.R.inc(5041);dataSource.position(parsePosition);
                    __CLR4_5_23sy3sylvl9efxr.R.inc(5042);Box b = boxParser.parseBox(dataSource, this);
                    //System.err.println(b.getType());
                    __CLR4_5_23sy3sylvl9efxr.R.inc(5043);parsePosition = dataSource.position();
                    __CLR4_5_23sy3sylvl9efxr.R.inc(5044);return b;
                }
            } catch (EOFException e) {
                __CLR4_5_23sy3sylvl9efxr.R.inc(5045);throw new NoSuchElementException();
            } catch (IOException e) {
                __CLR4_5_23sy3sylvl9efxr.R.inc(5046);throw new NoSuchElementException();
            }
        }

    }}finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_23sy3sylvl9efxr.R.inc(5047);
        __CLR4_5_23sy3sylvl9efxr.R.inc(5048);StringBuilder buffer = new StringBuilder();

        __CLR4_5_23sy3sylvl9efxr.R.inc(5049);buffer.append(this.getClass().getSimpleName()).append("[");
        __CLR4_5_23sy3sylvl9efxr.R.inc(5050);for (int i = 0; (((i < boxes.size())&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5051)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5052)==0&false)); i++) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(5053);if ((((i > 0)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5054)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5055)==0&false))) {{
                __CLR4_5_23sy3sylvl9efxr.R.inc(5056);buffer.append(";");
            }
            }__CLR4_5_23sy3sylvl9efxr.R.inc(5057);buffer.append(boxes.get(i).toString());
        }
        }__CLR4_5_23sy3sylvl9efxr.R.inc(5058);buffer.append("]");
        __CLR4_5_23sy3sylvl9efxr.R.inc(5059);return buffer.toString();
    }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}


    public final void writeContainer(WritableByteChannel bb) throws IOException {try{__CLR4_5_23sy3sylvl9efxr.R.inc(5060);
        __CLR4_5_23sy3sylvl9efxr.R.inc(5061);for (Box box : getBoxes()) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(5062);box.getBox(bb);
        }
    }}finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    public ByteBuffer getByteBuffer(long rangeStart, long size) throws IOException {try{__CLR4_5_23sy3sylvl9efxr.R.inc(5063);
        __CLR4_5_23sy3sylvl9efxr.R.inc(5064);if ((((this.dataSource != null)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5065)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5066)==0&false))) {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(5067);synchronized (this.dataSource) {
                __CLR4_5_23sy3sylvl9efxr.R.inc(5068);return this.dataSource.map(this.startPosition + rangeStart, size);
            }
        } }else {{
            __CLR4_5_23sy3sylvl9efxr.R.inc(5069);ByteBuffer out = ByteBuffer.allocate(l2i(size));
            __CLR4_5_23sy3sylvl9efxr.R.inc(5070);long rangeEnd = rangeStart + size;
            __CLR4_5_23sy3sylvl9efxr.R.inc(5071);long boxStart;
            __CLR4_5_23sy3sylvl9efxr.R.inc(5072);long boxEnd = 0;
            __CLR4_5_23sy3sylvl9efxr.R.inc(5073);for (Box box : boxes) {{
                __CLR4_5_23sy3sylvl9efxr.R.inc(5074);boxStart = boxEnd;
                __CLR4_5_23sy3sylvl9efxr.R.inc(5075);boxEnd = boxStart + box.getSize();
                __CLR4_5_23sy3sylvl9efxr.R.inc(5076);if ((((!(boxEnd <= rangeStart || boxStart >= rangeEnd))&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5077)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5078)==0&false))) {{
                    __CLR4_5_23sy3sylvl9efxr.R.inc(5079);ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    __CLR4_5_23sy3sylvl9efxr.R.inc(5080);WritableByteChannel wbc = Channels.newChannel(baos);
                    __CLR4_5_23sy3sylvl9efxr.R.inc(5081);box.getBox(wbc);
                    __CLR4_5_23sy3sylvl9efxr.R.inc(5082);wbc.close();

                    __CLR4_5_23sy3sylvl9efxr.R.inc(5083);if ((((boxStart >= rangeStart && boxEnd <= rangeEnd)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5084)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5085)==0&false))) {{
                        __CLR4_5_23sy3sylvl9efxr.R.inc(5086);out.put(baos.toByteArray());
                        // within -> use full box
                    } }else {__CLR4_5_23sy3sylvl9efxr.R.inc(5087);if ((((boxStart < rangeStart && boxEnd > rangeEnd)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5088)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5089)==0&false))) {{
                        // around -> use 'middle' of box
                        __CLR4_5_23sy3sylvl9efxr.R.inc(5090);int length = l2i(box.getSize() - (rangeStart - boxStart) - (boxEnd - rangeEnd));
                        __CLR4_5_23sy3sylvl9efxr.R.inc(5091);out.put(baos.toByteArray(), l2i(rangeStart - boxStart), length);
                    } }else {__CLR4_5_23sy3sylvl9efxr.R.inc(5092);if ((((boxStart < rangeStart && boxEnd <= rangeEnd)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5093)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5094)==0&false))) {{
                        // endwith
                        __CLR4_5_23sy3sylvl9efxr.R.inc(5095);int length = l2i(box.getSize() - (rangeStart - boxStart));
                        __CLR4_5_23sy3sylvl9efxr.R.inc(5096);out.put(baos.toByteArray(), l2i(rangeStart - boxStart), length);
                    } }else {__CLR4_5_23sy3sylvl9efxr.R.inc(5097);if ((((boxStart >= rangeStart && boxEnd > rangeEnd)&&(__CLR4_5_23sy3sylvl9efxr.R.iget(5098)!=0|true))||(__CLR4_5_23sy3sylvl9efxr.R.iget(5099)==0&false))) {{
                        __CLR4_5_23sy3sylvl9efxr.R.inc(5100);int length = l2i(box.getSize() - (boxEnd - rangeEnd));
                        __CLR4_5_23sy3sylvl9efxr.R.inc(5101);out.put(baos.toByteArray(), 0, length);
                    }
                }}}}}
            }}
            }__CLR4_5_23sy3sylvl9efxr.R.inc(5102);return (ByteBuffer) out.rewind();
        }
    }}finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}

    public void close() throws IOException {try{__CLR4_5_23sy3sylvl9efxr.R.inc(5103);
        __CLR4_5_23sy3sylvl9efxr.R.inc(5104);dataSource.close();
    }finally{__CLR4_5_23sy3sylvl9efxr.R.flushNeeded();}}
}
