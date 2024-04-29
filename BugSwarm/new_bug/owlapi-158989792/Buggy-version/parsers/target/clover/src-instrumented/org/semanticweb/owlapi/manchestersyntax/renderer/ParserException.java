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
package org.semanticweb.owlapi.manchestersyntax.renderer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.util.CollectionFactory;

/**
 * The Class ParserException.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.2.0
 */
public class ParserException extends OWLParserException {public static class __CLR4_5_2le2le2lvicmbzj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,27826,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    /** The current token. */
    private String currentToken;
    /** The line number. */
    private final int lineNumber;
    /** The column number. */
    private final int columnNumber;
    /** The token sequence. */
    private final List<String> tokenSequence;
    /** The class name expected. */
    private boolean classNameExpected = false;
    /** The object property name expected. */
    private boolean objectPropertyNameExpected = false;
    /** The data property name expected. */
    private boolean dataPropertyNameExpected = false;
    /** The individual name expected. */
    private boolean individualNameExpected = false;
    /** The datatype name expected. */
    private boolean datatypeNameExpected = false;
    /** The integer expected. */
    private boolean integerExpected = false;
    /** The annotation property expected. */
    private boolean annotationPropertyExpected = false;
    /** The ontology name expected. */
    private boolean ontologyNameExpected = false;
    /** The expected keywords. */
    private final Set<String> expectedKeywords = new LinkedHashSet<>();
    /** The start pos. */
    private final int startPos;

