package org.hariom.designpatterns.bridge;

public class Client {

	public static void main(String args[]) {
		Shapes shapes = new Triangle(new RedColor());
		shapes.applyColor();
	}
}
