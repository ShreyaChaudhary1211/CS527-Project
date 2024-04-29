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

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.DataRangeType;
import org.semanticweb.owlapi.model.EntityType;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.vocab.OWL2Datatype;

import uk.ac.manchester.cs.owl.owlapi.OWLDatatypeImpl;

/**
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group
 * @since 3.2.0
 */
@SuppressWarnings("javadoc")
public class OWL2DatatypeImplTestCase extends TestBase {static class __CLR4_5_266z66zlvico0xx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,8135,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private OWLDatatype plainLiteral;

    @Before
    public void setUp() {try{__CLR4_5_266z66zlvico0xx.R.inc(8027);
        __CLR4_5_266z66zlvico0xx.R.inc(8028);plainLiteral = OWL2Datatype.RDF_PLAIN_LITERAL.getDatatype(df);
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getBuiltInDatatype() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2psxdqg671();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getBuiltInDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8029,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2psxdqg671(){try{__CLR4_5_266z66zlvico0xx.R.inc(8029);
        __CLR4_5_266z66zlvico0xx.R.inc(8030);assertEquals(OWL2Datatype.RDF_PLAIN_LITERAL,
                plainLiteral.getBuiltInDatatype());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isString() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nyhvzy673();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nyhvzy673(){try{__CLR4_5_266z66zlvico0xx.R.inc(8031);
        __CLR4_5_266z66zlvico0xx.R.inc(8032);assertFalse(plainLiteral.isString());
        __CLR4_5_266z66zlvico0xx.R.inc(8033);OWLDatatype string = OWL2Datatype.XSD_STRING.getDatatype(df);
        __CLR4_5_266z66zlvico0xx.R.inc(8034);assertTrue(string.isString());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isInteger() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2na1bwb677();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8035,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2na1bwb677(){try{__CLR4_5_266z66zlvico0xx.R.inc(8035);
        __CLR4_5_266z66zlvico0xx.R.inc(8036);assertFalse(plainLiteral.isInteger());
        __CLR4_5_266z66zlvico0xx.R.inc(8037);OWLDatatype integer = OWL2Datatype.XSD_INTEGER.getDatatype(df);
        __CLR4_5_266z66zlvico0xx.R.inc(8038);assertTrue(integer.isInteger());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isFloat() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx0qxl67b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isFloat",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx0qxl67b(){try{__CLR4_5_266z66zlvico0xx.R.inc(8039);
        __CLR4_5_266z66zlvico0xx.R.inc(8040);assertFalse(plainLiteral.isFloat());
        __CLR4_5_266z66zlvico0xx.R.inc(8041);OWLDatatype floatDatatype = OWL2Datatype.XSD_FLOAT.getDatatype(df);
        __CLR4_5_266z66zlvico0xx.R.inc(8042);assertTrue(floatDatatype.isFloat());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isDouble() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cc9g8u67f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8043,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cc9g8u67f(){try{__CLR4_5_266z66zlvico0xx.R.inc(8043);
        __CLR4_5_266z66zlvico0xx.R.inc(8044);assertFalse(plainLiteral.isDouble());
        __CLR4_5_266z66zlvico0xx.R.inc(8045);OWLDatatype doubleDatatype = OWL2Datatype.XSD_DOUBLE.getDatatype(df);
        __CLR4_5_266z66zlvico0xx.R.inc(8046);assertTrue(doubleDatatype.isDouble());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isBoolean() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gw6tr967j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gw6tr967j(){try{__CLR4_5_266z66zlvico0xx.R.inc(8047);
        __CLR4_5_266z66zlvico0xx.R.inc(8048);assertFalse(plainLiteral.isBoolean());
        __CLR4_5_266z66zlvico0xx.R.inc(8049);OWLDatatype booleanDatatype = OWL2Datatype.XSD_BOOLEAN.getDatatype(df);
        __CLR4_5_266z66zlvico0xx.R.inc(8050);assertTrue(booleanDatatype.isBoolean());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isRDFPlainLiteral() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e7yyoa67n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isRDFPlainLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e7yyoa67n(){try{__CLR4_5_266z66zlvico0xx.R.inc(8051);
        __CLR4_5_266z66zlvico0xx.R.inc(8052);assertTrue(plainLiteral.isRDFPlainLiteral());
        __CLR4_5_266z66zlvico0xx.R.inc(8053);OWLDatatype stringDatatype = OWL2Datatype.XSD_STRING.getDatatype(df);
        __CLR4_5_266z66zlvico0xx.R.inc(8054);assertFalse(stringDatatype.isRDFPlainLiteral());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isDatatype() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27gi8j967r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8055,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27gi8j967r(){try{__CLR4_5_266z66zlvico0xx.R.inc(8055);
        __CLR4_5_266z66zlvico0xx.R.inc(8056);assertTrue(plainLiteral.isDatatype());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void asOWLDatatype() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sig2nx67t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.asOWLDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8057,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sig2nx67t(){try{__CLR4_5_266z66zlvico0xx.R.inc(8057);
        __CLR4_5_266z66zlvico0xx.R.inc(8058);assertEquals(plainLiteral, plainLiteral.asOWLDatatype());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isTopDatatype() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hryabu67v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isTopDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hryabu67v(){try{__CLR4_5_266z66zlvico0xx.R.inc(8059);
        __CLR4_5_266z66zlvico0xx.R.inc(8060);OWLDatatype rdfsLiteralDatatype = OWL2Datatype.RDFS_LITERAL
                .getDatatype(df);
        __CLR4_5_266z66zlvico0xx.R.inc(8061);assertTrue(rdfsLiteralDatatype.isTopDatatype());
        __CLR4_5_266z66zlvico0xx.R.inc(8062);assertFalse(plainLiteral.isTopDatatype());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getDataRangeType() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utk7y667z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getDataRangeType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utk7y667z(){try{__CLR4_5_266z66zlvico0xx.R.inc(8063);
        __CLR4_5_266z66zlvico0xx.R.inc(8064);assertEquals(DataRangeType.DATATYPE, plainLiteral.getDataRangeType());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getEntityType() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jt0ryy681();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getEntityType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8065,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jt0ryy681(){try{__CLR4_5_266z66zlvico0xx.R.inc(8065);
        __CLR4_5_266z66zlvico0xx.R.inc(8066);assertEquals(EntityType.DATATYPE, plainLiteral.getEntityType());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isType() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w5p00b683();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8067,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w5p00b683(){try{__CLR4_5_266z66zlvico0xx.R.inc(8067);
        __CLR4_5_266z66zlvico0xx.R.inc(8068);assertTrue(plainLiteral.isType(EntityType.DATATYPE));
        __CLR4_5_266z66zlvico0xx.R.inc(8069);assertFalse(plainLiteral.isType(EntityType.CLASS));
        __CLR4_5_266z66zlvico0xx.R.inc(8070);assertFalse(plainLiteral.isType(EntityType.OBJECT_PROPERTY));
        __CLR4_5_266z66zlvico0xx.R.inc(8071);assertFalse(plainLiteral.isType(EntityType.DATA_PROPERTY));
        __CLR4_5_266z66zlvico0xx.R.inc(8072);assertFalse(plainLiteral.isType(EntityType.ANNOTATION_PROPERTY));
        __CLR4_5_266z66zlvico0xx.R.inc(8073);assertFalse(plainLiteral.isType(EntityType.NAMED_INDIVIDUAL));
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isBuiltIn() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24q268w68a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isBuiltIn",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8074,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24q268w68a(){try{__CLR4_5_266z66zlvico0xx.R.inc(8074);
        __CLR4_5_266z66zlvico0xx.R.inc(8075);assertTrue(plainLiteral.isBuiltIn());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isOWLClass() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_223zbj968c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isOWLClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8076,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_223zbj968c(){try{__CLR4_5_266z66zlvico0xx.R.inc(8076);
        __CLR4_5_266z66zlvico0xx.R.inc(8077);assertFalse(plainLiteral.isOWLClass());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test(expected = RuntimeException.class)
    public void asOWLClass() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wfzq5p68e();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,97,115,79,87,76,67,108,97,115,115,58,32,91,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof RuntimeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.asOWLClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wfzq5p68e(){try{__CLR4_5_266z66zlvico0xx.R.inc(8078);
        __CLR4_5_266z66zlvico0xx.R.inc(8079);plainLiteral.asOWLClass();
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isOWLObjectProperty() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bowq368g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isOWLObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8080,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bowq368g(){try{__CLR4_5_266z66zlvico0xx.R.inc(8080);
        __CLR4_5_266z66zlvico0xx.R.inc(8081);assertFalse(plainLiteral.isOWLObjectProperty());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test(expected = RuntimeException.class)
    public void asOWLObjectProperty() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s041fx68i();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,97,115,79,87,76,79,98,106,101,99,116,80,114,111,112,101,114,116,121,58,32,91,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof RuntimeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.asOWLObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s041fx68i(){try{__CLR4_5_266z66zlvico0xx.R.inc(8082);
        __CLR4_5_266z66zlvico0xx.R.inc(8083);plainLiteral.asOWLObjectProperty();
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isOWLDataProperty() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w5a86868k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isOWLDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8084,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w5a86868k(){try{__CLR4_5_266z66zlvico0xx.R.inc(8084);
        __CLR4_5_266z66zlvico0xx.R.inc(8085);assertFalse(plainLiteral.isOWLDataProperty());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test(expected = RuntimeException.class)
    public void asOWLDataProperty() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ys2xig68m();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,97,115,79,87,76,68,97,116,97,80,114,111,112,101,114,116,121,58,32,91,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof RuntimeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.asOWLDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ys2xig68m(){try{__CLR4_5_266z66zlvico0xx.R.inc(8086);
        __CLR4_5_266z66zlvico0xx.R.inc(8087);plainLiteral.asOWLDataProperty();
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isOWLAnnotationProperty() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23qmfgb68o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isOWLAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23qmfgb68o(){try{__CLR4_5_266z66zlvico0xx.R.inc(8088);
        __CLR4_5_266z66zlvico0xx.R.inc(8089);assertFalse(plainLiteral.isOWLAnnotationProperty());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test(expected = RuntimeException.class)
    public void asOWLAnnotationProperty() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2efps1p68q();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,97,115,79,87,76,65,110,110,111,116,97,116,105,111,110,80,114,111,112,101,114,116,121,58,32,91,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof RuntimeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.asOWLAnnotationProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8090,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2efps1p68q(){try{__CLR4_5_266z66zlvico0xx.R.inc(8090);
        __CLR4_5_266z66zlvico0xx.R.inc(8091);plainLiteral.asOWLAnnotationProperty();
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isOWLNamedIndividual() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xro21t68s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isOWLNamedIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8092,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xro21t68s(){try{__CLR4_5_266z66zlvico0xx.R.inc(8092);
        __CLR4_5_266z66zlvico0xx.R.inc(8093);assertFalse(plainLiteral.isOWLNamedIndividual());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test(expected = RuntimeException.class)
    public void asOWLNamedIndividual() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d3jihl68u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,97,115,79,87,76,78,97,109,101,100,73,110,100,105,118,105,100,117,97,108,58,32,91,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof RuntimeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.asOWLNamedIndividual",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d3jihl68u(){try{__CLR4_5_266z66zlvico0xx.R.inc(8094);
        __CLR4_5_266z66zlvico0xx.R.inc(8095);plainLiteral.asOWLNamedIndividual();
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void toStringID() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cucjrm68w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.toStringID",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cucjrm68w(){try{__CLR4_5_266z66zlvico0xx.R.inc(8096);
        __CLR4_5_266z66zlvico0xx.R.inc(8097);assertNotNull(plainLiteral.toStringID());
        __CLR4_5_266z66zlvico0xx.R.inc(8098);assertEquals(OWL2Datatype.RDF_PLAIN_LITERAL.getIRI().toString(),
                plainLiteral.toStringID());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getIRI() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2li72up68z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getIRI",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8099,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2li72up68z(){try{__CLR4_5_266z66zlvico0xx.R.inc(8099);
        __CLR4_5_266z66zlvico0xx.R.inc(8100);assertNotNull(plainLiteral.getIRI());
        __CLR4_5_266z66zlvico0xx.R.inc(8101);assertEquals(OWL2Datatype.RDF_PLAIN_LITERAL.getIRI(),
                plainLiteral.getIRI());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void shouldEquals() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28k23l3692();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.shouldEquals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28k23l3692(){try{__CLR4_5_266z66zlvico0xx.R.inc(8102);
        __CLR4_5_266z66zlvico0xx.R.inc(8103);assertEquals(plainLiteral, plainLiteral);
        __CLR4_5_266z66zlvico0xx.R.inc(8104);assertEquals(plainLiteral,
                OWL2Datatype.RDF_PLAIN_LITERAL.getDatatype(df));
        __CLR4_5_266z66zlvico0xx.R.inc(8105);assertNotSame(plainLiteral, OWL2Datatype.XSD_STRING.getDatatype(df));
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getSignature() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zcwv7b696();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getSignature",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8106,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zcwv7b696(){try{__CLR4_5_266z66zlvico0xx.R.inc(8106);
        __CLR4_5_266z66zlvico0xx.R.inc(8107);assertNotNull(plainLiteral.getSignature());
        __CLR4_5_266z66zlvico0xx.R.inc(8108);assertEquals(plainLiteral.getSignature(), singleton(plainLiteral));
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getAnonymousIndividuals() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m7646i699();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getAnonymousIndividuals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m7646i699(){try{__CLR4_5_266z66zlvico0xx.R.inc(8109);
        __CLR4_5_266z66zlvico0xx.R.inc(8110);assertTrue(plainLiteral.getAnonymousIndividuals().isEmpty());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getClassesInSignature() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_273c2dy69b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getClassesInSignature",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8111,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_273c2dy69b(){try{__CLR4_5_266z66zlvico0xx.R.inc(8111);
        __CLR4_5_266z66zlvico0xx.R.inc(8112);assertTrue(plainLiteral.getClassesInSignature().isEmpty());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getObjectPropertiesInSignature() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b8azyq69d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getObjectPropertiesInSignature",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8113,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b8azyq69d(){try{__CLR4_5_266z66zlvico0xx.R.inc(8113);
        __CLR4_5_266z66zlvico0xx.R.inc(8114);assertTrue(plainLiteral.getObjectPropertiesInSignature().isEmpty());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getDataPropertiesInSignature() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hmmhi169f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getDataPropertiesInSignature",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8115,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hmmhi169f(){try{__CLR4_5_266z66zlvico0xx.R.inc(8115);
        __CLR4_5_266z66zlvico0xx.R.inc(8116);assertTrue(plainLiteral.getDataPropertiesInSignature().isEmpty());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getIndividualsInSignature() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_272xogm69h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getIndividualsInSignature",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_272xogm69h(){try{__CLR4_5_266z66zlvico0xx.R.inc(8117);
        __CLR4_5_266z66zlvico0xx.R.inc(8118);assertTrue(plainLiteral.getIndividualsInSignature().isEmpty());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void getNestedClassExpressions() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_210684769j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.getNestedClassExpressions",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8119,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_210684769j(){try{__CLR4_5_266z66zlvico0xx.R.inc(8119);
        __CLR4_5_266z66zlvico0xx.R.inc(8120);assertTrue(plainLiteral.getNestedClassExpressions().isEmpty());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isTopEntity() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e7vkt169l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isTopEntity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e7vkt169l(){try{__CLR4_5_266z66zlvico0xx.R.inc(8121);
        __CLR4_5_266z66zlvico0xx.R.inc(8122);assertTrue(OWL2Datatype.RDFS_LITERAL.getDatatype(df).isTopDatatype());
        __CLR4_5_266z66zlvico0xx.R.inc(8123);assertFalse(OWL2Datatype.RDF_PLAIN_LITERAL.getDatatype(df)
                .isTopDatatype());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void isBottomEntity() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vphmp69o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.isBottomEntity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vphmp69o(){try{__CLR4_5_266z66zlvico0xx.R.inc(8124);
        __CLR4_5_266z66zlvico0xx.R.inc(8125);assertFalse(plainLiteral.isBottomEntity());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}

    @Test
    public void contains() {__CLR4_5_266z66zlvico0xx.R.globalSliceStart(getClass().getName(),8126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tnwqi69q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_266z66zlvico0xx.R.rethrow($CLV_t2$);}finally{__CLR4_5_266z66zlvico0xx.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.literals.OWL2DatatypeImplTestCase.contains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),8126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tnwqi69q(){try{__CLR4_5_266z66zlvico0xx.R.inc(8126);
        __CLR4_5_266z66zlvico0xx.R.inc(8127);IRI iri = OWL2Datatype.XSD_BYTE.getIRI();
        __CLR4_5_266z66zlvico0xx.R.inc(8128);Set<OWLDatatype> datatypes = new HashSet<>();
        __CLR4_5_266z66zlvico0xx.R.inc(8129);OWLDatatypeImpl dtImpl = new OWLDatatypeImpl(iri);
        __CLR4_5_266z66zlvico0xx.R.inc(8130);OWLDatatype dt2Impl = OWL2Datatype.XSD_BYTE.getDatatype(df);
        __CLR4_5_266z66zlvico0xx.R.inc(8131);assertEquals(dtImpl, dt2Impl);
        __CLR4_5_266z66zlvico0xx.R.inc(8132);datatypes.add(dt2Impl);
        __CLR4_5_266z66zlvico0xx.R.inc(8133);assertTrue(datatypes.contains(dtImpl));
        __CLR4_5_266z66zlvico0xx.R.inc(8134);assertEquals(dt2Impl.hashCode(), dtImpl.hashCode());
    }finally{__CLR4_5_266z66zlvico0xx.R.flushNeeded();}}
}
