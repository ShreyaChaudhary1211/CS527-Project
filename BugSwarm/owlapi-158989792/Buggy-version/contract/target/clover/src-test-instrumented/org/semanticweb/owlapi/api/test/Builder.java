/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.api.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;

import com.google.common.collect.Sets;

@SuppressWarnings("javadoc")
public class Builder {public static class __CLR4_5_21qx1qxlvicnzei{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006e\u0074\u0072\u0061\u0063\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237363284L,8589935092L,2422,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static @Nonnull OWLDataFactory df = OWLManager.getOWLDataFactory();
    private final @Nonnull OWLAnnotationProperty ap = df.getOWLAnnotationProperty(IRI.create("urn:test#", "ann"));
    private final @Nonnull OWLObjectProperty op = df.getOWLObjectProperty(IRI.create("urn:test#", "op"));
    private final @Nonnull OWLDataProperty dp = df.getOWLDataProperty(IRI.create("urn:test#", "dp"));
    private final @Nonnull OWLLiteral lit = df.getOWLLiteral(false);
    private final @Nonnull OWLLiteral plainlit = df.getOWLLiteral("string", "en");
    private final @Nonnull IRI iri = IRI.create("urn:test#", "iri");
    private final @Nonnull Set<OWLAnnotation> as = Sets.newHashSet(df.getOWLAnnotation(ap, df.getOWLLiteral("test")));
    private final @Nonnull OWLClass ce = df.getOWLClass(IRI.create("urn:test#", "c"));
    private final @Nonnull OWLNamedIndividual i = df.getOWLNamedIndividual(IRI.create("urn:test#", "i"));
    private final @Nonnull OWLNamedIndividual j = df.getOWLNamedIndividual(IRI.create("urn:test#", "j"));
    private final @Nonnull OWLDatatype d = df.getOWLDatatype(IRI.create("urn:test#", "datatype"));
    private final @Nonnull Set<OWLDataProperty> dps = Sets.newHashSet(df.getOWLDataProperty(iri), dp);
    private final @Nonnull Set<OWLObjectProperty> ops = Sets.newHashSet(df.getOWLObjectProperty(iri), op);
    private final @Nonnull Set<OWLClass> classes = Sets.newHashSet(df.getOWLClass(iri), ce);
    private final @Nonnull Set<OWLNamedIndividual> inds = Sets.newHashSet(i, df.getOWLNamedIndividual(iri));
    private final @Nonnull SWRLAtom v1 = df.getSWRLBuiltInAtom(IRI.create("urn:swrl#", "v1"), Arrays.asList((SWRLDArgument) df.getSWRLVariable(IRI.create("urn:swrl#", "var3")), df.getSWRLVariable(IRI.create("urn:swrl#", "var4"))));
    private final @Nonnull SWRLAtom v2 = df.getSWRLBuiltInAtom(IRI.create("urn:swrl#", "v2"), Arrays.asList((SWRLDArgument) df.getSWRLVariable(IRI.create("urn:swrl#", "var5")), df.getSWRLVariable(IRI.create("urn:swrl#", "var6"))));
    private final @Nonnull Set<SWRLAtom> body = Sets.newHashSet(v1);
    private final @Nonnull Set<SWRLAtom> head = Sets.newHashSet(v2);
    private final @Nonnull SWRLDArgument var1 = df.getSWRLVariable(IRI.create("urn:swrl#", "var1"));
    private final @Nonnull List<SWRLDArgument> var1list = Arrays.asList(var1);
    private final @Nonnull SWRLIArgument var2 = df.getSWRLVariable(IRI.create("urn:swrl#", "var2"));
    private final @Nonnull LinkedHashSet<SWRLAtom> body2 = Sets.newLinkedHashSet(Arrays.asList(v1, 
        df.getSWRLClassAtom(ce, var2), 
        df.getSWRLDataRangeAtom(d, var1), 
        df.getSWRLBuiltInAtom(iri, var1list), 
        df.getSWRLDifferentIndividualsAtom(var2, df.getSWRLIndividualArgument(i)), 
        df.getSWRLSameIndividualAtom(var2, df.getSWRLIndividualArgument(df.getOWLNamedIndividual(iri))), 
        df.getSWRLBuiltInAtom(iri, var1list)));
    private final @Nonnull LinkedHashSet<SWRLAtom> head2 = Sets.newLinkedHashSet(Arrays.asList(v2, df
        .getSWRLDataPropertyAtom(dp, var2, df.getSWRLLiteralArgument(lit)), df.getSWRLObjectPropertyAtom(op, var2, var2)));
    private final @Nonnull OWLOntologyManager m = getManager();

