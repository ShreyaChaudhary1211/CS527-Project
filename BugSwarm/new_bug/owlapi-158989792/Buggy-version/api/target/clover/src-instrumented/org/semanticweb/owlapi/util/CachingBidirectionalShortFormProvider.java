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
package org.semanticweb.owlapi.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.semanticweb.owlapi.model.OWLEntity;

/**
 * A bidirectional short form provider that caches entity short forms. The
 * provider has various methods to add, remove, update entities in the cache and
 * also to rebuild the cache from scratch.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group
 * @since 2.0.0
 */
public abstract class CachingBidirectionalShortFormProvider implements
        BidirectionalShortFormProvider {public static class __CLR4_5_2546546lvickp9u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0032\u006e\u0064\u005f\u0072\u006f\u0075\u006e\u0064\u002f\u006f\u0077\u006c\u0061\u0070\u0069\u002d\u0031\u0035\u0038\u0039\u0038\u0039\u0037\u0039\u0032\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0061\u0070\u0069\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714237201267L,8589935092L,6684,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Map<String, Set<OWLEntity>> shortForm2EntityMap = new HashMap<>();
    private final Map<OWLEntity, String> entity2ShortFormMap = new HashMap<>();

    protected CachingBidirectionalShortFormProvider() {try{__CLR4_5_2546546lvickp9u.R.inc(6630);}finally{__CLR4_5_2546546lvickp9u.R.flushNeeded();}}

    /**
     * Generates the short form for the specified entity. This short form will
     * be cached so that it can be retrieved efficiently and so that the entity
     * can be obtained from the short form. If the short form for the entity
     * changes then the cach must explicilty be updated using the {@code update}
     * method.
     * 
     * @param entity
     *        The entity whose short form should be generated.
     * @return short form
     */
    @Nonnull
    protected abstract String generateShortForm(@Nonnull OWLEntity entity);

    @Override
    public Set<String> getShortForms() {try{__CLR4_5_2546546lvickp9u.R.inc(6631);
        __CLR4_5_2546546lvickp9u.R.inc(6632);return CollectionFactory
                .getCopyOnRequestSetFromMutableCollection(shortForm2EntityMap
                        .keySet());
    }finally{__CLR4_5_2546546lvickp9u.R.flushNeeded();}}

    /**
     * Rebuilds the cache using entities obtained from the specified entity set
     * provider.
     * 
     * @param entitySetProvider
     *        The {@code OWLEntitySetProvider} that should be used to obtain the
     *        entities whose short forms will be cached.
     */
    protected void rebuild(OWLEntitySetProvider<OWLEntity> entitySetProvider) {try{__CLR4_5_2546546lvickp9u.R.inc(6633);
        __CLR4_5_2546546lvickp9u.R.inc(6634);shortForm2EntityMap.clear();
        __CLR4_5_2546546lvickp9u.R.inc(6635);entity2ShortFormMap.clear();
        __CLR4_5_2546546lvickp9u.R.inc(6636);for (OWLEntity entity : entitySetProvider.getEntities()) {{
            assert (((entity != null)&&(__CLR4_5_2546546lvickp9u.R.iget(6637)!=0|true))||(__CLR4_5_2546546lvickp9u.R.iget(6638)==0&false));
            __CLR4_5_2546546lvickp9u.R.inc(6639);add(entity);
        }
    }}finally{__CLR4_5_2546546lvickp9u.R.flushNeeded();}}

    /**
     * Adds an entity to the cache.
     * 
     * @param entity
     *        The entity to be added to the cache - the short form will
     *        automatically be generated and added to the cache.
     */
    public void add(@Nonnull OWLEntity entity) {try{__CLR4_5_2546546lvickp9u.R.inc(6640);
        __CLR4_5_2546546lvickp9u.R.inc(6641);String shortForm = generateShortForm(entity);
        __CLR4_5_2546546lvickp9u.R.inc(6642);entity2ShortFormMap.put(entity, shortForm);
        __CLR4_5_2546546lvickp9u.R.inc(6643);Set<OWLEntity> entities = shortForm2EntityMap.get(shortForm);
        __CLR4_5_2546546lvickp9u.R.inc(6644);if ((((entities == null)&&(__CLR4_5_2546546lvickp9u.R.iget(6645)!=0|true))||(__CLR4_5_2546546lvickp9u.R.iget(6646)==0&false))) {{
            // XXX what's the use of size 1? How likely it is to grow large?
            __CLR4_5_2546546lvickp9u.R.inc(6647);entities = new HashSet<>(1);
        }
        }__CLR4_5_2546546lvickp9u.R.inc(6648);entities.add(entity);
        __CLR4_5_2546546lvickp9u.R.inc(6649);shortForm2EntityMap.put(shortForm, entities);
    }finally{__CLR4_5_2546546lvickp9u.R.flushNeeded();}}

    /**
     * Removes an entity and its short form from the cache.
     * 
     * @param entity
     *        The entity to be removed.
     */
    protected void remove(OWLEntity entity) {try{__CLR4_5_2546546lvickp9u.R.inc(6650);
        __CLR4_5_2546546lvickp9u.R.inc(6651);String shortForm = entity2ShortFormMap.remove(entity);
        __CLR4_5_2546546lvickp9u.R.inc(6652);if ((((shortForm != null)&&(__CLR4_5_2546546lvickp9u.R.iget(6653)!=0|true))||(__CLR4_5_2546546lvickp9u.R.iget(6654)==0&false))) {{
            __CLR4_5_2546546lvickp9u.R.inc(6655);shortForm2EntityMap.remove(shortForm);
        }
    }}finally{__CLR4_5_2546546lvickp9u.R.flushNeeded();}}

    @Override
    public Set<OWLEntity> getEntities(String shortForm) {try{__CLR4_5_2546546lvickp9u.R.inc(6656);
        __CLR4_5_2546546lvickp9u.R.inc(6657);Set<OWLEntity> entities = shortForm2EntityMap.get(shortForm);
        __CLR4_5_2546546lvickp9u.R.inc(6658);if ((((entities != null)&&(__CLR4_5_2546546lvickp9u.R.iget(6659)!=0|true))||(__CLR4_5_2546546lvickp9u.R.iget(6660)==0&false))) {{
            __CLR4_5_2546546lvickp9u.R.inc(6661);return CollectionFactory
                    .getCopyOnRequestSetFromImmutableCollection(entities);
        } }else {{
            __CLR4_5_2546546lvickp9u.R.inc(6662);return CollectionFactory.emptySet();
        }
    }}finally{__CLR4_5_2546546lvickp9u.R.flushNeeded();}}

    @Nullable
    @Override
    public OWLEntity getEntity(String shortForm) {try{__CLR4_5_2546546lvickp9u.R.inc(6663);
        __CLR4_5_2546546lvickp9u.R.inc(6664);Set<OWLEntity> entities = shortForm2EntityMap.get(shortForm);
        __CLR4_5_2546546lvickp9u.R.inc(6665);if ((((entities != null)&&(__CLR4_5_2546546lvickp9u.R.iget(6666)!=0|true))||(__CLR4_5_2546546lvickp9u.R.iget(6667)==0&false))) {{
            __CLR4_5_2546546lvickp9u.R.inc(6668);if ((((!entities.isEmpty())&&(__CLR4_5_2546546lvickp9u.R.iget(6669)!=0|true))||(__CLR4_5_2546546lvickp9u.R.iget(6670)==0&false))) {{
                __CLR4_5_2546546lvickp9u.R.inc(6671);return entities.iterator().next();
            } }else {{
                __CLR4_5_2546546lvickp9u.R.inc(6672);return null;
            }
        }} }else {{
            __CLR4_5_2546546lvickp9u.R.inc(6673);return null;
        }
    }}finally{__CLR4_5_2546546lvickp9u.R.flushNeeded();}}

    @Override
    public String getShortForm(OWLEntity entity) {try{__CLR4_5_2546546lvickp9u.R.inc(6674);
        __CLR4_5_2546546lvickp9u.R.inc(6675);String sf = entity2ShortFormMap.get(entity);
        __CLR4_5_2546546lvickp9u.R.inc(6676);if ((((sf != null)&&(__CLR4_5_2546546lvickp9u.R.iget(6677)!=0|true))||(__CLR4_5_2546546lvickp9u.R.iget(6678)==0&false))) {{
            __CLR4_5_2546546lvickp9u.R.inc(6679);return sf;
        } }else {{
            __CLR4_5_2546546lvickp9u.R.inc(6680);return generateShortForm(entity);
        }
    }}finally{__CLR4_5_2546546lvickp9u.R.flushNeeded();}}

    @Override
    public void dispose() {try{__CLR4_5_2546546lvickp9u.R.inc(6681);
        __CLR4_5_2546546lvickp9u.R.inc(6682);shortForm2EntityMap.clear();
        __CLR4_5_2546546lvickp9u.R.inc(6683);entity2ShortFormMap.clear();
    }finally{__CLR4_5_2546546lvickp9u.R.flushNeeded();}}
}
