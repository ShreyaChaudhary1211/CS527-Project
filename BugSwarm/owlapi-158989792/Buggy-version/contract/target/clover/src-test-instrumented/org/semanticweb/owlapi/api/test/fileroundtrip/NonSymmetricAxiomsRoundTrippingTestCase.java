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
package org.semanticweb.owlapi.api.test.fileroundtrip;

import static org.junit.Assert.assertEquals;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.model.*;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
@RunWith(Parameterized.class)
@SuppressWarnings("javadoc")
public class NonSymmetricAxiomsRoundTrippingTestCase extends TestBase {static class __CLR4_5_25ur5urlvico0q6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,7603,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    private static final IRI iriA = IRI.create("urn:test:A");
    private static final OWLClass clsA = Class(iriA);
    private static final OWLClass clsB = Class(IRI.create("urn:test:B"));
    private static final OWLClass clsC = Class(IRI.create("urn:test:C"));
    private static final OWLDatatype dataD = Datatype(IRI.create("urn:test:D"));
    private static final OWLDatatype dataE = Datatype(IRI.create("urn:test:E"));
    private static final OWLObjectProperty propA = ObjectProperty(IRI.create("urn:test:propA"));
    private static final OWLDataProperty propB = DataProperty(IRI.create("urn:test:propB"));
    private static final OWLObjectSomeValuesFrom d = ObjectSomeValuesFrom(propA, ObjectIntersectionOf(clsB, clsC));
    private static final OWLDataSomeValuesFrom e = DataSomeValuesFrom(propB, DataIntersectionOf(dataD, dataE));
    private static final OWLClassExpression du = ObjectUnionOf(clsB, clsC);
    private static final OWLDataUnionOf eu = DataUnionOf(dataD, dataE);
    private OWLAxiom in;
    private OWLAxiom out;

    public NonSymmetricAxiomsRoundTrippingTestCase(OWLAxiom in, OWLAxiom out) {try{__CLR4_5_25ur5urlvico0q6.R.inc(7587);
        __CLR4_5_25ur5urlvico0q6.R.inc(7588);this.in = in;
        __CLR4_5_25ur5urlvico0q6.R.inc(7589);this.out = out;
    }finally{__CLR4_5_25ur5urlvico0q6.R.flushNeeded();}}

    @Parameters
    public static List<OWLAxiom[]> getData() {try{__CLR4_5_25ur5urlvico0q6.R.inc(7590);
        __CLR4_5_25ur5urlvico0q6.R.inc(7591);List<OWLAxiom[]> list = new ArrayList<>();
        __CLR4_5_25ur5urlvico0q6.R.inc(7592);list.add(new OWLAxiom[] { SubClassOf(clsA, ObjectIntersectionOf(d, d)), SubClassOf(clsA, d) });
        __CLR4_5_25ur5urlvico0q6.R.inc(7593);list.add(new OWLAxiom[] { SubClassOf(clsA, ObjectUnionOf(e, e)), SubClassOf(clsA, e) });
        __CLR4_5_25ur5urlvico0q6.R.inc(7594);list.add(new OWLAxiom[] { SubClassOf(clsA, ObjectIntersectionOf(du, du)), SubClassOf(clsA, du) });
        __CLR4_5_25ur5urlvico0q6.R.inc(7595);list.add(new OWLAxiom[] { DatatypeDefinition(dataD, DataUnionOf(eu, eu)), DatatypeDefinition(dataD, eu) });
        __CLR4_5_25ur5urlvico0q6.R.inc(7596);return list;
    }finally{__CLR4_5_25ur5urlvico0q6.R.flushNeeded();}}

    @Test
    public void shouldRoundTripAReadableVersion() throws OWLOntologyCreationException, OWLOntologyStorageException {__CLR4_5_25ur5urlvico0q6.R.globalSliceStart(getClass().getName(),7597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25qnoqa5v1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25ur5urlvico0q6.R.rethrow($CLV_t2$);}finally{__CLR4_5_25ur5urlvico0q6.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.fileroundtrip.NonSymmetricAxiomsRoundTrippingTestCase.shouldRoundTripAReadableVersion",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7597,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25qnoqa5v1() throws OWLOntologyCreationException, OWLOntologyStorageException{try{__CLR4_5_25ur5urlvico0q6.R.inc(7597);
        __CLR4_5_25ur5urlvico0q6.R.inc(7598);OWLOntology output = m.createOntology();
        __CLR4_5_25ur5urlvico0q6.R.inc(7599);m.addAxiom(output, in);
        __CLR4_5_25ur5urlvico0q6.R.inc(7600);OWLOntology o = roundTrip(output, new FunctionalSyntaxDocumentFormat());
        __CLR4_5_25ur5urlvico0q6.R.inc(7601);assertEquals(1, o.getLogicalAxioms().size());
        __CLR4_5_25ur5urlvico0q6.R.inc(7602);assertEquals(out, o.getLogicalAxioms().iterator().next());
    }finally{__CLR4_5_25ur5urlvico0q6.R.flushNeeded();}}
}
