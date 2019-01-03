package com.marlabs.training.demo;

import java.util.logging.*;

public class HelloWorld {

	public static final Logger logger = Logger.getLogger("HelloWorld.class");

	public static void main(String[] args) {
		logger.log(Level.INFO, "Hello World program started.");

		for (int ctr = 0; ctr < 5; ctr++) {
			logger.log(Level.INFO, "Values are {0}", ctr);
		}

	}

}
