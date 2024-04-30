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
package org.semanticweb.owlapi.api.test.literals;

import static org.junit.Assert.*;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.AbstractAxiomsRoundTrippingTestCase;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.1.0
 */
@SuppressWarnings("javadoc")
public class LiteralTestCase extends AbstractAxiomsRoundTrippingTestCase {static class __CLR4_5_264t64tlvico0xb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,8017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    @Override
    protected Set<? extends OWLAxiom> createAxioms() {try{__CLR4_5_264t64tlvico0xb.R.inc(7949);
        __CLR4_5_264t64tlvico0xb.R.inc(7950);OWLLiteral literalWithLang = Literal("abc", "en");
        __CLR4_5_264t64tlvico0xb.R.inc(7951);OWLClass cls = Class(iri("A"));
        __CLR4_5_264t64tlvico0xb.R.inc(7952);OWLAnnotationProperty prop = AnnotationProperty(iri("prop"));
        __CLR4_5_264t64tlvico0xb.R.inc(7953);OWLAnnotationAssertionAxiom ax = AnnotationAssertion(prop, cls.getIRI(), literalWithLang);
        __CLR4_5_264t64tlvico0xb.R.inc(7954);Set<OWLAxiom> axioms = new HashSet<>();
        __CLR4_5_264t64tlvico0xb.R.inc(7955);axioms.add(ax);
        __CLR4_5_264t64tlvico0xb.R.inc(7956);axioms.add(Declaration(cls));
        __CLR4_5_264t64tlvico0xb.R.inc(7957);return axioms;
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}

    @Test
    public void testHasLangMethod() {__CLR4_5_264t64tlvico0xb.R.globalSliceStart(getClass().getName(),7958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utwgbi652();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_264t64tlvico0xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_264t64tlvico0xb.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.LiteralTestCase.testHasLangMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utwgbi652(){try{__CLR4_5_264t64tlvico0xb.R.inc(7958);
        __CLR4_5_264t64tlvico0xb.R.inc(7959);OWLLiteral literalWithLang = Literal("abc", "en");
        __CLR4_5_264t64tlvico0xb.R.inc(7960);assertTrue(literalWithLang.hasLang());
        __CLR4_5_264t64tlvico0xb.R.inc(7961);OWLLiteral literalWithoutLang = Literal("abc", "");
        __CLR4_5_264t64tlvico0xb.R.inc(7962);assertFalse(literalWithoutLang.hasLang());
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}

    @Test
    public void testGetLangMethod() {__CLR4_5_264t64tlvico0xb.R.globalSliceStart(getClass().getName(),7963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a3fkti657();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_264t64tlvico0xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_264t64tlvico0xb.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.LiteralTestCase.testGetLangMethod",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a3fkti657(){try{__CLR4_5_264t64tlvico0xb.R.inc(7963);
        __CLR4_5_264t64tlvico0xb.R.inc(7964);OWLLiteral literalWithLang = Literal("abc", "en");
        __CLR4_5_264t64tlvico0xb.R.inc(7965);assertEquals("en", literalWithLang.getLang());
        __CLR4_5_264t64tlvico0xb.R.inc(7966);OWLLiteral literalWithoutLang = Literal("abc", "");
        __CLR4_5_264t64tlvico0xb.R.inc(7967);assertEquals("", literalWithoutLang.getLang());
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}

    @Test
    public void testNormalisation() {__CLR4_5_264t64tlvico0xb.R.globalSliceStart(getClass().getName(),7968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xip2op65c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_264t64tlvico0xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_264t64tlvico0xb.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.LiteralTestCase.testNormalisation",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7968,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xip2op65c(){try{__CLR4_5_264t64tlvico0xb.R.inc(7968);
        __CLR4_5_264t64tlvico0xb.R.inc(7969);OWLLiteral literalWithLang = Literal("abc", "EN");
        __CLR4_5_264t64tlvico0xb.R.inc(7970);assertEquals("en", literalWithLang.getLang());
        __CLR4_5_264t64tlvico0xb.R.inc(7971);assertTrue(literalWithLang.hasLang("EN"));
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}

    @Test
    public void testPlainLiteralWithLang() {__CLR4_5_264t64tlvico0xb.R.globalSliceStart(getClass().getName(),7972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ri5jiq65g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_264t64tlvico0xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_264t64tlvico0xb.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.LiteralTestCase.testPlainLiteralWithLang",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7972,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ri5jiq65g(){try{__CLR4_5_264t64tlvico0xb.R.inc(7972);
        __CLR4_5_264t64tlvico0xb.R.inc(7973);OWLLiteral literalWithLang = Literal("abc", "en");
        __CLR4_5_264t64tlvico0xb.R.inc(7974);assertTrue(literalWithLang.getDatatype().getIRI().isPlainLiteral());
        __CLR4_5_264t64tlvico0xb.R.inc(7975);assertTrue(literalWithLang.isRDFPlainLiteral());
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}

    @Test
    public void testPlainLiteralWithEmbeddedLang() {__CLR4_5_264t64tlvico0xb.R.globalSliceStart(getClass().getName(),7976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26enibo65k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_264t64tlvico0xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_264t64tlvico0xb.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.LiteralTestCase.testPlainLiteralWithEmbeddedLang",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26enibo65k(){try{__CLR4_5_264t64tlvico0xb.R.inc(7976);
        __CLR4_5_264t64tlvico0xb.R.inc(7977);OWLLiteral literal = Literal("abc@en", PlainLiteral());
        __CLR4_5_264t64tlvico0xb.R.inc(7978);assertTrue(literal.hasLang());
        __CLR4_5_264t64tlvico0xb.R.inc(7979);assertEquals("en", literal.getLang());
        __CLR4_5_264t64tlvico0xb.R.inc(7980);assertEquals("abc", literal.getLiteral());
        __CLR4_5_264t64tlvico0xb.R.inc(7981);assertEquals(literal.getDatatype(), PlainLiteral());
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}

    public void tesPlainLiteralWithEmbeddedEmptyLang() {try{__CLR4_5_264t64tlvico0xb.R.inc(7982);
        __CLR4_5_264t64tlvico0xb.R.inc(7983);OWLLiteral literal = Literal("abc@", PlainLiteral());
        __CLR4_5_264t64tlvico0xb.R.inc(7984);assertFalse(literal.hasLang());
        __CLR4_5_264t64tlvico0xb.R.inc(7985);assertEquals("", literal.getLang());
        __CLR4_5_264t64tlvico0xb.R.inc(7986);assertEquals("abc", literal.getLiteral());
        __CLR4_5_264t64tlvico0xb.R.inc(7987);assertEquals(literal.getDatatype(), PlainLiteral());
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}

    public void tesPlainLiteralWithDoubleSep() {try{__CLR4_5_264t64tlvico0xb.R.inc(7988);
        __CLR4_5_264t64tlvico0xb.R.inc(7989);OWLLiteral literal = Literal("abc@@en", PlainLiteral());
        __CLR4_5_264t64tlvico0xb.R.inc(7990);assertEquals("en", literal.getLang());
        __CLR4_5_264t64tlvico0xb.R.inc(7991);assertEquals("abc@", literal.getLiteral());
        __CLR4_5_264t64tlvico0xb.R.inc(7992);assertEquals(literal.getDatatype(), PlainLiteral());
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}

    @Test
    public void testBoolean() {__CLR4_5_264t64tlvico0xb.R.globalSliceStart(getClass().getName(),7993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a9awn1661();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_264t64tlvico0xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_264t64tlvico0xb.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.LiteralTestCase.testBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7993,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a9awn1661(){try{__CLR4_5_264t64tlvico0xb.R.inc(7993);
        __CLR4_5_264t64tlvico0xb.R.inc(7994);OWLLiteral literal = Literal(true);
        __CLR4_5_264t64tlvico0xb.R.inc(7995);assertTrue(literal.isBoolean());
        __CLR4_5_264t64tlvico0xb.R.inc(7996);assertTrue(literal.parseBoolean());
        __CLR4_5_264t64tlvico0xb.R.inc(7997);OWLLiteral trueLiteral = Literal("true", OWL2Datatype.XSD_BOOLEAN);
        __CLR4_5_264t64tlvico0xb.R.inc(7998);assertTrue(trueLiteral.isBoolean());
        __CLR4_5_264t64tlvico0xb.R.inc(7999);assertTrue(trueLiteral.parseBoolean());
        __CLR4_5_264t64tlvico0xb.R.inc(8000);OWLLiteral falseLiteral = Literal("false", OWL2Datatype.XSD_BOOLEAN);
        __CLR4_5_264t64tlvico0xb.R.inc(8001);assertTrue(falseLiteral.isBoolean());
        __CLR4_5_264t64tlvico0xb.R.inc(8002);assertFalse(falseLiteral.parseBoolean());
        __CLR4_5_264t64tlvico0xb.R.inc(8003);OWLLiteral oneLiteral = Literal("1", OWL2Datatype.XSD_BOOLEAN);
        __CLR4_5_264t64tlvico0xb.R.inc(8004);assertTrue(oneLiteral.isBoolean());
        __CLR4_5_264t64tlvico0xb.R.inc(8005);assertTrue(oneLiteral.parseBoolean());
        __CLR4_5_264t64tlvico0xb.R.inc(8006);OWLLiteral zeroLiteral = Literal("0", OWL2Datatype.XSD_BOOLEAN);
        __CLR4_5_264t64tlvico0xb.R.inc(8007);assertTrue(zeroLiteral.isBoolean());
        __CLR4_5_264t64tlvico0xb.R.inc(8008);assertFalse(zeroLiteral.parseBoolean());
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}

    @Test
    public void shouldStoreTagsCorrectly() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_264t64tlvico0xb.R.globalSliceStart(getClass().getName(),8009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ivewtl66h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_264t64tlvico0xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_264t64tlvico0xb.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.LiteralTestCase.shouldStoreTagsCorrectly",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ivewtl66h() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_264t64tlvico0xb.R.inc(8009);
        __CLR4_5_264t64tlvico0xb.R.inc(8010);OWLOntology o = getOWLOntology("urn:test");
        __CLR4_5_264t64tlvico0xb.R.inc(8011);String in = "See more at <a href=\"http://abc.com\">abc</a>";
        __CLR4_5_264t64tlvico0xb.R.inc(8012);OWLAnnotationAssertionAxiom ax = df.getOWLAnnotationAssertionAxiom(df.getRDFSComment(), createIndividual()
            .getIRI(), df.getOWLLiteral(in));
        __CLR4_5_264t64tlvico0xb.R.inc(8013);o.getOWLOntologyManager().addAxiom(o, ax);
        __CLR4_5_264t64tlvico0xb.R.inc(8014);OWLOntology o1 = roundTrip(o, new RDFXMLDocumentFormat());
        __CLR4_5_264t64tlvico0xb.R.inc(8015);assertTrue(o1.containsAxiom(ax));
        __CLR4_5_264t64tlvico0xb.R.inc(8016);equal(o, o1);
    }finally{__CLR4_5_264t64tlvico0xb.R.flushNeeded();}}
}
