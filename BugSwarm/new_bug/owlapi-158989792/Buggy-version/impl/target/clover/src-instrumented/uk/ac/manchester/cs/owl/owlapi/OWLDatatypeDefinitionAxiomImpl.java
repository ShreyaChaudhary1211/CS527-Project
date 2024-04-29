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
package uk.ac.manchester.cs.owl.owlapi;

import static org.semanticweb.owlapi.util.OWLAPIPreconditions.checkNotNull;

import java.util.Collection;
import java.util.Set;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLAxiomVisitor;
import org.semanticweb.owlapi.model.OWLAxiomVisitorEx;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLObject;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLObjectVisitorEx;

/**
 * @author Matthew Horridge, The University of Manchester, Information
 *         Management Group
 * @since 3.0.0
 */
public class OWLDatatypeDefinitionAxiomImpl extends
        OWLAxiomImplWithoutEntityAndAnonCaching implements
        OWLDatatypeDefinitionAxiom {public static class __CLR4_5_242j42jlviclfp0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,5333,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLDatatype datatype;
    @Nonnull
    private final OWLDataRange dataRange;

    /**
     * @param datatype
     *        datatype
     * @param dataRange
     *        datarange
     * @param annotations
     *        annotations on the axiom
     */
    public OWLDatatypeDefinitionAxiomImpl(@Nonnull OWLDatatype datatype,
            @Nonnull OWLDataRange dataRange,
            @Nonnull Collection<? extends OWLAnnotation> annotations) {
        super(annotations);__CLR4_5_242j42jlviclfp0.R.inc(5276);try{__CLR4_5_242j42jlviclfp0.R.inc(5275);
        __CLR4_5_242j42jlviclfp0.R.inc(5277);this.datatype = checkNotNull(datatype, "datatype cannot be null");
        __CLR4_5_242j42jlviclfp0.R.inc(5278);this.dataRange = checkNotNull(dataRange, "dataRange cannot be null");
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_242j42jlviclfp0.R.inc(5279);
        __CLR4_5_242j42jlviclfp0.R.inc(5280);entities.add(datatype);
        __CLR4_5_242j42jlviclfp0.R.inc(5281);addSignatureEntitiesToSetForValue(entities, dataRange);
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_242j42jlviclfp0.R.inc(5282);
        __CLR4_5_242j42jlviclfp0.R.inc(5283);addAnonymousIndividualsToSetForValue(anons, dataRange);
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public OWLAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_242j42jlviclfp0.R.inc(5284);
        __CLR4_5_242j42jlviclfp0.R.inc(5285);if ((((!isAnnotated())&&(__CLR4_5_242j42jlviclfp0.R.iget(5286)!=0|true))||(__CLR4_5_242j42jlviclfp0.R.iget(5287)==0&false))) {{
            __CLR4_5_242j42jlviclfp0.R.inc(5288);return this;
        }
        }__CLR4_5_242j42jlviclfp0.R.inc(5289);return new OWLDatatypeDefinitionAxiomImpl(getDatatype(),
                getDataRange(), NO_ANNOTATIONS);
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public OWLDatatypeDefinitionAxiom getAnnotatedAxiom(
            Set<OWLAnnotation> annotations) {try{__CLR4_5_242j42jlviclfp0.R.inc(5290);
        __CLR4_5_242j42jlviclfp0.R.inc(5291);return new OWLDatatypeDefinitionAxiomImpl(getDatatype(),
                getDataRange(), mergeAnnos(annotations));
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public OWLDatatype getDatatype() {try{__CLR4_5_242j42jlviclfp0.R.inc(5292);
        __CLR4_5_242j42jlviclfp0.R.inc(5293);return datatype;
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public OWLDataRange getDataRange() {try{__CLR4_5_242j42jlviclfp0.R.inc(5294);
        __CLR4_5_242j42jlviclfp0.R.inc(5295);return dataRange;
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_242j42jlviclfp0.R.inc(5296);
        __CLR4_5_242j42jlviclfp0.R.inc(5297);visitor.visit(this);
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_242j42jlviclfp0.R.inc(5298);
        __CLR4_5_242j42jlviclfp0.R.inc(5299);return visitor.visit(this);
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public boolean isLogicalAxiom() {try{__CLR4_5_242j42jlviclfp0.R.inc(5300);
        __CLR4_5_242j42jlviclfp0.R.inc(5301);return true;
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public boolean isAnnotationAxiom() {try{__CLR4_5_242j42jlviclfp0.R.inc(5302);
        __CLR4_5_242j42jlviclfp0.R.inc(5303);return false;
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_242j42jlviclfp0.R.inc(5304);
        __CLR4_5_242j42jlviclfp0.R.inc(5305);return AxiomType.DATATYPE_DEFINITION;
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_242j42jlviclfp0.R.inc(5306);
        __CLR4_5_242j42jlviclfp0.R.inc(5307);visitor.visit(this);
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_242j42jlviclfp0.R.inc(5308);
        __CLR4_5_242j42jlviclfp0.R.inc(5309);return visitor.visit(this);
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_242j42jlviclfp0.R.inc(5310);
        __CLR4_5_242j42jlviclfp0.R.inc(5311);OWLDatatypeDefinitionAxiom other = (OWLDatatypeDefinitionAxiom) object;
        __CLR4_5_242j42jlviclfp0.R.inc(5312);int diff = getDatatype().compareTo(other.getDatatype());
        __CLR4_5_242j42jlviclfp0.R.inc(5313);if ((((diff != 0)&&(__CLR4_5_242j42jlviclfp0.R.iget(5314)!=0|true))||(__CLR4_5_242j42jlviclfp0.R.iget(5315)==0&false))) {{
            __CLR4_5_242j42jlviclfp0.R.inc(5316);return diff;
        }
        }__CLR4_5_242j42jlviclfp0.R.inc(5317);return getDataRange().compareTo(other.getDataRange());
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_242j42jlviclfp0.R.inc(5318);
        __CLR4_5_242j42jlviclfp0.R.inc(5319);if ((((this == obj)&&(__CLR4_5_242j42jlviclfp0.R.iget(5320)!=0|true))||(__CLR4_5_242j42jlviclfp0.R.iget(5321)==0&false))) {{
            __CLR4_5_242j42jlviclfp0.R.inc(5322);return true;
        }
        }__CLR4_5_242j42jlviclfp0.R.inc(5323);if ((((!super.equals(obj))&&(__CLR4_5_242j42jlviclfp0.R.iget(5324)!=0|true))||(__CLR4_5_242j42jlviclfp0.R.iget(5325)==0&false))) {{
            __CLR4_5_242j42jlviclfp0.R.inc(5326);return false;
        }
        // superclass is responsible for null, identity, owlaxiom type and
        // annotations
        }__CLR4_5_242j42jlviclfp0.R.inc(5327);if ((((!(obj instanceof OWLDatatypeDefinitionAxiom))&&(__CLR4_5_242j42jlviclfp0.R.iget(5328)!=0|true))||(__CLR4_5_242j42jlviclfp0.R.iget(5329)==0&false))) {{
            __CLR4_5_242j42jlviclfp0.R.inc(5330);return false;
        }
        }__CLR4_5_242j42jlviclfp0.R.inc(5331);OWLDatatypeDefinitionAxiom other = (OWLDatatypeDefinitionAxiom) obj;
        __CLR4_5_242j42jlviclfp0.R.inc(5332);return datatype.equals(other.getDatatype())
                && dataRange.equals(other.getDataRange());
    }finally{__CLR4_5_242j42jlviclfp0.R.flushNeeded();}}
}
