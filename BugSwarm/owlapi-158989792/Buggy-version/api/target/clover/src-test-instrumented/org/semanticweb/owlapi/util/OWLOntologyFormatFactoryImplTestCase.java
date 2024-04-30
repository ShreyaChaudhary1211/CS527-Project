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
package org.semanticweb.owlapi.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.semanticweb.owlapi.formats.DLSyntaxDocumentFormatFactory;
import org.semanticweb.owlapi.formats.DLSyntaxHTMLDocumentFormatFactory;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormatFactory;
import org.semanticweb.owlapi.formats.KRSS2DocumentFormatFactory;
import org.semanticweb.owlapi.formats.KRSSDocumentFormatFactory;
import org.semanticweb.owlapi.formats.LabelFunctionalDocumentFormatFactory;
import org.semanticweb.owlapi.formats.LatexAxiomsListDocumentFormatFactory;
import org.semanticweb.owlapi.formats.LatexDocumentFormatFactory;
import org.semanticweb.owlapi.formats.OWLXMLDocumentFormatFactory;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormatFactory;
import org.semanticweb.owlapi.formats.TurtleDocumentFormatFactory;
import org.semanticweb.owlapi.model.OWLDocumentFormatFactory;

/**
 * Test the generic factory and all the formats it can build
 * 
 * @author ignazio
 */
@SuppressWarnings("javadoc")
public class OWLOntologyFormatFactoryImplTestCase {static class __CLR4_5_2cjrcjrlvicku5l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237216579L,8589935092L,16318,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDLSyntaxHTMLFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bw69xicjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testDLSyntaxHTMLFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bw69xicjr(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16263);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16264);OWLDocumentFormatFactory f = new DLSyntaxHTMLDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16265);assertEquals("DL Syntax - HTML Format", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16266);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16267);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testDLSyntaxOntologyFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2urpth2cjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testDLSyntaxOntologyFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2urpth2cjw(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16268);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16269);OWLDocumentFormatFactory f = new DLSyntaxDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16270);assertEquals("DL Syntax Format", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16271);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16272);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testKRSS2OntologyFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ru9s2ick1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testKRSS2OntologyFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ru9s2ick1(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16273);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16274);OWLDocumentFormatFactory f = new KRSS2DocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16275);assertEquals("KRSS2 Syntax", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16276);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16277);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testKRSSOntologyFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2db7beick6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testKRSSOntologyFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16278,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2db7beick6(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16278);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16279);OWLDocumentFormatFactory f = new KRSSDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16280);assertEquals("KRSS Syntax", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16281);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16282);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testLabelFunctionalFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p3jarnckb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testLabelFunctionalFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p3jarnckb(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16283);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16284);OWLDocumentFormatFactory f = new LabelFunctionalDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16285);assertEquals("Label functional Syntax", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16286);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16287);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testLatexAxiomsListOntologyFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_285lg1ackg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testLatexAxiomsListOntologyFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_285lg1ackg(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16288);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16289);OWLDocumentFormatFactory f = new LatexAxiomsListDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16290);assertEquals("Latex Axiom List", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16291);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16292);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testLatexOntologyFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29d1yc3ckl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testLatexOntologyFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29d1yc3ckl(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16293);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16294);OWLDocumentFormatFactory f = new LatexDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16295);assertEquals("LaTeX Syntax", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16296);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16297);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testOWLFunctionalSyntaxOntologyFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hldtxckq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testOWLFunctionalSyntaxOntologyFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hldtxckq(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16298);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16299);OWLDocumentFormatFactory f = new FunctionalSyntaxDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16300);assertEquals("OWL Functional Syntax", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16301);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16302);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testOWLXMLOntologyFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_266p1tackv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testOWLXMLOntologyFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_266p1tackv(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16303);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16304);OWLDocumentFormatFactory f = new OWLXMLDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16305);assertEquals("OWL/XML Syntax", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16306);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16307);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testRDFXMLOntologyFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p75aoucl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testRDFXMLOntologyFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p75aoucl0(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16308);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16309);OWLDocumentFormatFactory f = new RDFXMLDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16310);assertEquals("RDF/XML Syntax", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16311);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16312);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}

    @Test
    public void testTurtleOntologyFormat() {__CLR4_5_2cjrcjrlvicku5l.R.globalSliceStart(getClass().getName(),16313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ve9sedcl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2cjrcjrlvicku5l.R.rethrow($CLV_t2$);}finally{__CLR4_5_2cjrcjrlvicku5l.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLOntologyFormatFactoryImplTestCase.testTurtleOntologyFormat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),16313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ve9sedcl5(){try{__CLR4_5_2cjrcjrlvicku5l.R.inc(16313);
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16314);OWLDocumentFormatFactory f = new TurtleDocumentFormatFactory();
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16315);assertEquals("Turtle Syntax", f.getKey());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16316);assertEquals(0, f.getMIMETypes().size());
        __CLR4_5_2cjrcjrlvicku5l.R.inc(16317);assertNull(f.getDefaultMIMEType());
    }finally{__CLR4_5_2cjrcjrlvicku5l.R.flushNeeded();}}
}