    /**
     * Instantiates a new parser exception.
     * 
     * @param tokenSequence
     *        the token sequence
     * @param startPos
     *        the start pos
     * @param lineNumber
     *        the line number
     * @param columnNumber
     *        the column number
     * @param ontologyNameExpected
     *        the ontology name expected
     * @param classNameExpected
     *        the class name expected
     * @param objectPropertyNameExpected
     *        the object property name expected
     * @param dataPropertyNameExpected
     *        the data property name expected
     * @param individualNameExpected
     *        the individual name expected
     * @param datatypeNameExpected
     *        the datatype name expected
     * @param annotationPropertyExpected
     *        the annotation property expected
     * @param integerExpected
     *        the integer expected
     * @param expectedKeywords
     *        the expected keywords
     */
    public ParserException(List<String> tokenSequence, int startPos,
            int lineNumber, int columnNumber, boolean ontologyNameExpected,
            boolean classNameExpected, boolean objectPropertyNameExpected,
            boolean dataPropertyNameExpected, boolean individualNameExpected,
            boolean datatypeNameExpected, boolean annotationPropertyExpected,
            boolean integerExpected, Set<String> expectedKeywords) {
        this(tokenSequence, startPos, lineNumber, columnNumber,
                classNameExpected, objectPropertyNameExpected,
                dataPropertyNameExpected, individualNameExpected,
                datatypeNameExpected, annotationPropertyExpected,
                expectedKeywords);__CLR4_5_2le2le2lvicmbzj.R.inc(27723);try{__CLR4_5_2le2le2lvicmbzj.R.inc(27722);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27724);this.ontologyNameExpected = ontologyNameExpected;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27725);this.integerExpected = integerExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Instantiates a new parser exception.
     * 
     * @param tokenSequence
     *        the token sequence
     * @param startPos
     *        the start pos
     * @param lineNumber
     *        the line number
     * @param columnNumber
     *        the column number
     * @param classNameExpected
     *        the class name expected
     * @param objectPropertyNameExpected
     *        the object property name expected
     * @param dataPropertyNameExpected
     *        the data property name expected
     * @param individualNameExpected
     *        the individual name expected
     * @param datatypeNameExpected
     *        the datatype name expected
     * @param annotationPropertyExpected
     *        the annotation property expected
     * @param expectedKeywords
     *        the expected keywords
     */
    public ParserException(List<String> tokenSequence, int startPos,
            int lineNumber, int columnNumber, boolean classNameExpected,
            boolean objectPropertyNameExpected,
            boolean dataPropertyNameExpected, boolean individualNameExpected,
            boolean datatypeNameExpected, boolean annotationPropertyExpected,
            @Nullable Set<String> expectedKeywords) {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27726);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27727);currentToken = tokenSequence.iterator().next();
        __CLR4_5_2le2le2lvicmbzj.R.inc(27728);currentToken = tokenSequence.iterator().next();
        __CLR4_5_2le2le2lvicmbzj.R.inc(27729);this.tokenSequence = tokenSequence;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27730);this.lineNumber = lineNumber;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27731);this.columnNumber = columnNumber;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27732);this.classNameExpected = classNameExpected;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27733);this.objectPropertyNameExpected = objectPropertyNameExpected;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27734);this.dataPropertyNameExpected = dataPropertyNameExpected;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27735);this.individualNameExpected = individualNameExpected;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27736);this.datatypeNameExpected = datatypeNameExpected;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27737);this.annotationPropertyExpected = annotationPropertyExpected;
        __CLR4_5_2le2le2lvicmbzj.R.inc(27738);if ((((expectedKeywords != null)&&(__CLR4_5_2le2le2lvicmbzj.R.iget(27739)!=0|true))||(__CLR4_5_2le2le2lvicmbzj.R.iget(27740)==0&false))) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27741);this.expectedKeywords.addAll(expectedKeywords);
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27742);this.startPos = startPos;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Instantiates a new parser exception.
     * 
     * @param tokenSeqence
     *        the token seqence
     * @param startPos
     *        the start pos
     * @param lineNumber
     *        the line number
     * @param columnNumber
     *        the column number
     * @param classNameExpected
     *        the class name expected
     * @param objectPropertyNameExpected
     *        the object property name expected
     * @param dataPropertyNameExpected
     *        the data property name expected
     * @param individualNameExpected
     *        the individual name expected
     * @param datatypeNameExpected
     *        the datatype name expected
     * @param annotationPropertyExpected
     *        the annotation property expected
     * @param keywords
     *        the keywords
     */
    public ParserException(List<String> tokenSeqence, int startPos,
            int lineNumber, int columnNumber, boolean classNameExpected,
            boolean objectPropertyNameExpected,
            boolean dataPropertyNameExpected, boolean individualNameExpected,
            boolean datatypeNameExpected, boolean annotationPropertyExpected,
            @Nonnull String... keywords) {
        this(tokenSeqence, startPos, lineNumber, columnNumber,
                classNameExpected, objectPropertyNameExpected,
                dataPropertyNameExpected, individualNameExpected,
                datatypeNameExpected, annotationPropertyExpected,
                CollectionFactory.createSet(keywords));__CLR4_5_2le2le2lvicmbzj.R.inc(27744);try{__CLR4_5_2le2le2lvicmbzj.R.inc(27743);
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Instantiates a new parser exception.
     * 
     * @param tokenSequence
     *        the token sequence
     * @param lineNumber
     *        the line number
     * @param columnNumber
     *        the column number
     * @param integerExpected
     *        the integer expected
     * @param startPos
     *        the start pos
     */
    public ParserException(List<String> tokenSequence, int lineNumber,
            int columnNumber, boolean integerExpected, int startPos) {
        this(tokenSequence, startPos, lineNumber, columnNumber, false, false,
                false, false, false, false, new HashSet<String>());__CLR4_5_2le2le2lvicmbzj.R.inc(27746);try{__CLR4_5_2le2le2lvicmbzj.R.inc(27745);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27747);this.integerExpected = integerExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Instantiates a new parser exception.
     * 
     * @param tokenSequence
     *        the token sequence
     * @param startPos
     *        the start pos
     * @param lineNumber
     *        the line number
     * @param columnNumber
     *        the column number
     * @param keywords
     *        the keywords
     */
    public ParserException(List<String> tokenSequence, int startPos,
            int lineNumber, int columnNumber, @Nonnull String... keywords) {
        this(tokenSequence, startPos, lineNumber, columnNumber, false, false,
                false, false, false, false, keywords);__CLR4_5_2le2le2lvicmbzj.R.inc(27749);try{__CLR4_5_2le2le2lvicmbzj.R.inc(27748);
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * @param delegate
     *        delegate
     */
    public ParserException(ParserException delegate) {
        this(delegate.tokenSequence, delegate.startPos, delegate.lineNumber,
                delegate.columnNumber, delegate.ontologyNameExpected,
                delegate.classNameExpected,
                delegate.objectPropertyNameExpected,
                delegate.dataPropertyNameExpected,
                delegate.individualNameExpected, delegate.datatypeNameExpected,
                delegate.annotationPropertyExpected, delegate.integerExpected,
                delegate.expectedKeywords);__CLR4_5_2le2le2lvicmbzj.R.inc(27751);try{__CLR4_5_2le2le2lvicmbzj.R.inc(27750);
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Gets the token sequence.
     * 
     * @return the token sequence
     */
    public List<String> getTokenSequence() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27752);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27753);return tokenSequence;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Gets the start pos.
     * 
     * @return the start pos
     */
    public int getStartPos() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27754);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27755);return startPos;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Checks if is class name expected.
     * 
     * @return true, if is class name expected
     */
    public boolean isClassNameExpected() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27756);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27757);return classNameExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Checks if is object property name expected.
     * 
     * @return true, if is object property name expected
     */
    public boolean isObjectPropertyNameExpected() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27758);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27759);return objectPropertyNameExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Checks if is data property name expected.
     * 
     * @return true, if is data property name expected
     */
    public boolean isDataPropertyNameExpected() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27760);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27761);return dataPropertyNameExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Checks if is individual name expected.
     * 
     * @return true, if is individual name expected
     */
    public boolean isIndividualNameExpected() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27762);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27763);return individualNameExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Checks if is datatype name expected.
     * 
     * @return true, if is datatype name expected
     */
    public boolean isDatatypeNameExpected() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27764);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27765);return datatypeNameExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Checks if is annotation property name expected.
     * 
     * @return true, if is annotation property name expected
     */
    public boolean isAnnotationPropertyNameExpected() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27766);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27767);return annotationPropertyExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Checks if is ontology name expected.
     * 
     * @return true, if is ontology name expected
     */
    public boolean isOntologyNameExpected() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27768);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27769);return ontologyNameExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Gets the expected keywords.
     * 
     * @return the expected keywords
     */
    public Set<String> getExpectedKeywords() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27770);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27771);return expectedKeywords;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Gets the current token.
     * 
     * @return the current token
     */
    public String getCurrentToken() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27772);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27773);return currentToken;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /*
     * (non-Javadoc)
     * @see org.semanticweb.owlapi.io.OWLParserException#getLineNumber()
     */
    @Override
    public int getLineNumber() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27774);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27775);return lineNumber;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    @Override
    public int getColumnNumber() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27776);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27777);return columnNumber;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    /**
     * Checks if is integer expected.
     * 
     * @return true, if is integer expected
     */
    public boolean isIntegerExpected() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27778);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27779);return integerExpected;
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}

    @Override
    public String getMessage() {try{__CLR4_5_2le2le2lvicmbzj.R.inc(27780);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27781);StringBuilder sb = new StringBuilder();
        __CLR4_5_2le2le2lvicmbzj.R.inc(27782);sb.append("Encountered ");
        __CLR4_5_2le2le2lvicmbzj.R.inc(27783);sb.append(currentToken);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27784);sb.append(" at line ");
        __CLR4_5_2le2le2lvicmbzj.R.inc(27785);sb.append(lineNumber);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27786);sb.append(" column ");
        __CLR4_5_2le2le2lvicmbzj.R.inc(27787);sb.append(columnNumber);
        __CLR4_5_2le2le2lvicmbzj.R.inc(27788);sb.append(". Expected one of:\n");
        __CLR4_5_2le2le2lvicmbzj.R.inc(27789);if ((((ontologyNameExpected)&&(__CLR4_5_2le2le2lvicmbzj.R.iget(27790)!=0|true))||(__CLR4_5_2le2le2lvicmbzj.R.iget(27791)==0&false))) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27792);sb.append("\tOntology name\n");
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27793);if ((((classNameExpected)&&(__CLR4_5_2le2le2lvicmbzj.R.iget(27794)!=0|true))||(__CLR4_5_2le2le2lvicmbzj.R.iget(27795)==0&false))) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27796);sb.append("\tClass name\n");
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27797);if ((((objectPropertyNameExpected)&&(__CLR4_5_2le2le2lvicmbzj.R.iget(27798)!=0|true))||(__CLR4_5_2le2le2lvicmbzj.R.iget(27799)==0&false))) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27800);sb.append("\tObject property name\n");
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27801);if ((((dataPropertyNameExpected)&&(__CLR4_5_2le2le2lvicmbzj.R.iget(27802)!=0|true))||(__CLR4_5_2le2le2lvicmbzj.R.iget(27803)==0&false))) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27804);sb.append("\tData property name\n");
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27805);if ((((individualNameExpected)&&(__CLR4_5_2le2le2lvicmbzj.R.iget(27806)!=0|true))||(__CLR4_5_2le2le2lvicmbzj.R.iget(27807)==0&false))) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27808);sb.append("\tIndividual name\n");
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27809);if ((((datatypeNameExpected)&&(__CLR4_5_2le2le2lvicmbzj.R.iget(27810)!=0|true))||(__CLR4_5_2le2le2lvicmbzj.R.iget(27811)==0&false))) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27812);sb.append("\tDatatype name\n");
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27813);if ((((annotationPropertyExpected)&&(__CLR4_5_2le2le2lvicmbzj.R.iget(27814)!=0|true))||(__CLR4_5_2le2le2lvicmbzj.R.iget(27815)==0&false))) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27816);sb.append("\tAnnotation property\n");
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27817);if ((((integerExpected)&&(__CLR4_5_2le2le2lvicmbzj.R.iget(27818)!=0|true))||(__CLR4_5_2le2le2lvicmbzj.R.iget(27819)==0&false))) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27820);sb.append("\tInteger\n");
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27821);for (String kw : expectedKeywords) {{
            __CLR4_5_2le2le2lvicmbzj.R.inc(27822);sb.append('\t');
            __CLR4_5_2le2le2lvicmbzj.R.inc(27823);sb.append(kw);
            __CLR4_5_2le2le2lvicmbzj.R.inc(27824);sb.append('\n');
        }
        }__CLR4_5_2le2le2lvicmbzj.R.inc(27825);return sb.toString();
    }finally{__CLR4_5_2le2le2lvicmbzj.R.flushNeeded();}}
}
