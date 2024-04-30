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
package uk.ac.manchester.cs.owl.owlapi;

import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import com.google.common.base.Optional;

/**
 * An OWLLiteral whose datatype is RDF_PLAIN_LITERAL
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group, Date: 26-Oct-2006
 */
public class OWLLiteralImplPlain extends OWLObjectImplWithoutEntityAndAnonCaching implements OWLLiteral {public static class __CLR4_5_26av6avlviclg3d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,8294,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 30406L;
    @Nonnull
    private static final OWLDatatype RDF_PLAIN_LITERAL = new OWL2DatatypeImpl(OWL2Datatype.RDF_PLAIN_LITERAL);
    @Nonnull
    private final String literal;
    @Nonnull
    private final String lang;

    /**
     * @param literal
     *        the lexical form
     * @param lang
     *        the language; can be null or empty
     */
    public OWLLiteralImplPlain(@Nonnull String literal, @Nullable String lang) {try{__CLR4_5_26av6avlviclg3d.R.inc(8167);
        __CLR4_5_26av6avlviclg3d.R.inc(8168);this.literal = literal;
        __CLR4_5_26av6avlviclg3d.R.inc(8169);if ((((lang == null || lang.length() == 0)&&(__CLR4_5_26av6avlviclg3d.R.iget(8170)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8171)==0&false))) {{
            __CLR4_5_26av6avlviclg3d.R.inc(8172);this.lang = "";
        } }else {{
            __CLR4_5_26av6avlviclg3d.R.inc(8173);this.lang = lang;
        }
        }__CLR4_5_26av6avlviclg3d.R.inc(8174);hashCode = getHashCode();
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_26av6avlviclg3d.R.inc(8175);
        __CLR4_5_26av6avlviclg3d.R.inc(8176);entities.add(RDF_PLAIN_LITERAL);
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_26av6avlviclg3d.R.inc(8177);}finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    protected int index() {try{__CLR4_5_26av6avlviclg3d.R.inc(8178);
        __CLR4_5_26av6avlviclg3d.R.inc(8179);return OWLObjectTypeIndexProvider.DATA_TYPE_INDEX_BASE + 8;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public String getLiteral() {try{__CLR4_5_26av6avlviclg3d.R.inc(8180);
        __CLR4_5_26av6avlviclg3d.R.inc(8181);return literal;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public boolean hasLang() {try{__CLR4_5_26av6avlviclg3d.R.inc(8182);
        __CLR4_5_26av6avlviclg3d.R.inc(8183);return !lang.equals("");
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public int parseInteger() throws NumberFormatException {try{__CLR4_5_26av6avlviclg3d.R.inc(8184);
        __CLR4_5_26av6avlviclg3d.R.inc(8185);return Integer.parseInt(getLiteral());
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public boolean isRDFPlainLiteral() {try{__CLR4_5_26av6avlviclg3d.R.inc(8186);
        __CLR4_5_26av6avlviclg3d.R.inc(8187);return true;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public boolean isInteger() {try{__CLR4_5_26av6avlviclg3d.R.inc(8188);
        __CLR4_5_26av6avlviclg3d.R.inc(8189);return false;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public boolean isBoolean() {try{__CLR4_5_26av6avlviclg3d.R.inc(8190);
        __CLR4_5_26av6avlviclg3d.R.inc(8191);return false;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public boolean isDouble() {try{__CLR4_5_26av6avlviclg3d.R.inc(8192);
        __CLR4_5_26av6avlviclg3d.R.inc(8193);return false;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public boolean isFloat() {try{__CLR4_5_26av6avlviclg3d.R.inc(8194);
        __CLR4_5_26av6avlviclg3d.R.inc(8195);return false;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public boolean parseBoolean() {try{__CLR4_5_26av6avlviclg3d.R.inc(8196);
        __CLR4_5_26av6avlviclg3d.R.inc(8197);throw new OWLRuntimeException(getClass().getName() + " does not have a boolean value");
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public double parseDouble() {try{__CLR4_5_26av6avlviclg3d.R.inc(8198);
        __CLR4_5_26av6avlviclg3d.R.inc(8199);throw new OWLRuntimeException(getClass().getName() + " does not have a double value");
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public float parseFloat() {try{__CLR4_5_26av6avlviclg3d.R.inc(8200);
        __CLR4_5_26av6avlviclg3d.R.inc(8201);throw new OWLRuntimeException(getClass().getName() + " does not have a float value");
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public String getLang() {try{__CLR4_5_26av6avlviclg3d.R.inc(8202);
        __CLR4_5_26av6avlviclg3d.R.inc(8203);return lang;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public boolean hasLang(String l) {try{__CLR4_5_26av6avlviclg3d.R.inc(8204);
        __CLR4_5_26av6avlviclg3d.R.inc(8205);if ((((l == null)&&(__CLR4_5_26av6avlviclg3d.R.iget(8206)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8207)==0&false))) {{
            __CLR4_5_26av6avlviclg3d.R.inc(8208);return lang.isEmpty();
        }
        }__CLR4_5_26av6avlviclg3d.R.inc(8209);return lang.equalsIgnoreCase(l.trim());
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public OWLDatatype getDatatype() {try{__CLR4_5_26av6avlviclg3d.R.inc(8210);
        __CLR4_5_26av6avlviclg3d.R.inc(8211);return RDF_PLAIN_LITERAL;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_26av6avlviclg3d.R.inc(8212);
        __CLR4_5_26av6avlviclg3d.R.inc(8213);return hashCode;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    private final int getHashCode() {try{__CLR4_5_26av6avlviclg3d.R.inc(8214);
        __CLR4_5_26av6avlviclg3d.R.inc(8215);int code = 277;
        __CLR4_5_26av6avlviclg3d.R.inc(8216);code = code * 37 + getDatatype().hashCode();
        __CLR4_5_26av6avlviclg3d.R.inc(8217);code = code * 37;
        __CLR4_5_26av6avlviclg3d.R.inc(8218);try {
            __CLR4_5_26av6avlviclg3d.R.inc(8219);if ((((isInteger())&&(__CLR4_5_26av6avlviclg3d.R.iget(8220)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8221)==0&false))) {{
                __CLR4_5_26av6avlviclg3d.R.inc(8222);code += parseInteger() * 65536;
            } }else {__CLR4_5_26av6avlviclg3d.R.inc(8223);if ((((isDouble())&&(__CLR4_5_26av6avlviclg3d.R.iget(8224)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8225)==0&false))) {{
                __CLR4_5_26av6avlviclg3d.R.inc(8226);code += (int) parseDouble() * 65536;
            } }else {__CLR4_5_26av6avlviclg3d.R.inc(8227);if ((((isFloat())&&(__CLR4_5_26av6avlviclg3d.R.iget(8228)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8229)==0&false))) {{
                __CLR4_5_26av6avlviclg3d.R.inc(8230);code += (int) parseFloat() * 65536;
            } }else {__CLR4_5_26av6avlviclg3d.R.inc(8231);if ((((isBoolean())&&(__CLR4_5_26av6avlviclg3d.R.iget(8232)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8233)==0&false))) {{
                __CLR4_5_26av6avlviclg3d.R.inc(8234);code += (((parseBoolean() )&&(__CLR4_5_26av6avlviclg3d.R.iget(8235)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8236)==0&false))? 65536 : 0;
            } }else {{
                __CLR4_5_26av6avlviclg3d.R.inc(8237);code += getLiteral().hashCode() * 65536;
            }
        }}}}} catch (NumberFormatException e) {
            // it is possible that a literal does not have a value that's valid
            // for its datatype; not very useful for a consistent ontology but
            // some W3C reasoner tests use them
            __CLR4_5_26av6avlviclg3d.R.inc(8238);code += getLiteral().hashCode() * 65536;
        }
        __CLR4_5_26av6avlviclg3d.R.inc(8239);if ((((hasLang())&&(__CLR4_5_26av6avlviclg3d.R.iget(8240)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8241)==0&false))) {{
            __CLR4_5_26av6avlviclg3d.R.inc(8242);code = code * 37 + getLang().hashCode();
        }
        }__CLR4_5_26av6avlviclg3d.R.inc(8243);return code;
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_26av6avlviclg3d.R.inc(8244);
        __CLR4_5_26av6avlviclg3d.R.inc(8245);if ((((this == obj)&&(__CLR4_5_26av6avlviclg3d.R.iget(8246)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8247)==0&false))) {{
            __CLR4_5_26av6avlviclg3d.R.inc(8248);return true;
        }
        }__CLR4_5_26av6avlviclg3d.R.inc(8249);if ((((!super.equals(obj))&&(__CLR4_5_26av6avlviclg3d.R.iget(8250)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8251)==0&false))) {{
            __CLR4_5_26av6avlviclg3d.R.inc(8252);return false;
        }
        }__CLR4_5_26av6avlviclg3d.R.inc(8253);if ((((!(obj instanceof OWLLiteral))&&(__CLR4_5_26av6avlviclg3d.R.iget(8254)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8255)==0&false))) {{
            __CLR4_5_26av6avlviclg3d.R.inc(8256);return false;
        }
        }__CLR4_5_26av6avlviclg3d.R.inc(8257);OWLLiteral other = (OWLLiteral) obj;
        __CLR4_5_26av6avlviclg3d.R.inc(8258);if ((((other instanceof OWLLiteralImplPlain)&&(__CLR4_5_26av6avlviclg3d.R.iget(8259)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8260)==0&false))) {{
            __CLR4_5_26av6avlviclg3d.R.inc(8261);return literal.equals(((OWLLiteralImplPlain) other).literal) && lang.equals(other.getLang());
        }
        }__CLR4_5_26av6avlviclg3d.R.inc(8262);return getLiteral().equals(other.getLiteral()) && getDatatype().equals(other.getDatatype()) && lang.equals(other
            .getLang());
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public void accept(OWLDataVisitor visitor) {try{__CLR4_5_26av6avlviclg3d.R.inc(8263);
        __CLR4_5_26av6avlviclg3d.R.inc(8264);visitor.visit(this);
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataVisitorEx<O> visitor) {try{__CLR4_5_26av6avlviclg3d.R.inc(8265);
        __CLR4_5_26av6avlviclg3d.R.inc(8266);return visitor.visit(this);
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public void accept(OWLAnnotationValueVisitor visitor) {try{__CLR4_5_26av6avlviclg3d.R.inc(8267);
        __CLR4_5_26av6avlviclg3d.R.inc(8268);visitor.visit(this);
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAnnotationValueVisitorEx<O> visitor) {try{__CLR4_5_26av6avlviclg3d.R.inc(8269);
        __CLR4_5_26av6avlviclg3d.R.inc(8270);return visitor.visit(this);
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_26av6avlviclg3d.R.inc(8271);
        __CLR4_5_26av6avlviclg3d.R.inc(8272);OWLLiteral other = (OWLLiteral) object;
        __CLR4_5_26av6avlviclg3d.R.inc(8273);int diff = getLiteral().compareTo(other.getLiteral());
        __CLR4_5_26av6avlviclg3d.R.inc(8274);if ((((diff != 0)&&(__CLR4_5_26av6avlviclg3d.R.iget(8275)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8276)==0&false))) {{
            __CLR4_5_26av6avlviclg3d.R.inc(8277);return diff;
        }
        }__CLR4_5_26av6avlviclg3d.R.inc(8278);diff = getDatatype().compareTo(other.getDatatype());
        __CLR4_5_26av6avlviclg3d.R.inc(8279);if ((((diff != 0)&&(__CLR4_5_26av6avlviclg3d.R.iget(8280)!=0|true))||(__CLR4_5_26av6avlviclg3d.R.iget(8281)==0&false))) {{
            __CLR4_5_26av6avlviclg3d.R.inc(8282);return diff;
        }
        }__CLR4_5_26av6avlviclg3d.R.inc(8283);return lang.compareTo(other.getLang());
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_26av6avlviclg3d.R.inc(8284);
        __CLR4_5_26av6avlviclg3d.R.inc(8285);visitor.visit(this);
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_26av6avlviclg3d.R.inc(8286);
        __CLR4_5_26av6avlviclg3d.R.inc(8287);return visitor.visit(this);
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public Optional<IRI> asIRI() {try{__CLR4_5_26av6avlviclg3d.R.inc(8288);
        __CLR4_5_26av6avlviclg3d.R.inc(8289);return Optional.absent();
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public Optional<OWLAnonymousIndividual> asAnonymousIndividual() {try{__CLR4_5_26av6avlviclg3d.R.inc(8290);
        __CLR4_5_26av6avlviclg3d.R.inc(8291);return Optional.absent();
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}

    @Override
    public Optional<OWLLiteral> asLiteral() {try{__CLR4_5_26av6avlviclg3d.R.inc(8292);
        __CLR4_5_26av6avlviclg3d.R.inc(8293);return Optional.<OWLLiteral> of(this);
    }finally{__CLR4_5_26av6avlviclg3d.R.flushNeeded();}}
}
