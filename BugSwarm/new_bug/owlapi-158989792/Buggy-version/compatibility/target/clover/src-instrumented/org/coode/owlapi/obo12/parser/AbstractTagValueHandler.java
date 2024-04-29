/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.coode.owlapi.obo12.parser;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;

/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 10-Jan-2007<br>
 * <br>
 * <p/>
 * Concrete implementations of this interface allow specific behaviour for
 * processing specific tag value pairs in an OBO file to be specified.
 * <p>
 * <h3>Tag-Value Pairs (From the OBO 1.4 Guide)</h3>
 * <p/>
 * Tag-value pairs consist of a tag name, an unescaped colon, the tag value, and
 * a newline:
 * <p/>
 * &lt;tag&gt;: &lt;value&gt; {&lt;trailing modifiers&gt;} ! &lt;comment&gt; The
 * tag name is always a string. The value is always a string, but the value
 * string may require special parsing depending on the tag with which it is
 * associated.
 * <p/>
 * In general, tag-value pairs occur on a single line. Multi-line values are
 * possible using escape characters (see escape characters).
 * <p/>
 * In general, each stanza type expects a particular set of pre-defined tags.
 * However, a stanza may contain any tag. If a parser does not recognize a tag
 * name for a particular stanza, no error will be generated. This allows new
 * experimental tags to be added without breaking existing parsers. See handling
 * unrecognized tags for specifics.
 * <p/>
 * <h3>Trailing Modifiers</h3>
 * <p/>
 * Any tag-value pair may be followed by a trailing modifier. Trailing modifiers
 * have been introduced into the OBO 1.2 Specification to allow the graceful
 * addition of new features to existing tags.
 * <p/>
 * A trailing modifier has the following structure:
 * <p/>
 * {&lt;name&gt;=&lt;value&gt;, &lt;name=value&gt;, &lt;name=value&gt;} That is,
 * trailing modifiers are lists of name-value pairs.
 * <p/>
 * Parser implementations may choose to decode and/or round-trip these trailing
 * modifiers. However, this is not required. A parser may choose to ignore or
 * strip away trailing modifiers.
 * <p/>
 * For this reason, trailing modifiers should only include information that is
 * optional or experimental.
 * <p/>
 * Trailing modifiers may also occur within dbxref definitions (see dbxref
 * formatting).
 * <p/>
 * </p>
 */
interface TagValueHandler {

    /**
     * Gets the name of the tag handled by this tag value handler
     * 
     * @return The name of the tag
     */
    @Nonnull
    String getTagName();

    /**
     * Handles a tag. This is called by the OBOConsumer during parsing to handle
     * tags that match the value returned by the {@link #getTagName()} method.
     * 
     * @param currentId
     *        The id of the current frame.
     * @param value
     *        The value of the tag
     * @param qualifierBlock
     *        qualifier block
     * @param comment
     *        The hidden comment. This is made up of any characters between !
     *        and the end of line.
     */
    void handle(String currentId, @Nonnull String value, String qualifierBlock, String comment);
}

abstract class AbstractTagValueHandler implements TagValueHandler {public static class __CLR4_5_21g1glvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private String tag;
    @Nonnull
    private OBOConsumer consumer;

