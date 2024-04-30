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

import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.util.OWLObjectTypeIndexProvider;
import org.semanticweb.owlapi.vocab.OWLFacet;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLFacetRestrictionImpl extends
    OWLObjectImplWithoutEntityAndAnonCaching implements OWLFacetRestriction {public static class __CLR4_5_24r44r4lviclfs2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,6203,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;
    @Nonnull
    private final OWLFacet facet;
    @Nonnull
    private final OWLLiteral facetValue;

    @Override
    protected int index() {try{__CLR4_5_24r44r4lviclfs2.R.inc(6160);
        __CLR4_5_24r44r4lviclfs2.R.inc(6161);return OWLObjectTypeIndexProvider.DATA_TYPE_INDEX_BASE + 7;
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    /**
     * @param facet
     *        facet
     * @param facetValue
     *        value
     */
    public OWLFacetRestrictionImpl(@Nonnull OWLFacet facet,
        @Nonnull OWLLiteral facetValue) {try{__CLR4_5_24r44r4lviclfs2.R.inc(6162);
        __CLR4_5_24r44r4lviclfs2.R.inc(6163);this.facet = checkNotNull(facet, "facet cannot be null");
        __CLR4_5_24r44r4lviclfs2.R.inc(6164);this.facetValue = checkNotNull(facetValue, "facetValue cannot be null");
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    public void addSignatureEntitiesToSet(Set<OWLEntity> entities) {try{__CLR4_5_24r44r4lviclfs2.R.inc(6165);
        __CLR4_5_24r44r4lviclfs2.R.inc(6166);addSignatureEntitiesToSetForValue(entities, facetValue);
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    public void addAnonymousIndividualsToSet(Set<OWLAnonymousIndividual> anons) {try{__CLR4_5_24r44r4lviclfs2.R.inc(6167);
        __CLR4_5_24r44r4lviclfs2.R.inc(6168);addAnonymousIndividualsToSetForValue(anons, facetValue);
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    public OWLFacet getFacet() {try{__CLR4_5_24r44r4lviclfs2.R.inc(6169);
        __CLR4_5_24r44r4lviclfs2.R.inc(6170);return facet;
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    public OWLLiteral getFacetValue() {try{__CLR4_5_24r44r4lviclfs2.R.inc(6171);
        __CLR4_5_24r44r4lviclfs2.R.inc(6172);return facetValue;
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    public void accept(@Nonnull OWLObjectVisitor visitor) {try{__CLR4_5_24r44r4lviclfs2.R.inc(6173);
        __CLR4_5_24r44r4lviclfs2.R.inc(6174);visitor.visit(this);
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLDataVisitorEx<O> visitor) {try{__CLR4_5_24r44r4lviclfs2.R.inc(6175);
        __CLR4_5_24r44r4lviclfs2.R.inc(6176);return visitor.visit(this);
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    public void accept(OWLDataVisitor visitor) {try{__CLR4_5_24r44r4lviclfs2.R.inc(6177);
        __CLR4_5_24r44r4lviclfs2.R.inc(6178);visitor.visit(this);
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_24r44r4lviclfs2.R.inc(6179);
        __CLR4_5_24r44r4lviclfs2.R.inc(6180);return visitor.visit(this);
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    public boolean equals(@Nullable Object obj) {try{__CLR4_5_24r44r4lviclfs2.R.inc(6181);
        __CLR4_5_24r44r4lviclfs2.R.inc(6182);if ((((obj == null)&&(__CLR4_5_24r44r4lviclfs2.R.iget(6183)!=0|true))||(__CLR4_5_24r44r4lviclfs2.R.iget(6184)==0&false))) {{
            __CLR4_5_24r44r4lviclfs2.R.inc(6185);return false;
        }
        }__CLR4_5_24r44r4lviclfs2.R.inc(6186);if ((((this == obj)&&(__CLR4_5_24r44r4lviclfs2.R.iget(6187)!=0|true))||(__CLR4_5_24r44r4lviclfs2.R.iget(6188)==0&false))) {{
            __CLR4_5_24r44r4lviclfs2.R.inc(6189);return true;
        }
        }__CLR4_5_24r44r4lviclfs2.R.inc(6190);if ((((obj instanceof OWLFacetRestriction)&&(__CLR4_5_24r44r4lviclfs2.R.iget(6191)!=0|true))||(__CLR4_5_24r44r4lviclfs2.R.iget(6192)==0&false))) {{
            __CLR4_5_24r44r4lviclfs2.R.inc(6193);return facet.equals(((OWLFacetRestriction) obj).getFacet())
                && facetValue.equals(((OWLFacetRestriction) obj).getFacetValue());
        }
        }__CLR4_5_24r44r4lviclfs2.R.inc(6194);return false;
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}

    @Override
    protected int compareObjectOfSameType(OWLObject object) {try{__CLR4_5_24r44r4lviclfs2.R.inc(6195);
        __CLR4_5_24r44r4lviclfs2.R.inc(6196);OWLFacetRestriction other = (OWLFacetRestriction) object;
        __CLR4_5_24r44r4lviclfs2.R.inc(6197);int diff = facet.compareTo(other.getFacet());
        __CLR4_5_24r44r4lviclfs2.R.inc(6198);if ((((diff != 0)&&(__CLR4_5_24r44r4lviclfs2.R.iget(6199)!=0|true))||(__CLR4_5_24r44r4lviclfs2.R.iget(6200)==0&false))) {{
            __CLR4_5_24r44r4lviclfs2.R.inc(6201);return diff;
        }
        }__CLR4_5_24r44r4lviclfs2.R.inc(6202);return facetValue.compareTo(other.getFacetValue());
    }finally{__CLR4_5_24r44r4lviclfs2.R.flushNeeded();}}
}
