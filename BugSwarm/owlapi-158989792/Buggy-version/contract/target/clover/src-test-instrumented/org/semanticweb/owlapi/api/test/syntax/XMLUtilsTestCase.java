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

import static org.junit.Assert.*;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.RDFXMLDocumentFormat;
import org.semanticweb.owlapi.io.OWLOntologyDocumentSourceBase;
import org.semanticweb.owlapi.io.XMLUtils;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.3.0
 */
@SuppressWarnings({ "javadoc" })
public class XMLUtilsTestCase extends TestBase {static class __CLR4_5_293x93xlvico1s8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,11836,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int CODE_POINT = 0xEFFFF;
    @Nonnull
    private static final String CODE_POINT_STRING = init();

    @Nonnull
    static String init() {try{__CLR4_5_293x93xlvico1s8.R.inc(11805);
        __CLR4_5_293x93xlvico1s8.R.inc(11806);StringBuilder sb = new StringBuilder();
        __CLR4_5_293x93xlvico1s8.R.inc(11807);sb.appendCodePoint(CODE_POINT);
        __CLR4_5_293x93xlvico1s8.R.inc(11808);return sb.toString();
    }finally{__CLR4_5_293x93xlvico1s8.R.flushNeeded();}}

    @Test
    public void testIsNCName() {__CLR4_5_293x93xlvico1s8.R.globalSliceStart(getClass().getName(),11809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vzcver941();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_293x93xlvico1s8.R.rethrow($CLV_t2$);}finally{__CLR4_5_293x93xlvico1s8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.XMLUtilsTestCase.testIsNCName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vzcver941(){try{__CLR4_5_293x93xlvico1s8.R.inc(11809);
        __CLR4_5_293x93xlvico1s8.R.inc(11810);assertTrue(XMLUtils.isNCName(CODE_POINT_STRING + "abc" + CODE_POINT_STRING));
        __CLR4_5_293x93xlvico1s8.R.inc(11811);assertTrue(XMLUtils.isNCName(CODE_POINT_STRING + "abc123" + CODE_POINT_STRING));
        __CLR4_5_293x93xlvico1s8.R.inc(11812);assertFalse(XMLUtils.isNCName("123" + CODE_POINT_STRING));
        __CLR4_5_293x93xlvico1s8.R.inc(11813);assertFalse(XMLUtils.isNCName(CODE_POINT_STRING + ":a"));
        __CLR4_5_293x93xlvico1s8.R.inc(11814);assertFalse(XMLUtils.isNCName(""));
        __CLR4_5_293x93xlvico1s8.R.inc(11815);assertFalse(XMLUtils.isNCName(null));
    }finally{__CLR4_5_293x93xlvico1s8.R.flushNeeded();}}

    @Test
    public void testIsQName() {__CLR4_5_293x93xlvico1s8.R.globalSliceStart(getClass().getName(),11816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jttdll948();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_293x93xlvico1s8.R.rethrow($CLV_t2$);}finally{__CLR4_5_293x93xlvico1s8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.XMLUtilsTestCase.testIsQName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jttdll948(){try{__CLR4_5_293x93xlvico1s8.R.inc(11816);
        __CLR4_5_293x93xlvico1s8.R.inc(11817);assertTrue(XMLUtils.isQName(CODE_POINT_STRING + "p1:abc" + CODE_POINT_STRING));
        __CLR4_5_293x93xlvico1s8.R.inc(11818);assertFalse(XMLUtils.isQName(CODE_POINT_STRING + "p1:2abc" + CODE_POINT_STRING));
        __CLR4_5_293x93xlvico1s8.R.inc(11819);assertFalse(XMLUtils.isQName("11" + CODE_POINT_STRING + ":abc" + CODE_POINT_STRING));
        __CLR4_5_293x93xlvico1s8.R.inc(11820);assertFalse(XMLUtils.isQName("ab:c%20d"));
    }finally{__CLR4_5_293x93xlvico1s8.R.flushNeeded();}}

    @Test
    public void testEndsWithNCName() {__CLR4_5_293x93xlvico1s8.R.globalSliceStart(getClass().getName(),11821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tpq4p594d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_293x93xlvico1s8.R.rethrow($CLV_t2$);}finally{__CLR4_5_293x93xlvico1s8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.XMLUtilsTestCase.testEndsWithNCName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11821,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tpq4p594d(){try{__CLR4_5_293x93xlvico1s8.R.inc(11821);
        __CLR4_5_293x93xlvico1s8.R.inc(11822);assertEquals("abc" + CODE_POINT_STRING, XMLUtils.getNCNameSuffix("1abc" + CODE_POINT_STRING));
        __CLR4_5_293x93xlvico1s8.R.inc(11823);assertTrue(XMLUtils.hasNCNameSuffix("1abc" + CODE_POINT_STRING));
        __CLR4_5_293x93xlvico1s8.R.inc(11824);assertNull(XMLUtils.getNCNameSuffix(CODE_POINT_STRING + "p1:123"));
        __CLR4_5_293x93xlvico1s8.R.inc(11825);assertFalse(XMLUtils.hasNCNameSuffix(CODE_POINT_STRING + "p1:123"));
        __CLR4_5_293x93xlvico1s8.R.inc(11826);assertEquals("ABC", XMLUtils.getNCNameSuffix("http://owlapi.sourceforge.net/ontology/ABC"));
        __CLR4_5_293x93xlvico1s8.R.inc(11827);assertEquals("ABC", XMLUtils.getNCNameSuffix("http://owlapi.sourceforge.net/ontology#ABC"));
        __CLR4_5_293x93xlvico1s8.R.inc(11828);assertEquals("ABC", XMLUtils.getNCNameSuffix("http://owlapi.sourceforge.net/ontology:ABC"));
    }finally{__CLR4_5_293x93xlvico1s8.R.flushNeeded();}}

    @Test
    public void testParsesBNode() {__CLR4_5_293x93xlvico1s8.R.globalSliceStart(getClass().getName(),11829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q1y5w994l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_293x93xlvico1s8.R.rethrow($CLV_t2$);}finally{__CLR4_5_293x93xlvico1s8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.XMLUtilsTestCase.testParsesBNode",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q1y5w994l(){try{__CLR4_5_293x93xlvico1s8.R.inc(11829);
        __CLR4_5_293x93xlvico1s8.R.inc(11830);assertEquals("_:test", XMLUtils.getNCNamePrefix("_:test"));
        __CLR4_5_293x93xlvico1s8.R.inc(11831);assertNull(XMLUtils.getNCNameSuffix("_:test"));
    }finally{__CLR4_5_293x93xlvico1s8.R.flushNeeded();}}

    @Test
    public void testmissingTypes() {__CLR4_5_293x93xlvico1s8.R.globalSliceStart(getClass().getName(),11832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ns6gwk94o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_293x93xlvico1s8.R.rethrow($CLV_t2$);}finally{__CLR4_5_293x93xlvico1s8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.syntax.XMLUtilsTestCase.testmissingTypes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),11832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ns6gwk94o(){try{__CLR4_5_293x93xlvico1s8.R.inc(11832);
        // given
        __CLR4_5_293x93xlvico1s8.R.inc(11833);String input = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" + "<rdf:RDF\n"
            + "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n"
            + "xmlns:skos=\"http://www.w3.org/2004/02/skos/core#\"\n"
            + "xmlns:dc=\"http://purl.org/dc/elements/1.1#\"\n" + ">\n"
            + "<skos:ConceptScheme rdf:about=\"http://www.thesaurus.gc.ca/#CoreSubjectThesaurus\">\n"
            + "<dc:title xml:lang=\"en\">Government of Canada Core Subject Thesaurus</dc:title>\n"
            + "<dc:creator xml:lang=\"en\">Government of Canada</dc:creator>\n" + "</skos:ConceptScheme>\n" + "\n"
            + "<skos:Concept rdf:about=\"http://www.thesaurus.gc.ca/concept/#Abbreviations\">\n"
            + "<skos:prefLabel>Abbreviations</skos:prefLabel>\n"
            + "<skos:related rdf:resource=\"http://www.thesaurus.gc.ca/#Terminology\"/>\n"
            + "<skos:inScheme rdf:resource=\"http://www.thesaurus.gc.ca/#CoreSubjectThesaurus\"/>\n"
            + "<skos:prefLabel xml:lang=\"fr\">Abr&#233;viation</skos:prefLabel>\n" + "</skos:Concept>\n"
            + "<skos:Concept rdf:about=\"http://www.thesaurus.gc.ca/concept/#Aboriginal%20affairs\">\n"
            + "<skos:prefLabel>Aboriginal affairs</skos:prefLabel>\n"
            + "<skos:altLabel>Aboriginal issues</skos:altLabel>\n"
            + "<skos:related rdf:resource=\"http://www.thesaurus.gc.ca/#Aboriginal%20rights\"/>\n"
            + "<skos:related rdf:resource=\"http://www.thesaurus.gc.ca/#Land claims\"/>\n"
            + "<skos:inScheme rdf:resource=\"http://www.thesaurus.gc.ca/#CoreSubjectThesaurus\"/>\n"
            + "<skos:prefLabel xml:lang=\"fr\">Affaires autochtones</skos:prefLabel>\n" + "</skos:Concept>\n" + "\n"
            + "</rdf:RDF>";
        // when
        __CLR4_5_293x93xlvico1s8.R.inc(11834);OWLOntology o = loadOntologyFromString(input, OWLOntologyDocumentSourceBase.getNextDocumentIRI(
            "testuriwithblankspace"), new RDFXMLDocumentFormat());
        // then
        __CLR4_5_293x93xlvico1s8.R.inc(11835);assertEquals(15, o.getAxiomCount());
    }finally{__CLR4_5_293x93xlvico1s8.R.flushNeeded();}}
}
