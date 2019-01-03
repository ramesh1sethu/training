package com.marlabs.training.demo;

import java.util.logging.*;

public class HelloWorld {

	static Logger logger = Logger.getLogger("myLogger");

	public static void main(String[] args) {
		logger.info("Hello World program started.");

		for (int INPUT = 0; INPUT < 5; INPUT++) {
			logger.log(Level.INFO, "Values are: {0}", INPUT);
		}

	}

}
