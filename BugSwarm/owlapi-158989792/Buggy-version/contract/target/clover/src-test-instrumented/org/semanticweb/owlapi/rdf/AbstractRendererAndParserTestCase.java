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
package org.semanticweb.owlapi.rdf;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.Nonnull;

import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.rdf.rdfxml.parser.RDFXMLParserFactory;
import org.semanticweb.owlapi.rdf.rdfxml.renderer.RDFXMLStorerFactory;

import uk.ac.manchester.cs.owl.owlapi.OWLDataFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyFactoryImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyImpl;
import uk.ac.manchester.cs.owl.owlapi.OWLOntologyManagerImpl;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
@SuppressWarnings({ "javadoc", })
public abstract class AbstractRendererAndParserTestCase extends TestBase {static class __CLR4_5_2bipbiplvico2d8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,14965,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private final OWLOntologyManager man = new OWLOntologyManagerImpl(new OWLDataFactoryImpl(),
        new ReentrantReadWriteLock());

    @Before
    public void setUp() {try{__CLR4_5_2bipbiplvico2d8.R.inc(14929);
        __CLR4_5_2bipbiplvico2d8.R.inc(14930);OWLOntologyBuilder builder = new OWLOntologyBuilder() {

            @Nonnull
            @Override
            public OWLOntology createOWLOntology(@Nonnull OWLOntologyManager manager,
                @Nonnull OWLOntologyID ontologyID) {try{__CLR4_5_2bipbiplvico2d8.R.inc(14931);
                __CLR4_5_2bipbiplvico2d8.R.inc(14932);return new OWLOntologyImpl(manager, ontologyID);
            }finally{__CLR4_5_2bipbiplvico2d8.R.flushNeeded();}}
        };
        __CLR4_5_2bipbiplvico2d8.R.inc(14933);man.getOntologyFactories().add(new OWLOntologyFactoryImpl(builder));
        __CLR4_5_2bipbiplvico2d8.R.inc(14934);man.getOntologyStorers().add(new RDFXMLStorerFactory());
        __CLR4_5_2bipbiplvico2d8.R.inc(14935);man.getOntologyParsers().add(new RDFXMLParserFactory());
    }finally{__CLR4_5_2bipbiplvico2d8.R.flushNeeded();}}

    @Nonnull
    public OWLOntologyManager getManager() {try{__CLR4_5_2bipbiplvico2d8.R.inc(14936);
        __CLR4_5_2bipbiplvico2d8.R.inc(14937);return man;
    }finally{__CLR4_5_2bipbiplvico2d8.R.flushNeeded();}}

    @Nonnull
    protected OWLDataFactory getDataFactory() {try{__CLR4_5_2bipbiplvico2d8.R.inc(14938);
        __CLR4_5_2bipbiplvico2d8.R.inc(14939);return man.getOWLDataFactory();
    }finally{__CLR4_5_2bipbiplvico2d8.R.flushNeeded();}}

    @Test
    public void testSaveAndReload() throws Exception {__CLR4_5_2bipbiplvico2d8.R.globalSliceStart(getClass().getName(),14940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2larfg8bj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2bipbiplvico2d8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2bipbiplvico2d8.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.rdf.AbstractRendererAndParserTestCase.testSaveAndReload",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),14940,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2larfg8bj0() throws Exception{try{__CLR4_5_2bipbiplvico2d8.R.inc(14940);
        __CLR4_5_2bipbiplvico2d8.R.inc(14941);OWLOntology ontA = man.createOntology(IRI.create("http://rdfxmltests/ontology"));
        __CLR4_5_2bipbiplvico2d8.R.inc(14942);for (OWLAxiom ax : getAxioms()) {{
            __CLR4_5_2bipbiplvico2d8.R.inc(14943);man.applyChange(new AddAxiom(ontA, ax));
        }
        // OWLOntologyAnnotationAxiom anno =
        // getDataFactory().getOWLOntologyAnnotationAxiom(ontA,
        // getDataFactory().getCommentAnnotation(getClassExpression()));
        // man.applyChange(new AddAxiom(ontA, anno));
        }__CLR4_5_2bipbiplvico2d8.R.inc(14944);File tempFile = folder.newFile("Ontology.owlapi");
        __CLR4_5_2bipbiplvico2d8.R.inc(14945);man.saveOntology(ontA, IRI.create(tempFile.toURI()));
        __CLR4_5_2bipbiplvico2d8.R.inc(14946);man.removeOntology(ontA);
        __CLR4_5_2bipbiplvico2d8.R.inc(14947);OWLOntology ontB = man.loadOntologyFromOntologyDocument(IRI.create(tempFile.toURI()));
        __CLR4_5_2bipbiplvico2d8.R.inc(14948);Set<OWLLogicalAxiom> aMinusB = ontA.getLogicalAxioms();
        __CLR4_5_2bipbiplvico2d8.R.inc(14949);aMinusB.removeAll(ontB.getAxioms());
        __CLR4_5_2bipbiplvico2d8.R.inc(14950);Set<OWLLogicalAxiom> bMinusA = ontB.getLogicalAxioms();
        __CLR4_5_2bipbiplvico2d8.R.inc(14951);bMinusA.removeAll(ontA.getAxioms());
        __CLR4_5_2bipbiplvico2d8.R.inc(14952);StringBuilder msg = new StringBuilder();
        __CLR4_5_2bipbiplvico2d8.R.inc(14953);if ((((aMinusB.isEmpty() && bMinusA.isEmpty())&&(__CLR4_5_2bipbiplvico2d8.R.iget(14954)!=0|true))||(__CLR4_5_2bipbiplvico2d8.R.iget(14955)==0&false))) {{
            __CLR4_5_2bipbiplvico2d8.R.inc(14956);msg.append("Ontology save/load roundtrip OK.\n");
        } }else {{
            __CLR4_5_2bipbiplvico2d8.R.inc(14957);msg.append("Ontology save/load roundtripping error.\n");
            __CLR4_5_2bipbiplvico2d8.R.inc(14958);msg.append("=> ").append(aMinusB.size()).append(" axioms lost in roundtripping.\n");
            __CLR4_5_2bipbiplvico2d8.R.inc(14959);for (OWLAxiom axiom : aMinusB) {{
                __CLR4_5_2bipbiplvico2d8.R.inc(14960);msg.append(axiom + "\n");
            }
            }__CLR4_5_2bipbiplvico2d8.R.inc(14961);msg.append("=> ").append(bMinusA.size()).append(" axioms added after roundtripping.\n");
            __CLR4_5_2bipbiplvico2d8.R.inc(14962);for (OWLAxiom axiom : bMinusA) {{
                __CLR4_5_2bipbiplvico2d8.R.inc(14963);msg.append(axiom + "\n");
            }
        }}
        }__CLR4_5_2bipbiplvico2d8.R.inc(14964);assertTrue(msg.toString(), aMinusB.isEmpty() && bMinusA.isEmpty());
    }finally{__CLR4_5_2bipbiplvico2d8.R.flushNeeded();}}

    protected abstract Set<OWLAxiom> getAxioms();

    protected abstract String getClassExpression();
}
