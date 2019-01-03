package com.marlabs.training.demo;

import java.util.logging.*;

//This is a demo session.

/**
 * @author CVRAMAN-482
 *
 */
public class HelloWorld {

	/**
	 * Logger
	 */
	public static final Logger logger = Logger.getLogger("HelloWorld.class");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.log(Level.INFO, "Hello World program started.");

		for (int ctr = 0; ctr < 5; ctr++) {

			logger.log(Level.INFO, "Value is {0}", ctr);

			logger.log(Level.INFO, "This is a test by Ashis.");

		}

	}

}
