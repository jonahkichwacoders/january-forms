/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.dsl.vtk.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class VTKAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/eclipse/january/geometry/dsl/vtk/parser/antlr/internal/InternalVTK.tokens");
	}
}