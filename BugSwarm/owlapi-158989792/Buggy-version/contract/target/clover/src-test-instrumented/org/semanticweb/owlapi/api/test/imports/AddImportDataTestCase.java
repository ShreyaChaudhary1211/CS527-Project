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
package org.semanticweb.owlapi.api.test.imports;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.change.AddImportData;
import org.semanticweb.owlapi.model.AddImport;
import org.semanticweb.owlapi.model.OWLImportsDeclaration;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group
 * @since 3.2.0
 */
@SuppressWarnings({ "javadoc", })
public class AddImportDataTestCase {static class __CLR4_5_25v75v7lvico0qj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,7626,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLImportsDeclaration mockDeclaration = mock(OWLImportsDeclaration.class);
    @Nonnull
    private final OWLOntology mockOntology = mock(OWLOntology.class);

    @Nonnull
    private AddImportData createData() {try{__CLR4_5_25v75v7lvico0qj.R.inc(7603);
        __CLR4_5_25v75v7lvico0qj.R.inc(7604);return new AddImportData(mockDeclaration);
    }finally{__CLR4_5_25v75v7lvico0qj.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_5_25v75v7lvico0qj.R.globalSliceStart(getClass().getName(),7605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e6085v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25v75v7lvico0qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_25v75v7lvico0qj.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.imports.AddImportDataTestCase.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7605,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e6085v9(){try{__CLR4_5_25v75v7lvico0qj.R.inc(7605);
        __CLR4_5_25v75v7lvico0qj.R.inc(7606);AddImportData data1 = createData();
        __CLR4_5_25v75v7lvico0qj.R.inc(7607);AddImportData data2 = createData();
        __CLR4_5_25v75v7lvico0qj.R.inc(7608);assertEquals(data1, data2);
        __CLR4_5_25v75v7lvico0qj.R.inc(7609);assertEquals(data1.hashCode(), data2.hashCode());
    }finally{__CLR4_5_25v75v7lvico0qj.R.flushNeeded();}}

    @Test
    public void testGettersReturnNotNull() {__CLR4_5_25v75v7lvico0qj.R.globalSliceStart(getClass().getName(),7610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w78im35ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25v75v7lvico0qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_25v75v7lvico0qj.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.imports.AddImportDataTestCase.testGettersReturnNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7610,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w78im35ve(){try{__CLR4_5_25v75v7lvico0qj.R.inc(7610);
        __CLR4_5_25v75v7lvico0qj.R.inc(7611);AddImportData data = createData();
        __CLR4_5_25v75v7lvico0qj.R.inc(7612);assertNotNull(data.getDeclaration());
        __CLR4_5_25v75v7lvico0qj.R.inc(7613);assertNotNull(data.createOntologyChange(mockOntology));
    }finally{__CLR4_5_25v75v7lvico0qj.R.flushNeeded();}}

    @Test
    public void testGettersEquals() {__CLR4_5_25v75v7lvico0qj.R.globalSliceStart(getClass().getName(),7614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hx7uas5vi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25v75v7lvico0qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_25v75v7lvico0qj.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.imports.AddImportDataTestCase.testGettersEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hx7uas5vi(){try{__CLR4_5_25v75v7lvico0qj.R.inc(7614);
        __CLR4_5_25v75v7lvico0qj.R.inc(7615);AddImportData data = createData();
        __CLR4_5_25v75v7lvico0qj.R.inc(7616);assertEquals(mockDeclaration, data.getDeclaration());
    }finally{__CLR4_5_25v75v7lvico0qj.R.flushNeeded();}}

    @Test
    public void testCreateOntologyChange() {__CLR4_5_25v75v7lvico0qj.R.globalSliceStart(getClass().getName(),7617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26yhmlo5vl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25v75v7lvico0qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_25v75v7lvico0qj.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.imports.AddImportDataTestCase.testCreateOntologyChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26yhmlo5vl(){try{__CLR4_5_25v75v7lvico0qj.R.inc(7617);
        __CLR4_5_25v75v7lvico0qj.R.inc(7618);AddImportData data = createData();
        __CLR4_5_25v75v7lvico0qj.R.inc(7619);AddImport change = data.createOntologyChange(mockOntology);
        __CLR4_5_25v75v7lvico0qj.R.inc(7620);assertEquals(mockOntology, change.getOntology());
        __CLR4_5_25v75v7lvico0qj.R.inc(7621);assertEquals(mockDeclaration, change.getImportDeclaration());
    }finally{__CLR4_5_25v75v7lvico0qj.R.flushNeeded();}}

    @Test
    public void testOntologyChangeSymmetry() {__CLR4_5_25v75v7lvico0qj.R.globalSliceStart(getClass().getName(),7622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2atlh7w5vq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_25v75v7lvico0qj.R.rethrow($CLV_t2$);}finally{__CLR4_5_25v75v7lvico0qj.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.imports.AddImportDataTestCase.testOntologyChangeSymmetry",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),7622,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2atlh7w5vq(){try{__CLR4_5_25v75v7lvico0qj.R.inc(7622);
        __CLR4_5_25v75v7lvico0qj.R.inc(7623);AddImportData data = createData();
        __CLR4_5_25v75v7lvico0qj.R.inc(7624);AddImport change = new AddImport(mockOntology, mockDeclaration);
        __CLR4_5_25v75v7lvico0qj.R.inc(7625);assertEquals(change.getChangeData(), data);
    }finally{__CLR4_5_25v75v7lvico0qj.R.flushNeeded();}}
}
