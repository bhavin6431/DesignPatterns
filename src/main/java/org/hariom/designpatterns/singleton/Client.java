package org.hariom.designpatterns.singleton;

public class Client {
	public static void main(String args[]) {
		Singleton instance = Singleton.getIntance();
		Singleton instance1 = Singleton.getIntance();
		if (instance != instance1) {
			System.out.print("Error ");
		} else {
			System.out.print("True  ");
		}
	}
}
