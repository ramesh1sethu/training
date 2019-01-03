package com.marlabs.training.demo;

import java.util.logging.*;

public class HelloWorld {
	static Logger logger = Logger.getLogger("myLogger");

	public static void main(String[] args) {
		logger.info("Hello World program started.");

		for (int counter = 0; counter < 5; counter++) {
			logger.log(Level.INFO, "value are :{0}",counter);
			
		}

	}
}
