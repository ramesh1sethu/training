package com.marlabs.training.demo;

import java.util.logging.*;

/**
 * @author CVRAMAN-484
 *
 */
public class HelloWorld {

	static Logger logger = Logger.getLogger("HelloWorld");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.log(Level.INFO, "Hello World program started.");

		for (int counter = 0; counter < 5; counter++) {
			logger.log(Level.INFO, "Values is {0}", counter);
			logger.log(Level.INFO, "Hello World program Ended.");
		}

	}

}
