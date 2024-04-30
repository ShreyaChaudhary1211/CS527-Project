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
package org.semanticweb.owlapi.api.test;

import static org.junit.Assert.assertSame;

import java.util.Arrays;
import java.util.Collection;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLObjectProperty;

import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryInternalsImplNoCache;

/**
 * A test case to ensure that the reference implementation data factories do not
 * create duplicate objects for distinguished values (e.g. owl:Thing,
 * rdfs:Literal etc.)
 * 
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group
 * @since 3.2.0
 */
@SuppressWarnings({ "javadoc", })
@RunWith(Parameterized.class)
public class OWLDataFactoryImplTestCase {static class __CLR4_5_2289289lvicnzqz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2971,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    private final OWLDataFactoryImpl dataFactory;

    public OWLDataFactoryImplTestCase(OWLDataFactoryImpl dataFactory) {try{__CLR4_5_2289289lvicnzqz.R.inc(2889);
        __CLR4_5_2289289lvicnzqz.R.inc(2890);this.dataFactory = dataFactory;
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Nonnull
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {try{__CLR4_5_2289289lvicnzqz.R.inc(2891);
        __CLR4_5_2289289lvicnzqz.R.inc(2892);OWLDataFactoryImpl noCaching = new OWLDataFactoryImpl(new OWLDataFactoryInternalsImplNoCache(false));
        __CLR4_5_2289289lvicnzqz.R.inc(2893);OWLDataFactoryImpl withCaching = new OWLDataFactoryImpl(new OWLDataFactoryInternalsImplNoCache(false));
        __CLR4_5_2289289lvicnzqz.R.inc(2894);return Arrays.asList(new Object[] { noCaching }, new Object[] { withCaching });
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getRDFPlainLiteral() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2humt3e28f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getRDFPlainLiteral",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2humt3e28f(){try{__CLR4_5_2289289lvicnzqz.R.inc(2895);
        __CLR4_5_2289289lvicnzqz.R.inc(2896);OWLDatatype datatypeCall1 = dataFactory.getRDFPlainLiteral();
        __CLR4_5_2289289lvicnzqz.R.inc(2897);OWLDatatype datatypeCall2 = dataFactory.getRDFPlainLiteral();
        __CLR4_5_2289289lvicnzqz.R.inc(2898);assertSame(datatypeCall1, datatypeCall2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getTopDatatype() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23h651228j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getTopDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23h651228j(){try{__CLR4_5_2289289lvicnzqz.R.inc(2899);
        __CLR4_5_2289289lvicnzqz.R.inc(2900);OWLDatatype datatypeCall1 = dataFactory.getTopDatatype();
        __CLR4_5_2289289lvicnzqz.R.inc(2901);OWLDatatype datatypeCall2 = dataFactory.getTopDatatype();
        __CLR4_5_2289289lvicnzqz.R.inc(2902);assertSame(datatypeCall1, datatypeCall2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getBooleanDatatype() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yj734328n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getBooleanDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yj734328n(){try{__CLR4_5_2289289lvicnzqz.R.inc(2903);
        __CLR4_5_2289289lvicnzqz.R.inc(2904);OWLDatatype datatypeCall1 = dataFactory.getBooleanOWLDatatype();
        __CLR4_5_2289289lvicnzqz.R.inc(2905);OWLDatatype datatypeCall2 = dataFactory.getBooleanOWLDatatype();
        __CLR4_5_2289289lvicnzqz.R.inc(2906);assertSame(datatypeCall1, datatypeCall2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getDoubleDatatype() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27l9umm28r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getDoubleDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27l9umm28r(){try{__CLR4_5_2289289lvicnzqz.R.inc(2907);
        __CLR4_5_2289289lvicnzqz.R.inc(2908);OWLDatatype datatypeCall1 = dataFactory.getDoubleOWLDatatype();
        __CLR4_5_2289289lvicnzqz.R.inc(2909);OWLDatatype datatypeCall2 = dataFactory.getDoubleOWLDatatype();
        __CLR4_5_2289289lvicnzqz.R.inc(2910);assertSame(datatypeCall1, datatypeCall2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getFloatDatatype() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28fws128v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getFloatDatatype",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28fws128v(){try{__CLR4_5_2289289lvicnzqz.R.inc(2911);
        __CLR4_5_2289289lvicnzqz.R.inc(2912);OWLDatatype datatypeCall1 = dataFactory.getFloatOWLDatatype();
        __CLR4_5_2289289lvicnzqz.R.inc(2913);OWLDatatype datatypeCall2 = dataFactory.getFloatOWLDatatype();
        __CLR4_5_2289289lvicnzqz.R.inc(2914);assertSame(datatypeCall1, datatypeCall2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getRDFSLabel() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bqwps628z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getRDFSLabel",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2915,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bqwps628z(){try{__CLR4_5_2289289lvicnzqz.R.inc(2915);
        __CLR4_5_2289289lvicnzqz.R.inc(2916);OWLAnnotationProperty call1 = dataFactory.getRDFSLabel();
        __CLR4_5_2289289lvicnzqz.R.inc(2917);OWLAnnotationProperty call2 = dataFactory.getRDFSLabel();
        __CLR4_5_2289289lvicnzqz.R.inc(2918);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getRDFSComment() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2snfutt293();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getRDFSComment",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2919,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2snfutt293(){try{__CLR4_5_2289289lvicnzqz.R.inc(2919);
        __CLR4_5_2289289lvicnzqz.R.inc(2920);OWLAnnotationProperty call1 = dataFactory.getRDFSComment();
        __CLR4_5_2289289lvicnzqz.R.inc(2921);OWLAnnotationProperty call2 = dataFactory.getRDFSComment();
        __CLR4_5_2289289lvicnzqz.R.inc(2922);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getRDFSSeeAlso() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y1uwj8297();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getRDFSSeeAlso",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2923,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y1uwj8297(){try{__CLR4_5_2289289lvicnzqz.R.inc(2923);
        __CLR4_5_2289289lvicnzqz.R.inc(2924);OWLAnnotationProperty call1 = dataFactory.getRDFSSeeAlso();
        __CLR4_5_2289289lvicnzqz.R.inc(2925);OWLAnnotationProperty call2 = dataFactory.getRDFSSeeAlso();
        __CLR4_5_2289289lvicnzqz.R.inc(2926);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getRDFSIsDefinedBy() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vvd1429b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getRDFSIsDefinedBy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2927,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vvd1429b(){try{__CLR4_5_2289289lvicnzqz.R.inc(2927);
        __CLR4_5_2289289lvicnzqz.R.inc(2928);OWLAnnotationProperty call1 = dataFactory.getRDFSIsDefinedBy();
        __CLR4_5_2289289lvicnzqz.R.inc(2929);OWLAnnotationProperty call2 = dataFactory.getRDFSIsDefinedBy();
        __CLR4_5_2289289lvicnzqz.R.inc(2930);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLVersionInfo() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2564pj529f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLVersionInfo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2564pj529f(){try{__CLR4_5_2289289lvicnzqz.R.inc(2931);
        __CLR4_5_2289289lvicnzqz.R.inc(2932);OWLAnnotationProperty call1 = dataFactory.getOWLVersionInfo();
        __CLR4_5_2289289lvicnzqz.R.inc(2933);OWLAnnotationProperty call2 = dataFactory.getOWLVersionInfo();
        __CLR4_5_2289289lvicnzqz.R.inc(2934);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLBackwardCompatibleWith() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fgv2q29j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLBackwardCompatibleWith",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fgv2q29j(){try{__CLR4_5_2289289lvicnzqz.R.inc(2935);
        __CLR4_5_2289289lvicnzqz.R.inc(2936);OWLAnnotationProperty call1 = dataFactory.getOWLBackwardCompatibleWith();
        __CLR4_5_2289289lvicnzqz.R.inc(2937);OWLAnnotationProperty call2 = dataFactory.getOWLBackwardCompatibleWith();
        __CLR4_5_2289289lvicnzqz.R.inc(2938);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLIncompatibleWith() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qg5e0k29n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLIncompatibleWith",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2939,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qg5e0k29n(){try{__CLR4_5_2289289lvicnzqz.R.inc(2939);
        __CLR4_5_2289289lvicnzqz.R.inc(2940);OWLAnnotationProperty call1 = dataFactory.getOWLIncompatibleWith();
        __CLR4_5_2289289lvicnzqz.R.inc(2941);OWLAnnotationProperty call2 = dataFactory.getOWLIncompatibleWith();
        __CLR4_5_2289289lvicnzqz.R.inc(2942);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLDeprecated() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2omudko29r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLDeprecated",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2943,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2omudko29r(){try{__CLR4_5_2289289lvicnzqz.R.inc(2943);
        __CLR4_5_2289289lvicnzqz.R.inc(2944);OWLAnnotationProperty call1 = dataFactory.getOWLDeprecated();
        __CLR4_5_2289289lvicnzqz.R.inc(2945);OWLAnnotationProperty call2 = dataFactory.getOWLDeprecated();
        __CLR4_5_2289289lvicnzqz.R.inc(2946);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLThing() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28y96kn29v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLThing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28y96kn29v(){try{__CLR4_5_2289289lvicnzqz.R.inc(2947);
        __CLR4_5_2289289lvicnzqz.R.inc(2948);OWLClass call1 = dataFactory.getOWLThing();
        __CLR4_5_2289289lvicnzqz.R.inc(2949);OWLClass call2 = dataFactory.getOWLThing();
        __CLR4_5_2289289lvicnzqz.R.inc(2950);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLNothing() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uo6pyy29z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLNothing",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2951,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uo6pyy29z(){try{__CLR4_5_2289289lvicnzqz.R.inc(2951);
        __CLR4_5_2289289lvicnzqz.R.inc(2952);OWLClass call1 = dataFactory.getOWLNothing();
        __CLR4_5_2289289lvicnzqz.R.inc(2953);OWLClass call2 = dataFactory.getOWLNothing();
        __CLR4_5_2289289lvicnzqz.R.inc(2954);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLTopObjectProperty() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2upr55q2a3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLTopObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2955,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2upr55q2a3(){try{__CLR4_5_2289289lvicnzqz.R.inc(2955);
        __CLR4_5_2289289lvicnzqz.R.inc(2956);OWLObjectProperty call1 = dataFactory.getOWLTopObjectProperty();
        __CLR4_5_2289289lvicnzqz.R.inc(2957);OWLObjectProperty call2 = dataFactory.getOWLTopObjectProperty();
        __CLR4_5_2289289lvicnzqz.R.inc(2958);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLBottomObjectProperty() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p5tro42a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLBottomObjectProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2959,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p5tro42a7(){try{__CLR4_5_2289289lvicnzqz.R.inc(2959);
        __CLR4_5_2289289lvicnzqz.R.inc(2960);OWLObjectProperty call1 = dataFactory.getOWLBottomObjectProperty();
        __CLR4_5_2289289lvicnzqz.R.inc(2961);OWLObjectProperty call2 = dataFactory.getOWLBottomObjectProperty();
        __CLR4_5_2289289lvicnzqz.R.inc(2962);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLTopDataProperty() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w3tteb2ab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLTopDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w3tteb2ab(){try{__CLR4_5_2289289lvicnzqz.R.inc(2963);
        __CLR4_5_2289289lvicnzqz.R.inc(2964);OWLDataProperty call1 = dataFactory.getOWLTopDataProperty();
        __CLR4_5_2289289lvicnzqz.R.inc(2965);OWLDataProperty call2 = dataFactory.getOWLTopDataProperty();
        __CLR4_5_2289289lvicnzqz.R.inc(2966);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}

    @Test
    public void getOWLBottomDataProperty() {__CLR4_5_2289289lvicnzqz.R.globalSliceStart(getClass().getName(),2967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ctwk0x2af();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2289289lvicnzqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_2289289lvicnzqz.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.OWLDataFactoryImplTestCase.getOWLBottomDataProperty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),2967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ctwk0x2af(){try{__CLR4_5_2289289lvicnzqz.R.inc(2967);
        __CLR4_5_2289289lvicnzqz.R.inc(2968);OWLDataProperty call1 = dataFactory.getOWLBottomDataProperty();
        __CLR4_5_2289289lvicnzqz.R.inc(2969);OWLDataProperty call2 = dataFactory.getOWLBottomDataProperty();
        __CLR4_5_2289289lvicnzqz.R.inc(2970);assertSame(call1, call2);
    }finally{__CLR4_5_2289289lvicnzqz.R.flushNeeded();}}
}
