package com.marlabs.training.demo;

import java.util.logging.*;

public class HelloWorld {

	public static final Logger logger = Logger.getLogger("HelloWorld.class");

	public static void main(String[] args) {
		logger.log(Level.INFO, "value is {0}", "Hello World program started.");

		for (int counter = 0; counter < 5; counter++) {
			logger.log(Level.INFO, "Values are {0}" + counter);

		}

	}

}
