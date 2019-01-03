
package com.marlabs.training.demo;

import java.util.logging.*;


public class HelloWorld {

	int a = 0;
	public static final int INPUT = 3;
	static Logger logger = Logger.getLogger("HelloWorld.class");

	public static final void main(String[] args) {
		logger.info("Hello World program started.");

		for (int INPUT = 0; INPUT < 5; INPUT++) {
			logger.log(Level.INFO, "Values Are {0}", INPUT);

			logger.info("changed by Ranadip");

		}

	}

}
