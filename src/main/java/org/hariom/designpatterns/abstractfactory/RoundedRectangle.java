package org.hariom.designpatterns.abstractfactory;

import org.hariom.designpatterns.factory.Shape;

public class RoundedRectangle implements Shape {
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method.");
	}
}