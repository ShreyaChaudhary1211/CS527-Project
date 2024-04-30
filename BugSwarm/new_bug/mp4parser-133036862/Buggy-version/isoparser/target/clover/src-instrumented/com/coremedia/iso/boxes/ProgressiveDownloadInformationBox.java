/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 */
public class ProgressiveDownloadInformationBox extends AbstractFullBox {public static class __CLR4_5_21h81h8lvlulbsr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006d\u0070\u0034\u0070\u0061\u0072\u0073\u0065\u0072\u002d\u0031\u0033\u0033\u0030\u0033\u0036\u0038\u0036\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u0073\u006f\u0070\u0061\u0072\u0073\u0065\u0072\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714448869219L,8589935092L,1975,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String TYPE = "pdin";

    List<Entry> entries = Collections.emptyList();

    public ProgressiveDownloadInformationBox() {
        super(TYPE);__CLR4_5_21h81h8lvlulbsr.R.inc(1917);try{__CLR4_5_21h81h8lvlulbsr.R.inc(1916);
    }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

    @Override
    protected long getContentSize() {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1918);
        __CLR4_5_21h81h8lvlulbsr.R.inc(1919);return 4 + entries.size() * 8;
    }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

    @Override
    protected void getContent(ByteBuffer byteBuffer) {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1920);
        __CLR4_5_21h81h8lvlulbsr.R.inc(1921);writeVersionAndFlags(byteBuffer);
        __CLR4_5_21h81h8lvlulbsr.R.inc(1922);for (Entry entry : entries) {{
            __CLR4_5_21h81h8lvlulbsr.R.inc(1923);IsoTypeWriter.writeUInt32(byteBuffer, entry.getRate());
            __CLR4_5_21h81h8lvlulbsr.R.inc(1924);IsoTypeWriter.writeUInt32(byteBuffer, entry.getInitialDelay());
        }
    }}finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

    public List<Entry> getEntries() {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1925);
        __CLR4_5_21h81h8lvlulbsr.R.inc(1926);return entries;
    }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

    public void setEntries(List<Entry> entries) {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1927);
        __CLR4_5_21h81h8lvlulbsr.R.inc(1928);this.entries = entries;
    }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

    @Override
    public void _parseDetails(ByteBuffer content) {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1929);
        __CLR4_5_21h81h8lvlulbsr.R.inc(1930);parseVersionAndFlags(content);
        __CLR4_5_21h81h8lvlulbsr.R.inc(1931);entries = new LinkedList<Entry>();
        __CLR4_5_21h81h8lvlulbsr.R.inc(1932);while ((((content.remaining() >= 8)&&(__CLR4_5_21h81h8lvlulbsr.R.iget(1933)!=0|true))||(__CLR4_5_21h81h8lvlulbsr.R.iget(1934)==0&false))) {{
            __CLR4_5_21h81h8lvlulbsr.R.inc(1935);Entry entry = new Entry(IsoTypeReader.readUInt32(content), IsoTypeReader.readUInt32(content));
            __CLR4_5_21h81h8lvlulbsr.R.inc(1936);entries.add(entry);
        }
    }}finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}


    public static class Entry {
        long rate;
        long initialDelay;

        public Entry(long rate, long initialDelay) {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1937);
            __CLR4_5_21h81h8lvlulbsr.R.inc(1938);this.rate = rate;
            __CLR4_5_21h81h8lvlulbsr.R.inc(1939);this.initialDelay = initialDelay;
        }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

        public long getRate() {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1940);
            __CLR4_5_21h81h8lvlulbsr.R.inc(1941);return rate;
        }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

        public void setRate(long rate) {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1942);
            __CLR4_5_21h81h8lvlulbsr.R.inc(1943);this.rate = rate;
        }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

        public long getInitialDelay() {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1944);
            __CLR4_5_21h81h8lvlulbsr.R.inc(1945);return initialDelay;
        }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

        public void setInitialDelay(long initialDelay) {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1946);
            __CLR4_5_21h81h8lvlulbsr.R.inc(1947);this.initialDelay = initialDelay;
        }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1948);
            __CLR4_5_21h81h8lvlulbsr.R.inc(1949);return "Entry{" +
                    "rate=" + rate +
                    ", initialDelay=" + initialDelay +
                    '}';
        }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1950);
            __CLR4_5_21h81h8lvlulbsr.R.inc(1951);if ((((this == o)&&(__CLR4_5_21h81h8lvlulbsr.R.iget(1952)!=0|true))||(__CLR4_5_21h81h8lvlulbsr.R.iget(1953)==0&false))) {__CLR4_5_21h81h8lvlulbsr.R.inc(1954);return true;
            }__CLR4_5_21h81h8lvlulbsr.R.inc(1955);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_21h81h8lvlulbsr.R.iget(1956)!=0|true))||(__CLR4_5_21h81h8lvlulbsr.R.iget(1957)==0&false))) {__CLR4_5_21h81h8lvlulbsr.R.inc(1958);return false;

            }__CLR4_5_21h81h8lvlulbsr.R.inc(1959);Entry entry = (Entry) o;

            __CLR4_5_21h81h8lvlulbsr.R.inc(1960);if ((((initialDelay != entry.initialDelay)&&(__CLR4_5_21h81h8lvlulbsr.R.iget(1961)!=0|true))||(__CLR4_5_21h81h8lvlulbsr.R.iget(1962)==0&false))) {__CLR4_5_21h81h8lvlulbsr.R.inc(1963);return false;
            }__CLR4_5_21h81h8lvlulbsr.R.inc(1964);if ((((rate != entry.rate)&&(__CLR4_5_21h81h8lvlulbsr.R.iget(1965)!=0|true))||(__CLR4_5_21h81h8lvlulbsr.R.iget(1966)==0&false))) {__CLR4_5_21h81h8lvlulbsr.R.inc(1967);return false;

            }__CLR4_5_21h81h8lvlulbsr.R.inc(1968);return true;
        }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1969);
            __CLR4_5_21h81h8lvlulbsr.R.inc(1970);int result = (int) (rate ^ (rate >>> 32));
            __CLR4_5_21h81h8lvlulbsr.R.inc(1971);result = 31 * result + (int) (initialDelay ^ (initialDelay >>> 32));
            __CLR4_5_21h81h8lvlulbsr.R.inc(1972);return result;
        }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}
    }

    @Override
    public String toString() {try{__CLR4_5_21h81h8lvlulbsr.R.inc(1973);
        __CLR4_5_21h81h8lvlulbsr.R.inc(1974);return "ProgressiveDownloadInfoBox{" +
                "entries=" + entries +
                '}';
    }finally{__CLR4_5_21h81h8lvlulbsr.R.flushNeeded();}}

}