    public AbstractTagValueHandler(@Nonnull String tag, @Nonnull OBOConsumer consumer) {try{__CLR4_5_21g1glvicnlbu.R.inc(52);
        __CLR4_5_21g1glvicnlbu.R.inc(53);this.tag = tag;
        __CLR4_5_21g1glvicnlbu.R.inc(54);this.consumer = consumer;
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Override
    public String getTagName() {try{__CLR4_5_21g1glvicnlbu.R.inc(55);
        __CLR4_5_21g1glvicnlbu.R.inc(56);return tag;
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    public OWLOntologyManager getOWLOntologyManager() {try{__CLR4_5_21g1glvicnlbu.R.inc(57);
        __CLR4_5_21g1glvicnlbu.R.inc(58);return consumer.getOWLOntologyManager();
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    public OWLOntology getOntology() {try{__CLR4_5_21g1glvicnlbu.R.inc(59);
        __CLR4_5_21g1glvicnlbu.R.inc(60);return consumer.getOntology();
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    public void applyChange(@Nonnull OWLOntologyChange change) {try{__CLR4_5_21g1glvicnlbu.R.inc(61);
        __CLR4_5_21g1glvicnlbu.R.inc(62);consumer.getOWLOntologyManager().applyChange(change);
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    public OBOConsumer getConsumer() {try{__CLR4_5_21g1glvicnlbu.R.inc(63);
        __CLR4_5_21g1glvicnlbu.R.inc(64);return consumer;
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    public OWLDataFactory getDataFactory() {try{__CLR4_5_21g1glvicnlbu.R.inc(65);
        __CLR4_5_21g1glvicnlbu.R.inc(66);return consumer.getOWLOntologyManager().getOWLDataFactory();
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    public IRI getTagIRI(OBOVocabulary vocabulary) {try{__CLR4_5_21g1glvicnlbu.R.inc(67);
        __CLR4_5_21g1glvicnlbu.R.inc(68);return consumer.getIRIFromTagName(vocabulary.getName());
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    /**
     * Gets an IRI for a tag name. This is a helper method, which ultimately
     * calls {@link OBOConsumer#getIRIFromTagName(String)}.
     * 
     * @param tagName
     *        The tag name.
     * @return The IRI corresponding to the tag name.
     */
    @Nonnull
    public IRI getTagIRI(String tagName) {try{__CLR4_5_21g1glvicnlbu.R.inc(69);
        __CLR4_5_21g1glvicnlbu.R.inc(70);return consumer.getIRIFromTagName(tagName);
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    public IRI getIRIFromOBOId(String id) {try{__CLR4_5_21g1glvicnlbu.R.inc(71);
        __CLR4_5_21g1glvicnlbu.R.inc(72);return consumer.getIRIFromOBOId(id);
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    // public IRI getIRIFromSymbolicId(String symbolicId) {
    // return consumer.getIRIFromSymbolicId(symbolicId);
    // }
    /**
     * Gets an {@link OWLAnnotation} for a tag value pair.
     * 
     * @param tagName
     *        The tag name.
     * @param value
     *        The tag value. Note that the tag value is un-escaped and stripped
     *        of double quotes if they exist.
     * @return An {@link OWLAnnotation} that is formed by converting the tagName
     *         to an IRI and then to an {@link OWLAnnotationProperty} and the
     *         value to an {@link OWLLiteral}.
     */
    @Nonnull
    public OWLAnnotation getAnnotationForTagValuePair(String tagName, String value) {try{__CLR4_5_21g1glvicnlbu.R.inc(73);
        __CLR4_5_21g1glvicnlbu.R.inc(74);IRI tagIRI = getTagIRI(tagName);
        __CLR4_5_21g1glvicnlbu.R.inc(75);OWLDataFactory df = getDataFactory();
        __CLR4_5_21g1glvicnlbu.R.inc(76);OWLAnnotationProperty annotationProperty = df.getOWLAnnotationProperty(tagIRI);
        __CLR4_5_21g1glvicnlbu.R.inc(77);String unescapedString = getUnquotedString(value);
        __CLR4_5_21g1glvicnlbu.R.inc(78);OWLLiteral annotationValue = df.getOWLLiteral(unescapedString);
        __CLR4_5_21g1glvicnlbu.R.inc(79);return df.getOWLAnnotation(annotationProperty, annotationValue);
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    public OWLClass getClassFromId(String s) {try{__CLR4_5_21g1glvicnlbu.R.inc(80);
        __CLR4_5_21g1glvicnlbu.R.inc(81);return getDataFactory().getOWLClass(getIRIFromOBOId(s));
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    public OWLClass getCurrentClass() {try{__CLR4_5_21g1glvicnlbu.R.inc(82);
        __CLR4_5_21g1glvicnlbu.R.inc(83);return getDataFactory().getOWLClass(getIRIFromOBOId(consumer.getCurrentId()));
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    protected OWLClass getOWLClass(String id) {try{__CLR4_5_21g1glvicnlbu.R.inc(84);
        __CLR4_5_21g1glvicnlbu.R.inc(85);return getDataFactory().getOWLClass(getIRIFromOBOId(id));
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    protected OWLObjectProperty getOWLObjectProperty(String id) {try{__CLR4_5_21g1glvicnlbu.R.inc(86);
        __CLR4_5_21g1glvicnlbu.R.inc(87);return getDataFactory().getOWLObjectProperty(getIRIFromOBOId(id));
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    protected String getUnquotedString(String value) {try{__CLR4_5_21g1glvicnlbu.R.inc(88);
        __CLR4_5_21g1glvicnlbu.R.inc(89);String unquotedString;
        __CLR4_5_21g1glvicnlbu.R.inc(90);if ((((value.startsWith("\"") && value.endsWith("\""))&&(__CLR4_5_21g1glvicnlbu.R.iget(91)!=0|true))||(__CLR4_5_21g1glvicnlbu.R.iget(92)==0&false))) {{
            __CLR4_5_21g1glvicnlbu.R.inc(93);unquotedString = value.substring(1, value.length() - 1);
        } }else {{
            __CLR4_5_21g1glvicnlbu.R.inc(94);unquotedString = value;
        }
        }__CLR4_5_21g1glvicnlbu.R.inc(95);return unquotedString;
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    protected OWLClassExpression getOWLClassOrRestriction(String termList) {try{__CLR4_5_21g1glvicnlbu.R.inc(96);
        __CLR4_5_21g1glvicnlbu.R.inc(97);StringTokenizer tok = new StringTokenizer(termList, " ", false);
        __CLR4_5_21g1glvicnlbu.R.inc(98);String id0 = null;
        __CLR4_5_21g1glvicnlbu.R.inc(99);String id1 = null;
        __CLR4_5_21g1glvicnlbu.R.inc(100);id0 = tok.nextToken();
        __CLR4_5_21g1glvicnlbu.R.inc(101);if ((((tok.hasMoreTokens())&&(__CLR4_5_21g1glvicnlbu.R.iget(102)!=0|true))||(__CLR4_5_21g1glvicnlbu.R.iget(103)==0&false))) {{
            __CLR4_5_21g1glvicnlbu.R.inc(104);id1 = tok.nextToken();
        }
        }__CLR4_5_21g1glvicnlbu.R.inc(105);if ((((id1 == null)&&(__CLR4_5_21g1glvicnlbu.R.iget(106)!=0|true))||(__CLR4_5_21g1glvicnlbu.R.iget(107)==0&false))) {{
            __CLR4_5_21g1glvicnlbu.R.inc(108);return getDataFactory().getOWLClass(getIRIFromOBOId(id0));
        } }else {{
            __CLR4_5_21g1glvicnlbu.R.inc(109);IRI propertyIRI = getConsumer().getRelationIRIFromSymbolicIdOrOBOId(id0);
            __CLR4_5_21g1glvicnlbu.R.inc(110);OWLObjectProperty prop = getDataFactory().getOWLObjectProperty(propertyIRI);
            __CLR4_5_21g1glvicnlbu.R.inc(111);OWLClass filler = getDataFactory().getOWLClass(getIRIFromOBOId(id1));
            __CLR4_5_21g1glvicnlbu.R.inc(112);return getDataFactory().getOWLObjectSomeValuesFrom(prop, filler);
        }
    }}finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    @Nonnull
    protected OWLLiteral getBooleanConstant(boolean b) {try{__CLR4_5_21g1glvicnlbu.R.inc(113);
        __CLR4_5_21g1glvicnlbu.R.inc(114);return getDataFactory().getOWLLiteral(b);
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}

    protected void addAnnotation(String id, String uriID, @Nonnull OWLLiteral value) {try{__CLR4_5_21g1glvicnlbu.R.inc(115);
        __CLR4_5_21g1glvicnlbu.R.inc(116);IRI subject = getIRIFromOBOId(id);
        __CLR4_5_21g1glvicnlbu.R.inc(117);OWLAnnotationProperty annotationProperty = getDataFactory().getOWLAnnotationProperty(getIRIFromOBOId(uriID));
        __CLR4_5_21g1glvicnlbu.R.inc(118);OWLAxiom ax = getDataFactory().getOWLAnnotationAssertionAxiom(annotationProperty, subject, value);
        __CLR4_5_21g1glvicnlbu.R.inc(119);applyChange(new AddAxiom(getOntology(), ax));
    }finally{__CLR4_5_21g1glvicnlbu.R.flushNeeded();}}
}

class AltIdTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g3clvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,129,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AltIdTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.ALT_ID.getName(), consumer);__CLR4_5_21g3clvicnlbu.R.inc(121);try{__CLR4_5_21g3clvicnlbu.R.inc(120);
    }finally{__CLR4_5_21g3clvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g3clvicnlbu.R.inc(122);
        __CLR4_5_21g3clvicnlbu.R.inc(123);IRI subject = getConsumer().getCurrentEntity().getIRI();
        __CLR4_5_21g3clvicnlbu.R.inc(124);IRI annotationPropertyIRI = OBOVocabulary.ALT_ID.getIRI();
        __CLR4_5_21g3clvicnlbu.R.inc(125);OWLAnnotationProperty property = getDataFactory().getOWLAnnotationProperty(annotationPropertyIRI);
        __CLR4_5_21g3clvicnlbu.R.inc(126);IRI object = getIRIFromOBOId(value);
        __CLR4_5_21g3clvicnlbu.R.inc(127);OWLAnnotationAssertionAxiom ax = getDataFactory().getOWLAnnotationAssertionAxiom(property, subject, object);
        __CLR4_5_21g3clvicnlbu.R.inc(128);applyChange(new AddAxiom(getOntology(), ax));
    }finally{__CLR4_5_21g3clvicnlbu.R.flushNeeded();}}
}

class AsymmetricHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g3llvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public AsymmetricHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.IS_ASYMMETRIC.getName(), consumer);__CLR4_5_21g3llvicnlbu.R.inc(130);try{__CLR4_5_21g3llvicnlbu.R.inc(129);
    }finally{__CLR4_5_21g3llvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g3llvicnlbu.R.inc(131);
        __CLR4_5_21g3llvicnlbu.R.inc(132);if ((((Boolean.parseBoolean(value))&&(__CLR4_5_21g3llvicnlbu.R.iget(133)!=0|true))||(__CLR4_5_21g3llvicnlbu.R.iget(134)==0&false))) {{
            __CLR4_5_21g3llvicnlbu.R.inc(135);OWLObjectProperty prop = getOWLObjectProperty(currentId);
            __CLR4_5_21g3llvicnlbu.R.inc(136);OWLAxiom ax = getDataFactory().getOWLAsymmetricObjectPropertyAxiom(prop);
            __CLR4_5_21g3llvicnlbu.R.inc(137);applyChange(new AddAxiom(getOntology(), ax));
        } }else {{
            __CLR4_5_21g3llvicnlbu.R.inc(138);addAnnotation(currentId, OBOVocabulary.IS_ASYMMETRIC.getName(), getBooleanConstant(false));
        }
    }}finally{__CLR4_5_21g3llvicnlbu.R.flushNeeded();}}
}

class DataVersionTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g3vlvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,143,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public DataVersionTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.DATA_VERSION.getName(), consumer);__CLR4_5_21g3vlvicnlbu.R.inc(140);try{__CLR4_5_21g3vlvicnlbu.R.inc(139);
    }finally{__CLR4_5_21g3vlvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g3vlvicnlbu.R.inc(141);
        __CLR4_5_21g3vlvicnlbu.R.inc(142);getConsumer().setDataVersionTagValue(value);
    }finally{__CLR4_5_21g3vlvicnlbu.R.flushNeeded();}}
}

/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Information Management Group<br>
 * Date: 01-Sep-2008<br>
 * <br>
 * <p/>
 * OBO Namespaces are NOT like XML Namespaces. They are NOT used to form
 * abbreviations for IRIs. The description below, taken from the OBOEdit manual,
 * explains their provenance.
 * <p/>
 * <h3>OBO Namespaces and Ontology Name (OBO Syntax and Semantics Document:
 * Section 4.3)</h3>
 * <p/>
 * Note that OBO namespaces are not the same as OWL namespaces - the analog of
 * OWL namespaces are OBO ID spaces. OBO namespaces are semantics-free
 * properties of a frame that allow partitioning of an ontology into
 * sub-ontologies. For example, the GO is partitioned into 3 ontologies (3 OBO
 * namespaces, 1 OWL namespace).
 * <p/>
 * Every frame must have exactly one namespace. However, these do not need to be
 * explicitly assigned. After parsing an OBO Document, any frame without a
 * namespace is assigned the default-namespace, from the OBO Document header. If
 * this is not specified, the Parser assigns a namespace arbitrarily. It is
 * recommended this is equivalent to the URL or file path from which the
 * document was retrieved.
 * <p/>
 * Every OBODoc should have an "ontology" tag specified in the header. If this
 * is not specified, then the parser should supply a default value. This value
 * should be derived from the URL of the source of the ontology (typically using
 * http or file schemes).
 * <p/>
 * <p/>
 * <p/>
 * <p/>
 * <h3>OBO Namespaces (From the OBOEdit Manual)</h3>
 * <p/>
 * Namespaces
 * <p/>
 * OBO files are designed to be easily merged and separated. Most tools that use
 * OBO files can load many OBO files at once. If several ontologies have been
 * loaded together and saved into a single file, it would be impossible to know
 * which terms came from which file unless the origin of each term is indicated
 * somehow. Namespaces are used to solve this problem by indicating a
 * "logical ontology" to which every term, relation, instance OR relationship
 * belongs, i.e., each entity is tagged with a Namespace that indicates which
 * ontology it is part of.
 * <p/>
 * Namespaces are user-definable. Every ontology object belongs to a single
 * namespace. When terms from many ontologies have been loaded together,
 * namespaces are used to break the merged ontology back into separate files.
 */
class DefaultNamespaceTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g3zlvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,149,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public DefaultNamespaceTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.DEFAULT_NAMESPACE.getName(), consumer);__CLR4_5_21g3zlvicnlbu.R.inc(144);try{__CLR4_5_21g3zlvicnlbu.R.inc(143);
    }finally{__CLR4_5_21g3zlvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g3zlvicnlbu.R.inc(145);
        // Just register the namespace with the consumer and add it as an
        // annotation to the ontology
        __CLR4_5_21g3zlvicnlbu.R.inc(146);getConsumer().setDefaultNamespaceTagValue(value);
        // Add an annotation to the ontology
        __CLR4_5_21g3zlvicnlbu.R.inc(147);OWLAnnotation annotation = getAnnotationForTagValuePair(OBOVocabulary.DEFAULT_NAMESPACE.getName(), value);
        __CLR4_5_21g3zlvicnlbu.R.inc(148);applyChange(new AddOntologyAnnotation(getOntology(), annotation));
    }finally{__CLR4_5_21g3zlvicnlbu.R.flushNeeded();}}
}

class DefTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g45lvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,184,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Pattern PATTERN = Pattern.compile("\"([^\"]*)\"\\s*(\\[([^\\]]*)\\])?\\s*");
    private static final int QUOTED_STRING_CONTENT_GROUP = 1;
    private static final int XREF_GROUP = 3;

    public DefTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.DEF.getName(), consumer);__CLR4_5_21g45lvicnlbu.R.inc(150);try{__CLR4_5_21g45lvicnlbu.R.inc(149);
    }finally{__CLR4_5_21g45lvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g45lvicnlbu.R.inc(151);
        __CLR4_5_21g45lvicnlbu.R.inc(152);Matcher matcher = PATTERN.matcher(value);
        __CLR4_5_21g45lvicnlbu.R.inc(153);OWLDataFactory df = getDataFactory();
        __CLR4_5_21g45lvicnlbu.R.inc(154);String annotationValue;
        __CLR4_5_21g45lvicnlbu.R.inc(155);Set<OWLAnnotation> xrefAnnotations = Collections.emptySet();
        __CLR4_5_21g45lvicnlbu.R.inc(156);if ((((matcher.matches())&&(__CLR4_5_21g45lvicnlbu.R.iget(157)!=0|true))||(__CLR4_5_21g45lvicnlbu.R.iget(158)==0&false))) {{
            __CLR4_5_21g45lvicnlbu.R.inc(159);annotationValue = matcher.group(QUOTED_STRING_CONTENT_GROUP);
            __CLR4_5_21g45lvicnlbu.R.inc(160);xrefAnnotations = getXRefAnnotations(matcher);
        } }else {{
            __CLR4_5_21g45lvicnlbu.R.inc(161);annotationValue = getUnquotedString(value);
        }
        }__CLR4_5_21g45lvicnlbu.R.inc(162);IRI propertyIRI = getTagIRI(getTagName());
        __CLR4_5_21g45lvicnlbu.R.inc(163);OWLAnnotationProperty property = df.getOWLAnnotationProperty(propertyIRI);
        __CLR4_5_21g45lvicnlbu.R.inc(164);OWLEntity currentEntity = getConsumer().getCurrentEntity();
        __CLR4_5_21g45lvicnlbu.R.inc(165);OWLLiteral literal = df.getOWLLiteral(annotationValue);
        __CLR4_5_21g45lvicnlbu.R.inc(166);OWLAnnotationAssertionAxiom ax = df.getOWLAnnotationAssertionAxiom(property, currentEntity.getIRI(), literal,
            xrefAnnotations);
        __CLR4_5_21g45lvicnlbu.R.inc(167);applyChange(new AddAxiom(getOntology(), ax));
    }finally{__CLR4_5_21g45lvicnlbu.R.flushNeeded();}}

    @Nonnull
    private Set<OWLAnnotation> getXRefAnnotations(Matcher matcher) {try{__CLR4_5_21g45lvicnlbu.R.inc(168);
        __CLR4_5_21g45lvicnlbu.R.inc(169);Set<OWLAnnotation> annotations = new HashSet<>();
        __CLR4_5_21g45lvicnlbu.R.inc(170);String xrefs = matcher.group(XREF_GROUP);
        __CLR4_5_21g45lvicnlbu.R.inc(171);if ((((xrefs != null)&&(__CLR4_5_21g45lvicnlbu.R.iget(172)!=0|true))||(__CLR4_5_21g45lvicnlbu.R.iget(173)==0&false))) {{
            __CLR4_5_21g45lvicnlbu.R.inc(174);StringTokenizer tokenizer = new StringTokenizer(xrefs, ",");
            __CLR4_5_21g45lvicnlbu.R.inc(175);while ((((tokenizer.hasMoreTokens())&&(__CLR4_5_21g45lvicnlbu.R.iget(176)!=0|true))||(__CLR4_5_21g45lvicnlbu.R.iget(177)==0&false))) {{
                __CLR4_5_21g45lvicnlbu.R.inc(178);String xrefValue = tokenizer.nextToken();
                assert (((xrefValue != null)&&(__CLR4_5_21g45lvicnlbu.R.iget(179)!=0|true))||(__CLR4_5_21g45lvicnlbu.R.iget(180)==0&false));
                __CLR4_5_21g45lvicnlbu.R.inc(181);OWLAnnotation xrefAnnotation = getConsumer().parseXRef(xrefValue);
                __CLR4_5_21g45lvicnlbu.R.inc(182);annotations.add(xrefAnnotation);
            }
        }}
        }__CLR4_5_21g45lvicnlbu.R.inc(183);return annotations;
    }finally{__CLR4_5_21g45lvicnlbu.R.flushNeeded();}}
}

class DisjointFromHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g54lvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public DisjointFromHandler(@Nonnull OBOConsumer consumer) {
        super("disjoint_from", consumer);__CLR4_5_21g54lvicnlbu.R.inc(185);try{__CLR4_5_21g54lvicnlbu.R.inc(184);
    }finally{__CLR4_5_21g54lvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g54lvicnlbu.R.inc(186);
        __CLR4_5_21g54lvicnlbu.R.inc(187);OWLAxiom ax = getDataFactory().getOWLDisjointClassesAxiom(CollectionFactory.createSet(getCurrentClass(),
            getOWLClass(value)));
        __CLR4_5_21g54lvicnlbu.R.inc(188);applyChange(new AddAxiom(getOntology(), ax));
    }finally{__CLR4_5_21g54lvicnlbu.R.flushNeeded();}}
}

class DomainHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g59lvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public DomainHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.DOMAIN.getName(), consumer);__CLR4_5_21g59lvicnlbu.R.inc(190);try{__CLR4_5_21g59lvicnlbu.R.inc(189);
    }finally{__CLR4_5_21g59lvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g59lvicnlbu.R.inc(191);
        __CLR4_5_21g59lvicnlbu.R.inc(192);OWLObjectProperty prop = getOWLObjectProperty(getConsumer().getCurrentId());
        __CLR4_5_21g59lvicnlbu.R.inc(193);OWLClass cls = getOWLClass(value);
        __CLR4_5_21g59lvicnlbu.R.inc(194);applyChange(new AddAxiom(getOntology(), getDataFactory().getOWLObjectPropertyDomainAxiom(prop, cls)));
    }finally{__CLR4_5_21g59lvicnlbu.R.flushNeeded();}}
}

class IDSpaceTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g5flvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,205,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Pattern PATTERN = Pattern.compile("([^\\s]*)\\s+([^\\s]*)");
    private static final int ID_PREFIX_GROUP = 1;
    private static final int IRI_PREFIX_GROUP = 2;

    public IDSpaceTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.ID_SPACE.getName(), consumer);__CLR4_5_21g5flvicnlbu.R.inc(196);try{__CLR4_5_21g5flvicnlbu.R.inc(195);
    }finally{__CLR4_5_21g5flvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g5flvicnlbu.R.inc(197);
        __CLR4_5_21g5flvicnlbu.R.inc(198);Matcher matcher = PATTERN.matcher(value);
        __CLR4_5_21g5flvicnlbu.R.inc(199);if ((((matcher.matches())&&(__CLR4_5_21g5flvicnlbu.R.iget(200)!=0|true))||(__CLR4_5_21g5flvicnlbu.R.iget(201)==0&false))) {{
            __CLR4_5_21g5flvicnlbu.R.inc(202);String idPrefix = matcher.group(ID_PREFIX_GROUP);
            __CLR4_5_21g5flvicnlbu.R.inc(203);String iriPrefix = matcher.group(IRI_PREFIX_GROUP);
            __CLR4_5_21g5flvicnlbu.R.inc(204);getConsumer().registerIdSpace(idPrefix, iriPrefix);
        }
    }}finally{__CLR4_5_21g5flvicnlbu.R.flushNeeded();}}
}

class IDTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g5plvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,214,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public IDTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.ID.getName(), consumer);__CLR4_5_21g5plvicnlbu.R.inc(206);try{__CLR4_5_21g5plvicnlbu.R.inc(205);
    }finally{__CLR4_5_21g5plvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g5plvicnlbu.R.inc(207);
        __CLR4_5_21g5plvicnlbu.R.inc(208);getConsumer().setCurrentId(value);
        __CLR4_5_21g5plvicnlbu.R.inc(209);final OWLEntity entity = getConsumer().getCurrentEntity();
        __CLR4_5_21g5plvicnlbu.R.inc(210);if ((((entity != null)&&(__CLR4_5_21g5plvicnlbu.R.iget(211)!=0|true))||(__CLR4_5_21g5plvicnlbu.R.iget(212)==0&false))) {{
            __CLR4_5_21g5plvicnlbu.R.inc(213);applyChange(new AddAxiom(getOntology(), getDataFactory().getOWLDeclarationAxiom(entity)));
        }
    }}finally{__CLR4_5_21g5plvicnlbu.R.flushNeeded();}}
}

class IntersectionOfHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g5ylvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,218,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public IntersectionOfHandler(@Nonnull OBOConsumer consumer) {
        super("intersection_of", consumer);__CLR4_5_21g5ylvicnlbu.R.inc(215);try{__CLR4_5_21g5ylvicnlbu.R.inc(214);
    }finally{__CLR4_5_21g5ylvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g5ylvicnlbu.R.inc(216);
        __CLR4_5_21g5ylvicnlbu.R.inc(217);getConsumer().addIntersectionOfOperand(getOWLClassOrRestriction(value));
    }finally{__CLR4_5_21g5ylvicnlbu.R.flushNeeded();}}
}

class InverseHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g62lvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,223,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public InverseHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.INVERSE.getName(), consumer);__CLR4_5_21g62lvicnlbu.R.inc(219);try{__CLR4_5_21g62lvicnlbu.R.inc(218);
    }finally{__CLR4_5_21g62lvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g62lvicnlbu.R.inc(220);
        __CLR4_5_21g62lvicnlbu.R.inc(221);OWLAxiom ax = getDataFactory().getOWLInverseObjectPropertiesAxiom(getOWLObjectProperty(currentId),
            getOWLObjectProperty(value));
        __CLR4_5_21g62lvicnlbu.R.inc(222);applyChange(new AddAxiom(getOntology(), ax));
    }finally{__CLR4_5_21g62lvicnlbu.R.flushNeeded();}}
}

class IsATagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g67lvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public IsATagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.IS_A.getName(), consumer);__CLR4_5_21g67lvicnlbu.R.inc(224);try{__CLR4_5_21g67lvicnlbu.R.inc(223);
    }finally{__CLR4_5_21g67lvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g67lvicnlbu.R.inc(225);
        __CLR4_5_21g67lvicnlbu.R.inc(226);if ((((getConsumer().isTerm())&&(__CLR4_5_21g67lvicnlbu.R.iget(227)!=0|true))||(__CLR4_5_21g67lvicnlbu.R.iget(228)==0&false))) {{
            // We simply add a subclass axiom
            __CLR4_5_21g67lvicnlbu.R.inc(229);applyChange(new AddAxiom(getOntology(), getDataFactory().getOWLSubClassOfAxiom(getClassFromId(currentId),
                getClassFromId(value))));
        } }else {__CLR4_5_21g67lvicnlbu.R.inc(230);if ((((getConsumer().isTypedef())&&(__CLR4_5_21g67lvicnlbu.R.iget(231)!=0|true))||(__CLR4_5_21g67lvicnlbu.R.iget(232)==0&false))) {{
            // We simply add a sub property axiom
            __CLR4_5_21g67lvicnlbu.R.inc(233);applyChange(new AddAxiom(getOntology(), getDataFactory().getOWLSubObjectPropertyOfAxiom(
                getOWLObjectProperty(currentId), getOWLObjectProperty(value))));
        }
    }}}finally{__CLR4_5_21g67lvicnlbu.R.flushNeeded();}}
}

class IsObsoleteTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g6ilvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public IsObsoleteTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.IS_OBSOLETE.getName(), consumer);__CLR4_5_21g6ilvicnlbu.R.inc(235);try{__CLR4_5_21g6ilvicnlbu.R.inc(234);
    }finally{__CLR4_5_21g6ilvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g6ilvicnlbu.R.inc(236);
        __CLR4_5_21g6ilvicnlbu.R.inc(237);OWLDataFactory df = getDataFactory();
        __CLR4_5_21g6ilvicnlbu.R.inc(238);OWLAnnotationProperty deprecatedProperty = df.getOWLDeprecated();
        __CLR4_5_21g6ilvicnlbu.R.inc(239);OWLLiteral annotationValue = df.getOWLLiteral(true);
        __CLR4_5_21g6ilvicnlbu.R.inc(240);IRI subject = getIRIFromOBOId(currentId);
        __CLR4_5_21g6ilvicnlbu.R.inc(241);OWLAnnotationAssertionAxiom ax = df.getOWLAnnotationAssertionAxiom(deprecatedProperty, subject,
            annotationValue);
        __CLR4_5_21g6ilvicnlbu.R.inc(242);applyChange(new AddAxiom(getOntology(), ax));
    }finally{__CLR4_5_21g6ilvicnlbu.R.flushNeeded();}}
}

class NameTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g6rlvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,259,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public NameTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.NAME.getName(), consumer);__CLR4_5_21g6rlvicnlbu.R.inc(244);try{__CLR4_5_21g6rlvicnlbu.R.inc(243);
    }finally{__CLR4_5_21g6rlvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, @Nonnull String value, String qualifierBlock, String comment) {try{__CLR4_5_21g6rlvicnlbu.R.inc(245);
        // This is an annotation - but add as a label
        __CLR4_5_21g6rlvicnlbu.R.inc(246);OWLEntity ent;
        __CLR4_5_21g6rlvicnlbu.R.inc(247);if ((((getConsumer().isTerm())&&(__CLR4_5_21g6rlvicnlbu.R.iget(248)!=0|true))||(__CLR4_5_21g6rlvicnlbu.R.iget(249)==0&false))) {{
            __CLR4_5_21g6rlvicnlbu.R.inc(250);ent = getDataFactory().getOWLClass(getIRIFromOBOId(currentId));
        } }else {__CLR4_5_21g6rlvicnlbu.R.inc(251);if ((((getConsumer().isTypedef())&&(__CLR4_5_21g6rlvicnlbu.R.iget(252)!=0|true))||(__CLR4_5_21g6rlvicnlbu.R.iget(253)==0&false))) {{
            __CLR4_5_21g6rlvicnlbu.R.inc(254);ent = getDataFactory().getOWLObjectProperty(getIRIFromOBOId(currentId));
        } }else {{
            __CLR4_5_21g6rlvicnlbu.R.inc(255);ent = getDataFactory().getOWLNamedIndividual(getIRIFromOBOId(currentId));
        }
        }}__CLR4_5_21g6rlvicnlbu.R.inc(256);OWLLiteral con = getDataFactory().getOWLLiteral(value);
        __CLR4_5_21g6rlvicnlbu.R.inc(257);OWLAxiom ax = getDataFactory().getOWLAnnotationAssertionAxiom(getDataFactory().getOWLAnnotationProperty(
            OWLRDFVocabulary.RDFS_LABEL.getIRI()), ent.getIRI(), con);
        __CLR4_5_21g6rlvicnlbu.R.inc(258);applyChange(new AddAxiom(getOntology(), ax));
    }finally{__CLR4_5_21g6rlvicnlbu.R.flushNeeded();}}
}

class OntologyTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g77lvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public OntologyTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.ONTOLOGY.getName(), consumer);__CLR4_5_21g77lvicnlbu.R.inc(260);try{__CLR4_5_21g77lvicnlbu.R.inc(259);
    }finally{__CLR4_5_21g77lvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g77lvicnlbu.R.inc(261);
        __CLR4_5_21g77lvicnlbu.R.inc(262);getConsumer().setOntologyTagValue(value);
    }finally{__CLR4_5_21g77lvicnlbu.R.flushNeeded();}}
}

class PartOfTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g7blvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public PartOfTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.RELATIONSHIP.getName(), consumer);__CLR4_5_21g7blvicnlbu.R.inc(264);try{__CLR4_5_21g7blvicnlbu.R.inc(263);
    }finally{__CLR4_5_21g7blvicnlbu.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g7blvicnlbu.R.inc(265);
        __CLR4_5_21g7blvicnlbu.R.inc(266);int index = value.indexOf(' ');
        __CLR4_5_21g7blvicnlbu.R.inc(267);String propLocalName = value.substring(0, index);
        __CLR4_5_21g7blvicnlbu.R.inc(268);String val = value.substring(index + 1, value.length());
        __CLR4_5_21g7blvicnlbu.R.inc(269);OWLDataFactory df = getDataFactory();
        __CLR4_5_21g7blvicnlbu.R.inc(270);OWLObjectProperty prop = df.getOWLObjectProperty(getIRIFromOBOId(propLocalName));
        __CLR4_5_21g7blvicnlbu.R.inc(271);OWLClass filler = getClassFromId(val);
        __CLR4_5_21g7blvicnlbu.R.inc(272);OWLClassExpression desc = df.getOWLObjectSomeValuesFrom(prop, filler);
        __CLR4_5_21g7blvicnlbu.R.inc(273);OWLAxiom ax = df.getOWLSubClassOfAxiom(getCurrentClass(), desc);
        __CLR4_5_21g7blvicnlbu.R.inc(274);applyChange(new AddAxiom(getOntology(), ax));
    }finally{__CLR4_5_21g7blvicnlbu.R.flushNeeded();}}
}

