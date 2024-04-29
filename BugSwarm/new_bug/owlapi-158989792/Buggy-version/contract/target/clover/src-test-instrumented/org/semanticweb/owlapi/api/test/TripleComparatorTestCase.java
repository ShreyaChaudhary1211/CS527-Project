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

import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;
import static org.semanticweb.owlapi.vocab.OWLRDFVocabulary.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.semanticweb.owlapi.io.RDFNode;
import org.semanticweb.owlapi.io.RDFResourceBlankNode;
import org.semanticweb.owlapi.io.RDFResourceIRI;
import org.semanticweb.owlapi.io.RDFTriple;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

@SuppressWarnings("javadoc")
public class TripleComparatorTestCase {static class __CLR4_5_22eu2eulvicnztd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,3141,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    String ns = "http://www.co-ode.org/roberts/pto.owl#";
    @Nonnull
    RDFResourceIRI g = r(Class(IRI(ns + "MoleOfGoldAtom")));
    @Nonnull
    RDFResourceIRI d = r(ObjectProperty(OWL_DISJOINT_WITH.getIRI()));
    @Nonnull
    RDFResourceIRI subtype = r(RDFS_SUBCLASS_OF.getIRI());

    @Test
    public void shouldSort() {__CLR4_5_22eu2eulvicnztd.R.globalSliceStart(getClass().getName(),3126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25felug2eu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_22eu2eulvicnztd.R.rethrow($CLV_t2$);}finally{__CLR4_5_22eu2eulvicnztd.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.api.test.TripleComparatorTestCase.shouldSort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),3126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25felug2eu(){try{__CLR4_5_22eu2eulvicnztd.R.inc(3126);
        __CLR4_5_22eu2eulvicnztd.R.inc(3127);List<RDFTriple> list = new ArrayList<>(Arrays.asList(
            //@formatter:off
                triple("MoleOfNiobiumAtom"), 
                triple("MoleOfMercuryAtom"),
                triple("MoleOfHydrogenAtom"), 
                triple("MoleOfSodiumAtom"),
                triple("MoleOfIodineAtom"), 
                triple(608551021), 
                triple(1419046060),
                triple(908505087), 
                triple("MoleOfManganeseAtom"),
                triple("MoleOfIronAtom"), 
                triple("MoleOfYttriumAtom"),
                triple("MoleOfRadiumAtom"), 
                triple("MoleOfPoloniumAtom"),
                triple("MoleOfPalladiumAtom"), 
                triple("MoleOfLeadAtom"),
                triple("MoleOfTinAtom"), 
                triple("MoleOfIndiumAtom"), 
                triple(589710844),
                triple("MoleOfPhosphorusAtom"), 
                triple(767224527),
                triple("MoleOfXenonAtom"), 
                triple("MoleOfZirconiumAtom"),
                triple("MoleOfNickelAtom"), 
                triple("MoleOfRhodiumAtom"),
                triple("MoleOfThalliumAtom"), 
                triple("MoleOfHafniumAtom"),
                triple(12186480), 
                triple(1975184526), 
                triple("MoleOfVanadiumAtom"),
                triple(484873262), 
                triple("MoleOfScandiumAtom"),
                triple("MoleOfRubidiumAtom"), 
                triple("MoleOfMolybdenumAtom"),
                triple("MoleOfTelluriumAtom"), 
                triple(21622515),
                triple("MoleOfMagnesiumAtom"), 
                triple("MoleOfTungstenAtom"),
                triple("MoleOfPotassiumAtom"), 
                triple("MoleOfSulfurAtom"),
                triple("MoleOfOxygenAtom"), 
                triple("MoleOfHeliumAtom"),
                triple("MoleOfRutheniumAtom"), 
                triple(315300697), 
                triple(1711957716),
                triple("MoleOfLithiumAtom"), 
                triple("MoleOfTitaniumAtom"),
                triple("MoleOfOsmiumAtom"), 
                triple("MoleOfSiliconAtom"),
                triple("MoleOfTantalumAtom"), 
                triple(624417224),
                triple("MoleOfRadonAtom"), 
                triple(1556170233), 
                new RDFTriple(g, subtype, r(IRI(ns + "MoleOfAtom"))), 
                triple("MoleOfSeleniumAtom"),
                triple("MoleOfNeonAtom"), 
                triple("MoleOfKryptonAtom"), 
                triple( RDF_TYPE,OWL_CLASS),
                triple("MoleOfPlatinumAtom"), 
                triple("MoleOfSilverAtom"),
                triple("MoleOfStrontiumAtom"), 
                triple(1340998166)
                , triple("MoleOfIridiumAtom")
                , triple("MoleOfNitrogenAtom")
                , triple("MoleOfRheniumAtom")
                , triple("MoleOfZincAtom")
                //@formatter:on
        ));
        __CLR4_5_22eu2eulvicnztd.R.inc(3128);Collections.sort(list);
    }finally{__CLR4_5_22eu2eulvicnztd.R.flushNeeded();}}

    @Nonnull
    private RDFTriple triple(String n) {try{__CLR4_5_22eu2eulvicnztd.R.inc(3129);
        __CLR4_5_22eu2eulvicnztd.R.inc(3130);return new RDFTriple(g, d, r(IRI(ns + n)));
    }finally{__CLR4_5_22eu2eulvicnztd.R.flushNeeded();}}

    @Nonnull
    private RDFTriple triple(@Nonnull OWLRDFVocabulary p,
        @Nonnull OWLRDFVocabulary n) {try{__CLR4_5_22eu2eulvicnztd.R.inc(3131);
        __CLR4_5_22eu2eulvicnztd.R.inc(3132);return new RDFTriple(g, r(p.getIRI()), r(n.getIRI()));
    }finally{__CLR4_5_22eu2eulvicnztd.R.flushNeeded();}}

    @Nonnull
    private RDFTriple triple(int n) {try{__CLR4_5_22eu2eulvicnztd.R.inc(3133);
        __CLR4_5_22eu2eulvicnztd.R.inc(3134);return new RDFTriple(g, subtype, r(n));
    }finally{__CLR4_5_22eu2eulvicnztd.R.flushNeeded();}}

    @Nonnull
    private static RDFResourceIRI r(@Nonnull OWLEntity e) {try{__CLR4_5_22eu2eulvicnztd.R.inc(3135);
        __CLR4_5_22eu2eulvicnztd.R.inc(3136);return new RDFResourceIRI(e.getIRI());
    }finally{__CLR4_5_22eu2eulvicnztd.R.flushNeeded();}}

    @Nonnull
    private static RDFResourceIRI r(@Nonnull IRI e) {try{__CLR4_5_22eu2eulvicnztd.R.inc(3137);
        __CLR4_5_22eu2eulvicnztd.R.inc(3138);return new RDFResourceIRI(e);
    }finally{__CLR4_5_22eu2eulvicnztd.R.flushNeeded();}}

    @Nonnull
    private static RDFNode r(int s) {try{__CLR4_5_22eu2eulvicnztd.R.inc(3139);
        __CLR4_5_22eu2eulvicnztd.R.inc(3140);return new RDFResourceBlankNode(s, false, false);
    }finally{__CLR4_5_22eu2eulvicnztd.R.flushNeeded();}}
}
