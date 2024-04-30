/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi.io;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.2
 */
public class RDFLiteral extends RDFNode {public static class __CLR4_5_2y1y1lvickkzc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,1300,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final String lexicalValue;
    @Nonnull
    private final String lang;
    @Nonnull
    private final IRI datatype;
    private int hashCode;

    /**
     * Constructor for plain literal wrappers
     * 
     * @param literal
     *        lexical form
     * @param lang
     *        language tag
     * @param datatype
     *        datatype IRI
     */
    public RDFLiteral(@Nonnull String literal, @Nonnull String lang,
            @Nullable IRI datatype) {try{__CLR4_5_2y1y1lvickkzc.R.inc(1225);
        __CLR4_5_2y1y1lvickkzc.R.inc(1226);lexicalValue = checkNotNull(literal, "literal cannot be null");
        __CLR4_5_2y1y1lvickkzc.R.inc(1227);this.lang = lang;
        __CLR4_5_2y1y1lvickkzc.R.inc(1228);this.datatype = (((datatype == null )&&(__CLR4_5_2y1y1lvickkzc.R.iget(1229)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1230)==0&false))? OWL2Datatype.RDF_PLAIN_LITERAL
                .getIRI() : datatype;
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    /**
     * @param literal
     *        the wrapped literal
     */
    public RDFLiteral(@Nonnull OWLLiteral literal) {
        this(literal.getLiteral(), literal.getLang(), literal.getDatatype()
                .getIRI());__CLR4_5_2y1y1lvickkzc.R.inc(1232);try{__CLR4_5_2y1y1lvickkzc.R.inc(1231);
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    @Override
    public boolean isLiteral() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1233);
        __CLR4_5_2y1y1lvickkzc.R.inc(1234);return true;
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1235);
        __CLR4_5_2y1y1lvickkzc.R.inc(1236);if ((((hashCode == 0)&&(__CLR4_5_2y1y1lvickkzc.R.iget(1237)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1238)==0&false))) {{
            __CLR4_5_2y1y1lvickkzc.R.inc(1239);hashCode = 37;
            __CLR4_5_2y1y1lvickkzc.R.inc(1240);hashCode = hashCode * 37 + lexicalValue.hashCode();
            __CLR4_5_2y1y1lvickkzc.R.inc(1241);hashCode = hashCode * 37 + lang.hashCode();
            __CLR4_5_2y1y1lvickkzc.R.inc(1242);hashCode = hashCode * 37 + datatype.hashCode();
        }
        }__CLR4_5_2y1y1lvickkzc.R.inc(1243);return hashCode;
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_2y1y1lvickkzc.R.inc(1244);
        __CLR4_5_2y1y1lvickkzc.R.inc(1245);if ((((obj == this)&&(__CLR4_5_2y1y1lvickkzc.R.iget(1246)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1247)==0&false))) {{
            __CLR4_5_2y1y1lvickkzc.R.inc(1248);return true;
        }
        }__CLR4_5_2y1y1lvickkzc.R.inc(1249);if ((((!(obj instanceof RDFLiteral))&&(__CLR4_5_2y1y1lvickkzc.R.iget(1250)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1251)==0&false))) {{
            __CLR4_5_2y1y1lvickkzc.R.inc(1252);return false;
        }
        }__CLR4_5_2y1y1lvickkzc.R.inc(1253);RDFLiteral other = (RDFLiteral) obj;
        __CLR4_5_2y1y1lvickkzc.R.inc(1254);if ((((!lexicalValue.equals(other.lexicalValue))&&(__CLR4_5_2y1y1lvickkzc.R.iget(1255)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1256)==0&false))) {{
            __CLR4_5_2y1y1lvickkzc.R.inc(1257);return false;
        }
        }__CLR4_5_2y1y1lvickkzc.R.inc(1258);if ((((!lang.equals(other.lang))&&(__CLR4_5_2y1y1lvickkzc.R.iget(1259)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1260)==0&false))) {{
            __CLR4_5_2y1y1lvickkzc.R.inc(1261);return false;
        }
        }__CLR4_5_2y1y1lvickkzc.R.inc(1262);return datatype.equals(other.datatype);
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1263);
        __CLR4_5_2y1y1lvickkzc.R.inc(1264);return lexicalValue;
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    @Override
    public IRI getIRI() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1265);
        __CLR4_5_2y1y1lvickkzc.R.inc(1266);throw new UnsupportedOperationException("RDF Literals do not have IRIs");
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    @Override
    public boolean isAnonymous() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1267);
        __CLR4_5_2y1y1lvickkzc.R.inc(1268);return false;
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    /** @return the lexical form for this literal */
    @Nonnull
    public String getLexicalValue() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1269);
        __CLR4_5_2y1y1lvickkzc.R.inc(1270);return lexicalValue;
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    /** @return the lang tag for this literal */
    @Nonnull
    public String getLang() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1271);
        __CLR4_5_2y1y1lvickkzc.R.inc(1272);return lang;
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    /** @return the datatype for this literal */
    @Nonnull
    public IRI getDatatype() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1273);
        __CLR4_5_2y1y1lvickkzc.R.inc(1274);return datatype;
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    /** @return true if this literal has a non empty lang tag */
    public boolean hasLang() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1275);
        __CLR4_5_2y1y1lvickkzc.R.inc(1276);return !lang.isEmpty();
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    /** @return true if the datatype of this literal is plain literal */
    public boolean isPlainLiteral() {try{__CLR4_5_2y1y1lvickkzc.R.inc(1277);
        __CLR4_5_2y1y1lvickkzc.R.inc(1278);return OWL2Datatype.RDF_PLAIN_LITERAL.getIRI().equals(datatype);
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}

    @Override
    public int compareTo(RDFNode o) {try{__CLR4_5_2y1y1lvickkzc.R.inc(1279);
        __CLR4_5_2y1y1lvickkzc.R.inc(1280);if ((((!o.isLiteral())&&(__CLR4_5_2y1y1lvickkzc.R.iget(1281)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1282)==0&false))) {{
            __CLR4_5_2y1y1lvickkzc.R.inc(1283);return -1;
        }
        }__CLR4_5_2y1y1lvickkzc.R.inc(1284);if ((((equals(o))&&(__CLR4_5_2y1y1lvickkzc.R.iget(1285)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1286)==0&false))) {{
            __CLR4_5_2y1y1lvickkzc.R.inc(1287);return 0;
        }
        }__CLR4_5_2y1y1lvickkzc.R.inc(1288);int diff = 0;
        __CLR4_5_2y1y1lvickkzc.R.inc(1289);RDFLiteral lit2 = (RDFLiteral) o;
        __CLR4_5_2y1y1lvickkzc.R.inc(1290);diff = lexicalValue.compareTo(lit2.lexicalValue);
        __CLR4_5_2y1y1lvickkzc.R.inc(1291);if ((((diff == 0)&&(__CLR4_5_2y1y1lvickkzc.R.iget(1292)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1293)==0&false))) {{
            __CLR4_5_2y1y1lvickkzc.R.inc(1294);diff = getDatatype().compareTo(lit2.getDatatype());
        }
        }__CLR4_5_2y1y1lvickkzc.R.inc(1295);if ((((diff == 0)&&(__CLR4_5_2y1y1lvickkzc.R.iget(1296)!=0|true))||(__CLR4_5_2y1y1lvickkzc.R.iget(1297)==0&false))) {{
            __CLR4_5_2y1y1lvickkzc.R.inc(1298);diff = getLang().compareTo(lit2.getLang());
        }
        }__CLR4_5_2y1y1lvickkzc.R.inc(1299);return diff;
    }finally{__CLR4_5_2y1y1lvickkzc.R.flushNeeded();}}
}
