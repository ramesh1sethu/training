
package com.marlabs.training.demo;


import java.util.logging.*;

//This is a demo session.
public class HelloWorld {

	public static final Logger logger = Logger.getLogger("HelloWorld.class");

	public static void main(String[] args) {
		logger.log(Level.INFO, "Hello World program started.");

		for (int ctr = 0; ctr > -5; ctr--) {
			logger.log(Level.INFO, "Value is {0}", ctr);
			logger.log(Level.INFO, "This is sushanta's change");


		}

	}

}

