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
package org.semanticweb.owlapi.api.test.ontology;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.change.AddAxiomData;
import org.semanticweb.owlapi.change.OWLOntologyChangeData;
import org.semanticweb.owlapi.change.OWLOntologyChangeRecord;
import org.semanticweb.owlapi.model.*;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group
 * @since 3.2.0
 */
@SuppressWarnings({ "javadoc", })
public class OWLOntologyChangeRecordTestCase extends TestBase {static class __CLR4_5_2771771lvico1ep{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,9348,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull private final OWLOntologyID mockOntologyID = new OWLOntologyID();
    @Nonnull private final OWLOntologyChangeData mockChangeData = mock(OWLOntologyChangeData.class);
    @Nonnull private final OWLAxiom mockAxiom = mock(OWLAxiom.class);

    @Test
    public void testEquals() {__CLR4_5_2771771lvico1ep.R.globalSliceStart(getClass().getName(),9325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4e608771();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2771771lvico1ep.R.rethrow($CLV_t2$);}finally{__CLR4_5_2771771lvico1ep.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyChangeRecordTestCase.testEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9325,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4e608771(){try{__CLR4_5_2771771lvico1ep.R.inc(9325);
        __CLR4_5_2771771lvico1ep.R.inc(9326);OWLOntologyChangeRecord record1 = new OWLOntologyChangeRecord(mockOntologyID, mockChangeData);
        __CLR4_5_2771771lvico1ep.R.inc(9327);OWLOntologyChangeRecord record2 = new OWLOntologyChangeRecord(mockOntologyID, mockChangeData);
        __CLR4_5_2771771lvico1ep.R.inc(9328);assertEquals(record1, record2);
    }finally{__CLR4_5_2771771lvico1ep.R.flushNeeded();}}

    @Test
    public void testGettersNotNull() {__CLR4_5_2771771lvico1ep.R.globalSliceStart(getClass().getName(),9329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t1i9yt775();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2771771lvico1ep.R.rethrow($CLV_t2$);}finally{__CLR4_5_2771771lvico1ep.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyChangeRecordTestCase.testGettersNotNull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9329,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t1i9yt775(){try{__CLR4_5_2771771lvico1ep.R.inc(9329);
        __CLR4_5_2771771lvico1ep.R.inc(9330);OWLOntologyChangeRecord record = new OWLOntologyChangeRecord(mockOntologyID, mockChangeData);
        __CLR4_5_2771771lvico1ep.R.inc(9331);assertNotNull(record.getOntologyID());
    }finally{__CLR4_5_2771771lvico1ep.R.flushNeeded();}}

    @Test
    public void testGetterEqual() {__CLR4_5_2771771lvico1ep.R.globalSliceStart(getClass().getName(),9332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u8jp0e778();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2771771lvico1ep.R.rethrow($CLV_t2$);}finally{__CLR4_5_2771771lvico1ep.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyChangeRecordTestCase.testGetterEqual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u8jp0e778(){try{__CLR4_5_2771771lvico1ep.R.inc(9332);
        __CLR4_5_2771771lvico1ep.R.inc(9333);OWLOntologyChangeRecord record = new OWLOntologyChangeRecord(mockOntologyID, mockChangeData);
        __CLR4_5_2771771lvico1ep.R.inc(9334);assertEquals(mockOntologyID, record.getOntologyID());
        __CLR4_5_2771771lvico1ep.R.inc(9335);assertEquals(mockChangeData, record.getData());
    }finally{__CLR4_5_2771771lvico1ep.R.flushNeeded();}}

    @Test(expected = UnknownOWLOntologyException.class)
    public void testCreateOntologyChange() {__CLR4_5_2771771lvico1ep.R.globalSliceStart(getClass().getName(),9336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26yhmlo77c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,79,110,116,111,108,111,103,121,67,104,97,110,103,101,58,32,91,85,110,107,110,111,119,110,79,87,76,79,110,116,111,108,111,103,121,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnknownOWLOntologyException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2771771lvico1ep.R.rethrow($CLV_t2$);}finally{__CLR4_5_2771771lvico1ep.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyChangeRecordTestCase.testCreateOntologyChange",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26yhmlo77c(){try{__CLR4_5_2771771lvico1ep.R.inc(9336);
        __CLR4_5_2771771lvico1ep.R.inc(9337);OWLOntologyChangeRecord changeRecord = new OWLOntologyChangeRecord(mockOntologyID, mockChangeData);
        __CLR4_5_2771771lvico1ep.R.inc(9338);changeRecord.createOntologyChange(m);
    }finally{__CLR4_5_2771771lvico1ep.R.flushNeeded();}}

    @Test
    public void testCreateOntologyChangeEquals() throws OWLOntologyCreationException {__CLR4_5_2771771lvico1ep.R.globalSliceStart(getClass().getName(),9339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21ax4kt77f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2771771lvico1ep.R.rethrow($CLV_t2$);}finally{__CLR4_5_2771771lvico1ep.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.ontology.OWLOntologyChangeRecordTestCase.testCreateOntologyChangeEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),9339,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21ax4kt77f() throws OWLOntologyCreationException{try{__CLR4_5_2771771lvico1ep.R.inc(9339);
        __CLR4_5_2771771lvico1ep.R.inc(9340);OWLOntology ontology = m.createOntology();
        __CLR4_5_2771771lvico1ep.R.inc(9341);OWLOntologyID ontologyID = ontology.getOntologyID();
        __CLR4_5_2771771lvico1ep.R.inc(9342);AddAxiomData addAxiomData = new AddAxiomData(mockAxiom);
        __CLR4_5_2771771lvico1ep.R.inc(9343);OWLOntologyChangeRecord changeRecord = new OWLOntologyChangeRecord(ontologyID, addAxiomData);
        __CLR4_5_2771771lvico1ep.R.inc(9344);OWLOntologyChange change = changeRecord.createOntologyChange(m);
        __CLR4_5_2771771lvico1ep.R.inc(9345);assertNotNull(change);
        __CLR4_5_2771771lvico1ep.R.inc(9346);assertEquals(change.getOntology().getOntologyID(), ontologyID);
        __CLR4_5_2771771lvico1ep.R.inc(9347);assertEquals(mockAxiom, change.getAxiom());
    }finally{__CLR4_5_2771771lvico1ep.R.flushNeeded();}}
}
