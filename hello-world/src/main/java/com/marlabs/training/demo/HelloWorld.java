package com.marlabs.training.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author CVRAMAN-535
 *
 */
public class HelloWorld {

	static Logger logger = Logger.getLogger("myLogger");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("Hello World program started.");

		for (int INPUT = 0; INPUT < 5; INPUT++) {
			logger.log(Level.INFO, "Values are: {0}", INPUT);
		}

	}

}
