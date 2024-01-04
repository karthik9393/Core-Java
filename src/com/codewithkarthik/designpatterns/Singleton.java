package com.codewithkarthik.designpatterns;

public class Singleton {
	// the singleton instance is declared volatile to ensure visibility.

	private static volatile Singleton instance;
	// private constructor to prevent instantiation from outside.

	private Singleton() {

	}

	// Lazy initialization with double-checked locking for thread safefy.
	public static Singleton getInstance() {

		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}

		}

		return instance;

	}

}
