package com.googlecode.goclipse;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.googlecode.goclipse.core.GoCore;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @author steel
 */
public class Activator extends GoCore {
	
	public static final boolean DEBUG = Boolean.getBoolean("goclipse.debug");
	
	/**
	 * Log the given info message to the Eclipse log.
	 */
	public static void logInfo(String message) {
		if (DEBUG) {
			GoCore.logStatus(new Status(IStatus.INFO, PLUGIN_ID, message));
		}
	}
	
	// Add a custom message
	@Deprecated
	public static void logError(Throwable exception) {
		logError(exception.getMessage(), exception);
	}
	
}