package com.marlabs.training.demo;

import java.util.logging.*;

//This is a demo session.
public class HelloWorld {

	public static final Logger logger = Logger.getLogger("HelloWorld.class");

	public static void main(String[] args) {
		logger.log(Level.INFO, "Hello World program started.");

		for (int counter = 0; counter < 5; counter++) {
			logger.log(Level.INFO, "Value is {0}", counter);
		}

	}

}
