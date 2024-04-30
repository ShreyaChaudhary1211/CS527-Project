/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.obolibrary.macro;

import static org.semanticweb.owlapi.model.parameters.Imports.EXCLUDED;
import static org.semanticweb.owlapi.search.Searcher.*;

import java.util.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.obolibrary.obo2owl.Obo2OWLConstants;
import org.obolibrary.obo2owl.Obo2OWLConstants.Obo2OWLVocabulary;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLDataVisitorExAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Empty abstract visitor for macro expansion. This class allows to minimize the
 * code in the actual visitors, as they only need to overwrite the relevant
 * methods.
 */
public abstract class AbstractMacroExpansionVisitor extends OWLDataVisitorExAdapter<OWLDataRange>implements
    OWLClassExpressionVisitorEx<OWLClassExpression>, OWLDataVisitorEx<OWLDataRange>, OWLAxiomVisitorEx<OWLAxiom> {public static class __CLR4_5_200lvicmsu1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u006f\u0062\u006f\u0066\u006f\u0072\u006d\u0061\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237308750L,8589935092L,295,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static final Logger LOG = LoggerFactory.getLogger(AbstractMacroExpansionVisitor.class);
    static final Set<OWLAnnotation> EMPTY_ANNOTATIONS = Collections.emptySet();
    final OWLDataFactory dataFactory;
    @Nonnull
    final Map<IRI, String> expandAssertionToMap;
    @Nonnull
    final Map<IRI, String> expandExpressionMap;

    /**
     * @return is expansion property
     */
    public OWLAnnotationProperty getOIO_ISEXPANSION() {try{__CLR4_5_200lvicmsu1.R.inc(0);
        __CLR4_5_200lvicmsu1.R.inc(1);return OIO_ISEXPANSION;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    final protected OWLAnnotationProperty OIO_ISEXPANSION;

    /**
     * @return expansion annotation
     */
    public OWLAnnotation getExpansionMarkerAnnotation() {try{__CLR4_5_200lvicmsu1.R.inc(2);
        __CLR4_5_200lvicmsu1.R.inc(3);return expansionMarkerAnnotation;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    final protected OWLAnnotation expansionMarkerAnnotation;
    private boolean shouldAddExpansionMarker = false;

    protected AbstractMacroExpansionVisitor(OWLOntology ontology, boolean shouldAddExpansionMarker) {
        this(ontology);__CLR4_5_200lvicmsu1.R.inc(5);try{__CLR4_5_200lvicmsu1.R.inc(4);
        __CLR4_5_200lvicmsu1.R.inc(6);this.shouldAddExpansionMarker = shouldAddExpansionMarker;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @SuppressWarnings("null")
    protected AbstractMacroExpansionVisitor(OWLOntology inputOntology) {
        super(null);__CLR4_5_200lvicmsu1.R.inc(8);try{__CLR4_5_200lvicmsu1.R.inc(7);
        __CLR4_5_200lvicmsu1.R.inc(9);dataFactory = inputOntology.getOWLOntologyManager().getOWLDataFactory();
        __CLR4_5_200lvicmsu1.R.inc(10);expandExpressionMap = new HashMap<>();
        __CLR4_5_200lvicmsu1.R.inc(11);expandAssertionToMap = new HashMap<>();
        __CLR4_5_200lvicmsu1.R.inc(12);OWLAnnotationProperty expandExpressionAP = dataFactory.getOWLAnnotationProperty(
            Obo2OWLVocabulary.IRI_IAO_0000424.getIRI());
        __CLR4_5_200lvicmsu1.R.inc(13);OWLAnnotationProperty expandAssertionAP = dataFactory.getOWLAnnotationProperty(Obo2OWLVocabulary.IRI_IAO_0000425
            .getIRI());
        __CLR4_5_200lvicmsu1.R.inc(14);OIO_ISEXPANSION = dataFactory.getOWLAnnotationProperty(IRI.create(Obo2OWLConstants.OIOVOCAB_IRI_PREFIX,
            "is_expansion"));
        __CLR4_5_200lvicmsu1.R.inc(15);expansionMarkerAnnotation = dataFactory.getOWLAnnotation(OIO_ISEXPANSION, dataFactory.getOWLLiteral(true));
        __CLR4_5_200lvicmsu1.R.inc(16);for (OWLObjectProperty p : inputOntology.getObjectPropertiesInSignature()) {{
            __CLR4_5_200lvicmsu1.R.inc(17);for (OWLOntology o : inputOntology.getImportsClosure()) {{
                __CLR4_5_200lvicmsu1.R.inc(18);for (OWLAnnotation a : annotationObjects(o.getAnnotationAssertionAxioms(p.getIRI()), expandExpressionAP)) {{
                    __CLR4_5_200lvicmsu1.R.inc(19);OWLAnnotationValue v = a.getValue();
                    __CLR4_5_200lvicmsu1.R.inc(20);if ((((v instanceof OWLLiteral)&&(__CLR4_5_200lvicmsu1.R.iget(21)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(22)==0&false))) {{
                        __CLR4_5_200lvicmsu1.R.inc(23);String str = ((OWLLiteral) v).getLiteral();
                        __CLR4_5_200lvicmsu1.R.inc(24);LOG.info("mapping {} to {}", p, str);
                        __CLR4_5_200lvicmsu1.R.inc(25);expandExpressionMap.put(p.getIRI(), str);
                    }
                }}
            }}
        }}
        }__CLR4_5_200lvicmsu1.R.inc(26);for (OWLAnnotationProperty p : inputOntology.getAnnotationPropertiesInSignature(EXCLUDED)) {{
            __CLR4_5_200lvicmsu1.R.inc(27);for (OWLOntology o : inputOntology.getImportsClosure()) {{
                __CLR4_5_200lvicmsu1.R.inc(28);for (OWLAnnotation a : annotationObjects(o.getAnnotationAssertionAxioms(p.getIRI()), expandAssertionAP)) {{
                    __CLR4_5_200lvicmsu1.R.inc(29);OWLAnnotationValue v = a.getValue();
                    __CLR4_5_200lvicmsu1.R.inc(30);if ((((v instanceof OWLLiteral)&&(__CLR4_5_200lvicmsu1.R.iget(31)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(32)==0&false))) {{
                        __CLR4_5_200lvicmsu1.R.inc(33);String str = ((OWLLiteral) v).getLiteral();
                        __CLR4_5_200lvicmsu1.R.inc(34);LOG.info("assertion mapping {} to {}", p, str);
                        __CLR4_5_200lvicmsu1.R.inc(35);expandAssertionToMap.put(p.getIRI(), str);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLObjectIntersectionOf ce) {try{__CLR4_5_200lvicmsu1.R.inc(36);
        __CLR4_5_200lvicmsu1.R.inc(37);Set<OWLClassExpression> ops = new HashSet<>();
        __CLR4_5_200lvicmsu1.R.inc(38);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_200lvicmsu1.R.inc(39);ops.add(op.accept(this));
        }
        }__CLR4_5_200lvicmsu1.R.inc(40);return dataFactory.getOWLObjectIntersectionOf(ops);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLObjectUnionOf ce) {try{__CLR4_5_200lvicmsu1.R.inc(41);
        __CLR4_5_200lvicmsu1.R.inc(42);Set<OWLClassExpression> ops = new HashSet<>();
        __CLR4_5_200lvicmsu1.R.inc(43);for (OWLClassExpression op : ce.getOperands()) {{
            __CLR4_5_200lvicmsu1.R.inc(44);ops.add(op.accept(this));
        }
        }__CLR4_5_200lvicmsu1.R.inc(45);return dataFactory.getOWLObjectUnionOf(ops);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLObjectComplementOf ce) {try{__CLR4_5_200lvicmsu1.R.inc(46);
        __CLR4_5_200lvicmsu1.R.inc(47);return dataFactory.getOWLObjectComplementOf(ce.getOperand().accept(this));
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Nonnull
    @Override
    public OWLClassExpression visit(@Nonnull OWLObjectSomeValuesFrom ce) {try{__CLR4_5_200lvicmsu1.R.inc(48);
        __CLR4_5_200lvicmsu1.R.inc(49);OWLClassExpression filler = ce.getFiller();
        __CLR4_5_200lvicmsu1.R.inc(50);OWLObjectPropertyExpression p = ce.getProperty();
        __CLR4_5_200lvicmsu1.R.inc(51);OWLClassExpression result = null;
        __CLR4_5_200lvicmsu1.R.inc(52);if ((((p instanceof OWLObjectProperty)&&(__CLR4_5_200lvicmsu1.R.iget(53)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(54)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(55);result = expandOWLObjSomeVal(filler, p);
        }
        }__CLR4_5_200lvicmsu1.R.inc(56);if ((((result == null)&&(__CLR4_5_200lvicmsu1.R.iget(57)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(58)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(59);result = dataFactory.getOWLObjectSomeValuesFrom(ce.getProperty(), filler.accept(this));
        }
        }__CLR4_5_200lvicmsu1.R.inc(60);return result;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Nullable
    protected abstract OWLClassExpression expandOWLObjSomeVal(@Nonnull OWLClassExpression filler,
        @Nonnull OWLObjectPropertyExpression p);

    @Nonnull
    @Override
    public OWLClassExpression visit(@Nonnull OWLObjectHasValue ce) {try{__CLR4_5_200lvicmsu1.R.inc(61);
        __CLR4_5_200lvicmsu1.R.inc(62);OWLClassExpression result = null;
        __CLR4_5_200lvicmsu1.R.inc(63);OWLIndividual filler = ce.getFiller();
        __CLR4_5_200lvicmsu1.R.inc(64);OWLObjectPropertyExpression p = ce.getProperty();
        __CLR4_5_200lvicmsu1.R.inc(65);if ((((p instanceof OWLObjectProperty)&&(__CLR4_5_200lvicmsu1.R.iget(66)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(67)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(68);result = expandOWLObjHasVal(ce, filler, p);
        }
        }__CLR4_5_200lvicmsu1.R.inc(69);if ((((result == null)&&(__CLR4_5_200lvicmsu1.R.iget(70)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(71)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(72);result = dataFactory.getOWLObjectHasValue(ce.getProperty(), filler);
        }
        }__CLR4_5_200lvicmsu1.R.inc(73);return result;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Nullable
    protected abstract OWLClassExpression expandOWLObjHasVal(@Nonnull OWLObjectHasValue desc,
        @Nonnull OWLIndividual filler, @Nonnull OWLObjectPropertyExpression p);

    @Override
    public OWLClassExpression visit(@Nonnull OWLObjectAllValuesFrom ce) {try{__CLR4_5_200lvicmsu1.R.inc(74);
        __CLR4_5_200lvicmsu1.R.inc(75);return ce.getFiller().accept(this);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLObjectMinCardinality ce) {try{__CLR4_5_200lvicmsu1.R.inc(76);
        __CLR4_5_200lvicmsu1.R.inc(77);OWLClassExpression filler = ce.getFiller().accept(this);
        __CLR4_5_200lvicmsu1.R.inc(78);return dataFactory.getOWLObjectMinCardinality(ce.getCardinality(), ce.getProperty(), filler);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLObjectExactCardinality ce) {try{__CLR4_5_200lvicmsu1.R.inc(79);
        __CLR4_5_200lvicmsu1.R.inc(80);return ce.asIntersectionOfMinMax().accept(this);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLObjectMaxCardinality ce) {try{__CLR4_5_200lvicmsu1.R.inc(81);
        __CLR4_5_200lvicmsu1.R.inc(82);OWLClassExpression filler = ce.getFiller().accept(this);
        __CLR4_5_200lvicmsu1.R.inc(83);return dataFactory.getOWLObjectMaxCardinality(ce.getCardinality(), ce.getProperty(), filler);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLDataSomeValuesFrom ce) {try{__CLR4_5_200lvicmsu1.R.inc(84);
        __CLR4_5_200lvicmsu1.R.inc(85);OWLDataRange filler = ce.getFiller().accept(this);
        __CLR4_5_200lvicmsu1.R.inc(86);return dataFactory.getOWLDataSomeValuesFrom(ce.getProperty(), filler);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLDataAllValuesFrom ce) {try{__CLR4_5_200lvicmsu1.R.inc(87);
        __CLR4_5_200lvicmsu1.R.inc(88);OWLDataRange filler = ce.getFiller().accept(this);
        __CLR4_5_200lvicmsu1.R.inc(89);return dataFactory.getOWLDataAllValuesFrom(ce.getProperty(), filler);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLDataHasValue ce) {try{__CLR4_5_200lvicmsu1.R.inc(90);
        __CLR4_5_200lvicmsu1.R.inc(91);return ce.asSomeValuesFrom().accept(this);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLDataExactCardinality ce) {try{__CLR4_5_200lvicmsu1.R.inc(92);
        __CLR4_5_200lvicmsu1.R.inc(93);return ce.asIntersectionOfMinMax().accept(this);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLDataMaxCardinality ce) {try{__CLR4_5_200lvicmsu1.R.inc(94);
        __CLR4_5_200lvicmsu1.R.inc(95);int card = ce.getCardinality();
        __CLR4_5_200lvicmsu1.R.inc(96);OWLDataRange filler = ce.getFiller().accept(this);
        __CLR4_5_200lvicmsu1.R.inc(97);return dataFactory.getOWLDataMaxCardinality(card, ce.getProperty(), filler);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(@Nonnull OWLDataMinCardinality ce) {try{__CLR4_5_200lvicmsu1.R.inc(98);
        __CLR4_5_200lvicmsu1.R.inc(99);int card = ce.getCardinality();
        __CLR4_5_200lvicmsu1.R.inc(100);OWLDataRange filler = ce.getFiller().accept(this);
        __CLR4_5_200lvicmsu1.R.inc(101);return dataFactory.getOWLDataMinCardinality(card, ce.getProperty(), filler);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(@Nonnull OWLDataOneOf node) {try{__CLR4_5_200lvicmsu1.R.inc(102);
        // Encode as a data union of and return result
        __CLR4_5_200lvicmsu1.R.inc(103);Set<OWLDataOneOf> oneOfs = new HashSet<>();
        __CLR4_5_200lvicmsu1.R.inc(104);for (OWLLiteral lit : node.getValues()) {{
            __CLR4_5_200lvicmsu1.R.inc(105);oneOfs.add(dataFactory.getOWLDataOneOf(lit));
        }
        }__CLR4_5_200lvicmsu1.R.inc(106);return dataFactory.getOWLDataUnionOf(oneOfs).accept(this);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(@Nonnull OWLDataIntersectionOf node) {try{__CLR4_5_200lvicmsu1.R.inc(107);
        __CLR4_5_200lvicmsu1.R.inc(108);Set<OWLDataRange> ops = new HashSet<>();
        __CLR4_5_200lvicmsu1.R.inc(109);for (OWLDataRange op : node.getOperands()) {{
            __CLR4_5_200lvicmsu1.R.inc(110);ops.add(op.accept(this));
        }
        }__CLR4_5_200lvicmsu1.R.inc(111);return dataFactory.getOWLDataIntersectionOf(ops);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(@Nonnull OWLDataUnionOf node) {try{__CLR4_5_200lvicmsu1.R.inc(112);
        __CLR4_5_200lvicmsu1.R.inc(113);Set<OWLDataRange> ops = new HashSet<>();
        __CLR4_5_200lvicmsu1.R.inc(114);for (OWLDataRange op : node.getOperands()) {{
            __CLR4_5_200lvicmsu1.R.inc(115);ops.add(op.accept(this));
        }
        }__CLR4_5_200lvicmsu1.R.inc(116);return dataFactory.getOWLDataUnionOf(ops);
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    // Conversion of non-class expressions to MacroExpansionVisitor
    @Override
    public OWLAxiom visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(117);
        __CLR4_5_200lvicmsu1.R.inc(118);OWLClassExpression subClass = axiom.getSubClass();
        __CLR4_5_200lvicmsu1.R.inc(119);OWLClassExpression newSubclass = subClass.accept(this);
        __CLR4_5_200lvicmsu1.R.inc(120);OWLClassExpression superClass = axiom.getSuperClass();
        __CLR4_5_200lvicmsu1.R.inc(121);OWLClassExpression newSuperclass = superClass.accept(this);
        __CLR4_5_200lvicmsu1.R.inc(122);if ((((subClass.equals(newSubclass) && superClass.equals(newSuperclass))&&(__CLR4_5_200lvicmsu1.R.iget(123)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(124)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(125);return axiom;
        } }else {{
            __CLR4_5_200lvicmsu1.R.inc(126);return dataFactory.getOWLSubClassOfAxiom(newSubclass, newSuperclass,
                getAnnotationsWithOptionalExpansionMarker(axiom));
        }
    }}finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    /**
     * @param axiom
     *        axiom providing annotations
     * @return annotations
     */
    @Nonnull
    public Set<OWLAnnotation> getAnnotationsWithOptionalExpansionMarker(OWLAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(127);
        __CLR4_5_200lvicmsu1.R.inc(128);if ((((shouldAddExpansionMarker)&&(__CLR4_5_200lvicmsu1.R.iget(129)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(130)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(131);Set<OWLAnnotation> annotations = new LinkedHashSet<>(axiom.getAnnotations());
            __CLR4_5_200lvicmsu1.R.inc(132);annotations.add(expansionMarkerAnnotation);
            __CLR4_5_200lvicmsu1.R.inc(133);return annotations;
        } }else {{
            __CLR4_5_200lvicmsu1.R.inc(134);return axiom.getAnnotations();
        }
    }}finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(135);
        __CLR4_5_200lvicmsu1.R.inc(136);Set<OWLClassExpression> ops = new HashSet<>();
        __CLR4_5_200lvicmsu1.R.inc(137);boolean sawChange = false;
        __CLR4_5_200lvicmsu1.R.inc(138);for (OWLClassExpression op : axiom.getClassExpressions()) {{
            __CLR4_5_200lvicmsu1.R.inc(139);OWLClassExpression newOp = op.accept(this);
            __CLR4_5_200lvicmsu1.R.inc(140);ops.add(newOp);
            __CLR4_5_200lvicmsu1.R.inc(141);if ((((!op.equals(newOp))&&(__CLR4_5_200lvicmsu1.R.iget(142)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(143)==0&false))) {{
                __CLR4_5_200lvicmsu1.R.inc(144);sawChange = true;
            }
        }}
        }__CLR4_5_200lvicmsu1.R.inc(145);if ((((sawChange)&&(__CLR4_5_200lvicmsu1.R.iget(146)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(147)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(148);return dataFactory.getOWLDisjointClassesAxiom(ops, getAnnotationsWithOptionalExpansionMarker(axiom));
        } }else {{
            __CLR4_5_200lvicmsu1.R.inc(149);return axiom;
        }
    }}finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(150);
        __CLR4_5_200lvicmsu1.R.inc(151);Set<OWLClassExpression> newOps = new HashSet<>();
        __CLR4_5_200lvicmsu1.R.inc(152);boolean sawChange = false;
        __CLR4_5_200lvicmsu1.R.inc(153);for (OWLClassExpression op : axiom.getClassExpressions()) {{
            __CLR4_5_200lvicmsu1.R.inc(154);OWLClassExpression newOp = op.accept(this);
            __CLR4_5_200lvicmsu1.R.inc(155);newOps.add(newOp);
            __CLR4_5_200lvicmsu1.R.inc(156);if ((((!op.equals(newOp))&&(__CLR4_5_200lvicmsu1.R.iget(157)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(158)==0&false))) {{
                __CLR4_5_200lvicmsu1.R.inc(159);sawChange = true;
            }
        }}
        }__CLR4_5_200lvicmsu1.R.inc(160);if ((((!sawChange)&&(__CLR4_5_200lvicmsu1.R.iget(161)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(162)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(163);return axiom;
        }
        }__CLR4_5_200lvicmsu1.R.inc(164);return dataFactory.getOWLDisjointUnionAxiom(axiom.getOWLClass(), newOps,
            getAnnotationsWithOptionalExpansionMarker(axiom));
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(165);
        __CLR4_5_200lvicmsu1.R.inc(166);OWLClassExpression domain = axiom.getDomain();
        __CLR4_5_200lvicmsu1.R.inc(167);OWLClassExpression newDomain = domain.accept(this);
        __CLR4_5_200lvicmsu1.R.inc(168);if ((((domain.equals(newDomain))&&(__CLR4_5_200lvicmsu1.R.iget(169)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(170)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(171);return axiom;
        } }else {{
            __CLR4_5_200lvicmsu1.R.inc(172);return dataFactory.getOWLDataPropertyDomainAxiom(axiom.getProperty(), newDomain,
                getAnnotationsWithOptionalExpansionMarker(axiom));
        }
    }}finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(173);
        __CLR4_5_200lvicmsu1.R.inc(174);OWLClassExpression domain = axiom.getDomain();
        __CLR4_5_200lvicmsu1.R.inc(175);OWLClassExpression newDomain = domain.accept(this);
        __CLR4_5_200lvicmsu1.R.inc(176);if ((((domain.equals(newDomain))&&(__CLR4_5_200lvicmsu1.R.iget(177)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(178)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(179);return axiom;
        } }else {{
            __CLR4_5_200lvicmsu1.R.inc(180);return dataFactory.getOWLObjectPropertyDomainAxiom(axiom.getProperty(), newDomain,
                getAnnotationsWithOptionalExpansionMarker(axiom));
        }
    }}finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(181);
        __CLR4_5_200lvicmsu1.R.inc(182);OWLClassExpression range = axiom.getRange();
        __CLR4_5_200lvicmsu1.R.inc(183);OWLClassExpression newRange = range.accept(this);
        __CLR4_5_200lvicmsu1.R.inc(184);if ((((range.equals(newRange))&&(__CLR4_5_200lvicmsu1.R.iget(185)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(186)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(187);return axiom;
        } }else {{
            __CLR4_5_200lvicmsu1.R.inc(188);return dataFactory.getOWLObjectPropertyRangeAxiom(axiom.getProperty(), newRange,
                getAnnotationsWithOptionalExpansionMarker(axiom));
        }
    }}finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(189);
        __CLR4_5_200lvicmsu1.R.inc(190);OWLDataRange range = axiom.getRange();
        __CLR4_5_200lvicmsu1.R.inc(191);OWLDataRange newRange = range.accept(this);
        __CLR4_5_200lvicmsu1.R.inc(192);if ((((range.equals(newRange))&&(__CLR4_5_200lvicmsu1.R.iget(193)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(194)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(195);return axiom;
        } }else {{
            __CLR4_5_200lvicmsu1.R.inc(196);return dataFactory.getOWLDataPropertyRangeAxiom(axiom.getProperty(), newRange,
                getAnnotationsWithOptionalExpansionMarker(axiom));
        }
    }}finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(197);
        __CLR4_5_200lvicmsu1.R.inc(198);OWLClassExpression classExpression = axiom.getClassExpression();
        __CLR4_5_200lvicmsu1.R.inc(199);if ((((classExpression.isAnonymous())&&(__CLR4_5_200lvicmsu1.R.iget(200)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(201)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(202);OWLClassExpression newClassExpression = classExpression.accept(this);
            __CLR4_5_200lvicmsu1.R.inc(203);if ((((!classExpression.equals(newClassExpression))&&(__CLR4_5_200lvicmsu1.R.iget(204)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(205)==0&false))) {{
                __CLR4_5_200lvicmsu1.R.inc(206);return dataFactory.getOWLClassAssertionAxiom(newClassExpression, axiom.getIndividual(),
                    getAnnotationsWithOptionalExpansionMarker(axiom));
            }
        }}
        }__CLR4_5_200lvicmsu1.R.inc(207);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(208);
        __CLR4_5_200lvicmsu1.R.inc(209);Set<OWLClassExpression> newExpressions = new HashSet<>();
        __CLR4_5_200lvicmsu1.R.inc(210);boolean sawChange = false;
        __CLR4_5_200lvicmsu1.R.inc(211);for (OWLClassExpression expression : axiom.getClassExpressions()) {{
            __CLR4_5_200lvicmsu1.R.inc(212);OWLClassExpression newExpression = expression.accept(this);
            __CLR4_5_200lvicmsu1.R.inc(213);newExpressions.add(newExpression);
            __CLR4_5_200lvicmsu1.R.inc(214);if ((((!expression.equals(newExpression))&&(__CLR4_5_200lvicmsu1.R.iget(215)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(216)==0&false))) {{
                __CLR4_5_200lvicmsu1.R.inc(217);sawChange = true;
            }
        }}
        }__CLR4_5_200lvicmsu1.R.inc(218);if ((((sawChange)&&(__CLR4_5_200lvicmsu1.R.iget(219)!=0|true))||(__CLR4_5_200lvicmsu1.R.iget(220)==0&false))) {{
            __CLR4_5_200lvicmsu1.R.inc(221);return dataFactory.getOWLEquivalentClassesAxiom(newExpressions, getAnnotationsWithOptionalExpansionMarker(
                axiom));
        } }else {{
            __CLR4_5_200lvicmsu1.R.inc(222);return axiom;
        }
    }}finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLClass ce) {try{__CLR4_5_200lvicmsu1.R.inc(223);
        __CLR4_5_200lvicmsu1.R.inc(224);return ce;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectHasSelf ce) {try{__CLR4_5_200lvicmsu1.R.inc(225);
        __CLR4_5_200lvicmsu1.R.inc(226);return ce;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLClassExpression visit(OWLObjectOneOf ce) {try{__CLR4_5_200lvicmsu1.R.inc(227);
        __CLR4_5_200lvicmsu1.R.inc(228);return ce;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(OWLDatatype node) {try{__CLR4_5_200lvicmsu1.R.inc(229);
        __CLR4_5_200lvicmsu1.R.inc(230);return node;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(OWLDataComplementOf node) {try{__CLR4_5_200lvicmsu1.R.inc(231);
        __CLR4_5_200lvicmsu1.R.inc(232);return node;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLHasKeyAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(233);
        __CLR4_5_200lvicmsu1.R.inc(234);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLDataRange visit(OWLDatatypeRestriction node) {try{__CLR4_5_200lvicmsu1.R.inc(235);
        __CLR4_5_200lvicmsu1.R.inc(236);return node;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(237);
        __CLR4_5_200lvicmsu1.R.inc(238);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(239);
        __CLR4_5_200lvicmsu1.R.inc(240);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(241);
        __CLR4_5_200lvicmsu1.R.inc(242);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(243);
        __CLR4_5_200lvicmsu1.R.inc(244);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(245);
        __CLR4_5_200lvicmsu1.R.inc(246);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(247);
        __CLR4_5_200lvicmsu1.R.inc(248);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(249);
        __CLR4_5_200lvicmsu1.R.inc(250);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(251);
        __CLR4_5_200lvicmsu1.R.inc(252);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(253);
        __CLR4_5_200lvicmsu1.R.inc(254);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(255);
        __CLR4_5_200lvicmsu1.R.inc(256);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(257);
        __CLR4_5_200lvicmsu1.R.inc(258);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDeclarationAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(259);
        __CLR4_5_200lvicmsu1.R.inc(260);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(261);
        __CLR4_5_200lvicmsu1.R.inc(262);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(263);
        __CLR4_5_200lvicmsu1.R.inc(264);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(265);
        __CLR4_5_200lvicmsu1.R.inc(266);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(267);
        __CLR4_5_200lvicmsu1.R.inc(268);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(269);
        __CLR4_5_200lvicmsu1.R.inc(270);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(271);
        __CLR4_5_200lvicmsu1.R.inc(272);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(273);
        __CLR4_5_200lvicmsu1.R.inc(274);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(275);
        __CLR4_5_200lvicmsu1.R.inc(276);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(277);
        __CLR4_5_200lvicmsu1.R.inc(278);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSameIndividualAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(279);
        __CLR4_5_200lvicmsu1.R.inc(280);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(281);
        __CLR4_5_200lvicmsu1.R.inc(282);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(283);
        __CLR4_5_200lvicmsu1.R.inc(284);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(SWRLRule rule) {try{__CLR4_5_200lvicmsu1.R.inc(285);
        __CLR4_5_200lvicmsu1.R.inc(286);return rule;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(287);
        __CLR4_5_200lvicmsu1.R.inc(288);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(289);
        __CLR4_5_200lvicmsu1.R.inc(290);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(291);
        __CLR4_5_200lvicmsu1.R.inc(292);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}

    @Override
    public OWLAxiom visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_200lvicmsu1.R.inc(293);
        __CLR4_5_200lvicmsu1.R.inc(294);return axiom;
    }finally{__CLR4_5_200lvicmsu1.R.flushNeeded();}}
}
