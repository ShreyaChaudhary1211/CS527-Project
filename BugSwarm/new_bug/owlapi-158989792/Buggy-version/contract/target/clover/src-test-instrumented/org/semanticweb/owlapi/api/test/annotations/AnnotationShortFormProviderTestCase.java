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
package org.semanticweb.owlapi.api.test.annotations;

import static org.junit.Assert.assertEquals;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.util.AnnotationValueShortFormProvider;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.SimpleIRIShortFormProvider;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;
import org.semanticweb.owlapi.util.StringAnnotationVisitor;

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health
 *         Informatics Group
 * @since 3.1.0
 */
@SuppressWarnings("javadoc")
public class AnnotationShortFormProviderTestCase extends TestBase {static class __CLR4_5_22ko2kolvicnzwc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    PrefixManager pm = new DefaultPrefixManager(null, null,
            "http://org.semanticweb.owlapi/ont#");
    @Nonnull
    OWLAnnotationProperty prop = AnnotationProperty("prop", pm);
    @Nonnull
    List<OWLAnnotationProperty> props = CollectionFactory.list(prop);
    @Nonnull
    Map<OWLAnnotationProperty, List<String>> langMap = new HashMap<>();

    @Test
    public void testLiteralWithoutLanguageValue() {__CLR4_5_22ko2kolvicnzwc.R.globalSliceStart(getClass().getName(),3336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jey58r2ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ko2kolvicnzwc.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ko2kolvicnzwc.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationShortFormProviderTestCase.testLiteralWithoutLanguageValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jey58r2ko(){try{__CLR4_5_22ko2kolvicnzwc.R.inc(3336);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3337);OWLNamedIndividual root = NamedIndividual("ind", pm);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3338);String shortForm = "MyLabel";
        __CLR4_5_22ko2kolvicnzwc.R.inc(3339);Ontology(m,
                AnnotationAssertion(prop, root.getIRI(), Literal(shortForm)));
        __CLR4_5_22ko2kolvicnzwc.R.inc(3340);AnnotationValueShortFormProvider sfp = new AnnotationValueShortFormProvider(
                props, langMap, m);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3341);assertEquals(sfp.getShortForm(root), shortForm);
    }finally{__CLR4_5_22ko2kolvicnzwc.R.flushNeeded();}}

    @Test
    public void testLiteralWithLanguageValue() {__CLR4_5_22ko2kolvicnzwc.R.globalSliceStart(getClass().getName(),3342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22tr9ct2ku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ko2kolvicnzwc.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ko2kolvicnzwc.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationShortFormProviderTestCase.testLiteralWithLanguageValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3342,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22tr9ct2ku(){try{__CLR4_5_22ko2kolvicnzwc.R.inc(3342);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3343);OWLNamedIndividual root = NamedIndividual("ind", pm);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3344);String label1 = "MyLabel";
        __CLR4_5_22ko2kolvicnzwc.R.inc(3345);String label2 = "OtherLabel";
        __CLR4_5_22ko2kolvicnzwc.R.inc(3346);Ontology(
                m,
                AnnotationAssertion(prop, root.getIRI(), Literal(label1, "ab")),
                AnnotationAssertion(prop, root.getIRI(), Literal(label2, "xy")));
        __CLR4_5_22ko2kolvicnzwc.R.inc(3347);langMap.put(prop, Arrays.asList("ab", "xy"));
        __CLR4_5_22ko2kolvicnzwc.R.inc(3348);AnnotationValueShortFormProvider sfp = new AnnotationValueShortFormProvider(
                props, langMap, m);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3349);assertEquals(sfp.getShortForm(root), label1);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3350);Map<OWLAnnotationProperty, List<String>> langMap2 = new HashMap<>();
        __CLR4_5_22ko2kolvicnzwc.R.inc(3351);langMap2.put(prop, Arrays.asList("xy", "ab"));
        __CLR4_5_22ko2kolvicnzwc.R.inc(3352);AnnotationValueShortFormProvider sfp2 = new AnnotationValueShortFormProvider(
                props, langMap2, m);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3353);assertEquals(sfp2.getShortForm(root), label2);
    }finally{__CLR4_5_22ko2kolvicnzwc.R.flushNeeded();}}

    @Test
    public void testIRIValue() {__CLR4_5_22ko2kolvicnzwc.R.globalSliceStart(getClass().getName(),3354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2btmoae2l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ko2kolvicnzwc.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ko2kolvicnzwc.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationShortFormProviderTestCase.testIRIValue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3354,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2btmoae2l6(){try{__CLR4_5_22ko2kolvicnzwc.R.inc(3354);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3355);OWLNamedIndividual root = NamedIndividual("ind", pm);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3356);Ontology(
                m,
                AnnotationAssertion(prop, root.getIRI(),
                        IRI("http://org.semanticweb.owlapi/ont#myIRI")));
        __CLR4_5_22ko2kolvicnzwc.R.inc(3357);AnnotationValueShortFormProvider sfp = new AnnotationValueShortFormProvider(
                props, langMap, m);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3358);assertEquals("myIRI", sfp.getShortForm(root));
    }finally{__CLR4_5_22ko2kolvicnzwc.R.flushNeeded();}}

    @Test
    public void shouldWrapWithDoubleQuotes() {__CLR4_5_22ko2kolvicnzwc.R.globalSliceStart(getClass().getName(),3359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dat9e62lb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22ko2kolvicnzwc.R.rethrow($CLV_t2$);}finally{__CLR4_5_22ko2kolvicnzwc.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.annotations.AnnotationShortFormProviderTestCase.shouldWrapWithDoubleQuotes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3359,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dat9e62lb(){try{__CLR4_5_22ko2kolvicnzwc.R.inc(3359);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3360);OWLNamedIndividual root = NamedIndividual("ind", pm);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3361);String shortForm = "MyLabel";
        __CLR4_5_22ko2kolvicnzwc.R.inc(3362);Ontology(m,
                AnnotationAssertion(prop, root.getIRI(), Literal(shortForm)));
        __CLR4_5_22ko2kolvicnzwc.R.inc(3363);AnnotationValueShortFormProvider sfp = new AnnotationValueShortFormProvider(
                m, new SimpleShortFormProvider(),
                new SimpleIRIShortFormProvider(), props, langMap);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3364);sfp.setLiteralRenderer(new StringAnnotationVisitor() {

            private static final long serialVersionUID = 1L;

            @Nonnull
            @Override
            public String visit(@Nonnull OWLLiteral literal) {try{__CLR4_5_22ko2kolvicnzwc.R.inc(3365);
                __CLR4_5_22ko2kolvicnzwc.R.inc(3366);return '"' + literal.getLiteral() + '"';
            }finally{__CLR4_5_22ko2kolvicnzwc.R.flushNeeded();}}
        });
        __CLR4_5_22ko2kolvicnzwc.R.inc(3367);String shortForm2 = sfp.getShortForm(root);
        __CLR4_5_22ko2kolvicnzwc.R.inc(3368);assertEquals(shortForm2, '"' + shortForm + '"');
    }finally{__CLR4_5_22ko2kolvicnzwc.R.flushNeeded();}}
}