class RawFrameHandler implements OBOParserHandler {public static class __CLR4_5_21g7nlvicnlbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,301,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String currentFrameType;
    private List<OBOTagValuePair> currentTagValuePairs = new ArrayList<>();
    private OBOFrame headerFrame;
    private List<OBOFrame> typeDefFrames = new ArrayList<>();
    private List<OBOFrame> nonTypeDefFrames = new ArrayList<>();

    @Override
    public void startHeader() {try{__CLR4_5_21g7nlvicnlbu.R.inc(275);
        __CLR4_5_21g7nlvicnlbu.R.inc(276);currentTagValuePairs.clear();
    }finally{__CLR4_5_21g7nlvicnlbu.R.flushNeeded();}}

    @Override
    public void endHeader() {try{__CLR4_5_21g7nlvicnlbu.R.inc(277);
        __CLR4_5_21g7nlvicnlbu.R.inc(278);headerFrame = new OBOFrame(currentTagValuePairs);
    }finally{__CLR4_5_21g7nlvicnlbu.R.flushNeeded();}}

    @Override
    public void startFrame(String frameType) {try{__CLR4_5_21g7nlvicnlbu.R.inc(279);
        __CLR4_5_21g7nlvicnlbu.R.inc(280);currentFrameType = frameType;
        __CLR4_5_21g7nlvicnlbu.R.inc(281);currentTagValuePairs.clear();
    }finally{__CLR4_5_21g7nlvicnlbu.R.flushNeeded();}}

    @Override
    public void endFrame() {try{__CLR4_5_21g7nlvicnlbu.R.inc(282);
        __CLR4_5_21g7nlvicnlbu.R.inc(283);storeCurrentFrame();
    }finally{__CLR4_5_21g7nlvicnlbu.R.flushNeeded();}}

    private OBOFrame storeCurrentFrame() {try{__CLR4_5_21g7nlvicnlbu.R.inc(284);
        __CLR4_5_21g7nlvicnlbu.R.inc(285);OBOFrame frame = new OBOFrame(currentFrameType, currentTagValuePairs);
        __CLR4_5_21g7nlvicnlbu.R.inc(286);if ((((frame.isTypeDefFrame())&&(__CLR4_5_21g7nlvicnlbu.R.iget(287)!=0|true))||(__CLR4_5_21g7nlvicnlbu.R.iget(288)==0&false))) {{
            __CLR4_5_21g7nlvicnlbu.R.inc(289);typeDefFrames.add(frame);
        } }else {{
            __CLR4_5_21g7nlvicnlbu.R.inc(290);nonTypeDefFrames.add(frame);
        }
        }__CLR4_5_21g7nlvicnlbu.R.inc(291);return frame;
    }finally{__CLR4_5_21g7nlvicnlbu.R.flushNeeded();}}

    @Override
    public void handleTagValue(String tag, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g7nlvicnlbu.R.inc(292);
        __CLR4_5_21g7nlvicnlbu.R.inc(293);OBOTagValuePair tvp = new OBOTagValuePair(tag, value, qualifierBlock, comment);
        __CLR4_5_21g7nlvicnlbu.R.inc(294);currentTagValuePairs.add(tvp);
    }finally{__CLR4_5_21g7nlvicnlbu.R.flushNeeded();}}

    /**
     * @return the header frame
     */
    public OBOFrame getHeaderFrame() {try{__CLR4_5_21g7nlvicnlbu.R.inc(295);
        __CLR4_5_21g7nlvicnlbu.R.inc(296);return headerFrame;
    }finally{__CLR4_5_21g7nlvicnlbu.R.flushNeeded();}}

    /**
     * @return the typedef frames
     */
    public List<OBOFrame> getTypeDefFrames() {try{__CLR4_5_21g7nlvicnlbu.R.inc(297);
        __CLR4_5_21g7nlvicnlbu.R.inc(298);return typeDefFrames;
    }finally{__CLR4_5_21g7nlvicnlbu.R.flushNeeded();}}

    /**
     * @return the non typedef frames
     */
    public List<OBOFrame> getNonTypeDefFrames() {try{__CLR4_5_21g7nlvicnlbu.R.inc(299);
        __CLR4_5_21g7nlvicnlbu.R.inc(300);return nonTypeDefFrames;
    }finally{__CLR4_5_21g7nlvicnlbu.R.flushNeeded();}}
}

class ReflexiveHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g8dlvicnlbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,311,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public ReflexiveHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.IS_REFLEXIVE.getName(), consumer);__CLR4_5_21g8dlvicnlbv.R.inc(302);try{__CLR4_5_21g8dlvicnlbv.R.inc(301);
    }finally{__CLR4_5_21g8dlvicnlbv.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g8dlvicnlbv.R.inc(303);
        __CLR4_5_21g8dlvicnlbv.R.inc(304);if ((((Boolean.parseBoolean(value))&&(__CLR4_5_21g8dlvicnlbv.R.iget(305)!=0|true))||(__CLR4_5_21g8dlvicnlbv.R.iget(306)==0&false))) {{
            __CLR4_5_21g8dlvicnlbv.R.inc(307);OWLObjectProperty prop = getOWLObjectProperty(currentId);
            __CLR4_5_21g8dlvicnlbv.R.inc(308);OWLAxiom ax = getDataFactory().getOWLReflexiveObjectPropertyAxiom(prop);
            __CLR4_5_21g8dlvicnlbv.R.inc(309);applyChange(new AddAxiom(getOntology(), ax));
        } }else {{
            __CLR4_5_21g8dlvicnlbv.R.inc(310);addAnnotation(currentId, OBOVocabulary.IS_REFLEXIVE.getName(), getBooleanConstant(false));
        }
    }}finally{__CLR4_5_21g8dlvicnlbv.R.flushNeeded();}}
}

class RelationshipTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g8nlvicnlbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Pattern tagValuePattern = Pattern.compile("([^\\s]*)\\s*([^\\s]*)\\s*(\\{([^\\}]*)\\})?");

    public RelationshipTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.RELATIONSHIP.getName(), consumer);__CLR4_5_21g8nlvicnlbv.R.inc(312);try{__CLR4_5_21g8nlvicnlbv.R.inc(311);
    }finally{__CLR4_5_21g8nlvicnlbv.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g8nlvicnlbv.R.inc(313);
        __CLR4_5_21g8nlvicnlbv.R.inc(314);Matcher matcher = tagValuePattern.matcher(value);
        __CLR4_5_21g8nlvicnlbv.R.inc(315);if ((((matcher.matches())&&(__CLR4_5_21g8nlvicnlbv.R.iget(316)!=0|true))||(__CLR4_5_21g8nlvicnlbv.R.iget(317)==0&false))) {{
            __CLR4_5_21g8nlvicnlbv.R.inc(318);IRI propIRI = getConsumer().getRelationIRIFromSymbolicIdOrOBOId(matcher.group(1));
            __CLR4_5_21g8nlvicnlbv.R.inc(319);IRI fillerIRI = getIRIFromOBOId(matcher.group(2));
            __CLR4_5_21g8nlvicnlbv.R.inc(320);OWLObjectProperty prop = getDataFactory().getOWLObjectProperty(propIRI);
            __CLR4_5_21g8nlvicnlbv.R.inc(321);OWLClass filler = getDataFactory().getOWLClass(fillerIRI);
            __CLR4_5_21g8nlvicnlbv.R.inc(322);OWLClassExpression restriction = getDataFactory().getOWLObjectSomeValuesFrom(prop, filler);
            __CLR4_5_21g8nlvicnlbv.R.inc(323);OWLClass subCls = getDataFactory().getOWLClass(getIRIFromOBOId(currentId));
            __CLR4_5_21g8nlvicnlbv.R.inc(324);applyChange(new AddAxiom(getOntology(), getDataFactory().getOWLSubClassOfAxiom(subCls, restriction)));
            __CLR4_5_21g8nlvicnlbv.R.inc(325);applyChange(new AddAxiom(getOntology(), getDataFactory().getOWLDeclarationAxiom(prop)));
        }
    }}finally{__CLR4_5_21g8nlvicnlbv.R.flushNeeded();}}
}

class SymmetricTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g92lvicnlbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,336,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public SymmetricTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.IS_SYMMETRIC.getName(), consumer);__CLR4_5_21g92lvicnlbv.R.inc(327);try{__CLR4_5_21g92lvicnlbv.R.inc(326);
    }finally{__CLR4_5_21g92lvicnlbv.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g92lvicnlbv.R.inc(328);
        __CLR4_5_21g92lvicnlbv.R.inc(329);if ((((Boolean.parseBoolean(value))&&(__CLR4_5_21g92lvicnlbv.R.iget(330)!=0|true))||(__CLR4_5_21g92lvicnlbv.R.iget(331)==0&false))) {{
            __CLR4_5_21g92lvicnlbv.R.inc(332);OWLObjectProperty prop = getOWLObjectProperty(currentId);
            __CLR4_5_21g92lvicnlbv.R.inc(333);OWLAxiom ax = getDataFactory().getOWLSymmetricObjectPropertyAxiom(prop);
            __CLR4_5_21g92lvicnlbv.R.inc(334);applyChange(new AddAxiom(getOntology(), ax));
        } }else {{
            __CLR4_5_21g92lvicnlbv.R.inc(335);addAnnotation(currentId, OBOVocabulary.IS_SYMMETRIC.getName(), getBooleanConstant(false));
        }
    }}finally{__CLR4_5_21g92lvicnlbv.R.flushNeeded();}}
}

class SynonymTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21g9clvicnlbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,405,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Nonnull
    private static final String TAG_NAME = OBOVocabulary.SYNONYM.toString();
    // synonym: "synonym" (EXACT|BROAD|NARROW|RELATED) TYPE? XRefList
    private static final Pattern valuePattern = Pattern.compile(
        "\"([^\"]*)\"\\s*([^\\s]*)\\s*([^\\[\\s]+)?\\s*\\[([^\\]]*)\\]");
    private static final int VALUE_GROUP = 1;
    private static final int SCOPE_GROUP = 2;
    private static final int SYNONYM_TYPE_GROUP = 3;
    private static final int XREF_GROUP = 4;
    @Nonnull
    public static final IRI SYNONYM_TYPE_IRI = OBOVocabulary.SYNONYM_TYPE.getIRI();
    public static final IRI XREF_IRI = OBOVocabulary.XREF.getIRI();

    public SynonymTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(TAG_NAME, consumer);__CLR4_5_21g9clvicnlbv.R.inc(337);try{__CLR4_5_21g9clvicnlbv.R.inc(336);
    }finally{__CLR4_5_21g9clvicnlbv.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21g9clvicnlbv.R.inc(338);
        __CLR4_5_21g9clvicnlbv.R.inc(339);Matcher matcher = valuePattern.matcher(value);
        __CLR4_5_21g9clvicnlbv.R.inc(340);if ((((matcher.matches())&&(__CLR4_5_21g9clvicnlbv.R.iget(341)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(342)==0&false))) {{
            __CLR4_5_21g9clvicnlbv.R.inc(343);OWLDataFactory df = getDataFactory();
            __CLR4_5_21g9clvicnlbv.R.inc(344);OWLAnnotationProperty property = getSynonymAnnotationProperty(matcher);
            __CLR4_5_21g9clvicnlbv.R.inc(345);Set<OWLAnnotation> annotations = new HashSet<>();
            __CLR4_5_21g9clvicnlbv.R.inc(346);annotations.addAll(getSynonymTypeAnnotations(matcher));
            __CLR4_5_21g9clvicnlbv.R.inc(347);annotations.addAll(getXRefAnnotations(matcher));
            __CLR4_5_21g9clvicnlbv.R.inc(348);OWLEntity subject = getConsumer().getCurrentEntity();
            __CLR4_5_21g9clvicnlbv.R.inc(349);String synonym = matcher.group(VALUE_GROUP);
            assert (((synonym != null)&&(__CLR4_5_21g9clvicnlbv.R.iget(350)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(351)==0&false));
            __CLR4_5_21g9clvicnlbv.R.inc(352);OWLLiteral synonymLiteral = df.getOWLLiteral(synonym);
            __CLR4_5_21g9clvicnlbv.R.inc(353);OWLAnnotationAssertionAxiom annoAssertion = df.getOWLAnnotationAssertionAxiom(property, subject.getIRI(),
                synonymLiteral, annotations);
            __CLR4_5_21g9clvicnlbv.R.inc(354);applyChange(new AddAxiom(getOntology(), annoAssertion));
        }
    }}finally{__CLR4_5_21g9clvicnlbv.R.flushNeeded();}}

    private Set<OWLAnnotation> getSynonymTypeAnnotations(Matcher matcher) {try{__CLR4_5_21g9clvicnlbv.R.inc(355);
        __CLR4_5_21g9clvicnlbv.R.inc(356);if ((((matcher.group(SYNONYM_TYPE_GROUP) != null)&&(__CLR4_5_21g9clvicnlbv.R.iget(357)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(358)==0&false))) {{
            __CLR4_5_21g9clvicnlbv.R.inc(359);OWLAnnotation typeAnnotation = getSynonymTypeAnnotation(matcher);
            __CLR4_5_21g9clvicnlbv.R.inc(360);return Collections.singleton(typeAnnotation);
        } }else {{
            __CLR4_5_21g9clvicnlbv.R.inc(361);return Collections.emptySet();
        }
    }}finally{__CLR4_5_21g9clvicnlbv.R.flushNeeded();}}

    private Set<OWLAnnotation> getXRefAnnotations(Matcher matcher) {try{__CLR4_5_21g9clvicnlbv.R.inc(362);
        __CLR4_5_21g9clvicnlbv.R.inc(363);Set<OWLAnnotation> annotations = new HashSet<>();
        __CLR4_5_21g9clvicnlbv.R.inc(364);String xrefs = matcher.group(XREF_GROUP);
        __CLR4_5_21g9clvicnlbv.R.inc(365);if ((((xrefs != null)&&(__CLR4_5_21g9clvicnlbv.R.iget(366)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(367)==0&false))) {{
            __CLR4_5_21g9clvicnlbv.R.inc(368);StringTokenizer tokenizer = new StringTokenizer(xrefs, ",");
            __CLR4_5_21g9clvicnlbv.R.inc(369);while ((((tokenizer.hasMoreTokens())&&(__CLR4_5_21g9clvicnlbv.R.iget(370)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(371)==0&false))) {{
                __CLR4_5_21g9clvicnlbv.R.inc(372);String xref = tokenizer.nextToken();
                assert (((xref != null)&&(__CLR4_5_21g9clvicnlbv.R.iget(373)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(374)==0&false));
                __CLR4_5_21g9clvicnlbv.R.inc(375);OWLAnnotation xrefAnnotation = getConsumer().parseXRef(xref);
                __CLR4_5_21g9clvicnlbv.R.inc(376);annotations.add(xrefAnnotation);
            }
        }}
        }__CLR4_5_21g9clvicnlbv.R.inc(377);return annotations;
    }finally{__CLR4_5_21g9clvicnlbv.R.flushNeeded();}}

    @Nonnull
    private OWLAnnotationProperty getSynonymAnnotationProperty(Matcher matcher) {try{__CLR4_5_21g9clvicnlbv.R.inc(378);
        __CLR4_5_21g9clvicnlbv.R.inc(379);String synonymScope = matcher.group(SCOPE_GROUP);
        __CLR4_5_21g9clvicnlbv.R.inc(380);IRI annotationPropertyIRI;
        __CLR4_5_21g9clvicnlbv.R.inc(381);if ((((SynonymScope.BROAD.name().equals(synonymScope))&&(__CLR4_5_21g9clvicnlbv.R.iget(382)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(383)==0&false))) {{
            __CLR4_5_21g9clvicnlbv.R.inc(384);annotationPropertyIRI = getTagIRI(OBOVocabulary.BROAD_SYNONYM);
        } }else {__CLR4_5_21g9clvicnlbv.R.inc(385);if ((((SynonymScope.EXACT.name().equals(synonymScope))&&(__CLR4_5_21g9clvicnlbv.R.iget(386)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(387)==0&false))) {{
            __CLR4_5_21g9clvicnlbv.R.inc(388);annotationPropertyIRI = getTagIRI(OBOVocabulary.EXACT_SYNONYM);
        } }else {__CLR4_5_21g9clvicnlbv.R.inc(389);if ((((SynonymScope.NARROW.name().equals(synonymScope))&&(__CLR4_5_21g9clvicnlbv.R.iget(390)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(391)==0&false))) {{
            __CLR4_5_21g9clvicnlbv.R.inc(392);annotationPropertyIRI = getTagIRI(OBOVocabulary.NARROW_SYNONYM);
        } }else {__CLR4_5_21g9clvicnlbv.R.inc(393);if ((((SynonymScope.RELATED.name().equals(synonymScope))&&(__CLR4_5_21g9clvicnlbv.R.iget(394)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(395)==0&false))) {{
            __CLR4_5_21g9clvicnlbv.R.inc(396);annotationPropertyIRI = getTagIRI(OBOVocabulary.RELATED_SYNONYM);
        } }else {{
            __CLR4_5_21g9clvicnlbv.R.inc(397);annotationPropertyIRI = getTagIRI(OBOVocabulary.SYNONYM);
        }
        }}}}__CLR4_5_21g9clvicnlbv.R.inc(398);return getDataFactory().getOWLAnnotationProperty(annotationPropertyIRI);
    }finally{__CLR4_5_21g9clvicnlbv.R.flushNeeded();}}

    private OWLAnnotation getSynonymTypeAnnotation(Matcher matcher) {try{__CLR4_5_21g9clvicnlbv.R.inc(399);
        __CLR4_5_21g9clvicnlbv.R.inc(400);OWLDataFactory df = getDataFactory();
        __CLR4_5_21g9clvicnlbv.R.inc(401);String synonymType = matcher.group(SYNONYM_TYPE_GROUP);
        assert (((synonymType != null)&&(__CLR4_5_21g9clvicnlbv.R.iget(402)!=0|true))||(__CLR4_5_21g9clvicnlbv.R.iget(403)==0&false));
        __CLR4_5_21g9clvicnlbv.R.inc(404);return df.getOWLAnnotation(df.getOWLAnnotationProperty(SYNONYM_TYPE_IRI), df.getOWLLiteral(synonymType));
    }finally{__CLR4_5_21g9clvicnlbv.R.flushNeeded();}}
}

class SynonymTypeDefTagHandler extends AbstractTagValueHandler {public static class __CLR4_5_21gb9lvicnlbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,427,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Pattern PATTERN = Pattern.compile("([^\\s]*)\\s+\"([^\"]*)\"(\\s*([^\\s]*)\\s*)?");
    private static final int ID_GROUP = 1;
    private static final int NAME_GROUP = 2;

    public SynonymTypeDefTagHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.SYNONYM_TYPE_DEF.getName(), consumer);__CLR4_5_21gb9lvicnlbv.R.inc(406);try{__CLR4_5_21gb9lvicnlbv.R.inc(405);
    }finally{__CLR4_5_21gb9lvicnlbv.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21gb9lvicnlbv.R.inc(407);
        __CLR4_5_21gb9lvicnlbv.R.inc(408);Matcher matcher = PATTERN.matcher(value);
        __CLR4_5_21gb9lvicnlbv.R.inc(409);if ((((matcher.matches())&&(__CLR4_5_21gb9lvicnlbv.R.iget(410)!=0|true))||(__CLR4_5_21gb9lvicnlbv.R.iget(411)==0&false))) {{
            __CLR4_5_21gb9lvicnlbv.R.inc(412);String id = matcher.group(ID_GROUP);
            __CLR4_5_21gb9lvicnlbv.R.inc(413);IRI annotationPropertyIRI = getIRIFromOBOId(id);
            __CLR4_5_21gb9lvicnlbv.R.inc(414);String name = matcher.group(NAME_GROUP);
            assert (((name != null)&&(__CLR4_5_21gb9lvicnlbv.R.iget(415)!=0|true))||(__CLR4_5_21gb9lvicnlbv.R.iget(416)==0&false));
            __CLR4_5_21gb9lvicnlbv.R.inc(417);OWLDataFactory df = getDataFactory();
            __CLR4_5_21gb9lvicnlbv.R.inc(418);OWLAnnotationProperty annotationProperty = df.getOWLAnnotationProperty(annotationPropertyIRI);
            __CLR4_5_21gb9lvicnlbv.R.inc(419);applyChange(new AddAxiom(getOntology(), df.getOWLDeclarationAxiom(annotationProperty)));
            __CLR4_5_21gb9lvicnlbv.R.inc(420);IRI subsetdefIRI = getTagIRI(OBOVocabulary.SUBSETDEF.getName());
            __CLR4_5_21gb9lvicnlbv.R.inc(421);OWLAnnotationProperty subsetdefAnnotationProperty = df.getOWLAnnotationProperty(subsetdefIRI);
            __CLR4_5_21gb9lvicnlbv.R.inc(422);applyChange(new AddAxiom(getOntology(), df.getOWLSubAnnotationPropertyOfAxiom(annotationProperty,
                subsetdefAnnotationProperty)));
            __CLR4_5_21gb9lvicnlbv.R.inc(423);OWLLiteral nameLiteral = df.getOWLLiteral(name);
            __CLR4_5_21gb9lvicnlbv.R.inc(424);applyChange(new AddAxiom(getOntology(), df.getOWLAnnotationAssertionAxiom(df.getRDFSLabel(),
                annotationPropertyIRI, nameLiteral)));
        } }else {{
            __CLR4_5_21gb9lvicnlbv.R.inc(425);OWLAnnotation annotation = getAnnotationForTagValuePair(OBOVocabulary.SYNONYM_TYPE_DEF.getName(), value);
            __CLR4_5_21gb9lvicnlbv.R.inc(426);applyChange(new AddOntologyAnnotation(getOntology(), annotation));
        }
        // ID QuotedString [Scope]
        // 18th April 2012
        // AnnotationProperty(T(ID))
        // SubAnnotationPropertyOf(T(ID) T(subsetdef))
        // AnnotationAssertion(T(name) T(ID) ID)
        // AnnotationAssertion(T(hasScope) T(ID) Scope)
    }}finally{__CLR4_5_21gb9lvicnlbv.R.flushNeeded();}}
}

class TransitiveOverHandler extends AbstractTagValueHandler {public static class __CLR4_5_21gbvlvicnlbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,437,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TransitiveOverHandler(@Nonnull OBOConsumer consumer) {
        super("is_transitive_over", consumer);__CLR4_5_21gbvlvicnlbv.R.inc(428);try{__CLR4_5_21gbvlvicnlbv.R.inc(427);
    }finally{__CLR4_5_21gbvlvicnlbv.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21gbvlvicnlbv.R.inc(429);
        __CLR4_5_21gbvlvicnlbv.R.inc(430);OWLObjectProperty first = getOWLObjectProperty(currentId);
        __CLR4_5_21gbvlvicnlbv.R.inc(431);OWLObjectProperty second = getOWLObjectProperty(value);
        __CLR4_5_21gbvlvicnlbv.R.inc(432);List<OWLObjectProperty> chain = new ArrayList<>();
        __CLR4_5_21gbvlvicnlbv.R.inc(433);chain.add(first);
        __CLR4_5_21gbvlvicnlbv.R.inc(434);chain.add(second);
        __CLR4_5_21gbvlvicnlbv.R.inc(435);OWLAxiom ax = getDataFactory().getOWLSubPropertyChainOfAxiom(chain, first);
        __CLR4_5_21gbvlvicnlbv.R.inc(436);applyChange(new AddAxiom(getOntology(), ax));
    }finally{__CLR4_5_21gbvlvicnlbv.R.flushNeeded();}}
}

class TransitiveTagValueHandler extends AbstractTagValueHandler {public static class __CLR4_5_21gc5lvicnlbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TransitiveTagValueHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.IS_TRANSITIVE.getName(), consumer);__CLR4_5_21gc5lvicnlbv.R.inc(438);try{__CLR4_5_21gc5lvicnlbv.R.inc(437);
    }finally{__CLR4_5_21gc5lvicnlbv.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21gc5lvicnlbv.R.inc(439);
        __CLR4_5_21gc5lvicnlbv.R.inc(440);if ((((Boolean.parseBoolean(value))&&(__CLR4_5_21gc5lvicnlbv.R.iget(441)!=0|true))||(__CLR4_5_21gc5lvicnlbv.R.iget(442)==0&false))) {{
            __CLR4_5_21gc5lvicnlbv.R.inc(443);OWLObjectProperty prop = getDataFactory().getOWLObjectProperty(getIRIFromOBOId(currentId));
            __CLR4_5_21gc5lvicnlbv.R.inc(444);OWLAxiom ax = getDataFactory().getOWLTransitiveObjectPropertyAxiom(prop);
            __CLR4_5_21gc5lvicnlbv.R.inc(445);applyChange(new AddAxiom(getOntology(), ax));
        }
    }}finally{__CLR4_5_21gc5lvicnlbv.R.flushNeeded();}}
}

class UnionOfHandler extends AbstractTagValueHandler {public static class __CLR4_5_21gcelvicnlbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,450,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public UnionOfHandler(@Nonnull OBOConsumer consumer) {
        super("union_of", consumer);__CLR4_5_21gcelvicnlbv.R.inc(447);try{__CLR4_5_21gcelvicnlbv.R.inc(446);
    }finally{__CLR4_5_21gcelvicnlbv.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21gcelvicnlbv.R.inc(448);
        __CLR4_5_21gcelvicnlbv.R.inc(449);getConsumer().addUnionOfOperand(getOWLClassOrRestriction(value));
    }finally{__CLR4_5_21gcelvicnlbv.R.flushNeeded();}}
}

class XRefTagHandler extends AbstractTagValueHandler {public static class __CLR4_5_21gcilvicnlbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0063\u006f\u006d\u0070\u0061\u0074\u0069\u0062\u0069\u006c\u0069\u0074\u0079\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237345588L,8589935092L,467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public XRefTagHandler(@Nonnull OBOConsumer consumer) {
        super(OBOVocabulary.XREF.getName(), consumer);__CLR4_5_21gcilvicnlbv.R.inc(451);try{__CLR4_5_21gcilvicnlbv.R.inc(450);
    }finally{__CLR4_5_21gcilvicnlbv.R.flushNeeded();}}

    @Override
    public void handle(String currentId, String value, String qualifierBlock, String comment) {try{__CLR4_5_21gcilvicnlbv.R.inc(452);
        __CLR4_5_21gcilvicnlbv.R.inc(453);if ((((currentId == null)&&(__CLR4_5_21gcilvicnlbv.R.iget(454)!=0|true))||(__CLR4_5_21gcilvicnlbv.R.iget(455)==0&false))) {{
            __CLR4_5_21gcilvicnlbv.R.inc(456);return;
        }
        }__CLR4_5_21gcilvicnlbv.R.inc(457);OWLAnnotation xrefAnnotation = getConsumer().parseXRef(value);
        __CLR4_5_21gcilvicnlbv.R.inc(458);IRI subject = getIRIFromOBOId(currentId);
        __CLR4_5_21gcilvicnlbv.R.inc(459);OWLAnnotationAssertionAxiom ax = getDataFactory().getOWLAnnotationAssertionAxiom(xrefAnnotation.getProperty(),
            subject, xrefAnnotation.getValue());
        __CLR4_5_21gcilvicnlbv.R.inc(460);applyChange(new AddAxiom(getOntology(), ax));
        __CLR4_5_21gcilvicnlbv.R.inc(461);if ((((getConsumer().isTypedef() && xrefAnnotation.getValue() instanceof IRI)&&(__CLR4_5_21gcilvicnlbv.R.iget(462)!=0|true))||(__CLR4_5_21gcilvicnlbv.R.iget(463)==0&false))) {{
            __CLR4_5_21gcilvicnlbv.R.inc(464);IRI xrefIRI = (IRI) xrefAnnotation.getValue();
            __CLR4_5_21gcilvicnlbv.R.inc(465);String typedefId = getConsumer().getCurrentId();
            __CLR4_5_21gcilvicnlbv.R.inc(466);getConsumer().addSymbolicIdMapping(typedefId, xrefIRI);
        }
    }}finally{__CLR4_5_21gcilvicnlbv.R.flushNeeded();}}
}
