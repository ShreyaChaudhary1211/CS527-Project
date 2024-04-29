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
package org.semanticweb.owlapi.api.test.baseclasses;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.formats.*;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
@SuppressWarnings("javadoc")
public abstract class AbstractRoundTrippingTestCase extends TestBase {static class __CLR4_5_2395395lvico0a0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,4250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private OWLOntology ont;

    @Nonnull
    protected abstract OWLOntology createOntology();

    @Nonnull
    protected OWLOntology getOnt() {try{__CLR4_5_2395395lvico0a0.R.inc(4217);
        __CLR4_5_2395395lvico0a0.R.inc(4218);if ((((ont == null)&&(__CLR4_5_2395395lvico0a0.R.iget(4219)!=0|true))||(__CLR4_5_2395395lvico0a0.R.iget(4220)==0&false))) {{
            __CLR4_5_2395395lvico0a0.R.inc(4221);ont = createOntology();
        }
        }__CLR4_5_2395395lvico0a0.R.inc(4222);return ont;
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testRDFXML() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ila7039b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testRDFXML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ila7039b() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4223);
        __CLR4_5_2395395lvico0a0.R.inc(4224);roundTripOntology(getOnt());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testRDFJSON() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wwtllb39d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testRDFJSON",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wwtllb39d() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4225);
        __CLR4_5_2395395lvico0a0.R.inc(4226);roundTripOntology(getOnt(), new RDFJsonDocumentFormat());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testOWLXML() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hu583839f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testOWLXML",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hu583839f() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4227);
        __CLR4_5_2395395lvico0a0.R.inc(4228);roundTripOntology(getOnt(), new OWLXMLDocumentFormat());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testFunctionalSyntax() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f99e0x39h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testFunctionalSyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4229,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f99e0x39h() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4229);
        __CLR4_5_2395395lvico0a0.R.inc(4230);roundTripOntology(getOnt(), new FunctionalSyntaxDocumentFormat());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testTurtle() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rxs4j939j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testTurtle",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rxs4j939j() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4231);
        __CLR4_5_2395395lvico0a0.R.inc(4232);roundTripOntology(getOnt(), new TurtleDocumentFormat());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testManchesterOWLSyntax() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vksse039l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testManchesterOWLSyntax",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4233,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vksse039l() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4233);
        __CLR4_5_2395395lvico0a0.R.inc(4234);roundTripOntology(getOnt(), new ManchesterSyntaxDocumentFormat());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Override
    protected boolean isIgnoreDeclarationAxioms(OWLDocumentFormat format) {try{__CLR4_5_2395395lvico0a0.R.inc(4235);
        __CLR4_5_2395395lvico0a0.R.inc(4236);return format instanceof ManchesterSyntaxDocumentFormat;
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testTrig() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27wvlbf39p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testTrig",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4237,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27wvlbf39p() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4237);
        __CLR4_5_2395395lvico0a0.R.inc(4238);roundTripOntology(getOnt(), new TrigDocumentFormat());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testJSONLD() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hgq8p339r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testJSONLD",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4239,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hgq8p339r() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4239);
        __CLR4_5_2395395lvico0a0.R.inc(4240);roundTripOntology(getOnt(), new RDFJsonLDDocumentFormat());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testNTriples() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6eesg39t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testNTriples",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6eesg39t() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4241);
        __CLR4_5_2395395lvico0a0.R.inc(4242);roundTripOntology(getOnt(), new NTriplesDocumentFormat());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void testNQuads() throws Exception {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nj2kl339v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.testNQuads",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nj2kl339v() throws Exception{try{__CLR4_5_2395395lvico0a0.R.inc(4243);
        __CLR4_5_2395395lvico0a0.R.inc(4244);roundTripOntology(getOnt(), new NQuadsDocumentFormat());
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}

    @Test
    public void roundTripRDFXMLAndFunctionalShouldBeSame() throws OWLOntologyCreationException,
        OWLOntologyStorageException {__CLR4_5_2395395lvico0a0.R.globalSliceStart(getClass().getName(),4245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hzhyzr39x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2395395lvico0a0.R.rethrow($CLV_t2$);}finally{__CLR4_5_2395395lvico0a0.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.baseclasses.AbstractRoundTrippingTestCase.roundTripRDFXMLAndFunctionalShouldBeSame",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),4245,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hzhyzr39x() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_2395395lvico0a0.R.inc(4245);
        __CLR4_5_2395395lvico0a0.R.inc(4246);OWLOntology o1 = roundTrip(getOnt(), new RDFXMLDocumentFormat());
        __CLR4_5_2395395lvico0a0.R.inc(4247);OWLOntology o2 = roundTrip(getOnt(), new FunctionalSyntaxDocumentFormat());
        __CLR4_5_2395395lvico0a0.R.inc(4248);equal(getOnt(), o1);
        __CLR4_5_2395395lvico0a0.R.inc(4249);equal(o1, o2);
    }finally{__CLR4_5_2395395lvico0a0.R.flushNeeded();}}
}
