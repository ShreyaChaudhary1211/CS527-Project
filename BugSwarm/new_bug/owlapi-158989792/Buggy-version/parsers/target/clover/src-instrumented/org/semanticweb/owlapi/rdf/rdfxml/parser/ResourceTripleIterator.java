/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.rdf.rdfxml.parser;

import javax.annotation.Nonnull;

import org.semanticweb.owlapi.model.IRI;

interface ResourceTripleIterator {

    /**
     * Handle resource triple.
     * 
     * @param subject
     *        the subject
     * @param predicate
     *        the predicate
     * @param object
     *        the object
     */
    void handleResourceTriple(@Nonnull IRI subject, @Nonnull IRI predicate,
            @Nonnull IRI object);
}
