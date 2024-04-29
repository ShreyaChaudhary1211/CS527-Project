/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.vocab;

import java.io.Serializable;

import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.PrefixManager;

/**
 * Transition interface, for compatibility purposes.
 * 
 * @deprecated use PrefixDocumentFormat instead
 */
@Deprecated
public interface PrefixOWLOntologyFormat extends OWLOntologyFormat,
        PrefixManager, Serializable {}
