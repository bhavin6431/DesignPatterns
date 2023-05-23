package org.hariom.designpatterns.prototype;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.print("Drawing Circle");
	}

}
