/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.oboformat.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.oboformat.model.*;
import org.obolibrary.oboformat.model.Frame.FrameType;
import org.obolibrary.oboformat.parser.OBOFormatConstants.OboFormatTag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.Weigher;

/** implements the OBO Format 1.4 specification. */
@java.lang.SuppressWarnings({"fallthrough"}) public class OBOFormatParser {public static class __CLR4_5_23fp3fplvicmt67{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,5663,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final Logger LOG = LoggerFactory.getLogger(OBOFormatParser.class);

    // TODO use this to validate date strings for OboFormatTag.TAG_CREATION_DATE
    @Nonnull
    protected static SimpleDateFormat getISODateFormat() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4453);
        __CLR4_5_23fp3fplvicmt67.R.inc(4454);return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private boolean followImport;
    private Object location;
    protected final MyStream stream;
    public final com.google.common.cache.LoadingCache<String, String> stringCache;

    /**
     *
     */
    public OBOFormatParser() {
        this(new MyStream());__CLR4_5_23fp3fplvicmt67.R.inc(4456);try{__CLR4_5_23fp3fplvicmt67.R.inc(4455);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @param s
     */
    protected OBOFormatParser(MyStream s) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4457);
        __CLR4_5_23fp3fplvicmt67.R.inc(4458);stream = s;
        __CLR4_5_23fp3fplvicmt67.R.inc(4459);Weigher<String, String> stringWeigher = new Weigher<String, String>() {

            @Override
            public int weigh(String key, String value) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4460);
                __CLR4_5_23fp3fplvicmt67.R.inc(4461);return key.length();
            }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}
        };
        __CLR4_5_23fp3fplvicmt67.R.inc(4462);CacheLoader<String, String> loader = new CacheLoader<String, String>() {

            @Override
            public String load(String key) throws Exception {try{__CLR4_5_23fp3fplvicmt67.R.inc(4463);
                __CLR4_5_23fp3fplvicmt67.R.inc(4464);return key;
            }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}
        };
        __CLR4_5_23fp3fplvicmt67.R.inc(4465);if ((((LOG.isDebugEnabled())&&(__CLR4_5_23fp3fplvicmt67.R.iget(4466)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4467)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4468);stringCache = CacheBuilder.newBuilder().recordStats().maximumWeight(8192 * 1024).weigher(stringWeigher)
                .build(loader);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4469);stringCache = CacheBuilder.newBuilder().maximumWeight(8192 * 1024).weigher(stringWeigher).build(loader);
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    protected static class MyStream {

        int pos = 0;
        String line;
        int lineNo = 0;
        BufferedReader reader;

        public MyStream() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4470);
            __CLR4_5_23fp3fplvicmt67.R.inc(4471);pos = 0;
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public MyStream(BufferedReader r) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4472);
            __CLR4_5_23fp3fplvicmt67.R.inc(4473);reader = r;
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        protected char peekChar() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4474);
            __CLR4_5_23fp3fplvicmt67.R.inc(4475);prepare();
            __CLR4_5_23fp3fplvicmt67.R.inc(4476);return line.charAt(pos);
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public char nextChar() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4477);
            __CLR4_5_23fp3fplvicmt67.R.inc(4478);pos++;
            __CLR4_5_23fp3fplvicmt67.R.inc(4479);return line.charAt(pos - 1);
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        @Nullable
        public String rest() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4480);
            __CLR4_5_23fp3fplvicmt67.R.inc(4481);prepare();
            __CLR4_5_23fp3fplvicmt67.R.inc(4482);if ((((line == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4483)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4484)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4485);return null;
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4486);if ((((pos >= line.length())&&(__CLR4_5_23fp3fplvicmt67.R.iget(4487)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4488)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4489);return "";
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4490);return line.substring(pos);
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public void advance(int dist) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4491);
            __CLR4_5_23fp3fplvicmt67.R.inc(4492);pos += dist;
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public void prepare() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4493);
            __CLR4_5_23fp3fplvicmt67.R.inc(4494);if ((((line == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4495)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4496)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4497);advanceLine();
            }
        }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public void advanceLine() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4498);
            __CLR4_5_23fp3fplvicmt67.R.inc(4499);try {
                __CLR4_5_23fp3fplvicmt67.R.inc(4500);line = reader.readLine();
                __CLR4_5_23fp3fplvicmt67.R.inc(4501);lineNo++;
                __CLR4_5_23fp3fplvicmt67.R.inc(4502);pos = 0;
            } catch (IOException e) {
                __CLR4_5_23fp3fplvicmt67.R.inc(4503);throw new OBOFormatParserException(e, lineNo, "Error reading from input.");
            }
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public void forceEol() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4504);
            __CLR4_5_23fp3fplvicmt67.R.inc(4505);if ((((line == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4506)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4507)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4508);return;
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4509);pos = line.length();
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public boolean eol() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4510);
            __CLR4_5_23fp3fplvicmt67.R.inc(4511);prepare();
            __CLR4_5_23fp3fplvicmt67.R.inc(4512);if ((((line == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4513)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4514)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4515);return false;
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4516);return pos >= line.length();
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public boolean eof() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4517);
            __CLR4_5_23fp3fplvicmt67.R.inc(4518);prepare();
            __CLR4_5_23fp3fplvicmt67.R.inc(4519);return line == null;
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        @Nonnull
        public static String getTag() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4520);
            __CLR4_5_23fp3fplvicmt67.R.inc(4521);return "";
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public boolean consume(@Nonnull String s) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4522);
            __CLR4_5_23fp3fplvicmt67.R.inc(4523);String r = rest();
            __CLR4_5_23fp3fplvicmt67.R.inc(4524);if ((((r == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4525)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4526)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4527);return false;
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4528);if ((((r.startsWith(s))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4529)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4530)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4531);pos += s.length();
                __CLR4_5_23fp3fplvicmt67.R.inc(4532);return true;
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4533);return false;
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public int indexOf(char c) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4534);
            __CLR4_5_23fp3fplvicmt67.R.inc(4535);prepare();
            __CLR4_5_23fp3fplvicmt67.R.inc(4536);if ((((line == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4537)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4538)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4539);return -1;
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4540);return line.substring(pos).indexOf(c);
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        @Nonnull
        @Override
        public String toString() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4541);
            __CLR4_5_23fp3fplvicmt67.R.inc(4542);return line + "//" + pos + " LINE:" + lineNo;
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public boolean peekCharIs(char c) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4543);
            __CLR4_5_23fp3fplvicmt67.R.inc(4544);if ((((eol() || eof())&&(__CLR4_5_23fp3fplvicmt67.R.iget(4545)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4546)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4547);return false;
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4548);return peekChar() == c;
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

        public int getLineNo() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4549);
            __CLR4_5_23fp3fplvicmt67.R.inc(4550);return lineNo;
        }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}
    }

    /**
     * @param r
     *        r
     */
    public void setReader(BufferedReader r) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4551);
        __CLR4_5_23fp3fplvicmt67.R.inc(4552);stream.reader = r;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @param followImports
     *        followImports
     */
    public void setFollowImports(boolean followImports) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4553);
        __CLR4_5_23fp3fplvicmt67.R.inc(4554);followImport = followImports;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @return follow imports
     */
    public boolean getFollowImports() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4555);
        __CLR4_5_23fp3fplvicmt67.R.inc(4556);return followImport;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * Parses a local file or URL to an OBODoc.
     * 
     * @param fn
     *        fn
     * @return parsed obo document
     * @throws IOException
     *         io exception
     * @throws OBOFormatParserException
     *         parser exception
     */
    @Nonnull
    public OBODoc parse(@Nonnull String fn) throws IOException {try{__CLR4_5_23fp3fplvicmt67.R.inc(4557);
        __CLR4_5_23fp3fplvicmt67.R.inc(4558);if ((((fn.startsWith("http:"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4559)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4560)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4561);return parse(new URL(fn));
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4562);return parse(new File(fn));
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * Parses a local file to an OBODoc.
     * 
     * @param file
     *        file
     * @return parsed obo document
     * @throws IOException
     *         io exception
     * @throws OBOFormatParserException
     *         parser exception
     */
    @Nonnull
    public OBODoc parse(File file) throws IOException {try{__CLR4_5_23fp3fplvicmt67.R.inc(4563);
        __CLR4_5_23fp3fplvicmt67.R.inc(4564);location = file;
        __CLR4_5_23fp3fplvicmt67.R.inc(4565);BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file),
            OBOFormatConstants.DEFAULT_CHARACTER_ENCODING));
        __CLR4_5_23fp3fplvicmt67.R.inc(4566);try {
            __CLR4_5_23fp3fplvicmt67.R.inc(4567);return parse(in);
        } finally {
            __CLR4_5_23fp3fplvicmt67.R.inc(4568);in.close();
        }
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * Parses a remote URL to an OBODoc.
     * 
     * @param url
     *        url
     * @return parsed obo document
     * @throws IOException
     *         io exception
     * @throws OBOFormatParserException
     *         parser exception
     */
    @Nonnull
    public OBODoc parse(@Nonnull URL url) throws IOException {try{__CLR4_5_23fp3fplvicmt67.R.inc(4569);
        __CLR4_5_23fp3fplvicmt67.R.inc(4570);location = url;
        __CLR4_5_23fp3fplvicmt67.R.inc(4571);BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(),
            OBOFormatConstants.DEFAULT_CHARACTER_ENCODING));
        __CLR4_5_23fp3fplvicmt67.R.inc(4572);return parse(in);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * Parses a remote URL to an OBODoc.
     * 
     * @param urlstr
     *        urlstr
     * @return parsed obo document
     * @throws IOException
     *         io exception
     * @throws OBOFormatParserException
     *         parser exception
     */
    @Nonnull
    public OBODoc parseURL(String urlstr) throws IOException {try{__CLR4_5_23fp3fplvicmt67.R.inc(4573);
        __CLR4_5_23fp3fplvicmt67.R.inc(4574);URL url = new URL(urlstr);
        __CLR4_5_23fp3fplvicmt67.R.inc(4575);return parse(url);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    @Nonnull
    private String resolvePath(@Nonnull String inputPath) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4576);
        __CLR4_5_23fp3fplvicmt67.R.inc(4577);String path = inputPath;
        __CLR4_5_23fp3fplvicmt67.R.inc(4578);if ((((!(path.startsWith("http:") || path.startsWith("file:") || path.startsWith("https:")))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4579)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4580)==0&false))) {{
            // path is not absolue then guess it.
            __CLR4_5_23fp3fplvicmt67.R.inc(4581);if ((((location != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4582)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4583)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4584);if ((((location instanceof URL)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4585)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4586)==0&false))) {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(4587);URL url = (URL) location;
                    __CLR4_5_23fp3fplvicmt67.R.inc(4588);String p = url.toString();
                    __CLR4_5_23fp3fplvicmt67.R.inc(4589);int index = p.lastIndexOf('/');
                    __CLR4_5_23fp3fplvicmt67.R.inc(4590);path = p.substring(0, index + 1) + path;
                } }else {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(4591);File f = new File(location.toString());
                    __CLR4_5_23fp3fplvicmt67.R.inc(4592);f = new File(f.getParent(), path);
                    __CLR4_5_23fp3fplvicmt67.R.inc(4593);path = f.toURI().toString();
                }
            }}
        }}
        }__CLR4_5_23fp3fplvicmt67.R.inc(4594);return path;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @param reader
     *        reader
     * @return parsed obo document
     * @throws IOException
     *         io exception
     * @throws OBOFormatParserException
     *         parser exception
     */
    @Nonnull
    public OBODoc parse(BufferedReader reader) throws IOException {try{__CLR4_5_23fp3fplvicmt67.R.inc(4595);
        __CLR4_5_23fp3fplvicmt67.R.inc(4596);setReader(reader);
        __CLR4_5_23fp3fplvicmt67.R.inc(4597);OBODoc obodoc = new OBODoc();
        __CLR4_5_23fp3fplvicmt67.R.inc(4598);parseOBODoc(obodoc);
        // handle imports
        __CLR4_5_23fp3fplvicmt67.R.inc(4599);Frame hf = obodoc.getHeaderFrame();
        __CLR4_5_23fp3fplvicmt67.R.inc(4600);List<OBODoc> imports = new LinkedList<>();
        __CLR4_5_23fp3fplvicmt67.R.inc(4601);if ((((hf != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4602)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4603)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4604);for (Clause cl : hf.getClauses(OboFormatTag.TAG_IMPORT)) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4605);@SuppressWarnings("null")
                String path = resolvePath(cl.getValue(String.class));
                // TBD -- changing the relative path to absolute
                __CLR4_5_23fp3fplvicmt67.R.inc(4606);cl.setValue(path);
                __CLR4_5_23fp3fplvicmt67.R.inc(4607);if ((((followImport)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4608)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4609)==0&false))) {{
                    // resolve OboDoc documents from import paths.
                    __CLR4_5_23fp3fplvicmt67.R.inc(4610);OBOFormatParser parser = new OBOFormatParser();
                    __CLR4_5_23fp3fplvicmt67.R.inc(4611);OBODoc doc = parser.parseURL(path);
                    __CLR4_5_23fp3fplvicmt67.R.inc(4612);imports.add(doc);
                } /*
                   * else{ //build a proxy document which reference import path
                   * as ontology id Frame importHeaer = new
                   * Frame(FrameType.HEADER); Clause ontologyCl = new Clause();
                   * ontologyCl.setTag(OboFormatTag.TAG_ONTOLOGY.getTag());
                   * ontologyCl.setValue(path);
                   * importHeaer.addClause(ontologyCl);
                   * doc.setHeaderFrame(importHeaer); }
                   */
            }}
            }__CLR4_5_23fp3fplvicmt67.R.inc(4613);obodoc.setImportedOBODocs(imports);
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4614);return obodoc;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // GRAMMAR
    // ----------------------------------------
    /**
     * @param obodoc
     *        obodoc
     * @throws OBOFormatParserException
     *         parser exception
     */
    public void parseOBODoc(@Nonnull OBODoc obodoc) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4615);
        __CLR4_5_23fp3fplvicmt67.R.inc(4616);Frame h = new Frame(FrameType.HEADER);
        __CLR4_5_23fp3fplvicmt67.R.inc(4617);obodoc.setHeaderFrame(h);
        __CLR4_5_23fp3fplvicmt67.R.inc(4618);parseHeaderFrame(h);
        __CLR4_5_23fp3fplvicmt67.R.inc(4619);h.freeze();
        __CLR4_5_23fp3fplvicmt67.R.inc(4620);parseZeroOrMoreWsOptCmtNl();
        __CLR4_5_23fp3fplvicmt67.R.inc(4621);while ((((!stream.eof())&&(__CLR4_5_23fp3fplvicmt67.R.iget(4622)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4623)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4624);parseEntityFrame(obodoc);
            __CLR4_5_23fp3fplvicmt67.R.inc(4625);parseZeroOrMoreWsOptCmtNl();
        }
        // set OBO namespace in frames
        }__CLR4_5_23fp3fplvicmt67.R.inc(4626);String defaultOboNamespace = h.getTagValue(OboFormatTag.TAG_DEFAULT_NAMESPACE, String.class);
        __CLR4_5_23fp3fplvicmt67.R.inc(4627);if ((((defaultOboNamespace != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4628)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4629)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4630);addOboNamespace(obodoc.getTermFrames(), defaultOboNamespace);
            __CLR4_5_23fp3fplvicmt67.R.inc(4631);addOboNamespace(obodoc.getTypedefFrames(), defaultOboNamespace);
            __CLR4_5_23fp3fplvicmt67.R.inc(4632);addOboNamespace(obodoc.getInstanceFrames(), defaultOboNamespace);
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private static void addOboNamespace(@Nullable Collection<Frame> frames, String defaultOboNamespace) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4633);
        __CLR4_5_23fp3fplvicmt67.R.inc(4634);if ((((frames != null && !frames.isEmpty())&&(__CLR4_5_23fp3fplvicmt67.R.iget(4635)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4636)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4637);for (Frame termFrame : frames) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4638);Clause clause = termFrame.getClause(OboFormatTag.TAG_NAMESPACE);
                __CLR4_5_23fp3fplvicmt67.R.inc(4639);if ((((clause == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4640)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4641)==0&false))) {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(4642);clause = new Clause(OboFormatTag.TAG_NAMESPACE, defaultOboNamespace);
                    __CLR4_5_23fp3fplvicmt67.R.inc(4643);termFrame.addClause(clause);
                }
            }}
        }}
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @param doc
     *        doc
     * @return list of references
     * @throws OBOFormatDanglingReferenceException
     *         dangling reference error
     */
    @SuppressWarnings("null")
    @Nonnull
    public List<String> checkDanglingReferences(@Nonnull OBODoc doc) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4644);
        __CLR4_5_23fp3fplvicmt67.R.inc(4645);List<String> danglingReferences = new ArrayList<>();
        // check term frames
        __CLR4_5_23fp3fplvicmt67.R.inc(4646);for (Frame f : doc.getTermFrames()) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4647);for (String tag : f.getTags()) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4648);OboFormatTag tagconstant = OBOFormatConstants.getTag(tag);
                __CLR4_5_23fp3fplvicmt67.R.inc(4649);Clause c = f.getClause(tag);
                __CLR4_5_23fp3fplvicmt67.R.inc(4650);if ((((tagconstant == OboFormatTag.TAG_INTERSECTION_OF || tagconstant == OboFormatTag.TAG_UNION_OF
                    || tagconstant == OboFormatTag.TAG_EQUIVALENT_TO || tagconstant == OboFormatTag.TAG_DISJOINT_FROM
                    || tagconstant == OboFormatTag.TAG_RELATIONSHIP || tagconstant == OboFormatTag.TAG_IS_A)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4651)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4652)==0&false))) {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(4653);if ((((c.getValues().size() > 1)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4654)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4655)==0&false))) {{
                        __CLR4_5_23fp3fplvicmt67.R.inc(4656);String error = checkRelation(c.getValue(String.class), tag, f.getId(), doc);
                        __CLR4_5_23fp3fplvicmt67.R.inc(4657);if ((((error != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4658)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4659)==0&false))) {{
                            __CLR4_5_23fp3fplvicmt67.R.inc(4660);danglingReferences.add(error);
                        }
                        }__CLR4_5_23fp3fplvicmt67.R.inc(4661);error = checkClassReference(c.getValue2(String.class), tag, f.getId(), doc);
                        __CLR4_5_23fp3fplvicmt67.R.inc(4662);if ((((error != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4663)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4664)==0&false))) {{
                            __CLR4_5_23fp3fplvicmt67.R.inc(4665);danglingReferences.add(error);
                        }
                    }} }else {{
                        __CLR4_5_23fp3fplvicmt67.R.inc(4666);String error = checkClassReference(c.getValue(String.class), tag, f.getId(), doc);
                        __CLR4_5_23fp3fplvicmt67.R.inc(4667);if ((((error != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4668)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4669)==0&false))) {{
                            __CLR4_5_23fp3fplvicmt67.R.inc(4670);danglingReferences.add(error);
                        }
                    }}
                }}
            }}
        }}
        // check typedef frames
        }__CLR4_5_23fp3fplvicmt67.R.inc(4671);for (Frame f : doc.getTypedefFrames()) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4672);for (String tag : f.getTags()) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4673);OboFormatTag tagConstant = OBOFormatConstants.getTag(tag);
                __CLR4_5_23fp3fplvicmt67.R.inc(4674);Clause c = f.getClause(tag);
                assert (((c != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4675)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4676)==0&false));
                __CLR4_5_23fp3fplvicmt67.R.inc(4677);if ((((tagConstant == OboFormatTag.TAG_IS_A || tagConstant == OboFormatTag.TAG_INTERSECTION_OF
                    || tagConstant == OboFormatTag.TAG_UNION_OF || tagConstant == OboFormatTag.TAG_EQUIVALENT_TO
                    || tagConstant == OboFormatTag.TAG_DISJOINT_FROM || tagConstant == OboFormatTag.TAG_INVERSE_OF
                    || tagConstant == OboFormatTag.TAG_TRANSITIVE_OVER
                    || tagConstant == OboFormatTag.TAG_DISJOINT_OVER)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4678)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4679)==0&false))) {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(4680);String error = checkRelation(c.getValue(String.class), tag, f.getId(), doc);
                    __CLR4_5_23fp3fplvicmt67.R.inc(4681);if ((((error != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4682)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4683)==0&false))) {{
                        __CLR4_5_23fp3fplvicmt67.R.inc(4684);danglingReferences.add(error);
                    }
                }} }else {__CLR4_5_23fp3fplvicmt67.R.inc(4685);if ((((tagConstant == OboFormatTag.TAG_HOLDS_OVER_CHAIN
                    || tagConstant == OboFormatTag.TAG_EQUIVALENT_TO_CHAIN
                    || tagConstant == OboFormatTag.TAG_RELATIONSHIP)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4686)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4687)==0&false))) {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(4688);String error = checkRelation(c.getValue().toString(), tag, f.getId(), doc);
                    __CLR4_5_23fp3fplvicmt67.R.inc(4689);if ((((error != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4690)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4691)==0&false))) {{
                        __CLR4_5_23fp3fplvicmt67.R.inc(4692);danglingReferences.add(error);
                    }
                    }__CLR4_5_23fp3fplvicmt67.R.inc(4693);error = checkRelation(c.getValue2().toString(), tag, f.getId(), doc);
                    __CLR4_5_23fp3fplvicmt67.R.inc(4694);if ((((error != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4695)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4696)==0&false))) {{
                        __CLR4_5_23fp3fplvicmt67.R.inc(4697);danglingReferences.add(error);
                    }
                }} }else {__CLR4_5_23fp3fplvicmt67.R.inc(4698);if ((((tagConstant == OboFormatTag.TAG_DOMAIN || tagConstant == OboFormatTag.TAG_RANGE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4699)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4700)==0&false))) {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(4701);String error = checkClassReference(c.getValue().toString(), tag, f.getId(), doc);
                    __CLR4_5_23fp3fplvicmt67.R.inc(4702);if ((((error != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4703)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4704)==0&false))) {{
                        __CLR4_5_23fp3fplvicmt67.R.inc(4705);danglingReferences.add(error);
                    }
                }}
            }}}}
        }}
        }__CLR4_5_23fp3fplvicmt67.R.inc(4706);return danglingReferences;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    @Nullable
    private String checkRelation(String relId, String tag, String frameId, @Nonnull OBODoc doc) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4707);
        __CLR4_5_23fp3fplvicmt67.R.inc(4708);if ((((doc.getTypedefFrame(relId, followImport) == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4709)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4710)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4711);return "The relation '" + relId + "' reference in" + " the tag '" + tag + " ' in the frame of id '"
                + frameId + "' is not declared";
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4712);return null;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    @Nullable
    private String checkClassReference(String classId, String tag, String frameId, @Nonnull OBODoc doc) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4713);
        __CLR4_5_23fp3fplvicmt67.R.inc(4714);if ((((doc.getTermFrame(classId, followImport) == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4715)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4716)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4717);return "The class '" + classId + "' reference in" + " the tag '" + tag + " ' in the frame of id '" + frameId
                + "'is not declared";
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4718);return null;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @param h
     *        h
     * @throws OBOFormatParserException
     *         parser exception
     */
    public void parseHeaderFrame(@Nonnull Frame h) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4719);
        __CLR4_5_23fp3fplvicmt67.R.inc(4720);while ((((parseHeaderClauseNl(h))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4721)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4722)==0&false))) {{}
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * header-clause ::= format-version-TVP | ... | ...
     * 
     * @param h
     *        header frame
     * @return false if there are no more header clauses, other wise true
     * @throws OBOFormatParserException
     *         parser exception
     */
    protected boolean parseHeaderClauseNl(@Nonnull Frame h) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4723);
        __CLR4_5_23fp3fplvicmt67.R.inc(4724);parseZeroOrMoreWsOptCmtNl();
        __CLR4_5_23fp3fplvicmt67.R.inc(4725);if ((((stream.peekCharIs('[') || stream.eof())&&(__CLR4_5_23fp3fplvicmt67.R.iget(4726)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4727)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4728);return false;
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4729);parseHeaderClause(h);
        __CLR4_5_23fp3fplvicmt67.R.inc(4730);parseHiddenComment();
        __CLR4_5_23fp3fplvicmt67.R.inc(4731);forceParseNlOrEof();
        __CLR4_5_23fp3fplvicmt67.R.inc(4732);return true;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    protected void parseHeaderClause(@Nonnull Frame h) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4733);
        __CLR4_5_23fp3fplvicmt67.R.inc(4734);String t = getParseTag();
        __CLR4_5_23fp3fplvicmt67.R.inc(4735);Clause cl = new Clause(t);
        __CLR4_5_23fp3fplvicmt67.R.inc(4736);OboFormatTag tag = OBOFormatConstants.getTag(t);
        __CLR4_5_23fp3fplvicmt67.R.inc(4737);h.addClause(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(4738);if ((((tag == OboFormatTag.TAG_DATA_VERSION)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4739)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4740)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4741);parseUnquotedString(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4742);if ((((tag == OboFormatTag.TAG_FORMAT_VERSION)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4743)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4744)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4745);parseUnquotedString(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4746);if ((((tag == OboFormatTag.TAG_SYNONYMTYPEDEF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4747)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4748)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4749);parseSynonymTypedef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4750);if ((((tag == OboFormatTag.TAG_SUBSETDEF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4751)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4752)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4753);parseSubsetdef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4754);if ((((tag == OboFormatTag.TAG_DATE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4755)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4756)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4757);parseHeaderDate(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4758);if ((((tag == OboFormatTag.TAG_PROPERTY_VALUE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4759)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4760)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4761);parsePropertyValue(cl);
            __CLR4_5_23fp3fplvicmt67.R.inc(4762);parseZeroOrMoreWs();
            __CLR4_5_23fp3fplvicmt67.R.inc(4763);parseQualifierBlock(cl);
            __CLR4_5_23fp3fplvicmt67.R.inc(4764);parseHiddenComment();
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4765);if ((((tag == OboFormatTag.TAG_IMPORT)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4766)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4767)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4768);parseImport(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4769);if ((((tag == OboFormatTag.TAG_IDSPACE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4770)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4771)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4772);parseIdSpace(cl);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4773);parseUnquotedString(cl);
        }
    }}}}}}}}}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @param obodoc
     *        obodoc
     * @throws OBOFormatParserException
     *         parser exception
     */
    public void parseEntityFrame(@Nonnull OBODoc obodoc) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4774);
        __CLR4_5_23fp3fplvicmt67.R.inc(4775);parseZeroOrMoreWsOptCmtNl();
        __CLR4_5_23fp3fplvicmt67.R.inc(4776);String rest = stream.rest();
        __CLR4_5_23fp3fplvicmt67.R.inc(4777);if ((((rest != null && rest.startsWith("[Term]"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4778)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4779)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4780);parseTermFrame(obodoc);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4781);if ((((rest != null && rest.startsWith("[Instance]"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4782)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4783)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4784);LOG.error("Error: Instance frames are not supported yet. Parsing stopped at line: " + stream.getLineNo());
            __CLR4_5_23fp3fplvicmt67.R.inc(4785);while ((((!stream.eof())&&(__CLR4_5_23fp3fplvicmt67.R.iget(4786)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4787)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4788);stream.advanceLine();
            }
        }} }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4789);parseTypedefFrame(obodoc);
        }
    }}}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // [Term] Frames
    // ----------------------------------------
    /**
     * term-frame ::= nl* '[Term]' nl id-Tag Class-ID EOL { term-frame-clause
     * EOL }.
     * 
     * @param obodoc
     *        obodoc
     * @throws OBOFormatParserException
     *         parser exception
     */
    public void parseTermFrame(@Nonnull OBODoc obodoc) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4790);
        __CLR4_5_23fp3fplvicmt67.R.inc(4791);Frame f = new Frame(FrameType.TERM);
        __CLR4_5_23fp3fplvicmt67.R.inc(4792);parseZeroOrMoreWsOptCmtNl();
        __CLR4_5_23fp3fplvicmt67.R.inc(4793);if ((((stream.consume("[Term]"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4794)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4795)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4796);forceParseNlOrEof();
            __CLR4_5_23fp3fplvicmt67.R.inc(4797);parseIdLine(f);
            __CLR4_5_23fp3fplvicmt67.R.inc(4798);parseZeroOrMoreWsOptCmtNl();
            __CLR4_5_23fp3fplvicmt67.R.inc(4799);while (true) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4800);if ((((stream.eof() || stream.peekCharIs('['))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4801)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4802)==0&false))) {{
                    // reached end of file or new stanza
                    __CLR4_5_23fp3fplvicmt67.R.inc(4803);break;
                }
                }__CLR4_5_23fp3fplvicmt67.R.inc(4804);parseTermFrameClauseEOL(f);
                __CLR4_5_23fp3fplvicmt67.R.inc(4805);parseZeroOrMoreWsOptCmtNl();
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4806);try {
                __CLR4_5_23fp3fplvicmt67.R.inc(4807);f.freeze();
                __CLR4_5_23fp3fplvicmt67.R.inc(4808);obodoc.addFrame(f);
            } catch (FrameMergeException e) {
                __CLR4_5_23fp3fplvicmt67.R.inc(4809);throw new OBOFormatParserException("Could not add frame " + f
                    + " to document, duplicate frame definition?", e, stream.lineNo, stream.line);
            }
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4810);error("Expected a [Term] frame, but found unknown stanza type.");
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @param f
     *        f
     * @throws OBOFormatParserException
     *         parser exception
     */
    protected void parseTermFrameClauseEOL(@Nonnull Frame f) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4811);
        // comment line:
        __CLR4_5_23fp3fplvicmt67.R.inc(4812);if ((((stream.peekCharIs('!'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4813)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4814)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4815);parseHiddenComment();
            __CLR4_5_23fp3fplvicmt67.R.inc(4816);forceParseNlOrEof();
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4817);Clause cl = parseTermFrameClause();
            __CLR4_5_23fp3fplvicmt67.R.inc(4818);parseEOL(cl);
            __CLR4_5_23fp3fplvicmt67.R.inc(4819);f.addClause(cl);
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @throws OBOFormatParserException
     *         parser exception
     * @return parsed clause
     */
    @Nonnull
    public Clause parseTermFrameClause() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4820);
        __CLR4_5_23fp3fplvicmt67.R.inc(4821);String t = getParseTag();
        __CLR4_5_23fp3fplvicmt67.R.inc(4822);Clause cl = new Clause(t);
        __CLR4_5_23fp3fplvicmt67.R.inc(4823);if ((((parseDeprecatedSynonym(t, cl))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4824)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4825)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4826);return cl;
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4827);OboFormatTag tag = OBOFormatConstants.getTag(t);
        __CLR4_5_23fp3fplvicmt67.R.inc(4828);if ((((tag == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4829)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4830)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4831);error("Could not find tag for: " + t);
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4832);if ((((tag == OboFormatTag.TAG_IS_ANONYMOUS)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4833)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4834)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4835);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4836);if ((((tag == OboFormatTag.TAG_NAME)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4837)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4838)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4839);parseUnquotedString(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4840);if ((((tag == OboFormatTag.TAG_NAMESPACE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4841)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4842)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4843);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4844);if ((((tag == OboFormatTag.TAG_ALT_ID)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4845)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4846)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4847);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4848);if ((((tag == OboFormatTag.TAG_DEF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4849)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4850)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4851);parseDef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4852);if ((((tag == OboFormatTag.TAG_COMMENT)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4853)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4854)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4855);parseUnquotedString(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4856);if ((((tag == OboFormatTag.TAG_SUBSET)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4857)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4858)==0&false))) {{
            // in the obof1.4 spec, subsets may not contain spaces.
            // unfortunately OE does not prohibit this, so subsets with spaces
            // frequently escape. We should either allow spaces in the spec
            // (with complicates parsing) or forbid them and reject all obo
            // documents
            // that do not conform. Unfortunately that would limit the utility
            // of
            // this parser, so for now we allow spaces. We may make it strict
            // again
            // when community is sufficiently forewarned.
            // (alternatively we may add smarts to OE to translate the spaces to
            // underscores,
            // so it's a one-off translation)
            //
            // return parseIdRef(cl);
            __CLR4_5_23fp3fplvicmt67.R.inc(4859);parseUnquotedString(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4860);if ((((tag == OboFormatTag.TAG_SYNONYM)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4861)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4862)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4863);parseSynonym(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4864);if ((((tag == OboFormatTag.TAG_XREF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4865)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4866)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4867);parseDirectXref(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4868);if ((((tag == OboFormatTag.TAG_BUILTIN)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4869)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4870)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4871);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4872);if ((((tag == OboFormatTag.TAG_PROPERTY_VALUE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4873)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4874)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4875);parsePropertyValue(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4876);if ((((tag == OboFormatTag.TAG_IS_A)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4877)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4878)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4879);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4880);if ((((tag == OboFormatTag.TAG_INTERSECTION_OF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4881)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4882)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4883);parseTermIntersectionOf(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4884);if ((((tag == OboFormatTag.TAG_UNION_OF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4885)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4886)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4887);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4888);if ((((tag == OboFormatTag.TAG_EQUIVALENT_TO)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4889)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4890)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4891);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4892);if ((((tag == OboFormatTag.TAG_DISJOINT_FROM)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4893)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4894)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4895);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4896);if ((((tag == OboFormatTag.TAG_RELATIONSHIP)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4897)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4898)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4899);parseRelationship(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4900);if ((((tag == OboFormatTag.TAG_CREATED_BY)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4901)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4902)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4903);parsePerson(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4904);if ((((tag == OboFormatTag.TAG_CREATION_DATE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4905)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4906)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4907);parseISODate(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4908);if ((((tag == OboFormatTag.TAG_IS_OBSELETE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4909)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4910)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4911);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4912);if ((((tag == OboFormatTag.TAG_REPLACED_BY)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4913)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4914)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4915);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4916);if ((((tag == OboFormatTag.TAG_CONSIDER)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4917)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4918)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4919);parseIdRef(cl);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4920);error("Unexpected tag " + tag + " in term frame.");
        }
        }}}}}}}}}}}}}}}}}}}}}}__CLR4_5_23fp3fplvicmt67.R.inc(4921);return cl;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // [Typedef] Frames
    // ----------------------------------------
    /**
     * Typedef-frame ::= nl* '[Typedef]' nl id-Tag Class-ID EOL {
     * Typedef-frame-clause EOL }.
     * 
     * @param obodoc
     *        obodoc
     * @throws OBOFormatParserException
     *         parser exception
     */
    public void parseTypedefFrame(@Nonnull OBODoc obodoc) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4922);
        __CLR4_5_23fp3fplvicmt67.R.inc(4923);Frame f = new Frame(FrameType.TYPEDEF);
        __CLR4_5_23fp3fplvicmt67.R.inc(4924);parseZeroOrMoreWsOptCmtNl();
        __CLR4_5_23fp3fplvicmt67.R.inc(4925);if ((((stream.consume("[Typedef]"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4926)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4927)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4928);forceParseNlOrEof();
            __CLR4_5_23fp3fplvicmt67.R.inc(4929);parseIdLine(f);
            __CLR4_5_23fp3fplvicmt67.R.inc(4930);parseZeroOrMoreWsOptCmtNl();
            __CLR4_5_23fp3fplvicmt67.R.inc(4931);while (true) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(4932);if ((((stream.eof() || stream.peekCharIs('['))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4933)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4934)==0&false))) {{
                    // reached end of file or new stanza
                    __CLR4_5_23fp3fplvicmt67.R.inc(4935);break;
                }
                }__CLR4_5_23fp3fplvicmt67.R.inc(4936);parseTypedefFrameClauseEOL(f);
                __CLR4_5_23fp3fplvicmt67.R.inc(4937);parseZeroOrMoreWsOptCmtNl();
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(4938);try {
                __CLR4_5_23fp3fplvicmt67.R.inc(4939);f.freeze();
                __CLR4_5_23fp3fplvicmt67.R.inc(4940);obodoc.addFrame(f);
            } catch (FrameMergeException e) {
                __CLR4_5_23fp3fplvicmt67.R.inc(4941);throw new OBOFormatParserException("Could not add frame " + f
                    + " to document, duplicate frame definition?", e, stream.lineNo, stream.line);
            }
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4942);error("Expected a [Typedef] frame, but found unknown stanza type.");
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @param f
     *        f
     * @throws OBOFormatParserException
     *         parser exception
     */
    protected void parseTypedefFrameClauseEOL(@Nonnull Frame f) {try{__CLR4_5_23fp3fplvicmt67.R.inc(4943);
        // comment line:
        __CLR4_5_23fp3fplvicmt67.R.inc(4944);if ((((stream.peekCharIs('!'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4945)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4946)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4947);parseHiddenComment();
            __CLR4_5_23fp3fplvicmt67.R.inc(4948);forceParseNlOrEof();
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4949);Clause cl = parseTypedefFrameClause();
            __CLR4_5_23fp3fplvicmt67.R.inc(4950);parseEOL(cl);
            __CLR4_5_23fp3fplvicmt67.R.inc(4951);f.addClause(cl);
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * @return parsed clause
     * @throws OBOFormatParserException
     *         parser exception
     */
    @Nonnull
    public Clause parseTypedefFrameClause() {try{__CLR4_5_23fp3fplvicmt67.R.inc(4952);
        __CLR4_5_23fp3fplvicmt67.R.inc(4953);String t = getParseTag();
        __CLR4_5_23fp3fplvicmt67.R.inc(4954);if ((((t.equals("is_metadata"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4955)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4956)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4957);LOG.info("is_metadata DEPRECATED; switching to is_metadata_tag");
            __CLR4_5_23fp3fplvicmt67.R.inc(4958);t = OboFormatTag.TAG_IS_METADATA_TAG.getTag();
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4959);Clause cl = new Clause(t);
        __CLR4_5_23fp3fplvicmt67.R.inc(4960);if ((((parseDeprecatedSynonym(t, cl))&&(__CLR4_5_23fp3fplvicmt67.R.iget(4961)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4962)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4963);return cl;
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4964);OboFormatTag tag = OBOFormatConstants.getTag(t);
        __CLR4_5_23fp3fplvicmt67.R.inc(4965);if ((((tag == null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4966)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4967)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4968);error("Could not find tag for: " + t);
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(4969);if ((((tag == OboFormatTag.TAG_IS_ANONYMOUS)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4970)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4971)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4972);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4973);if ((((tag == OboFormatTag.TAG_NAME)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4974)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4975)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4976);parseUnquotedString(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4977);if ((((tag == OboFormatTag.TAG_NAMESPACE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4978)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4979)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4980);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4981);if ((((tag == OboFormatTag.TAG_ALT_ID)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4982)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4983)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4984);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4985);if ((((tag == OboFormatTag.TAG_DEF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4986)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4987)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4988);parseDef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4989);if ((((tag == OboFormatTag.TAG_COMMENT)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4990)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4991)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4992);parseUnquotedString(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4993);if ((((tag == OboFormatTag.TAG_SUBSET)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4994)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4995)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(4996);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(4997);if ((((tag == OboFormatTag.TAG_SYNONYM)&&(__CLR4_5_23fp3fplvicmt67.R.iget(4998)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(4999)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5000);parseSynonym(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5001);if ((((tag == OboFormatTag.TAG_XREF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5002)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5003)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5004);parseDirectXref(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5005);if ((((tag == OboFormatTag.TAG_PROPERTY_VALUE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5006)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5007)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5008);parsePropertyValue(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5009);if ((((tag == OboFormatTag.TAG_DOMAIN)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5010)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5011)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5012);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5013);if ((((tag == OboFormatTag.TAG_RANGE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5014)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5015)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5016);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5017);if ((((tag == OboFormatTag.TAG_BUILTIN)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5018)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5019)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5020);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5021);if ((((tag == OboFormatTag.TAG_IS_ANTI_SYMMETRIC)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5022)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5023)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5024);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5025);if ((((tag == OboFormatTag.TAG_IS_CYCLIC)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5026)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5027)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5028);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5029);if ((((tag == OboFormatTag.TAG_IS_REFLEXIVE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5030)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5031)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5032);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5033);if ((((tag == OboFormatTag.TAG_IS_SYMMETRIC)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5034)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5035)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5036);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5037);if ((((tag == OboFormatTag.TAG_IS_ASYMMETRIC)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5038)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5039)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5040);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5041);if ((((tag == OboFormatTag.TAG_IS_TRANSITIVE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5042)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5043)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5044);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5045);if ((((tag == OboFormatTag.TAG_IS_FUNCTIONAL)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5046)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5047)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5048);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5049);if ((((tag == OboFormatTag.TAG_IS_INVERSE_FUNCTIONAL)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5050)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5051)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5052);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5053);if ((((tag == OboFormatTag.TAG_IS_A)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5054)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5055)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5056);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5057);if ((((tag == OboFormatTag.TAG_INTERSECTION_OF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5058)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5059)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5060);parseTypedefIntersectionOf(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5061);if ((((tag == OboFormatTag.TAG_UNION_OF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5062)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5063)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5064);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5065);if ((((tag == OboFormatTag.TAG_EQUIVALENT_TO)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5066)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5067)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5068);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5069);if ((((tag == OboFormatTag.TAG_DISJOINT_FROM)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5070)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5071)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5072);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5073);if ((((tag == OboFormatTag.TAG_INVERSE_OF)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5074)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5075)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5076);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5077);if ((((tag == OboFormatTag.TAG_TRANSITIVE_OVER)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5078)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5079)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5080);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5081);if ((((tag == OboFormatTag.TAG_HOLDS_OVER_CHAIN)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5082)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5083)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5084);parseIdRefPair(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5085);if ((((tag == OboFormatTag.TAG_EQUIVALENT_TO_CHAIN)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5086)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5087)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5088);parseIdRefPair(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5089);if ((((tag == OboFormatTag.TAG_DISJOINT_OVER)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5090)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5091)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5092);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5093);if ((((tag == OboFormatTag.TAG_RELATIONSHIP)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5094)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5095)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5096);parseRelationship(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5097);if ((((tag == OboFormatTag.TAG_CREATED_BY)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5098)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5099)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5100);parsePerson(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5101);if ((((tag == OboFormatTag.TAG_CREATION_DATE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5102)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5103)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5104);parseISODate(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5105);if ((((tag == OboFormatTag.TAG_IS_OBSELETE)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5106)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5107)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5108);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5109);if ((((tag == OboFormatTag.TAG_REPLACED_BY)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5110)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5111)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5112);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5113);if ((((tag == OboFormatTag.TAG_CONSIDER)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5114)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5115)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5116);parseIdRef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5117);if ((((tag == OboFormatTag.TAG_IS_METADATA_TAG)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5118)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5119)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5120);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5121);if ((((tag == OboFormatTag.TAG_IS_CLASS_LEVEL_TAG)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5122)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5123)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5124);parseBoolean(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5125);if ((((tag == OboFormatTag.TAG_EXPAND_ASSERTION_TO)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5126)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5127)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5128);parseOwlDef(cl);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5129);if ((((tag == OboFormatTag.TAG_EXPAND_EXPRESSION_TO)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5130)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5131)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5132);parseOwlDef(cl);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5133);error("Unexpected tag " + tag + " in type def frame.");
        }
        }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}__CLR4_5_23fp3fplvicmt67.R.inc(5134);return cl;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // [Instance] Frames - TODO
    // ----------------------------------------
    // ----------------------------------------
    // TVP
    // ----------------------------------------
    @SuppressWarnings("null")
    @Nonnull
    private String getParseTag() {try{__CLR4_5_23fp3fplvicmt67.R.inc(5135);
        __CLR4_5_23fp3fplvicmt67.R.inc(5136);if ((((stream.eof())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5137)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5138)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5139);error("Expected an id tag, not end of file.");
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5140);if ((((stream.eol())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5141)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5142)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5143);error("Expected an id tag, not end of line");
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5144);int i = stream.indexOf(':');
        __CLR4_5_23fp3fplvicmt67.R.inc(5145);if ((((i == -1)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5146)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5147)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5148);error("Could not find tag separator ':' in line.");
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5149);String tag = stream.rest().substring(0, i);
        __CLR4_5_23fp3fplvicmt67.R.inc(5150);stream.advance(i + 1);
        __CLR4_5_23fp3fplvicmt67.R.inc(5151);parseWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5152);parseZeroOrMoreWs();
        // Memory optimization
        // re-use the tag string
        __CLR4_5_23fp3fplvicmt67.R.inc(5153);OboFormatTag formatTag = OBOFormatConstants.getTag(tag);
        __CLR4_5_23fp3fplvicmt67.R.inc(5154);if ((((formatTag != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5155)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5156)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5157);tag = formatTag.getTag();
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5158);return mapDeprecatedTag(tag);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseIdRef(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5159);
        __CLR4_5_23fp3fplvicmt67.R.inc(5160);parseIdRef(cl, false);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseIdRef(@Nonnull Clause cl, boolean optional) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5161);
        __CLR4_5_23fp3fplvicmt67.R.inc(5162);String id = getParseUntil(" !{");
        __CLR4_5_23fp3fplvicmt67.R.inc(5163);if ((((!optional && id.length() < 1)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5164)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5165)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5166);error("");
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5167);cl.addValue(id);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseIdRefPair(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5168);
        __CLR4_5_23fp3fplvicmt67.R.inc(5169);parseIdRef(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5170);parseOneOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5171);parseIdRef(cl);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parsePerson(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5172);
        __CLR4_5_23fp3fplvicmt67.R.inc(5173);parseUnquotedString(cl);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private boolean parseISODate(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5174);
        __CLR4_5_23fp3fplvicmt67.R.inc(5175);String dateStr = getParseUntil(" !{");
        // Date date;
        // try {
        // date = isoDateFormat.parse(dateStr);
        __CLR4_5_23fp3fplvicmt67.R.inc(5176);cl.setValue(dateStr);
        __CLR4_5_23fp3fplvicmt67.R.inc(5177);return true;
        /*
         * } catch (ParseException e) { // TODO Auto-generated catch block
         * e.printStackTrace(); return false; }
         */
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseSubsetdef(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5178);
        __CLR4_5_23fp3fplvicmt67.R.inc(5179);parseIdRef(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5180);parseOneOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5181);if ((((stream.consume("\""))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5182)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5183)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5184);String desc = getParseUntilAdv("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5185);cl.addValue(desc);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5186);error("");
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5187);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5188);parseQualifierBlock(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5189);parseHiddenComment();
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseSynonymTypedef(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5190);
        __CLR4_5_23fp3fplvicmt67.R.inc(5191);parseIdRef(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5192);parseOneOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5193);if ((((stream.consume("\""))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5194)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5195)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5196);String desc = getParseUntilAdv("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5197);cl.addValue(desc);
            // TODO: handle edge case where line ends with trailing whitespace
            // and no scope
            __CLR4_5_23fp3fplvicmt67.R.inc(5198);if ((((stream.peekCharIs(' '))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5199)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5200)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5201);parseOneOrMoreWs();
                __CLR4_5_23fp3fplvicmt67.R.inc(5202);parseIdRef(cl, true);// TODO - verify that this is a valid
                                     // scope
            }
        }}
        }__CLR4_5_23fp3fplvicmt67.R.inc(5203);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5204);parseQualifierBlock(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5205);parseHiddenComment();
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseHeaderDate(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5206);
        __CLR4_5_23fp3fplvicmt67.R.inc(5207);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5208);String v = getParseUntil("!");
        __CLR4_5_23fp3fplvicmt67.R.inc(5209);v = removeTrailingWS(v);
        __CLR4_5_23fp3fplvicmt67.R.inc(5210);try {
            __CLR4_5_23fp3fplvicmt67.R.inc(5211);Date date = OBOFormatConstants.headerDateFormat().parse(v);
            __CLR4_5_23fp3fplvicmt67.R.inc(5212);cl.addValue(date);
        } catch (ParseException e) {
            __CLR4_5_23fp3fplvicmt67.R.inc(5213);throw new OBOFormatParserException("Could not parse date from string: " + v, e, stream.lineNo, stream.line);
        }
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private boolean parseImport(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5214);
        __CLR4_5_23fp3fplvicmt67.R.inc(5215);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5216);String v = getParseUntil("!{");
        __CLR4_5_23fp3fplvicmt67.R.inc(5217);v = removeTrailingWS(v);
        __CLR4_5_23fp3fplvicmt67.R.inc(5218);cl.setValue(v);
        // parse and ignore annotations for import statements
        __CLR4_5_23fp3fplvicmt67.R.inc(5219);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5220);if ((((stream.peekCharIs('{'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5221)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5222)==0&false))) {{
            // do noy parse trailing qualifiers.
            __CLR4_5_23fp3fplvicmt67.R.inc(5223);getParseUntilAdv("}");
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5224);parseHiddenComment();// ignore return value, as comments are optional
        __CLR4_5_23fp3fplvicmt67.R.inc(5225);return true;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseIdSpace(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5226);
        __CLR4_5_23fp3fplvicmt67.R.inc(5227);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5228);parseIdRefPair(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5229);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5230);if ((((stream.peekCharIs('"'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5231)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5232)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5233);stream.consume("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5234);String desc = getParseUntilAdv("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5235);cl.addValue(desc);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5236);String desc = getParseUntil(" !{");
            __CLR4_5_23fp3fplvicmt67.R.inc(5237);cl.addValue(desc);
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5238);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5239);parseQualifierBlock(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5240);parseHiddenComment();
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseRelationship(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5241);
        __CLR4_5_23fp3fplvicmt67.R.inc(5242);parseIdRef(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5243);parseOneOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5244);parseIdRef(cl);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parsePropertyValue(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5245);
        // parse a pair or triple
        // the first and second value, may be quoted strings
        __CLR4_5_23fp3fplvicmt67.R.inc(5246);if ((((stream.peekCharIs('\"'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5247)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5248)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5249);stream.consume("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5250);String desc = getParseUntilAdv("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5251);cl.addValue(desc);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5252);parseIdRef(cl);
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5253);parseOneOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5254);if ((((stream.peekCharIs('\"'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5255)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5256)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5257);stream.consume("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5258);String desc = getParseUntilAdv("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5259);cl.addValue(desc);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5260);parseIdRef(cl);
        }
        // check if there is a third value to parse
        }__CLR4_5_23fp3fplvicmt67.R.inc(5261);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5262);String s = getParseUntil(" !{");
        __CLR4_5_23fp3fplvicmt67.R.inc(5263);if ((((!s.isEmpty())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5264)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5265)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5266);cl.addValue(s);
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    /**
     * intersection_of-Tag Class-ID | intersection_of-Tag Relation-ID Class-ID.
     * 
     * @param cl
     *        cl
     * @throws OBOFormatParserException
     *         parser exception
     */
    private void parseTermIntersectionOf(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5267);
        __CLR4_5_23fp3fplvicmt67.R.inc(5268);parseIdRef(cl);
        // consumed the first ID
        __CLR4_5_23fp3fplvicmt67.R.inc(5269);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5270);if ((((!stream.eol())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5271)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5272)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5273);char c = stream.peekChar();
            __CLR4_5_23fp3fplvicmt67.R.inc(5274);if ((((c != '!' && c != '{')&&(__CLR4_5_23fp3fplvicmt67.R.iget(5275)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5276)==0&false))) {{
                // try to consume the second id
                __CLR4_5_23fp3fplvicmt67.R.inc(5277);parseIdRef(cl, true);
            }
        }}
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseTypedefIntersectionOf(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5278);
        // single values only
        __CLR4_5_23fp3fplvicmt67.R.inc(5279);parseIdRef(cl);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // Synonyms
    // ----------------------------------------
    private boolean parseDeprecatedSynonym(@Nonnull String tag, @Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5280);
        __CLR4_5_23fp3fplvicmt67.R.inc(5281);String scope = null;
        __CLR4_5_23fp3fplvicmt67.R.inc(5282);if ((((tag.equals("exact_synonym"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5283)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5284)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5285);scope = OboFormatTag.TAG_EXACT.getTag();
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5286);if ((((tag.equals("narrow_synonym"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5287)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5288)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5289);scope = OboFormatTag.TAG_NARROW.getTag();
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5290);if ((((tag.equals("broad_synonym"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5291)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5292)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5293);scope = OboFormatTag.TAG_BROAD.getTag();
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5294);if ((((tag.equals("related_synonym"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5295)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5296)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5297);scope = OboFormatTag.TAG_RELATED.getTag();
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5298);return false;
        }
        }}}}__CLR4_5_23fp3fplvicmt67.R.inc(5299);cl.setTag(OboFormatTag.TAG_SYNONYM.getTag());
        __CLR4_5_23fp3fplvicmt67.R.inc(5300);if ((((stream.consume("\""))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5301)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5302)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5303);String syn = getParseUntilAdv("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5304);cl.setValue(syn);
            __CLR4_5_23fp3fplvicmt67.R.inc(5305);cl.addValue(scope);
            __CLR4_5_23fp3fplvicmt67.R.inc(5306);parseZeroOrMoreWs();
            __CLR4_5_23fp3fplvicmt67.R.inc(5307);parseXrefList(cl, false);
            __CLR4_5_23fp3fplvicmt67.R.inc(5308);return true;
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5309);return false;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseSynonym(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5310);
        __CLR4_5_23fp3fplvicmt67.R.inc(5311);if ((((stream.consume("\""))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5312)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5313)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5314);String syn = getParseUntilAdv("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5315);cl.setValue(syn);
            __CLR4_5_23fp3fplvicmt67.R.inc(5316);parseZeroOrMoreWs();
            __CLR4_5_23fp3fplvicmt67.R.inc(5317);if ((((!stream.peekCharIs('['))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5318)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5319)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5320);parseIdRef(cl, true);
                __CLR4_5_23fp3fplvicmt67.R.inc(5321);parseZeroOrMoreWs();
                __CLR4_5_23fp3fplvicmt67.R.inc(5322);if ((((!stream.peekCharIs('['))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5323)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5324)==0&false))) {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(5325);parseIdRef(cl, true);
                    __CLR4_5_23fp3fplvicmt67.R.inc(5326);parseZeroOrMoreWs();
                }
            }}
            }__CLR4_5_23fp3fplvicmt67.R.inc(5327);parseXrefList(cl, false);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5328);error("The synonym is always a quoted string.");
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // Definitions
    // ----------------------------------------
    private void parseDef(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5329);
        __CLR4_5_23fp3fplvicmt67.R.inc(5330);if ((((stream.consume("\""))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5331)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5332)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5333);String def = getParseUntilAdv("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5334);cl.setValue(def);
            __CLR4_5_23fp3fplvicmt67.R.inc(5335);parseZeroOrMoreWs();
            __CLR4_5_23fp3fplvicmt67.R.inc(5336);parseXrefList(cl, true);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5337);error("Definitions should always be a quoted string.");
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseOwlDef(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5338);
        __CLR4_5_23fp3fplvicmt67.R.inc(5339);if ((((stream.consume("\""))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5340)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5341)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5342);String def = getParseUntilAdv("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5343);cl.setValue(def);
            __CLR4_5_23fp3fplvicmt67.R.inc(5344);parseZeroOrMoreWs();
            __CLR4_5_23fp3fplvicmt67.R.inc(5345);parseXrefList(cl, true);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5346);error("The " + cl.getTag() + " clause is always a quoted string.");
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // XrefLists - e.g. [A:1, B:2, ... ]
    // ----------------------------------------
    private void parseXrefList(@Nonnull Clause cl, boolean optional) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5347);
        __CLR4_5_23fp3fplvicmt67.R.inc(5348);if ((((stream.consume("["))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5349)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5350)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5351);parseZeroOrMoreXrefs(cl);
            __CLR4_5_23fp3fplvicmt67.R.inc(5352);parseZeroOrMoreWs();
            __CLR4_5_23fp3fplvicmt67.R.inc(5353);if ((((!stream.consume("]"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5354)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5355)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5356);error("Missing closing ']' for xref list at pos: " + stream.pos);
            }
        }} }else {__CLR4_5_23fp3fplvicmt67.R.inc(5357);if ((((!optional)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5358)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5359)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5360);error("Clause: " + cl.getTag() + "; expected an xref list, or at least an empty list '[]' at pos: "
                + stream.pos);
        }
    }}}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private boolean parseZeroOrMoreXrefs(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5361);
        __CLR4_5_23fp3fplvicmt67.R.inc(5362);if ((((parseXref(cl))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5363)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5364)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5365);while ((((stream.consume(",") && parseXref(cl))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5366)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5367)==0&false))) {{}
        }}
        }__CLR4_5_23fp3fplvicmt67.R.inc(5368);return true;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // an xref that supports a value of values in a clause
    private boolean parseXref(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5369);
        __CLR4_5_23fp3fplvicmt67.R.inc(5370);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5371);String id = getParseUntil("\",]!{", true);
        __CLR4_5_23fp3fplvicmt67.R.inc(5372);if ((((!id.isEmpty())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5373)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5374)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5375);id = removeTrailingWS(id);
            __CLR4_5_23fp3fplvicmt67.R.inc(5376);if ((((id.contains(" "))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5377)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5378)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5379);warn("accepting bad xref with spaces:" + id);
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(5380);Xref xref = new Xref(id);
            __CLR4_5_23fp3fplvicmt67.R.inc(5381);cl.addXref(xref);
            __CLR4_5_23fp3fplvicmt67.R.inc(5382);parseZeroOrMoreWs();
            __CLR4_5_23fp3fplvicmt67.R.inc(5383);if ((((stream.peekCharIs('"'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5384)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5385)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5386);stream.consume("\"");
                __CLR4_5_23fp3fplvicmt67.R.inc(5387);xref.setAnnotation(getParseUntilAdv("\""));
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(5388);return true;
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5389);return false;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // an xref that is a direct value of a clause
    private boolean parseDirectXref(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5390);
        __CLR4_5_23fp3fplvicmt67.R.inc(5391);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5392);String id = getParseUntil("\",]!{", true);
        __CLR4_5_23fp3fplvicmt67.R.inc(5393);id = id.trim();
        __CLR4_5_23fp3fplvicmt67.R.inc(5394);if ((((id.contains(" "))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5395)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5396)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5397);warn("accepting bad xref with spaces:<" + id + '>');
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5398);id = id.replaceAll(" +\\Z", "");
        __CLR4_5_23fp3fplvicmt67.R.inc(5399);Xref xref = new Xref(id);
        __CLR4_5_23fp3fplvicmt67.R.inc(5400);cl.addValue(xref);
        __CLR4_5_23fp3fplvicmt67.R.inc(5401);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5402);if ((((stream.peekCharIs('"'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5403)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5404)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5405);stream.consume("\"");
            __CLR4_5_23fp3fplvicmt67.R.inc(5406);xref.setAnnotation(getParseUntilAdv("\""));
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5407);return true;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // Qualifier Value blocks - e.g. {a="1",b="foo", ...}
    // ----------------------------------------
    private void parseQualifierBlock(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5408);
        __CLR4_5_23fp3fplvicmt67.R.inc(5409);if ((((stream.consume("{"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5410)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5411)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5412);parseZeroOrMoreQuals(cl);
            __CLR4_5_23fp3fplvicmt67.R.inc(5413);parseZeroOrMoreWs();
            __CLR4_5_23fp3fplvicmt67.R.inc(5414);boolean success = stream.consume("}");
            __CLR4_5_23fp3fplvicmt67.R.inc(5415);if ((((!success)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5416)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5417)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5418);error("Missing closing '}' for trailing qualifier block.");
            }
        }}
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseZeroOrMoreQuals(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5419);
        __CLR4_5_23fp3fplvicmt67.R.inc(5420);if ((((parseQual(cl))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5421)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5422)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5423);while ((((stream.consume(",") && parseQual(cl))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5424)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5425)==0&false))) {{}
        }}
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private boolean parseQual(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5426);
        __CLR4_5_23fp3fplvicmt67.R.inc(5427);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5428);String rest = stream.rest();
        assert (((rest != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5429)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5430)==0&false));
        __CLR4_5_23fp3fplvicmt67.R.inc(5431);if ((((!rest.contains("="))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5432)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5433)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5434);error(
                "Missing '=' in trailing qualifier block. This might happen for not properly escaped '{', '}' chars in comments.");
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5435);String q = getParseUntilAdv("=");
        __CLR4_5_23fp3fplvicmt67.R.inc(5436);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5437);String v;
        __CLR4_5_23fp3fplvicmt67.R.inc(5438);if ((((stream.consume("\""))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5439)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5440)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5441);v = getParseUntilAdv("\"");
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5442);v = getParseUntil(" ,}");
            __CLR4_5_23fp3fplvicmt67.R.inc(5443);warn("qualifier values should be enclosed in quotes. You have: " + q + '=' + stream.rest());
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5444);if ((((v.isEmpty())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5445)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5446)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5447);warn("Empty value for qualifier in trailing qualifier block.");
            __CLR4_5_23fp3fplvicmt67.R.inc(5448);v = "";
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5449);QualifierValue qv = new QualifierValue(q, v);
        __CLR4_5_23fp3fplvicmt67.R.inc(5450);cl.addQualifierValue(qv);
        __CLR4_5_23fp3fplvicmt67.R.inc(5451);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5452);return true;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // Other
    // ----------------------------------------
    private void parseBoolean(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5453);
        __CLR4_5_23fp3fplvicmt67.R.inc(5454);if ((((stream.consume("true"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5455)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5456)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5457);cl.setValue(true);
        } }else {__CLR4_5_23fp3fplvicmt67.R.inc(5458);if ((((stream.consume("false"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5459)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5460)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5461);cl.setValue(false);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5462);error("Could not parse boolean value.");
        }
    }}}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    protected void parseIdLine(@Nonnull Frame f) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5463);
        __CLR4_5_23fp3fplvicmt67.R.inc(5464);String t = getParseTag();
        __CLR4_5_23fp3fplvicmt67.R.inc(5465);OboFormatTag tag = OBOFormatConstants.getTag(t);
        __CLR4_5_23fp3fplvicmt67.R.inc(5466);if ((((tag != OboFormatTag.TAG_ID)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5467)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5468)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5469);error("Expected id tag as first line in frame, but was: " + tag);
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5470);Clause cl = new Clause(t);
        __CLR4_5_23fp3fplvicmt67.R.inc(5471);f.addClause(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5472);String id = getParseUntil(" !{");
        __CLR4_5_23fp3fplvicmt67.R.inc(5473);if ((((id.isEmpty())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5474)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5475)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5476);error("Could not find an valid id, id is empty.");
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5477);cl.addValue(id);
        __CLR4_5_23fp3fplvicmt67.R.inc(5478);f.setId(id);
        __CLR4_5_23fp3fplvicmt67.R.inc(5479);parseEOL(cl);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // ----------------------------------------
    // End-of-line matter
    // ----------------------------------------
    /**
     * @param cl
     *        cl
     * @throws OBOFormatParserException
     *         parser exception
     */
    public void parseEOL(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5480);
        __CLR4_5_23fp3fplvicmt67.R.inc(5481);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5482);parseQualifierBlock(cl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5483);parseHiddenComment();
        __CLR4_5_23fp3fplvicmt67.R.inc(5484);forceParseNlOrEof();
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void parseHiddenComment() {try{__CLR4_5_23fp3fplvicmt67.R.inc(5485);
        __CLR4_5_23fp3fplvicmt67.R.inc(5486);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5487);if ((((stream.peekCharIs('!'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5488)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5489)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5490);stream.forceEol();
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    protected void parseUnquotedString(@Nonnull Clause cl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5491);
        __CLR4_5_23fp3fplvicmt67.R.inc(5492);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5493);String v = getParseUntil("!{");
        // strip whitespace from the end - TODO
        __CLR4_5_23fp3fplvicmt67.R.inc(5494);v = removeTrailingWS(v);
        __CLR4_5_23fp3fplvicmt67.R.inc(5495);cl.setValue(v);
        __CLR4_5_23fp3fplvicmt67.R.inc(5496);if ((((stream.peekCharIs('{'))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5497)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5498)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5499);parseQualifierBlock(cl);
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5500);parseHiddenComment();
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // Newlines, whitespace
    protected void forceParseNlOrEof() {try{__CLR4_5_23fp3fplvicmt67.R.inc(5501);
        __CLR4_5_23fp3fplvicmt67.R.inc(5502);parseZeroOrMoreWs();
        __CLR4_5_23fp3fplvicmt67.R.inc(5503);if ((((stream.eol())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5504)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5505)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5506);stream.advanceLine();
            __CLR4_5_23fp3fplvicmt67.R.inc(5507);return;
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5508);if ((((stream.eof())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5509)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5510)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5511);return;
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5512);error("expected newline or end of line but found: " + stream.rest());
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    protected void parseZeroOrMoreWsOptCmtNl() {try{__CLR4_5_23fp3fplvicmt67.R.inc(5513);
        __CLR4_5_23fp3fplvicmt67.R.inc(5514);while (true) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5515);parseZeroOrMoreWs();
            __CLR4_5_23fp3fplvicmt67.R.inc(5516);parseHiddenComment();
            __CLR4_5_23fp3fplvicmt67.R.inc(5517);if ((((stream.eol())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5518)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5519)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5520);stream.advanceLine();
            } }else {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5521);return;
            }
        }}
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    // non-newline
    protected void parseWs() {try{__CLR4_5_23fp3fplvicmt67.R.inc(5522);
        __CLR4_5_23fp3fplvicmt67.R.inc(5523);if ((((stream.eol())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5524)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5525)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5526);error("Expected at least one white space, but found end of line at pos: " + stream.pos);
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5527);if ((((stream.eof())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5528)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5529)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5530);error("Expected at least one white space, but found end of file.");
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5531);if ((((stream.peekChar() == ' ')&&(__CLR4_5_23fp3fplvicmt67.R.iget(5532)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5533)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5534);stream.advance(1);
        } }else {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5535);warn("Expected white space at pos: " + stream.pos);
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    protected void parseOneOrMoreWs() {try{__CLR4_5_23fp3fplvicmt67.R.inc(5536);
        __CLR4_5_23fp3fplvicmt67.R.inc(5537);if ((((stream.eol() || stream.eof())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5538)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5539)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5540);error("Expected at least one white space at pos: " + stream.pos);
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5541);int n = 0;
        __CLR4_5_23fp3fplvicmt67.R.inc(5542);while ((((stream.peekCharIs(' '))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5543)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5544)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5545);stream.advance(1);
            __CLR4_5_23fp3fplvicmt67.R.inc(5546);n++;
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5547);if ((((n == 0)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5548)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5549)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5550);error("Expected at least one white space at pos: " + stream.pos);
        }
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    protected void parseZeroOrMoreWs() {try{__CLR4_5_23fp3fplvicmt67.R.inc(5551);
        __CLR4_5_23fp3fplvicmt67.R.inc(5552);if ((((!stream.eol() && !stream.eof())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5553)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5554)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5555);while ((((stream.peekCharIs(' '))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5556)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5557)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5558);stream.advance(1);
            }
        }}
    }}finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    @Nonnull
    private String getParseUntilAdv(@Nonnull String compl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5559);
        __CLR4_5_23fp3fplvicmt67.R.inc(5560);String ret = getParseUntil(compl);
        __CLR4_5_23fp3fplvicmt67.R.inc(5561);stream.advance(1);
        __CLR4_5_23fp3fplvicmt67.R.inc(5562);return ret;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    @Nonnull
    private String getParseUntil(@Nonnull String compl) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5563);
        __CLR4_5_23fp3fplvicmt67.R.inc(5564);return getParseUntil(compl, false);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    @Nonnull
    private String getParseUntil(@Nonnull String compl, boolean commaWhitespace) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5565);
        __CLR4_5_23fp3fplvicmt67.R.inc(5566);String r = stream.rest();
        assert (((r != null)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5567)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5568)==0&false));
        __CLR4_5_23fp3fplvicmt67.R.inc(5569);int i = 0;
        __CLR4_5_23fp3fplvicmt67.R.inc(5570);boolean hasEscapedChars = false;
        __CLR4_5_23fp3fplvicmt67.R.inc(5571);while ((((i < r.length())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5572)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5573)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5574);if ((((r.charAt(i) == '\\')&&(__CLR4_5_23fp3fplvicmt67.R.iget(5575)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5576)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5577);hasEscapedChars = true;
                __CLR4_5_23fp3fplvicmt67.R.inc(5578);i += 2;// Escape
                __CLR4_5_23fp3fplvicmt67.R.inc(5579);continue;
            }
            }__CLR4_5_23fp3fplvicmt67.R.inc(5580);if ((((compl.contains(r.subSequence(i, i + 1)))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5581)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5582)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5583);if ((((commaWhitespace && r.charAt(i) == ',')&&(__CLR4_5_23fp3fplvicmt67.R.iget(5584)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5585)==0&false))) {{
                    // a comma is only a valid separator with a following
                    // whitespace
                    // see bug and specification update
                    // http://code.google.com/p/oboformat/issues/detail?id=54
                    __CLR4_5_23fp3fplvicmt67.R.inc(5586);if ((((i + 1 < r.length() && r.charAt(i + 1) == ' ')&&(__CLR4_5_23fp3fplvicmt67.R.iget(5587)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5588)==0&false))) {{
                        __CLR4_5_23fp3fplvicmt67.R.inc(5589);break;
                    }
                }} }else {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(5590);break;
                }
            }}
            }__CLR4_5_23fp3fplvicmt67.R.inc(5591);i++;
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5592);if ((((i == 0)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5593)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5594)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5595);return "";
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5596);String ret = r.substring(0, i);
        __CLR4_5_23fp3fplvicmt67.R.inc(5597);if ((((hasEscapedChars)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5598)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5599)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5600);StringBuilder sb = new StringBuilder();
            __CLR4_5_23fp3fplvicmt67.R.inc(5601);for (int j = 0; (((j < ret.length())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5602)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5603)==0&false)); j++) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5604);char c = ret.charAt(j);
                __CLR4_5_23fp3fplvicmt67.R.inc(5605);if ((((c == '\\')&&(__CLR4_5_23fp3fplvicmt67.R.iget(5606)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5607)==0&false))) {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(5608);int next = j + 1;
                    __CLR4_5_23fp3fplvicmt67.R.inc(5609);if ((((next < ret.length())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5610)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5611)==0&false))) {{
                        __CLR4_5_23fp3fplvicmt67.R.inc(5612);char nextChar = ret.charAt(next);
                        boolean __CLB4_5_2_bool0=false;__CLR4_5_23fp3fplvicmt67.R.inc(5613);switch (nextChar) {
                            case 'n':if (!__CLB4_5_2_bool0) {__CLR4_5_23fp3fplvicmt67.R.inc(5614);__CLB4_5_2_bool0=true;}// newline
                                __CLR4_5_23fp3fplvicmt67.R.inc(5615);sb.append('\n');
                                __CLR4_5_23fp3fplvicmt67.R.inc(5616);break;
                            case 'W':if (!__CLB4_5_2_bool0) {__CLR4_5_23fp3fplvicmt67.R.inc(5617);__CLB4_5_2_bool0=true;}// single space
                                __CLR4_5_23fp3fplvicmt67.R.inc(5618);sb.append(' ');
                                __CLR4_5_23fp3fplvicmt67.R.inc(5619);break;
                            case 't':if (!__CLB4_5_2_bool0) {__CLR4_5_23fp3fplvicmt67.R.inc(5620);__CLB4_5_2_bool0=true;}// tab
                                __CLR4_5_23fp3fplvicmt67.R.inc(5621);sb.append('\n');
                                __CLR4_5_23fp3fplvicmt67.R.inc(5622);break;
                            default:if (!__CLB4_5_2_bool0) {__CLR4_5_23fp3fplvicmt67.R.inc(5623);__CLB4_5_2_bool0=true;}
                                // assume that any char after a backlash is an
                                // escaped char.
                                // spec for this optional behavior
                                // http://www.geneontology.org/GO.format.obo-1_2.shtml#S.1.5
                                __CLR4_5_23fp3fplvicmt67.R.inc(5624);sb.append(nextChar);
                                __CLR4_5_23fp3fplvicmt67.R.inc(5625);break;
                        }
                        __CLR4_5_23fp3fplvicmt67.R.inc(5626);j += 1;// skip the next char
                    }
                }} }else {{
                    __CLR4_5_23fp3fplvicmt67.R.inc(5627);sb.append(c);
                }
            }}
            }__CLR4_5_23fp3fplvicmt67.R.inc(5628);ret = sb.toString();
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5629);stream.advance(i);
        __CLR4_5_23fp3fplvicmt67.R.inc(5630);String cachedValue = stringCache.getUnchecked(ret);
        __CLR4_5_23fp3fplvicmt67.R.inc(5631);if ((((LOG.isTraceEnabled())&&(__CLR4_5_23fp3fplvicmt67.R.iget(5632)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5633)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5634);if ((((ret != cachedValue)&&(__CLR4_5_23fp3fplvicmt67.R.iget(5635)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5636)==0&false))) {{
                __CLR4_5_23fp3fplvicmt67.R.inc(5637);LOG.trace("Cache hit for  {}", cachedValue);
            }
        }}
        }__CLR4_5_23fp3fplvicmt67.R.inc(5638);return cachedValue;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    @Nonnull
    private static String mapDeprecatedTag(@Nonnull String tag) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5639);
        __CLR4_5_23fp3fplvicmt67.R.inc(5640);if ((((tag.equals("inverse_of_on_instance_level"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5641)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5642)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5643);return OboFormatTag.TAG_INVERSE_OF.getTag();
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5644);if ((((tag.equals("xref_analog"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5645)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5646)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5647);return OboFormatTag.TAG_XREF.getTag();
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5648);if ((((tag.equals("xref_unknown"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5649)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5650)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5651);return OboFormatTag.TAG_XREF.getTag();
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5652);if ((((tag.equals("instance_level_is_transitive"))&&(__CLR4_5_23fp3fplvicmt67.R.iget(5653)!=0|true))||(__CLR4_5_23fp3fplvicmt67.R.iget(5654)==0&false))) {{
            __CLR4_5_23fp3fplvicmt67.R.inc(5655);return OboFormatTag.TAG_IS_TRANSITIVE.getTag();
        }
        }__CLR4_5_23fp3fplvicmt67.R.inc(5656);return tag;
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private static String removeTrailingWS(@Nonnull String s) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5657);
        // TODO make this more efficient
        __CLR4_5_23fp3fplvicmt67.R.inc(5658);return s.replaceAll("\\s*$", "");
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void error(String message) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5659);
        __CLR4_5_23fp3fplvicmt67.R.inc(5660);throw new OBOFormatParserException(message, stream.lineNo, stream.line);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}

    private void warn(String message) {try{__CLR4_5_23fp3fplvicmt67.R.inc(5661);
        __CLR4_5_23fp3fplvicmt67.R.inc(5662);LOG.warn("LINE: {} {}  LINE:\n{}", stream.lineNo, message, stream.line);
    }finally{__CLR4_5_23fp3fplvicmt67.R.flushNeeded();}}
}