    // no parsers and storers injected
    private static OWLOntologyManager getManager() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2265);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2266);OWLOntologyManager instance = OWLManager.createOWLOntologyManager();
        __CLR4_5_21qx1qxlvicnzei.R.inc(2267);instance.getOntologyParsers().clear();
        __CLR4_5_21qx1qxlvicnzei.R.inc(2268);instance.getOntologyStorers().clear();
        __CLR4_5_21qx1qxlvicnzei.R.inc(2269);return instance;
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public SWRLRule bigRule() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2270);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2271);return df.getSWRLRule(body2, head2, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLHasKeyAxiom hasKey() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2272);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2273);Set<OWLPropertyExpression> set = new HashSet<>();
        __CLR4_5_21qx1qxlvicnzei.R.inc(2274);set.add(df.getOWLObjectProperty(iri));
        __CLR4_5_21qx1qxlvicnzei.R.inc(2275);set.add(op);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2276);set.add(dp);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2277);return df.getOWLHasKeyAxiom(ce, set, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLSymmetricObjectPropertyAxiom symm() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2278);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2279);return df.getOWLSymmetricObjectPropertyAxiom(op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLTransitiveObjectPropertyAxiom trans() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2280);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2281);return df.getOWLTransitiveObjectPropertyAxiom(op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public SWRLRule rule() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2282);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2283);return df.getSWRLRule(body, head);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLSubObjectPropertyOfAxiom subObject() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2284);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2285);return df.getOWLSubObjectPropertyOfAxiom(op, df.getOWLTopObjectProperty(), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLSubDataPropertyOfAxiom subData() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2286);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2287);return df.getOWLSubDataPropertyOfAxiom(dp, df.getOWLTopDataProperty());
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLSubClassOfAxiom subClass() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2288);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2289);return df.getOWLSubClassOfAxiom(ce, df.getOWLThing(), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLSubAnnotationPropertyOfAxiom subAnn() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2290);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2291);return df.getOWLSubAnnotationPropertyOfAxiom(ap, df.getRDFSLabel(), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLSameIndividualAxiom same() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2292);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2293);return df.getOWLSameIndividualAxiom(inds, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLReflexiveObjectPropertyAxiom ref() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2294);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2295);return df.getOWLReflexiveObjectPropertyAxiom(op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLSubPropertyChainOfAxiom chain() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2296);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2297);return df.getOWLSubPropertyChainOfAxiom(new ArrayList<>(ops), op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLObjectPropertyRangeAxiom oRange() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2298);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2299);return df.getOWLObjectPropertyRangeAxiom(op, ce, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLObjectPropertyDomainAxiom oDom() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2300);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2301);return df.getOWLObjectPropertyDomainAxiom(op, ce, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLObjectPropertyAssertionAxiom opaInv() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2302);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2303);return df.getOWLObjectPropertyAssertionAxiom(df.getOWLObjectInverseOf(op), i, i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLObjectPropertyAssertionAxiom opaInvj() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2304);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2305);return df.getOWLObjectPropertyAssertionAxiom(df.getOWLObjectInverseOf(op), i, j, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLObjectPropertyAssertionAxiom opa() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2306);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2307);return df.getOWLObjectPropertyAssertionAxiom(op, i, i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLNegativeObjectPropertyAssertionAxiom nop() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2308);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2309);return df.getOWLNegativeObjectPropertyAssertionAxiom(op, i, i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLNegativeDataPropertyAssertionAxiom ndp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2310);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2311);return df.getOWLNegativeDataPropertyAssertionAxiom(dp, i, lit, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLIrreflexiveObjectPropertyAxiom irr() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2312);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2313);return df.getOWLIrreflexiveObjectPropertyAxiom(op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLInverseObjectPropertiesAxiom iop() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2314);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2315);return df.getOWLInverseObjectPropertiesAxiom(op, op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLInverseFunctionalObjectPropertyAxiom ifp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2316);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2317);return df.getOWLInverseFunctionalObjectPropertyAxiom(op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLFunctionalObjectPropertyAxiom fop() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2318);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2319);return df.getOWLFunctionalObjectPropertyAxiom(op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLFunctionalDataPropertyAxiom fdp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2320);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2321);return df.getOWLFunctionalDataPropertyAxiom(dp, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLEquivalentObjectPropertiesAxiom eOp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2322);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2323);return df.getOWLEquivalentObjectPropertiesAxiom(ops, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLEquivalentDataPropertiesAxiom eDp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2324);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2325);return df.getOWLEquivalentDataPropertiesAxiom(dps, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLEquivalentClassesAxiom ec() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2326);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2327);return df.getOWLEquivalentClassesAxiom(classes, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDisjointUnionAxiom du() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2328);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2329);return df.getOWLDisjointUnionAxiom(ce, classes, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDisjointObjectPropertiesAxiom dOp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2330);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2331);return df.getOWLDisjointObjectPropertiesAxiom(ops, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDisjointDataPropertiesAxiom dDp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2332);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2333);return df.getOWLDisjointDataPropertiesAxiom(dps, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDisjointClassesAxiom dc() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2334);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2335);return df.getOWLDisjointClassesAxiom(ce, df.getOWLClass(iri));
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDifferentIndividualsAxiom assDi() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2336);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2337);return df.getOWLDifferentIndividualsAxiom(i, df.getOWLNamedIndividual(iri));
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDeclarationAxiom decI() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2338);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2339);return df.getOWLDeclarationAxiom(i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDeclarationAxiom decAp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2340);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2341);return df.getOWLDeclarationAxiom(ap, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDeclarationAxiom decDt() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2342);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2343);return df.getOWLDeclarationAxiom(d, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDeclarationAxiom decDp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2344);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2345);return df.getOWLDeclarationAxiom(dp, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDeclarationAxiom decOp() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2346);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2347);return df.getOWLDeclarationAxiom(op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDeclarationAxiom decC() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2348);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2349);return df.getOWLDeclarationAxiom(ce, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDatatypeDefinitionAxiom dDef() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2350);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2351);return df.getOWLDatatypeDefinitionAxiom(d, df.getDoubleOWLDatatype(), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDataPropertyRangeAxiom dRange() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2352);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2353);return df.getOWLDataPropertyRangeAxiom(dp, d, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDataPropertyDomainAxiom dDom() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2354);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2355);return df.getOWLDataPropertyDomainAxiom(dp, ce, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDataPropertyAssertionAxiom assDPlain() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2356);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2357);return df.getOWLDataPropertyAssertionAxiom(dp, i, plainlit, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDataPropertyAssertionAxiom assD() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2358);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2359);return df.getOWLDataPropertyAssertionAxiom(dp, i, lit, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDataPropertyRangeAxiom dRangeRestrict() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2360);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2361);return df.getOWLDataPropertyRangeAxiom(dp, df.getOWLDatatypeMinMaxExclusiveRestriction(5.0D, 6.0D), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDataPropertyRangeAxiom dNot() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2362);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2363);return df.getOWLDataPropertyRangeAxiom(dp, df.getOWLDataComplementOf(df.getOWLDataOneOf(lit)), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDataPropertyRangeAxiom dOneOf() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2364);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2365);return df.getOWLDataPropertyRangeAxiom(dp, df.getOWLDataOneOf(lit), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assDEq() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2366);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2367);return df.getOWLClassAssertionAxiom(df.getOWLDataExactCardinality(1, dp, d), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assDMax() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2368);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2369);return df.getOWLClassAssertionAxiom(df.getOWLDataMaxCardinality(1, dp, d), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assDMin() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2370);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2371);return df.getOWLClassAssertionAxiom(df.getOWLDataMinCardinality(1, dp, d), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assDHas() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2372);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2373);return df.getOWLClassAssertionAxiom(df.getOWLDataHasValue(dp, lit), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assDAll() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2374);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2375);return df.getOWLClassAssertionAxiom(df.getOWLDataAllValuesFrom(dp, d), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assDSome() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2376);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2377);return df.getOWLClassAssertionAxiom(df.getOWLDataSomeValuesFrom(dp, d), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assOneOf() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2378);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2379);return df.getOWLClassAssertionAxiom(df.getOWLObjectOneOf(i), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assHasSelf() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2380);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2381);return df.getOWLClassAssertionAxiom(df.getOWLObjectHasSelf(op), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assEq() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2382);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2383);return df.getOWLClassAssertionAxiom(df.getOWLObjectExactCardinality(1, op, ce), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assMax() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2384);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2385);return df.getOWLClassAssertionAxiom(df.getOWLObjectMaxCardinality(1, op, ce), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assMin() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2386);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2387);return df.getOWLClassAssertionAxiom(df.getOWLObjectMinCardinality(1, op, ce), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assHas() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2388);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2389);return df.getOWLClassAssertionAxiom(df.getOWLObjectHasValue(op, i), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assAll() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2390);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2391);return df.getOWLClassAssertionAxiom(df.getOWLObjectAllValuesFrom(op, ce), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assSome() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2392);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2393);return df.getOWLClassAssertionAxiom(df.getOWLObjectSomeValuesFrom(op, ce), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assNotAnon() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2394);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2395);return df.getOWLClassAssertionAxiom(df.getOWLObjectComplementOf(ce), df.getOWLAnonymousIndividual("id"), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assNot() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2396);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2397);return df.getOWLClassAssertionAxiom(df.getOWLObjectComplementOf(ce), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDataPropertyRangeAxiom dRangeOr() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2398);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2399);return df.getOWLDataPropertyRangeAxiom(dp, df.getOWLDataUnionOf(d, df.getOWLDataOneOf(lit)), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLDataPropertyRangeAxiom dRangeAnd() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2400);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2401);return df.getOWLDataPropertyRangeAxiom(dp, df.getOWLDataIntersectionOf(d, df.getOWLDataOneOf(lit)), as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assOr() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2402);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2403);return df.getOWLClassAssertionAxiom(df.getOWLObjectUnionOf(classes), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom assAnd() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2404);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2405);return df.getOWLClassAssertionAxiom(df.getOWLObjectIntersectionOf(classes), i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLClassAssertionAxiom ass() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2406);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2407);return df.getOWLClassAssertionAxiom(ce, i, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLAnnotationPropertyRangeAxiom annRange() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2408);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2409);return df.getOWLAnnotationPropertyRangeAxiom(ap, iri, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLAnnotationPropertyDomainAxiom annDom() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2410);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2411);return df.getOWLAnnotationPropertyDomainAxiom(ap, iri, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLAsymmetricObjectPropertyAxiom asymm() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2412);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2413);return df.getOWLAsymmetricObjectPropertyAxiom(op, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLAnnotationAssertionAxiom ann() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2414);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2415);return df.getOWLAnnotationAssertionAxiom(ap, iri, lit, as);
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public OWLOntology onto() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2416);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2417);try {
            __CLR4_5_21qx1qxlvicnzei.R.inc(2418);return m.createOntology(IRI.create("urn:test#", "test"));
        } catch (OWLOntologyCreationException e) {
            __CLR4_5_21qx1qxlvicnzei.R.inc(2419);throw new RuntimeException(e);
        }
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}

    public List<OWLAxiom> all() {try{__CLR4_5_21qx1qxlvicnzei.R.inc(2420);
        __CLR4_5_21qx1qxlvicnzei.R.inc(2421);return Arrays.asList(ann(), asymm(), annDom(), annRange(), ass(), assAnd(), assOr(), dRangeAnd(), dRangeOr(),
            assNot(), assNotAnon(), assSome(), assAll(), assHas(), assMin(), assMax(), assEq(), assHasSelf(),
            assOneOf(), assDSome(), assDAll(), assDHas(), assDMin(), assDMax(), assDEq(), dOneOf(), dNot(),
            dRangeRestrict(), assD(), assDPlain(), dDom(), dRange(), dDef(), decC(), decOp(), decDp(), decDt(), decAp(),
            decI(), assDi(), dc(), dDp(), dOp(), du(), ec(), eDp(), eOp(), fdp(), fop(), ifp(), iop(), irr(), ndp(),
            nop(), opa(), opaInv(), opaInvj(), oDom(), oRange(), chain(), ref(), same(), subAnn(), subClass(),
            subData(), subObject(), rule(), symm(), trans(), hasKey(), bigRule());
    }finally{__CLR4_5_21qx1qxlvicnzei.R.flushNeeded();}}
}
