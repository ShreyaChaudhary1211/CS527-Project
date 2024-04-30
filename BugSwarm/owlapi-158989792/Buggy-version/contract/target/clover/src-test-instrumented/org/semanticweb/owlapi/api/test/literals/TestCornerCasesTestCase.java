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

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;

@SuppressWarnings("javadoc")
public class TestCornerCasesTestCase extends TestBase {static class __CLR4_5_26c16c1lvico15r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,8261,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testFloatZeros() {__CLR4_5_26c16c1lvico15r.R.globalSliceStart(getClass().getName(),8209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mzct2g6c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26c16c1lvico15r.R.rethrow($CLV_t2$);}finally{__CLR4_5_26c16c1lvico15r.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.TestCornerCasesTestCase.testFloatZeros",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mzct2g6c1(){try{__CLR4_5_26c16c1lvico15r.R.inc(8209);
        // +0 and -0 are not equal
        __CLR4_5_26c16c1lvico15r.R.inc(8210);OWLDatatype type = df.getFloatOWLDatatype();
        __CLR4_5_26c16c1lvico15r.R.inc(8211);OWLLiteral lit1 = df.getOWLLiteral("0.0", type);
        __CLR4_5_26c16c1lvico15r.R.inc(8212);OWLLiteral lit2 = df.getOWLLiteral("-0.0", type);
        __CLR4_5_26c16c1lvico15r.R.inc(8213);assertFalse(lit1.equals(lit2));
    }finally{__CLR4_5_26c16c1lvico15r.R.flushNeeded();}}

