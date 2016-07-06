/**
 *
 * $Id$
 */
package org.eclipse.january.geometry.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.january.geometry.Pipe;

/**
 * A sample validator interface for {@link org.eclipse.january.geometry.Junction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JunctionValidator {
	boolean validate();

	boolean validateHeight(double value);
	boolean validateZIn(double value);
	boolean validateZOut(double value);
	boolean validateInput(EList<Pipe> value);
	boolean validateOutput(EList<Pipe> value);
}
