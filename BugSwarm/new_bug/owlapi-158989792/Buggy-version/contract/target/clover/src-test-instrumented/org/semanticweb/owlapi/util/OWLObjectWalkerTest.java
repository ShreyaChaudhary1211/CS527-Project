/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.annotation.Nonnull;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.AddOntologyAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLOntology;
import static org.semanticweb.owlapi.util.StructureWalker.AnnotationWalkingControl.DONT_WALK_ANNOTATIONS;
import static org.semanticweb.owlapi.util.StructureWalker.AnnotationWalkingControl.WALK_ANNOTATIONS;
import static org.semanticweb.owlapi.util.StructureWalker.AnnotationWalkingControl.WALK_ONTOLOGY_ANNOTATIONS_ONLY;

/**
 * Created by ses on 8/15/15.
 */
public class OWLObjectWalkerTest extends TestBase {static class __CLR4_5_2btobtolvico2f2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,15355,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private OWLAnnotation world;
    private OWLAnnotation cruelWorld;
    private OWLAnnotationProperty ap;
    private OWLAnnotation goodbye;
    private OWLAnnotation hello;

    @Before
    public void setUp() throws Exception {try{__CLR4_5_2btobtolvico2f2.R.inc(15324);
        __CLR4_5_2btobtolvico2f2.R.inc(15325);this.ap = df.getOWLAnnotationProperty(iri("ap"));
        __CLR4_5_2btobtolvico2f2.R.inc(15326);this.cruelWorld = df.getOWLAnnotation(ap, df.getOWLLiteral("cruel world"));
        __CLR4_5_2btobtolvico2f2.R.inc(15327);this.goodbye = df.getOWLAnnotation(ap, df.getOWLLiteral("goodbye"), singleton(cruelWorld));
        __CLR4_5_2btobtolvico2f2.R.inc(15328);this.world = df.getOWLAnnotation(ap, df.getOWLLiteral("world"));
        __CLR4_5_2btobtolvico2f2.R.inc(15329);this.hello = df.getOWLAnnotation(ap, df.getOWLLiteral("hello"), singleton(world));
    }finally{__CLR4_5_2btobtolvico2f2.R.flushNeeded();}}

    @Test
    public void testWalkAnnotations() throws Exception {__CLR4_5_2btobtolvico2f2.R.globalSliceStart(getClass().getName(),15330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ar8hf4btu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2btobtolvico2f2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2btobtolvico2f2.R.globalSliceEnd(getClass().getName(),"org.semanticweb.owlapi.util.OWLObjectWalkerTest.testWalkAnnotations",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),15330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ar8hf4btu() throws Exception{try{__CLR4_5_2btobtolvico2f2.R.inc(15330);
        __CLR4_5_2btobtolvico2f2.R.inc(15331);OWLOntology o = getOwlOntology();
        __CLR4_5_2btobtolvico2f2.R.inc(15332);List<OWLAnnotation> emptyAnnotationList = Collections.emptyList();
        __CLR4_5_2btobtolvico2f2.R.inc(15333);checkWalkWithFlags(o, DONT_WALK_ANNOTATIONS, emptyAnnotationList);
        __CLR4_5_2btobtolvico2f2.R.inc(15334);checkWalkWithFlags(o, WALK_ONTOLOGY_ANNOTATIONS_ONLY, Arrays.asList(hello));
        __CLR4_5_2btobtolvico2f2.R.inc(15335);checkWalkWithFlags(o, WALK_ANNOTATIONS, Arrays.asList(hello, world, goodbye, cruelWorld));
    }finally{__CLR4_5_2btobtolvico2f2.R.flushNeeded();}}

    private void checkWalkWithFlags(OWLOntology o, StructureWalker.AnnotationWalkingControl walkFlag, List<OWLAnnotation> expected) {try{__CLR4_5_2btobtolvico2f2.R.inc(15336);
        __CLR4_5_2btobtolvico2f2.R.inc(15337);final List<OWLAnnotation> visitedAnnotations = new ArrayList<>();

        __CLR4_5_2btobtolvico2f2.R.inc(15338);OWLObjectVisitor visitor = new OWLObjectVisitorAdapter() {
            @Override
            public void visit(OWLAnnotation node) {try{__CLR4_5_2btobtolvico2f2.R.inc(15339);
                __CLR4_5_2btobtolvico2f2.R.inc(15340);visitedAnnotations.add(node);
            }finally{__CLR4_5_2btobtolvico2f2.R.flushNeeded();}}
        };

        __CLR4_5_2btobtolvico2f2.R.inc(15341);Set<? extends OWLObject> ontologySet = Collections.singleton(o);
        __CLR4_5_2btobtolvico2f2.R.inc(15342);OWLObjectWalker<? extends OWLObject> walker;
        __CLR4_5_2btobtolvico2f2.R.inc(15343);if ((((walkFlag == WALK_ONTOLOGY_ANNOTATIONS_ONLY)&&(__CLR4_5_2btobtolvico2f2.R.iget(15344)!=0|true))||(__CLR4_5_2btobtolvico2f2.R.iget(15345)==0&false))) {{
            __CLR4_5_2btobtolvico2f2.R.inc(15346);walker = new OWLObjectWalker<>(ontologySet);
        } }else {{
            __CLR4_5_2btobtolvico2f2.R.inc(15347);walker = new OWLObjectWalker<>(ontologySet, walkFlag);
        }
        }__CLR4_5_2btobtolvico2f2.R.inc(15348);walker.walkStructure(visitor);
        __CLR4_5_2btobtolvico2f2.R.inc(15349);assertEquals(expected, visitedAnnotations);
    }finally{__CLR4_5_2btobtolvico2f2.R.flushNeeded();}}

    @Nonnull
    private OWLOntology getOwlOntology() {try{__CLR4_5_2btobtolvico2f2.R.inc(15350);
        __CLR4_5_2btobtolvico2f2.R.inc(15351);OWLOntology o = getOWLOntology("foo");
        __CLR4_5_2btobtolvico2f2.R.inc(15352);m.applyChange(new AddOntologyAnnotation(o, hello));
        __CLR4_5_2btobtolvico2f2.R.inc(15353);addAxiom(o, df.getOWLDeclarationAxiom(ap, singleton(goodbye)));
        __CLR4_5_2btobtolvico2f2.R.inc(15354);return o;
    }finally{__CLR4_5_2btobtolvico2f2.R.flushNeeded();}}
}