    @Test
    public void testIntegerRange() {__CLR4_5_26c16c1lvico15r.R.globalSliceStart(getClass().getName(),8214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_249qxe06c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26c16c1lvico15r.R.rethrow($CLV_t2$);}finally{__CLR4_5_26c16c1lvico15r.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.TestCornerCasesTestCase.testIntegerRange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_249qxe06c6(){try{__CLR4_5_26c16c1lvico15r.R.inc(8214);
        __CLR4_5_26c16c1lvico15r.R.inc(8215);String expected = "2147483648";
        __CLR4_5_26c16c1lvico15r.R.inc(8216);OWLDatatype type = df.getIntegerOWLDatatype();
        __CLR4_5_26c16c1lvico15r.R.inc(8217);OWLLiteral lit = df.getOWLLiteral(expected, type);
        __CLR4_5_26c16c1lvico15r.R.inc(8218);assertEquals(expected, lit.getLiteral());
    }finally{__CLR4_5_26c16c1lvico15r.R.flushNeeded();}}

    @Test
    public void testEnumInt() {__CLR4_5_26c16c1lvico15r.R.globalSliceStart(getClass().getName(),8219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cwivpf6cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26c16c1lvico15r.R.rethrow($CLV_t2$);}finally{__CLR4_5_26c16c1lvico15r.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.TestCornerCasesTestCase.testEnumInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cwivpf6cb(){try{__CLR4_5_26c16c1lvico15r.R.inc(8219);
        __CLR4_5_26c16c1lvico15r.R.inc(8220);OWLDatatype type = df.getIntegerOWLDatatype();
        __CLR4_5_26c16c1lvico15r.R.inc(8221);df.getOWLLiteral("1000000000000000000000000000000000000000", type);
    }finally{__CLR4_5_26c16c1lvico15r.R.flushNeeded();}}

    @Test
    public void testGetDataPropertyValues() {__CLR4_5_26c16c1lvico15r.R.globalSliceStart(getClass().getName(),8222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aq6mrw6ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26c16c1lvico15r.R.rethrow($CLV_t2$);}finally{__CLR4_5_26c16c1lvico15r.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.TestCornerCasesTestCase.testGetDataPropertyValues",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aq6mrw6ce(){try{__CLR4_5_26c16c1lvico15r.R.inc(8222);
        __CLR4_5_26c16c1lvico15r.R.inc(8223);OWLDatatype type = df.getIntegerOWLDatatype();
        __CLR4_5_26c16c1lvico15r.R.inc(8224);OWLLiteral lit1 = df.getOWLLiteral("01", type);
        __CLR4_5_26c16c1lvico15r.R.inc(8225);OWLLiteral lit2 = df.getOWLLiteral("1", type);
        __CLR4_5_26c16c1lvico15r.R.inc(8226);assertFalse(lit1.equals(lit2));
    }finally{__CLR4_5_26c16c1lvico15r.R.flushNeeded();}}

    @Test
    public void testWebOnt() throws OWLOntologyCreationException {__CLR4_5_26c16c1lvico15r.R.globalSliceStart(getClass().getName(),8227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22fhpi6cj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26c16c1lvico15r.R.rethrow($CLV_t2$);}finally{__CLR4_5_26c16c1lvico15r.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.TestCornerCasesTestCase.testWebOnt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22fhpi6cj() throws OWLOntologyCreationException{try{__CLR4_5_26c16c1lvico15r.R.inc(8227);
        __CLR4_5_26c16c1lvico15r.R.inc(8228);String s = "<!DOCTYPE rdf:RDF [\n"
                + "   <!ENTITY xsd \"http://www.w3.org/2001/XMLSchema#\">\n"
                + "   <!ENTITY rdf \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n"
                + "]>\n"
                + "<rdf:RDF\n"
                + " xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
                + " xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n"
                + " xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n"
                + " xmlns:first=\"http://www.w3.org/2002/03owlt/oneOf/premises004#\"\n"
                + " xml:base=\"http://www.w3.org/2002/03owlt/oneOf/premises004\" >\n"
                + " <owl:Ontology/>\n"
                + " <owl:DatatypeProperty rdf:ID=\"p\">\n"
                + "  <rdfs:range>\n"
                + "   <owl:DataRange>\n"
                + "    <owl:oneOf>\n"
                + "     <rdf:List>\n"
                + "      <rdf:first rdf:datatype=\"&xsd;integer\">1</rdf:first>\n"
                + "      <rdf:rest>\n"
                + "       <rdf:List>\n"
                + "        <rdf:first rdf:datatype=\"&xsd;integer\">2</rdf:first>\n"
                + "        <rdf:rest>\n"
                + "         <rdf:List>\n"
                + "          <rdf:first rdf:datatype=\"&xsd;integer\">3</rdf:first>\n"
                + "          <rdf:rest>\n"
                + "           <rdf:List>\n"
                + "            <rdf:first rdf:datatype=\"&xsd;integer\">4</rdf:first>\n"
                + "            <rdf:rest rdf:resource=\"&rdf;nil\"/>\n"
                + "           </rdf:List>\n"
                + "          </rdf:rest>\n"
                + "         </rdf:List>\n"
                + "        </rdf:rest>\n"
                + "       </rdf:List>\n"
                + "      </rdf:rest>\n"
                + "     </rdf:List>\n"
                + "    </owl:oneOf>\n"
                + "   </owl:DataRange>\n"
                + "  </rdfs:range>\n"
                + "  <rdfs:range>\n"
                + "   <owl:DataRange>\n"
                + "    <owl:oneOf>\n"
                + "     <rdf:List>\n"
                + "      <rdf:first rdf:datatype=\"&xsd;integer\">4</rdf:first>\n"
                + "      <rdf:rest>\n"
                + "       <rdf:List>\n"
                + "        <rdf:first rdf:datatype=\"&xsd;integer\">5</rdf:first>\n"
                + "        <rdf:rest>\n"
                + "         <rdf:List>\n"
                + "          <rdf:first rdf:datatype=\"&xsd;integer\">6</rdf:first>\n"
                + "          <rdf:rest rdf:resource=\"&rdf;nil\"/>\n"
                + "         </rdf:List>\n"
                + "        </rdf:rest>\n"
                + "       </rdf:List>\n"
                + "      </rdf:rest>\n"
                + "     </rdf:List>\n"
                + "    </owl:oneOf>\n"
                + "   </owl:DataRange>\n"
                + "  </rdfs:range>\n"
                + " </owl:DatatypeProperty>\n"
                + " <owl:Thing rdf:ID=\"i\">\n"
                + "  <rdf:type>\n"
                + "   <owl:Restriction>\n"
                + "    <owl:onProperty rdf:resource=\"#p\"/>\n"
                + "    <owl:minCardinality rdf:datatype=\"&xsd;int\">1</owl:minCardinality>\n"
                + "   </owl:Restriction>\n" + "  </rdf:type>\n"
                + " </owl:Thing>\n" + "</rdf:RDF>";
        __CLR4_5_26c16c1lvico15r.R.inc(8229);Set<String> expectedResult = new TreeSet<>();
        __CLR4_5_26c16c1lvico15r.R.inc(8230);expectedResult
                .add("DataPropertyRange(<http://www.w3.org/2002/03owlt/oneOf/premises004#p> DataOneOf(\"1\"^^xsd:integer \"2\"^^xsd:integer \"3\"^^xsd:integer \"4\"^^xsd:integer ))");
        __CLR4_5_26c16c1lvico15r.R.inc(8231);expectedResult
                .add("Declaration(DataProperty(<http://www.w3.org/2002/03owlt/oneOf/premises004#p>))");
        __CLR4_5_26c16c1lvico15r.R.inc(8232);expectedResult
                .add("ClassAssertion(owl:Thing <http://www.w3.org/2002/03owlt/oneOf/premises004#i>)");
        __CLR4_5_26c16c1lvico15r.R.inc(8233);expectedResult
                .add("DataPropertyRange(<http://www.w3.org/2002/03owlt/oneOf/premises004#p> DataOneOf(\"4\"^^xsd:integer \"5\"^^xsd:integer \"6\"^^xsd:integer ))");
        __CLR4_5_26c16c1lvico15r.R.inc(8234);expectedResult
                .add("ClassAssertion(DataMinCardinality(1 <http://www.w3.org/2002/03owlt/oneOf/premises004#p> rdfs:Literal) <http://www.w3.org/2002/03owlt/oneOf/premises004#i>)");
        __CLR4_5_26c16c1lvico15r.R.inc(8235);OWLOntology o = loadOntologyFromString(s);
        __CLR4_5_26c16c1lvico15r.R.inc(8236);Set<String> result = new TreeSet<>();
        __CLR4_5_26c16c1lvico15r.R.inc(8237);for (OWLAxiom ax : o.getAxioms()) {{
            __CLR4_5_26c16c1lvico15r.R.inc(8238);result.add(ax.toString());
        }
        }__CLR4_5_26c16c1lvico15r.R.inc(8239);if ((((!result.equals(expectedResult))&&(__CLR4_5_26c16c1lvico15r.R.iget(8240)!=0|true))||(__CLR4_5_26c16c1lvico15r.R.iget(8241)==0&false))) {{
            __CLR4_5_26c16c1lvico15r.R.inc(8242);Set<String> intersection = new TreeSet<>(result);
            __CLR4_5_26c16c1lvico15r.R.inc(8243);intersection.retainAll(expectedResult);
            __CLR4_5_26c16c1lvico15r.R.inc(8244);Set<String> s1 = new TreeSet<>(result);
            __CLR4_5_26c16c1lvico15r.R.inc(8245);s1.removeAll(intersection);
            __CLR4_5_26c16c1lvico15r.R.inc(8246);Set<String> s2 = new TreeSet<>(expectedResult);
            __CLR4_5_26c16c1lvico15r.R.inc(8247);s2.removeAll(intersection);
        }
        }__CLR4_5_26c16c1lvico15r.R.inc(8248);assertEquals("Sets were supposed to be equal", result, expectedResult);
    }finally{__CLR4_5_26c16c1lvico15r.R.flushNeeded();}}

    @Test
    public void testMinusInf() throws Exception {__CLR4_5_26c16c1lvico15r.R.globalSliceStart(getClass().getName(),8249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q3yciy6d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26c16c1lvico15r.R.rethrow($CLV_t2$);}finally{__CLR4_5_26c16c1lvico15r.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.TestCornerCasesTestCase.testMinusInf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8249,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q3yciy6d5() throws Exception{try{__CLR4_5_26c16c1lvico15r.R.inc(8249);
        __CLR4_5_26c16c1lvico15r.R.inc(8250);String input = "Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\n"
                + "Prefix(owl:=<http://www.w3.org/2002/07/owl#>)\n"
                + "Prefix(:=<http://test.org/test#>)\n"
                + "Ontology(\nDeclaration(NamedIndividual(:a))\n"
                + "Declaration(DataProperty(:dp))\n"
                + "Declaration(Class(:A))\n"
                + "SubClassOf(:A DataAllValuesFrom(:dp owl:real))"
                + "\nSubClassOf(:A \n"
                + "DataSomeValuesFrom(:dp DataOneOf(\"-INF\"^^xsd:float \"-0\"^^xsd:integer))"
                + "\n)\nClassAssertion(:A :a))";
        __CLR4_5_26c16c1lvico15r.R.inc(8251);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_26c16c1lvico15r.R.inc(8252);assertTrue(saveOntology(o).toString().contains("-INF"));
        __CLR4_5_26c16c1lvico15r.R.inc(8253);OWLOntology o1 = roundTrip(o);
        __CLR4_5_26c16c1lvico15r.R.inc(8254);assertEquals("Obtologies were supposed to be the same",
                o.getLogicalAxioms(), o1.getLogicalAxioms());
    }finally{__CLR4_5_26c16c1lvico15r.R.flushNeeded();}}

    @Test
    public void testLargeInteger() throws Exception {__CLR4_5_26c16c1lvico15r.R.globalSliceStart(getClass().getName(),8255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u5bbxg6db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_26c16c1lvico15r.R.rethrow($CLV_t2$);}finally{__CLR4_5_26c16c1lvico15r.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.TestCornerCasesTestCase.testLargeInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u5bbxg6db() throws Exception{try{__CLR4_5_26c16c1lvico15r.R.inc(8255);
        __CLR4_5_26c16c1lvico15r.R.inc(8256);String input = "Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\n"
                + "Prefix(owl:=<http://www.w3.org/2002/07/owl#>)\n"
                + "Prefix(:=<http://test.org/test#>)\n"
                + "Ontology(\nDeclaration(NamedIndividual(:a))\n"
                + "Declaration(DataProperty(:dp))\n"
                + "Declaration(Class(:A))\n"
                + "SubClassOf(:A DataAllValuesFrom(:dp owl:real))"
                + "\nSubClassOf(:A \n"
                + "DataSomeValuesFrom(:dp DataOneOf(\"-INF\"^^xsd:float \"-0\"^^xsd:integer))"
                + "\n)" + '\n' + "ClassAssertion(:A :a)" + "\n)";
        __CLR4_5_26c16c1lvico15r.R.inc(8257);OWLOntology o = loadOntologyFromString(input);
        __CLR4_5_26c16c1lvico15r.R.inc(8258);assertTrue(saveOntology(o).toString().contains("-INF"));
        __CLR4_5_26c16c1lvico15r.R.inc(8259);OWLOntology o1 = roundTrip(o);
        __CLR4_5_26c16c1lvico15r.R.inc(8260);assertEquals("Obtologies were supposed to be the same",
                o.getLogicalAxioms(), o1.getLogicalAxioms());
    }finally{__CLR4_5_26c16c1lvico15r.R.flushNeeded();}}
}
