package org.hariom.designpatterns.bridge;

public class Triangle extends Shapes {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle filled with color");
		color.applyColor();
	}

}
