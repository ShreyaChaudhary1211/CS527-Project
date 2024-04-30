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

import static org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax.*;
import static org.semanticweb.owlapi.util.CollectionFactory.sortOptionally;

import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.manchestersyntax.parser.ManchesterOWLSyntax;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.CollectionFactory;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.vocab.SWRLBuiltInsVocabulary;
import org.semanticweb.owlapi.vocab.XSDVocabulary;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class ManchesterOWLSyntaxObjectRenderer extends AbstractRenderer
    implements OWLObjectVisitor {public static class __CLR4_5_2kupkuplvicmbym{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0070\u0061\u0072\u0073\u0065\u0072\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237279647L,8589935092L,27678,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * @param writer
     *        writer
     * @param entityShortFormProvider
     *        entityShortFormProvider
     */
    public ManchesterOWLSyntaxObjectRenderer(Writer writer,
        ShortFormProvider entityShortFormProvider) {
        super(writer, entityShortFormProvider);__CLR4_5_2kupkuplvicmbym.R.inc(27026);try{__CLR4_5_2kupkuplvicmbym.R.inc(27025);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Nonnull
    protected static <T extends OWLObject> List<T> sort(
        @Nonnull Collection<T> objects) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27027);
        __CLR4_5_2kupkuplvicmbym.R.inc(27028);return CollectionFactory.sortOptionally(objects);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    protected void write(@Nonnull Set<? extends OWLObject> objects,
        @Nonnull ManchesterOWLSyntax delimeter, boolean newline) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27029);
        __CLR4_5_2kupkuplvicmbym.R.inc(27030);int tab = getIndent();
        __CLR4_5_2kupkuplvicmbym.R.inc(27031);pushTab(tab);
        __CLR4_5_2kupkuplvicmbym.R.inc(27032);for (Iterator<? extends OWLObject> it = sort(objects).iterator(); (((it
            .hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27033)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27034)==0&false));) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27035);it.next().accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27036);if ((((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27037)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27038)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27039);if ((((newline && isUseWrapping())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27040)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27041)==0&false))) {{
                    __CLR4_5_2kupkuplvicmbym.R.inc(27042);writeNewLine();
                }
                }__CLR4_5_2kupkuplvicmbym.R.inc(27043);write(delimeter);
            }
        }}
        }__CLR4_5_2kupkuplvicmbym.R.inc(27044);popTab();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    protected void writeCommaSeparatedList(
        @Nonnull Set<? extends OWLObject> objects) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27045);
        __CLR4_5_2kupkuplvicmbym.R.inc(27046);for (Iterator<? extends OWLObject> it = sort(objects).iterator(); (((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27047)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27048)==0&false));) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27049);it.next().accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27050);if ((((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27051)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27052)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27053);write(", ");
            }
        }}
    }}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    protected void write(@Nonnull Set<? extends OWLClassExpression> objects,
        boolean newline) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27054);
        __CLR4_5_2kupkuplvicmbym.R.inc(27055);boolean first = true;
        __CLR4_5_2kupkuplvicmbym.R.inc(27056);for (Iterator<? extends OWLObject> it = sort(objects).iterator(); (((it
            .hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27057)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27058)==0&false));) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27059);OWLObject desc = it.next();
            __CLR4_5_2kupkuplvicmbym.R.inc(27060);if ((((!first)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27061)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27062)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27063);if ((((newline && isUseWrapping())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27064)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27065)==0&false))) {{
                    __CLR4_5_2kupkuplvicmbym.R.inc(27066);writeNewLine();
                }
                }__CLR4_5_2kupkuplvicmbym.R.inc(27067);write(" ", AND, " ");
            }
            }__CLR4_5_2kupkuplvicmbym.R.inc(27068);first = false;
            __CLR4_5_2kupkuplvicmbym.R.inc(27069);if ((((desc instanceof OWLAnonymousClassExpression)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27070)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27071)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27072);write("(");
            }
            }__CLR4_5_2kupkuplvicmbym.R.inc(27073);desc.accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27074);if ((((desc instanceof OWLAnonymousClassExpression)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27075)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27076)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27077);write(")");
            }
        }}
    }}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    private void writeRestriction(
        @Nonnull OWLQuantifiedDataRestriction restriction,
        @Nonnull ManchesterOWLSyntax keyword) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27078);
        __CLR4_5_2kupkuplvicmbym.R.inc(27079);restriction.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27080);write(keyword);
        __CLR4_5_2kupkuplvicmbym.R.inc(27081);restriction.getFiller().accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    private void writeRestriction(
        @Nonnull OWLQuantifiedObjectRestriction restriction,
        @Nonnull ManchesterOWLSyntax keyword) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27082);
        __CLR4_5_2kupkuplvicmbym.R.inc(27083);restriction.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27084);write(keyword);
        __CLR4_5_2kupkuplvicmbym.R.inc(27085);boolean conjunctionOrDisjunction = false;
        __CLR4_5_2kupkuplvicmbym.R.inc(27086);if ((((restriction.getFiller() instanceof OWLAnonymousClassExpression)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27087)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27088)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27089);if ((((restriction.getFiller() instanceof OWLObjectIntersectionOf
                || restriction.getFiller() instanceof OWLObjectUnionOf)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27090)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27091)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27092);conjunctionOrDisjunction = true;
                __CLR4_5_2kupkuplvicmbym.R.inc(27093);incrementTab(4);
                __CLR4_5_2kupkuplvicmbym.R.inc(27094);writeNewLine();
            }
            }__CLR4_5_2kupkuplvicmbym.R.inc(27095);write("(");
        }
        }__CLR4_5_2kupkuplvicmbym.R.inc(27096);restriction.getFiller().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27097);if ((((restriction.getFiller() instanceof OWLAnonymousClassExpression)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27098)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27099)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27100);write(")");
            __CLR4_5_2kupkuplvicmbym.R.inc(27101);if ((((conjunctionOrDisjunction)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27102)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27103)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27104);popTab();
            }
        }}
    }}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    private <V extends OWLObject> void writeRestriction(
        @Nonnull OWLHasValueRestriction<V> restriction,
        @Nonnull OWLPropertyExpression p) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27105);
        __CLR4_5_2kupkuplvicmbym.R.inc(27106);p.accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27107);write(VALUE);
        __CLR4_5_2kupkuplvicmbym.R.inc(27108);restriction.getFiller().accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    private <F extends OWLPropertyRange> void writeRestriction(
        @Nonnull OWLCardinalityRestriction<F> restriction,
        @Nonnull ManchesterOWLSyntax keyword,
        @Nonnull OWLPropertyExpression p) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27109);
        __CLR4_5_2kupkuplvicmbym.R.inc(27110);p.accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27111);write(keyword);
        __CLR4_5_2kupkuplvicmbym.R.inc(27112);write(Integer.toString(restriction.getCardinality()));
        __CLR4_5_2kupkuplvicmbym.R.inc(27113);writeSpace();
        __CLR4_5_2kupkuplvicmbym.R.inc(27114);if ((((restriction.getFiller() instanceof OWLAnonymousClassExpression)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27115)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27116)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27117);write("(");
        }
        }__CLR4_5_2kupkuplvicmbym.R.inc(27118);restriction.getFiller().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27119);if ((((restriction.getFiller() instanceof OWLAnonymousClassExpression)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27120)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27121)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27122);write(")");
        }
    }}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    // Class expressions
    @Override
    public void visit(OWLClass ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27123);
        __CLR4_5_2kupkuplvicmbym.R.inc(27124);write(getShortFormProvider().getShortForm(ce));
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectIntersectionOf ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27125);
        __CLR4_5_2kupkuplvicmbym.R.inc(27126);write(ce.getOperands(), true);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectUnionOf ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27127);
        __CLR4_5_2kupkuplvicmbym.R.inc(27128);boolean first = true;
        __CLR4_5_2kupkuplvicmbym.R.inc(27129);for (Iterator<? extends OWLClassExpression> it = sortOptionally(ce.getOperands())
            .iterator(); (((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27130)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27131)==0&false));) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27132);OWLClassExpression op = it.next();
            __CLR4_5_2kupkuplvicmbym.R.inc(27133);if ((((!first)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27134)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27135)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27136);write(" ", OR, " ");
            }
            }__CLR4_5_2kupkuplvicmbym.R.inc(27137);first = false;
            __CLR4_5_2kupkuplvicmbym.R.inc(27138);if ((((op.isAnonymous())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27139)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27140)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27141);write("(");
            }
            }__CLR4_5_2kupkuplvicmbym.R.inc(27142);op.accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27143);if ((((op.isAnonymous())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27144)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27145)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27146);write(")");
            }
        }}
    }}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectComplementOf ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27147);
        __CLR4_5_2kupkuplvicmbym.R.inc(27148);write("", NOT, (((ce.isAnonymous() )&&(__CLR4_5_2kupkuplvicmbym.R.iget(27149)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27150)==0&false))? " " : "");
        __CLR4_5_2kupkuplvicmbym.R.inc(27151);if ((((ce.isAnonymous())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27152)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27153)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27154);write("(");
        }
        }__CLR4_5_2kupkuplvicmbym.R.inc(27155);ce.getOperand().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27156);if ((((ce.isAnonymous())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27157)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27158)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27159);write(")");
        }
    }}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectSomeValuesFrom ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27160);
        __CLR4_5_2kupkuplvicmbym.R.inc(27161);writeRestriction(ce, SOME);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(OWLObjectAllValuesFrom ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27162);
        __CLR4_5_2kupkuplvicmbym.R.inc(27163);writeRestriction(ce, ONLY);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasValue ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27164);
        __CLR4_5_2kupkuplvicmbym.R.inc(27165);writeRestriction(ce, ce.getProperty());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMinCardinality ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27166);
        __CLR4_5_2kupkuplvicmbym.R.inc(27167);writeRestriction(ce, MIN, ce.getProperty());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectExactCardinality ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27168);
        __CLR4_5_2kupkuplvicmbym.R.inc(27169);writeRestriction(ce, EXACTLY, ce.getProperty());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectMaxCardinality ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27170);
        __CLR4_5_2kupkuplvicmbym.R.inc(27171);writeRestriction(ce, MAX, ce.getProperty());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectHasSelf ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27172);
        __CLR4_5_2kupkuplvicmbym.R.inc(27173);ce.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27174);write(SOME);
        __CLR4_5_2kupkuplvicmbym.R.inc(27175);write(SELF);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectOneOf ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27176);
        __CLR4_5_2kupkuplvicmbym.R.inc(27177);write("{");
        __CLR4_5_2kupkuplvicmbym.R.inc(27178);write(ce.getIndividuals(), ONE_OF_DELIMETER, false);
        __CLR4_5_2kupkuplvicmbym.R.inc(27179);write("}");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(OWLDataSomeValuesFrom ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27180);
        __CLR4_5_2kupkuplvicmbym.R.inc(27181);writeRestriction(ce, SOME);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(OWLDataAllValuesFrom ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27182);
        __CLR4_5_2kupkuplvicmbym.R.inc(27183);writeRestriction(ce, ONLY);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataHasValue ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27184);
        __CLR4_5_2kupkuplvicmbym.R.inc(27185);writeRestriction(ce, ce.getProperty());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMinCardinality ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27186);
        __CLR4_5_2kupkuplvicmbym.R.inc(27187);writeRestriction(ce, MIN, ce.getProperty());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataExactCardinality ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27188);
        __CLR4_5_2kupkuplvicmbym.R.inc(27189);writeRestriction(ce, EXACTLY, ce.getProperty());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataMaxCardinality ce) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27190);
        __CLR4_5_2kupkuplvicmbym.R.inc(27191);writeRestriction(ce, MAX, ce.getProperty());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    // Entities stuff
    @Override
    public void visit(OWLObjectProperty property) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27192);
        __CLR4_5_2kupkuplvicmbym.R.inc(27193);write(getShortFormProvider().getShortForm(property));
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(OWLDataProperty property) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27194);
        __CLR4_5_2kupkuplvicmbym.R.inc(27195);write(getShortFormProvider().getShortForm(property));
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(OWLNamedIndividual individual) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27196);
        __CLR4_5_2kupkuplvicmbym.R.inc(27197);write(getShortFormProvider().getShortForm(individual));
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(OWLAnnotationProperty property) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27198);
        __CLR4_5_2kupkuplvicmbym.R.inc(27199);write(getShortFormProvider().getShortForm(property));
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatype node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27200);
        __CLR4_5_2kupkuplvicmbym.R.inc(27201);write(getShortFormProvider().getShortForm(node));
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnonymousIndividual individual) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27202);
        __CLR4_5_2kupkuplvicmbym.R.inc(27203);write(individual.toStringID());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull IRI iri) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27204);
        __CLR4_5_2kupkuplvicmbym.R.inc(27205);write(iri.toQuotedString());
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotation node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27206);
        __CLR4_5_2kupkuplvicmbym.R.inc(27207);writeAnnotations(node.getAnnotations());
        __CLR4_5_2kupkuplvicmbym.R.inc(27208);node.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27209);writeSpace();
        __CLR4_5_2kupkuplvicmbym.R.inc(27210);node.getValue().accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    // Data stuff
    @Override
    public void visit(@Nonnull OWLDataComplementOf node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27211);
        __CLR4_5_2kupkuplvicmbym.R.inc(27212);write(NOT);
        __CLR4_5_2kupkuplvicmbym.R.inc(27213);if ((((node.getDataRange().isDatatype())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27214)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27215)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27216);node.getDataRange().accept(this);
        } }else {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27217);write("(");
            __CLR4_5_2kupkuplvicmbym.R.inc(27218);node.getDataRange().accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27219);write(")");
        }
    }}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataOneOf node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27220);
        __CLR4_5_2kupkuplvicmbym.R.inc(27221);write("{");
        __CLR4_5_2kupkuplvicmbym.R.inc(27222);write(node.getValues(), ONE_OF_DELIMETER, false);
        __CLR4_5_2kupkuplvicmbym.R.inc(27223);write("}");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataIntersectionOf node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27224);
        __CLR4_5_2kupkuplvicmbym.R.inc(27225);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27226);write(node.getOperands(), AND, false);
        __CLR4_5_2kupkuplvicmbym.R.inc(27227);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataUnionOf node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27228);
        __CLR4_5_2kupkuplvicmbym.R.inc(27229);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27230);write(node.getOperands(), OR, false);
        __CLR4_5_2kupkuplvicmbym.R.inc(27231);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDatatypeRestriction node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27232);
        __CLR4_5_2kupkuplvicmbym.R.inc(27233);node.getDatatype().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27234);write("[");
        __CLR4_5_2kupkuplvicmbym.R.inc(27235);write(node.getFacetRestrictions(), FACET_RESTRICTION_SEPARATOR, false);
        __CLR4_5_2kupkuplvicmbym.R.inc(27236);write("]");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLLiteral node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27237);
        // xsd:decimal is the default datatype for literal forms like "33.3"
        // with no specified datatype
        __CLR4_5_2kupkuplvicmbym.R.inc(27238);if ((((XSDVocabulary.DECIMAL.getIRI().equals(node.getDatatype().getIRI()))&&(__CLR4_5_2kupkuplvicmbym.R.iget(27239)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27240)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27241);write(node.getLiteral());
        } }else {__CLR4_5_2kupkuplvicmbym.R.inc(27242);if ((((node.getDatatype().isFloat())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27243)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27244)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27245);write(node.getLiteral());
            __CLR4_5_2kupkuplvicmbym.R.inc(27246);write("f");
        } }else {__CLR4_5_2kupkuplvicmbym.R.inc(27247);if ((((node.getDatatype().isInteger())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27248)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27249)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27250);write(node.getLiteral());
        } }else {__CLR4_5_2kupkuplvicmbym.R.inc(27251);if ((((node.getDatatype().isBoolean())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27252)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27253)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27254);write(node.getLiteral());
        } }else {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27255);pushTab(getIndent());
            __CLR4_5_2kupkuplvicmbym.R.inc(27256);writeLiteral(node.getLiteral());
            __CLR4_5_2kupkuplvicmbym.R.inc(27257);if ((((node.hasLang())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27258)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27259)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27260);write("@");
                __CLR4_5_2kupkuplvicmbym.R.inc(27261);write(node.getLang());
            } }else {__CLR4_5_2kupkuplvicmbym.R.inc(27262);if ((((!node.isRDFPlainLiteral())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27263)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27264)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27265);write("^^");
                __CLR4_5_2kupkuplvicmbym.R.inc(27266);node.getDatatype().accept(this);
            }
            }}__CLR4_5_2kupkuplvicmbym.R.inc(27267);popTab();
        }
    }}}}}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    private void writeLiteral(@Nonnull String literal) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27268);
        __CLR4_5_2kupkuplvicmbym.R.inc(27269);write("\"");
        __CLR4_5_2kupkuplvicmbym.R.inc(27270);for (int i = 0; (((i < literal.length())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27271)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27272)==0&false)); i++) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27273);char ch = literal.charAt(i);
            __CLR4_5_2kupkuplvicmbym.R.inc(27274);if ((((ch == '"')&&(__CLR4_5_2kupkuplvicmbym.R.iget(27275)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27276)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27277);write('\\');
            } }else {__CLR4_5_2kupkuplvicmbym.R.inc(27278);if ((((ch == '\\')&&(__CLR4_5_2kupkuplvicmbym.R.iget(27279)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27280)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27281);write('\\');
            }
            }}__CLR4_5_2kupkuplvicmbym.R.inc(27282);write(ch);
        }
        }__CLR4_5_2kupkuplvicmbym.R.inc(27283);write("\"");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFacetRestriction node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27284);
        __CLR4_5_2kupkuplvicmbym.R.inc(27285);write(node.getFacet().getSymbolicForm());
        __CLR4_5_2kupkuplvicmbym.R.inc(27286);writeSpace();
        __CLR4_5_2kupkuplvicmbym.R.inc(27287);node.getFacetValue().accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    // Property expression stuff
    @Override
    public void visit(@Nonnull OWLObjectInverseOf property) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27288);
        __CLR4_5_2kupkuplvicmbym.R.inc(27289);write(INVERSE);
        __CLR4_5_2kupkuplvicmbym.R.inc(27290);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27291);property.getInverse().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27292);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    // Annotation stuff
    // Stand alone axiom representation
    // We render each axiom as a one line frame
    private boolean wrapSave;
    private boolean tabSave;

    private void setAxiomWriting() {try{__CLR4_5_2kupkuplvicmbym.R.inc(27293);
        __CLR4_5_2kupkuplvicmbym.R.inc(27294);wrapSave = isUseWrapping();
        __CLR4_5_2kupkuplvicmbym.R.inc(27295);tabSave = isUseTabbing();
        __CLR4_5_2kupkuplvicmbym.R.inc(27296);setUseWrapping(false);
        __CLR4_5_2kupkuplvicmbym.R.inc(27297);setUseTabbing(false);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    private void restore() {try{__CLR4_5_2kupkuplvicmbym.R.inc(27298);
        __CLR4_5_2kupkuplvicmbym.R.inc(27299);setUseTabbing(tabSave);
        __CLR4_5_2kupkuplvicmbym.R.inc(27300);setUseWrapping(wrapSave);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubClassOfAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27301);
        __CLR4_5_2kupkuplvicmbym.R.inc(27302);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27303);axiom.getSubClass().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27304);write(SUBCLASS_OF);
        __CLR4_5_2kupkuplvicmbym.R.inc(27305);axiom.getSuperClass().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27306);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27307);
        __CLR4_5_2kupkuplvicmbym.R.inc(27308);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27309);write(NOT);
        __CLR4_5_2kupkuplvicmbym.R.inc(27310);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27311);axiom.getSubject().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27312);write(" ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27313);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27314);write(" ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27315);axiom.getObject().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27316);write(")");
        __CLR4_5_2kupkuplvicmbym.R.inc(27317);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAsymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27318);
        __CLR4_5_2kupkuplvicmbym.R.inc(27319);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27320);writeSectionKeyword(ASYMMETRIC);
        __CLR4_5_2kupkuplvicmbym.R.inc(27321);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27322);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLReflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27323);
        __CLR4_5_2kupkuplvicmbym.R.inc(27324);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27325);writeSectionKeyword(REFLEXIVE);
        __CLR4_5_2kupkuplvicmbym.R.inc(27326);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27327);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    private void writeBinaryOrNaryList(
        @Nonnull ManchesterOWLSyntax binaryKeyword,
        @Nonnull Set<? extends OWLObject> objects,
        @Nonnull ManchesterOWLSyntax naryKeyword) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27328);
        __CLR4_5_2kupkuplvicmbym.R.inc(27329);if ((((objects.size() == 2)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27330)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27331)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27332);Iterator<? extends OWLObject> it = sort(objects).iterator();
            __CLR4_5_2kupkuplvicmbym.R.inc(27333);it.next().accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27334);write(binaryKeyword);
            __CLR4_5_2kupkuplvicmbym.R.inc(27335);it.next().accept(this);
        } }else {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27336);writeSectionKeyword(naryKeyword);
            __CLR4_5_2kupkuplvicmbym.R.inc(27337);writeCommaSeparatedList(objects);
        }
    }}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointClassesAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27338);
        __CLR4_5_2kupkuplvicmbym.R.inc(27339);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27340);writeBinaryOrNaryList(DISJOINT_WITH, axiom.getClassExpressions(),
            DISJOINT_CLASSES);
        __CLR4_5_2kupkuplvicmbym.R.inc(27341);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyDomainAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27342);
        __CLR4_5_2kupkuplvicmbym.R.inc(27343);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27344);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27345);write(DOMAIN);
        __CLR4_5_2kupkuplvicmbym.R.inc(27346);axiom.getDomain().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27347);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyDomainAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27348);
        __CLR4_5_2kupkuplvicmbym.R.inc(27349);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27350);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27351);write(DOMAIN);
        __CLR4_5_2kupkuplvicmbym.R.inc(27352);axiom.getDomain().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27353);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentObjectPropertiesAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27354);
        __CLR4_5_2kupkuplvicmbym.R.inc(27355);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27356);writeBinaryOrNaryList(EQUIVALENT_TO, axiom.getProperties(),
            EQUIVALENT_PROPERTIES);
        __CLR4_5_2kupkuplvicmbym.R.inc(27357);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLNegativeDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27358);
        __CLR4_5_2kupkuplvicmbym.R.inc(27359);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27360);write(NOT);
        __CLR4_5_2kupkuplvicmbym.R.inc(27361);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27362);axiom.getSubject().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27363);write(" ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27364);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27365);write(" ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27366);axiom.getObject().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27367);write(")");
        __CLR4_5_2kupkuplvicmbym.R.inc(27368);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDifferentIndividualsAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27369);
        __CLR4_5_2kupkuplvicmbym.R.inc(27370);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27371);writeBinaryOrNaryList(DIFFERENT_FROM, axiom.getIndividuals(),
            DIFFERENT_INDIVIDUALS);
        __CLR4_5_2kupkuplvicmbym.R.inc(27372);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointDataPropertiesAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27373);
        __CLR4_5_2kupkuplvicmbym.R.inc(27374);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27375);writeBinaryOrNaryList(DISJOINT_WITH, axiom.getProperties(),
            DISJOINT_PROPERTIES);
        __CLR4_5_2kupkuplvicmbym.R.inc(27376);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointObjectPropertiesAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27377);
        __CLR4_5_2kupkuplvicmbym.R.inc(27378);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27379);writeBinaryOrNaryList(DISJOINT_WITH, axiom.getProperties(),
            DISJOINT_PROPERTIES);
        __CLR4_5_2kupkuplvicmbym.R.inc(27380);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyRangeAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27381);
        __CLR4_5_2kupkuplvicmbym.R.inc(27382);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27383);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27384);write(RANGE);
        __CLR4_5_2kupkuplvicmbym.R.inc(27385);axiom.getRange().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27386);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLObjectPropertyAssertionAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27387);
        __CLR4_5_2kupkuplvicmbym.R.inc(27388);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27389);axiom.getSubject().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27390);write(" ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27391);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27392);write(" ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27393);axiom.getObject().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27394);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27395);
        __CLR4_5_2kupkuplvicmbym.R.inc(27396);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27397);writeSectionKeyword(FUNCTIONAL);
        __CLR4_5_2kupkuplvicmbym.R.inc(27398);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27399);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubObjectPropertyOfAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27400);
        __CLR4_5_2kupkuplvicmbym.R.inc(27401);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27402);axiom.getSubProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27403);writeSectionKeyword(SUB_PROPERTY_OF);
        __CLR4_5_2kupkuplvicmbym.R.inc(27404);axiom.getSuperProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27405);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDisjointUnionAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27406);
        __CLR4_5_2kupkuplvicmbym.R.inc(27407);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27408);axiom.getOWLClass().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27409);write(DISJOINT_UNION_OF);
        __CLR4_5_2kupkuplvicmbym.R.inc(27410);writeCommaSeparatedList(axiom.getClassExpressions());
        __CLR4_5_2kupkuplvicmbym.R.inc(27411);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    private void writeFrameType(OWLObject object) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27412);
        __CLR4_5_2kupkuplvicmbym.R.inc(27413);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27414);if ((((object instanceof OWLOntology)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27415)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27416)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27417);writeFrameKeyword(ONTOLOGY);
            __CLR4_5_2kupkuplvicmbym.R.inc(27418);OWLOntology ont = (OWLOntology) object;
            __CLR4_5_2kupkuplvicmbym.R.inc(27419);if ((((!ont.isAnonymous())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27420)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27421)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27422);write("<");
                __CLR4_5_2kupkuplvicmbym.R.inc(27423);write(ont.getOntologyID().getOntologyIRI().get().toString());
                __CLR4_5_2kupkuplvicmbym.R.inc(27424);write(">");
            }
        }} }else {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27425);if ((((object instanceof OWLClassExpression)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27426)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27427)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27428);writeFrameKeyword(CLASS);
            } }else {__CLR4_5_2kupkuplvicmbym.R.inc(27429);if ((((object instanceof OWLObjectPropertyExpression)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27430)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27431)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27432);writeFrameKeyword(OBJECT_PROPERTY);
            } }else {__CLR4_5_2kupkuplvicmbym.R.inc(27433);if ((((object instanceof OWLDataPropertyExpression)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27434)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27435)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27436);writeFrameKeyword(DATA_PROPERTY);
            } }else {__CLR4_5_2kupkuplvicmbym.R.inc(27437);if ((((object instanceof OWLIndividual)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27438)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27439)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27440);writeFrameKeyword(INDIVIDUAL);
            } }else {__CLR4_5_2kupkuplvicmbym.R.inc(27441);if ((((object instanceof OWLAnnotationProperty)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27442)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27443)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27444);writeFrameKeyword(ANNOTATION_PROPERTY);
            }
        }}}}}}
        }__CLR4_5_2kupkuplvicmbym.R.inc(27445);object.accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDeclarationAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27446);
        __CLR4_5_2kupkuplvicmbym.R.inc(27447);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27448);writeFrameType(axiom.getEntity());
        __CLR4_5_2kupkuplvicmbym.R.inc(27449);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationAssertionAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27450);
        __CLR4_5_2kupkuplvicmbym.R.inc(27451);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27452);axiom.getSubject().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27453);write(" ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27454);axiom.getAnnotation().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27455);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyDomainAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27456);
        __CLR4_5_2kupkuplvicmbym.R.inc(27457);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27458);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27459);write(DOMAIN);
        __CLR4_5_2kupkuplvicmbym.R.inc(27460);axiom.getDomain().accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLAnnotationPropertyRangeAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27461);
        __CLR4_5_2kupkuplvicmbym.R.inc(27462);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27463);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27464);write(RANGE);
        __CLR4_5_2kupkuplvicmbym.R.inc(27465);axiom.getRange().accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubAnnotationPropertyOfAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27466);
        __CLR4_5_2kupkuplvicmbym.R.inc(27467);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27468);axiom.getSubProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27469);writeSectionKeyword(SUB_PROPERTY_OF);
        __CLR4_5_2kupkuplvicmbym.R.inc(27470);axiom.getSuperProperty().accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSymmetricObjectPropertyAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27471);
        __CLR4_5_2kupkuplvicmbym.R.inc(27472);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27473);writeSectionKeyword(SYMMETRIC);
        __CLR4_5_2kupkuplvicmbym.R.inc(27474);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27475);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyRangeAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27476);
        __CLR4_5_2kupkuplvicmbym.R.inc(27477);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27478);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27479);writeSectionKeyword(RANGE);
        __CLR4_5_2kupkuplvicmbym.R.inc(27480);axiom.getRange().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27481);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLFunctionalDataPropertyAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27482);
        __CLR4_5_2kupkuplvicmbym.R.inc(27483);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27484);writeSectionKeyword(FUNCTIONAL);
        __CLR4_5_2kupkuplvicmbym.R.inc(27485);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27486);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentDataPropertiesAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27487);
        __CLR4_5_2kupkuplvicmbym.R.inc(27488);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27489);writeFrameKeyword(EQUIVALENT_PROPERTIES);
        __CLR4_5_2kupkuplvicmbym.R.inc(27490);writeCommaSeparatedList(axiom.getProperties());
        __CLR4_5_2kupkuplvicmbym.R.inc(27491);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLClassAssertionAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27492);
        __CLR4_5_2kupkuplvicmbym.R.inc(27493);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27494);axiom.getIndividual().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27495);write(TYPE);
        __CLR4_5_2kupkuplvicmbym.R.inc(27496);axiom.getClassExpression().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27497);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLEquivalentClassesAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27498);
        __CLR4_5_2kupkuplvicmbym.R.inc(27499);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27500);writeBinaryOrNaryList(EQUIVALENT_TO, axiom.getClassExpressions(),
            EQUIVALENT_CLASSES);
        __CLR4_5_2kupkuplvicmbym.R.inc(27501);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLDataPropertyAssertionAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27502);
        __CLR4_5_2kupkuplvicmbym.R.inc(27503);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27504);axiom.getSubject().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27505);write(" ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27506);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27507);write(" ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27508);axiom.getObject().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27509);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLTransitiveObjectPropertyAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27510);
        __CLR4_5_2kupkuplvicmbym.R.inc(27511);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27512);writeSectionKeyword(TRANSITIVE);
        __CLR4_5_2kupkuplvicmbym.R.inc(27513);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27514);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLIrreflexiveObjectPropertyAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27515);
        __CLR4_5_2kupkuplvicmbym.R.inc(27516);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27517);writeSectionKeyword(IRREFLEXIVE);
        __CLR4_5_2kupkuplvicmbym.R.inc(27518);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27519);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubDataPropertyOfAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27520);
        __CLR4_5_2kupkuplvicmbym.R.inc(27521);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27522);axiom.getSubProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27523);writeSectionKeyword(SUB_PROPERTY_OF);
        __CLR4_5_2kupkuplvicmbym.R.inc(27524);axiom.getSuperProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27525);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseFunctionalObjectPropertyAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27526);
        __CLR4_5_2kupkuplvicmbym.R.inc(27527);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27528);writeSectionKeyword(INVERSE_FUNCTIONAL);
        __CLR4_5_2kupkuplvicmbym.R.inc(27529);axiom.getProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27530);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSameIndividualAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27531);
        __CLR4_5_2kupkuplvicmbym.R.inc(27532);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27533);writeBinaryOrNaryList(SAME_AS, axiom.getIndividuals(), SAME_INDIVIDUAL);
        __CLR4_5_2kupkuplvicmbym.R.inc(27534);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLSubPropertyChainOfAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27535);
        __CLR4_5_2kupkuplvicmbym.R.inc(27536);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27537);for (Iterator<OWLObjectPropertyExpression> it = axiom
            .getPropertyChain().iterator(); (((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27538)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27539)==0&false));) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27540);it.next().accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27541);if ((((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27542)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27543)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27544);write(" o ");
            }
        }}
        }__CLR4_5_2kupkuplvicmbym.R.inc(27545);writeSectionKeyword(SUB_PROPERTY_OF);
        __CLR4_5_2kupkuplvicmbym.R.inc(27546);axiom.getSuperProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27547);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLInverseObjectPropertiesAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27548);
        __CLR4_5_2kupkuplvicmbym.R.inc(27549);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27550);axiom.getFirstProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27551);write(INVERSE_OF);
        __CLR4_5_2kupkuplvicmbym.R.inc(27552);axiom.getSecondProperty().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27553);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLRule rule) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27554);
        __CLR4_5_2kupkuplvicmbym.R.inc(27555);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27556);for (Iterator<SWRLAtom> it = rule.getBody().iterator(); (((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27557)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27558)==0&false));) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27559);it.next().accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27560);if ((((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27561)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27562)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27563);write(", ");
            }
        }}
        }__CLR4_5_2kupkuplvicmbym.R.inc(27564);write(" -> ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27565);for (Iterator<SWRLAtom> it = rule.getHead().iterator(); (((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27566)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27567)==0&false));) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27568);it.next().accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27569);if ((((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27570)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27571)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27572);write(", ");
            }
        }}
        }__CLR4_5_2kupkuplvicmbym.R.inc(27573);restore();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull OWLHasKeyAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27574);
        __CLR4_5_2kupkuplvicmbym.R.inc(27575);setAxiomWriting();
        __CLR4_5_2kupkuplvicmbym.R.inc(27576);axiom.getClassExpression().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27577);write(HAS_KEY);
        __CLR4_5_2kupkuplvicmbym.R.inc(27578);write(axiom.getObjectPropertyExpressions(), COMMA, false);
        __CLR4_5_2kupkuplvicmbym.R.inc(27579);write(axiom.getDataPropertyExpressions(), COMMA, false);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    // SWRL
    @Override
    public void visit(@Nonnull SWRLClassAtom node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27580);
        __CLR4_5_2kupkuplvicmbym.R.inc(27581);if ((((node.getPredicate().isAnonymous())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27582)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27583)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27584);write("(");
        }
        }__CLR4_5_2kupkuplvicmbym.R.inc(27585);node.getPredicate().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27586);if ((((node.getPredicate().isAnonymous())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27587)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27588)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27589);write(")");
        }
        }__CLR4_5_2kupkuplvicmbym.R.inc(27590);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27591);node.getArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27592);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataRangeAtom node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27593);
        __CLR4_5_2kupkuplvicmbym.R.inc(27594);node.getPredicate().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27595);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27596);node.getArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27597);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLObjectPropertyAtom node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27598);
        __CLR4_5_2kupkuplvicmbym.R.inc(27599);node.getPredicate().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27600);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27601);node.getFirstArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27602);write(", ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27603);node.getSecondArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27604);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDataPropertyAtom node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27605);
        __CLR4_5_2kupkuplvicmbym.R.inc(27606);node.getPredicate().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27607);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27608);node.getFirstArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27609);write(", ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27610);node.getSecondArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27611);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLBuiltInAtom node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27612);
        __CLR4_5_2kupkuplvicmbym.R.inc(27613);SWRLBuiltInsVocabulary voc = SWRLBuiltInsVocabulary.getBuiltIn(node
            .getPredicate());
        __CLR4_5_2kupkuplvicmbym.R.inc(27614);if ((((voc != null)&&(__CLR4_5_2kupkuplvicmbym.R.iget(27615)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27616)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27617);write(voc.getPrefixedName());
        } }else {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27618);write(node.getPredicate().toQuotedString());
        }
        }__CLR4_5_2kupkuplvicmbym.R.inc(27619);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27620);for (Iterator<SWRLDArgument> it = sort(node.getArguments()).iterator(); (((it
            .hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27621)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27622)==0&false));) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27623);it.next().accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27624);if ((((it.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27625)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27626)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27627);write(", ");
            }
        }}
        }__CLR4_5_2kupkuplvicmbym.R.inc(27628);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLVariable node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27629);
        __CLR4_5_2kupkuplvicmbym.R.inc(27630);write("?");
        // do not save the namespace if it's the conventional one
        __CLR4_5_2kupkuplvicmbym.R.inc(27631);if (((("urn:swrl#".equals(node.getIRI().getNamespace()))&&(__CLR4_5_2kupkuplvicmbym.R.iget(27632)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27633)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27634);write(node.getIRI().prefixedBy(""));
        } }else {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27635);write(node.getIRI().toQuotedString());
        }
    }}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLIndividualArgument node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27636);
        __CLR4_5_2kupkuplvicmbym.R.inc(27637);node.getIndividual().accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLLiteralArgument node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27638);
        __CLR4_5_2kupkuplvicmbym.R.inc(27639);node.getLiteral().accept(this);
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLSameIndividualAtom node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27640);
        __CLR4_5_2kupkuplvicmbym.R.inc(27641);write(SAME_AS);
        __CLR4_5_2kupkuplvicmbym.R.inc(27642);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27643);node.getFirstArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27644);write(", ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27645);node.getSecondArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27646);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(@Nonnull SWRLDifferentIndividualsAtom node) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27647);
        __CLR4_5_2kupkuplvicmbym.R.inc(27648);write(DIFFERENT_FROM);
        __CLR4_5_2kupkuplvicmbym.R.inc(27649);write("(");
        __CLR4_5_2kupkuplvicmbym.R.inc(27650);node.getFirstArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27651);write(", ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27652);node.getSecondArgument().accept(this);
        __CLR4_5_2kupkuplvicmbym.R.inc(27653);write(")");
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    @Override
    public void visit(OWLDatatypeDefinitionAxiom axiom) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27654);}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    protected void writeAnnotations(@Nonnull Set<OWLAnnotation> annos) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27655);
        __CLR4_5_2kupkuplvicmbym.R.inc(27656);if ((((annos.isEmpty())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27657)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27658)==0&false))) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27659);return;
        }
        }__CLR4_5_2kupkuplvicmbym.R.inc(27660);writeNewLine();
        __CLR4_5_2kupkuplvicmbym.R.inc(27661);write(ANNOTATIONS.toString());
        __CLR4_5_2kupkuplvicmbym.R.inc(27662);write(": ");
        __CLR4_5_2kupkuplvicmbym.R.inc(27663);pushTab(getIndent());
        __CLR4_5_2kupkuplvicmbym.R.inc(27664);for (Iterator<OWLAnnotation> annoIt = sort(annos).iterator(); (((annoIt
            .hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27665)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27666)==0&false));) {{
            __CLR4_5_2kupkuplvicmbym.R.inc(27667);OWLAnnotation anno = annoIt.next();
            __CLR4_5_2kupkuplvicmbym.R.inc(27668);anno.accept(this);
            __CLR4_5_2kupkuplvicmbym.R.inc(27669);if ((((annoIt.hasNext())&&(__CLR4_5_2kupkuplvicmbym.R.iget(27670)!=0|true))||(__CLR4_5_2kupkuplvicmbym.R.iget(27671)==0&false))) {{
                __CLR4_5_2kupkuplvicmbym.R.inc(27672);write(", ");
                __CLR4_5_2kupkuplvicmbym.R.inc(27673);writeNewLine();
            }
        }}
        }__CLR4_5_2kupkuplvicmbym.R.inc(27674);writeNewLine();
        __CLR4_5_2kupkuplvicmbym.R.inc(27675);writeNewLine();
        __CLR4_5_2kupkuplvicmbym.R.inc(27676);popTab();
    }finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}

    // Ontology
    @Override
    public void visit(OWLOntology ontology) {try{__CLR4_5_2kupkuplvicmbym.R.inc(27677);}finally{__CLR4_5_2kupkuplvicmbym.R.flushNeeded();}}
}
