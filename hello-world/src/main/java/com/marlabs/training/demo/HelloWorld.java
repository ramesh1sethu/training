package com.marlabs.training.demo;

import java.util.logging.*;

//This is a demo 
public class HelloWorld {

	public static final Logger logger = Logger.getLogger("HelloWorld.class");

	public static void main(String[] args) {
		logger.log(Level.INFO, "Hello World program started.");

		for (int count = 0; count<5; count++) {
			logger.log(Level.INFO, "Value is {0}", count);
			 logger.info("changed  by Tiwari");
		}

	}

}