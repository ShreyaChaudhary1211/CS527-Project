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

import java.util.*;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.*;

/**
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public class OWLEquivalentDataPropertiesAxiomImpl extends OWLNaryPropertyAxiomImpl<OWLDataPropertyExpression>implements
    OWLEquivalentDataPropertiesAxiom {public static class __CLR4_5_24na4nalviclfrq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0069\u006d\u0070\u006c\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237243416L,8589935092L,6091,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 40000L;

    /**
     * @param properties
     *        properties
     * @param annotations
     *        annotations
     */
    public OWLEquivalentDataPropertiesAxiomImpl(@Nonnull Set<? extends OWLDataPropertyExpression> properties,
        @Nonnull Collection<? extends OWLAnnotation> annotations) {
        super(properties, annotations);__CLR4_5_24na4nalviclfrq.R.inc(6023);try{__CLR4_5_24na4nalviclfrq.R.inc(6022);
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public OWLEquivalentDataPropertiesAxiom getAxiomWithoutAnnotations() {try{__CLR4_5_24na4nalviclfrq.R.inc(6024);
        __CLR4_5_24na4nalviclfrq.R.inc(6025);if ((((!isAnnotated())&&(__CLR4_5_24na4nalviclfrq.R.iget(6026)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6027)==0&false))) {{
            __CLR4_5_24na4nalviclfrq.R.inc(6028);return this;
        }
        }__CLR4_5_24na4nalviclfrq.R.inc(6029);return new OWLEquivalentDataPropertiesAxiomImpl(getProperties(), NO_ANNOTATIONS);
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public OWLEquivalentDataPropertiesAxiom getAnnotatedAxiom(Set<OWLAnnotation> annotations) {try{__CLR4_5_24na4nalviclfrq.R.inc(6030);
        __CLR4_5_24na4nalviclfrq.R.inc(6031);return new OWLEquivalentDataPropertiesAxiomImpl(getProperties(), mergeAnnos(annotations));
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public Set<OWLEquivalentDataPropertiesAxiom> asPairwiseAxioms() {try{__CLR4_5_24na4nalviclfrq.R.inc(6032);
        __CLR4_5_24na4nalviclfrq.R.inc(6033);Set<OWLEquivalentDataPropertiesAxiom> result = new HashSet<>();
        __CLR4_5_24na4nalviclfrq.R.inc(6034);List<OWLDataPropertyExpression> list = new ArrayList<>(getProperties());
        __CLR4_5_24na4nalviclfrq.R.inc(6035);for (int i = 0; (((i < list.size() - 1)&&(__CLR4_5_24na4nalviclfrq.R.iget(6036)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6037)==0&false)); i++) {{
            __CLR4_5_24na4nalviclfrq.R.inc(6038);for (int j = i + 1; (((j < list.size())&&(__CLR4_5_24na4nalviclfrq.R.iget(6039)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6040)==0&false)); j++) {{
                __CLR4_5_24na4nalviclfrq.R.inc(6041);result.add(new OWLEquivalentDataPropertiesAxiomImpl(new HashSet<>(Arrays.asList(list.get(i), list.get(
                    j))), NO_ANNOTATIONS));
            }
        }}
        }__CLR4_5_24na4nalviclfrq.R.inc(6042);return result;
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public Set<OWLEquivalentDataPropertiesAxiom> splitToAnnotatedPairs() {try{__CLR4_5_24na4nalviclfrq.R.inc(6043);
        __CLR4_5_24na4nalviclfrq.R.inc(6044);List<OWLDataPropertyExpression> ops = new ArrayList<>(getProperties());
        __CLR4_5_24na4nalviclfrq.R.inc(6045);if ((((ops.size() == 2)&&(__CLR4_5_24na4nalviclfrq.R.iget(6046)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6047)==0&false))) {{
            __CLR4_5_24na4nalviclfrq.R.inc(6048);return Collections.<OWLEquivalentDataPropertiesAxiom> singleton(this);
        }
        }__CLR4_5_24na4nalviclfrq.R.inc(6049);Set<OWLEquivalentDataPropertiesAxiom> result = new HashSet<>();
        __CLR4_5_24na4nalviclfrq.R.inc(6050);for (int i = 0; (((i < ops.size() - 1)&&(__CLR4_5_24na4nalviclfrq.R.iget(6051)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6052)==0&false)); i++) {{
            __CLR4_5_24na4nalviclfrq.R.inc(6053);OWLDataPropertyExpression indI = ops.get(i);
            __CLR4_5_24na4nalviclfrq.R.inc(6054);OWLDataPropertyExpression indJ = ops.get(i + 1);
            __CLR4_5_24na4nalviclfrq.R.inc(6055);result.add(new OWLEquivalentDataPropertiesAxiomImpl(new HashSet<>(Arrays.asList(indI, indJ)),
                getAnnotations()));
        }
        }__CLR4_5_24na4nalviclfrq.R.inc(6056);return result;
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_24na4nalviclfrq.R.inc(6057);
        __CLR4_5_24na4nalviclfrq.R.inc(6058);if ((((this == obj)&&(__CLR4_5_24na4nalviclfrq.R.iget(6059)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6060)==0&false))) {{
            __CLR4_5_24na4nalviclfrq.R.inc(6061);return true;
        }
        }__CLR4_5_24na4nalviclfrq.R.inc(6062);if ((((!super.equals(obj))&&(__CLR4_5_24na4nalviclfrq.R.iget(6063)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6064)==0&false))) {{
            __CLR4_5_24na4nalviclfrq.R.inc(6065);return false;
        }
        }__CLR4_5_24na4nalviclfrq.R.inc(6066);return obj instanceof OWLEquivalentDataPropertiesAxiom;
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public void accept(OWLAxiomVisitor visitor) {try{__CLR4_5_24na4nalviclfrq.R.inc(6067);
        __CLR4_5_24na4nalviclfrq.R.inc(6068);visitor.visit(this);
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public void accept(OWLObjectVisitor visitor) {try{__CLR4_5_24na4nalviclfrq.R.inc(6069);
        __CLR4_5_24na4nalviclfrq.R.inc(6070);visitor.visit(this);
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLAxiomVisitorEx<O> visitor) {try{__CLR4_5_24na4nalviclfrq.R.inc(6071);
        __CLR4_5_24na4nalviclfrq.R.inc(6072);return visitor.visit(this);
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public <O> O accept(OWLObjectVisitorEx<O> visitor) {try{__CLR4_5_24na4nalviclfrq.R.inc(6073);
        __CLR4_5_24na4nalviclfrq.R.inc(6074);return visitor.visit(this);
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public AxiomType<?> getAxiomType() {try{__CLR4_5_24na4nalviclfrq.R.inc(6075);
        __CLR4_5_24na4nalviclfrq.R.inc(6076);return AxiomType.EQUIVALENT_DATA_PROPERTIES;
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}

    @Override
    public Set<OWLSubDataPropertyOfAxiom> asSubDataPropertyOfAxioms() {try{__CLR4_5_24na4nalviclfrq.R.inc(6077);
        __CLR4_5_24na4nalviclfrq.R.inc(6078);Set<OWLSubDataPropertyOfAxiom> result = new HashSet<>();
        __CLR4_5_24na4nalviclfrq.R.inc(6079);List<OWLDataPropertyExpression> props = new ArrayList<>(getProperties());
        __CLR4_5_24na4nalviclfrq.R.inc(6080);for (int i = 0; (((i < props.size())&&(__CLR4_5_24na4nalviclfrq.R.iget(6081)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6082)==0&false)); i++) {{
            __CLR4_5_24na4nalviclfrq.R.inc(6083);for (int j = 0; (((j < props.size())&&(__CLR4_5_24na4nalviclfrq.R.iget(6084)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6085)==0&false)); j++) {{
                __CLR4_5_24na4nalviclfrq.R.inc(6086);if ((((i != j)&&(__CLR4_5_24na4nalviclfrq.R.iget(6087)!=0|true))||(__CLR4_5_24na4nalviclfrq.R.iget(6088)==0&false))) {{
                    __CLR4_5_24na4nalviclfrq.R.inc(6089);result.add(new OWLSubDataPropertyOfAxiomImpl(props.get(i), props.get(j), NO_ANNOTATIONS));
                }
            }}
        }}
        }__CLR4_5_24na4nalviclfrq.R.inc(6090);return result;
    }finally{__CLR4_5_24na4nalviclfrq.R.flushNeeded();}}
}
