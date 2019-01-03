package com.marlabs.training.demo;
import java.util.logging.*;
public class HelloWorld {

	private static  Logger logger = Logger.getLogger("myLogger");
	public static void main(String[] args) {
		logger.info("Hello World program started.");

		for (int b = 0; b<5; b++) {
			logger.log(Level.INFO,"Values are: {0}",b);
		}

	}

}
