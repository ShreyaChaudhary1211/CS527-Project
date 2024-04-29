/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * Helpers for {@code java.lang.Thread} and {@code java.lang.ThreadGroup}.
 * </p>
 * <p>
 * #ThreadSafe#
 * </p>
 *
 * @see java.lang.Thread
 * @see java.lang.ThreadGroup
 * @since 3.5
 */
public class ThreadUtils {public static class __CLR4_5_27zg7zglvha7a3r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0065\u0078\u0074\u0072\u0061\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0073\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0063\u006f\u006d\u006d\u006f\u006e\u0073\u002d\u006c\u0061\u006e\u0067\u002d\u0032\u0032\u0034\u0032\u0036\u0037\u0031\u0039\u0031\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714172755542L,8589935092L,10465,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Return the active thread with the specified id if it belong's to the specified thread group.
     *
     * @param threadId The thread id
     * @param threadGroup The thread group
     * @return The thread which belongs to a specified thread group and the thread's id match the specified id.
     * {@code null} is returned if no such thread exists
     * @throws IllegalArgumentException if the specified id is zero or negative or the group is null
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     *
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Thread findThreadById(final long threadId, final ThreadGroup threadGroup) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10348);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10349);Validate.isTrue(threadGroup != null, "The thread group must not be null");
        __CLR4_5_27zg7zglvha7a3r.R.inc(10350);final Thread thread = findThreadById(threadId);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10351);if((((thread != null && threadGroup.equals(thread.getThreadGroup()))&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10352)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10353)==0&false))) {{
            __CLR4_5_27zg7zglvha7a3r.R.inc(10354);return thread;
        }
        }__CLR4_5_27zg7zglvha7a3r.R.inc(10355);return null;
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Return the active thread with the specified id if it belong's to a thread group with the specified group name.
     *
     * @param threadId The thread id
     * @param threadGroupName The thread group name
     * @return The threads which belongs to a thread group with the specified group name and the thread's id match the specified id.
     * {@code null} is returned if no such thread exists
     * @throws IllegalArgumentException if the specified id is zero or negative or the group name is null
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     *
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Thread findThreadById(final long threadId, final String threadGroupName) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10356);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10357);Validate.isTrue(threadGroupName != null, "The thread group name must not be null");
        __CLR4_5_27zg7zglvha7a3r.R.inc(10358);final Thread thread = findThreadById(threadId);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10359);if((((thread != null && thread.getThreadGroup() != null && thread.getThreadGroup().getName().equals(threadGroupName))&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10360)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10361)==0&false))) {{
            __CLR4_5_27zg7zglvha7a3r.R.inc(10362);return thread;
        }
        }__CLR4_5_27zg7zglvha7a3r.R.inc(10363);return null;
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Return active threads with the specified name if they belong to a specified thread group.
     *
     * @param threadName The thread name
     * @param threadGroup The thread group
     * @return The threads which belongs to a thread group and the thread's name match the specified name,
     * An empty collection is returned if no such thread exists. The collection returned is always unmodifiable.
     * @throws IllegalArgumentException if the specified thread name or group is null
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     *
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<Thread> findThreadsByName(final String threadName, final ThreadGroup threadGroup) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10364);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10365);return findThreads(threadGroup, false, new NamePredicate(threadName));
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Return active threads with the specified name if they belong to a thread group with the specified group name.
     *
     * @param threadName The thread name
     * @param threadGroupName The thread group name
     * @return The threads which belongs to a thread group with the specified group name and the thread's name match the specified name,
     * An empty collection is returned if no such thread exists. The collection returned is always unmodifiable.
     * @throws IllegalArgumentException if the specified thread name or group name is null
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     *
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<Thread> findThreadsByName(final String threadName, final String threadGroupName) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10366);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10367);Validate.isTrue(threadName != null, "The thread name must not be null");
        __CLR4_5_27zg7zglvha7a3r.R.inc(10368);Validate.isTrue(threadGroupName != null, "The thread group name must not be null");

        __CLR4_5_27zg7zglvha7a3r.R.inc(10369);final Collection<ThreadGroup> threadGroups = findThreadGroups(new NamePredicate(threadGroupName));

        __CLR4_5_27zg7zglvha7a3r.R.inc(10370);if((((threadGroups.isEmpty())&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10371)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10372)==0&false))) {{
            __CLR4_5_27zg7zglvha7a3r.R.inc(10373);return Collections.emptyList();
        }

        }__CLR4_5_27zg7zglvha7a3r.R.inc(10374);final Collection<Thread> result = new ArrayList<>();
        __CLR4_5_27zg7zglvha7a3r.R.inc(10375);final NamePredicate threadNamePredicate = new NamePredicate(threadName);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10376);for(final ThreadGroup group : threadGroups) {{
            __CLR4_5_27zg7zglvha7a3r.R.inc(10377);result.addAll(findThreads(group, false, threadNamePredicate));
        }
        }__CLR4_5_27zg7zglvha7a3r.R.inc(10378);return Collections.unmodifiableCollection(result);
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Return active thread groups with the specified group name.
     *
     * @param threadGroupName The thread group name
     * @return the thread groups with the specified group name or an empty collection if no such thread group exists. The collection returned is always unmodifiable.
     * @throws IllegalArgumentException if group name is null
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     *
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<ThreadGroup> findThreadGroupsByName(final String threadGroupName) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10379);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10380);return findThreadGroups(new NamePredicate(threadGroupName));
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Return all active thread groups excluding the system thread group (A thread group is active if it has been not destroyed).
     *
     * @return all thread groups excluding the system thread group. The collection returned is always unmodifiable.
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     *
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<ThreadGroup> getAllThreadGroups() {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10381);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10382);return findThreadGroups(ALWAYS_TRUE_PREDICATE);
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Return the system thread group (sometimes also referred as "root thread group").
     *
     * @return the system thread group
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static ThreadGroup getSystemThreadGroup() {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10383);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10384);ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        __CLR4_5_27zg7zglvha7a3r.R.inc(10385);while((((threadGroup.getParent() != null)&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10386)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10387)==0&false))) {{
            __CLR4_5_27zg7zglvha7a3r.R.inc(10388);threadGroup = threadGroup.getParent();
        }
        }__CLR4_5_27zg7zglvha7a3r.R.inc(10389);return threadGroup;
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Return all active threads (A thread is active if it has been started and has not yet died).
     *
     * @return all active threads. The collection returned is always unmodifiable.
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     *
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<Thread> getAllThreads() {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10390);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10391);return findThreads(ALWAYS_TRUE_PREDICATE);
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Return active threads with the specified name.
     *
     * @param threadName The thread name
     * @return The threads with the specified name or an empty collection if no such thread exists. The collection returned is always unmodifiable.
     * @throws IllegalArgumentException if the specified name is null
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     *
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<Thread> findThreadsByName(final String threadName) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10392);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10393);return findThreads(new NamePredicate(threadName));
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Return the active thread with the specified id.
     *
     * @param threadId The thread id
     * @return The thread with the specified id or {@code null} if no such thread exists
     * @throws IllegalArgumentException if the specified id is zero or negative
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     *
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Thread findThreadById(final long threadId) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10394);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10395);final Collection<Thread> result = findThreads(new ThreadIdPredicate(threadId));
        __CLR4_5_27zg7zglvha7a3r.R.inc(10396);return (((result.isEmpty() )&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10397)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10398)==0&false))? null : result.iterator().next();
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * <p>
     * ThreadUtils instances should NOT be constructed in standard programming. Instead, the class should be used as
     * {@code ThreadUtils.getAllThreads()}
     * </p>
     * <p>
     * This constructor is public to permit tools that require a JavaBean instance to operate.
     * </p>
     */
    public ThreadUtils() {
        super();__CLR4_5_27zg7zglvha7a3r.R.inc(10400);try{__CLR4_5_27zg7zglvha7a3r.R.inc(10399);
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * A predicate for selecting threads.
     */
    //if java minimal version for lang becomes 1.8 extend this interface from java.util.function.Predicate
    public interface ThreadPredicate /*extends java.util.function.Predicate<Thread>*/{

        /**
         * Evaluates this predicate on the given thread.
         * @param thread the thread
         * @return {@code true} if the thread matches the predicate, otherwise {@code false}
         */
        boolean test(Thread thread);
    }

    /**
     * A predicate for selecting threadgroups.
     */
    //if java minimal version for lang becomes 1.8 extend this interface from java.util.function.Predicate
    public interface ThreadGroupPredicate /*extends java.util.function.Predicate<ThreadGroup>*/{

        /**
         * Evaluates this predicate on the given threadgroup.
         * @param threadGroup the threadgroup
         * @return {@code true} if the threadGroup matches the predicate, otherwise {@code false}
         */
        boolean test(ThreadGroup threadGroup);
    }

    /**
     * Predicate which always returns true.
     */
    public static final AlwaysTruePredicate ALWAYS_TRUE_PREDICATE = new AlwaysTruePredicate();

    /**
     * A predicate implementation which always returns true.
     */
    private final static class AlwaysTruePredicate implements ThreadPredicate, ThreadGroupPredicate{

        private AlwaysTruePredicate() {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10401);
        }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

        @Override
        public boolean test(final ThreadGroup threadGroup) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10402);
            __CLR4_5_27zg7zglvha7a3r.R.inc(10403);return true;
        }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

        @Override
        public boolean test(final Thread thread) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10404);
            __CLR4_5_27zg7zglvha7a3r.R.inc(10405);return true;
        }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}
    }

    /**
     * A predicate implementation which matches a thread or threadgroup name.
     */
    public static class NamePredicate implements ThreadPredicate, ThreadGroupPredicate {

        private final String name;

        /**
         * Predicate constructor
         *
         * @param name thread or threadgroup name
         * @throws IllegalArgumentException if the name is {@code null}
         */
        public NamePredicate(final String name) {
            super();__CLR4_5_27zg7zglvha7a3r.R.inc(10407);try{__CLR4_5_27zg7zglvha7a3r.R.inc(10406);
            __CLR4_5_27zg7zglvha7a3r.R.inc(10408);Validate.isTrue(name != null, "The name must not be null");
            __CLR4_5_27zg7zglvha7a3r.R.inc(10409);this.name = name;
        }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

        @Override
        public boolean test(final ThreadGroup threadGroup) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10410);
            __CLR4_5_27zg7zglvha7a3r.R.inc(10411);return threadGroup != null && threadGroup.getName().equals(name);
        }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

        @Override
        public boolean test(final Thread thread) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10412);
            __CLR4_5_27zg7zglvha7a3r.R.inc(10413);return thread != null && thread.getName().equals(name);
        }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}
    }

    /**
     * A predicate implementation which matches a thread id.
     */
    public static class ThreadIdPredicate implements ThreadPredicate {

        private final long threadId;

        /**
         * Predicate constructor
         *
         * @param threadId the threadId to match
         * @throws IllegalArgumentException if the threadId is zero or negative
         */
        public ThreadIdPredicate(final long threadId) {
            super();__CLR4_5_27zg7zglvha7a3r.R.inc(10415);try{__CLR4_5_27zg7zglvha7a3r.R.inc(10414);
            __CLR4_5_27zg7zglvha7a3r.R.inc(10416);if ((((threadId <= 0)&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10417)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10418)==0&false))) {{
                __CLR4_5_27zg7zglvha7a3r.R.inc(10419);throw new IllegalArgumentException("The thread id must be greater than zero");
            }
            }__CLR4_5_27zg7zglvha7a3r.R.inc(10420);this.threadId = threadId;
        }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

        @Override
        public boolean test(final Thread thread) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10421);
            __CLR4_5_27zg7zglvha7a3r.R.inc(10422);return thread != null && thread.getId() == threadId;
        }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}
    }

    /**
     * Select all active threads which match the given predicate.
     *
     * @param predicate the predicate
     * @return An unmodifiable {@code Collection} of active threads matching the given predicate
     *
     * @throws IllegalArgumentException if the predicate is null
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<Thread> findThreads(final ThreadPredicate predicate){try{__CLR4_5_27zg7zglvha7a3r.R.inc(10423);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10424);return findThreads(getSystemThreadGroup(), true, predicate);
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Select all active threadgroups which match the given predicate.
     *
     * @param predicate the predicate
     * @return An unmodifiable {@code Collection} of active threadgroups matching the given predicate
     * @throws IllegalArgumentException if the predicate is null
     * @throws  SecurityException
     *          if the current thread cannot access the system thread group
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<ThreadGroup> findThreadGroups(final ThreadGroupPredicate predicate){try{__CLR4_5_27zg7zglvha7a3r.R.inc(10425);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10426);return findThreadGroups(getSystemThreadGroup(), true, predicate);
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Select all active threads which match the given predicate and which belongs to the given thread group (or one of its subgroups).
     *
     * @param group the thread group
     * @param recurse if {@code true} then evaluate the predicate recursively on all threads in all subgroups of the given group
     * @param predicate the predicate
     * @return An unmodifiable {@code Collection} of active threads which match the given predicate and which belongs to the given thread group
     * @throws IllegalArgumentException if the given group or predicate is null
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<Thread> findThreads(final ThreadGroup group, final boolean recurse, final ThreadPredicate predicate) {try{__CLR4_5_27zg7zglvha7a3r.R.inc(10427);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10428);Validate.isTrue(group != null, "The group must not be null");
        __CLR4_5_27zg7zglvha7a3r.R.inc(10429);Validate.isTrue(predicate != null, "The predicate must not be null");

        __CLR4_5_27zg7zglvha7a3r.R.inc(10430);int count = group.activeCount();
        __CLR4_5_27zg7zglvha7a3r.R.inc(10431);Thread[] threads;
        __CLR4_5_27zg7zglvha7a3r.R.inc(10432);do {{
            __CLR4_5_27zg7zglvha7a3r.R.inc(10433);threads = new Thread[count + (count / 2) + 1]; //slightly grow the array size
            __CLR4_5_27zg7zglvha7a3r.R.inc(10434);count = group.enumerate(threads, recurse);
            //return value of enumerate() must be strictly less than the array size according to javadoc
        } }while ((((count >= threads.length)&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10435)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10436)==0&false)));

        __CLR4_5_27zg7zglvha7a3r.R.inc(10437);final List<Thread> result = new ArrayList<>(count);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10438);for (int i = 0; (((i < count)&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10439)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10440)==0&false)); ++i) {{
            __CLR4_5_27zg7zglvha7a3r.R.inc(10441);if ((((predicate.test(threads[i]))&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10442)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10443)==0&false))) {{
                __CLR4_5_27zg7zglvha7a3r.R.inc(10444);result.add(threads[i]);
            }
        }}
        }__CLR4_5_27zg7zglvha7a3r.R.inc(10445);return Collections.unmodifiableCollection(result);
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}

    /**
     * Select all active threadgroups which match the given predicate and which is a subgroup of the given thread group (or one of its subgroups).
     *
     * @param group the thread group
     * @param recurse if {@code true} then evaluate the predicate recursively on all threadgroups in all subgroups of the given group
     * @param predicate the predicate
     * @return An unmodifiable {@code Collection} of active threadgroups which match the given predicate and which is a subgroup of the given thread group
     * @throws IllegalArgumentException if the given group or predicate is null
     * @throws  SecurityException  if the current thread cannot modify
     *          thread groups from this thread's thread group up to the system thread group
     */
    public static Collection<ThreadGroup> findThreadGroups(final ThreadGroup group, final boolean recurse, final ThreadGroupPredicate predicate){try{__CLR4_5_27zg7zglvha7a3r.R.inc(10446);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10447);Validate.isTrue(group != null, "The group must not be null");
        __CLR4_5_27zg7zglvha7a3r.R.inc(10448);Validate.isTrue(predicate != null, "The predicate must not be null");

        __CLR4_5_27zg7zglvha7a3r.R.inc(10449);int count = group.activeGroupCount();
        __CLR4_5_27zg7zglvha7a3r.R.inc(10450);ThreadGroup[] threadGroups;
        __CLR4_5_27zg7zglvha7a3r.R.inc(10451);do {{
            __CLR4_5_27zg7zglvha7a3r.R.inc(10452);threadGroups = new ThreadGroup[count + (count / 2) + 1]; //slightly grow the array size
            __CLR4_5_27zg7zglvha7a3r.R.inc(10453);count = group.enumerate(threadGroups, recurse);
            //return value of enumerate() must be strictly less than the array size according to javadoc
        } }while((((count >= threadGroups.length)&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10454)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10455)==0&false)));

        __CLR4_5_27zg7zglvha7a3r.R.inc(10456);final List<ThreadGroup> result = new ArrayList<>(count);
        __CLR4_5_27zg7zglvha7a3r.R.inc(10457);for(int i = 0; (((i < count)&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10458)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10459)==0&false)); ++i) {{
            __CLR4_5_27zg7zglvha7a3r.R.inc(10460);if((((predicate.test(threadGroups[i]))&&(__CLR4_5_27zg7zglvha7a3r.R.iget(10461)!=0|true))||(__CLR4_5_27zg7zglvha7a3r.R.iget(10462)==0&false))) {{
                __CLR4_5_27zg7zglvha7a3r.R.inc(10463);result.add(threadGroups[i]);
            }
        }}
        }__CLR4_5_27zg7zglvha7a3r.R.inc(10464);return Collections.unmodifiableCollection(result);
    }finally{__CLR4_5_27zg7zglvha7a3r.R.flushNeeded();}}
}
