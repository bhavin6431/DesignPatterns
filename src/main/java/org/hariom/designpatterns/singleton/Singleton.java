package org.hariom.designpatterns.singleton;

public class Singleton {

	private static Singleton instance;

	public static Singleton getIntance() {

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
