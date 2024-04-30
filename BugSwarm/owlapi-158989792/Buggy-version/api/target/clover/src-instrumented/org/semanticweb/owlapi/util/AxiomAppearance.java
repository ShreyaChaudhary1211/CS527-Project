/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package org.semanticweb.owlapi.util;

import org.semanticweb.owlapi.model.OWLAxiom;

/**
 * An interface for checking if an axiom appears as annotated source multiple
 * times. This requires an id to be emitted.
 */
public interface AxiomAppearance {

    /**
     * @param ax
     *        an axiom
     * @return true if ax appears more than once as annotated source.
     */
    boolean appearsMultipleTimes(OWLAxiom ax);
}
