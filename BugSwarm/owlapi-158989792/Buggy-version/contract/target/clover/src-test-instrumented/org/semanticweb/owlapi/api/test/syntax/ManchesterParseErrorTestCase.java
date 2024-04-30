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
package org.semanticweb.owlapi.api.test.syntax;

import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.IRI;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.manchestersyntax.renderer.ParserException;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.util.mansyntax.ManchesterOWLSyntaxParser;

@SuppressWarnings("javadoc")
public class ManchesterParseErrorTestCase extends TestBase {static class __CLR4_5_28o48o4lvico1o5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11272,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected = ParserException.class)
    public void shouldNotParse() {__CLR4_5_28o48o4lvico1o5.R.globalSliceStart(getClass().getName(),11236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t99fom8o4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,104,111,117,108,100,78,111,116,80,97,114,115,101,58,32,91,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28o48o4lvico1o5.R.rethrow($CLV_t2$);}finally{__CLR4_5_28o48o4lvico1o5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterParseErrorTestCase.shouldNotParse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t99fom8o4(){try{__CLR4_5_28o48o4lvico1o5.R.inc(11236);
        __CLR4_5_28o48o4lvico1o5.R.inc(11237);parse("p some rdfs:Literal");
        __CLR4_5_28o48o4lvico1o5.R.inc(11238);String text1 = "p some Litera";
        __CLR4_5_28o48o4lvico1o5.R.inc(11239);parse(text1);
    }finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}

    @Test(expected = ParserException.class)
    public void shouldNotParseToo() {__CLR4_5_28o48o4lvico1o5.R.globalSliceStart(getClass().getName(),11240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jhddyw8o8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,104,111,117,108,100,78,111,116,80,97,114,115,101,84,111,111,58,32,91,80,97,114,115,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParserException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_28o48o4lvico1o5.R.rethrow($CLV_t2$);}finally{__CLR4_5_28o48o4lvico1o5.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.ManchesterParseErrorTestCase.shouldNotParseToo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11240,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jhddyw8o8(){try{__CLR4_5_28o48o4lvico1o5.R.inc(11240);
        __CLR4_5_28o48o4lvico1o5.R.inc(11241);parse("p some rdfs:Literal");
        __CLR4_5_28o48o4lvico1o5.R.inc(11242);String text1 = "p some Literal";
        __CLR4_5_28o48o4lvico1o5.R.inc(11243);parse(text1);
    }finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}

    private OWLClassExpression parse(@Nonnull String text) {try{__CLR4_5_28o48o4lvico1o5.R.inc(11244);
        __CLR4_5_28o48o4lvico1o5.R.inc(11245);MockEntityChecker checker = new MockEntityChecker(df);
        __CLR4_5_28o48o4lvico1o5.R.inc(11246);ManchesterOWLSyntaxParser parser = OWLManager.createManchesterParser();
        __CLR4_5_28o48o4lvico1o5.R.inc(11247);parser.setStringToParse(text);
        __CLR4_5_28o48o4lvico1o5.R.inc(11248);parser.setOWLEntityChecker(checker);
        __CLR4_5_28o48o4lvico1o5.R.inc(11249);return parser.parseClassExpression();
    }finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}

    /**
     * A very simple entity checker that only understands that "p" is a property
     * and rdfs:Literal is a datatype. He is an extreme simplification of the
     * entity checker that runs when Protege is set to render entities as
     * qnames.
     * 
     * @author tredmond
     */
    private static class MockEntityChecker implements OWLEntityChecker {

        private final OWLDataFactory factory;

        MockEntityChecker(OWLDataFactory factory) {try{__CLR4_5_28o48o4lvico1o5.R.inc(11250);
            __CLR4_5_28o48o4lvico1o5.R.inc(11251);this.factory = factory;
        }finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}

        @Nullable
        @Override
        public OWLClass getOWLClass(String name) {try{__CLR4_5_28o48o4lvico1o5.R.inc(11252);
            __CLR4_5_28o48o4lvico1o5.R.inc(11253);return null;
        }finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}

        @Nullable
        @Override
        public OWLObjectProperty getOWLObjectProperty(String name) {try{__CLR4_5_28o48o4lvico1o5.R.inc(11254);
            __CLR4_5_28o48o4lvico1o5.R.inc(11255);return null;
        }finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}

        @Nullable
        @Override
        public OWLDataProperty getOWLDataProperty(@Nullable String name) {try{__CLR4_5_28o48o4lvico1o5.R.inc(11256);
            __CLR4_5_28o48o4lvico1o5.R.inc(11257);if (((("p".equals(name))&&(__CLR4_5_28o48o4lvico1o5.R.iget(11258)!=0|true))||(__CLR4_5_28o48o4lvico1o5.R.iget(11259)==0&false))) {{
                __CLR4_5_28o48o4lvico1o5.R.inc(11260);return factory
                        .getOWLDataProperty(IRI("http://protege.org/Test.owl#p"));
            } }else {{
                __CLR4_5_28o48o4lvico1o5.R.inc(11261);return null;
            }
        }}finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}

        @Nullable
        @Override
        public OWLAnnotationProperty getOWLAnnotationProperty(String name) {try{__CLR4_5_28o48o4lvico1o5.R.inc(11262);
            __CLR4_5_28o48o4lvico1o5.R.inc(11263);return null;
        }finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}

        @Nullable
        @Override
        public OWLNamedIndividual getOWLIndividual(String name) {try{__CLR4_5_28o48o4lvico1o5.R.inc(11264);
            __CLR4_5_28o48o4lvico1o5.R.inc(11265);return null;
        }finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}

        @Nullable
        @Override
        public OWLDatatype getOWLDatatype(@Nullable String name) {try{__CLR4_5_28o48o4lvico1o5.R.inc(11266);
            __CLR4_5_28o48o4lvico1o5.R.inc(11267);if (((("rdfs:Literal".equals(name))&&(__CLR4_5_28o48o4lvico1o5.R.iget(11268)!=0|true))||(__CLR4_5_28o48o4lvico1o5.R.iget(11269)==0&false))) {{
                __CLR4_5_28o48o4lvico1o5.R.inc(11270);return factory.getTopDatatype();
            } }else {{
                __CLR4_5_28o48o4lvico1o5.R.inc(11271);return null;
            }
        }}finally{__CLR4_5_28o48o4lvico1o5.R.flushNeeded();}}
    }
}
