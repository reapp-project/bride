/*
 * generated by Xtext
 */
package org.best.of.robotics.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.best.of.robotics.ui.internal.SmachDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SmachDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SmachDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SmachDSLActivator.getInstance().getInjector(SmachDSLActivator.ORG_BEST_OF_ROBOTICS_SMACHDSL);
	}
	
}
